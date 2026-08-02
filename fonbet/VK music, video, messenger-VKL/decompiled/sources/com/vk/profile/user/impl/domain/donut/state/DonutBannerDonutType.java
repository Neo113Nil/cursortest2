package com.vk.profile.user.impl.domain.donut.state;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutBannerState.kt */
/* loaded from: classes5.dex */
public final class DonutBannerDonutType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DonutBannerDonutType[] $VALUES;
    public static final DonutBannerDonutType Goals;
    public static final DonutBannerDonutType Regular;

    static {
        DonutBannerDonutType donutBannerDonutType = new DonutBannerDonutType("Goals", 0);
        Goals = donutBannerDonutType;
        DonutBannerDonutType donutBannerDonutType2 = new DonutBannerDonutType("Regular", 1);
        Regular = donutBannerDonutType2;
        DonutBannerDonutType[] donutBannerDonutTypeArr = {donutBannerDonutType, donutBannerDonutType2};
        $VALUES = donutBannerDonutTypeArr;
        $ENTRIES = new asp(donutBannerDonutTypeArr);
    }

    public DonutBannerDonutType() {
        throw null;
    }

    public static DonutBannerDonutType valueOf(String str) {
        return (DonutBannerDonutType) Enum.valueOf(DonutBannerDonutType.class, str);
    }

    public static DonutBannerDonutType[] values() {
        return (DonutBannerDonutType[]) $VALUES.clone();
    }
}
