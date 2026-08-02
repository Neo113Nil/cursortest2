package com.vk.voip;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OkApiDomain.kt */
/* loaded from: classes7.dex */
public final class OkApiDomain {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OkApiDomain[] $VALUES;
    public static final OkApiDomain PROD;
    public static final OkApiDomain TEST;
    private final String value;

    static {
        OkApiDomain okApiDomain = new OkApiDomain("PROD", 0, "https://calls.okcdn.ru");
        PROD = okApiDomain;
        OkApiDomain okApiDomain2 = new OkApiDomain("TEST", 1, "https://calls-test.okcdn.ru");
        TEST = okApiDomain2;
        OkApiDomain[] okApiDomainArr = {okApiDomain, okApiDomain2};
        $VALUES = okApiDomainArr;
        $ENTRIES = new asp(okApiDomainArr);
    }

    public OkApiDomain(String str, int i, String str2) {
        this.value = str2;
    }

    public static OkApiDomain valueOf(String str) {
        return (OkApiDomain) Enum.valueOf(OkApiDomain.class, str);
    }

    public static OkApiDomain[] values() {
        return (OkApiDomain[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
