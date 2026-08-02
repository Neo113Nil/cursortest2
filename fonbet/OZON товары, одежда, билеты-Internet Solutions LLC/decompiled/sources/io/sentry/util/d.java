package io.sentry.util;

import io.sentry.C;
import io.sentry.C7230z2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d {
    public static boolean a(@NotNull C7230z2 c7230z2, List list) {
        if (c7230z2 == null || list == null || list.isEmpty()) {
            return false;
        }
        HashSet hashSet = new HashSet();
        io.sentry.protocol.m q02 = c7230z2.q0();
        if (q02 != null) {
            String e11 = q02.e();
            if (e11 != null) {
                hashSet.add(e11);
            }
            String d11 = q02.d();
            if (d11 != null) {
                hashSet.add(d11);
            }
        }
        Throwable O11 = c7230z2.O();
        if (O11 != null) {
            hashSet.add(O11.toString());
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (hashSet.contains(((C) it.next()).a())) {
                return true;
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C c11 = (C) it2.next();
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                if (c11.b((String) it3.next())) {
                    return true;
                }
            }
        }
        return false;
    }
}
