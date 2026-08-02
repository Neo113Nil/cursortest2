package com.ironsource;

import com.ironsource.Q1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import defpackage.bf3;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* renamed from: com.ironsource.s2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4298s2 {

    @NotNull
    private final T0 a;

    @NotNull
    private final AbstractC4386x0 b;

    @NotNull
    private final com.ironsource.mediationsdk.e c;

    @NotNull
    private final C4066f2 d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.s2$a */
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

    public C4298s2(@NotNull T0 t0, @NotNull AbstractC4386x0 abstractC4386x0) {
        t0.getClass();
        abstractC4386x0.getClass();
        this.a = t0;
        this.b = abstractC4386x0;
        C4263q2 e = abstractC4386x0.e();
        String d = IronSourceUtils.d();
        d.getClass();
        com.ironsource.mediationsdk.e eVar = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(e, d));
        this.c = eVar;
        this.d = new C4066f2(t0, eVar);
    }

    private final com.ironsource.mediationsdk.h a(Q1 q1, int i) {
        com.ironsource.mediationsdk.h hVar = new com.ironsource.mediationsdk.h(this.b.b().a());
        hVar.b(IronSourceUtils.g());
        hVar.a(q1.d().a());
        hVar.a(q1.d().b());
        hVar.a(this.a.h());
        hVar.a(i);
        hVar.a(this.a.k());
        Rf g = this.b.b().g();
        hVar.e(g != null ? g.c() : false);
        hVar.a(this.b.b().d());
        B c2 = q1.d().c();
        hVar.d(c2 != null ? c2.p() : null);
        InterfaceC4120i2 i2 = this.a.i();
        if (i2 != null) {
            i2.a(hVar);
        }
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Q1 q1, InterfaceC4316t2 interfaceC4316t2) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(bf3.m("auction waterfallString = ", q1.d().d())));
        if (!q1.g()) {
            ironLog.verbose(a("auction failed - no candidates"));
            this.a.f().b().a(1005, "No candidates available for auctioning");
            interfaceC4316t2.a(A0.e(this.b.b().a()), "no available ad to load");
        } else {
            this.a.f().b().b(q1.d().d().toString());
            int g = this.a.g();
            this.c.a(ContextProvider.getInstance().getApplicationContext(), a(q1, g), new c(interfaceC4316t2, q1, q1.d().c()));
        }
    }

    private final InterfaceC4363vd c() {
        int i = a.a[this.b.b().e().ordinal()];
        if (i == 1) {
            return Ib.v.d().B();
        }
        if (i != 2) {
            return null;
        }
        return Ib.v.d().G();
    }

    private final C4088g6 d() {
        InterfaceC4363vd c2 = c();
        if (c2 != null) {
            return c2.a(this.b.b().c());
        }
        return null;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.s2$b */
    public static final class b implements Q1.d {
        final /* synthetic */ InterfaceC4316t2 b;

        public b(InterfaceC4316t2 interfaceC4316t2) {
            this.b = interfaceC4316t2;
        }

        @Override // com.ironsource.Q1.d
        public void a(@NotNull Q1 q1, @NotNull String str) {
            q1.getClass();
            str.getClass();
            C4298s2.this.b(q1, this.b);
        }

        @Override // com.ironsource.Q1.d
        public void a(@NotNull Q1 q1) {
            q1.getClass();
            C4298s2.this.b(q1, this.b);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.s2$c */
    public static final class c implements S1 {
        final /* synthetic */ InterfaceC4316t2 a;
        final /* synthetic */ Q1 b;
        final /* synthetic */ B c;

        public c(InterfaceC4316t2 interfaceC4316t2, Q1 q1, B b) {
            this.a = interfaceC4316t2;
            this.b = q1;
            this.c = b;
        }

        @Override // com.ironsource.S1
        public void a(@NotNull List<C4227o2> list, @NotNull String str, @Nullable C4227o2 c4227o2, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, int i, long j, int i2, @Nullable String str2) {
            list.getClass();
            str.getClass();
            this.a.a(list, this.b.c(), str, c4227o2, jSONObject, jSONObject2, i, j, i2, str2, this.c);
        }

        @Override // com.ironsource.S1
        public void a(int i, @Nullable String str, int i2, @NotNull String str2, long j) {
            str2.getClass();
            this.a.a(i, str, i2, str2, j, this.c);
        }
    }

    public void a(@NotNull InterfaceC4316t2 interfaceC4316t2) {
        interfaceC4316t2.getClass();
        IronLog.INTERNAL.verbose(a());
        this.a.f().b().a(this.b.b().d());
        a(new Q1(this.a, this.b, d()), interfaceC4316t2);
    }

    private final void a(Q1 q1, InterfaceC4316t2 interfaceC4316t2) {
        if (!q1.f()) {
            b(q1, interfaceC4316t2);
        } else {
            q1.a(new b(interfaceC4316t2));
        }
    }

    @NotNull
    public final C4066f2 b() {
        return this.d;
    }

    private final String a(String str) {
        return C4243p0.a(this.a, str, (String) null, 2, (Object) null);
    }

    private final String a() {
        return C4243p0.a(this.a, (String) null, (String) null, 2, (Object) null);
    }
}
