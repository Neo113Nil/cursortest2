package z4;

import P4.a;
import com.bumptech.glide.util.k;
import com.bumptech.glide.util.l;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import x0.InterfaceC6775d;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.util.h f68592a = new com.bumptech.glide.util.h(1000);

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC6775d f68593b = P4.a.d(10, new a());

    public class a implements a.d {
        public a() {
        }

        @Override // P4.a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public static final class b implements a.f {

        /* renamed from: a, reason: collision with root package name */
        public final MessageDigest f68595a;

        /* renamed from: b, reason: collision with root package name */
        public final P4.c f68596b = P4.c.a();

        public b(MessageDigest messageDigest) {
            this.f68595a = messageDigest;
        }

        @Override // P4.a.f
        public P4.c d() {
            return this.f68596b;
        }
    }

    public final String a(com.bumptech.glide.load.g gVar) {
        b bVar = (b) k.d(this.f68593b.acquire());
        try {
            gVar.b(bVar.f68595a);
            return l.y(bVar.f68595a.digest());
        } finally {
            this.f68593b.release(bVar);
        }
    }

    public String b(com.bumptech.glide.load.g gVar) {
        String str;
        synchronized (this.f68592a) {
            str = (String) this.f68592a.g(gVar);
        }
        if (str == null) {
            str = a(gVar);
        }
        synchronized (this.f68592a) {
            this.f68592a.k(gVar, str);
        }
        return str;
    }
}
