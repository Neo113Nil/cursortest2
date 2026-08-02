package defpackage;

import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class i75 {
    public static final i75 a;
    public static final i75 b;
    public static final i75 c;
    public static final i75 d;
    public static final /* synthetic */ i75[] e;

    static {
        i75 i75Var = new i75("Up", 0);
        a = i75Var;
        i75 i75Var2 = new i75("Drag", 1);
        b = i75Var2;
        i75 i75Var3 = new i75(AndroidInitializeBoldSDK.MSG_TIMEOUT, 2);
        c = i75Var3;
        i75 i75Var4 = new i75("Cancel", 3);
        d = i75Var4;
        e = new i75[]{i75Var, i75Var2, i75Var3, i75Var4};
    }

    public static i75 valueOf(String str) {
        return (i75) Enum.valueOf(i75.class, str);
    }

    public static i75[] values() {
        return (i75[]) e.clone();
    }
}
