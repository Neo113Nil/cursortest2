package com.google.crypto.tink.aead;

import com.google.crypto.tink.aead.q;
import com.google.crypto.tink.internal.b;
import com.google.crypto.tink.proto.C3468l;
import com.google.crypto.tink.shaded.protobuf.C3484p;
import db.C4049a;
import db.C4050b;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final C4049a f36981a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.k f36982b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.j f36983c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.c f36984d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.google.crypto.tink.internal.b f36985e;

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
        C4049a e10 = com.google.crypto.tink.internal.t.e("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f36981a = e10;
        f36982b = com.google.crypto.tink.internal.k.a(new C3455j(), q.class, com.google.crypto.tink.internal.p.class);
        f36983c = com.google.crypto.tink.internal.j.a(new C3456k(), e10, com.google.crypto.tink.internal.p.class);
        f36984d = com.google.crypto.tink.internal.c.a(new l(), o.class, com.google.crypto.tink.internal.o.class);
        f36985e = com.google.crypto.tink.internal.b.a(new b.InterfaceC0515b() { // from class: com.google.crypto.tink.aead.r
            @Override // com.google.crypto.tink.internal.b.InterfaceC0515b
            public final com.google.crypto.tink.g a(com.google.crypto.tink.internal.q qVar, com.google.crypto.tink.y yVar) {
                o b10;
                b10 = s.b((com.google.crypto.tink.internal.o) qVar, yVar);
                return b10;
            }
        }, e10, com.google.crypto.tink.internal.o.class);
    }

    public static o b(com.google.crypto.tink.internal.o oVar, com.google.crypto.tink.y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
        }
        try {
            C3468l U10 = C3468l.U(oVar.g(), C3484p.b());
            if (U10.S() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return o.a().e(q.a().c(U10.R().size()).b(12).d(16).e(e(oVar.e())).a()).d(C4050b.a(U10.R().r(), com.google.crypto.tink.y.b(yVar))).c(oVar.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static void c() {
        d(com.google.crypto.tink.internal.i.a());
    }

    public static void d(com.google.crypto.tink.internal.i iVar) {
        iVar.h(f36982b);
        iVar.g(f36983c);
        iVar.f(f36984d);
        iVar.e(f36985e);
    }

    public static q.c e(com.google.crypto.tink.proto.I i10) {
        int i11 = a.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[i10.ordinal()];
        if (i11 == 1) {
            return q.c.f36977b;
        }
        if (i11 == 2 || i11 == 3) {
            return q.c.f36978c;
        }
        if (i11 == 4) {
            return q.c.f36979d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i10.getNumber());
    }
}
