package ru.ozon.app.android.returns.creation.widgets.orders.presentation.pagination.viewHolder;

import Vg.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.returns.creation.databinding.ReturnCreationPaginationBinding;
import ru.ozon.app.android.returns.creation.widgets.orders.presentation.pagination.viewObject.PaginationVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00110\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/orders/presentation/pagination/viewHolder/PaginationViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/creation/widgets/orders/presentation/pagination/viewObject/PaginationVO;", "Lru/ozon/app/android/returns/creation/databinding/ReturnCreationPaginationBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/returns/creation/databinding/ReturnCreationPaginationBinding;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/returns/creation/widgets/orders/presentation/pagination/viewObject/PaginationVO;Ll20/d;)V", "Lru/ozon/app/android/returns/creation/databinding/ReturnCreationPaginationBinding;", "LVg/d;", "Lru/ozon/app/android/returns/creation/widgets/orders/presentation/pagination/viewHolder/PaginationComposerActionWithActionHandler;", "paginationActionHandler", "Lru/ozon/app/android/returns/creation/widgets/orders/presentation/pagination/viewHolder/PaginationComposerActionWithActionHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaginationViewHolder extends k<PaginationVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ReturnCreationPaginationBinding binding;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final PaginationComposerActionWithActionHandler paginationActionHandler;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PaginationViewHolder(@NotNull ReturnCreationPaginationBinding binding, @NotNull ComposerReferences refs, @NotNull d customActionHandlersStoreFactory, @NotNull ActionV2Repository actionV2Repository) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        PaginationComposerActionWithActionHandler paginationComposerActionWithActionHandler = new PaginationComposerActionWithActionHandler(actionV2Repository, refs);
        this.paginationActionHandler = paginationComposerActionWithActionHandler;
        this.actionHandler = new ActionHandler.Builder(refs, this).onComposerAction(new PaginationViewHolder$actionHandler$1(paginationComposerActionWithActionHandler)).customActionHandlers(new PaginationViewHolder$actionHandler$2(this)).buildHandler();
        binding.getConstraintLayout().setBackgroundColor(AppTokensProvider.INSTANCE.isSelect(getContext()) ? 0 : ThemeExtKt.themeColor(getContext(), R$attr.layerFloor0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PaginationVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.paginationActionHandler.setScrollKey(item.getScrollKey());
        ReturnCreationPaginationBinding returnCreationPaginationBinding = this.binding;
        ButtonV3View previousPageSbv = returnCreationPaginationBinding.previousPageSbv;
        Intrinsics.checkNotNullExpressionValue(previousPageSbv, "previousPageSbv");
        ButtonV3HolderKt.bind(previousPageSbv, item.getPrevious(), this.actionHandler);
        ButtonV3View nextPageSbv = returnCreationPaginationBinding.nextPageSbv;
        Intrinsics.checkNotNullExpressionValue(nextPageSbv, "nextPageSbv");
        ButtonV3HolderKt.bind(nextPageSbv, item.getNext(), this.actionHandler);
    }
}
