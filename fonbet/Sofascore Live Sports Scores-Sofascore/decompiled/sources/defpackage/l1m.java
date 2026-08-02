package defpackage;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class l1m {
    public static final int a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;

    static {
        Color.parseColor("#0D0F14");
        Color.parseColor("#232935");
        Color.parseColor("#929CB3");
        Color.parseColor("#F8F9FB");
        Color.parseColor("#DFE1E4");
        a = Color.parseColor("#5AA3FF");
        b = Color.parseColor("#FF364E");
        c = Color.parseColor("#FFAE00");
        d = Color.parseColor("#9C9C9C");
        e = Color.parseColor("#7D8699");
        f = Color.parseColor("#1A1A1A");
        g = -1;
        h = -1;
        i = Color.parseColor("#33FFFFFF");
        j = Color.parseColor("#FFFFFF");
        k = Color.parseColor("#33FFFFFF");
        l = Color.parseColor("#E5FF00");
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.RIGHT_LEFT;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{Color.parseColor("#FF0D0F14"), Color.parseColor("#000D0F14")});
        gradientDrawable.setGradientType(0);
        gradientDrawable.setCornerRadius(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{Color.parseColor("#FFDFE1E4"), Color.parseColor("#00DFE1E4")});
        gradientDrawable2.setGradientType(0);
        gradientDrawable2.setCornerRadius(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        m = Color.parseColor("#FFFFFF");
        n = Color.parseColor("#FF3131");
        o = Color.parseColor("#404040");
        p = Color.parseColor("#4E5053");
        q = Color.parseColor("#F0F0F0");
        r = Color.parseColor("#F0F0F0");
    }
}
