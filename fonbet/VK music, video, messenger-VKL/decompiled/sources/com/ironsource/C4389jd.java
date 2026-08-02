package com.ironsource;

import com.ironsource.C4572u;
import com.ironsource.K7;
import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import kotlin.Result;

/* renamed from: com.ironsource.jd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4389jd {
    private final C4602vb a;
    private final Map<LevelPlay.AdFormat, C4572u> b;

    public C4389jd(C4602vb c4602vb, Map<LevelPlay.AdFormat, C4572u> map) {
        this.a = c4602vb;
        this.b = map;
    }

    private final void b(K7.a aVar, String str, LevelPlay.AdFormat adFormat, C4572u.d dVar) {
        I3 i3 = I3.Delivery;
        M4 c = dVar.c();
        a(aVar.a(str, adFormat, i3, new C4666z3(c != null ? Boolean.valueOf(c.a()) : null, null, null, 6, null)), str, adFormat, i3);
    }

    private final void c(K7.a aVar, String str, LevelPlay.AdFormat adFormat, C4572u.d dVar) {
        C4246bd e = dVar.e();
        if (e != null) {
            I3 i3 = I3.Pacing;
            a(aVar.a(str, adFormat, i3, new C4666z3(e.a(), e.b(), H3.Second)), str, adFormat, i3);
        }
    }

    public final void a(K7.a aVar) {
        for (Map.Entry<LevelPlay.AdFormat, C4572u> entry : this.b.entrySet()) {
            LevelPlay.AdFormat key = entry.getKey();
            for (Map.Entry<String, C4572u.d> entry2 : entry.getValue().c().entrySet()) {
                String key2 = entry2.getKey();
                C4572u.d value = entry2.getValue();
                b(aVar, key2, key, value);
                a(aVar, key2, key, value);
                c(aVar, key2, key, value);
            }
        }
    }

    private final void a(K7.a aVar, String str, LevelPlay.AdFormat adFormat, C4572u.d dVar) {
        C3 b = dVar.b();
        if (b != null) {
            I3 i3 = I3.ShowCount;
            a(aVar.a(str, adFormat, i3, new C4666z3(b.a(), b.b(), b.c())), str, adFormat, i3);
        }
    }

    private final void a(Object obj, String str, LevelPlay.AdFormat adFormat, I3 i3) {
        Throwable a = Result.a(obj);
        if (a != null) {
            this.a.a(str, adFormat, new D3().a(i3), a.getMessage());
        }
    }
}
