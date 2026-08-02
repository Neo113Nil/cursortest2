package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vk2 {
    public static final vk2 c;
    public static final /* synthetic */ vk2[] d;
    public static final /* synthetic */ kp5 e;
    public final String a;
    public final int b;

    static {
        vk2 vk2Var = new vk2("OVERALL", 0, "overall", R.string.total);
        c = vk2Var;
        vk2[] vk2VarArr = {vk2Var, new vk2("HOME", 1, "home", R.string.home), new vk2("AWAY", 2, "away", R.string.away)};
        d = vk2VarArr;
        e = new kp5(vk2VarArr);
    }

    public vk2(String str, int i, String str2, int i2) {
        this.a = str2;
        this.b = i2;
    }

    public static vk2 valueOf(String str) {
        return (vk2) Enum.valueOf(vk2.class, str);
    }

    public static vk2[] values() {
        return (vk2[]) d.clone();
    }
}
