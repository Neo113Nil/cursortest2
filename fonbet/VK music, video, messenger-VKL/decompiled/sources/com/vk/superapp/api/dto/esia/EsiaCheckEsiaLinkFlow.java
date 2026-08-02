package com.vk.superapp.api.dto.esia;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EsiaCheckEsiaLinkFlow.kt */
/* loaded from: classes6.dex */
public final class EsiaCheckEsiaLinkFlow {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EsiaCheckEsiaLinkFlow[] $VALUES;
    public static final EsiaCheckEsiaLinkFlow LOGIN;
    public static final EsiaCheckEsiaLinkFlow VERIFY;

    static {
        EsiaCheckEsiaLinkFlow esiaCheckEsiaLinkFlow = new EsiaCheckEsiaLinkFlow("LOGIN", 0);
        LOGIN = esiaCheckEsiaLinkFlow;
        EsiaCheckEsiaLinkFlow esiaCheckEsiaLinkFlow2 = new EsiaCheckEsiaLinkFlow("VERIFY", 1);
        VERIFY = esiaCheckEsiaLinkFlow2;
        EsiaCheckEsiaLinkFlow[] esiaCheckEsiaLinkFlowArr = {esiaCheckEsiaLinkFlow, esiaCheckEsiaLinkFlow2};
        $VALUES = esiaCheckEsiaLinkFlowArr;
        $ENTRIES = new asp(esiaCheckEsiaLinkFlowArr);
    }

    public EsiaCheckEsiaLinkFlow() {
        throw null;
    }

    public static EsiaCheckEsiaLinkFlow valueOf(String str) {
        return (EsiaCheckEsiaLinkFlow) Enum.valueOf(EsiaCheckEsiaLinkFlow.class, str);
    }

    public static EsiaCheckEsiaLinkFlow[] values() {
        return (EsiaCheckEsiaLinkFlow[]) $VALUES.clone();
    }
}
