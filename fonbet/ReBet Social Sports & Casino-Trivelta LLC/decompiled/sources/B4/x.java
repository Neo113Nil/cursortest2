package B4;

import B4.n;
import android.content.ContentResolver;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class x implements n {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f789b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a, reason: collision with root package name */
    public final c f790a;

    public interface c {
        com.bumptech.glide.load.data.d a(Uri uri);
    }

    public x(c cVar) {
        this.f790a = cVar;
    }

    @Override // B4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, com.bumptech.glide.load.j jVar) {
        return new n.a(new O4.c(uri), this.f790a.a(uri));
    }

    @Override // B4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return f789b.contains(uri.getScheme());
    }

    public static final class a implements o, c {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f791a;

        public a(ContentResolver contentResolver) {
            this.f791a = contentResolver;
        }

        @Override // B4.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f791a, uri);
        }

        @Override // B4.o
        public n e(r rVar) {
            return new x(this);
        }

        @Override // B4.o
        public void d() {
        }
    }

    public static class b implements o, c {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f792a;

        public b(ContentResolver contentResolver) {
            this.f792a = contentResolver;
        }

        @Override // B4.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f792a, uri);
        }

        @Override // B4.o
        public n e(r rVar) {
            return new x(this);
        }

        @Override // B4.o
        public void d() {
        }
    }

    public static class d implements o, c {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f793a;

        public d(ContentResolver contentResolver) {
            this.f793a = contentResolver;
        }

        @Override // B4.x.c
        public com.bumptech.glide.load.data.d a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f793a, uri);
        }

        @Override // B4.o
        public n e(r rVar) {
            return new x(this);
        }

        @Override // B4.o
        public void d() {
        }
    }
}
