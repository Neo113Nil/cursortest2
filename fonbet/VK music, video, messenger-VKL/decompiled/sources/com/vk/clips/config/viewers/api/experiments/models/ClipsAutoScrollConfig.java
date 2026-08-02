package com.vk.clips.config.viewers.api.experiments.models;

import org.json.JSONObject;
import xsna.asp;
import xsna.epx;
import xsna.shy;
import xsna.vu5;
import xsna.zrp;

/* compiled from: ClipsAutoScrollConfig.kt */
/* loaded from: classes16.dex */
public final class ClipsAutoScrollConfig {
    public static final ResetPeriod g;
    public static final AdBehavior h;
    public static final ClipsAutoScrollConfig i;
    public final boolean a;
    public final ResetPeriod b;
    public final AdBehavior c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsAutoScrollConfig.kt */
    public static final class AdBehavior {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AdBehavior[] $VALUES;
        public static final AdBehavior BACK_SCREEN_TIMEOUT;
        public static final AdBehavior SCROLL_AS_CONTENT;
        private final String value;

        static {
            AdBehavior adBehavior = new AdBehavior("SCROLL_AS_CONTENT", 0, "SCROLL_AS_CONTENT");
            SCROLL_AS_CONTENT = adBehavior;
            AdBehavior adBehavior2 = new AdBehavior("BACK_SCREEN_TIMEOUT", 1, "BACK_SCREEN_TIMEOUT");
            BACK_SCREEN_TIMEOUT = adBehavior2;
            AdBehavior[] adBehaviorArr = {adBehavior, adBehavior2};
            $VALUES = adBehaviorArr;
            $ENTRIES = new asp(adBehaviorArr);
        }

        public AdBehavior(String str, int i, String str2) {
            this.value = str2;
        }

        public static AdBehavior valueOf(String str) {
            return (AdBehavior) Enum.valueOf(AdBehavior.class, str);
        }

        public static AdBehavior[] values() {
            return (AdBehavior[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsAutoScrollConfig.kt */
    public static final class ResetPeriod {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ResetPeriod[] $VALUES;
        public static final ResetPeriod DAY;
        public static final ResetPeriod N_DAYS;
        public static final ResetPeriod SESSION;
        public static final ResetPeriod WEEK;
        private final String value;

        static {
            ResetPeriod resetPeriod = new ResetPeriod("SESSION", 0, "SESSION");
            SESSION = resetPeriod;
            ResetPeriod resetPeriod2 = new ResetPeriod("DAY", 1, "DAY");
            DAY = resetPeriod2;
            ResetPeriod resetPeriod3 = new ResetPeriod("N_DAYS", 2, "N_DAYS");
            N_DAYS = resetPeriod3;
            ResetPeriod resetPeriod4 = new ResetPeriod("WEEK", 3, "WEEK");
            WEEK = resetPeriod4;
            ResetPeriod[] resetPeriodArr = {resetPeriod, resetPeriod2, resetPeriod3, resetPeriod4};
            $VALUES = resetPeriodArr;
            $ENTRIES = new asp(resetPeriodArr);
        }

        public ResetPeriod(String str, int i, String str2) {
            this.value = str2;
        }

        public static ResetPeriod valueOf(String str) {
            return (ResetPeriod) Enum.valueOf(ResetPeriod.class, str);
        }

        public static ResetPeriod[] values() {
            return (ResetPeriod[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    /* compiled from: ClipsAutoScrollConfig.kt */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static ClipsAutoScrollConfig a(JSONObject jSONObject, boolean z) {
            int i;
            String optString;
            ResetPeriod resetPeriod;
            String optString2;
            AdBehavior adBehavior;
            int i2;
            ResetPeriod resetPeriod2;
            int i3;
            boolean z2 = false;
            if (z) {
                if (jSONObject != null ? jSONObject.optBoolean("enabled", true) : true) {
                    i = 0;
                    z2 = true;
                    optString = jSONObject == null ? jSONObject.optString("reset_period") : null;
                    resetPeriod = ResetPeriod.SESSION;
                    if (!epx.f(optString, resetPeriod.h())) {
                        resetPeriod = ResetPeriod.DAY;
                        if (!epx.f(optString, resetPeriod.h())) {
                            resetPeriod = ResetPeriod.N_DAYS;
                            if (!epx.f(optString, resetPeriod.h())) {
                                resetPeriod = ResetPeriod.WEEK;
                                if (!epx.f(optString, resetPeriod.h())) {
                                    resetPeriod = ClipsAutoScrollConfig.g;
                                }
                            }
                        }
                    }
                    optString2 = jSONObject != null ? jSONObject.optString("ad_behavior") : null;
                    adBehavior = AdBehavior.SCROLL_AS_CONTENT;
                    if (!epx.f(optString2, adBehavior.h())) {
                        adBehavior = AdBehavior.BACK_SCREEN_TIMEOUT;
                        if (!epx.f(optString2, adBehavior.h())) {
                            adBehavior = ClipsAutoScrollConfig.h;
                        }
                    }
                    AdBehavior adBehavior2 = adBehavior;
                    int optInt = jSONObject == null ? jSONObject.optInt("ad_back_screen_delay_sec", i) : i;
                    int optInt2 = jSONObject != null ? jSONObject.optInt("reset_period_days", 1) : 1;
                    if (jSONObject == null) {
                        ResetPeriod resetPeriod3 = resetPeriod;
                        i2 = optInt2;
                        resetPeriod2 = resetPeriod3;
                        i3 = jSONObject.optInt("static_ad_duration_sec", i);
                    } else {
                        ResetPeriod resetPeriod4 = resetPeriod;
                        i2 = optInt2;
                        resetPeriod2 = resetPeriod4;
                        i3 = i;
                    }
                    return new ClipsAutoScrollConfig(z2, resetPeriod2, adBehavior2, optInt, i2, i3);
                }
            }
            i = 0;
            if (jSONObject == null) {
            }
            resetPeriod = ResetPeriod.SESSION;
            if (!epx.f(optString, resetPeriod.h())) {
            }
            if (jSONObject != null) {
            }
            adBehavior = AdBehavior.SCROLL_AS_CONTENT;
            if (!epx.f(optString2, adBehavior.h())) {
            }
            AdBehavior adBehavior22 = adBehavior;
            if (jSONObject == null) {
            }
            if (jSONObject != null) {
            }
            if (jSONObject == null) {
            }
            return new ClipsAutoScrollConfig(z2, resetPeriod2, adBehavior22, optInt, i2, i3);
        }
    }

    static {
        ResetPeriod resetPeriod = ResetPeriod.SESSION;
        g = resetPeriod;
        AdBehavior adBehavior = AdBehavior.SCROLL_AS_CONTENT;
        h = adBehavior;
        i = new ClipsAutoScrollConfig(false, resetPeriod, adBehavior, 0, 1, 0);
    }

    public ClipsAutoScrollConfig(boolean z, ResetPeriod resetPeriod, AdBehavior adBehavior, int i2, int i3, int i4) {
        this.a = z;
        this.b = resetPeriod;
        this.c = adBehavior;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsAutoScrollConfig)) {
            return false;
        }
        ClipsAutoScrollConfig clipsAutoScrollConfig = (ClipsAutoScrollConfig) obj;
        return this.a == clipsAutoScrollConfig.a && this.b == clipsAutoScrollConfig.b && this.c == clipsAutoScrollConfig.c && this.d == clipsAutoScrollConfig.d && this.e == clipsAutoScrollConfig.e && this.f == clipsAutoScrollConfig.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + shy.a(this.e, shy.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsAutoScrollConfig(isEnabled=");
        sb.append(this.a);
        sb.append(", resetPeriod=");
        sb.append(this.b);
        sb.append(", adBehavior=");
        sb.append(this.c);
        sb.append(", adBackScreenDelaySec=");
        sb.append(this.d);
        sb.append(", resetPeriodDays=");
        sb.append(this.e);
        sb.append(", staticAdDurationSec=");
        return vu5.b(sb, this.f, ')');
    }
}
