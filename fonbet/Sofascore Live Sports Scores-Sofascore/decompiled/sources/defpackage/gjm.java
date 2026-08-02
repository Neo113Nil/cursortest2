package defpackage;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.interactions.models.ui.InteractionModel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.sofascore.results.R;
import defpackage.gim;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gjm implements cim {
    public final /* synthetic */ dlm a;
    public final /* synthetic */ n4m b;
    public final /* synthetic */ InteractionModel c;

    public gjm(dlm dlmVar, n4m n4mVar, InteractionModel interactionModel) {
        this.a = dlmVar;
        this.b = n4mVar;
        this.c = interactionModel;
    }

    @Override // defpackage.cim
    public final void a(String str) {
        dlm dlmVar = this.a;
        n4m n4mVar = dlmVar.g;
        if (n4mVar != null) {
            n4m n4mVar2 = this.b;
            if (Intrinsics.c(n4mVar2 != null ? n4mVar2.a : null, n4mVar.a)) {
                grl grlVar = dlmVar.c;
                InteractionModel interactionModel = this.c;
                String id = interactionModel.getId();
                String type = interactionModel.getType();
                syl sylVar = (syl) grlVar;
                sylVar.getClass();
                id.getClass();
                type.getClass();
                try {
                    sqm sqmVar = (sqm) sylVar.getViewModel();
                    sqmVar.getClass();
                    try {
                        x5m.safeViewModelScopeIO$default(sqmVar, null, new l6m(id, type, str, sqmVar, null), 1, null);
                    } catch (Throwable th) {
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                    }
                } catch (Throwable th2) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
                }
            }
        }
    }

    @Override // defpackage.cim
    public final void c() {
        ((syl) this.a.c).C(-1);
    }

    @Override // defpackage.cim
    public final void e() {
        ((sqm) ((syl) this.a.c).getViewModel()).B(true);
    }

    @Override // defpackage.cim
    public final void f() {
        ((sqm) ((syl) this.a.c).getViewModel()).B(false);
    }

    @Override // defpackage.cim
    public final void g() {
        dlm dlmVar = this.a;
        n4m n4mVar = dlmVar.g;
        if (n4mVar != null) {
            n4m n4mVar2 = this.b;
            if (Intrinsics.c(n4mVar2 != null ? n4mVar2.a : null, n4mVar.a)) {
                m0m m0mVar = dlmVar.m;
                m0mVar.getClass();
                m0mVar.setVisibility(0);
                Animation loadAnimation = AnimationUtils.loadAnimation(m0mVar.getContext(), R.anim.blaze_anim_fade_in);
                loadAnimation.setDuration(250L);
                m0mVar.startAnimation(loadAnimation);
                m0mVar.d.getClass();
                syl sylVar = (syl) dlmVar.c;
                sylVar.getClass();
                try {
                    sqm sqmVar = (sqm) sylVar.getViewModel();
                    sqmVar.getClass();
                    n4m D = sqmVar.D();
                    gim gimVar = D != null ? D.b : null;
                    if (gimVar instanceof gim.b) {
                        ysm.c(sqmVar, EventActionName.INTERACTION_VIEW, ysm.createMomentPlayerInteractionProps$default(sqmVar, (gim.b) gimVar, null, 2, null));
                    }
                } catch (Throwable th) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                }
            }
        }
    }

    @Override // defpackage.cim
    public final void a() {
        ((syl) this.a.c).C(1);
    }

    @Override // defpackage.cim
    public final void a(Map map) {
        map.getClass();
        syl sylVar = (syl) this.a.c;
        sylVar.getClass();
        map.getClass();
        ((sqm) sylVar.getViewModel()).getClass();
        map.getClass();
        BlazeSDK.INSTANCE.getHostingAppContext().setContext(map);
    }
}
