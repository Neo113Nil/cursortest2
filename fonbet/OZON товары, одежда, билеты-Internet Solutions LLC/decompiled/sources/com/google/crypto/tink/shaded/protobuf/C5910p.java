package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC5917x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5910p {

    /* renamed from: b, reason: collision with root package name */
    private static volatile C5910p f59445b;

    /* renamed from: c, reason: collision with root package name */
    static final C5910p f59446c = new C5910p(0);

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, AbstractC5917x.e<?, ?>> f59447a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.p$a */
    /* loaded from: classes9.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final S f59448a;

        /* renamed from: b, reason: collision with root package name */
        private final int f59449b;

        a(S s11, int i11) {
            this.f59448a = s11;
            this.f59449b = i11;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f59448a == aVar.f59448a && this.f59449b == aVar.f59449b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f59448a) * 65535) + this.f59449b;
        }
    }

    C5910p() {
        this.f59447a = new HashMap();
    }

    public static C5910p b() {
        C5910p c5910p;
        int i11 = c0.f59349d;
        C5910p c5910p2 = f59445b;
        if (c5910p2 != null) {
            return c5910p2;
        }
        synchronized (C5910p.class) {
            try {
                c5910p = f59445b;
                if (c5910p == null) {
                    Class<?> cls = C5909o.f59444a;
                    C5910p c5910p3 = null;
                    if (cls != null) {
                        try {
                            c5910p3 = (C5910p) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    c5910p = c5910p3 != null ? c5910p3 : f59446c;
                    f59445b = c5910p;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c5910p;
    }

    public final <ContainingType extends S> AbstractC5917x.e<ContainingType, ?> a(ContainingType containingtype, int i11) {
        return (AbstractC5917x.e) this.f59447a.get(new a(containingtype, i11));
    }

    C5910p(int i11) {
        this.f59447a = Collections.EMPTY_MAP;
    }
}
