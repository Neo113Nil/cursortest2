package ru.ozon.app.android.travel.feature.general.main.widgets.stickyPromoRedirect.v2.presentation;

import B5.t;
import DQ.b;
import Vg.d;
import W10.c;
import WZ.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.travel.feature.general.main.widgets.stickyPromoRedirect.v2.presentation.StickyPromoRedirectV2WidgetViewHolder;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ'\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u0004\u0018\u00010\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/stickyPromoRedirect/v2/presentation/StickyPromoRedirectV2WidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/general/main/widgets/stickyPromoRedirect/v2/presentation/StickyPromoRedirectV2VO;", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;LVg/d;Ld20/e;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/stickyPromoRedirect/v2/presentation/StickyPromoRedirectV2VO;)V", "onWidgetDestroyed", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/main/widgets/stickyPromoRedirect/v2/presentation/StickyPromoRedirectV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll10/i;", "LWZ/l;", "tokenizedAnalytics", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lcom/airbnb/lottie/LottieAnimationView;", "getLottieAnimationView", "()Lcom/airbnb/lottie/LottieAnimationView;", "lottieAnimationView", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StickyPromoRedirectV2WidgetViewHolder extends AbstractC6064a<StickyPromoRedirectV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyPromoRedirectV2WidgetViewHolder(@NotNull i container, @NotNull d customActionHandlersStoreFactory, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.tokenizedAnalytics = container.X();
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new StickyPromoRedirectV2WidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
    }

    private final LottieAnimationView getLottieAnimationView() {
        View view = getView();
        if (view instanceof LottieAnimationView) {
            return (LottieAnimationView) view;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onWidgetCreated$lambda$0(StickyPromoRedirectV2WidgetViewHolder stickyPromoRedirectV2WidgetViewHolder, View view) {
        AtomAction action;
        StickyPromoRedirectV2VO stickyPromoRedirectV2VO = (StickyPromoRedirectV2VO) stickyPromoRedirectV2WidgetViewHolder.getBoundData();
        if (stickyPromoRedirectV2VO == null || (action = stickyPromoRedirectV2VO.getAction()) == null) {
            return;
        }
        stickyPromoRedirectV2WidgetViewHolder.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onWidgetCreated$lambda$1(StickyPromoRedirectV2WidgetViewHolder stickyPromoRedirectV2WidgetViewHolder, Throwable th2) {
        StickyPromoRedirectV2VO stickyPromoRedirectV2VO = (StickyPromoRedirectV2VO) stickyPromoRedirectV2WidgetViewHolder.getBoundData();
        if (stickyPromoRedirectV2VO != null) {
            stickyPromoRedirectV2WidgetViewHolder.container.M().m(stickyPromoRedirectV2VO.getId());
        }
        LoggerExtKt.sendNonFatal$default(new IllegalStateException(th2), th2.getMessage(), null, null, 12, null);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        LottieAnimationView lottieAnimationView = getLottieAnimationView();
        if (lottieAnimationView != null) {
            lottieAnimationView.setOnClickListener(new b(this, 0));
        }
        LottieAnimationView lottieAnimationView2 = getLottieAnimationView();
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.setFailureListener(new t() { // from class: DQ.c
                @Override // B5.t
                public final void onResult(Object obj) {
                    StickyPromoRedirectV2WidgetViewHolder.onWidgetCreated$lambda$1(StickyPromoRedirectV2WidgetViewHolder.this, (Throwable) obj);
                }
            });
        }
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        LottieAnimationView lottieAnimationView = getLottieAnimationView();
        if (lottieAnimationView != null) {
            lottieAnimationView.cancelAnimation();
        }
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull StickyPromoRedirectV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        LottieAnimationView lottieAnimationView = getLottieAnimationView();
        if (lottieAnimationView != null) {
            ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = item.getPosition();
            lottieAnimationView.setLayoutParams(layoutParams2);
            lottieAnimationView.setAnimationFromUrl(item.getAnimationURL(), item.getCacheId());
            lottieAnimationView.playAnimation();
        }
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull StickyPromoRedirectV2VO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        WZ.t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
