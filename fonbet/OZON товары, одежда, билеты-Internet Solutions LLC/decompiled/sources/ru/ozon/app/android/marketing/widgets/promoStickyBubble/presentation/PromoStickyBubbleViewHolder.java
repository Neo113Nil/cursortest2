package ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation;

import Sc.InterfaceC4008j;
import Sc.o;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.K;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation.PromoStickyBubbleView;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ve.EnumC10311b;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n*\u00016\b\u0001\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001FB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0012J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0012J\u000f\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u0012J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u0010J\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u0012J%\u0010\"\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R'\u0010+\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u000e0%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00101\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0016\u0010@\u001a\u0004\u0018\u00010=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010A\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010C\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010BR\u0014\u0010E\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010B¨\u0006G"}, d2 = {"Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleViewHolder;", "Ld20/a;", "Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleV0;", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "Lkotlin/Function0;", "LVg/c;", "customActionHandlerProvider", "<init>", "(Ll10/i;Ld20/e;Lkotlin/jvm/functions/Function0;)V", "item", "", "bind", "(Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleV0;)V", "onWidgetCreated", "()V", "onWidgetDestroyed", "Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleView$EventType;", "eventType", "processViewEvents", "(Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleV0;Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleView$EventType;)V", "scheduleOverlayCoverage", "hideUnderOverlay", "scheduleShowAfterOverlay", "scheduleTrackViewShow", "trackPendingViewShowNow", "restartAutoHideTimer", "trackViewShowAnalytics", "", "remainingTime", "hideWidget", "startAutoHideTimer", "(ILkotlin/jvm/functions/Function0;)V", "Ll10/i;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler$delegate", "LSc/j;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "Lxe/B0;", "timerJob", "Lxe/B0;", "showAfterOverlayJob", "trackViewShowJob", "openBottomSheetCount", "I", "", "isHiddenForOverlay", "Z", "ru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleViewHolder$fragmentLifecycleCallbacks$1", "fragmentLifecycleCallbacks", "Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleViewHolder$fragmentLifecycleCallbacks$1;", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleView;", "getRootView", "()Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleView;", "rootView", "isCoveredByOverlay", "()Z", "isBubbleAlreadyShown", "getShouldHideUnderOverlay", "shouldHideUnderOverlay", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PromoStickyBubbleViewHolder extends AbstractC6064a<PromoStickyBubbleV0> {
    private static final long SHOW_AFTER_OVERLAY_DELAY;
    private static final long TRACK_VIEW_SHOW_CONFIRMATION_DELAY;

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final PromoStickyBubbleViewHolder$fragmentLifecycleCallbacks$1 fragmentLifecycleCallbacks;
    private boolean isHiddenForOverlay;
    private int openBottomSheetCount;
    private B0 showAfterOverlayJob;
    private B0 timerJob;
    private B0 trackViewShowJob;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/promoStickyBubble/presentation/PromoStickyBubbleViewHolder$Companion;", "", "<init>", "()V", "Lkotlin/time/b;", "SHOW_AFTER_OVERLAY_DELAY", "J", "getSHOW_AFTER_OVERLAY_DELAY-UwyO8pc", "()J", "TRACK_VIEW_SHOW_CONFIRMATION_DELAY", "getTRACK_VIEW_SHOW_CONFIRMATION_DELAY-UwyO8pc", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getSHOW_AFTER_OVERLAY_DELAY-UwyO8pc, reason: not valid java name */
        public final long m794getSHOW_AFTER_OVERLAY_DELAYUwyO8pc() {
            return PromoStickyBubbleViewHolder.SHOW_AFTER_OVERLAY_DELAY;
        }

        /* renamed from: getTRACK_VIEW_SHOW_CONFIRMATION_DELAY-UwyO8pc, reason: not valid java name */
        public final long m795getTRACK_VIEW_SHOW_CONFIRMATION_DELAYUwyO8pc() {
            return PromoStickyBubbleViewHolder.TRACK_VIEW_SHOW_CONFIRMATION_DELAY;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PromoStickyBubbleView.EventType.values().length];
            try {
                iArr[PromoStickyBubbleView.EventType.CTA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PromoStickyBubbleView.EventType.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PromoStickyBubbleView.EventType.START_AUTO_HIDE_TIMER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        b.Companion companion = b.INSTANCE;
        EnumC10311b enumC10311b = EnumC10311b.SECONDS;
        SHOW_AFTER_OVERLAY_DELAY = c.g(1, enumC10311b);
        TRACK_VIEW_SHOW_CONFIRMATION_DELAY = c.g(1, enumC10311b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v3, types: [ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation.PromoStickyBubbleViewHolder$fragmentLifecycleCallbacks$1] */
    public PromoStickyBubbleViewHolder(@NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory, @NotNull Function0<? extends Vg.c> customActionHandlerProvider) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        Intrinsics.checkNotNullParameter(customActionHandlerProvider, "customActionHandlerProvider");
        this.container = container;
        this.actionHandler = LazyUtilsKt.unsafeLazy(new PromoStickyBubbleViewHolder$actionHandler$2(this, customActionHandlerProvider));
        this.fragmentLifecycleCallbacks = new G.m() { // from class: ru.ozon.app.android.marketing.widgets.promoStickyBubble.presentation.PromoStickyBubbleViewHolder$fragmentLifecycleCallbacks$1
            @Override // androidx.fragment.app.G.m
            public void onFragmentAttached(G fm, ComponentCallbacksC5392m fragment, Context context) {
                int i11;
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                Intrinsics.checkNotNullParameter(context, "context");
                if (fragment instanceof com.google.android.material.bottomsheet.b) {
                    i11 = PromoStickyBubbleViewHolder.this.openBottomSheetCount;
                    PromoStickyBubbleViewHolder.this.openBottomSheetCount = i11 + 1;
                    PromoStickyBubbleViewHolder.this.scheduleOverlayCoverage();
                }
            }

            @Override // androidx.fragment.app.G.m
            public void onFragmentDetached(G fm, ComponentCallbacksC5392m fragment) {
                int i11;
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                if (fragment instanceof com.google.android.material.bottomsheet.b) {
                    PromoStickyBubbleViewHolder promoStickyBubbleViewHolder = PromoStickyBubbleViewHolder.this;
                    i11 = promoStickyBubbleViewHolder.openBottomSheetCount;
                    int i12 = i11 - 1;
                    if (i12 < 0) {
                        i12 = 0;
                    }
                    promoStickyBubbleViewHolder.openBottomSheetCount = i12;
                    PromoStickyBubbleViewHolder.this.scheduleOverlayCoverage();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PromoStickyBubbleView getRootView() {
        View view = getView();
        if (view instanceof PromoStickyBubbleView) {
            return (PromoStickyBubbleView) view;
        }
        return null;
    }

    private final boolean getShouldHideUnderOverlay() {
        return isCoveredByOverlay() && !isBubbleAlreadyShown();
    }

    private final l getTokenizedAnalytics() {
        return this.container.X();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void hideUnderOverlay() {
        B0 b02 = this.showAfterOverlayJob;
        if (b02 != null) {
            b02.j(null);
        }
        B0 b03 = this.trackViewShowJob;
        if (b03 != null) {
            b03.j(null);
        }
        B0 b04 = this.timerJob;
        if (b04 != null) {
            b04.j(null);
        }
        PromoStickyBubbleV0 promoStickyBubbleV0 = (PromoStickyBubbleV0) getBoundData();
        if (promoStickyBubbleV0 == null || !promoStickyBubbleV0.getIsVisible()) {
            return;
        }
        PromoStickyBubbleView rootView = getRootView();
        if (rootView != null) {
            rootView.hideUnderOverlay();
        }
        this.isHiddenForOverlay = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isBubbleAlreadyShown() {
        PromoStickyBubbleV0 promoStickyBubbleV0 = (PromoStickyBubbleV0) getBoundData();
        return promoStickyBubbleV0 != null && promoStickyBubbleV0.getWasShown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isCoveredByOverlay() {
        if (this.openBottomSheetCount > 0) {
            return true;
        }
        PromoStickyBubbleV0 promoStickyBubbleV0 = (PromoStickyBubbleV0) getBoundData();
        return promoStickyBubbleV0 != null ? Intrinsics.d(promoStickyBubbleV0.getRateItemsIsVisible(), Boolean.TRUE) : false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processViewEvents(PromoStickyBubbleV0 item, PromoStickyBubbleView.EventType eventType) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
        if (i11 == 1) {
            trackPendingViewShowNow();
            AtomAction action = item.getAction();
            if (action != null) {
                getActionHandler().invoke(action);
            }
            t tokenizedEvent = item.getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtKt.processClickEvents(getTokenizedAnalytics(), tokenizedEvent);
                return;
            }
            return;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                throw new o();
            }
            scheduleTrackViewShow();
            restartAutoHideTimer(item);
            return;
        }
        trackPendingViewShowNow();
        PromoStickyBubbleView rootView = getRootView();
        if (rootView != null) {
            rootView.hide(new PromoStickyBubbleViewHolder$processViewEvents$2(item, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restartAutoHideTimer(PromoStickyBubbleV0 item) {
        Integer remainingTimerSeconds = item.getRemainingTimerSeconds();
        if (remainingTimerSeconds == null) {
            remainingTimerSeconds = item.getAutoHideTimer();
        }
        if (remainingTimerSeconds != null) {
            startAutoHideTimer(remainingTimerSeconds.intValue(), new PromoStickyBubbleViewHolder$restartAutoHideTimer$1$1(this, item));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleOverlayCoverage() {
        if (getShouldHideUnderOverlay()) {
            hideUnderOverlay();
        } else if (this.isHiddenForOverlay) {
            scheduleShowAfterOverlay();
        }
    }

    private final void scheduleShowAfterOverlay() {
        this.isHiddenForOverlay = false;
        B0 b02 = this.showAfterOverlayJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.showAfterOverlayJob = C10727i.c(K.a(this), null, null, new PromoStickyBubbleViewHolder$scheduleShowAfterOverlay$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleTrackViewShow() {
        B0 b02 = this.trackViewShowJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.trackViewShowJob = C10727i.c(K.a(this), null, null, new PromoStickyBubbleViewHolder$scheduleTrackViewShow$1(this, null), 3);
    }

    private final void startAutoHideTimer(int remainingTime, Function0<Unit> hideWidget) {
        B0 b02 = this.timerJob;
        if (b02 != null) {
            b02.j(null);
        }
        kotlin.jvm.internal.K k11 = new kotlin.jvm.internal.K();
        k11.f71785a = remainingTime;
        this.timerJob = C10727i.c(K.a(this), null, null, new PromoStickyBubbleViewHolder$startAutoHideTimer$1(k11, this, hideWidget, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void trackPendingViewShowNow() {
        B0 b02 = this.trackViewShowJob;
        if (b02 == null || !b02.isActive()) {
            return;
        }
        B0 b03 = this.trackViewShowJob;
        if (b03 != null) {
            b03.j(null);
        }
        PromoStickyBubbleV0 promoStickyBubbleV0 = (PromoStickyBubbleV0) getBoundData();
        if (promoStickyBubbleV0 == null || !promoStickyBubbleV0.shouldTrackAfterShow()) {
            return;
        }
        trackViewShowAnalytics();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void trackViewShowAnalytics() {
        PromoStickyBubbleV0 promoStickyBubbleV0 = (PromoStickyBubbleV0) getBoundData();
        if (promoStickyBubbleV0 == null) {
            return;
        }
        t tokenizedEvent = promoStickyBubbleV0.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
        AtomAction viewAction = promoStickyBubbleV0.getViewAction();
        if (viewAction != null) {
            getActionHandler().invoke(viewAction);
        }
        PromoStickyBubbleV0 promoStickyBubbleV02 = (PromoStickyBubbleV0) getBoundData();
        if (promoStickyBubbleV02 != null) {
            promoStickyBubbleV02.setWasShown(true);
        }
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        G d11 = this.container.Q().d();
        if (d11 != null) {
            d11.Y0(this.fragmentLifecycleCallbacks, false);
        }
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        G d11 = this.container.Q().d();
        if (d11 != null) {
            d11.t1(this.fragmentLifecycleCallbacks);
        }
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull PromoStickyBubbleV0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        PromoStickyBubbleView rootView = getRootView();
        if (rootView != null) {
            rootView.bind(item, new PromoStickyBubbleViewHolder$bind$1(this, item), getActionHandler(), getShouldHideUnderOverlay() || this.isHiddenForOverlay);
        }
        scheduleOverlayCoverage();
    }
}
