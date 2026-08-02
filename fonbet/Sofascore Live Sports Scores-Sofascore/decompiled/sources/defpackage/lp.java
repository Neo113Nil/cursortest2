package defpackage;

import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lp implements b0i {
    public static final /* synthetic */ lp[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final List b;
    public final Function1 c;

    static {
        lp[] lpVarArr = {new lp("AM_FOOT_PASSING", 0, R.string.passing, vp.h, new ia(9)), new lp("AM_FOOT_RUSHING", 1, R.string.rushing, cq.g, new ia(10)), new lp("AM_FOOT_RECEIVING", 2, R.string.receiving, bq.h, new ia(11)), new lp("AM_FOOT_DEFENSIVE", 3, R.string.american_football_stat_defence, np.g, new ia(12)), new lp("AM_FOOT_INTERCEPTIONS", 4, R.string.interceptions, qp.g, new ia(13)), new lp("AM_FOOT_FUMBLES", 5, R.string.fumbles, pp.g, new ia(14)), new lp("AM_FOOT_KICKING", 6, R.string.amf_kicking, tp.h, new ia(15)), new lp("AM_FOOT_PUNTING", 7, R.string.punting, zp.g, new ia(16)), new lp("AM_FOOT_KICK_RETURNS", 8, R.string.amf_kick_returns, sp.g, new ia(17)), new lp("AM_FOOT_PUNT_RETURNS", 9, R.string.amf_punt_returns, xp.g, new ia(18))};
        d = lpVarArr;
        e = new kp5(lpVarArr);
    }

    public lp(String str, int i, int i2, kp5 kp5Var, Function1 function1) {
        this.a = i2;
        this.b = kp5Var;
        this.c = function1;
    }

    public static lp valueOf(String str) {
        return (lp) Enum.valueOf(lp.class, str);
    }

    public static lp[] values() {
        return (lp[]) d.clone();
    }

    @Override // defpackage.b0i
    public final String d() {
        return name();
    }

    @Override // defpackage.b0i
    public final int g() {
        return this.a;
    }

    @Override // defpackage.b0i
    public final Function1 h() {
        return this.c;
    }

    @Override // defpackage.b0i
    public final List i() {
        return this.b;
    }
}
