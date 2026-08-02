package com.fyber.inneractive.sdk.mraid;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public enum k {
    CLOSE(CampaignEx.JSON_NATIVE_VIDEO_CLOSE),
    EXPAND("expand"),
    USECUSTOMCLOSE("usecustomclose"),
    OPEN("open"),
    RESIZE("resize"),
    GET_RESIZE_PROPERTIES("getResizeProperties"),
    SET_RESIZE_PROPERTIES("setResizeProperties"),
    SET_ORIENTATION_PROPERTIES("setOrientationProperties"),
    PLAY_VIDEO("playVideo"),
    STORE_PICTURE("storePicture"),
    GET_CURRENT_POSITION("getCurrentPosition"),
    GET_DEFAULT_POSITION("getDefaultPosition"),
    GET_MAX_SIZE("getMaxSize"),
    GET_SCREEN_SIZE("getScreenSize"),
    CREATE_CALENDAR_EVENT("createCalendarEvent"),
    UNSPECIFIED("");

    private String mCommand;

    k(String str) {
        this.mCommand = str;
    }

    public static k a(String str) {
        for (k kVar : values()) {
            if (kVar.mCommand.equals(str)) {
                return kVar;
            }
        }
        return UNSPECIFIED;
    }

    public final String a() {
        return this.mCommand;
    }
}
