package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.s;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.sofascore.local_persistance.Brand;
import com.sofascore.model.firebase.AdType;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.media.highlights.MediaHighlightHeaderView;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jf implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jf(View view, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = view;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object u2gVar;
        LinearLayout childContainer;
        LinearLayout childContainer2;
        int i = this.a;
        pz0 pz0Var = null;
        Object obj = this.d;
        Object obj2 = this.c;
        View view2 = this.b;
        switch (i) {
            case 0:
                view.getClass();
                ((LinearLayout) view2).removeOnAttachStateChangeListener(this);
                AdBannerView adBannerView = (AdBannerView) obj2;
                Context context = adBannerView.getContext();
                context.getClass();
                FragmentActivity K = hkg.K(context);
                BaseActivity baseActivity = K instanceof BaseActivity ? (BaseActivity) K : null;
                try {
                    p2g p2gVar = w2g.b;
                    u2gVar = (AbstractFragment) s.D(adBannerView);
                } catch (Throwable th) {
                    p2g p2gVar2 = w2g.b;
                    u2gVar = new u2g(th);
                }
                boolean z = u2gVar instanceof u2g;
                Object obj3 = u2gVar;
                if (z) {
                    obj3 = null;
                }
                AbstractFragment abstractFragment = (AbstractFragment) obj3;
                if (abstractFragment != null) {
                    childContainer2 = adBannerView.getChildContainer();
                    Map<String, String> customTargeting = adBannerView.getCustomTargeting();
                    if (customTargeting == null) {
                        customTargeting = lm5.a;
                        customTargeting.getClass();
                    }
                    pz0Var = new pz0(childContainer2, abstractFragment, customTargeting);
                } else if (baseActivity != null) {
                    childContainer = adBannerView.getChildContainer();
                    Map<String, String> customTargeting2 = adBannerView.getCustomTargeting();
                    if (customTargeting2 == null) {
                        customTargeting2 = lm5.a;
                        customTargeting2.getClass();
                    }
                    pz0Var = new pz0(childContainer, baseActivity, customTargeting2, null);
                }
                adBannerView.a = pz0Var;
                if (pz0Var != null) {
                    pz0Var.o = new kf(adBannerView);
                    pz0Var.p = new lf(adBannerView);
                    pz0Var.j((AdType.Banner) obj);
                    break;
                }
                break;
            case 1:
                view.getClass();
                view2.removeOnAttachStateChangeListener(this);
                ComposeView composeView = (ComposeView) ((vh) obj2).d;
                ViewGroup.LayoutParams layoutParams = composeView.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    break;
                } else {
                    layoutParams.height = -1;
                    ViewParent parent = composeView.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    layoutParams.width = viewGroup != null ? viewGroup.getWidth() - (((pj5) obj).l * 2) : -1;
                    composeView.setLayoutParams(layoutParams);
                    break;
                }
            case 2:
                view.getClass();
                break;
            case 3:
                view.getClass();
                view2.removeOnAttachStateChangeListener(this);
                g6b t = qea.t((MediaHighlightHeaderView) obj2);
                if (t != null) {
                    t.a((YouTubePlayerView) obj);
                    break;
                }
                break;
            case 4:
                Context context2 = (Context) obj;
                view.getClass();
                ((SegmentedButtonsView) view2).removeOnAttachStateChangeListener(this);
                SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) obj2;
                Pair pair = segmentedButtonsView.h;
                boolean booleanValue = ((Boolean) pair.a).booleanValue();
                boolean booleanValue2 = ((Boolean) pair.b).booleanValue();
                if (booleanValue || booleanValue2) {
                    segmentedButtonsView.setElevation(ao2.u(2, context2));
                    sea.v(segmentedButtonsView.getRoot(), booleanValue, booleanValue2, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    break;
                }
            default:
                view.getClass();
                ((lmj) view2).removeOnAttachStateChangeListener(this);
                lmj lmjVar = (lmj) obj2;
                g6b t2 = qea.t(lmjVar);
                if (t2 != null) {
                    zsk zskVar = new zsk(t2, 30);
                    zskVar.b(lmjVar, new kmj(0, lmjVar, (Brand) obj), null);
                    lmjVar.r = zskVar;
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.a;
        view.getClass();
        switch (i) {
            case 2:
                this.b.removeOnAttachStateChangeListener(this);
                ((AnimatorSet) this.c).cancel();
                ((ConstraintLayout) ((bu1) this.d).b).setTag(null);
                break;
        }
    }
}
