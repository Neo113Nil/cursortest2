package I4;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.resource.bitmap.C3003g;

/* loaded from: classes2.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.d f5342a;

    /* renamed from: b, reason: collision with root package name */
    public final e f5343b;

    /* renamed from: c, reason: collision with root package name */
    public final e f5344c;

    public c(com.bumptech.glide.load.engine.bitmap_recycle.d dVar, e eVar, e eVar2) {
        this.f5342a = dVar;
        this.f5343b = eVar;
        this.f5344c = eVar2;
    }

    @Override // I4.e
    public v a(v vVar, j jVar) {
        Drawable drawable = (Drawable) vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f5343b.a(C3003g.c(((BitmapDrawable) drawable).getBitmap(), this.f5342a), jVar);
        }
        if (drawable instanceof H4.c) {
            return this.f5344c.a(b(vVar), jVar);
        }
        return null;
    }

    public static v b(v vVar) {
        return vVar;
    }
}
