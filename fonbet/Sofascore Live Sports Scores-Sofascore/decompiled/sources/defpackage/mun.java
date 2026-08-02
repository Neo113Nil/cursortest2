package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.impl.data.FriendlyObstructionImpl;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mun implements nxn {
    public final p03 a;

    /* JADX WARN: Multi-variable type inference failed */
    public mun(p03 p03Var, ViewGroup viewGroup) {
        this.a = p03Var;
        f0l f0lVar = (f0l) p03Var.d;
        if ((f0lVar == null ? null : (View) f0lVar.get()) == viewGroup) {
            return;
        }
        Iterator it = ((HashMap) p03Var.f).values().iterator();
        while (it.hasNext()) {
            ((i2o) it.next()).b(viewGroup);
        }
        p03Var.d = new f0l(viewGroup);
    }

    @Override // defpackage.nxn
    public final void b(FriendlyObstructionImpl friendlyObstructionImpl) {
        d(friendlyObstructionImpl);
    }

    public final void d(as8 as8Var) {
        View view = as8Var.getView();
        cs8 cs8Var = (cs8) Enum.valueOf(cs8.class, as8Var.getPurpose().name());
        String detailedReason = as8Var.getDetailedReason();
        p03 p03Var = this.a;
        for (i2o i2oVar : ((HashMap) p03Var.f).values()) {
            if (!i2oVar.f) {
                i2oVar.b.a(view, cs8Var, detailedReason);
            }
        }
        ((ytn) p03Var.e).a(view, cs8Var, detailedReason);
    }

    @Override // defpackage.nxn
    public final void zzb() {
        p03 p03Var = this.a;
        for (i2o i2oVar : ((HashMap) p03Var.f).values()) {
            if (!i2oVar.f) {
                i2oVar.b.a.clear();
            }
        }
        ((ytn) p03Var.e).a.clear();
    }

    @Override // defpackage.nxn
    public final void w() {
    }

    @Override // defpackage.uf
    public final void a(vf vfVar) {
    }

    @Override // defpackage.wf
    public final void c(hoo hooVar) {
    }

    @Override // defpackage.nxn
    public final void n(String str) {
    }

    @Override // defpackage.nxn
    public final void zzf(String str) {
    }
}
