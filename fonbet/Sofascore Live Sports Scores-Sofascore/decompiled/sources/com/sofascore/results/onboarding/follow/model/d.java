package com.sofascore.results.onboarding.follow.model;

import android.content.Context;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.onboarding.follow.model.OnboardingItemAdditionalIcon;
import defpackage.qea;
import defpackage.srd;
import defpackage.tba;
import defpackage.wv8;
import defpackage.wyh;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d {
    public static final d a = new d();

    public static OnboardingItemUiModel a(Context context, UniqueTournament uniqueTournament) {
        uniqueTournament.getClass();
        String x = tba.x(uniqueTournament);
        if (x == null) {
            x = "";
        }
        StringBuilder sb = new StringBuilder(x);
        if (uniqueTournament.isFemale() && Intrinsics.c(uniqueTournament.getSportSlug(), Sports.TENNIS)) {
            sb.append(" ");
            sb.append(context.getString(R.string.female_team));
        }
        return new OnboardingItemUiModel(uniqueTournament.getId(), srd.c, sb.toString(), uniqueTournament.getSportSlug(), (OnboardingItemAdditionalIcon.TeamLogo) null, 48);
    }

    public static OnboardingItemUiModel b(Player player) {
        int id = player.getId();
        srd srdVar = srd.b;
        String t = tba.t(player);
        String sportSlug = player.getSportSlug();
        Team team = player.getTeam();
        return new OnboardingItemUiModel(id, srdVar, t, sportSlug, team != null ? new OnboardingItemAdditionalIcon.TeamLogo(team.getId()) : null, 32);
    }

    public static OnboardingItemUiModel c(Context context, Team team) {
        OnboardingItemAdditionalIcon countryFlag;
        team.getClass();
        int id = team.getId();
        srd srdVar = srd.a;
        String p = tba.p(context, team);
        if (qea.y(team) && team.getSport() != null) {
            Set set = wyh.a;
            if (!wyh.e(team.getSportSlug())) {
                p = wv8.i(p, " ", context.getString(R.string.female_team));
            }
        }
        String sportSlug = team.getSportSlug();
        if (team.getNational()) {
            countryFlag = new OnboardingItemAdditionalIcon.SportIcon(team.getSportSlug());
        } else {
            Country country = team.getCountry();
            countryFlag = new OnboardingItemAdditionalIcon.CountryFlag(country != null ? country.getAlpha2() : null);
        }
        return new OnboardingItemUiModel(id, srdVar, p, sportSlug, countryFlag, team.getNational() ? new OnboardingItemAdditionalIcon.SportIcon(team.getSportSlug()) : null);
    }
}
