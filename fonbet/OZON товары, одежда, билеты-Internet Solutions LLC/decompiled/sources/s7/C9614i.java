package s7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: s7.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C9614i {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<b> f98318a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    ValueAnimator f98319b = null;

    /* renamed from: c, reason: collision with root package name */
    private final Animator.AnimatorListener f98320c = new a();

    /* renamed from: s7.i$a */
    final class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C9614i c9614i = C9614i.this;
            if (c9614i.f98319b == animator) {
                c9614i.f98319b = null;
            }
        }
    }

    /* renamed from: s7.i$b */
    static class b {
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b();
        valueAnimator.addListener(this.f98320c);
        this.f98318a.add(bVar);
    }
}
