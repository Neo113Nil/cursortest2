package com.vk.superapp.navigation.api.data;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppShareType.kt */
/* loaded from: classes6.dex */
public final class AppShareType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppShareType[] $VALUES;
    public static final AppShareType COPY_LINK;
    public static final AppShareType CREATE_CHAT;
    public static final AppShareType MESSAGE;
    public static final AppShareType OTHER;
    public static final AppShareType POST;
    public static final AppShareType QR;
    public static final AppShareType STORY;
    public static final AppShareType WALL;
    private final String value;

    static {
        AppShareType appShareType = new AppShareType("POST", 0, "post");
        POST = appShareType;
        AppShareType appShareType2 = new AppShareType("STORY", 1, "story");
        STORY = appShareType2;
        AppShareType appShareType3 = new AppShareType("MESSAGE", 2, "message");
        MESSAGE = appShareType3;
        AppShareType appShareType4 = new AppShareType("QR", 3, "qr");
        QR = appShareType4;
        AppShareType appShareType5 = new AppShareType("COPY_LINK", 4, "copy_link");
        COPY_LINK = appShareType5;
        AppShareType appShareType6 = new AppShareType(NativeAdContent.ViewTag.OTHER, 5, "other");
        OTHER = appShareType6;
        AppShareType appShareType7 = new AppShareType("CREATE_CHAT", 6, "create_chat");
        CREATE_CHAT = appShareType7;
        AppShareType appShareType8 = new AppShareType("WALL", 7, "wall");
        WALL = appShareType8;
        AppShareType[] appShareTypeArr = {appShareType, appShareType2, appShareType3, appShareType4, appShareType5, appShareType6, appShareType7, appShareType8};
        $VALUES = appShareTypeArr;
        $ENTRIES = new asp(appShareTypeArr);
    }

    public AppShareType(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppShareType valueOf(String str) {
        return (AppShareType) Enum.valueOf(AppShareType.class, str);
    }

    public static AppShareType[] values() {
        return (AppShareType[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
