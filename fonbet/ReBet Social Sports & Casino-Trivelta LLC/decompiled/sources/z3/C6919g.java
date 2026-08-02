package z3;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.AbstractC2082d0;
import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.Z;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: z3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6919g {

    /* renamed from: a, reason: collision with root package name */
    public static final C6919g f68535a = new C6919g();

    /* renamed from: z3.g$a */
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f68536a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f68537b;

        public a(boolean z10, LottieAnimationView lottieAnimationView) {
            this.f68536a = z10;
            this.f68537b = lottieAnimationView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v10) {
            Intrinsics.checkNotNullParameter(v10, "v");
            LottieAnimationView lottieAnimationView = (LottieAnimationView) v10;
            if (this.f68536a) {
                this.f68537b.u();
            } else {
                this.f68537b.v();
            }
            lottieAnimationView.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v10) {
            Intrinsics.checkNotNullParameter(v10, "v");
            ((LottieAnimationView) v10).removeOnAttachStateChangeListener(this);
        }
    }

    public static final void A(float f10, C6920h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.m(Float.valueOf(f10));
    }

    public static final void B(String str, C6920h viewManager) {
        Z z10;
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 165298699) {
                if (hashCode != 899536360) {
                    if (hashCode == 2101957031 && str.equals("SOFTWARE")) {
                        z10 = Z.SOFTWARE;
                    }
                } else if (str.equals("HARDWARE")) {
                    z10 = Z.HARDWARE;
                }
            } else if (str.equals("AUTOMATIC")) {
                z10 = Z.AUTOMATIC;
            }
            viewManager.n(z10);
        }
        z10 = null;
        viewManager.n(z10);
    }

    public static final void C(String str, C6920h viewManager) {
        ImageView.ScaleType scaleType;
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1364013995) {
                if (hashCode != 94852023) {
                    if (hashCode == 951526612 && str.equals("contain")) {
                        scaleType = ImageView.ScaleType.FIT_CENTER;
                    }
                } else if (str.equals("cover")) {
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
            } else if (str.equals("center")) {
                scaleType = ImageView.ScaleType.CENTER_INSIDE;
            }
            viewManager.o(scaleType);
        }
        scaleType = null;
        viewManager.o(scaleType);
    }

    public static final void D(String str, C6920h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.p(str);
        viewManager.a();
    }

    public static final void E(String str, C6920h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.c(str);
        viewManager.a();
    }

    public static final void F(String str, C6920h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        if (str != null && !StringsKt.contains$default((CharSequence) str, (CharSequence) ".", false, 2, (Object) null)) {
            str = str + ".json";
        }
        viewManager.d(str);
        viewManager.a();
    }

    public static final void G(String str, C6920h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.e(str);
        viewManager.a();
    }

    public static final void H(double d10, C6920h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.q(Float.valueOf((float) d10));
    }

    public static final void I(ReadableArray readableArray, C6920h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.r(readableArray);
    }

    public static final LottieAnimationView e(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        return lottieAnimationView;
    }

    public static final Map f() {
        return MapBuilder.of("topAnimationFinish", MapBuilder.of("registrationName", "onAnimationFinish"), "topAnimationFailure", MapBuilder.of("registrationName", "onAnimationFailure"), "topAnimationLoaded", MapBuilder.of("registrationName", "onAnimationLoaded"));
    }

    public static final Map g() {
        return MapBuilder.builder().put("VERSION", 1).build();
    }

    public static final void h(final LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: z3.f
            @Override // java.lang.Runnable
            public final void run() {
                C6919g.i(LottieAnimationView.this);
            }
        });
    }

    public static final void i(LottieAnimationView lottieAnimationView) {
        if (AbstractC2082d0.Q(lottieAnimationView)) {
            lottieAnimationView.t();
        }
    }

    public static final void j(final LottieAnimationView view, final int i10, final int i11) {
        Intrinsics.checkNotNullParameter(view, "view");
        final boolean z10 = (i10 == -1 || i11 == -1) ? false : true;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: z3.e
            @Override // java.lang.Runnable
            public final void run() {
                C6919g.k(z10, i10, i11, view);
            }
        });
    }

    public static final void k(boolean z10, int i10, int i11, LottieAnimationView lottieAnimationView) {
        if (!z10) {
            C2940j composition = lottieAnimationView.getComposition();
            Integer valueOf = composition != null ? Integer.valueOf((int) composition.p()) : null;
            C2940j composition2 = lottieAnimationView.getComposition();
            Integer valueOf2 = composition2 != null ? Integer.valueOf((int) composition2.f()) : null;
            int minFrame = (int) lottieAnimationView.getMinFrame();
            int maxFrame = (int) lottieAnimationView.getMaxFrame();
            if (valueOf != null && valueOf2 != null && (minFrame != valueOf.intValue() || maxFrame != valueOf2.intValue())) {
                lottieAnimationView.C(valueOf.intValue(), valueOf2.intValue());
            }
        } else if (i10 > i11) {
            lottieAnimationView.C(i11, i10);
            if (lottieAnimationView.getSpeed() > 0.0f) {
                lottieAnimationView.w();
            }
        } else {
            lottieAnimationView.C(i10, i11);
            if (lottieAnimationView.getSpeed() < 0.0f) {
                lottieAnimationView.w();
            }
        }
        if (!AbstractC2082d0.Q(lottieAnimationView)) {
            lottieAnimationView.addOnAttachStateChangeListener(new a(z10, lottieAnimationView));
        } else if (z10) {
            lottieAnimationView.u();
        } else {
            lottieAnimationView.v();
        }
    }

    public static final void l(final LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: z3.c
            @Override // java.lang.Runnable
            public final void run() {
                C6919g.m(LottieAnimationView.this);
            }
        });
    }

    public static final void m(LottieAnimationView lottieAnimationView) {
        if (AbstractC2082d0.Q(lottieAnimationView)) {
            lottieAnimationView.l();
            lottieAnimationView.setProgress(0.0f);
        }
    }

    public static final void n(final LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: z3.d
            @Override // java.lang.Runnable
            public final void run() {
                C6919g.o(LottieAnimationView.this);
            }
        });
    }

    public static final void o(LottieAnimationView lottieAnimationView) {
        if (AbstractC2082d0.Q(lottieAnimationView)) {
            lottieAnimationView.v();
        }
    }

    public static final void p(LottieAnimationView view, Throwable error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(error, "error");
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, view.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new C6922j(themedReactContext.getSurfaceId(), view.getId(), error));
        }
    }

    public static final void q(LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, view.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new C6924l(themedReactContext.getSurfaceId(), view.getId()));
        }
    }

    public static final void r(LottieAnimationView view, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, view.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new C6923k(themedReactContext.getSurfaceId(), view.getId(), z10));
        }
    }

    public static final void s(boolean z10, C6920h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.f(Boolean.valueOf(z10));
    }

    public static final void t(LottieAnimationView view, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setCacheComposition(z10);
    }

    public static final void u(ReadableArray readableArray, C6920h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.g(readableArray);
    }

    public static final void v(boolean z10, C6920h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.h(Boolean.valueOf(z10));
    }

    public static final void w(boolean z10, C6920h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.i(Boolean.valueOf(z10));
    }

    public static final void x(boolean z10, C6920h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.k(z10 ? 2 : 1);
    }

    public static final void y(String str, C6920h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.j(str);
    }

    public static final void z(boolean z10, C6920h viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.l(Boolean.valueOf(z10));
    }
}
