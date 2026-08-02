package com.vk.auth.modal.qrwithcode;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QrWithCodeAuthErrorType.kt */
/* loaded from: classes15.dex */
public final class QrWithCodeAuthErrorType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ QrWithCodeAuthErrorType[] $VALUES;
    public static final QrWithCodeAuthErrorType CodeExpired;
    public static final QrWithCodeAuthErrorType Generic;
    public static final QrWithCodeAuthErrorType NoInternet;

    static {
        QrWithCodeAuthErrorType qrWithCodeAuthErrorType = new QrWithCodeAuthErrorType("Generic", 0);
        Generic = qrWithCodeAuthErrorType;
        QrWithCodeAuthErrorType qrWithCodeAuthErrorType2 = new QrWithCodeAuthErrorType("NoInternet", 1);
        NoInternet = qrWithCodeAuthErrorType2;
        QrWithCodeAuthErrorType qrWithCodeAuthErrorType3 = new QrWithCodeAuthErrorType("CodeExpired", 2);
        CodeExpired = qrWithCodeAuthErrorType3;
        QrWithCodeAuthErrorType[] qrWithCodeAuthErrorTypeArr = {qrWithCodeAuthErrorType, qrWithCodeAuthErrorType2, qrWithCodeAuthErrorType3};
        $VALUES = qrWithCodeAuthErrorTypeArr;
        $ENTRIES = new asp(qrWithCodeAuthErrorTypeArr);
    }

    public QrWithCodeAuthErrorType() {
        throw null;
    }

    public static QrWithCodeAuthErrorType valueOf(String str) {
        return (QrWithCodeAuthErrorType) Enum.valueOf(QrWithCodeAuthErrorType.class, str);
    }

    public static QrWithCodeAuthErrorType[] values() {
        return (QrWithCodeAuthErrorType[]) $VALUES.clone();
    }
}
