package defpackage;

import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class y3b {
    public static final q1f e;
    public static final y3b f;
    public static final y3b g;
    public static final y3b h;
    public static final y3b i;
    public static final /* synthetic */ y3b[] j;
    public static final /* synthetic */ kp5 k;
    public final int a;
    public final int b;
    public final String c;
    public final Function1 d;

    static {
        y3b y3bVar = new y3b("ALL_TRANSACTIONS", 0, R.string.all_transactions, 1, Season.YEAR_ALL_TIME, new isa(8));
        f = y3bVar;
        y3b y3bVar2 = new y3b("TRADED", 1, R.string.players_traded, 10, "traded", new isa(9));
        g = y3bVar2;
        y3b y3bVar3 = new y3b("SIGNED", 2, R.string.players_signed, 7, "signed", new isa(10));
        y3b y3bVar4 = new y3b("WAIVED", 3, R.string.players_waived, 8, "waived", new isa(11));
        y3b y3bVar5 = new y3b("CLAIMED", 4, R.string.players_claimed_off_waivers, 9, "claimed", new isa(12));
        y3b y3bVar6 = new y3b("RELEASED", 5, R.string.players_released, 6, "released", new isa(13));
        y3b y3bVar7 = new y3b("CONTRACT_EXPIRED", 6, R.string.contract_expired, 12, "contract-expired", new isa(14));
        y3b y3bVar8 = new y3b("CONTRACT_10_DAYS", 7, R.string.contract_10_days, 13, "ten-day-contract", new isa(15));
        h = y3bVar8;
        y3b y3bVar9 = new y3b("CONTRACT_10_DAYS_2ND", 8, R.string.contract_10_days_2nd, 14, "second-ten-day-contract", new isa(16));
        i = y3bVar9;
        y3b[] y3bVarArr = {y3bVar, y3bVar2, y3bVar3, y3bVar4, y3bVar5, y3bVar6, y3bVar7, y3bVar8, y3bVar9, new y3b("END_OF_CAREER", 9, R.string.players_retired, 4, "end-of-career", new isa(17))};
        j = y3bVarArr;
        k = new kp5(y3bVarArr);
        e = new q1f(26);
    }

    public y3b(String str, int i2, int i3, int i4, String str2, Function1 function1) {
        this.a = i3;
        this.b = i4;
        this.c = str2;
        this.d = function1;
    }

    public static y3b valueOf(String str) {
        return (y3b) Enum.valueOf(y3b.class, str);
    }

    public static y3b[] values() {
        return (y3b[]) j.clone();
    }
}
