package com.ironsource;

import com.ironsource.C4572u;
import com.ironsource.InterfaceC4509q7;
import com.unity3d.mediation.LevelPlay;
import java.util.Iterator;
import java.util.Map;
import kotlin.Result;

/* renamed from: com.ironsource.v0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4591v0 implements F3 {
    private final C4602vb a;
    private final Map<LevelPlay.AdFormat, C4572u> b;

    public C4591v0(C4602vb c4602vb, Map<LevelPlay.AdFormat, C4572u> map) {
        this.a = c4602vb;
        this.b = map;
    }

    private final void b(InterfaceC4509q7.a aVar, String str, C4572u.d dVar) {
        C4246bd e = dVar.e();
        if (e != null) {
            I3 i3 = I3.Pacing;
            a(aVar.a(str, i3, new C4666z3(e.a(), e.b(), e.c())), str, i3);
        }
    }

    @Override // com.ironsource.F3
    public void a(InterfaceC4509q7.a aVar) {
        Iterator<Map.Entry<LevelPlay.AdFormat, C4572u>> it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, C4572u.d> entry : it.next().getValue().a().entrySet()) {
                String key = entry.getKey();
                C4572u.d value = entry.getValue();
                a(aVar, key, value);
                b(aVar, key, value);
            }
        }
    }

    private final void a(InterfaceC4509q7.a aVar, String str, C4572u.d dVar) {
        C3 b = dVar.b();
        if (b != null) {
            I3 i3 = I3.ShowCount;
            a(aVar.a(str, i3, new C4666z3(b.a(), b.b(), b.c())), str, i3);
        }
    }

    private final void a(Object obj, String str, I3 i3) {
        Throwable a = Result.a(obj);
        if (a != null) {
            this.a.a(str, new D3().a(i3), a.getMessage());
        }
    }
}
