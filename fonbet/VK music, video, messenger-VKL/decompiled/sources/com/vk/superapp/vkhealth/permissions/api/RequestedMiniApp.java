package com.vk.superapp.vkhealth.permissions.api;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RequestedMiniApp.kt */
/* loaded from: classes6.dex */
public final class RequestedMiniApp {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ RequestedMiniApp[] $VALUES;
    public static final RequestedMiniApp VK_STEPS;
    public static final RequestedMiniApp VK_WORKOUT;

    static {
        RequestedMiniApp requestedMiniApp = new RequestedMiniApp("VK_STEPS", 0);
        VK_STEPS = requestedMiniApp;
        RequestedMiniApp requestedMiniApp2 = new RequestedMiniApp("VK_WORKOUT", 1);
        VK_WORKOUT = requestedMiniApp2;
        RequestedMiniApp[] requestedMiniAppArr = {requestedMiniApp, requestedMiniApp2};
        $VALUES = requestedMiniAppArr;
        $ENTRIES = new asp(requestedMiniAppArr);
    }

    public RequestedMiniApp() {
        throw null;
    }

    public static RequestedMiniApp valueOf(String str) {
        return (RequestedMiniApp) Enum.valueOf(RequestedMiniApp.class, str);
    }

    public static RequestedMiniApp[] values() {
        return (RequestedMiniApp[]) $VALUES.clone();
    }
}
