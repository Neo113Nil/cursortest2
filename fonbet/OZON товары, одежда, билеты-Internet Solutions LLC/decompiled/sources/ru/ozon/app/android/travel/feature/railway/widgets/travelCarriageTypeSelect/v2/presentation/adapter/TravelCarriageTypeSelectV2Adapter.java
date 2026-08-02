package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageTypeSelect.v2.presentation.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageTypeSelect.v2.presentation.TravelCarriageTypeSelectV2VO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageTypeSelect.v2.presentation.view.TravelCarriageTypeSelectV2View;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u001f\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0018R$\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/presentation/adapter/TravelCarriageTypeSelectV2Adapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/presentation/TravelCarriageTypeSelectV2VO$CarriageTypeVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/presentation/adapter/TravelCarriageTypeSelectV2ViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/presentation/adapter/TravelCarriageTypeSelectV2ViewHolder;", "holder", "position", "", "", "payloads", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/presentation/adapter/TravelCarriageTypeSelectV2ViewHolder;ILjava/util/List;)V", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/presentation/adapter/TravelCarriageTypeSelectV2ViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "TravelCarriageTypeSelectV2AspectPayload", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCarriageTypeSelectV2Adapter extends t<TravelCarriageTypeSelectV2VO.CarriageTypeVO, TravelCarriageTypeSelectV2ViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/presentation/adapter/TravelCarriageTypeSelectV2Adapter$TravelCarriageTypeSelectV2AspectPayload;", "", "<init>", "()V", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TravelCarriageTypeSelectV2AspectPayload {

        @NotNull
        public static final TravelCarriageTypeSelectV2AspectPayload INSTANCE = new TravelCarriageTypeSelectV2AspectPayload();

        private TravelCarriageTypeSelectV2AspectPayload() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TravelCarriageTypeSelectV2Adapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new i.d<TravelCarriageTypeSelectV2VO.CarriageTypeVO>() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageTypeSelect.v2.presentation.adapter.TravelCarriageTypeSelectV2Adapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(TravelCarriageTypeSelectV2VO.CarriageTypeVO oldItem, TravelCarriageTypeSelectV2VO.CarriageTypeVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(TravelCarriageTypeSelectV2VO.CarriageTypeVO oldItem, TravelCarriageTypeSelectV2VO.CarriageTypeVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }

            @Override // androidx.recyclerview.widget.i.d
            public Object getChangePayload(TravelCarriageTypeSelectV2VO.CarriageTypeVO oldItem, TravelCarriageTypeSelectV2VO.CarriageTypeVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                ArrayList arrayList = new ArrayList();
                if (!Intrinsics.d(oldItem.getName(), newItem.getName()) || oldItem.getId() != newItem.getId() || !Intrinsics.d(oldItem.getSeatsNumber(), newItem.getSeatsNumber()) || Intrinsics.d(oldItem.getAspect(), newItem.getAspect())) {
                    return null;
                }
                arrayList.add(TravelCarriageTypeSelectV2AspectPayload.INSTANCE);
                return arrayList;
            }
        });
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((TravelCarriageTypeSelectV2ViewHolder) c11, i11, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public TravelCarriageTypeSelectV2ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TravelCarriageTypeSelectV2View travelCarriageTypeSelectV2View = new TravelCarriageTypeSelectV2View(context);
        travelCarriageTypeSelectV2View.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return new TravelCarriageTypeSelectV2ViewHolder(travelCarriageTypeSelectV2View, this.actionHandler);
    }

    public void onBindViewHolder(@NotNull TravelCarriageTypeSelectV2ViewHolder holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, position);
        } else {
            holder.bindAspect(getItem(position).getAspect());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull TravelCarriageTypeSelectV2ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TravelCarriageTypeSelectV2VO.CarriageTypeVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }
}
