package ru.ozon.app.android.partpayment.formpage.view.vh;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.databinding.ItemDynamicFormFieldImageBinding;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/vh/ImageFieldVH;", "Lru/ozon/app/android/partpayment/formpage/view/vh/DynamicFormFieldVH;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "item", "", "bind", "(Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldImageBinding;", "binding", "Lru/ozon/app/android/partpayment/databinding/ItemDynamicFormFieldImageBinding;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ImageFieldVH extends DynamicFormFieldVH {

    @NotNull
    private final ItemDynamicFormFieldImageBinding binding;

    @NotNull
    private final View containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageFieldVH(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        ItemDynamicFormFieldImageBinding bind = ItemDynamicFormFieldImageBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    @Override // ru.ozon.app.android.partpayment.formpage.view.vh.DynamicFormFieldVH
    public void bind(@NotNull FormPageVO.Field item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind(item);
        FormPageVO.Field.Image image = (FormPageVO.Field.Image) item;
        ImageView logoIv = this.binding.logoIv;
        Intrinsics.checkNotNullExpressionValue(logoIv, "logoIv");
        ImageViewExtKt.loadImageOrGone(logoIv, image.getDisplayValue());
        ImageView logoIv2 = this.binding.logoIv;
        Intrinsics.checkNotNullExpressionValue(logoIv2, "logoIv");
        ViewGroup.LayoutParams layoutParams = logoIv2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = image.getImageHeight();
        logoIv2.setLayoutParams(layoutParams);
        AppCompatTextView descriptionTv = this.binding.descriptionTv;
        Intrinsics.checkNotNullExpressionValue(descriptionTv, "descriptionTv");
        TextViewExtKt.setTextOrGone(descriptionTv, image.getDescription());
        this.binding.descriptionTv.setContentDescription(image.getDescription());
    }
}
