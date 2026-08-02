package J8;

import K8.k;
import android.content.Context;
import java.util.HashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static k f5963b;

    /* renamed from: f, reason: collision with root package name */
    public static Context f5967f;

    /* renamed from: a, reason: collision with root package name */
    public static final d f5962a = new d();

    /* renamed from: c, reason: collision with root package name */
    public static HashMap f5964c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static String f5965d = "CoreSDK";

    /* renamed from: e, reason: collision with root package name */
    public static String f5966e = "3.1.12";

    /* renamed from: g, reason: collision with root package name */
    public static HashMap f5968g = new HashMap();

    public final void a(Context context, String apiKey, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        f5967f = applicationContext;
        f5964c = MapsKt.hashMapOf(TuplesKt.to("X-GIPHY-SDK-VERSION", f5966e), TuplesKt.to("X-GIPHY-SDK-NAME", f5965d), TuplesKt.to("X-GIPHY-SDK-PLATFORM", "Android"), TuplesKt.to("X-GIPHY-UI-SDK-IS-EXTENSION", String.valueOf(e.f5969a.a(context))), TuplesKt.to("Accept-Encoding", "gzip,br"));
        E8.a aVar = E8.a.f3012a;
        aVar.h(f5964c);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
        aVar.a(applicationContext2, apiKey, z10);
        g(new k(apiKey, null, new F8.a(apiKey, true, z10), 2, null));
    }

    public final k b(String instanceName, String apiKey, boolean z10) {
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        k kVar = new k(apiKey, null, new F8.a(apiKey, false, z10), 2, null);
        f5968g.put(instanceName, kVar);
        return kVar;
    }

    public final HashMap c() {
        return f5964c;
    }

    public final k d() {
        k kVar = f5963b;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("apiClient");
        return null;
    }

    public final String e() {
        return f5965d;
    }

    public final String f() {
        return f5966e;
    }

    public final void g(k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        f5963b = kVar;
    }

    public final void h(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        f5965d = str;
    }

    public final void i(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        f5966e = str;
    }
}
