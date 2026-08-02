package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pp9 {
    public static final ccd a;
    public static final pp9 b;
    public static final pp9 c;
    public static final pp9 d;
    public static final /* synthetic */ pp9[] e;
    public static final /* synthetic */ kp5 f;

    static {
        pp9 pp9Var = new pp9("INJURED", 0);
        b = pp9Var;
        pp9 pp9Var2 = new pp9("INJURED_DOUBTFUL", 1);
        c = pp9Var2;
        pp9 pp9Var3 = new pp9("SUSPENDED", 2);
        d = pp9Var3;
        pp9[] pp9VarArr = {pp9Var, pp9Var2, pp9Var3};
        e = pp9VarArr;
        f = new kp5(pp9VarArr);
        a = new ccd();
    }

    public static pp9 valueOf(String str) {
        return (pp9) Enum.valueOf(pp9.class, str);
    }

    public static pp9[] values() {
        return (pp9[]) e.clone();
    }

    public final long a(of3 of3Var) {
        av8 av8Var;
        int i;
        int i2;
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                av8Var = (av8) of3Var;
                i = R.color.alert;
                i2 = -500468298;
                return ljg.f(av8Var, i2, i, av8Var, false);
            }
            if (ordinal != 2) {
                throw dmi.h((av8) of3Var, -500471353, false);
            }
        }
        av8Var = (av8) of3Var;
        i = R.color.error;
        i2 = -500469802;
        return ljg.f(av8Var, i2, i, av8Var, false);
    }

    public final ImageVector b(of3 of3Var) {
        int ordinal = ordinal();
        if (ordinal == 0 || ordinal == 1) {
            av8 av8Var = (av8) of3Var;
            av8Var.d0(342418793);
            ImageVector N = s6a.N(R.drawable.ic_cross, 6, av8Var);
            av8Var.s(false);
            return N;
        }
        if (ordinal != 2) {
            throw dmi.h((av8) of3Var, 342416695, false);
        }
        av8 av8Var2 = (av8) of3Var;
        av8Var2.d0(342421424);
        ImageVector N2 = s6a.N(R.drawable.ic_suspended_16, 6, av8Var2);
        av8Var2.s(false);
        return N2;
    }
}
