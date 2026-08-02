package com.google.crypto.tink.aead;

import com.google.crypto.tink.aead.C3454i;
import com.google.crypto.tink.internal.b;
import com.google.crypto.tink.proto.C3465i;
import com.google.crypto.tink.shaded.protobuf.C3484p;
import db.C4049a;
import db.C4050b;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final C4049a f36956a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.k f36957b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.j f36958c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.c f36959d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.b f36960e;

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
        C4049a e10 = com.google.crypto.tink.internal.t.e("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f36956a = e10;
        f36957b = com.google.crypto.tink.internal.k.a(new C3455j(), C3454i.class, com.google.crypto.tink.internal.p.class);
        f36958c = com.google.crypto.tink.internal.j.a(new C3456k(), e10, com.google.crypto.tink.internal.p.class);
        f36959d = com.google.crypto.tink.internal.c.a(new l(), C3452g.class, com.google.crypto.tink.internal.o.class);
        f36960e = com.google.crypto.tink.internal.b.a(new b.InterfaceC0515b() { // from class: com.google.crypto.tink.aead.m
            @Override // com.google.crypto.tink.internal.b.InterfaceC0515b
            public final com.google.crypto.tink.g a(com.google.crypto.tink.internal.q qVar, com.google.crypto.tink.y yVar) {
                C3452g b10;
                b10 = n.b((com.google.crypto.tink.internal.o) qVar, yVar);
                return b10;
            }
        }, e10, com.google.crypto.tink.internal.o.class);
    }

    public static C3452g b(com.google.crypto.tink.internal.o oVar, com.google.crypto.tink.y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
        }
        try {
            C3465i W10 = C3465i.W(oVar.g(), C3484p.b());
            if (W10.U() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C3452g.a().e(C3454i.a().c(W10.S().size()).b(W10.T().R()).d(16).e(e(oVar.e())).a()).d(C4050b.a(W10.S().r(), com.google.crypto.tink.y.b(yVar))).c(oVar.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static void c() {
        d(com.google.crypto.tink.internal.i.a());
    }

    public static void d(com.google.crypto.tink.internal.i iVar) {
        iVar.h(f36957b);
        iVar.g(f36958c);
        iVar.f(f36959d);
        iVar.e(f36960e);
    }

    public static C3454i.c e(com.google.crypto.tink.proto.I i10) {
        int i11 = a.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[i10.ordinal()];
        if (i11 == 1) {
            return C3454i.c.f36944b;
        }
        if (i11 == 2 || i11 == 3) {
            return C3454i.c.f36945c;
        }
        if (i11 == 4) {
            return C3454i.c.f36946d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.getNumber());
    }
}
