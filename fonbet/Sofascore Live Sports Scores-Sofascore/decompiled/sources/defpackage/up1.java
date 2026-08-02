package defpackage;

import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class up1 implements b0i {
    public static final /* synthetic */ up1[] c;
    public static final /* synthetic */ kp5 d;
    public final List a;
    public final x91 b;

    static {
        up1[] up1VarArr = {new up1(xp1.j, new x91(10))};
        c = up1VarArr;
        d = new kp5(up1VarArr);
    }

    public up1(kp5 kp5Var, x91 x91Var) {
        this.a = kp5Var;
        this.b = x91Var;
    }

    public static up1 valueOf(String str) {
        return (up1) Enum.valueOf(up1.class, str);
    }

    public static up1[] values() {
        return (up1[]) c.clone();
    }

    @Override // defpackage.b0i
    public final String d() {
        return name();
    }

    @Override // defpackage.b0i
    public final int g() {
        return R.string.legend_info_button_title;
    }

    @Override // defpackage.b0i
    public final Function1 h() {
        return this.b;
    }

    @Override // defpackage.b0i
    public final List i() {
        return this.a;
    }
}
