package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public int f2579a;

    /* renamed from: b, reason: collision with root package name */
    public int f2580b;

    /* renamed from: c, reason: collision with root package name */
    public int f2581c;

    /* renamed from: d, reason: collision with root package name */
    public int f2582d;

    /* renamed from: e, reason: collision with root package name */
    public Interpolator f2583e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2584f;

    /* renamed from: g, reason: collision with root package name */
    public int f2585g;

    public final void a(RecyclerView recyclerView) {
        int i5 = this.f2582d;
        if (i5 >= 0) {
            this.f2582d = -1;
            recyclerView.jumpToPositionForSmoothScroller(i5);
            this.f2584f = false;
            return;
        }
        if (!this.f2584f) {
            this.f2585g = 0;
            return;
        }
        Interpolator interpolator = this.f2583e;
        if (interpolator != null && this.f2581c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i10 = this.f2581c;
        if (i10 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.mViewFlinger.c(this.f2579a, this.f2580b, interpolator, i10);
        int i11 = this.f2585g + 1;
        this.f2585g = i11;
        if (i11 > 10) {
            io.sentry.android.core.w0.d("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f2584f = false;
    }

    public final void b(int i5, int i10, Interpolator interpolator, int i11) {
        this.f2579a = i5;
        this.f2580b = i10;
        this.f2581c = i11;
        this.f2583e = interpolator;
        this.f2584f = true;
    }
}
