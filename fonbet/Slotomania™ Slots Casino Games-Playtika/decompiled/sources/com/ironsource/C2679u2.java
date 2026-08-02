package com.ironsource;

import com.ironsource.S1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.u2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2679u2 {
    private final V0 a;
    private final AbstractC2731x0 b;
    private final com.ironsource.mediationsdk.e c;
    private final C2447h2 d;

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
        final /* synthetic */ InterfaceC2697v2 b;

        b(InterfaceC2697v2 interfaceC2697v2) {
            this.b = interfaceC2697v2;
        }

        @Override // com.ironsource.S1.d
        public void a(S1 auction) {
            Intrinsics.checkNotNullParameter(auction, "auction");
            C2679u2.this.b(auction, this.b);
        }

        @Override // com.ironsource.S1.d
        public void a(S1 auction, String error) {
            Intrinsics.checkNotNullParameter(auction, "auction");
            Intrinsics.checkNotNullParameter(error, "error");
            C2679u2.this.b(auction, this.b);
        }
    }

    public C2679u2(V0 adTools, AbstractC2731x0 adUnitData) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.a = adTools;
        this.b = adUnitData;
        C2643s2 e = adUnitData.e();
        String d = IronSourceUtils.d();
        Intrinsics.checkNotNullExpressionValue(d, "getSessionId()");
        com.ironsource.mediationsdk.e eVar = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(e, d));
        this.c = eVar;
        this.d = new C2447h2(adTools, eVar);
    }

    private final InterfaceC2726wd c() {
        int i = a.a[this.b.b().e().ordinal()];
        if (i == 1) {
            return Jb.u.d().B();
        }
        if (i != 2) {
            return null;
        }
        return Jb.u.d().F();
    }

    private final C2451h6 d() {
        InterfaceC2726wd c2 = c();
        if (c2 != null) {
            return c2.a(this.b.b().c());
        }
        return null;
    }

    public final C2447h2 b() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(S1 s1, InterfaceC2697v2 interfaceC2697v2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("auction waterfallString = " + ((Object) s1.d().d())));
        if (!s1.g()) {
            ironLog.verbose(a("auction failed - no candidates"));
            this.a.e().b().a(1005, "No candidates available for auctioning");
            interfaceC2697v2.a(B0.e(this.b.b().a()), "no available ad to load");
        } else {
            this.a.e().b().b(s1.d().d().toString());
            this.c.a(ContextProvider.getInstance().getApplicationContext(), a(s1, this.a.f()), new c(interfaceC2697v2, s1, s1.d().c()));
        }
    }

    public void a(InterfaceC2697v2 completionListener) {
        Intrinsics.checkNotNullParameter(completionListener, "completionListener");
        IronLog.INTERNAL.verbose(a());
        this.a.e().b().a(this.b.b().d());
        a(new S1(this.a, this.b, d()), completionListener);
    }

    private final void a(S1 s1, InterfaceC2697v2 interfaceC2697v2) {
        if (!s1.f()) {
            b(s1, interfaceC2697v2);
        } else {
            s1.a(new b(interfaceC2697v2));
        }
    }

    /* renamed from: com.ironsource.u2$c */
    public static final class c implements U1 {
        final /* synthetic */ InterfaceC2697v2 a;
        final /* synthetic */ S1 b;
        final /* synthetic */ B c;

        c(InterfaceC2697v2 interfaceC2697v2, S1 s1, B b) {
            this.a = interfaceC2697v2;
            this.b = s1;
            this.c = b;
        }

        @Override // com.ironsource.U1
        public void a(List<C2608q2> newWaterfall, String auctionId, C2608q2 c2608q2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str) {
            Intrinsics.checkNotNullParameter(newWaterfall, "newWaterfall");
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            this.a.a(newWaterfall, this.b.c(), auctionId, c2608q2, jSONObject, jSONObject2, i, j, i2, str, this.c);
        }

        @Override // com.ironsource.U1
        public void a(int i, String str, int i2, String auctionFallback, long j) {
            Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
            this.a.a(i, str, i2, auctionFallback, j, this.c);
        }
    }

    private final com.ironsource.mediationsdk.h a(S1 s1, int i) {
        com.ironsource.mediationsdk.h hVar = new com.ironsource.mediationsdk.h(this.b.b().a());
        hVar.b(IronSourceUtils.g());
        hVar.a(s1.d().a());
        hVar.a(s1.d().b());
        hVar.a(this.a.h());
        hVar.a(i);
        hVar.a(this.a.k());
        Qf g = this.b.b().g();
        hVar.e(g != null ? g.c() : false);
        hVar.a(this.b.b().d());
        B c2 = s1.d().c();
        hVar.d(c2 != null ? c2.p() : null);
        InterfaceC2500k2 i2 = this.a.i();
        if (i2 != null) {
            i2.a(hVar);
        }
        return hVar;
    }

    private final String a(String str) {
        return C2588p0.a(this.a, str, (String) null, 2, (Object) null);
    }

    private final String a() {
        return C2588p0.a(this.a, (String) null, (String) null, 2, (Object) null);
    }
}
