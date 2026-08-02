package oe;

import eg.c0;
import eg.m0;
import eg.z;
import f3.n;
import jg.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21173b;

    /* renamed from: c, reason: collision with root package name */
    public int f21174c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f21175d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(g gVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f21173b = i5;
        this.f21175d = gVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f21173b) {
            case 0:
                return new d(this.f21175d, continuation, 0);
            case 1:
                return new d(this.f21175d, continuation, 1);
            case 2:
                return new d(this.f21175d, continuation, 2);
            case 3:
                return new d(this.f21175d, continuation, 3);
            case 4:
                return new d(this.f21175d, continuation, 4);
            case 5:
                return new d(this.f21175d, continuation, 5);
            case 6:
                return new d(this.f21175d, continuation, 6);
            case 7:
                return new d(this.f21175d, continuation, 7);
            default:
                return new d(this.f21175d, continuation, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f21173b) {
        }
        return ((d) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f21173b;
        int i10 = 7;
        int i11 = 2;
        Continuation continuation = null;
        g gVar = this.f21175d;
        int i12 = 1;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i13 = this.f21174c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    this.f21174c = 1;
                    if (g.e(gVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                gVar.f21188g.set(false);
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i14 = this.f21174c;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f21174c = 1;
                Object i15 = c0.i(new b(gVar, continuation, i12), this);
                return i15 == aVar2 ? aVar2 : i15;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                int i16 = this.f21174c;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f21174c = 1;
                Object i17 = c0.i(new b(gVar, continuation, i11), this);
                return i17 == aVar3 ? aVar3 : i17;
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                int i18 = this.f21174c;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f21174c = 1;
                Object i19 = c0.i(new b(gVar, continuation, 6), this);
                return i19 == aVar4 ? aVar4 : i19;
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                int i20 = this.f21174c;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f21174c = 1;
                Object i21 = c0.i(new b(gVar, continuation, 9), this);
                return i21 == aVar5 ? aVar5 : i21;
            case 5:
                lf.a aVar6 = lf.a.f20034a;
                int i22 = this.f21174c;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f21174c = 1;
                Object i23 = c0.i(new b(gVar, continuation, i10), this);
                return i23 == aVar6 ? aVar6 : i23;
            case 6:
                lf.a aVar7 = lf.a.f20034a;
                int i24 = this.f21174c;
                if (i24 != 0) {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f21174c = 1;
                Object i25 = c0.i(new b(gVar, continuation, 8), this);
                return i25 == aVar7 ? aVar7 : i25;
            case 7:
                lf.a aVar8 = lf.a.f20034a;
                int i26 = this.f21174c;
                if (i26 == 0) {
                    h8.b.B(obj);
                    a aVar9 = gVar.f21187f;
                    this.f21174c = 1;
                    obj = gVar.g(aVar9, this);
                    if (obj == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                gVar.j.h((String) obj);
                return Unit.f19194a;
            default:
                lf.a aVar10 = lf.a.f20034a;
                int i27 = this.f21174c;
                if (i27 == 0) {
                    h8.b.B(obj);
                    io.sentry.util.network.b bVar = new io.sentry.util.network.b(7);
                    this.f21174c = 1;
                    obj = bVar.i(this);
                    if (obj == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i27 != 1) {
                        if (i27 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                lg.e eVar = m0.f9201a;
                fg.e eVar2 = q.f18523a;
                n nVar = new n(gVar, booleanValue, continuation, 3);
                this.f21174c = 2;
                if (c0.A(eVar2, nVar, this) == aVar10) {
                    return aVar10;
                }
                return Unit.f19194a;
        }
    }
}
