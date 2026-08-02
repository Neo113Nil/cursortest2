package defpackage;

import android.content.Context;
import com.sofascore.results.player.statistics.compare.model.ComparisonSeasonInfo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xme implements f73 {
    public final Context a;
    public final wve b;
    public final String c;

    public xme(Context context, wve wveVar, String str) {
        wveVar.getClass();
        this.a = context;
        this.b = wveVar;
        this.c = str;
    }

    @Override // defpackage.f73
    public final Object a(int i, rq3 rq3Var) {
        return s9a.r(new sme(this, i, null), rq3Var);
    }

    @Override // defpackage.f73
    public final ComparisonSeasonInfo b(ComparisonSeasonInfo comparisonSeasonInfo, String str) {
        comparisonSeasonInfo.getClass();
        ComparisonSeasonInfo.UniqueTournamentSeasonInfo uniqueTournamentSeasonInfo = comparisonSeasonInfo instanceof ComparisonSeasonInfo.UniqueTournamentSeasonInfo ? (ComparisonSeasonInfo.UniqueTournamentSeasonInfo) comparisonSeasonInfo : null;
        return uniqueTournamentSeasonInfo == null ? comparisonSeasonInfo : ComparisonSeasonInfo.UniqueTournamentSeasonInfo.a(uniqueTournamentSeasonInfo, str);
    }

    @Override // defpackage.f73
    public final Object c(int i, qo2 qo2Var, ComparisonSeasonInfo comparisonSeasonInfo, oyg oygVar) {
        return s9a.r(new wme(qo2Var, comparisonSeasonInfo, this, i, null), oygVar);
    }
}
