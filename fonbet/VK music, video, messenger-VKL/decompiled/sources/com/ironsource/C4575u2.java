package com.ironsource;

import com.ironsource.S1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import org.json.JSONObject;
import xsna.t9c;

/* renamed from: com.ironsource.u2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4575u2 {
    private final V0 a;
    private final AbstractC4627x0 b;
    private final com.ironsource.mediationsdk.e c;
    private final C4343h2 d;

    /* renamed from: com.ironsource.u2$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* renamed from: com.ironsource.u2$b */
    public static final class b implements S1.d {
        final /* synthetic */ InterfaceC4593v2 b;

        public b(InterfaceC4593v2 interfaceC4593v2) {
            this.b = interfaceC4593v2;
        }

        @Override // com.ironsource.S1.d
        public void a(S1 s1) {
            C4575u2.this.b(s1, this.b);
        }

        @Override // com.ironsource.S1.d
        public void a(S1 s1, String str) {
            C4575u2.this.b(s1, this.b);
        }
    }

    public C4575u2(V0 v0, AbstractC4627x0 abstractC4627x0) {
        this.a = v0;
        this.b = abstractC4627x0;
        com.ironsource.mediationsdk.e eVar = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(abstractC4627x0.e(), IronSourceUtils.d()));
        this.c = eVar;
        this.d = new C4343h2(v0, eVar);
    }

    private final InterfaceC4622wd c() {
        int i = a.a[this.b.b().e().ordinal()];
        if (i == 1) {
            return Kb.u.d().B();
        }
        if (i != 2) {
            return null;
        }
        return Kb.u.d().F();
    }

    private final C4382j6 d() {
        InterfaceC4622wd c2 = c();
        if (c2 != null) {
            return c2.a(this.b.b().c());
        }
        return null;
    }

    public final C4343h2 b() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(S1 s1, InterfaceC4593v2 interfaceC4593v2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(t9c.b("auction waterfallString = ", s1.d().d())));
        if (!s1.g()) {
            ironLog.verbose(a("auction failed - no candidates"));
            this.a.d().b().a(1005, "No candidates available for auctioning");
            interfaceC4593v2.a(B0.e(this.b.b().a()), "no available ad to load");
        } else {
            this.a.d().b().b(s1.d().d().toString());
            int e = this.a.e();
            this.c.a(ContextProvider.getInstance().getApplicationContext(), a(s1, e), new c(interfaceC4593v2, s1, s1.d().c()));
        }
    }

    public void a(InterfaceC4593v2 interfaceC4593v2) {
        IronLog.INTERNAL.verbose(a());
        this.a.d().b().a(this.b.b().d());
        a(new S1(this.a, this.b, d()), interfaceC4593v2);
    }

    /* renamed from: com.ironsource.u2$c */
    public static final class c implements U1 {
        final /* synthetic */ InterfaceC4593v2 a;
        final /* synthetic */ S1 b;
        final /* synthetic */ B c;

        public c(InterfaceC4593v2 interfaceC4593v2, S1 s1, B b) {
            this.a = interfaceC4593v2;
            this.b = s1;
            this.c = b;
        }

        @Override // com.ironsource.U1
        public void a(List<C4504q2> list, String str, C4504q2 c4504q2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
            this.a.a(list, this.b.c(), str, c4504q2, jSONObject, jSONObject2, i, j, i2, str2, this.c);
        }

        @Override // com.ironsource.U1
        public void a(int i, String str, int i2, String str2, long j) {
            this.a.a(i, str, i2, str2, j, this.c);
        }
    }

    private final void a(S1 s1, InterfaceC4593v2 interfaceC4593v2) {
        if (!s1.f()) {
            b(s1, interfaceC4593v2);
        } else {
            s1.a(new b(interfaceC4593v2));
        }
    }

    private final com.ironsource.mediationsdk.h a(S1 s1, int i) {
        com.ironsource.mediationsdk.h hVar = new com.ironsource.mediationsdk.h(this.b.b().a());
        hVar.b(IronSourceUtils.g());
        hVar.a(s1.d().a());
        hVar.a(s1.d().b());
        hVar.a(this.a.g());
        hVar.a(i);
        hVar.a(this.a.j());
        Tf g = this.b.b().g();
        hVar.e(g != null ? g.c() : false);
        hVar.a(this.b.b().d());
        B c2 = s1.d().c();
        hVar.d(c2 != null ? c2.p() : null);
        InterfaceC4396k2 h = this.a.h();
        if (h != null) {
            h.a(hVar);
        }
        return hVar;
    }

    private final String a(String str) {
        return C4484p0.a(this.a, str, (String) null, 2, (Object) null);
    }

    private final String a() {
        return C4484p0.a(this.a, (String) null, (String) null, 2, (Object) null);
    }
}
