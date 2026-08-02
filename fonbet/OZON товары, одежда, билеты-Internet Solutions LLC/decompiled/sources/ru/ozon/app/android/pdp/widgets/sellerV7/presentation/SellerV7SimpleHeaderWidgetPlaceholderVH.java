package ru.ozon.app.android.pdp.widgets.sellerV7.presentation;

import Sc.InterfaceC4008j;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.seller.SellerV7VO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderViewHolderDelegateImpl;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerV7/presentation/SellerV7SimpleHeaderWidgetPlaceholderVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO;", "Landroid/widget/FrameLayout;", "view", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "widgetImagePlaceholderAdapter", "<init>", "(Landroid/widget/FrameLayout;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO;Ll20/d;)V", "onDetach", "()V", "Landroid/widget/FrameLayout;", "LSc/j;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "mainView", "LSc/j;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderViewHolderDelegateImpl;", "imagePlaceholderDelegate", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderViewHolderDelegateImpl;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SellerV7SimpleHeaderWidgetPlaceholderVH extends k<SellerV7VO> {

    @NotNull
    private final WidgetImagePlaceholderViewHolderDelegateImpl<SellerV7VO> imagePlaceholderDelegate;

    @NotNull
    private final InterfaceC4008j<TextAtomV2View> mainView;

    @NotNull
    private final FrameLayout view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerV7SimpleHeaderWidgetPlaceholderVH(@NotNull FrameLayout view, @NotNull WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(widgetImagePlaceholderAdapter, "widgetImagePlaceholderAdapter");
        this.view = view;
        InterfaceC4008j<TextAtomV2View> lazyUnsafe = DelegatesKt.lazyUnsafe(new SellerV7SimpleHeaderWidgetPlaceholderVH$mainView$1(this));
        this.mainView = lazyUnsafe;
        this.imagePlaceholderDelegate = new WidgetImagePlaceholderViewHolderDelegateImpl<>(widgetImagePlaceholderAdapter, view, new SellerV7SimpleHeaderWidgetPlaceholderVH$imagePlaceholderDelegate$2(this), lazyUnsafe, DelegatesKt.lazyUnsafe(new SellerV7SimpleHeaderWidgetPlaceholderVH$imagePlaceholderDelegate$1(this, widgetImagePlaceholderAdapter)), null, 32, null);
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
        this.imagePlaceholderDelegate.bind("SellerV7SimpleHeaderCellWidget", info.c().c());
    }
}
