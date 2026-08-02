package com.ironsource;

import com.ironsource.C4331u;
import com.ironsource.InterfaceC4196m7;
import com.unity3d.mediation.LevelPlay;
import defpackage.w2g;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.v0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4350v0 implements C3 {

    @NotNull
    private final C4325tb a;

    @NotNull
    private final Map<LevelPlay.AdFormat, C4331u> b;

    public C4350v0(@NotNull C4325tb c4325tb, @NotNull Map<LevelPlay.AdFormat, C4331u> map) {
        c4325tb.getClass();
        map.getClass();
        this.a = c4325tb;
        this.b = map;
    }

    private final void b(InterfaceC4196m7.a aVar, String str, C4331u.d dVar) {
        C3962ad e = dVar.e();
        if (e != null) {
            F3 f3 = F3.Pacing;
            a(aVar.a(str, f3, new C4371w3(e.a(), e.b(), e.c())), str, f3);
        }
    }

    @Override // com.ironsource.C3
    public void a(@NotNull InterfaceC4196m7.a aVar) {
        aVar.getClass();
        Iterator<Map.Entry<LevelPlay.AdFormat, C4331u>> it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, C4331u.d> entry : it.next().getValue().a().entrySet()) {
                String key = entry.getKey();
                C4331u.d value = entry.getValue();
                a(aVar, key, value);
                b(aVar, key, value);
            }
        }
    }

    private final void a(InterfaceC4196m7.a aVar, String str, C4331u.d dVar) {
        C4425z3 b = dVar.b();
        if (b != null) {
            F3 f3 = F3.ShowCount;
            a(aVar.a(str, f3, new C4371w3(b.a(), b.b(), b.c())), str, f3);
        }
    }

    private final void a(Object obj, String str, F3 f3) {
        Throwable a = w2g.a(obj);
        if (a != null) {
            this.a.a(str, new A3().a(f3), a.getMessage());
        }
    }
}
