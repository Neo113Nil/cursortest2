package sd;

import eg.c0;
import eg.m0;
import eg.z;
import jg.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23487b;

    /* renamed from: c, reason: collision with root package name */
    public int f23488c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f23489d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f23487b = i5;
        this.f23489d = lVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f23487b) {
            case 0:
                return new k(this.f23489d, continuation, 0);
            case 1:
                return new k(this.f23489d, continuation, 1);
            case 2:
                return new k(this.f23489d, continuation, 2);
            case 3:
                return new k(this.f23489d, continuation, 3);
            case 4:
                return new k(this.f23489d, continuation, 4);
            case 5:
                return new k(this.f23489d, continuation, 5);
            default:
                return new k(this.f23489d, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f23487b) {
        }
        return ((k) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f23487b;
        l lVar = this.f23489d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f23488c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    this.f23488c = 1;
                    if (c0.j(300L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                lg.e eVar = m0.f9201a;
                fg.e eVar2 = q.f18523a;
                j jVar = new j(lVar, null, 0);
                this.f23488c = 2;
                if (c0.A(eVar2, jVar, this) == aVar) {
                    return aVar;
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i11 = this.f23488c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    this.f23488c = 1;
                    if (c0.j(300L, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                lg.e eVar3 = m0.f9201a;
                fg.e eVar4 = q.f18523a;
                j jVar2 = new j(lVar, null, 1);
                this.f23488c = 2;
                if (c0.A(eVar4, jVar2, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f19194a;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                int i12 = this.f23488c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    this.f23488c = 1;
                    if (c0.j(300L, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                lg.e eVar5 = m0.f9201a;
                fg.e eVar6 = q.f18523a;
                j jVar3 = new j(lVar, null, 2);
                this.f23488c = 2;
                if (c0.A(eVar6, jVar3, this) == aVar3) {
                    return aVar3;
                }
                return Unit.f19194a;
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                int i13 = this.f23488c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    this.f23488c = 1;
                    if (c0.j(300L, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                lg.e eVar7 = m0.f9201a;
                fg.e eVar8 = q.f18523a;
                j jVar4 = new j(lVar, null, 3);
                this.f23488c = 2;
                if (c0.A(eVar8, jVar4, this) == aVar4) {
                    return aVar4;
                }
                return Unit.f19194a;
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                int i14 = this.f23488c;
                if (i14 == 0) {
                    h8.b.B(obj);
                    this.f23488c = 1;
                    if (c0.j(300L, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                lg.e eVar9 = m0.f9201a;
                fg.e eVar10 = q.f18523a;
                j jVar5 = new j(lVar, null, 4);
                this.f23488c = 2;
                if (c0.A(eVar10, jVar5, this) == aVar5) {
                    return aVar5;
                }
                return Unit.f19194a;
            case 5:
                lf.a aVar6 = lf.a.f20034a;
                int i15 = this.f23488c;
                if (i15 == 0) {
                    h8.b.B(obj);
                    this.f23488c = 1;
                    if (c0.j(300L, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                lg.e eVar11 = m0.f9201a;
                fg.e eVar12 = q.f18523a;
                j jVar6 = new j(lVar, null, 5);
                this.f23488c = 2;
                if (c0.A(eVar12, jVar6, this) == aVar6) {
                    return aVar6;
                }
                return Unit.f19194a;
            default:
                lf.a aVar7 = lf.a.f20034a;
                int i16 = this.f23488c;
                if (i16 == 0) {
                    h8.b.B(obj);
                    this.f23488c = 1;
                    if (c0.j(300L, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                lg.e eVar13 = m0.f9201a;
                fg.e eVar14 = q.f18523a;
                j jVar7 = new j(lVar, null, 6);
                this.f23488c = 2;
                if (c0.A(eVar14, jVar7, this) == aVar7) {
                    return aVar7;
                }
                return Unit.f19194a;
        }
    }
}
