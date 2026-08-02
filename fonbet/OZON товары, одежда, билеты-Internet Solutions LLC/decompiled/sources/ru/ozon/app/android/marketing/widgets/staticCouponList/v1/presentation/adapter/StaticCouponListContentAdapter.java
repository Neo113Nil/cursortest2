package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter;

import Sc.C4005g;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import jk0.i;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001&B?\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00052\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016¢\u0006\u0004\b\u001e\u0010#R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentAdapter;", "Ljk0/i;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem;", "Ljk0/j;", "", "", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentAdapterDelegate;", "delegates", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentDiffUtil;", "diffUtil", "<init>", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/J;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentDiffUtil;)V", "viewType", "", "delegateNotFoundError", "(I)Ljava/lang/Void;", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Ljk0/j;", "holder", "onBindViewHolder", "(Ljk0/j;I)V", "", "", "payloads", "(Ljk0/j;ILjava/util/List;)V", "Ljava/util/Map;", "Lkotlin/jvm/functions/Function1;", "ViewHolder", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListContentAdapter extends i<StaticCouponListVO.ContentItem, j> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Map<Integer, StaticCouponListContentAdapterDelegate> delegates;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u0014\u0010\f\u001a\u00028\u00018DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentAdapter$ViewHolder;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem;", "I", "Landroid/view/View;", "V", "Ljk0/j;", "view", "<init>", "(Landroid/view/View;)V", "Landroid/view/View;", "getCurrentView", "()Landroid/view/View;", "currentView", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentViewBinder;", "getViewBinder", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentViewBinder;", "viewBinder", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ViewHolder<I extends StaticCouponListVO.ContentItem, V extends View> extends j {

        @NotNull
        private final View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
        }

        @NotNull
        protected final V getCurrentView() {
            V v11 = (V) this.view;
            Intrinsics.g(v11, "null cannot be cast to non-null type V of ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentAdapter.ViewHolder");
            return v11;
        }

        @NotNull
        public abstract StaticCouponListContentViewBinder<I, V> getViewBinder();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StaticCouponListContentAdapter(@NotNull Map<Integer, ? extends StaticCouponListContentAdapterDelegate> delegates, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull J lifecycleOwner, @NotNull StaticCouponListContentDiffUtil diffUtil) {
        super(diffUtil, lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(diffUtil, "diffUtil");
        this.delegates = delegates;
        this.actionHandler = actionHandler;
    }

    private final Void delegateNotFoundError(int viewType) {
        throw new IllegalStateException(("Delegate not found for viewType: " + viewType).toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        Iterator<T> it = this.delegates.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            StaticCouponListContentAdapterDelegate staticCouponListContentAdapterDelegate = (StaticCouponListContentAdapterDelegate) entry.getValue();
            StaticCouponListVO.ContentItem item = getItem(position);
            Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
            if (staticCouponListContentAdapterDelegate.canHandle(item)) {
                return ((Number) entry.getKey()).intValue();
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((j) c11, i11, (List<? extends Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public j onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        j onCreateViewHolder;
        Intrinsics.checkNotNullParameter(parent, "parent");
        StaticCouponListContentAdapterDelegate staticCouponListContentAdapterDelegate = this.delegates.get(Integer.valueOf(viewType));
        if (staticCouponListContentAdapterDelegate != null && (onCreateViewHolder = staticCouponListContentAdapterDelegate.onCreateViewHolder(parent)) != null) {
            return onCreateViewHolder;
        }
        delegateNotFoundError(viewType);
        throw new C4005g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull j holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        StaticCouponListContentAdapterDelegate staticCouponListContentAdapterDelegate = this.delegates.get(Integer.valueOf(getItemViewType(position)));
        if (staticCouponListContentAdapterDelegate != null) {
            StaticCouponListVO.ContentItem item = getItem(position);
            Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
            staticCouponListContentAdapterDelegate.onBindViewHolder(holder, item, this.actionHandler);
        }
    }

    public void onBindViewHolder(@NotNull j holder, int position, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, position);
            return;
        }
        for (Object obj : payloads) {
            StaticCouponListContentAdapterDelegate staticCouponListContentAdapterDelegate = this.delegates.get(Integer.valueOf(getItemViewType(position)));
            if (staticCouponListContentAdapterDelegate != null) {
                StaticCouponListVO.ContentItem item = getItem(position);
                Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
                staticCouponListContentAdapterDelegate.onBindViewHolder(holder, item, this.actionHandler, obj);
            }
        }
    }
}
