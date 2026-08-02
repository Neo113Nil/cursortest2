package m7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.annotation.NonNull;
import m7.InterfaceC8100b;

/* renamed from: m7.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8099a {

    /* renamed from: m7.a$a, reason: collision with other inner class name */
    final class C1260a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC8100b f74608a;

        C1260a(InterfaceC8100b interfaceC8100b) {
            this.f74608a = interfaceC8100b;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f74608a.b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.f74608a.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static AnimatorSet a(@NonNull InterfaceC8100b interfaceC8100b, float f7, float f11, float f12) {
        InterfaceC8100b.C1261b c1261b = InterfaceC8100b.C1261b.f74611a;
        InterfaceC8100b.a aVar = InterfaceC8100b.a.f74609b;
        InterfaceC8100b.d dVar = new InterfaceC8100b.d();
        dVar.f74613a = f7;
        dVar.f74614b = f11;
        dVar.f74615c = f12;
        ObjectAnimator ofObject = ObjectAnimator.ofObject(interfaceC8100b, c1261b, aVar, dVar);
        InterfaceC8100b.d c11 = interfaceC8100b.c();
        if (c11 == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC8100b, (int) f7, (int) f11, c11.f74615c, f12);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }

    @NonNull
    public static Animator.AnimatorListener b(@NonNull InterfaceC8100b interfaceC8100b) {
        return new C1260a(interfaceC8100b);
    }
}
