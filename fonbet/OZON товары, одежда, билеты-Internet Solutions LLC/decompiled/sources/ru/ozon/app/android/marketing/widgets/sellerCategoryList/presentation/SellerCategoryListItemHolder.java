package ru.ozon.app.android.marketing.widgets.sellerCategoryList.presentation;

import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.core.content.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.account.adult.ui.AdultViewHolder;
import ru.ozon.app.android.marketing.databinding.ItemSellerCategoryListBinding;
import ru.ozon.app.android.marketing.widgets.sellerCategoryList.presentation.vo.CategoryVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCategoryList/presentation/SellerCategoryListItemHolder;", "Lru/ozon/app/android/account/adult/ui/AdultViewHolder;", "Lru/ozon/app/android/marketing/widgets/sellerCategoryList/presentation/vo/CategoryVO;", "Lru/ozon/app/android/marketing/databinding/ItemSellerCategoryListBinding;", "containerView", "Lru/ozon/app/android/account/adult/presenter/AdultDelegate;", "adultDelegate", "<init>", "(Lru/ozon/app/android/marketing/databinding/ItemSellerCategoryListBinding;Lru/ozon/app/android/account/adult/presenter/AdultDelegate;)V", "item", "", "bind", "(Lru/ozon/app/android/marketing/widgets/sellerCategoryList/presentation/vo/CategoryVO;)V", "bindAdultContent", "Lru/ozon/app/android/marketing/databinding/ItemSellerCategoryListBinding;", "getContainerView", "()Lru/ozon/app/android/marketing/databinding/ItemSellerCategoryListBinding;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerCategoryListItemHolder extends AdultViewHolder<CategoryVO> {

    @NotNull
    private final ItemSellerCategoryListBinding containerView;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SellerCategoryListItemHolder(@NotNull ItemSellerCategoryListBinding containerView, @NotNull AdultDelegate<CategoryVO> adultDelegate) {
        super(r0, adultDelegate);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(adultDelegate, "adultDelegate");
        CardView constraintLayout = containerView.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.containerView = containerView;
    }

    public void bind(@NotNull CategoryVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind((SellerCategoryListItemHolder) item);
        TextAtomView categoryNameTv = this.containerView.categoryNameTv;
        Intrinsics.checkNotNullExpressionValue(categoryNameTv, "categoryNameTv");
        TextAtomHolderKt.bindOrGone$default(categoryNameTv, item.getName(), null, 2, null);
    }

    @Override // ru.ozon.app.android.account.adult.ui.AdultViewHolder
    public void bindAdultContent(@NotNull CategoryVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        List b02 = item.getShouldBlur() ? C7714v.b0(new ImageTransformation.CropOnColor(a.getColor(this.containerView.getConstraintLayout().getContext(), R$color.layer_floor_0)), new ImageTransformation.Blur(0, 1, 1, null)) : null;
        if (b02 == null) {
            b02 = K.f71697a;
        }
        ImageView adultEyeIv = this.containerView.adultEyeIv;
        Intrinsics.checkNotNullExpressionValue(adultEyeIv, "adultEyeIv");
        ViewExtKt.showOrGone(adultEyeIv, Boolean.valueOf(item.getShouldBlur()));
        ImageView categoryIconIv = this.containerView.categoryIconIv;
        Intrinsics.checkNotNullExpressionValue(categoryIconIv, "categoryIconIv");
        ImageViewExtKt.load$default(categoryIconIv, item.getBackgroundImage(), b02, null, null, null, false, null, 124, null);
    }
}
