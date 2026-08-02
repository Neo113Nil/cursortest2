package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pzh {
    public static final haf b;
    public static final Integer[] c;
    public static final pzh d;
    public static final /* synthetic */ pzh[] e;
    public static final /* synthetic */ kp5 f;
    public final boolean a;

    static {
        pzh pzhVar = new pzh("EVENT_ROW", 0, true);
        pzh pzhVar2 = new pzh("BASEBALL_TABLE_EVENT_ROW", 1, true);
        pzh pzhVar3 = new pzh("TOURNAMENT_ROW", 2, true);
        pzh pzhVar4 = new pzh("TOURNAMENT_GROUP_ROW", 3, false);
        pzh pzhVar5 = new pzh("CRICKET_EVENT_ROW", 4, true);
        pzh pzhVar6 = new pzh("FOOTBALL_EVENT_ROW", 5, true);
        pzh pzhVar7 = new pzh("FOOTBALL_EVENT_WITH_ODDS_CARD", 6, true);
        pzh pzhVar8 = new pzh("TENNIS_EVENT_ROW", 7, true);
        pzh pzhVar9 = new pzh("BASKETBALL_EVENT_ROW", 8, true);
        pzh pzhVar10 = new pzh("DIVIDER_ROW", 9, false);
        pzh pzhVar11 = new pzh("EMPTY_STATE", 10, false);
        pzh pzhVar12 = new pzh("BRANDING_ROW", 11, false);
        pzh pzhVar13 = new pzh("RECOMMENDED_SECTION", 12, true);
        pzh pzhVar14 = new pzh("CHECK_BOX_ROW", 13, false);
        pzh pzhVar15 = new pzh("SECTION_ROW", 14, false);
        pzh pzhVar16 = new pzh("LIVE_EMPTY_STATE", 15, false);
        pzh pzhVar17 = new pzh("DATE_SECTION", 16, false);
        pzh pzhVar18 = new pzh("SHOW_HIDE_SECTION", 17, true);
        pzh pzhVar19 = new pzh("STAGE_ROW", 18, true);
        pzh pzhVar20 = new pzh("UNIQUE_STAGE_ROW", 19, true);
        pzh pzhVar21 = new pzh("FAVORITES_SUGGESTION", 20, true);
        pzh pzhVar22 = new pzh("NO_FAVORITES_HEADER", 21, false);
        d = pzhVar22;
        pzh[] pzhVarArr = {pzhVar, pzhVar2, pzhVar3, pzhVar4, pzhVar5, pzhVar6, pzhVar7, pzhVar8, pzhVar9, pzhVar10, pzhVar11, pzhVar12, pzhVar13, pzhVar14, pzhVar15, pzhVar16, pzhVar17, pzhVar18, pzhVar19, pzhVar20, pzhVar21, pzhVar22, new pzh("TRANSFER_ROW", 22, true), new pzh("ROUND_ROW", 23, false), new pzh("LOADER_ROW", 24, false)};
        e = pzhVarArr;
        f = new kp5(pzhVarArr);
        b = new haf(2);
        c = new Integer[]{Integer.valueOf(pzhVar.ordinal()), Integer.valueOf(pzhVar6.ordinal()), Integer.valueOf(pzhVar8.ordinal()), Integer.valueOf(pzhVar9.ordinal())};
    }

    public pzh(String str, int i, boolean z) {
        this.a = z;
    }

    public static pzh valueOf(String str) {
        return (pzh) Enum.valueOf(pzh.class, str);
    }

    public static pzh[] values() {
        return (pzh[]) e.clone();
    }
}
