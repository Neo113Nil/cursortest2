package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gfj {
    public static final gfj a;
    public static final gfj b;
    public static final gfj c;
    public static final /* synthetic */ gfj[] d;

    static {
        gfj gfjVar = new gfj("None", 0);
        a = gfjVar;
        gfj gfjVar2 = new gfj("Cursor", 1);
        b = gfjVar2;
        gfj gfjVar3 = new gfj("Selection", 2);
        c = gfjVar3;
        d = new gfj[]{gfjVar, gfjVar2, gfjVar3};
    }

    public static gfj valueOf(String str) {
        return (gfj) Enum.valueOf(gfj.class, str);
    }

    public static gfj[] values() {
        return (gfj[]) d.clone();
    }
}
