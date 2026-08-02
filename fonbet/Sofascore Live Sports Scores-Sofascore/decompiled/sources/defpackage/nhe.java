package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nhe implements yse {
    public static final /* synthetic */ nhe[] d;
    public static final /* synthetic */ kp5 e;
    public final q9k a;
    public final q9k b;
    public final Function1 c;

    static {
        nhe[] nheVarArr = {new nhe("INNINGS_PITCHED", 0, new q9k(R.string.baseball_innings_pitched_short), new q9k(R.string.baseball_innings_pitched), new etd(19)), new nhe("ERA", 1, new q9k(R.string.baseball_earned_run_average_short), new q9k(R.string.baseball_earned_run_average), new etd(22)), new nhe("HITS_ALLOWED", 2, new q9k(R.string.baseball_hits_short), new q9k(R.string.baseball_hits_allowed), new etd(23)), new nhe("RUNS", 3, new q9k(R.string.baseball_runs_short), new q9k(R.string.baseball_runs_allowed), new etd(24)), new nhe("EARNED_RUNS", 4, new q9k(R.string.baseball_earned_runs_short), new q9k(R.string.baseball_earned_runs), new etd(25)), new nhe("WALKS_ALLOWED", 5, new q9k(R.string.baseball_walks_short), new q9k(R.string.baseball_walks_allowed), new etd(26)), new nhe("STRIKEOUTS", 6, new q9k(R.string.baseball_strikeouts_short), new q9k(R.string.baseball_strikeouts), new etd(27)), new nhe("HOME_RUNS_ALLOWED", 7, new q9k(R.string.baseball_home_runs_short), new q9k(R.string.baseball_home_runs_allowed), new etd(28)), new nhe("PITCHES_THROWN", 8, new q9k(R.string.baseball_number_of_pitches_short), new q9k(R.string.baseball_number_of_pitches), new etd(29)), new nhe("STRIKES_THROWN", 9, new q9k(R.string.baseball_strikes_thrown_short), new q9k(R.string.baseball_strikes_thrown), new etd(20)), new nhe("WHIP", 10, new q9k(R.string.baseball_walks_hits_per_inning_pitched_short), new q9k(R.string.baseball_walks_hits_per_inning_pitched), new etd(21))};
        d = nheVarArr;
        e = new kp5(nheVarArr);
    }

    public nhe(String str, int i, q9k q9kVar, q9k q9kVar2, Function1 function1) {
        this.a = q9kVar;
        this.b = q9kVar2;
        this.c = function1;
    }

    public static nhe valueOf(String str) {
        return (nhe) Enum.valueOf(nhe.class, str);
    }

    public static nhe[] values() {
        return (nhe[]) d.clone();
    }

    @Override // defpackage.yse
    public final Function1 d() {
        return this.c;
    }

    @Override // defpackage.yse
    public final r9k g() {
        return this.a;
    }

    @Override // defpackage.yse
    public final r9k h() {
        return this.b;
    }
}
