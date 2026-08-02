package com.squareup.wire;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.bn8;
import xsna.epx;
import xsna.izs;
import xsna.ozl;
import xsna.vl8;
import xsna.zcl;

/* compiled from: ProtoReader.kt */
/* loaded from: classes14.dex */
public final class ProtoReader {
    public static final Companion Companion = new Companion(null);
    private static final int FIELD_ENCODING_MASK = 7;
    private static final int RECURSION_LIMIT = 65;
    private static final int STATE_END_GROUP = 4;
    private static final int STATE_FIXED32 = 5;
    private static final int STATE_FIXED64 = 1;
    private static final int STATE_LENGTH_DELIMITED = 2;
    private static final int STATE_PACKED_TAG = 7;
    private static final int STATE_START_GROUP = 3;
    private static final int STATE_TAG = 6;
    private static final int STATE_VARINT = 0;
    public static final int TAG_FIELD_ENCODING_BITS = 3;
    private FieldEncoding nextFieldEncoding;
    private long pos;
    private int recursionDepth;
    private final bn8 source;
    private long limit = Long.MAX_VALUE;
    private int state = 2;
    private int tag = -1;
    private long pushedLimit = -1;
    private final List<vl8> bufferStack = new ArrayList();

    /* compiled from: ProtoReader.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public ProtoReader(bn8 bn8Var) {
        this.source = bn8Var;
    }

    private final void afterPackableScalar(int i) throws IOException {
        if (this.state == i) {
            this.state = 6;
            return;
        }
        long j = this.pos;
        long j2 = this.limit;
        if (j > j2) {
            throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
        }
        if (j != j2) {
            this.state = 7;
            return;
        }
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
    }

    private final long beforeLengthDelimitedScalar() throws IOException {
        if (this.state != 2) {
            throw new ProtocolException(epx.j(Integer.valueOf(this.state), "Expected LENGTH_DELIMITED but was "));
        }
        long j = this.limit - this.pos;
        this.source.G2(j);
        this.state = 6;
        this.pos = this.limit;
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        return j;
    }

    private final int internalReadVarint32() {
        int i;
        this.source.G2(1L);
        this.pos++;
        byte readByte = this.source.readByte();
        if (readByte >= 0) {
            return readByte;
        }
        int i2 = readByte & Byte.MAX_VALUE;
        this.source.G2(1L);
        this.pos++;
        byte readByte2 = this.source.readByte();
        if (readByte2 >= 0) {
            i = readByte2 << 7;
        } else {
            i2 |= (readByte2 & Byte.MAX_VALUE) << 7;
            this.source.G2(1L);
            this.pos++;
            byte readByte3 = this.source.readByte();
            if (readByte3 >= 0) {
                i = readByte3 << AmfConstants.TYPE_RECORDSET_MARKER;
            } else {
                i2 |= (readByte3 & Byte.MAX_VALUE) << 14;
                this.source.G2(1L);
                this.pos++;
                byte readByte4 = this.source.readByte();
                if (readByte4 < 0) {
                    int i3 = i2 | ((readByte4 & Byte.MAX_VALUE) << 21);
                    this.source.G2(1L);
                    this.pos++;
                    byte readByte5 = this.source.readByte();
                    int i4 = i3 | (readByte5 << 28);
                    if (readByte5 < 0) {
                        int i5 = 0;
                        while (i5 < 5) {
                            i5++;
                            this.source.G2(1L);
                            this.pos++;
                            if (this.source.readByte() >= 0) {
                            }
                        }
                        throw new ProtocolException("Malformed VARINT");
                    }
                    return i4;
                }
                i = readByte4 << 21;
            }
        }
        return i2 | i;
    }

    private final void skipGroup(int i) {
        while (this.pos < this.limit && !this.source.W1()) {
            int internalReadVarint32 = internalReadVarint32();
            if (internalReadVarint32 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i2 = internalReadVarint32 >> 3;
            int i3 = internalReadVarint32 & 7;
            if (i3 == 0) {
                this.state = 0;
                readVarint64();
            } else if (i3 == 1) {
                this.state = 1;
                readFixed64();
            } else if (i3 == 2) {
                long internalReadVarint322 = internalReadVarint32();
                this.pos += internalReadVarint322;
                this.source.skip(internalReadVarint322);
            } else if (i3 == 3) {
                skipGroup(i2);
            } else if (i3 == 4) {
                if (i2 != i) {
                    throw new ProtocolException("Unexpected end group");
                }
                return;
            } else {
                if (i3 != 5) {
                    throw new ProtocolException(epx.j(Integer.valueOf(i3), "Unexpected field encoding: "));
                }
                this.state = 5;
                readFixed32();
            }
        }
        throw new EOFException();
    }

    /* renamed from: -forEachTag, reason: not valid java name */
    public final ByteString m37forEachTag(izs<? super Integer, ? extends Object> izsVar) {
        long beginMessage = beginMessage();
        while (true) {
            int nextTag = nextTag();
            if (nextTag == -1) {
                return endMessageAndGetUnknownFields(beginMessage);
            }
            izsVar.invoke(Integer.valueOf(nextTag));
        }
    }

    public final void addUnknownField(int i, FieldEncoding fieldEncoding, Object obj) {
        fieldEncoding.rawProtoAdapter().encodeWithTag(new ProtoWriter(this.bufferStack.get(this.recursionDepth - 1)), i, (int) obj);
    }

    public final long beginMessage() throws IOException {
        if (this.state != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i = this.recursionDepth + 1;
        this.recursionDepth = i;
        if (i > 65) {
            throw new IOException("Wire recursion limit exceeded");
        }
        if (i > this.bufferStack.size()) {
            this.bufferStack.add(new vl8());
        }
        long j = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
        return j;
    }

    @ozl
    public final void endMessage(long j) throws IOException {
        endMessageAndGetUnknownFields(j);
    }

    public final ByteString endMessageAndGetUnknownFields(long j) throws IOException {
        if (this.state != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i = this.recursionDepth - 1;
        this.recursionDepth = i;
        if (i < 0 || this.pushedLimit != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.pos == this.limit || i == 0) {
            this.limit = j;
            vl8 vl8Var = this.bufferStack.get(i);
            long j2 = vl8Var.c;
            return j2 > 0 ? vl8Var.F0(j2) : ByteString.d;
        }
        throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
    }

    public final int nextTag() throws IOException {
        int i = this.state;
        if (i == 7) {
            this.state = 2;
            return this.tag;
        }
        if (i != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.pos < this.limit && !this.source.W1()) {
            int internalReadVarint32 = internalReadVarint32();
            if (internalReadVarint32 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i2 = internalReadVarint32 >> 3;
            this.tag = i2;
            int i3 = internalReadVarint32 & 7;
            if (i3 == 0) {
                this.nextFieldEncoding = FieldEncoding.VARINT;
                this.state = 0;
                return i2;
            }
            if (i3 == 1) {
                this.nextFieldEncoding = FieldEncoding.FIXED64;
                this.state = 1;
                return i2;
            }
            if (i3 == 2) {
                this.nextFieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                this.state = 2;
                int internalReadVarint322 = internalReadVarint32();
                if (internalReadVarint322 < 0) {
                    throw new ProtocolException(epx.j(Integer.valueOf(internalReadVarint322), "Negative length: "));
                }
                if (this.pushedLimit != -1) {
                    throw new IllegalStateException();
                }
                long j = this.limit;
                this.pushedLimit = j;
                long j2 = this.pos + internalReadVarint322;
                this.limit = j2;
                if (j2 <= j) {
                    return this.tag;
                }
                throw new EOFException();
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i3 != 5) {
                    throw new ProtocolException(epx.j(Integer.valueOf(i3), "Unexpected field encoding: "));
                }
                this.nextFieldEncoding = FieldEncoding.FIXED32;
                this.state = 5;
                return i2;
            }
            skipGroup(i2);
        }
        return -1;
    }

    public final FieldEncoding peekFieldEncoding() {
        return this.nextFieldEncoding;
    }

    public final ByteString readBytes() throws IOException {
        long beforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.G2(beforeLengthDelimitedScalar);
        return this.source.F0(beforeLengthDelimitedScalar);
    }

    public final int readFixed32() throws IOException {
        int i = this.state;
        if (i != 5 && i != 2) {
            throw new ProtocolException(epx.j(Integer.valueOf(this.state), "Expected FIXED32 or LENGTH_DELIMITED but was "));
        }
        this.source.G2(4L);
        this.pos += 4;
        int o2 = this.source.o2();
        afterPackableScalar(5);
        return o2;
    }

    public final long readFixed64() throws IOException {
        int i = this.state;
        if (i != 1 && i != 2) {
            throw new ProtocolException(epx.j(Integer.valueOf(this.state), "Expected FIXED64 or LENGTH_DELIMITED but was "));
        }
        this.source.G2(8L);
        this.pos += 8;
        long l0 = this.source.l0();
        afterPackableScalar(1);
        return l0;
    }

    public final String readString() throws IOException {
        long beforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.G2(beforeLengthDelimitedScalar);
        return this.source.Q2(beforeLengthDelimitedScalar);
    }

    public final void readUnknownField(int i) {
        FieldEncoding peekFieldEncoding = peekFieldEncoding();
        addUnknownField(i, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(this));
    }

    public final int readVarint32() throws IOException {
        int i = this.state;
        if (i != 0 && i != 2) {
            throw new ProtocolException(epx.j(Integer.valueOf(this.state), "Expected VARINT or LENGTH_DELIMITED but was "));
        }
        int internalReadVarint32 = internalReadVarint32();
        afterPackableScalar(0);
        return internalReadVarint32;
    }

    public final long readVarint64() throws IOException {
        int i = this.state;
        if (i != 0 && i != 2) {
            throw new ProtocolException(epx.j(Integer.valueOf(this.state), "Expected VARINT or LENGTH_DELIMITED but was "));
        }
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            this.source.G2(1L);
            this.pos++;
            j |= (r4 & Byte.MAX_VALUE) << i2;
            if ((this.source.readByte() & 128) == 0) {
                afterPackableScalar(0);
                return j;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public final void skip() throws IOException {
        int i = this.state;
        if (i == 0) {
            readVarint64();
            return;
        }
        if (i == 1) {
            readFixed64();
            return;
        }
        if (i == 2) {
            this.source.skip(beforeLengthDelimitedScalar());
        } else {
            if (i != 5) {
                throw new IllegalStateException("Unexpected call to skip()");
            }
            readFixed32();
        }
    }
}
