package io.sentry.android.replay.util;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import io.sentry.AbstractC4842u3;
import io.sentry.ILogger;
import io.sentry.android.replay.viewhierarchy.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class r {
    public static final void a(View view, ViewTreeObserver.OnDrawListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final void b(View view, ViewTreeObserver.OnPreDrawListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnPreDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final int c(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        try {
            return textView.getTotalPaddingTop();
        } catch (NullPointerException unused) {
            return textView.getExtendedPaddingTop();
        }
    }

    public static final List d(q qVar, Rect globalRect, int i10, int i11) {
        Intrinsics.checkNotNullParameter(globalRect, "globalRect");
        if (qVar == null) {
            return CollectionsKt.listOf(globalRect);
        }
        ArrayList arrayList = new ArrayList();
        int b10 = qVar.b();
        for (int i12 = 0; i12 < b10; i12++) {
            int e10 = (int) qVar.e(i12);
            int c10 = (int) qVar.c(i12);
            int a10 = qVar.a(i12);
            int f10 = qVar.f(i12);
            Rect rect = new Rect();
            rect.left = globalRect.left + i10 + e10;
            rect.right = globalRect.left + i10 + c10;
            int i13 = globalRect.top + i11 + a10;
            rect.top = i13;
            rect.bottom = i13 + (f10 - a10);
            arrayList.add(rect);
        }
        return arrayList;
    }

    public static final boolean e(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static final boolean f(Drawable drawable) {
        if (drawable instanceof InsetDrawable ? true : drawable instanceof ColorDrawable ? true : drawable instanceof VectorDrawable ? true : drawable instanceof GradientDrawable) {
            return false;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            return true;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        return bitmap != null && !bitmap.isRecycled() && bitmap.getHeight() > 10 && bitmap.getWidth() > 10;
    }

    public static final Pair g(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (!view.isAttachedToWindow()) {
            return TuplesKt.to(Boolean.FALSE, null);
        }
        if (view.getWindowVisibility() != 0) {
            return TuplesKt.to(Boolean.FALSE, null);
        }
        Object obj = view;
        while (obj instanceof View) {
            float transitionAlpha = Build.VERSION.SDK_INT >= 29 ? ((View) obj).getTransitionAlpha() : 1.0f;
            View view2 = (View) obj;
            if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
                return TuplesKt.to(Boolean.FALSE, null);
            }
            obj = view2.getParent();
        }
        Rect rect = new Rect();
        return TuplesKt.to(Boolean.valueOf(view.getGlobalVisibleRect(rect, new Point())), rect);
    }

    public static final void h(View view, ViewTreeObserver.OnDrawListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final void i(View view, ViewTreeObserver.OnPreDrawListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(listener);
        } catch (IllegalStateException unused) {
        }
    }

    public static final int j(int i10) {
        return i10 | (-16777216);
    }

    public static final void k(View view, io.sentry.android.replay.viewhierarchy.c parentNode, AbstractC4842u3 options, ILogger logger, List list) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(parentNode, "parentNode");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(logger, "logger");
        if ((view instanceof ViewGroup) && !io.sentry.android.replay.viewhierarchy.a.f51821a.b(view, parentNode, options, logger)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    io.sentry.android.replay.viewhierarchy.c a10 = io.sentry.android.replay.viewhierarchy.c.f51833m.a(childAt, parentNode, viewGroup.indexOfChild(childAt), options);
                    arrayList.add(a10);
                    if (list != null && (a10 instanceof c.d) && a10.f()) {
                        list.add(a10);
                    }
                    k(childAt, a10, options, logger, list);
                }
            }
            parentNode.g(arrayList);
        }
    }
}
