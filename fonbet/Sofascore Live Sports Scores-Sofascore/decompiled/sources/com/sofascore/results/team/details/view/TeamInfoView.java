package com.sofascore.results.team.details.view;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import androidx.compose.runtime.e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.model.newNetwork.newRankings.Ranking;
import com.sofascore.model.newNetwork.newRankings.RankingRow;
import com.sofascore.results.R;
import com.sofascore.results.manager.ManagerActivity;
import com.sofascore.results.ranking.RankingsActivity;
import com.sofascore.results.venue.VenueActivity;
import defpackage.a3;
import defpackage.av8;
import defpackage.bea;
import defpackage.e1d;
import defpackage.eoh;
import defpackage.eqf;
import defpackage.exi;
import defpackage.fxi;
import defpackage.gxi;
import defpackage.haa;
import defpackage.hxi;
import defpackage.ixi;
import defpackage.jaa;
import defpackage.jmf;
import defpackage.jxi;
import defpackage.kxi;
import defpackage.lxi;
import defpackage.mxi;
import defpackage.of3;
import defpackage.ogj;
import defpackage.ph0;
import defpackage.q8i;
import defpackage.s5h;
import defpackage.tba;
import defpackage.tv3;
import defpackage.wyh;
import defpackage.yid;
import defpackage.yqo;
import defpackage.zzl;
import java.time.Instant;
import java.time.Month;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001R/\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/sofascore/results/team/details/view/TeamInfoView;", "La3;", "Lmxi;", "<set-?>", CampaignEx.JSON_KEY_AD_K, "Le1d;", "getData", "()Lmxi;", "setData", "(Lmxi;)V", "data", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TeamInfoView extends a3 {
    public static final /* synthetic */ int l = 0;

    /* renamed from: k, reason: from kotlin metadata */
    public final e1d data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.data = e.f(null);
    }

    private final mxi getData() {
        return (mxi) ((eoh) this.data).getValue();
    }

    private final void setData(mxi mxiVar) {
        ((eoh) this.data).setValue(mxiVar);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1230536551);
        int i2 = (av8Var.g(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            mxi data = getData();
            if (data == null || (data.c == null && data.e == null && data.d == null && data.g == null && data.f == null && data.h == null)) {
                data = null;
            }
            if (data == null) {
                av8Var.d0(1368818074);
                av8Var.s(false);
            } else {
                av8Var.d0(1368818075);
                haa.f(yqo.H(363623981, av8Var, new s5h(15, data, this)), av8Var, 6);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new q8i(this, i, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(Team team, List list) {
        jxi jxiVar;
        Ranking ranking;
        ixi ixiVar;
        kxi kxiVar;
        kxi kxiVar2;
        Object obj;
        jxi jxiVar2;
        team.getClass();
        String sportSlug = team.getSportSlug();
        if (sportSlug == null) {
            sportSlug = "";
        }
        boolean national = team.getNational();
        Manager manager = team.getManager();
        if (wyh.e(sportSlug) || sportSlug.equals(Sports.BEACH_VOLLEY)) {
            jxiVar = null;
        } else {
            if (manager != null) {
                int id = manager.getId();
                Integer valueOf = Integer.valueOf(id);
                if (id <= 0) {
                    valueOf = null;
                }
                jxiVar2 = new jxi(valueOf, tba.s(manager));
            } else {
                String string = getContext().getString(R.string.value_unknown);
                string.getClass();
                jxiVar2 = new jxi(null, string);
            }
            jxiVar = jxiVar2;
        }
        jmf jmfVar = jmf.b;
        Set a0 = ph0.a0(new Integer[]{2, 9});
        ZonedDateTime atZone = Instant.now().atZone(ZoneOffset.UTC);
        int year = atZone.getYear() + (atZone.getMonth().ordinal() > Month.JUNE.ordinal() ? 1 : 0);
        if (list != null) {
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                Ranking ranking2 = (Ranking) obj;
                RankingRow rankingRow = (RankingRow) CollectionsKt.firstOrNull(ranking2.getRankingRows());
                Integer year2 = rankingRow != null ? rankingRow.getYear() : null;
                if (a0.contains(Integer.valueOf(ranking2.getRankingType().getId())) && (year2 == null || year2.intValue() == year)) {
                    break;
                }
            }
            ranking = (Ranking) obj;
        } else {
            ranking = null;
        }
        int id2 = team.getId();
        boolean national2 = team.getNational();
        Long foundationDateTimestamp = team.getFoundationDateTimestamp();
        Country country = team.getCountry();
        if (country != null) {
            if (national || country.getAlpha2() == null) {
                country = null;
            }
            if (country != null) {
                Context context = getContext();
                context.getClass();
                ixiVar = new ixi(tv3.c(context, country.getName()), country.getAlpha2());
                Integer championshipsWon = team.getChampionshipsWon();
                Integer num = (championshipsWon == null && sportSlug.equals(Sports.AMERICAN_FOOTBALL)) ? championshipsWon : null;
                if (ranking == null) {
                    RankingRow rankingRow2 = (RankingRow) CollectionsKt.firstOrNull(ranking.getRankingRows());
                    if (rankingRow2 != null) {
                        int position = rankingRow2.getPosition();
                        double k = yid.k(rankingRow2.getPoints());
                        for (jmf jmfVar2 : jmf.j) {
                            if (ranking.getRankingType().getId() == jmfVar2.a) {
                                kxiVar2 = new kxi(position, k, jmfVar2);
                            }
                        }
                        ogj.m("Collection contains no element matching the predicate.");
                        return;
                    }
                    kxiVar2 = null;
                    kxiVar = kxiVar2;
                } else {
                    kxiVar = null;
                }
                Venue venue = team.getVenue();
                setData(new mxi(id2, national2, jxiVar, foundationDateTimestamp, ixiVar, num, kxiVar, venue == null ? new lxi(venue.getId(), venue.getCapacity(), venue.getStadium().getName(), venue.getCity().getName(), Intrinsics.c(venue.getHidden(), Boolean.FALSE)) : null));
            }
        }
        ixiVar = null;
        Integer championshipsWon2 = team.getChampionshipsWon();
        if (championshipsWon2 == null) {
        }
        if (ranking == null) {
        }
        Venue venue2 = team.getVenue();
        setData(new mxi(id2, national2, jxiVar, foundationDateTimestamp, ixiVar, num, kxiVar, venue2 == null ? new lxi(venue2.getId(), venue2.getCapacity(), venue2.getStadium().getName(), venue2.getCity().getName(), Intrinsics.c(venue2.getHidden(), Boolean.FALSE)) : null));
    }

    public final void m(hxi hxiVar) {
        if (hxiVar instanceof exi) {
            int i = ManagerActivity.R;
            Context context = getContext();
            context.getClass();
            bea.M(((exi) hxiVar).a, context);
            return;
        }
        if (hxiVar instanceof fxi) {
            int i2 = RankingsActivity.O;
            Context context2 = getContext();
            context2.getClass();
            jmf jmfVar = ((fxi) hxiVar).a;
            mxi data = getData();
            jaa.N(context2, jmfVar, data != null ? Integer.valueOf(data.a) : null);
            return;
        }
        if (!(hxiVar instanceof gxi)) {
            zzl.b();
            return;
        }
        int i3 = VenueActivity.Q;
        Context context3 = getContext();
        context3.getClass();
        int i4 = ((gxi) hxiVar).a;
        Intent intent = new Intent(context3, (Class<?>) VenueActivity.class);
        intent.putExtra("venue_id", i4);
        context3.startActivity(intent);
    }
}
