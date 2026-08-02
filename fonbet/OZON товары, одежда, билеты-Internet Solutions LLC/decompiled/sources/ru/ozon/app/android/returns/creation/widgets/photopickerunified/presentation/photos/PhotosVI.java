package ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.photos;

import B0.C2454a;
import D3.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFile;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerunified/presentation/photos/PhotosVI;", "Ll20/c;", "", "id", "", "scrollWidgetKey", "", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;", "existingImages", "<init>", "(JILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getScrollWidgetKey", "()Ljava/lang/Integer;", "Ljava/util/List;", "getExistingImages", "()Ljava/util/List;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PhotosVI implements c {

    @NotNull
    private final List<MediaFile> existingImages;
    private final long id;
    private final int scrollWidgetKey;

    public PhotosVI(long j11, int i11, @NotNull List<MediaFile> existingImages) {
        Intrinsics.checkNotNullParameter(existingImages, "existingImages");
        this.id = j11;
        this.scrollWidgetKey = i11;
        this.existingImages = existingImages;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhotosVI)) {
            return false;
        }
        PhotosVI photosVI = (PhotosVI) other;
        return this.id == photosVI.id && this.scrollWidgetKey == photosVI.scrollWidgetKey && Intrinsics.d(this.existingImages, photosVI.existingImages);
    }

    @NotNull
    public final List<MediaFile> getExistingImages() {
        return this.existingImages;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    @NotNull
    public Integer getScrollWidgetKey() {
        return Integer.valueOf(this.scrollWidgetKey);
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.existingImages.hashCode() + C2454a.a(this.scrollWidgetKey, Long.hashCode(this.id) * 31, 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        int i11 = this.scrollWidgetKey;
        return h.c(Ql.c.b(j11, "PhotosVI(id=", i11, ", scrollWidgetKey="), ", existingImages=", this.existingImages, ")");
    }
}
