package com.vk.core.compose.component.alert;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Alert.kt */
/* loaded from: classes17.dex */
public final class Alert$DismissReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Alert$DismissReason[] $VALUES;
    public static final Alert$DismissReason BACK_PRESS;
    public static final Alert$DismissReason TOUCH_OUTSIDE;

    static {
        Alert$DismissReason alert$DismissReason = new Alert$DismissReason("BACK_PRESS", 0);
        BACK_PRESS = alert$DismissReason;
        Alert$DismissReason alert$DismissReason2 = new Alert$DismissReason("TOUCH_OUTSIDE", 1);
        TOUCH_OUTSIDE = alert$DismissReason2;
        Alert$DismissReason[] alert$DismissReasonArr = {alert$DismissReason, alert$DismissReason2};
        $VALUES = alert$DismissReasonArr;
        $ENTRIES = new asp(alert$DismissReasonArr);
    }

    public Alert$DismissReason() {
        throw null;
    }

    public static Alert$DismissReason valueOf(String str) {
        return (Alert$DismissReason) Enum.valueOf(Alert$DismissReason.class, str);
    }

    public static Alert$DismissReason[] values() {
        return (Alert$DismissReason[]) $VALUES.clone();
    }
}
