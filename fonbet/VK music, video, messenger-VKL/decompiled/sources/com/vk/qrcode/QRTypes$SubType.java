package com.vk.qrcode;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QRTypes.kt */
/* loaded from: classes5.dex */
public final class QRTypes$SubType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ QRTypes$SubType[] $VALUES;
    public static final QRTypes$SubType LINK_ARTICLE;
    public static final QRTypes$SubType LINK_CHANNEL;
    public static final QRTypes$SubType LINK_CLIP;
    public static final QRTypes$SubType LINK_CLIPS_HASHTAG;
    public static final QRTypes$SubType LINK_EXTERNAL;
    public static final QRTypes$SubType LINK_GROUP;
    public static final QRTypes$SubType LINK_GROUP_CHAT;
    public static final QRTypes$SubType LINK_INNER;
    public static final QRTypes$SubType LINK_MONEY_TRANSFER;
    public static final QRTypes$SubType LINK_POST;
    public static final QRTypes$SubType LINK_QR_AUTH;
    public static final QRTypes$SubType LINK_USER;
    public static final QRTypes$SubType LINK_VK_APP;
    public static final QRTypes$SubType LINK_VK_EVENT;
    public static final QRTypes$SubType LINK_VK_ME;
    public static final QRTypes$SubType LINK_VK_PAY;
    public static final QRTypes$SubType NONE;
    private final String param;

    static {
        QRTypes$SubType qRTypes$SubType = new QRTypes$SubType("NONE", 0, "");
        NONE = qRTypes$SubType;
        QRTypes$SubType qRTypes$SubType2 = new QRTypes$SubType("LINK_EXTERNAL", 1, "external_link");
        LINK_EXTERNAL = qRTypes$SubType2;
        QRTypes$SubType qRTypes$SubType3 = new QRTypes$SubType("LINK_USER", 2, "user");
        LINK_USER = qRTypes$SubType3;
        QRTypes$SubType qRTypes$SubType4 = new QRTypes$SubType("LINK_GROUP", 3, "group");
        LINK_GROUP = qRTypes$SubType4;
        QRTypes$SubType qRTypes$SubType5 = new QRTypes$SubType("LINK_POST", 4, "post");
        LINK_POST = qRTypes$SubType5;
        QRTypes$SubType qRTypes$SubType6 = new QRTypes$SubType("LINK_ARTICLE", 5, "article");
        LINK_ARTICLE = qRTypes$SubType6;
        QRTypes$SubType qRTypes$SubType7 = new QRTypes$SubType("LINK_VK_APP", 6, "vk_app");
        LINK_VK_APP = qRTypes$SubType7;
        QRTypes$SubType qRTypes$SubType8 = new QRTypes$SubType("LINK_VK_ME", 7, "vk_me");
        LINK_VK_ME = qRTypes$SubType8;
        QRTypes$SubType qRTypes$SubType9 = new QRTypes$SubType("LINK_INNER", 8, "inner_link");
        LINK_INNER = qRTypes$SubType9;
        QRTypes$SubType qRTypes$SubType10 = new QRTypes$SubType("LINK_MONEY_TRANSFER", 9, "money_transfer");
        LINK_MONEY_TRANSFER = qRTypes$SubType10;
        QRTypes$SubType qRTypes$SubType11 = new QRTypes$SubType("LINK_VK_PAY", 10, "vkpay");
        LINK_VK_PAY = qRTypes$SubType11;
        QRTypes$SubType qRTypes$SubType12 = new QRTypes$SubType("LINK_VK_EVENT", 11, "vk_event");
        LINK_VK_EVENT = qRTypes$SubType12;
        QRTypes$SubType qRTypes$SubType13 = new QRTypes$SubType("LINK_GROUP_CHAT", 12, "group_chat");
        LINK_GROUP_CHAT = qRTypes$SubType13;
        QRTypes$SubType qRTypes$SubType14 = new QRTypes$SubType("LINK_CHANNEL", 13, "channel");
        LINK_CHANNEL = qRTypes$SubType14;
        QRTypes$SubType qRTypes$SubType15 = new QRTypes$SubType("LINK_CLIP", 14, "clip");
        LINK_CLIP = qRTypes$SubType15;
        QRTypes$SubType qRTypes$SubType16 = new QRTypes$SubType("LINK_CLIPS_HASHTAG", 15, "clips_hashtag");
        LINK_CLIPS_HASHTAG = qRTypes$SubType16;
        QRTypes$SubType qRTypes$SubType17 = new QRTypes$SubType("LINK_QR_AUTH", 16, "qr_auth");
        LINK_QR_AUTH = qRTypes$SubType17;
        QRTypes$SubType[] qRTypes$SubTypeArr = {qRTypes$SubType, qRTypes$SubType2, qRTypes$SubType3, qRTypes$SubType4, qRTypes$SubType5, qRTypes$SubType6, qRTypes$SubType7, qRTypes$SubType8, qRTypes$SubType9, qRTypes$SubType10, qRTypes$SubType11, qRTypes$SubType12, qRTypes$SubType13, qRTypes$SubType14, qRTypes$SubType15, qRTypes$SubType16, qRTypes$SubType17};
        $VALUES = qRTypes$SubTypeArr;
        $ENTRIES = new asp(qRTypes$SubTypeArr);
    }

    public QRTypes$SubType(String str, int i, String str2) {
        this.param = str2;
    }

    public static QRTypes$SubType valueOf(String str) {
        return (QRTypes$SubType) Enum.valueOf(QRTypes$SubType.class, str);
    }

    public static QRTypes$SubType[] values() {
        return (QRTypes$SubType[]) $VALUES.clone();
    }

    public final String h() {
        return this.param;
    }
}
