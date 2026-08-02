package ig;

import eg.c0;
import eg.g2;
import eg.w0;
import eg.w1;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class n implements hg.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gg.h f11269a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11270b;

    public n(gg.h hVar, int i5) {
        this.f11269a = hVar;
        this.f11270b = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e7, code lost:
    
        if (r9 != r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e9, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0049, code lost:
    
        if (r8.f11269a.h(r10, r0) == r1) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // hg.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, Continuation continuation) {
        m frame;
        int i5;
        jg.g gVar;
        Object obj2;
        Object obj3;
        if (continuation instanceof m) {
            frame = (m) continuation;
            int i10 = frame.f11268c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                frame.f11268c = i10 - Integer.MIN_VALUE;
                Object obj4 = frame.f11266a;
                Object obj5 = lf.a.f20034a;
                i5 = frame.f11268c;
                if (i5 != 0) {
                    h8.b.B(obj4);
                    IndexedValue indexedValue = new IndexedValue(this.f11270b, obj);
                    frame.f11268c = 1;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj4);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj4);
                }
                frame.f11268c = 2;
                CoroutineContext context = frame.getContext();
                c0.k(context);
                Continuation b10 = lf.d.b(frame);
                gVar = !(b10 instanceof jg.g) ? (jg.g) b10 : null;
                if (gVar != null) {
                    obj2 = Unit.f19194a;
                } else {
                    eg.w wVar = gVar.f18498d;
                    if (jg.h.h(wVar, context)) {
                        gVar.f18500f = Unit.f19194a;
                        gVar.f9185c = 1;
                        wVar.d0(context, gVar);
                    } else {
                        g2 g2Var = new g2(g2.f9174c);
                        CoroutineContext t3 = context.t(g2Var);
                        Unit unit = Unit.f19194a;
                        gVar.f18500f = unit;
                        gVar.f9185c = 1;
                        wVar.d0(t3, gVar);
                        if (g2Var.f9175b) {
                            w0 a7 = w1.a();
                            kotlin.collections.l lVar = a7.f9234e;
                            if (!(lVar != null ? lVar.isEmpty() : true)) {
                                if (a7.f9232c >= 4294967296L) {
                                    gVar.f18500f = unit;
                                    gVar.f9185c = 1;
                                    a7.j0(gVar);
                                } else {
                                    a7.l0(true);
                                    try {
                                        gVar.run();
                                        do {
                                        } while (a7.q0());
                                    } finally {
                                        try {
                                        } finally {
                                        }
                                    }
                                }
                            }
                            obj2 = Unit.f19194a;
                        }
                    }
                    obj2 = obj5;
                }
                obj3 = lf.a.f20034a;
                if (obj2 == obj3) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (obj2 != obj3) {
                    obj2 = Unit.f19194a;
                }
            }
        }
        frame = new m(this, continuation);
        Object obj42 = frame.f11266a;
        Object obj52 = lf.a.f20034a;
        i5 = frame.f11268c;
        if (i5 != 0) {
        }
        frame.f11268c = 2;
        CoroutineContext context2 = frame.getContext();
        c0.k(context2);
        Continuation b102 = lf.d.b(frame);
        if (!(b102 instanceof jg.g)) {
        }
        if (gVar != null) {
        }
        obj3 = lf.a.f20034a;
        if (obj2 == obj3) {
        }
        if (obj2 != obj3) {
        }
    }
}
