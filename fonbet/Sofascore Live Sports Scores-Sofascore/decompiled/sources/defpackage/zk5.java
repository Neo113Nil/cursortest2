package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zk5 extends dy0 {
    public final /* synthetic */ lu t;

    public zk5(lu luVar) {
        this.t = luVar;
    }

    @Override // defpackage.dy0
    public final void A(g7h g7hVar) {
        lu luVar = this.t;
        luVar.c = g7hVar;
        g7h g7hVar2 = (g7h) luVar.c;
        cl5 cl5Var = (cl5) luVar.a;
        luVar.b = new l2a(g7hVar2, cl5Var.g, cl5Var.i, Build.VERSION.SDK_INT >= 34 ? jl5.a() : o02.T());
        cl5 cl5Var2 = (cl5) luVar.a;
        ArrayList arrayList = new ArrayList();
        cl5Var2.a.writeLock().lock();
        try {
            cl5Var2.c = 1;
            arrayList.addAll(cl5Var2.b);
            cl5Var2.b.clear();
            cl5Var2.a.writeLock().unlock();
            cl5Var2.d.post(new q61(arrayList, cl5Var2.c, (Throwable) null));
        } catch (Throwable th) {
            cl5Var2.a.writeLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.dy0
    public final void z(Throwable th) {
        ((cl5) this.t.a).f(th);
    }
}
