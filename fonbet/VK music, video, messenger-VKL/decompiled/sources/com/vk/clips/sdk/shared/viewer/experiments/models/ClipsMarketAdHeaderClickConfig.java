package com.vk.clips.sdk.shared.viewer.experiments.models;

import org.json.JSONObject;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* compiled from: ClipsMarketAdHeaderClickConfig.kt */
/* loaded from: classes17.dex */
public final class ClipsMarketAdHeaderClickConfig {
    public static final ClipsMarketAdHeaderClickConfig c = new ClipsMarketAdHeaderClickConfig(false, HeaderType.DEFAULT);
    public final boolean a;
    public final HeaderType b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsMarketAdHeaderClickConfig.kt */
    public static final class HeaderType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HeaderType[] $VALUES;
        public static final HeaderType DEFAULT;
        public static final HeaderType HIDDEN;
        public static final HeaderType NOT_CLICKABLE;

        static {
            HeaderType headerType = new HeaderType("NOT_CLICKABLE", 0);
            NOT_CLICKABLE = headerType;
            HeaderType headerType2 = new HeaderType("HIDDEN", 1);
            HIDDEN = headerType2;
            HeaderType headerType3 = new HeaderType("DEFAULT", 2);
            DEFAULT = headerType3;
            HeaderType[] headerTypeArr = {headerType, headerType2, headerType3};
            $VALUES = headerTypeArr;
            $ENTRIES = new asp(headerTypeArr);
        }

        public HeaderType() {
            throw null;
        }

        public static HeaderType valueOf(String str) {
            return (HeaderType) Enum.valueOf(HeaderType.class, str);
        }

        public static HeaderType[] values() {
            return (HeaderType[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipsMarketAdHeaderClickConfig.kt */
    public static final class a {
        public static ClipsMarketAdHeaderClickConfig a(JSONObject jSONObject, boolean z) {
            String optString = jSONObject != null ? jSONObject.optString("header_type") : null;
            return new ClipsMarketAdHeaderClickConfig(z, epx.f(optString, "NOT_CLICKABLE") ? HeaderType.NOT_CLICKABLE : epx.f(optString, "HIDDEN") ? HeaderType.HIDDEN : HeaderType.DEFAULT);
        }
    }

    public ClipsMarketAdHeaderClickConfig(boolean z, HeaderType headerType) {
        this.a = z;
        this.b = headerType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsMarketAdHeaderClickConfig)) {
            return false;
        }
        ClipsMarketAdHeaderClickConfig clipsMarketAdHeaderClickConfig = (ClipsMarketAdHeaderClickConfig) obj;
        return this.a == clipsMarketAdHeaderClickConfig.a && this.b == clipsMarketAdHeaderClickConfig.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ClipsMarketAdHeaderClickConfig(isEnabled=" + this.a + ", headerType=" + this.b + ')';
    }
}
