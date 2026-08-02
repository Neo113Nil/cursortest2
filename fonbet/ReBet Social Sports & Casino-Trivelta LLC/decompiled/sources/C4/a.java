package C4;

import B4.h;
import B4.m;
import B4.n;
import B4.o;
import B4.r;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;

/* loaded from: classes2.dex */
public class a implements n {

    /* renamed from: b, reason: collision with root package name */
    public static final i f1104b = i.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a, reason: collision with root package name */
    public final m f1105a;

    public a(m mVar) {
        this.f1105a = mVar;
    }

    @Override // B4.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(h hVar, int i10, int i11, j jVar) {
        m mVar = this.f1105a;
        if (mVar != null) {
            h hVar2 = (h) mVar.a(hVar, 0, 0);
            if (hVar2 == null) {
                this.f1105a.b(hVar, 0, 0, hVar);
            } else {
                hVar = hVar2;
            }
        }
        return new n.a(hVar, new com.bumptech.glide.load.data.j(hVar, ((Integer) jVar.c(f1104b)).intValue()));
    }

    @Override // B4.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(h hVar) {
        return true;
    }

    /* renamed from: C4.a$a, reason: collision with other inner class name */
    public static class C0029a implements o {

        /* renamed from: a, reason: collision with root package name */
        public final m f1106a = new m(500);

        @Override // B4.o
        public n e(r rVar) {
            return new a(this.f1106a);
        }

        @Override // B4.o
        public void d() {
        }
    }
}
