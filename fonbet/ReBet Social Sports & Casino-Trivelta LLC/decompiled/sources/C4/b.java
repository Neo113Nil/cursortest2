package C4;

import B4.n;
import B4.o;
import B4.r;
import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.j;
import y4.AbstractC6853b;

/* loaded from: classes2.dex */
public class b implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1107a;

    public b(Context context) {
        this.f1107a = context.getApplicationContext();
    }

    @Override // B4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, j jVar) {
        if (AbstractC6853b.e(i10, i11)) {
            return new n.a(new O4.c(uri), y4.c.f(this.f1107a, uri));
        }
        return null;
    }

    @Override // B4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return AbstractC6853b.b(uri);
    }

    public static class a implements o {

        /* renamed from: a, reason: collision with root package name */
        public final Context f1108a;

        public a(Context context) {
            this.f1108a = context;
        }

        @Override // B4.o
        public n e(r rVar) {
            return new b(this.f1108a);
        }

        @Override // B4.o
        public void d() {
        }
    }
}
