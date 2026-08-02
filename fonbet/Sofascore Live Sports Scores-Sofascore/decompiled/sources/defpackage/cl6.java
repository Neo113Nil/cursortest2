package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class cl6 {
    public static g79 a(ial ialVar, FoldingFeature foldingFeature) {
        f79 f79Var;
        ue8 ue8Var;
        ialVar.getClass();
        foldingFeature.getClass();
        int type = foldingFeature.getType();
        if (type == 1) {
            f79Var = f79.c;
        } else {
            if (type != 2) {
                return null;
            }
            f79Var = f79.d;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            ue8Var = ue8.c;
        } else {
            if (state != 2) {
                return null;
            }
            ue8Var = ue8.d;
        }
        Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        t02 t02Var = new t02(bounds);
        Rect a = ialVar.a();
        if (t02Var.a() == 0 && t02Var.b() == 0) {
            return null;
        }
        if (t02Var.b() != a.width() && t02Var.a() != a.height()) {
            return null;
        }
        if (t02Var.b() < a.width() && t02Var.a() < a.height()) {
            return null;
        }
        if (t02Var.b() == a.width() && t02Var.a() == a.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        bounds2.getClass();
        return new g79(new t02(bounds2), f79Var, ue8Var);
    }

    public static hal b(ial ialVar, WindowLayoutInfo windowLayoutInfo) {
        ialVar.getClass();
        windowLayoutInfo.getClass();
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        ArrayList k = me4.k(displayFeatures);
        for (FoldingFeature foldingFeature : displayFeatures) {
            g79 a = foldingFeature instanceof FoldingFeature ? a(ialVar, foldingFeature) : null;
            if (a != null) {
                k.add(a);
            }
        }
        return new hal(k);
    }

    public static hal c(Context context, WindowLayoutInfo windowLayoutInfo) {
        mal malVar = ccd.h;
        mal malVar2 = v02.c;
        mal malVar3 = mx4.b;
        windowLayoutInfo.getClass();
        int i = Build.VERSION.SDK_INT;
        lx4 lx4Var = i >= 34 ? mx4.a : q1f.c;
        b.e(1, 2, 4, 8, 16, 32, 64, 128);
        if (i >= 30) {
            if (i >= 34) {
                malVar = malVar3;
            } else if (i >= 30) {
                malVar = malVar2;
            }
            return b(malVar.g(context, lx4Var), windowLayoutInfo);
        }
        if (i < 29 || !(context instanceof Activity)) {
            a70.m("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            return null;
        }
        Activity activity = (Activity) context;
        if (i >= 34) {
            malVar = malVar3;
        } else if (i >= 30) {
            malVar = malVar2;
        }
        return b(malVar.k(activity, lx4Var), windowLayoutInfo);
    }
}
