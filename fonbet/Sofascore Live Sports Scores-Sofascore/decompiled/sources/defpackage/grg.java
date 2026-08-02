package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class grg {
    public static final grg a;
    public static final grg b;
    public static final grg c;
    public static final grg d;
    public static final grg e;
    public static final /* synthetic */ grg[] f;

    static {
        grg grgVar = new grg("TopBar", 0);
        a = grgVar;
        grg grgVar2 = new grg("MainContent", 1);
        b = grgVar2;
        grg grgVar3 = new grg("Snackbar", 2);
        c = grgVar3;
        grg grgVar4 = new grg("Fab", 3);
        d = grgVar4;
        grg grgVar5 = new grg("BottomBar", 4);
        e = grgVar5;
        f = new grg[]{grgVar, grgVar2, grgVar3, grgVar4, grgVar5};
    }

    public static grg valueOf(String str) {
        return (grg) Enum.valueOf(grg.class, str);
    }

    public static grg[] values() {
        return (grg[]) f.clone();
    }
}
