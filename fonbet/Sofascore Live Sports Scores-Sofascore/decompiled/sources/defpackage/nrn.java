package defpackage;

import com.google.android.gms.internal.wearable.zzcg;
import com.google.android.gms.internal.wearable.zzcj;
import com.google.android.gms.internal.wearable.zzdq;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nrn extends srn {
    public final byte[] c;
    public final int d;
    public final int e;

    public nrn(byte[] bArr, int i, int i2) {
        zzcg.r(i, i + i2, bArr.length);
        this.c = bArr;
        this.d = i;
        this.e = i2;
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    public final byte c(int i) {
        return this.c[this.d + i];
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    public final int d() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    public final srn e(int i, int i2) {
        int r = zzcg.r(i, i2, this.e);
        if (r == 0) {
            return zzcg.b;
        }
        return new nrn(this.c, this.d + i, r);
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    public final void m(int i, byte[] bArr) {
        System.arraycopy(this.c, this.d, bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    public final void n(rtn rtnVar) {
        rtnVar.t(this.d, this.e, this.c);
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    public final boolean o(zzcg zzcgVar) {
        boolean z = zzcgVar instanceof zrn;
        if (!z && !(zzcgVar instanceof nrn)) {
            return zzcgVar.o(this);
        }
        int d = zzcgVar.d();
        int i = this.e;
        if (i > d) {
            zzl.p(String.valueOf(i).length() + 18 + String.valueOf(i).length(), i);
            return false;
        }
        if (i > zzcgVar.d()) {
            int d2 = zzcgVar.d();
            a70.p(x5n.n(new StringBuilder(String.valueOf(i).length() + 27 + String.valueOf(d2).length()), i, "Ran off end of other: 0, ", d2, ", "));
            return false;
        }
        byte[] bArr = this.c;
        int i2 = this.d;
        if (z) {
            return zzcg.s(bArr, i2, 0, ((zrn) zzcgVar).c, i);
        }
        if (!(zzcgVar instanceof nrn)) {
            return zzcgVar.e(0, i).equals(e(i2, i + i2));
        }
        nrn nrnVar = (nrn) zzcgVar;
        return zzcg.s(bArr, i2, nrnVar.d, nrnVar.c, i);
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    public final int p(int i, int i2) {
        return zzdq.a(i, this.d, i2, this.c);
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    public final zzcj q() {
        throw null;
    }
}
