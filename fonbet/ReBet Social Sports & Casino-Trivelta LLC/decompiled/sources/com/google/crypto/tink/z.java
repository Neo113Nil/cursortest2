package com.google.crypto.tink;

import com.google.crypto.tink.proto.C;
import com.google.crypto.tink.proto.D;
import com.google.crypto.tink.proto.I;
import com.google.crypto.tink.proto.y;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f37516a = Charset.forName("UTF-8");

    public static D.c a(C.c cVar) {
        return (D.c) D.c.U().o(cVar.T().U()).n(cVar.W()).m(cVar.V()).l(cVar.U()).c();
    }

    public static D b(C c10) {
        D.b m10 = D.U().m(c10.W());
        Iterator it = c10.V().iterator();
        while (it.hasNext()) {
            m10.l(a((C.c) it.next()));
        }
        return (D) m10.c();
    }

    public static void c(C.c cVar) {
        if (!cVar.X()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cVar.U())));
        }
        if (cVar.V() == I.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cVar.U())));
        }
        if (cVar.W() == com.google.crypto.tink.proto.z.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cVar.U())));
        }
    }

    public static void d(C c10) {
        int W10 = c10.W();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (C.c cVar : c10.V()) {
            if (cVar.W() == com.google.crypto.tink.proto.z.ENABLED) {
                c(cVar);
                if (cVar.U() == W10) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                if (cVar.T().T() != y.c.ASYMMETRIC_PUBLIC) {
                    z11 = false;
                }
                i10++;
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
