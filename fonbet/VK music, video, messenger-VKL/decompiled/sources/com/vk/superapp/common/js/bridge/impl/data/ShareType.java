package com.vk.superapp.common.js.bridge.impl.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShareType.kt */
/* loaded from: classes6.dex */
public final class ShareType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShareType[] $VALUES;
    public static final a Companion;
    public static final ShareType INSTAGRAM;
    public static final ShareType NATIVE;
    public static final ShareType SMS;
    public static final ShareType VK;
    private final String type;

    /* compiled from: ShareType.kt */
    public static final class a {
    }

    static {
        ShareType shareType = new ShareType("VK", 0, "vk");
        VK = shareType;
        ShareType shareType2 = new ShareType("NATIVE", 1, "native");
        NATIVE = shareType2;
        ShareType shareType3 = new ShareType("SMS", 2, "sms");
        SMS = shareType3;
        ShareType shareType4 = new ShareType("INSTAGRAM", 3, "instagram");
        INSTAGRAM = shareType4;
        ShareType[] shareTypeArr = {shareType, shareType2, shareType3, shareType4};
        $VALUES = shareTypeArr;
        $ENTRIES = new asp(shareTypeArr);
        Companion = new a();
    }

    public ShareType(String str, int i, String str2) {
        this.type = str2;
    }

    public static ShareType valueOf(String str) {
        return (ShareType) Enum.valueOf(ShareType.class, str);
    }

    public static ShareType[] values() {
        return (ShareType[]) $VALUES.clone();
    }

    public final String h() {
        return this.type;
    }
}
