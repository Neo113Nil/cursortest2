package com.moloco.sdk.acm.db;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import me.leolin.shortcutbadger.impl.AdwHomeBadger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {
    public static final c a = new c("TIMER", 0);
    public static final c b = new c(AdwHomeBadger.COUNT, 1);
    public static final /* synthetic */ c[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        c[] a2 = a();
        c = a2;
        d = EnumEntriesKt.enumEntries(a2);
    }

    public c(String str, int i) {
    }

    public static final /* synthetic */ c[] a() {
        return new c[]{a, b};
    }

    public static EnumEntries<c> b() {
        return d;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) c.clone();
    }
}
