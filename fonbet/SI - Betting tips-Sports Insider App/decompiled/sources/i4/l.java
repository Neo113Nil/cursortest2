package i4;

import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final q4.h f10991a;

    /* renamed from: b, reason: collision with root package name */
    public final List f10992b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10993c;

    /* renamed from: d, reason: collision with root package name */
    public final q4.h f10994d;

    /* renamed from: e, reason: collision with root package name */
    public final r4.i f10995e;

    /* renamed from: f, reason: collision with root package name */
    public final c4.i f10996f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10997g;

    public l(q4.h hVar, List list, int i5, q4.h hVar2, r4.i iVar, c4.i iVar2, boolean z5) {
        this.f10991a = hVar;
        this.f10992b = list;
        this.f10993c = i5;
        this.f10994d = hVar2;
        this.f10995e = iVar;
        this.f10996f = iVar2;
        this.f10997g = z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(mf.c cVar) {
        k kVar;
        int i5;
        q4.h hVar;
        j jVar;
        q4.h s8;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i10 = kVar.f10990d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f10990d = i10 - Integer.MIN_VALUE;
                Object obj = kVar.f10988b;
                lf.a aVar = lf.a.f20034a;
                i5 = kVar.f10990d;
                hVar = this.f10991a;
                if (i5 != 0) {
                    h8.b.B(obj);
                    List list = this.f10992b;
                    int i11 = this.f10993c;
                    j jVar2 = (j) list.get(i11);
                    l lVar = new l(hVar, this.f10992b, i11 + 1, this.f10994d, this.f10995e, this.f10996f, this.f10997g);
                    kVar.f10987a = jVar2;
                    kVar.f10990d = 1;
                    h hVar2 = (h) jVar2;
                    Object d10 = hVar2.d(lVar, kVar);
                    if (d10 == aVar) {
                        return aVar;
                    }
                    jVar = hVar2;
                    obj = d10;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = kVar.f10987a;
                    h8.b.B(obj);
                }
                q4.k kVar2 = (q4.k) obj;
                s8 = kVar2.s();
                if (s8.f21976a == hVar.f21976a) {
                    throw new IllegalStateException(("Interceptor '" + jVar + "' cannot modify the request's context.").toString());
                }
                if (s8.f21977b == q4.l.f22006a) {
                    throw new IllegalStateException(("Interceptor '" + jVar + "' cannot set the request's data to null.").toString());
                }
                if (s8.f21978c != hVar.f21978c) {
                    throw new IllegalStateException(("Interceptor '" + jVar + "' cannot modify the request's target.").toString());
                }
                if (s8.f21990p == hVar.f21990p) {
                    return kVar2;
                }
                throw new IllegalStateException(("Interceptor '" + jVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
            }
        }
        kVar = new k(this, cVar);
        Object obj2 = kVar.f10988b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = kVar.f10990d;
        hVar = this.f10991a;
        if (i5 != 0) {
        }
        q4.k kVar22 = (q4.k) obj2;
        s8 = kVar22.s();
        if (s8.f21976a == hVar.f21976a) {
        }
    }
}
