package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.ironsource.U3;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a {
    public static y a(String str) {
        if (str == null) {
            return null;
        }
        int hashCode = str.hashCode();
        if (hashCode == 3387192) {
            if (str.equals("none")) {
                return y.d;
            }
            return null;
        }
        if (hashCode == 729267099) {
            if (str.equals(U3.i.D)) {
                return y.b;
            }
            return null;
        }
        if (hashCode == 1430647483 && str.equals(U3.i.C)) {
            return y.c;
        }
        return null;
    }

    public static boolean b(o oVar) {
        WebView webView;
        o oVar2 = (o) f.a.get();
        if (oVar2 != null && oVar2 != oVar) {
            return false;
        }
        f.a = new WeakReference(null);
        ViewParent parent = (oVar2 == null || (webView = oVar2.c) == null) ? null : webView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(oVar2.c);
        }
        f.c = null;
        f.f = null;
        f.g = null;
        f.k = null;
        Activity activity = (Activity) f.b.get();
        if (activity != null) {
            activity.finish();
        }
        f.b = new WeakReference(null);
        return true;
    }
}
