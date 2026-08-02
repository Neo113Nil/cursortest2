package com.squareup.wire;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import okio.ByteString;
import ru.ok.android.commons.nio.charset.CharsetEncoder;
import xsna.an8;
import xsna.b;
import xsna.gzs;
import xsna.izs;
import xsna.lhg;
import xsna.m4i0;
import xsna.msy;
import xsna.s3q0;
import xsna.vl8;
import xsna.zcl;

/* compiled from: ReverseProtoWriter.kt */
/* loaded from: classes14.dex */
public final class ReverseProtoWriter {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final byte[] EMPTY_ARRAY = new byte[0];
    private int arrayLimit;
    private final Lazy forwardBuffer$delegate;
    private final Lazy forwardWriter$delegate;
    private vl8 tail = new vl8();
    private vl8 head = new vl8();
    private final vl8.c cursor = new vl8.c();
    private byte[] array = EMPTY_ARRAY;

    /* compiled from: ReverseProtoWriter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public ReverseProtoWriter() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.forwardBuffer$delegate = msy.a(lazyThreadSafetyMode, new gzs<vl8>() { // from class: com.squareup.wire.ReverseProtoWriter$forwardBuffer$2
            @Override // xsna.gzs
            public final vl8 invoke() {
                return new vl8();
            }
        });
        this.forwardWriter$delegate = msy.a(lazyThreadSafetyMode, new gzs<ProtoWriter>() { // from class: com.squareup.wire.ReverseProtoWriter$forwardWriter$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.gzs
            public final ProtoWriter invoke() {
                vl8 forwardBuffer;
                forwardBuffer = ReverseProtoWriter.this.getForwardBuffer();
                return new ProtoWriter(forwardBuffer);
            }
        });
    }

    private final void emitCurrentSegment() {
        byte[] bArr = this.array;
        byte[] bArr2 = EMPTY_ARRAY;
        if (bArr == bArr2) {
            return;
        }
        this.cursor.close();
        this.head.skip(this.arrayLimit);
        this.head.L2(this.tail);
        vl8 vl8Var = this.tail;
        this.tail = this.head;
        this.head = vl8Var;
        this.array = bArr2;
        this.arrayLimit = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vl8 getForwardBuffer() {
        return (vl8) this.forwardBuffer$delegate.getValue();
    }

    private final ProtoWriter getForwardWriter() {
        return (ProtoWriter) this.forwardWriter$delegate.getValue();
    }

    private final void require(int i) {
        if (this.arrayLimit >= i) {
            return;
        }
        emitCurrentSegment();
        vl8 vl8Var = this.head;
        vl8.c cVar = this.cursor;
        vl8Var.getClass();
        b.a(vl8Var, cVar);
        vl8.c cVar2 = this.cursor;
        cVar2.getClass();
        if (i <= 0) {
            throw new IllegalArgumentException(lhg.a(i, "minByteCount <= 0: ").toString());
        }
        if (i > 8192) {
            throw new IllegalArgumentException(lhg.a(i, "minByteCount > Segment.SIZE: ").toString());
        }
        vl8 vl8Var2 = cVar2.b;
        if (vl8Var2 == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!cVar2.c) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
        }
        long j = vl8Var2.c;
        m4i0 E = vl8Var2.E(i);
        int i2 = 8192 - E.c;
        E.c = 8192;
        vl8Var2.c = i2 + j;
        cVar2.d = E;
        cVar2.e = j;
        cVar2.f = E.a;
        cVar2.g = 8192 - i2;
        cVar2.h = 8192;
        vl8.c cVar3 = this.cursor;
        if (cVar3.e == 0) {
            int i3 = cVar3.h;
            byte[] bArr = cVar3.f;
            if (i3 == bArr.length) {
                this.array = bArr;
                this.arrayLimit = i3;
                return;
            }
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int getByteCount() {
        return (this.array.length - this.arrayLimit) + ((int) this.tail.c);
    }

    public final void writeBytes(ByteString byteString) {
        int n = byteString.n();
        while (n != 0) {
            require(1);
            int min = Math.min(this.arrayLimit, n);
            int i = this.arrayLimit - min;
            this.arrayLimit = i;
            n -= min;
            byteString.k(n, i, min, this.array);
        }
    }

    public final void writeFixed32(int i) {
        require(4);
        int i2 = this.arrayLimit;
        int i3 = i2 - 4;
        this.arrayLimit = i3;
        byte[] bArr = this.array;
        bArr[i3] = (byte) (i & 255);
        bArr[i2 - 3] = (byte) ((i >>> 8) & 255);
        bArr[i2 - 2] = (byte) ((i >>> 16) & 255);
        bArr[i2 - 1] = (byte) ((i >>> 24) & 255);
    }

    public final void writeFixed64(long j) {
        require(8);
        int i = this.arrayLimit;
        int i2 = i - 8;
        this.arrayLimit = i2;
        byte[] bArr = this.array;
        bArr[i2] = (byte) (j & 255);
        bArr[i - 7] = (byte) ((j >>> 8) & 255);
        bArr[i - 6] = (byte) ((j >>> 16) & 255);
        bArr[i - 5] = (byte) ((j >>> 24) & 255);
        bArr[i - 4] = (byte) ((j >>> 32) & 255);
        bArr[i - 3] = (byte) ((j >>> 40) & 255);
        bArr[i - 2] = (byte) ((j >>> 48) & 255);
        bArr[i - 1] = (byte) ((j >>> 56) & 255);
    }

    public final void writeForward$wire_runtime(izs<? super ProtoWriter, s3q0> izsVar) throws IOException {
        izsVar.invoke(getForwardWriter());
        vl8 forwardBuffer = getForwardBuffer();
        writeBytes(forwardBuffer.F0(forwardBuffer.c));
    }

    public final void writeSignedVarint32$wire_runtime(int i) {
        if (i >= 0) {
            writeVarint32(i);
        } else {
            writeVarint64(i);
        }
    }

    public final void writeString(String str) {
        int length = str.length() - 1;
        while (length >= 0) {
            int i = length - 1;
            char charAt = str.charAt(length);
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
                    char charAt2 = str.charAt(length);
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
                    char charAt3 = i >= 0 ? str.charAt(i) : (char) 65535;
                    if (charAt3 > 56319 || 56320 > charAt || charAt >= 57344) {
                        require(1);
                        byte[] bArr4 = this.array;
                        int i12 = this.arrayLimit - 1;
                        this.arrayLimit = i12;
                        bArr4[i12] = CharsetEncoder.DEFAULT_REPLACEMENT;
                    } else {
                        length -= 2;
                        int i13 = (((charAt3 & 1023) << 10) | (charAt & 1023)) + 65536;
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
                        bArr5[i18] = (byte) ((i13 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                    }
                }
                length = i;
            }
        }
    }

    public final void writeTag(int i, FieldEncoding fieldEncoding) {
        writeVarint32(ProtoWriter.Companion.makeTag$wire_runtime(i, fieldEncoding));
    }

    public final void writeTo(an8 an8Var) throws IOException {
        emitCurrentSegment();
        an8Var.L2(this.tail);
    }

    public final void writeVarint32(int i) {
        int varint32Size$wire_runtime = ProtoWriter.Companion.varint32Size$wire_runtime(i);
        require(varint32Size$wire_runtime);
        int i2 = this.arrayLimit - varint32Size$wire_runtime;
        this.arrayLimit = i2;
        while ((i & (-128)) != 0) {
            this.array[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
            i2++;
        }
        this.array[i2] = (byte) i;
    }

    public final void writeVarint64(long j) {
        int varint64Size$wire_runtime = ProtoWriter.Companion.varint64Size$wire_runtime(j);
        require(varint64Size$wire_runtime);
        int i = this.arrayLimit - varint64Size$wire_runtime;
        this.arrayLimit = i;
        while (((-128) & j) != 0) {
            this.array[i] = (byte) ((127 & j) | 128);
            j >>>= 7;
            i++;
        }
        this.array[i] = (byte) j;
    }
}
