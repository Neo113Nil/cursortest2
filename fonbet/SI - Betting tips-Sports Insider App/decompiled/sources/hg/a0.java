package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a0 implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f10639a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f10640b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mf.i f10641c;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(Ref.BooleanRef booleanRef, h hVar, Function2 function2) {
        this.f10639a = booleanRef;
        this.f10640b = hVar;
        this.f10641c = (mf.i) function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        if (r8.d(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        if (r6.f10640b.d(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // hg.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, Continuation continuation) {
        z zVar;
        int i5;
        a0 a0Var;
        if (continuation instanceof z) {
            zVar = (z) continuation;
            int i10 = zVar.f10809e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zVar.f10809e = i10 - Integer.MIN_VALUE;
                Object obj2 = zVar.f10807c;
                lf.a aVar = lf.a.f20034a;
                i5 = zVar.f10809e;
                if (i5 != 0) {
                    h8.b.B(obj2);
                    if (this.f10639a.element) {
                        zVar.f10809e = 1;
                    } else {
                        zVar.f10805a = this;
                        zVar.f10806b = obj;
                        zVar.f10809e = 2;
                        obj2 = this.f10641c.invoke(obj, zVar);
                        if (obj2 != aVar) {
                            a0Var = this;
                            if (!((Boolean) obj2).booleanValue()) {
                            }
                        }
                    }
                    return aVar;
                }
                if (i5 == 1) {
                    h8.b.B(obj2);
                    return Unit.f19194a;
                }
                if (i5 != 2) {
                    if (i5 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj2);
                    return Unit.f19194a;
                }
                obj = zVar.f10806b;
                a0Var = zVar.f10805a;
                h8.b.B(obj2);
                if (!((Boolean) obj2).booleanValue()) {
                    return Unit.f19194a;
                }
                a0Var.f10639a.element = true;
                h hVar = a0Var.f10640b;
                zVar.f10805a = null;
                zVar.f10806b = null;
                zVar.f10809e = 3;
            }
        }
        zVar = new z(this, continuation);
        Object obj22 = zVar.f10807c;
        lf.a aVar2 = lf.a.f20034a;
        i5 = zVar.f10809e;
        if (i5 != 0) {
        }
    }
}
