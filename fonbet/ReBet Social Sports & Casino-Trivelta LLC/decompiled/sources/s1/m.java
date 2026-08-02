package s1;

import D1.k;
import android.net.Uri;
import androidx.media3.exoplayer.source.L;
import java.io.IOException;

/* loaded from: classes.dex */
public interface m {

    public interface a {
        m a(r1.g gVar, D1.k kVar, l lVar, D1.e eVar);
    }

    public interface b {
        boolean a(Uri uri, k.c cVar, boolean z10);

        void c();
    }

    public static final class c extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f64646a;

        public c(Uri uri) {
            this.f64646a = uri;
        }
    }

    public static final class d extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f64647a;

        public d(Uri uri) {
            this.f64647a = uri;
        }
    }

    public interface e {
        void h(f fVar);
    }

    void a(Uri uri);

    void b(b bVar);

    void c(Uri uri);

    long d();

    i e();

    void f(Uri uri);

    boolean g(Uri uri);

    void h(Uri uri, L.a aVar, e eVar);

    void k(b bVar);

    boolean m();

    boolean n(Uri uri, long j10);

    void p();

    f q(Uri uri, boolean z10);

    void stop();
}
