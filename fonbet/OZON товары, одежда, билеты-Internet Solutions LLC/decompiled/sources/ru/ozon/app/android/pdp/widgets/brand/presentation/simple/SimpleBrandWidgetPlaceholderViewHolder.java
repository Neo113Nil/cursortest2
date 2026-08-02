package ru.ozon.app.android.pdp.widgets.brand.presentation.simple;

import Sc.InterfaceC4008j;
import WZ.l;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderViewHolderDelegateImpl;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.widgets.brand.presentation.BrandViewHolder;
import ru.ozon.app.android.pdp.widgets.brand.presentation.SimpleBrandVO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/brand/presentation/simple/SimpleBrandWidgetPlaceholderViewHolder;", "Lru/ozon/app/android/pdp/widgets/brand/presentation/BrandViewHolder;", "Lru/ozon/app/android/pdp/widgets/brand/presentation/SimpleBrandVO;", "Landroid/widget/FrameLayout;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "widgetImagePlaceholderAdapter", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroid/widget/FrameLayout;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;LWZ/l;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/pdp/widgets/brand/presentation/SimpleBrandVO;Ll20/d;)V", "onDetach", "()V", "LSc/j;", "mainView", "LSc/j;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderViewHolderDelegateImpl;", "imagePlaceholderDelegate", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderViewHolderDelegateImpl;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SimpleBrandWidgetPlaceholderViewHolder extends BrandViewHolder<SimpleBrandVO> {

    @NotNull
    private final WidgetImagePlaceholderViewHolderDelegateImpl<SimpleBrandVO> imagePlaceholderDelegate;

    @NotNull
    private final InterfaceC4008j<FrameLayout> mainView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleBrandWidgetPlaceholderViewHolder(@NotNull FrameLayout containerView, @NotNull ComposerReferences refs, @NotNull WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter, @NotNull l tokenizedAnalytics) {
        super(containerView, refs);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(widgetImagePlaceholderAdapter, "widgetImagePlaceholderAdapter");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        InterfaceC4008j<FrameLayout> lazyUnsafe = DelegatesKt.lazyUnsafe(new SimpleBrandWidgetPlaceholderViewHolder$mainView$1(this));
        this.mainView = lazyUnsafe;
        this.imagePlaceholderDelegate = new WidgetImagePlaceholderViewHolderDelegateImpl<>(widgetImagePlaceholderAdapter, containerView, new SimpleBrandWidgetPlaceholderViewHolder$imagePlaceholderDelegate$1(this), lazyUnsafe, DelegatesKt.lazyUnsafe(new SimpleBrandWidgetPlaceholderViewHolder$imagePlaceholderDelegate$2(this, refs, widgetImagePlaceholderAdapter, tokenizedAnalytics)), null, 32, null);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        this.imagePlaceholderDelegate.onDetach();
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SimpleBrandVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.imagePlaceholderDelegate.bind("SimpleBrandWidget", info.c().c());
    }
}
