package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.results.sofaSeason.SofaSeasonWorker;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkth;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class kth extends q8 {
    public final dhk e;
    public final SharedPreferences f;
    public final ith g;
    public final fdi h;
    public final jof i;
    public final g62 j;
    public final nn2 k;
    public boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kth(Application application, dhk dhkVar, SharedPreferences sharedPreferences, ith ithVar) {
        super(application);
        dhkVar.getClass();
        sharedPreferences.getClass();
        ithVar.getClass();
        this.e = dhkVar;
        this.f = sharedPreferences;
        this.g = ithVar;
        fdi a = gdi.a(new hth(rlh.b, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false));
        this.h = a;
        this.i = un0.u(a);
        g62 g = ml4.g(0, 7, null);
        this.j = g;
        this.k = f5p.J(g);
        xw3.L(un0.z(this), null, null, new jth(this, null, 0), 3);
    }

    public final void k() {
        Object value;
        hth hthVar;
        fdi fdiVar = this.h;
        hth hthVar2 = (hth) fdiVar.getValue();
        gv9 gv9Var = hthVar2.a;
        int i = hthVar2.c;
        tfi tfiVar = (tfi) CollectionsKt.a0(hthVar2.b, gv9Var);
        if (tfiVar == null) {
            return;
        }
        int size = tfiVar.e().size();
        fm8 fm8Var = (fm8) CollectionsKt.a0(i + 1, tfiVar.e());
        boolean z = fm8Var instanceof mmi;
        if ((z || (fm8Var instanceof pmi)) && !this.l) {
            m((z ? ((mmi) fm8Var).a : ((pmi) fm8Var).a).ordinal());
        }
        if (i >= size - 1) {
            l(false);
            return;
        }
        do {
            value = fdiVar.getValue();
            hthVar = (hth) value;
        } while (!fdiVar.k(value, hth.a(hthVar, null, 0, hthVar.c + 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, 27)));
    }

    public final void l(boolean z) {
        Object value;
        hth hthVar;
        gv9 e;
        fdi fdiVar = this.h;
        hth hthVar2 = (hth) fdiVar.getValue();
        tfi c = ((hth) this.i.a.getValue()).c();
        rq3 rq3Var = null;
        fm8 fm8Var = (c == null || (e = c.e()) == null) ? null : (fm8) CollectionsKt.a0(0, e);
        boolean z2 = fm8Var instanceof mmi;
        if ((z2 || (fm8Var instanceof pmi)) && !this.l) {
            m((z2 ? ((mmi) fm8Var).a : ((pmi) fm8Var).a).ordinal());
        }
        int i = 1;
        if (hthVar2.b >= hthVar2.a.size() - 1) {
            xw3.L(un0.z(this), null, null, new jth(this, rq3Var, i), 3);
            return;
        }
        do {
            value = fdiVar.getValue();
            hthVar = (hth) value;
        } while (!fdiVar.k(value, hth.a(hthVar, null, hthVar.b + 1, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, !z, 25)));
    }

    public final void m(int i) {
        this.l = true;
        Context i2 = i();
        Pair[] pairArr = {new Pair("USER_ROLE", Integer.valueOf(i))};
        hpo hpoVar = new hpo(18);
        Pair pair = pairArr[0];
        hpoVar.B(pair.b, (String) pair.a);
        md4 l = hpoVar.l();
        vxd.h(i2).b("SofaSeasonWorker-".concat(mha.o(l)), nf6.a, (ltd) vxd.g(SofaSeasonWorker.class, l).a());
    }
}
