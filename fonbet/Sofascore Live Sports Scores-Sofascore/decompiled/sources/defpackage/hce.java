package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hce {
    public static final hce a;
    public static final hce b;
    public static final hce c;
    public static final hce d;
    public static final hce e;
    public static final hce f;
    public static final hce g;
    public static final /* synthetic */ hce[] h;

    static {
        hce hceVar = new hce("Invalid", 0);
        a = hceVar;
        hce hceVar2 = new hce("Cancelled", 1);
        b = hceVar2;
        hce hceVar3 = new hce("InitialPending", 2);
        c = hceVar3;
        hce hceVar4 = new hce("RecomposePending", 3);
        d = hceVar4;
        hce hceVar5 = new hce("Recomposing", 4);
        e = hceVar5;
        hce hceVar6 = new hce("ApplyPending", 5);
        f = hceVar6;
        hce hceVar7 = new hce("Applied", 6);
        g = hceVar7;
        h = new hce[]{hceVar, hceVar2, hceVar3, hceVar4, hceVar5, hceVar6, hceVar7};
    }

    public static hce valueOf(String str) {
        return (hce) Enum.valueOf(hce.class, str);
    }

    public static hce[] values() {
        return (hce[]) h.clone();
    }
}
