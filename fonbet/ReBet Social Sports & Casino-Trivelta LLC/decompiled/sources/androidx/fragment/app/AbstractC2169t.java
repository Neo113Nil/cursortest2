package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* renamed from: androidx.fragment.app.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2169t {
    public static int a(Fragment fragment, boolean z10, boolean z11) {
        return z11 ? z10 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z10 ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    public static a b(Context context, Fragment fragment, boolean z10, boolean z11) {
        int nextTransition = fragment.getNextTransition();
        int a10 = a(fragment, z10, z11);
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getTag(R0.b.f9917c) != null) {
            fragment.mContainer.setTag(R0.b.f9917c, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z10, a10);
        if (onCreateAnimation != null) {
            return new a(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z10, a10);
        if (onCreateAnimator != null) {
            return new a(onCreateAnimator);
        }
        if (a10 == 0 && nextTransition != 0) {
            a10 = d(context, nextTransition, z10);
        }
        if (a10 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(a10));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, a10);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, a10);
                if (loadAnimator != null) {
                    return new a(loadAnimator);
                }
            } catch (RuntimeException e11) {
                if (equals) {
                    throw e11;
                }
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a10);
                if (loadAnimation2 != null) {
                    return new a(loadAnimation2);
                }
            }
        }
        return null;
    }

    public static int c(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int d(Context context, int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? R0.a.f9913e : R0.a.f9914f;
        }
        if (i10 == 8194) {
            return z10 ? R0.a.f9909a : R0.a.f9910b;
        }
        if (i10 == 8197) {
            return z10 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i10 == 4099) {
            return z10 ? R0.a.f9911c : R0.a.f9912d;
        }
        if (i10 != 4100) {
            return -1;
        }
        return z10 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    /* renamed from: androidx.fragment.app.t$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f20226a;

        /* renamed from: b, reason: collision with root package name */
        public final AnimatorSet f20227b;

        public a(Animation animation) {
            this.f20226a = animation;
            this.f20227b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public a(Animator animator) {
            this.f20226a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f20227b = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.t$b */
    public static class b extends AnimationSet implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final ViewGroup f20228a;

        /* renamed from: b, reason: collision with root package name */
        public final View f20229b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f20230c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f20231d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f20232e;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f20232e = true;
            this.f20228a = viewGroup;
            this.f20229b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f20232e = true;
            if (this.f20230c) {
                return !this.f20231d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f20230c = true;
                androidx.core.view.M.a(this.f20228a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f20230c || !this.f20232e) {
                this.f20228a.endViewTransition(this.f20229b);
                this.f20231d = true;
            } else {
                this.f20232e = false;
                this.f20228a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f20232e = true;
            if (this.f20230c) {
                return !this.f20231d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f20230c = true;
                androidx.core.view.M.a(this.f20228a, this);
            }
            return true;
        }
    }
}
