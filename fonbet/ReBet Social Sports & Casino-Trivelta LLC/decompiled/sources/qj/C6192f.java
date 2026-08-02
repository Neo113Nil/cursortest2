package qj;

import Qi.u;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.C5932j;
import org.spongycastle.asn1.C5933k;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.asn1.X;
import sj.C6370a;
import sj.C6372c;

/* renamed from: qj.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6192f extends Cj.e {

    /* renamed from: a, reason: collision with root package name */
    public final Map f63682a;

    /* renamed from: qj.f$b */
    public class b implements InterfaceC6191e {
        public b() {
        }

        @Override // qj.InterfaceC6191e
        public C6190d a(byte[] bArr) {
            try {
                AbstractC5941t k10 = AbstractC5941t.k(bArr);
                if (k10.size() != 6) {
                    throw new C6189c("malformed sequence in DSA private key");
                }
                C5933k k11 = C5933k.k(k10.n(1));
                C5933k k12 = C5933k.k(k10.n(2));
                C5933k k13 = C5933k.k(k10.n(3));
                C5933k k14 = C5933k.k(k10.n(4));
                C5933k k15 = C5933k.k(k10.n(5));
                C5936n c5936n = Ri.n.f10481k4;
                return new C6190d(new u(new Qi.a(c5936n, new Qi.i(k11.n(), k12.n(), k13.n())), k14), new Li.g(new Qi.a(c5936n, new Qi.i(k11.n(), k12.n(), k13.n())), k15));
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new C6189c("problem creating DSA private key: " + e11.toString(), e11);
            }
        }
    }

    /* renamed from: qj.f$c */
    public class c implements Cj.d {
        public c() {
        }

        @Override // Cj.d
        public Object a(Cj.b bVar) {
            try {
                AbstractC5940s g10 = AbstractC5940s.g(bVar.a());
                if (g10 instanceof C5936n) {
                    return AbstractC5940s.g(bVar.a());
                }
                if (g10 instanceof AbstractC5941t) {
                    return Ri.h.e(g10);
                }
                return null;
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new C6189c("exception extracting EC named curve: " + e11.toString());
            }
        }
    }

    /* renamed from: qj.f$d */
    public class d implements InterfaceC6191e {
        public d() {
        }

        @Override // qj.InterfaceC6191e
        public C6190d a(byte[] bArr) {
            try {
                Mi.a c10 = Mi.a.c(AbstractC5941t.k(bArr));
                Qi.a aVar = new Qi.a(Ri.n.f10440A3, c10.f());
                return new C6190d(new u(aVar, c10.g().m()), new Li.g(aVar, c10));
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new C6189c("problem creating EC private key: " + e11.toString(), e11);
            }
        }
    }

    /* renamed from: qj.f$e */
    public class e implements Cj.d {
        public e() {
        }

        @Override // Cj.d
        public Object a(Cj.b bVar) {
            try {
                return new C6372c(Li.e.c(bVar.a()));
            } catch (Exception e10) {
                throw new C6189c("problem parsing ENCRYPTED PRIVATE KEY: " + e10.toString(), e10);
            }
        }
    }

    /* renamed from: qj.f$f, reason: collision with other inner class name */
    public class C0884f implements Cj.d {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC6191e f63687a;

        public C0884f(InterfaceC6191e interfaceC6191e) {
            this.f63687a = interfaceC6191e;
        }

        @Override // Cj.d
        public Object a(Cj.b bVar) {
            boolean z10 = false;
            String str = null;
            for (Cj.a aVar : bVar.b()) {
                if (aVar.b().equals("Proc-Type") && aVar.c().equals("4,ENCRYPTED")) {
                    z10 = true;
                } else if (aVar.b().equals("DEK-Info")) {
                    str = aVar.c();
                }
            }
            byte[] a10 = bVar.a();
            try {
                if (!z10) {
                    return this.f63687a.a(a10);
                }
                StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
                return new C6188b(stringTokenizer.nextToken(), org.spongycastle.util.encoders.f.a(stringTokenizer.nextToken()), a10, this.f63687a);
            } catch (IOException e10) {
                if (z10) {
                    throw new C6189c("exception decoding - please check password and data.", e10);
                }
                throw new C6189c(e10.getMessage(), e10);
            } catch (IllegalArgumentException e11) {
                if (z10) {
                    throw new C6189c("exception decoding - please check password and data.", e11);
                }
                throw new C6189c(e11.getMessage(), e11);
            }
        }
    }

    /* renamed from: qj.f$g */
    public class g implements Cj.d {
        public g() {
        }

        @Override // Cj.d
        public Object a(Cj.b bVar) {
            try {
                return new C6370a(bVar.a());
            } catch (Exception e10) {
                throw new C6189c("problem parsing certrequest: " + e10.toString(), e10);
            }
        }
    }

    /* renamed from: qj.f$h */
    public class h implements Cj.d {
        public h() {
        }

        @Override // Cj.d
        public Object a(Cj.b bVar) {
            try {
                return Di.a.c(new C5932j(bVar.a()).D0());
            } catch (Exception e10) {
                throw new C6189c("problem parsing PKCS7 object: " + e10.toString(), e10);
            }
        }
    }

    /* renamed from: qj.f$i */
    public class i implements Cj.d {
        public i() {
        }

        @Override // Cj.d
        public Object a(Cj.b bVar) {
            try {
                return Li.g.e(bVar.a());
            } catch (Exception e10) {
                throw new C6189c("problem parsing PRIVATE KEY: " + e10.toString(), e10);
            }
        }
    }

    /* renamed from: qj.f$j */
    public class j implements Cj.d {
        public j() {
        }

        @Override // Cj.d
        public Object a(Cj.b bVar) {
            return u.f(bVar.a());
        }
    }

    /* renamed from: qj.f$k */
    public class k implements InterfaceC6191e {
        public k() {
        }

        @Override // qj.InterfaceC6191e
        public C6190d a(byte[] bArr) {
            try {
                AbstractC5941t k10 = AbstractC5941t.k(bArr);
                if (k10.size() != 9) {
                    throw new C6189c("malformed sequence in RSA private key");
                }
                Li.h g10 = Li.h.g(k10);
                Li.i iVar = new Li.i(g10.h(), g10.l());
                Qi.a aVar = new Qi.a(Li.f.f7277U, X.f62244a);
                return new C6190d(new u(aVar, iVar), new Li.g(aVar, g10));
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new C6189c("problem creating RSA private key: " + e11.toString(), e11);
            }
        }
    }

    /* renamed from: qj.f$l */
    public class l implements Cj.d {
        public l() {
        }

        @Override // Cj.d
        public Object a(Cj.b bVar) {
            try {
                return new u(new Qi.a(Li.f.f7277U, X.f62244a), Li.i.c(bVar.a()));
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new C6189c("problem extracting key: " + e11.toString(), e11);
            }
        }
    }

    /* renamed from: qj.f$m */
    public class m implements Cj.d {
        public m() {
        }

        @Override // Cj.d
        public Object a(Cj.b bVar) {
            return new Si.b(bVar.a());
        }
    }

    /* renamed from: qj.f$n */
    public class n implements Cj.d {
        public n() {
        }

        @Override // Cj.d
        public Object a(Cj.b bVar) {
            try {
                return new Si.c(bVar.a());
            } catch (Exception e10) {
                throw new C6189c("problem parsing cert: " + e10.toString(), e10);
            }
        }
    }

    /* renamed from: qj.f$o */
    public class o implements Cj.d {
        public o() {
        }

        @Override // Cj.d
        public Object a(Cj.b bVar) {
            try {
                return new Si.d(bVar.a());
            } catch (Exception e10) {
                throw new C6189c("problem parsing cert: " + e10.toString(), e10);
            }
        }
    }

    /* renamed from: qj.f$p */
    public class p implements Cj.d {
        public p() {
        }

        @Override // Cj.d
        public Object a(Cj.b bVar) {
            try {
                return new C6193g(bVar.a());
            } catch (Exception e10) {
                throw new C6189c("problem parsing cert: " + e10.toString(), e10);
            }
        }
    }

    public C6192f(Reader reader) {
        super(reader);
        HashMap hashMap = new HashMap();
        this.f63682a = hashMap;
        hashMap.put("CERTIFICATE REQUEST", new g());
        hashMap.put("NEW CERTIFICATE REQUEST", new g());
        hashMap.put("CERTIFICATE", new o());
        hashMap.put("TRUSTED CERTIFICATE", new p());
        hashMap.put("X509 CERTIFICATE", new o());
        hashMap.put("X509 CRL", new n());
        hashMap.put("PKCS7", new h());
        hashMap.put("CMS", new h());
        hashMap.put("ATTRIBUTE CERTIFICATE", new m());
        hashMap.put("EC PARAMETERS", new c());
        hashMap.put("PUBLIC KEY", new j());
        hashMap.put("RSA PUBLIC KEY", new l());
        hashMap.put("RSA PRIVATE KEY", new C0884f(new k()));
        hashMap.put("DSA PRIVATE KEY", new C0884f(new b()));
        hashMap.put("EC PRIVATE KEY", new C0884f(new d()));
        hashMap.put("ENCRYPTED PRIVATE KEY", new e());
        hashMap.put("PRIVATE KEY", new i());
    }

    public Object readObject() {
        Cj.b k10 = k();
        if (k10 == null) {
            return null;
        }
        String c10 = k10.c();
        if (this.f63682a.containsKey(c10)) {
            return ((Cj.d) this.f63682a.get(c10)).a(k10);
        }
        throw new IOException("unrecognised object: " + c10);
    }
}
