package nh;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ByteString;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Buffer f20945a;

    /* renamed from: b, reason: collision with root package name */
    public int f20946b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20947c;

    /* renamed from: d, reason: collision with root package name */
    public int f20948d;

    /* renamed from: e, reason: collision with root package name */
    public d[] f20949e;

    /* renamed from: f, reason: collision with root package name */
    public int f20950f;

    /* renamed from: g, reason: collision with root package name */
    public int f20951g;

    /* renamed from: h, reason: collision with root package name */
    public int f20952h;

    public f(Buffer out) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.f20945a = out;
        this.f20946b = Integer.MAX_VALUE;
        this.f20948d = 4096;
        this.f20949e = new d[8];
        this.f20950f = 7;
    }

    public final void a(int i5) {
        int i10;
        if (i5 > 0) {
            int length = this.f20949e.length - 1;
            int i11 = 0;
            while (true) {
                i10 = this.f20950f;
                if (length < i10 || i5 <= 0) {
                    break;
                }
                d dVar = this.f20949e[length];
                Intrinsics.checkNotNull(dVar);
                i5 -= dVar.f20936c;
                int i12 = this.f20952h;
                d dVar2 = this.f20949e[length];
                Intrinsics.checkNotNull(dVar2);
                this.f20952h = i12 - dVar2.f20936c;
                this.f20951g--;
                i11++;
                length--;
            }
            d[] dVarArr = this.f20949e;
            int i13 = i10 + 1;
            System.arraycopy(dVarArr, i13, dVarArr, i13 + i11, this.f20951g);
            d[] dVarArr2 = this.f20949e;
            int i14 = this.f20950f + 1;
            Arrays.fill(dVarArr2, i14, i14 + i11, (Object) null);
            this.f20950f += i11;
        }
    }

    public final void b(d dVar) {
        int i5 = dVar.f20936c;
        int i10 = this.f20948d;
        if (i5 > i10) {
            d[] dVarArr = this.f20949e;
            kotlin.collections.o.k(dVarArr, null, 0, dVarArr.length);
            this.f20950f = this.f20949e.length - 1;
            this.f20951g = 0;
            this.f20952h = 0;
            return;
        }
        a((this.f20952h + i5) - i10);
        int i11 = this.f20951g + 1;
        d[] dVarArr2 = this.f20949e;
        if (i11 > dVarArr2.length) {
            d[] dVarArr3 = new d[dVarArr2.length * 2];
            System.arraycopy(dVarArr2, 0, dVarArr3, dVarArr2.length, dVarArr2.length);
            this.f20950f = this.f20949e.length - 1;
            this.f20949e = dVarArr3;
        }
        int i12 = this.f20950f;
        this.f20950f = i12 - 1;
        this.f20949e[i12] = dVar;
        this.f20951g++;
        this.f20952h += i5;
    }

    public final void c(ByteString source) {
        Intrinsics.checkNotNullParameter(source, "data");
        int[] iArr = a0.f20912a;
        Intrinsics.checkNotNullParameter(source, "bytes");
        int size = source.size();
        long j = 0;
        long j6 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            byte b10 = source.getByte(i5);
            byte[] bArr = hh.e.f10821a;
            j6 += a0.f20913b[b10 & 255];
        }
        int i10 = (int) ((j6 + 7) >> 3);
        int size2 = source.size();
        Buffer buffer = this.f20945a;
        if (i10 >= size2) {
            e(source.size(), 127, 0);
            buffer.write(source);
            return;
        }
        Buffer sink = new Buffer();
        int[] iArr2 = a0.f20912a;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int size3 = source.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size3; i12++) {
            byte b11 = source.getByte(i12);
            byte[] bArr2 = hh.e.f10821a;
            int i13 = b11 & 255;
            int i14 = a0.f20912a[i13];
            byte b12 = a0.f20913b[i13];
            j = (j << b12) | i14;
            i11 += b12;
            while (i11 >= 8) {
                i11 -= 8;
                sink.writeByte((int) (j >> i11));
            }
        }
        if (i11 > 0) {
            sink.writeByte((int) ((j << (8 - i11)) | (255 >>> i11)));
        }
        ByteString readByteString = sink.readByteString();
        e(readByteString.size(), 127, 128);
        buffer.write(readByteString);
    }

    public final void d(ArrayList headerBlock) {
        int i5;
        int i10;
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f20947c) {
            int i11 = this.f20946b;
            if (i11 < this.f20948d) {
                e(i11, 31, 32);
            }
            this.f20947c = false;
            this.f20946b = Integer.MAX_VALUE;
            e(this.f20948d, 31, 32);
        }
        int size = headerBlock.size();
        for (int i12 = 0; i12 < size; i12++) {
            d dVar = (d) headerBlock.get(i12);
            ByteString asciiLowercase = dVar.f20934a.toAsciiLowercase();
            ByteString byteString = dVar.f20935b;
            Integer num = (Integer) g.f20954b.get(asciiLowercase);
            if (num != null) {
                int intValue = num.intValue();
                i10 = intValue + 1;
                if (2 <= i10 && i10 < 8) {
                    d[] dVarArr = g.f20953a;
                    if (Intrinsics.areEqual(dVarArr[intValue].f20935b, byteString)) {
                        i5 = i10;
                    } else if (Intrinsics.areEqual(dVarArr[i10].f20935b, byteString)) {
                        i10 = intValue + 2;
                        i5 = i10;
                    }
                }
                i5 = i10;
                i10 = -1;
            } else {
                i5 = -1;
                i10 = -1;
            }
            if (i10 == -1) {
                int i13 = this.f20950f + 1;
                int length = this.f20949e.length;
                while (true) {
                    if (i13 >= length) {
                        break;
                    }
                    d dVar2 = this.f20949e[i13];
                    Intrinsics.checkNotNull(dVar2);
                    if (Intrinsics.areEqual(dVar2.f20934a, asciiLowercase)) {
                        d dVar3 = this.f20949e[i13];
                        Intrinsics.checkNotNull(dVar3);
                        if (Intrinsics.areEqual(dVar3.f20935b, byteString)) {
                            i10 = g.f20953a.length + (i13 - this.f20950f);
                            break;
                        } else if (i5 == -1) {
                            i5 = (i13 - this.f20950f) + g.f20953a.length;
                        }
                    }
                    i13++;
                }
            }
            if (i10 != -1) {
                e(i10, 127, 128);
            } else if (i5 == -1) {
                this.f20945a.writeByte(64);
                c(asciiLowercase);
                c(byteString);
                b(dVar);
            } else if (!asciiLowercase.startsWith(d.f20928d) || Intrinsics.areEqual(d.f20933i, asciiLowercase)) {
                e(i5, 63, 64);
                c(byteString);
                b(dVar);
            } else {
                e(i5, 15, 0);
                c(byteString);
            }
        }
    }

    public final void e(int i5, int i10, int i11) {
        Buffer buffer = this.f20945a;
        if (i5 < i10) {
            buffer.writeByte(i5 | i11);
            return;
        }
        buffer.writeByte(i11 | i10);
        int i12 = i5 - i10;
        while (i12 >= 128) {
            buffer.writeByte(128 | (i12 & 127));
            i12 >>>= 7;
        }
        buffer.writeByte(i12);
    }
}
