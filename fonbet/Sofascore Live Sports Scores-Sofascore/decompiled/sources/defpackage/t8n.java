package defpackage;

import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzada;
import com.google.android.gms.internal.measurement.zzaed;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class t8n extends x8n {
    public final byte[] c;
    public final int d;
    public final int e;

    public t8n(byte[] bArr, int i, int i2) {
        zzacr.t(i, i + i2, bArr.length);
        this.c = bArr;
        this.d = i;
        this.e = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final byte c(int i) {
        return this.c[this.d + i];
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final int d() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final x8n e(int i, int i2) {
        int t = zzacr.t(i, i2, this.e);
        if (t == 0) {
            return zzacr.b;
        }
        return new t8n(this.c, this.d + i, t);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final void m(int i, byte[] bArr) {
        System.arraycopy(this.c, this.d, bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final void n(zzada zzadaVar) {
        zzadaVar.a(this.d, this.e, this.c);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final boolean o(zzacr zzacrVar) {
        boolean z = zzacrVar instanceof a9n;
        if (!z && !(zzacrVar instanceof t8n)) {
            return zzacrVar.o(this);
        }
        int d = zzacrVar.d();
        int i = this.e;
        if (i > d) {
            zzl.p(String.valueOf(i).length() + 18 + String.valueOf(i).length(), i);
            return false;
        }
        if (i > zzacrVar.d()) {
            int d2 = zzacrVar.d();
            a70.p(x5n.n(new StringBuilder(String.valueOf(i).length() + 27 + String.valueOf(d2).length()), i, "Ran off end of other: 0, ", d2, ", "));
            return false;
        }
        byte[] bArr = this.c;
        int i2 = this.d;
        if (z) {
            return zzacr.u(bArr, i2, 0, ((a9n) zzacrVar).c, i);
        }
        if (!(zzacrVar instanceof t8n)) {
            return zzacrVar.e(0, i).equals(e(i2, i + i2));
        }
        t8n t8nVar = (t8n) zzacrVar;
        return zzacr.u(bArr, i2, t8nVar.d, t8nVar.c, i);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    public final int p(int i, int i2) {
        return zzaed.a(i, this.d, i2, this.c);
    }
}
