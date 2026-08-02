package com.braze.enums;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f504a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final /* synthetic */ e[] e;

    static {
        e eVar = new e("NONE", 0);
        f504a = eVar;
        e eVar2 = new e("BAD", 1);
        b = eVar2;
        e eVar3 = new e("GOOD", 2);
        c = eVar3;
        e eVar4 = new e("GREAT", 3);
        d = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        e = eVarArr;
        EnumEntriesKt.enumEntries(eVarArr);
    }

    public e(String str, int i) {
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) e.clone();
    }
}
