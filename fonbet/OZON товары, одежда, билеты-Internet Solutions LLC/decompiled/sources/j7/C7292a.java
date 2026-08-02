package j7;

import Hj.C3143a;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import c3.C5739a;
import c3.C5740b;
import c3.C5741c;

/* renamed from: j7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7292a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f69463a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final C5740b f69464b = new C5740b();

    /* renamed from: c, reason: collision with root package name */
    public static final C5739a f69465c = new C5739a();

    /* renamed from: d, reason: collision with root package name */
    public static final C5741c f69466d = new C5741c();

    /* renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f69467e = new DecelerateInterpolator();

    public static float a(float f7, float f11, float f12) {
        return C3143a.d(f11, f7, f12, f7);
    }

    public static float b(float f7, float f11, float f12, float f13, float f14) {
        return f14 < f12 ? f7 : f14 > f13 ? f11 : a(f7, f11, (f14 - f12) / (f13 - f12));
    }

    public static int c(float f7, int i11, int i12) {
        return Math.round(f7 * (i12 - i11)) + i11;
    }
}
