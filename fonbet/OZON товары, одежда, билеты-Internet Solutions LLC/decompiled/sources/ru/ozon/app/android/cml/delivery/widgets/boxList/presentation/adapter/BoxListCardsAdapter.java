package ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.adapter;

import WZ.l;
import WZ.t;
import android.annotation.SuppressLint;
import android.content.Context;
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

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000e\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00015B/\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u0019\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020\u00062\f\u0010)\u001a\b\u0012\u0004\u0012\u00020%0(H\u0007¢\u0006\u0004\b*\u0010+R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020%0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00100\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u0010 \"\u0004\b3\u00104¨\u00066"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/adapter/BoxListCardsAdapter;", "Ljk0/d;", "Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/adapter/BoxListCardsAdapter$BoxListViewHolder;", "Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/adapter/BoxListViewHolderCallback;", "Lkotlin/Function1;", "", "", "onBoxClick", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lkotlin/jvm/functions/Function1;LWZ/l;Landroidx/lifecycle/J;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/adapter/BoxListCardsAdapter$BoxListViewHolder;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/adapter/BoxListCardsAdapter$BoxListViewHolder;I)V", "", "", "payloads", "(Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/adapter/BoxListCardsAdapter$BoxListViewHolder;ILjava/util/List;)V", "getItemCount", "()I", "lastSelectedIndex", "payload", "onItemChanged", "(ILjava/lang/Object;)V", "Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardVO;", "getCardItem", "(I)Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardVO;", "", "list", "submitList", "(Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "items", "Ljava/util/List;", "selectedIndex", "I", "getSelectedIndex", "setSelectedIndex", "(I)V", "BoxListViewHolder", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BoxListCardsAdapter extends d<BoxListViewHolder> implements BoxListViewHolderCallback {

    @NotNull
    private final List<BoxCardVO> items;

    @NotNull
    private final Function1<String, Unit> onBoxClick;
    private int selectedIndex;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BoxListCardsAdapter(@NotNull Function1<? super String, Unit> onBoxClick, @NotNull l tokenizedAnalytics, @NotNull J lifecycleOwner) {
        super(lifecycleOwner, null, 2, null);
        Intrinsics.checkNotNullParameter(onBoxClick, "onBoxClick");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.onBoxClick = onBoxClick;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.items = new ArrayList();
        this.selectedIndex = -1;
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.adapter.BoxListViewHolderCallback
    @NotNull
    public BoxCardVO getCardItem(int position) {
        return this.items.get(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return R$id.boxListCardViewTypeId;
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.adapter.BoxListViewHolderCallback
    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.adapter.BoxListViewHolderCallback
    public void onItemChanged(int lastSelectedIndex, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        notifyItemChanged(lastSelectedIndex, payload);
    }

    @Override // ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.adapter.BoxListViewHolderCallback
    public void setSelectedIndex(int i11) {
        this.selectedIndex = i11;
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
        boxCardView.setLayoutParams(new RecyclerView.p(-1, BoxCardView.INSTANCE.getBoxCardHeight()));
        return new BoxListViewHolder(boxCardView, this.onBoxClick, this, this.tokenizedAnalytics);
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001 B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J#\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/adapter/BoxListCardsAdapter$BoxListViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardView;", "boxCardView", "Lkotlin/Function1;", "", "", "onBoxClick", "Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/adapter/BoxListViewHolderCallback;", "callback", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardView;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/adapter/BoxListViewHolderCallback;LWZ/l;)V", "onRecycle", "()V", "onViewInVisibleBounds", "Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardVO;", "item", "", "", "payloads", "bind", "(Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardVO;Ljava/util/List;)V", "(Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardVO;)V", "Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardView;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/adapter/BoxListViewHolderCallback;", "LWZ/l;", "boundData", "Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardVO;", "ResetSelection", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BoxListViewHolder extends j {
        private BoxCardVO boundData;

        @NotNull
        private final BoxCardView boxCardView;

        @NotNull
        private final BoxListViewHolderCallback callback;

        @NotNull
        private final Function1<String, Unit> onBoxClick;

        @NotNull
        private final l tokenizedAnalytics;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/adapter/BoxListCardsAdapter$BoxListViewHolder$ResetSelection;", "", "<init>", "()V", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        private static final class ResetSelection {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public BoxListViewHolder(@NotNull BoxCardView boxCardView, @NotNull Function1<? super String, Unit> onBoxClick, @NotNull BoxListViewHolderCallback callback, @NotNull l tokenizedAnalytics) {
            super(boxCardView);
            Intrinsics.checkNotNullParameter(boxCardView, "boxCardView");
            Intrinsics.checkNotNullParameter(onBoxClick, "onBoxClick");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
            this.boxCardView = boxCardView;
            this.onBoxClick = onBoxClick;
            this.callback = callback;
            this.tokenizedAnalytics = tokenizedAnalytics;
            boxCardView.setOnClick(new Dc0.j(this, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$1(BoxListViewHolder boxListViewHolder, View view) {
            if (boxListViewHolder.callback.getSelectedIndex() != boxListViewHolder.getAdapterPosition()) {
                int selectedIndex = boxListViewHolder.callback.getSelectedIndex();
                boxListViewHolder.callback.setSelectedIndex(boxListViewHolder.getAdapterPosition());
                boxListViewHolder.boxCardView.setHasBorder(true);
                boxListViewHolder.callback.onItemChanged(selectedIndex, new ResetSelection());
            }
            BoxCardVO cardItem = boxListViewHolder.callback.getCardItem(boxListViewHolder.getAdapterPosition());
            if (cardItem != null) {
                boxListViewHolder.onBoxClick.invoke(cardItem.getId());
                t tokenizedEvent = cardItem.getTokenizedEvent();
                if (tokenizedEvent != null) {
                    TokenizedAnalyticsExtensionsKt.processClickEvents$default(boxListViewHolder.tokenizedAnalytics, tokenizedEvent, null, 2, null);
                }
            }
        }

        public final void bind(@NotNull BoxCardVO item, @NotNull List<Object> payloads) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            if (C7714v.M(payloads) instanceof ResetSelection) {
                this.boxCardView.setHasBorder(this.callback.getSelectedIndex() == getAdapterPosition());
            } else {
                bind(item);
            }
        }

        @Override // jk0.j
        public void onRecycle() {
            super.onRecycle();
            this.boxCardView.setOnClick(null);
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
            this.boxCardView.bind(item, this.callback.getSelectedIndex() == getAdapterPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BoxListViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }

    public void onBindViewHolder(@NotNull BoxListViewHolder holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        holder.bind(this.items.get(position), payloads);
    }
}
