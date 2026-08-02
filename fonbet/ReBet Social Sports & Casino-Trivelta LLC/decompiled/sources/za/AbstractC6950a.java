package za;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.activity.C2035b;
import com.plaid.internal.EnumC3631g;

/* renamed from: za.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6950a {

    /* renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f68640a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final View f68641b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68642c;

    /* renamed from: d, reason: collision with root package name */
    public final int f68643d;

    /* renamed from: e, reason: collision with root package name */
    public final int f68644e;

    /* renamed from: f, reason: collision with root package name */
    public C2035b f68645f;

    public AbstractC6950a(View view) {
        this.f68641b = view;
        Context context = view.getContext();
        this.f68642c = h.f(context, ia.c.f48216U, 300);
        this.f68643d = h.f(context, ia.c.f48219X, EnumC3631g.SDK_ASSET_ILLUSTRATION_SDK_NAVBAR_PLAID_LOGO_VALUE);
        this.f68644e = h.f(context, ia.c.f48218W, 100);
    }

    public float a(float f10) {
        return this.f68640a.getInterpolation(f10);
    }

    public C2035b b() {
        if (this.f68645f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C2035b c2035b = this.f68645f;
        this.f68645f = null;
        return c2035b;
    }

    public C2035b c() {
        C2035b c2035b = this.f68645f;
        this.f68645f = null;
        return c2035b;
    }

    public void d(C2035b c2035b) {
        this.f68645f = c2035b;
    }

    public C2035b e(C2035b c2035b) {
        if (this.f68645f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C2035b c2035b2 = this.f68645f;
        this.f68645f = c2035b;
        return c2035b2;
    }
}
