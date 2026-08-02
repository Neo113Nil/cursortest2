package ru.ozon.app.android.select.feature.entry.splash.view;

import Sc.r;
import Wc.b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;
import xe.InterfaceC10733l;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007H\u0086@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/select/feature/entry/splash/view/AnimUtils;", "", "<init>", "()V", "", "animStartDelay", "animDuration", "Lkotlin/Function1;", "Landroid/animation/Animator;", "", "onAnimStart", "Landroid/animation/ValueAnimator;", "updateListener", "startAlphaAnimation", "(JJLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/d;)Ljava/lang/Object;", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AnimUtils {

    @NotNull
    public static final AnimUtils INSTANCE = new AnimUtils();

    private AnimUtils() {
    }

    public static /* synthetic */ Object startAlphaAnimation$default(AnimUtils animUtils, long j11, long j12, Function1 function1, Function1 function12, d dVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function1 = AnimUtils$startAlphaAnimation$2.INSTANCE;
        }
        return animUtils.startAlphaAnimation(j11, j12, function1, function12, dVar);
    }

    public final Object startAlphaAnimation(long j11, long j12, @NotNull final Function1<? super Animator, Unit> function1, @NotNull final Function1<? super ValueAnimator, Unit> function12, @NotNull d<? super Animator> frame) {
        final C10737n c10737n = new C10737n(1, b.b(frame));
        c10737n.o();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setStartDelay(j11);
        ofFloat.setDuration(j12);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.app.android.select.feature.entry.splash.view.AnimUtils$startAlphaAnimation$3$1$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                function12.invoke(animation);
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.select.feature.entry.splash.view.AnimUtils$startAlphaAnimation$3$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                c10737n.A(null);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                InterfaceC10733l<Animator> interfaceC10733l = c10737n;
                r.Companion companion = r.INSTANCE;
                interfaceC10733l.resumeWith(animation);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                function1.invoke(animation);
            }
        });
        ofFloat.start();
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }
}
