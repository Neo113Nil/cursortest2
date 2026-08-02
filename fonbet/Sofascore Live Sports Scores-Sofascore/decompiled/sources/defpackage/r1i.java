package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Stage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lr1i;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class r1i extends q8 {
    public final s96 e;
    public final vyh f;
    public final mqi g;
    public Integer h;
    public Integer i;
    public final yzc j;
    public final yzc k;
    public final yzc l;
    public final yzc m;
    public final yzc n;
    public final yzc o;
    public g9i p;
    public g9i q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1i(Application application, s96 s96Var, vyh vyhVar) {
        super(application);
        s96Var.getClass();
        vyhVar.getClass();
        this.e = s96Var;
        this.f = vyhVar;
        this.g = ypa.b(new e6g(this, 29));
        yzc yzcVar = new yzc();
        this.j = yzcVar;
        this.k = yzcVar;
        yzc yzcVar2 = new yzc();
        this.l = yzcVar2;
        this.m = yzcVar2;
        yzc yzcVar3 = new yzc();
        this.n = yzcVar3;
        this.o = yzcVar3;
    }

    public static List k(Stage stage) {
        List<Stage> substages = stage.getSubstages();
        if (substages != null) {
            if (((Stage) CollectionsKt.Y(substages)).getType() != ServerType.EVENT) {
                substages = null;
            }
            if (substages != null) {
                return substages;
            }
        }
        List<Stage> substages2 = stage.getSubstages();
        if (substages2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = substages2.iterator();
        while (it.hasNext()) {
            Iterable k = k((Stage) it.next());
            if (k == null) {
                k = km5.a;
            }
            o13.v(k, arrayList);
        }
        return CollectionsKt.H0(arrayList, new laf(20));
    }

    public final void l() {
        g9i g9iVar = null;
        if (this.j.d() == null) {
            xw3.L(un0.z(this), null, null, new big(this, g9iVar, 18), 3);
            return;
        }
        g9i g9iVar2 = this.q;
        if (g9iVar2 != null) {
            g9iVar2.e(null);
        }
        Integer num = this.i;
        if (num != null) {
            g9iVar = xw3.L(un0.z(this), null, null, new q1i(this, num.intValue(), g9iVar, 0), 3);
        }
        this.q = g9iVar;
    }

    public final void m(int i) {
        this.h = Integer.valueOf(i);
        g9i g9iVar = this.q;
        rq3 rq3Var = null;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        g9i g9iVar2 = this.p;
        if (g9iVar2 != null) {
            g9iVar2.e(null);
        }
        this.p = xw3.L(un0.z(this), null, null, new q1i(this, i, rq3Var, 1), 3);
    }
}
