package ru.ozon.app.android.uploadPhotos.adapter.viewHolder;

import FX.a;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uploadPhotos.databinding.ItemDeliveryReviewAddPhotoItemBinding;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/uploadPhotos/adapter/viewHolder/AddPhotoItemVH;", "Lru/ozon/app/android/uploadPhotos/adapter/viewHolder/UploadPhotoItemVH;", "binding", "Lru/ozon/app/android/uploadPhotos/databinding/ItemDeliveryReviewAddPhotoItemBinding;", "onAddPhotoClick", "Lkotlin/Function0;", "", "<init>", "(Lru/ozon/app/android/uploadPhotos/databinding/ItemDeliveryReviewAddPhotoItemBinding;Lkotlin/jvm/functions/Function0;)V", "upload-photos_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AddPhotoItemVH extends UploadPhotoItemVH {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AddPhotoItemVH(@NotNull ItemDeliveryReviewAddPhotoItemBinding binding, @NotNull Function0<Unit> onAddPhotoClick) {
        super(r0, null);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onAddPhotoClick, "onAddPhotoClick");
        FrameLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        binding.getRoot().setOnClickListener(new a(onAddPhotoClick, 14));
        binding.iconIv.setContentDescription("delivery_review_form_upload_photo_btn");
    }
}
