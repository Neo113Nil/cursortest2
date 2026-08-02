package ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.async;

import android.view.View;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.SellerActionsPreviewVO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/async/SellerActionsPreviewAsyncViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$Async;", "Landroid/view/View;", "view", "Ll10/b;", "controller", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/async/SellerActionsPreviewAsyncViewModel;", "sellerActionsPreviewAsyncViewModel", "<init>", "(Landroid/view/View;Ll10/b;Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/async/SellerActionsPreviewAsyncViewModel;)V", "Landroidx/lifecycle/J;", "lifecycle", "", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$Async;Ll20/d;)V", "Ll10/b;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/async/SellerActionsPreviewAsyncViewModel;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerActionsPreviewAsyncViewHolder extends k<SellerActionsPreviewVO.Async> {

    @NotNull
    private final InterfaceC7851b controller;

    @NotNull
    private final SellerActionsPreviewAsyncViewModel sellerActionsPreviewAsyncViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerActionsPreviewAsyncViewHolder(@NotNull View view, @NotNull InterfaceC7851b controller, @NotNull SellerActionsPreviewAsyncViewModel sellerActionsPreviewAsyncViewModel) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(sellerActionsPreviewAsyncViewModel, "sellerActionsPreviewAsyncViewModel");
        this.controller = controller;
        this.sellerActionsPreviewAsyncViewModel = sellerActionsPreviewAsyncViewModel;
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.sellerActionsPreviewAsyncViewModel.getWidgetState().observe(lifecycle, new SellerActionsPreviewAsyncViewHolder$sam$androidx_lifecycle_Observer$0(new SellerActionsPreviewAsyncViewHolder$onAttachViewModel$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SellerActionsPreviewVO.Async item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.sellerActionsPreviewAsyncViewModel.setData(item.getAsyncData(), item.getId());
    }
}
