package org.chromium.net.impl;

import N3.C3660k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.D;

/* loaded from: classes6.dex */
public final class c0 extends org.chromium.net.D {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f78918a;

    /* renamed from: b, reason: collision with root package name */
    private final int f78919b;

    /* renamed from: c, reason: collision with root package name */
    private final String f78920c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f78921d;

    /* renamed from: e, reason: collision with root package name */
    private final String f78922e;

    /* renamed from: f, reason: collision with root package name */
    private final String f78923f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicLong f78924g;

    /* renamed from: h, reason: collision with root package name */
    private final a f78925h;

    public static final class a extends D.a {

        /* renamed from: a, reason: collision with root package name */
        private final List<Map.Entry<String, String>> f78926a;

        /* renamed from: b, reason: collision with root package name */
        private Map<String, List<String>> f78927b;

        a(List<Map.Entry<String, String>> list) {
            this.f78926a = list;
        }

        public final List<Map.Entry<String, String>> a() {
            return this.f78926a;
        }

        public final Map<String, List<String>> b() {
            Map<String, List<String>> map = this.f78927b;
            if (map != null) {
                return map;
            }
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (Map.Entry<String, String> entry : this.f78926a) {
                ArrayList arrayList = new ArrayList();
                if (treeMap.containsKey(entry.getKey())) {
                    arrayList.addAll((Collection) treeMap.get(entry.getKey()));
                }
                arrayList.add(entry.getValue());
                treeMap.put(entry.getKey(), Collections.unmodifiableList(arrayList));
            }
            Map<String, List<String>> unmodifiableMap = Collections.unmodifiableMap(treeMap);
            this.f78927b = unmodifiableMap;
            return unmodifiableMap;
        }
    }

    public c0(List list, int i11, String str, ArrayList arrayList, boolean z11, String str2, String str3, long j11) {
        this.f78918a = Collections.unmodifiableList(list);
        this.f78919b = i11;
        this.f78920c = str;
        this.f78925h = new a(Collections.unmodifiableList(arrayList));
        this.f78921d = z11;
        this.f78922e = str2;
        this.f78923f = str3;
        this.f78924g = new AtomicLong(j11);
    }

    @Override // org.chromium.net.D
    public final Map<String, List<String>> a() {
        return this.f78925h.b();
    }

    @Override // org.chromium.net.D
    public final int b() {
        return this.f78919b;
    }

    @Override // org.chromium.net.D
    public final String c() {
        return this.f78920c;
    }

    @Override // org.chromium.net.D
    public final String d() {
        return this.f78922e;
    }

    @Override // org.chromium.net.D
    public final String e() {
        return this.f78923f;
    }

    @Override // org.chromium.net.D
    public final long f() {
        return this.f78924g.get();
    }

    @Override // org.chromium.net.D
    public final String g() {
        return this.f78918a.get(r0.size() - 1);
    }

    @Override // org.chromium.net.D
    public final boolean h() {
        return this.f78921d;
    }

    public final void i(long j11) {
        this.f78924g.set(j11);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String g10 = g();
        String obj = this.f78918a.toString();
        String obj2 = this.f78925h.a().toString();
        long j11 = this.f78924g.get();
        StringBuilder d11 = C3660k.d("UrlResponseInfo@[", hexString, "][", g10, "]: urlChain = ");
        d11.append(obj);
        d11.append(", httpStatus = ");
        d11.append(this.f78919b);
        d11.append(" ");
        Nh.a.h(d11, this.f78920c, ", headers = ", obj2, ", wasCached = ");
        d11.append(this.f78921d);
        d11.append(", negotiatedProtocol = ");
        d11.append(this.f78922e);
        d11.append(", proxyServer= ");
        d11.append(this.f78923f);
        d11.append(", receivedByteCount = ");
        d11.append(j11);
        return d11.toString();
    }
}
