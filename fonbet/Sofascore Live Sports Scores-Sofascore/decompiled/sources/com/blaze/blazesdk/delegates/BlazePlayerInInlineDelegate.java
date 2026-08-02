package com.blaze.blazesdk.delegates;

import androidx.annotation.Keep;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/delegates/BlazePlayerInInlineDelegate;", "Lcom/blaze/blazesdk/delegates/BlazePlayerInContainerDelegate;", "onPlayerDidEnterFullScreen", "", "playerType", "Lcom/blaze/blazesdk/delegates/models/BlazePlayerType;", "sourceId", "", "onPlayerDidExitFullScreen", "onPlaceholderClicked", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BlazePlayerInInlineDelegate extends BlazePlayerInContainerDelegate {
    default void onPlaceholderClicked(@NotNull BlazePlayerType playerType, @Nullable String sourceId) {
        playerType.getClass();
    }

    default void onPlayerDidEnterFullScreen(@NotNull BlazePlayerType playerType, @Nullable String sourceId) {
        playerType.getClass();
    }

    default void onPlayerDidExitFullScreen(@NotNull BlazePlayerType playerType, @Nullable String sourceId) {
        playerType.getClass();
    }
}
