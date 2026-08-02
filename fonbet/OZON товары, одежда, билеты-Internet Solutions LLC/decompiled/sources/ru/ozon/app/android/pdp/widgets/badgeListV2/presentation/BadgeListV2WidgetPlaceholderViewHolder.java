package ru.ozon.app.android.pdp.widgets.badgeListV2.presentation;

import Sc.InterfaceC4008j;
import Vg.d;
import W10.c;
import WZ.l;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderViewHolderDelegateImpl;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.widgets.badgeListV2.presentation.BadgeListV2ItemDecorator;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2WidgetPlaceholderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2VO;", "Landroid/widget/FrameLayout;", "containerView", "LWZ/l;", "tokenizedAnalytics", "Ll10/i;", "container", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "widgetImagePlaceholderAdapter", "Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2ItemDecorator$PaddingConfig;", "decoratorConfig", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroid/widget/FrameLayout;LWZ/l;Ll10/i;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2ItemDecorator$PaddingConfig;LVg/d;)V", "item", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "", "trackView", "(Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdp/widgets/badgeListV2/presentation/BadgeListV2VO;Ll20/d;)V", "onDetach", "()V", "LWZ/l;", "LSc/j;", "Landroidx/recyclerview/widget/RecyclerView;", "mainView", "LSc/j;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderViewHolderDelegateImpl;", "imagePlaceholderDelegate", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderViewHolderDelegateImpl;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BadgeListV2WidgetPlaceholderViewHolder extends k<BadgeListV2VO> {

    @NotNull
    private final WidgetImagePlaceholderViewHolderDelegateImpl<BadgeListV2VO> imagePlaceholderDelegate;

    @NotNull
    private final InterfaceC4008j<RecyclerView> mainView;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeListV2WidgetPlaceholderViewHolder(@NotNull FrameLayout containerView, @NotNull l tokenizedAnalytics, @NotNull i container, @NotNull WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter, BadgeListV2ItemDecorator.PaddingConfig paddingConfig, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(widgetImagePlaceholderAdapter, "widgetImagePlaceholderAdapter");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.tokenizedAnalytics = tokenizedAnalytics;
        InterfaceC4008j<RecyclerView> lazyUnsafe = DelegatesKt.lazyUnsafe(new BadgeListV2WidgetPlaceholderViewHolder$mainView$1(this, paddingConfig));
        this.mainView = lazyUnsafe;
        this.imagePlaceholderDelegate = new WidgetImagePlaceholderViewHolderDelegateImpl<>(widgetImagePlaceholderAdapter, containerView, new BadgeListV2WidgetPlaceholderViewHolder$imagePlaceholderDelegate$1(this), lazyUnsafe, DelegatesKt.lazyUnsafe(new BadgeListV2WidgetPlaceholderViewHolder$imagePlaceholderDelegate$2(this, widgetImagePlaceholderAdapter, container, customActionHandlersStoreFactory)), null, 32, null);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        this.imagePlaceholderDelegate.onDetach();
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BadgeListV2VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.imagePlaceholderDelegate.bind("BadgeListV2Widget", info.c().c());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull BadgeListV2VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, item.getTokenizedEvent());
    }
}
