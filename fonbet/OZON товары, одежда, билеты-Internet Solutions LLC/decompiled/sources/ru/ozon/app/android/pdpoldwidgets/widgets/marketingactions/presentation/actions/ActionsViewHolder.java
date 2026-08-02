package ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.presentation.actions;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetMarketingActionsActionBinding;
import ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.presentation.MarketingActionsVO;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/actions/ActionsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetMarketingActionsActionBinding;", "binding", "<init>", "(Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetMarketingActionsActionBinding;)V", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsVO$ActionItem;", "item", "", "bind", "(Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsVO$ActionItem;)V", "Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetMarketingActionsActionBinding;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ActionsViewHolder extends RecyclerView.C {

    @NotNull
    private final PdpWidgetMarketingActionsActionBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionsViewHolder(@NotNull PdpWidgetMarketingActionsActionBinding binding) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
    }

    public final void bind(@NotNull MarketingActionsVO.ActionItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        PdpWidgetMarketingActionsActionBinding pdpWidgetMarketingActionsActionBinding = this.binding;
        View view = pdpWidgetMarketingActionsActionBinding.colorV;
        Intrinsics.f(view);
        ViewExtKt.showOrGone(view, Boolean.valueOf(item.getIsShowColor()));
        view.setBackgroundColor(item.getColor());
        pdpWidgetMarketingActionsActionBinding.titleTv.setText(item.getTitle());
        TextView textView = pdpWidgetMarketingActionsActionBinding.subTitleTv;
        Intrinsics.f(textView);
        ViewExtKt.showOrGone(textView, Boolean.valueOf(item.getIsShowSubTitle()));
        textView.setText(item.getSubTitle());
        TextView textView2 = pdpWidgetMarketingActionsActionBinding.linkTv;
        Intrinsics.f(textView2);
        ViewExtKt.showOrGone(textView2, Boolean.valueOf(item.getIsShowLink()));
        textView2.setText(item.getDeeplinkTitle());
    }
}
