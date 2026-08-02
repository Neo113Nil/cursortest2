package com.vk.dto.user;

import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ObsceneTextFilter.kt */
/* loaded from: classes.dex */
public final class ObsceneTextFilter {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ObsceneTextFilter[] $VALUES;
    public static final a Companion;
    public static final ObsceneTextFilter DISABLED;
    public static final ObsceneTextFilter ENABLED;
    public static final ObsceneTextFilter UNAVAILABLE;

    /* compiled from: ObsceneTextFilter.kt */
    public static final class a {
        public static ObsceneTextFilter a(Boolean bool) {
            return epx.f(bool, Boolean.TRUE) ? ObsceneTextFilter.ENABLED : epx.f(bool, Boolean.FALSE) ? ObsceneTextFilter.DISABLED : ObsceneTextFilter.UNAVAILABLE;
        }
    }

    /* compiled from: ObsceneTextFilter.kt */
    /* loaded from: classes18.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ObsceneTextFilter.values().length];
            try {
                iArr[ObsceneTextFilter.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ObsceneTextFilter.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        ObsceneTextFilter obsceneTextFilter = new ObsceneTextFilter("ENABLED", 0);
        ENABLED = obsceneTextFilter;
        ObsceneTextFilter obsceneTextFilter2 = new ObsceneTextFilter("DISABLED", 1);
        DISABLED = obsceneTextFilter2;
        ObsceneTextFilter obsceneTextFilter3 = new ObsceneTextFilter("UNAVAILABLE", 2);
        UNAVAILABLE = obsceneTextFilter3;
        ObsceneTextFilter[] obsceneTextFilterArr = {obsceneTextFilter, obsceneTextFilter2, obsceneTextFilter3};
        $VALUES = obsceneTextFilterArr;
        $ENTRIES = new asp(obsceneTextFilterArr);
        Companion = new a();
    }

    public ObsceneTextFilter() {
        throw null;
    }

    public static ObsceneTextFilter valueOf(String str) {
        return (ObsceneTextFilter) Enum.valueOf(ObsceneTextFilter.class, str);
    }

    public static ObsceneTextFilter[] values() {
        return (ObsceneTextFilter[]) $VALUES.clone();
    }
}
