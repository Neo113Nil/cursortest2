package defpackage;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.viewpager2.widget.ViewPager2;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.interactions.models.ui.InteractionModel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.sofascore.results.R;
import defpackage.gim;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class alm implements cim {
    public final /* synthetic */ efm a;
    public final /* synthetic */ n4m b;
    public final /* synthetic */ InteractionModel c;

    public alm(efm efmVar, n4m n4mVar, InteractionModel interactionModel) {
        this.a = efmVar;
        this.b = n4mVar;
        this.c = interactionModel;
    }

    @Override // defpackage.cim
    public final void a(String str) {
        efm efmVar = this.a;
        n4m n4mVar = efmVar.f;
        if (n4mVar != null) {
            n4m n4mVar2 = this.b;
            if (Intrinsics.c(n4mVar2 != null ? n4mVar2.a : null, n4mVar.a)) {
                url urlVar = efmVar.c;
                InteractionModel interactionModel = this.c;
                String id = interactionModel.getId();
                String type = interactionModel.getType();
                obm obmVar = (obm) urlVar;
                obmVar.getClass();
                id.getClass();
                type.getClass();
                try {
                    ilm ilmVar = (ilm) obmVar.getViewModel();
                    ilmVar.getClass();
                    x5m.safeViewModelScopeIO$default(ilmVar, null, new p9m(id, type, str, ilmVar, null), 1, null);
                } catch (Throwable th) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                }
            }
        }
    }

    @Override // defpackage.cim
    public final void b() {
        obm obmVar = (obm) this.a.c;
        ViewPager2 viewPager2 = obmVar.q.e;
        viewPager2.getClass();
        if (evl.n(viewPager2)) {
            ilm ilmVar = (ilm) obmVar.getViewModel();
            ilmVar.getClass();
            cxl cxlVar = cxl.PREV;
            n4m D = ilmVar.D();
            if (D == null || D.l) {
                ilmVar.a0(cxlVar);
            }
        }
    }

    @Override // defpackage.cim
    public final void c() {
        ilm ilmVar;
        xlm i0;
        obm obmVar = (obm) this.a.c;
        ViewPager2 viewPager2 = obmVar.q.e;
        viewPager2.getClass();
        if (!evl.n(viewPager2) || (i0 = (ilmVar = (ilm) obmVar.getViewModel()).i0()) == null) {
            return;
        }
        List list = ilmVar.o0;
        list.getClass();
        ilmVar.u0.k(new Pair(Boolean.valueOf(list.indexOf(i0) == 0), wrl.PREV));
    }

    @Override // defpackage.cim
    public final void d() {
        obm obmVar = (obm) this.a.c;
        ViewPager2 viewPager2 = obmVar.q.e;
        viewPager2.getClass();
        if (evl.n(viewPager2)) {
            ilm ilmVar = (ilm) obmVar.getViewModel();
            ilmVar.getClass();
            cxl cxlVar = cxl.NEXT;
            n4m D = ilmVar.D();
            if (D == null || D.l) {
                ilmVar.a0(cxlVar);
            }
        }
    }

    @Override // defpackage.cim
    public final void e() {
        obm obmVar = (obm) this.a.c;
        ViewPager2 viewPager2 = obmVar.q.e;
        viewPager2.getClass();
        if (evl.n(viewPager2)) {
            ((ilm) obmVar.getViewModel()).B(true);
        }
    }

    @Override // defpackage.cim
    public final void f() {
        obm obmVar = (obm) this.a.c;
        ViewPager2 viewPager2 = obmVar.q.e;
        viewPager2.getClass();
        if (evl.n(viewPager2)) {
            ((ilm) obmVar.getViewModel()).B(false);
        }
    }

    @Override // defpackage.cim
    public final void g() {
        efm efmVar = this.a;
        n4m n4mVar = efmVar.f;
        if (n4mVar != null) {
            n4m n4mVar2 = this.b;
            if (Intrinsics.c(n4mVar2 != null ? n4mVar2.a : null, n4mVar.a)) {
                m0m m0mVar = efmVar.h;
                m0mVar.getClass();
                m0mVar.setVisibility(0);
                Animation loadAnimation = AnimationUtils.loadAnimation(m0mVar.getContext(), R.anim.blaze_anim_fade_in);
                loadAnimation.setDuration(250L);
                m0mVar.startAnimation(loadAnimation);
                m0mVar.d.getClass();
                obm obmVar = (obm) efmVar.c;
                obmVar.getClass();
                try {
                    ilm ilmVar = (ilm) obmVar.getViewModel();
                    ilmVar.getClass();
                    n4m D = ilmVar.D();
                    gim gimVar = D != null ? D.b : null;
                    if (gimVar instanceof gim.d) {
                        jom.d(ilmVar, EventActionName.INTERACTION_VIEW, jom.createStoryPlayerInteractionProps$default(ilmVar, (gim.d) gimVar, null, 2, null));
                    }
                } catch (Throwable th) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                }
            }
        }
    }

    @Override // defpackage.cim
    public final void a() {
        ilm ilmVar;
        xlm i0;
        obm obmVar = (obm) this.a.c;
        ViewPager2 viewPager2 = obmVar.q.e;
        viewPager2.getClass();
        if (!evl.n(viewPager2) || (i0 = (ilmVar = (ilm) obmVar.getViewModel()).i0()) == null) {
            return;
        }
        List list = ilmVar.o0;
        list.getClass();
        ilmVar.u0.k(new Pair(Boolean.valueOf(list.indexOf(i0) == list.size() - 1), wrl.NEXT));
    }

    @Override // defpackage.cim
    public final void a(Map map) {
        map.getClass();
        obm obmVar = (obm) this.a.c;
        obmVar.getClass();
        map.getClass();
        ViewPager2 viewPager2 = obmVar.q.e;
        viewPager2.getClass();
        if (evl.n(viewPager2)) {
            ((ilm) obmVar.getViewModel()).getClass();
            map.getClass();
            BlazeSDK.INSTANCE.getHostingAppContext().setContext(map);
        }
    }
}
