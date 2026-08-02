package com.vk.donut.design.compose.banner;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutBanner.kt */
/* loaded from: classes18.dex */
public final class DonutContentType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DonutContentType[] $VALUES;
    public static final DonutContentType ARTICLE;
    public static final DonutContentType CHAT;
    public static final DonutContentType PODCAST;
    public static final DonutContentType POST;
    public static final DonutContentType VIDEO;

    static {
        DonutContentType donutContentType = new DonutContentType("POST", 0);
        POST = donutContentType;
        DonutContentType donutContentType2 = new DonutContentType(SignalingProtocol.MEDIA_OPTION_VIDEO, 1);
        VIDEO = donutContentType2;
        DonutContentType donutContentType3 = new DonutContentType("CHAT", 2);
        CHAT = donutContentType3;
        DonutContentType donutContentType4 = new DonutContentType("ARTICLE", 3);
        ARTICLE = donutContentType4;
        DonutContentType donutContentType5 = new DonutContentType("PODCAST", 4);
        PODCAST = donutContentType5;
        DonutContentType[] donutContentTypeArr = {donutContentType, donutContentType2, donutContentType3, donutContentType4, donutContentType5};
        $VALUES = donutContentTypeArr;
        $ENTRIES = new asp(donutContentTypeArr);
    }

    public DonutContentType() {
        throw null;
    }

    public static DonutContentType valueOf(String str) {
        return (DonutContentType) Enum.valueOf(DonutContentType.class, str);
    }

    public static DonutContentType[] values() {
        return (DonutContentType[]) $VALUES.clone();
    }
}
