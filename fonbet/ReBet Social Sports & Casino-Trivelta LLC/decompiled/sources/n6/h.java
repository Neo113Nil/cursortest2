package n6;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: u, reason: collision with root package name */
    public static h f57027u;

    /* renamed from: a, reason: collision with root package name */
    public final Context f57031a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f57032b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f57033c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f57034d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f57035e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f57036f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f57037g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f57038h;

    /* renamed from: i, reason: collision with root package name */
    public final Class f57039i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f57040j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f57041k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f57042l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f57043m;

    /* renamed from: n, reason: collision with root package name */
    public final Method f57044n;

    /* renamed from: o, reason: collision with root package name */
    public final Method f57045o;

    /* renamed from: p, reason: collision with root package name */
    public final Method f57046p;

    /* renamed from: q, reason: collision with root package name */
    public final l f57047q;

    /* renamed from: r, reason: collision with root package name */
    public final Set f57048r;

    /* renamed from: s, reason: collision with root package name */
    public static final b f57025s = new b(null);

    /* renamed from: t, reason: collision with root package name */
    public static final AtomicBoolean f57026t = new AtomicBoolean(false);

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicBoolean f57028v = new AtomicBoolean(false);

    /* renamed from: w, reason: collision with root package name */
    public static final Map f57029w = new ConcurrentHashMap();

    /* renamed from: x, reason: collision with root package name */
    public static final Map f57030x = new ConcurrentHashMap();

    public static final class a implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m10, Object[] objArr) {
            if (Y7.a.d(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(m10, "m");
                if (Intrinsics.areEqual(m10.getName(), "onBillingSetupFinished")) {
                    h.f57025s.f().set(true);
                } else {
                    String name = m10.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "m.name");
                    if (StringsKt.endsWith$default(name, "onBillingServiceDisconnected", false, 2, (Object) null)) {
                        h.f57025s.f().set(false);
                    }
                }
                return null;
            } catch (Throwable th2) {
                Y7.a.b(th2, this);
                return null;
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object a(Context context, Class cls) {
            Object e10;
            Object e11;
            Object e12;
            Class a10 = m.a("com.android.billingclient.api.BillingClient$Builder");
            Class a11 = m.a("com.android.billingclient.api.PurchasesUpdatedListener");
            if (a10 != null && a11 != null) {
                Method d10 = m.d(cls, "newBuilder", Context.class);
                Method d11 = m.d(a10, "enablePendingPurchases", new Class[0]);
                Method d12 = m.d(a10, "setListener", a11);
                Method d13 = m.d(a10, "build", new Class[0]);
                if (d10 == null || d11 == null || d12 == null || d13 == null || (e10 = m.e(cls, d10, null, context)) == null || (e11 = m.e(a10, d12, e10, Proxy.newProxyInstance(a11.getClassLoader(), new Class[]{a11}, new d()))) == null || (e12 = m.e(a10, d11, e11, new Object[0])) == null) {
                    return null;
                }
                return m.e(a10, d13, e12, new Object[0]);
            }
            return null;
        }

        public final void b(Context context) {
            l b10 = l.f57065g.b();
            if (b10 != null) {
                Class a10 = m.a("com.android.billingclient.api.BillingClient");
                Class a11 = m.a("com.android.billingclient.api.Purchase");
                Class a12 = m.a("com.android.billingclient.api.Purchase$PurchasesResult");
                Class a13 = m.a("com.android.billingclient.api.SkuDetails");
                Class a14 = m.a("com.android.billingclient.api.PurchaseHistoryRecord");
                Class a15 = m.a("com.android.billingclient.api.SkuDetailsResponseListener");
                Class a16 = m.a("com.android.billingclient.api.PurchaseHistoryResponseListener");
                if (a10 != null && a12 != null && a11 != null && a13 != null && a15 != null && a14 != null && a16 != null) {
                    Method d10 = m.d(a10, "queryPurchases", String.class);
                    Method d11 = m.d(a12, "getPurchasesList", new Class[0]);
                    Method d12 = m.d(a11, "getOriginalJson", new Class[0]);
                    Method d13 = m.d(a13, "getOriginalJson", new Class[0]);
                    Method d14 = m.d(a14, "getOriginalJson", new Class[0]);
                    Method d15 = m.d(a10, "querySkuDetailsAsync", b10.e(), a15);
                    Method d16 = m.d(a10, "queryPurchaseHistoryAsync", String.class, a16);
                    if (d10 != null && d11 != null && d12 != null && d13 != null && d14 != null && d15 != null && d16 != null) {
                        Object a17 = a(context, a10);
                        if (a17 == null) {
                            return;
                        }
                        h.m(new h(context, a17, a10, a12, a11, a13, a14, a15, a16, d10, d11, d12, d13, d14, d15, d16, b10, null));
                        h g10 = h.g();
                        if (g10 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
                        }
                        h.n(g10);
                    }
                }
            }
        }

        public final synchronized h c(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (h.f().get()) {
                return h.g();
            }
            b(context);
            h.f().set(true);
            return h.g();
        }

        public final Map d() {
            return h.h();
        }

        public final Map e() {
            return h.k();
        }

        public final AtomicBoolean f() {
            return h.l();
        }

        public b() {
        }
    }

    public final class c implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public Runnable f57049a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f57050b;

        public c(h this$0, Runnable runnable) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f57050b = this$0;
            this.f57049a = runnable;
        }

        public final void a(List list) {
            if (Y7.a.d(this)) {
                return;
            }
            try {
                for (Object obj : list) {
                    try {
                        m mVar = m.f57074a;
                        Object e10 = m.e(h.i(this.f57050b), h.c(this.f57050b), obj, new Object[0]);
                        String str = e10 instanceof String ? (String) e10 : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            jSONObject.put("packageName", h.b(this.f57050b).getPackageName());
                            if (jSONObject.has("productId")) {
                                String skuID = jSONObject.getString("productId");
                                h.e(this.f57050b).add(skuID);
                                Map d10 = h.f57025s.d();
                                Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                                d10.put(skuID, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f57049a.run();
            } catch (Throwable th2) {
                Y7.a.b(th2, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) {
            if (Y7.a.d(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(method, "method");
                if (Intrinsics.areEqual(method.getName(), "onPurchaseHistoryResponse")) {
                    Object obj = objArr == null ? null : objArr[1];
                    if (obj != null && (obj instanceof List)) {
                        a((List) obj);
                    }
                }
                return null;
            } catch (Throwable th2) {
                Y7.a.b(th2, this);
                return null;
            }
        }
    }

    public static final class d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m10, Object[] objArr) {
            if (Y7.a.d(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(m10, "m");
                return null;
            } catch (Throwable th2) {
                Y7.a.b(th2, this);
                return null;
            }
        }
    }

    public final class e implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public Runnable f57051a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f57052b;

        public e(h this$0, Runnable runnable) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f57052b = this$0;
            this.f57051a = runnable;
        }

        public final void a(List skuDetailsObjectList) {
            if (Y7.a.d(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(skuDetailsObjectList, "skuDetailsObjectList");
                for (Object obj : skuDetailsObjectList) {
                    try {
                        m mVar = m.f57074a;
                        Object e10 = m.e(h.j(this.f57052b), h.d(this.f57052b), obj, new Object[0]);
                        String str = e10 instanceof String ? (String) e10 : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has("productId")) {
                                String skuID = jSONObject.getString("productId");
                                Map e11 = h.f57025s.e();
                                Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                                e11.put(skuID, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f57051a.run();
            } catch (Throwable th2) {
                Y7.a.b(th2, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m10, Object[] objArr) {
            if (Y7.a.d(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                Intrinsics.checkNotNullParameter(m10, "m");
                if (Intrinsics.areEqual(m10.getName(), "onSkuDetailsResponse")) {
                    Object obj = objArr == null ? null : objArr[1];
                    if (obj != null && (obj instanceof List)) {
                        a((List) obj);
                    }
                }
                return null;
            } catch (Throwable th2) {
                Y7.a.b(th2, this);
                return null;
            }
        }
    }

    public /* synthetic */ h(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, lVar);
    }

    public static final /* synthetic */ Context b(h hVar) {
        if (Y7.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.f57031a;
        } catch (Throwable th2) {
            Y7.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Method c(h hVar) {
        if (Y7.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.f57044n;
        } catch (Throwable th2) {
            Y7.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Method d(h hVar) {
        if (Y7.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.f57043m;
        } catch (Throwable th2) {
            Y7.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Set e(h hVar) {
        if (Y7.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.f57048r;
        } catch (Throwable th2) {
            Y7.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean f() {
        if (Y7.a.d(h.class)) {
            return null;
        }
        try {
            return f57026t;
        } catch (Throwable th2) {
            Y7.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ h g() {
        if (Y7.a.d(h.class)) {
            return null;
        }
        try {
            return f57027u;
        } catch (Throwable th2) {
            Y7.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Map h() {
        if (Y7.a.d(h.class)) {
            return null;
        }
        try {
            return f57029w;
        } catch (Throwable th2) {
            Y7.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Class i(h hVar) {
        if (Y7.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.f57037g;
        } catch (Throwable th2) {
            Y7.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Class j(h hVar) {
        if (Y7.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.f57036f;
        } catch (Throwable th2) {
            Y7.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Map k() {
        if (Y7.a.d(h.class)) {
            return null;
        }
        try {
            return f57030x;
        } catch (Throwable th2) {
            Y7.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean l() {
        if (Y7.a.d(h.class)) {
            return null;
        }
        try {
            return f57028v;
        } catch (Throwable th2) {
            Y7.a.b(th2, h.class);
            return null;
        }
    }

    public static final /* synthetic */ void m(h hVar) {
        if (Y7.a.d(h.class)) {
            return;
        }
        try {
            f57027u = hVar;
        } catch (Throwable th2) {
            Y7.a.b(th2, h.class);
        }
    }

    public static final /* synthetic */ void n(h hVar) {
        if (Y7.a.d(h.class)) {
            return;
        }
        try {
            hVar.t();
        } catch (Throwable th2) {
            Y7.a.b(th2, h.class);
        }
    }

    public static final void q(h this$0, Runnable queryPurchaseHistoryRunnable) {
        if (Y7.a.d(h.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(queryPurchaseHistoryRunnable, "$queryPurchaseHistoryRunnable");
            this$0.s("inapp", new ArrayList(this$0.f57048r), queryPurchaseHistoryRunnable);
        } catch (Throwable th2) {
            Y7.a.b(th2, h.class);
        }
    }

    public final void o(String skuType, Runnable querySkuRunnable) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(skuType, "skuType");
            Intrinsics.checkNotNullParameter(querySkuRunnable, "querySkuRunnable");
            m mVar = m.f57074a;
            Object e10 = m.e(this.f57034d, this.f57041k, m.e(this.f57033c, this.f57040j, this.f57032b, "inapp"), new Object[0]);
            List list = e10 instanceof List ? (List) e10 : null;
            if (list == null) {
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    m mVar2 = m.f57074a;
                    Object e11 = m.e(this.f57035e, this.f57042l, obj, new Object[0]);
                    String str = e11 instanceof String ? (String) e11 : null;
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("productId")) {
                            String skuID = jSONObject.getString("productId");
                            arrayList.add(skuID);
                            Map map = f57029w;
                            Intrinsics.checkNotNullExpressionValue(skuID, "skuID");
                            map.put(skuID, jSONObject);
                        }
                    }
                }
                s(skuType, arrayList, querySkuRunnable);
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void p(String skuType, final Runnable queryPurchaseHistoryRunnable) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(skuType, "skuType");
            Intrinsics.checkNotNullParameter(queryPurchaseHistoryRunnable, "queryPurchaseHistoryRunnable");
            r(skuType, new Runnable() { // from class: n6.g
                @Override // java.lang.Runnable
                public final void run() {
                    h.q(h.this, queryPurchaseHistoryRunnable);
                }
            });
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void r(String str, Runnable runnable) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(this.f57039i.getClassLoader(), new Class[]{this.f57039i}, new c(this, runnable));
            m mVar = m.f57074a;
            m.e(this.f57033c, this.f57046p, this.f57032b, str, newProxyInstance);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void s(String str, List list, Runnable runnable) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(this.f57038h.getClassLoader(), new Class[]{this.f57038h}, new e(this, runnable));
            Object d10 = this.f57047q.d(str, list);
            m mVar = m.f57074a;
            m.e(this.f57033c, this.f57045o, this.f57032b, d10, newProxyInstance);
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void t() {
        Method d10;
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Class a10 = m.a("com.android.billingclient.api.BillingClientStateListener");
            if (a10 == null || (d10 = m.d(this.f57033c, "startConnection", a10)) == null) {
                return;
            }
            m.e(this.f57033c, d10, this.f57032b, Proxy.newProxyInstance(a10.getClassLoader(), new Class[]{a10}, new a()));
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public h(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, l lVar) {
        this.f57031a = context;
        this.f57032b = obj;
        this.f57033c = cls;
        this.f57034d = cls2;
        this.f57035e = cls3;
        this.f57036f = cls4;
        this.f57037g = cls5;
        this.f57038h = cls6;
        this.f57039i = cls7;
        this.f57040j = method;
        this.f57041k = method2;
        this.f57042l = method3;
        this.f57043m = method4;
        this.f57044n = method5;
        this.f57045o = method6;
        this.f57046p = method7;
        this.f57047q = lVar;
        this.f57048r = new CopyOnWriteArraySet();
    }
}
