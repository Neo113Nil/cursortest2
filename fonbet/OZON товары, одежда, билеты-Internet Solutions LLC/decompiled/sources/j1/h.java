package j1;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import j1.g;
import k1.C7460f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h {
    @NotNull
    public static final C7460f a(@NotNull View view) {
        int[] a11 = g.a.a();
        view.getLocationInWindow(a11);
        float f7 = a11[0];
        return new C7460f(f7, a11[1], view.getWidth() + f7, a11[1] + view.getHeight());
    }

    public static final boolean b(@NotNull View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if ((!viewGroup.isFocusable() || view.hasFocus()) && !(view instanceof AndroidComposeView)) {
            if (rect != null) {
                View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
                return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
            return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
        }
        return view.requestFocus(num.intValue(), rect);
    }

    public static final Integer c(int i11) {
        if (c.b(i11, 5)) {
            return 33;
        }
        if (c.b(i11, 6)) {
            return 130;
        }
        if (c.b(i11, 3)) {
            return 17;
        }
        if (c.b(i11, 4)) {
            return 66;
        }
        if (c.b(i11, 1)) {
            return 2;
        }
        return c.b(i11, 2) ? 1 : null;
    }

    public static final c d(int i11) {
        if (i11 == 1) {
            return c.a(2);
        }
        if (i11 == 2) {
            return c.a(1);
        }
        if (i11 == 17) {
            return c.a(3);
        }
        if (i11 == 33) {
            return c.a(5);
        }
        if (i11 == 66) {
            return c.a(4);
        }
        if (i11 != 130) {
            return null;
        }
        return c.a(6);
    }
}
