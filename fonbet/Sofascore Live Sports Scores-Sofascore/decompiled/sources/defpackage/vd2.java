package defpackage;

import com.ironsource.L6;
import com.ironsource.Y1;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vd2 {
    public static final vd2 a;
    public static final vd2 b;
    public static final vd2 c;
    public static final vd2 d;
    public static final HashMap e;
    public static final /* synthetic */ vd2[] f;

    /* JADX INFO: Fake field, exist only in values array */
    vd2 EF1;

    static {
        vd2 vd2Var = new vd2("target", 0);
        vd2 vd2Var2 = new vd2("root", 1);
        vd2 vd2Var3 = new vd2("nth_child", 2);
        a = vd2Var3;
        vd2 vd2Var4 = new vd2("nth_last_child", 3);
        vd2 vd2Var5 = new vd2("nth_of_type", 4);
        b = vd2Var5;
        vd2 vd2Var6 = new vd2("nth_last_of_type", 5);
        c = vd2Var6;
        vd2 vd2Var7 = new vd2("first_child", 6);
        vd2 vd2Var8 = new vd2("last_child", 7);
        vd2 vd2Var9 = new vd2("first_of_type", 8);
        vd2 vd2Var10 = new vd2("last_of_type", 9);
        vd2 vd2Var11 = new vd2("only_child", 10);
        vd2 vd2Var12 = new vd2("only_of_type", 11);
        vd2 vd2Var13 = new vd2("empty", 12);
        vd2 vd2Var14 = new vd2("not", 13);
        vd2 vd2Var15 = new vd2(L6.q, 14);
        vd2 vd2Var16 = new vd2("link", 15);
        vd2 vd2Var17 = new vd2("visited", 16);
        vd2 vd2Var18 = new vd2("hover", 17);
        vd2 vd2Var19 = new vd2("active", 18);
        vd2 vd2Var20 = new vd2("focus", 19);
        vd2 vd2Var21 = new vd2("enabled", 20);
        vd2 vd2Var22 = new vd2(Y1.e, 21);
        vd2 vd2Var23 = new vd2("checked", 22);
        vd2 vd2Var24 = new vd2("indeterminate", 23);
        vd2 vd2Var25 = new vd2("UNSUPPORTED", 24);
        d = vd2Var25;
        f = new vd2[]{vd2Var, vd2Var2, vd2Var3, vd2Var4, vd2Var5, vd2Var6, vd2Var7, vd2Var8, vd2Var9, vd2Var10, vd2Var11, vd2Var12, vd2Var13, vd2Var14, vd2Var15, vd2Var16, vd2Var17, vd2Var18, vd2Var19, vd2Var20, vd2Var21, vd2Var22, vd2Var23, vd2Var24, vd2Var25};
        e = new HashMap();
        for (vd2 vd2Var26 : values()) {
            if (vd2Var26 != d) {
                e.put(vd2Var26.name().replace('_', '-'), vd2Var26);
            }
        }
    }

    public static vd2 valueOf(String str) {
        return (vd2) Enum.valueOf(vd2.class, str);
    }

    public static vd2[] values() {
        return (vd2[]) f.clone();
    }
}
