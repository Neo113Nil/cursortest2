package com.blaze.blazesdk.features.videos.widgets;

import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.models.ui.BlazeVideosAdsConfigType;
import com.blaze.blazesdk.features.videos.models.configuration.BlazeVideosPlaybackConfiguration;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import com.blaze.blazesdk.widgets.contracts.BaseWidgetContract;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H&J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/features/videos/widgets/WidgetVideosContract;", "Lcom/blaze/blazesdk/widgets/contracts/BaseWidgetContract;", "updateAdsConfigType", "", "videosAdsConfigType", "Lcom/blaze/blazesdk/ads/models/ui/BlazeVideosAdsConfigType;", "getCurrentPlayerStyle", "Lcom/blaze/blazesdk/style/players/videos/BlazeVideosPlayerStyle;", "updatePlayerStyle", "playerStyle", "getCurrentPlaybackConfiguration", "Lcom/blaze/blazesdk/features/videos/models/configuration/BlazeVideosPlaybackConfiguration;", "updatePlaybackConfiguration", "playbackConfiguration", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface WidgetVideosContract extends BaseWidgetContract {
    @Nullable
    BlazeVideosPlaybackConfiguration getCurrentPlaybackConfiguration();

    @Nullable
    BlazeVideosPlayerStyle getCurrentPlayerStyle();

    void updateAdsConfigType(@NotNull BlazeVideosAdsConfigType videosAdsConfigType);

    void updatePlaybackConfiguration(@Nullable BlazeVideosPlaybackConfiguration playbackConfiguration);

    void updatePlayerStyle(@NotNull BlazeVideosPlayerStyle playerStyle);
}
