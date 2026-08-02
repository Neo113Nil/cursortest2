package defpackage;

import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class e69 implements b0i {
    public static final /* synthetic */ e69[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final List b;
    public final Function1 c;

    static {
        e69[] e69VarArr = {new e69("PLAYERS", 0, R.string.players, f69.g, new c69(3)), new e69("GOALKEEPERS", 1, R.string.goalkeepers, d69.h, new c69(4))};
        d = e69VarArr;
        e = new kp5(e69VarArr);
    }

    public e69(String str, int i, int i2, kp5 kp5Var, Function1 function1) {
        this.a = i2;
        this.b = kp5Var;
        this.c = function1;
    }

    public static e69 valueOf(String str) {
        return (e69) Enum.valueOf(e69.class, str);
    }

    public static e69[] values() {
        return (e69[]) d.clone();
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
