package ru.ozon.android.messenger.blocks.snackbar.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import io.sentry.android.core.A;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.snackbar.SnackbarVO;
import ru.ozon.android.messenger.blocks.snackbar.c;
import ru.ozon.android.messenger.framework.core.d;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/android/messenger/blocks/snackbar/view/SnackbarContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SnackbarContainer extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f86441e = 0;

    /* renamed from: a, reason: collision with root package name */
    private A f86442a;

    /* renamed from: b, reason: collision with root package name */
    private final float f86443b;

    /* renamed from: c, reason: collision with root package name */
    private float f86444c;

    /* renamed from: d, reason: collision with root package name */
    private Float f86445d;

    public interface a {
    }

    static final class b extends AbstractC7737t implements Function0<Unit> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            a aVar = SnackbarContainer.this.f86442a;
            if (aVar == null) {
                return null;
            }
            A a11 = (A) aVar;
            d dVar = (d) a11.f66827a;
            ru.ozon.android.messenger.framework.navigation.controller.a c11 = dVar.c();
            SnackbarVO snackbarVO = (SnackbarVO) a11.f66828b;
            c11.q(ru.ozon.android.messenger.framework.navigation.action.b.c(snackbarVO.getHideAction()));
            ru.ozon.android.messenger.framework.navigation.controller.a c12 = dVar.c();
            String a12 = snackbarVO.getBlockId().a();
            ((c) a11.f66829c).getClass();
            c12.t(a12);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarContainer(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f86443b = context.getResources().getDisplayMetrics().heightPixels;
    }

    @Override // android.view.ViewGroup
    public final void addView(@NotNull View child, int i11, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(child, "child");
        if (getChildCount() > 1) {
            throw new IllegalStateException("Container should not contain more than one view");
        }
        if (child.getClass() == SnackbarView.class) {
            super.addView(child, i11, layoutParams);
            return;
        }
        throw new IllegalStateException(("Container able to store only " + N.b(SnackbarView.class).B()).toString());
    }

    public final void b(@NotNull A onDismissCallback) {
        Intrinsics.checkNotNullParameter(onDismissCallback, "onDismissCallback");
        this.f86442a = onDismissCallback;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            return actionMasked == 2 && this.f86444c != event.getRawY();
        }
        Float f7 = this.f86445d;
        if (f7 == null) {
            f7 = Float.valueOf(getY());
        }
        this.f86445d = f7;
        this.f86444c = event.getRawY();
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 2) {
            Float f7 = this.f86445d;
            if (f7 == null) {
                float rawY = motionEvent.getRawY();
                ViewPropertyAnimator animate = animate();
                animate.y(rawY);
                animate.setDuration(0L);
                animate.start();
                return true;
            }
            float floatValue = f7.floatValue();
            float max = Math.max(floatValue, (motionEvent.getRawY() - this.f86444c) + floatValue);
            ViewPropertyAnimator animate2 = animate();
            animate2.y(max);
            animate2.setDuration(0L);
            animate2.start();
            return true;
        }
        if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
            float rawY2 = motionEvent.getRawY();
            float height = getHeight() / 2;
            float f11 = this.f86443b;
            Pair pair = rawY2 >= f11 - height ? new Pair(Float.valueOf(f11), new b()) : new Pair(this.f86445d, null);
            Float f12 = (Float) pair.a();
            Function0 function0 = (Function0) pair.b();
            if (f12 != null) {
                ViewPropertyAnimator animate3 = animate();
                animate3.y(f12.floatValue());
                animate3.setDuration(100L);
                if (function0 != null) {
                    animate3.withEndAction(new Xr.a(function0, 1));
                }
                animate3.start();
                return true;
            }
        }
        return true;
    }
}
