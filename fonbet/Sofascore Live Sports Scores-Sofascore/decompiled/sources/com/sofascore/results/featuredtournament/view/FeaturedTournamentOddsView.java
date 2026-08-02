package com.sofascore.results.featuredtournament.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.odds.FeaturedOddsWithProvider;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.eq3;
import defpackage.g6b;
import defpackage.hkg;
import defpackage.l4a;
import defpackage.ok3;
import defpackage.pu1;
import defpackage.rld;
import defpackage.rx1;
import defpackage.v82;
import defpackage.zsk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sofascore/results/featuredtournament/view/FeaturedTournamentOddsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lg6b;", "lifecycle", "", "setLifecycle", "(Lg6b;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FeaturedTournamentOddsView extends ConstraintLayout {
    public static final /* synthetic */ int d = 0;
    public final v82 a;
    public zsk b;
    public g6b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeaturedTournamentOddsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        context.getClass();
        hkg.S(context).inflate(R.layout.view_featured_tournament_event_odds, this);
        this.a = v82.f(this);
    }

    public final void f(pu1 pu1Var, OddsChoice oddsChoice, FeaturedOddsWithProvider featuredOddsWithProvider, Event event) {
        LinearLayout linearLayout = pu1Var.b;
        if (oddsChoice == null) {
            linearLayout.setVisibility(8);
            return;
        }
        OddsCountryProvider countryProvider = featuredOddsWithProvider.getCountryProvider();
        int i = 8;
        ProviderOdds featuredOdds = featuredOddsWithProvider.getFeaturedOdds();
        TextView textView = pu1Var.e;
        ImageView imageView = pu1Var.c;
        linearLayout.setVisibility(0);
        linearLayout.setActivated(ok3.C(event) && oddsChoice.getWinning());
        TextView textView2 = pu1Var.d;
        Context context = getContext();
        context.getClass();
        textView2.setText(rld.n(context, OddsChoice.getReversibleName$default(oddsChoice, null, 1, null), ok3.s(event)));
        textView.setVisibility(0);
        textView.setTextColor(getContext().getColor(featuredOdds.isLive() ? R.color.value : R.color.n_lv_1));
        Context context2 = getContext();
        context2.getClass();
        l4a.K(textView, rld.m(context2, oddsChoice.getFractionalValue()));
        if (oddsChoice.getChange() != 0) {
            i = 0;
        }
        imageView.setVisibility(i);
        if (oddsChoice.getChange() < 0) {
            imageView.setImageTintList(eq3.q(R.color.live, getContext()));
            imageView.setRotation(180.0f);
        } else if (oddsChoice.getChange() > 0) {
            imageView.setImageTintList(eq3.q(R.color.success, getContext()));
            imageView.setRotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        Context context3 = getContext();
        context3.getClass();
        String k = rld.k(context3, countryProvider, featuredOddsWithProvider.getFeaturedOdds(), oddsChoice);
        if (k == null || k.length() == 0 || !countryProvider.getBranded()) {
            linearLayout.setClickable(false);
            linearLayout.setEnabled(false);
            linearLayout.setOnClickListener(null);
        } else {
            linearLayout.setClickable(true);
            linearLayout.setEnabled(true);
            linearLayout.setOnClickListener(new rx1(linearLayout, featuredOdds, countryProvider, event, k, 2));
        }
    }

    public final void setLifecycle(@NotNull g6b lifecycle) {
        lifecycle.getClass();
        this.c = lifecycle;
    }
}
