package com.ironsource;

import com.ironsource.Ag;
import com.ironsource.Bg;
import com.ironsource.P3;
import com.unity3d.mediation.LevelPlay;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public final class Ue {
    public final Bg a(Se se) {
        Ag a = a(se.d(), se.e());
        return a == null ? Bg.b.a : new Bg.a(a);
    }

    private final Ag a(P3 p3, Gd gd) {
        P3.a e = p3.e();
        if (e == null) {
            return null;
        }
        Ag a = a(LevelPlay.AdFormat.REWARDED, gd.h(), e.h());
        if (a != null) {
            return a;
        }
        Ag a2 = a(LevelPlay.AdFormat.INTERSTITIAL, gd.f(), e.f());
        if (a2 != null) {
            return a2;
        }
        Ag a3 = a(LevelPlay.AdFormat.BANNER, gd.e(), e.e());
        if (a3 != null) {
            return a3;
        }
        Ag a4 = a(LevelPlay.AdFormat.NATIVE_AD, gd.g(), e.g());
        if (a4 != null) {
            return a4;
        }
        return null;
    }

    private final Ag a(LevelPlay.AdFormat adFormat, Map<String, ? extends List<String>> map, P3.a.InterfaceC0204a interfaceC0204a) {
        if (map == null) {
            return null;
        }
        Collection<? extends List<String>> values = map.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator<T> it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((List) it.next()).isEmpty()) {
                    if (interfaceC0204a != null) {
                        List<P3.a.e> a = interfaceC0204a.a();
                        if (a == null) {
                            return new Ag.b(adFormat);
                        }
                        if (a.isEmpty()) {
                            return new Ag.a(adFormat);
                        }
                    }
                }
            }
        }
        return null;
    }
}
