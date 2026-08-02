package com.vk.stat.scheme;

import xsna.asp;
import xsna.b9y;
import xsna.hay;
import xsna.tay;
import xsna.uay;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$BaseOkResponse {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SchemeStat$BaseOkResponse[] $VALUES;
    public static final SchemeStat$BaseOkResponse OK;
    private final int value = 1;

    /* compiled from: SchemeStat.kt */
    public static final class Serializer implements uay<SchemeStat$BaseOkResponse> {
        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            return new hay(Integer.valueOf(((SchemeStat$BaseOkResponse) obj).value));
        }
    }

    static {
        SchemeStat$BaseOkResponse schemeStat$BaseOkResponse = new SchemeStat$BaseOkResponse();
        OK = schemeStat$BaseOkResponse;
        SchemeStat$BaseOkResponse[] schemeStat$BaseOkResponseArr = {schemeStat$BaseOkResponse};
        $VALUES = schemeStat$BaseOkResponseArr;
        $ENTRIES = new asp(schemeStat$BaseOkResponseArr);
    }

    public static SchemeStat$BaseOkResponse valueOf(String str) {
        return (SchemeStat$BaseOkResponse) Enum.valueOf(SchemeStat$BaseOkResponse.class, str);
    }

    public static SchemeStat$BaseOkResponse[] values() {
        return (SchemeStat$BaseOkResponse[]) $VALUES.clone();
    }
}
