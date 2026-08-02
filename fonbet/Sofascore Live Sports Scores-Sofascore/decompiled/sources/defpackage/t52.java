package defpackage;

import com.sofascore.model.mvvm.model.StandingsBucket;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t52 implements tsi {
    public static final t52 c;
    public static final t52 d;
    public static final t52 e;
    public static final t52 f;
    public static final /* synthetic */ t52[] g;
    public static final /* synthetic */ kp5 h;
    public final String a;
    public final StandingsBucket b;

    static {
        t52 t52Var = new t52("CONFERENCE", 0, "bucket_conference", StandingsBucket.CONFERENCE);
        c = t52Var;
        t52 t52Var2 = new t52("DIVISION", 1, "bucket_division", StandingsBucket.DIVISION);
        d = t52Var2;
        t52 t52Var3 = new t52("LEAGUE", 2, "bucket_league", StandingsBucket.LEAGUE);
        e = t52Var3;
        t52 t52Var4 = new t52("OVERALL", 3, "bucket_overall", StandingsBucket.OVERALL);
        f = t52Var4;
        t52[] t52VarArr = {t52Var, t52Var2, t52Var3, t52Var4};
        g = t52VarArr;
        h = new kp5(t52VarArr);
    }

    public t52(String str, int i, String str2, StandingsBucket standingsBucket) {
        this.a = str2;
        this.b = standingsBucket;
    }

    public static t52 valueOf(String str) {
        return (t52) Enum.valueOf(t52.class, str);
    }

    public static t52[] values() {
        return (t52[]) g.clone();
    }

    @Override // defpackage.tsi
    public final String d() {
        return this.a;
    }
}
