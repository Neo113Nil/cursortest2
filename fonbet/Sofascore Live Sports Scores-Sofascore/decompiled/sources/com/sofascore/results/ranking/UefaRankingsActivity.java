package com.sofascore.results.ranking;

import com.sofascore.model.Sports;
import com.sofascore.results.R;
import defpackage.amf;
import defpackage.yid;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/ranking/UefaRankingsActivity;", "Lcom/sofascore/results/ranking/RankingsActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UefaRankingsActivity extends RankingsActivity {
    @Override // com.sofascore.results.ranking.RankingsActivity
    public final String Q() {
        return Sports.FOOTBALL;
    }

    @Override // com.sofascore.results.ranking.RankingsActivity
    public final int S() {
        return R.string.uefa_rankings;
    }

    @Override // com.sofascore.results.ranking.RankingsActivity
    public final int T(Integer num) {
        Regex regex = yid.a;
        return num.intValue() > 0 ? 1 : 0;
    }

    @Override // com.sofascore.results.ranking.RankingsActivity
    public final List U() {
        return b.j(amf.d, amf.k);
    }

    @Override // com.sofascore.results.ranking.RankingsActivity
    public final int V() {
        return R.string.search;
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "UefaRankingScreen";
    }
}
