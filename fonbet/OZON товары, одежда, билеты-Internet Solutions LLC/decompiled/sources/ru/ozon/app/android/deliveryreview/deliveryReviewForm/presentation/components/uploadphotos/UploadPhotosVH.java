package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.uploadphotos;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.deliveryreview.databinding.ItemDeliveryReviewComponentUploadPhotosBinding;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ElementVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.uploadphotos.viewmodel.ComponentUploadPhotosViewModel;
import ru.ozon.app.android.uploadPhotos.delegate.UploadPhotosDelegate;
import ru.ozon.app.android.uploadPhotos.viewmodel.UploadPhotosViewModel;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/uploadphotos/UploadPhotosVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentUploadPhotosBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/uploadphotos/viewmodel/ComponentUploadPhotosViewModel;", "uploadPhotosViewModel", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel;", "deliveryReviewFormViewModel", "", "isSelect", "<init>", "(Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentUploadPhotosBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/uploadphotos/viewmodel/ComponentUploadPhotosViewModel;Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel;Z)V", "", "", "photoPaths", "", "onUpdatePhotos", "(Ljava/util/List;)V", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;", "component", "bind", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;)V", "Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentUploadPhotosBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/uploadphotos/viewmodel/ComponentUploadPhotosViewModel;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel;", "Z", "componentVO", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;", "Lru/ozon/app/android/uploadPhotos/delegate/UploadPhotosDelegate;", "delegate", "Lru/ozon/app/android/uploadPhotos/delegate/UploadPhotosDelegate;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UploadPhotosVH extends RecyclerView.C {

    @NotNull
    private final ItemDeliveryReviewComponentUploadPhotosBinding binding;
    private ComponentVO componentVO;

    @NotNull
    private final UploadPhotosDelegate delegate;

    @NotNull
    private final DeliveryReviewFormViewModel deliveryReviewFormViewModel;
    private final boolean isSelect;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final ComponentUploadPhotosViewModel uploadPhotosViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadPhotosVH(@NotNull ItemDeliveryReviewComponentUploadPhotosBinding binding, @NotNull ComposerReferences references, @NotNull ComponentUploadPhotosViewModel uploadPhotosViewModel, @NotNull DeliveryReviewFormViewModel deliveryReviewFormViewModel, boolean z11) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(uploadPhotosViewModel, "uploadPhotosViewModel");
        Intrinsics.checkNotNullParameter(deliveryReviewFormViewModel, "deliveryReviewFormViewModel");
        this.binding = binding;
        this.references = references;
        this.uploadPhotosViewModel = uploadPhotosViewModel;
        this.deliveryReviewFormViewModel = deliveryReviewFormViewModel;
        this.isSelect = z11;
        RecyclerView rvUploadPhotos = binding.rvUploadPhotos;
        Intrinsics.checkNotNullExpressionValue(rvUploadPhotos, "rvUploadPhotos");
        this.delegate = new UploadPhotosDelegate(references, rvUploadPhotos, new UploadPhotosVH$delegate$1(this), z11, null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUpdatePhotos(List<String> photoPaths) {
        String selectControllingComponentId;
        DeliveryReviewFormViewModel deliveryReviewFormViewModel = this.deliveryReviewFormViewModel;
        ComponentVO componentVO = this.componentVO;
        String id2 = componentVO != null ? componentVO.getId() : null;
        if (id2 == null) {
            id2 = "";
        }
        deliveryReviewFormViewModel.updatePhotos(id2, photoPaths);
        ComponentVO componentVO2 = this.componentVO;
        if (componentVO2 == null || (selectControllingComponentId = componentVO2.getSelectControllingComponentId()) == null) {
            return;
        }
        DeliveryReviewFormViewModel deliveryReviewFormViewModel2 = this.deliveryReviewFormViewModel;
        ComponentVO componentVO3 = this.componentVO;
        String id3 = componentVO3 != null ? componentVO3.getId() : null;
        deliveryReviewFormViewModel2.updateToggleSelection(id3 != null ? id3 : "", selectControllingComponentId, !photoPaths.isEmpty());
    }

    public final void bind(@NotNull ComponentVO component) {
        Intrinsics.checkNotNullParameter(component, "component");
        ItemDeliveryReviewComponentUploadPhotosBinding itemDeliveryReviewComponentUploadPhotosBinding = this.binding;
        this.componentVO = component;
        TextView tvUploadPhotosTitle = itemDeliveryReviewComponentUploadPhotosBinding.tvUploadPhotosTitle;
        Intrinsics.checkNotNullExpressionValue(tvUploadPhotosTitle, "tvUploadPhotosTitle");
        ViewExtKt.showOrGone(tvUploadPhotosTitle, Boolean.valueOf(!component.getHidden()));
        RecyclerView rvUploadPhotos = itemDeliveryReviewComponentUploadPhotosBinding.rvUploadPhotos;
        Intrinsics.checkNotNullExpressionValue(rvUploadPhotos, "rvUploadPhotos");
        ViewExtKt.showOrGone(rvUploadPhotos, Boolean.valueOf(!component.getHidden()));
        if (component.getHidden()) {
            return;
        }
        UploadPhotosViewModel init = this.uploadPhotosViewModel.init(component);
        ElementVO element = component.getElement();
        ElementVO.UploadPhotos uploadPhotos = element instanceof ElementVO.UploadPhotos ? (ElementVO.UploadPhotos) element : null;
        if (uploadPhotos != null) {
            TextView tvUploadPhotosTitle2 = itemDeliveryReviewComponentUploadPhotosBinding.tvUploadPhotosTitle;
            Intrinsics.checkNotNullExpressionValue(tvUploadPhotosTitle2, "tvUploadPhotosTitle");
            TextViewExtKt.setTextOrGone(tvUploadPhotosTitle2, uploadPhotos.getTitle());
            List<String> values = uploadPhotos.getValues();
            if (values == null) {
                values = K.f71697a;
            }
            init.setImages(values, component.getDisabled());
        }
        this.delegate.bind(init);
    }
}
