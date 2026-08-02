package ru.ozon.app.android.pdp.widgets.galleryV4.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncModel;", "", "", "itemPosition", "", "videoPosition", "<init>", "(ILjava/lang/Long;)V", "copy", "(ILjava/lang/Long;)Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/GallerySyncModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getItemPosition", "Ljava/lang/Long;", "getVideoPosition", "()Ljava/lang/Long;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GallerySyncModel {
    private final int itemPosition;
    private final Long videoPosition;

    public GallerySyncModel(int i11, Long l11) {
        this.itemPosition = i11;
        this.videoPosition = l11;
    }

    public static /* synthetic */ GallerySyncModel copy$default(GallerySyncModel gallerySyncModel, int i11, Long l11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = gallerySyncModel.itemPosition;
        }
        if ((i12 & 2) != 0) {
            l11 = gallerySyncModel.videoPosition;
        }
        return gallerySyncModel.copy(i11, l11);
    }

    @NotNull
    public final GallerySyncModel copy(int itemPosition, Long videoPosition) {
        return new GallerySyncModel(itemPosition, videoPosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GallerySyncModel)) {
            return false;
        }
        GallerySyncModel gallerySyncModel = (GallerySyncModel) other;
        return this.itemPosition == gallerySyncModel.itemPosition && Intrinsics.d(this.videoPosition, gallerySyncModel.videoPosition);
    }

    public final int getItemPosition() {
        return this.itemPosition;
    }

    public final Long getVideoPosition() {
        return this.videoPosition;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.itemPosition) * 31;
        Long l11 = this.videoPosition;
        return hashCode + (l11 == null ? 0 : l11.hashCode());
    }

    @NotNull
    public String toString() {
        return "GallerySyncModel(itemPosition=" + this.itemPosition + ", videoPosition=" + this.videoPosition + ")";
    }
}
