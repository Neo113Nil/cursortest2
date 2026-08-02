package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C2556n4;
import com.ironsource.InterfaceC2426g;
import com.ironsource.InterfaceC2444h;
import com.ironsource.Qc;
import com.ironsource.Rc;
import com.ironsource.X3;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.k;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface p {

    public interface b {

        public static final class a implements b {
            private final Rc a;
            private final InterfaceC2426g b;

            public a(Rc configurations, InterfaceC2426g intentFactory) {
                Intrinsics.checkNotNullParameter(configurations, "configurations");
                Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.a = configurations;
                this.b = intentFactory;
            }

            public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
                Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
                if (p1 == null) {
                    return;
                }
                BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.f);
                p0.startActivity(p1);
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, Qc openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                if (TextUtils.isEmpty(openUrl.d())) {
                    return new c.a("url is empty");
                }
                Intent a = this.b.a();
                a.setData(Uri.parse(openUrl.d()));
                String c = openUrl.c();
                if (c != null && c.length() != 0) {
                    a = a.setPackage(openUrl.c());
                    Intrinsics.checkNotNullExpressionValue(a, "this.setPackage(openUrl.packageName)");
                }
                if (!(context instanceof Activity)) {
                    a = a.addFlags(this.a.c());
                }
                Intrinsics.checkNotNullExpressionValue(a, "intentFactory\n          …ations.flags) else this }");
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, a);
                return c.b.a;
            }
        }

        /* renamed from: com.ironsource.sdk.controller.p$b$b, reason: collision with other inner class name */
        public static final class C0222b implements b {
            private final String a;

            public C0222b(String method) {
                Intrinsics.checkNotNullParameter(method, "method");
                this.a = method;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, Qc openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                return new c.a("method " + this.a + " is unsupported");
            }
        }

        public static final class c implements b {
            private final Rc a;
            private final InterfaceC2444h b;

            public c(Rc configurations, InterfaceC2444h intentFactory) {
                Intrinsics.checkNotNullParameter(configurations, "configurations");
                Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.a = configurations;
                this.b = intentFactory;
            }

            public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
                Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
                if (p1 == null) {
                    return;
                }
                BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.f);
                p0.startActivity(p1);
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, Qc openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new OpenUrlActivity.e(this.b).a(this.a.c()).a(openUrl.d()).b(true).c(true).a(context));
                return c.b.a;
            }
        }

        public static final class d implements b {
            private final Rc a;
            private final InterfaceC2444h b;

            public d(Rc configurations, InterfaceC2444h intentFactory) {
                Intrinsics.checkNotNullParameter(configurations, "configurations");
                Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
                this.a = configurations;
                this.b = intentFactory;
            }

            public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
                Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
                if (p1 == null) {
                    return;
                }
                BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.f);
                p0.startActivity(p1);
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, Qc openUrl) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(openUrl, "openUrl");
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new OpenUrlActivity.e(this.b).a(this.a.c()).a(openUrl.d()).a(this.a.d()).b(true).a(context));
                return c.b.a;
            }
        }

        c a(Context context, Qc qc);
    }

    public static abstract class c {

        public static final class a extends c {
            private final String a;

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.a;
            }

            public final String b() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.areEqual(this.a, ((a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "Error(errorMessage=" + this.a + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String errorMessage) {
                super(null);
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.a = errorMessage;
            }

            public final a a(String errorMessage) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                return new a(errorMessage);
            }

            public /* synthetic */ a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            public static /* synthetic */ a a(a aVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.a;
                }
                return aVar.a(str);
            }
        }

        public static final class b extends c {
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    c a(Context context, Qc qc);

    public static final class a implements p {
        private b a;

        public a(String method, Rc openUrlConfigurations, InterfaceC2444h activityIntentFactory, InterfaceC2426g actionIntentFactory) {
            b aVar;
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(openUrlConfigurations, "openUrlConfigurations");
            Intrinsics.checkNotNullParameter(activityIntentFactory, "activityIntentFactory");
            Intrinsics.checkNotNullParameter(actionIntentFactory, "actionIntentFactory");
            int hashCode = method.hashCode();
            if (hashCode == -1455867212) {
                if (method.equals(X3.i.J)) {
                    aVar = new b.a(openUrlConfigurations, actionIntentFactory);
                }
                aVar = new b.C0222b(method);
            } else if (hashCode != 109770977) {
                if (hashCode == 1224424441 && method.equals(X3.i.K)) {
                    aVar = new b.d(openUrlConfigurations, activityIntentFactory);
                }
                aVar = new b.C0222b(method);
            } else {
                if (method.equals(X3.i.U)) {
                    aVar = new b.c(openUrlConfigurations, activityIntentFactory);
                }
                aVar = new b.C0222b(method);
            }
            this.a = aVar;
        }

        @Override // com.ironsource.sdk.controller.p
        public c a(Context context, Qc openUrl) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(openUrl, "openUrl");
            try {
                return this.a.a(context, openUrl);
            } catch (Exception e) {
                C2556n4.d().a(e);
                String message = e.getMessage();
                String message2 = (message == null || message.length() == 0) ? "" : e.getMessage();
                Intrinsics.checkNotNull(message2);
                return new c.a(message2);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String method, Rc openUrlConfigurations) {
            this(method, openUrlConfigurations, new k.c(), new k.a());
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(openUrlConfigurations, "openUrlConfigurations");
        }
    }
}
