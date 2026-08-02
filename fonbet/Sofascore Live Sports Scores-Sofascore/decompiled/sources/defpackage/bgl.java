package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bgl {
    public static final bgl a;
    public static final bgl b;
    public static final bgl c;
    public static final bgl d;
    public static final bgl e;
    public static final bgl f;
    public static final bgl g;
    public static final /* synthetic */ bgl[] h;

    static {
        bgl bglVar = new bgl("PRE_TOURNAMENT", 0);
        a = bglVar;
        bgl bglVar2 = new bgl("MID_TOURNAMENT", 1);
        b = bglVar2;
        bgl bglVar3 = new bgl("LIVE_TOURNAMENT", 2);
        c = bglVar3;
        bgl bglVar4 = new bgl("LIVE_TOURNAMENT_2", 3);
        d = bglVar4;
        bgl bglVar5 = new bgl("LIVE_TOURNAMENT_3", 4);
        e = bglVar5;
        bgl bglVar6 = new bgl("AFTER_FINAL", 5);
        f = bglVar6;
        bgl bglVar7 = new bgl("END", 6);
        g = bglVar7;
        h = new bgl[]{bglVar, bglVar2, bglVar3, bglVar4, bglVar5, bglVar6, bglVar7};
    }

    public static bgl valueOf(String str) {
        return (bgl) Enum.valueOf(bgl.class, str);
    }

    public static bgl[] values() {
        return (bgl[]) h.clone();
    }

    public final b7 d() {
        switch (ordinal()) {
            case 0:
                return l6g.K(ael.a, ael.b, ael.c, ael.j, ael.e, ael.f, ael.g, ael.k, ael.h, ael.i, ael.l, ael.m, ael.n, ael.p);
            case 1:
                return l6g.K(ael.a, ael.b, ael.c, ael.j, ael.d, ael.o, ael.f, ael.g, ael.k, ael.h, ael.q, ael.l, ael.m, ael.n, ael.p);
            case 2:
                return l6g.K(ael.a, ael.c, ael.j, ael.d, ael.r, ael.f, ael.o, ael.s, ael.k, ael.h, ael.t, ael.q, ael.u, ael.l, ael.m, ael.n, ael.p);
            case 3:
                return l6g.K(ael.a, ael.c, ael.j, ael.d, ael.r, ael.f, ael.o, ael.v, ael.s, ael.k, ael.h, ael.t, ael.q, ael.u, ael.l, ael.m, ael.n, ael.p);
            case 4:
                return l6g.K(ael.a, ael.c, ael.j, ael.d, ael.r, ael.f, ael.v, ael.s, ael.k, ael.h, ael.t, ael.q, ael.u, ael.l, ael.m, ael.n, ael.p);
            case 5:
                return l6g.K(ael.a, ael.w, ael.y, ael.j, ael.d, ael.r, ael.f, ael.v, ael.s, ael.k, ael.h, ael.t, ael.u, ael.l, ael.m, ael.n);
            case 6:
                return l6g.K(ael.a, ael.w, ael.j, ael.d, ael.x, ael.y, ael.u, ael.t, ael.k, ael.h, ael.v, ael.l, ael.m);
            default:
                zzl.b();
                return null;
        }
    }
}
