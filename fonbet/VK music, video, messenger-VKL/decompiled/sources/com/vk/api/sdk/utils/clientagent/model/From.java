package com.vk.api.sdk.utils.clientagent.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: From.kt */
/* loaded from: classes.dex */
public final class From {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ From[] $VALUES;
    public static final From EXTENSION;
    public static final From MOBILE;
    public static final From TABLET;
    public static final From TV;
    public static final From WIDGET;
    private final String serializedName;

    static {
        From from = new From("MOBILE", 0, "mobile");
        MOBILE = from;
        From from2 = new From("TABLET", 1, "tablet");
        TABLET = from2;
        From from3 = new From("TV", 2, "tv");
        TV = from3;
        From from4 = new From("WIDGET", 3, "widget");
        WIDGET = from4;
        From from5 = new From("EXTENSION", 4, "extension");
        EXTENSION = from5;
        From[] fromArr = {from, from2, from3, from4, from5};
        $VALUES = fromArr;
        $ENTRIES = new asp(fromArr);
    }

    public From(String str, int i, String str2) {
        this.serializedName = str2;
    }

    public static From valueOf(String str) {
        return (From) Enum.valueOf(From.class, str);
    }

    public static From[] values() {
        return (From[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.serializedName;
    }
}
