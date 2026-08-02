package com.vk.dto.clips.upload;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShortVideoCreationFeature.kt */
/* loaded from: classes18.dex */
public final class ShortVideoCreationFeature {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShortVideoCreationFeature[] $VALUES;
    public static final ShortVideoCreationFeature CHANNEL;
    public static final ShortVideoCreationFeature MESSAGE_TO_BC;
    public static final ShortVideoCreationFeature ONLINE_BOOKING;
    private final String type;

    static {
        ShortVideoCreationFeature shortVideoCreationFeature = new ShortVideoCreationFeature("MESSAGE_TO_BC", 0, "message_to_bc");
        MESSAGE_TO_BC = shortVideoCreationFeature;
        ShortVideoCreationFeature shortVideoCreationFeature2 = new ShortVideoCreationFeature("ONLINE_BOOKING", 1, "online_booking");
        ONLINE_BOOKING = shortVideoCreationFeature2;
        ShortVideoCreationFeature shortVideoCreationFeature3 = new ShortVideoCreationFeature("CHANNEL", 2, "channel");
        CHANNEL = shortVideoCreationFeature3;
        ShortVideoCreationFeature[] shortVideoCreationFeatureArr = {shortVideoCreationFeature, shortVideoCreationFeature2, shortVideoCreationFeature3};
        $VALUES = shortVideoCreationFeatureArr;
        $ENTRIES = new asp(shortVideoCreationFeatureArr);
    }

    public ShortVideoCreationFeature(String str, int i, String str2) {
        this.type = str2;
    }

    public static ShortVideoCreationFeature valueOf(String str) {
        return (ShortVideoCreationFeature) Enum.valueOf(ShortVideoCreationFeature.class, str);
    }

    public static ShortVideoCreationFeature[] values() {
        return (ShortVideoCreationFeature[]) $VALUES.clone();
    }

    public final String h() {
        return this.type;
    }
}
