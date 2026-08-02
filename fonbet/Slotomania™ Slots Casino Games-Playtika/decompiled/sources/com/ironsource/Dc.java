package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes4.dex */
public final class Dc extends Hg {
    private final V0 e;
    private final AbstractC2731x0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dc(V0 tools, AbstractC2731x0 adUnitData) {
        super(tools, adUnitData);
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.e = tools;
        this.f = adUnitData;
    }

    private final C2554n2 d() {
        return new C2554n2("", IronSourceNetworkBridge.jsonObjectInit(), null, 0, "");
    }

    private final Map<String, I> e() {
        Qf g = this.f.b().g();
        List<NetworkSettings> m = this.f.m();
        ArrayList<NetworkSettings> arrayList = new ArrayList();
        for (Object obj : m) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (g == null || g.a(networkSettings, this.f.b().a())) {
                if (!networkSettings.isBidder(this.f.b().a())) {
                    arrayList.add(obj);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (NetworkSettings networkSettings2 : arrayList) {
            Pair pair = TuplesKt.to(networkSettings2.getProviderInstanceName(), new I(this.e, this.f, networkSettings2));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    private final List<C2608q2> f() {
        Qf g = this.f.b().g();
        List<NetworkSettings> m = this.f.m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (g == null || g.a(networkSettings, this.f.b().a())) {
                if (!networkSettings.isBidder(this.f.b().a())) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C2608q2(((NetworkSettings) it.next()).getProviderInstanceName()));
        }
        return arrayList2;
    }

    @Override // com.ironsource.Hg
    public void a(E adInstanceFactory, Ig waterfallFetcherListener) {
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        Intrinsics.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        IronLog.INTERNAL.verbose(C2588p0.a(this.e, "auction disabled", (String) null, 2, (Object) null));
        a(waterfallFetcherListener, d(), adInstanceFactory);
    }

    public final void a(Ig waterfallFetcherListener, int i, String auctionFallback, String auctionId, E adInstanceFactory) {
        Intrinsics.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        a(waterfallFetcherListener, new C2554n2(auctionId, IronSourceNetworkBridge.jsonObjectInit(), null, i, auctionFallback), adInstanceFactory);
    }

    private final void a(Ig ig, C2554n2 c2554n2, E e) {
        IronLog.INTERNAL.verbose(C2588p0.a(this.e, (String) null, (String) null, 3, (Object) null));
        ig.a(Hg.a(this, f(), e(), c2554n2, e, null, 16, null));
    }
}
