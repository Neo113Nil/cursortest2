package com.google.crypto.tink.mac;

import com.google.crypto.tink.aead.C3455j;
import com.google.crypto.tink.aead.C3456k;
import com.google.crypto.tink.internal.b;
import com.google.crypto.tink.internal.t;
import com.google.crypto.tink.mac.d;
import com.google.crypto.tink.proto.C3457a;
import com.google.crypto.tink.proto.I;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.C3484p;
import com.google.crypto.tink.y;
import db.C4049a;
import db.C4050b;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final C4049a f37129a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.k f37130b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.j f37131c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.c f37132d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.b f37133e;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[I.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr;
            try {
                iArr[I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C4049a e10 = t.e("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f37129a = e10;
        f37130b = com.google.crypto.tink.internal.k.a(new C3455j(), d.class, com.google.crypto.tink.internal.p.class);
        f37131c = com.google.crypto.tink.internal.j.a(new C3456k(), e10, com.google.crypto.tink.internal.p.class);
        f37132d = com.google.crypto.tink.internal.c.a(new com.google.crypto.tink.aead.l(), com.google.crypto.tink.mac.a.class, com.google.crypto.tink.internal.o.class);
        f37133e = com.google.crypto.tink.internal.b.a(new b.InterfaceC0515b() { // from class: com.google.crypto.tink.mac.e
            @Override // com.google.crypto.tink.internal.b.InterfaceC0515b
            public final com.google.crypto.tink.g a(com.google.crypto.tink.internal.q qVar, y yVar) {
                a b10;
                b10 = f.b((com.google.crypto.tink.internal.o) qVar, yVar);
                return b10;
            }
        }, e10, com.google.crypto.tink.internal.o.class);
    }

    public static com.google.crypto.tink.mac.a b(com.google.crypto.tink.internal.o oVar, y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
        try {
            C3457a W10 = C3457a.W(oVar.g(), C3484p.b());
            if (W10.U() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return com.google.crypto.tink.mac.a.c().e(d.a().b(W10.S().size()).c(W10.T().R()).d(e(oVar.e())).a()).c(C4050b.a(W10.S().r(), y.b(yVar))).d(oVar.c()).a();
        } catch (A | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static void c() {
        d(com.google.crypto.tink.internal.i.a());
    }

    public static void d(com.google.crypto.tink.internal.i iVar) {
        iVar.h(f37130b);
        iVar.g(f37131c);
        iVar.f(f37132d);
        iVar.e(f37133e);
    }

    public static d.c e(I i10) {
        int i11 = a.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[i10.ordinal()];
        if (i11 == 1) {
            return d.c.f37124b;
        }
        if (i11 == 2) {
            return d.c.f37125c;
        }
        if (i11 == 3) {
            return d.c.f37126d;
        }
        if (i11 == 4) {
            return d.c.f37127e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.getNumber());
    }
}
