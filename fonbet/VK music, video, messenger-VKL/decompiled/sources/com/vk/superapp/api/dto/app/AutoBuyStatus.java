package com.vk.superapp.api.dto.app;

import com.ironsource.C4217a2;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AutoBuyStatus.kt */
/* loaded from: classes6.dex */
public final class AutoBuyStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AutoBuyStatus[] $VALUES;
    public static final AutoBuyStatus CHECKED;
    public static final AutoBuyStatus DISABLED;
    public static final AutoBuyStatus NULL;
    public static final AutoBuyStatus UNCHECKED;
    private final String fieldName;

    static {
        AutoBuyStatus autoBuyStatus = new AutoBuyStatus("CHECKED", 0, "checked");
        CHECKED = autoBuyStatus;
        AutoBuyStatus autoBuyStatus2 = new AutoBuyStatus("UNCHECKED", 1, "unchecked");
        UNCHECKED = autoBuyStatus2;
        AutoBuyStatus autoBuyStatus3 = new AutoBuyStatus("DISABLED", 2, C4217a2.e);
        DISABLED = autoBuyStatus3;
        AutoBuyStatus autoBuyStatus4 = new AutoBuyStatus("NULL", 3, "null");
        NULL = autoBuyStatus4;
        AutoBuyStatus[] autoBuyStatusArr = {autoBuyStatus, autoBuyStatus2, autoBuyStatus3, autoBuyStatus4};
        $VALUES = autoBuyStatusArr;
        $ENTRIES = new asp(autoBuyStatusArr);
    }

    public AutoBuyStatus(String str, int i, String str2) {
        this.fieldName = str2;
    }

    public static AutoBuyStatus valueOf(String str) {
        return (AutoBuyStatus) Enum.valueOf(AutoBuyStatus.class, str);
    }

    public static AutoBuyStatus[] values() {
        return (AutoBuyStatus[]) $VALUES.clone();
    }
}
