package com.ironsource;

import android.app.Activity;
import com.ironsource.C2459he;
import com.ironsource.C2578o8;
import com.ironsource.E8;
import com.ironsource.F8;
import com.ironsource.Tb;
import com.ironsource.X3;
import com.ironsource.sdk.IronSourceNetwork;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class A8 implements E8 {
    public static final a j = new a(null);
    private final String a;
    private final Tb b;
    private final InterfaceC2631r8 c;
    private C8 d;
    private String e;
    private String f;
    private Long g;
    private E8.a h;
    private F8 i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final A8 a() {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            com.ironsource.sdk.controller.e controllerManager = IronSourceNetwork.getControllerManager();
            Intrinsics.checkNotNullExpressionValue(controllerManager, "controllerManager");
            return new A8(uuid, new Sb(uuid, controllerManager, null, null, 12, null), new C2649s8());
        }

        private a() {
        }
    }

    public A8(String id, Tb controller, InterfaceC2631r8 eventTracker) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.a = id;
        this.b = controller;
        this.c = eventTracker;
        controller.a(f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2614q8 d() {
        C2614q8 a2 = new C2614q8().a(B5.x, this.f).a(B5.v, this.e).a("producttype", C2578o8.e.NativeAd.toString()).a(B5.I, Long.valueOf(j()));
        Intrinsics.checkNotNullExpressionValue(a2, "ISNEventParams()\n       …CUSTOM_C, loadDuration())");
        return a2;
    }

    @JvmStatic
    public static final A8 e() {
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

    @Override // com.ironsource.E8
    public E8.a b() {
        return this.h;
    }

    @Override // com.ironsource.E8
    public C8 c() {
        return this.d;
    }

    public static final class b implements Tb.a {
        b() {
        }

        @Override // com.ironsource.Tb.a
        public void a(C8 adData) {
            Intrinsics.checkNotNullParameter(adData, "adData");
            A8.this.d = adData;
            InterfaceC2631r8 interfaceC2631r8 = A8.this.c;
            C2459he.a loadAdSuccess = C2459he.l;
            Intrinsics.checkNotNullExpressionValue(loadAdSuccess, "loadAdSuccess");
            HashMap<String, Object> a = A8.this.d().a();
            Intrinsics.checkNotNullExpressionValue(a, "baseEventParams().data");
            interfaceC2631r8.a(loadAdSuccess, a);
            E8.a b = A8.this.b();
            if (b != null) {
                b.onNativeAdLoadSuccess(adData);
            }
        }

        @Override // com.ironsource.Tb.a
        public void e() {
            E8.a b = A8.this.b();
            if (b != null) {
                b.onNativeAdClicked();
            }
        }

        @Override // com.ironsource.Tb.a
        public void a(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            C2614q8 a = A8.this.d().a(B5.A, reason);
            InterfaceC2631r8 interfaceC2631r8 = A8.this.c;
            C2459he.a loadAdFailed = C2459he.g;
            Intrinsics.checkNotNullExpressionValue(loadAdFailed, "loadAdFailed");
            HashMap<String, Object> a2 = a.a();
            Intrinsics.checkNotNullExpressionValue(a2, "eventParams.data");
            interfaceC2631r8.a(loadAdFailed, a2);
            E8.a b = A8.this.b();
            if (b != null) {
                b.onNativeAdLoadFailed(reason);
            }
        }

        @Override // com.ironsource.Tb.a
        public void a() {
            E8.a b = A8.this.b();
            if (b != null) {
                b.onNativeAdShown();
            }
        }
    }

    @Override // com.ironsource.E8
    public void a(E8.a aVar) {
        this.h = aVar;
    }

    @Override // com.ironsource.E8
    public void a(Activity activity, JSONObject loadParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        this.g = Long.valueOf(Calendar.getInstance().getTimeInMillis());
        this.e = loadParams.optString("demandSourceName");
        this.f = loadParams.optString("inAppBidding");
        InterfaceC2631r8 interfaceC2631r8 = this.c;
        C2459he.a loadAd = C2459he.f;
        Intrinsics.checkNotNullExpressionValue(loadAd, "loadAd");
        HashMap<String, Object> a2 = d().a();
        Intrinsics.checkNotNullExpressionValue(a2, "baseEventParams().data");
        interfaceC2631r8.a(loadAd, a2);
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(loadParams.toString());
        jsonObjectInit.put(X3.i.y0, String.valueOf(this.g));
        this.b.a(activity, jsonObjectInit);
    }

    public static final class c implements F8.a {

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[F8.b.values().length];
                try {
                    iArr[F8.b.PrivacyIcon.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                a = iArr;
            }
        }

        c() {
        }

        @Override // com.ironsource.F8.a
        public void a(F8.b viewName) {
            Intrinsics.checkNotNullParameter(viewName, "viewName");
            if (a.a[viewName.ordinal()] == 1) {
                A8.this.b.c();
                return;
            }
            JSONObject clickParams = IronSourceNetworkBridge.jsonObjectInit().put("viewName", viewName.b());
            Tb tb = A8.this.b;
            Intrinsics.checkNotNullExpressionValue(clickParams, "clickParams");
            tb.a(clickParams);
        }

        @Override // com.ironsource.F8.a
        public void a(Ag viewVisibilityParams) {
            Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
            A8.this.b.a(viewVisibilityParams);
        }
    }

    @Override // com.ironsource.E8
    public void a(F8 viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Object> a2 = d().a();
        Intrinsics.checkNotNullExpressionValue(a2, "baseEventParams().data");
        linkedHashMap.putAll(a2);
        String jSONObject = viewHolder.t().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "viewHolder.viewsStatus().toString()");
        linkedHashMap.put(B5.y, jSONObject);
        InterfaceC2631r8 interfaceC2631r8 = this.c;
        C2459he.a registerAd = C2459he.n;
        Intrinsics.checkNotNullExpressionValue(registerAd, "registerAd");
        interfaceC2631r8.a(registerAd, linkedHashMap);
        this.i = viewHolder;
        viewHolder.a(g());
        this.b.a(viewHolder);
    }

    @Override // com.ironsource.E8
    public void a() {
        F8 f8 = this.i;
        if (f8 != null) {
            f8.a((F8.a) null);
        }
        this.b.a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ A8(String str, Tb tb, InterfaceC2631r8 interfaceC2631r8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, tb, interfaceC2631r8);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
    }
}
