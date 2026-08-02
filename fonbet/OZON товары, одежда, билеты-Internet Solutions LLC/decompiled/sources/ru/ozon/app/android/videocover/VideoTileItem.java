package ru.ozon.app.android.videocover;

import WZ.t;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000e\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0012\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\r¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/videocover/VideoTileItem;", "", "", "getVideoUrl", "()Ljava/lang/String;", "videoUrl", "", "getShouldShowBlurredPreview", "()Z", "shouldShowBlurredPreview", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "getStartedTokenizedEvent", "()LWZ/t;", "startedTokenizedEvent", "getFinishedTokenizedEvent", "finishedTokenizedEvent", "getInterruptedTokenizedEvent", "interruptedTokenizedEvent", "videocover_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface VideoTileItem {
    t getFinishedTokenizedEvent();

    t getInterruptedTokenizedEvent();

    boolean getShouldShowBlurredPreview();

    t getStartedTokenizedEvent();

    @NotNull
    String getVideoUrl();
}
