package com.ironsource;

import com.ironsource.AbstractC2693ug;
import com.ironsource.AbstractC2711vg;
import com.ironsource.P3;
import com.unity3d.mediation.LevelPlay;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Ue {
    public final AbstractC2711vg a(Se response) {
        Intrinsics.checkNotNullParameter(response, "response");
        AbstractC2693ug a = a(response.d(), response.e());
        return a == null ? AbstractC2711vg.b.a : new AbstractC2711vg.a(a);
    }

    private final AbstractC2693ug a(P3 p3, Gd gd) {
        P3.a e = p3.e();
        if (e == null) {
            return null;
        }
        AbstractC2693ug a = a(LevelPlay.AdFormat.REWARDED, gd.h(), e.h());
        if (a != null) {
            return a;
        }
        AbstractC2693ug a2 = a(LevelPlay.AdFormat.INTERSTITIAL, gd.f(), e.f());
        if (a2 != null) {
            return a2;
        }
        AbstractC2693ug a3 = a(LevelPlay.AdFormat.BANNER, gd.e(), e.e());
        if (a3 != null) {
            return a3;
        }
        AbstractC2693ug a4 = a(LevelPlay.AdFormat.NATIVE_AD, gd.g(), e.g());
        if (a4 != null) {
            return a4;
        }
        return null;
    }

    private final AbstractC2693ug a(LevelPlay.AdFormat adFormat, Map<String, ? extends List<String>> map, P3.a.InterfaceC0179a interfaceC0179a) {
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
                    if (interfaceC0179a != null) {
                        List<P3.a.e> a = interfaceC0179a.a();
                        if (a == null) {
                            return new AbstractC2693ug.b(adFormat);
                        }
                        if (a.isEmpty()) {
                            return new AbstractC2693ug.a(adFormat);
                        }
                    }
                }
            }
        }
        return null;
    }
}
