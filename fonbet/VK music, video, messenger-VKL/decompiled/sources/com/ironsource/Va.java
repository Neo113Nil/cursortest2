package com.ironsource;

import com.ironsource.C4572u;
import com.ironsource.Fd;
import com.ironsource.InterfaceC4615w6;
import com.ironsource.T2;
import com.ironsource.Ua;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.j5g;

/* loaded from: classes13.dex */
public final class Va extends C4462ne {

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

    public Va(C4462ne c4462ne) {
        super(c4462ne);
    }

    public final boolean a(String str, LevelPlay.AdFormat adFormat) {
        Map<String, Fd.b> a2;
        Fd.a aVar = h().d().a().get(adFormat);
        return (aVar == null || (a2 = aVar.a()) == null || !a2.containsKey(str)) ? false : true;
    }

    public final InterfaceC4615w6.a b(LevelPlay.AdFormat adFormat, String str) {
        return new InterfaceC4615w6.a(a(adFormat, str));
    }

    public final C4336gd c(LevelPlay.AdFormat adFormat, String str) {
        C4336gd a2;
        I9 a3;
        int i = a.a[adFormat.ordinal()];
        if (i == 1) {
            C4301ee f = d().c().f();
            if (f == null || (a2 = f.a(str)) == null) {
                return null;
            }
            return new C4336gd(a2.b(), a2.c(), a2.d(), a2.f(), a2.e(), a2.a());
        }
        if (i == 2) {
            E9 d = d().c().d();
            if (d == null || (a3 = d.a(str)) == null) {
                return null;
            }
            return new C4336gd(a3);
        }
        if (i == 3) {
            U2 c = d().c().c();
            if (c != null) {
                C4290e3 a4 = c.a(str);
                if (a4 == null) {
                    a4 = c.i();
                }
                return new C4336gd(a4);
            }
            throw new IllegalStateException("Error getting " + adFormat + " configurations");
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Qb e = d().c().e();
        if (e != null && str != null) {
            C4245bc a5 = e.a(str);
            if (a5 == null) {
                a5 = e.e();
            }
            if (a5 != null) {
                return new C4336gd(a5);
            }
        }
        throw new IllegalStateException("Error getting " + adFormat + " configurations");
    }

    public final List<C4657yc> d(LevelPlay.AdFormat adFormat) {
        Map<String, Fd.b> a2;
        Set<String> keySet;
        Fd.a aVar = h().d().a().get(adFormat);
        if (aVar != null && (a2 = aVar.a()) != null && (keySet = a2.keySet()) != null) {
            ArrayList arrayList = new ArrayList(c5g.u(keySet, 10));
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(d(adFormat, (String) it.next()));
            }
            List<C4657yc> R = j5g.R(c5g.v(arrayList));
            if (R != null) {
                return R;
            }
        }
        return EmptyList.b;
    }

    public final String j() {
        return h().a().b().c().a();
    }

    public final List<LevelPlayAdSize> k() {
        List<String> a2 = h().a().c().b().a();
        ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
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

    public final C4389jd b(C4602vb c4602vb) {
        return new C4389jd(c4602vb, h().a().a());
    }

    public final long b(LevelPlay.AdFormat adFormat) {
        C4572u.d b;
        Long d;
        C4572u c4572u = h().a().a().get(adFormat);
        long longValue = (c4572u == null || (b = c4572u.b()) == null || (d = b.d()) == null) ? 60L : d.longValue();
        return longValue > 0 ? TimeUnit.MINUTES.toMillis(longValue) : longValue;
    }

    public final Ua.a a(String str) {
        long d;
        T2 c = h().a().c();
        T2.b bVar = c.a().get(str);
        int c2 = bVar != null ? bVar.c() : c.b().c();
        boolean e = bVar != null ? bVar.e() : c.b().e();
        if (bVar != null) {
            d = bVar.d();
        } else {
            d = c.b().d();
        }
        return new Ua.a(e, c2, d);
    }

    public final List<String> a(LevelPlay.AdFormat adFormat) {
        Map<String, Fd.b> a2;
        Set<String> keySet;
        List<String> O0;
        Fd.a aVar = h().d().a().get(adFormat);
        return (aVar == null || (a2 = aVar.a()) == null || (keySet = a2.keySet()) == null || (O0 = j5g.O0(keySet)) == null) ? EmptyList.b : O0;
    }

    public final List<C4657yc> d(LevelPlay.AdFormat adFormat, String str) {
        Map<String, Fd.b> a2;
        Fd.b bVar;
        List<String> a3;
        Fd.a aVar = h().d().a().get(adFormat);
        if (aVar != null && (a2 = aVar.a()) != null && (bVar = a2.get(str)) != null && (a3 = bVar.a()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = a3.iterator();
            while (it.hasNext()) {
                C4657yc c4657yc = h().e().a().get((String) it.next());
                if (c4657yc != null) {
                    arrayList.add(c4657yc);
                }
            }
            return arrayList;
        }
        return EmptyList.b;
    }

    public final C4591v0 a(C4602vb c4602vb) {
        return new C4591v0(c4602vb, h().a().a());
    }

    private final InterfaceC4615w6.c a(LevelPlay.AdFormat adFormat, String str) {
        C4572u.d b;
        Ad g;
        Map<String, C4572u.d> a2;
        C4572u.d dVar;
        Ad g2;
        boolean z = adFormat == LevelPlay.AdFormat.REWARDED;
        C4572u c4572u = h().a().a().get(adFormat);
        InterfaceC4615w6.c cVar = null;
        InterfaceC4615w6.c a3 = (c4572u == null || (a2 = c4572u.a()) == null || (dVar = a2.get(str)) == null || (g2 = dVar.g()) == null) ? null : g2.a();
        if (c4572u != null && (b = c4572u.b()) != null && (g = b.g()) != null) {
            cVar = g.a();
        }
        if (a3 == null) {
            a3 = cVar;
        }
        if (a3 != null) {
            return a3;
        }
        if (z) {
            return InterfaceC4615w6.c.PROGRESSIVE_ON_SHOW_SUCCESS;
        }
        return InterfaceC4615w6.c.SINGLE;
    }

    public final Sd c(C4602vb c4602vb) {
        C4572u c4572u = h().a().a().get(LevelPlay.AdFormat.REWARDED);
        return new Sd(c4602vb, c4572u != null ? c4572u.a() : null, c4572u != null ? c4572u.c() : null);
    }

    public final List<Fd.c> c(LevelPlay.AdFormat adFormat) {
        return h().d().a(adFormat);
    }
}
