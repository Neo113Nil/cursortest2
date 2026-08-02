package androidx.core.view;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1387a;

    /* renamed from: b, reason: collision with root package name */
    public float f1388b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f1389c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1390d;

    public r1(int i5, Interpolator interpolator, long j) {
        this.f1387a = i5;
        this.f1389c = interpolator;
        this.f1390d = j;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.f1390d;
    }

    public float c() {
        Interpolator interpolator = this.f1389c;
        return interpolator != null ? interpolator.getInterpolation(this.f1388b) : this.f1388b;
    }

    public int d() {
        return this.f1387a;
    }

    public void e(float f6) {
        this.f1388b = f6;
    }
}
