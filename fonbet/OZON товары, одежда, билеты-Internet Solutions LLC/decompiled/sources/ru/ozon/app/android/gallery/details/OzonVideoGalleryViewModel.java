package ru.ozon.app.android.gallery.details;

import WZ.l;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import ru.ozon.app.android.gallery.GalleryTokenizedAnalyticsExtKt;
import ru.ozon.app.android.gallery.StorageAnalytic;
import ru.ozon.app.android.video.TokenizedVideoEvents;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\bR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/gallery/details/OzonVideoGalleryViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "Lru/ozon/app/android/video/TokenizedVideoEvents;", "galleryTokenizedVideoEvents", "", "processOpenViewEvent", "(Lru/ozon/app/android/video/TokenizedVideoEvents;)V", "processStartVideoEvent", "processFinishVideoEvent", "", "isFirstStartVideoEvent", "Z", "isFirstFinishVideo", "isFirstOpenViewEvent", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OzonVideoGalleryViewModel extends w0 {
    private boolean isFirstStartVideoEvent = true;
    private boolean isFirstFinishVideo = true;
    private boolean isFirstOpenViewEvent = true;

    public final void processFinishVideoEvent(TokenizedVideoEvents galleryTokenizedVideoEvents) {
        if (this.isFirstFinishVideo) {
            l tokenizedAnalytics = StorageAnalytic.INSTANCE.getTokenizedAnalytics();
            if (tokenizedAnalytics != null && galleryTokenizedVideoEvents != null) {
                GalleryTokenizedAnalyticsExtKt.endVideo(galleryTokenizedVideoEvents, tokenizedAnalytics);
            }
            this.isFirstFinishVideo = false;
        }
    }

    public final void processOpenViewEvent(TokenizedVideoEvents galleryTokenizedVideoEvents) {
        if (this.isFirstOpenViewEvent) {
            l tokenizedAnalytics = StorageAnalytic.INSTANCE.getTokenizedAnalytics();
            if (tokenizedAnalytics != null && galleryTokenizedVideoEvents != null) {
                GalleryTokenizedAnalyticsExtKt.openView(galleryTokenizedVideoEvents, tokenizedAnalytics);
            }
            this.isFirstOpenViewEvent = false;
        }
    }

    public final void processStartVideoEvent(TokenizedVideoEvents galleryTokenizedVideoEvents) {
        if (this.isFirstStartVideoEvent) {
            l tokenizedAnalytics = StorageAnalytic.INSTANCE.getTokenizedAnalytics();
            if (tokenizedAnalytics != null && galleryTokenizedVideoEvents != null) {
                GalleryTokenizedAnalyticsExtKt.startVideo(galleryTokenizedVideoEvents, tokenizedAnalytics);
            }
            this.isFirstStartVideoEvent = false;
        }
    }
}
