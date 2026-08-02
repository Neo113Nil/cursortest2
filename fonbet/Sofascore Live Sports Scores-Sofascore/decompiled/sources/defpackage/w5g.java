package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class w5g {
    public static final w5g a;
    public static final w5g b;
    public static final /* synthetic */ w5g[] c;

    static {
        w5g w5gVar = new w5g("ROLL_DOWN", 0);
        a = w5gVar;
        w5g w5gVar2 = new w5g("ROLL_UP", 1);
        b = w5gVar2;
        c = new w5g[]{w5gVar, w5gVar2};
    }

    public static w5g valueOf(String str) {
        return (w5g) Enum.valueOf(w5g.class, str);
    }

    public static w5g[] values() {
        return (w5g[]) c.clone();
    }
}
