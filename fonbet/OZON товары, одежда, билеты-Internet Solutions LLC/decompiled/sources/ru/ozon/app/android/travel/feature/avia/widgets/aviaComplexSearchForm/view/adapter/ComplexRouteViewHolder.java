package ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.view.adapter;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.presentation.AviaComplexSearchFormVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.view.ComplexRouteItemView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/view/adapter/ComplexRouteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/view/ComplexRouteItemView;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lkotlin/Function2;", "", "", "onSwipedListener", "getIsDemoAnimationRequired", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/view/ComplexRouteItemView;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Flight;", "item", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Flight;)V", "hideDeleteButton", "()V", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/view/ComplexRouteItemView;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "swipeListener", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ComplexRouteViewHolder extends RecyclerView.C {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Function1<Boolean, Boolean> getIsDemoAnimationRequired;

    @NotNull
    private final Function2<Boolean, Integer, Unit> onSwipedListener;

    @NotNull
    private final Function1<Boolean, Unit> swipeListener;

    @NotNull
    private final ComplexRouteItemView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ComplexRouteViewHolder(@NotNull ComplexRouteItemView view, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function2<? super Boolean, ? super Integer, Unit> onSwipedListener, @NotNull Function1<? super Boolean, Boolean> getIsDemoAnimationRequired) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onSwipedListener, "onSwipedListener");
        Intrinsics.checkNotNullParameter(getIsDemoAnimationRequired, "getIsDemoAnimationRequired");
        this.view = view;
        this.actionHandler = actionHandler;
        this.onSwipedListener = onSwipedListener;
        this.getIsDemoAnimationRequired = getIsDemoAnimationRequired;
        this.swipeListener = new ComplexRouteViewHolder$swipeListener$1(this);
    }

    public final void bind(@NotNull AviaComplexSearchFormVO.Flight item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.view.bind(item, this.actionHandler, this.swipeListener, this.getIsDemoAnimationRequired);
    }

    public final void hideDeleteButton() {
        this.view.hideDeleteButton();
    }
}
