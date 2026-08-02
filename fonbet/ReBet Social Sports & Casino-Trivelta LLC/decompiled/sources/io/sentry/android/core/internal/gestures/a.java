package io.sentry.android.core.internal.gestures;

import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import io.sentry.internal.gestures.b;
import io.sentry.util.p;

/* loaded from: classes3.dex */
public final class a implements io.sentry.internal.gestures.a {

    /* renamed from: a, reason: collision with root package name */
    public final p f51001a;

    public a(p pVar) {
        this.f51001a = pVar;
    }

    public static boolean c(View view, boolean z10) {
        if (z10) {
            return ScrollingView.class.isAssignableFrom(view.getClass());
        }
        return false;
    }

    public static boolean d(View view, boolean z10) {
        return (c(view, z10) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0;
    }

    public static boolean e(View view) {
        return view.isClickable() && view.getVisibility() == 0;
    }

    @Override // io.sentry.internal.gestures.a
    public io.sentry.internal.gestures.b a(Object obj, float f10, float f11, b.a aVar) {
        if (!(obj instanceof View)) {
            return null;
        }
        View view = (View) obj;
        if (aVar == b.a.CLICKABLE && e(view)) {
            return b(view);
        }
        if (aVar == b.a.SCROLLABLE && d(view, ((Boolean) this.f51001a.a()).booleanValue())) {
            return b(view);
        }
        return null;
    }

    public final io.sentry.internal.gestures.b b(View view) {
        String b10 = k.b(view);
        if (b10 == null) {
            return null;
        }
        return new io.sentry.internal.gestures.b(view, io.sentry.android.core.internal.util.l.a(view), b10, null, "old_view_system");
    }
}
