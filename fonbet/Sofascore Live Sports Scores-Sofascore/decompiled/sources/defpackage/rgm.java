package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class rgm implements View.OnTouchListener {
    public final opl a;
    public final d c;
    public final g d;
    public final b e;
    public tim f;
    public float i;
    public final f b = new f();
    public final wam g = new wam();
    public h8m h = new idm();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class a {
        public Property a;
        public float b;
        public float c;

        public abstract void a(RecyclerView recyclerView);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c {
        public c(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class e {
        public float a;
        public float b;
        public boolean c;

        public abstract boolean a(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class f {
        public int a;
        public float b;
        public boolean c;
    }

    static {
        new c(null);
    }

    public rgm(@Nullable opl oplVar, float f2, float f3, float f4) {
        this.a = oplVar;
        this.e = new b(f2);
        this.d = new g(f3, f4);
        d dVar = new d();
        this.c = dVar;
        this.f = dVar;
        RecyclerView recyclerView = oplVar != null ? ((kdm) oplVar).a : null;
        if (recyclerView != null) {
            recyclerView.setOnTouchListener(this);
        }
        RecyclerView recyclerView2 = oplVar != null ? ((kdm) oplVar).a : null;
        if (recyclerView2 != null) {
            recyclerView2.setOverScrollMode(2);
        }
    }

    public abstract a a();

    public abstract void b(RecyclerView recyclerView, float f2);

    public abstract void c(RecyclerView recyclerView, float f2, MotionEvent motionEvent);

    public abstract e d();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.getClass();
        motionEvent.getClass();
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                return this.f.a(motionEvent);
            }
            if (action != 3) {
                return false;
            }
        }
        return this.f.a();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b implements tim, Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
        public final float a;
        public final DecelerateInterpolator b = new DecelerateInterpolator();
        public final float c;
        public final a d;

        public b(float f) {
            this.a = f;
            this.c = f * 2.0f;
            this.d = rgm.this.a();
        }

        @Override // defpackage.tim
        public final boolean a(MotionEvent motionEvent) {
            return true;
        }

        public final ObjectAnimator b(float f) {
            rgm rgmVar = rgm.this;
            opl oplVar = rgmVar.a;
            RecyclerView recyclerView = oplVar != null ? ((kdm) oplVar).a : null;
            float abs = Math.abs(f);
            a aVar = this.d;
            float f2 = (abs / aVar.c) * 800.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(recyclerView, (Property<RecyclerView, Float>) aVar.a, rgmVar.b.b);
            int i = (int) f2;
            if (i < 200) {
                i = 200;
            }
            ofFloat.setDuration(i);
            ofFloat.setInterpolator(this.b);
            ofFloat.addUpdateListener(this);
            return ofFloat;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void c(tim timVar) {
            ObjectAnimator b;
            timVar.getClass();
            rgm rgmVar = rgm.this;
            rgmVar.g.getClass();
            opl oplVar = rgmVar.a;
            RecyclerView recyclerView = oplVar != null ? ((kdm) oplVar).a : null;
            a aVar = this.d;
            aVar.a(recyclerView);
            float f = rgmVar.i;
            f fVar = rgmVar.b;
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && ((f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || !fVar.c) && (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fVar.c))) {
                float f3 = -f;
                float f4 = f3 / this.a;
                if (f4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f2 = f4;
                }
                float f5 = aVar.b + ((f3 * f) / this.c);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(recyclerView, (Property<RecyclerView, Float>) aVar.a, f5);
                ofFloat.setDuration((int) f2);
                ofFloat.setInterpolator(this.b);
                ofFloat.addUpdateListener(this);
                ObjectAnimator b2 = b(f5);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(ofFloat, b2);
                b = animatorSet;
            } else {
                b = b(aVar.b);
            }
            b.addListener(this);
            b.start();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            animator.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            animator.getClass();
            rgm rgmVar = rgm.this;
            d dVar = rgmVar.c;
            dVar.getClass();
            tim timVar = rgmVar.f;
            rgmVar.f = dVar;
            timVar.getClass();
            rgm.this.g.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            animator.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            animator.getClass();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            valueAnimator.getClass();
            h8m h8mVar = rgm.this.h;
            Object animatedValue = valueAnimator.getAnimatedValue();
            Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
            h8mVar.a(3, f != null ? f.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        @Override // defpackage.tim
        public final boolean a() {
            return true;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class d implements tim {
        public final e a;

        public d() {
            this.a = rgm.this.d();
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
        
            if (r7.c != false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
        
            r3.a = r8.getPointerId(0);
            r3.b = r7.a;
            r3.c = r7.c;
            r2.getClass();
            r7 = r0.f;
            r0.f = r2;
            r7.getClass();
            r7 = r2.e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
        
            if (r7.b.c == false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
        
            r0 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
        
            r2.d = r0;
            r7.g.getClass();
            r2.a(r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
        
            r0 = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
        
            if (r7.c == false) goto L23;
         */
        @Override // defpackage.tim
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean a(MotionEvent motionEvent) {
            rgm rgmVar = rgm.this;
            opl oplVar = rgmVar.a;
            g gVar = rgmVar.d;
            f fVar = rgmVar.b;
            opl oplVar2 = rgmVar.a;
            RecyclerView recyclerView = oplVar != null ? ((kdm) oplVar).a : null;
            e eVar = this.a;
            if (eVar.a(recyclerView, motionEvent)) {
                if (oplVar2 != null) {
                    kdm kdmVar = (kdm) oplVar2;
                    if (!kdmVar.c) {
                        if (kdmVar.b.b()) {
                        }
                    }
                }
                if (oplVar2 != null) {
                    kdm kdmVar2 = (kdm) oplVar2;
                    if (!kdmVar2.c) {
                        if (kdmVar2.b.a()) {
                        }
                    }
                }
            }
            return false;
        }

        @Override // defpackage.tim
        public final boolean a() {
            return false;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class g implements tim {
        public final float a;
        public final float b;
        public final e c;
        public int d;

        public g(float f, float f2) {
            this.c = rgm.this.d();
            this.a = f;
            this.b = f2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        
            if (r3 > r8) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
        
            r0.c(r1, r8, r12);
            r0.h.a(r11.d, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            r11 = r0.c;
            r11.getClass();
            r12 = r0.f;
            r0.f = r11;
            r12.getClass();
            r11.b.g.getClass();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
        
            if (r3 >= r8) goto L26;
         */
        @Override // defpackage.tim
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean a(MotionEvent motionEvent) {
            float f;
            rgm rgmVar = rgm.this;
            if (rgmVar.b.a != motionEvent.getPointerId(0)) {
                b bVar = rgmVar.e;
                bVar.getClass();
                tim timVar = rgmVar.f;
                rgmVar.f = bVar;
                bVar.c(timVar);
                return true;
            }
            opl oplVar = rgmVar.a;
            RecyclerView recyclerView = oplVar != null ? ((kdm) oplVar).a : null;
            e eVar = this.c;
            if (!eVar.a(recyclerView, motionEvent)) {
                return true;
            }
            boolean z = eVar.c;
            f fVar = rgmVar.b;
            boolean z2 = fVar.c;
            float f2 = eVar.b / (z == z2 ? this.a : this.b);
            float f3 = eVar.a + f2;
            if (z2 && !z) {
                f = fVar.b;
            }
            if (!z2 && z) {
                f = fVar.b;
            }
            if (recyclerView != null && recyclerView.getParent() != null) {
                recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
            }
            long eventTime = motionEvent.getEventTime() - motionEvent.getHistoricalEventTime(0);
            if (eventTime > 0) {
                rgmVar.i = f2 / eventTime;
            }
            rgmVar.b(recyclerView, f3);
            rgmVar.h.a(this.d, f3);
            return true;
        }

        @Override // defpackage.tim
        public final boolean a() {
            rgm rgmVar = rgm.this;
            b bVar = rgmVar.e;
            bVar.getClass();
            tim timVar = rgmVar.f;
            rgmVar.f = bVar;
            bVar.c(timVar);
            return false;
        }
    }
}
