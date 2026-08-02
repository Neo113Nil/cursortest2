package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.results.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'q' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bef {
    public static final bef q;
    public static final bef r;
    public static final bef s;
    public static final bef t;
    public static final bef u;
    public static final /* synthetic */ bef[] v;
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Integer k;
    public final Integer l;
    public final long m;
    public final Integer n;
    public final String o;
    public final String p;

    static {
        Integer valueOf = Integer.valueOf(R.string.league_pass_promo_body_long);
        bef befVar = new bef("NBA_LEAGUE_PASS", 0, -1, "nba_league_pass", "nba_league_pass", "https://nba.sjv.io/c/5441787/2176796/16284", 2131232743, Integer.valueOf(R.drawable.ic_nba_league_pass), Integer.valueOf(R.string.league_pass_promo_title), valueOf, valueOf, 10L, 20656);
        q = befVar;
        bef befVar2 = new bef("UTR", 1, -3, "UTR", null, "https://www.utrprotennis.tv/?utm_source=partner&utm_medium=referral&utm_campaign=sofascore&utm_content=ad-banners", null, null, null, null, null, 0L, 32756);
        r = befVar2;
        bef befVar3 = new bef("FANTASY", 2, -4, "fantasy", null, null, null, null, null, null, null, 0L, 32764);
        s = befVar3;
        bef befVar4 = new bef("AI_ANALYST", 3, -5, "analyst", null, null, null, null, null, null, null, 0L, 32764);
        bef befVar5 = new bef("SFL", 4, -6, "swiss_football_league", "SwissFootballLeaguePromotionModal", "https://tv.sfl.ch/info-sfl?afsrc=sldgr-qK8nyw", Integer.valueOf(R.drawable.background_sfl), Integer.valueOf(R.drawable.ic_sfl_logo), Integer.valueOf(R.string.sfl_promo_bottom_sheet_title), Integer.valueOf(R.string.sfl_promo_bottom_sheet_body), Integer.valueOf(R.string.learn_more_button), 14L, 4096);
        t = befVar5;
        bef befVar6 = new bef("GENERIC", 5, -7, "generic", null, null, null, null, null, null, null, 0L, 32764);
        u = befVar6;
        v = new bef[]{befVar, befVar2, befVar3, befVar4, befVar5, befVar6};
    }

    public bef(String str, int i, int i2, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, long j, int i3) {
        Integer valueOf = Integer.valueOf(R.drawable.background_logo_sfl);
        String str5 = (i3 & 4) != 0 ? "" : str3;
        String str6 = (i3 & 8) != 0 ? null : str4;
        String str7 = (i3 & 16) != 0 ? null : "https://tv.sfl.ch/info-sfl?afsrc=sldgr-qK8nyw";
        boolean z = (i3 & 32) == 0;
        Integer num6 = (i3 & 64) != 0 ? null : num;
        valueOf = (i3 & 128) != 0 ? null : valueOf;
        Integer num7 = (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : num2;
        Integer num8 = (i3 & 512) != 0 ? null : num3;
        Integer num9 = (i3 & 1024) != 0 ? null : num4;
        Integer num10 = (i3 & a.o) != 0 ? null : num5;
        long j2 = (i3 & 8192) != 0 ? -1L : j;
        Integer num11 = (i3 & 16384) != 0 ? null : 3;
        this.a = i2;
        this.b = str2;
        this.c = str5;
        this.d = str6;
        this.e = str7;
        this.f = z;
        this.g = num6;
        this.h = valueOf;
        this.i = num7;
        this.j = num8;
        this.k = num9;
        this.l = num10;
        this.m = j2;
        this.n = num11;
        this.o = dmi.q("PROMOTION_MODAL_", name());
        this.p = lnb.o("PROMOTION_MODAL_", name(), "_COUNT");
    }

    public static bef valueOf(String str) {
        return (bef) Enum.valueOf(bef.class, str);
    }

    public static bef[] values() {
        return (bef[]) v.clone();
    }
}
