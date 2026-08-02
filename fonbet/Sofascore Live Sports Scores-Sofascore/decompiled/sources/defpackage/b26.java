package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b26 {
    public static final f8h e;
    public static final b26 f;
    public static final /* synthetic */ b26[] g;
    public static final /* synthetic */ kp5 h;
    public final int a;
    public final int b;
    public final float c;
    public final int d;

    static {
        b26 b26Var = new b26("Score", 0, 0, R.font.sofascore_sans_bold, 14, 0.01f);
        f = b26Var;
        b26[] b26VarArr = {b26Var, new b26("Status", 1, 1, R.font.sofascore_sans_regular, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)};
        g = b26VarArr;
        h = new kp5(b26VarArr);
        e = new f8h(22);
    }

    public b26(String str, int i, int i2, int i3, int i4, float f2) {
        this.a = i2;
        this.b = i3;
        this.c = f2;
        this.d = i4;
    }

    public static b26 valueOf(String str) {
        return (b26) Enum.valueOf(b26.class, str);
    }

    public static b26[] values() {
        return (b26[]) g.clone();
    }
}
