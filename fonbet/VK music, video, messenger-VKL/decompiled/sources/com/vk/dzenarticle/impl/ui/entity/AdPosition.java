package com.vk.dzenarticle.impl.ui.entity;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DzenArticleViewItem.kt */
/* loaded from: classes18.dex */
public final class AdPosition {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdPosition[] $VALUES;
    public static final AdPosition MIDDLE;
    public static final AdPosition TOP;

    static {
        AdPosition adPosition = new AdPosition("TOP", 0);
        TOP = adPosition;
        AdPosition adPosition2 = new AdPosition("MIDDLE", 1);
        MIDDLE = adPosition2;
        AdPosition[] adPositionArr = {adPosition, adPosition2};
        $VALUES = adPositionArr;
        $ENTRIES = new asp(adPositionArr);
    }

    public AdPosition() {
        throw null;
    }

    public static AdPosition valueOf(String str) {
        return (AdPosition) Enum.valueOf(AdPosition.class, str);
    }

    public static AdPosition[] values() {
        return (AdPosition[]) $VALUES.clone();
    }
}
