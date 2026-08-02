package c30;

import Ae.O0;
import Ae.x0;
import B0.C2454a;
import B90.L;
import C.o0;
import Sc.r;
import android.content.Context;
import android.location.Location;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f56464a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final K80.b f56465b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final x0<a> f56466c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final double f56467a;

        /* renamed from: b, reason: collision with root package name */
        private final double f56468b;

        /* renamed from: c, reason: collision with root package name */
        private final int f56469c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f56470d;

        public a(double d11, double d12, int i11, @NotNull String source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f56467a = d11;
            this.f56468b = d12;
            this.f56469c = i11;
            this.f56470d = source;
        }

        public final int a() {
            return this.f56469c;
        }

        public final double b() {
            return this.f56467a;
        }

        public final double c() {
            return this.f56468b;
        }

        @NotNull
        public final String d() {
            return this.f56470d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Double.compare(this.f56467a, aVar.f56467a) == 0 && Double.compare(this.f56468b, aVar.f56468b) == 0 && this.f56469c == aVar.f56469c && Intrinsics.d(this.f56470d, aVar.f56470d);
        }

        public final int hashCode() {
            return this.f56470d.hashCode() + C2454a.a(this.f56469c, Pk0.g.a(Double.hashCode(this.f56467a) * 31, 31, this.f56468b), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loc(lat=");
            sb2.append(this.f56467a);
            sb2.append(", lon=");
            sb2.append(this.f56468b);
            sb2.append(", accuracy=");
            sb2.append(this.f56469c);
            sb2.append(", source=");
            return o0.c(sb2, this.f56470d, ")");
        }
    }

    static final class b implements K80.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C10737n f56471a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f56472b;

        b(C10737n c10737n, i iVar) {
            this.f56471a = c10737n;
            this.f56472b = iVar;
        }

        @Override // K80.j
        public final void a(Location location) {
            String str;
            double latitude = location != null ? location.getLatitude() : 0.0d;
            double longitude = location != null ? location.getLongitude() : 0.0d;
            if (location != null) {
                this.f56472b.getClass();
                str = Build.VERSION.SDK_INT >= 31 ? location.isMock() : location.isFromMockProvider() ? "mock" : "geo";
            } else {
                str = "";
            }
            a aVar = new a(latitude, longitude, location != null ? (int) location.getAccuracy() : -1, str);
            r.Companion companion = r.INSTANCE;
            this.f56471a.resumeWith(aVar);
        }
    }

    public i(@NotNull Context context, @NotNull K80.b locationManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        this.f56464a = context;
        this.f56465b = locationManager;
        this.f56466c = O0.a(null);
    }

    public static void a(i iVar, Location it) {
        Intrinsics.checkNotNullParameter(it, "it");
        iVar.f56466c.setValue(new a(it.getLatitude(), it.getLongitude(), (int) it.getAccuracy(), Build.VERSION.SDK_INT >= 31 ? it.isMock() : it.isFromMockProvider() ? "mock" : "geo"));
    }

    @NotNull
    public final x0<a> b() {
        return this.f56466c;
    }

    public final Object c(@NotNull kotlin.coroutines.d<? super a> frame) {
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        this.f56465b.a(this.f56464a, new b(c10737n, this));
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }

    public final void d() {
        this.f56465b.b(this.f56464a, new L(this));
    }
}
