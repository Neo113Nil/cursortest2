package ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.presentation.actions;

import AE.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetMarketingActionsActionBinding;
import ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.presentation.MarketingActionsVO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/actions/ActionsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsVO$ActionItem;", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/actions/ActionsViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/actions/ActionsViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/actions/ActionsViewHolder;I)V", "Lkotlin/Function1;", "", "onLinkClick", "Lkotlin/jvm/functions/Function1;", "getOnLinkClick", "()Lkotlin/jvm/functions/Function1;", "setOnLinkClick", "(Lkotlin/jvm/functions/Function1;)V", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ActionsAdapter extends t<MarketingActionsVO.ActionItem, ActionsViewHolder> {
    private Function1<? super String, Unit> onLinkClick;

    public ActionsAdapter() {
        super(new i.d<MarketingActionsVO.ActionItem>() { // from class: ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.presentation.actions.ActionsAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(MarketingActionsVO.ActionItem oldItem, MarketingActionsVO.ActionItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(MarketingActionsVO.ActionItem oldItem, MarketingActionsVO.ActionItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.hashCode() == newItem.hashCode();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$6$lambda$5$lambda$4(ActionsViewHolder actionsViewHolder, ActionsAdapter actionsAdapter, View view) {
        MarketingActionsVO.ActionItem item;
        Function1<? super String, Unit> function1;
        Integer valueOf = Integer.valueOf(actionsViewHolder.getAdapterPosition());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf == null || (item = actionsAdapter.getItem(valueOf.intValue())) == null) {
            return;
        }
        MarketingActionsVO.ActionItem actionItem = h.K(item.getDeeplink()) ? null : item;
        if (actionItem == null || (function1 = actionsAdapter.onLinkClick) == null) {
            return;
        }
        function1.invoke(actionItem.getDeeplink());
    }

    public final void setOnLinkClick(Function1<? super String, Unit> function1) {
        this.onLinkClick = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ActionsViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        MarketingActionsVO.ActionItem item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ActionsViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        PdpWidgetMarketingActionsActionBinding inflate = PdpWidgetMarketingActionsActionBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.f(inflate);
        ActionsViewHolder actionsViewHolder = new ActionsViewHolder(inflate);
        inflate.linkTv.setOnClickListener(new a(5, actionsViewHolder, this));
        return actionsViewHolder;
    }
}
