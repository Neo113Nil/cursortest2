package ru.ozon.app.android.returns.creation.widgets.photopickerunified.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.data.SignedLinkDTO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerunified/data/PhotosModel;", "", "", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/SignedLinkDTO;", "existingImages", "", "scrollWidgetKey", "<init>", "(Ljava/util/List;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getExistingImages", "()Ljava/util/List;", "I", "getScrollWidgetKey", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PhotosModel {

    @NotNull
    private final List<SignedLinkDTO> existingImages;
    private final int scrollWidgetKey;

    public PhotosModel(@NotNull List<SignedLinkDTO> existingImages, int i11) {
        Intrinsics.checkNotNullParameter(existingImages, "existingImages");
        this.existingImages = existingImages;
        this.scrollWidgetKey = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhotosModel)) {
            return false;
        }
        PhotosModel photosModel = (PhotosModel) other;
        return Intrinsics.d(this.existingImages, photosModel.existingImages) && this.scrollWidgetKey == photosModel.scrollWidgetKey;
    }

    @NotNull
    public final List<SignedLinkDTO> getExistingImages() {
        return this.existingImages;
    }

    public final int getScrollWidgetKey() {
        return this.scrollWidgetKey;
    }

    public int hashCode() {
        return Integer.hashCode(this.scrollWidgetKey) + (this.existingImages.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PhotosModel(existingImages=" + this.existingImages + ", scrollWidgetKey=" + this.scrollWidgetKey + ")";
    }
}
