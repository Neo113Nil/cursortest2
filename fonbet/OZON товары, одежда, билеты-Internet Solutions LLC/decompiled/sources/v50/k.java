package v50;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.View;
import c2.RunnableC5727a;
import c3.C5739a;
import c3.C5741c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final C5741c f102373j = new C5741c();

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private static final C5739a f102374k = new C5739a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final u f102375a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f102376b;

    /* renamed from: c, reason: collision with root package name */
    private fa.b f102377c;

    /* renamed from: d, reason: collision with root package name */
    private Q90.l f102378d;

    /* renamed from: e, reason: collision with root package name */
    private ObjectAnimator f102379e;

    /* renamed from: f, reason: collision with root package name */
    private ObjectAnimator f102380f;

    /* renamed from: g, reason: collision with root package name */
    private ObjectAnimator f102381g;

    /* renamed from: h, reason: collision with root package name */
    private ObjectAnimator f102382h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Handler f102383i;

    public final class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final Function0<Unit> f102384a;

        public a(Function0<Unit> function0) {
            this.f102384a = function0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            k kVar = k.this;
            kVar.f102379e = null;
            kVar.f102381g = null;
            kVar.f102380f = null;
            kVar.f102382h = null;
            Function0<Unit> function0 = this.f102384a;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            k kVar = k.this;
            kVar.f102379e = null;
            kVar.f102380f = null;
            kVar.f102375a.setVisibility(0);
        }
    }

    public static final class c implements Animator.AnimatorListener {
        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NotNull Animator animator) {
            k.this.f102375a.setAlpha(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@NotNull Animator animator) {
        }
    }

    public k(@NotNull u content, boolean z11) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f102375a = content;
        this.f102376b = z11;
        this.f102383i = new Handler(Looper.getMainLooper());
    }

    public static final void b(k kVar) {
        boolean z11 = kVar.f102376b;
        u uVar = kVar.f102375a;
        float height = z11 ? -uVar.getHeight() : uVar.getHeight();
        uVar.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(uVar, (Property<u, Float>) View.ALPHA, uVar.getAlpha(), 0.0f);
        kVar.f102382h = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(200L);
        }
        ObjectAnimator objectAnimator = kVar.f102382h;
        C5739a c5739a = f102374k;
        if (objectAnimator != null) {
            objectAnimator.setInterpolator(c5739a);
        }
        ObjectAnimator objectAnimator2 = kVar.f102382h;
        if (objectAnimator2 != null) {
            objectAnimator2.start();
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(uVar, (Property<u, Float>) View.TRANSLATION_Y, 0.0f, height);
        ofFloat2.addListener(kVar.new a(kVar.f102378d));
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(c5739a);
        kVar.f102380f = ofFloat2;
        ofFloat2.start();
    }

    private final void h() {
        ObjectAnimator objectAnimator = this.f102379e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f102381g;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        this.f102379e = null;
        this.f102381g = null;
        ObjectAnimator objectAnimator3 = this.f102380f;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        ObjectAnimator objectAnimator4 = this.f102382h;
        if (objectAnimator4 != null) {
            objectAnimator4.cancel();
        }
        this.f102380f = null;
        this.f102382h = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        boolean z11 = this.f102376b;
        u uVar = this.f102375a;
        float height = z11 ? -uVar.getHeight() : uVar.getHeight();
        uVar.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(uVar, (Property<u, Float>) View.ALPHA, 0.0f, 1.0f);
        this.f102381g = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(250L);
        }
        ObjectAnimator objectAnimator = this.f102381g;
        C5741c c5741c = f102373j;
        if (objectAnimator != null) {
            objectAnimator.setInterpolator(c5741c);
        }
        ObjectAnimator objectAnimator2 = this.f102381g;
        if (objectAnimator2 != null) {
            objectAnimator2.addListener(new c());
        }
        ObjectAnimator objectAnimator3 = this.f102381g;
        if (objectAnimator3 != null) {
            objectAnimator3.start();
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(uVar, (Property<u, Float>) View.TRANSLATION_Y, height, 0.0f);
        ofFloat2.addListener(new b());
        ofFloat2.addListener(new a(this.f102377c));
        ofFloat2.setDuration(250L);
        ofFloat2.setInterpolator(c5741c);
        this.f102379e = ofFloat2;
        ofFloat2.start();
    }

    public final void i() {
        ObjectAnimator objectAnimator = this.f102379e;
        u targetView = this.f102375a;
        if (objectAnimator == null && !(targetView.getVisibility() == 0 && this.f102380f == null)) {
            h();
            targetView.setVisibility(4);
            targetView.setTranslationY(0.0f);
            Q90.l lVar = this.f102378d;
            if (lVar != null) {
                lVar.invoke();
                return;
            }
            return;
        }
        h();
        l action = new l(this);
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        Intrinsics.checkNotNullParameter(action, "action");
        int measuredWidth = targetView != null ? targetView.getMeasuredWidth() : 0;
        int measuredHeight = targetView != null ? targetView.getMeasuredHeight() : 0;
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            new E(targetView, action);
        } else {
            action.a();
            Unit unit = Unit.f71690a;
        }
    }

    public final void j(Q90.l lVar) {
        this.f102378d = lVar;
    }

    public final void k(fa.b bVar) {
        this.f102377c = bVar;
    }

    public final void l() {
        if (this.f102379e != null) {
            return;
        }
        u uVar = this.f102375a;
        if (uVar.getVisibility() == 0 && this.f102380f == null) {
            return;
        }
        h();
        if (uVar.isLayoutRequested() && uVar.getMeasuredHeight() > 0) {
            m();
            return;
        }
        m mVar = new m(0, this, k.class, "showAnimatedImpl", "showAnimatedImpl()V", 0);
        uVar.setVisibility(4);
        this.f102383i.postDelayed(new RunnableC5727a(mVar, 1), 50L);
    }
}
