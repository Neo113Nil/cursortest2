package com.sofascore.results.team.details.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.newNetwork.TeamUniqueTournament;
import com.sofascore.model.newNetwork.newRankings.Ranking;
import com.sofascore.model.newNetwork.newRankings.RankingRow;
import com.sofascore.results.R;
import defpackage.a3;
import defpackage.av8;
import defpackage.bi4;
import defpackage.c6j;
import defpackage.d6j;
import defpackage.deh;
import defpackage.dla;
import defpackage.e1d;
import defpackage.e6j;
import defpackage.eoh;
import defpackage.eqf;
import defpackage.f6j;
import defpackage.fc6;
import defpackage.g6j;
import defpackage.gv9;
import defpackage.haa;
import defpackage.l6g;
import defpackage.of3;
import defpackage.ph0;
import defpackage.rlh;
import defpackage.waa;
import defpackage.xbb;
import defpackage.yid;
import defpackage.yqo;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001R7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/sofascore/results/team/details/view/TennisPlayerRankingView;", "La3;", "Lgv9;", "Le6j;", "<set-?>", CampaignEx.JSON_KEY_AD_K, "Le1d;", "getRankings", "()Lgv9;", "setRankings", "(Lgv9;)V", "rankings", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TennisPlayerRankingView extends a3 {
    public static final /* synthetic */ int l = 0;

    /* renamed from: k, reason: from kotlin metadata */
    public final e1d rankings;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TennisPlayerRankingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.rankings = e.f(rlh.b);
        setVisibility(8);
    }

    private final gv9 getRankings() {
        return (gv9) ((eoh) this.rankings).getValue();
    }

    public static final Unit l(TennisPlayerRankingView tennisPlayerRankingView, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 3) != 2)) {
            g6j.b(tennisPlayerRankingView.getRankings(), av8Var, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final void setRankings(gv9 gv9Var) {
        ((eoh) this.rankings).setValue(gv9Var);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1893298655);
        int i2 = (av8Var.g(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            haa.f(yqo.H(-1261108326, av8Var, new f6j(this)), av8Var, 6);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f6j(this, i);
        }
    }

    public final void m(List list, List list2) {
        Object obj;
        Object obj2;
        d6j d6jVar;
        d6j d6jVar2;
        list.getClass();
        list2.getClass();
        if (getVisibility() == 0) {
            return;
        }
        setVisibility(0);
        Context context = getContext();
        context.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (ph0.a0(new Integer[]{Integer.valueOf(c6j.e.d), Integer.valueOf(c6j.f.d)}).contains(Integer.valueOf(((Ranking) obj).getRankingType().getId()))) {
                    break;
                }
            }
        }
        Ranking ranking = (Ranking) obj;
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it2.next();
                if (ph0.a0(new Integer[]{Integer.valueOf(c6j.g.d), Integer.valueOf(c6j.h.d)}).contains(Integer.valueOf(((Ranking) obj2).getRankingType().getId()))) {
                    break;
                }
            }
        }
        Ranking ranking2 = (Ranking) obj2;
        xbb b = a.b();
        if (ranking != null) {
            int id = ranking.getRankingType().getId();
            c6j c6jVar = c6j.e;
            if (id != c6jVar.d) {
                c6jVar = c6j.f;
            }
            RankingRow rankingRow = (RankingRow) CollectionsKt.firstOrNull(ranking.getRankingRows());
            if (rankingRow != null) {
                d6j r = waa.r(context, rankingRow, c6jVar);
                Integer bestPosition = rankingRow.getBestPosition();
                if (bestPosition != null) {
                    StringBuilder sb = new StringBuilder(yid.p(bestPosition.intValue()));
                    Long bestPositionTimestamp = rankingRow.getBestPositionTimestamp();
                    if (bestPositionTimestamp != null) {
                        long longValue = bestPositionTimestamp.longValue();
                        bi4 bi4Var = bi4.PATTERN_DMMY;
                        Locale d = dla.d();
                        ZoneId of = ZoneId.of("GMT");
                        of.getClass();
                        sb.append(" (" + fc6.i(longValue, DateTimeFormatter.ofPattern(bi4Var.d(), d).withZone(of).withDecimalStyle(DecimalStyle.of(d))) + ")");
                    }
                    d6jVar = new d6j(sb.toString(), (deh) null, 6);
                } else {
                    d6jVar = null;
                }
                if (Boolean.valueOf(!list2.isEmpty()).equals(Boolean.TRUE)) {
                    List B0 = CollectionsKt.B0(list2);
                    TeamUniqueTournament teamUniqueTournament = (TeamUniqueTournament) CollectionsKt.firstOrNull(B0);
                    if (teamUniqueTournament != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(teamUniqueTournament.getName());
                        if (teamUniqueTournament.getWinner()) {
                            sb2.append(", ");
                            sb2.append(context.getString(R.string.winner));
                        } else {
                            String round = teamUniqueTournament.getRound();
                            if (round != null) {
                                sb2.append(", ");
                                sb2.append(round);
                            }
                        }
                        d6jVar2 = new d6j(sb2.toString(), new deh(24, context, B0), 2);
                        b.add(new e6j(c6jVar, r, d6jVar, d6jVar2));
                    }
                }
                d6jVar2 = null;
                b.add(new e6j(c6jVar, r, d6jVar, d6jVar2));
            }
        }
        if (ranking2 != null) {
            int id2 = ranking2.getRankingType().getId();
            c6j c6jVar2 = c6j.g;
            if (id2 != c6jVar2.d) {
                c6jVar2 = c6j.h;
            }
            RankingRow rankingRow2 = (RankingRow) CollectionsKt.firstOrNull(ranking2.getRankingRows());
            if (rankingRow2 != null) {
                b.add(new e6j(c6jVar2, waa.r(context, rankingRow2, c6jVar2), null, null));
            }
        }
        setRankings(l6g.W(a.a(b)));
    }
}
