package ru.ozon.uni.android.uikit.extensions.view;

import Jk0.a;
import Sc.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import androidx.core.view.Y;
import c3.C5739a;
import c3.C5741c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\n\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\f\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0011\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0015\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0011\u0010\u0017\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001a\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001c\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001b\u001a'\u0010\u001f\u001a\u0004\u0018\u00010\u001d*\u00020\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b\u001f\u0010 \u001a\u0019\u0010\"\u001a\u00020\u0005*\u00020\u00002\u0006\u0010!\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u0004\u0018\u00010\u0000*\u00020\u0000¢\u0006\u0004\b$\u0010%\u001a!\u0010(\u001a\u00020\u0005*\u00020\u00002\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e¢\u0006\u0004\b(\u0010)\u001a\u0011\u0010*\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b*\u0010\u0018\u001a\u0011\u0010+\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b+\u0010\u0018\u001a\u0011\u0010,\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b,\u0010\u0018\u001a\u0011\u0010-\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b-\u0010\u0018\u001a\u0011\u0010\u0004\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0018\u001a\u001b\u0010.\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b.\u0010/\u001a\u001b\u00102\u001a\u00020\u0005*\u00020\u00002\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103\u001a9\u00108\u001a\u00020\u0005*\u00020\u00002\b\b\u0003\u00104\u001a\u00020\u00132\b\b\u0003\u00105\u001a\u00020\u00132\b\b\u0003\u00106\u001a\u00020\u00132\b\b\u0003\u00107\u001a\u00020\u0013¢\u0006\u0004\b8\u00109¨\u0006:"}, d2 = {"Landroid/view/View;", "", "isVisible", "(Landroid/view/View;)Z", "show", "", "showOrInvisible", "(Landroid/view/View;Z)V", "", "throttleTime", "Lkotlin/Function1;", "onClick", "setOnClickListenerThrottle", "(Landroid/view/View;JLkotlin/jvm/functions/Function1;)V", "", "float", "enabled", "alpha", "(Landroid/view/View;FZ)V", "", "color", "setBackgroundTint", "(Landroid/view/View;I)V", "clearBackgroundTint", "(Landroid/view/View;)V", "duration", "fadeOut", "(Landroid/view/View;J)V", "fadeIn", "Landroid/view/ViewGroup;", "condition", "findParent", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)Landroid/view/ViewGroup;", "dp", "setPaddingsDp", "(Landroid/view/View;F)V", "getIfNotGone", "(Landroid/view/View;)Landroid/view/View;", "x", "y", "onTapEvent", "(Landroid/view/View;FF)V", "gone", "invisible", "enable", "disable", "showOrGone", "(Landroid/view/View;Ljava/lang/Boolean;)V", "", "presence", "showOrGoneByPresence", "(Landroid/view/View;Ljava/lang/Object;)V", "left", "top", "right", "bottom", "updatePadding", "(Landroid/view/View;IIII)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ViewExtKt {
    public static final void alpha(@NotNull View view, float f7, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (!z11) {
            f7 = 1.0f;
        }
        view.setAlpha(f7);
    }

    public static final void clearBackgroundTint(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Y.F(view, null);
    }

    public static final void disable(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setEnabled(false);
    }

    public static final void enable(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setEnabled(true);
    }

    public static final void fadeIn(@NotNull View view, long j11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (isVisible(view)) {
            return;
        }
        view.setAlpha(0.0f);
        view.setVisibility(0);
        ViewPropertyAnimator animate = view.animate();
        animate.alpha(1.0f);
        animate.setDuration(j11);
        animate.setInterpolator(new C5739a());
    }

    public static /* synthetic */ void fadeIn$default(View view, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 300;
        }
        fadeIn(view, j11);
    }

    public static final void fadeOut(@NotNull View view, long j11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewPropertyAnimator animate = view.animate();
        animate.alpha(0.0f);
        animate.setDuration(j11);
        animate.setInterpolator(new C5741c());
        animate.withEndAction(new a(view, 0));
    }

    public static /* synthetic */ void fadeOut$default(View view, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 300;
        }
        fadeOut(view, j11);
    }

    public static final ViewGroup findParent(@NotNull View view, @NotNull Function1<? super ViewGroup, Boolean> condition) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(condition, "condition");
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null) {
            return null;
        }
        while (!condition.invoke(viewGroup).booleanValue()) {
            ViewParent parent = viewGroup.getParent();
            viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup == null) {
                return null;
            }
        }
        return viewGroup;
    }

    public static final View getIfNotGone(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getVisibility() != 8) {
            return view;
        }
        return null;
    }

    public static final void gone(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(8);
    }

    public static final void invisible(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(4);
    }

    public static final boolean isVisible(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 0;
    }

    public static final void onTapEvent(@NotNull View view, float f7, float f11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        MotionEvent obtain = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, f7, f11, 0);
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
        view.dispatchTouchEvent(obtain);
        MotionEvent obtain2 = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, f7, f11, 0);
        Intrinsics.checkNotNullExpressionValue(obtain2, "obtain(...)");
        view.dispatchTouchEvent(obtain2);
    }

    public static final void setBackgroundTint(@NotNull View view, int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Y.F(view, ColorStateList.valueOf(i11));
    }

    public static final void setOnClickListenerThrottle(@NotNull View view, final long j11, @NotNull final Function1<? super View, Unit> onClick) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        view.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.uni.android.uikit.extensions.view.ViewExtKt$setOnClickListenerThrottle$1
            private long lastClickTime;

            @Override // android.view.View.OnClickListener
            public void onClick(View v11) {
                Intrinsics.checkNotNullParameter(v11, "v");
                if (SystemClock.elapsedRealtime() - this.lastClickTime < j11) {
                    return;
                }
                this.lastClickTime = SystemClock.elapsedRealtime();
                onClick.invoke(v11);
            }
        });
    }

    public static /* synthetic */ void setOnClickListenerThrottle$default(View view, long j11, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 600;
        }
        setOnClickListenerThrottle(view, j11, function1);
    }

    public static final void setPaddingsDp(@NotNull View view, float f7) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int convertDpToPixel = (int) ResourceExtKt.convertDpToPixel(context, f7);
        view.setPadding(convertDpToPixel, convertDpToPixel, convertDpToPixel, convertDpToPixel);
    }

    public static final void show(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(0);
    }

    public static final void showOrGone(@NotNull View view, Boolean bool) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(Intrinsics.d(bool, Boolean.TRUE) ? 0 : 8);
    }

    public static final void showOrGoneByPresence(@NotNull View view, Object obj) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(obj != null ? 0 : 8);
    }

    public static final void showOrInvisible(@NotNull View view, boolean z11) {
        int i11;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z11) {
            i11 = 0;
        } else {
            if (z11) {
                throw new o();
            }
            i11 = 4;
        }
        view.setVisibility(i11);
    }

    public static final void updatePadding(@NotNull View view, int i11, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(i11, i12, i13, i14);
    }

    public static /* synthetic */ void updatePadding$default(View view, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = view.getPaddingLeft();
        }
        if ((i15 & 2) != 0) {
            i12 = view.getPaddingTop();
        }
        if ((i15 & 4) != 0) {
            i13 = view.getPaddingRight();
        }
        if ((i15 & 8) != 0) {
            i14 = view.getPaddingBottom();
        }
        updatePadding(view, i11, i12, i13, i14);
    }
}
