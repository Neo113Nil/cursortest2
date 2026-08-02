package defpackage;

import com.sofascore.model.mvvm.model.PlayerKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v22 {
    public static final v22 a;
    public static final v22 b;
    public static final /* synthetic */ v22[] c;

    static {
        v22 v22Var = new v22(PlayerKt.PREFERRED_FOOT_LEFT, 0);
        a = v22Var;
        v22 v22Var2 = new v22(PlayerKt.PREFERRED_FOOT_RIGHT, 1);
        b = v22Var2;
        c = new v22[]{v22Var, v22Var2};
    }

    public static v22 valueOf(String str) {
        return (v22) Enum.valueOf(v22.class, str);
    }

    public static v22[] values() {
        return (v22[]) c.clone();
    }
}
