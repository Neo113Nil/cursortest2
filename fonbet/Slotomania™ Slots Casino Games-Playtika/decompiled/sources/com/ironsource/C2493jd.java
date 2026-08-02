package com.ironsource;

import com.ironsource.C2676u;
import com.ironsource.J7;
import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.jd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2493jd {
    private final C2688ub a;
    private final Map<LevelPlay.AdFormat, C2676u> b;

    public C2493jd(C2688ub tools, Map<LevelPlay.AdFormat, C2676u> adFormatsConfigurations) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adFormatsConfigurations, "adFormatsConfigurations");
        this.a = tools;
        this.b = adFormatsConfigurations;
    }

    private final void b(J7.a aVar, String str, LevelPlay.AdFormat adFormat, C2676u.d dVar) {
        I3 i3 = I3.Delivery;
        M4 c = dVar.c();
        a(aVar.a(str, adFormat, i3, new C2770z3(c != null ? Boolean.valueOf(c.a()) : null, null, null, 6, null)), str, adFormat, i3);
    }

    private final void c(J7.a aVar, String str, LevelPlay.AdFormat adFormat, C2676u.d dVar) {
        C2332ad e = dVar.e();
        if (e != null) {
            I3 i3 = I3.Pacing;
            a(aVar.a(str, adFormat, i3, new C2770z3(e.a(), e.b(), H3.Second)), str, adFormat, i3);
        }
    }

    public final void a(J7.a cappingService) {
        Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        for (Map.Entry<LevelPlay.AdFormat, C2676u> entry : this.b.entrySet()) {
            LevelPlay.AdFormat key = entry.getKey();
            for (Map.Entry<String, C2676u.d> entry2 : entry.getValue().c().entrySet()) {
                String key2 = entry2.getKey();
                C2676u.d value = entry2.getValue();
                b(cappingService, key2, key, value);
                a(cappingService, key2, key, value);
                c(cappingService, key2, key, value);
            }
        }
    }

    private final void a(J7.a aVar, String str, LevelPlay.AdFormat adFormat, C2676u.d dVar) {
        C3 b = dVar.b();
        if (b != null) {
            I3 i3 = I3.ShowCount;
            a(aVar.a(str, adFormat, i3, new C2770z3(b.a(), b.b(), b.c())), str, adFormat, i3);
        }
    }

    private final void a(Object obj, String str, LevelPlay.AdFormat adFormat, I3 i3) {
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(obj);
        if (m11183exceptionOrNullimpl != null) {
            this.a.a(str, adFormat, new D3().a(i3), m11183exceptionOrNullimpl.getMessage());
        }
    }
}
