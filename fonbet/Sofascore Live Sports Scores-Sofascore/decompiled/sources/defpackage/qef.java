package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public enum qef {
    TEAM(bv.ADD_FAVORITE_TEAM, xu.TEAM),
    PLAYER(bv.ADD_FAVORITE_PLAYER, xu.PLAYER),
    LEAGUE(bv.ADD_FAVORITE_LEAGUE, xu.UNIQUE_TOURNAMENT);

    public final bv a;
    public final xu b;

    qef(bv bvVar, xu xuVar) {
        this.a = bvVar;
        this.b = xuVar;
    }
}
