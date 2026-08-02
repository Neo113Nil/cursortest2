package com.vk.dto.common;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InstreamAd.kt */
/* loaded from: classes18.dex */
public final class AdSection {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdSection[] $VALUES;
    public static final a Companion;
    public static final AdSection MIDROLL;
    public static final AdSection POSTROLL;
    public static final AdSection PREROLL;

    /* compiled from: InstreamAd.kt */
    public static final class a {
    }

    static {
        AdSection adSection = new AdSection("PREROLL", 0);
        PREROLL = adSection;
        AdSection adSection2 = new AdSection("MIDROLL", 1);
        MIDROLL = adSection2;
        AdSection adSection3 = new AdSection("POSTROLL", 2);
        POSTROLL = adSection3;
        AdSection[] adSectionArr = {adSection, adSection2, adSection3};
        $VALUES = adSectionArr;
        $ENTRIES = new asp(adSectionArr);
        Companion = new a();
    }

    public AdSection() {
        throw null;
    }

    public static AdSection valueOf(String str) {
        return (AdSection) Enum.valueOf(AdSection.class, str);
    }

    public static AdSection[] values() {
        return (AdSection[]) $VALUES.clone();
    }
}
