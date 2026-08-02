package com.sofascore.results.ranking;

import android.os.Bundle;
import com.sofascore.model.Sports;
import com.sofascore.results.R;
import defpackage.amf;
import defpackage.gz8;
import defpackage.jmf;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/ranking/TennisUtrRankingsActivity;", "Lcom/sofascore/results/ranking/RankingsActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TennisUtrRankingsActivity extends RankingsActivity {
    @Override // com.sofascore.results.ranking.RankingsActivity
    public final String Q() {
        return Sports.TENNIS;
    }

    @Override // com.sofascore.results.ranking.RankingsActivity
    public final int S() {
        return X() == jmf.g ? R.string.utr_mens_rankings : R.string.utr_womens_rankings;
    }

    @Override // com.sofascore.results.ranking.RankingsActivity
    public final List U() {
        return a.c(X() == jmf.g ? amf.l : amf.m);
    }

    @Override // com.sofascore.results.ranking.RankingsActivity
    public final int V() {
        return R.string.find_text;
    }

    public final jmf X() {
        jmf jmfVar;
        Bundle extras = getIntent().getExtras();
        return (extras == null || (jmfVar = (jmf) gz8.M(extras, "category", jmf.class)) == null) ? jmf.g : jmfVar;
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return X() == jmf.g ? "UtrMenRankingScreen" : "UtrWomenRankingScreen";
    }
}
