package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.gestures.b;
import java.util.ArrayDeque;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class k {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final View f51041a;

        /* renamed from: b, reason: collision with root package name */
        public final float f51042b;

        /* renamed from: c, reason: collision with root package name */
        public final float f51043c;

        public a(View view, float f10, float f11) {
            this.f51041a = view;
            this.f51042b = f10;
            this.f51043c = f11;
        }
    }

    public static io.sentry.internal.gestures.b a(SentryAndroidOptions sentryAndroidOptions, View view, float f10, float f11, b.a aVar) {
        List<io.sentry.internal.gestures.a> gestureTargetLocators = sentryAndroidOptions.getGestureTargetLocators();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new a(view, f10, f11));
        io.sentry.internal.gestures.b bVar = null;
        while (!arrayDeque.isEmpty()) {
            a aVar2 = (a) arrayDeque.poll();
            View view2 = aVar2.f51041a;
            if (e(view2, aVar2.f51042b, aVar2.f51043c)) {
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int scrollX = viewGroup.getScrollX();
                    int scrollY = viewGroup.getScrollY();
                    for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt != null) {
                            arrayDeque.add(d(childAt, aVar2.f51042b, aVar2.f51043c, scrollX, scrollY));
                        }
                    }
                }
                for (int i11 = 0; i11 < gestureTargetLocators.size(); i11++) {
                    io.sentry.internal.gestures.b a10 = gestureTargetLocators.get(i11).a(view2, f10, f11, aVar);
                    if (a10 != null) {
                        if (aVar == b.a.CLICKABLE) {
                            bVar = a10;
                        } else if (aVar == b.a.SCROLLABLE) {
                            return a10;
                        }
                    }
                }
            }
        }
        return bVar;
    }

    public static String b(View view) {
        int id2 = view.getId();
        if (id2 != -1 && !c(id2)) {
            Resources resources = view.getContext().getResources();
            if (resources == null) {
                return "";
            }
            try {
                return resources.getResourceEntryName(id2);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }

    public static boolean c(int i10) {
        return ((-16777216) & i10) == 0 && (i10 & 16777215) != 0;
    }

    public static a d(View view, float f10, float f11, int i10, int i11) {
        float left = (f10 + i10) - view.getLeft();
        float top = (f11 + i11) - view.getTop();
        Matrix matrix = view.getMatrix();
        if (matrix != null && !matrix.isIdentity()) {
            Matrix matrix2 = new Matrix();
            if (matrix.invert(matrix2)) {
                float[] fArr = {left, top};
                matrix2.mapPoints(fArr);
                float f12 = fArr[0];
                top = fArr[1];
                left = f12;
            }
        }
        return new a(view, left, top);
    }

    public static boolean e(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        return f10 >= 0.0f && f10 <= ((float) view.getWidth()) && f11 >= 0.0f && f11 <= ((float) view.getHeight());
    }
}
