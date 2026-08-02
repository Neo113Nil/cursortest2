package rc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22391b;

    /* renamed from: c, reason: collision with root package name */
    public int f22392c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f22393d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(g gVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f22391b = i5;
        this.f22393d = gVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f22391b) {
            case 0:
                return new c(this.f22393d, continuation, 0);
            case 1:
                return new c(this.f22393d, continuation, 1);
            case 2:
                return new c(this.f22393d, continuation, 2);
            case 3:
                return new c(this.f22393d, continuation, 3);
            case 4:
                return new c(this.f22393d, continuation, 4);
            case 5:
                return new c(this.f22393d, continuation, 5);
            case 6:
                return new c(this.f22393d, continuation, 6);
            case 7:
                return new c(this.f22393d, continuation, 7);
            case 8:
                return new c(this.f22393d, continuation, 8);
            case 9:
                return new c(this.f22393d, continuation, 9);
            case 10:
                return new c(this.f22393d, continuation, 10);
            case 11:
                return new c(this.f22393d, continuation, 11);
            case 12:
                return new c(this.f22393d, continuation, 12);
            default:
                return new c(this.f22393d, continuation, 13);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f22391b) {
        }
        return ((c) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f22391b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f22392c;
                if (i5 == 0) {
                    h8.b.B(obj);
                    this.f22392c = 1;
                    if (g.f(this.f22393d, "MainActivity", "NavigateUp", this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f22392c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    this.f22392c = 1;
                    if (g.f(this.f22393d, "MainActivity", "StartFragment", this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                int i11 = this.f22392c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    this.f22392c = 1;
                    if (g.f(this.f22393d, "MainActivity", "onBackPressed", this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                int i12 = this.f22392c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    this.f22392c = 1;
                    if (g.f(this.f22393d, "BoardSiAcademyFragment", "OnBackPressedCallback", this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                int i13 = this.f22392c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    this.f22392c = 1;
                    if (g.f(this.f22393d, "MainActivity", "DoubleToast", this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 5:
                lf.a aVar6 = lf.a.f20034a;
                int i14 = this.f22392c;
                if (i14 == 0) {
                    h8.b.B(obj);
                    this.f22392c = 1;
                    if (g.f(this.f22393d, "MainActivity", "DoubleToastEmptyStack", this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 6:
                lf.a aVar7 = lf.a.f20034a;
                int i15 = this.f22392c;
                if (i15 == 0) {
                    h8.b.B(obj);
                    this.f22392c = 1;
                    if (g.f(this.f22393d, "MainActivity", "EmptyStack", this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 7:
                lf.a aVar8 = lf.a.f20034a;
                int i16 = this.f22392c;
                if (i16 == 0) {
                    h8.b.B(obj);
                    this.f22392c = 1;
                    if (g.f(this.f22393d, "NoEthernetFragment", "OnBackPressedCallback", this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 8:
                lf.a aVar9 = lf.a.f20034a;
                int i17 = this.f22392c;
                if (i17 == 0) {
                    h8.b.B(obj);
                    this.f22392c = 1;
                    if (g.g(this.f22393d, "onBoarding", this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 9:
                lf.a aVar10 = lf.a.f20034a;
                int i18 = this.f22392c;
                if (i18 == 0) {
                    h8.b.B(obj);
                    this.f22392c = 1;
                    if (g.f(this.f22393d, "NoEthernetFragment", "onRetryClick", this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 10:
                lf.a aVar11 = lf.a.f20034a;
                int i19 = this.f22392c;
                if (i19 == 0) {
                    h8.b.B(obj);
                    this.f22392c = 1;
                    if (g.g(this.f22393d, "ListPredictions", this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 11:
                lf.a aVar12 = lf.a.f20034a;
                int i20 = this.f22392c;
                if (i20 == 0) {
                    h8.b.B(obj);
                    this.f22392c = 1;
                    if (g.g(this.f22393d, "onIdentify", this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 12:
                lf.a aVar13 = lf.a.f20034a;
                int i21 = this.f22392c;
                if (i21 == 0) {
                    h8.b.B(obj);
                    this.f22392c = 1;
                    if (g.g(this.f22393d, "SplashActivity", this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            default:
                lf.a aVar14 = lf.a.f20034a;
                int i22 = this.f22392c;
                if (i22 == 0) {
                    h8.b.B(obj);
                    this.f22392c = 1;
                    if (g.g(this.f22393d, "SportInsiderSplash", this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
        }
    }
}
