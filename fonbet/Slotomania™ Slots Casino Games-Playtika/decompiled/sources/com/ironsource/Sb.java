package com.ironsource;

import android.app.Activity;
import com.ironsource.C8;
import com.ironsource.Tb;
import com.ironsource.X3;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Sb implements Tb {
    private final String a;
    private final com.ironsource.sdk.controller.e b;
    private final T8 c;
    private final InterfaceC2374d1 d;
    private final String e;
    private Tb.a f;

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

    public Sb(String id, com.ironsource.sdk.controller.e controllerManager, T8 imageLoader, InterfaceC2374d1 adViewManagement) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(controllerManager, "controllerManager");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(adViewManagement, "adViewManagement");
        this.a = id;
        this.b = controllerManager;
        this.c = imageLoader;
        this.d = adViewManagement;
        this.e = "Sb";
        controllerManager.a(id, d());
    }

    private final l.b d() {
        return new l.b() { // from class: com.ironsource.Sb$$ExternalSyntheticLambda2
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(Mb mb) {
                Sb.a(Sb.this, mb);
            }
        };
    }

    private final JSONObject e() {
        JSONObject put = IronSourceNetworkBridge.jsonObjectInit().put(f.b.g, a.e).put("sdkCallback", X3.h.U);
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n        .pu…hods.ON_RECEIVED_MESSAGE)");
        return put;
    }

    @Override // com.ironsource.Tb
    public void a(Tb.a aVar) {
        this.f = aVar;
    }

    @Override // com.ironsource.Tb
    public Tb.a b() {
        return this.f;
    }

    @Override // com.ironsource.Tb
    public void c() {
        this.b.a(new f.c(this.a, a.f, IronSourceNetworkBridge.jsonObjectInit()), (l.a) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Sb this$0, f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.b(it);
    }

    @Override // com.ironsource.Tb
    public void a(final Activity activity, JSONObject loadParams) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loadParams, "loadParams");
        this.b.a(activity);
        this.b.a(new f.c(this.a, a.b, loadParams), new l.a() { // from class: com.ironsource.Sb$$ExternalSyntheticLambda1
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                Sb.a(Sb.this, activity, aVar);
            }
        });
    }

    private final void b(f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.e, "failed to handle show on native ad: missing params");
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            Logger.i(this.e, "failed to handle show on native ad: " + aVar.d().optString("reason", "unexpected error"));
        } else {
            Tb.a b = b();
            if (b != null) {
                b.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Sb this$0, Activity activity, f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(activity, it);
    }

    private final void a(Activity activity, f.a aVar) {
        if (aVar.d() == null) {
            Tb.a b = b();
            if (b != null) {
                b.a("failed to load native ad: missing params");
                return;
            }
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String reason = aVar.d().optString("reason", "failed to load native ad: unexpected error");
            Tb.a b2 = b();
            if (b2 != null) {
                Intrinsics.checkNotNullExpressionValue(reason, "reason");
                b2.a(reason);
                return;
            }
            return;
        }
        C8.b a2 = new C8.a(this.c, this.d).a(activity, aVar.d());
        a(a2, a2.a().h());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Sb(String str, com.ironsource.sdk.controller.e eVar, T8 t8, InterfaceC2374d1 interfaceC2374d1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, eVar, t8, interfaceC2374d1);
        t8 = (i & 4) != 0 ? new S8(null, 1, null) : t8;
        if ((i & 8) != 0) {
            interfaceC2374d1 = C2524l8.a();
            Intrinsics.checkNotNullExpressionValue(interfaceC2374d1, "getInstance()");
        }
    }

    private final void a(C8.b bVar, final C8 c8) {
        this.b.a(new f.c(this.a, "nativeAd.loadReport." + this.a, bVar.b()), new l.a() { // from class: com.ironsource.Sb$$ExternalSyntheticLambda4
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                Sb.a(Sb.this, c8, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Sb this$0, C8 adData, f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adData, "$adData");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(adData, it);
    }

    private final void a(C8 c8, f.a aVar) {
        if (aVar.d() == null) {
            Tb.a b = b();
            if (b != null) {
                b.a("failed to load native ad: missing report params");
                return;
            }
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String reason = aVar.d().optString("reason", "failed to load native ad: unexpected error");
            Tb.a b2 = b();
            if (b2 != null) {
                Intrinsics.checkNotNullExpressionValue(reason, "reason");
                b2.a(reason);
                return;
            }
            return;
        }
        Tb.a b3 = b();
        if (b3 != null) {
            b3.a(c8);
        }
    }

    @Override // com.ironsource.Tb
    public void a() {
        this.b.a(new f.c(this.a, a.h, IronSourceNetworkBridge.jsonObjectInit()), (l.a) null);
    }

    @Override // com.ironsource.Tb
    public void a(F8 viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        JSONObject params = IronSourceNetworkBridge.jsonObjectInit().put("assetViews", viewHolder.t()).put("adViewClickCommand", e());
        String str = this.a;
        Intrinsics.checkNotNullExpressionValue(params, "params");
        this.b.a(new f.c(str, a.d, params), (l.a) null);
    }

    @Override // com.ironsource.Tb
    public void a(Ag viewVisibilityParams) {
        Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
        this.b.a(new f.c(this.a, a.g, viewVisibilityParams.g()), new l.a() { // from class: com.ironsource.Sb$$ExternalSyntheticLambda0
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                Sb.b(Sb.this, aVar);
            }
        });
    }

    @Override // com.ironsource.Tb
    public void a(JSONObject clickParams) {
        Intrinsics.checkNotNullParameter(clickParams, "clickParams");
        this.b.a(new f.c(this.a, a.e, clickParams), new l.a() { // from class: com.ironsource.Sb$$ExternalSyntheticLambda3
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                Sb.a(Sb.this, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Sb this$0, f.a it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.a(it);
    }

    private final void a(f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.e, "failed to handle click on native ad: missing params");
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            Logger.i(this.e, "failed to handle click on native ad: " + aVar.d().optString("reason", "unexpected error"));
        } else {
            Tb.a b = b();
            if (b != null) {
                b.e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Sb this$0, Mb msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (Intrinsics.areEqual(msg.e(), a.e)) {
            this$0.a(msg);
        }
    }

    private final void a(Mb mb) {
        if (mb.f() == null) {
            Logger.i(this.e, "failed to handle click on native ad: missing params");
            return;
        }
        if (!mb.f().optBoolean("success", false)) {
            Logger.i(this.e, "failed to handle click on native ad: " + mb.f().optString("reason", "unexpected error"));
        } else {
            Tb.a b = b();
            if (b != null) {
                b.e();
            }
        }
    }
}
