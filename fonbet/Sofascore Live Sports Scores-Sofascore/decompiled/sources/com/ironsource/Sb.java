package com.ironsource;

import android.app.Activity;
import com.ironsource.A8;
import com.ironsource.Tb;
import com.ironsource.U3;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.utils.Logger;
import defpackage.arg;
import defpackage.brg;
import defpackage.dmi;
import defpackage.zqg;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Sb implements Tb {

    @NotNull
    private final String a;

    @NotNull
    private final com.ironsource.sdk.controller.e b;

    @NotNull
    private final T8 c;

    @NotNull
    private final InterfaceC3993b1 d;
    private final String e;

    @Nullable
    private Tb.a f;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {

        @NotNull
        public static final a a = new a();

        @NotNull
        public static final String b = "nativeAd.load";

        @NotNull
        public static final String c = "nativeAd.loadReport";

        @NotNull
        public static final String d = "nativeAd.register";

        @NotNull
        public static final String e = "nativeAd.click";

        @NotNull
        public static final String f = "nativeAd.privacyClick";

        @NotNull
        public static final String g = "nativeAd.visibilityChanged";

        @NotNull
        public static final String h = "nativeAd.destroy";

        private a() {
        }
    }

    public Sb(@NotNull String str, @NotNull com.ironsource.sdk.controller.e eVar, @NotNull T8 t8, @NotNull InterfaceC3993b1 interfaceC3993b1) {
        str.getClass();
        eVar.getClass();
        t8.getClass();
        interfaceC3993b1.getClass();
        this.a = str;
        this.b = eVar;
        this.c = t8;
        this.d = interfaceC3993b1;
        this.e = "Sb";
        eVar.a(str, d());
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
        if (aVar.d().optBoolean("success", false)) {
            A8.b a2 = new A8.a(this.c, this.d).a(activity, aVar.d());
            a(a2, a2.a().h());
            return;
        }
        String optString = aVar.d().optString("reason", "failed to load native ad: unexpected error");
        Tb.a b2 = b();
        if (b2 != null) {
            optString.getClass();
            b2.a(optString);
        }
    }

    private final void b(f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.e, "failed to handle show on native ad: missing params");
            return;
        }
        if (aVar.d().optBoolean("success", false)) {
            Tb.a b = b();
            if (b != null) {
                b.a();
                return;
            }
            return;
        }
        String optString = aVar.d().optString("reason", "unexpected error");
        Logger.i(this.e, "failed to handle show on native ad: " + optString);
    }

    private final l.b d() {
        return new arg(this, 0);
    }

    private final JSONObject e() {
        JSONObject put = new JSONObject().put(f.b.g, a.e).put("sdkCallback", U3.h.U);
        put.getClass();
        return put;
    }

    @Override // com.ironsource.Tb
    public void c() {
        this.b.a(new f.c(this.a, a.f, new JSONObject()), (l.a) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Sb(String str, com.ironsource.sdk.controller.e eVar, T8 t8, InterfaceC3993b1 interfaceC3993b1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, eVar, t8, interfaceC3993b1);
        if ((i & 4) != 0) {
            t8 = new S8(null, 1, 0 == true ? 1 : 0);
        }
        if ((i & 8) != 0) {
            interfaceC3993b1 = C4143j8.a();
            interfaceC3993b1.getClass();
        }
    }

    @Override // com.ironsource.Tb
    @Nullable
    public Tb.a b() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Sb sb, f.a aVar) {
        sb.getClass();
        aVar.getClass();
        sb.b(aVar);
    }

    @Override // com.ironsource.Tb
    public void a(@NotNull Activity activity, @NotNull JSONObject jSONObject) {
        activity.getClass();
        jSONObject.getClass();
        this.b.a(activity);
        this.b.a(new f.c(this.a, a.b, jSONObject), new zqg(this, activity, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Sb sb, Activity activity, f.a aVar) {
        sb.getClass();
        activity.getClass();
        aVar.getClass();
        sb.a(activity, aVar);
    }

    @Override // com.ironsource.Tb
    public void a(@Nullable Tb.a aVar) {
        this.f = aVar;
    }

    private final void a(A8.b bVar, A8 a8) {
        this.b.a(new f.c(this.a, dmi.q("nativeAd.loadReport.", this.a), bVar.b()), new zqg(this, a8, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Sb sb, A8 a8, f.a aVar) {
        sb.getClass();
        a8.getClass();
        aVar.getClass();
        sb.a(a8, aVar);
    }

    private final void a(A8 a8, f.a aVar) {
        if (aVar.d() == null) {
            Tb.a b = b();
            if (b != null) {
                b.a("failed to load native ad: missing report params");
                return;
            }
            return;
        }
        if (!aVar.d().optBoolean("success", false)) {
            String optString = aVar.d().optString("reason", "failed to load native ad: unexpected error");
            Tb.a b2 = b();
            if (b2 != null) {
                optString.getClass();
                b2.a(optString);
                return;
            }
            return;
        }
        Tb.a b3 = b();
        if (b3 != null) {
            b3.a(a8);
        }
    }

    @Override // com.ironsource.Tb
    public void a() {
        this.b.a(new f.c(this.a, a.h, new JSONObject()), (l.a) null);
    }

    @Override // com.ironsource.Tb
    public void a(@NotNull D8 d8) {
        d8.getClass();
        JSONObject put = new JSONObject().put("assetViews", d8.t()).put("adViewClickCommand", e());
        String str = this.a;
        put.getClass();
        this.b.a(new f.c(str, a.d, put), (l.a) null);
    }

    @Override // com.ironsource.Tb
    public void a(@NotNull Dg dg) {
        dg.getClass();
        this.b.a(new f.c(this.a, a.g, dg.g()), new brg(this, 1));
    }

    @Override // com.ironsource.Tb
    public void a(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.b.a(new f.c(this.a, a.e, jSONObject), new brg(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Sb sb, f.a aVar) {
        sb.getClass();
        aVar.getClass();
        sb.a(aVar);
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
        Tb.a b = b();
        if (b != null) {
            b.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Sb sb, Lb lb) {
        sb.getClass();
        lb.getClass();
        if (Intrinsics.c(lb.e(), a.e)) {
            sb.a(lb);
        }
    }

    private final void a(Lb lb) {
        if (lb.f() == null) {
            Logger.i(this.e, "failed to handle click on native ad: missing params");
            return;
        }
        if (!lb.f().optBoolean("success", false)) {
            String optString = lb.f().optString("reason", "unexpected error");
            Logger.i(this.e, "failed to handle click on native ad: " + optString);
            return;
        }
        Tb.a b = b();
        if (b != null) {
            b.e();
        }
    }
}
