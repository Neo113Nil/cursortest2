package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.deliveryreview.databinding.WidgetDeliveryReviewFormItemBinding;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModelImpl;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.uploadphotos.viewmodel.ComponentUploadPhotosViewModel;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.uploadphotos.viewmodel.ComponentUploadPhotosViewModelImpl;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/item/DeliveryReviewFormItemWidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DeliveryReviewFormItemViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, DeliveryReviewFormItemWidgetViewHolder> {
    final /* synthetic */ DeliveryReviewFormItemViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryReviewFormItemViewMapper$holderProducer$1(DeliveryReviewFormItemViewMapper deliveryReviewFormItemViewMapper) {
        super(2);
        this.this$0 = deliveryReviewFormItemViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final DeliveryReviewFormItemWidgetViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        WidgetDeliveryReviewFormItemBinding bind = WidgetDeliveryReviewFormItemBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        B0 a11 = refs.getViewModelOwnerProvider().a();
        final DeliveryReviewFormItemViewMapper deliveryReviewFormItemViewMapper = this.this$0;
        ComponentUploadPhotosViewModel componentUploadPhotosViewModel = (ComponentUploadPhotosViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewFormItemViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ComponentUploadPhotosViewModelImpl uploadPhotosViewModel = DeliveryReviewFormItemViewMapper.this.component().getUploadPhotosViewModel();
                Intrinsics.g(uploadPhotosViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return uploadPhotosViewModel;
            }
        }).a(ComponentUploadPhotosViewModelImpl.class);
        B0 a12 = refs.getViewModelOwnerProvider().a();
        final DeliveryReviewFormItemViewMapper deliveryReviewFormItemViewMapper2 = this.this$0;
        return new DeliveryReviewFormItemWidgetViewHolder(bind, refs, componentUploadPhotosViewModel, (DeliveryReviewFormViewModel) new z0(a12, new z0.c() { // from class: ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.DeliveryReviewFormItemViewMapper$holderProducer$1$invoke$$inlined$createViewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                DeliveryReviewFormViewModelImpl deliveryReviewFormViewModel = DeliveryReviewFormItemViewMapper.this.component().getDeliveryReviewFormViewModel();
                Intrinsics.g(deliveryReviewFormViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return deliveryReviewFormViewModel;
            }
        }).a(DeliveryReviewFormViewModelImpl.class), this.this$0.component().getAppType() == AppType.SELECT);
    }
}
