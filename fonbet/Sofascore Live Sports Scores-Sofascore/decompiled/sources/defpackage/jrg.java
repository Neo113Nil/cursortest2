package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jrg {
    public static final jrg a;
    public static final jrg b;
    public static final /* synthetic */ jrg[] c;

    static {
        jrg jrgVar = new jrg("FILL", 0);
        a = jrgVar;
        jrg jrgVar2 = new jrg("FIT", 1);
        b = jrgVar2;
        c = new jrg[]{jrgVar, jrgVar2};
    }

    public static jrg valueOf(String str) {
        return (jrg) Enum.valueOf(jrg.class, str);
    }

    public static jrg[] values() {
        return (jrg[]) c.clone();
    }
}
