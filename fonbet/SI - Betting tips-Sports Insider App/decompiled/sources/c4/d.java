package c4;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.v0;
import androidx.appcompat.widget.c1;
import androidx.constraintlayout.widget.ConstraintLayout;
import c0.m0;
import hg.d1;
import hg.n0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.android.core.w0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import y1.d0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements b3.a, g5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3576a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3577b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3578c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3579d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3580e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3581f;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i5) {
        this.f3576a = i5;
        this.f3577b = obj;
        this.f3578c = obj2;
        this.f3579d = obj3;
        this.f3580e = obj4;
        this.f3581f = obj5;
    }

    public static d e(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        d dVar = new d(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) dVar.f3580e)) {
            try {
                ((ArrayDeque) dVar.f3580e).clear();
                String string = ((SharedPreferences) dVar.f3577b).getString((String) dVar.f3578c, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) dVar.f3579d)) {
                    String[] split = string.split((String) dVar.f3579d, -1);
                    if (split.length == 0) {
                        w0.d("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) dVar.f3580e).add(str);
                        }
                    }
                    return dVar;
                }
                return dVar;
            } finally {
            }
        }
    }

    public static void l(d dVar, ag.c baseClass, ag.c concreteClass, og.a concreteSerializer) {
        Object obj;
        ag.c cVar;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(concreteClass, "concreteClass");
        Intrinsics.checkNotNullParameter(concreteSerializer, "concreteSerializer");
        String a7 = concreteSerializer.d().a();
        HashMap hashMap = (HashMap) dVar.f3578c;
        Object obj2 = hashMap.get(baseClass);
        if (obj2 == null) {
            obj2 = new HashMap();
            hashMap.put(baseClass, obj2);
        }
        Map map = (Map) obj2;
        HashMap hashMap2 = (HashMap) dVar.f3580e;
        Object obj3 = hashMap2.get(baseClass);
        if (obj3 == null) {
            obj3 = new HashMap();
            hashMap2.put(baseClass, obj3);
        }
        Map map2 = (Map) obj3;
        og.a aVar = (og.a) map.get(concreteClass);
        if (aVar != null && !Intrinsics.areEqual(aVar, concreteSerializer)) {
            Intrinsics.checkNotNullParameter(baseClass, "baseClass");
            Intrinsics.checkNotNullParameter(concreteClass, "concreteClass");
            throw new cg.h("Serializer for " + concreteClass + " already registered in the scope of " + baseClass, 1);
        }
        og.a aVar2 = (og.a) map2.get(a7);
        if (aVar2 == null || Intrinsics.areEqual(aVar2, concreteSerializer)) {
            map.put(concreteClass, concreteSerializer);
            map2.put(a7, concreteSerializer);
            return;
        }
        Intrinsics.checkNotNullParameter(map, "<this>");
        Iterator it = ((Iterable) CollectionsKt.z(map.entrySet()).f3220b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Map.Entry) obj).getValue() == aVar2) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || (cVar = (ag.c) entry.getKey()) == null) {
            throw new IllegalStateException(("Name " + a7 + " is registered in the module but no Kotlin class is associated with it.").toString());
        }
        throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + baseClass + "' have the same serial name '" + a7 + "': " + concreteSerializer + " for '" + concreteClass + "' and " + aVar2 + " for '" + cVar + '\'');
    }

    public void a(f4.g gVar, ag.c cVar) {
        ((ArrayList) this.f3580e).add(new a2.l(1, gVar, cVar));
    }

    public void b(k4.a aVar, ag.c cVar) {
        ((ArrayList) this.f3578c).add(new Pair(aVar, cVar));
    }

    public boolean c(String str) {
        boolean add;
        if (TextUtils.isEmpty(str) || str.contains((String) this.f3579d)) {
            return false;
        }
        synchronized (((ArrayDeque) this.f3580e)) {
            add = ((ArrayDeque) this.f3580e).add(str);
            if (add) {
                ((ScheduledThreadPoolExecutor) this.f3581f).execute(new aa.c(10, this));
            }
        }
        return add;
    }

    public void d(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ((gh.v) this.f3579d).a(name, value);
    }

    public m0 f() {
        ArrayList arrayList = (ArrayList) this.f3577b;
        Intent intent = (Intent) this.f3580e;
        d0 d0Var = (d0) this.f3581f;
        if (d0Var == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        y1.b0 b0Var = null;
        while (true) {
            int i5 = 0;
            if (!it.hasNext()) {
                intent.putExtra("android-support-nav:controller:deepLinkIds", CollectionsKt.V(arrayList2));
                intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                m0 m0Var = new m0((Context) this.f3578c);
                Intent intent2 = new Intent(intent);
                ComponentName component = intent2.getComponent();
                if (component == null) {
                    component = intent2.resolveActivity(m0Var.f3285b.getPackageManager());
                }
                if (component != null) {
                    m0Var.a(component);
                }
                ArrayList arrayList4 = m0Var.f3284a;
                arrayList4.add(intent2);
                Intrinsics.checkNotNullExpressionValue(m0Var, "addNextIntentWithParentStack(...)");
                int size = arrayList4.size();
                while (i5 < size) {
                    Intent intent3 = (Intent) arrayList4.get(i5);
                    if (intent3 != null) {
                        intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                    }
                    i5++;
                }
                return m0Var;
            }
            y1.y yVar = (y1.y) it.next();
            int i10 = yVar.f25668a;
            Bundle bundle = yVar.f25669b;
            y1.b0 g10 = g(i10);
            if (g10 == null) {
                int i11 = y1.b0.f25532f;
                throw new IllegalArgumentException("Navigation destination " + y1.z.a((b2.e) this.f3579d, i10) + " cannot be found in the navigation graph " + d0Var);
            }
            int[] c2 = g10.c(b0Var);
            int length = c2.length;
            while (i5 < length) {
                arrayList2.add(Integer.valueOf(c2[i5]));
                arrayList3.add(bundle);
                i5++;
            }
            b0Var = g10;
        }
    }

    public y1.b0 g(int i5) {
        kotlin.collections.l lVar = new kotlin.collections.l();
        d0 d0Var = (d0) this.f3581f;
        Intrinsics.checkNotNull(d0Var);
        lVar.addLast(d0Var);
        while (!lVar.isEmpty()) {
            y1.b0 b0Var = (y1.b0) lVar.removeFirst();
            if (b0Var.f25534b.f3017e == i5) {
                return b0Var;
            }
            if (b0Var instanceof d0) {
                Iterator it = ((d0) b0Var).iterator();
                while (true) {
                    b2.n nVar = (b2.n) it;
                    if (nVar.hasNext()) {
                        lVar.addLast((y1.b0) nVar.next());
                    }
                }
            }
        }
        return null;
    }

    @Override // ff.a
    public Object get() {
        return new j5.a((Executor) ((ff.a) this.f3577b).get(), (f5.d) ((ff.a) this.f3578c).get(), (v0) ((v0) this.f3579d).get(), (l5.d) ((ff.a) this.f3580e).get(), (m5.c) ((ff.a) this.f3581f).get());
    }

    @Override // b3.a
    public View getRoot() {
        switch (this.f3576a) {
            case 3:
                return (ConstraintLayout) this.f3577b;
            default:
                return (LinearLayout) this.f3577b;
        }
    }

    public og.a h(ag.c baseClass, Object value) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!baseClass.isInstance(value)) {
            return null;
        }
        Map map = (Map) ((Map) this.f3578c).get(baseClass);
        og.a aVar = map != null ? (og.a) map.get(Reflection.getOrCreateKotlinClass(value.getClass())) : null;
        og.a aVar2 = aVar instanceof og.a ? aVar : null;
        if (aVar2 != null) {
            return aVar2;
        }
        Object obj = ((Map) this.f3579d).get(baseClass);
        Function1 function1 = TypeIntrinsics.isFunctionOfArity(obj, 1) ? (Function1) obj : null;
        if (function1 != null) {
            return (og.a) function1.invoke(value);
        }
        return null;
    }

    public void i(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ((gh.v) this.f3579d).f(name, value);
    }

    public void j(String method, gh.m0 m0Var) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (m0Var == null) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (Intrinsics.areEqual(method, "POST") || Intrinsics.areEqual(method, "PUT") || Intrinsics.areEqual(method, "PATCH") || Intrinsics.areEqual(method, "PROPPATCH") || Intrinsics.areEqual(method, "QUERY") || Intrinsics.areEqual(method, "REPORT")) {
                throw new IllegalArgumentException(c1.n("method ", method, " must have a request body.").toString());
            }
        } else if (!com.google.android.play.core.appupdate.b.D(method)) {
            throw new IllegalArgumentException(c1.n("method ", method, " must not have a request body.").toString());
        }
        this.f3578c = method;
        this.f3580e = m0Var;
    }

    public String k() {
        String str;
        synchronized (((ArrayDeque) this.f3580e)) {
            str = (String) ((ArrayDeque) this.f3580e).peek();
        }
        return str;
    }

    public boolean m(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.f3580e)) {
            remove = ((ArrayDeque) this.f3580e).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.f3581f).execute(new aa.c(10, this));
            }
        }
        return remove;
    }

    public void n(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ((gh.v) this.f3579d).e(name);
    }

    public void o(b5.a aVar) {
        com.google.firebase.messaging.k kVar = new com.google.firebase.messaging.k(16);
        e5.r rVar = (e5.r) this.f3581f;
        e5.i iVar = (e5.i) this.f3577b;
        String str = (String) this.f3578c;
        b5.e eVar = (b5.e) this.f3580e;
        b5.c cVar = (b5.c) this.f3579d;
        j5.b bVar = rVar.f8665c;
        v0 a7 = e5.i.a();
        a7.Y(iVar.f8641a);
        a7.f366d = b5.d.f3026a;
        a7.f365c = iVar.f8642b;
        e5.i d10 = a7.d();
        androidx.appcompat.widget.a0 a0Var = new androidx.appcompat.widget.a0(7);
        a0Var.f685g = new HashMap();
        a0Var.f683e = Long.valueOf(rVar.f8663a.getTime());
        a0Var.f684f = Long.valueOf(rVar.f8664b.getTime());
        a0Var.f680b = str;
        a0Var.f682d = new e5.l(cVar, (byte[]) eVar.apply(aVar.f3022a));
        a0Var.f681c = null;
        j5.a aVar2 = (j5.a) bVar;
        aVar2.f18260b.execute(new androidx.fragment.app.d(aVar2, d10, kVar, a0Var.p()));
    }

    public void p(Object obj, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ((LinkedHashMap) this.f3577b).put(key, obj);
        n0 n0Var = (n0) ((LinkedHashMap) this.f3579d).get(key);
        if (n0Var != null) {
            ((d1) n0Var).j(obj);
        }
        n0 n0Var2 = (n0) ((LinkedHashMap) this.f3580e).get(key);
        if (n0Var2 != null) {
            ((d1) n0Var2).j(obj);
        }
    }

    public void q(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (kotlin.text.z.o(url, "ws:", true)) {
            StringBuilder sb2 = new StringBuilder("http:");
            String substring = url.substring(3);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            sb2.append(substring);
            url = sb2.toString();
        } else if (kotlin.text.z.o(url, "wss:", true)) {
            StringBuilder sb3 = new StringBuilder("https:");
            String substring2 = url.substring(4);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            sb3.append(substring2);
            url = sb3.toString();
        }
        Intrinsics.checkNotNullParameter(url, "<this>");
        gh.x xVar = new gh.x();
        xVar.c(null, url);
        gh.y url2 = xVar.a();
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f3577b = url2;
    }

    public void r() {
        Iterator it = ((ArrayList) this.f3577b).iterator();
        while (it.hasNext()) {
            int i5 = ((y1.y) it.next()).f25668a;
            if (g(i5) == null) {
                int i10 = y1.b0.f25532f;
                StringBuilder p10 = d9.e.p("Navigation destination ", y1.z.a((b2.e) this.f3579d, i5), " cannot be found in the navigation graph ");
                p10.append((d0) this.f3581f);
                throw new IllegalArgumentException(p10.toString());
            }
        }
    }

    public /* synthetic */ d(boolean z5) {
        this.f3576a = 5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Boolean bool, Double d10) {
        this(bool, d10, (Double) null, Boolean.FALSE, (Double) null);
        this.f3576a = 6;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Boolean bool, Double d10, Double d11) {
        this(bool, d10, d11, Boolean.FALSE, (Double) null);
        this.f3576a = 6;
    }

    public d(Map initialState) {
        this.f3576a = 10;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.f3577b = kotlin.collections.n0.j(initialState);
        this.f3578c = new LinkedHashMap();
        this.f3579d = new LinkedHashMap();
        this.f3580e = new LinkedHashMap();
        this.f3581f = new a2.r(3, this);
    }

    public d(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider) {
        this.f3576a = 11;
        Intrinsics.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f3577b = class2ContextualFactory;
        this.f3578c = polyBase2Serializers;
        this.f3579d = polyBase2DefaultSerializerProvider;
        this.f3580e = polyBase2NamedSerializers;
        this.f3581f = polyBase2DefaultDeserializerProvider;
    }

    public d(Context context, com.google.firebase.messaging.x taskExecutor) {
        Object networkStateTracker;
        this.f3576a = 8;
        Context context2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getApplicationContext(...)");
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        k3.a batteryChargingTracker = new k3.a(context2, taskExecutor, 0);
        Context context3 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getApplicationContext(...)");
        Intrinsics.checkNotNullParameter(context3, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        k3.a batteryNotLowTracker = new k3.a(context3, taskExecutor, 1);
        Context context4 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getApplicationContext(...)");
        String str = k3.i.f18805a;
        Intrinsics.checkNotNullParameter(context4, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        if (Build.VERSION.SDK_INT >= 24) {
            networkStateTracker = new k3.h(context4, taskExecutor);
        } else {
            networkStateTracker = new k3.j(context4, taskExecutor);
        }
        Context context5 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getApplicationContext(...)");
        Intrinsics.checkNotNullParameter(context5, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        k3.a storageNotLowTracker = new k3.a(context5, taskExecutor, 2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
        Intrinsics.checkNotNullParameter(networkStateTracker, "networkStateTracker");
        Intrinsics.checkNotNullParameter(storageNotLowTracker, "storageNotLowTracker");
        this.f3577b = context;
        this.f3578c = batteryChargingTracker;
        this.f3579d = batteryNotLowTracker;
        this.f3580e = networkStateTracker;
        this.f3581f = storageNotLowTracker;
    }

    public d(Boolean bool, Double d10, Double d11, Boolean bool2, Double d12) {
        this.f3576a = 6;
        this.f3577b = bool;
        this.f3578c = d10;
        this.f3579d = d11;
        this.f3580e = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.f3581f = d12;
    }

    public d(y1.r navController) {
        Intent launchIntentForPackage;
        this.f3576a = 13;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Context context = navController.f25624a;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f3578c = context;
        this.f3579d = new b2.e(context, (char) 0);
        Activity activity = (Activity) bg.q.d(bg.q.g(bg.n.b(new ub.b(10), context), new ub.b(11)));
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f3580e = launchIntentForPackage;
        this.f3577b = new ArrayList();
        this.f3581f = navController.f25625b.g();
    }

    public d(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f3576a = 1;
        this.f3580e = new ArrayDeque();
        this.f3577b = sharedPreferences;
        this.f3578c = "topic_operation_queue";
        this.f3579d = StringUtils.COMMA;
        this.f3581f = scheduledThreadPoolExecutor;
    }

    public d(e eVar) {
        this.f3576a = 0;
        this.f3577b = CollectionsKt.X(eVar.f3582a);
        this.f3578c = CollectionsKt.X(eVar.f3583b);
        this.f3579d = CollectionsKt.X(eVar.f3584c);
        List list = (List) eVar.f3587f.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a2.q(7, (Pair) it.next()));
        }
        this.f3580e = arrayList;
        List list2 = (List) eVar.f3588g.getValue();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new c((d4.k) it2.next(), 1));
        }
        this.f3581f = arrayList2;
    }

    public d(int i5) {
        this.f3576a = i5;
        switch (i5) {
            case 12:
                this.f3577b = new HashMap();
                this.f3578c = new HashMap();
                this.f3579d = new HashMap();
                this.f3580e = new HashMap();
                this.f3581f = new HashMap();
                break;
            default:
                this.f3581f = hh.a.f10814f;
                this.f3578c = "GET";
                this.f3579d = new gh.v();
                break;
        }
    }

    public d(jh.e taskRunner) {
        this.f3576a = 9;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.f3577b = taskRunner;
        this.f3580e = nh.n.f20974a;
        this.f3581f = nh.c.f20925a;
    }
}
