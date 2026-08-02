package com.sofascore.results.team.details.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.TeamAchievementsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentAchievements;
import defpackage.a3;
import defpackage.av8;
import defpackage.e1d;
import defpackage.eoh;
import defpackage.eqf;
import defpackage.fui;
import defpackage.gui;
import defpackage.haa;
import defpackage.km5;
import defpackage.l6g;
import defpackage.of3;
import defpackage.q8i;
import defpackage.s5h;
import defpackage.tba;
import defpackage.yid;
import defpackage.yqo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001R/\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/sofascore/results/team/details/view/TeamAchievementsView;", "La3;", "Lgui;", "<set-?>", CampaignEx.JSON_KEY_AD_K, "Le1d;", "getData", "()Lgui;", "setData", "(Lgui;)V", "data", "Lkotlin/Function0;", "", "l", "Lkotlin/jvm/functions/Function0;", "getShowTrophyComparisonClickListener", "()Lkotlin/jvm/functions/Function0;", "setShowTrophyComparisonClickListener", "(Lkotlin/jvm/functions/Function0;)V", "showTrophyComparisonClickListener", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TeamAchievementsView extends a3 {
    public static final /* synthetic */ int m = 0;

    /* renamed from: k, reason: from kotlin metadata */
    public final e1d data;

    /* renamed from: l, reason: from kotlin metadata */
    public Function0 showTrophyComparisonClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamAchievementsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.data = e.f(null);
    }

    private final gui getData() {
        return (gui) ((eoh) this.data).getValue();
    }

    private final void setData(gui guiVar) {
        ((eoh) this.data).setValue(guiVar);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-811051141);
        int i2 = (av8Var.i(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            gui data = getData();
            if (data == null) {
                av8Var.d0(1461507244);
                av8Var.s(false);
            } else {
                av8Var.d0(1461507245);
                haa.f(yqo.H(343095991, av8Var, new s5h(14, data, this)), av8Var, 6);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new q8i(this, i, 5);
        }
    }

    @Nullable
    public final Function0<Unit> getShowTrophyComparisonClickListener() {
        return this.showTrophyComparisonClickListener;
    }

    public final void l(TeamAchievementsResponse teamAchievementsResponse, String str) {
        fui fuiVar;
        teamAchievementsResponse.getClass();
        List<UniqueTournamentAchievements> achievements = teamAchievementsResponse.getAchievements();
        if (achievements == null) {
            achievements = km5.a;
        }
        ArrayList arrayList = new ArrayList();
        for (UniqueTournamentAchievements uniqueTournamentAchievements : achievements) {
            UniqueTournament uniqueTournament = uniqueTournamentAchievements.getUniqueTournament();
            if (uniqueTournament != null) {
                int id = uniqueTournament.getId();
                String x = tba.x(uniqueTournament);
                if (x == null) {
                    x = "";
                }
                int m2 = yid.m(uniqueTournamentAchievements.getTrophiesWon());
                Boolean majorTrophy = uniqueTournament.getMajorTrophy();
                Boolean bool = Boolean.TRUE;
                fuiVar = new fui(x, id, m2, Intrinsics.c(majorTrophy, bool), Intrinsics.c(uniqueTournament.getHasAchievements(), bool));
            } else {
                fuiVar = null;
            }
            if (fuiVar != null) {
                arrayList.add(fuiVar);
            }
        }
        setData(new gui(str, l6g.W(arrayList)));
    }

    public final void setShowTrophyComparisonClickListener(@Nullable Function0<Unit> function0) {
        this.showTrophyComparisonClickListener = function0;
    }
}
