package com.ironsource;

import com.ironsource.C2676u;
import com.ironsource.InterfaceC2595p7;
import com.unity3d.mediation.LevelPlay;
import java.util.Iterator;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.v0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2695v0 implements F3 {
    private final C2688ub a;
    private final Map<LevelPlay.AdFormat, C2676u> b;

    public C2695v0(C2688ub tools, Map<LevelPlay.AdFormat, C2676u> adFormatsConfigurations) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adFormatsConfigurations, "adFormatsConfigurations");
        this.a = tools;
        this.b = adFormatsConfigurations;
    }

    private final void b(InterfaceC2595p7.a aVar, String str, C2676u.d dVar) {
        C2332ad e = dVar.e();
        if (e != null) {
            I3 i3 = I3.Pacing;
            a(aVar.a(str, i3, new C2770z3(e.a(), e.b(), e.c())), str, i3);
        }
    }

    @Override // com.ironsource.F3
    public void a(InterfaceC2595p7.a cappingService) {
        Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        Iterator<Map.Entry<LevelPlay.AdFormat, C2676u>> it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, C2676u.d> entry : it.next().getValue().a().entrySet()) {
                String key = entry.getKey();
                C2676u.d value = entry.getValue();
                a(cappingService, key, value);
                b(cappingService, key, value);
            }
        }
    }

    private final void a(InterfaceC2595p7.a aVar, String str, C2676u.d dVar) {
        C3 b = dVar.b();
        if (b != null) {
            I3 i3 = I3.ShowCount;
            a(aVar.a(str, i3, new C2770z3(b.a(), b.b(), b.c())), str, i3);
        }
    }

    private final void a(Object obj, String str, I3 i3) {
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(obj);
        if (m11183exceptionOrNullimpl != null) {
            this.a.a(str, new D3().a(i3), m11183exceptionOrNullimpl.getMessage());
        }
    }
}
