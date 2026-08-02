package defpackage;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.WireFormat;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class e03 extends CodedOutputStream {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;

    public e03(int i) {
        super();
        if (i < 0) {
            a70.p("bufferSize must be >= 0");
            throw null;
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.a = bArr;
        this.b = bArr.length;
    }

    public final void a(byte b) {
        int i = this.c;
        this.c = i + 1;
        this.a[i] = b;
        this.d++;
    }

    public final void b(int i) {
        int i2 = this.c;
        int i3 = i2 + 1;
        this.c = i3;
        byte[] bArr = this.a;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.c = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.c = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.c = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
        this.d += 4;
    }

    public final void c(long j) {
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        byte[] bArr = this.a;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.c = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.c = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.c = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.c = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i + 6;
        this.c = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i + 7;
        this.c = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.c = i + 8;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        this.d += 8;
    }

    public final void d(int i, int i2) {
        e(WireFormat.makeTag(i, i2));
    }

    public final void e(int i) {
        boolean z;
        z = CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS;
        byte[] bArr = this.a;
        if (!z) {
            while ((i & (-128)) != 0) {
                int i2 = this.c;
                this.c = i2 + 1;
                bArr[i2] = (byte) ((i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128);
                this.d++;
                i >>>= 7;
            }
            int i3 = this.c;
            this.c = i3 + 1;
            bArr[i3] = (byte) i;
            this.d++;
            return;
        }
        long j = this.c;
        while ((i & (-128)) != 0) {
            int i4 = this.c;
            this.c = i4 + 1;
            uck.m(bArr, (byte) ((i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128), i4);
            i >>>= 7;
        }
        int i5 = this.c;
        this.c = i5 + 1;
        uck.m(bArr, (byte) i, i5);
        this.d += (int) (this.c - j);
    }

    public final void f(long j) {
        boolean z;
        z = CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS;
        byte[] bArr = this.a;
        if (!z) {
            while ((j & (-128)) != 0) {
                int i = this.c;
                this.c = i + 1;
                bArr[i] = (byte) ((((int) j) & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128);
                this.d++;
                j >>>= 7;
            }
            int i2 = this.c;
            this.c = i2 + 1;
            bArr[i2] = (byte) j;
            this.d++;
            return;
        }
        long j2 = this.c;
        while ((j & (-128)) != 0) {
            int i3 = this.c;
            this.c = i3 + 1;
            uck.m(bArr, (byte) ((((int) j) & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) | 128), i3);
            j >>>= 7;
        }
        int i4 = this.c;
        this.c = i4 + 1;
        uck.m(bArr, (byte) j, i4);
        this.d += (int) (this.c - j2);
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int getTotalBytesWritten() {
        return this.d;
    }

    @Override // com.google.protobuf.CodedOutputStream
    public final int spaceLeft() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public void writeLazy(byte[] bArr, int i, int i2) {
        write(bArr, i, i2);
    }

    @Override // com.google.protobuf.CodedOutputStream, com.google.protobuf.ByteOutput
    public void writeLazy(ByteBuffer byteBuffer) {
        write(byteBuffer);
    }
}
