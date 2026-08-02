package ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewObject;

import G.g;
import Nh.a;
import Nh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItem;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/viewObject/PhotosVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "emptyStateImage", "", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/photos/recycler/PhotoItem;", "existingImages", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "errorDisclaimer", "<init>", "(JLru/ozon/uni/atoms/data/image/ImageDTO;Ljava/util/List;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getEmptyStateImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Ljava/util/List;", "getExistingImages", "()Ljava/util/List;", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getErrorDisclaimer", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PhotosVO implements c {

    @NotNull
    private final ImageDTO emptyStateImage;
    private final DisclaimerAtom errorDisclaimer;

    @NotNull
    private final List<PhotoItem> existingImages;
    private final long id;

    public PhotosVO(long j11, @NotNull ImageDTO emptyStateImage, @NotNull List<PhotoItem> existingImages, DisclaimerAtom disclaimerAtom) {
        Intrinsics.checkNotNullParameter(emptyStateImage, "emptyStateImage");
        Intrinsics.checkNotNullParameter(existingImages, "existingImages");
        this.id = j11;
        this.emptyStateImage = emptyStateImage;
        this.existingImages = existingImages;
        this.errorDisclaimer = disclaimerAtom;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhotosVO)) {
            return false;
        }
        PhotosVO photosVO = (PhotosVO) other;
        return this.id == photosVO.id && Intrinsics.d(this.emptyStateImage, photosVO.emptyStateImage) && Intrinsics.d(this.existingImages, photosVO.existingImages) && Intrinsics.d(this.errorDisclaimer, photosVO.errorDisclaimer);
    }

    @NotNull
    public final ImageDTO getEmptyStateImage() {
        return this.emptyStateImage;
    }

    public final DisclaimerAtom getErrorDisclaimer() {
        return this.errorDisclaimer;
    }

    @NotNull
    public final List<PhotoItem> getExistingImages() {
        return this.existingImages;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(a.b(this.emptyStateImage, Long.hashCode(this.id) * 31, 31), 31, this.existingImages);
        DisclaimerAtom disclaimerAtom = this.errorDisclaimer;
        return b11 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ImageDTO imageDTO = this.emptyStateImage;
        List<PhotoItem> list = this.existingImages;
        DisclaimerAtom disclaimerAtom = this.errorDisclaimer;
        StringBuilder c11 = b.c("PhotosVO(id=", j11, ", emptyStateImage=", imageDTO);
        c11.append(", existingImages=");
        c11.append(list);
        c11.append(", errorDisclaimer=");
        c11.append(disclaimerAtom);
        c11.append(")");
        return c11.toString();
    }
}
