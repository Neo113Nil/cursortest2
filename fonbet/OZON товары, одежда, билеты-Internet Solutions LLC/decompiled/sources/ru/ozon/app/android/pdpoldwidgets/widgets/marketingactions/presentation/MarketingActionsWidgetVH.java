package ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.presentation;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetMarketingActionsBinding;
import ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.presentation.MarketingActionsVO;
import ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.presentation.actions.ActionsAdapter;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsWidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsVO;", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsView;", "Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetMarketingActionsBinding;", "binding", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsPresenter;", "presenter", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/actions/ActionsAdapter;", "actionsAdapter", "<init>", "(Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetMarketingActionsBinding;Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsPresenter;Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/actions/ActionsAdapter;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsVO;Ll20/d;)V", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsVO$ActionItem;", "items", "showItems", "(Ljava/util/List;)V", "Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetMarketingActionsBinding;", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/MarketingActionsPresenter;", "Lru/ozon/app/android/pdpoldwidgets/widgets/marketingactions/presentation/actions/ActionsAdapter;", "Ll20/d;", "getInfo", "()Ll20/d;", "setInfo", "(Ll20/d;)V", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MarketingActionsWidgetVH extends k<MarketingActionsVO> implements MarketingActionsView {

    @NotNull
    private final ActionsAdapter actionsAdapter;

    @NotNull
    private final PdpWidgetMarketingActionsBinding binding;
    private d info;

    @NotNull
    private final MarketingActionsPresenter presenter;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MarketingActionsWidgetVH(@NotNull PdpWidgetMarketingActionsBinding binding, @NotNull MarketingActionsPresenter presenter, @NotNull ActionsAdapter actionsAdapter) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(actionsAdapter, "actionsAdapter");
        RecyclerView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.presenter = presenter;
        this.actionsAdapter = actionsAdapter;
        RecyclerView recyclerView = binding.actionsRv;
        int px = ResourceExtKt.toPx(10);
        int px2 = ResourceExtKt.toPx(16);
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new MarketingActionsDecoration(px, px2, context, 0));
        new x().attachToRecyclerView(binding.actionsRv);
        binding.actionsRv.setAdapter(actionsAdapter);
    }

    @Override // ru.ozon.app.android.pdpoldwidgets.widgets.marketingactions.presentation.MarketingActionsView
    public void showItems(@NotNull List<MarketingActionsVO.ActionItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.actionsAdapter.submitList(items);
        int px = ResourceExtKt.toPx(16);
        RecyclerView actionsRv = this.binding.actionsRv;
        Intrinsics.checkNotNullExpressionValue(actionsRv, "actionsRv");
        actionsRv.setPadding(0, 0, px, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull MarketingActionsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.info = info;
        this.presenter.onBind(item);
    }
}
