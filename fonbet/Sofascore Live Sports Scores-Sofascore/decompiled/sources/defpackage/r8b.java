package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class r8b {
    public static final r8b b;
    public static final r8b c;
    public static final r8b d;
    public static final r8b e;
    public static final r8b f;
    public static final r8b g;
    public static final r8b h;
    public static final r8b i;
    public static final /* synthetic */ r8b[] j;
    public static final /* synthetic */ kp5 k;
    public final q9k a;

    static {
        r8b r8bVar = new r8b(0, new q9k(R.string.lineups_chip_performance), "Performance");
        b = r8bVar;
        r8b r8bVar2 = new r8b(1, new q9k(R.string.football_lineups_chip_running_distance), "Distance");
        c = r8bVar2;
        r8b r8bVar3 = new r8b(2, new q9k(R.string.fantasy), "Fantasy");
        d = r8bVar3;
        r8b r8bVar4 = new r8b(3, new q9k(R.string.lineups_chip_club), "Club");
        e = r8bVar4;
        r8b r8bVar5 = new r8b(4, new q9k(R.string.lineups_chip_nationality), "Nationality");
        f = r8bVar5;
        r8b r8bVar6 = new r8b(5, new q9k(R.string.lineups_chip_age), "Age");
        g = r8bVar6;
        r8b r8bVar7 = new r8b(6, new q9k(R.string.lineups_chip_market_value), "MarketValue");
        h = r8bVar7;
        r8b r8bVar8 = new r8b(7, new q9k(R.string.lineups_chip_height), "Height");
        i = r8bVar8;
        r8b[] r8bVarArr = {r8bVar, r8bVar2, r8bVar3, r8bVar4, r8bVar5, r8bVar6, r8bVar7, r8bVar8};
        j = r8bVarArr;
        k = new kp5(r8bVarArr);
    }

    public r8b(int i2, q9k q9kVar, String str) {
        this.a = q9kVar;
    }

    public static r8b valueOf(String str) {
        return (r8b) Enum.valueOf(r8b.class, str);
    }

    public static r8b[] values() {
        return (r8b[]) j.clone();
    }
}
