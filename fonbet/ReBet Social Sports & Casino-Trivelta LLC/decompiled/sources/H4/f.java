package H4;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.n;
import com.bumptech.glide.load.resource.bitmap.C3003g;
import com.bumptech.glide.util.k;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public class f implements n {

    /* renamed from: b, reason: collision with root package name */
    public final n f4769b;

    public f(n nVar) {
        this.f4769b = (n) k.d(nVar);
    }

    @Override // com.bumptech.glide.load.n
    public v a(Context context, v vVar, int i10, int i11) {
        c cVar = (c) vVar.get();
        v c3003g = new C3003g(cVar.e(), com.bumptech.glide.c.d(context).g());
        v a10 = this.f4769b.a(context, c3003g, i10, i11);
        if (!c3003g.equals(a10)) {
            c3003g.recycle();
        }
        cVar.m(this.f4769b, (Bitmap) a10.get());
        return vVar;
    }

    @Override // com.bumptech.glide.load.g
    public void b(MessageDigest messageDigest) {
        this.f4769b.b(messageDigest);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f4769b.equals(((f) obj).f4769b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.f4769b.hashCode();
    }
}
