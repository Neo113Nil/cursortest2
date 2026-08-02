package com.braze.models.dust;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f626a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final /* synthetic */ f[] e;

    static {
        f fVar = new f("UNKNOWN", 0, "");
        f626a = fVar;
        f fVar2 = new f("CONTENT_CARD_REFRESH", 1, "ccr");
        b = fVar2;
        f fVar3 = new f("TIME_TO_LIVE", 2, "ttl");
        c = fVar3;
        f fVar4 = new f("DISCONNECT_AND_RETRY", 3, "ddr");
        d = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        e = fVarArr;
        EnumEntriesKt.enumEntries(fVarArr);
    }

    public f(String str, int i, String str2) {
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) e.clone();
    }
}
