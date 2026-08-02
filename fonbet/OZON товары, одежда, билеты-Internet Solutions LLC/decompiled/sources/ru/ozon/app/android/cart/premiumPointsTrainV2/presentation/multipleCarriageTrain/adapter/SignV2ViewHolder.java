package ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.multipleCarriageTrain.adapter;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.multipleCarriageTrain.PremiumPointsTrainV2MultipleVO;
import ru.ozon.app.android.cart.premiumPointsTrainV2.presentation.multipleCarriageTrain.adapter.maualviews.SignV2ManualView;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/adapter/SignV2ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/adapter/maualviews/SignV2ManualView;", "view", "<init>", "(Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/adapter/maualviews/SignV2ManualView;)V", "Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/PremiumPointsTrainV2MultipleVO$PremiumPointsItem$SignItem;", "item", "", "bind", "(Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/PremiumPointsTrainV2MultipleVO$PremiumPointsItem$SignItem;)V", "Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/adapter/maualviews/SignV2ManualView;", "Lru/ozon/app/android/cart/premiumPointsTrainV2/presentation/multipleCarriageTrain/PremiumPointsTrainV2MultipleVO$PremiumPointsItem$SignItem;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SignV2ViewHolder extends RecyclerView.C {
    private PremiumPointsTrainV2MultipleVO.PremiumPointsItem.SignItem item;

    @NotNull
    private final SignV2ManualView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignV2ViewHolder(@NotNull SignV2ManualView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    public final void bind(@NotNull PremiumPointsTrainV2MultipleVO.PremiumPointsItem.SignItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        SignV2ManualView signV2ManualView = this.view;
        Integer signSize = item.getSignSize();
        if (signSize != null) {
            int intValue = signSize.intValue();
            ImageView signIv = signV2ManualView.getSignIv();
            ViewGroup.LayoutParams layoutParams = signIv.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).width = ResourceExtKt.toPx(intValue);
            ((ViewGroup.MarginLayoutParams) bVar).height = ResourceExtKt.toPx(intValue);
            signIv.setLayoutParams(bVar);
        }
        ImageView signIv2 = signV2ManualView.getSignIv();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = signV2ManualView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(signIv2, styleParser.parseColor(context, item.getSignIconTint()));
        ImageViewExtKt.load$default(signV2ManualView.getSignIv(), item.getSignIcon(), null, null, null, null, false, null, 126, null);
    }
}
