package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class oei {
    public static final oei b;
    public static final oei c;
    public static final oei d;
    public static final /* synthetic */ oei[] e;
    public static final /* synthetic */ kp5 f;
    public final int a;

    static {
        oei oeiVar = new oei("ALL", 0, R.string.all);
        b = oeiVar;
        oei oeiVar2 = new oei("PER_GAME", 1, R.string.per_game_stats_short);
        c = oeiVar2;
        oei oeiVar3 = new oei("TOTAL", 2, R.string.total_stats_short);
        d = oeiVar3;
        oei[] oeiVarArr = {oeiVar, oeiVar2, oeiVar3};
        e = oeiVarArr;
        f = new kp5(oeiVarArr);
    }

    public oei(String str, int i, int i2) {
        this.a = i2;
    }

    public static oei valueOf(String str) {
        return (oei) Enum.valueOf(oei.class, str);
    }

    public static oei[] values() {
        return (oei[]) e.clone();
    }
}
