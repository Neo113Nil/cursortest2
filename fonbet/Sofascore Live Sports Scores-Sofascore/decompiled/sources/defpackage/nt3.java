package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nt3 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ qze t;
    public final /* synthetic */ b9j u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nt3(qze qzeVar, b9j b9jVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = qzeVar;
        this.u = b9jVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                return new nt3(this.t, this.u, rq3Var, 0);
            case 1:
                return new nt3(this.t, this.u, rq3Var, 1);
            default:
                return new nt3(this.t, this.u, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((nt3) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        qze qzeVar = this.t;
        final b9j b9jVar = this.u;
        final int i2 = 1;
        rq3 rq3Var = null;
        switch (i) {
            case 0:
                Object obj2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object r = s9a.r(new k50(qzeVar, b9jVar, rq3Var, 12), this);
                    if (r != obj2) {
                        r = Unit.a;
                    }
                    if (r == obj2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            case 1:
                Object obj3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    Object s = oyn.s(qzeVar, new kj6(b9jVar, rq3Var, 2), this);
                    if (s != obj3) {
                        s = Unit.a;
                    }
                    if (s == obj3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                Object obj4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    final int i6 = 0;
                    Object e = e95.e(this.t, new bkb(b9jVar, 0), new Function0() { // from class: ckb
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i7 = i6;
                            b9j b9jVar2 = b9jVar;
                            switch (i7) {
                                case 0:
                                    b9jVar2.onStop();
                                    break;
                                default:
                                    b9jVar2.onCancel();
                                    break;
                            }
                            return Unit.a;
                        }
                    }, new Function0() { // from class: ckb
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i7 = i2;
                            b9j b9jVar2 = b9jVar;
                            switch (i7) {
                                case 0:
                                    b9jVar2.onStop();
                                    break;
                                default:
                                    b9jVar2.onCancel();
                                    break;
                            }
                            return Unit.a;
                        }
                    }, new faa(b9jVar, 18), this);
                    if (e != obj4) {
                        e = Unit.a;
                    }
                    if (e == obj4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
        }
        return Unit.a;
    }
}
