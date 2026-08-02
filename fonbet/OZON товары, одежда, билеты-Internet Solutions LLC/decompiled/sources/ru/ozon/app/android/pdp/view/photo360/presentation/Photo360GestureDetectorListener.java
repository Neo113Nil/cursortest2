package ru.ozon.app.android.pdp.view.photo360.presentation;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.dynamicanimation.animation.b;
import androidx.dynamicanimation.animation.c;
import androidx.dynamicanimation.animation.e;
import com.github.chrisbanes.photoview.PhotoView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.view.photo360.presentation.Photo360GestureDetectorListener;
import ru.ozon.fintech.ui.input.CounterView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0010\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0014\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R0\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360GestureDetectorListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "Lcom/github/chrisbanes/photoview/PhotoView;", "photoView", "<init>", "(Lcom/github/chrisbanes/photoview/PhotoView;)V", "Landroid/view/MotionEvent;", "e", "", "onDown", "(Landroid/view/MotionEvent;)Z", "eventOne", "eventTwo", "", "distanceX", "distanceY", "onScroll", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "velocityX", "velocityY", "onFling", "onDoubleTap", "Lcom/github/chrisbanes/photoview/PhotoView;", "Lkotlin/Function1;", "", "onScrollChanged", "Lkotlin/jvm/functions/Function1;", "getOnScrollChanged", "()Lkotlin/jvm/functions/Function1;", "setOnScrollChanged", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "onUserFirstTouch", "Lkotlin/jvm/functions/Function0;", "getOnUserFirstTouch", "()Lkotlin/jvm/functions/Function0;", "setOnUserFirstTouch", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/dynamicanimation/animation/c;", "anim", "Landroidx/dynamicanimation/animation/c;", "", "dp500", "I", "scroll", "F", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Photo360GestureDetectorListener extends GestureDetector.SimpleOnGestureListener {

    @NotNull
    private final c anim;
    private final int dp500;
    private Function1<? super Float, Unit> onScrollChanged;
    private Function0<Unit> onUserFirstTouch;

    @NotNull
    private final PhotoView photoView;
    private float scroll;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360GestureDetectorListener$Companion;", "", "<init>", "()V", "FRICTION", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public Photo360GestureDetectorListener(@NotNull PhotoView photoView) {
        Intrinsics.checkNotNullParameter(photoView, "photoView");
        this.photoView = photoView;
        c cVar = new c(new e());
        cVar.n(3.0f);
        this.anim = cVar;
        this.dp500 = ResourceExtKt.toPx(CounterView.COUNTER_MAX_DEFAULT);
        cVar.c(new b.r() { // from class: NC.d
            @Override // androidx.dynamicanimation.animation.b.r
            public final void a(androidx.dynamicanimation.animation.b bVar, float f7, float f11) {
                Photo360GestureDetectorListener._init_$lambda$1(Photo360GestureDetectorListener.this, bVar, f7, f11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(Photo360GestureDetectorListener photo360GestureDetectorListener, b bVar, float f7, float f11) {
        photo360GestureDetectorListener.scroll = f7;
        Function1<? super Float, Unit> function1 = photo360GestureDetectorListener.onScrollChanged;
        if (function1 != null) {
            function1.invoke(Float.valueOf(f7));
        }
        if (Math.abs(f11) < photo360GestureDetectorListener.dp500) {
            photo360GestureDetectorListener.anim.d();
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(@NotNull MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        try {
            float g10 = this.photoView.g();
            float x11 = e11.getX();
            float y11 = e11.getY();
            float e12 = this.photoView.e();
            float d11 = this.photoView.d();
            float f7 = this.photoView.f();
            if (g10 < e12) {
                this.photoView.n(e12, x11, y11);
            } else if (g10 < e12 || g10 >= d11) {
                this.photoView.n(f7, x11, y11);
            } else {
                this.photoView.n(d11, x11, y11);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return super.onDoubleTap(e11);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(@NotNull MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        this.anim.d();
        Function0<Unit> function0 = this.onUserFirstTouch;
        if (function0 == null) {
            return true;
        }
        function0.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent eventOne, @NotNull MotionEvent eventTwo, float velocityX, float velocityY) {
        Intrinsics.checkNotNullParameter(eventTwo, "eventTwo");
        this.anim.k(this.scroll);
        this.anim.o(-velocityX);
        this.anim.l();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent eventOne, @NotNull MotionEvent eventTwo, float distanceX, float distanceY) {
        Intrinsics.checkNotNullParameter(eventTwo, "eventTwo");
        Function1<? super Float, Unit> function1 = this.onScrollChanged;
        if (function1 == null) {
            return false;
        }
        float f7 = this.scroll + distanceX;
        this.scroll = f7;
        function1.invoke(Float.valueOf(f7));
        return true;
    }

    public final void setOnScrollChanged(Function1<? super Float, Unit> function1) {
        this.onScrollChanged = function1;
    }

    public final void setOnUserFirstTouch(Function0<Unit> function0) {
        this.onUserFirstTouch = function0;
    }
}
