package ru.ozon.app.android.pdp.widgets.sellerV7.presentation;

import Sc.InterfaceC4008j;
import W10.c;
import WZ.l;
import android.annotation.SuppressLint;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.pdp.seller.SellerV7VO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderViewHolderDelegateImpl;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.cell.CellView;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerV7/presentation/SellerV7SimpleCellWidgetPlaceholderVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO;", "Landroid/widget/FrameLayout;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "widgetImagePlaceholderAdapter", "<init>", "(Landroid/widget/FrameLayout;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;)V", "item", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "", "trackView", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO;Ll20/d;)V", "onDetach", "()V", "Landroid/widget/FrameLayout;", "LWZ/l;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "LSc/j;", "Lru/ozon/uni/android/cell/CellView;", "mainView", "LSc/j;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderViewHolderDelegateImpl;", "imagePlaceholderDelegate", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderViewHolderDelegateImpl;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes13.dex */
public final class SellerV7SimpleCellWidgetPlaceholderVH extends k<SellerV7VO> {

    @NotNull
    private final WidgetImagePlaceholderViewHolderDelegateImpl<SellerV7VO> imagePlaceholderDelegate;

    @NotNull
    private final InterfaceC4008j<CellView> mainView;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final FrameLayout view;

    @NotNull
    private final WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerV7SimpleCellWidgetPlaceholderVH(@NotNull FrameLayout view, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(widgetImagePlaceholderAdapter, "widgetImagePlaceholderAdapter");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.widgetImagePlaceholderAdapter = widgetImagePlaceholderAdapter;
        InterfaceC4008j<CellView> lazyUnsafe = DelegatesKt.lazyUnsafe(new SellerV7SimpleCellWidgetPlaceholderVH$mainView$1(this));
        this.mainView = lazyUnsafe;
        this.imagePlaceholderDelegate = new WidgetImagePlaceholderViewHolderDelegateImpl<>(widgetImagePlaceholderAdapter, view, new SellerV7SimpleCellWidgetPlaceholderVH$imagePlaceholderDelegate$2(this), lazyUnsafe, DelegatesKt.lazyUnsafe(new SellerV7SimpleCellWidgetPlaceholderVH$imagePlaceholderDelegate$1(this, refs)), new SellerV7SimpleCellWidgetPlaceholderVH$imagePlaceholderDelegate$3(this));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        this.imagePlaceholderDelegate.onDetach();
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SellerV7VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.imagePlaceholderDelegate.bind("SellerV7SimpleCellWidget", info.c().c());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SellerV7VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, item.getTokenizedEvent());
    }
}
