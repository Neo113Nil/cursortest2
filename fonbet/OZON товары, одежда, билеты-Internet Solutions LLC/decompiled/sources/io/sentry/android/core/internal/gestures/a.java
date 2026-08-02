package io.sentry.android.core.internal.gestures;

import Bl0.C2645f;
import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import io.sentry.internal.gestures.b;
import io.sentry.util.l;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a implements io.sentry.internal.gestures.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final l<Boolean> f67116a;

    public a(@NotNull l<Boolean> lVar) {
        this.f67116a = lVar;
    }

    @Override // io.sentry.internal.gestures.a
    public final io.sentry.internal.gestures.b a(View view, b.a aVar) {
        if (view != null) {
            if (aVar == b.a.CLICKABLE && view.isClickable() && view.getVisibility() == 0) {
                try {
                    return new io.sentry.internal.gestures.b(view, C2645f.b(view), h.b(view));
                } catch (Resources.NotFoundException unused) {
                    return null;
                }
            }
            if (aVar == b.a.SCROLLABLE) {
                boolean z11 = false;
                if (((!this.f67116a.a().booleanValue() ? false : ScrollingView.class.isAssignableFrom(view.getClass())) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0) {
                    z11 = true;
                }
                if (z11) {
                    try {
                        return new io.sentry.internal.gestures.b(view, C2645f.b(view), h.b(view));
                    } catch (Resources.NotFoundException unused2) {
                    }
                }
            }
        }
        return null;
    }
}
