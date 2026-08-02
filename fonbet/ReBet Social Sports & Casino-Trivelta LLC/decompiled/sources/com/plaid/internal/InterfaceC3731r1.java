package com.plaid.internal;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.plaid.internal.r1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3731r1 {

    /* renamed from: com.plaid.internal.r1$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f41011a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f41012b;

        /* renamed from: c, reason: collision with root package name */
        public final int f41013c;

        /* renamed from: d, reason: collision with root package name */
        public final String f41014d;

        public a(String str, boolean z10, String str2, int i10) {
            this.f41011a = str;
            this.f41012b = z10;
            this.f41014d = str2;
            this.f41013c = i10;
        }
    }

    /* renamed from: com.plaid.internal.r1$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f41015a;

        /* renamed from: b, reason: collision with root package name */
        public final int f41016b;

        /* renamed from: c, reason: collision with root package name */
        public final String f41017c;

        /* renamed from: d, reason: collision with root package name */
        public final Map<String, String> f41018d;

        public b(int i10, String str, String str2, Map<String, List<String>> map) {
            this.f41015a = str2;
            this.f41016b = i10;
            this.f41017c = str;
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    hashMap.put(entry.getKey().toLowerCase(), TextUtils.join(", ", entry.getValue()));
                }
            }
            this.f41018d = Collections.unmodifiableMap(hashMap);
        }
    }

    b a(a aVar);

    void a();

    EnumC3801z isConnected();
}
