package com.socure.idplus.device.internal.viewModel.location;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f901a;
    public static final a b;
    public static final a c;
    public static final /* synthetic */ a[] d;

    static {
        a aVar = new a("VERTICAL_ACCURACY", 0);
        f901a = aVar;
        a aVar2 = new a("BEARING_ACCURACY", 1);
        b = aVar2;
        a aVar3 = new a("SPEED_ACCURACY", 2);
        c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        d = aVarArr;
        EnumEntriesKt.enumEntries(aVarArr);
    }

    public a(String str, int i) {
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) d.clone();
    }
}
