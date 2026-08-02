package k6;

import T7.A;
import T7.C1682w;
import T7.G;
import T7.Y;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.react.BuildConfig;
import g6.C4331C;
import g6.C4357q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import k6.C5201b;
import k6.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import l6.C5406a;
import l6.C5407b;
import l6.C5408c;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: f, reason: collision with root package name */
    public static final a f54257f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final String f54258g = g.class.getCanonicalName();

    /* renamed from: h, reason: collision with root package name */
    public static g f54259h;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f54260a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f54261b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f54262c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f54263d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f54264e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized g a() {
            g b10;
            try {
                if (g.b() == null) {
                    g.d(new g(null));
                }
                b10 = g.b();
                if (b10 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return b10;
        }

        public final Bundle b(C5406a c5406a, View rootView, View hostView) {
            List<C5407b> c10;
            C5406a c5406a2;
            View view;
            List a10;
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            Bundle bundle = new Bundle();
            if (c5406a != null && (c10 = c5406a.c()) != null) {
                for (C5407b c5407b : c10) {
                    if (c5407b.d() != null && c5407b.d().length() > 0) {
                        bundle.putString(c5407b.a(), c5407b.d());
                    } else if (c5407b.b().size() > 0) {
                        if (Intrinsics.areEqual(c5407b.c(), "relative")) {
                            c.a aVar = c.f54267f;
                            List b10 = c5407b.b();
                            String simpleName = hostView.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName, "hostView.javaClass.simpleName");
                            C5406a c5406a3 = c5406a;
                            a10 = aVar.a(c5406a3, hostView, b10, 0, -1, simpleName);
                            c5406a2 = c5406a3;
                            view = rootView;
                        } else {
                            c5406a2 = c5406a;
                            c.a aVar2 = c.f54267f;
                            List b11 = c5407b.b();
                            String simpleName2 = rootView.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName2, "rootView.javaClass.simpleName");
                            view = rootView;
                            a10 = aVar2.a(c5406a2, view, b11, 0, -1, simpleName2);
                        }
                        Iterator it = a10.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            b bVar = (b) it.next();
                            if (bVar.a() != null) {
                                l6.f fVar = l6.f.f55644a;
                                String k10 = l6.f.k(bVar.a());
                                if (k10.length() > 0) {
                                    bundle.putString(c5407b.a(), k10);
                                    break;
                                }
                            }
                        }
                        c5406a = c5406a2;
                        rootView = view;
                    }
                }
            }
            return bundle;
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f54265a;

        /* renamed from: b, reason: collision with root package name */
        public final String f54266b;

        public b(View view, String viewMapKey) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(viewMapKey, "viewMapKey");
            this.f54265a = new WeakReference(view);
            this.f54266b = viewMapKey;
        }

        public final View a() {
            WeakReference weakReference = this.f54265a;
            if (weakReference == null) {
                return null;
            }
            return (View) weakReference.get();
        }

        public final String b() {
            return this.f54266b;
        }
    }

    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* renamed from: f, reason: collision with root package name */
        public static final a f54267f = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f54268a;

        /* renamed from: b, reason: collision with root package name */
        public List f54269b;

        /* renamed from: c, reason: collision with root package name */
        public final Handler f54270c;

        /* renamed from: d, reason: collision with root package name */
        public final HashSet f54271d;

        /* renamed from: e, reason: collision with root package name */
        public final String f54272e;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final List a(C5406a c5406a, View view, List path, int i10, int i11, String mapKey) {
                C5406a c5406a2;
                List list;
                a aVar;
                List b10;
                int size;
                List b11;
                int size2;
                Intrinsics.checkNotNullParameter(path, "path");
                Intrinsics.checkNotNullParameter(mapKey, "mapKey");
                String str = mapKey + '.' + i11;
                ArrayList arrayList = new ArrayList();
                if (view != null) {
                    if (i10 >= path.size()) {
                        arrayList.add(new b(view, str));
                        c5406a2 = c5406a;
                        list = path;
                        aVar = this;
                    } else {
                        C5408c c5408c = (C5408c) path.get(i10);
                        if (Intrinsics.areEqual(c5408c.a(), "..")) {
                            ViewParent parent = view.getParent();
                            if ((parent instanceof ViewGroup) && (size = (b10 = b((ViewGroup) parent)).size()) > 0) {
                                int i12 = 0;
                                while (true) {
                                    int i13 = i12 + 1;
                                    C5406a c5406a3 = c5406a;
                                    List list2 = path;
                                    arrayList.addAll(a(c5406a3, (View) b10.get(i12), list2, i10 + 1, i12, str));
                                    if (i13 >= size) {
                                        break;
                                    }
                                    i12 = i13;
                                    c5406a = c5406a3;
                                    path = list2;
                                }
                            }
                        } else {
                            c5406a2 = c5406a;
                            list = path;
                            aVar = this;
                            if (Intrinsics.areEqual(c5408c.a(), ".")) {
                                arrayList.add(new b(view, str));
                                return arrayList;
                            }
                            if (c(view, c5408c, i11)) {
                                if (i10 == list.size() - 1) {
                                    arrayList.add(new b(view, str));
                                }
                            }
                        }
                    }
                    if ((view instanceof ViewGroup) && (size2 = (b11 = b((ViewGroup) view)).size()) > 0) {
                        int i14 = 0;
                        while (true) {
                            int i15 = i14 + 1;
                            arrayList.addAll(aVar.a(c5406a2, (View) b11.get(i14), list, i10 + 1, i14, str));
                            if (i15 >= size2) {
                                break;
                            }
                            aVar = this;
                            i14 = i15;
                        }
                    }
                }
                return arrayList;
            }

            public final List b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        View child = viewGroup.getChildAt(i10);
                        if (child.getVisibility() == 0) {
                            Intrinsics.checkNotNullExpressionValue(child, "child");
                            arrayList.add(child);
                        }
                        if (i11 >= childCount) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r10.getClass().getSimpleName(), (java.lang.String) r12.get(r12.size() - 1)) == false) goto L15;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final boolean c(View view, C5408c c5408c, int i10) {
                if (c5408c.e() != -1 && i10 != c5408c.e()) {
                    return false;
                }
                if (!Intrinsics.areEqual(view.getClass().getCanonicalName(), c5408c.a())) {
                    if (new Regex(".*android\\..*").matches(c5408c.a())) {
                        List split$default = StringsKt.split$default((CharSequence) c5408c.a(), new String[]{"."}, false, 0, 6, (Object) null);
                        if (!split$default.isEmpty()) {
                        }
                    }
                    return false;
                }
                if ((c5408c.f() & C5408c.b.ID.b()) > 0 && c5408c.d() != view.getId()) {
                    return false;
                }
                if ((c5408c.f() & C5408c.b.TEXT.b()) > 0) {
                    String h10 = c5408c.h();
                    String k10 = l6.f.k(view);
                    String k11 = Y.k(Y.I0(k10), "");
                    if (!Intrinsics.areEqual(h10, k10) && !Intrinsics.areEqual(h10, k11)) {
                        return false;
                    }
                }
                if ((c5408c.f() & C5408c.b.DESCRIPTION.b()) > 0) {
                    String b10 = c5408c.b();
                    String obj = view.getContentDescription() == null ? "" : view.getContentDescription().toString();
                    String k12 = Y.k(Y.I0(obj), "");
                    if (!Intrinsics.areEqual(b10, obj) && !Intrinsics.areEqual(b10, k12)) {
                        return false;
                    }
                }
                if ((c5408c.f() & C5408c.b.HINT.b()) > 0) {
                    String c10 = c5408c.c();
                    String i11 = l6.f.i(view);
                    String k13 = Y.k(Y.I0(i11), "");
                    if (!Intrinsics.areEqual(c10, i11) && !Intrinsics.areEqual(c10, k13)) {
                        return false;
                    }
                }
                if ((c5408c.f() & C5408c.b.TAG.b()) > 0) {
                    String g10 = c5408c.g();
                    String obj2 = view.getTag() == null ? "" : view.getTag().toString();
                    String k14 = Y.k(Y.I0(obj2), "");
                    if (!Intrinsics.areEqual(g10, obj2) && !Intrinsics.areEqual(g10, k14)) {
                        return false;
                    }
                }
                return true;
            }

            public a() {
            }
        }

        public c(View view, Handler handler, HashSet listenerSet, String activityName) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(listenerSet, "listenerSet");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            this.f54268a = new WeakReference(view);
            this.f54270c = handler;
            this.f54271d = listenerSet;
            this.f54272e = activityName;
            handler.postDelayed(this, 200L);
        }

        public final void a(b bVar, View view, C5406a c5406a) {
            if (c5406a == null) {
                return;
            }
            try {
                View a10 = bVar.a();
                if (a10 == null) {
                    return;
                }
                View a11 = l6.f.a(a10);
                if (a11 != null && l6.f.f55644a.p(a10, a11)) {
                    d(bVar, view, c5406a);
                    return;
                }
                String name = a10.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "view.javaClass.name");
                if (StringsKt.startsWith$default(name, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, (Object) null)) {
                    return;
                }
                if (!(a10 instanceof AdapterView)) {
                    b(bVar, view, c5406a);
                } else if (a10 instanceof ListView) {
                    c(bVar, view, c5406a);
                }
            } catch (Exception e10) {
                Y y10 = Y.f11042a;
                Y.j0(g.c(), e10);
            }
        }

        public final void b(b bVar, View view, C5406a c5406a) {
            View a10 = bVar.a();
            if (a10 == null) {
                return;
            }
            String b10 = bVar.b();
            View.OnClickListener g10 = l6.f.g(a10);
            boolean z10 = (g10 instanceof C5201b.a) && ((C5201b.a) g10).a();
            if (this.f54271d.contains(b10) || z10) {
                return;
            }
            a10.setOnClickListener(C5201b.b(c5406a, view, a10));
            this.f54271d.add(b10);
        }

        public final void c(b bVar, View view, C5406a c5406a) {
            AdapterView adapterView = (AdapterView) bVar.a();
            if (adapterView == null) {
                return;
            }
            String b10 = bVar.b();
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            boolean z10 = (onItemClickListener instanceof C5201b.C0782b) && ((C5201b.C0782b) onItemClickListener).a();
            if (this.f54271d.contains(b10) || z10) {
                return;
            }
            adapterView.setOnItemClickListener(C5201b.c(c5406a, view, adapterView));
            this.f54271d.add(b10);
        }

        public final void d(b bVar, View view, C5406a c5406a) {
            View a10 = bVar.a();
            if (a10 == null) {
                return;
            }
            String b10 = bVar.b();
            View.OnTouchListener h10 = l6.f.h(a10);
            boolean z10 = (h10 instanceof h.a) && ((h.a) h10).a();
            if (this.f54271d.contains(b10) || z10) {
                return;
            }
            a10.setOnTouchListener(h.a(c5406a, view, a10));
            this.f54271d.add(b10);
        }

        public final void e(C5406a c5406a, View view) {
            if (c5406a == null || view == null) {
                return;
            }
            String a10 = c5406a.a();
            if (a10 == null || a10.length() == 0 || Intrinsics.areEqual(c5406a.a(), this.f54272e)) {
                List d10 = c5406a.d();
                if (d10.size() > 25) {
                    return;
                }
                Iterator it = f54267f.a(c5406a, view, d10, 0, -1, this.f54272e).iterator();
                while (it.hasNext()) {
                    a((b) it.next(), view, c5406a);
                }
            }
        }

        public final void f() {
            int size;
            List list = this.f54269b;
            if (list == null || this.f54268a.get() == null || list.size() - 1 < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                e((C5406a) list.get(i10), (View) this.f54268a.get());
                if (i11 > size) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            f();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            f();
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (Y7.a.d(this)) {
                return;
            }
            try {
                C1682w f10 = A.f(C4331C.m());
                if (f10 != null && f10.b()) {
                    List b10 = C5406a.f55605j.b(f10.e());
                    this.f54269b = b10;
                    if (b10 != null && (view = (View) this.f54268a.get()) != null) {
                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalLayoutListener(this);
                            viewTreeObserver.addOnScrollChangedListener(this);
                        }
                        f();
                    }
                }
            } catch (Throwable th2) {
                Y7.a.b(th2, this);
            }
        }
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ g b() {
        if (Y7.a.d(g.class)) {
            return null;
        }
        try {
            return f54259h;
        } catch (Throwable th2) {
            Y7.a.b(th2, g.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (Y7.a.d(g.class)) {
            return null;
        }
        try {
            return f54258g;
        } catch (Throwable th2) {
            Y7.a.b(th2, g.class);
            return null;
        }
    }

    public static final /* synthetic */ void d(g gVar) {
        if (Y7.a.d(g.class)) {
            return;
        }
        try {
            f54259h = gVar;
        } catch (Throwable th2) {
            Y7.a.b(th2, g.class);
        }
    }

    public static final void j(g this$0) {
        if (Y7.a.d(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.g();
        } catch (Throwable th2) {
            Y7.a.b(th2, g.class);
        }
    }

    public final void e(Activity activity) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (G.b()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new C4357q("Can't add activity to CodelessMatcher on non-UI thread");
            }
            this.f54261b.add(activity);
            this.f54263d.clear();
            HashSet hashSet = (HashSet) this.f54264e.get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.f54263d = hashSet;
            }
            i();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void f(Activity activity) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f54264e.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void g() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            for (Activity activity : this.f54261b) {
                if (activity != null) {
                    View e10 = p6.g.e(activity);
                    String activityName = activity.getClass().getSimpleName();
                    Handler handler = this.f54260a;
                    HashSet hashSet = this.f54263d;
                    Intrinsics.checkNotNullExpressionValue(activityName, "activityName");
                    this.f54262c.add(new c(e10, handler, hashSet, activityName));
                }
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void h(Activity activity) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (G.b()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new C4357q("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            this.f54261b.remove(activity);
            this.f54262c.clear();
            this.f54264e.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f54263d.clone());
            this.f54263d.clear();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public final void i() {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                g();
            } else {
                this.f54260a.post(new Runnable() { // from class: k6.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.j(g.this);
                    }
                });
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }

    public g() {
        this.f54260a = new Handler(Looper.getMainLooper());
        Set newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap, "newSetFromMap(WeakHashMap())");
        this.f54261b = newSetFromMap;
        this.f54262c = new LinkedHashSet();
        this.f54263d = new HashSet();
        this.f54264e = new HashMap();
    }
}
