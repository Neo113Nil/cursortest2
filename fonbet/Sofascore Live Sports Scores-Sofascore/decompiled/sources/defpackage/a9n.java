package defpackage;

import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzada;
import com.google.android.gms.internal.measurement.zzaed;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a9n extends x8n {
    public final byte[] c;

    public a9n(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final byte c(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final int d() {
        return this.c.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final x8n e(int i, int i2) {
        byte[] bArr = this.c;
        int t = zzacr.t(0, i2, bArr.length);
        return t == 0 ? zzacr.b : new t8n(bArr, 0, t);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final void m(int i, byte[] bArr) {
        System.arraycopy(this.c, 0, bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final void n(zzada zzadaVar) {
        byte[] bArr = this.c;
        zzadaVar.a(0, bArr.length, bArr);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final boolean o(zzacr zzacrVar) {
        boolean z = zzacrVar instanceof a9n;
        byte[] bArr = this.c;
        if (z) {
            return Arrays.equals(bArr, ((a9n) zzacrVar).c);
        }
        boolean z2 = zzacrVar instanceof t8n;
        if (!z2) {
            return zzacrVar.o(this);
        }
        t8n t8nVar = (t8n) zzacrVar;
        int i = t8nVar.e;
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
            return zzacr.u(bArr, 0, 0, ((a9n) zzacrVar).c, length);
        }
        if (!z2) {
            return zzacrVar.e(0, length).equals(e(0, length));
        }
        return zzacr.u(bArr, 0, t8nVar.d, t8nVar.c, length);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final int p(int i, int i2) {
        return zzaed.a(i, 0, i2, this.c);
    }
}
