package defpackage;

import com.google.android.gms.internal.wearable.zzcg;
import com.google.android.gms.internal.wearable.zzcj;
import com.google.android.gms.internal.wearable.zzdq;
import com.google.android.gms.internal.wearable.zzdv;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zrn extends srn {
    public final byte[] c;

    public zrn(byte[] bArr) {
        this.c = bArr;
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    public final byte c(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    public final int d() {
        return this.c.length;
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    public final srn e(int i, int i2) {
        byte[] bArr = this.c;
        int r = zzcg.r(0, i2, bArr.length);
        return r == 0 ? zzcg.b : new nrn(bArr, 0, r);
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    public final void m(int i, byte[] bArr) {
        System.arraycopy(this.c, 0, bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    public final void n(rtn rtnVar) {
        byte[] bArr = this.c;
        rtnVar.t(0, bArr.length, bArr);
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    public final boolean o(zzcg zzcgVar) {
        boolean z = zzcgVar instanceof zrn;
        byte[] bArr = this.c;
        if (z) {
            return Arrays.equals(bArr, ((zrn) zzcgVar).c);
        }
        boolean z2 = zzcgVar instanceof nrn;
        if (!z2) {
            return zzcgVar.o(this);
        }
        nrn nrnVar = (nrn) zzcgVar;
        int i = nrnVar.e;
        int length = bArr.length;
        if (length > i) {
            zzl.p(String.valueOf(length).length() + 18 + String.valueOf(length).length(), length);
            return false;
        }
        if (length > i) {
            a70.p(x5n.n(new StringBuilder(String.valueOf(length).length() + 27 + String.valueOf(i).length()), length, "Ran off end of other: 0, ", i, ", "));
            return false;
        }
        if (z) {
            return zzcg.s(bArr, 0, 0, ((zrn) zzcgVar).c, length);
        }
        if (!z2) {
            return zzcgVar.e(0, length).equals(e(0, length));
        }
        return zzcg.s(bArr, 0, nrnVar.d, nrnVar.c, length);
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    public final int p(int i, int i2) {
        return zzdq.a(i, 0, i2, this.c);
    }

    @Override // com.google.android.gms.internal.wearable.zzcg
    public final zzcj q() {
        byte[] bArr = this.c;
        int length = bArr.length;
        vsn vsnVar = new vsn(bArr, length);
        try {
            vsnVar.a(length);
            return vsnVar;
        } catch (zzdv e) {
            ilg.k(e);
            return null;
        }
    }
}
