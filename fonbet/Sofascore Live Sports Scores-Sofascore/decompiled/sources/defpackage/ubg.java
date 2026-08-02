package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ubg {
    public static final w9f a;
    public static final ubg b;
    public static final ubg c;
    public static final ubg d;
    public static final /* synthetic */ ubg[] e;

    static {
        ubg ubgVar = new ubg("MUTED", 0);
        b = ubgVar;
        ubg ubgVar2 = new ubg("AUTO", 1);
        c = ubgVar2;
        ubg ubgVar3 = new ubg("ON", 2);
        d = ubgVar3;
        e = new ubg[]{ubgVar, ubgVar2, ubgVar3};
        a = new w9f(1);
    }

    public static ubg valueOf(String str) {
        return (ubg) Enum.valueOf(ubg.class, str);
    }

    public static ubg[] values() {
        return (ubg[]) e.clone();
    }
}
