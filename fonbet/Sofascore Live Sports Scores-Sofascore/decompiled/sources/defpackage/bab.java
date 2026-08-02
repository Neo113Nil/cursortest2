package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public enum bab {
    e("XG", new z9b(3), new z9b(5), false),
    f("XGOT", new z9b(12), new z9b(13), false),
    g("TotalShots", new z9b(15), new z9b(16), false),
    h("ShotsOnTarget", new z9b(17), new z9b(18), false),
    i("XA", new z9b(19), new z9b(20), false),
    j("AccuratePasses", new z9b(14), new z9b(21), false),
    k("KeyPasses", new z9b(22), new z9b(23), false),
    l("Dribbles", new z9b(24), new z9b(25), false),
    m("Touches", new z9b(26), new z9b(27), false),
    n("DefensiveContributions", new z9b(28), new z9b(4), false),
    o("DuelsWon", new z9b(6), new z9b(7), false),
    p("GoalsPrevented", new z9b(8), new z9b(9), true),
    q("Saves", new z9b(10), new z9b(11), false);

    public final int a;
    public final Function1 b;
    public final Function1 c;
    public final boolean d;

    bab(String str, Function1 function1, Function1 function12, boolean z) {
        this.a = r2;
        this.b = function1;
        this.c = function12;
        this.d = z;
    }
}
