package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import defpackage.a70;
import defpackage.ljg;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class B4 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final Class a(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -60641721:
                if (str.equals("crashReporting")) {
                    return CrashConfig.class;
                }
                break;
            case 96432:
                if (str.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
                    return AdConfig.class;
                }
                break;
            case 3506402:
                if (str.equals("root")) {
                    return RootConfig.class;
                }
                break;
            case 780346297:
                if (str.equals("telemetry")) {
                    return TelemetryConfig.class;
                }
                break;
            case 2088265419:
                if (str.equals("signals")) {
                    return SignalsConfig.class;
                }
                break;
        }
        a70.p("Type: ".concat(str));
        return null;
    }

    public static final String a(Class cls) {
        cls.getClass();
        if (Intrinsics.c(cls, RootConfig.class)) {
            return "root";
        }
        if (Intrinsics.c(cls, AdConfig.class)) {
            return com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS;
        }
        if (Intrinsics.c(cls, TelemetryConfig.class)) {
            return "telemetry";
        }
        if (Intrinsics.c(cls, SignalsConfig.class)) {
            return "signals";
        }
        if (Intrinsics.c(cls, CrashConfig.class)) {
            return "crashReporting";
        }
        a70.p(ljg.l(cls, "Type: "));
        return null;
    }
}
