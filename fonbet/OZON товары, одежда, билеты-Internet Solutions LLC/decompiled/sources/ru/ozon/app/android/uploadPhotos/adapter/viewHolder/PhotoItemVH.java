package ru.ozon.app.android.uploadPhotos.adapter.viewHolder;

import TS.a;
import Ve.ViewOnClickListenerC4465n7;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.uploadPhotos.databinding.ItemDeliveryReviewPhotoItemBinding;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ\f\u0010\u000e\u001a\u00020\u0007*\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/uploadPhotos/adapter/viewHolder/PhotoItemVH;", "Lru/ozon/app/android/uploadPhotos/adapter/viewHolder/UploadPhotoItemVH;", "binding", "Lru/ozon/app/android/uploadPhotos/databinding/ItemDeliveryReviewPhotoItemBinding;", "onRemovePhotoClick", "Lkotlin/Function1;", "", "", "onRetryLoadPhotoClick", "<init>", "(Lru/ozon/app/android/uploadPhotos/databinding/ItemDeliveryReviewPhotoItemBinding;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "item", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$AttachedImageVO;", "bind", "animateProgress", "Landroid/widget/ProgressBar;", "upload-photos_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PhotoItemVH extends UploadPhotoItemVH {

    @NotNull
    private final ItemDeliveryReviewPhotoItemBinding binding;
    private AttachmentVO.AttachedImageVO item;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PhotoItemVH(@NotNull ItemDeliveryReviewPhotoItemBinding binding, @NotNull Function1<? super Long, Unit> onRemovePhotoClick, @NotNull Function1<? super Long, Unit> onRetryLoadPhotoClick) {
        super(r0, null);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onRemovePhotoClick, "onRemovePhotoClick");
        Intrinsics.checkNotNullParameter(onRetryLoadPhotoClick, "onRetryLoadPhotoClick");
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        AppCompatImageView appCompatImageView = binding.ivRemovePhoto;
        appCompatImageView.setOnClickListener(new a(3, onRemovePhotoClick, this));
        appCompatImageView.setContentDescription("delivery_review_form_remove_photo_btn");
        ImageView imageView = binding.retryBtnIv;
        imageView.setOnClickListener(new ViewOnClickListenerC4465n7(6, onRetryLoadPhotoClick, this));
        imageView.setContentDescription("delivery_review_form_retry_btn");
        binding.getConstraintLayout().setClipToOutline(true);
    }

    private final void animateProgress(ProgressBar progressBar) {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(1500L);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatMode(1);
        rotateAnimation.setRepeatCount(-1);
        progressBar.startAnimation(rotateAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$4$lambda$1$lambda$0(Function1 function1, PhotoItemVH photoItemVH, View view) {
        AttachmentVO.AttachedImageVO attachedImageVO = photoItemVH.item;
        function1.invoke(Long.valueOf(attachedImageVO != null ? attachedImageVO.getId() : 0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$4$lambda$3$lambda$2(Function1 function1, PhotoItemVH photoItemVH, View view) {
        AttachmentVO.AttachedImageVO attachedImageVO = photoItemVH.item;
        function1.invoke(Long.valueOf(attachedImageVO != null ? attachedImageVO.getId() : 0L));
    }

    public final void bind(@NotNull AttachmentVO.AttachedImageVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ItemDeliveryReviewPhotoItemBinding itemDeliveryReviewPhotoItemBinding = this.binding;
        this.item = item;
        if (item.getStatus().getIsShowLoader()) {
            ProgressBar spinnerPb = itemDeliveryReviewPhotoItemBinding.spinnerPb;
            Intrinsics.checkNotNullExpressionValue(spinnerPb, "spinnerPb");
            animateProgress(spinnerPb);
        }
        AppCompatImageView ivPhoto = itemDeliveryReviewPhotoItemBinding.ivPhoto;
        Intrinsics.checkNotNullExpressionValue(ivPhoto, "ivPhoto");
        ImageViewExtKt.loadWithRoundCorners$default(ivPhoto, item.getMediaUri().toString(), null, 2, null);
        FrameLayout uploadingOverlayFl = itemDeliveryReviewPhotoItemBinding.uploadingOverlayFl;
        Intrinsics.checkNotNullExpressionValue(uploadingOverlayFl, "uploadingOverlayFl");
        uploadingOverlayFl.setVisibility(item.getStatus().getIsShowLoader() ? 0 : 8);
        AppCompatImageView ivRemovePhoto = itemDeliveryReviewPhotoItemBinding.ivRemovePhoto;
        Intrinsics.checkNotNullExpressionValue(ivRemovePhoto, "ivRemovePhoto");
        ivRemovePhoto.setVisibility(item.getStatus().getIsShowRemover() ? 0 : 8);
        ImageView retryBtnIv = itemDeliveryReviewPhotoItemBinding.retryBtnIv;
        Intrinsics.checkNotNullExpressionValue(retryBtnIv, "retryBtnIv");
        retryBtnIv.setVisibility(item.getStatus().getIsShowRetry() ? 0 : 8);
        ProgressBar spinnerPb2 = itemDeliveryReviewPhotoItemBinding.spinnerPb;
        Intrinsics.checkNotNullExpressionValue(spinnerPb2, "spinnerPb");
        spinnerPb2.setVisibility(item.getStatus().getIsShowLoader() ? 0 : 8);
    }
}
