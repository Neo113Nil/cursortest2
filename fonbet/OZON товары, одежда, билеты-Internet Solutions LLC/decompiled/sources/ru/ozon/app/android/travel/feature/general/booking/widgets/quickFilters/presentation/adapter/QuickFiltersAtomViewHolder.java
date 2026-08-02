package ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.adapter;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.wrappers.main.chip.ChipWrapper;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/adapter/QuickFiltersAtomViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "atomView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onItemClickListener", "<init>", "(Lru/ozon/uni/atoms/v3/containers/SingleAtom;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/AtomDTO;", "item", "bind", "(Lru/ozon/uni/atoms/data/AtomDTO;)V", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "Lkotlin/jvm/functions/Function1;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuickFiltersAtomViewHolder extends RecyclerView.C {

    @NotNull
    private final SingleAtom atomView;

    @NotNull
    private final Function1<AtomAction, Unit> onItemClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QuickFiltersAtomViewHolder(@NotNull SingleAtom atomView, @NotNull Function1<? super AtomAction, Unit> onItemClickListener) {
        super(atomView);
        Intrinsics.checkNotNullParameter(atomView, "atomView");
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        this.atomView = atomView;
        this.onItemClickListener = onItemClickListener;
        atomView.setOnAction(onItemClickListener);
    }

    public final void bind(@NotNull AtomDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        SingleAtom.bind$default(this.atomView, item, false, 2, null);
        View childAt = this.atomView.getChildAt(0);
        if (childAt instanceof ChipWrapper) {
            QuickFiltersAtomViewHolder$bind$listener$1 quickFiltersAtomViewHolder$bind$listener$1 = new QuickFiltersAtomViewHolder$bind$listener$1(item, this);
            ChipWrapper chipWrapper = (ChipWrapper) childAt;
            chipWrapper.setOnSelect(quickFiltersAtomViewHolder$bind$listener$1);
            chipWrapper.setOnUnselect(quickFiltersAtomViewHolder$bind$listener$1);
        }
    }
}
