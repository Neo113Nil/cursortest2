package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.BasketballPlayerSeasonStatistics;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class br1 implements lk2 {
    public static final zq1 A;
    public static final /* synthetic */ br1[] B;
    public static final tq1 c;
    public static final jq1 d;
    public static final lq1 e;
    public static final qq1 f;
    public static final sq1 g;
    public static final yp1 h;
    public static final uq1 i;
    public static final zp1 j;
    public static final nq1 k;
    public static final ar1 l;
    public static final mq1 m;
    public static final aq1 n;
    public static final cq1 o;
    public static final eq1 p;
    public static final fq1 q;
    public static final gq1 r;
    public static final hq1 s;
    public static final iq1 t;
    public static final vq1 u;
    public static final wq1 v;
    public static final xq1 w;
    public static final pq1 x;
    public static final oq1 y;
    public static final bq1 z;
    public final Function1 a;
    public final Function1 b;

    static {
        tq1 tq1Var = new tq1();
        c = tq1Var;
        jq1 jq1Var = new jq1();
        d = jq1Var;
        lq1 lq1Var = new lq1();
        e = lq1Var;
        qq1 qq1Var = new qq1();
        f = qq1Var;
        sq1 sq1Var = new sq1();
        g = sq1Var;
        yp1 yp1Var = new yp1();
        h = yp1Var;
        uq1 uq1Var = new uq1();
        i = uq1Var;
        zp1 zp1Var = new zp1();
        j = zp1Var;
        nq1 nq1Var = new nq1();
        k = nq1Var;
        ar1 ar1Var = new ar1();
        l = ar1Var;
        mq1 mq1Var = new mq1();
        m = mq1Var;
        aq1 aq1Var = new aq1();
        n = aq1Var;
        cq1 cq1Var = new cq1();
        o = cq1Var;
        eq1 eq1Var = new eq1();
        p = eq1Var;
        fq1 fq1Var = new fq1();
        q = fq1Var;
        gq1 gq1Var = new gq1();
        r = gq1Var;
        hq1 hq1Var = new hq1();
        s = hq1Var;
        iq1 iq1Var = new iq1();
        t = iq1Var;
        vq1 vq1Var = new vq1();
        u = vq1Var;
        wq1 wq1Var = new wq1();
        v = wq1Var;
        xq1 xq1Var = new xq1();
        w = xq1Var;
        pq1 pq1Var = new pq1();
        x = pq1Var;
        oq1 oq1Var = new oq1();
        y = oq1Var;
        bq1 bq1Var = new bq1();
        z = bq1Var;
        zq1 zq1Var = new zq1();
        A = zq1Var;
        B = new br1[]{tq1Var, jq1Var, lq1Var, qq1Var, sq1Var, yp1Var, uq1Var, zp1Var, nq1Var, ar1Var, mq1Var, aq1Var, cq1Var, eq1Var, fq1Var, gq1Var, hq1Var, iq1Var, vq1Var, wq1Var, xq1Var, pq1Var, oq1Var, bq1Var, zq1Var};
    }

    public br1(String str, int i2, Function1 function1, Function1 function12) {
        this.a = function1;
        this.b = function12;
    }

    public static br1 valueOf(String str) {
        return (br1) Enum.valueOf(br1.class, str);
    }

    public static br1[] values() {
        return (br1[]) B.clone();
    }

    public boolean a(BasketballPlayerSeasonStatistics basketballPlayerSeasonStatistics) {
        return true;
    }

    @Override // defpackage.lk2
    public final Function1 h() {
        return this.b;
    }

    @Override // defpackage.lk2
    public final Function1 j() {
        return this.a;
    }

    @Override // defpackage.lk2
    public /* bridge */ /* synthetic */ boolean k(AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics, String str) {
        return a((BasketballPlayerSeasonStatistics) abstractPlayerSeasonStatistics);
    }
}
