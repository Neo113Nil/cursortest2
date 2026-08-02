package org.maplibre.android.camera;

import Uf.b;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.MapLibreMap;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: org.maplibre.android.camera.a$a, reason: collision with other inner class name */
    public static final class C1339a implements b {

        /* renamed from: a, reason: collision with root package name */
        private final double f79614a;

        /* renamed from: b, reason: collision with root package name */
        private final LatLng f79615b;

        /* renamed from: c, reason: collision with root package name */
        private final double f79616c;

        /* renamed from: d, reason: collision with root package name */
        private final double f79617d;

        /* renamed from: e, reason: collision with root package name */
        private final double f79618e;

        /* renamed from: f, reason: collision with root package name */
        private final double f79619f;

        /* renamed from: g, reason: collision with root package name */
        private final double f79620g;

        /* renamed from: h, reason: collision with root package name */
        private final double[] f79621h;

        public C1339a(LatLng latLng, double d11, double d12, double d13, double d14, double d15, double d16, double[] dArr) {
            this.f79614a = d11;
            this.f79615b = latLng;
            this.f79616c = d12;
            this.f79617d = d13;
            this.f79618e = d14;
            this.f79619f = d15;
            this.f79620g = d16;
            this.f79621h = dArr;
        }

        @Override // Uf.b
        @NotNull
        public final CameraPosition a(@NotNull MapLibreMap maplibreMap) {
            Intrinsics.checkNotNullParameter(maplibreMap, "maplibreMap");
            if (this.f79615b != null) {
                return new CameraPosition.a(this).b();
            }
            CameraPosition k11 = maplibreMap.k();
            Intrinsics.checkNotNullExpressionValue(k11, "getCameraPosition(...)");
            CameraPosition.a aVar = new CameraPosition.a(this);
            aVar.d(k11.target);
            return aVar.b();
        }

        public final double b() {
            return this.f79614a;
        }

        public final double[] c() {
            return this.f79621h;
        }

        public final LatLng d() {
            return this.f79615b;
        }

        public final double e() {
            return this.f79617d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C1339a.class.equals(obj.getClass())) {
                return false;
            }
            C1339a c1339a = (C1339a) obj;
            if (Double.compare(c1339a.f79614a, this.f79614a) != 0 || Double.compare(c1339a.f79617d, this.f79617d) != 0 || Double.compare(c1339a.f79618e, this.f79618e) != 0 || Double.compare(c1339a.f79619f, this.f79619f) != 0 || Double.compare(c1339a.f79620g, this.f79620g) != 0 || Double.compare(c1339a.f79616c, this.f79616c) != 0) {
                return false;
            }
            LatLng latLng = c1339a.f79615b;
            LatLng latLng2 = this.f79615b;
            if (latLng2 == null ? latLng == null : Intrinsics.d(latLng2, latLng)) {
                return Arrays.equals(this.f79621h, c1339a.f79621h);
            }
            return false;
        }

        public final double f() {
            return this.f79620g;
        }

        public final int hashCode() {
            long doubleToLongBits = Double.doubleToLongBits(this.f79614a);
            int i11 = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
            LatLng latLng = this.f79615b;
            int hashCode = latLng != null ? latLng.hashCode() : 0;
            long doubleToLongBits2 = Double.doubleToLongBits(this.f79616c);
            int i12 = ((i11 + hashCode) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
            long doubleToLongBits3 = Double.doubleToLongBits(this.f79617d);
            int i13 = (i12 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
            long doubleToLongBits4 = Double.doubleToLongBits(this.f79618e);
            int i14 = (i13 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
            long doubleToLongBits5 = Double.doubleToLongBits(this.f79619f);
            int i15 = (i14 * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)));
            long doubleToLongBits6 = Double.doubleToLongBits(this.f79620g);
            return Arrays.hashCode(this.f79621h) + (((i15 * 31) + ((int) ((doubleToLongBits6 >>> 32) ^ doubleToLongBits6))) * 31);
        }

        @NotNull
        public final String toString() {
            return "CameraPositionUpdate{bearing=" + this.f79614a + ", target=" + this.f79615b + ", centerAltitude=" + this.f79616c + ", tilt=" + this.f79617d + ", roll=" + this.f79618e + ", fov=" + this.f79619f + ", zoom=" + this.f79620g + ", padding=" + Arrays.toString(this.f79621h) + "}";
        }
    }

    @NotNull
    public static final C1339a a(@NotNull CameraPosition cameraPosition) {
        Intrinsics.checkNotNullParameter(cameraPosition, "cameraPosition");
        return new C1339a(cameraPosition.target, cameraPosition.bearing, cameraPosition.centerAltitude, cameraPosition.tilt, cameraPosition.roll, cameraPosition.fov, cameraPosition.zoom, cameraPosition.padding);
    }
}
