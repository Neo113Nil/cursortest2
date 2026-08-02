package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class leo {
    public static final leo a;
    public static final leo b;
    public static final leo c;
    public static final leo d;
    public static final leo e;
    public static final leo f;
    public static final /* synthetic */ leo[] g;

    static {
        leo leoVar = new leo("RESULT_UNKNOWN", 0);
        a = leoVar;
        leo leoVar2 = new leo("RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID", 1);
        b = leoVar2;
        leo leoVar3 = new leo("RESULT_UPDATED", 2);
        c = leoVar3;
        leo leoVar4 = new leo("RESULT_NOOP_NO_NEW_PROGRAM", 3);
        d = leoVar4;
        leo leoVar5 = new leo("RESULT_FAILURE_INVALID_RESPONSE", 4);
        e = leoVar5;
        leo leoVar6 = new leo("RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION", 5);
        f = leoVar6;
        g = new leo[]{leoVar, leoVar2, leoVar3, leoVar4, leoVar5, leoVar6};
    }

    public static leo[] values() {
        return (leo[]) g.clone();
    }
}
