package ru.ozon.app.android.marketing.widgets.ladderActions.presentation;

import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.ladderActions.presentation.LadderActionsVO;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionCellViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderCellView;", "containerView", "<init>", "(Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderCellView;)V", "Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsVO$LadderActionsCellVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderActionsVO$LadderActionsCellVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderCellView;", "getContainerView", "()Lru/ozon/app/android/marketing/widgets/ladderActions/presentation/LadderCellView;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LadderActionCellViewHolder extends j {
    public static final int $stable;

    @NotNull
    private final LadderCellView containerView;

    static {
        int i11 = ButtonV3View.$stable;
        int i12 = PriceAtomView.$stable;
        $stable = i11 | i12 | i12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LadderActionCellViewHolder(@NotNull LadderCellView containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
    }

    public final void bind(@NotNull LadderActionsVO.LadderActionsCellVO item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.containerView.bind(item, onAction);
    }
}
