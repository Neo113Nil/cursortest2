package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: io.sentry.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4863x implements D {

    /* renamed from: a, reason: collision with root package name */
    public final Map f52876a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public final F3 f52877b;

    public C4863x(F3 f32) {
        this.f52877b = f32;
    }

    public static List a(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        while (th2.getCause() != null) {
            arrayList.add(th2.getCause());
            th2 = th2.getCause();
        }
        return arrayList;
    }

    public static boolean b(Map map, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (map.containsKey(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.D
    public C4733c3 k(C4733c3 c4733c3, J j10) {
        if (!this.f52877b.isEnableDeduplication()) {
            this.f52877b.getLogger().c(EnumC4788n3.DEBUG, "Event deduplication is disabled.", new Object[0]);
            return c4733c3;
        }
        Throwable O10 = c4733c3.O();
        if (O10 == null) {
            return c4733c3;
        }
        if (this.f52876a.containsKey(O10) || b(this.f52876a, a(O10))) {
            this.f52877b.getLogger().c(EnumC4788n3.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", c4733c3.G());
            return null;
        }
        this.f52876a.put(O10, null);
        return c4733c3;
    }
}
