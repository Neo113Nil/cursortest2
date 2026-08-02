package com.vk.api.sdk.utils.clientagent.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: App.kt */
/* loaded from: classes.dex */
public final class App {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ App[] $VALUES;
    public static final App VK;
    public static final App VK_CALLS;
    public static final App VK_DATING;
    public static final App VK_IM;
    public static final App VK_MUSIC;
    public static final App VK_VIDEO;
    private final String serializedName;

    static {
        App app2 = new App("VK", 0, "vk");
        VK = app2;
        App app3 = new App("VK_IM", 1, "vk-me");
        VK_IM = app3;
        App app4 = new App("VK_CALLS", 2, "vk-calls");
        VK_CALLS = app4;
        App app5 = new App("VK_DATING", 3, "vk-dating");
        VK_DATING = app5;
        App app6 = new App("VK_MUSIC", 4, "vk-music");
        VK_MUSIC = app6;
        App app7 = new App("VK_VIDEO", 5, "vk-video");
        VK_VIDEO = app7;
        App[] appArr = {app2, app3, app4, app5, app6, app7};
        $VALUES = appArr;
        $ENTRIES = new asp(appArr);
    }

    public App(String str, int i, String str2) {
        this.serializedName = str2;
    }

    public static App valueOf(String str) {
        return (App) Enum.valueOf(App.class, str);
    }

    public static App[] values() {
        return (App[]) $VALUES.clone();
    }

    public final String h() {
        return this.serializedName;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.serializedName;
    }
}
