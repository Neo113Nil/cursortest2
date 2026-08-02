package defpackage;

import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.results.R;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d91 {
    public static final dti d;
    public static final Set e;
    public static final d91 f;
    public static final /* synthetic */ d91[] g;
    public static final /* synthetic */ kp5 h;
    public final String a;
    public final int b;
    public final int c;

    static {
        d91 d91Var = new d91(PlayerKt.PREFERRED_FOOT_LEFT, 0, "L", R.string.baseball_bats_throws_left_hand, R.string.left_hand_short);
        d91 d91Var2 = new d91(PlayerKt.PREFERRED_FOOT_RIGHT, 1, PlayerKt.ICE_HOCKEY_RIGHT_WING, R.string.baseball_bats_throws_right_hand, R.string.right_hand_short);
        d91 d91Var3 = new d91("Switch", 2, PlayerKt.VOLLEYBALL_SETTER, R.string.baseball_bats_throws_switch, R.string.baseball_bats_throws_switch_short);
        f = d91Var3;
        d91[] d91VarArr = {d91Var, d91Var2, d91Var3};
        g = d91VarArr;
        h = new kp5(d91VarArr);
        d = new dti(16);
        e = ph0.a0(new String[]{"B", PlayerKt.VOLLEYBALL_SETTER});
    }

    public d91(String str, int i, String str2, int i2, int i3) {
        this.a = str2;
        this.b = i2;
        this.c = i3;
    }

    public static d91 valueOf(String str) {
        return (d91) Enum.valueOf(d91.class, str);
    }

    public static d91[] values() {
        return (d91[]) g.clone();
    }
}
