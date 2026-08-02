package defpackage;

import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zzmj;
import com.google.android.gms.internal.measurement.zzmk;
import com.google.android.gms.internal.measurement.zzrf;
import com.google.android.gms.internal.measurement.zzru;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class iwo implements tmi {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iwo(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tmi
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Object obj2 = zzlk.j;
                return new zzru((ArrayList) obj);
            default:
                zzrf zzrfVar = (zzrf) obj;
                lvc lvcVar = (lvc) zzrfVar.c.get();
                lvcVar.getClass();
                zzmj zzmjVar = (zzmj) zzrfVar.b.get();
                zzmjVar.getClass();
                b1 zzd = zzmjVar.zzd();
                int i2 = hd8.h;
                xen xenVar = xen.e;
                int i3 = d1.l;
                c1 c1Var = new c1(zzd, zzmk.class, xenVar);
                zzd.addListener(c1Var, oea.u(lvcVar, c1Var));
                nub nubVar = new nub(zzrfVar, 2);
                int i4 = g8.k;
                f8 f8Var = new f8(c1Var, nubVar);
                c1Var.addListener(f8Var, oea.u(lvcVar, f8Var));
                f8Var.addListener(new dno(f8Var, 18), lvcVar);
                return f8Var;
        }
    }
}
