package com.vk.im.mediascope;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Feature.kt */
/* loaded from: classes2.dex */
public final class Feature {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Feature[] $VALUES;
    public static final Feature MESSENGER;
    private final int id = 2;

    static {
        Feature feature = new Feature();
        MESSENGER = feature;
        Feature[] featureArr = {feature};
        $VALUES = featureArr;
        $ENTRIES = new asp(featureArr);
    }

    public static Feature valueOf(String str) {
        return (Feature) Enum.valueOf(Feature.class, str);
    }

    public static Feature[] values() {
        return (Feature[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }
}
