package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f08 {
    public static final /* synthetic */ f08[] c;
    public static final /* synthetic */ kp5 d;
    public final String a;
    public final int b;

    static {
        f08[] f08VarArr = {new f08("UNDEFINED", 0, "Undefined", R.string.undefined), new f08("PAUSED", 1, "Pause", R.string.pause), new f08("DISTANCE", 2, "Distance", R.string.mma_position_stance), new f08("GROUND", 3, "Ground", R.string.ground), new f08("GROUND_GRAPPLE_RED", 4, "Ground grapple by red", R.string.ground_grapple_red), new f08("GROUND_GRAPPLE_BLUE", 5, "Ground grapple by blue", R.string.ground_grapple_blue), new f08("GRAPPLE_RED", 6, "Grapple by red", R.string.mma_position_clinch_by_red), new f08("GRAPPLE_BLUE", 7, "Grapple by blue", R.string.mma_position_clinch_by_blue)};
        c = f08VarArr;
        d = new kp5(f08VarArr);
    }

    public f08(String str, int i, String str2, int i2) {
        this.a = str2;
        this.b = i2;
    }

    public static f08 valueOf(String str) {
        return (f08) Enum.valueOf(f08.class, str);
    }

    public static f08[] values() {
        return (f08[]) c.clone();
    }
}
