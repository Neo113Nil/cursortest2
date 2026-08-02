package defpackage;

import com.google.android.gms.internal.play_billing.zzfp;
import com.google.android.gms.internal.play_billing.zzgv;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class k8o extends u8o {
    public final byte[] c;
    public final int d;
    public final int e;

    public k8o(byte[] bArr, int i, int i2) {
        zzfp.r(i, i + i2, bArr.length);
        this.c = bArr;
        this.d = i;
        this.e = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final byte c(int i) {
        return this.c[this.d + i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final int d(int i, int i2) {
        return zzgv.a(i, this.d, i2, this.c);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final int m() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final u8o n(int i, int i2) {
        int r = zzfp.r(i, i2, this.e);
        if (r == 0) {
            return zzfp.b;
        }
        return new k8o(this.c, this.d + i, r);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final void o(int i, byte[] bArr) {
        System.arraycopy(this.c, this.d, bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final void p(eao eaoVar) {
        eaoVar.f(this.d, this.e, this.c);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final boolean q(zzfp zzfpVar) {
        boolean z = zzfpVar instanceof z8o;
        if (!z && !(zzfpVar instanceof k8o)) {
            return zzfpVar.q(this);
        }
        int m = zzfpVar.m();
        int i = this.e;
        if (i > m) {
            throw new IllegalArgumentException("Length too large: " + i + i);
        }
        if (i > zzfpVar.m()) {
            a70.p(dmi.k(i, zzfpVar.m(), "Ran off end of other: 0, ", ", "));
            return false;
        }
        byte[] bArr = this.c;
        int i2 = this.d;
        if (z) {
            return zzfp.t(bArr, i2, 0, ((z8o) zzfpVar).c, i);
        }
        if (!(zzfpVar instanceof k8o)) {
            return zzfpVar.n(0, i).equals(n(i2, i + i2));
        }
        k8o k8oVar = (k8o) zzfpVar;
        return zzfp.t(bArr, i2, k8oVar.d, k8oVar.c, i);
    }
}
