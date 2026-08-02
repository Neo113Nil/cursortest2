package org.joda.time.tz;

import java.util.Collections;
import java.util.Set;
import org.joda.time.DateTimeZone;

/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f79403a = Collections.singleton("UTC");

    @Override // org.joda.time.tz.c
    public final DateTimeZone a(String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return DateTimeZone.f78989a;
        }
        return null;
    }

    @Override // org.joda.time.tz.c
    public final Set<String> b() {
        return f79403a;
    }
}
