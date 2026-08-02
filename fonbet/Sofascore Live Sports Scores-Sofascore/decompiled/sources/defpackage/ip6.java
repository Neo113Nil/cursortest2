package defpackage;

import com.ironsource.mediationsdk.j;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ip6 {
    public static final ip6 c;
    public static final /* synthetic */ ip6[] d;
    public static final /* synthetic */ kp5 e;
    public final Function1 a;
    public final Function1 b;

    static {
        ip6 ip6Var = new ip6("HOME", 0, new yn6(11), new yn6(15));
        ip6 ip6Var2 = new ip6("MY_TEAM", 1, new yn6(19), new yn6(20));
        c = ip6Var2;
        ip6[] ip6VarArr = {ip6Var, ip6Var2, new ip6(j.d, 2, new yn6(21), new yn6(22)), new ip6("CHAT", 3, new yn6(23), new yn6(24)), new ip6("FIXTURES", 4, new yn6(12), new yn6(13)), new ip6("LEAGUES", 5, new yn6(14), new yn6(16)), new ip6("STATISTICS", 6, new yn6(17), new yn6(18))};
        d = ip6VarArr;
        e = new kp5(ip6VarArr);
    }

    public ip6(String str, int i, Function1 function1, Function1 function12) {
        this.a = function1;
        this.b = function12;
    }

    public static ip6 valueOf(String str) {
        return (ip6) Enum.valueOf(ip6.class, str);
    }

    public static ip6[] values() {
        return (ip6[]) d.clone();
    }
}
