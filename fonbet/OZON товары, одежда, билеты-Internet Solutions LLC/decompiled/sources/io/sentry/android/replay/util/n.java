package io.sentry.android.replay.util;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.ILogger;
import io.sentry.P2;
import io.sentry.android.replay.s;
import io.sentry.android.replay.viewhierarchy.b;
import io.sentry.android.replay.x;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class n {
    public static final void a(View view, @NotNull s listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final void b(View view, @NotNull x.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    @SuppressLint({"UseKtx"})
    public static final void c(@NotNull View view, @NotNull io.sentry.android.replay.viewhierarchy.b parentNode, @NotNull P2 options, @NotNull ILogger logger) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(parentNode, "parentNode");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(logger, "logger");
        if ((view instanceof ViewGroup) && !io.sentry.android.replay.viewhierarchy.a.a(view, parentNode, options, logger)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt != null) {
                    viewGroup.indexOfChild(childAt);
                    io.sentry.android.replay.viewhierarchy.b a11 = b.a.a(childAt, parentNode, options);
                    arrayList.add(a11);
                    c(childAt, a11, options, logger);
                }
            }
            parentNode.f(arrayList);
        }
    }
}
