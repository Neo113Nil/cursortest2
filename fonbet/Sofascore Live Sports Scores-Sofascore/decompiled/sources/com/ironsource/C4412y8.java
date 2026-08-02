package com.ironsource;

import android.app.Activity;
import com.ironsource.C4096ge;
import com.ironsource.C4197m8;
import com.ironsource.C8;
import com.ironsource.D8;
import com.ironsource.Tb;
import com.ironsource.U3;
import com.ironsource.sdk.IronSourceNetwork;
import defpackage.fc6;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.y8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4412y8 implements C8 {

    @NotNull
    public static final a j = new a(null);

    @NotNull
    private final String a;

    @NotNull
    private final Tb b;

    @NotNull
    private final InterfaceC4251p8 c;

    @Nullable
    private A8 d;

    @Nullable
    private String e;

    @Nullable
    private String f;

    @Nullable
    private Long g;

    @Nullable
    private C8.a h;

    @Nullable
    private D8 i;

    public C4412y8(@NotNull String str, @NotNull Tb tb, @NotNull InterfaceC4251p8 interfaceC4251p8) {
        str.getClass();
        tb.getClass();
        interfaceC4251p8.getClass();
        this.a = str;
        this.b = tb;
        this.c = interfaceC4251p8;
        tb.a(f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4233o8 d() {
        C4233o8 a2 = new C4233o8().a(C4427z5.x, this.f).a(C4427z5.v, this.e).a(C4427z5.w, C4197m8.e.NativeAd.toString()).a(C4427z5.I, Long.valueOf(j()));
        a2.getClass();
        return a2;
    }

    @NotNull
    public static final C4412y8 e() {
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

    @Override // com.ironsource.C8
    public void a(@NotNull Activity activity, @NotNull JSONObject jSONObject) {
        activity.getClass();
        jSONObject.getClass();
        this.g = Long.valueOf(Calendar.getInstance().getTimeInMillis());
        this.e = jSONObject.optString("demandSourceName");
        this.f = jSONObject.optString("inAppBidding");
        InterfaceC4251p8 interfaceC4251p8 = this.c;
        C4096ge.a aVar = C4096ge.f;
        aVar.getClass();
        HashMap<String, Object> a2 = d().a();
        a2.getClass();
        interfaceC4251p8.a(aVar, a2);
        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
        jSONObject2.put(U3.i.y0, String.valueOf(this.g));
        this.b.a(activity, jSONObject2);
    }

    @Nullable
    public final String h() {
        return this.e;
    }

    @Nullable
    public final String i() {
        return this.f;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.y8$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final C4412y8 a() {
            String C = fc6.C();
            com.ironsource.sdk.controller.e controllerManager = IronSourceNetwork.getControllerManager();
            controllerManager.getClass();
            return new C4412y8(C, new Sb(C, controllerManager, null, null, 12, null), new C4269q8());
        }

        private a() {
        }
    }

    @Override // com.ironsource.C8
    @Nullable
    public C8.a b() {
        return this.h;
    }

    @Override // com.ironsource.C8
    @Nullable
    public A8 c() {
        return this.d;
    }

    public /* synthetic */ C4412y8(String str, Tb tb, InterfaceC4251p8 interfaceC4251p8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? fc6.C() : str, tb, interfaceC4251p8);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.y8$b */
    public static final class b implements Tb.a {
        public b() {
        }

        @Override // com.ironsource.Tb.a
        public void a(@NotNull String str) {
            str.getClass();
            C4233o8 a = C4412y8.this.d().a(C4427z5.A, str);
            InterfaceC4251p8 interfaceC4251p8 = C4412y8.this.c;
            C4096ge.a aVar = C4096ge.g;
            aVar.getClass();
            HashMap<String, Object> a2 = a.a();
            a2.getClass();
            interfaceC4251p8.a(aVar, a2);
            C8.a b = C4412y8.this.b();
            if (b != null) {
                b.onNativeAdLoadFailed(str);
            }
        }

        @Override // com.ironsource.Tb.a
        public void e() {
            C8.a b = C4412y8.this.b();
            if (b != null) {
                b.onNativeAdClicked();
            }
        }

        @Override // com.ironsource.Tb.a
        public void a(@NotNull A8 a8) {
            a8.getClass();
            C4412y8.this.d = a8;
            InterfaceC4251p8 interfaceC4251p8 = C4412y8.this.c;
            C4096ge.a aVar = C4096ge.l;
            aVar.getClass();
            HashMap<String, Object> a = C4412y8.this.d().a();
            a.getClass();
            interfaceC4251p8.a(aVar, a);
            C8.a b = C4412y8.this.b();
            if (b != null) {
                b.onNativeAdLoadSuccess(a8);
            }
        }

        @Override // com.ironsource.Tb.a
        public void a() {
            C8.a b = C4412y8.this.b();
            if (b != null) {
                b.onNativeAdShown();
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.y8$c */
    public static final class c implements D8.a {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.y8$c$a */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[D8.b.values().length];
                try {
                    iArr[D8.b.PrivacyIcon.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                a = iArr;
            }
        }

        public c() {
        }

        @Override // com.ironsource.D8.a
        public void a(@NotNull D8.b bVar) {
            bVar.getClass();
            if (a.a[bVar.ordinal()] == 1) {
                C4412y8.this.b.c();
                return;
            }
            JSONObject put = new JSONObject().put("viewName", bVar.b());
            Tb tb = C4412y8.this.b;
            put.getClass();
            tb.a(put);
        }

        @Override // com.ironsource.D8.a
        public void a(@NotNull Dg dg) {
            dg.getClass();
            C4412y8.this.b.a(dg);
        }
    }

    @Override // com.ironsource.C8
    public void a(@Nullable C8.a aVar) {
        this.h = aVar;
    }

    @Override // com.ironsource.C8
    public void a(@NotNull D8 d8) {
        d8.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Object> a2 = d().a();
        a2.getClass();
        linkedHashMap.putAll(a2);
        String jSONObject = d8.t().toString();
        jSONObject.getClass();
        linkedHashMap.put(C4427z5.y, jSONObject);
        InterfaceC4251p8 interfaceC4251p8 = this.c;
        C4096ge.a aVar = C4096ge.n;
        aVar.getClass();
        interfaceC4251p8.a(aVar, linkedHashMap);
        this.i = d8;
        d8.a(g());
        this.b.a(d8);
    }

    @Override // com.ironsource.C8
    public void a() {
        D8 d8 = this.i;
        if (d8 != null) {
            d8.a((D8.a) null);
        }
        this.b.a();
    }
}
