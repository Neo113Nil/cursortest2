package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.adapter.luggage;

import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.AviaDetailedInfoV3VO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.view.AviaDetailedInfoV3LuggageView;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001B\u0013\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/adapter/luggage/AviaDetailedInfoV3LuggageAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$LuggageContentItemsVO$LuggageItemVO;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(LWZ/l;)V", "", "position", "getItemViewType", "(I)I", "holder", "", "onBindViewHolder", "(Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "LWZ/l;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaDetailedInfoV3LuggageAdapter extends t<AviaDetailedInfoV3VO.LuggageContentItemsVO.LuggageItemVO, BaseViewHolder<? super AviaDetailedInfoV3VO.LuggageContentItemsVO.LuggageItemVO>> {

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaDetailedInfoV3LuggageAdapter(@NotNull l tokenizedAnalytics) {
        super(new i.d<AviaDetailedInfoV3VO.LuggageContentItemsVO.LuggageItemVO>() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.adapter.luggage.AviaDetailedInfoV3LuggageAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(AviaDetailedInfoV3VO.LuggageContentItemsVO.LuggageItemVO oldItem, AviaDetailedInfoV3VO.LuggageContentItemsVO.LuggageItemVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(AviaDetailedInfoV3VO.LuggageContentItemsVO.LuggageItemVO oldItem, AviaDetailedInfoV3VO.LuggageContentItemsVO.LuggageItemVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return R$id.aviaDetailedInfoV3LuggageItemViewType;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BaseViewHolder<? super AviaDetailedInfoV3VO.LuggageContentItemsVO.LuggageItemVO> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AviaDetailedInfoV3VO.LuggageContentItemsVO.LuggageItemVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, K.f71697a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BaseViewHolder<AviaDetailedInfoV3VO.LuggageContentItemsVO.LuggageItemVO> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AviaDetailedInfoV3LuggageView aviaDetailedInfoV3LuggageView = new AviaDetailedInfoV3LuggageView(context, null, 0, 6, null);
        aviaDetailedInfoV3LuggageView.setLayoutParams(new RecyclerView.p(-1, -1));
        return new AviaDetailedInfoV3LuggageItemViewHolder(aviaDetailedInfoV3LuggageView, this.tokenizedAnalytics);
    }
}
