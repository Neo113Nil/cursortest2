package com.ironsource;

import com.ironsource.C4331u;
import com.ironsource.Ed;
import com.ironsource.InterfaceC4320t6;
import com.ironsource.R2;
import com.ironsource.Ra;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import defpackage.ilg;
import defpackage.k13;
import defpackage.km5;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Sa extends C4185le {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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
    public Sa(@NotNull C4185le c4185le) {
        super(c4185le);
        c4185le.getClass();
    }

    private final InterfaceC4320t6.c a(LevelPlay.AdFormat adFormat, String str) {
        C4331u.d b;
        C4435zd g;
        Map<String, C4331u.d> a2;
        C4331u.d dVar;
        C4435zd g2;
        boolean z = adFormat == LevelPlay.AdFormat.REWARDED;
        C4331u c4331u = h().a().a().get(adFormat);
        InterfaceC4320t6.c cVar = null;
        InterfaceC4320t6.c a3 = (c4331u == null || (a2 = c4331u.a()) == null || (dVar = a2.get(str)) == null || (g2 = dVar.g()) == null) ? null : g2.a();
        if (c4331u != null && (b = c4331u.b()) != null && (g = b.g()) != null) {
            cVar = g.a();
        }
        if (a3 == null) {
            a3 = cVar;
        }
        return a3 != null ? a3 : z ? InterfaceC4320t6.c.PROGRESSIVE_ON_SHOW_SUCCESS : InterfaceC4320t6.c.SINGLE;
    }

    public final long b(@NotNull LevelPlay.AdFormat adFormat) {
        C4331u.d b;
        Long d;
        adFormat.getClass();
        C4331u c4331u = h().a().a().get(adFormat);
        long longValue = (c4331u == null || (b = c4331u.b()) == null || (d = b.d()) == null) ? 60L : d.longValue();
        return longValue > 0 ? TimeUnit.MINUTES.toMillis(longValue) : longValue;
    }

    @Nullable
    public final C4077fd c(@NotNull LevelPlay.AdFormat adFormat, @Nullable String str) {
        C4077fd a2;
        H9 a3;
        adFormat.getClass();
        int i = a.a[adFormat.ordinal()];
        if (i == 1) {
            C4042de f = d().c().f();
            if (f == null || (a2 = f.a(str)) == null) {
                return null;
            }
            return new C4077fd(a2.b(), a2.c(), a2.d(), a2.f(), a2.e(), a2.a());
        }
        if (i == 2) {
            D9 d = d().c().d();
            if (d == null || (a3 = d.a(str)) == null) {
                return null;
            }
            return new C4077fd(a3);
        }
        if (i == 3) {
            S2 c = d().c().c();
            if (c == null) {
                ilg.f(adFormat, " configurations", "Error getting ");
                return null;
            }
            C4013c3 a4 = c.a(str);
            if (a4 == null) {
                a4 = c.i();
                a4.getClass();
            }
            return new C4077fd(a4);
        }
        if (i != 4) {
            zzl.b();
            return null;
        }
        Pb e = d().c().e();
        if (e != null && str != null) {
            C3961ac a5 = e.a(str);
            if (a5 == null) {
                a5 = e.e();
            }
            if (a5 != null) {
                return new C4077fd(a5);
            }
        }
        ilg.f(adFormat, " configurations", "Error getting ");
        return null;
    }

    @NotNull
    public final List<C4398xc> d(@NotNull LevelPlay.AdFormat adFormat, @NotNull String str) {
        Map<String, Ed.b> a2;
        Ed.b bVar;
        List<String> a3;
        adFormat.getClass();
        str.getClass();
        Ed.a aVar = h().d().a().get(adFormat);
        if (aVar == null || (a2 = aVar.a()) == null || (bVar = a2.get(str)) == null || (a3 = bVar.a()) == null) {
            return km5.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = a3.iterator();
        while (it.hasNext()) {
            C4398xc c4398xc = h().e().a().get((String) it.next());
            if (c4398xc != null) {
                arrayList.add(c4398xc);
            }
        }
        return arrayList;
    }

    @Nullable
    public final String j() {
        return h().a().b().c().a();
    }

    @Nullable
    public final Set<String> k() {
        JSONArray e = h().a().b().d().e();
        if (e == null) {
            return null;
        }
        List<String> b = C4110ha.b(e);
        b.getClass();
        return CollectionsKt.W0(b);
    }

    @NotNull
    public final List<LevelPlayAdSize> l() {
        List<String> a2 = h().a().c().b().a();
        ArrayList arrayList = new ArrayList(k13.r(a2, 10));
        Iterator<T> it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release((String) it.next()));
        }
        return arrayList;
    }

    public final float m() {
        return h().a().c().b().b();
    }

    public final boolean n() {
        com.ironsource.mediationsdk.adquality.a a2 = d().c().a();
        return a2 != null && a2.b();
    }

    public final boolean o() {
        return h().a().b().e();
    }

    @NotNull
    public final C4131id b(@NotNull C4325tb c4325tb) {
        c4325tb.getClass();
        return new C4131id(c4325tb, h().a().a());
    }

    @InterfaceC4307sb
    @NotNull
    public final InterfaceC4320t6.a b(@NotNull LevelPlay.AdFormat adFormat, @NotNull String str) {
        adFormat.getClass();
        str.getClass();
        return new InterfaceC4320t6.a(a(adFormat, str));
    }

    @NotNull
    public final Ra.a a(@NotNull String str) {
        long d;
        str.getClass();
        R2 c = h().a().c();
        R2.b bVar = c.a().get(str);
        int c2 = bVar != null ? bVar.c() : c.b().c();
        boolean e = bVar != null ? bVar.e() : c.b().e();
        if (bVar != null) {
            d = bVar.d();
        } else {
            d = c.b().d();
        }
        return new Ra.a(e, c2, d);
    }

    @NotNull
    public final List<String> a(@NotNull LevelPlay.AdFormat adFormat) {
        Map<String, Ed.b> a2;
        Set<String> keySet;
        List<String> S0;
        adFormat.getClass();
        Ed.a aVar = h().d().a().get(adFormat);
        return (aVar == null || (a2 = aVar.a()) == null || (keySet = a2.keySet()) == null || (S0 = CollectionsKt.S0(keySet)) == null) ? km5.a : S0;
    }

    @NotNull
    public final C4350v0 a(@NotNull C4325tb c4325tb) {
        c4325tb.getClass();
        return new C4350v0(c4325tb, h().a().a());
    }

    @NotNull
    public final List<C4398xc> d(@NotNull LevelPlay.AdFormat adFormat) {
        Map<String, Ed.b> a2;
        Set<String> keySet;
        adFormat.getClass();
        Ed.a aVar = h().d().a().get(adFormat);
        if (aVar != null && (a2 = aVar.a()) != null && (keySet = a2.keySet()) != null) {
            ArrayList arrayList = new ArrayList(k13.r(keySet, 10));
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(d(adFormat, (String) it.next()));
            }
            List<C4398xc> S0 = CollectionsKt.S0(CollectionsKt.V0(k13.s(arrayList)));
            if (S0 != null) {
                return S0;
            }
        }
        return km5.a;
    }

    public final boolean a(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat) {
        Map<String, Ed.b> a2;
        str.getClass();
        adFormat.getClass();
        Ed.a aVar = h().d().a().get(adFormat);
        return (aVar == null || (a2 = aVar.a()) == null || !a2.containsKey(str)) ? false : true;
    }

    @NotNull
    public final Rd c(@NotNull C4325tb c4325tb) {
        c4325tb.getClass();
        C4331u c4331u = h().a().a().get(LevelPlay.AdFormat.REWARDED);
        return new Rd(c4325tb, c4331u != null ? c4331u.a() : null, c4331u != null ? c4331u.c() : null);
    }

    @NotNull
    public final List<Ed.c> c(@NotNull LevelPlay.AdFormat adFormat) {
        adFormat.getClass();
        return h().d().a(adFormat);
    }
}
