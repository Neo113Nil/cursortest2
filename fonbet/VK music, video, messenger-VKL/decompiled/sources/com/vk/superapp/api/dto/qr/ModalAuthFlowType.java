package com.vk.superapp.api.dto.qr;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QrInfoResponse.kt */
/* loaded from: classes6.dex */
public final class ModalAuthFlowType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ModalAuthFlowType[] $VALUES;
    public static final a Companion;
    public static final ModalAuthFlowType MvkAuthFlow;
    public static final ModalAuthFlowType QrAuthFlow;
    public static final ModalAuthFlowType TvCodeAuthFlow;

    /* compiled from: QrInfoResponse.kt */
    public static final class a {
    }

    static {
        ModalAuthFlowType modalAuthFlowType = new ModalAuthFlowType("QrAuthFlow", 0);
        QrAuthFlow = modalAuthFlowType;
        ModalAuthFlowType modalAuthFlowType2 = new ModalAuthFlowType("MvkAuthFlow", 1);
        MvkAuthFlow = modalAuthFlowType2;
        ModalAuthFlowType modalAuthFlowType3 = new ModalAuthFlowType("TvCodeAuthFlow", 2);
        TvCodeAuthFlow = modalAuthFlowType3;
        ModalAuthFlowType[] modalAuthFlowTypeArr = {modalAuthFlowType, modalAuthFlowType2, modalAuthFlowType3};
        $VALUES = modalAuthFlowTypeArr;
        $ENTRIES = new asp(modalAuthFlowTypeArr);
        Companion = new a();
    }

    public ModalAuthFlowType() {
        throw null;
    }

    public static ModalAuthFlowType valueOf(String str) {
        return (ModalAuthFlowType) Enum.valueOf(ModalAuthFlowType.class, str);
    }

    public static ModalAuthFlowType[] values() {
        return (ModalAuthFlowType[]) $VALUES.clone();
    }
}
