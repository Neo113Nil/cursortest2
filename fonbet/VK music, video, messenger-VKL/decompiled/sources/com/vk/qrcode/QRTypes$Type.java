package com.vk.qrcode;

import androidx.core.app.NotificationCompat;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QRTypes.kt */
/* loaded from: classes5.dex */
public final class QRTypes$Type {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ QRTypes$Type[] $VALUES;
    public static final QRTypes$Type BRAND;
    public static final QRTypes$Type CHECK_BACK;
    public static final QRTypes$Type EMAIL;
    public static final QRTypes$Type EVENT;
    public static final QRTypes$Type GEO;
    public static final QRTypes$Type LINK;
    public static final QRTypes$Type ME_CARD;
    public static final QRTypes$Type NONE;
    public static final QRTypes$Type SMS;
    public static final QRTypes$Type TEL;
    public static final QRTypes$Type TEXT;
    public static final QRTypes$Type VC_CARD;
    public static final QRTypes$Type WIFI;
    private final String param;

    static {
        QRTypes$Type qRTypes$Type = new QRTypes$Type("NONE", 0, "none");
        NONE = qRTypes$Type;
        QRTypes$Type qRTypes$Type2 = new QRTypes$Type("LINK", 1, "link");
        LINK = qRTypes$Type2;
        QRTypes$Type qRTypes$Type3 = new QRTypes$Type("CHECK_BACK", 2, "check_back");
        CHECK_BACK = qRTypes$Type3;
        QRTypes$Type qRTypes$Type4 = new QRTypes$Type("WIFI", 3, "wi-fi");
        WIFI = qRTypes$Type4;
        QRTypes$Type qRTypes$Type5 = new QRTypes$Type("VC_CARD", 4, "vcard");
        VC_CARD = qRTypes$Type5;
        QRTypes$Type qRTypes$Type6 = new QRTypes$Type("EVENT", 5, NotificationCompat.CATEGORY_EVENT);
        EVENT = qRTypes$Type6;
        QRTypes$Type qRTypes$Type7 = new QRTypes$Type("GEO", 6, "geo");
        GEO = qRTypes$Type7;
        QRTypes$Type qRTypes$Type8 = new QRTypes$Type("TEL", 7, "tel");
        TEL = qRTypes$Type8;
        QRTypes$Type qRTypes$Type9 = new QRTypes$Type("SMS", 8, "sms");
        SMS = qRTypes$Type9;
        QRTypes$Type qRTypes$Type10 = new QRTypes$Type(CommonConstant.RETKEY.EMAIL, 9, "email");
        EMAIL = qRTypes$Type10;
        QRTypes$Type qRTypes$Type11 = new QRTypes$Type("ME_CARD", 10, "meCard");
        ME_CARD = qRTypes$Type11;
        QRTypes$Type qRTypes$Type12 = new QRTypes$Type("TEXT", 11, "text");
        TEXT = qRTypes$Type12;
        QRTypes$Type qRTypes$Type13 = new QRTypes$Type("BRAND", 12, "brand");
        BRAND = qRTypes$Type13;
        QRTypes$Type[] qRTypes$TypeArr = {qRTypes$Type, qRTypes$Type2, qRTypes$Type3, qRTypes$Type4, qRTypes$Type5, qRTypes$Type6, qRTypes$Type7, qRTypes$Type8, qRTypes$Type9, qRTypes$Type10, qRTypes$Type11, qRTypes$Type12, qRTypes$Type13};
        $VALUES = qRTypes$TypeArr;
        $ENTRIES = new asp(qRTypes$TypeArr);
    }

    public QRTypes$Type(String str, int i, String str2) {
        this.param = str2;
    }

    public static QRTypes$Type valueOf(String str) {
        return (QRTypes$Type) Enum.valueOf(QRTypes$Type.class, str);
    }

    public static QRTypes$Type[] values() {
        return (QRTypes$Type[]) $VALUES.clone();
    }

    public final String h() {
        return this.param;
    }
}
