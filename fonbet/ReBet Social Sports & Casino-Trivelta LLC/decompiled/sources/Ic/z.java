package Ic;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: f, reason: collision with root package name */
    public static final a f5745f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final double f5746a;

    /* renamed from: b, reason: collision with root package name */
    public final double f5747b;

    /* renamed from: c, reason: collision with root package name */
    public final double f5748c;

    /* renamed from: d, reason: collision with root package name */
    public final double f5749d;

    /* renamed from: e, reason: collision with root package name */
    public final double f5750e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z a(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            double axisValue = 1.5707963267948966d - event.getAxisValue(25);
            double pressure = event.getPressure(0);
            double orientation = (event.getOrientation(0) + 1.5707963267948966d) % 6.283185307179586d;
            if (orientation != 0.0d && Math.signum(orientation) != Math.signum(6.283185307179586d)) {
                orientation += 6.283185307179586d;
            }
            double d10 = orientation;
            Pair b10 = b(axisValue, d10);
            return new z(((Number) b10.getFirst()).doubleValue(), ((Number) b10.getSecond()).doubleValue(), axisValue, d10, pressure);
        }

        public final Pair b(double d10, double d11) {
            double atan;
            double atan2;
            if (d10 < 1.0E-9d) {
                atan = 1.5707963267948966d;
                double d12 = (d11 < 1.0E-9d || Math.abs(d11 - 6.283185307179586d) < 1.0E-9d) ? 1.5707963267948966d : 0.0d;
                double d13 = d11 - 1.5707963267948966d;
                double d14 = Math.abs(d13) < 1.0E-9d ? 1.5707963267948966d : 0.0d;
                double d15 = d11 - 3.141592653589793d;
                atan2 = -1.5707963267948966d;
                if (Math.abs(d15) < 1.0E-9d) {
                    d12 = -1.5707963267948966d;
                }
                double d16 = d11 - 4.71238898038469d;
                if (Math.abs(d16) < 1.0E-9d) {
                    d14 = -1.5707963267948966d;
                }
                if (d11 > 1.0E-9d && Math.abs(d13) < 1.0E-9d) {
                    d14 = 1.5707963267948966d;
                    d12 = 1.5707963267948966d;
                }
                if (Math.abs(d13) > 1.0E-9d && Math.abs(d15) < 1.0E-9d) {
                    d14 = 1.5707963267948966d;
                    d12 = -1.5707963267948966d;
                }
                if (Math.abs(d15) > 1.0E-9d && Math.abs(d16) < 1.0E-9d) {
                    d14 = -1.5707963267948966d;
                    d12 = -1.5707963267948966d;
                }
                if (Math.abs(d16) <= 1.0E-9d || Math.abs(d11 - 6.283185307179586d) >= 1.0E-9d) {
                    atan2 = d14;
                    atan = d12;
                }
            } else {
                double tan = Math.tan(d10);
                atan = Math.atan(Math.cos(d11) / tan);
                atan2 = Math.atan(Math.sin(d11) / tan);
            }
            return new Pair(Double.valueOf(Math.rint(atan * 57.29577951308232d)), Double.valueOf(Math.rint(atan2 * 57.29577951308232d)));
        }

        public a() {
        }
    }

    public z(double d10, double d11, double d12, double d13, double d14) {
        this.f5746a = d10;
        this.f5747b = d11;
        this.f5748c = d12;
        this.f5749d = d13;
        this.f5750e = d14;
    }

    public final double a() {
        return this.f5750e;
    }

    public final ReadableMap b() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("tiltX", this.f5746a);
        createMap.putDouble("tiltY", this.f5747b);
        createMap.putDouble("altitudeAngle", this.f5748c);
        createMap.putDouble("azimuthAngle", this.f5749d);
        createMap.putDouble("pressure", this.f5750e);
        return createMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Double.compare(this.f5746a, zVar.f5746a) == 0 && Double.compare(this.f5747b, zVar.f5747b) == 0 && Double.compare(this.f5748c, zVar.f5748c) == 0 && Double.compare(this.f5749d, zVar.f5749d) == 0 && Double.compare(this.f5750e, zVar.f5750e) == 0;
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.f5746a) * 31) + Double.hashCode(this.f5747b)) * 31) + Double.hashCode(this.f5748c)) * 31) + Double.hashCode(this.f5749d)) * 31) + Double.hashCode(this.f5750e);
    }

    public String toString() {
        return "StylusData(tiltX=" + this.f5746a + ", tiltY=" + this.f5747b + ", altitudeAngle=" + this.f5748c + ", azimuthAngle=" + this.f5749d + ", pressure=" + this.f5750e + ")";
    }

    public /* synthetic */ z(double d10, double d11, double d12, double d13, double d14, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? 0.0d : d11, (i10 & 4) != 0 ? 0.0d : d12, (i10 & 8) != 0 ? 0.0d : d13, (i10 & 16) != 0 ? -1.0d : d14);
    }
}
