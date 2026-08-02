package com.ironsource;

import android.app.Activity;
import com.ironsource.D8;
import com.ironsource.Nb;
import com.ironsource.Tb;
import com.ironsource.Ub;
import com.ironsource.X3;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;
import xsna.epx;
import xsna.go9;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class Tb implements Ub {
    private final String a;
    private final com.ironsource.sdk.controller.e b;
    private final U8 c;
    private final InterfaceC4270d1 d;
    private final String e;
    private Ub.a f;

    public static final class a {
        public static final a a = new a();
        public static final String b = "nativeAd.load";
        public static final String c = "nativeAd.loadReport";
        public static final String d = "nativeAd.register";
        public static final String e = "nativeAd.click";
        public static final String f = "nativeAd.privacyClick";
        public static final String g = "nativeAd.visibilityChanged";
        public static final String h = "nativeAd.destroy";

        private a() {
        }
    }

    public Tb(String str, com.ironsource.sdk.controller.e eVar, U8 u8, InterfaceC4270d1 interfaceC4270d1) {
        this.a = str;
        this.b = eVar;
        this.c = u8;
        this.d = interfaceC4270d1;
        this.e = "Tb";
        eVar.a(str, d());
    }

    @Override // com.ironsource.Ub
    public void a(Ub.a aVar) {
        this.f = aVar;
    }

    @Override // com.ironsource.Ub
    public Ub.a b() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Tb tb, f.a aVar) {
        tb.b(aVar);
    }

    private final l.b d() {
        return new l.b() { // from class: xsna.n7o0
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(Nb nb) {
                Tb.a(Tb.this, nb);
            }
        };
    }

    private final JSONObject e() {
        return new JSONObject().put("command", a.e).put("sdkCallback", X3.h.U);
    }

    @Override // com.ironsource.Ub
    public void a(final Activity activity, JSONObject jSONObject) {
        this.b.a(activity);
        this.b.a(new f.c(this.a, a.b, jSONObject), new l.a() { // from class: xsna.p7o0
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                Tb.a(Tb.this, activity, aVar);
            }
        });
    }

    @Override // com.ironsource.Ub
    public void c() {
        this.b.a(new f.c(this.a, a.f, new JSONObject()), (l.a) null);
    }

    private final void b(f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.e, "failed to handle show on native ad: missing params");
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String optString = aVar.d().optString("reason", "unexpected error");
            Logger.i(this.e, "failed to handle show on native ad: " + optString);
            return;
        }
        Ub.a b = b();
        if (b != null) {
            b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Tb tb, Activity activity, f.a aVar) {
        tb.a(activity, aVar);
    }

    private final void a(Activity activity, f.a aVar) {
        if (aVar.d() == null) {
            Ub.a b = b();
            if (b != null) {
                b.a("failed to load native ad: missing params");
                return;
            }
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String optString = aVar.d().optString("reason", "failed to load native ad: unexpected error");
            Ub.a b2 = b();
            if (b2 != null) {
                b2.a(optString);
                return;
            }
            return;
        }
        D8.b a2 = new D8.a(this.c, this.d).a(activity, aVar.d());
        a(a2, a2.a().h());
    }

    public /* synthetic */ Tb(String str, com.ironsource.sdk.controller.e eVar, U8 u8, InterfaceC4270d1 interfaceC4270d1, int i, zcl zclVar) {
        this(str, eVar, (i & 4) != 0 ? new T8(null, 1, null) : u8, (i & 8) != 0 ? C4438m8.a() : interfaceC4270d1);
    }

    private final void a(D8.b bVar, final D8 d8) {
        this.b.a(new f.c(this.a, go9.b("nativeAd.loadReport.", this.a), bVar.b()), new l.a() { // from class: xsna.l7o0
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                Tb.a(Tb.this, d8, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Tb tb, D8 d8, f.a aVar) {
        tb.a(d8, aVar);
    }

    private final void a(D8 d8, f.a aVar) {
        if (aVar.d() == null) {
            Ub.a b = b();
            if (b != null) {
                b.a("failed to load native ad: missing report params");
                return;
            }
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String optString = aVar.d().optString("reason", "failed to load native ad: unexpected error");
            Ub.a b2 = b();
            if (b2 != null) {
                b2.a(optString);
                return;
            }
            return;
        }
        Ub.a b3 = b();
        if (b3 != null) {
            b3.a(d8);
        }
    }

    @Override // com.ironsource.Ub
    public void a() {
        this.b.a(new f.c(this.a, a.h, new JSONObject()), (l.a) null);
    }

    @Override // com.ironsource.Ub
    public void a(G8 g8) {
        this.b.a(new f.c(this.a, a.d, new JSONObject().put("assetViews", g8.t()).put("adViewClickCommand", e())), (l.a) null);
    }

    @Override // com.ironsource.Ub
    public void a(Gg gg) {
        this.b.a(new f.c(this.a, a.g, gg.g()), new l.a() { // from class: xsna.m7o0
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                Tb.b(Tb.this, aVar);
            }
        });
    }

    @Override // com.ironsource.Ub
    public void a(JSONObject jSONObject) {
        this.b.a(new f.c(this.a, a.e, jSONObject), new l.a() { // from class: xsna.o7o0
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                Tb.a(Tb.this, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Tb tb, f.a aVar) {
        tb.a(aVar);
    }

    private final void a(f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.e, "failed to handle click on native ad: missing params");
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String optString = aVar.d().optString("reason", "unexpected error");
            Logger.i(this.e, "failed to handle click on native ad: " + optString);
            return;
        }
        Ub.a b = b();
        if (b != null) {
            b.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Tb tb, Nb nb) {
        if (epx.f(nb.e(), a.e)) {
            tb.a(nb);
        }
    }

    private final void a(Nb nb) {
        if (nb.f() == null) {
            Logger.i(this.e, "failed to handle click on native ad: missing params");
            return;
        }
        if (!nb.f().optBoolean("success", false)) {
            String optString = nb.f().optString("reason", "unexpected error");
            Logger.i(this.e, "failed to handle click on native ad: " + optString);
            return;
        }
        Ub.a b = b();
        if (b != null) {
            b.e();
        }
    }
}
