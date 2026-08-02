package X7;

import T7.Y;
import V7.c;
import V7.k;
import X7.c;
import android.util.Log;
import com.facebook.GraphRequest;
import g6.C4331C;
import g6.C4339K;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c implements Thread.UncaughtExceptionHandler {

    /* renamed from: b, reason: collision with root package name */
    public static final a f13617b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final String f13618c = c.class.getCanonicalName();

    /* renamed from: d, reason: collision with root package name */
    public static c f13619d;

    /* renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f13620a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final int e(V7.c cVar, V7.c o22) {
            Intrinsics.checkNotNullExpressionValue(o22, "o2");
            return cVar.b(o22);
        }

        public static final void f(List validReports, C4339K response) {
            Intrinsics.checkNotNullParameter(validReports, "$validReports");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                if (response.b() == null) {
                    JSONObject d10 = response.d();
                    if (Intrinsics.areEqual(d10 == null ? null : Boolean.valueOf(d10.getBoolean("success")), Boolean.TRUE)) {
                        Iterator it = validReports.iterator();
                        while (it.hasNext()) {
                            ((V7.c) it.next()).a();
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }

        public final synchronized void c() {
            try {
                if (C4331C.p()) {
                    d();
                }
                if (c.f13619d != null) {
                    Log.w(c.f13618c, "Already enabled!");
                } else {
                    c.f13619d = new c(Thread.getDefaultUncaughtExceptionHandler(), null);
                    Thread.setDefaultUncaughtExceptionHandler(c.f13619d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public final void d() {
            if (Y.a0()) {
                return;
            }
            File[] p10 = k.p();
            ArrayList arrayList = new ArrayList(p10.length);
            for (File file : p10) {
                arrayList.add(c.a.d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((V7.c) obj).isValid()) {
                    arrayList2.add(obj);
                }
            }
            final List sortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: X7.a
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int e10;
                    e10 = c.a.e((V7.c) obj2, (V7.c) obj3);
                    return e10;
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it = RangesKt.until(0, Math.min(sortedWith.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(sortedWith.get(((IntIterator) it).nextInt()));
            }
            k kVar = k.f12578a;
            k.s("crash_reports", jSONArray, new GraphRequest.b() { // from class: X7.b
                @Override // com.facebook.GraphRequest.b
                public final void a(C4339K c4339k) {
                    c.a.f(sortedWith, c4339k);
                }
            });
        }

        public a() {
        }
    }

    public /* synthetic */ c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, DefaultConstructorMarker defaultConstructorMarker) {
        this(uncaughtExceptionHandler);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread t10, Throwable e10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        Intrinsics.checkNotNullParameter(e10, "e");
        if (k.j(e10)) {
            V7.b.c(e10);
            c.a aVar = c.a.f12570a;
            c.a.b(e10, c.EnumC0263c.CrashReport).f();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f13620a;
        if (uncaughtExceptionHandler == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(t10, e10);
    }

    public c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f13620a = uncaughtExceptionHandler;
    }
}
