package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class u implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10774a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f10775b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mf.i f10776c;

    /* JADX WARN: Multi-variable type inference failed */
    public u(g gVar, Function2 function2, int i5) {
        this.f10774a = i5;
        switch (i5) {
            case 2:
                this.f10775b = gVar;
                this.f10776c = (mf.i) function2;
                break;
            default:
                this.f10775b = gVar;
                this.f10776c = (mf.i) function2;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.functions.Function2, mf.i] */
    /* JADX WARN: Type inference failed for: r2v3, types: [mf.i, vf.a] */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // hg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(h hVar, Continuation continuation) {
        t tVar;
        int i5;
        u uVar;
        Throwable th2;
        switch (this.f10774a) {
            case 0:
                if (continuation instanceof t) {
                    tVar = (t) continuation;
                    int i10 = tVar.f10763b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        tVar.f10763b = i10 - Integer.MIN_VALUE;
                        Object obj = tVar.f10762a;
                        Object obj2 = lf.a.f20034a;
                        i5 = tVar.f10763b;
                        if (i5 != 0) {
                            h8.b.B(obj);
                            tVar.f10765d = this;
                            tVar.f10766e = hVar;
                            tVar.f10763b = 1;
                            obj = u0.f(this.f10775b, hVar, tVar);
                            if (obj == obj2) {
                                return obj2;
                            }
                            uVar = this;
                        } else {
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                h8.b.B(obj);
                                return Unit.f19194a;
                            }
                            hVar = tVar.f10766e;
                            uVar = tVar.f10765d;
                            h8.b.B(obj);
                        }
                        th2 = (Throwable) obj;
                        if (th2 != null) {
                            ?? r22 = uVar.f10776c;
                            tVar.f10765d = null;
                            tVar.f10766e = null;
                            tVar.f10763b = 2;
                            InlineMarker.mark(6);
                            Object invoke = r22.invoke(hVar, th2, tVar);
                            InlineMarker.mark(7);
                            if (invoke == obj2) {
                                return obj2;
                            }
                        }
                        return Unit.f19194a;
                    }
                }
                tVar = new t(this, continuation);
                Object obj3 = tVar.f10762a;
                Object obj22 = lf.a.f20034a;
                i5 = tVar.f10763b;
                if (i5 != 0) {
                }
                th2 = (Throwable) obj3;
                if (th2 != null) {
                }
                return Unit.f19194a;
            case 1:
                Object a7 = this.f10775b.a(new a0(new Ref.BooleanRef(), hVar, this.f10776c), continuation);
                return a7 == lf.a.f20034a ? a7 : Unit.f19194a;
            default:
                Object a10 = this.f10775b.a(new bd.f(hVar, (Function2) this.f10776c), continuation);
                return a10 == lf.a.f20034a ? a10 : Unit.f19194a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(g gVar, vf.a aVar) {
        this.f10774a = 0;
        this.f10775b = gVar;
        this.f10776c = (mf.i) aVar;
    }
}
