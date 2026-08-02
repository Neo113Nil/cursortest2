package ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.view.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.presentation.AviaComplexSearchFormVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.view.ComplexRouteItemView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0007¢\u0006\u0004\b \u0010!R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/view/adapter/ComplexRouteAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/view/adapter/ComplexRouteViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lkotlin/Function2;", "", "", "onSwipedListener", "getIsDemoAnimationRequired", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "()I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/view/adapter/ComplexRouteViewHolder;", "holder", "position", "", "", "payloads", "onBindViewHolder", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/view/adapter/ComplexRouteViewHolder;ILjava/util/List;)V", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/view/adapter/ComplexRouteViewHolder;I)V", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormVO$Flight;", "routes", "update", "(Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ComplexRouteAdapter extends RecyclerView.g<ComplexRouteViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Function1<Boolean, Boolean> getIsDemoAnimationRequired;

    @NotNull
    private final Function2<Boolean, Integer, Unit> onSwipedListener;

    @NotNull
    private final List<AviaComplexSearchFormVO.Flight> routes;

    /* JADX WARN: Multi-variable type inference failed */
    public ComplexRouteAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function2<? super Boolean, ? super Integer, Unit> onSwipedListener, @NotNull Function1<? super Boolean, Boolean> getIsDemoAnimationRequired) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onSwipedListener, "onSwipedListener");
        Intrinsics.checkNotNullParameter(getIsDemoAnimationRequired, "getIsDemoAnimationRequired");
        this.actionHandler = actionHandler;
        this.onSwipedListener = onSwipedListener;
        this.getIsDemoAnimationRequired = getIsDemoAnimationRequired;
        this.routes = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.routes.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void update(@NotNull List<AviaComplexSearchFormVO.Flight> routes) {
        Intrinsics.checkNotNullParameter(routes, "routes");
        List<AviaComplexSearchFormVO.Flight> list = this.routes;
        list.clear();
        list.addAll(routes);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(ComplexRouteViewHolder complexRouteViewHolder, int i11, List list) {
        onBindViewHolder2(complexRouteViewHolder, i11, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ComplexRouteViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ComplexRouteItemView complexRouteItemView = new ComplexRouteItemView(context, 0, 2, null);
        complexRouteItemView.setLayoutParams(new RecyclerView.p(-1, -2));
        return new ComplexRouteViewHolder(complexRouteItemView, this.actionHandler, this.onSwipedListener, this.getIsDemoAnimationRequired);
    }

    /* renamed from: onBindViewHolder, reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(@NotNull ComplexRouteViewHolder holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (!payloads.contains("ComplexRouteHideDeleteButtonPayload")) {
            super.onBindViewHolder((ComplexRouteAdapter) holder, position, payloads);
        } else {
            holder.hideDeleteButton();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ComplexRouteViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.routes.get(position));
    }
}
