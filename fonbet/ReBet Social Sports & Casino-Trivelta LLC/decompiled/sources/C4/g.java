package C4;

import B4.h;
import B4.n;
import B4.o;
import B4.r;
import com.bumptech.glide.load.j;
import java.io.InputStream;
import java.net.URL;

/* loaded from: classes2.dex */
public class g implements n {

    /* renamed from: a, reason: collision with root package name */
    public final n f1127a;

    public g(n nVar) {
        this.f1127a = nVar;
    }

    @Override // B4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(URL url, int i10, int i11, j jVar) {
        return this.f1127a.b(new h(url), i10, i11, jVar);
    }

    @Override // B4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(URL url) {
        return true;
    }

    public static class a implements o {
        @Override // B4.o
        public n e(r rVar) {
            return new g(rVar.d(h.class, InputStream.class));
        }

        @Override // B4.o
        public void d() {
        }
    }
}
