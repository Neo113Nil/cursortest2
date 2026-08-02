package com.google.crypto.tink.mac;

import ab.InterfaceC1929b;
import com.google.crypto.tink.proto.I;
import com.google.crypto.tink.t;
import com.google.crypto.tink.v;
import com.google.crypto.tink.w;
import com.google.crypto.tink.x;
import db.C4049a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public class r implements w {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f37173a = Logger.getLogger(r.class.getName());
    private static final byte[] FORMAT_VERSION = {0};

    /* renamed from: b, reason: collision with root package name */
    public static final r f37174b = new r();

    public static class b implements t {

        /* renamed from: a, reason: collision with root package name */
        public final v f37175a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC1929b.a f37176b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC1929b.a f37177c;

        @Override // com.google.crypto.tink.t
        public void a(byte[] bArr, byte[] bArr2) {
            if (bArr.length <= 5) {
                this.f37177c.b();
                throw new GeneralSecurityException("tag too short");
            }
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (v.c cVar : this.f37175a.f(copyOf)) {
                try {
                    ((t) cVar.g()).a(copyOfRange, cVar.f().equals(I.LEGACY) ? cb.f.a(bArr2, r.FORMAT_VERSION) : bArr2);
                    this.f37177c.a(cVar.d(), r3.length);
                    return;
                } catch (GeneralSecurityException e10) {
                    r.f37173a.info("tag prefix matches a key, but cannot verify: " + e10);
                }
            }
            for (v.c cVar2 : this.f37175a.h()) {
                try {
                    ((t) cVar2.g()).a(bArr, bArr2);
                    this.f37177c.a(cVar2.d(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f37177c.b();
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // com.google.crypto.tink.t
        public byte[] b(byte[] bArr) {
            if (this.f37175a.e().f().equals(I.LEGACY)) {
                bArr = cb.f.a(bArr, r.FORMAT_VERSION);
            }
            try {
                byte[] a10 = cb.f.a(this.f37175a.e().b(), ((t) this.f37175a.e().g()).b(bArr));
                this.f37176b.a(this.f37175a.e().d(), bArr.length);
                return a10;
            } catch (GeneralSecurityException e10) {
                this.f37176b.b();
                throw e10;
            }
        }

        public b(v vVar) {
            this.f37175a = vVar;
            if (!vVar.i()) {
                InterfaceC1929b.a aVar = com.google.crypto.tink.internal.f.f37054a;
                this.f37176b = aVar;
                this.f37177c = aVar;
            } else {
                InterfaceC1929b a10 = com.google.crypto.tink.internal.g.b().a();
                ab.c a11 = com.google.crypto.tink.internal.f.a(vVar);
                this.f37176b = a10.a(a11, "mac", "compute");
                this.f37177c = a10.a(a11, "mac", "verify");
            }
        }
    }

    public static void f() {
        x.n(f37174b);
    }

    @Override // com.google.crypto.tink.w
    public Class b() {
        return t.class;
    }

    @Override // com.google.crypto.tink.w
    public Class c() {
        return t.class;
    }

    public final void g(v vVar) {
        Iterator it = vVar.c().iterator();
        while (it.hasNext()) {
            for (v.c cVar : (List) it.next()) {
                if (cVar.c() instanceof p) {
                    p pVar = (p) cVar.c();
                    C4049a a10 = C4049a.a(cVar.b());
                    if (!a10.equals(pVar.a())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + pVar.b() + " has wrong output prefix (" + pVar.a() + ") instead of (" + a10 + ")");
                    }
                }
            }
        }
    }

    @Override // com.google.crypto.tink.w
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public t a(v vVar) {
        g(vVar);
        return new b(vVar);
    }
}
