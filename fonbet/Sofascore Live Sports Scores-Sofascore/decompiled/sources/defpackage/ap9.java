package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class ap9 implements lk2 {
    public static final yn9 A;
    public static final no9 B;
    public static final on9 C;
    public static final lo9 D;
    public static final so9 E;
    public static final uo9 F;
    public static final vn9 G;
    public static final un9 H;
    public static final sn9 I;
    public static final ao9 J;
    public static final co9 K;
    public static final wo9 L;
    public static final /* synthetic */ ap9[] M;
    public static final rn9 c;
    public static final xn9 d;
    public static final kn9 e;
    public static final go9 f;
    public static final fo9 g;
    public static final vo9 h;
    public static final oo9 i;
    public static final tn9 j;
    public static final bo9 k;
    public static final io9 l;
    public static final ho9 m;
    public static final jo9 n;
    public static final qo9 o;
    public static final po9 p;
    public static final eo9 q;
    public static final zn9 r;
    public static final nn9 s;
    public static final xo9 t;
    public static final mn9 u;
    public static final ln9 v;
    public static final qn9 w;
    public static final mo9 x;
    public static final to9 y;
    public static final zo9 z;
    public final Function1 a;
    public final Function1 b;

    static {
        rn9 rn9Var = new rn9();
        c = rn9Var;
        xn9 xn9Var = new xn9();
        d = xn9Var;
        kn9 kn9Var = new kn9();
        e = kn9Var;
        go9 go9Var = new go9();
        f = go9Var;
        fo9 fo9Var = new fo9();
        g = fo9Var;
        vo9 vo9Var = new vo9();
        h = vo9Var;
        oo9 oo9Var = new oo9();
        i = oo9Var;
        tn9 tn9Var = new tn9();
        j = tn9Var;
        bo9 bo9Var = new bo9();
        k = bo9Var;
        io9 io9Var = new io9();
        l = io9Var;
        ho9 ho9Var = new ho9();
        m = ho9Var;
        jo9 jo9Var = new jo9();
        n = jo9Var;
        qo9 qo9Var = new qo9();
        o = qo9Var;
        po9 po9Var = new po9();
        p = po9Var;
        eo9 eo9Var = new eo9();
        q = eo9Var;
        zn9 zn9Var = new zn9();
        r = zn9Var;
        nn9 nn9Var = new nn9();
        s = nn9Var;
        xo9 xo9Var = new xo9();
        t = xo9Var;
        mn9 mn9Var = new mn9();
        u = mn9Var;
        ln9 ln9Var = new ln9();
        v = ln9Var;
        qn9 qn9Var = new qn9();
        w = qn9Var;
        mo9 mo9Var = new mo9();
        x = mo9Var;
        to9 to9Var = new to9();
        y = to9Var;
        zo9 zo9Var = new zo9();
        z = zo9Var;
        yn9 yn9Var = new yn9();
        A = yn9Var;
        no9 no9Var = new no9();
        B = no9Var;
        on9 on9Var = new on9();
        C = on9Var;
        lo9 lo9Var = new lo9();
        D = lo9Var;
        so9 so9Var = new so9();
        E = so9Var;
        uo9 uo9Var = new uo9();
        F = uo9Var;
        vn9 vn9Var = new vn9();
        G = vn9Var;
        un9 un9Var = new un9();
        H = un9Var;
        sn9 sn9Var = new sn9();
        I = sn9Var;
        ao9 ao9Var = new ao9();
        J = ao9Var;
        co9 co9Var = new co9();
        K = co9Var;
        wo9 wo9Var = new wo9();
        L = wo9Var;
        M = new ap9[]{rn9Var, xn9Var, kn9Var, go9Var, fo9Var, vo9Var, oo9Var, tn9Var, bo9Var, io9Var, ho9Var, jo9Var, qo9Var, po9Var, eo9Var, zn9Var, nn9Var, xo9Var, mn9Var, ln9Var, qn9Var, mo9Var, to9Var, zo9Var, yn9Var, no9Var, on9Var, lo9Var, so9Var, uo9Var, vn9Var, un9Var, sn9Var, ao9Var, co9Var, wo9Var};
    }

    public ap9(String str, int i2, Function1 function1, Function1 function12) {
        this.a = function1;
        this.b = function12;
    }

    public static ap9 valueOf(String str) {
        return (ap9) Enum.valueOf(ap9.class, str);
    }

    public static ap9[] values() {
        return (ap9[]) M.clone();
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
    public final boolean k(AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics, String str) {
        return true;
    }
}
