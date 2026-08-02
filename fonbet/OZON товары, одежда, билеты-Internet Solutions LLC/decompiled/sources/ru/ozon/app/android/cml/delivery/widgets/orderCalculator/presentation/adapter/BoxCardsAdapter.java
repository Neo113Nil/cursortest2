package ru.ozon.app.android.cml.delivery.widgets.orderCalculator.presentation.adapter;

import WZ.l;
import WZ.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import jk0.d;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cml.delivery.R$id;
import ru.ozon.app.android.cml.delivery.molecules.boxCard.presentation.BoxCardVO;
import ru.ozon.app.android.cml.delivery.molecules.boxCard.presentation.BoxCardView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B/\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u00052\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0007¢\u0006\u0004\b#\u0010$R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020!0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/adapter/BoxCardsAdapter;", "Ljk0/d;", "Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/adapter/BoxCardsAdapter$BoxListViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lkotlin/jvm/functions/Function1;LWZ/l;Landroidx/lifecycle/J;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/adapter/BoxCardsAdapter$BoxListViewHolder;", "holder", "", "", "payloads", "onBindViewHolder", "(Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/adapter/BoxCardsAdapter$BoxListViewHolder;ILjava/util/List;)V", "(Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/adapter/BoxCardsAdapter$BoxListViewHolder;I)V", "getItemCount", "()I", "", "Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardVO;", "list", "submitList", "(Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "items", "Ljava/util/List;", "BoxListViewHolder", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BoxCardsAdapter extends d<BoxListViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final List<BoxCardVO> items;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BoxCardsAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics, @NotNull J lifecycleOwner) {
        super(lifecycleOwner, null, 2, null);
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.items = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return R$id.boxCardViewTypeId;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void submitList(@NotNull List<BoxCardVO> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.items.clear();
        this.items.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((BoxListViewHolder) c11, i11, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BoxListViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BoxCardView boxCardView = new BoxCardView(context, null, 0, 6, null);
        BoxCardView.Companion companion = BoxCardView.INSTANCE;
        boxCardView.setLayoutParams(new RecyclerView.p(companion.getBoxCardWidth(), companion.getBoxCardHeight()));
        return new BoxListViewHolder(boxCardView, this.actionHandler, this.tokenizedAnalytics);
    }

    public void onBindViewHolder(@NotNull BoxListViewHolder holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        holder.bind(this.items.get(position), payloads);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BoxListViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\n\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/orderCalculator/presentation/adapter/BoxCardsAdapter$BoxListViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardView;", "boxCardView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardView;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "onViewInVisibleBounds", "()V", "Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardVO;", "item", "", "", "payloads", "bind", "(Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardVO;Ljava/util/List;)V", "(Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardVO;)V", "Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardView;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "boundData", "Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardVO;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BoxListViewHolder extends j {

        @NotNull
        private final Function1<AtomAction, Unit> actionHandler;
        private BoxCardVO boundData;

        @NotNull
        private final BoxCardView boxCardView;

        @NotNull
        private final l tokenizedAnalytics;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public BoxListViewHolder(@NotNull BoxCardView boxCardView, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics) {
            super(boxCardView);
            Intrinsics.checkNotNullParameter(boxCardView, "boxCardView");
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
            this.boxCardView = boxCardView;
            this.actionHandler = actionHandler;
            this.tokenizedAnalytics = tokenizedAnalytics;
            boxCardView.setOnClick(new HY.d(this, 5));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(BoxListViewHolder boxListViewHolder, View view) {
            AtomAction action;
            BoxCardVO boxCardVO = boxListViewHolder.boundData;
            if (boxCardVO == null || (action = boxCardVO.getAction()) == null) {
                return;
            }
            boxListViewHolder.actionHandler.invoke(action);
        }

        public final void bind(@NotNull BoxCardVO item, @NotNull List<Object> payloads) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            Object M11 = C7714v.M(payloads);
            Bundle bundle = M11 instanceof Bundle ? (Bundle) M11 : null;
            if (bundle == null) {
                bind(item);
                return;
            }
            if (bundle.containsKey("selectionChanged")) {
                this.boxCardView.setHasBorder(item.getIsSelected());
                this.boundData = item;
            }
            if (bundle.containsKey("actionChanged")) {
                this.boundData = item;
            }
            if (bundle.containsKey("titleChanged")) {
                this.boxCardView.setTitle(item.getTitle());
            }
            if (bundle.containsKey("descriptionChanged")) {
                this.boxCardView.setDescription(item.getDescriptions());
            }
            if (bundle.containsKey("imageChanged")) {
                this.boxCardView.setImage(item.getImage());
            }
            if (bundle.containsKey("priceChanged")) {
                this.boxCardView.setPrice(item.getPrice());
            }
        }

        @Override // jk0.j, lk0.b
        public void onViewInVisibleBounds() {
            t tokenizedEvent;
            super.onViewInVisibleBounds();
            BoxCardVO boxCardVO = this.boundData;
            if (boxCardVO == null || (tokenizedEvent = boxCardVO.getTokenizedEvent()) == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }

        public final void bind(@NotNull BoxCardVO item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.boundData = item;
            this.boxCardView.bind(item, item.getIsSelected());
        }
    }
}
