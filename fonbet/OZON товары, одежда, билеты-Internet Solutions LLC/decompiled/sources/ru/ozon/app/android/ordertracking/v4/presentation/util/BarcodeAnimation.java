package ru.ozon.app.android.ordertracking.v4.presentation.util;

import Ij.C3260a;
import Sc.r;
import Sc.s;
import Wc.a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.input.CounterView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ve.EnumC10311b;
import xe.B0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0012\u001a\u00020\r*\u00020\u0011H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/util/BarcodeAnimation;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "startWidth", "endWidth", "Lkotlin/time/b;", "duration", "Landroid/animation/TimeInterpolator;", "interpolator", "", "animateWidth-gwCluXo", "(Landroid/view/View;IIJLandroid/animation/TimeInterpolator;Lkotlin/coroutines/d;)Ljava/lang/Object;", "animateWidth", "Landroid/animation/ValueAnimator;", "awaitEnd", "(Landroid/animation/ValueAnimator;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lxe/M;", "additionalWidth", "Lxe/B0;", "startWidthBounceAnimation", "(Lxe/M;Landroid/view/View;I)Lxe/B0;", "ADDITIONAL_WIDTH", "I", "ANIMATION_DURATION", "J", "PAUSE_BETWEEN_ANIMATIONS", "Landroid/view/animation/OvershootInterpolator;", "Landroid/view/animation/OvershootInterpolator;", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BarcodeAnimation {
    private static final long ANIMATION_DURATION;
    private static final long PAUSE_BETWEEN_ANIMATIONS;

    @NotNull
    private static final OvershootInterpolator interpolator;

    @NotNull
    public static final BarcodeAnimation INSTANCE = new BarcodeAnimation();
    private static final int ADDITIONAL_WIDTH = ResourceExtKt.toDp(150);

    static {
        b.Companion companion = b.INSTANCE;
        EnumC10311b enumC10311b = EnumC10311b.MILLISECONDS;
        ANIMATION_DURATION = c.g(CounterView.COUNTER_MAX_DEFAULT, enumC10311b);
        PAUSE_BETWEEN_ANIMATIONS = c.g(90, enumC10311b);
        interpolator = new OvershootInterpolator();
    }

    private BarcodeAnimation() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: animateWidth-gwCluXo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m872animateWidthgwCluXo(View view, int i11, int i12, long j11, TimeInterpolator timeInterpolator, d<? super Unit> dVar) {
        BarcodeAnimation$animateWidth$1 barcodeAnimation$animateWidth$1;
        int i13;
        if (dVar instanceof BarcodeAnimation$animateWidth$1) {
            barcodeAnimation$animateWidth$1 = (BarcodeAnimation$animateWidth$1) dVar;
            int i14 = barcodeAnimation$animateWidth$1.label;
            if ((i14 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                barcodeAnimation$animateWidth$1.label = i14 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = barcodeAnimation$animateWidth$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i13 = barcodeAnimation$animateWidth$1.label;
                if (i13 != 0) {
                    s.b(obj);
                    ValueAnimator ofInt = ValueAnimator.ofInt(i11, i12);
                    ofInt.setDuration(b.h(j11));
                    ofInt.setInterpolator(timeInterpolator);
                    ofInt.addUpdateListener(new C3260a(view, 1));
                    ofInt.start();
                    BarcodeAnimation barcodeAnimation = INSTANCE;
                    barcodeAnimation$animateWidth$1.L$0 = ofInt;
                    barcodeAnimation$animateWidth$1.label = 1;
                    if (barcodeAnimation.awaitEnd(ofInt, barcodeAnimation$animateWidth$1) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
        }
        barcodeAnimation$animateWidth$1 = new BarcodeAnimation$animateWidth$1(this, dVar);
        Object obj2 = barcodeAnimation$animateWidth$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i13 = barcodeAnimation$animateWidth$1.label;
        if (i13 != 0) {
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateWidth_gwCluXo$lambda$2$lambda$1(View view, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.width = ((Integer) animatedValue).intValue();
        view.setLayoutParams(layoutParams);
        view.requestLayout();
    }

    private final Object awaitEnd(ValueAnimator valueAnimator, d<? super Unit> frame) {
        final h hVar = new h(Wc.b.b(frame));
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.ordertracking.v4.presentation.util.BarcodeAnimation$awaitEnd$2$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                d<Unit> dVar = hVar;
                r.Companion companion = r.INSTANCE;
                dVar.resumeWith(Unit.f71690a);
            }
        });
        Object a11 = hVar.a();
        a aVar = a.COROUTINE_SUSPENDED;
        if (a11 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return a11 == aVar ? a11 : Unit.f71690a;
    }

    public static /* synthetic */ B0 startWidthBounceAnimation$default(BarcodeAnimation barcodeAnimation, M m11, View view, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = ADDITIONAL_WIDTH;
        }
        return barcodeAnimation.startWidthBounceAnimation(m11, view, i11);
    }

    @NotNull
    public final B0 startWidthBounceAnimation(@NotNull M m11, @NotNull View view, int i11) {
        Intrinsics.checkNotNullParameter(m11, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        return C10727i.c(m11, null, null, new BarcodeAnimation$startWidthBounceAnimation$1(view, i11, null), 3);
    }
}
