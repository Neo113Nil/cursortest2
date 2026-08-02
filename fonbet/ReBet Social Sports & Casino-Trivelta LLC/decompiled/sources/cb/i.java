package cb;

import cb.j;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f27674b = new i(new j.a());

    /* renamed from: c, reason: collision with root package name */
    public static final i f27675c = new i(new j.e());

    /* renamed from: d, reason: collision with root package name */
    public static final i f27676d = new i(new j.g());

    /* renamed from: e, reason: collision with root package name */
    public static final i f27677e = new i(new j.f());

    /* renamed from: f, reason: collision with root package name */
    public static final i f27678f = new i(new j.b());

    /* renamed from: g, reason: collision with root package name */
    public static final i f27679g = new i(new j.d());

    /* renamed from: h, reason: collision with root package name */
    public static final i f27680h = new i(new j.c());

    /* renamed from: a, reason: collision with root package name */
    public final e f27681a;

    public static class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public final j f27682a;

        @Override // cb.i.e
        public Object a(String str) {
            Iterator it = i.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f27682a.a(str, (Provider) it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            return this.f27682a.a(str, null);
        }

        public b(j jVar) {
            this.f27682a = jVar;
        }
    }

    public static class c implements e {

        /* renamed from: a, reason: collision with root package name */
        public final j f27683a;

        @Override // cb.i.e
        public Object a(String str) {
            return this.f27683a.a(str, null);
        }

        public c(j jVar) {
            this.f27683a = jVar;
        }
    }

    public static class d implements e {

        /* renamed from: a, reason: collision with root package name */
        public final j f27684a;

        @Override // cb.i.e
        public Object a(String str) {
            Iterator it = i.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f27684a.a(str, (Provider) it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }

        public d(j jVar) {
            this.f27684a = jVar;
        }
    }

    public interface e {
        Object a(String str);
    }

    public i(j jVar) {
        if (Xa.b.c()) {
            this.f27681a = new d(jVar);
        } else if (q.b()) {
            this.f27681a = new b(jVar);
        } else {
            this.f27681a = new c(jVar);
        }
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public Object a(String str) {
        return this.f27681a.a(str);
    }
}
