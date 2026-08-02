package com.google.crypto.tink.internal;

import ab.InterfaceC1929b;
import ab.c;
import com.google.crypto.tink.proto.z;
import com.google.crypto.tink.v;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC1929b.a f37054a = new b(null);

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$KeyStatusType;

        static {
            int[] iArr = new int[z.values().length];
            $SwitchMap$com$google$crypto$tink$proto$KeyStatusType = iArr;
            try {
                iArr[z.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$KeyStatusType[z.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$KeyStatusType[z.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b implements InterfaceC1929b.a {
        public b() {
        }

        @Override // ab.InterfaceC1929b.a
        public void a(int i10, long j10) {
        }

        @Override // ab.InterfaceC1929b.a
        public void b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static ab.c a(v vVar) {
        c.b a10 = ab.c.a();
        a10.d(vVar.d());
        Iterator it = vVar.c().iterator();
        while (it.hasNext()) {
            for (v.c cVar : (List) it.next()) {
                a10.a(c(cVar.h()), cVar.d(), b(cVar.e()), cVar.f().name());
            }
        }
        if (vVar.e() != null) {
            a10.e(vVar.e().d());
        }
        try {
            return a10.b();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static String b(String str) {
        return !str.startsWith("type.googleapis.com/google.crypto.") ? str : str.substring(34);
    }

    public static com.google.crypto.tink.k c(z zVar) {
        int i10 = a.$SwitchMap$com$google$crypto$tink$proto$KeyStatusType[zVar.ordinal()];
        if (i10 == 1) {
            return com.google.crypto.tink.k.f37100b;
        }
        if (i10 == 2) {
            return com.google.crypto.tink.k.f37101c;
        }
        if (i10 == 3) {
            return com.google.crypto.tink.k.f37102d;
        }
        throw new IllegalStateException("Unknown key status");
    }
}
