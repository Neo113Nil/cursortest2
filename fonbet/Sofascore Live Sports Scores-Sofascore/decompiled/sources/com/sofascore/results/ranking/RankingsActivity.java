package com.sofascore.results.ranking;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.ranking.RankingsActivity;
import defpackage.bti;
import defpackage.cce;
import defpackage.cne;
import defpackage.duf;
import defpackage.eqb;
import defpackage.hkg;
import defpackage.imf;
import defpackage.k1d;
import defpackage.kmf;
import defpackage.ltb;
import defpackage.mlf;
import defpackage.mme;
import defpackage.mmf;
import defpackage.mqi;
import defpackage.otk;
import defpackage.rq3;
import defpackage.sy0;
import defpackage.un0;
import defpackage.xw3;
import defpackage.ypa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/sofascore/results/ranking/RankingsActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "jmf", "jaa", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class RankingsActivity extends Hilt_RankingsActivity {
    public static final /* synthetic */ int O = 0;
    public final otk K;
    public final mqi L;
    public final mqi M;
    public int N;

    public RankingsActivity() {
        final int i = 0;
        final int i2 = 1;
        this.K = new otk(duf.a.getOrCreateKotlinClass(mlf.class), new kmf(this, i2), new kmf(this, i), new kmf(this, 2));
        this.L = ypa.b(new Function0(this) { // from class: hmf
            public final /* synthetic */ RankingsActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                RankingsActivity rankingsActivity = this.b;
                switch (i3) {
                    case 0:
                        int i4 = RankingsActivity.O;
                        return bti.a(rankingsActivity.getLayoutInflater());
                    default:
                        int i5 = RankingsActivity.O;
                        return new mmf(rankingsActivity, rankingsActivity.R().i, rankingsActivity.R().g);
                }
            }
        });
        this.M = ypa.b(new Function0(this) { // from class: hmf
            public final /* synthetic */ RankingsActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                RankingsActivity rankingsActivity = this.b;
                switch (i3) {
                    case 0:
                        int i4 = RankingsActivity.O;
                        return bti.a(rankingsActivity.getLayoutInflater());
                    default:
                        int i5 = RankingsActivity.O;
                        return new mmf(rankingsActivity, rankingsActivity.R().i, rankingsActivity.R().g);
                }
            }
        });
    }

    public abstract String Q();

    public final bti R() {
        return (bti) this.L.getValue();
    }

    public abstract int S();

    public int T(Integer num) {
        return 0;
    }

    public abstract List U();

    public abstract int V();

    public final void W() {
        AbstractActivity.O(R().g, Integer.valueOf(hkg.X(this)), getColor(R.color.on_color_primary));
        AbstractActivity.M(this, R().h, getString(S()), null, null, 60);
        R().c.setBackground(sy0.a);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        Intent intent = getIntent();
        int i = 0;
        if (intent != null && (extras = intent.getExtras()) != null) {
            i = extras.getInt("INITIAL_ID", 0);
        }
        this.N = i;
        setContentView(R().a);
        W();
        this.o = R().f;
        ViewPager2 viewPager2 = R().i;
        mqi mqiVar = this.M;
        viewPager2.setAdapter((mmf) mqiVar.getValue());
        ((mmf) mqiVar.getValue()).r = this.N;
        otk otkVar = this.K;
        ((mlf) otkVar.getValue()).i.e(this, new eqb(18, new mme(this, 16)));
        mlf mlfVar = (mlf) otkVar.getValue();
        List U = U();
        U.getClass();
        xw3.L(un0.z(mlfVar), null, null, new cce(mlfVar, U, (rq3) null, 5), 3);
        AdBannerView adBannerView = R().b;
        ltb ltbVar = new ltb();
        String Q = Q();
        if (Q != null) {
            ltbVar.put(SearchResponseKt.SPORT_ENTITY, Q);
        }
        I(adBannerView, ltbVar.d());
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.activity_ranking_menu, menu);
        View actionView = menu.findItem(R.id.search).getActionView();
        actionView.getClass();
        SearchView searchView = (SearchView) actionView;
        searchView.setOnCloseListener(new imf(this, 0));
        searchView.setOnSearchClickListener(new cne(this, 13));
        searchView.setQueryHint(getResources().getString(V()));
        searchView.setOnQueryTextListener(new k1d(21, searchView, this));
        return true;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
