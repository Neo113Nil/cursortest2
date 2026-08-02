package com.iab.omid.library.ironsrc.adsession.media;

import com.vungle.ads.internal.Constants;
import io.sentry.ProfilingTraceData;

/* loaded from: classes6.dex */
public enum PlayerState {
    MINIMIZED("minimized"),
    COLLAPSED("collapsed"),
    NORMAL(ProfilingTraceData.TRUNCATION_REASON_NORMAL),
    EXPANDED("expanded"),
    FULLSCREEN(Constants.TEMPLATE_TYPE_FULLSCREEN);

    private final String playerState;

    PlayerState(String str) {
        this.playerState = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.playerState;
    }
}
