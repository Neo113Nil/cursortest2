package ru.ozon.app.android.cart.marketingdetail.presentation;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.feature.databinding.ItemMarketingDetailActionBinding;
import ru.ozon.app.android.cart.marketingdetail.presentation.MarketingDetailVO;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingActionVH;", "Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailsVH;", "binding", "Lru/ozon/app/android/cart/feature/databinding/ItemMarketingDetailActionBinding;", "<init>", "(Lru/ozon/app/android/cart/feature/databinding/ItemMarketingDetailActionBinding;)V", "bind", "", "item", "Lru/ozon/app/android/cart/marketingdetail/presentation/MarketingDetailVO$DetailListItem;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MarketingActionVH extends MarketingDetailsVH {

    @NotNull
    private final ItemMarketingDetailActionBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MarketingActionVH(@NotNull ItemMarketingDetailActionBinding binding) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
    }

    @Override // ru.ozon.app.android.cart.marketingdetail.presentation.MarketingDetailsVH
    public void bind(@NotNull MarketingDetailVO.DetailListItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ItemMarketingDetailActionBinding itemMarketingDetailActionBinding = this.binding;
        MarketingDetailVO.DetailListItem.Action action = (MarketingDetailVO.DetailListItem.Action) item;
        itemMarketingDetailActionBinding.titleTv.setText(action.getTitle());
        TextView subTitleTv = itemMarketingDetailActionBinding.subTitleTv;
        Intrinsics.checkNotNullExpressionValue(subTitleTv, "subTitleTv");
        TextViewExtKt.setTextOrGone(subTitleTv, action.getSubtitle());
        itemMarketingDetailActionBinding.valueTv.setText(action.getValue());
        TextView subValueTv = itemMarketingDetailActionBinding.subValueTv;
        Intrinsics.checkNotNullExpressionValue(subValueTv, "subValueTv");
        TextViewExtKt.setTextOrGone(subValueTv, action.getSubValue());
    }
}
