package com.ironsource;

import com.ironsource.C2676u;
import com.ironsource.Fd;
import com.ironsource.InterfaceC2683u6;
import com.ironsource.T2;
import com.ironsource.Ta;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Ua extends C2566ne {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ua(C2566ne sdkConfig) {
        super(sdkConfig);
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
    }

    public final boolean a(String adUnitId, LevelPlay.AdFormat adFormat) {
        Map<String, Fd.b> a2;
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Fd.a aVar = h().d().a().get(adFormat);
        return (aVar == null || (a2 = aVar.a()) == null || !a2.containsKey(adUnitId)) ? false : true;
    }

    public final InterfaceC2683u6.a b(LevelPlay.AdFormat adFormat, String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        return new InterfaceC2683u6.a(a(adFormat, adUnitId));
    }

    public final C2440gd c(LevelPlay.AdFormat adFormat, String str) {
        C2440gd a2;
        H9 a3;
        String str2;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        int i = a.a[adFormat.ordinal()];
        if (i == 1) {
            C2405ee f = d().c().f();
            if (f == null || (a2 = f.a(str)) == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(a2, "getRewardedVideoPlacement(placementName)");
            return new C2440gd(a2.b(), a2.c(), a2.d(), a2.f(), a2.e(), a2.a());
        }
        if (i == 2) {
            D9 d = d().c().d();
            if (d == null || (a3 = d.a(str)) == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(a3, "getInterstitialPlacement(placementName)");
            return new C2440gd(a3);
        }
        if (i == 3) {
            U2 c = d().c().c();
            if (c == null) {
                throw new IllegalStateException("Error getting " + adFormat + " configurations");
            }
            C2394e3 a4 = c.a(str);
            if (a4 == null) {
                a4 = c.i();
                str2 = "config.defaultBannerPlacement";
            } else {
                str2 = "config.getBannerPlacemen…ig.defaultBannerPlacement";
            }
            Intrinsics.checkNotNullExpressionValue(a4, str2);
            return new C2440gd(a4);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Pb e = d().c().e();
        if (e != null && str != null) {
            C2331ac a5 = e.a(str);
            if (a5 == null) {
                a5 = e.e();
            }
            if (a5 != null) {
                return new C2440gd(a5);
            }
        }
        throw new IllegalStateException("Error getting " + adFormat + " configurations");
    }

    public final List<C2743xc> d(LevelPlay.AdFormat adFormat) {
        Map<String, Fd.b> a2;
        Set<String> keySet;
        List<C2743xc> distinct;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Fd.a aVar = h().d().a().get(adFormat);
        if (aVar != null && (a2 = aVar.a()) != null && (keySet = a2.keySet()) != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keySet, 10));
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(d(adFormat, (String) it.next()));
            }
            List flatten = CollectionsKt.flatten(arrayList);
            if (flatten != null && (distinct = CollectionsKt.distinct(flatten)) != null) {
                return distinct;
            }
        }
        return CollectionsKt.emptyList();
    }

    public final String j() {
        return h().a().b().c().a();
    }

    public final List<LevelPlayAdSize> k() {
        List<String> a2 = h().a().c().b().a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a2, 10));
        Iterator<T> it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release((String) it.next()));
        }
        return arrayList;
    }

    public final float l() {
        return h().a().c().b().b();
    }

    public final boolean m() {
        com.ironsource.mediationsdk.adquality.a a2 = d().c().a();
        return a2 != null && a2.b();
    }

    public final boolean n() {
        return h().a().b().e();
    }

    public final C2493jd b(C2688ub tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        return new C2493jd(tools, h().a().a());
    }

    public final long b(LevelPlay.AdFormat adFormat) {
        C2676u.d b;
        Long d;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        C2676u c2676u = h().a().a().get(adFormat);
        long longValue = (c2676u == null || (b = c2676u.b()) == null || (d = b.d()) == null) ? 60L : d.longValue();
        return longValue > 0 ? TimeUnit.MINUTES.toMillis(longValue) : longValue;
    }

    public final Ta.a a(String adUnitId) {
        long d;
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        T2 c = h().a().c();
        T2.b bVar = c.a().get(adUnitId);
        int c2 = bVar != null ? bVar.c() : c.b().c();
        boolean e = bVar != null ? bVar.e() : c.b().e();
        if (bVar != null) {
            d = bVar.d();
        } else {
            d = c.b().d();
        }
        return new Ta.a(e, c2, d);
    }

    public final List<String> a(LevelPlay.AdFormat adFormat) {
        Map<String, Fd.b> a2;
        Set<String> keySet;
        List<String> list;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Fd.a aVar = h().d().a().get(adFormat);
        return (aVar == null || (a2 = aVar.a()) == null || (keySet = a2.keySet()) == null || (list = CollectionsKt.toList(keySet)) == null) ? CollectionsKt.emptyList() : list;
    }

    public final C2695v0 a(C2688ub tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        return new C2695v0(tools, h().a().a());
    }

    private final InterfaceC2683u6.c a(LevelPlay.AdFormat adFormat, String str) {
        C2676u.d b;
        Ad g;
        Map<String, C2676u.d> a2;
        C2676u.d dVar;
        Ad g2;
        boolean z = adFormat == LevelPlay.AdFormat.REWARDED;
        C2676u c2676u = h().a().a().get(adFormat);
        InterfaceC2683u6.c cVar = null;
        InterfaceC2683u6.c a3 = (c2676u == null || (a2 = c2676u.a()) == null || (dVar = a2.get(str)) == null || (g2 = dVar.g()) == null) ? null : g2.a();
        if (c2676u != null && (b = c2676u.b()) != null && (g = b.g()) != null) {
            cVar = g.a();
        }
        if (a3 == null) {
            a3 = cVar;
        }
        if (a3 != null) {
            return a3;
        }
        if (z) {
            return InterfaceC2683u6.c.PROGRESSIVE_ON_SHOW_SUCCESS;
        }
        return InterfaceC2683u6.c.SINGLE;
    }

    public final Sd c(C2688ub tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        C2676u c2676u = h().a().a().get(LevelPlay.AdFormat.REWARDED);
        return new Sd(tools, c2676u != null ? c2676u.a() : null, c2676u != null ? c2676u.c() : null);
    }

    public final List<Fd.c> c(LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return h().d().a(adFormat);
    }

    public final List<C2743xc> d(LevelPlay.AdFormat adFormat, String adUnitId) {
        Map<String, Fd.b> a2;
        Fd.b bVar;
        List<String> a3;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Fd.a aVar = h().d().a().get(adFormat);
        if (aVar != null && (a2 = aVar.a()) != null && (bVar = a2.get(adUnitId)) != null && (a3 = bVar.a()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = a3.iterator();
            while (it.hasNext()) {
                C2743xc c2743xc = h().e().a().get((String) it.next());
                if (c2743xc != null) {
                    arrayList.add(c2743xc);
                }
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }
}
