package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pzd {
    public static final pzd A;
    public static final pzd B;
    public static final pzd C;
    public static final pzd D;
    public static final pzd E;
    public static final pzd F;
    public static final pzd G;
    public static final /* synthetic */ pzd[] H;
    public static final /* synthetic */ kp5 I;
    public static final pzd e;
    public static final pzd f;
    public static final pzd g;
    public static final pzd h;
    public static final pzd i;
    public static final pzd j;
    public static final pzd k;
    public static final pzd l;
    public static final pzd m;
    public static final pzd n;
    public static final pzd o;
    public static final pzd p;
    public static final pzd q;
    public static final pzd r;
    public static final pzd s;
    public static final pzd t;
    public static final pzd u;
    public static final pzd v;
    public static final pzd w;
    public static final pzd x;
    public static final pzd y;
    public static final pzd z;
    public final int a;
    public final mzd b;
    public final Integer c;
    public final boolean d;

    static {
        mzd mzdVar = mzd.Passing;
        pzd pzdVar = new pzd("AllPasses", 0, R.string.football_all_passes, mzdVar, null, 12);
        e = pzdVar;
        pzd pzdVar2 = new pzd("AccuratePasses", 1, R.string.football_accurate_passes_chip, mzdVar, null, 12);
        f = pzdVar2;
        pzd pzdVar3 = new pzd("InaccuratePasses", 2, R.string.football_inaccurate_passes_chip, mzdVar, null, 12);
        g = pzdVar3;
        pzd pzdVar4 = new pzd("Assists", 3, R.string.football_assists, mzdVar, null, 12);
        h = pzdVar4;
        pzd pzdVar5 = new pzd("KeyPasses", 4, R.string.football_key_passes, mzdVar, null, 12);
        i = pzdVar5;
        pzd pzdVar6 = new pzd("BigChancesCreated", 5, R.string.football_big_chances_created, mzdVar, null, 12);
        pzd pzdVar7 = new pzd("LongBalls", 6, R.string.football_long_balls, mzdVar, null, 12);
        j = pzdVar7;
        pzd pzdVar8 = new pzd("KeyLongBalls", 7, R.string.football_long_balls, mzdVar, null, 4);
        k = pzdVar8;
        pzd pzdVar9 = new pzd("AssistLongBalls", 8, R.string.football_long_balls, mzdVar, null, 4);
        l = pzdVar9;
        pzd pzdVar10 = new pzd("InaccurateLongBalls", 9, R.string.football_long_balls, mzdVar, null, 4);
        m = pzdVar10;
        pzd pzdVar11 = new pzd("Crosses", 10, R.string.football_crosses, mzdVar, null, 12);
        n = pzdVar11;
        pzd pzdVar12 = new pzd("InaccurateCrosses", 11, R.string.football_crosses, mzdVar, null, 4);
        o = pzdVar12;
        pzd pzdVar13 = new pzd("AssistCrosses", 12, R.string.football_crosses, mzdVar, null, 4);
        p = pzdVar13;
        pzd pzdVar14 = new pzd("KeyCrosses", 13, R.string.football_crosses, mzdVar, null, 4);
        q = pzdVar14;
        pzd pzdVar15 = new pzd("BallTouches", 14, R.string.football_touches, mzdVar, null, 4);
        r = pzdVar15;
        pzd pzdVar16 = new pzd("InaccurateBallTouches", 15, R.string.football_touches, mzdVar, null, 4);
        s = pzdVar16;
        pzd pzdVar17 = new pzd("AssistBallTouches", 16, R.string.football_touches, mzdVar, null, 4);
        t = pzdVar17;
        pzd pzdVar18 = new pzd("KeyBallTouches", 17, R.string.football_touches, mzdVar, null, 4);
        u = pzdVar18;
        mzd mzdVar2 = mzd.Dribbling;
        pzd pzdVar19 = new pzd("AllDribbles", 18, R.string.all, mzdVar2, null, 12);
        v = pzdVar19;
        Integer valueOf = Integer.valueOf(R.color.success);
        pzd pzdVar20 = new pzd("SuccessfulDribbles", 19, R.string.football_successful_dribbles, mzdVar2, valueOf, 8);
        w = pzdVar20;
        Integer valueOf2 = Integer.valueOf(R.color.error);
        pzd pzdVar21 = new pzd("UnsuccessfulDribbles", 20, R.string.football_unsuccessful_dribbles, mzdVar2, valueOf2, 8);
        x = pzdVar21;
        pzd pzdVar22 = new pzd("WasFouled", 21, R.string.football_fouled_while_dribbling, mzdVar2, Integer.valueOf(R.color.value), 8);
        y = pzdVar22;
        pzd pzdVar23 = new pzd("BallCarries", 22, R.string.football_ball_carries, mzdVar2, null, 12);
        z = pzdVar23;
        mzd mzdVar3 = mzd.Defending;
        pzd pzdVar24 = new pzd("AllDefending", 23, R.string.all, mzdVar3, null, 12);
        A = pzdVar24;
        pzd pzdVar25 = new pzd("Tackles", 24, R.string.football_tackles, mzdVar3, Integer.valueOf(R.color.rating_60), 8);
        B = pzdVar25;
        pzd pzdVar26 = new pzd("UnsuccessfulTackles", 25, R.string.football_tackles, mzdVar3, null, 4);
        C = pzdVar26;
        pzd pzdVar27 = new pzd("Interceptions", 26, R.string.football_interceptions, mzdVar3, Integer.valueOf(R.color.crowdsourcing_live), 8);
        D = pzdVar27;
        pzd pzdVar28 = new pzd("Clearances", 27, R.string.football_clearances, mzdVar3, Integer.valueOf(R.color.rating_80), 8);
        E = pzdVar28;
        pzd pzdVar29 = new pzd("BlockedShots", 28, R.string.football_blocked_shots, mzdVar3, valueOf2, 8);
        F = pzdVar29;
        pzd pzdVar30 = new pzd("Recoveries", 29, R.string.football_recoveries, mzdVar3, valueOf, 8);
        G = pzdVar30;
        pzd[] pzdVarArr = {pzdVar, pzdVar2, pzdVar3, pzdVar4, pzdVar5, pzdVar6, pzdVar7, pzdVar8, pzdVar9, pzdVar10, pzdVar11, pzdVar12, pzdVar13, pzdVar14, pzdVar15, pzdVar16, pzdVar17, pzdVar18, pzdVar19, pzdVar20, pzdVar21, pzdVar22, pzdVar23, pzdVar24, pzdVar25, pzdVar26, pzdVar27, pzdVar28, pzdVar29, pzdVar30};
        H = pzdVarArr;
        I = new kp5(pzdVarArr);
    }

    public pzd(String str, int i2, int i3, mzd mzdVar, Integer num, int i4) {
        num = (i4 & 4) != 0 ? null : num;
        boolean z2 = (i4 & 8) != 0;
        this.a = i3;
        this.b = mzdVar;
        this.c = num;
        this.d = z2;
    }

    public static pzd valueOf(String str) {
        return (pzd) Enum.valueOf(pzd.class, str);
    }

    public static pzd[] values() {
        return (pzd[]) H.clone();
    }
}
