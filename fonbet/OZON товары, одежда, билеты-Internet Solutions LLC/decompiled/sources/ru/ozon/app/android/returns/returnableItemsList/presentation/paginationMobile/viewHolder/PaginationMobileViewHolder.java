package ru.ozon.app.android.returns.returnableItemsList.presentation.paginationMobile.viewHolder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.delivery.customActionsHandlers.OneTimePostRefreshHandler;
import ru.ozon.app.android.returns.returnableItemsList.presentation.paginationMobile.viewMapper.PaginationMobileView;
import ru.ozon.app.android.returns.returnableItemsList.presentation.paginationMobile.viewObject.PaginationMobileVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/presentation/paginationMobile/viewHolder/PaginationMobileViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/returnableItemsList/presentation/paginationMobile/viewObject/PaginationMobileVO;", "Lru/ozon/app/android/returns/returnableItemsList/presentation/paginationMobile/viewMapper/PaginationMobileView;", "paginationMobileView", "Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "oneTimePostRefreshHandler", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/returns/returnableItemsList/presentation/paginationMobile/viewMapper/PaginationMobileView;Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/returns/returnableItemsList/presentation/paginationMobile/viewObject/PaginationMobileVO;Ll20/d;)V", "Lru/ozon/app/android/returns/returnableItemsList/presentation/paginationMobile/viewMapper/PaginationMobileView;", "Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaginationMobileViewHolder extends k<PaginationMobileVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final OneTimePostRefreshHandler oneTimePostRefreshHandler;

    @NotNull
    private final PaginationMobileView paginationMobileView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaginationMobileViewHolder(@NotNull PaginationMobileView paginationMobileView, @NotNull OneTimePostRefreshHandler oneTimePostRefreshHandler, @NotNull ComposerReferences refs) {
        super(paginationMobileView);
        Intrinsics.checkNotNullParameter(paginationMobileView, "paginationMobileView");
        Intrinsics.checkNotNullParameter(oneTimePostRefreshHandler, "oneTimePostRefreshHandler");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.paginationMobileView = paginationMobileView;
        this.oneTimePostRefreshHandler = oneTimePostRefreshHandler;
        this.actionHandler = new ActionHandler.Builder(refs, this).onPreProcess(new PaginationMobileViewHolder$actionHandler$1(oneTimePostRefreshHandler)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PaginationMobileVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        PaginationMobileView paginationMobileView = this.paginationMobileView;
        WrappedButtonHolderKt.bindOrGone(paginationMobileView.getPreviousPageSbv(), item.getPrevious(), this.actionHandler);
        WrappedButtonHolderKt.bindOrGone(paginationMobileView.getNextPageSbv(), item.getNext(), this.actionHandler);
    }
}
