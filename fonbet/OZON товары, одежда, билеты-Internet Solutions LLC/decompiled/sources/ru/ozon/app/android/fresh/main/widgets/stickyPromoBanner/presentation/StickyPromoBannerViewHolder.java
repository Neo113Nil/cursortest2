package ru.ozon.app.android.fresh.main.widgets.stickyPromoBanner.presentation;

import Sc.InterfaceC4008j;
import Vg.c;
import WZ.l;
import WZ.t;
import android.view.View;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ'\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR'\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u0004\u0018\u00010&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/stickyPromoBanner/presentation/StickyPromoBannerViewHolder;", "Ld20/a;", "Lru/ozon/app/android/fresh/main/widgets/stickyPromoBanner/presentation/StickyPromoBannerVO;", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "Lkotlin/Function0;", "LVg/c;", "customActionHandlerProvider", "<init>", "(Ll10/i;Ld20/e;Lkotlin/jvm/functions/Function0;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/fresh/main/widgets/stickyPromoBanner/presentation/StickyPromoBannerVO;)V", "onWidgetDestroyed", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/main/widgets/stickyPromoBanner/presentation/StickyPromoBannerVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll10/i;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler$delegate", "LSc/j;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/fresh/main/widgets/stickyPromoBanner/presentation/StickyPromoBannerView;", "getRootView", "()Lru/ozon/app/android/fresh/main/widgets/stickyPromoBanner/presentation/StickyPromoBannerView;", "rootView", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StickyPromoBannerViewHolder extends AbstractC6064a<StickyPromoBannerVO> {

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    @NotNull
    private final i container;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickyPromoBannerViewHolder(@NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory, @NotNull Function0<? extends c> customActionHandlerProvider) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        Intrinsics.checkNotNullParameter(customActionHandlerProvider, "customActionHandlerProvider");
        this.container = container;
        this.actionHandler = LazyUtilsKt.unsafeLazy(new StickyPromoBannerViewHolder$actionHandler$2(this, customActionHandlerProvider));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    private final StickyPromoBannerView getRootView() {
        View view = getView();
        if (view instanceof StickyPromoBannerView) {
            return (StickyPromoBannerView) view;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l getTokenizedAnalytics() {
        return this.container.X();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        StickyPromoBannerView rootView = getRootView();
        if (rootView != null) {
            rootView.setFailureListener(new StickyPromoBannerViewHolder$onWidgetCreated$1(this));
        }
        StickyPromoBannerView rootView2 = getRootView();
        if (rootView2 != null) {
            rootView2.setOnClickCallback(new StickyPromoBannerViewHolder$onWidgetCreated$2(this));
        }
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        StickyPromoBannerView rootView = getRootView();
        if (rootView != null) {
            rootView.clear();
        }
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull StickyPromoBannerVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        StickyPromoBannerView rootView = getRootView();
        if (rootView != null) {
            rootView.bind(item, new StickyPromoBannerViewHolder$bind$1(item, this));
        }
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull StickyPromoBannerVO item, @NotNull W10.c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
