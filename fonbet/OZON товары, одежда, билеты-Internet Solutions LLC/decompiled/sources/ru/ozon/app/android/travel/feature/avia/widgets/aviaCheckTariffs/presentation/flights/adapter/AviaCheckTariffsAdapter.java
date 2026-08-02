package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.adapter;

import Sc.o;
import Tc.b;
import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.List;
import jk0.i;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.AviaCheckTariffsVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.view.AviaCheckTariffsSkeleton;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.view.AviaCheckTariffsView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\n\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BK\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J-\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0016¢\u0006\u0004\b \u0010%J\u001f\u0010)\u001a\u00020\u00032\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00101R&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00102R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00103R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00104R\u0016\u00105\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/adapter/AviaCheckTariffsAdapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem;", "Ljk0/j;", "Landroidx/lifecycle/J;", "lifecycleOwner", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "", "onItemClick", "Lkotlin/Function0;", "onExpand", "Landroidx/recyclerview/widget/RecyclerView$u;", "pool", "<init>", "(Landroidx/lifecycle/J;LWZ/l;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/recyclerview/widget/RecyclerView$u;)V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/view/AviaCheckTariffsView;", "getAviaCheckTariffsView", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/view/AviaCheckTariffsView;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/view/AviaCheckTariffsSkeleton;", "getAviaCheckTariffsSkeleton", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/view/AviaCheckTariffsSkeleton;", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Ljk0/j;I)V", "", "", "payloads", "(Ljk0/j;ILjava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Ljk0/j;", "onViewAttachedToWindow", "(Ljk0/j;)V", "", "id", "setWidgetId", "(J)V", "LWZ/l;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function0;", "Landroidx/recyclerview/widget/RecyclerView$u;", "widgetId", "J", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaCheckTariffsAdapter extends i<AviaCheckTariffsVO.TariffItem, j> {

    @NotNull
    private final Function0<Unit> onExpand;

    @NotNull
    private final Function2<AtomAction, Integer, Unit> onItemClick;

    @NotNull
    private final RecyclerView.u pool;

    @NotNull
    private final l tokenizedAnalytics;
    private long widgetId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AviaCheckTariffsAdapter(@NotNull J lifecycleOwner, @NotNull l tokenizedAnalytics, @NotNull Function2<? super AtomAction, ? super Integer, Unit> onItemClick, @NotNull Function0<Unit> onExpand, @NotNull RecyclerView.u pool) {
        super(new i.d<AviaCheckTariffsVO.TariffItem>() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.adapter.AviaCheckTariffsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(AviaCheckTariffsVO.TariffItem oldItem, AviaCheckTariffsVO.TariffItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(AviaCheckTariffsVO.TariffItem oldItem, AviaCheckTariffsVO.TariffItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }

            @Override // androidx.recyclerview.widget.i.d
            public Object getChangePayload(AviaCheckTariffsVO.TariffItem oldItem, AviaCheckTariffsVO.TariffItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                if (!(newItem instanceof AviaCheckTariffsVO.TariffItem.TariffVO) || !(oldItem instanceof AviaCheckTariffsVO.TariffItem.TariffVO)) {
                    return K.f71697a;
                }
                b builder = C7714v.B();
                AviaCheckTariffsVO.TariffItem.TariffVO tariffVO = (AviaCheckTariffsVO.TariffItem.TariffVO) newItem;
                AviaCheckTariffsVO.TariffItem.TariffVO tariffVO2 = (AviaCheckTariffsVO.TariffItem.TariffVO) oldItem;
                if (tariffVO.getIsSelected() != tariffVO2.getIsSelected() || !Intrinsics.d(tariffVO.getBackgroundColor(), tariffVO2.getBackgroundColor()) || !Intrinsics.d(tariffVO.getBorderColor(), tariffVO2.getBorderColor())) {
                    builder.add(AviaCheckTariffsPayload.APPEARANCE);
                }
                if (!Intrinsics.d(tariffVO.getTitle(), tariffVO2.getTitle()) || !Intrinsics.d(tariffVO.getPrice(), tariffVO2.getPrice()) || !Intrinsics.d(tariffVO.getRoute(), tariffVO2.getRoute()) || !Intrinsics.d(tariffVO.getMilesBadge(), tariffVO2.getMilesBadge()) || !Intrinsics.d(tariffVO.getBenefits(), tariffVO2.getBenefits()) || !Intrinsics.d(tariffVO.getMarketingImage(), tariffVO2.getMarketingImage()) || !Intrinsics.d(tariffVO.getClickAction(), tariffVO2.getClickAction()) || !Intrinsics.d(tariffVO.getViewTrackingInfo(), tariffVO2.getViewTrackingInfo()) || !Intrinsics.d(tariffVO.getPriceBlock(), tariffVO2.getPriceBlock())) {
                    builder.add(AviaCheckTariffsPayload.CONTENT);
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                return builder.B();
            }
        }, lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Intrinsics.checkNotNullParameter(onExpand, "onExpand");
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onItemClick = onItemClick;
        this.onExpand = onExpand;
        this.pool = pool;
    }

    private final AviaCheckTariffsSkeleton getAviaCheckTariffsSkeleton(Context context) {
        AviaCheckTariffsSkeleton aviaCheckTariffsSkeleton = new AviaCheckTariffsSkeleton(context);
        aviaCheckTariffsSkeleton.setLayoutParams(new ViewGroup.LayoutParams(UiExtKt.toPx(290, context), -1));
        return aviaCheckTariffsSkeleton;
    }

    private final AviaCheckTariffsView getAviaCheckTariffsView(Context context) {
        AviaCheckTariffsView aviaCheckTariffsView = new AviaCheckTariffsView(context, null, 0, 6, null);
        aviaCheckTariffsView.setLayoutParams(new ViewGroup.LayoutParams(UiExtKt.toPx(290, context), -1));
        aviaCheckTariffsView.setViewPool(this.pool);
        return aviaCheckTariffsView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        AviaCheckTariffsVO.TariffItem item = getItem(position);
        if (item instanceof AviaCheckTariffsVO.TariffItem.TariffVO) {
            return R$id.aviaCheckTariffsVOViewType;
        }
        if (item instanceof AviaCheckTariffsVO.TariffItem.TariffSkeleton) {
            return R$id.aviaCheckTariffsSkeletonVOViewType;
        }
        throw new o();
    }

    public final void setWidgetId(long id2) {
        this.widgetId = id2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((j) c11, i11, (List<? extends Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public j onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == R$id.aviaCheckTariffsVOViewType) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new AviaCheckTariffsItemViewHolder(getAviaCheckTariffsView(context), this.onItemClick, this.onExpand, this.tokenizedAnalytics);
        }
        if (viewType != R$id.aviaCheckTariffsSkeletonVOViewType) {
            throw new IllegalArgumentException(Ej.b.a(viewType, "Unknown viewType: "));
        }
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new AviaCheckTariffsSkeletonViewHolder(getAviaCheckTariffsSkeleton(context2));
    }

    @Override // jk0.i, androidx.recyclerview.widget.RecyclerView.g
    public void onViewAttachedToWindow(@NotNull j holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof AviaCheckTariffsItemViewHolder) {
            ((AviaCheckTariffsItemViewHolder) holder).setWidgetId(this.widgetId);
        }
        super.onViewAttachedToWindow((AviaCheckTariffsAdapter) holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull j holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof AviaCheckTariffsItemViewHolder) {
            AviaCheckTariffsVO.TariffItem item = getItem(position);
            AviaCheckTariffsVO.TariffItem.TariffVO tariffVO = item instanceof AviaCheckTariffsVO.TariffItem.TariffVO ? (AviaCheckTariffsVO.TariffItem.TariffVO) item : null;
            if (tariffVO == null) {
                return;
            }
            ((AviaCheckTariffsItemViewHolder) holder).bind(tariffVO);
            return;
        }
        if (holder instanceof AviaCheckTariffsSkeletonViewHolder) {
            AviaCheckTariffsVO.TariffItem item2 = getItem(position);
            Intrinsics.checkNotNullExpressionValue(item2, "getItem(...)");
            ((AviaCheckTariffsSkeletonViewHolder) holder).bind(item2);
        }
    }

    public void onBindViewHolder(@NotNull j holder, int position, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (holder instanceof AviaCheckTariffsItemViewHolder) {
            Object M11 = C7714v.M(payloads);
            List<?> list = M11 instanceof List ? (List) M11 : null;
            List<?> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                AviaCheckTariffsVO.TariffItem item = getItem(position);
                AviaCheckTariffsVO.TariffItem.TariffVO tariffVO = item instanceof AviaCheckTariffsVO.TariffItem.TariffVO ? (AviaCheckTariffsVO.TariffItem.TariffVO) item : null;
                if (tariffVO == null) {
                    return;
                }
                ((AviaCheckTariffsItemViewHolder) holder).bindPayloads(tariffVO, list);
                return;
            }
            onBindViewHolder(holder, position);
            return;
        }
        if (holder instanceof AviaCheckTariffsSkeletonViewHolder) {
            AviaCheckTariffsVO.TariffItem item2 = getItem(position);
            Intrinsics.checkNotNullExpressionValue(item2, "getItem(...)");
            ((AviaCheckTariffsSkeletonViewHolder) holder).bind(item2);
        }
    }
}
