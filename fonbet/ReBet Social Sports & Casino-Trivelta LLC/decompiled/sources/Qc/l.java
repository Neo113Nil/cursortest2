package Qc;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.swmansion.rnscreens.T;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f9633a = new l();

    public final T a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        while (view != null) {
            if (view instanceof T) {
                return (T) view;
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return null;
            }
            view = viewGroup.getChildAt(0);
        }
        return null;
    }

    public final ScrollView b(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        while (view != null) {
            if (view instanceof ScrollView) {
                return (ScrollView) view;
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return null;
            }
            view = viewGroup.getChildAt(0);
        }
        return null;
    }
}
