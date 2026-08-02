package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.model.network.response.IceHockeyPlayerEventStatistics;
import com.sofascore.results.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sp9 implements epe {
    public final Context a;
    public final boolean b;
    public final IceHockeyPlayerEventStatistics c;
    public final IceHockeyPlayerEventStatistics d;
    public final dpe e;
    public final boolean f;
    public final boolean g;

    public sp9(Context context, boolean z, IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics, IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics2, String str, String str2) {
        context.getClass();
        this.a = context;
        this.b = z;
        this.c = iceHockeyPlayerEventStatistics;
        this.d = iceHockeyPlayerEventStatistics2;
        this.e = new dpe(iceHockeyPlayerEventStatistics2 != null, z);
        this.f = Intrinsics.c(str, "G");
        this.g = Intrinsics.c(str2, "G");
    }

    public static String b(double d) {
        return d == 1.0d ? "1.00" : StringsKt.V(String.format("%.3f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1)), "0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (((r6 == null || (r3 = r6.getSecondsPlayed()) == null) ? 0 : r3.intValue()) > 0) goto L14;
     */
    @Override // defpackage.epe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = this.c;
        Integer secondsPlayed = iceHockeyPlayerEventStatistics.getSecondsPlayed();
        int intValue = secondsPlayed != null ? secondsPlayed.intValue() : 0;
        IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics2 = this.d;
        if (intValue <= 0) {
        }
        String string = this.a.getString(R.string.time_on_ice);
        string.getClass();
        Integer secondsPlayed2 = iceHockeyPlayerEventStatistics.getSecondsPlayed();
        Integer secondsPlayed3 = iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getSecondsPlayed() : null;
        Serializable n = this.e.n(string, rei.k(yid.m(secondsPlayed2), false), rei.k(yid.m(secondsPlayed3), false), dpe.d(Integer.valueOf(yid.m(secondsPlayed2)), Integer.valueOf(yid.m(secondsPlayed3))), null);
        if (n != null) {
            arrayList2.add(n);
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList.add(new CustomizableDivider(true, 0, false, null, 14, null));
        }
        boolean z = this.f;
        if (z) {
            List e = e();
            if (((ArrayList) e).isEmpty()) {
                e = null;
            }
            if (e != null) {
                arrayList.addAll(e);
                arrayList.add(new CustomizableDivider(true, 0, false, null, 14, null));
            }
        }
        ArrayList c = c();
        if (c.isEmpty()) {
            c = null;
        }
        if (c != null) {
            arrayList.addAll(c);
            arrayList.add(new CustomizableDivider(true, 0, false, null, 14, null));
        }
        ArrayList d = d();
        ArrayList arrayList3 = d.isEmpty() ? null : d;
        if (arrayList3 != null) {
            arrayList.addAll(arrayList3);
            arrayList.add(new CustomizableDivider(true, 0, false, null, 14, null));
        }
        arrayList.addAll(f());
        if (this.b) {
            boolean z2 = this.g;
            if (z && !z2) {
                arrayList.add(new CustomizableDivider(true, 0, false, null, 14, null));
                arrayList.addAll(c());
                arrayList.add(new CustomizableDivider(true, 0, false, null, 14, null));
                arrayList.addAll(d());
                arrayList.add(new CustomizableDivider(true, 0, false, null, 14, null));
                arrayList.addAll(f());
                return arrayList;
            }
            if (!z && z2) {
                arrayList.add(new CustomizableDivider(true, 0, false, null, 14, null));
                arrayList.addAll(e());
            }
        }
        return arrayList;
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        String string = context.getString(R.string.goals);
        string.getClass();
        IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = this.c;
        Integer goals = iceHockeyPlayerEventStatistics.getGoals();
        IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics2 = this.d;
        Integer goals2 = iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getGoals() : null;
        boolean z = !this.f;
        boolean z2 = !this.g;
        dpe dpeVar = this.e;
        Serializable h = dpe.h(dpeVar, string, goals, goals2, z, z2, null, null, 96);
        if (h != null) {
            arrayList.add(h);
        }
        String string2 = context.getString(R.string.ice_hockey_assists);
        string2.getClass();
        Serializable h2 = dpe.h(dpeVar, string2, iceHockeyPlayerEventStatistics.getAssists(), iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getAssists() : null, z, z2, null, null, 96);
        if (h2 != null) {
            arrayList.add(h2);
        }
        String string3 = context.getString(R.string.hockey_shots_on_goal);
        string3.getClass();
        Serializable h3 = dpe.h(dpeVar, string3, iceHockeyPlayerEventStatistics.getShots(), iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getShots() : null, z, z2, null, null, 96);
        if (h3 != null) {
            arrayList.add(h3);
        }
        String string4 = context.getString(R.string.hockey_missed_shots);
        string4.getClass();
        Serializable h4 = dpe.h(dpeVar, string4, iceHockeyPlayerEventStatistics.getShotsMissed(), iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getShotsMissed() : null, z, z2, null, null, 96);
        if (h4 != null) {
            arrayList.add(h4);
        }
        String string5 = context.getString(R.string.hockey_blocked_shots);
        string5.getClass();
        Serializable h5 = dpe.h(dpeVar, string5, iceHockeyPlayerEventStatistics.getBlockedAttempts(), iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getBlockedAttempts() : null, z, z2, null, null, 96);
        if (h5 != null) {
            arrayList.add(h5);
        }
        String string6 = context.getString(R.string.hockey_powerplay_goals);
        string6.getClass();
        Serializable k = dpeVar.k(string6, iceHockeyPlayerEventStatistics.getPowerPlayGoals(), iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getPowerPlayGoals() : null, z, z2);
        if (k != null) {
            arrayList.add(k);
        }
        String string7 = context.getString(R.string.hockey_powerplay_assists);
        string7.getClass();
        Serializable k2 = dpeVar.k(string7, iceHockeyPlayerEventStatistics.getPowerPlayAssists(), iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getPowerPlayAssists() : null, z, z2);
        if (k2 != null) {
            arrayList.add(k2);
        }
        String string8 = context.getString(R.string.hockey_shorthanded_goals);
        string8.getClass();
        Serializable k3 = dpeVar.k(string8, iceHockeyPlayerEventStatistics.getShortHandedGoals(), iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getShortHandedGoals() : null, z, z2);
        if (k3 != null) {
            arrayList.add(k3);
        }
        String string9 = context.getString(R.string.hockey_shorthanded_assists);
        string9.getClass();
        Serializable k4 = dpeVar.k(string9, iceHockeyPlayerEventStatistics.getShortHandedAssists(), iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getShortHandedAssists() : null, z, z2);
        if (k4 != null) {
            arrayList.add(k4);
        }
        return arrayList;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        String string = context.getString(R.string.hockey_hits);
        string.getClass();
        IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = this.c;
        Integer hits = iceHockeyPlayerEventStatistics.getHits();
        IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics2 = this.d;
        Integer hits2 = iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getHits() : null;
        boolean z = !this.f;
        boolean z2 = !this.g;
        dpe dpeVar = this.e;
        Serializable h = dpe.h(dpeVar, string, hits, hits2, z, z2, null, null, 96);
        if (h != null) {
            arrayList.add(h);
        }
        String string2 = context.getString(R.string.hockey_takeaways);
        string2.getClass();
        Serializable h2 = dpe.h(dpeVar, string2, iceHockeyPlayerEventStatistics.getTakeaways(), iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getTakeaways() : null, z, z2, null, null, 96);
        if (h2 != null) {
            arrayList.add(h2);
        }
        String string3 = context.getString(R.string.hockey_blocks);
        string3.getClass();
        Serializable h3 = dpe.h(dpeVar, string3, iceHockeyPlayerEventStatistics.getBlocked(), iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getBlocked() : null, z, z2, null, null, 96);
        if (h3 != null) {
            arrayList.add(h3);
        }
        return arrayList;
    }

    public final List e() {
        Context context = this.a;
        String string = context.getString(R.string.save_percentage);
        string.getClass();
        IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = this.c;
        Double savePercentage = iceHockeyPlayerEventStatistics.getSavePercentage();
        IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics2 = this.d;
        Double savePercentage2 = iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getSavePercentage() : null;
        String b = (!this.f || savePercentage == null) ? null : b(savePercentage.doubleValue());
        String b2 = (!this.g || savePercentage2 == null) ? null : b(savePercentage2.doubleValue());
        int c = dpe.c(savePercentage, savePercentage2);
        dpe dpeVar = this.e;
        Serializable n = dpeVar.n(string, b, b2, c, null);
        String string2 = context.getString(R.string.ice_hockey_saves);
        string2.getClass();
        Serializable h = dpe.h(dpeVar, string2, iceHockeyPlayerEventStatistics.getSaves(), iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getSaves() : null, this.f, this.g, null, null, 96);
        String string3 = context.getString(R.string.shots_against);
        string3.getClass();
        Serializable h2 = dpe.h(dpeVar, string3, iceHockeyPlayerEventStatistics.getShotsAgainst(), iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getShotsAgainst() : null, false, false, null, null, 96);
        String string4 = context.getString(R.string.short_handed_saves);
        string4.getClass();
        Serializable e = dpe.e(dpeVar, string4, iceHockeyPlayerEventStatistics.getShortHandedSaves(), iceHockeyPlayerEventStatistics.getShortHandedShotsAgainst(), iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getShortHandedSaves() : null, iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getShortHandedShotsAgainst() : null, true, this.f, this.g, 576);
        String string5 = context.getString(R.string.power_play_saves);
        string5.getClass();
        Serializable e2 = dpe.e(dpeVar, string5, iceHockeyPlayerEventStatistics.getPowerPlaySaves(), iceHockeyPlayerEventStatistics.getPowerPlayShotsAgainst(), iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getPowerPlaySaves() : null, iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getPowerPlayShotsAgainst() : null, true, this.f, this.g, 576);
        String string6 = context.getString(R.string.even_saves);
        string6.getClass();
        return ph0.x(new Object[]{n, h, h2, e, e2, dpe.e(dpeVar, string6, iceHockeyPlayerEventStatistics.getEvenSaves(), iceHockeyPlayerEventStatistics.getEvenShotsAgainst(), iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getEvenSaves() : null, iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getEvenShotsAgainst() : null, true, this.f, this.g, 576)});
    }

    public final ArrayList f() {
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        String string = context.getString(R.string.hockey_penalty_minutes);
        string.getClass();
        IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics = this.c;
        Integer penaltyMinutes = iceHockeyPlayerEventStatistics.getPenaltyMinutes();
        IceHockeyPlayerEventStatistics iceHockeyPlayerEventStatistics2 = this.d;
        Integer penaltyMinutes2 = iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getPenaltyMinutes() : null;
        boolean z = !this.f;
        boolean z2 = !this.g;
        dpe dpeVar = this.e;
        Serializable h = dpe.h(dpeVar, string, penaltyMinutes, penaltyMinutes2, z, z2, null, null, 96);
        if (h != null) {
            arrayList.add(h);
        }
        String string2 = context.getString(R.string.face_off_won);
        string2.getClass();
        Serializable o = dpe.o(dpeVar, string2, iceHockeyPlayerEventStatistics.getFaceOffWins(), iceHockeyPlayerEventStatistics.getFaceOffTaken(), iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getFaceOffWins() : null, iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getFaceOffTaken() : null, true, z, z2, false, 512);
        if (o != null) {
            arrayList.add(o);
        }
        String string3 = context.getString(R.string.hockey_giveaways);
        string3.getClass();
        Serializable h2 = dpe.h(dpeVar, string3, iceHockeyPlayerEventStatistics.getGiveaways(), iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getGiveaways() : null, z, z2, null, null, 96);
        if (h2 != null) {
            arrayList.add(h2);
        }
        Serializable h3 = dpe.h(dpeVar, "+/-", iceHockeyPlayerEventStatistics.getPlusMinus(), iceHockeyPlayerEventStatistics2 != null ? iceHockeyPlayerEventStatistics2.getPlusMinus() : null, z, z2, null, null, 96);
        if (h3 != null) {
            arrayList.add(h3);
        }
        return arrayList;
    }
}
