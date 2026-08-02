package com.braze.requests;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class c {
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final /* synthetic */ c[] f;

    /* renamed from: a, reason: collision with root package name */
    public final String f667a;

    static {
        c cVar = new c("SESSION_START", 0, "ss");
        b = cVar;
        c cVar2 = new c("DUST_INITIATED", 1, "di");
        c = cVar2;
        c cVar3 = new c("CLIENT_INITIATED", 2, "ci");
        d = cVar3;
        c cVar4 = new c("UNKNOWN", 3, "unknown");
        e = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        f = cVarArr;
        EnumEntriesKt.enumEntries(cVarArr);
    }

    public c(String str, int i, String str2) {
        this.f667a = str2;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f.clone();
    }
}
