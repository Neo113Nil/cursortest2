package defpackage;

import com.ironsource.mediationsdk.j;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class k37 {
    public static final k37 c;
    public static final k37 d;
    public static final /* synthetic */ k37[] e;
    public static final /* synthetic */ kp5 f;
    public final int a;
    public final Function2 b;

    static {
        int i = R.string.leaderboard;
        k37 k37Var = new k37(j.d, 0, i);
        k37 k37Var2 = new k37("MATCHUPS", 1, R.string.fantasy_matchups, new sc6(12));
        k37 k37Var3 = new k37("DETAILS", 2, R.string.details);
        k37 k37Var4 = new k37("CHAT", 3, R.string.chat);
        c = k37Var4;
        k37 k37Var5 = new k37("SETTINGS", 4, R.string.action_settings, new sc6(13));
        d = k37Var5;
        k37[] k37VarArr = {k37Var, k37Var2, k37Var3, k37Var4, k37Var5};
        e = k37VarArr;
        f = new kp5(k37VarArr);
    }

    public /* synthetic */ k37(String str, int i, int i2) {
        this(str, i, i2, new sc6(14));
    }

    public static k37 valueOf(String str) {
        return (k37) Enum.valueOf(k37.class, str);
    }

    public static k37[] values() {
        return (k37[]) e.clone();
    }

    public k37(String str, int i, int i2, Function2 function2) {
        this.a = i2;
        this.b = function2;
    }
}
