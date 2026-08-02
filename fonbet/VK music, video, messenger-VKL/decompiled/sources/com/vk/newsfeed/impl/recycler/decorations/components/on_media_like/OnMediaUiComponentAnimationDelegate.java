package com.vk.newsfeed.impl.recycler.decorations.components.on_media_like;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.OnMediaUiComponentAnimationDelegate;
import kotlin.Pair;
import kotlin.random.Random;
import xsna.a980;
import xsna.asp;
import xsna.gg;
import xsna.gzs;
import xsna.iah0;
import xsna.l35;
import xsna.o6n;
import xsna.pn00;
import xsna.qq2;
import xsna.re0;
import xsna.s3q0;
import xsna.z880;
import xsna.zrp;

/* compiled from: OnMediaUiComponentAnimationDelegate.kt */
/* loaded from: classes4.dex */
public final class OnMediaUiComponentAnimationDelegate {
    public final gzs<s3q0> a;
    public final gzs<s3q0> b;
    public final gzs<Context> c;
    public final a d;
    public final d e;
    public final e f;
    public final f g;
    public final c h;
    public final Object i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OnMediaUiComponentAnimationDelegate.kt */
    public static final class AnimationType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AnimationType[] $VALUES;
        public static final AnimationType APPEAR;
        public static final AnimationType BOTTOM_OFFSET;
        public static final AnimationType DISAPPEAR;
        public static final AnimationType MOVEMENT;
        public static final AnimationType RETURN;

        static {
            AnimationType animationType = new AnimationType("APPEAR", 0);
            APPEAR = animationType;
            AnimationType animationType2 = new AnimationType("DISAPPEAR", 1);
            DISAPPEAR = animationType2;
            AnimationType animationType3 = new AnimationType("MOVEMENT", 2);
            MOVEMENT = animationType3;
            AnimationType animationType4 = new AnimationType("RETURN", 3);
            RETURN = animationType4;
            AnimationType animationType5 = new AnimationType("BOTTOM_OFFSET", 4);
            BOTTOM_OFFSET = animationType5;
            AnimationType[] animationTypeArr = {animationType, animationType2, animationType3, animationType4, animationType5};
            $VALUES = animationTypeArr;
            $ENTRIES = new asp(animationTypeArr);
        }

        public AnimationType() {
            throw null;
        }

        public static AnimationType valueOf(String str) {
            return (AnimationType) Enum.valueOf(AnimationType.class, str);
        }

        public static AnimationType[] values() {
            return (AnimationType[]) $VALUES.clone();
        }
    }

    /* compiled from: OnMediaUiComponentAnimationDelegate.kt */
    public final class a extends b {
        public float a;
        public boolean b;
        public final ValueAnimator c;

        /* compiled from: AnimExt.kt */
        /* renamed from: com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.OnMediaUiComponentAnimationDelegate$a$a, reason: collision with other inner class name */
        public static final class C1403a extends AnimatorListenerAdapter {
            public C1403a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                a.this.b = true;
            }
        }

        public a() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            ofFloat.setStartDelay(250L);
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
            ofFloat.addUpdateListener(new z880(0, this, OnMediaUiComponentAnimationDelegate.this));
            ofFloat.addListener(new C1403a());
            this.c = ofFloat;
        }

        @Override // com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.OnMediaUiComponentAnimationDelegate.b
        public final ValueAnimator a() {
            return this.c;
        }

        @Override // com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.OnMediaUiComponentAnimationDelegate.b
        public final void b(gzs<s3q0> gzsVar) {
            OnMediaUiComponentAnimationDelegate.this.e.b = false;
            super.b(gzsVar);
        }

        @Override // com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.OnMediaUiComponentAnimationDelegate.b
        public final void c() {
            super.c();
            this.b = false;
            this.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    /* compiled from: OnMediaUiComponentAnimationDelegate.kt */
    public abstract class b {

        /* compiled from: AnimExt.kt */
        public static final class a extends AnimatorListenerAdapter {
            public final /* synthetic */ gzs b;

            public a(gzs gzsVar) {
                this.b = gzsVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                this.b.invoke();
            }
        }

        public b() {
            throw null;
        }

        public abstract ValueAnimator a();

        public void b(gzs<s3q0> gzsVar) {
            a().addListener(new a(gzsVar));
            a().start();
        }

        public void c() {
            a().cancel();
        }
    }

    /* compiled from: OnMediaUiComponentAnimationDelegate.kt */
    public final class c extends b {
        public int a;
        public int b;
        public final ValueAnimator c;

        /* compiled from: AnimExt.kt */
        public static final class a extends AnimatorListenerAdapter {
            public final /* synthetic */ gzs b;

            public a(gzs gzsVar) {
                this.b = gzsVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                this.b.invoke();
            }
        }

        public c() {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(250L);
            ofInt.setInterpolator(new PathInterpolator(0.2f, 0.8f, 0.2f, 1.0f));
            ofInt.addUpdateListener(new o6n(1, this, OnMediaUiComponentAnimationDelegate.this));
            this.c = ofInt;
        }

        @Override // com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.OnMediaUiComponentAnimationDelegate.b
        public final ValueAnimator a() {
            return this.c;
        }

        @Override // com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.OnMediaUiComponentAnimationDelegate.b
        public final void b(gzs<s3q0> gzsVar) {
            a aVar = new a(gzsVar);
            ValueAnimator valueAnimator = this.c;
            valueAnimator.addListener(aVar);
            valueAnimator.start();
        }

        @Override // com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.OnMediaUiComponentAnimationDelegate.b
        public final void c() {
            super.c();
            this.a = 0;
            this.b = 0;
        }
    }

    /* compiled from: OnMediaUiComponentAnimationDelegate.kt */
    public final class d extends b {
        public float a = 1.0f;
        public boolean b;
        public final ValueAnimator c;

        /* compiled from: AnimExt.kt */
        public static final class a extends AnimatorListenerAdapter {
            public final /* synthetic */ OnMediaUiComponentAnimationDelegate c;

            public a(OnMediaUiComponentAnimationDelegate onMediaUiComponentAnimationDelegate) {
                this.c = onMediaUiComponentAnimationDelegate;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                d.this.b = true;
                this.c.d.b = false;
            }
        }

        public d(OnMediaUiComponentAnimationDelegate onMediaUiComponentAnimationDelegate) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
            ofFloat.addUpdateListener(new a980(0, this, onMediaUiComponentAnimationDelegate));
            ofFloat.addListener(new a(onMediaUiComponentAnimationDelegate));
            this.c = ofFloat;
        }

        @Override // com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.OnMediaUiComponentAnimationDelegate.b
        public final ValueAnimator a() {
            return this.c;
        }

        @Override // com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.OnMediaUiComponentAnimationDelegate.b
        public final void c() {
            super.c();
            this.b = false;
            this.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    /* compiled from: OnMediaUiComponentAnimationDelegate.kt */
    public final class e extends b {
        public float a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public final float g = iah0.b(6.0f);
        public final float h = iah0.b(3.0f);
        public final ValueAnimator i;

        /* compiled from: AnimExt.kt */
        public static final class a extends AnimatorListenerAdapter {
            public final /* synthetic */ OnMediaUiComponentAnimationDelegate b;
            public final /* synthetic */ e c;

            public a(e eVar, OnMediaUiComponentAnimationDelegate onMediaUiComponentAnimationDelegate) {
                this.b = onMediaUiComponentAnimationDelegate;
                this.c = eVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                OnMediaUiComponentAnimationDelegate onMediaUiComponentAnimationDelegate = this.b;
                Context invoke = onMediaUiComponentAnimationDelegate.c.invoke();
                if (invoke == null || !qq2.d(invoke)) {
                    e eVar = this.c;
                    eVar.a = eVar.e;
                    eVar.b = eVar.f;
                    onMediaUiComponentAnimationDelegate.a.invoke();
                    eVar.b(new re0(29));
                }
            }
        }

        /* compiled from: AnimExt.kt */
        public static final class b extends AnimatorListenerAdapter {
            public final /* synthetic */ gzs b;

            public b(gzs gzsVar) {
                this.b = gzsVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                this.b.invoke();
            }
        }

        public e(final OnMediaUiComponentAnimationDelegate onMediaUiComponentAnimationDelegate) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            ofFloat.setDuration(4000L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.b980
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    OnMediaUiComponentAnimationDelegate.e eVar = OnMediaUiComponentAnimationDelegate.e.this;
                    float f = eVar.c;
                    eVar.a = u11.b(eVar.e, f, floatValue, f);
                    float f2 = eVar.d;
                    eVar.b = u11.b(eVar.f, f2, floatValue, f2);
                    onMediaUiComponentAnimationDelegate.a.invoke();
                }
            });
            ofFloat.addListener(new a(this, onMediaUiComponentAnimationDelegate));
            this.i = ofFloat;
        }

        @Override // com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.OnMediaUiComponentAnimationDelegate.b
        public final ValueAnimator a() {
            return this.i;
        }

        @Override // com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.OnMediaUiComponentAnimationDelegate.b
        public final void b(gzs<s3q0> gzsVar) {
            Random.b.getClass();
            gg ggVar = Random.c;
            float g = (float) (ggVar.g() * 6.283185307179586d);
            float i = ggVar.i();
            float f = this.h;
            float f2 = f * f;
            float f3 = this.g;
            float sqrt = (float) Math.sqrt((((f3 * f3) - f2) * i) + f2);
            this.c = this.a;
            this.d = this.b;
            double d = g;
            this.e = ((float) Math.cos(d)) * sqrt;
            this.f = sqrt * ((float) Math.sin(d));
            b bVar = new b(gzsVar);
            ValueAnimator valueAnimator = this.i;
            valueAnimator.addListener(bVar);
            valueAnimator.setDuration(ggVar.o(3500L, 4500L));
            valueAnimator.start();
        }

        @Override // com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.OnMediaUiComponentAnimationDelegate.b
        public final void c() {
            super.c();
            this.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    /* compiled from: OnMediaUiComponentAnimationDelegate.kt */
    public final class f extends b {
        public float a;
        public float b;
        public float c;
        public float d;
        public final ValueAnimator e;

        /* compiled from: AnimExt.kt */
        public static final class a extends AnimatorListenerAdapter {
            public final /* synthetic */ gzs b;

            public a(gzs gzsVar) {
                this.b = gzsVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                this.b.invoke();
            }
        }

        public f(final OnMediaUiComponentAnimationDelegate onMediaUiComponentAnimationDelegate) {
            final ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            ofFloat.setDuration(100L);
            ofFloat.setInterpolator(new AccelerateInterpolator());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.c980
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) ofFloat.getAnimatedValue()).floatValue();
                    OnMediaUiComponentAnimationDelegate.f fVar = this;
                    fVar.a = fVar.c * floatValue;
                    fVar.b = floatValue * fVar.d;
                    onMediaUiComponentAnimationDelegate.a.invoke();
                }
            });
            this.e = ofFloat;
        }

        @Override // com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.OnMediaUiComponentAnimationDelegate.b
        public final ValueAnimator a() {
            return this.e;
        }

        @Override // com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.OnMediaUiComponentAnimationDelegate.b
        public final void b(gzs<s3q0> gzsVar) {
            this.d = this.b;
            this.c = this.a;
            a aVar = new a(gzsVar);
            ValueAnimator valueAnimator = this.e;
            valueAnimator.addListener(aVar);
            valueAnimator.start();
        }

        @Override // com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.OnMediaUiComponentAnimationDelegate.b
        public final void c() {
            super.c();
            this.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnMediaUiComponentAnimationDelegate(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, gzs<? extends Context> gzsVar3) {
        this.a = gzsVar;
        this.b = gzsVar2;
        this.c = gzsVar3;
        a aVar = new a();
        this.d = aVar;
        d dVar = new d(this);
        this.e = dVar;
        e eVar = new e(this);
        this.f = eVar;
        f fVar = new f(this);
        this.g = fVar;
        c cVar = new c();
        this.h = cVar;
        this.i = pn00.k(new Pair(AnimationType.APPEAR, aVar), new Pair(AnimationType.DISAPPEAR, dVar), new Pair(AnimationType.MOVEMENT, eVar), new Pair(AnimationType.RETURN, fVar), new Pair(AnimationType.BOTTOM_OFFSET, cVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public static void c(OnMediaUiComponentAnimationDelegate onMediaUiComponentAnimationDelegate, AnimationType animationType, gzs gzsVar, int i) {
        boolean z = (i & 2) == 0;
        if ((i & 4) != 0) {
            gzsVar = new l35(21);
        }
        ?? r1 = onMediaUiComponentAnimationDelegate.i;
        if (z) {
            b bVar = (b) r1.get(animationType);
            if (bVar != null) {
                bVar.a().end();
                return;
            }
            return;
        }
        b bVar2 = (b) r1.get(animationType);
        if (bVar2 != 0) {
            bVar2.b(gzsVar);
        }
    }

    public final float a() {
        d dVar = this.e;
        if (dVar.a().isRunning() || dVar.b) {
            return dVar.a;
        }
        a aVar = this.d;
        return (aVar.a().isRunning() || aVar.b) ? aVar.a : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void b(int i, boolean z) {
        c cVar = this.h;
        ValueAnimator valueAnimator = cVar.c;
        if (cVar.b == i) {
            return;
        }
        if (!z) {
            valueAnimator.cancel();
            cVar.a = i;
            cVar.b = i;
            OnMediaUiComponentAnimationDelegate.this.a.invoke();
            return;
        }
        if (cVar.a == i) {
            return;
        }
        valueAnimator.cancel();
        valueAnimator.setIntValues(cVar.a, i);
        cVar.b = i;
        cVar.b(new re0(29));
    }
}
