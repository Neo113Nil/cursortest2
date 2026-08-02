package ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import fd.InterfaceC6511n;
import java.util.List;
import java.util.Map;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation.UnpaidOrderListVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation.view.UnpaidOrderListView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001Bi\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012.\u0010\f\u001a*\u0012\u0004\u0012\u00020\u0007\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000b0\u0006\u0012(\u0010\u000e\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001eR<\u0010\f\u001a*\u0012\u0004\u0012\u00020\u0007\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001fR6\u0010\u000e\u001a$\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/adapter/UnpaidOrderListAdapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO$OrderVO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/adapter/UnpaidOrderListItemViewHolder;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function3;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "", "cardClickCallback", "Lkotlin/Function2;", "trackView", "<init>", "(Landroidx/lifecycle/J;Lfd/n;Lkotlin/jvm/functions/Function2;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/adapter/UnpaidOrderListItemViewHolder;", "holder", "position", "", "", "payloads", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/adapter/UnpaidOrderListItemViewHolder;ILjava/util/List;)V", "(Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/adapter/UnpaidOrderListItemViewHolder;I)V", "Lfd/n;", "Lkotlin/jvm/functions/Function2;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UnpaidOrderListAdapter extends i<UnpaidOrderListVO.OrderVO, UnpaidOrderListItemViewHolder> {

    @NotNull
    private final InterfaceC6511n<AtomAction, Map<String, TokenizedTrackingInfo>, String, Unit> cardClickCallback;

    @NotNull
    private final Function2<Map<String, TokenizedTrackingInfo>, String, Unit> trackView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnpaidOrderListAdapter(@NotNull J lifecycleOwner, @NotNull InterfaceC6511n<? super AtomAction, ? super Map<String, TokenizedTrackingInfo>, ? super String, Unit> cardClickCallback, @NotNull Function2<? super Map<String, TokenizedTrackingInfo>, ? super String, Unit> trackView) {
        super(new i.d<UnpaidOrderListVO.OrderVO>() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation.adapter.UnpaidOrderListAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(UnpaidOrderListVO.OrderVO oldItem, UnpaidOrderListVO.OrderVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(UnpaidOrderListVO.OrderVO oldItem, UnpaidOrderListVO.OrderVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }

            @Override // androidx.recyclerview.widget.i.d
            public String getChangePayload(UnpaidOrderListVO.OrderVO oldItem, UnpaidOrderListVO.OrderVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                if (Intrinsics.d(UnpaidOrderListVO.OrderVO.copy$default(oldItem, 0L, false, newItem.getBadge(), newItem.getFormattedRemainTime(), 0L, 0L, null, null, null, null, null, null, null, null, null, null, 65523, null), newItem)) {
                    return "bind_only_badge";
                }
                return null;
            }
        }, lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cardClickCallback, "cardClickCallback");
        Intrinsics.checkNotNullParameter(trackView, "trackView");
        this.cardClickCallback = cardClickCallback;
        this.trackView = trackView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((UnpaidOrderListItemViewHolder) c11, i11, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public UnpaidOrderListItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        UnpaidOrderListView unpaidOrderListView = new UnpaidOrderListView(context, null, 0, 6, null);
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        unpaidOrderListView.setLayoutParams(new ViewGroup.LayoutParams(ResourceExtKt.toPx(320, context2), -2));
        return new UnpaidOrderListItemViewHolder(unpaidOrderListView, this.cardClickCallback, this.trackView);
    }

    public void onBindViewHolder(@NotNull UnpaidOrderListItemViewHolder holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        UnpaidOrderListVO.OrderVO item = getItem(position);
        Intrinsics.f(item);
        holder.bind(item, payloads.contains("bind_only_badge"));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull UnpaidOrderListItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        UnpaidOrderListVO.OrderVO item = getItem(position);
        Intrinsics.f(item);
        UnpaidOrderListItemViewHolder.bind$default(holder, item, false, 2, null);
    }
}
