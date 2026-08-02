package ru.ozon.app.android.videocover;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\bJ\u0006\u0010\u001d\u001a\u00020\fJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001fR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0018\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\u001a\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000f¨\u0006!"}, d2 = {"Lru/ozon/app/android/videocover/SafeVideoTile;", "", "localVideoTileHolder", "Ljava/lang/ref/WeakReference;", "Lru/ozon/app/android/videocover/VideoTileHolder;", "<init>", "(Ljava/lang/ref/WeakReference;)V", "videoTileHolder", "(Lru/ozon/app/android/videocover/VideoTileHolder;)V", "getVideoTileHolder", "()Lru/ozon/app/android/videocover/VideoTileHolder;", "isPlayed", "", "()Z", "setPlayed", "(Z)V", "isPaused", "setPaused", "isManualStarted", "setManualStarted", "isVideoStoppedTracked", "setVideoStoppedTracked", "isAtLeastHalfVisible", "setAtLeastHalfVisible", "isSwiping", "setSwiping", "runAtLeastOnce", "getRunAtLeastOnce", "setRunAtLeastOnce", "isAlive", "getWidgetHolderPosition", "", "getVideoPositionInGallery", "videocover_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SafeVideoTile {
    private boolean isAtLeastHalfVisible;
    private boolean isManualStarted;
    private boolean isPaused;
    private boolean isPlayed;
    private boolean isSwiping;
    private boolean isVideoStoppedTracked;

    @NotNull
    private final WeakReference<VideoTileHolder> localVideoTileHolder;
    private boolean runAtLeastOnce;

    public SafeVideoTile(@NotNull WeakReference<VideoTileHolder> localVideoTileHolder) {
        Intrinsics.checkNotNullParameter(localVideoTileHolder, "localVideoTileHolder");
        this.localVideoTileHolder = localVideoTileHolder;
    }

    public final boolean getRunAtLeastOnce() {
        return this.runAtLeastOnce;
    }

    public final int getVideoPositionInGallery() {
        VideoTileHolder videoTileHolder = getVideoTileHolder();
        if (videoTileHolder != null) {
            return videoTileHolder.getPositionInGallery();
        }
        return -1;
    }

    public final VideoTileHolder getVideoTileHolder() {
        return this.localVideoTileHolder.get();
    }

    public final int getWidgetHolderPosition() {
        VideoTileHolder videoTileHolder = getVideoTileHolder();
        if (videoTileHolder != null) {
            return videoTileHolder.getWidgetHolderPosition();
        }
        return -1;
    }

    public final boolean isAlive() {
        return getVideoTileHolder() != null;
    }

    /* renamed from: isAtLeastHalfVisible, reason: from getter */
    public final boolean getIsAtLeastHalfVisible() {
        return this.isAtLeastHalfVisible;
    }

    /* renamed from: isManualStarted, reason: from getter */
    public final boolean getIsManualStarted() {
        return this.isManualStarted;
    }

    /* renamed from: isPaused, reason: from getter */
    public final boolean getIsPaused() {
        return this.isPaused;
    }

    /* renamed from: isPlayed, reason: from getter */
    public final boolean getIsPlayed() {
        return this.isPlayed;
    }

    /* renamed from: isSwiping, reason: from getter */
    public final boolean getIsSwiping() {
        return this.isSwiping;
    }

    /* renamed from: isVideoStoppedTracked, reason: from getter */
    public final boolean getIsVideoStoppedTracked() {
        return this.isVideoStoppedTracked;
    }

    public final void setAtLeastHalfVisible(boolean z11) {
        this.isAtLeastHalfVisible = z11;
    }

    public final void setManualStarted(boolean z11) {
        this.isManualStarted = z11;
    }

    public final void setPaused(boolean z11) {
        this.isPaused = z11;
    }

    public final void setPlayed(boolean z11) {
        this.isPlayed = z11;
    }

    public final void setRunAtLeastOnce(boolean z11) {
        this.runAtLeastOnce = z11;
    }

    public final void setSwiping(boolean z11) {
        this.isSwiping = z11;
    }

    public final void setVideoStoppedTracked(boolean z11) {
        this.isVideoStoppedTracked = z11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SafeVideoTile(@NotNull VideoTileHolder videoTileHolder) {
        this((WeakReference<VideoTileHolder>) new WeakReference(videoTileHolder));
        Intrinsics.checkNotNullParameter(videoTileHolder, "videoTileHolder");
    }
}
