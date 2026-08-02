package defpackage;

import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziem;
import com.google.android.gms.internal.ads.zzier;
import com.google.android.gms.internal.ads.zzifz;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kpo extends lpo {
    public final byte[] c;
    public final int d;
    public final int e;

    public kpo(byte[] bArr, int i, int i2) {
        zziei.e(i, i + i2, bArr.length);
        this.c = bArr;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.lpo
    public final boolean E(zziei zzieiVar, int i, int i2) {
        if (i2 > zzieiVar.o()) {
            int length = String.valueOf(i2).length();
            int i3 = this.e;
            hbo.f(length + 18 + String.valueOf(i3).length(), i2, i3);
            return false;
        }
        int i4 = i + i2;
        if (i4 > zzieiVar.o()) {
            int o = zzieiVar.o();
            int length2 = String.valueOf(i).length();
            StringBuilder sb = new StringBuilder(length2 + 24 + String.valueOf(i2).length() + 2 + String.valueOf(o).length());
            me4.r(sb, "Ran off end of other: ", i, ", ", i2);
            a70.p(me4.g(o, ", ", sb));
            return false;
        }
        boolean z = zzieiVar instanceof mpo;
        byte[] bArr = this.c;
        int i5 = this.d;
        if (z) {
            return zziei.m(bArr, i5, i, ((mpo) zzieiVar).c, i2);
        }
        if (!(zzieiVar instanceof kpo)) {
            return zzieiVar.q(i, i4).equals(q(i5, i2 + i5));
        }
        kpo kpoVar = (kpo) zzieiVar;
        return zziei.m(bArr, i5, kpoVar.d + i, kpoVar.c, i2);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final byte n(int i) {
        return this.c[this.d + i];
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final int o() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziei p(int i, int i2) {
        int e = zziei.e(i, i2, this.e);
        if (e == 0) {
            return zziei.b;
        }
        return new kpo(this.c, this.d + i, e);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziei q(int i, int i2) {
        int e = zziei.e(i, i2, this.e);
        if (e == 0) {
            return zziei.b;
        }
        return new kpo(this.c, this.d + i, e);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final void r(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.c, this.d + i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final ByteBuffer s() {
        return ByteBuffer.wrap(this.c, this.d, this.e).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final void t(zzier zzierVar) {
        zzierVar.a(this.d, this.e, this.c);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final boolean u(zziei zzieiVar) {
        return ((zzieiVar instanceof mpo) || (zzieiVar instanceof kpo)) ? E(zzieiVar, 0, this.e) : zzieiVar.u(this);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final int w(int i, int i2, int i3) {
        return zzifz.b(i, this.d + i2, i3, this.c);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziem x() {
        return zziem.f(this.d, this.e, this.c);
    }
}
