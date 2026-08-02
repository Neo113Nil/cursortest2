package com.blaze.blazesdk.players.contracts;

import androidx.annotation.Keep;
import com.blaze.blazesdk.players.inline.contracts.BlazePlayerControllerContract;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'J\b\u0010\u0007\u001a\u00020\u0003H'J\b\u0010\b\u001a\u00020\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/players/contracts/BlazeInlinePlayerContract;", "Lcom/blaze/blazesdk/players/inline/contracts/BlazePlayerControllerContract;", "embedPlaceholder", "", "embedPlayer", "shouldAutoPlayOnStart", "", "resetToPlaceholder", "disposeContainer", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BlazeInlinePlayerContract extends BlazePlayerControllerContract {
    @Keep
    void disposeContainer();

    @Keep
    void embedPlaceholder();

    @Keep
    void embedPlayer(boolean shouldAutoPlayOnStart);

    @Keep
    void resetToPlaceholder();
}
