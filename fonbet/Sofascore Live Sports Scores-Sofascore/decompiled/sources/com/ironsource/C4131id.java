package com.ironsource;

import com.ironsource.C4331u;
import com.ironsource.H7;
import com.unity3d.mediation.LevelPlay;
import defpackage.w2g;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.id, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4131id {

    @NotNull
    private final C4325tb a;

    @NotNull
    private final Map<LevelPlay.AdFormat, C4331u> b;

    public C4131id(@NotNull C4325tb c4325tb, @NotNull Map<LevelPlay.AdFormat, C4331u> map) {
        c4325tb.getClass();
        map.getClass();
        this.a = c4325tb;
        this.b = map;
    }

    private final void b(H7.a aVar, String str, LevelPlay.AdFormat adFormat, C4331u.d dVar) {
        F3 f3 = F3.Delivery;
        J4 c = dVar.c();
        a(aVar.a(str, adFormat, f3, new C4371w3(c != null ? Boolean.valueOf(c.a()) : null, null, null, 6, null)), str, adFormat, f3);
    }

    private final void c(H7.a aVar, String str, LevelPlay.AdFormat adFormat, C4331u.d dVar) {
        C3962ad e = dVar.e();
        if (e != null) {
            F3 f3 = F3.Pacing;
            a(aVar.a(str, adFormat, f3, new C4371w3(e.a(), e.b(), E3.Second)), str, adFormat, f3);
        }
    }

    public final void a(@NotNull H7.a aVar) {
        aVar.getClass();
        for (Map.Entry<LevelPlay.AdFormat, C4331u> entry : this.b.entrySet()) {
            LevelPlay.AdFormat key = entry.getKey();
            for (Map.Entry<String, C4331u.d> entry2 : entry.getValue().c().entrySet()) {
                String key2 = entry2.getKey();
                C4331u.d value = entry2.getValue();
                b(aVar, key2, key, value);
                a(aVar, key2, key, value);
                c(aVar, key2, key, value);
            }
        }
    }

    private final void a(H7.a aVar, String str, LevelPlay.AdFormat adFormat, C4331u.d dVar) {
        C4425z3 b = dVar.b();
        if (b != null) {
            F3 f3 = F3.ShowCount;
            a(aVar.a(str, adFormat, f3, new C4371w3(b.a(), b.b(), b.c())), str, adFormat, f3);
        }
    }

    private final void a(Object obj, String str, LevelPlay.AdFormat adFormat, F3 f3) {
        Throwable a = w2g.a(obj);
        if (a != null) {
            this.a.a(str, adFormat, new A3().a(f3), a.getMessage());
        }
    }
}
