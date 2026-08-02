package ru.ozon.app.android.fresh.unsorted.widgets.bottomContainer.presentation;

import android.view.View;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.placeholdersUtils.SinglePlaceholderController;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomContainer.domain.BottomContainerVO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/bottomContainer/presentation/BottomContainerViewHolder;", "Ld20/a;", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomContainer/domain/BottomContainerVO;", "Ll10/i;", "container", "Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/SinglePlaceholderController;", "placeholderController", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/SinglePlaceholderController;Ld20/e;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/bottomContainer/domain/BottomContainerVO;)V", "onWidgetDestroyed", "Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/SinglePlaceholderController;", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomContainer/presentation/BottomContainerView;", "getContainerView", "()Lru/ozon/app/android/fresh/unsorted/widgets/bottomContainer/presentation/BottomContainerView;", "containerView", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BottomContainerViewHolder extends AbstractC6064a<BottomContainerVO> {

    @NotNull
    private final SinglePlaceholderController placeholderController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomContainerViewHolder(@NotNull i container, @NotNull SinglePlaceholderController placeholderController, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(placeholderController, "placeholderController");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.placeholderController = placeholderController;
    }

    private final BottomContainerView getContainerView() {
        View view = getView();
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.fresh.unsorted.widgets.bottomContainer.presentation.BottomContainerView");
        return (BottomContainerView) view;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        this.placeholderController.setContainer(getContainerView());
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        this.placeholderController.detachNestedViewHolders();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull BottomContainerVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.placeholderController.handleNestedWidgets(getViewItem());
        getContainerView().setupBackground(item.getBorderColor(), item.getBackgroundColor());
    }
}
