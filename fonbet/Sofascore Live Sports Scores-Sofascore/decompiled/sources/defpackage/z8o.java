package defpackage;

import com.google.android.gms.internal.play_billing.zzfp;
import com.google.android.gms.internal.play_billing.zzgv;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class z8o extends u8o {
    public final byte[] c;

    public z8o(byte[] bArr) {
        this.c = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final byte c(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final int d(int i, int i2) {
        return zzgv.a(i, 0, i2, this.c);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final int m() {
        return this.c.length;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final u8o n(int i, int i2) {
        byte[] bArr = this.c;
        int r = zzfp.r(0, i2, bArr.length);
        return r == 0 ? zzfp.b : new k8o(bArr, 0, r);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final void o(int i, byte[] bArr) {
        System.arraycopy(this.c, 0, bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final void p(eao eaoVar) {
        byte[] bArr = this.c;
        eaoVar.f(0, bArr.length, bArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final boolean q(zzfp zzfpVar) {
        boolean z = zzfpVar instanceof z8o;
        byte[] bArr = this.c;
        if (z) {
            return Arrays.equals(bArr, ((z8o) zzfpVar).c);
        }
        boolean z2 = zzfpVar instanceof k8o;
        if (!z2) {
            return zzfpVar.q(this);
        }
        k8o k8oVar = (k8o) zzfpVar;
        int i = k8oVar.e;
        int length = bArr.length;
        if (length > i) {
            throw new IllegalArgumentException("Length too large: " + length + length);
        }
        if (length > i) {
            a70.p(dmi.k(length, i, "Ran off end of other: 0, ", ", "));
            return false;
        }
        if (z) {
            return zzfp.t(bArr, 0, 0, ((z8o) zzfpVar).c, length);
        }
        if (!z2) {
            return zzfpVar.n(0, length).equals(n(0, length));
        }
        return zzfp.t(bArr, 0, k8oVar.d, k8oVar.c, length);
    }
}
