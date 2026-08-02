package c1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u implements hg.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3479a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3480b;

    public /* synthetic */ u(int i5, Object obj) {
        this.f3479a = i5;
        this.f3480b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // hg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(hg.h hVar, Continuation frame) {
        hg.a aVar;
        int i5;
        Throwable th2;
        ig.u uVar;
        switch (this.f3479a) {
            case 0:
                Object a7 = ((hg.u) this.f3480b).a(new t(hVar, 0), frame);
                return a7 == lf.a.f20034a ? a7 : Unit.f19194a;
            case 1:
                Object a10 = ((eb.i) this.f3480b).a(new t(hVar, 2), frame);
                return a10 == lf.a.f20034a ? a10 : Unit.f19194a;
            case 2:
                Object a11 = ((eb.i) this.f3480b).a(new t(hVar, 4), frame);
                return a11 == lf.a.f20034a ? a11 : Unit.f19194a;
            case 3:
                if (frame instanceof hg.a) {
                    aVar = (hg.a) frame;
                    int i10 = aVar.f10638d;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        aVar.f10638d = i10 - Integer.MIN_VALUE;
                        Object obj = aVar.f10636b;
                        Object obj2 = lf.a.f20034a;
                        i5 = aVar.f10638d;
                        if (i5 != 0) {
                            h8.b.B(obj);
                            ig.u uVar2 = new ig.u(hVar, aVar.getContext());
                            try {
                                aVar.f10635a = uVar2;
                                aVar.f10638d = 1;
                                Object invoke = ((mf.i) this.f3480b).invoke(uVar2, aVar);
                                if (invoke != obj2) {
                                    invoke = Unit.f19194a;
                                }
                                if (invoke == obj2) {
                                    return obj2;
                                }
                                uVar = uVar2;
                            } catch (Throwable th3) {
                                th2 = th3;
                                uVar = uVar2;
                                uVar.releaseIntercepted();
                                throw th2;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            uVar = aVar.f10635a;
                            try {
                                h8.b.B(obj);
                            } catch (Throwable th4) {
                                th2 = th4;
                                uVar.releaseIntercepted();
                                throw th2;
                            }
                        }
                        uVar.releaseIntercepted();
                        return Unit.f19194a;
                    }
                }
                aVar = new hg.a(this, frame);
                Object obj3 = aVar.f10636b;
                Object obj22 = lf.a.f20034a;
                i5 = aVar.f10638d;
                if (i5 != 0) {
                }
                uVar.releaseIntercepted();
                return Unit.f19194a;
            case 4:
                hg.g[] gVarArr = (hg.g[]) this.f3480b;
                ig.o oVar = new ig.o(gVarArr, new i3.i(0, gVarArr), new i3.j(3, null), hVar, null, 0);
                ig.q qVar = new ig.q(frame, frame.getContext());
                Object I = rh.g.I(qVar, true, qVar, oVar);
                lf.a aVar2 = lf.a.f20034a;
                if (I == aVar2) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (I != aVar2) {
                    I = Unit.f19194a;
                }
                return I == aVar2 ? I : Unit.f19194a;
            case 5:
                androidx.lifecycle.o oVar2 = new androidx.lifecycle.o((hg.n) this.f3480b, hVar, (Continuation) null, 17);
                ig.q qVar2 = new ig.q(frame, frame.getContext());
                Object I2 = rh.g.I(qVar2, true, qVar2, oVar2);
                lf.a aVar3 = lf.a.f20034a;
                if (I2 == aVar3) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                return I2 == aVar3 ? I2 : Unit.f19194a;
            case 6:
                Object a12 = ((hg.u) this.f3480b).a(new t(hVar, 10), frame);
                return a12 == lf.a.f20034a ? a12 : Unit.f19194a;
            case 7:
                Object a13 = ((hg.o0) this.f3480b).f10736a.a(new t(hVar, 13), frame);
                return a13 == lf.a.f20034a ? a13 : Unit.f19194a;
            default:
                Object a14 = ((ge.q) this.f3480b).a(new t(hVar, 29), frame);
                return a14 == lf.a.f20034a ? a14 : Unit.f19194a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(Function2 function2) {
        this.f3479a = 3;
        this.f3480b = (mf.i) function2;
    }
}
