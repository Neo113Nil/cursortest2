package com.apm.insight;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.sofascore.model.mvvm.model.Season;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public enum CrashType {
    LAUNCH("launch"),
    JAVA("java"),
    NATIVE(IronSourceConstants.EVENTS_NATIVE),
    ASAN("asan"),
    TSAN("tsan"),
    ANR("anr"),
    BLOCK("block"),
    ENSURE("ensure"),
    DART("dart"),
    CUSTOM_JAVA("custom_java"),
    OOM("oom"),
    ALL(Season.YEAR_ALL_TIME);

    private String mName;

    CrashType(String str) {
        this.mName = str;
    }

    public final String getName() {
        return this.mName;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return getName();
    }
}
