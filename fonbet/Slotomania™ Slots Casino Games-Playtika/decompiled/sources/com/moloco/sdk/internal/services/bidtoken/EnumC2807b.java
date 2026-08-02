package com.moloco.sdk.internal.services.bidtoken;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.moloco.sdk.internal.services.bidtoken.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC2807b {
    public static final EnumC2807b b = new EnumC2807b("UNKNOWN", 0, -100);
    public static final EnumC2807b c = new EnumC2807b("HTTP_REQUEST_TIMEOUT", 1, -101);
    public static final EnumC2807b d = new EnumC2807b("UNKNOWN_HOST", 2, -102);
    public static final /* synthetic */ EnumC2807b[] e;
    public static final /* synthetic */ EnumEntries f;
    public final int a;

    static {
        EnumC2807b[] a = a();
        e = a;
        f = EnumEntriesKt.enumEntries(a);
    }

    public EnumC2807b(String str, int i, int i2) {
        this.a = i2;
    }

    public static final /* synthetic */ EnumC2807b[] a() {
        return new EnumC2807b[]{b, c, d};
    }

    public static EnumEntries<EnumC2807b> b() {
        return f;
    }

    public static EnumC2807b valueOf(String str) {
        return (EnumC2807b) Enum.valueOf(EnumC2807b.class, str);
    }

    public static EnumC2807b[] values() {
        return (EnumC2807b[]) e.clone();
    }

    public final int c() {
        return this.a;
    }
}
