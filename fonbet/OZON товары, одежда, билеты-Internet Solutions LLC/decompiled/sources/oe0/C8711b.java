package oe0;

import Ae.C0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.E0;
import B90.C2619v;
import De.C2862e;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import oe0.z;
import org.jetbrains.annotations.NotNull;
import te0.C9867b;
import xe.AbstractC10711a;
import xe.B0;
import xe.H0;

/* renamed from: oe0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8711b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f78135a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2862e f78136b;

    /* renamed from: c, reason: collision with root package name */
    private final L f78137c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C0 f78138d;

    /* renamed from: e, reason: collision with root package name */
    private B0 f78139e;

    /* renamed from: f, reason: collision with root package name */
    private B0 f78140f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: oe0.b$a */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a FIRST;
        public static final a SECOND;

        static {
            a aVar = new a("FIRST", 0);
            FIRST = aVar;
            a aVar2 = new a("SECOND", 1);
            SECOND = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public C8711b(Context context, C2862e coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        LocationManager locationManager = (LocationManager) androidx.core.content.a.getSystemService(context, LocationManager.class);
        L l11 = locationManager == null ? null : new L(locationManager);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f78135a = context;
        this.f78136b = coroutineScope;
        this.f78137c = l11;
        C0 b11 = E0.b(0, 0, null, 7);
        this.f78138d = b11;
        this.f78140f = C2399j.C(new C2408n0(b11.getSubscriptionCount(), new C8710a(null, this)), coroutineScope);
    }

    public static final List a(C8711b c8711b, List list) {
        c8711b.getClass();
        if (list.contains("gps") && list.contains("network")) {
            C8712c f7 = c8711b.f("gps");
            C8712c f11 = c8711b.f("network");
            C9867b.g("Configure for subscription: GPS_PROVIDER and NETWORK_PROVIDER", null, 6);
            return C7714v.b0(f7, f11);
        }
        if (list.contains("gps")) {
            C8712c f12 = c8711b.f("gps");
            C9867b.g("Configure for subscription: GPS_PROVIDER", null, 6);
            return C7714v.a0(f12);
        }
        if (list.contains("network")) {
            C8712c f13 = c8711b.f("network");
            C9867b.g("Configure for subscription: NETWORK_PROVIDER", null, 6);
            return C7714v.a0(f13);
        }
        if (!list.contains("passive")) {
            return kotlin.collections.K.f71697a;
        }
        C8712c f14 = c8711b.f("passive");
        C9867b.g("Configure for subscription: PASSIVE_PROVIDER", null, 6);
        return C7714v.a0(f14);
    }

    public static final void d(C8711b c8711b) {
        B0 b02 = c8711b.f78139e;
        if (b02 == null || !((AbstractC10711a) b02).isActive()) {
            c8711b.f78139e = C2399j.C(new C2408n0(C2399j.Q(C2399j.o(C2399j.e(new C8713d(c8711b.f78135a, c8711b, null))), new C8717h(null, c8711b)), new C8720k(null, c8711b)), c8711b.f78136b);
        }
    }

    public static final void e(C8711b c8711b) {
        B0 b02 = c8711b.f78139e;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
    }

    private final C8712c f(String str) {
        return new C8712c(C2399j.e(new C8702A(new z(this.f78135a, str), null)));
    }

    private static final double g(String str, ArrayList arrayList) {
        if (arrayList.isEmpty() || arrayList.size() == 1) {
            C9867b c9867b = C9867b.f99466a;
            C9867b.g("Provider: " + str + " Score: 1.7976931348623157E308 ", null, 6);
            return Double.MAX_VALUE;
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Float.valueOf(((Location) it.next()).getAccuracy()));
        }
        Intrinsics.checkNotNullParameter(arrayList2, "<this>");
        Iterator it2 = arrayList2.iterator();
        double d11 = 0.0d;
        int i11 = 0;
        while (it2.hasNext()) {
            d11 += ((Number) it2.next()).floatValue();
            i11++;
            if (i11 < 0) {
                C7714v.N0();
                throw null;
            }
        }
        double d12 = i11 == 0 ? Double.NaN : d11 / i11;
        double millis = (TimeUnit.NANOSECONDS.toMillis(((Location) C7714v.X(arrayList)).getElapsedRealtimeNanos() - ((Location) C7714v.K(arrayList)).getElapsedRealtimeNanos()) / 1000.0d) / (arrayList.size() - 1 >= 1 ? r11 : 1);
        double d13 = (1.0d * millis) + (d12 * 1.0d);
        C9867b c9867b2 = C9867b.f99466a;
        StringBuilder sb2 = new StringBuilder("Provider ");
        sb2.append(str);
        sb2.append(" Score: ");
        sb2.append(d13);
        sb2.append(" (avgAccuracy: ");
        sb2.append(d12);
        sb2.append(", avgDeltaSeconds: ");
        C9867b.g(C2619v.c(sb2, millis, ")"), null, 6);
        return d13;
    }

    @NotNull
    public static a h(@NotNull List listA, @NotNull List listB) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(listA, "listA");
        Intrinsics.checkNotNullParameter(listB, "listB");
        z.b.c cVar = (z.b.c) C7714v.M(listA);
        if (cVar == null || (str = cVar.d()) == null) {
            str = "First provider";
        }
        z.b.c cVar2 = (z.b.c) C7714v.M(listB);
        if (cVar2 == null || (str2 = cVar2.d()) == null) {
            str2 = "Second provider";
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            Location c11 = ((z.b.c) it.next()).c();
            if (c11 != null) {
                arrayList.add(c11);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = listB.iterator();
        while (it2.hasNext()) {
            Location c12 = ((z.b.c) it2.next()).c();
            if (c12 != null) {
                arrayList2.add(c12);
            }
        }
        return g(str, arrayList) <= g(str2, arrayList2) ? a.FIRST : a.SECOND;
    }

    public final void i() {
        B0 b02 = this.f78140f;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f78140f = null;
        B0 b03 = this.f78139e;
        if (b03 != null) {
            ((H0) b03).j(null);
        }
    }

    @NotNull
    public final C0 j() {
        return this.f78138d;
    }
}
