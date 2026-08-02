package z4;

import com.bumptech.glide.load.engine.v;
import z4.h;

/* loaded from: classes2.dex */
public class g extends com.bumptech.glide.util.h implements h {

    /* renamed from: e, reason: collision with root package name */
    public h.a f68577e;

    public g(long j10) {
        super(j10);
    }

    @Override // z4.h
    public void a(int i10) {
        if (i10 >= 40) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            m(h() / 2);
        }
    }

    @Override // z4.h
    public /* bridge */ /* synthetic */ v c(com.bumptech.glide.load.g gVar, v vVar) {
        return (v) super.k(gVar, vVar);
    }

    @Override // z4.h
    public /* bridge */ /* synthetic */ v d(com.bumptech.glide.load.g gVar) {
        return (v) super.l(gVar);
    }

    @Override // z4.h
    public void e(h.a aVar) {
        this.f68577e = aVar;
    }

    @Override // com.bumptech.glide.util.h
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int i(v vVar) {
        return vVar == null ? super.i(null) : vVar.getSize();
    }

    @Override // com.bumptech.glide.util.h
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(com.bumptech.glide.load.g gVar, v vVar) {
        h.a aVar = this.f68577e;
        if (aVar == null || vVar == null) {
            return;
        }
        aVar.a(vVar);
    }
}
