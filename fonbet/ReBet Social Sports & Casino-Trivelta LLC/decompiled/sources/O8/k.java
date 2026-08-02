package O8;

import android.content.Context;
import android.net.Uri;
import com.facebook.imagepipeline.request.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import y7.C6857a;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f8390a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f8391b = true;

    /* renamed from: c, reason: collision with root package name */
    public static S8.e f8392c = S8.d.f10680a;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f8393d;

    /* renamed from: e, reason: collision with root package name */
    public static o f8394e;

    /* renamed from: f, reason: collision with root package name */
    public static m f8395f;

    /* renamed from: g, reason: collision with root package name */
    public static Function3 f8396g;

    public static final class a implements m {
        @Override // O8.m
        public com.facebook.imagepipeline.request.b a(Uri source, Map headers, b.EnumC0484b cacheChoice) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(cacheChoice, "cacheChoice");
            return J8.b.f5959b.a(com.facebook.imagepipeline.request.c.x(source).A(cacheChoice), J8.d.f5962a.c());
        }
    }

    public static /* synthetic */ void c(k kVar, Context context, String str, boolean z10, HashMap hashMap, l lVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            hashMap = new HashMap();
        }
        HashMap hashMap2 = hashMap;
        if ((i10 & 16) != 0) {
            lVar = null;
        }
        kVar.b(context, str, z11, hashMap2, lVar);
    }

    public static final Response k(Interceptor.Chain chain) {
        Request.Builder newBuilder = chain.request().newBuilder();
        for (Map.Entry entry : J8.d.f5962a.c().entrySet()) {
            newBuilder.header((String) entry.getKey(), (String) entry.getValue());
        }
        return chain.proceed(newBuilder.build());
    }

    public static /* synthetic */ void m(k kVar, Context context, String str, boolean z10, HashMap hashMap, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            hashMap = new HashMap();
        }
        HashMap hashMap2 = hashMap;
        if ((i10 & 16) != 0) {
            z11 = true;
        }
        kVar.l(context, str, z12, hashMap2, z11);
    }

    public final synchronized void b(Context context, String apiKey, boolean z10, HashMap metadata, l lVar) {
        try {
            try {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(apiKey, "apiKey");
                Intrinsics.checkNotNullParameter(metadata, "metadata");
                f8395f = new a();
                m(this, context, apiKey, z10, metadata, false, 16, null);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized void d(Context context, String apiKey, boolean z10, HashMap metadata, m frescoImageRequestHandler) {
        try {
            try {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(apiKey, "apiKey");
                Intrinsics.checkNotNullParameter(metadata, "metadata");
                Intrinsics.checkNotNullParameter(frescoImageRequestHandler, "frescoImageRequestHandler");
                f8395f = frescoImageRequestHandler;
                l(context, apiKey, z10, metadata, false);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final boolean e() {
        return f8391b;
    }

    public final m f() {
        m mVar = f8395f;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("frescoImageRequestHandler");
        return null;
    }

    public final o g() {
        o oVar = f8394e;
        if (oVar != null) {
            return oVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recents");
        return null;
    }

    public final S8.e h() {
        return f8392c;
    }

    public final Function3 i() {
        return f8396g;
    }

    public final void j(Context context) {
        x6.d n10 = x6.d.m(context).o(419430400L).n();
        x6.d n11 = x6.d.m(context).o(262144000L).n();
        new HashSet().add(new J7.f());
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(new Interceptor() { // from class: O8.j
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                Response k10;
                k10 = k.k(chain);
                return k10;
            }
        });
        OkHttpClient okHttpClient = builder.build();
        Intrinsics.checkNotNullExpressionValue(okHttpClient, "okHttpClient");
        com.facebook.drawee.backends.pipeline.d.e(context, C6857a.a(context, okHttpClient).T(new J8.c(okHttpClient)).V(n10).S(n11).a());
    }

    public final void l(Context context, String str, boolean z10, HashMap hashMap, boolean z11) {
        if (!f8393d) {
            J8.d dVar = J8.d.f5962a;
            dVar.h(dVar.e() + ",UISDK");
            dVar.i(dVar.f() + ",2.3.17");
            if (hashMap.containsKey("RNSDK")) {
                dVar.h(dVar.e() + ",RNSDK");
                dVar.i(dVar.f() + ',' + ((String) MapsKt.getValue(hashMap, "RNSDK")));
            }
            if (hashMap.containsKey("FlutterSDK")) {
                dVar.h(dVar.e() + ",FlutterSDK");
                dVar.i(dVar.f() + ',' + ((String) MapsKt.getValue(hashMap, "FlutterSDK")));
            }
            if (z11) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                j(applicationContext);
            }
            N8.c.f7914q.a("UI-2.3.17");
            f8393d = true;
        }
        J8.d.f5962a.a(context, str, z10);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
        n(new o(applicationContext2));
    }

    public final void n(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<set-?>");
        f8394e = oVar;
    }

    public final void o(S8.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        f8392c = eVar;
    }

    public final void p(Function3 function3) {
        f8396g = function3;
    }
}
