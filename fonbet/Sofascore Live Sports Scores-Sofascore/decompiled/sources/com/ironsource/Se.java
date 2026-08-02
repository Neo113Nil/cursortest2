package com.ironsource;

import com.ironsource.AbstractC4402xg;
import com.ironsource.AbstractC4420yg;
import com.ironsource.M3;
import com.unity3d.mediation.LevelPlay;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Se {
    private final AbstractC4402xg a(M3 m3, Fd fd) {
        M3.a e = m3.e();
        if (e == null) {
            return null;
        }
        AbstractC4402xg a = a(LevelPlay.AdFormat.REWARDED, fd.h(), e.h());
        if (a != null) {
            return a;
        }
        AbstractC4402xg a2 = a(LevelPlay.AdFormat.INTERSTITIAL, fd.f(), e.f());
        if (a2 != null) {
            return a2;
        }
        AbstractC4402xg a3 = a(LevelPlay.AdFormat.BANNER, fd.e(), e.e());
        if (a3 != null) {
            return a3;
        }
        AbstractC4402xg a4 = a(LevelPlay.AdFormat.NATIVE_AD, fd.g(), e.g());
        if (a4 != null) {
            return a4;
        }
        return null;
    }

    @NotNull
    public final AbstractC4420yg a(@NotNull Qe qe) {
        qe.getClass();
        AbstractC4402xg a = a(qe.d(), qe.e());
        if (a == null) {
            return AbstractC4420yg.b.a;
        }
        return new AbstractC4420yg.a(a);
    }

    private final AbstractC4402xg a(LevelPlay.AdFormat adFormat, Map<String, ? extends List<String>> map, M3.a.InterfaceC0186a interfaceC0186a) {
        if (map == null) {
            return null;
        }
        Collection<? extends List<String>> values = map.values();
        if ((values instanceof Collection) && values.isEmpty()) {
            return null;
        }
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            if (!((List) it.next()).isEmpty()) {
                if (interfaceC0186a == null) {
                    return null;
                }
                List<M3.a.e> a = interfaceC0186a.a();
                if (a == null) {
                    return new AbstractC4402xg.b(adFormat);
                }
                if (a.isEmpty()) {
                    return new AbstractC4402xg.a(adFormat);
                }
                return null;
            }
        }
        return null;
    }
}
