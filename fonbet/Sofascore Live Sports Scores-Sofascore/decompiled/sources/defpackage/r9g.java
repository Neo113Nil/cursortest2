package defpackage;

import android.content.Context;
import com.sofascore.model.network.response.RugbyPlayerEventStatistics;
import com.sofascore.results.R;
import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class r9g implements epe {
    public final Context a;
    public final RugbyPlayerEventStatistics b;
    public final RugbyPlayerEventStatistics c;
    public final dpe d;

    public r9g(Context context, boolean z, RugbyPlayerEventStatistics rugbyPlayerEventStatistics, RugbyPlayerEventStatistics rugbyPlayerEventStatistics2) {
        context.getClass();
        this.a = context;
        this.b = rugbyPlayerEventStatistics;
        this.c = rugbyPlayerEventStatistics2;
        this.d = new dpe(rugbyPlayerEventStatistics2 != null, z);
    }

    @Override // defpackage.epe
    public final List a() {
        Context context = this.a;
        String string = context.getString(R.string.points);
        string.getClass();
        RugbyPlayerEventStatistics rugbyPlayerEventStatistics = this.b;
        Integer points = rugbyPlayerEventStatistics.getPoints();
        RugbyPlayerEventStatistics rugbyPlayerEventStatistics2 = this.c;
        Integer points2 = rugbyPlayerEventStatistics2 != null ? rugbyPlayerEventStatistics2.getPoints() : null;
        dpe dpeVar = this.d;
        Serializable h = dpe.h(dpeVar, string, points, points2, false, false, null, null, 120);
        String string2 = context.getString(R.string.tries);
        string2.getClass();
        Serializable h2 = dpe.h(dpeVar, string2, rugbyPlayerEventStatistics.getTries(), rugbyPlayerEventStatistics2 != null ? rugbyPlayerEventStatistics2.getTries() : null, false, false, null, null, 120);
        String string3 = context.getString(R.string.rugby_tackles);
        string3.getClass();
        Serializable h3 = dpe.h(dpeVar, string3, rugbyPlayerEventStatistics.getTackles(), rugbyPlayerEventStatistics2 != null ? rugbyPlayerEventStatistics2.getTackles() : null, false, false, null, null, 120);
        String string4 = context.getString(R.string.rugby_penalty_goals);
        string4.getClass();
        Serializable h4 = dpe.h(dpeVar, string4, rugbyPlayerEventStatistics.getPenaltiesScored(), rugbyPlayerEventStatistics2 != null ? rugbyPlayerEventStatistics2.getPenaltiesScored() : null, false, false, null, null, 120);
        String string5 = context.getString(R.string.passes);
        string5.getClass();
        Serializable h5 = dpe.h(dpeVar, string5, rugbyPlayerEventStatistics.getPasses(), rugbyPlayerEventStatistics2 != null ? rugbyPlayerEventStatistics2.getPasses() : null, false, false, null, null, 120);
        String string6 = context.getString(R.string.rugby_carries);
        string6.getClass();
        Serializable h6 = dpe.h(dpeVar, string6, rugbyPlayerEventStatistics.getCarries(), rugbyPlayerEventStatistics2 != null ? rugbyPlayerEventStatistics2.getCarries() : null, false, false, null, null, 120);
        String string7 = context.getString(R.string.rugby_clean_breaks);
        string7.getClass();
        Serializable h7 = dpe.h(dpeVar, string7, rugbyPlayerEventStatistics.getCleanBreaks(), rugbyPlayerEventStatistics2 != null ? rugbyPlayerEventStatistics2.getCleanBreaks() : null, false, false, null, null, 120);
        String string8 = context.getString(R.string.rugby_drop_goals);
        string8.getClass();
        Serializable h8 = dpe.h(dpeVar, string8, rugbyPlayerEventStatistics.getDropGoals(), rugbyPlayerEventStatistics2 != null ? rugbyPlayerEventStatistics2.getDropGoals() : null, false, false, null, null, 120);
        String string9 = context.getString(R.string.rugby_meters_run);
        string9.getClass();
        Serializable h9 = dpe.h(dpeVar, string9, rugbyPlayerEventStatistics.getMetersRun(), rugbyPlayerEventStatistics2 != null ? rugbyPlayerEventStatistics2.getMetersRun() : null, false, false, null, null, 120);
        String string10 = context.getString(R.string.rugby_offloads);
        string10.getClass();
        Serializable h10 = dpe.h(dpeVar, string10, rugbyPlayerEventStatistics.getOffloads(), rugbyPlayerEventStatistics2 != null ? rugbyPlayerEventStatistics2.getOffloads() : null, false, false, null, null, 120);
        String string11 = context.getString(R.string.rugby_tackles_missed);
        string11.getClass();
        Serializable h11 = dpe.h(dpeVar, string11, rugbyPlayerEventStatistics.getTacklesMissed(), rugbyPlayerEventStatistics2 != null ? rugbyPlayerEventStatistics2.getTacklesMissed() : null, false, false, null, null, 120);
        String string12 = context.getString(R.string.rugby_try_assists);
        string12.getClass();
        Serializable h12 = dpe.h(dpeVar, string12, rugbyPlayerEventStatistics.getTryAssists(), rugbyPlayerEventStatistics2 != null ? rugbyPlayerEventStatistics2.getTryAssists() : null, false, false, null, null, 120);
        String string13 = context.getString(R.string.rugby_turnovers_won);
        string13.getClass();
        return ph0.x(new Object[]{h, h2, h3, h4, h5, h6, h7, h8, h9, h10, h11, h12, dpe.h(dpeVar, string13, rugbyPlayerEventStatistics.getTurnoversWon(), rugbyPlayerEventStatistics2 != null ? rugbyPlayerEventStatistics2.getTurnoversWon() : null, false, false, null, null, 120)});
    }
}
