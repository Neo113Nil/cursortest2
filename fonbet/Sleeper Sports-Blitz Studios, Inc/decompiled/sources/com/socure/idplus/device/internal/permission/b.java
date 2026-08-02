package com.socure.idplus.device.internal.permission;

import com.google.android.gms.stats.CodePackage;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f873a;
    public static final b b;
    public static final b c;
    public static final /* synthetic */ b[] d;

    static {
        b bVar = new b(CodePackage.LOCATION, 0);
        f873a = bVar;
        b bVar2 = new b("NETWORK", 1);
        b = bVar2;
        b bVar3 = new b("WIFI", 2);
        c = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3, new b("READ_PHONE", 3)};
        d = bVarArr;
        EnumEntriesKt.enumEntries(bVarArr);
    }

    public b(String str, int i) {
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) d.clone();
    }
}
