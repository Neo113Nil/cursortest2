package com.vk.superapp.advertisement;

import android.annotation.SuppressLint;
import com.vk.external.miniapp.net.ad.AdSlotSkipReason;
import com.vk.external.miniapp.net.ad.AdvertisementConfig;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.movika.sdk.base.ui.j;
import com.vk.superapp.advertisement.TimeoutConfig;
import com.vk.superapp.advertisement.a;
import com.vk.toggle.features.SaFeatures;
import defpackage.i0;
import defpackage.v;
import defpackage.z;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.single.d0;
import io.reactivex.rxjava3.internal.operators.single.o;
import io.reactivex.rxjava3.internal.operators.single.r;
import io.reactivex.rxjava3.internal.operators.single.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.ayi0;
import xsna.bpn0;
import xsna.bw;
import xsna.c5g;
import xsna.cex0;
import xsna.cw;
import xsna.e370;
import xsna.e40;
import xsna.f41;
import xsna.gi0;
import xsna.h41;
import xsna.hel0;
import xsna.hi0;
import xsna.ic;
import xsna.izs;
import xsna.j41;
import xsna.j5g;
import xsna.k41;
import xsna.m40;
import xsna.m41;
import xsna.mui0;
import xsna.n41;
import xsna.o41;
import xsna.ox0;
import xsna.p1;
import xsna.p41;
import xsna.pn00;
import xsna.pr0;
import xsna.q41;
import xsna.r41;
import xsna.s3q0;
import xsna.s41;
import xsna.s9l;
import xsna.sni;
import xsna.t40;
import xsna.u31;
import xsna.u41;
import xsna.vdx0;
import xsna.wxi0;
import xsna.wzs;
import xsna.xgx0;
import xsna.zs0;

/* compiled from: AdvertisementWaterfallImpl.kt */
/* loaded from: classes6.dex */
public final class b implements f41 {
    public static final long j = TimeUnit.MINUTES.toMillis(15);
    public final s9l a;
    public final sni b;
    public final bpn0 c;
    public final Map<Integer, hi0> d;
    public final ConcurrentHashMap<Integer, SkippedSlot> e;
    public final bpn0 f;
    public io.reactivex.rxjava3.subjects.d<AdvertisementConfig> g;
    public final io.reactivex.rxjava3.disposables.b h;
    public final AtomicReference<AdvertisementConfig> i;

    /* compiled from: AdvertisementWaterfallImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdvertisementType.values().length];
            try {
                iArr[AdvertisementType.REWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvertisementType.MULTI_INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvertisementType.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AdvertisementWaterfallImpl.kt */
    /* renamed from: com.vk.superapp.advertisement.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C1859b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((xgx0) this.receiver).getClass();
            xgx0.d(th);
            return s3q0.a;
        }
    }

    /* compiled from: AdvertisementWaterfallImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((xgx0) this.receiver).getClass();
            xgx0.d(th);
            return s3q0.a;
        }
    }

    /* compiled from: AdvertisementWaterfallImpl.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((xgx0) this.receiver).getClass();
            xgx0.d(th);
            return s3q0.a;
        }
    }

    public b(mui0 mui0Var) {
        s9l s9lVar = new s9l();
        sni sniVar = new sni(14);
        this.a = s9lVar;
        this.b = sniVar;
        this.c = new bpn0(new pr0(2));
        this.d = Collections.synchronizedMap(new LinkedHashMap());
        this.e = new ConcurrentHashMap<>();
        this.f = new bpn0(new ic(this, 2));
        this.g = io.reactivex.rxjava3.subjects.d.N0();
        this.h = new io.reactivex.rxjava3.disposables.b();
        this.i = new AtomicReference<>();
        if (mui0Var != null) {
            mui0Var.f(new ayi0() { // from class: xsna.i41
                @Override // xsna.ayi0
                public final void a(uxi0 uxi0Var) {
                    com.vk.superapp.advertisement.b bVar = com.vk.superapp.advertisement.b.this;
                    AtomicReference<AdvertisementConfig> atomicReference = bVar.i;
                    AdvertisementConfig advertisementConfig = atomicReference.get();
                    if (advertisementConfig == null || advertisementConfig.equals(AdvertisementConfig.a) || (new vxi0(uxi0Var).a() instanceof wxi0.c)) {
                        return;
                    }
                    atomicReference.set(null);
                    bVar.h.dispose();
                    bVar.g = io.reactivex.rxjava3.subjects.d.N0();
                    bVar.l();
                }
            });
        }
    }

    public static ArrayList C(AdvertisementConfig.SlotConfig slotConfig, int i) {
        if (slotConfig.f().isEmpty()) {
            List<Integer> d2 = slotConfig.d();
            ArrayList arrayList = new ArrayList(c5g.u(d2, 10));
            Iterator<T> it = d2.iterator();
            while (it.hasNext()) {
                arrayList.add(new a.C1856a(((Number) it.next()).intValue(), i, null));
            }
            return arrayList;
        }
        Map<Integer, String> f = slotConfig.f();
        ArrayList arrayList2 = new ArrayList(f.size());
        for (Map.Entry<Integer, String> entry : f.entrySet()) {
            arrayList2.add(new a.C1856a(entry.getKey().intValue(), i, entry.getValue()));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    public static List D(AdvertisementConfig.SlotConfig slotConfig, int i) {
        ?? failure;
        if (slotConfig.f().isEmpty()) {
            return E(slotConfig, i);
        }
        try {
            Map<Integer, String> f = slotConfig.f();
            failure = new ArrayList(f.size());
            for (Map.Entry<Integer, String> entry : f.entrySet()) {
                failure.add(new hel0(entry.getKey().intValue(), entry.getValue(), i));
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        boolean z = failure instanceof Result.Failure;
        List list = failure;
        if (z) {
            list = null;
        }
        List list2 = list;
        return list2 == null ? E(slotConfig, i) : list2;
    }

    public static final ArrayList E(AdvertisementConfig.SlotConfig slotConfig, int i) {
        List<Integer> d2 = slotConfig.d();
        ArrayList arrayList = new ArrayList(c5g.u(d2, 10));
        Iterator<T> it = d2.iterator();
        while (it.hasNext()) {
            arrayList.add(new hel0(((Number) it.next()).intValue(), null, i));
        }
        return arrayList;
    }

    public static Object r(boolean z, AdvertisementType advertisementType, Object obj, wzs wzsVar) {
        return (z && advertisementType == AdvertisementType.REWARD) ? wzsVar.invoke(AdvertisementType.MULTI_INTERSTITIAL, Boolean.TRUE) : (z || advertisementType != AdvertisementType.REWARD) ? (z && advertisementType == AdvertisementType.MULTI_INTERSTITIAL) ? wzsVar.invoke(AdvertisementType.INTERSTITIAL, Boolean.FALSE) : obj : wzsVar.invoke(AdvertisementType.INTERSTITIAL, Boolean.FALSE);
    }

    public static com.vk.superapp.advertisement.a t(AdvertisementConfig advertisementConfig, List list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        List<AdvertisementConfig.ConfigItem> a2 = advertisementConfig.a();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : a2) {
            if (list.contains(Integer.valueOf(((AdvertisementConfig.ConfigItem) obj2).c()))) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            Iterator it2 = arrayList4.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((AdvertisementConfig.ConfigItem) obj).c() == intValue) {
                    break;
                }
            }
            AdvertisementConfig.ConfigItem configItem = (AdvertisementConfig.ConfigItem) obj;
            if (configItem != null) {
                arrayList5.add(configItem);
            }
        }
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            AdvertisementConfig.ConfigItem configItem2 = (AdvertisementConfig.ConfigItem) it3.next();
            int c2 = configItem2.c();
            arrayList.addAll(C(configItem2.f(), c2));
            arrayList2.addAll(C(configItem2.d(), c2));
            arrayList3.addAll(C(configItem2.e(), c2));
        }
        return new com.vk.superapp.advertisement.a(arrayList, arrayList3, arrayList2);
    }

    public final y A(AdvertisementType advertisementType, WebAdConfig webAdConfig) {
        return new io.reactivex.rxjava3.internal.operators.single.c(new h41(this)).l(new r41(new p1(webAdConfig, this), 0)).l(new s41(new t40(advertisementType, 1), 0));
    }

    public final boolean B() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // xsna.f41
    public final long a(AdvertisementType advertisementType, long j2) {
        return u().a(advertisementType, j2);
    }

    @Override // xsna.f41
    public final void b() {
        this.e.clear();
        u().b();
    }

    @Override // xsna.f41
    public final void c(AdvertisementType advertisementType, long j2, int i) {
        int i2;
        List<AdvertisementConfig.ConfigItem> a2;
        Object obj;
        u31 u = u();
        AdvertisementConfig v = v();
        if (v != null && (a2 = v.a()) != null) {
            Iterator<T> it = a2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((AdvertisementConfig.ConfigItem) obj).c() == i) {
                        break;
                    }
                }
            }
            AdvertisementConfig.ConfigItem configItem = (AdvertisementConfig.ConfigItem) obj;
            if (configItem != null) {
                int i3 = a.$EnumSwitchMapping$0[advertisementType.ordinal()];
                if (i3 == 1) {
                    i2 = configItem.f().b();
                } else if (i3 == 2) {
                    i2 = configItem.e().b();
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = configItem.d().b();
                }
                u.c(advertisementType, j2, i2);
            }
        }
        i2 = 0;
        u.c(advertisementType, j2, i2);
    }

    @Override // xsna.f41
    public final Map<Integer, hi0> d() {
        Map<Integer, hi0> t;
        synchronized (this.d) {
            t = pn00.t(this.d);
            if (t.isEmpty()) {
                t = null;
            }
        }
        this.d.clear();
        return t;
    }

    @Override // xsna.f41
    public final void e(AdvertisementType advertisementType, WebAdConfig webAdConfig, boolean z, int i) {
        this.h.b(A(advertisementType, webAdConfig).subscribe(new bw(new m41(z, this, advertisementType, i, webAdConfig), 2), new cw(new C1859b(1, xgx0.a, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 1)));
    }

    @Override // xsna.f41
    public final r g(AdvertisementType advertisementType, WebAdConfig webAdConfig, boolean z, boolean z2) {
        return new r(A(advertisementType, webAdConfig), new j(new q41(advertisementType, z, this, z2, webAdConfig), 1));
    }

    @Override // xsna.f41
    public final void h(gi0.a aVar, WebAdConfig webAdConfig) {
        AdSlotSkipReason adSlotSkipReason;
        AdvertisementConfig.ConfigItem configItem;
        AdvertisementConfig.SlotConfig f;
        AdvertisementConfig.SlotConfig e;
        AdvertisementConfig.SlotConfig d2;
        List<AdvertisementConfig.ConfigItem> a2;
        Object obj;
        synchronized (this.d) {
            this.d.remove(Integer.valueOf(aVar.a));
            Map<Integer, hi0> map = this.d;
            Integer valueOf = Integer.valueOf(aVar.a);
            AdvertisementType advertisementType = aVar.c;
            adSlotSkipReason = AdSlotSkipReason.NETWORK_NO_AD;
            map.put(valueOf, new hi0(advertisementType, adSlotSkipReason));
            s3q0 s3q0Var = s3q0.a;
        }
        SkippedSlot skippedSlot = this.e.get(Integer.valueOf(aVar.a));
        if (skippedSlot == null) {
            skippedSlot = new SkippedSlot(null, null, null, null, 15, null);
        }
        SkippedSlot skippedSlot2 = skippedSlot;
        skippedSlot2.g(adSlotSkipReason);
        this.b.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        int i = aVar.d;
        Integer valueOf2 = (webAdConfig == null || i != webAdConfig.c || i == -1) ? webAdConfig != null ? Integer.valueOf(webAdConfig.b) : null : Integer.valueOf(i);
        AdvertisementConfig v = v();
        if (v == null || (a2 = v.a()) == null) {
            configItem = null;
        } else {
            Iterator<T> it = a2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                int c2 = ((AdvertisementConfig.ConfigItem) obj).c();
                if (valueOf2 != null && c2 == valueOf2.intValue()) {
                    break;
                }
            }
            configItem = (AdvertisementConfig.ConfigItem) obj;
        }
        int i2 = a.$EnumSwitchMapping$0[aVar.c.ordinal()];
        int i3 = 0;
        if (i2 == 1) {
            if (configItem != null && (f = configItem.f()) != null) {
                i3 = f.e();
            }
            skippedSlot2.h(new TimeoutConfig.b(currentTimeMillis + i3, null));
        } else if (i2 == 2) {
            if (configItem != null && (e = configItem.e()) != null) {
                i3 = e.e();
            }
            skippedSlot2.f(new TimeoutConfig.a(currentTimeMillis + i3, null));
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (configItem != null && (d2 = configItem.d()) != null) {
                i3 = d2.e();
            }
            skippedSlot2.e(new TimeoutConfig.a(currentTimeMillis + i3, null));
        }
        this.e.put(Integer.valueOf(aVar.a), skippedSlot2);
        u().f(this.e);
    }

    @Override // xsna.f41
    public final x<gi0> i(AdvertisementType advertisementType, List<Integer> list, boolean z, boolean z2) {
        Integer num;
        return (list == null || (num = (Integer) j5g.a0(list)) == null) ? x.k(gi0.b.a) : new r(s(num.intValue()), new m40(new n41(this, advertisementType, z, z2, list), 1));
    }

    @Override // xsna.f41
    public final void j() {
        this.h.e();
    }

    @Override // xsna.f41
    public final boolean k(AdvertisementType advertisementType, WebAdConfig webAdConfig) {
        List<AdvertisementConfig.ConfigItem> a2;
        Object obj;
        AdvertisementConfig v = v();
        if (v == null || (a2 = v.a()) == null) {
            return false;
        }
        Iterator<T> it = a2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AdvertisementConfig.ConfigItem) obj).c() == webAdConfig.b) {
                break;
            }
        }
        AdvertisementConfig.ConfigItem configItem = (AdvertisementConfig.ConfigItem) obj;
        if (configItem == null) {
            return false;
        }
        int i = a.$EnumSwitchMapping$0[advertisementType.ordinal()];
        if (i == 1) {
            List<Integer> d2 = configItem.f().d();
            if ((d2 instanceof Collection) && d2.isEmpty()) {
                return false;
            }
            Iterator<T> it2 = d2.iterator();
            while (it2.hasNext()) {
                if (((Number) it2.next()).intValue() == -1) {
                }
            }
            return false;
        }
        if (i != 3) {
            return false;
        }
        List<Integer> d3 = configItem.d().d();
        if ((d3 instanceof Collection) && d3.isEmpty()) {
            return false;
        }
        Iterator<T> it3 = d3.iterator();
        while (it3.hasNext()) {
            if (((Number) it3.next()).intValue() == -1) {
            }
        }
        return false;
        return true;
    }

    @Override // xsna.f41
    @SuppressLint({"CheckResult"})
    public final void l() {
        AdvertisementConfig advertisementConfig = this.i.get();
        if (advertisementConfig == null || advertisementConfig.equals(AdvertisementConfig.a)) {
            u().d(this.e);
            m();
            cex0 cex0Var = e370.s != null ? new cex0() : null;
            String key = (cex0Var == null || !cex0Var.a()) ? null : SaFeatures.STICKY_BANNER_NATIVE_AD.getKey();
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            x<AdvertisementConfig> m = vdx0Var.d().m(key);
            j41 j41Var = new j41(new v(1, this, key), 0);
            m.getClass();
            new d0(new o(m, j41Var), new e40(this, 2), null).subscribe(new z(new com.vk.movika.sdk.base.data.a(this, 4), 3), new k41(new d(1, xgx0.a, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 0));
        }
    }

    @Override // xsna.f41
    public final void m() {
        ConcurrentHashMap<Integer, SkippedSlot> concurrentHashMap = this.e;
        for (Map.Entry<Integer, SkippedSlot> entry : concurrentHashMap.entrySet()) {
            TimeoutConfig a2 = com.vk.superapp.advertisement.c.a(entry.getValue(), AdvertisementType.REWARD);
            sni sniVar = this.b;
            if (a2 != null ? a2.a(sniVar) : true) {
                entry.getValue().h(null);
            }
            TimeoutConfig a3 = com.vk.superapp.advertisement.c.a(entry.getValue(), AdvertisementType.INTERSTITIAL);
            if (a3 != null ? a3.a(sniVar) : true) {
                entry.getValue().e(null);
            }
            TimeoutConfig a4 = com.vk.superapp.advertisement.c.a(entry.getValue(), AdvertisementType.MULTI_INTERSTITIAL);
            if (a4 != null ? a4.a(sniVar) : true) {
                entry.getValue().f(null);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, SkippedSlot> entry2 : concurrentHashMap.entrySet()) {
            if (entry2.getValue().d() == null && entry2.getValue().a() == null && entry2.getValue().b() == null) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            concurrentHashMap.remove(((Map.Entry) it.next()).getKey());
        }
    }

    @Override // xsna.f41
    public final long n(AdvertisementType advertisementType, int i) {
        List<AdvertisementConfig.ConfigItem> a2;
        Object obj;
        int c2;
        this.b.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        AdvertisementConfig v = v();
        long j2 = j;
        if (v != null && (a2 = v.a()) != null) {
            Iterator<T> it = a2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((AdvertisementConfig.ConfigItem) obj).c() == i) {
                    break;
                }
            }
            AdvertisementConfig.ConfigItem configItem = (AdvertisementConfig.ConfigItem) obj;
            if (configItem != null) {
                int i2 = a.$EnumSwitchMapping$0[advertisementType.ordinal()];
                if (i2 == 1) {
                    c2 = configItem.f().c();
                } else if (i2 == 2) {
                    c2 = configItem.e().c();
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c2 = configItem.d().c();
                }
                if (c2 >= 0) {
                    j2 = c2;
                }
                return currentTimeMillis + j2;
            }
        }
        return currentTimeMillis + j2;
    }

    @Override // xsna.f41
    public final void o(AdvertisementType advertisementType, List<Integer> list, boolean z, int i) {
        Integer num = (Integer) j5g.a0(list);
        if (num != null) {
            this.h.b(s(num.intValue()).subscribe(new i0(new o41(this, i, advertisementType, z, list), 2), new p41(new c(1, xgx0.a, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 0)));
        }
    }

    public final boolean p(com.vk.superapp.advertisement.a aVar, int i, AdvertisementType advertisementType, boolean z) {
        Iterator<T> it = aVar.a(advertisementType).iterator();
        while (it.hasNext()) {
            int i2 = ((a.C1856a) it.next()).a;
            if (i2 == i) {
                return true;
            }
            if (q(advertisementType, i2, false)) {
                break;
            }
        }
        if (z) {
            return ((Boolean) r(B(), advertisementType, Boolean.FALSE, new zs0(this, aVar, i, 1))).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x001e, B:13:0x002c, B:16:0x0037, B:18:0x0047, B:19:0x004c, B:22:0x0033), top: B:10:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(AdvertisementType advertisementType, int i, boolean z) {
        AdSlotSkipReason c2;
        SkippedSlot skippedSlot = this.e.get(Integer.valueOf(i));
        boolean z2 = false;
        if (skippedSlot != null && com.vk.superapp.advertisement.c.a(skippedSlot, advertisementType) != null) {
            z2 = true;
        }
        if (z2 && skippedSlot != null) {
            synchronized (this.d) {
                try {
                    hi0 remove = this.d.remove(Integer.valueOf(i));
                    if (remove != null) {
                        c2 = remove.b;
                        if (c2 == null) {
                        }
                        this.d.put(Integer.valueOf(i), new hi0(advertisementType, c2));
                        if (!z) {
                            skippedSlot.g(AdSlotSkipReason.TIMEOUT);
                        }
                        s3q0 s3q0Var = s3q0.a;
                    }
                    c2 = skippedSlot.c();
                    this.d.put(Integer.valueOf(i), new hi0(advertisementType, c2));
                    if (!z) {
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return !z2;
    }

    public final x<com.vk.superapp.advertisement.a> s(int i) {
        if (i != -1) {
            return new io.reactivex.rxjava3.internal.operators.single.c(new h41(this)).l(new ox0(new u41(this, i), 1));
        }
        EmptyList emptyList = EmptyList.b;
        return x.k(new com.vk.superapp.advertisement.a(emptyList, emptyList, emptyList));
    }

    public final u31 u() {
        return (u31) this.f.getValue();
    }

    public final AdvertisementConfig v() {
        AtomicReference<AdvertisementConfig> atomicReference = this.i;
        AdvertisementConfig advertisementConfig = atomicReference.get();
        if (advertisementConfig != null) {
            return advertisementConfig;
        }
        u31 u = u();
        cex0 cex0Var = e370.s != null ? new cex0() : null;
        AdvertisementConfig i = u.i((cex0Var == null || !cex0Var.a()) ? null : SaFeatures.STICKY_BANNER_NATIVE_AD.getKey());
        if (i == null) {
            i = AdvertisementConfig.a;
        }
        AdvertisementConfig advertisementConfig2 = i;
        while (!atomicReference.compareAndSet(null, advertisementConfig2)) {
            if (atomicReference.get() != null) {
                return atomicReference.get();
            }
        }
        return advertisementConfig2;
    }

    public final AdvertisementConfig.SlotConfig w(WebAdConfig webAdConfig) {
        List<AdvertisementConfig.ConfigItem> a2;
        Object obj;
        AdvertisementConfig v = v();
        if (v != null && (a2 = v.a()) != null) {
            Iterator<T> it = a2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                AdvertisementConfig.ConfigItem configItem = (AdvertisementConfig.ConfigItem) obj;
                if (webAdConfig != null && configItem.c() == webAdConfig.b) {
                    break;
                }
            }
            AdvertisementConfig.ConfigItem configItem2 = (AdvertisementConfig.ConfigItem) obj;
            if (configItem2 != null) {
                return configItem2.a();
            }
        }
        return null;
    }

    public final AdvertisementConfig.SlotConfig x(Integer num) {
        List<AdvertisementConfig.ConfigItem> a2;
        Object obj;
        AdvertisementConfig v = v();
        if (v != null && (a2 = v.a()) != null) {
            Iterator<T> it = a2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                int c2 = ((AdvertisementConfig.ConfigItem) obj).c();
                if (num != null && c2 == num.intValue()) {
                    break;
                }
            }
            AdvertisementConfig.ConfigItem configItem = (AdvertisementConfig.ConfigItem) obj;
            if (configItem != null) {
                return configItem.a();
            }
        }
        return null;
    }

    public final List<hel0> y(WebAdConfig webAdConfig) {
        List<AdvertisementConfig.ConfigItem> a2;
        Object obj;
        AdvertisementConfig.SlotConfig a3;
        if (webAdConfig == null) {
            return EmptyList.b;
        }
        int i = webAdConfig.b;
        AdvertisementConfig v = v();
        List<hel0> list = null;
        if (v != null && (a2 = v.a()) != null) {
            Iterator<T> it = a2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((AdvertisementConfig.ConfigItem) obj).c() == i) {
                    break;
                }
            }
            AdvertisementConfig.ConfigItem configItem = (AdvertisementConfig.ConfigItem) obj;
            if (configItem != null && (a3 = configItem.a()) != null) {
                list = D(a3, i);
            }
        }
        return list == null ? EmptyList.b : list;
    }

    public final gi0 z(final com.vk.superapp.advertisement.a aVar, AdvertisementType advertisementType, boolean z, final boolean z2) {
        Object obj;
        Iterator<T> it = aVar.a(advertisementType).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (q(advertisementType, ((a.C1856a) obj).a, z2)) {
                break;
            }
        }
        a.C1856a c1856a = (a.C1856a) obj;
        return c1856a != null ? new gi0.a(c1856a.a, c1856a.c, advertisementType, c1856a.b) : !z ? gi0.b.a : (gi0) r(B(), advertisementType, gi0.b.a, new wzs() { // from class: xsna.g41
            @Override // xsna.wzs
            public final Object invoke(Object obj2, Object obj3) {
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                return com.vk.superapp.advertisement.b.this.z(aVar, (AdvertisementType) obj2, booleanValue, z2);
            }
        });
    }

    @Override // xsna.f41
    public final b f() {
        return this;
    }

    @Override // xsna.f41
    public final b j0() {
        return this;
    }
}
