package com.vk.push.pushsdk;

import android.app.Application;
import xsna.bh10;
import xsna.epx;
import xsna.n23;
import xsna.uqi;
import xsna.yhe0;

/* compiled from: VkpnsPushConfig.kt */
/* loaded from: classes.dex */
public final class VkpnsPushConfig {
    public final Application a;
    public final uqi b;
    public final yhe0 c;
    public final boolean d;
    public final long e;
    public final BackgroundWorkMode f;
    public final boolean g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkpnsPushConfig.kt */
    public static final class BackgroundWorkMode {
        private static final /* synthetic */ BackgroundWorkMode[] $VALUES;
        public static final BackgroundWorkMode SERVICE_ONLY;
        public static final BackgroundWorkMode SERVICE_WITH_PERIODIC_WORKER;

        static {
            BackgroundWorkMode backgroundWorkMode = new BackgroundWorkMode("SERVICE_ONLY", 0);
            SERVICE_ONLY = backgroundWorkMode;
            BackgroundWorkMode backgroundWorkMode2 = new BackgroundWorkMode("SERVICE_WITH_PERIODIC_WORKER", 1);
            SERVICE_WITH_PERIODIC_WORKER = backgroundWorkMode2;
            $VALUES = new BackgroundWorkMode[]{backgroundWorkMode, backgroundWorkMode2};
        }

        public BackgroundWorkMode() {
            throw null;
        }

        public static BackgroundWorkMode valueOf(String str) {
            return (BackgroundWorkMode) Enum.valueOf(BackgroundWorkMode.class, str);
        }

        public static BackgroundWorkMode[] values() {
            return (BackgroundWorkMode[]) $VALUES.clone();
        }
    }

    public VkpnsPushConfig(Application application, yhe0 yhe0Var, boolean z, BackgroundWorkMode backgroundWorkMode) {
        uqi uqiVar = new uqi();
        this.a = application;
        this.b = uqiVar;
        this.c = yhe0Var;
        this.d = z;
        this.e = 300000L;
        this.f = backgroundWorkMode;
        this.g = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkpnsPushConfig)) {
            return false;
        }
        VkpnsPushConfig vkpnsPushConfig = (VkpnsPushConfig) obj;
        return epx.f(this.a, vkpnsPushConfig.a) && epx.f(this.b, vkpnsPushConfig.b) && epx.f(this.c, vkpnsPushConfig.c) && this.d == vkpnsPushConfig.d && this.e == vkpnsPushConfig.e && this.f == vkpnsPushConfig.f && this.g == vkpnsPushConfig.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 961)) * 31)) * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (this.f.hashCode() + bh10.a((hashCode + i) * 923521, 31, this.e)) * 961;
        boolean z2 = this.g;
        return (hashCode2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkpnsPushConfig(application=");
        sb.append(this.a);
        sb.append(", notificationFactory=null, analyticsCallback=");
        sb.append(this.b);
        sb.append(", logger=");
        sb.append(this.c);
        sb.append(", sdkEnabled=");
        sb.append(this.d);
        sb.append(", pusherHostInfoProvider=null, websocketHostInfoProvider=null, allowForegroundService=false, fetchMessagesViaHttpInterval=");
        sb.append(this.e);
        sb.append(", backgroundWorkMode=");
        sb.append(this.f);
        sb.append(", testModeEnabled=false, useNetworkConnectionCheckByGoogle=");
        return n23.b(sb, this.g, ", serviceStartDeferred=false)");
    }
}
