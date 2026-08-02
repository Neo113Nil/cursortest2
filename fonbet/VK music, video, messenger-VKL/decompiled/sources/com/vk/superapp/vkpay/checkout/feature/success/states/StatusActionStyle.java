package com.vk.superapp.vkpay.checkout.feature.success.states;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Action.kt */
/* loaded from: classes6.dex */
public final class StatusActionStyle {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StatusActionStyle[] $VALUES;
    public static final StatusActionStyle NO_ACTION;
    public static final StatusActionStyle PRIMARY;
    public static final StatusActionStyle TERTIARY;

    static {
        StatusActionStyle statusActionStyle = new StatusActionStyle("PRIMARY", 0);
        PRIMARY = statusActionStyle;
        StatusActionStyle statusActionStyle2 = new StatusActionStyle("TERTIARY", 1);
        TERTIARY = statusActionStyle2;
        StatusActionStyle statusActionStyle3 = new StatusActionStyle("NO_ACTION", 2);
        NO_ACTION = statusActionStyle3;
        StatusActionStyle[] statusActionStyleArr = {statusActionStyle, statusActionStyle2, statusActionStyle3};
        $VALUES = statusActionStyleArr;
        $ENTRIES = new asp(statusActionStyleArr);
    }

    public StatusActionStyle() {
        throw null;
    }

    public static StatusActionStyle valueOf(String str) {
        return (StatusActionStyle) Enum.valueOf(StatusActionStyle.class, str);
    }

    public static StatusActionStyle[] values() {
        return (StatusActionStyle[]) $VALUES.clone();
    }
}
