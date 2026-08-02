package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class vi8 implements lk2 {
    public static final rh8 A;
    public static final qh8 B;
    public static final si8 C;
    public static final ci8 D;
    public static final mh8 E;
    public static final ih8 F;
    public static final yh8 G;
    public static final vh8 H;
    public static final zh8 I;
    public static final mi8 J;
    public static final ni8 K;
    public static final ji8 L;
    public static final ki8 M;
    public static final /* synthetic */ vi8[] N;
    public static final fi8 c;
    public static final gi8 d;
    public static final xh8 e;
    public static final jh8 f;
    public static final qi8 g;
    public static final th8 h;
    public static final sh8 i;
    public static final ai8 j;
    public static final wh8 k;
    public static final ti8 l;
    public static final oi8 m;
    public static final lh8 n;
    public static final di8 o;
    public static final kh8 p;
    public static final ri8 q;
    public static final hh8 r;
    public static final hi8 s;
    public static final fh8 t;
    public static final ei8 u;
    public static final eh8 v;
    public static final ph8 w;
    public static final oh8 x;
    public static final ui8 y;
    public static final li8 z;
    public final Function1 a;
    public final Function1 b;

    static {
        fi8 fi8Var = new fi8();
        c = fi8Var;
        gi8 gi8Var = new gi8();
        d = gi8Var;
        xh8 xh8Var = new xh8();
        e = xh8Var;
        jh8 jh8Var = new jh8();
        f = jh8Var;
        qi8 qi8Var = new qi8();
        g = qi8Var;
        th8 th8Var = new th8();
        h = th8Var;
        sh8 sh8Var = new sh8();
        i = sh8Var;
        ai8 ai8Var = new ai8();
        j = ai8Var;
        wh8 wh8Var = new wh8();
        k = wh8Var;
        ti8 ti8Var = new ti8();
        l = ti8Var;
        oi8 oi8Var = new oi8();
        m = oi8Var;
        lh8 lh8Var = new lh8();
        n = lh8Var;
        di8 di8Var = new di8();
        o = di8Var;
        kh8 kh8Var = new kh8();
        p = kh8Var;
        ri8 ri8Var = new ri8();
        q = ri8Var;
        hh8 hh8Var = new hh8();
        r = hh8Var;
        hi8 hi8Var = new hi8();
        s = hi8Var;
        fh8 fh8Var = new fh8();
        t = fh8Var;
        ei8 ei8Var = new ei8();
        u = ei8Var;
        eh8 eh8Var = new eh8();
        v = eh8Var;
        ph8 ph8Var = new ph8();
        w = ph8Var;
        oh8 oh8Var = new oh8();
        x = oh8Var;
        ui8 ui8Var = new ui8();
        y = ui8Var;
        li8 li8Var = new li8();
        z = li8Var;
        rh8 rh8Var = new rh8();
        A = rh8Var;
        qh8 qh8Var = new qh8();
        B = qh8Var;
        si8 si8Var = new si8();
        C = si8Var;
        ci8 ci8Var = new ci8();
        D = ci8Var;
        mh8 mh8Var = new mh8();
        E = mh8Var;
        ih8 ih8Var = new ih8();
        F = ih8Var;
        yh8 yh8Var = new yh8();
        G = yh8Var;
        vh8 vh8Var = new vh8();
        H = vh8Var;
        zh8 zh8Var = new zh8();
        I = zh8Var;
        mi8 mi8Var = new mi8();
        J = mi8Var;
        ni8 ni8Var = new ni8();
        K = ni8Var;
        ji8 ji8Var = new ji8();
        L = ji8Var;
        ki8 ki8Var = new ki8();
        M = ki8Var;
        N = new vi8[]{fi8Var, gi8Var, xh8Var, jh8Var, qi8Var, th8Var, sh8Var, ai8Var, wh8Var, ti8Var, oi8Var, lh8Var, di8Var, kh8Var, ri8Var, hh8Var, hi8Var, fh8Var, ei8Var, eh8Var, ph8Var, oh8Var, ui8Var, li8Var, rh8Var, qh8Var, si8Var, ci8Var, mh8Var, ih8Var, yh8Var, vh8Var, zh8Var, mi8Var, ni8Var, ji8Var, ki8Var};
    }

    public vi8(String str, int i2, Function1 function1, Function1 function12) {
        this.a = function1;
        this.b = function12;
    }

    public static vi8 valueOf(String str) {
        return (vi8) Enum.valueOf(vi8.class, str);
    }

    public static vi8[] values() {
        return (vi8[]) N.clone();
    }

    @Override // defpackage.lk2
    /* renamed from: a */
    public boolean k(FootballPlayerSeasonStatistics footballPlayerSeasonStatistics, String str) {
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
}
