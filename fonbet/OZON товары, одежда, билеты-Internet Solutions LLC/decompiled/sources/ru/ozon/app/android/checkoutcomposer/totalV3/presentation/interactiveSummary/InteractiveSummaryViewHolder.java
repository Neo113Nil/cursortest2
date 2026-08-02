package ru.ozon.app.android.checkoutcomposer.totalV3.presentation.interactiveSummary;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.totalV3.presentation.TotalV3VO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/interactiveSummary/InteractiveSummaryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/interactiveSummary/InteractiveSummaryView;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/interactiveSummary/InteractiveSummaryView;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO$InteractiveSummaryVO;", "item", "bind", "(Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO$InteractiveSummaryVO;)V", "Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/interactiveSummary/InteractiveSummaryView;", "Lkotlin/jvm/functions/Function1;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InteractiveSummaryViewHolder extends RecyclerView.C {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final InteractiveSummaryView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InteractiveSummaryViewHolder(@NotNull InteractiveSummaryView view, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.view = view;
        this.actionHandler = actionHandler;
    }

    public final void bind(@NotNull TotalV3VO.InteractiveSummaryVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.view.bind(item, this.actionHandler);
    }
}
