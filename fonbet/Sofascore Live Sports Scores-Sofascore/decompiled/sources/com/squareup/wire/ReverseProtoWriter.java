package com.squareup.wire;

import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.ate;
import defpackage.b1h;
import defpackage.e;
import defpackage.gc2;
import defpackage.joa;
import defpackage.k62;
import defpackage.ljg;
import defpackage.ogj;
import defpackage.u52;
import defpackage.wtf;
import defpackage.x52;
import defpackage.ypa;
import defpackage.ysa;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0012\u0018\u0000 @2\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0013\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0004\b \u0010\bJ\u0015\u0010\"\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\bJ\u0015\u0010$\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\bJ\u0015\u0010'\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020#¢\u0006\u0004\b'\u0010%R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u00108\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010<\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u0010;R\u0011\u0010?\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lcom/squareup/wire/ReverseProtoWriter;", "", "<init>", "()V", "", "minByteCount", "", "require", "(I)V", "emitCurrentSegment", "Lk62;", "sink", "writeTo", "(Lk62;)V", "Lkotlin/Function1;", "Lcom/squareup/wire/ProtoWriter;", "block", "writeForward$wire_runtime", "(Lkotlin/jvm/functions/Function1;)V", "writeForward", "Lgc2;", U3.i.X, "writeBytes", "(Lgc2;)V", "", "writeString", "(Ljava/lang/String;)V", "fieldNumber", "Lcom/squareup/wire/FieldEncoding;", "fieldEncoding", "writeTag", "(ILcom/squareup/wire/FieldEncoding;)V", "writeSignedVarint32$wire_runtime", "writeSignedVarint32", "writeVarint32", "", "writeVarint64", "(J)V", "writeFixed32", "writeFixed64", "Lx52;", "tail", "Lx52;", "head", "Lu52;", "cursor", "Lu52;", "", "array", "[B", "arrayLimit", "I", "forwardBuffer$delegate", "Ljoa;", "getForwardBuffer", "()Lx52;", "forwardBuffer", "forwardWriter$delegate", "getForwardWriter", "()Lcom/squareup/wire/ProtoWriter;", "forwardWriter", "getByteCount", "()I", "byteCount", "Companion", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReverseProtoWriter {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final byte[] EMPTY_ARRAY = new byte[0];

    @NotNull
    private byte[] array;
    private int arrayLimit;

    @NotNull
    private final u52 cursor;

    /* renamed from: forwardBuffer$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa forwardBuffer;

    /* renamed from: forwardWriter$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa forwardWriter;

    @NotNull
    private x52 tail = new x52();

    @NotNull
    private x52 head = new x52();

    public ReverseProtoWriter() {
        u52 u52Var = new u52();
        u52Var.c = -1L;
        u52Var.e = -1;
        this.cursor = u52Var;
        this.array = EMPTY_ARRAY;
        ysa ysaVar = ysa.c;
        this.forwardBuffer = ypa.a(ysaVar, new wtf(4));
        this.forwardWriter = ypa.a(ysaVar, new ate(this, 28));
    }

    private final void emitCurrentSegment() {
        byte[] bArr = this.array;
        byte[] bArr2 = EMPTY_ARRAY;
        if (bArr == bArr2) {
            return;
        }
        this.cursor.close();
        this.head.skip(this.arrayLimit);
        this.head.M0(this.tail);
        x52 x52Var = this.tail;
        this.tail = this.head;
        this.head = x52Var;
        this.array = bArr2;
        this.arrayLimit = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x52 forwardBuffer_delegate$lambda$0() {
        return new x52();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoWriter forwardWriter_delegate$lambda$0(ReverseProtoWriter reverseProtoWriter) {
        return new ProtoWriter(reverseProtoWriter.getForwardBuffer());
    }

    private final x52 getForwardBuffer() {
        return (x52) this.forwardBuffer.getValue();
    }

    private final ProtoWriter getForwardWriter() {
        return (ProtoWriter) this.forwardWriter.getValue();
    }

    private final void require(int minByteCount) {
        if (this.arrayLimit >= minByteCount) {
            return;
        }
        emitCurrentSegment();
        x52 x52Var = this.head;
        u52 u52Var = this.cursor;
        x52Var.getClass();
        u52Var.getClass();
        byte[] bArr = e.a;
        if (u52Var.a != null) {
            a70.r("already attached to a buffer");
            return;
        }
        u52Var.a = x52Var;
        u52Var.b = true;
        u52 u52Var2 = this.cursor;
        u52Var2.getClass();
        if (minByteCount <= 0) {
            ogj.h(ljg.j(minByteCount, "minByteCount <= 0: "));
            return;
        }
        if (minByteCount > 8192) {
            ogj.h(ljg.j(minByteCount, "minByteCount > Segment.SIZE: "));
            return;
        }
        x52 x52Var2 = u52Var2.a;
        if (x52Var2 == null) {
            a70.r("not attached to a buffer");
            return;
        }
        if (!u52Var2.b) {
            a70.r("expandBuffer() only permitted for read/write buffers");
            return;
        }
        long j = x52Var2.b;
        b1h Q0 = x52Var2.Q0(minByteCount);
        int i = 8192 - Q0.c;
        Q0.c = 8192;
        x52Var2.b = i + j;
        u52Var2.c = j;
        u52Var2.d = Q0.a;
        u52Var2.e = 8192;
        u52 u52Var3 = this.cursor;
        if (u52Var3.c == 0) {
            int i2 = u52Var3.e;
            byte[] bArr2 = u52Var3.d;
            bArr2.getClass();
            if (i2 == bArr2.length) {
                byte[] bArr3 = this.cursor.d;
                bArr3.getClass();
                this.array = bArr3;
                this.arrayLimit = this.cursor.e;
                return;
            }
        }
        a70.r("Check failed.");
    }

    public final int getByteCount() {
        return (this.array.length - this.arrayLimit) + ((int) this.tail.b);
    }

    public final void writeBytes(@NotNull gc2 value) {
        value.getClass();
        int h = value.h();
        while (h != 0) {
            require(1);
            int min = Math.min(this.arrayLimit, h);
            int i = this.arrayLimit - min;
            this.arrayLimit = i;
            h -= min;
            value.f(h, i, min, this.array);
        }
    }

    public final void writeFixed32(int value) {
        require(4);
        int i = this.arrayLimit;
        int i2 = i - 4;
        this.arrayLimit = i2;
        byte[] bArr = this.array;
        bArr[i2] = (byte) (value & 255);
        bArr[i - 3] = (byte) ((value >>> 8) & 255);
        bArr[i - 2] = (byte) ((value >>> 16) & 255);
        bArr[i - 1] = (byte) ((value >>> 24) & 255);
    }

    public final void writeFixed64(long value) {
        require(8);
        int i = this.arrayLimit;
        int i2 = i - 8;
        this.arrayLimit = i2;
        byte[] bArr = this.array;
        bArr[i2] = (byte) (value & 255);
        bArr[i - 7] = (byte) ((value >>> 8) & 255);
        bArr[i - 6] = (byte) ((value >>> 16) & 255);
        bArr[i - 5] = (byte) ((value >>> 24) & 255);
        bArr[i - 4] = (byte) ((value >>> 32) & 255);
        bArr[i - 3] = (byte) ((value >>> 40) & 255);
        bArr[i - 2] = (byte) ((value >>> 48) & 255);
        bArr[i - 1] = (byte) ((value >>> 56) & 255);
    }

    public final void writeForward$wire_runtime(@NotNull Function1<? super ProtoWriter, Unit> block) throws IOException {
        block.getClass();
        block.invoke(getForwardWriter());
        x52 forwardBuffer = getForwardBuffer();
        writeBytes(forwardBuffer.l0(forwardBuffer.b));
    }

    public final void writeSignedVarint32$wire_runtime(int value) {
        if (value >= 0) {
            writeVarint32(value);
        } else {
            writeVarint64(value);
        }
    }

    public final void writeString(@NotNull String value) {
        value.getClass();
        int length = value.length() - 1;
        while (length >= 0) {
            int i = length - 1;
            char charAt = value.charAt(length);
            if (charAt < 128) {
                require(1);
                int i2 = this.arrayLimit;
                byte[] bArr = this.array;
                int i3 = i2 - 1;
                bArr[i3] = (byte) charAt;
                int max = Math.max(-1, i - i3);
                int i4 = i3;
                length = i;
                while (length > max) {
                    char charAt2 = value.charAt(length);
                    if (charAt2 >= 128) {
                        break;
                    }
                    length--;
                    i4--;
                    bArr[i4] = (byte) charAt2;
                }
                this.arrayLimit = i4;
            } else {
                if (charAt < 2048) {
                    require(2);
                    byte[] bArr2 = this.array;
                    int i5 = this.arrayLimit;
                    int i6 = i5 - 1;
                    this.arrayLimit = i6;
                    bArr2[i6] = (byte) (128 | (charAt & '?'));
                    int i7 = i5 - 2;
                    this.arrayLimit = i7;
                    bArr2[i7] = (byte) ((charAt >> 6) | PsExtractor.AUDIO_STREAM);
                } else if (charAt < 55296 || charAt > 57343) {
                    require(3);
                    byte[] bArr3 = this.array;
                    int i8 = this.arrayLimit;
                    int i9 = i8 - 1;
                    this.arrayLimit = i9;
                    bArr3[i9] = (byte) ((charAt & '?') | 128);
                    int i10 = i8 - 2;
                    this.arrayLimit = i10;
                    bArr3[i10] = (byte) (128 | (63 & (charAt >> 6)));
                    int i11 = i8 - 3;
                    this.arrayLimit = i11;
                    bArr3[i11] = (byte) ((charAt >> '\f') | 224);
                } else {
                    char charAt3 = i >= 0 ? value.charAt(i) : (char) 65535;
                    if (charAt3 > 56319 || 56320 > charAt || charAt >= 57344) {
                        require(1);
                        byte[] bArr4 = this.array;
                        int i12 = this.arrayLimit - 1;
                        this.arrayLimit = i12;
                        bArr4[i12] = 63;
                    } else {
                        length -= 2;
                        int i13 = (((charAt3 & 1023) << 10) | (charAt & 1023)) + C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        require(4);
                        byte[] bArr5 = this.array;
                        int i14 = this.arrayLimit;
                        int i15 = i14 - 1;
                        this.arrayLimit = i15;
                        bArr5[i15] = (byte) ((i13 & 63) | 128);
                        int i16 = i14 - 2;
                        this.arrayLimit = i16;
                        bArr5[i16] = (byte) (((i13 >> 6) & 63) | 128);
                        int i17 = i14 - 3;
                        this.arrayLimit = i17;
                        bArr5[i17] = (byte) (128 | (63 & (i13 >> 12)));
                        int i18 = i14 - 4;
                        this.arrayLimit = i18;
                        bArr5[i18] = (byte) ((i13 >> 18) | 240);
                    }
                }
                length = i;
            }
        }
    }

    public final void writeTag(int fieldNumber, @NotNull FieldEncoding fieldEncoding) {
        fieldEncoding.getClass();
        writeVarint32(ProtoWriter.INSTANCE.makeTag$wire_runtime(fieldNumber, fieldEncoding));
    }

    public final void writeTo(@NotNull k62 sink) throws IOException {
        sink.getClass();
        emitCurrentSegment();
        sink.M0(this.tail);
    }

    public final void writeVarint32(int value) {
        int varint32Size$wire_runtime = ProtoWriter.INSTANCE.varint32Size$wire_runtime(value);
        require(varint32Size$wire_runtime);
        int i = this.arrayLimit - varint32Size$wire_runtime;
        this.arrayLimit = i;
        while (true) {
            int i2 = value & (-128);
            byte[] bArr = this.array;
            if (i2 == 0) {
                bArr[i] = (byte) value;
                return;
            } else {
                bArr[i] = (byte) ((value & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128);
                value >>>= 7;
                i++;
            }
        }
    }

    public final void writeVarint64(long value) {
        int varint64Size$wire_runtime = ProtoWriter.INSTANCE.varint64Size$wire_runtime(value);
        require(varint64Size$wire_runtime);
        int i = this.arrayLimit - varint64Size$wire_runtime;
        this.arrayLimit = i;
        while (true) {
            long j = (-128) & value;
            byte[] bArr = this.array;
            if (j == 0) {
                bArr[i] = (byte) value;
                return;
            } else {
                bArr[i] = (byte) ((127 & value) | 128);
                value >>>= 7;
                i++;
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/squareup/wire/ReverseProtoWriter$Companion;", "", "<init>", "()V", "EMPTY_ARRAY", "", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
