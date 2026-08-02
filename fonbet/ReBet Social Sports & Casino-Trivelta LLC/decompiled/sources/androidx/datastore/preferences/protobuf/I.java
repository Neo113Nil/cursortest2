package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r0;

/* loaded from: classes.dex */
public class I {

    /* renamed from: a, reason: collision with root package name */
    public final a f19425a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19426b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19427c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final r0.b f19428a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f19429b;

        /* renamed from: c, reason: collision with root package name */
        public final r0.b f19430c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f19431d;

        public a(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
            this.f19428a = bVar;
            this.f19429b = obj;
            this.f19430c = bVar2;
            this.f19431d = obj2;
        }
    }

    public I(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
        this.f19425a = new a(bVar, obj, bVar2, obj2);
        this.f19426b = obj;
        this.f19427c = obj2;
    }

    public static int b(a aVar, Object obj, Object obj2) {
        return C2143s.b(aVar.f19428a, 1, obj) + C2143s.b(aVar.f19430c, 2, obj2);
    }

    public static I d(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
        return new I(bVar, obj, bVar2, obj2);
    }

    public static void e(AbstractC2135j abstractC2135j, a aVar, Object obj, Object obj2) {
        C2143s.u(abstractC2135j, aVar.f19428a, 1, obj);
        C2143s.u(abstractC2135j, aVar.f19430c, 2, obj2);
    }

    public int a(int i10, Object obj, Object obj2) {
        return AbstractC2135j.O(i10) + AbstractC2135j.y(b(this.f19425a, obj, obj2));
    }

    public a c() {
        return this.f19425a;
    }
}
