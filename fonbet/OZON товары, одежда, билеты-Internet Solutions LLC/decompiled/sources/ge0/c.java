package ge0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kd.InterfaceC7663b;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import we0.i;
import we0.m;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<InterfaceC7663b<Double>> f64294a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC7663b<Double> f64295b;

    public static final class a {
        @NotNull
        public static c a(@NotNull i area) {
            Intrinsics.checkNotNullParameter(area, "area");
            double longitude = area.f().getLongitude();
            double[] other = {area.g().getLongitude(), area.e().getLongitude(), area.d().getLongitude()};
            Intrinsics.checkNotNullParameter(other, "other");
            for (int i11 = 0; i11 < 3; i11++) {
                longitude = Math.min(longitude, other[i11]);
            }
            double longitude2 = area.f().getLongitude();
            double[] other2 = {area.g().getLongitude(), area.e().getLongitude(), area.d().getLongitude()};
            Intrinsics.checkNotNullParameter(other2, "other");
            for (int i12 = 0; i12 < 3; i12++) {
                longitude2 = Math.max(longitude2, other2[i12]);
            }
            double latitude = area.f().getLatitude();
            double[] other3 = {area.g().getLatitude(), area.e().getLatitude(), area.d().getLatitude()};
            Intrinsics.checkNotNullParameter(other3, "other");
            for (int i13 = 0; i13 < 3; i13++) {
                latitude = Math.min(latitude, other3[i13]);
            }
            double latitude2 = area.f().getLatitude();
            double[] other4 = {area.g().getLatitude(), area.e().getLatitude(), area.d().getLatitude()};
            Intrinsics.checkNotNullParameter(other4, "other");
            for (int i14 = 0; i14 < 3; i14++) {
                latitude2 = Math.max(latitude2, other4[i14]);
            }
            return new c(longitude2 > 180.0d ? C7714v.b0(h.k(longitude, 180.0d), h.k(-180.0d, (longitude2 - 180) - 180)) : longitude < -180.0d ? C7714v.b0(h.k(180 - ((-180) - longitude), 180.0d), h.k(-180.0d, longitude2)) : C7714v.a0(h.k(longitude, longitude2)), h.k(latitude, latitude2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull List<? extends InterfaceC7663b<Double>> longitudeRanges, @NotNull InterfaceC7663b<Double> latitudeRange) {
        Intrinsics.checkNotNullParameter(longitudeRanges, "longitudeRanges");
        Intrinsics.checkNotNullParameter(latitudeRange, "latitudeRange");
        this.f64294a = longitudeRanges;
        this.f64295b = latitudeRange;
    }

    public final boolean a(@NotNull m position) {
        Intrinsics.checkNotNullParameter(position, "position");
        List<InterfaceC7663b<Double>> list = this.f64294a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((InterfaceC7663b) it.next()).c(Double.valueOf(position.getLongitude()))) {
                return this.f64295b.c(Double.valueOf(position.getLatitude()));
            }
        }
        return false;
    }
}
