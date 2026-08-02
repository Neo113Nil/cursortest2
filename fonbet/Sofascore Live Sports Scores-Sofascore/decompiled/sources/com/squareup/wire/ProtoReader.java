package com.squareup.wire;

import com.ironsource.U3;
import defpackage.a70;
import defpackage.gc2;
import defpackage.is8;
import defpackage.l62;
import defpackage.lnb;
import defpackage.wv8;
import defpackage.wx4;
import defpackage.x52;
import defpackage.zzl;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0005\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 R2\u00020\u0001:\u0001RB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010\u0012J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010\bJ\u000f\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b$\u0010\u0012J\u000f\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b%\u0010\bJ'\u0010*\u001a\u00020\n2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010&H\u0087\bø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u0010H\u0016¢\u0006\u0004\b,\u0010-J)\u00100\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u00142\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u0010\bJ\u000f\u00103\u001a\u00020\u0010H\u0002¢\u0006\u0004\b3\u0010\u0012J\u0017\u00105\u001a\u00020\r2\u0006\u00104\u001a\u00020\u0010H\u0002¢\u0006\u0004\b5\u0010-J\u000f\u00106\u001a\u00020\u0010H\u0002¢\u0006\u0004\b6\u0010\u0012J\u0017\u00107\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u0010H\u0002¢\u0006\u0004\b7\u0010-J\u000f\u00108\u001a\u00020\u0006H\u0002¢\u0006\u0004\b8\u0010\bJ\u0017\u0010\u0017\u001a\u00020\r2\u0006\u00109\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ\u000f\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b;\u0010<J!\u0010?\u001a\u00020\r2\u0006\u0010=\u001a\u00020\u00102\b\b\u0002\u0010>\u001a\u00020\u0010H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006H\u0002¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0006H\u0002¢\u0006\u0004\bC\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010DR\u0016\u0010E\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010FR\u0016\u0010H\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010IR\u0016\u0010+\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010IR\u0016\u0010K\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010FR\u0018\u0010L\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020O0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010Q\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006S"}, d2 = {"Lcom/squareup/wire/ProtoReader;", "", "Ll62;", "source", "<init>", "(Ll62;)V", "", "beginMessage", "()J", "token", "Lgc2;", "endMessageAndGetUnknownFields", "(J)Lgc2;", "", "endMessage", "(J)V", "", "nextLengthDelimited", "()I", "nextTag", "Lcom/squareup/wire/FieldEncoding;", "peekFieldEncoding", "()Lcom/squareup/wire/FieldEncoding;", "skip", "()V", "readBytes", "()Lgc2;", "", "beforePossiblyPackedScalar$wire_runtime", "()Z", "beforePossiblyPackedScalar", "", "readString", "()Ljava/lang/String;", "readVarint32", "readVarint64", "readFixed32", "readFixed64", "Lkotlin/Function1;", "tagHandler", "-forEachTag", "(Lkotlin/jvm/functions/Function1;)Lgc2;", "forEachTag", "tag", "readUnknownField", "(I)V", "fieldEncoding", U3.i.X, "addUnknownField", "(ILcom/squareup/wire/FieldEncoding;Ljava/lang/Object;)V", "nextFieldMinLengthInBytes", "internalNextLengthDelimited", "expectedEndTag", "skipGroup", "internalReadVarint32", "afterPackableScalar", "beforeLengthDelimitedScalar", "byteCount", "", "readByte", "()B", "length", "lastReadTag", "requireNonNegativeLength", "(II)V", "checkedLimit", "(J)J", "remainingInLimit", "Ll62;", "pos", "J", "limit", "recursionDepth", "I", "state", "pushedLimit", "nextFieldEncoding", "Lcom/squareup/wire/FieldEncoding;", "", "Lx52;", "bufferStack", "Ljava/util/List;", "Companion", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class ProtoReader {
    public static final int FIELD_ENCODING_MASK = 7;
    public static final int RECURSION_LIMIT = 100;
    public static final int STATE_END_GROUP = 4;
    public static final int STATE_FIXED32 = 5;
    public static final int STATE_FIXED64 = 1;
    public static final int STATE_LENGTH_DELIMITED = 2;
    public static final int STATE_PACKED_TAG = 7;
    public static final int STATE_START_GROUP = 3;
    public static final int STATE_TAG = 6;
    public static final int STATE_VARINT = 0;
    public static final int TAG_FIELD_ENCODING_BITS = 3;

    @NotNull
    private final List<x52> bufferStack;
    private long limit;

    @Nullable
    private FieldEncoding nextFieldEncoding;
    private long pos;
    private long pushedLimit;
    private int recursionDepth;

    @NotNull
    private final l62 source;
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

    public ProtoReader(@NotNull l62 l62Var) {
        l62Var.getClass();
        this.source = l62Var;
        this.limit = Long.MAX_VALUE;
        this.state = 2;
        this.tag = -1;
        this.pushedLimit = -1L;
        this.bufferStack = new ArrayList();
    }

    private final void afterPackableScalar(int fieldEncoding) throws IOException {
        if (this.state == fieldEncoding) {
            this.state = 6;
            return;
        }
        long j = this.pos;
        long j2 = this.limit;
        if (j <= j2) {
            if (j != j2) {
                this.state = 7;
                return;
            }
            this.limit = this.pushedLimit;
            this.pushedLimit = -1L;
            this.state = 6;
            return;
        }
        throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
    }

    private final long beforeLengthDelimitedScalar() throws IOException {
        if (this.state != 2) {
            StringBuilder sb = new StringBuilder("Expected LENGTH_DELIMITED but was ");
            sb.append(this.state);
            sb.append(". Reader position: ");
            sb.append(this.pos);
            sb.append(". Last read tag: ");
            throw new ProtocolException(wv8.j(sb, this.tag, '.'));
        }
        long remainingInLimit = remainingInLimit();
        this.source.o(remainingInLimit);
        this.state = 6;
        this.pos = this.limit;
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        return remainingInLimit;
    }

    private final long checkedLimit(long byteCount) {
        if (byteCount >= 0 && byteCount <= remainingInLimit()) {
            return this.pos + byteCount;
        }
        a70.q();
        return 0L;
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
        long checkedLimit = checkedLimit(internalReadVarint32);
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
        checkedLimit(1L);
        this.source.o(1L);
        this.pos++;
        return this.source.readByte();
    }

    private final long remainingInLimit() {
        long j = this.pos;
        long j2 = this.limit;
        if (j <= j2) {
            return j2 - j;
        }
        a70.q();
        return 0L;
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

    public static /* synthetic */ void requireNonNegativeLength$default(ProtoReader protoReader, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: requireNonNegativeLength");
            return;
        }
        if ((i3 & 2) != 0) {
            i2 = protoReader.tag;
        }
        protoReader.requireNonNegativeLength(i, i2);
    }

    private final void skipGroup(int expectedEndTag) {
        while (this.pos < this.limit && !this.source.w()) {
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

    @NotNull
    /* renamed from: -forEachTag, reason: not valid java name */
    public final gc2 m715forEachTag(@NotNull Function1<? super Integer, ? extends Object> tagHandler) {
        tagHandler.getClass();
        long beginMessage = beginMessage();
        while (true) {
            int nextTag = nextTag();
            if (nextTag == -1) {
                return endMessageAndGetUnknownFields(beginMessage);
            }
            tagHandler.invoke(Integer.valueOf(nextTag));
        }
    }

    public void addUnknownField(int tag, @NotNull FieldEncoding fieldEncoding, @Nullable Object value) {
        fieldEncoding.getClass();
        ProtoWriter protoWriter = new ProtoWriter(this.bufferStack.get(this.recursionDepth - 1));
        ProtoAdapter<?> rawProtoAdapter = fieldEncoding.rawProtoAdapter();
        rawProtoAdapter.getClass();
        rawProtoAdapter.encodeWithTag(protoWriter, tag, (int) value);
    }

    public boolean beforePossiblyPackedScalar$wire_runtime() {
        int i = this.state;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.pos < this.limit) {
                    return true;
                }
                this.limit = this.pushedLimit;
                this.pushedLimit = -1L;
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

    public long beginMessage() throws IOException {
        if (this.state != 2) {
            a70.r("Unexpected call to beginMessage()");
            return 0L;
        }
        int i = this.recursionDepth + 1;
        this.recursionDepth = i;
        if (i > 100) {
            is8.e("Wire recursion limit exceeded");
            return 0L;
        }
        if (i > this.bufferStack.size()) {
            this.bufferStack.add(new x52());
        }
        long j = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
        return j;
    }

    @wx4
    public final void endMessage(long token) throws IOException {
        endMessageAndGetUnknownFields(token);
    }

    @NotNull
    public gc2 endMessageAndGetUnknownFields(long token) throws IOException {
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

    public long nextFieldMinLengthInBytes() {
        FieldEncoding fieldEncoding = this.nextFieldEncoding;
        int i = fieldEncoding == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fieldEncoding.ordinal()];
        if (i == -1) {
            a70.r("nextFieldEncoding is not set");
            return 0L;
        }
        if (i == 1) {
            return remainingInLimit();
        }
        if (i == 2) {
            return 4L;
        }
        if (i == 3) {
            return 8L;
        }
        if (i == 4) {
            return 1L;
        }
        zzl.b();
        return 0L;
    }

    public int nextLengthDelimited() throws IOException {
        int i = this.state;
        if (i == 6 || i == 2) {
            return internalNextLengthDelimited();
        }
        a70.r("Unexpected call to nextDelimited()");
        return 0;
    }

    public int nextTag() throws IOException {
        int i = this.state;
        if (i == 7) {
            this.state = 2;
            return this.tag;
        }
        if (i != 6) {
            a70.r("Unexpected call to nextTag()");
            return 0;
        }
        while (this.pos < this.limit && !this.source.w()) {
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

    @Nullable
    /* renamed from: peekFieldEncoding, reason: from getter */
    public FieldEncoding getNextFieldEncoding() {
        return this.nextFieldEncoding;
    }

    @NotNull
    public gc2 readBytes() throws IOException {
        long beforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.o(beforeLengthDelimitedScalar);
        return this.source.l0(beforeLengthDelimitedScalar);
    }

    public int readFixed32() throws IOException {
        int i = this.state;
        if (i == 5 || i == 2) {
            checkedLimit(4L);
            this.source.o(4L);
            this.pos += 4;
            int K0 = this.source.K0();
            afterPackableScalar(5);
            return K0;
        }
        StringBuilder sb = new StringBuilder("Expected FIXED32 or LENGTH_DELIMITED but was ");
        sb.append(this.state);
        sb.append(". Reader position: ");
        sb.append(this.pos);
        sb.append(". Last read tag: ");
        throw new ProtocolException(wv8.j(sb, this.tag, '.'));
    }

    public long readFixed64() throws IOException {
        int i = this.state;
        if (i == 1 || i == 2) {
            checkedLimit(8L);
            this.source.o(8L);
            this.pos += 8;
            long b0 = this.source.b0();
            afterPackableScalar(1);
            return b0;
        }
        StringBuilder sb = new StringBuilder("Expected FIXED64 or LENGTH_DELIMITED but was ");
        sb.append(this.state);
        sb.append(". Reader position: ");
        sb.append(this.pos);
        sb.append(". Last read tag: ");
        throw new ProtocolException(wv8.j(sb, this.tag, '.'));
    }

    @NotNull
    public String readString() throws IOException {
        long beforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.o(beforeLengthDelimitedScalar);
        return this.source.k0(beforeLengthDelimitedScalar);
    }

    public void readUnknownField(int tag) {
        FieldEncoding nextFieldEncoding = getNextFieldEncoding();
        nextFieldEncoding.getClass();
        addUnknownField(tag, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(this));
    }

    public int readVarint32() throws IOException {
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

    public long readVarint64() throws IOException {
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
        StringBuilder sb2 = new StringBuilder("Malformed VARINT. Reader position: ");
        sb2.append(this.pos);
        sb2.append(". Last read tag: ");
        throw new ProtocolException(wv8.j(sb2, this.tag, '.'));
    }

    public void skip() throws IOException {
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
        } else if (i == 5) {
            readFixed32();
        } else {
            a70.r("Unexpected call to skip()");
        }
    }

    private final void skip(long byteCount) {
        long checkedLimit = checkedLimit(byteCount);
        this.source.skip(byteCount);
        this.pos = checkedLimit;
    }
}
