package com.ironsource;

import android.app.Activity;
import com.ironsource.C4492p8;
import com.ironsource.F8;
import com.ironsource.G8;
import com.ironsource.Ub;
import com.ironsource.X3;
import com.ironsource.sdk.IronSourceNetwork;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.UUID;
import org.json.JSONObject;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class B8 implements F8 {
    public static final a j = new a(null);
    private final String a;
    private final Ub b;
    private final InterfaceC4545s8 c;
    private D8 d;
    private String e;
    private String f;
    private Long g;
    private F8.a h;
    private G8 i;

    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final B8 a() {
            String uuid = UUID.randomUUID().toString();
            return new B8(uuid, new Tb(uuid, IronSourceNetwork.getControllerManager(), null, null, 12, null), new C4563t8());
        }

        private a() {
        }
    }

    public B8(String str, Ub ub, InterfaceC4545s8 interfaceC4545s8) {
        this.a = str;
        this.b = ub;
        this.c = interfaceC4545s8;
        ub.a(f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4527r8 d() {
        return new C4527r8().a(B5.x, this.f).a(B5.v, this.e).a(B5.w, C4492p8.e.NativeAd.toString()).a(B5.I, Long.valueOf(j()));
    }

    public static final B8 e() {
        return j.a();
    }

    private final b f() {
        return new b();
    }

    private final c g() {
        return new c();
    }

    private final long j() {
        Long l = this.g;
        if (l == null) {
            return -1L;
        }
        return Calendar.getInstance().getTimeInMillis() - l.longValue();
    }

    public final String h() {
        return this.e;
    }

    public final String i() {
        return this.f;
    }

    @Override // com.ironsource.F8
    public F8.a b() {
        return this.h;
    }

    @Override // com.ironsource.F8
    public D8 c() {
        return this.d;
    }

    public static final class b implements Ub.a {
        public b() {
        }

        @Override // com.ironsource.Ub.a
        public void a(D8 d8) {
            B8.this.d = d8;
            B8.this.c.a(C4355he.l, B8.this.d().a());
            F8.a b = B8.this.b();
            if (b != null) {
                b.onNativeAdLoadSuccess(d8);
            }
        }

        @Override // com.ironsource.Ub.a
        public void e() {
            F8.a b = B8.this.b();
            if (b != null) {
                b.onNativeAdClicked();
            }
        }

        @Override // com.ironsource.Ub.a
        public void a(String str) {
            B8.this.c.a(C4355he.g, B8.this.d().a(B5.A, str).a());
            F8.a b = B8.this.b();
            if (b != null) {
                b.onNativeAdLoadFailed(str);
            }
        }

        @Override // com.ironsource.Ub.a
        public void a() {
            F8.a b = B8.this.b();
            if (b != null) {
                b.onNativeAdShown();
            }
        }
    }

    @Override // com.ironsource.F8
    public void a(F8.a aVar) {
        this.h = aVar;
    }

    public static final class c implements G8.a {

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[G8.b.values().length];
                try {
                    iArr[G8.b.PrivacyIcon.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                a = iArr;
            }
        }

        public c() {
        }

        @Override // com.ironsource.G8.a
        public void a(G8.b bVar) {
            if (a.a[bVar.ordinal()] == 1) {
                B8.this.b.c();
            } else {
                B8.this.b.a(new JSONObject().put("viewName", bVar.b()));
            }
        }

        @Override // com.ironsource.G8.a
        public void a(Gg gg) {
            B8.this.b.a(gg);
        }
    }

    @Override // com.ironsource.F8
    public void a(Activity activity, JSONObject jSONObject) {
        this.g = Long.valueOf(Calendar.getInstance().getTimeInMillis());
        this.e = jSONObject.optString("demandSourceName");
        this.f = jSONObject.optString("inAppBidding");
        this.c.a(C4355he.f, d().a());
        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
        jSONObject2.put(X3.i.y0, String.valueOf(this.g));
        this.b.a(activity, jSONObject2);
    }

    public /* synthetic */ B8(String str, Ub ub, InterfaceC4545s8 interfaceC4545s8, int i, zcl zclVar) {
        this((i & 1) != 0 ? UUID.randomUUID().toString() : str, ub, interfaceC4545s8);
    }

    @Override // com.ironsource.F8
    public void a(G8 g8) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(d().a());
        linkedHashMap.put(B5.y, g8.t().toString());
        this.c.a(C4355he.n, linkedHashMap);
        this.i = g8;
        g8.a(g());
        this.b.a(g8);
    }

    @Override // com.ironsource.F8
    public void a() {
        G8 g8 = this.i;
        if (g8 != null) {
            g8.a((G8.a) null);
        }
        this.b.a();
    }
}
