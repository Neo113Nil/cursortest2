package mg;

import eg.o0;
import jg.u;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20710a;

    /* renamed from: b, reason: collision with root package name */
    public final vf.a f20711b;

    /* renamed from: c, reason: collision with root package name */
    public final vf.a f20712c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20713d;

    /* renamed from: e, reason: collision with root package name */
    public final mf.i f20714e;

    /* renamed from: f, reason: collision with root package name */
    public final vf.a f20715f;

    /* renamed from: g, reason: collision with root package name */
    public Object f20716g;

    /* renamed from: h, reason: collision with root package name */
    public int f20717h = -1;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f20718i;

    public c(e eVar, Object obj, vf.a aVar, vf.a aVar2, com.android.billingclient.api.a aVar3, mf.i iVar, vf.a aVar4) {
        this.f20718i = eVar;
        this.f20710a = obj;
        this.f20711b = aVar;
        this.f20712c = aVar2;
        this.f20713d = aVar3;
        this.f20714e = iVar;
        this.f20715f = aVar4;
    }

    public final void a() {
        Object obj = this.f20716g;
        if (obj instanceof u) {
            ((u) obj).h(this.f20717h, this.f20718i.f20724a);
            return;
        }
        o0 o0Var = obj instanceof o0 ? (o0) obj : null;
        if (o0Var != null) {
            o0Var.b();
        }
    }
}
