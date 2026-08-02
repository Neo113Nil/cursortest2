package com.vk.stat.sak.scheme;

import xsna.asp;
import xsna.b9y;
import xsna.hay;
import xsna.tay;
import xsna.uay;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SchemeStatSak.kt */
/* loaded from: classes11.dex */
public final class SchemeStatSak$BaseOkResponse {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SchemeStatSak$BaseOkResponse[] $VALUES;
    public static final SchemeStatSak$BaseOkResponse OK;
    private final int value = 1;

    /* compiled from: SchemeStatSak.kt */
    public static final class Serializer implements uay<SchemeStatSak$BaseOkResponse> {
        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            return new hay(Integer.valueOf(((SchemeStatSak$BaseOkResponse) obj).value));
        }
    }

    static {
        SchemeStatSak$BaseOkResponse schemeStatSak$BaseOkResponse = new SchemeStatSak$BaseOkResponse();
        OK = schemeStatSak$BaseOkResponse;
        SchemeStatSak$BaseOkResponse[] schemeStatSak$BaseOkResponseArr = {schemeStatSak$BaseOkResponse};
        $VALUES = schemeStatSak$BaseOkResponseArr;
        $ENTRIES = new asp(schemeStatSak$BaseOkResponseArr);
    }

    public static SchemeStatSak$BaseOkResponse valueOf(String str) {
        return (SchemeStatSak$BaseOkResponse) Enum.valueOf(SchemeStatSak$BaseOkResponse.class, str);
    }

    public static SchemeStatSak$BaseOkResponse[] values() {
        return (SchemeStatSak$BaseOkResponse[]) $VALUES.clone();
    }
}
