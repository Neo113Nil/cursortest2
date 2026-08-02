package org.maplibre.android.maps.widgets;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.core.view.C5326k0;
import androidx.core.view.C5330m0;
import androidx.core.view.Y;
import org.maplibre.android.maps.MapLibreMap;

/* loaded from: classes10.dex */
public final class CompassView extends ImageView implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private float f79955a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f79956b;

    /* renamed from: c, reason: collision with root package name */
    private C5326k0 f79957c;

    /* renamed from: d, reason: collision with root package name */
    private MapLibreMap.OnCompassAnimationListener f79958d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f79959e;

    public CompassView(@NonNull Context context) {
        super(context);
        this.f79955a = 0.0f;
        this.f79956b = true;
        this.f79959e = false;
        setEnabled(false);
        int i11 = (int) (context.getResources().getDisplayMetrics().density * 48.0f);
        setLayoutParams(new ViewGroup.LayoutParams(i11, i11));
    }

    public final void a(boolean z11) {
        this.f79956b = z11;
    }

    public final void b(@NonNull MapLibreMap.OnCompassAnimationListener onCompassAnimationListener) {
        this.f79958d = onCompassAnimationListener;
    }

    public final void c(boolean z11) {
        this.f79959e = z11;
    }

    public final boolean d() {
        return this.f79956b;
    }

    public final boolean e() {
        if (this.f79956b) {
            return ((double) Math.abs(this.f79955a)) >= 359.0d || ((double) Math.abs(this.f79955a)) <= 1.0d;
        }
        return false;
    }

    public final void f() {
        C5326k0 c5326k0 = this.f79957c;
        if (c5326k0 != null) {
            c5326k0.b();
        }
        this.f79957c = null;
    }

    public final void g(double d11) {
        this.f79955a = (float) d11;
        if (isEnabled()) {
            if (e()) {
                if (getVisibility() == 4 || this.f79957c != null) {
                    return;
                }
                postDelayed(this, 500L);
                return;
            }
            f();
            setAlpha(1.0f);
            setVisibility(0);
            if (this.f79959e) {
                this.f79958d.a();
            }
            setRotation(this.f79955a);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (e()) {
            this.f79958d.b();
            f();
            setLayerType(2, null);
            C5326k0 b11 = Y.b(this);
            b11.a(0.0f);
            b11.d(500L);
            this.f79957c = b11;
            b11.f(new C5330m0() { // from class: org.maplibre.android.maps.widgets.CompassView.1
                @Override // androidx.core.view.InterfaceC5328l0
                public final void onAnimationEnd() {
                    CompassView compassView = CompassView.this;
                    compassView.setLayerType(0, null);
                    compassView.setVisibility(4);
                    compassView.f();
                }
            });
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z11) {
        super.setEnabled(z11);
        if (!z11 || e()) {
            f();
            setAlpha(0.0f);
            setVisibility(4);
        } else {
            f();
            setAlpha(1.0f);
            setVisibility(0);
            g(this.f79955a);
        }
    }
}
