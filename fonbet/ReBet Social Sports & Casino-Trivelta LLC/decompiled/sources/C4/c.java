package C4;

import B4.n;
import B4.o;
import B4.r;
import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.resource.bitmap.M;
import y4.AbstractC6853b;

/* loaded from: classes2.dex */
public class c implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1109a;

    public c(Context context) {
        this.f1109a = context.getApplicationContext();
    }

    @Override // B4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, j jVar) {
        if (AbstractC6853b.e(i10, i11) && e(jVar)) {
            return new n.a(new O4.c(uri), y4.c.g(this.f1109a, uri));
        }
        return null;
    }

    @Override // B4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return AbstractC6853b.d(uri);
    }

    public final boolean e(j jVar) {
        Long l10 = (Long) jVar.c(M.f30015d);
        return l10 != null && l10.longValue() == -1;
    }

    public static class a implements o {

        /* renamed from: a, reason: collision with root package name */
        public final Context f1110a;

        public a(Context context) {
            this.f1110a = context;
        }

        @Override // B4.o
        public n e(r rVar) {
            return new c(this.f1110a);
        }

        @Override // B4.o
        public void d() {
        }
    }
}
