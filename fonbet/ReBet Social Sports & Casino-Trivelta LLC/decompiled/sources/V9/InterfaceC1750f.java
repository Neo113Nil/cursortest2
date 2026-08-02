package V9;

import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.location.zzdh;

/* renamed from: V9.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC1750f {

    /* renamed from: V9.f$a */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public double f12837e;

        /* renamed from: f, reason: collision with root package name */
        public double f12838f;

        /* renamed from: g, reason: collision with root package name */
        public float f12839g;

        /* renamed from: a, reason: collision with root package name */
        public String f12833a = null;

        /* renamed from: b, reason: collision with root package name */
        public int f12834b = 0;

        /* renamed from: c, reason: collision with root package name */
        public long f12835c = Long.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        public short f12836d = -1;

        /* renamed from: h, reason: collision with root package name */
        public int f12840h = 0;

        /* renamed from: i, reason: collision with root package name */
        public int f12841i = -1;

        public InterfaceC1750f a() {
            if (this.f12833a == null) {
                throw new IllegalArgumentException("Request ID not set.");
            }
            int i10 = this.f12834b;
            if (i10 == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            }
            if ((i10 & 4) != 0 && this.f12841i < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELL.");
            }
            if (this.f12835c == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Expiration not set.");
            }
            if (this.f12836d == -1) {
                throw new IllegalArgumentException("Geofence region not set.");
            }
            if (this.f12840h >= 0) {
                return new zzdh(this.f12833a, this.f12834b, (short) 1, this.f12837e, this.f12838f, this.f12839g, this.f12835c, this.f12840h, this.f12841i);
            }
            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
        }

        public a b(double d10, double d11, float f10) {
            AbstractC3191o.b(d10 >= -90.0d && d10 <= 90.0d, "Invalid latitude: " + d10);
            AbstractC3191o.b(d11 >= -180.0d && d11 <= 180.0d, "Invalid longitude: " + d11);
            AbstractC3191o.b(f10 > 0.0f, "Invalid radius: " + f10);
            this.f12836d = (short) 1;
            this.f12837e = d10;
            this.f12838f = d11;
            this.f12839g = f10;
            return this;
        }

        public a c(long j10) {
            if (j10 < 0) {
                this.f12835c = -1L;
                return this;
            }
            this.f12835c = K9.h.c().b() + j10;
            return this;
        }

        public a d(int i10) {
            this.f12841i = i10;
            return this;
        }

        public a e(int i10) {
            this.f12840h = i10;
            return this;
        }

        public a f(String str) {
            this.f12833a = (String) AbstractC3191o.n(str, "Request ID can't be set to null");
            return this;
        }

        public a g(int i10) {
            this.f12834b = i10;
            return this;
        }
    }

    String getRequestId();
}
