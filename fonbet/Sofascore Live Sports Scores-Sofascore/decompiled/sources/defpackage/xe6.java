package defpackage;

import com.google.android.gms.internal.ads.n;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbil;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xe6 implements zzbie {
    public static final xe6 c = new xe6(false, 0 == true ? 1 : 0);
    public static final xe6 d = new xe6(0 == true ? 1 : 0, 0 == true ? 1 : 0);
    public static xe6 e;
    public boolean a;
    public int b;

    public /* synthetic */ xe6(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public static xe6 c() {
        xe6 xe6Var = e;
        if (xe6Var != null) {
            return xe6Var;
        }
        xe6 xe6Var2 = new xe6();
        xe6Var2.b = 0;
        xe6Var2.a = true;
        e = xe6Var2;
        return xe6Var2;
    }

    @Override // com.google.android.gms.internal.ads.zzbie
    public void a(zzbil.zzt.zza zzaVar) {
        int i = n.c0;
        zzbil.zzbl.zza F = zzbil.zzbl.F();
        boolean E = ((zzbil.zzbl) F.b).E();
        boolean z = this.a;
        if (E != z) {
            F.n();
            ((zzbil.zzbl) F.b).H(z);
        }
        int i2 = this.b;
        F.n();
        ((zzbil.zzbl) F.b).D(i2);
        zzbil.zzbl zzblVar = (zzbil.zzbl) F.o();
        zzaVar.n();
        ((zzbil.zzt) zzaVar.b).H(zzblVar);
    }

    public Long b() {
        return Long.valueOf((System.currentTimeMillis() / 1000) + this.b);
    }
}
