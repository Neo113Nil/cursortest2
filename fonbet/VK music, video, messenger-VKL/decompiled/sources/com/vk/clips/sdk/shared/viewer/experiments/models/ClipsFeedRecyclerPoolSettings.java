package com.vk.clips.sdk.shared.viewer.experiments.models;

import org.json.JSONObject;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* compiled from: ClipsFeedRecyclerPoolSettings.kt */
/* loaded from: classes17.dex */
public final class ClipsFeedRecyclerPoolSettings {
    public static final InflateMode b;
    public static final ClipsFeedRecyclerPoolSettings c;
    public final InflateMode a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsFeedRecyclerPoolSettings.kt */
    public static final class InflateMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InflateMode[] $VALUES;
        public static final InflateMode ASYNC_EARLY_CONSUME;
        public static final InflateMode EARLY_NON_BLOCKING_CONSUME;

        static {
            InflateMode inflateMode = new InflateMode("ASYNC_EARLY_CONSUME", 0);
            ASYNC_EARLY_CONSUME = inflateMode;
            InflateMode inflateMode2 = new InflateMode("EARLY_NON_BLOCKING_CONSUME", 1);
            EARLY_NON_BLOCKING_CONSUME = inflateMode2;
            InflateMode[] inflateModeArr = {inflateMode, inflateMode2};
            $VALUES = inflateModeArr;
            $ENTRIES = new asp(inflateModeArr);
        }

        public InflateMode() {
            throw null;
        }

        public static InflateMode valueOf(String str) {
            return (InflateMode) Enum.valueOf(InflateMode.class, str);
        }

        public static InflateMode[] values() {
            return (InflateMode[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipsFeedRecyclerPoolSettings.kt */
    public static final class a {
        public static ClipsFeedRecyclerPoolSettings a() {
            return ClipsFeedRecyclerPoolSettings.c;
        }

        public static ClipsFeedRecyclerPoolSettings b(JSONObject jSONObject) {
            return new ClipsFeedRecyclerPoolSettings(epx.f(jSONObject.optString("inflate_mode", "async_early_consume"), "non_blocking") ? InflateMode.EARLY_NON_BLOCKING_CONSUME : ClipsFeedRecyclerPoolSettings.b);
        }
    }

    static {
        InflateMode inflateMode = InflateMode.ASYNC_EARLY_CONSUME;
        b = inflateMode;
        c = new ClipsFeedRecyclerPoolSettings(inflateMode);
    }

    public ClipsFeedRecyclerPoolSettings(InflateMode inflateMode) {
        this.a = inflateMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClipsFeedRecyclerPoolSettings) && this.a == ((ClipsFeedRecyclerPoolSettings) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ClipsFeedRecyclerPoolSettings(inflateMode=" + this.a + ')';
    }
}
