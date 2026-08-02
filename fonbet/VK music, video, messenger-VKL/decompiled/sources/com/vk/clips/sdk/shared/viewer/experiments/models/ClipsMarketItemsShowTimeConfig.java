package com.vk.clips.sdk.shared.viewer.experiments.models;

import org.json.JSONObject;
import xsna.asp;
import xsna.ojp0;
import xsna.zrp;

/* compiled from: ClipsMarketItemsShowTimeConfig.kt */
/* loaded from: classes17.dex */
public final class ClipsMarketItemsShowTimeConfig {
    public static final VisibilityMode d;
    public static final ClipsMarketItemsShowTimeConfig e;
    public final boolean a;
    public final VisibilityMode b;
    public final double c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsMarketItemsShowTimeConfig.kt */
    public static final class VisibilityMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VisibilityMode[] $VALUES;
        public static final VisibilityMode VISIBLE_AFTER_CLICK;
        public static final VisibilityMode VISIBLE_AFTER_PERCENT_PLAYED;
        public static final VisibilityMode VISIBLE_AFTER_TIME;

        static {
            VisibilityMode visibilityMode = new VisibilityMode("VISIBLE_AFTER_CLICK", 0);
            VISIBLE_AFTER_CLICK = visibilityMode;
            VisibilityMode visibilityMode2 = new VisibilityMode("VISIBLE_AFTER_PERCENT_PLAYED", 1);
            VISIBLE_AFTER_PERCENT_PLAYED = visibilityMode2;
            VisibilityMode visibilityMode3 = new VisibilityMode("VISIBLE_AFTER_TIME", 2);
            VISIBLE_AFTER_TIME = visibilityMode3;
            VisibilityMode[] visibilityModeArr = {visibilityMode, visibilityMode2, visibilityMode3};
            $VALUES = visibilityModeArr;
            $ENTRIES = new asp(visibilityModeArr);
        }

        public VisibilityMode() {
            throw null;
        }

        public static VisibilityMode valueOf(String str) {
            return (VisibilityMode) Enum.valueOf(VisibilityMode.class, str);
        }

        public static VisibilityMode[] values() {
            return (VisibilityMode[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipsMarketItemsShowTimeConfig.kt */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static ClipsMarketItemsShowTimeConfig a(JSONObject jSONObject, boolean z) {
            VisibilityMode visibilityMode;
            String optString = jSONObject != null ? jSONObject.optString("showType", "C_after_show_time") : null;
            if (optString != null) {
                int hashCode = optString.hashCode();
                if (hashCode != -2063397785) {
                    if (hashCode != 2042651880) {
                        if (hashCode == 2083738672 && optString.equals("C_after_show_time")) {
                            visibilityMode = VisibilityMode.VISIBLE_AFTER_TIME;
                        }
                    } else if (optString.equals("B_after_click")) {
                        visibilityMode = VisibilityMode.VISIBLE_AFTER_CLICK;
                    }
                } else if (optString.equals("D_after_percent_of_video_played")) {
                    visibilityMode = VisibilityMode.VISIBLE_AFTER_PERCENT_PLAYED;
                }
                return new ClipsMarketItemsShowTimeConfig(z, visibilityMode, jSONObject != null ? jSONObject.optDouble("showTime", 1.5d) : 1.5d);
            }
            visibilityMode = ClipsMarketItemsShowTimeConfig.d;
            return new ClipsMarketItemsShowTimeConfig(z, visibilityMode, jSONObject != null ? jSONObject.optDouble("showTime", 1.5d) : 1.5d);
        }
    }

    static {
        VisibilityMode visibilityMode = VisibilityMode.VISIBLE_AFTER_TIME;
        d = visibilityMode;
        e = new ClipsMarketItemsShowTimeConfig(false, visibilityMode, 1.5d);
    }

    public ClipsMarketItemsShowTimeConfig(boolean z, VisibilityMode visibilityMode, double d2) {
        this.a = z;
        this.b = visibilityMode;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsMarketItemsShowTimeConfig)) {
            return false;
        }
        ClipsMarketItemsShowTimeConfig clipsMarketItemsShowTimeConfig = (ClipsMarketItemsShowTimeConfig) obj;
        return this.a == clipsMarketItemsShowTimeConfig.a && this.b == clipsMarketItemsShowTimeConfig.b && Double.compare(this.c, clipsMarketItemsShowTimeConfig.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsMarketItemsShowTimeConfig(isEnabled=");
        sb.append(this.a);
        sb.append(", visibilityMode=");
        sb.append(this.b);
        sb.append(", showTime=");
        return ojp0.a(sb, this.c, ')');
    }
}
