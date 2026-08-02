package com.vk.donut.video.model.domain.analytics.source;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutVideoScreenSource.kt */
/* loaded from: classes18.dex */
public final class DonutVideoScreenSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DonutVideoScreenSource[] $VALUES;
    public static final DonutVideoScreenSource VK_VIDEO;
    private final String value = "vk_video";

    static {
        DonutVideoScreenSource donutVideoScreenSource = new DonutVideoScreenSource();
        VK_VIDEO = donutVideoScreenSource;
        DonutVideoScreenSource[] donutVideoScreenSourceArr = {donutVideoScreenSource};
        $VALUES = donutVideoScreenSourceArr;
        $ENTRIES = new asp(donutVideoScreenSourceArr);
    }

    public static DonutVideoScreenSource valueOf(String str) {
        return (DonutVideoScreenSource) Enum.valueOf(DonutVideoScreenSource.class, str);
    }

    public static DonutVideoScreenSource[] values() {
        return (DonutVideoScreenSource[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
