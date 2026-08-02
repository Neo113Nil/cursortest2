package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.model.network.response.BasketballPlayerEventStatistics;
import com.sofascore.results.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mr1 implements epe {
    public final Context a;
    public final BasketballPlayerEventStatistics b;
    public final BasketballPlayerEventStatistics c;
    public final dpe d;

    public mr1(Context context, boolean z, BasketballPlayerEventStatistics basketballPlayerEventStatistics, BasketballPlayerEventStatistics basketballPlayerEventStatistics2) {
        context.getClass();
        this.a = context;
        this.b = basketballPlayerEventStatistics;
        this.c = basketballPlayerEventStatistics2;
        this.d = new dpe(basketballPlayerEventStatistics2 != null, z);
    }

    @Override // defpackage.epe
    public final List a() {
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        String string = context.getString(R.string.basketball_minutes_played);
        string.getClass();
        BasketballPlayerEventStatistics basketballPlayerEventStatistics = this.b;
        Integer secondsPlayed = basketballPlayerEventStatistics.getSecondsPlayed();
        BasketballPlayerEventStatistics basketballPlayerEventStatistics2 = this.c;
        Integer secondsPlayed2 = basketballPlayerEventStatistics2 != null ? basketballPlayerEventStatistics2.getSecondsPlayed() : null;
        kj1 kj1Var = new kj1(1, rei.a, rei.class, "minutesPlayedFromSeconds", "minutesPlayedFromSeconds(Ljava/lang/Integer;)Ljava/lang/String;", 0, 7);
        dpe dpeVar = this.d;
        arrayList.addAll(b.k(dpe.h(dpeVar, string, secondsPlayed, secondsPlayed2, false, false, null, kj1Var, 56)));
        arrayList.add(new CustomizableDivider(true, 0, false, null, 14, null));
        ArrayList arrayList2 = new ArrayList();
        String string2 = context.getString(R.string.points_basketball);
        string2.getClass();
        Serializable h = dpe.h(dpeVar, string2, basketballPlayerEventStatistics.getPoints(), basketballPlayerEventStatistics2 != null ? basketballPlayerEventStatistics2.getPoints() : null, false, false, null, null, 120);
        if (h != null) {
            arrayList2.add(h);
        }
        String string3 = context.getString(R.string.free_throws);
        string3.getClass();
        Serializable e = dpe.e(dpeVar, string3, basketballPlayerEventStatistics.getFreeThrowsMade(), basketballPlayerEventStatistics.getFreeThrowAttempts(), basketballPlayerEventStatistics2 != null ? basketballPlayerEventStatistics2.getFreeThrowsMade() : null, basketballPlayerEventStatistics2 != null ? basketballPlayerEventStatistics2.getFreeThrowAttempts() : null, true, false, false, 448);
        if (e != null) {
            arrayList2.add(e);
        }
        String string4 = context.getString(R.string.two_pointers);
        string4.getClass();
        Serializable e2 = dpe.e(dpeVar, string4, basketballPlayerEventStatistics.getTwoPointsMade(), basketballPlayerEventStatistics.getTwoPointAttempts(), basketballPlayerEventStatistics2 != null ? basketballPlayerEventStatistics2.getTwoPointsMade() : null, basketballPlayerEventStatistics2 != null ? basketballPlayerEventStatistics2.getTwoPointAttempts() : null, true, false, false, 448);
        if (e2 != null) {
            arrayList2.add(e2);
        }
        String string5 = context.getString(R.string.three_pointers);
        string5.getClass();
        Serializable e3 = dpe.e(dpeVar, string5, basketballPlayerEventStatistics.getThreePointsMade(), basketballPlayerEventStatistics.getThreePointAttempts(), basketballPlayerEventStatistics2 != null ? basketballPlayerEventStatistics2.getThreePointsMade() : null, basketballPlayerEventStatistics2 != null ? basketballPlayerEventStatistics2.getThreePointAttempts() : null, true, false, false, 448);
        if (e3 != null) {
            arrayList2.add(e3);
        }
        String string6 = context.getString(R.string.field_goals);
        string6.getClass();
        Serializable e4 = dpe.e(dpeVar, string6, basketballPlayerEventStatistics.getFieldGoalsMade(), basketballPlayerEventStatistics.getFieldGoalAttempts(), basketballPlayerEventStatistics2 != null ? basketballPlayerEventStatistics2.getFieldGoalsMade() : null, basketballPlayerEventStatistics2 != null ? basketballPlayerEventStatistics2.getFieldGoalAttempts() : null, true, false, false, 448);
        if (e4 != null) {
            arrayList2.add(e4);
        }
        arrayList.addAll(arrayList2);
        arrayList.add(new CustomizableDivider(true, 0, false, null, 14, null));
        ArrayList arrayList3 = new ArrayList();
        String string7 = context.getString(R.string.rebounds);
        string7.getClass();
        Serializable h2 = dpe.h(dpeVar, string7, basketballPlayerEventStatistics.getRebounds(), basketballPlayerEventStatistics2 != null ? basketballPlayerEventStatistics2.getRebounds() : null, false, false, null, null, 120);
        if (h2 != null) {
            arrayList3.add(h2);
        }
        String string8 = context.getString(R.string.basketball_stat_rebounds_defensive);
        string8.getClass();
        Serializable h3 = dpe.h(dpeVar, string8, basketballPlayerEventStatistics.getDefensiveRebounds(), basketballPlayerEventStatistics2 != null ? basketballPlayerEventStatistics2.getDefensiveRebounds() : null, false, false, null, null, 120);
        if (h3 != null) {
            arrayList3.add(h3);
        }
        String string9 = context.getString(R.string.offensive);
        string9.getClass();
        Serializable h4 = dpe.h(dpeVar, string9, basketballPlayerEventStatistics.getOffensiveRebounds(), basketballPlayerEventStatistics2 != null ? basketballPlayerEventStatistics2.getOffensiveRebounds() : null, false, false, null, null, 120);
        if (h4 != null) {
            arrayList3.add(h4);
        }
        arrayList.addAll(arrayList3);
        arrayList.add(new CustomizableDivider(true, 0, false, null, 14, null));
        ArrayList arrayList4 = new ArrayList();
        String string10 = context.getString(R.string.basketball_assists);
        string10.getClass();
        Serializable h5 = dpe.h(dpeVar, string10, basketballPlayerEventStatistics.getAssists(), basketballPlayerEventStatistics2 != null ? basketballPlayerEventStatistics2.getAssists() : null, false, false, null, null, 120);
        if (h5 != null) {
            arrayList4.add(h5);
        }
        String string11 = context.getString(R.string.turnovers);
        string11.getClass();
        Serializable h6 = dpe.h(dpeVar, string11, basketballPlayerEventStatistics.getTurnovers(), basketballPlayerEventStatistics2 != null ? basketballPlayerEventStatistics2.getTurnovers() : null, false, false, null, null, 120);
        if (h6 != null) {
            arrayList4.add(h6);
        }
        String string12 = context.getString(R.string.steals);
        string12.getClass();
        Serializable h7 = dpe.h(dpeVar, string12, basketballPlayerEventStatistics.getSteals(), basketballPlayerEventStatistics2 != null ? basketballPlayerEventStatistics2.getSteals() : null, false, false, null, null, 120);
        if (h7 != null) {
            arrayList4.add(h7);
        }
        String string13 = context.getString(R.string.blocks);
        string13.getClass();
        Serializable h8 = dpe.h(dpeVar, string13, basketballPlayerEventStatistics.getBlocks(), basketballPlayerEventStatistics2 != null ? basketballPlayerEventStatistics2.getBlocks() : null, false, false, null, null, 120);
        if (h8 != null) {
            arrayList4.add(h8);
        }
        String string14 = context.getString(R.string.personal_fouls);
        string14.getClass();
        Serializable h9 = dpe.h(dpeVar, string14, basketballPlayerEventStatistics.getPersonalFouls(), basketballPlayerEventStatistics2 != null ? basketballPlayerEventStatistics2.getPersonalFouls() : null, false, false, null, null, 120);
        if (h9 != null) {
            arrayList4.add(h9);
        }
        Serializable l = dpeVar.l(basketballPlayerEventStatistics.getPlusMinus(), basketballPlayerEventStatistics2 != null ? basketballPlayerEventStatistics2.getPlusMinus() : null, "+/-");
        if (l != null) {
            arrayList4.add(l);
        }
        String string15 = context.getString(R.string.performance_index_rating_long);
        string15.getClass();
        Serializable l2 = dpeVar.l(basketballPlayerEventStatistics.getPir(), basketballPlayerEventStatistics2 != null ? basketballPlayerEventStatistics2.getPir() : null, string15);
        if (l2 != null) {
            arrayList4.add(l2);
        }
        arrayList.addAll(arrayList4);
        return arrayList;
    }
}
