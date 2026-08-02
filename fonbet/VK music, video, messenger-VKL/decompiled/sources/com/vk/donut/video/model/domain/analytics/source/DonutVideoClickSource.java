package com.vk.donut.video.model.domain.analytics.source;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutVideoClickSource.kt */
/* loaded from: classes18.dex */
public final class DonutVideoClickSource {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DonutVideoClickSource[] $VALUES;
    public static final DonutVideoClickSource DESCRIPTION;
    public static final DonutVideoClickSource PAYWALL;
    private final String value;

    static {
        DonutVideoClickSource donutVideoClickSource = new DonutVideoClickSource("PAYWALL", 0, "donut_video_paywall");
        PAYWALL = donutVideoClickSource;
        DonutVideoClickSource donutVideoClickSource2 = new DonutVideoClickSource(NativeAdContent.ViewTag.AD_DESCRIPTION, 1, "donut_video_description");
        DESCRIPTION = donutVideoClickSource2;
        DonutVideoClickSource[] donutVideoClickSourceArr = {donutVideoClickSource, donutVideoClickSource2};
        $VALUES = donutVideoClickSourceArr;
        $ENTRIES = new asp(donutVideoClickSourceArr);
    }

    public DonutVideoClickSource(String str, int i, String str2) {
        this.value = str2;
    }

    public static DonutVideoClickSource valueOf(String str) {
        return (DonutVideoClickSource) Enum.valueOf(DonutVideoClickSource.class, str);
    }

    public static DonutVideoClickSource[] values() {
        return (DonutVideoClickSource[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
