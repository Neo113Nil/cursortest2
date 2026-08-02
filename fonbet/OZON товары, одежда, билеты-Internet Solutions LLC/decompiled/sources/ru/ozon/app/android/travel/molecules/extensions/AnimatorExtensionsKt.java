package ru.ozon.app.android.travel.molecules.extensions;

import Sc.r;
import Wc.a;
import Wc.b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;
import xe.InterfaceC10733l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/animation/Animator;", "", "awaitCompletion", "(Landroid/animation/Animator;Lkotlin/coroutines/d;)Ljava/lang/Object;", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnimatorExtensionsKt {
    public static final Object awaitCompletion(@NotNull Animator animator, @NotNull d<? super Unit> frame) {
        final C10737n c10737n = new C10737n(1, b.b(frame));
        c10737n.o();
        c10737n.q(new AnimatorExtensionsKt$awaitCompletion$2$1(animator));
        animator.addListener(new AnimatorListenerAdapter() { // from class: ru.ozon.app.android.travel.molecules.extensions.AnimatorExtensionsKt$awaitCompletion$2$2
            private boolean isSuccess = true;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.isSuccess = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                animation.removeListener(this);
                if (c10737n.isActive()) {
                    if (!this.isSuccess) {
                        c10737n.A(null);
                        return;
                    }
                    InterfaceC10733l<Unit> interfaceC10733l = c10737n;
                    r.Companion companion = r.INSTANCE;
                    interfaceC10733l.resumeWith(Unit.f71690a);
                }
            }
        });
        Object n11 = c10737n.n();
        a aVar = a.COROUTINE_SUSPENDED;
        if (n11 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11 == aVar ? n11 : Unit.f71690a;
    }
}
