package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import com.sofascore.results.main.start.StartActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wxh implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ StartActivity a;

    public wxh(xxh xxhVar, StartActivity startActivity) {
        this.a = startActivity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (view2 instanceof SplashScreenView) {
            WindowInsets build = by1.g().build();
            build.getClass();
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            if (build == ((SplashScreenView) view2).getRootView().computeSystemWindowInsets(build, rect)) {
                rect.isEmpty();
            }
            View decorView = this.a.getWindow().getDecorView();
            decorView.getClass();
            ((ViewGroup) decorView).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
