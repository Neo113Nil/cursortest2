package h6;

import T7.C1662b;
import android.content.Context;
import g6.C4331C;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h6.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4479f {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f47776a = new HashMap();

    public final synchronized void a(C4474a accessTokenAppIdPair, C4478e appEvent) {
        Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
        Intrinsics.checkNotNullParameter(appEvent, "appEvent");
        C4472H e10 = e(accessTokenAppIdPair);
        if (e10 != null) {
            e10.a(appEvent);
        }
    }

    public final synchronized void b(C4471G c4471g) {
        if (c4471g == null) {
            return;
        }
        for (Map.Entry entry : c4471g.b()) {
            C4472H e10 = e((C4474a) entry.getKey());
            if (e10 != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    e10.a((C4478e) it.next());
                }
            }
        }
    }

    public final synchronized C4472H c(C4474a accessTokenAppIdPair) {
        Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
        return (C4472H) this.f47776a.get(accessTokenAppIdPair);
    }

    public final synchronized int d() {
        int i10;
        Iterator it = this.f47776a.values().iterator();
        i10 = 0;
        while (it.hasNext()) {
            i10 += ((C4472H) it.next()).c();
        }
        return i10;
    }

    public final synchronized C4472H e(C4474a c4474a) {
        Context l10;
        C1662b e10;
        C4472H c4472h = (C4472H) this.f47776a.get(c4474a);
        if (c4472h == null && (e10 = C1662b.f11059f.e((l10 = C4331C.l()))) != null) {
            c4472h = new C4472H(e10, p.f47798b.c(l10));
        }
        if (c4472h == null) {
            return null;
        }
        this.f47776a.put(c4474a, c4472h);
        return c4472h;
    }

    public final synchronized Set f() {
        Set keySet;
        keySet = this.f47776a.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "stateMap.keys");
        return keySet;
    }
}
