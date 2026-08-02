package com.appsflyer.share.platform_extension;

import defpackage.jp5;
import defpackage.kp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018"}, d2 = {"Lcom/appsflyer/share/platform_extension/Plugin;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "pluginName", "Ljava/lang/String;", "getPluginName", "()Ljava/lang/String;", "NATIVE", "UNITY", "FLUTTER", "REACT_NATIVE", "ADOBE_AIR", "ADOBE_MOBILE", "COCOS_2DX", "CORDOVA", "MPARTICLE", "NATIVE_SCRIPT", "EXPO", "UNREAL", "XAMARIN", "CAPACITOR", "SEGMENT"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Plugin {
    public static final Plugin ADOBE_AIR;
    public static final Plugin ADOBE_MOBILE;
    private static final /* synthetic */ jp5 AFLogger;
    public static final Plugin CAPACITOR;
    public static final Plugin COCOS_2DX;
    public static final Plugin CORDOVA;
    public static final Plugin EXPO;
    public static final Plugin FLUTTER;
    public static final Plugin MPARTICLE;
    public static final Plugin NATIVE;
    public static final Plugin NATIVE_SCRIPT;
    public static final Plugin REACT_NATIVE;
    public static final Plugin SEGMENT;
    public static final Plugin UNITY;
    public static final Plugin UNREAL;
    public static final Plugin XAMARIN;
    private static final /* synthetic */ Plugin[] unregisterClient;

    @NotNull
    private final String pluginName;

    static {
        Plugin plugin = new Plugin("NATIVE", 0, "android_native");
        NATIVE = plugin;
        Plugin plugin2 = new Plugin("UNITY", 1, "android_unity");
        UNITY = plugin2;
        Plugin plugin3 = new Plugin("FLUTTER", 2, "android_flutter");
        FLUTTER = plugin3;
        Plugin plugin4 = new Plugin("REACT_NATIVE", 3, "android_react_native");
        REACT_NATIVE = plugin4;
        Plugin plugin5 = new Plugin("ADOBE_AIR", 4, "android_adobe_air");
        ADOBE_AIR = plugin5;
        Plugin plugin6 = new Plugin("ADOBE_MOBILE", 5, "android_adobe_mobile");
        ADOBE_MOBILE = plugin6;
        Plugin plugin7 = new Plugin("COCOS_2DX", 6, "android_cocos2dx");
        COCOS_2DX = plugin7;
        Plugin plugin8 = new Plugin("CORDOVA", 7, "android_cordova");
        CORDOVA = plugin8;
        Plugin plugin9 = new Plugin("MPARTICLE", 8, "android_mparticle");
        MPARTICLE = plugin9;
        Plugin plugin10 = new Plugin("NATIVE_SCRIPT", 9, "android_native_script");
        NATIVE_SCRIPT = plugin10;
        Plugin plugin11 = new Plugin("EXPO", 10, "android_expo");
        EXPO = plugin11;
        Plugin plugin12 = new Plugin("UNREAL", 11, "android_unreal");
        UNREAL = plugin12;
        Plugin plugin13 = new Plugin("XAMARIN", 12, "android_xamarin");
        XAMARIN = plugin13;
        Plugin plugin14 = new Plugin("CAPACITOR", 13, "android_capacitor");
        CAPACITOR = plugin14;
        Plugin plugin15 = new Plugin("SEGMENT", 14, "android_segment");
        SEGMENT = plugin15;
        Plugin[] pluginArr = {plugin, plugin2, plugin3, plugin4, plugin5, plugin6, plugin7, plugin8, plugin9, plugin10, plugin11, plugin12, plugin13, plugin14, plugin15};
        unregisterClient = pluginArr;
        AFLogger = new kp5(pluginArr);
    }

    private Plugin(String str, int i, String str2) {
        this.pluginName = str2;
    }

    @NotNull
    public static jp5 getEntries() {
        return AFLogger;
    }

    public static Plugin valueOf(String str) {
        return (Plugin) Enum.valueOf(Plugin.class, str);
    }

    public static Plugin[] values() {
        return (Plugin[]) unregisterClient.clone();
    }

    @NotNull
    public final String getPluginName() {
        return this.pluginName;
    }
}
