package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class nha {
    public static final wj9 a = wj9.J("x", "y");

    public static int a(wga wgaVar) {
        wgaVar.h();
        int H = (int) (wgaVar.H() * 255.0d);
        int H2 = (int) (wgaVar.H() * 255.0d);
        int H3 = (int) (wgaVar.H() * 255.0d);
        while (wgaVar.t()) {
            wgaVar.g0();
        }
        wgaVar.m();
        return Color.argb(255, H, H2, H3);
    }

    public static PointF b(wga wgaVar, float f) {
        int C = wt3.C(wgaVar.Z());
        if (C == 0) {
            wgaVar.h();
            float H = (float) wgaVar.H();
            float H2 = (float) wgaVar.H();
            while (wgaVar.Z() != 2) {
                wgaVar.g0();
            }
            wgaVar.m();
            return new PointF(H * f, H2 * f);
        }
        if (C != 2) {
            if (C != 6) {
                a70.p("Unknown point starts with ".concat(wv8.y(wgaVar.Z())));
                return null;
            }
            float H3 = (float) wgaVar.H();
            float H4 = (float) wgaVar.H();
            while (wgaVar.t()) {
                wgaVar.g0();
            }
            return new PointF(H3 * f, H4 * f);
        }
        wgaVar.k();
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f3 = 0.0f;
        while (wgaVar.t()) {
            int e0 = wgaVar.e0(a);
            if (e0 == 0) {
                f2 = d(wgaVar);
            } else if (e0 != 1) {
                wgaVar.f0();
                wgaVar.g0();
            } else {
                f3 = d(wgaVar);
            }
        }
        wgaVar.n();
        return new PointF(f2 * f, f3 * f);
    }

    public static ArrayList c(wga wgaVar, float f) {
        ArrayList arrayList = new ArrayList();
        wgaVar.h();
        while (wgaVar.Z() == 1) {
            wgaVar.h();
            arrayList.add(b(wgaVar, f));
            wgaVar.m();
        }
        wgaVar.m();
        return arrayList;
    }

    public static float d(wga wgaVar) {
        int Z = wgaVar.Z();
        int C = wt3.C(Z);
        if (C != 0) {
            if (C == 6) {
                return (float) wgaVar.H();
            }
            a70.p("Unknown value for token of type ".concat(wv8.y(Z)));
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        wgaVar.h();
        float H = (float) wgaVar.H();
        while (wgaVar.t()) {
            wgaVar.g0();
        }
        wgaVar.m();
        return H;
    }
}
