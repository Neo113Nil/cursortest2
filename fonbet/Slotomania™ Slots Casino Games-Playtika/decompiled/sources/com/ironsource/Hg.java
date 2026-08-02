package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class Hg {
    public static final a d = new a(null);
    private final V0 a;
    private final AbstractC2731x0 b;
    private final Uc c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Hg a(V0 adTools, AbstractC2731x0 adUnitData) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            return adUnitData.t() ? new C2661t2(adTools, adUnitData) : new Dc(adTools, adUnitData);
        }

        private a() {
        }
    }

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

    public static final class c implements Uc {
        c() {
        }
    }

    public Hg(V0 adTools, AbstractC2731x0 adUnitData) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.a = adTools;
        this.b = adUnitData;
        this.c = new c();
    }

    private final InterfaceC2726wd b() {
        int i = b.a[this.b.b().a().ordinal()];
        if (i == 1) {
            return Jb.u.d().B();
        }
        if (i == 2) {
            return Jb.u.d().F();
        }
        IronLog.INTERNAL.warning(C2588p0.a(this.a, "Unable to reset preloaded instance", (String) null, 2, (Object) null));
        return null;
    }

    public Uc a() {
        return this.c;
    }

    public abstract void a(E e, Ig ig);

    protected final void c() {
        InterfaceC2726wd b2 = b();
        if (b2 == null) {
            return;
        }
        b2.a(this.b.b().c(), false);
    }

    public static /* synthetic */ Jg a(Hg hg, List list, Map map, C2554n2 c2554n2, E e, B b2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAdInstanceWaterfall");
        }
        if ((i & 16) != 0) {
            b2 = null;
        }
        return hg.a(list, map, c2554n2, e, b2);
    }

    public final Jg a(List<? extends C2608q2> waterfallItems, Map<String, I> adInstancePayloads, C2554n2 auctionData, E adInstanceFactory, B b2) {
        Intrinsics.checkNotNullParameter(waterfallItems, "waterfallItems");
        Intrinsics.checkNotNullParameter(adInstancePayloads, "adInstancePayloads");
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        IronLog.INTERNAL.verbose(C2588p0.a(this.a, "waterfall.size() = " + waterfallItems.size(), (String) null, 2, (Object) null));
        ArrayList arrayList = new ArrayList();
        int size = waterfallItems.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C2608q2 c2608q2 = waterfallItems.get(i);
            if (!z && b2 != null && Intrinsics.areEqual(b2.p(), c2608q2.c())) {
                b2.a(c2608q2);
                arrayList.add(b2);
                z = true;
            } else {
                B a2 = a(c2608q2, auctionData, adInstanceFactory, adInstancePayloads.get(c2608q2.c()));
                if (a2 != null && a2.g() != null) {
                    arrayList.add(a2);
                }
            }
        }
        if (b2 != null && !z) {
            c();
        }
        Jg jg = new Jg(arrayList);
        IronLog.INTERNAL.verbose(C2588p0.a(this.a, "updateWaterfall() - next waterfall is " + jg.d(), (String) null, 2, (Object) null));
        return jg;
    }

    private final B a(C2608q2 c2608q2, C2554n2 c2554n2, E e, I i) {
        AbstractC2731x0 abstractC2731x0 = this.b;
        String c2 = c2608q2.c();
        Intrinsics.checkNotNullExpressionValue(c2, "item.instanceName");
        NetworkSettings a2 = abstractC2731x0.a(c2);
        if (a2 == null) {
            String c3 = c2608q2.c();
            Intrinsics.checkNotNullExpressionValue(c3, "item.instanceName");
            a("Could not find matching provider settings for auction response item", c3);
            return null;
        }
        if (i == null) {
            String c4 = c2608q2.c();
            Intrinsics.checkNotNullExpressionValue(c4, "item.instanceName");
            a("Could not find matching adInstancePayload for auction response item", c4);
            return null;
        }
        com.ironsource.mediationsdk.c.b().b(a2, this.b.b().a(), this.b.b().b());
        int f = this.a.f();
        AbstractC2731x0 abstractC2731x02 = this.b;
        return e.a(new C(abstractC2731x02, a2, c2554n2, new C2392e1(a2, abstractC2731x02.b(a2), this.b.b().a()), c2608q2, f, false, 64, null), i);
    }

    private final void a(String str, String str2) {
        String str3 = str + " - item = " + str2;
        IronLog.INTERNAL.error(C2588p0.a(this.a, str3, (String) null, 2, (Object) null));
        this.a.e().h().i(str3);
    }
}
