package com.vk.catalog2.common.dto.api.video;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogGetClipDiscover.kt */
/* loaded from: classes16.dex */
public final class ShortVideoType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShortVideoType[] $VALUES;
    public static final ShortVideoType TRENDS;
    private final String type = "short_video_trends";

    static {
        ShortVideoType shortVideoType = new ShortVideoType();
        TRENDS = shortVideoType;
        ShortVideoType[] shortVideoTypeArr = {shortVideoType};
        $VALUES = shortVideoTypeArr;
        $ENTRIES = new asp(shortVideoTypeArr);
    }

    public static ShortVideoType valueOf(String str) {
        return (ShortVideoType) Enum.valueOf(ShortVideoType.class, str);
    }

    public static ShortVideoType[] values() {
        return (ShortVideoType[]) $VALUES.clone();
    }

    public final String h() {
        return this.type;
    }
}
