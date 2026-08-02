package com.google.crypto.tink.aead;

import com.google.crypto.tink.aead.I;
import com.google.crypto.tink.internal.b;
import com.google.crypto.tink.shaded.protobuf.C3484p;
import db.C4049a;
import db.C4050b;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final C4049a f36905a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.k f36906b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.j f36907c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.c f36908d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.b f36909e;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[com.google.crypto.tink.proto.I.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr;
            try {
                iArr[com.google.crypto.tink.proto.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C4049a e10 = com.google.crypto.tink.internal.t.e("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f36905a = e10;
        f36906b = com.google.crypto.tink.internal.k.a(new C3455j(), I.class, com.google.crypto.tink.internal.p.class);
        f36907c = com.google.crypto.tink.internal.j.a(new C3456k(), e10, com.google.crypto.tink.internal.p.class);
        f36908d = com.google.crypto.tink.internal.c.a(new l(), G.class, com.google.crypto.tink.internal.o.class);
        f36909e = com.google.crypto.tink.internal.b.a(new b.InterfaceC0515b() { // from class: com.google.crypto.tink.aead.J
            @Override // com.google.crypto.tink.internal.b.InterfaceC0515b
            public final com.google.crypto.tink.g a(com.google.crypto.tink.internal.q qVar, com.google.crypto.tink.y yVar) {
                G b10;
                b10 = K.b((com.google.crypto.tink.internal.o) qVar, yVar);
                return b10;
            }
        }, e10, com.google.crypto.tink.internal.o.class);
    }

    public static G b(com.google.crypto.tink.internal.o oVar, com.google.crypto.tink.y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            com.google.crypto.tink.proto.K U10 = com.google.crypto.tink.proto.K.U(oVar.g(), C3484p.b());
            if (U10.S() == 0) {
                return G.a(e(oVar.e()), C4050b.a(U10.R().r(), com.google.crypto.tink.y.b(yVar)), oVar.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static void c() {
        d(com.google.crypto.tink.internal.i.a());
    }

    public static void d(com.google.crypto.tink.internal.i iVar) {
        iVar.h(f36906b);
        iVar.g(f36907c);
        iVar.f(f36908d);
        iVar.e(f36909e);
    }

    public static I.a e(com.google.crypto.tink.proto.I i10) {
        int i11 = a.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[i10.ordinal()];
        if (i11 == 1) {
            return I.a.f36901b;
        }
        if (i11 == 2 || i11 == 3) {
            return I.a.f36902c;
        }
        if (i11 == 4) {
            return I.a.f36903d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.getNumber());
    }
}
