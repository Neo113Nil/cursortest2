package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC3491x;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3484p {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f37370b = true;

    /* renamed from: c, reason: collision with root package name */
    public static volatile C3484p f37371c;

    /* renamed from: d, reason: collision with root package name */
    public static final C3484p f37372d = new C3484p(true);

    /* renamed from: a, reason: collision with root package name */
    public final Map f37373a = Collections.EMPTY_MAP;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.p$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f37374a;

        /* renamed from: b, reason: collision with root package name */
        public final int f37375b;

        public a(Object obj, int i10) {
            this.f37374a = obj;
            this.f37375b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f37374a == aVar.f37374a && this.f37375b == aVar.f37375b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f37374a) * 65535) + this.f37375b;
        }
    }

    public C3484p(boolean z10) {
    }

    public static C3484p b() {
        C3484p c3484p;
        C3484p c3484p2 = f37371c;
        if (c3484p2 != null) {
            return c3484p2;
        }
        synchronized (C3484p.class) {
            try {
                c3484p = f37371c;
                if (c3484p == null) {
                    c3484p = f37370b ? AbstractC3483o.a() : f37372d;
                    f37371c = c3484p;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c3484p;
    }

    public AbstractC3491x.c a(O o10, int i10) {
        android.support.v4.media.session.b.a(this.f37373a.get(new a(o10, i10)));
        return null;
    }
}
