package B4;

import B4.n;
import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class y implements n {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f794b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    public final n f795a;

    public y(n nVar) {
        this.f795a = nVar;
    }

    @Override // B4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, com.bumptech.glide.load.j jVar) {
        return this.f795a.b(new h(uri.toString()), i10, i11, jVar);
    }

    @Override // B4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return f794b.contains(uri.getScheme());
    }

    public static class a implements o {
        @Override // B4.o
        public n e(r rVar) {
            return new y(rVar.d(h.class, InputStream.class));
        }

        @Override // B4.o
        public void d() {
        }
    }
}
