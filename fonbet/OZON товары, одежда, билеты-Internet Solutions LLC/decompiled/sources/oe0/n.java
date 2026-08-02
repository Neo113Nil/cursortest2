package oe0;

import Ae.InterfaceC2397i;
import android.location.Location;
import java.util.List;
import kotlin.Unit;
import oe0.m;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.SphericalUtil;

/* loaded from: classes3.dex */
public final class n {
    public static final Double a(n nVar, we0.o oVar) {
        nVar.getClass();
        try {
            if (oVar.h() != 3) {
                List f7 = oVar.f();
                return Double.valueOf(SphericalUtil.computeDistanceBetween(e((Location) f7.get(0)), e((Location) f7.get(1))));
            }
            List f11 = oVar.f();
            double computeDistanceBetween = (SphericalUtil.computeDistanceBetween(e((Location) f11.get(0)), e((Location) f11.get(1))) + SphericalUtil.computeDistanceBetween(e((Location) f11.get(1)), e((Location) f11.get(2)))) / 2;
            if (computeDistanceBetween <= 0.0d) {
                return null;
            }
            return Double.valueOf(computeDistanceBetween);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Object b(InterfaceC2397i interfaceC2397i, we0.o oVar, kotlin.jvm.internal.K k11, Location location, m.a.C1324a c1324a) {
        oVar.b(location);
        k11.f71785a = 0;
        Object emit = interfaceC2397i.emit(location, c1324a);
        return emit == Wc.a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    public static final boolean c(n nVar, Location location) {
        nVar.getClass();
        return location.hasSpeed() && location.getSpeed() == 0.0f;
    }

    public static final /* synthetic */ we0.m d(n nVar, Location location) {
        nVar.getClass();
        return e(location);
    }

    private static we0.m e(Location location) {
        return new we0.m(location.getLatitude(), location.getLongitude());
    }
}
