package com.squareup.wire;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.U3;
import defpackage.a70;
import defpackage.gc2;
import defpackage.is8;
import defpackage.lnb;
import defpackage.mh0;
import defpackage.wv8;
import defpackage.x52;
import defpackage.yqo;
import defpackage.zzl;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\u0005\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\rJ\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010\rJ\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010\rJ\u000f\u0010'\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010%J\u0017\u0010)\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010*J)\u0010.\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00142\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0004H\u0016¢\u0006\u0004\b0\u0010\rJ\u000f\u00101\u001a\u00020\u0004H\u0002¢\u0006\u0004\b1\u0010\rJ\u0017\u00103\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u0004H\u0002¢\u0006\u0004\b3\u0010*J\u000f\u00104\u001a\u00020\u0004H\u0002¢\u0006\u0004\b4\u0010\rJ\u0017\u00105\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u0004H\u0002¢\u0006\u0004\b5\u0010*J\u000f\u00106\u001a\u00020\u0004H\u0002¢\u0006\u0004\b6\u0010\rJ\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010*J\u0017\u00108\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u0004H\u0002¢\u0006\u0004\b8\u0010\u0011J\u0017\u00109\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\u0004H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0004H\u0002¢\u0006\u0004\b>\u0010\rJ\u000f\u0010?\u001a\u00020#H\u0002¢\u0006\u0004\b?\u0010%J!\u0010B\u001a\u00020\u00172\u0006\u0010@\u001a\u00020\u00042\b\b\u0002\u0010A\u001a\u00020\u0004H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0004H\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0004H\u0002¢\u0006\u0004\bF\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010GR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010HR\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010HR\u0016\u0010I\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010HR\u0016\u0010J\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010HR\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010HR\u0016\u0010K\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020O0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006U"}, d2 = {"Lcom/squareup/wire/ByteArrayProtoReader32;", "Lcom/squareup/wire/ProtoReader32;", "", "source", "", "pos", "limit", "<init>", "([BII)V", "Lcom/squareup/wire/ProtoReader;", "asProtoReader", "()Lcom/squareup/wire/ProtoReader;", "beginMessage", "()I", "token", "Lgc2;", "endMessageAndGetUnknownFields", "(I)Lgc2;", "nextLengthDelimited", "nextTag", "Lcom/squareup/wire/FieldEncoding;", "peekFieldEncoding", "()Lcom/squareup/wire/FieldEncoding;", "", "skip", "()V", "readBytes", "()Lgc2;", "", "beforePossiblyPackedScalar", "()Z", "", "readString", "()Ljava/lang/String;", "readVarint32", "", "readVarint64", "()J", "readFixed32", "readFixed64", "tag", "readUnknownField", "(I)V", "fieldEncoding", "", U3.i.X, "addUnknownField", "(ILcom/squareup/wire/FieldEncoding;Ljava/lang/Object;)V", "nextFieldMinLengthInBytes", "internalNextLengthDelimited", "expectedEndTag", "skipGroup", "internalReadVarint32", "afterPackableScalar", "beforeLengthDelimitedScalar", "byteCount", "readByteString", "readUtf8", "(I)Ljava/lang/String;", "", "readByte", "()B", "readIntLe", "readLongLe", "length", "lastReadTag", "requireNonNegativeLength", "(II)V", "checkedLimit", "(I)I", "remainingInLimit", "[B", "I", "recursionDepth", "state", "pushedLimit", "nextFieldEncoding", "Lcom/squareup/wire/FieldEncoding;", "", "Lx52;", "bufferStack", "Ljava/util/List;", "Lcom/squareup/wire/ProtoReader32AsProtoReader;", "protoReader", "Lcom/squareup/wire/ProtoReader32AsProtoReader;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ByteArrayProtoReader32 implements ProtoReader32 {

    @NotNull
    private final List<x52> bufferStack;
    private int limit;

    @Nullable
    private FieldEncoding nextFieldEncoding;
    private int pos;

    @Nullable
    private ProtoReader32AsProtoReader protoReader;
    private int pushedLimit;
    private int recursionDepth;

    @NotNull
    private final byte[] source;
    private int state;
    private int tag;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FieldEncoding.values().length];
            try {
                iArr[FieldEncoding.LENGTH_DELIMITED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FieldEncoding.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FieldEncoding.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FieldEncoding.VARINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ByteArrayProtoReader32(@NotNull byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.source = bArr;
        this.pos = i;
        this.limit = i2;
        int length = bArr.length;
        if (i < 0 || i > length) {
            is8.d(" must be between 0 and source size ", "pos=", this.pos, bArr.length);
            throw null;
        }
        int length2 = bArr.length;
        if (i <= i2 && i2 <= length2) {
            this.state = 2;
            this.tag = -1;
            this.pushedLimit = -1;
            this.bufferStack = new ArrayList();
            return;
        }
        throw new IllegalArgumentException(("limit=" + this.limit + " must be between pos=" + this.pos + " and source size " + bArr.length).toString());
    }

    private final void afterPackableScalar(int fieldEncoding) {
        if (this.state == fieldEncoding) {
            this.state = 6;
            return;
        }
        int i = this.pos;
        int i2 = this.limit;
        if (i <= i2) {
            if (i != i2) {
                this.state = 7;
                return;
            }
            this.limit = this.pushedLimit;
            this.pushedLimit = -1;
            this.state = 6;
            return;
        }
        throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
    }

    private final int beforeLengthDelimitedScalar() {
        if (this.state == 2) {
            int remainingInLimit = remainingInLimit();
            this.state = 6;
            this.limit = this.pushedLimit;
            this.pushedLimit = -1;
            return remainingInLimit;
        }
        StringBuilder sb = new StringBuilder("Expected LENGTH_DELIMITED but was ");
        sb.append(this.state);
        sb.append(". Reader position: ");
        sb.append(this.pos);
        sb.append(". Last read tag: ");
        throw new ProtocolException(wv8.j(sb, this.tag, '.'));
    }

    private final int checkedLimit(int byteCount) {
        if (byteCount >= 0 && byteCount <= remainingInLimit()) {
            return this.pos + byteCount;
        }
        a70.q();
        return 0;
    }

    private final int internalNextLengthDelimited() {
        this.nextFieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        this.state = 2;
        int internalReadVarint32 = internalReadVarint32();
        requireNonNegativeLength$default(this, internalReadVarint32, 0, 2, null);
        if (this.pushedLimit != -1) {
            zzl.s();
            return 0;
        }
        int checkedLimit = checkedLimit(internalReadVarint32);
        this.pushedLimit = this.limit;
        this.limit = checkedLimit;
        return internalReadVarint32;
    }

    private final int internalReadVarint32() {
        int i;
        byte readByte = readByte();
        if (readByte >= 0) {
            return readByte;
        }
        int i2 = readByte & Byte.MAX_VALUE;
        byte readByte2 = readByte();
        if (readByte2 >= 0) {
            i = readByte2 << 7;
        } else {
            i2 |= (readByte2 & Byte.MAX_VALUE) << 7;
            byte readByte3 = readByte();
            if (readByte3 >= 0) {
                i = readByte3 << 14;
            } else {
                i2 |= (readByte3 & Byte.MAX_VALUE) << 14;
                byte readByte4 = readByte();
                if (readByte4 < 0) {
                    int i3 = i2 | ((readByte4 & Byte.MAX_VALUE) << 21);
                    byte readByte5 = readByte();
                    int i4 = i3 | (readByte5 << 28);
                    if (readByte5 < 0) {
                        for (int i5 = 0; i5 < 5; i5++) {
                            if (readByte() < 0) {
                            }
                        }
                        StringBuilder sb = new StringBuilder("Malformed VARINT. Reader position: ");
                        sb.append(this.pos);
                        sb.append(". Last read tag: ");
                        throw new ProtocolException(wv8.j(sb, this.tag, '.'));
                    }
                    return i4;
                }
                i = readByte4 << 21;
            }
        }
        return i | i2;
    }

    private final byte readByte() {
        checkedLimit(1);
        byte[] bArr = this.source;
        int i = this.pos;
        this.pos = i + 1;
        return bArr[i];
    }

    private final gc2 readByteString(int byteCount) {
        int checkedLimit = checkedLimit(byteCount);
        gc2 gc2Var = gc2.d;
        byte[] bArr = this.source;
        int i = this.pos;
        bArr.getClass();
        yqo.x(bArr.length, i, byteCount);
        gc2 gc2Var2 = new gc2(mh0.k(i, byteCount + i, bArr));
        this.pos = checkedLimit;
        return gc2Var2;
    }

    private final int readIntLe() {
        checkedLimit(4);
        byte[] bArr = this.source;
        int i = this.pos;
        int i2 = i + 1;
        this.pos = i2;
        int i3 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = i + 2;
        this.pos = i4;
        int i5 = ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i3;
        int i6 = i + 3;
        this.pos = i6;
        int i7 = i5 | ((bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        this.pos = i + 4;
        return ((bArr[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | i7;
    }

    private final long readLongLe() {
        checkedLimit(8);
        byte[] bArr = this.source;
        int i = this.pos;
        this.pos = i + 1;
        this.pos = i + 2;
        this.pos = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r3] & 255) << 8) | ((bArr[r8] & 255) << 16);
        this.pos = i + 4;
        long j2 = j | ((bArr[r5] & 255) << 24);
        this.pos = i + 5;
        long j3 = j2 | ((bArr[r8] & 255) << 32);
        this.pos = i + 6;
        long j4 = j3 | ((bArr[r5] & 255) << 40);
        this.pos = i + 7;
        long j5 = j4 | ((bArr[r8] & 255) << 48);
        this.pos = i + 8;
        return ((bArr[r5] & 255) << 56) | j5;
    }

    private final String readUtf8(int byteCount) {
        int checkedLimit = checkedLimit(byteCount);
        String l = c.l(this.pos, checkedLimit, 4, this.source);
        this.pos = checkedLimit;
        return l;
    }

    private final int remainingInLimit() {
        int i = this.pos;
        int i2 = this.limit;
        if (i <= i2) {
            return i2 - i;
        }
        a70.q();
        return 0;
    }

    private final void requireNonNegativeLength(int length, int lastReadTag) {
        if (length >= 0) {
            return;
        }
        StringBuilder t = lnb.t(length, "Negative length: ", ". Reader position: ");
        t.append(this.pos);
        t.append(". Last read tag: ");
        t.append(lastReadTag);
        t.append('.');
        throw new ProtocolException(t.toString());
    }

    public static /* synthetic */ void requireNonNegativeLength$default(ByteArrayProtoReader32 byteArrayProtoReader32, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = byteArrayProtoReader32.tag;
        }
        byteArrayProtoReader32.requireNonNegativeLength(i, i2);
    }

    private final void skipGroup(int expectedEndTag) {
        while (this.pos < this.limit) {
            int internalReadVarint32 = internalReadVarint32();
            if (internalReadVarint32 == 0) {
                StringBuilder sb = new StringBuilder("Unexpected tag 0. Reader position: ");
                sb.append(this.pos);
                sb.append(". Last read tag: ");
                throw new ProtocolException(wv8.j(sb, this.tag, '.'));
            }
            int i = internalReadVarint32 >>> 3;
            int i2 = internalReadVarint32 & 7;
            if (i2 == 0) {
                this.state = 0;
                readVarint64();
            } else if (i2 == 1) {
                this.state = 1;
                readFixed64();
            } else if (i2 == 2) {
                int internalReadVarint322 = internalReadVarint32();
                requireNonNegativeLength(internalReadVarint322, i);
                skip(internalReadVarint322);
            } else {
                if (i2 == 3) {
                    int i3 = this.recursionDepth + 1;
                    this.recursionDepth = i3;
                    if (i3 > 100) {
                        throw new IOException("Wire recursion limit exceeded");
                    }
                    try {
                        skipGroup(i);
                    } finally {
                    }
                    this.recursionDepth--;
                }
                if (i2 == 4) {
                    if (i == expectedEndTag) {
                        return;
                    }
                    throw new ProtocolException("Unexpected end group. Reader position: " + this.pos + ". Last read tag: " + i + '.');
                }
                if (i2 != 5) {
                    StringBuilder t = lnb.t(i2, "Unexpected field encoding: ", ". Reader position: ");
                    t.append(this.pos);
                    t.append(". Last read tag: ");
                    t.append(i);
                    t.append('.');
                    throw new ProtocolException(t.toString());
                }
                this.state = 5;
                readFixed32();
            }
        }
        a70.q();
    }

    @Override // com.squareup.wire.ProtoReader32
    public void addUnknownField(int tag, @NotNull FieldEncoding fieldEncoding, @Nullable Object value) {
        fieldEncoding.getClass();
        ProtoWriter protoWriter = new ProtoWriter(this.bufferStack.get(this.recursionDepth - 1));
        ProtoAdapter<?> rawProtoAdapter = fieldEncoding.rawProtoAdapter();
        rawProtoAdapter.getClass();
        rawProtoAdapter.encodeWithTag(protoWriter, tag, (int) value);
    }

    @Override // com.squareup.wire.ProtoReader32
    @NotNull
    public ProtoReader asProtoReader() {
        ProtoReader32AsProtoReader protoReader32AsProtoReader = this.protoReader;
        if (protoReader32AsProtoReader != null) {
            return protoReader32AsProtoReader;
        }
        ProtoReader32AsProtoReader protoReader32AsProtoReader2 = new ProtoReader32AsProtoReader(this);
        this.protoReader = protoReader32AsProtoReader2;
        return protoReader32AsProtoReader2;
    }

    @Override // com.squareup.wire.ProtoReader32
    public boolean beforePossiblyPackedScalar() {
        int i = this.state;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.pos < this.limit) {
                    return true;
                }
                this.limit = this.pushedLimit;
                this.pushedLimit = -1;
                this.state = 6;
                return false;
            }
            if (i != 5) {
                StringBuilder sb = new StringBuilder("unexpected state: ");
                sb.append(this.state);
                sb.append(". Reader position: ");
                sb.append(this.pos);
                sb.append(". Last read tag: ");
                throw new ProtocolException(wv8.j(sb, this.tag, '.'));
            }
        }
        return true;
    }

    @Override // com.squareup.wire.ProtoReader32
    public int beginMessage() {
        if (this.state != 2) {
            a70.r("Unexpected call to beginMessage()");
            return 0;
        }
        int i = this.recursionDepth + 1;
        this.recursionDepth = i;
        if (i > 100) {
            is8.e("Wire recursion limit exceeded");
            return 0;
        }
        if (i > this.bufferStack.size()) {
            this.bufferStack.add(new x52());
        }
        int i2 = this.pushedLimit;
        this.pushedLimit = -1;
        this.state = 6;
        return i2;
    }

    @Override // com.squareup.wire.ProtoReader32
    @NotNull
    public gc2 endMessageAndGetUnknownFields(int token) {
        if (this.state != 6) {
            a70.r("Unexpected call to endMessage()");
            return null;
        }
        int i = this.recursionDepth - 1;
        this.recursionDepth = i;
        if (i < 0 || this.pushedLimit != -1) {
            a70.r("No corresponding call to beginMessage()");
            return null;
        }
        if (this.pos == this.limit || i == 0) {
            this.limit = token;
            x52 x52Var = this.bufferStack.get(i);
            long j = x52Var.b;
            return j > 0 ? x52Var.l0(j) : gc2.d;
        }
        throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
    }

    @Override // com.squareup.wire.ProtoReader32
    public int nextFieldMinLengthInBytes() {
        FieldEncoding fieldEncoding = this.nextFieldEncoding;
        int i = fieldEncoding == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fieldEncoding.ordinal()];
        if (i == -1) {
            a70.r("nextFieldEncoding is not set");
            return 0;
        }
        if (i == 1) {
            return remainingInLimit();
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 8;
        }
        if (i == 4) {
            return 1;
        }
        zzl.b();
        return 0;
    }

    @Override // com.squareup.wire.ProtoReader32
    public int nextLengthDelimited() {
        int i = this.state;
        if (i == 6 || i == 2) {
            return internalNextLengthDelimited();
        }
        a70.r("Unexpected call to nextDelimited()");
        return 0;
    }

    @Override // com.squareup.wire.ProtoReader32
    public int nextTag() {
        int i = this.state;
        if (i == 7) {
            this.state = 2;
            return this.tag;
        }
        if (i != 6) {
            a70.r("Unexpected call to nextTag()");
            return 0;
        }
        while (this.pos < this.limit) {
            int internalReadVarint32 = internalReadVarint32();
            if (internalReadVarint32 == 0) {
                StringBuilder sb = new StringBuilder("Unexpected tag 0. Reader position: ");
                sb.append(this.pos);
                sb.append(". Last read tag: ");
                throw new ProtocolException(wv8.j(sb, this.tag, '.'));
            }
            int i2 = internalReadVarint32 >>> 3;
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
                internalNextLengthDelimited();
                return this.tag;
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    StringBuilder sb2 = new StringBuilder("Unexpected end group. Reader position: ");
                    sb2.append(this.pos);
                    sb2.append(". Last read tag: ");
                    throw new ProtocolException(wv8.j(sb2, this.tag, '.'));
                }
                if (i3 == 5) {
                    this.nextFieldEncoding = FieldEncoding.FIXED32;
                    this.state = 5;
                    return i2;
                }
                StringBuilder t = lnb.t(i3, "Unexpected field encoding: ", ". Reader position: ");
                t.append(this.pos);
                t.append(". Last read tag: ");
                throw new ProtocolException(wv8.j(t, this.tag, '.'));
            }
            skipGroup(i2);
        }
        return -1;
    }

    @Override // com.squareup.wire.ProtoReader32
    @Nullable
    /* renamed from: peekFieldEncoding, reason: from getter */
    public FieldEncoding getNextFieldEncoding() {
        return this.nextFieldEncoding;
    }

    @Override // com.squareup.wire.ProtoReader32
    @NotNull
    public gc2 readBytes() {
        return readByteString(beforeLengthDelimitedScalar());
    }

    @Override // com.squareup.wire.ProtoReader32
    public int readFixed32() {
        int i = this.state;
        if (i == 5 || i == 2) {
            int readIntLe = readIntLe();
            afterPackableScalar(5);
            return readIntLe;
        }
        StringBuilder sb = new StringBuilder("Expected FIXED32 or LENGTH_DELIMITED but was ");
        sb.append(this.state);
        sb.append(". Reader position: ");
        sb.append(this.pos);
        sb.append(". Last read tag: ");
        throw new ProtocolException(wv8.j(sb, this.tag, '.'));
    }

    @Override // com.squareup.wire.ProtoReader32
    public long readFixed64() {
        int i = this.state;
        if (i == 1 || i == 2) {
            long readLongLe = readLongLe();
            afterPackableScalar(1);
            return readLongLe;
        }
        StringBuilder sb = new StringBuilder("Expected FIXED64 or LENGTH_DELIMITED but was ");
        sb.append(this.state);
        sb.append(". Reader position: ");
        sb.append(this.pos);
        sb.append(". Last read tag: ");
        throw new ProtocolException(wv8.j(sb, this.tag, '.'));
    }

    @Override // com.squareup.wire.ProtoReader32
    @NotNull
    public String readString() {
        return readUtf8(beforeLengthDelimitedScalar());
    }

    @Override // com.squareup.wire.ProtoReader32
    public void readUnknownField(int tag) {
        FieldEncoding nextFieldEncoding = getNextFieldEncoding();
        nextFieldEncoding.getClass();
        addUnknownField(tag, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(this));
    }

    @Override // com.squareup.wire.ProtoReader32
    public int readVarint32() {
        int i = this.state;
        if (i == 0 || i == 2) {
            int internalReadVarint32 = internalReadVarint32();
            afterPackableScalar(0);
            return internalReadVarint32;
        }
        StringBuilder sb = new StringBuilder("Expected VARINT or LENGTH_DELIMITED but was ");
        sb.append(this.state);
        sb.append(". Reader position: ");
        sb.append(this.pos);
        sb.append(". Last read tag: ");
        throw new ProtocolException(wv8.j(sb, this.tag, '.'));
    }

    @Override // com.squareup.wire.ProtoReader32
    public long readVarint64() {
        int i = this.state;
        if (i != 0 && i != 2) {
            StringBuilder sb = new StringBuilder("Expected VARINT or LENGTH_DELIMITED but was ");
            sb.append(this.state);
            sb.append(". Reader position: ");
            sb.append(this.pos);
            sb.append(". Last read tag: ");
            throw new ProtocolException(wv8.j(sb, this.tag, '.'));
        }
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            j |= (r6 & Byte.MAX_VALUE) << i2;
            if ((readByte() & 128) == 0) {
                afterPackableScalar(0);
                return j;
            }
        }
        StringBuilder sb2 = new StringBuilder("WireInput encountered a malformed varint. Reader position: ");
        sb2.append(this.pos);
        sb2.append(". Last read tag: ");
        throw new ProtocolException(wv8.j(sb2, this.tag, '.'));
    }

    @Override // com.squareup.wire.ProtoReader32
    public void skip() {
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
            skip(beforeLengthDelimitedScalar());
        } else if (i == 5) {
            readFixed32();
        } else {
            a70.r("Unexpected call to skip()");
        }
    }

    private final void skip(int byteCount) {
        this.pos = checkedLimit(byteCount);
    }

    public /* synthetic */ ByteArrayProtoReader32(byte[] bArr, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? bArr.length : i2);
    }
}
