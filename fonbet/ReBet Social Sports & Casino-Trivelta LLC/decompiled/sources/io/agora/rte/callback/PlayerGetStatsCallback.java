package io.agora.rte.callback;

import io.agora.base.internal.CalledByNative;
import io.agora.rte.Error;
import io.agora.rte.PlayerStats;

/* loaded from: classes3.dex */
public interface PlayerGetStatsCallback {
    @CalledByNative
    void onResult(PlayerStats playerStats, Error error);
}
