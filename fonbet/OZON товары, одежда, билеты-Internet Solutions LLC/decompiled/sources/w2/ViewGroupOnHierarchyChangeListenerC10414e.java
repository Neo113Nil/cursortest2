package w2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import androidx.recyclerview.widget.LinearLayoutManager;
import jf.C7417b;
import kotlin.jvm.internal.Intrinsics;
import u3.y;
import u3.z;
import w2.C10411b;

/* renamed from: w2.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewGroupOnHierarchyChangeListenerC10414e implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10411b.C2240b f103375a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.appcompat.app.g f103376b;

    ViewGroupOnHierarchyChangeListenerC10414e(C10411b.C2240b c2240b, androidx.appcompat.app.g gVar) {
        this.f103375a = c2240b;
        this.f103376b = gVar;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        WindowInsets build;
        View rootView;
        if (y.c(view2)) {
            SplashScreenView child = z.a(view2);
            C10411b.C2240b c2240b = this.f103375a;
            c2240b.getClass();
            Intrinsics.checkNotNullParameter(child, "child");
            build = C7417b.a().build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            Rect rect = new Rect(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE, Integer.MAX_VALUE);
            rootView = child.getRootView();
            c2240b.l((build == rootView.computeSystemWindowInsets(build, rect) && rect.isEmpty()) ? false : true);
            View decorView = this.f103376b.getWindow().getDecorView();
            Intrinsics.g(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) decorView).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
