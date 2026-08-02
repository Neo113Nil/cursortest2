package defpackage;

import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class u71 implements b0i {
    public static final u71 d;
    public static final u71 e;
    public static final u71 f;
    public static final /* synthetic */ u71[] g;
    public static final /* synthetic */ kp5 h;
    public final int a;
    public final List b;
    public final Function1 c;

    static {
        u71 u71Var = new u71("BATTING_SUMMARY", 0, R.string.baseball_group_batting, x71.h, new dt(27));
        d = u71Var;
        u71 u71Var2 = new u71("PITCHING_SUMMARY", 1, R.string.baseball_group_pitching, a81.h, new dt(28));
        e = u71Var2;
        u71 u71Var3 = new u71("FIELDING_SUMMARY", 2, R.string.baseball_group_fielding, y71.g, new dt(29));
        f = u71Var3;
        u71[] u71VarArr = {u71Var, u71Var2, u71Var3};
        g = u71VarArr;
        h = new kp5(u71VarArr);
    }

    public u71(String str, int i, int i2, kp5 kp5Var, Function1 function1) {
        this.a = i2;
        this.b = kp5Var;
        this.c = function1;
    }

    public static u71 valueOf(String str) {
        return (u71) Enum.valueOf(u71.class, str);
    }

    public static u71[] values() {
        return (u71[]) g.clone();
    }

    @Override // defpackage.b0i
    public final String d() {
        return name();
    }

    @Override // defpackage.b0i
    public final int g() {
        return this.a;
    }

    @Override // defpackage.b0i
    public final Function1 h() {
        return this.c;
    }

    @Override // defpackage.b0i
    public final List i() {
        return this.b;
    }
}
