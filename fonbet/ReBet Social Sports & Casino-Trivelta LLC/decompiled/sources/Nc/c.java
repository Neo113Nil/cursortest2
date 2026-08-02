package Nc;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class c {
    public static final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    public static final Fragment b(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        try {
            return a0.a(view);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static final boolean c(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (view.getMeasuredWidth() == 0 && view.getMeasuredHeight() == 0 && !view.isLaidOut()) ? false : true;
    }

    public static final View d(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    public static final ViewGroup e(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    public static final View f(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup e10 = e(view);
        if (e10 != null) {
            e10.endViewTransition(view);
            e10.removeView(view);
        }
        view.setVisibility(0);
        view.setTranslationY(0.0f);
        return view;
    }
}
