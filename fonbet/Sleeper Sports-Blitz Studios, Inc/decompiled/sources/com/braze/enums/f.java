package com.braze.enums;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f505a;
    public static final f b;
    public static final /* synthetic */ f[] c;

    static {
        f fVar = new f("OPEN_SESSION", 0);
        f505a = fVar;
        f fVar2 = new f("NO_SESSION", 1);
        b = fVar2;
        f[] fVarArr = {fVar, fVar2};
        c = fVarArr;
        EnumEntriesKt.enumEntries(fVarArr);
    }

    public f(String str, int i) {
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) c.clone();
    }
}
