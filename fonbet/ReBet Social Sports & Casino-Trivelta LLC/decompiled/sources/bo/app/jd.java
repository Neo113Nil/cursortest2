package bo.app;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jd {

    /* renamed from: a, reason: collision with root package name */
    public static final jd f25623a;

    /* renamed from: b, reason: collision with root package name */
    public static final jd f25624b;

    /* renamed from: c, reason: collision with root package name */
    public static final jd f25625c;

    /* renamed from: d, reason: collision with root package name */
    public static final jd f25626d;

    /* renamed from: e, reason: collision with root package name */
    public static final jd f25627e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ jd[] f25628f;

    static {
        jd jdVar = new jd("PENDING_START", 0);
        f25623a = jdVar;
        jd jdVar2 = new jd("PENDING_RETRY", 1);
        f25624b = jdVar2;
        jd jdVar3 = new jd("IN_FLIGHT", 2);
        f25625c = jdVar3;
        jd jdVar4 = new jd("BATCHED", 3);
        f25626d = jdVar4;
        jd jdVar5 = new jd("COMPLETE", 4);
        f25627e = jdVar5;
        jd[] jdVarArr = {jdVar, jdVar2, jdVar3, jdVar4, jdVar5};
        f25628f = jdVarArr;
        EnumEntriesKt.enumEntries(jdVarArr);
    }

    public jd(String str, int i10) {
    }

    public static jd valueOf(String str) {
        return (jd) Enum.valueOf(jd.class, str);
    }

    public static jd[] values() {
        return (jd[]) f25628f.clone();
    }
}
