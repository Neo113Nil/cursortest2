package bo.app;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class xc {

    /* renamed from: a, reason: collision with root package name */
    public static final xc f26269a;

    /* renamed from: b, reason: collision with root package name */
    public static final xc f26270b;

    /* renamed from: c, reason: collision with root package name */
    public static final xc f26271c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ xc[] f26272d;

    static {
        xc xcVar = new xc("ZIP", 0);
        f26269a = xcVar;
        xc xcVar2 = new xc("IMAGE", 1);
        f26270b = xcVar2;
        xc xcVar3 = new xc("FILE", 2);
        f26271c = xcVar3;
        xc[] xcVarArr = {xcVar, xcVar2, xcVar3};
        f26272d = xcVarArr;
        EnumEntriesKt.enumEntries(xcVarArr);
    }

    public xc(String str, int i10) {
    }

    public static xc valueOf(String str) {
        return (xc) Enum.valueOf(xc.class, str);
    }

    public static xc[] values() {
        return (xc[]) f26272d.clone();
    }
}
