package Lc;

import Lc.g;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.ThemedReactContext;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.C3834z;
import com.swmansion.rnscreens.Y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final ThemedReactContext f7146a;

    /* renamed from: b, reason: collision with root package name */
    public final d f7147b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7148c;

    /* renamed from: d, reason: collision with root package name */
    public BottomSheetBehavior.g f7149d;

    public static final class a extends BottomSheetBehavior.g {

        /* renamed from: a, reason: collision with root package name */
        public final C3834z f7150a;

        /* renamed from: b, reason: collision with root package name */
        public final View f7151b;

        /* renamed from: c, reason: collision with root package name */
        public final float f7152c;

        /* renamed from: d, reason: collision with root package name */
        public float f7153d;

        /* renamed from: e, reason: collision with root package name */
        public float f7154e;

        /* renamed from: f, reason: collision with root package name */
        public float f7155f;

        /* renamed from: g, reason: collision with root package name */
        public final ValueAnimator f7156g;

        public a(C3834z screen, View viewToAnimate, float f10) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            Intrinsics.checkNotNullParameter(viewToAnimate, "viewToAnimate");
            this.f7150a = screen;
            this.f7151b = viewToAnimate;
            this.f7152c = f10;
            this.f7153d = f(screen.getSheetLargestUndimmedDetentIndex());
            float f11 = f(RangesKt.coerceIn(screen.getSheetLargestUndimmedDetentIndex() + 1, 0, screen.getSheetDetents().d() - 1));
            this.f7154e = f11;
            this.f7155f = f11 - this.f7153d;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f10);
            ofFloat.setDuration(1L);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Lc.f
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    g.a.e(g.a.this, valueAnimator);
                }
            });
            this.f7156g = ofFloat;
        }

        public static final void e(a aVar, ValueAnimator it) {
            Intrinsics.checkNotNullParameter(it, "it");
            View view = aVar.f7151b;
            Object animatedValue = it.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setAlpha(((Float) animatedValue).floatValue());
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View bottomSheet, float f10) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            float f11 = this.f7153d;
            if (f11 >= f10 || f10 >= this.f7154e) {
                return;
            }
            this.f7156g.setCurrentFraction((f10 - f11) / this.f7155f);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View bottomSheet, int i10) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (i10 == 1 || i10 == 2) {
                this.f7153d = f(this.f7150a.getSheetLargestUndimmedDetentIndex());
                float f10 = f(RangesKt.coerceIn(this.f7150a.getSheetLargestUndimmedDetentIndex() + 1, 0, this.f7150a.getSheetDetents().d() - 1));
                this.f7154e = f10;
                this.f7155f = f10 - this.f7153d;
            }
        }

        public final float f(int i10) {
            int d10 = this.f7150a.getSheetDetents().d();
            if (d10 == 1) {
                return (i10 == -1 || i10 != 0) ? -1.0f : 1.0f;
            }
            if (d10 == 2) {
                if (i10 == -1) {
                    return -1.0f;
                }
                if (i10 != 0) {
                    return i10 != 1 ? -1.0f : 1.0f;
                }
                return 0.0f;
            }
            if (d10 != 3 || i10 == -1) {
                return -1.0f;
            }
            if (i10 == 0) {
                return 0.0f;
            }
            if (i10 != 1) {
                return i10 != 2 ? -1.0f : 1.0f;
            }
            BottomSheetBehavior<C3834z> sheetBehavior = this.f7150a.getSheetBehavior();
            Intrinsics.checkNotNull(sheetBehavior);
            return sheetBehavior.t0();
        }
    }

    public g(ThemedReactContext reactContext, C3834z screen) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f7146a = reactContext;
        this.f7147b = b(screen);
        this.f7148c = 0.3f;
    }

    public static final void c(C3834z c3834z, View view) {
        if (c3834z.getSheetClosesOnTouchOutside()) {
            Fragment fragment = c3834z.getFragment();
            Intrinsics.checkNotNull(fragment, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
            ((Y) fragment).H0();
        }
    }

    public final d b(final C3834z c3834z) {
        d dVar = new d(this.f7146a, this.f7148c);
        dVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        dVar.setOnClickListener(new View.OnClickListener() { // from class: Lc.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.c(C3834z.this, view);
            }
        });
        return dVar;
    }

    public final d d() {
        return this.f7147b;
    }

    public final float e() {
        return this.f7148c;
    }

    public final void f(BottomSheetBehavior bottomSheetBehavior) {
        BottomSheetBehavior.g gVar = this.f7149d;
        if (gVar == null || bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.J0(gVar);
    }

    public final void g(C3834z screen, BottomSheetBehavior behavior) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        behavior.c0(i(screen, true));
    }

    public final void h(C3834z screen, ViewGroup root) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(root, "root");
        root.addView(this.f7147b, 0);
        if (j(screen, screen.getSheetInitialDetentIndex())) {
            this.f7147b.setAlpha(this.f7148c);
        } else {
            this.f7147b.setAlpha(0.0f);
        }
    }

    public final BottomSheetBehavior.g i(C3834z c3834z, boolean z10) {
        if (this.f7149d == null || z10) {
            this.f7149d = new a(c3834z, this.f7147b, this.f7148c);
        }
        BottomSheetBehavior.g gVar = this.f7149d;
        Intrinsics.checkNotNull(gVar);
        return gVar;
    }

    public final boolean j(C3834z screen, int i10) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return i10 > screen.getSheetLargestUndimmedDetentIndex();
    }
}
