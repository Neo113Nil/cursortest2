package ru.ozon.app.android.ugc.core.widgets.iconWidget.presentation;

import W10.c;
import WZ.l;
import WZ.t;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import d20.AbstractC6067d;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.ugc.core.widgets.iconWidget.presentation.IconWidgetOverlayViewHolder;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00100 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/iconWidget/presentation/IconWidgetOverlayViewHolder;", "Ld20/d;", "Lru/ozon/app/android/ugc/core/widgets/iconWidget/presentation/IconWidgetVO;", "Lru/ozon/app/android/ugc/core/widgets/iconWidget/presentation/IconWidgetView;", "rootView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/iconWidget/presentation/IconWidgetView;LWZ/l;Ll10/i;Ld20/e;)V", "item", "", "bindStickyWithScrollAwareColor", "(Lru/ozon/app/android/ugc/core/widgets/iconWidget/presentation/IconWidgetVO;)V", "bind", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/ugc/core/widgets/iconWidget/presentation/IconWidgetVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onWidgetCreated", "()V", "onWidgetDestroyed", "Lru/ozon/app/android/ugc/core/widgets/iconWidget/presentation/IconWidgetView;", "LWZ/l;", "Ll10/i;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/ugc/core/widgets/iconWidget/presentation/StatusBarScrollListener;", "scrollListener", "Lru/ozon/app/android/ugc/core/widgets/iconWidget/presentation/StatusBarScrollListener;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IconWidgetOverlayViewHolder extends AbstractC6067d<IconWidgetVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final Handler handler;

    @NotNull
    private final IconWidgetView rootView;
    private StatusBarScrollListener scrollListener;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconWidgetOverlayViewHolder(@NotNull IconWidgetView rootView, @NotNull l tokenizedAnalytics, @NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.rootView = rootView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.container = container;
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
        this.handler = new Handler(Looper.getMainLooper());
    }

    private final void bindStickyWithScrollAwareColor(final IconWidgetVO item) {
        View view;
        final RecyclerView composerRecyclerView;
        ComponentCallbacksC5392m c11 = this.container.Q().c();
        if (c11 == null || (view = c11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
            return;
        }
        final int statusBarHeight = ResourceExtKt.getStatusBarHeight(this.container.Q().i());
        this.handler.post(new Runnable() { // from class: OU.b
            @Override // java.lang.Runnable
            public final void run() {
                IconWidgetOverlayViewHolder.bindStickyWithScrollAwareColor$lambda$1(RecyclerView.this, statusBarHeight, item, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindStickyWithScrollAwareColor$lambda$1(RecyclerView recyclerView, int i11, IconWidgetVO iconWidgetVO, IconWidgetOverlayViewHolder iconWidgetOverlayViewHolder) {
        iconWidgetOverlayViewHolder.rootView.bind(iconWidgetVO, recyclerView.computeVerticalScrollOffset() >= i11 ? iconWidgetVO.getScrollColor() : null, new IconWidgetOverlayViewHolder$bindStickyWithScrollAwareColor$1$1(iconWidgetVO, iconWidgetOverlayViewHolder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWidgetCreated$lambda$0(IconWidgetOverlayViewHolder iconWidgetOverlayViewHolder, int i11, RecyclerView recyclerView) {
        StatusBarScrollListener statusBarScrollListener = new StatusBarScrollListener(i11, new IconWidgetOverlayViewHolder$onWidgetCreated$1$1(iconWidgetOverlayViewHolder.rootView));
        recyclerView.addOnScrollListener(statusBarScrollListener);
        iconWidgetOverlayViewHolder.scrollListener = statusBarScrollListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        ComponentCallbacksC5392m c11;
        View view;
        final RecyclerView composerRecyclerView;
        IconWidgetVO iconWidgetVO = (IconWidgetVO) getBoundData();
        if (iconWidgetVO == null || !Intrinsics.d(iconWidgetVO.getIsSticky(), Boolean.TRUE) || iconWidgetVO.getScrollColor() == null || (c11 = this.container.Q().c()) == null || (view = c11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
            return;
        }
        final int statusBarHeight = ResourceExtKt.getStatusBarHeight(this.container.Q().i());
        this.handler.post(new Runnable() { // from class: OU.a
            @Override // java.lang.Runnable
            public final void run() {
                IconWidgetOverlayViewHolder.onWidgetCreated$lambda$0(IconWidgetOverlayViewHolder.this, statusBarHeight, composerRecyclerView);
            }
        });
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        View view;
        RecyclerView composerRecyclerView;
        this.handler.removeCallbacksAndMessages(null);
        ComponentCallbacksC5392m c11 = this.container.Q().c();
        if (c11 != null && (view = c11.getView()) != null && (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) != null) {
            StatusBarScrollListener statusBarScrollListener = this.scrollListener;
            if (statusBarScrollListener == null) {
                return;
            } else {
                composerRecyclerView.removeOnScrollListener(statusBarScrollListener);
            }
        }
        this.scrollListener = null;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull IconWidgetVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (!Intrinsics.d(item.getIsSticky(), Boolean.TRUE) || item.getScrollColor() == null) {
            IconWidgetView.bind$default(this.rootView, item, null, new IconWidgetOverlayViewHolder$bind$1(item, this), 2, null);
        } else {
            bindStickyWithScrollAwareColor(item);
        }
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull IconWidgetVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
