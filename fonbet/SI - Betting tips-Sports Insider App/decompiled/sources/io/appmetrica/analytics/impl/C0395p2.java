package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0395p2 {

    /* renamed from: a, reason: collision with root package name */
    public final We f14450a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14451b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14452c;

    /* renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f14453d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f14454e;

    public C0395p2(Q4 q42, We we2) {
        this.f14450a = we2;
        q42.b();
        this.f14451b = TimeUnit.MINUTES.toMillis(1L);
        this.f14452c = TimeUnit.DAYS.toMillis(7L);
        this.f14453d = new SystemTimeProvider();
        Map<String, Long> f6 = we2.f();
        a(f6);
        this.f14454e = f6;
    }

    public final void a(Map map) {
        long currentTimeMillis = this.f14453d.currentTimeMillis();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (((Number) entry.getValue()).longValue() < currentTimeMillis - this.f14452c) {
                linkedHashSet.add(str);
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
    }
}
