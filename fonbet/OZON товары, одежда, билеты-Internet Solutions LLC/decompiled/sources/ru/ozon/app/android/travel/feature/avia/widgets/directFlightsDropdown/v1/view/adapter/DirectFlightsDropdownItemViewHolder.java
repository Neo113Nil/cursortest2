package ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view.adapter;

import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation.DirectFlightsDropdownVO;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view.DirectFlightsDropdownItemView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/view/adapter/DirectFlightsDropdownItemViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/view/DirectFlightsDropdownItemView;", "view", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/view/DirectFlightsDropdownItemView;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$ItemVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$ItemVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/view/DirectFlightsDropdownItemView;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DirectFlightsDropdownItemViewHolder extends j {

    @NotNull
    private final DirectFlightsDropdownItemView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectFlightsDropdownItemViewHolder(@NotNull DirectFlightsDropdownItemView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    public final void bind(@NotNull DirectFlightsDropdownVO.ItemVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.view.bind(item, actionHandler);
    }
}
