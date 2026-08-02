package oe0;

import De.C2862e;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.SystemClock;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.C9867b;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.N;
import xe.X0;
import xe.f1;
import ze.C11115c;

/* loaded from: classes3.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private C2862e f78131a;

    public J() {
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.f78131a = N.a(CoroutineContext.Element.a.d(De.s.f6650a, (H0) b11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x010b, code lost:
    
        if (xe.f1.c(200, r0, r7) != r8) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull Context context, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C8703B c8703b;
        int i11;
        List locations;
        ze.h hVar;
        List list;
        J j11;
        Context context2 = context;
        if (cVar instanceof C8703B) {
            c8703b = (C8703B) cVar;
            int i12 = c8703b.f78110j;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c8703b.f78110j = i12 - LinearLayoutManager.INVALID_OFFSET;
                C8703B c8703b2 = c8703b;
                Object obj = c8703b2.f78108h;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c8703b2.f78110j;
                Object obj2 = null;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (context2.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == -1 && context2.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == -1) {
                        C9867b.g("Trying get location without permission, skip", null, 6);
                        return null;
                    }
                    Intrinsics.checkNotNullParameter(context2, "context");
                    LocationManager locationManager = (LocationManager) androidx.core.content.a.getSystemService(context2, LocationManager.class);
                    L l11 = locationManager == null ? null : new L(locationManager);
                    if (l11 != null) {
                        ArrayList a11 = l11.a();
                        if (!a11.isEmpty()) {
                            C11115c a12 = ze.k.a(0, 7, null);
                            ArrayList arrayList = new ArrayList(C7714v.z(a11, 10));
                            Iterator it = a11.iterator();
                            while (it.hasNext()) {
                                arrayList.add(C10727i.c(this.f78131a, null, null, new C8706E(this, context2, l11, (String) it.next(), a12, null), 3));
                                context2 = context;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            C8704C c8704c = new C8704C(a12, arrayList2, null);
                            c8703b2.f78104d = this;
                            c8703b2.f78105e = a12;
                            c8703b2.f78106f = arrayList;
                            c8703b2.f78107g = arrayList2;
                            c8703b2.f78110j = 1;
                            if (f1.c(30000L, c8704c, c8703b2) != aVar) {
                                locations = arrayList2;
                                hVar = a12;
                                list = arrayList;
                                j11 = this;
                            }
                            return aVar;
                        }
                    }
                    return null;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    locations = c8703b2.f78107g;
                    list = c8703b2.f78106f;
                    hVar = c8703b2.f78105e;
                    j11 = c8703b2.f78104d;
                    Sc.s.b(obj);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((B0) it2.next()).j(null);
                    }
                    hVar.l(null);
                    j11.getClass();
                    Intrinsics.checkNotNullParameter(locations, "locations");
                    if (!locations.isEmpty()) {
                        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                        Iterator it3 = locations.iterator();
                        if (it3.hasNext()) {
                            obj2 = it3.next();
                            if (it3.hasNext()) {
                                Location location = (Location) obj2;
                                double d11 = 1.0d;
                                double d12 = 1000.0d;
                                double accuracy = 1000.0d / (location.getAccuracy() + 1.0d);
                                double elapsedRealtimeNanos2 = (elapsedRealtimeNanos - location.getElapsedRealtimeNanos()) / 1.0E9d;
                                double d13 = elapsedRealtimeNanos2 < 60.0d ? 1.0d : 60.0d / elapsedRealtimeNanos2;
                                double d14 = location.hasAltitude() ? 1.1d : 1.0d;
                                if (location.hasSpeed() && location.getSpeed() > 0.0f) {
                                    d14 += 0.1d;
                                }
                                if (location.hasBearing()) {
                                    d14 += 0.1d;
                                }
                                double d15 = accuracy * d13 * d14;
                                while (true) {
                                    Object next = it3.next();
                                    Location location2 = (Location) next;
                                    double d16 = d11;
                                    double accuracy2 = d12 / (location2.getAccuracy() + d16);
                                    double elapsedRealtimeNanos3 = (elapsedRealtimeNanos - location2.getElapsedRealtimeNanos()) / 1.0E9d;
                                    double d17 = elapsedRealtimeNanos3 < 60.0d ? d16 : 60.0d / elapsedRealtimeNanos3;
                                    double d18 = location2.hasAltitude() ? 1.1d : d16;
                                    if (location2.hasSpeed() && location2.getSpeed() > 0.0f) {
                                        d18 += 0.1d;
                                    }
                                    if (location2.hasBearing()) {
                                        d18 += 0.1d;
                                    }
                                    double d19 = accuracy2 * d17 * d18;
                                    if (Double.compare(d15, d19) < 0) {
                                        obj2 = next;
                                        d15 = d19;
                                    }
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    d11 = d16;
                                    d12 = 1000.0d;
                                }
                            }
                        }
                        return (Location) obj2;
                    }
                    return null;
                }
                locations = c8703b2.f78107g;
                list = c8703b2.f78106f;
                hVar = c8703b2.f78105e;
                j11 = c8703b2.f78104d;
                Sc.s.b(obj);
                C8705D c8705d = new C8705D(hVar, locations, null);
                c8703b2.f78104d = j11;
                c8703b2.f78105e = hVar;
                c8703b2.f78106f = list;
                c8703b2.f78107g = locations;
                c8703b2.f78110j = 2;
            }
        }
        c8703b = new C8703B(this, cVar);
        C8703B c8703b22 = c8703b;
        Object obj3 = c8703b22.f78108h;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c8703b22.f78110j;
        Object obj22 = null;
        if (i11 != 0) {
        }
        C8705D c8705d2 = new C8705D(hVar, locations, null);
        c8703b22.f78104d = j11;
        c8703b22.f78105e = hVar;
        c8703b22.f78106f = list;
        c8703b22.f78107g = locations;
        c8703b22.f78110j = 2;
    }
}
