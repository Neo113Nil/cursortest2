package nh;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f20938a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f20939b;

    /* renamed from: c, reason: collision with root package name */
    public final BufferedSource f20940c;

    /* renamed from: d, reason: collision with root package name */
    public d[] f20941d;

    /* renamed from: e, reason: collision with root package name */
    public int f20942e;

    /* renamed from: f, reason: collision with root package name */
    public int f20943f;

    /* renamed from: g, reason: collision with root package name */
    public int f20944g;

    public e(t source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f20938a = 4096;
        this.f20939b = new ArrayList();
        this.f20940c = Okio.buffer(source);
        this.f20941d = new d[8];
        this.f20942e = 7;
    }

    public final int a(int i5) {
        int i10;
        int i11 = 0;
        if (i5 > 0) {
            int length = this.f20941d.length;
            while (true) {
                length--;
                i10 = this.f20942e;
                if (length < i10 || i5 <= 0) {
                    break;
                }
                d dVar = this.f20941d[length];
                Intrinsics.checkNotNull(dVar);
                int i12 = dVar.f20936c;
                i5 -= i12;
                this.f20944g -= i12;
                this.f20943f--;
                i11++;
            }
            d[] dVarArr = this.f20941d;
            System.arraycopy(dVarArr, i10 + 1, dVarArr, i10 + 1 + i11, this.f20943f);
            this.f20942e += i11;
        }
        return i11;
    }

    public final ByteString b(int i5) {
        if (i5 >= 0) {
            d[] dVarArr = g.f20953a;
            if (i5 <= dVarArr.length - 1) {
                return dVarArr[i5].f20934a;
            }
        }
        int length = this.f20942e + 1 + (i5 - g.f20953a.length);
        if (length >= 0) {
            d[] dVarArr2 = this.f20941d;
            if (length < dVarArr2.length) {
                d dVar = dVarArr2[length];
                Intrinsics.checkNotNull(dVar);
                return dVar.f20934a;
            }
        }
        throw new IOException("Header index too large " + (i5 + 1));
    }

    public final void c(d dVar) {
        this.f20939b.add(dVar);
        int i5 = dVar.f20936c;
        int i10 = this.f20938a;
        if (i5 > i10) {
            kotlin.collections.o.k(r7, null, 0, this.f20941d.length);
            this.f20942e = this.f20941d.length - 1;
            this.f20943f = 0;
            this.f20944g = 0;
            return;
        }
        a((this.f20944g + i5) - i10);
        int i11 = this.f20943f + 1;
        d[] dVarArr = this.f20941d;
        if (i11 > dVarArr.length) {
            d[] dVarArr2 = new d[dVarArr.length * 2];
            System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
            this.f20942e = this.f20941d.length - 1;
            this.f20941d = dVarArr2;
        }
        int i12 = this.f20942e;
        this.f20942e = i12 - 1;
        this.f20941d[i12] = dVar;
        this.f20943f++;
        this.f20944g += i5;
    }

    public final ByteString d() {
        BufferedSource source = this.f20940c;
        byte readByte = source.readByte();
        byte[] bArr = hh.e.f10821a;
        int i5 = readByte & 255;
        int i10 = 0;
        boolean z5 = (readByte & ByteCompanionObject.MIN_VALUE) == 128;
        long e7 = e(i5, 127);
        if (!z5) {
            return source.readByteString(e7);
        }
        Buffer sink = new Buffer();
        int[] iArr = a0.f20912a;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        b6.q qVar = a0.f20914c;
        b6.q qVar2 = qVar;
        int i11 = 0;
        for (long j = 0; j < e7; j++) {
            byte readByte2 = source.readByte();
            byte[] bArr2 = hh.e.f10821a;
            i10 = (i10 << 8) | (readByte2 & 255);
            i11 += 8;
            while (i11 >= 8) {
                int i12 = (i10 >>> (i11 - 8)) & KotlinVersion.MAX_COMPONENT_VALUE;
                b6.q[] qVarArr = (b6.q[]) qVar2.f3084c;
                Intrinsics.checkNotNull(qVarArr);
                qVar2 = qVarArr[i12];
                Intrinsics.checkNotNull(qVar2);
                if (((b6.q[]) qVar2.f3084c) == null) {
                    sink.writeByte(qVar2.f3082a);
                    i11 -= qVar2.f3083b;
                    qVar2 = qVar;
                } else {
                    i11 -= 8;
                }
            }
        }
        while (i11 > 0) {
            int i13 = (i10 << (8 - i11)) & KotlinVersion.MAX_COMPONENT_VALUE;
            b6.q[] qVarArr2 = (b6.q[]) qVar2.f3084c;
            Intrinsics.checkNotNull(qVarArr2);
            b6.q qVar3 = qVarArr2[i13];
            Intrinsics.checkNotNull(qVar3);
            b6.q[] qVarArr3 = (b6.q[]) qVar3.f3084c;
            int i14 = qVar3.f3083b;
            if (qVarArr3 != null || i14 > i11) {
                break;
            }
            sink.writeByte(qVar3.f3082a);
            i11 -= i14;
            qVar2 = qVar;
        }
        return sink.readByteString();
    }

    public final int e(int i5, int i10) {
        int i11 = i5 & i10;
        if (i11 < i10) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            byte readByte = this.f20940c.readByte();
            byte[] bArr = hh.e.f10821a;
            int i13 = readByte & 255;
            if ((readByte & ByteCompanionObject.MIN_VALUE) == 0) {
                return i10 + (i13 << i12);
            }
            i10 += (readByte & ByteCompanionObject.MAX_VALUE) << i12;
            i12 += 7;
        }
    }
}
