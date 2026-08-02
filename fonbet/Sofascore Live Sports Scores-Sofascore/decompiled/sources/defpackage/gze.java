package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gze {
    public static final gze a;
    public static final gze b;
    public static final gze c;
    public static final /* synthetic */ gze[] d;

    static {
        gze gzeVar = new gze("Initial", 0);
        a = gzeVar;
        gze gzeVar2 = new gze("Main", 1);
        b = gzeVar2;
        gze gzeVar3 = new gze("Final", 2);
        c = gzeVar3;
        d = new gze[]{gzeVar, gzeVar2, gzeVar3};
    }

    public static gze valueOf(String str) {
        return (gze) Enum.valueOf(gze.class, str);
    }

    public static gze[] values() {
        return (gze[]) d.clone();
    }
}
