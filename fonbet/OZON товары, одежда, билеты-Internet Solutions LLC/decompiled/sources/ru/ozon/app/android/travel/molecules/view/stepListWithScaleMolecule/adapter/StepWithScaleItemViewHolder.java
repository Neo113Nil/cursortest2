package ru.ozon.app.android.travel.molecules.view.stepListWithScaleMolecule.adapter;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.stepListWithScaleMolecule.StepListWithScaleMoleculeVO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/stepListWithScaleMolecule/adapter/StepWithScaleItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/travel/molecules/view/stepListWithScaleMolecule/adapter/StepWithScaleItemView;", "view", "<init>", "(Lru/ozon/app/android/travel/molecules/view/stepListWithScaleMolecule/adapter/StepWithScaleItemView;)V", "Lru/ozon/app/android/travel/molecules/view/stepListWithScaleMolecule/StepListWithScaleMoleculeVO$StepVO;", "item", "", "bind", "(Lru/ozon/app/android/travel/molecules/view/stepListWithScaleMolecule/StepListWithScaleMoleculeVO$StepVO;)V", "Lru/ozon/app/android/travel/molecules/view/stepListWithScaleMolecule/adapter/StepWithScaleItemView;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StepWithScaleItemViewHolder extends RecyclerView.C {

    @NotNull
    private final StepWithScaleItemView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepWithScaleItemViewHolder(@NotNull StepWithScaleItemView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    public final void bind(@NotNull StepListWithScaleMoleculeVO.StepVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.view.bind(item);
    }
}
