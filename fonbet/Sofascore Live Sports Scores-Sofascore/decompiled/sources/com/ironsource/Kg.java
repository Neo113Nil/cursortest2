package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import defpackage.a70;
import defpackage.dmi;
import defpackage.ljg;
import defpackage.wv8;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* loaded from: classes4.dex */
public abstract class Kg {

    @NotNull
    public static final a d = new a(null);

    @NotNull
    private final T0 a;

    @NotNull
    private final AbstractC4386x0 b;

    @NotNull
    private final Uc c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c implements Uc {
    }

    public Kg(@NotNull T0 t0, @NotNull AbstractC4386x0 abstractC4386x0) {
        t0.getClass();
        abstractC4386x0.getClass();
        this.a = t0;
        this.b = abstractC4386x0;
        this.c = new c();
    }

    private final InterfaceC4363vd b() {
        int i = b.a[this.b.b().a().ordinal()];
        if (i == 1) {
            return Ib.v.d().B();
        }
        if (i == 2) {
            return Ib.v.d().G();
        }
        IronLog.INTERNAL.warning(C4243p0.a(this.a, "Unable to reset preloaded instance", (String) null, 2, (Object) null));
        return null;
    }

    @NotNull
    public final Mg a(@NotNull List<? extends C4227o2> list, @NotNull Map<String, I> map, @NotNull C4173l2 c4173l2, @NotNull E e, @Nullable B b2) {
        list.getClass();
        map.getClass();
        c4173l2.getClass();
        e.getClass();
        IronLog.INTERNAL.verbose(C4243p0.a(this.a, ljg.j(list.size(), "waterfall.size() = "), (String) null, 2, (Object) null));
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C4227o2 c4227o2 = list.get(i);
            if (z || b2 == null || !Intrinsics.c(b2.p(), c4227o2.c())) {
                B a2 = a(c4227o2, c4173l2, e, map.get(c4227o2.c()));
                if (a2 != null && a2.g() != null) {
                    arrayList.add(a2);
                }
            } else {
                b2.a(c4227o2);
                arrayList.add(b2);
                z = true;
            }
        }
        if (b2 != null && !z) {
            c();
        }
        Mg mg = new Mg(arrayList);
        IronLog.INTERNAL.verbose(C4243p0.a(this.a, dmi.q("updateWaterfall() - next waterfall is ", mg.d()), (String) null, 2, (Object) null));
        return mg;
    }

    public abstract void a(@NotNull E e, @NotNull Lg lg);

    public final void c() {
        InterfaceC4363vd b2 = b();
        if (b2 == null) {
            return;
        }
        b2.a(this.b.b().c(), false);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Kg a(@NotNull T0 t0, @NotNull AbstractC4386x0 abstractC4386x0) {
            t0.getClass();
            abstractC4386x0.getClass();
            return abstractC4386x0.t() ? new C4280r2(t0, abstractC4386x0) : new Dc(t0, abstractC4386x0);
        }

        private a() {
        }
    }

    @NotNull
    public Uc a() {
        return this.c;
    }

    public static /* synthetic */ Mg a(Kg kg, List list, Map map, C4173l2 c4173l2, E e, B b2, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: createAdInstanceWaterfall");
            return null;
        }
        if ((i & 16) != 0) {
            b2 = null;
        }
        return kg.a(list, map, c4173l2, e, b2);
    }

    private final B a(C4227o2 c4227o2, C4173l2 c4173l2, E e, I i) {
        AbstractC4386x0 abstractC4386x0 = this.b;
        String c2 = c4227o2.c();
        c2.getClass();
        NetworkSettings a2 = abstractC4386x0.a(c2);
        if (a2 == null) {
            String c3 = c4227o2.c();
            c3.getClass();
            a("Could not find matching provider settings for auction response item", c3);
            return null;
        }
        if (i == null) {
            String c4 = c4227o2.c();
            c4.getClass();
            a("Could not find matching adInstancePayload for auction response item", c4);
            return null;
        }
        com.ironsource.mediationsdk.c.d().b(a2, this.b.b().a(), this.b.b().b());
        int g = this.a.g();
        AbstractC4386x0 abstractC4386x02 = this.b;
        return e.a(new C(abstractC4386x02, a2, c4173l2, new C4011c1(a2, abstractC4386x02.b(a2), this.b.b().a()), c4227o2, g, false, 64, null), i);
    }

    private final void a(String str, String str2) {
        String i = wv8.i(str, " - item = ", str2);
        IronLog.INTERNAL.error(C4243p0.a(this.a, i, (String) null, 2, (Object) null));
        this.a.f().h().i(i);
    }
}
