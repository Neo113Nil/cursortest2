package com.iab.omid.library.bigosg.adsession;

import ru.ok.android.webrtc.PeerVideoSettingsBitrateTable;

/* loaded from: classes13.dex */
public enum ErrorType {
    GENERIC(PeerVideoSettingsBitrateTable.CODEC_GENERIC),
    VIDEO("video");

    private final String errorType;

    ErrorType(String str) {
        this.errorType = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.errorType;
    }
}
