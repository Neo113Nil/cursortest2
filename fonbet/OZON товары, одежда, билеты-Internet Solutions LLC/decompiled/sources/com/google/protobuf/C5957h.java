package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5957h {

    /* renamed from: b, reason: collision with root package name */
    private static volatile C5957h f60205b;

    /* renamed from: c, reason: collision with root package name */
    static final C5957h f60206c = new C5957h(0);

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, GeneratedMessageLite.GeneratedExtension<?, ?>> f60207a;

    /* renamed from: com.google.protobuf.h$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final MessageLite f60208a;

        /* renamed from: b, reason: collision with root package name */
        private final int f60209b;

        a(int i11, MessageLite messageLite) {
            this.f60208a = messageLite;
            this.f60209b = i11;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f60208a == aVar.f60208a && this.f60209b == aVar.f60209b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f60208a) * 65535) + this.f60209b;
        }
    }

    C5957h() {
        this.f60207a = new HashMap();
    }

    public static C5957h b() {
        C5957h c5957h;
        int i11 = C5950a.f60193b;
        C5957h c5957h2 = f60205b;
        if (c5957h2 != null) {
            return c5957h2;
        }
        synchronized (C5957h.class) {
            try {
                c5957h = f60205b;
                if (c5957h == null) {
                    Class<?> cls = C5956g.f60204a;
                    C5957h c5957h3 = null;
                    if (cls != null) {
                        try {
                            c5957h3 = (C5957h) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    c5957h = c5957h3 != null ? c5957h3 : f60206c;
                    f60205b = c5957h;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5957h;
    }

    public final GeneratedMessageLite.GeneratedExtension a(int i11, MessageLite messageLite) {
        return this.f60207a.get(new a(i11, messageLite));
    }

    C5957h(int i11) {
        this.f60207a = Collections.EMPTY_MAP;
    }
}
