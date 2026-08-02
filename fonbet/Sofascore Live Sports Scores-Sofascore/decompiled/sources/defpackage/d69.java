package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class d69 implements e1 {
    public static final /* synthetic */ d69[] g;
    public static final /* synthetic */ kp5 h;
    public final int a;
    public final int b;
    public final boolean c;
    public final Function1 d;
    public final Function1 e;
    public final Function1 f;

    static {
        d69[] d69VarArr = {new d69(0, R.string.basketball_lineups_minutes_played, R.string.legend_handball_minutes, "PLAYED", new ol8(15), new c69(2), new ol8(16), true), new d69(1, R.string.handball_lineups_save_percentage, R.string.legend_handball_save_pct, "SAVE_PERCENTAGE", new ol8(17), new ol8(18), new ol8(19), false), new d69(2, R.string.handball_lineups_saves, R.string.legend_handball_saves, "SAVES", new ol8(20), new ol8(21), new ol8(22), false), new d69(3, R.string.handball_lineups_shots, R.string.legend_handball_shots, "SHOTS", new ol8(23), new ol8(24), new ol8(25), false), new d69(4, R.string.handball_lineups_7m_saves, R.string.legend_handball_seven_meter_saves, "SAVES_7M", new ol8(26), new ol8(27), new ol8(28), false), new d69(5, R.string.handball_goals_conceded_short, R.string.legend_handball_goals_conceded, "GOALS_CONCEDED", new ol8(29), new c69(0), new c69(1), true)};
        g = d69VarArr;
        h = new kp5(d69VarArr);
    }

    public d69(int i, int i2, int i3, String str, Function1 function1, Function1 function12, Function1 function13, boolean z) {
        this.a = i2;
        this.b = i3;
        this.c = z;
        this.d = function1;
        this.e = function12;
        this.f = function13;
    }

    public static d69 valueOf(String str) {
        return (d69) Enum.valueOf(d69.class, str);
    }

    public static d69[] values() {
        return (d69[]) g.clone();
    }

    @Override // defpackage.e1
    public final Function1 d() {
        return this.d;
    }

    @Override // defpackage.e1
    public final int g() {
        return this.a;
    }

    @Override // defpackage.e1
    public final Function1 h() {
        return this.e;
    }

    @Override // defpackage.e1
    public final boolean i() {
        return false;
    }

    @Override // defpackage.e1
    public final boolean j() {
        return this.c;
    }

    @Override // defpackage.e1
    public final int l() {
        return this.b;
    }

    @Override // defpackage.e1
    public final Function1 m() {
        return this.f;
    }
}
