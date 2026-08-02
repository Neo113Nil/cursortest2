package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.R$id;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.TravelCarriageSelectV3VO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.view.TravelCarriageSelectV3StoreyView;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/adapter/TravelCarriageSelectV3StoreyAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/TravelCarriageSelectV3VO$StoreyVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/adapter/TravelCarriageTypeSelectV3StoreyViewHolder;", "Lkotlin/Function0;", "", "onStoreyItemClick", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/adapter/TravelCarriageTypeSelectV3StoreyViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageSelect/v3/presentation/adapter/TravelCarriageTypeSelectV3StoreyViewHolder;I)V", "getItemViewType", "(I)I", "Lkotlin/jvm/functions/Function0;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCarriageSelectV3StoreyAdapter extends t<TravelCarriageSelectV3VO.StoreyVO, TravelCarriageTypeSelectV3StoreyViewHolder> {

    @NotNull
    private final Function0<Unit> onStoreyItemClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelCarriageSelectV3StoreyAdapter(@NotNull Function0<Unit> onStoreyItemClick) {
        super(new i.d<TravelCarriageSelectV3VO.StoreyVO>() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageSelect.v3.presentation.adapter.TravelCarriageSelectV3StoreyAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(TravelCarriageSelectV3VO.StoreyVO oldItem, TravelCarriageSelectV3VO.StoreyVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(TravelCarriageSelectV3VO.StoreyVO oldItem, TravelCarriageSelectV3VO.StoreyVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
        Intrinsics.checkNotNullParameter(onStoreyItemClick, "onStoreyItemClick");
        this.onStoreyItemClick = onStoreyItemClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return R$id.travelCarriageSelectV3StoreyView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull TravelCarriageTypeSelectV3StoreyViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TravelCarriageSelectV3VO.StoreyVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, this.onStoreyItemClick);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public TravelCarriageTypeSelectV3StoreyViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TravelCarriageSelectV3StoreyView travelCarriageSelectV3StoreyView = new TravelCarriageSelectV3StoreyView(context);
        travelCarriageSelectV3StoreyView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new TravelCarriageTypeSelectV3StoreyViewHolder(travelCarriageSelectV3StoreyView);
    }
}
