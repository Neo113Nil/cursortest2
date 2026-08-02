package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.model.network.response.HandballPlayerEventStatistics;
import com.sofascore.results.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class g69 implements epe {
    public final Context a;
    public final HandballPlayerEventStatistics b;
    public final HandballPlayerEventStatistics c;
    public final dpe d;
    public final boolean e;
    public final boolean f;

    public g69(Context context, boolean z, HandballPlayerEventStatistics handballPlayerEventStatistics, HandballPlayerEventStatistics handballPlayerEventStatistics2, String str, String str2) {
        context.getClass();
        this.a = context;
        this.b = handballPlayerEventStatistics;
        this.c = handballPlayerEventStatistics2;
        this.d = new dpe(handballPlayerEventStatistics2 != null, z);
        this.e = Intrinsics.c(str, "G");
        this.f = Intrinsics.c(str2, "G");
    }

    @Override // defpackage.epe
    public final List a() {
        ArrayList arrayList = new ArrayList();
        if (this.e) {
            arrayList.addAll(c());
            arrayList.add(new CustomizableDivider(true, 0, false, null, 14, null));
            arrayList.addAll(d());
            ArrayList b = b();
            if (!b.isEmpty()) {
                arrayList.add(new CustomizableDivider(true, 0, false, null, 14, null));
                arrayList.addAll(b);
                return arrayList;
            }
        } else {
            arrayList.addAll(b());
            arrayList.add(new CustomizableDivider(true, 0, false, null, 14, null));
            arrayList.addAll(d());
            ArrayList c = c();
            if (!c.isEmpty()) {
                arrayList.add(new CustomizableDivider(true, 0, false, null, 14, null));
                arrayList.addAll(c);
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        String string = context.getString(R.string.goals);
        string.getClass();
        HandballPlayerEventStatistics handballPlayerEventStatistics = this.b;
        Integer goals = handballPlayerEventStatistics.getGoals();
        HandballPlayerEventStatistics handballPlayerEventStatistics2 = this.c;
        Integer goals2 = handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getGoals() : null;
        boolean z = !this.e;
        boolean z2 = !this.f;
        dpe dpeVar = this.d;
        Serializable h = dpe.h(dpeVar, string, goals, goals2, z, z2, null, null, 96);
        if (h != null) {
            arrayList.add(h);
        }
        String string2 = context.getString(R.string.shots);
        string2.getClass();
        Serializable h2 = dpe.h(dpeVar, string2, handballPlayerEventStatistics.getShotsTaken(), handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getShotsTaken() : null, z, z2, null, null, 96);
        if (h2 != null) {
            arrayList.add(h2);
        }
        String string3 = context.getString(R.string.handball_assists);
        string3.getClass();
        Serializable h3 = dpe.h(dpeVar, string3, handballPlayerEventStatistics.getAssists(), handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getAssists() : null, z, z2, null, null, 96);
        if (h3 != null) {
            arrayList.add(h3);
        }
        String string4 = context.getString(R.string.m7_goals);
        string4.getClass();
        Serializable e = dpe.e(dpeVar, string4, handballPlayerEventStatistics.getGoals7m(), handballPlayerEventStatistics.getShots7m(), handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getGoals7m() : null, handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getShots7m() : null, false, z, z2, 64);
        if (e != null) {
            arrayList.add(e);
        }
        String string5 = context.getString(R.string.m6_goals);
        string5.getClass();
        Serializable e2 = dpe.e(dpeVar, string5, handballPlayerEventStatistics.getGoals6m(), handballPlayerEventStatistics.getShots6m(), handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getGoals6m() : null, handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getShots6m() : null, false, z, z2, 64);
        if (e2 != null) {
            arrayList.add(e2);
        }
        String string6 = context.getString(R.string.m9_goals);
        string6.getClass();
        Serializable e3 = dpe.e(dpeVar, string6, handballPlayerEventStatistics.getGoals9m(), handballPlayerEventStatistics.getShots9m(), handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getGoals9m() : null, handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getShots9m() : null, false, z, z2, 64);
        if (e3 != null) {
            arrayList.add(e3);
        }
        String string7 = context.getString(R.string.breakthrough_goals);
        string7.getClass();
        Serializable e4 = dpe.e(dpeVar, string7, handballPlayerEventStatistics.getBreakthroughGoals(), handballPlayerEventStatistics.getBreakthroughShots(), handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getBreakthroughGoals() : null, handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getBreakthroughShots() : null, false, z, z2, 64);
        if (e4 != null) {
            arrayList.add(e4);
        }
        String string8 = context.getString(R.string.pivot_goals);
        string8.getClass();
        Serializable e5 = dpe.e(dpeVar, string8, handballPlayerEventStatistics.getPivotGoals(), handballPlayerEventStatistics.getPivotShots(), handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getPivotGoals() : null, handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getPivotShots() : null, false, z, z2, 64);
        if (e5 != null) {
            arrayList.add(e5);
        }
        String string9 = context.getString(R.string.fastbreak_goals);
        string9.getClass();
        Serializable e6 = dpe.e(dpeVar, string9, handballPlayerEventStatistics.getFastbreakGoals(), handballPlayerEventStatistics.getFastbreakShots(), handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getFastbreakGoals() : null, handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getFastbreakShots() : null, false, z, z2, 64);
        if (e6 != null) {
            arrayList.add(e6);
        }
        String string10 = context.getString(R.string.steals);
        string10.getClass();
        Serializable h4 = dpe.h(dpeVar, string10, handballPlayerEventStatistics.getSteals(), handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getSteals() : null, z, z2, null, null, 96);
        if (h4 != null) {
            arrayList.add(h4);
        }
        String string11 = context.getString(R.string.blocked_scoring_attempt);
        string11.getClass();
        Serializable h5 = dpe.h(dpeVar, string11, handballPlayerEventStatistics.getBlockedShots(), handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getBlockedShots() : null, z, z2, null, null, 96);
        if (h5 != null) {
            arrayList.add(h5);
        }
        return arrayList;
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        String string = context.getString(R.string.handball_saves);
        string.getClass();
        HandballPlayerEventStatistics handballPlayerEventStatistics = this.b;
        Integer saves = handballPlayerEventStatistics.getSaves();
        HandballPlayerEventStatistics handballPlayerEventStatistics2 = this.c;
        Integer saves2 = handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getSaves() : null;
        dpe dpeVar = this.d;
        Serializable h = dpe.h(dpeVar, string, saves, saves2, this.e, this.f, null, null, 96);
        if (h != null) {
            arrayList.add(h);
        }
        String string2 = context.getString(R.string.shots);
        string2.getClass();
        Serializable h2 = dpe.h(dpeVar, string2, handballPlayerEventStatistics.getGkShots(), handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getGkShots() : null, this.e, this.f, null, null, 96);
        if (h2 != null) {
            arrayList.add(h2);
        }
        String string3 = context.getString(R.string.m7_saves);
        string3.getClass();
        Serializable e = dpe.e(dpeVar, string3, handballPlayerEventStatistics.getGk7mSaves(), handballPlayerEventStatistics.getGk7mShots(), handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getGk7mSaves() : null, handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getGk7mShots() : null, false, this.e, this.f, 64);
        if (e != null) {
            arrayList.add(e);
        }
        String string4 = context.getString(R.string.m6_saves);
        string4.getClass();
        Serializable e2 = dpe.e(dpeVar, string4, handballPlayerEventStatistics.getGk6mSaves(), handballPlayerEventStatistics.getGk6mShots(), handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getGk6mSaves() : null, handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getGk6mShots() : null, false, this.e, this.f, 64);
        if (e2 != null) {
            arrayList.add(e2);
        }
        String string5 = context.getString(R.string.pivot_saves);
        string5.getClass();
        Serializable e3 = dpe.e(dpeVar, string5, handballPlayerEventStatistics.getGkPivotSaves(), handballPlayerEventStatistics.getGkPivotShots(), handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getGkPivotSaves() : null, handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getGkPivotShots() : null, false, this.e, this.f, 64);
        if (e3 != null) {
            arrayList.add(e3);
        }
        String string6 = context.getString(R.string.m9_saves);
        string6.getClass();
        Serializable e4 = dpe.e(dpeVar, string6, handballPlayerEventStatistics.getGk9mSaves(), handballPlayerEventStatistics.getGk9mShots(), handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getGk9mSaves() : null, handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getGk9mShots() : null, false, this.e, this.f, 64);
        if (e4 != null) {
            arrayList.add(e4);
        }
        String string7 = context.getString(R.string.breakthrough_saves);
        string7.getClass();
        Serializable e5 = dpe.e(dpeVar, string7, handballPlayerEventStatistics.getGkBreakthroughSaves(), handballPlayerEventStatistics.getGkBreakthroughShots(), handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getGkBreakthroughSaves() : null, handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getGkBreakthroughShots() : null, false, this.e, this.f, 64);
        if (e5 != null) {
            arrayList.add(e5);
        }
        String string8 = context.getString(R.string.fastbreak_saves);
        string8.getClass();
        Serializable e6 = dpe.e(dpeVar, string8, handballPlayerEventStatistics.getGkFastbreakSaves(), handballPlayerEventStatistics.getGkFastbreakShots(), handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getGkFastbreakSaves() : null, handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getGkFastbreakShots() : null, false, this.e, this.f, 64);
        if (e6 != null) {
            arrayList.add(e6);
        }
        return arrayList;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        String string = context.getString(R.string.two_min_penalty);
        string.getClass();
        HandballPlayerEventStatistics handballPlayerEventStatistics = this.b;
        Integer twoMinutePenalties = handballPlayerEventStatistics.getTwoMinutePenalties();
        HandballPlayerEventStatistics handballPlayerEventStatistics2 = this.c;
        Integer twoMinutePenalties2 = handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getTwoMinutePenalties() : null;
        dpe dpeVar = this.d;
        Serializable h = dpe.h(dpeVar, string, twoMinutePenalties, twoMinutePenalties2, false, false, null, null, 120);
        if (h != null) {
            arrayList.add(h);
        }
        String string2 = context.getString(R.string.technical_faults);
        string2.getClass();
        Serializable h2 = dpe.h(dpeVar, string2, handballPlayerEventStatistics.getTechnicalFaults(), handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getTechnicalFaults() : null, false, false, null, null, 120);
        if (h2 != null) {
            arrayList.add(h2);
        }
        String string3 = context.getString(R.string.handball_yellow_cards);
        string3.getClass();
        Serializable h3 = dpe.h(dpeVar, string3, handballPlayerEventStatistics.getYellowCards(), handballPlayerEventStatistics2 != null ? handballPlayerEventStatistics2.getYellowCards() : null, false, false, null, null, 120);
        if (h3 != null) {
            arrayList.add(h3);
        }
        return arrayList;
    }
}
