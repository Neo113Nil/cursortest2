package oi;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class w implements g, t0.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eg.l f21349b;

    public /* synthetic */ w(eg.l lVar, int i5) {
        this.f21348a = i5;
        this.f21349b = lVar;
    }

    @Override // t0.i
    public void a(Object obj) {
        int i5 = this.f21348a;
        eg.l lVar = this.f21349b;
        switch (i5) {
            case 3:
                u0.a e7 = (u0.a) obj;
                Intrinsics.checkNotNullParameter(e7, "e");
                if (lVar.w()) {
                    gf.o oVar = gf.q.f10031a;
                    lVar.resumeWith(h8.b.h(e7));
                    break;
                }
                break;
            default:
                u0.f e9 = (u0.f) obj;
                Intrinsics.checkNotNullParameter(e9, "e");
                if (lVar.w()) {
                    gf.o oVar2 = gf.q.f10031a;
                    lVar.resumeWith(h8.b.h(e9));
                    break;
                }
                break;
        }
    }

    @Override // oi.g
    public void b(d call, Throwable t3) {
        int i5 = this.f21348a;
        eg.l lVar = this.f21349b;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(t3, "t");
        switch (i5) {
            case 0:
                gf.o oVar = gf.q.f10031a;
                lVar.resumeWith(h8.b.h(t3));
                break;
            case 1:
                gf.o oVar2 = gf.q.f10031a;
                lVar.resumeWith(h8.b.h(t3));
                break;
            default:
                gf.o oVar3 = gf.q.f10031a;
                lVar.resumeWith(h8.b.h(t3));
                break;
        }
    }

    @Override // oi.g
    public void d(d call, s0 response) {
        int i5 = this.f21348a;
        eg.l lVar = this.f21349b;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        switch (i5) {
            case 0:
                if (!response.f21334a.f10287p) {
                    gf.o oVar = gf.q.f10031a;
                    lVar.resumeWith(h8.b.h(new q(response)));
                    break;
                } else {
                    Object obj = response.f21335b;
                    if (obj != null) {
                        gf.o oVar2 = gf.q.f10031a;
                        lVar.resumeWith(obj);
                        break;
                    } else {
                        gh.i0 l02 = call.l0();
                        l02.getClass();
                        Intrinsics.checkNotNullParameter(u.class, "type");
                        Intrinsics.checkNotNullParameter(u.class, "<this>");
                        ag.c type = Reflection.getOrCreateKotlinClass(u.class);
                        Intrinsics.checkNotNullParameter(type, "type");
                        Object cast = u6.h.k(type).cast(l02.f10210e.o(type));
                        Intrinsics.checkNotNull(cast);
                        u uVar = (u) cast;
                        uVar.getClass();
                        gf.g gVar = new gf.g("Response from " + r3.c.class.getName() + '.' + uVar.f21343b.getName() + " was null but response body type was declared as non-null");
                        gf.o oVar3 = gf.q.f10031a;
                        lVar.resumeWith(h8.b.h(gVar));
                        break;
                    }
                }
            case 1:
                if (!response.f21334a.f10287p) {
                    gf.o oVar4 = gf.q.f10031a;
                    lVar.resumeWith(h8.b.h(new q(response)));
                    break;
                } else {
                    gf.o oVar5 = gf.q.f10031a;
                    lVar.resumeWith(response.f21335b);
                    break;
                }
            default:
                gf.o oVar6 = gf.q.f10031a;
                lVar.resumeWith(response);
                break;
        }
    }

    @Override // t0.i
    public void onResult(Object obj) {
        int i5 = this.f21348a;
        eg.l lVar = this.f21349b;
        switch (i5) {
            case 3:
                if (lVar.w()) {
                    gf.o oVar = gf.q.f10031a;
                    lVar.resumeWith(Unit.f19194a);
                    break;
                }
                break;
            default:
                t0.q result = (t0.q) obj;
                Intrinsics.checkNotNullParameter(result, "result");
                if (lVar.w()) {
                    gf.o oVar2 = gf.q.f10031a;
                    lVar.resumeWith(result);
                    break;
                }
                break;
        }
    }
}
