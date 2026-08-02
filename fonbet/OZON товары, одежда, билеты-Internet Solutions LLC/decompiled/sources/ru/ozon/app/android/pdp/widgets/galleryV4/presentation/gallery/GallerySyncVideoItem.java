package ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/gallery/GallerySyncVideoItem;", "", "Landroid/view/View;", "view", "Lkotlin/Function0;", "", "onPlayVideo", "onPauseVideo", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lkotlin/jvm/functions/Function0;", "getOnPlayVideo", "()Lkotlin/jvm/functions/Function0;", "getOnPauseVideo", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GallerySyncVideoItem {

    @NotNull
    private final Function0<Unit> onPauseVideo;

    @NotNull
    private final Function0<Unit> onPlayVideo;

    @NotNull
    private final View view;

    public GallerySyncVideoItem(@NotNull View view, @NotNull Function0<Unit> onPlayVideo, @NotNull Function0<Unit> onPauseVideo) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onPlayVideo, "onPlayVideo");
        Intrinsics.checkNotNullParameter(onPauseVideo, "onPauseVideo");
        this.view = view;
        this.onPlayVideo = onPlayVideo;
        this.onPauseVideo = onPauseVideo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GallerySyncVideoItem)) {
            return false;
        }
        GallerySyncVideoItem gallerySyncVideoItem = (GallerySyncVideoItem) other;
        return Intrinsics.d(this.view, gallerySyncVideoItem.view) && Intrinsics.d(this.onPlayVideo, gallerySyncVideoItem.onPlayVideo) && Intrinsics.d(this.onPauseVideo, gallerySyncVideoItem.onPauseVideo);
    }

    @NotNull
    public final Function0<Unit> getOnPauseVideo() {
        return this.onPauseVideo;
    }

    @NotNull
    public final Function0<Unit> getOnPlayVideo() {
        return this.onPlayVideo;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    public int hashCode() {
        return this.onPauseVideo.hashCode() + ((this.onPlayVideo.hashCode() + (this.view.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "GallerySyncVideoItem(view=" + this.view + ", onPlayVideo=" + this.onPlayVideo + ", onPauseVideo=" + this.onPauseVideo + ")";
    }
}
