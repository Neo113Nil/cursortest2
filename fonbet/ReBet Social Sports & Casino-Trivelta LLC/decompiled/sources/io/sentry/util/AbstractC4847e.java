package io.sentry.util;

import io.sentry.C4733c3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.sentry.util.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4847e {
    public static boolean a(List list, C4733c3 c4733c3) {
        if (c4733c3 != null && list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            io.sentry.protocol.n s02 = c4733c3.s0();
            if (s02 != null) {
                String e10 = s02.e();
                if (e10 != null) {
                    hashSet.add(e10);
                }
                String d10 = s02.d();
                if (d10 != null) {
                    hashSet.add(d10);
                }
            }
            Throwable O10 = c4733c3.O();
            if (O10 != null) {
                hashSet.add(O10.toString());
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (hashSet.contains(((io.sentry.H) it.next()).a())) {
                    return true;
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                io.sentry.H h10 = (io.sentry.H) it2.next();
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    if (h10.b((String) it3.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
