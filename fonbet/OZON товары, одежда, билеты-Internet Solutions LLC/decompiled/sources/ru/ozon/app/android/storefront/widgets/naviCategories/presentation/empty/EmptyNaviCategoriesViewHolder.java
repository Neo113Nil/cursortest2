package ru.ozon.app.android.storefront.widgets.naviCategories.presentation.empty;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.naviCategories.presentation.PaddingsVO;
import ru.ozon.app.android.storefront.widgets.naviCategories.presentation.RoundedBackgroundDelegate;
import ru.ozon.app.android.storefront.widgets.naviCategories.presentation.RoundedCornerVO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00022\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0015\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/empty/EmptyNaviCategoriesViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/empty/EmptyNaviCategoriesVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/empty/EmptyNaviCategoriesVO;Ll20/d;)V", "", "Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/RoundedCornerVO;", "roundedCorners", "Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/PaddingsVO;", "paddingsVO", "bindOuterBackground", "(Ljava/util/List;Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/PaddingsVO;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EmptyNaviCategoriesViewHolder extends k<EmptyNaviCategoriesVO> {
    private final /* synthetic */ RoundedBackgroundDelegate $$delegate_0;

    @NotNull
    private final View containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyNaviCategoriesViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.$$delegate_0 = new RoundedBackgroundDelegate(containerView);
        this.containerView = containerView;
    }

    public void bindOuterBackground(@NotNull List<? extends RoundedCornerVO> roundedCorners, @NotNull PaddingsVO paddingsVO) {
        Intrinsics.checkNotNullParameter(roundedCorners, "roundedCorners");
        Intrinsics.checkNotNullParameter(paddingsVO, "paddingsVO");
        this.$$delegate_0.bindOuterBackground(roundedCorners, paddingsVO);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull EmptyNaviCategoriesVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bindOuterBackground(item.getRoundedCorners(), item.getPaddings());
    }
}
