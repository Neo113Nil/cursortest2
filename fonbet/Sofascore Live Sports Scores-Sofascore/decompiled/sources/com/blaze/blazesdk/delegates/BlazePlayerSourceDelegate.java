package com.blaze.blazesdk.delegates;

import androidx.annotation.Keep;
import com.blaze.blazesdk.delegates.models.BlazeCTAActionType;
import com.blaze.blazesdk.delegates.models.BlazePlayerEvent;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.delegates.models.BlazeShareParams;
import com.blaze.blazesdk.features.search.models.BlazeSearchHandleType;
import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLinkActionHandleType;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.style.shared.models.BlazePlayerCustomActionButtonParams;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J0\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH&J\u001a\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001a\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J*\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007H&J\"\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0007H&J\"\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u0018H&J\"\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J$\u0010\u001e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001f\u001a\u00020 H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/delegates/BlazePlayerSourceDelegate;", "", "onDataLoadStarted", "", "playerType", "Lcom/blaze/blazesdk/delegates/models/BlazePlayerType;", "sourceId", "", "onDataLoadComplete", "itemsCount", "", "result", "Lcom/blaze/blazesdk/shared/results/BlazeResult;", "onPlayerDidAppear", "onPlayerDidDismiss", "onTriggerCTA", "", "actionType", "Lcom/blaze/blazesdk/delegates/models/BlazeCTAActionType;", "actionParam", "onTriggerPlayerBodyTextLink", "Lcom/blaze/blazesdk/features/shared/models/ui_shared/BlazeLinkActionHandleType;", "onPlayerEventTriggered", "event", "Lcom/blaze/blazesdk/delegates/models/BlazePlayerEvent;", "onTriggerCustomActionButton", "customParams", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams;", "onSearchButtonClicked", "Lcom/blaze/blazesdk/features/search/models/BlazeSearchHandleType;", "onShareClicked", "shareParams", "Lcom/blaze/blazesdk/delegates/models/BlazeShareParams;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BlazePlayerSourceDelegate {
    void onDataLoadComplete(@NotNull BlazePlayerType playerType, @Nullable String sourceId, int itemsCount, @NotNull BlazeResult<Unit> result);

    void onDataLoadStarted(@NotNull BlazePlayerType playerType, @Nullable String sourceId);

    void onPlayerDidAppear(@NotNull BlazePlayerType playerType, @Nullable String sourceId);

    void onPlayerDidDismiss(@NotNull BlazePlayerType playerType, @Nullable String sourceId);

    void onPlayerEventTriggered(@NotNull BlazePlayerType playerType, @Nullable String sourceId, @NotNull BlazePlayerEvent event);

    @Nullable
    default BlazeSearchHandleType onSearchButtonClicked(@NotNull BlazePlayerType playerType, @Nullable String sourceId) {
        playerType.getClass();
        return null;
    }

    @Nullable
    default String onShareClicked(@NotNull BlazePlayerType playerType, @Nullable String sourceId, @NotNull BlazeShareParams shareParams) {
        playerType.getClass();
        shareParams.getClass();
        return null;
    }

    boolean onTriggerCTA(@NotNull BlazePlayerType playerType, @Nullable String sourceId, @NotNull BlazeCTAActionType actionType, @NotNull String actionParam);

    default void onTriggerCustomActionButton(@NotNull BlazePlayerType playerType, @Nullable String sourceId, @NotNull BlazePlayerCustomActionButtonParams customParams) {
        playerType.getClass();
        customParams.getClass();
    }

    @NotNull
    BlazeLinkActionHandleType onTriggerPlayerBodyTextLink(@NotNull BlazePlayerType playerType, @Nullable String sourceId, @NotNull String actionParam);
}
