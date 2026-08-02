package defpackage;

import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class w91 {
    public static final w91 d;
    public static final w91 e;
    public static final /* synthetic */ w91[] f;
    public static final /* synthetic */ kp5 g;
    public final q9k a;
    public final List b;
    public final Function1 c;

    static {
        w91 w91Var = new w91("BATTING_SUMMARY", 0, new q9k(R.string.baseball_group_batting), ut1.e, new z71(27));
        d = w91Var;
        w91 w91Var2 = new w91("PITCHING_SUMMARY", 1, new q9k(R.string.baseball_group_pitching), nhe.e, new z71(28));
        e = w91Var2;
        w91[] w91VarArr = {w91Var, w91Var2};
        f = w91VarArr;
        g = new kp5(w91VarArr);
    }

    public w91(String str, int i, q9k q9kVar, kp5 kp5Var, Function1 function1) {
        this.a = q9kVar;
        this.b = kp5Var;
        this.c = function1;
    }

    public static w91 valueOf(String str) {
        return (w91) Enum.valueOf(w91.class, str);
    }

    public static w91[] values() {
        return (w91[]) f.clone();
    }
}
