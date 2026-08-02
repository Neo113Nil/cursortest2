package ru.ozon.mapsdk.libre.placemark.view;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.M0;
import B0.C0;
import De.C2862e;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.maps.Projection;
import we0.C10551g;
import we0.h;
import we0.u;
import xe.AbstractC10711a;
import xe.B0;
import xe.H0;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes3.dex */
public class b<VIEW extends View> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Re0.c f97591a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private u f97592b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Projection f97593c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<u, Unit> f97594d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ObjectAnimator f97595e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ObjectAnimator f97596f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final LibreMarkerGestureDetector f97597g;

    /* renamed from: h, reason: collision with root package name */
    private B0 f97598h;

    /* renamed from: i, reason: collision with root package name */
    private h f97599i;

    public static final class a implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f97600a;

        public a(Function0 function0) {
            this.f97600a = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NotNull Animator animator) {
            this.f97600a.invoke();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@NotNull Animator animator) {
        }
    }

    public b(@NotNull Re0.c view, @NotNull u mapPlacemark, @NotNull Projection projection, @NotNull Function1 onPlacemarkClickListener) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(mapPlacemark, "mapPlacemark");
        Intrinsics.checkNotNullParameter(projection, "projection");
        Intrinsics.checkNotNullParameter(onPlacemarkClickListener, "onPlacemarkClickListener");
        this.f97591a = view;
        this.f97592b = mapPlacemark;
        this.f97593c = projection;
        this.f97594d = onPlacemarkClickListener;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f));
        ofPropertyValuesHolder.setInterpolator(new LinearInterpolator());
        Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "apply(...)");
        this.f97595e = ofPropertyValuesHolder;
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.0f));
        ofPropertyValuesHolder2.setInterpolator(new LinearInterpolator());
        Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder2, "apply(...)");
        this.f97596f = ofPropertyValuesHolder2;
        ru.ozon.mapsdk.libre.placemark.view.a aVar = new ru.ozon.mapsdk.libre.placemark.view.a(this);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f97597g = new LibreMarkerGestureDetector(context, projection, aVar);
        view.setOnTouchListener(new View.OnTouchListener() { // from class: Re0.d
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return ru.ozon.mapsdk.libre.placemark.view.b.a(ru.ozon.mapsdk.libre.placemark.view.b.this, view2, motionEvent);
            }
        });
    }

    public static boolean a(b bVar, View view, MotionEvent motionEvent) {
        LibreMarkerGestureDetector libreMarkerGestureDetector = bVar.f97597g;
        Intrinsics.f(view);
        boolean z11 = bVar.f97592b.j() != null || bVar.f97592b.l();
        bVar.f97592b.getClass();
        return libreMarkerGestureDetector.onTouchEvent(view, motionEvent, z11, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        PointF g10 = this.f97593c.g(this.f97592b.f());
        Intrinsics.checkNotNullExpressionValue(g10, "toScreenLocation(...)");
        float f7 = g10.x;
        Re0.c cVar = this.f97591a;
        PointF pointF = new PointF(f7 - (cVar.getMeasuredWidth() * this.f97592b.d().e().x), g10.y - (cVar.getMeasuredHeight() * this.f97592b.d().e().y));
        cVar.setX(pointF.x);
        cVar.setY(pointF.y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(float f7) {
        this.f97591a.setRotation(!this.f97592b.d().g() ? this.f97592b.d().c() : (-f7) + this.f97592b.d().c());
    }

    @NotNull
    public final ObjectAnimator g() {
        return this.f97595e;
    }

    @NotNull
    public final ObjectAnimator h() {
        return this.f97596f;
    }

    @NotNull
    public final u i() {
        return this.f97592b;
    }

    @NotNull
    public final VIEW j() {
        return this.f97591a;
    }

    public final void k(@NotNull M0 positionUpdateFlow, @NotNull C2862e coroutineScope) {
        Intrinsics.checkNotNullParameter(positionUpdateFlow, "positionUpdateFlow");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        q(this.f97592b);
        B0 b02 = this.f97598h;
        if (b02 == null || !((AbstractC10711a) b02).isActive()) {
            this.f97598h = C2399j.C(new C2408n0(positionUpdateFlow, new c(this, null)), coroutineScope);
        }
    }

    public final void l() {
        B0 b02 = this.f97598h;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f97598h = null;
    }

    public final void m(long j11) {
        ObjectAnimator objectAnimator = this.f97595e;
        objectAnimator.setDuration(j11);
        objectAnimator.start();
    }

    public final void n(long j11, @NotNull Function0<Unit> onFinished) {
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        ObjectAnimator objectAnimator = this.f97596f;
        objectAnimator.setDuration(j11);
        objectAnimator.addListener(new a(onFinished));
        objectAnimator.start();
    }

    public final void q(@NotNull u updatedPlacemark) {
        C10551g a11;
        Intrinsics.checkNotNullParameter(updatedPlacemark, "updatedPlacemark");
        this.f97592b = updatedPlacemark;
        r();
        o();
        h hVar = this.f97599i;
        p((hVar == null || (a11 = hVar.a()) == null) ? 0.0f : a11.b());
        this.f97592b.d().getClass();
        this.f97597g.updateTappableAreaConfig(null);
    }

    protected void r() {
        String obj;
        int i11 = this.f97592b.d().h() ? 0 : 8;
        Re0.c cVar = this.f97591a;
        cVar.setVisibility(i11);
        cVar.setAlpha(this.f97592b.d().b());
        cVar.setZ(this.f97592b.d().f());
        cVar.setPivotX(cVar.getMeasuredWidth() * this.f97592b.d().e().x);
        cVar.setPivotY(cVar.getMeasuredHeight() * this.f97592b.d().e().y);
        if (C0.c()) {
            Object b11 = this.f97592b.b();
            if (b11 == null || (obj = b11.toString()) == null) {
                Object k11 = this.f97592b.k();
                obj = k11 != null ? k11.toString() : null;
            }
            cVar.setContentDescription(obj);
        }
    }
}
