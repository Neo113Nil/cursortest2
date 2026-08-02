package H4;

import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.l;
import com.bumptech.glide.load.resource.bitmap.C3003g;

/* loaded from: classes2.dex */
public final class h implements l {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.d f4793a;

    public h(com.bumptech.glide.load.engine.bitmap_recycle.d dVar) {
        this.f4793a = dVar;
    }

    @Override // com.bumptech.glide.load.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public v b(com.bumptech.glide.gifdecoder.a aVar, int i10, int i11, com.bumptech.glide.load.j jVar) {
        return C3003g.c(aVar.b(), this.f4793a);
    }

    @Override // com.bumptech.glide.load.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(com.bumptech.glide.gifdecoder.a aVar, com.bumptech.glide.load.j jVar) {
        return true;
    }
}
