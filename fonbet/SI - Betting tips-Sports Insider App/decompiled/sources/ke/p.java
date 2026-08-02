package ke;

import android.graphics.Typeface;
import com.sports.insider.ui.onboarding.NoEthernetFragment;
import eg.c0;
import eg.m0;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19049b;

    /* renamed from: c, reason: collision with root package name */
    public int f19050c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NoEthernetFragment f19051d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(NoEthernetFragment noEthernetFragment, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19049b = i5;
        this.f19051d = noEthernetFragment;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19049b) {
            case 0:
                return new p(this.f19051d, continuation, 0);
            case 1:
                return new p(this.f19051d, continuation, 1);
            case 2:
                return new p(this.f19051d, continuation, 2);
            case 3:
                return new p(this.f19051d, continuation, 3);
            case 4:
                return new p(this.f19051d, continuation, 4);
            case 5:
                return new p(this.f19051d, continuation, 5);
            default:
                return new p(this.f19051d, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19049b) {
        }
        return ((p) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (eg.c0.i(new ke.q(r4, r5, r6), r8) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        if (eg.c0.A(r1, r2, r8) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0073, code lost:
    
        if (r9 == r0) goto L34;
     */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f19049b;
        int i10 = 0;
        NoEthernetFragment noEthernetFragment = this.f19051d;
        Continuation continuation = null;
        int i11 = 1;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i12 = this.f19050c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    oe.g G = noEthernetFragment.G();
                    this.f19050c = 1;
                    G.getClass();
                    obj = c0.i(new oe.b(G, null, 5), this);
                    if (obj == aVar) {
                        return aVar;
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
                lg.e eVar = m0.f9201a;
                fg.e eVar2 = jg.q.f18523a;
                o oVar = new o(noEthernetFragment, (String) obj, null, 0);
                this.f19050c = 2;
                if (c0.A(eVar2, oVar, this) == aVar) {
                    return aVar;
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i13 = this.f19050c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    oe.g G2 = noEthernetFragment.G();
                    this.f19050c = 1;
                    G2.getClass();
                    obj = c0.i(new oe.b(G2, null, 4), this);
                    if (obj == aVar2) {
                        return aVar2;
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
                lg.e eVar3 = m0.f9201a;
                fg.e eVar4 = jg.q.f18523a;
                o oVar2 = new o(noEthernetFragment, (String) obj, null, 1);
                this.f19050c = 2;
                if (c0.A(eVar4, oVar2, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f19194a;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                int i14 = this.f19050c;
                if (i14 == 0) {
                    h8.b.B(obj);
                    oe.g G3 = noEthernetFragment.G();
                    this.f19050c = 1;
                    G3.getClass();
                    obj = c0.i(new oe.b(G3, null, 10), this);
                    if (obj == aVar3) {
                        return aVar3;
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
                lg.e eVar5 = m0.f9201a;
                fg.e eVar6 = jg.q.f18523a;
                o oVar3 = new o(noEthernetFragment, (String) obj, null, 2);
                this.f19050c = 2;
                if (c0.A(eVar6, oVar3, this) == aVar3) {
                    return aVar3;
                }
                return Unit.f19194a;
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                int i15 = this.f19050c;
                if (i15 == 0) {
                    h8.b.B(obj);
                    oe.g G4 = noEthernetFragment.G();
                    this.f19050c = 1;
                    G4.getClass();
                    obj = c0.i(new oe.b(G4, null, 3), this);
                    if (obj == aVar4) {
                        return aVar4;
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
                lg.e eVar7 = m0.f9201a;
                fg.e eVar8 = jg.q.f18523a;
                o oVar4 = new o(noEthernetFragment, (String) obj, null, 3);
                this.f19050c = 2;
                if (c0.A(eVar8, oVar4, this) == aVar4) {
                    return aVar4;
                }
                return Unit.f19194a;
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                int i16 = this.f19050c;
                if (i16 == 0) {
                    h8.b.B(obj);
                    oe.g G5 = noEthernetFragment.G();
                    this.f19050c = 1;
                    G5.getClass();
                    obj = c0.i(new oe.b(G5, null, 2), this);
                    if (obj == aVar5) {
                        return aVar5;
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
                lg.e eVar9 = m0.f9201a;
                fg.e eVar10 = jg.q.f18523a;
                o oVar5 = new o(noEthernetFragment, (String) obj, null, 4);
                this.f19050c = 2;
                if (c0.A(eVar10, oVar5, this) == aVar5) {
                    return aVar5;
                }
                return Unit.f19194a;
            case 5:
                lf.a aVar6 = lf.a.f20034a;
                int i17 = this.f19050c;
                if (i17 == 0) {
                    h8.b.B(obj);
                    oe.g G6 = noEthernetFragment.G();
                    this.f19050c = 1;
                    G6.getClass();
                    obj = c0.i(new oe.b(G6, null, 0), this);
                    break;
                } else {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                Typeface typeface = (Typeface) obj;
                if (typeface == null) {
                    return null;
                }
                lg.e eVar11 = m0.f9201a;
                fg.e eVar12 = jg.q.f18523a;
                ab.b bVar = new ab.b(noEthernetFragment, typeface, null, 16);
                this.f19050c = 2;
                break;
            default:
                lf.a aVar7 = lf.a.f20034a;
                int i18 = this.f19050c;
                if (i18 == 0) {
                    h8.b.B(obj);
                    this.f19050c = 1;
                    break;
                } else {
                    if (i18 != 1) {
                        if (i18 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return obj;
                    }
                    h8.b.B(obj);
                }
                this.f19050c = 2;
                Object i19 = c0.i(new q(noEthernetFragment, continuation, i10), this);
                if (i19 != aVar7) {
                    return i19;
                }
                return aVar7;
        }
    }
}
