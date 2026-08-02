package com.moloco.sdk.internal;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class o implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c {
    public static final o a = new o("AD_LOAD_LIMIT_REACHED", 0);
    public static final o b = new o("BID_LOAD_ERROR_CANNOT_PROCESS_BID_RESPONSE", 1);
    public static final o c = new o("BID_LOAD_ERROR_PARSE_INVALID_JSON", 2);
    public static final o d = new o("BID_LOAD_ERROR_PARSE_MISSING_REQUIRED_FIELD", 3);
    public static final o e = new o("BID_LOAD_ERROR_CANNOT_PARSE_BID_RESPONSE", 4);
    public static final o f = new o("AD_SHOW_ERROR_NOT_LOADED", 5);
    public static final o g = new o("AD_SHOW_ERROR_ALREADY_DISPLAYING", 6);
    public static final /* synthetic */ o[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        o[] b2 = b();
        h = b2;
        i = EnumEntriesKt.enumEntries(b2);
    }

    public o(String str, int i2) {
    }

    public static final /* synthetic */ o[] b() {
        return new o[]{a, b, c, d, e, f, g};
    }

    public static EnumEntries<o> c() {
        return i;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) h.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }
}
