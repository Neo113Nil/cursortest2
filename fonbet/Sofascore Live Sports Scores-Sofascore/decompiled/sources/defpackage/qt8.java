package defpackage;

import android.content.Context;
import com.sofascore.model.network.response.FutsalPlayerEventStatistics;
import com.sofascore.results.R;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qt8 implements epe {
    public final Context a;
    public final boolean b;
    public final FutsalPlayerEventStatistics c;
    public final FutsalPlayerEventStatistics d;

    public qt8(Context context, boolean z, FutsalPlayerEventStatistics futsalPlayerEventStatistics, FutsalPlayerEventStatistics futsalPlayerEventStatistics2) {
        context.getClass();
        this.a = context;
        this.b = z;
        this.c = futsalPlayerEventStatistics;
        this.d = futsalPlayerEventStatistics2;
    }

    @Override // defpackage.epe
    public final List a() {
        String str;
        String str2;
        xbb b = a.b();
        FutsalPlayerEventStatistics futsalPlayerEventStatistics = this.d;
        dpe dpeVar = new dpe(futsalPlayerEventStatistics != null, this.b);
        Context context = this.a;
        String string = context.getString(R.string.goals);
        string.getClass();
        FutsalPlayerEventStatistics futsalPlayerEventStatistics2 = this.c;
        Serializable h = dpe.h(dpeVar, string, futsalPlayerEventStatistics2.getGoals(), futsalPlayerEventStatistics != null ? futsalPlayerEventStatistics.getGoals() : null, true, true, null, null, 96);
        if (h != null) {
            b.add(h);
        }
        String string2 = context.getString(R.string.football_assists);
        string2.getClass();
        Serializable h2 = dpe.h(dpeVar, string2, futsalPlayerEventStatistics2.getAssists(), futsalPlayerEventStatistics != null ? futsalPlayerEventStatistics.getAssists() : null, true, true, null, null, 96);
        if (h2 != null) {
            b.add(h2);
        }
        String string3 = context.getString(R.string.football_yellow_cards);
        string3.getClass();
        Serializable h3 = dpe.h(dpeVar, string3, futsalPlayerEventStatistics2.getYellowCards(), futsalPlayerEventStatistics != null ? futsalPlayerEventStatistics.getYellowCards() : null, true, true, null, null, 96);
        if (h3 != null) {
            b.add(h3);
        }
        String string4 = context.getString(R.string.futsal_red_cards);
        string4.getClass();
        Serializable h4 = dpe.h(dpeVar, string4, futsalPlayerEventStatistics2.getRedCards(), futsalPlayerEventStatistics != null ? futsalPlayerEventStatistics.getRedCards() : null, true, true, null, null, 96);
        if (h4 != null) {
            b.add(h4);
        }
        Integer penaltyGoals = futsalPlayerEventStatistics2.getPenaltyGoals();
        Integer penaltyGoals2 = futsalPlayerEventStatistics != null ? futsalPlayerEventStatistics.getPenaltyGoals() : null;
        Integer penaltyAttempts = futsalPlayerEventStatistics2.getPenaltyAttempts();
        Integer penaltyAttempts2 = futsalPlayerEventStatistics != null ? futsalPlayerEventStatistics.getPenaltyAttempts() : null;
        if (penaltyGoals != null || penaltyGoals2 != null) {
            String string5 = context.getString(R.string.football_penalty_goals);
            string5.getClass();
            if (penaltyGoals != null) {
                int intValue = penaltyGoals.intValue();
                if (penaltyAttempts == null || penaltyAttempts.intValue() <= 0) {
                    penaltyAttempts = null;
                }
                str = penaltyAttempts != null ? fc6.g(intValue, penaltyAttempts.intValue(), "/") : String.valueOf(intValue);
            } else {
                str = null;
            }
            if (penaltyGoals2 != null) {
                int intValue2 = penaltyGoals2.intValue();
                if (penaltyAttempts2 == null || penaltyAttempts2.intValue() <= 0) {
                    penaltyAttempts2 = null;
                }
                str2 = penaltyAttempts2 != null ? fc6.g(intValue2, penaltyAttempts2.intValue(), "/") : String.valueOf(intValue2);
            } else {
                str2 = null;
            }
            Serializable n = dpeVar.n(string5, str, str2, dpe.c(penaltyGoals != null ? Double.valueOf(penaltyGoals.intValue()) : null, penaltyGoals2 != null ? Double.valueOf(penaltyGoals2.intValue()) : null), null);
            if (n != null) {
                b.add(n);
            }
        }
        String string6 = context.getString(R.string.futsal_accumulated_penalty_goals);
        string6.getClass();
        Serializable k = dpeVar.k(string6, futsalPlayerEventStatistics2.getAccumulatedPenaltyGoals(), futsalPlayerEventStatistics != null ? futsalPlayerEventStatistics.getAccumulatedPenaltyGoals() : null, true, true);
        if (k != null) {
            b.add(k);
        }
        String string7 = context.getString(R.string.own_goals);
        string7.getClass();
        Serializable h5 = dpe.h(dpeVar, string7, futsalPlayerEventStatistics2.getOwnGoals(), futsalPlayerEventStatistics != null ? futsalPlayerEventStatistics.getOwnGoals() : null, true, true, null, null, 96);
        if (h5 != null) {
            b.add(h5);
        }
        return a.a(b);
    }
}
