package Ic;

import android.view.VelocityTracker;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class C {

    /* renamed from: f, reason: collision with root package name */
    public static final a f5521f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final C f5522g = new C(-1.0d, 0.0d);

    /* renamed from: h, reason: collision with root package name */
    public static final C f5523h = new C(1.0d, 0.0d);

    /* renamed from: i, reason: collision with root package name */
    public static final C f5524i = new C(0.0d, -1.0d);

    /* renamed from: j, reason: collision with root package name */
    public static final C f5525j = new C(0.0d, 1.0d);

    /* renamed from: k, reason: collision with root package name */
    public static final C f5526k = new C(1.0d, -1.0d);

    /* renamed from: l, reason: collision with root package name */
    public static final C f5527l = new C(1.0d, 1.0d);

    /* renamed from: m, reason: collision with root package name */
    public static final C f5528m = new C(-1.0d, -1.0d);

    /* renamed from: n, reason: collision with root package name */
    public static final C f5529n = new C(-1.0d, 1.0d);

    /* renamed from: o, reason: collision with root package name */
    public static final C f5530o = new C(0.0d, 0.0d);

    /* renamed from: a, reason: collision with root package name */
    public final double f5531a;

    /* renamed from: b, reason: collision with root package name */
    public final double f5532b;

    /* renamed from: c, reason: collision with root package name */
    public final double f5533c;

    /* renamed from: d, reason: collision with root package name */
    public final double f5534d;

    /* renamed from: e, reason: collision with root package name */
    public final double f5535e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C a(int i10) {
            switch (i10) {
                case 1:
                    return C.f5523h;
                case 2:
                    return C.f5522g;
                case 3:
                case 7:
                default:
                    return C.f5530o;
                case 4:
                    return C.f5524i;
                case 5:
                    return C.f5526k;
                case 6:
                    return C.f5528m;
                case 8:
                    return C.f5525j;
                case 9:
                    return C.f5527l;
                case 10:
                    return C.f5529n;
            }
        }

        public final C b(VelocityTracker tracker) {
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            tracker.computeCurrentVelocity(1000);
            return new C(tracker.getXVelocity(), tracker.getYVelocity());
        }

        public a() {
        }
    }

    public C(double d10, double d11) {
        this.f5531a = d10;
        this.f5532b = d11;
        double hypot = Math.hypot(d10, d11);
        this.f5535e = hypot;
        boolean z10 = hypot > 0.1d;
        this.f5533c = z10 ? d10 / hypot : 0.0d;
        this.f5534d = z10 ? d11 / hypot : 0.0d;
    }

    public final double j(C c10) {
        return (this.f5533c * c10.f5533c) + (this.f5534d * c10.f5534d);
    }

    public final double k() {
        return this.f5535e;
    }

    public final boolean l(C vector, double d10) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return j(vector) > d10;
    }
}
