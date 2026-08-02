package ru.ozon.app.android.travel.molecules.view.stepListWithScaleMolecule.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.stepListWithScaleMolecule.StepListWithScaleMoleculeVO;
import ru.ozon.app.android.travel.ui.molecules.R$id;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/stepListWithScaleMolecule/adapter/StepListWithScaleMoleculeAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/travel/molecules/view/stepListWithScaleMolecule/StepListWithScaleMoleculeVO$StepVO;", "Lru/ozon/app/android/travel/molecules/view/stepListWithScaleMolecule/adapter/StepWithScaleItemViewHolder;", "<init>", "()V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/molecules/view/stepListWithScaleMolecule/adapter/StepWithScaleItemViewHolder;", "holder", "", "onBindViewHolder", "(Lru/ozon/app/android/travel/molecules/view/stepListWithScaleMolecule/adapter/StepWithScaleItemViewHolder;I)V", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StepListWithScaleMoleculeAdapter extends t<StepListWithScaleMoleculeVO.StepVO, StepWithScaleItemViewHolder> {
    public StepListWithScaleMoleculeAdapter() {
        super(new i.d<StepListWithScaleMoleculeVO.StepVO>() { // from class: ru.ozon.app.android.travel.molecules.view.stepListWithScaleMolecule.adapter.StepListWithScaleMoleculeAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(StepListWithScaleMoleculeVO.StepVO oldItem, StepListWithScaleMoleculeVO.StepVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(StepListWithScaleMoleculeVO.StepVO oldItem, StepListWithScaleMoleculeVO.StepVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return R$id.stepWithScaleItemViewType;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull StepWithScaleItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        StepListWithScaleMoleculeVO.StepVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public StepWithScaleItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        StepWithScaleItemView stepWithScaleItemView = new StepWithScaleItemView(context, null, 0, 0, 14, null);
        stepWithScaleItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new StepWithScaleItemViewHolder(stepWithScaleItemView);
    }
}
