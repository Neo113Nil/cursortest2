package W7;

import T7.Y;
import V7.c;
import V7.k;
import com.facebook.GraphRequest;
import g6.C4331C;
import g6.C4339K;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f13078a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f13079b = new AtomicBoolean(false);

    public static final synchronized void c() {
        synchronized (e.class) {
            if (Y7.a.d(e.class)) {
                return;
            }
            try {
                if (f13079b.getAndSet(true)) {
                    return;
                }
                if (C4331C.p()) {
                    d();
                }
                b.d();
            } catch (Throwable th2) {
                Y7.a.b(th2, e.class);
            }
        }
    }

    public static final void d() {
        if (Y7.a.d(e.class)) {
            return;
        }
        try {
            if (Y.a0()) {
                return;
            }
            File[] l10 = k.l();
            ArrayList arrayList = new ArrayList(l10.length);
            for (File file : l10) {
                arrayList.add(c.a.d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((V7.c) obj).isValid()) {
                    arrayList2.add(obj);
                }
            }
            final List sortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: W7.c
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int e10;
                    e10 = e.e((V7.c) obj2, (V7.c) obj3);
                    return e10;
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it = RangesKt.until(0, Math.min(sortedWith.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(sortedWith.get(((IntIterator) it).nextInt()));
            }
            k kVar = k.f12578a;
            k.s("anr_reports", jSONArray, new GraphRequest.b() { // from class: W7.d
                @Override // com.facebook.GraphRequest.b
                public final void a(C4339K c4339k) {
                    e.f(sortedWith, c4339k);
                }
            });
        } catch (Throwable th2) {
            Y7.a.b(th2, e.class);
        }
    }

    public static final int e(V7.c cVar, V7.c o22) {
        if (Y7.a.d(e.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullExpressionValue(o22, "o2");
            return cVar.b(o22);
        } catch (Throwable th2) {
            Y7.a.b(th2, e.class);
            return 0;
        }
    }

    public static final void f(List validReports, C4339K response) {
        if (Y7.a.d(e.class)) {
            return;
        }
        try {
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
        } catch (Throwable th2) {
            Y7.a.b(th2, e.class);
        }
    }
}
