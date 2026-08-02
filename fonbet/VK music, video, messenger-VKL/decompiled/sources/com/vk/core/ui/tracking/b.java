package com.vk.core.ui.tracking;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import xsna.m0q0;
import xsna.n0q0;
import xsna.n1q0;

/* compiled from: SharedTrackingScreenHolder.kt */
/* loaded from: classes.dex */
public abstract class b implements n1q0.b, n1q0.a {
    public UiTrackingScreen a;

    public static UiTrackingScreen l(Object obj, Object obj2, HashMap hashMap) {
        m0q0 m0q0Var;
        UiTrackingScreen uiTrackingScreen = (UiTrackingScreen) hashMap.get(obj2);
        if (uiTrackingScreen == null) {
            return UiTrackingScreen.Companion.b(obj);
        }
        m0q0 m0q0Var2 = (!(obj instanceof m0q0) || (obj instanceof n0q0)) ? null : (m0q0) obj;
        UiTrackingScreen b = m0q0Var2 != null ? UiTrackingScreen.b(uiTrackingScreen, new WeakReference(m0q0Var2), null, 11) : UiTrackingScreen.b(uiTrackingScreen, null, null, 15);
        WeakReference<m0q0> weakReference = b.c;
        if (weakReference != null && (m0q0Var = weakReference.get()) != null) {
            m0q0Var.y(b);
        }
        return b;
    }

    public abstract UiTrackingScreen c(Activity activity);

    public abstract UiTrackingScreen d(Dialog dialog);

    public abstract UiTrackingScreen e(View view);

    public abstract UiTrackingScreen f(Fragment fragment);

    public abstract UiTrackingScreen g(n0q0 n0q0Var);

    public abstract boolean h(Activity activity);

    public abstract boolean i(Dialog dialog);

    public abstract boolean j(View view);

    public abstract boolean k(Fragment fragment);

    public abstract int m();
}
