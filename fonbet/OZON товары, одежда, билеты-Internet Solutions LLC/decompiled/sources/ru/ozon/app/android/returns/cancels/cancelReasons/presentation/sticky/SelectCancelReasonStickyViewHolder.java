package ru.ozon.app.android.returns.cancels.cancelReasons.presentation.sticky;

import Vg.d;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.returns.cancels.cancelReasons.presentation.common.SelectCancelReasonCommentProvider;
import ru.ozon.app.android.returns.cancels.cancelReasons.presentation.extensions.AtomActionExtKt;
import ru.ozon.app.android.returns.cancels.cancelReasons.presentation.models.SelectCancelReasonVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00130\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/sticky/SelectCancelReasonStickyViewHolder;", "Ld20/a;", "Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/models/SelectCancelReasonVO$StickyVO;", "Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/sticky/SelectCancelReasonStickyView;", "stickyView", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/common/SelectCancelReasonCommentProvider;", "commentProvider", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/sticky/SelectCancelReasonStickyView;Ll10/i;LVg/d;Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/common/SelectCancelReasonCommentProvider;Ld20/e;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "addStateAndCallAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "item", "bind", "(Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/models/SelectCancelReasonVO$StickyVO;)V", "Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/sticky/SelectCancelReasonStickyView;", "Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/common/SelectCancelReasonCommentProvider;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SelectCancelReasonStickyViewHolder extends AbstractC6064a<SelectCancelReasonVO.StickyVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final SelectCancelReasonCommentProvider commentProvider;

    @NotNull
    private final SelectCancelReasonStickyView stickyView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectCancelReasonStickyViewHolder(@NotNull SelectCancelReasonStickyView stickyView, @NotNull i container, @NotNull d customActionHandlersStoreFactory, @NotNull SelectCancelReasonCommentProvider commentProvider, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(stickyView, "stickyView");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(commentProvider, "commentProvider");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.stickyView = stickyView;
        this.commentProvider = commentProvider;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new SelectCancelReasonStickyViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void addStateAndCallAction(AtomAction action) {
        SelectCancelReasonVO.StickyVO stickyVO = (SelectCancelReasonVO.StickyVO) getBoundData();
        if (stickyVO == null) {
            return;
        }
        this.actionHandler.invoke(AtomActionExtKt.addState(action, stickyVO, this.commentProvider.getGetComment().invoke()));
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull SelectCancelReasonVO.StickyVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        SelectCancelReasonStickyView selectCancelReasonStickyView = this.stickyView;
        CellHolderKt.bindOrGone(selectCancelReasonStickyView.getCellView(), item.getCell(), new SelectCancelReasonStickyViewHolder$bind$1$1(this));
        ButtonV3HolderKt.bind(selectCancelReasonStickyView.getButtonView(), item.getButton(), this.actionHandler);
        TextHolderKt.bindOrGone$default(selectCancelReasonStickyView.getCaptionView(), item.getCaption(), null, 2, null);
    }
}
