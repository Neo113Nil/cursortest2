package B4;

import B4.n;
import com.bumptech.glide.load.data.d;

/* loaded from: classes2.dex */
public class w implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final w f786a = new w();

    public static w c() {
        return f786a;
    }

    @Override // B4.n
    public boolean a(Object obj) {
        return true;
    }

    @Override // B4.n
    public n.a b(Object obj, int i10, int i11, com.bumptech.glide.load.j jVar) {
        return new n.a(new O4.c(obj), new b(obj));
    }

    public static class a implements o {

        /* renamed from: a, reason: collision with root package name */
        public static final a f787a = new a();

        public static a a() {
            return f787a;
        }

        @Override // B4.o
        public n e(r rVar) {
            return w.c();
        }

        @Override // B4.o
        public void d() {
        }
    }

    public static class b implements com.bumptech.glide.load.data.d {

        /* renamed from: a, reason: collision with root package name */
        public final Object f788a;

        public b(Object obj) {
            this.f788a = obj;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f788a.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.h hVar, d.a aVar) {
            aVar.f(this.f788a);
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
