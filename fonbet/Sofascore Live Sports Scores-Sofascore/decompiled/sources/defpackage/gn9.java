package defpackage;

import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gn9 implements b0i {
    public static final /* synthetic */ gn9[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final List b;
    public final Function1 c;

    static {
        gn9[] gn9VarArr = {new gn9("PLAYERS", 0, R.string.legend_hockey_skaters, jn9.i, new yh9(24)), new gn9("GOALKEEPERS", 1, R.string.legend_hockey_goalies, fn9.h, new yh9(25))};
        d = gn9VarArr;
        e = new kp5(gn9VarArr);
    }

    public gn9(String str, int i, int i2, kp5 kp5Var, Function1 function1) {
        this.a = i2;
        this.b = kp5Var;
        this.c = function1;
    }

    public static gn9 valueOf(String str) {
        return (gn9) Enum.valueOf(gn9.class, str);
    }

    public static gn9[] values() {
        return (gn9[]) d.clone();
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
