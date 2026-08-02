package bo.app;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bf {

    /* renamed from: a, reason: collision with root package name */
    public static final bf f25302a;

    /* renamed from: b, reason: collision with root package name */
    public static final bf f25303b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ bf[] f25304c;

    static {
        bf bfVar = new bf("OPEN_SESSION", 0);
        f25302a = bfVar;
        bf bfVar2 = new bf("NO_SESSION", 1);
        f25303b = bfVar2;
        bf[] bfVarArr = {bfVar, bfVar2};
        f25304c = bfVarArr;
        EnumEntriesKt.enumEntries(bfVarArr);
    }

    public bf(String str, int i10) {
    }

    public static bf valueOf(String str) {
        return (bf) Enum.valueOf(bf.class, str);
    }

    public static bf[] values() {
        return (bf[]) f25304c.clone();
    }
}
