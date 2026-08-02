package com.google.crypto.tink.aead;

import com.google.crypto.tink.aead.A;
import com.google.crypto.tink.internal.b;
import com.google.crypto.tink.shaded.protobuf.C3484p;
import db.C4049a;
import db.C4050b;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public static final C4049a f36886a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.k f36887b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.j f36888c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.c f36889d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.b f36890e;

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
        C4049a e10 = com.google.crypto.tink.internal.t.e("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f36886a = e10;
        f36887b = com.google.crypto.tink.internal.k.a(new C3455j(), A.class, com.google.crypto.tink.internal.p.class);
        f36888c = com.google.crypto.tink.internal.j.a(new C3456k(), e10, com.google.crypto.tink.internal.p.class);
        f36889d = com.google.crypto.tink.internal.c.a(new l(), y.class, com.google.crypto.tink.internal.o.class);
        f36890e = com.google.crypto.tink.internal.b.a(new b.InterfaceC0515b() { // from class: com.google.crypto.tink.aead.B
            @Override // com.google.crypto.tink.internal.b.InterfaceC0515b
            public final com.google.crypto.tink.g a(com.google.crypto.tink.internal.q qVar, com.google.crypto.tink.y yVar) {
                y b10;
                b10 = C.b((com.google.crypto.tink.internal.o) qVar, yVar);
                return b10;
            }
        }, e10, com.google.crypto.tink.internal.o.class);
    }

    public static y b(com.google.crypto.tink.internal.o oVar, com.google.crypto.tink.y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            com.google.crypto.tink.proto.r U10 = com.google.crypto.tink.proto.r.U(oVar.g(), C3484p.b());
            if (U10.S() == 0) {
                return y.a(e(oVar.e()), C4050b.a(U10.R().r(), com.google.crypto.tink.y.b(yVar)), oVar.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static void c() {
        d(com.google.crypto.tink.internal.i.a());
    }

    public static void d(com.google.crypto.tink.internal.i iVar) {
        iVar.h(f36887b);
        iVar.g(f36888c);
        iVar.f(f36889d);
        iVar.e(f36890e);
    }

    public static A.a e(com.google.crypto.tink.proto.I i10) {
        int i11 = a.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[i10.ordinal()];
        if (i11 == 1) {
            return A.a.f36882b;
        }
        if (i11 == 2 || i11 == 3) {
            return A.a.f36883c;
        }
        if (i11 == 4) {
            return A.a.f36884d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.getNumber());
    }
}
