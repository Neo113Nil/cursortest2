package com.google.crypto.tink.mac;

import com.google.crypto.tink.aead.C3455j;
import com.google.crypto.tink.aead.C3456k;
import com.google.crypto.tink.internal.b;
import com.google.crypto.tink.internal.t;
import com.google.crypto.tink.mac.l;
import com.google.crypto.tink.proto.I;
import com.google.crypto.tink.proto.u;
import com.google.crypto.tink.proto.v;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.C3484p;
import com.google.crypto.tink.y;
import db.C4049a;
import db.C4050b;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final C4049a f37164a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.k f37165b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.j f37166c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.c f37167d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.b f37168e;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType;
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
            int[] iArr2 = new int[u.values().length];
            $SwitchMap$com$google$crypto$tink$proto$HashType = iArr2;
            try {
                iArr2[u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[u.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[u.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[u.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[u.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        C4049a e10 = t.e("type.googleapis.com/google.crypto.tink.HmacKey");
        f37164a = e10;
        f37165b = com.google.crypto.tink.internal.k.a(new C3455j(), l.class, com.google.crypto.tink.internal.p.class);
        f37166c = com.google.crypto.tink.internal.j.a(new C3456k(), e10, com.google.crypto.tink.internal.p.class);
        f37167d = com.google.crypto.tink.internal.c.a(new com.google.crypto.tink.aead.l(), i.class, com.google.crypto.tink.internal.o.class);
        f37168e = com.google.crypto.tink.internal.b.a(new b.InterfaceC0515b() { // from class: com.google.crypto.tink.mac.m
            @Override // com.google.crypto.tink.internal.b.InterfaceC0515b
            public final com.google.crypto.tink.g a(com.google.crypto.tink.internal.q qVar, y yVar) {
                i b10;
                b10 = n.b((com.google.crypto.tink.internal.o) qVar, yVar);
                return b10;
            }
        }, e10, com.google.crypto.tink.internal.o.class);
    }

    public static i b(com.google.crypto.tink.internal.o oVar, y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            v X10 = v.X(oVar.g(), C3484p.b());
            if (X10.V() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return i.c().e(l.a().c(X10.T().size()).d(X10.U().T()).b(e(X10.U().S())).e(f(oVar.e())).a()).d(C4050b.a(X10.T().r(), y.b(yVar))).c(oVar.c()).a();
        } catch (A | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static void c() {
        d(com.google.crypto.tink.internal.i.a());
    }

    public static void d(com.google.crypto.tink.internal.i iVar) {
        iVar.h(f37165b);
        iVar.g(f37166c);
        iVar.f(f37167d);
        iVar.e(f37168e);
    }

    public static l.c e(u uVar) {
        int i10 = a.$SwitchMap$com$google$crypto$tink$proto$HashType[uVar.ordinal()];
        if (i10 == 1) {
            return l.c.f37153b;
        }
        if (i10 == 2) {
            return l.c.f37154c;
        }
        if (i10 == 3) {
            return l.c.f37155d;
        }
        if (i10 == 4) {
            return l.c.f37156e;
        }
        if (i10 == 5) {
            return l.c.f37157f;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + uVar.getNumber());
    }

    public static l.d f(I i10) {
        int i11 = a.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[i10.ordinal()];
        if (i11 == 1) {
            return l.d.f37159b;
        }
        if (i11 == 2) {
            return l.d.f37160c;
        }
        if (i11 == 3) {
            return l.d.f37161d;
        }
        if (i11 == 4) {
            return l.d.f37162e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.getNumber());
    }
}
