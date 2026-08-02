package bo.app;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cb {

    /* renamed from: a, reason: collision with root package name */
    public static final cb f25351a;

    /* renamed from: b, reason: collision with root package name */
    public static final cb f25352b;

    /* renamed from: c, reason: collision with root package name */
    public static final cb f25353c;

    /* renamed from: d, reason: collision with root package name */
    public static final cb f25354d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ cb[] f25355e;

    static {
        cb cbVar = new cb("NONE", 0);
        f25351a = cbVar;
        cb cbVar2 = new cb("BAD", 1);
        f25352b = cbVar2;
        cb cbVar3 = new cb("GOOD", 2);
        f25353c = cbVar3;
        cb cbVar4 = new cb("GREAT", 3);
        f25354d = cbVar4;
        cb[] cbVarArr = {cbVar, cbVar2, cbVar3, cbVar4};
        f25355e = cbVarArr;
        EnumEntriesKt.enumEntries(cbVarArr);
    }

    public cb(String str, int i10) {
    }

    public static cb valueOf(String str) {
        return (cb) Enum.valueOf(cb.class, str);
    }

    public static cb[] values() {
        return (cb[]) f25355e.clone();
    }
}
