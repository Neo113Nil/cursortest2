package id;

import eg.c0;
import eg.m0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o implements hg.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11192a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11193b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11194c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11195d;

    public /* synthetic */ o(hg.h hVar, Object obj, Object obj2, int i5) {
        this.f11192a = i5;
        this.f11193b = hVar;
        this.f11194c = obj;
        this.f11195d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bc  */
    @Override // hg.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, Continuation continuation) {
        n nVar;
        Object obj2;
        lf.a aVar;
        int i5;
        hg.h hVar;
        int i10;
        m2.k kVar;
        Object obj3;
        lf.a aVar2;
        int i11;
        hg.h hVar2;
        switch (this.f11192a) {
            case 0:
                if (continuation instanceof n) {
                    nVar = (n) continuation;
                    int i12 = nVar.f11188b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        nVar.f11188b = i12 - Integer.MIN_VALUE;
                        obj2 = nVar.f11187a;
                        aVar = lf.a.f20034a;
                        i5 = nVar.f11188b;
                        if (i5 != 0) {
                            h8.b.B(obj2);
                            hVar = (hg.h) this.f11193b;
                            x xVar = (x) this.f11194c;
                            mc.a aVar3 = (mc.a) this.f11195d;
                            nVar.f11190d = hVar;
                            nVar.f11191e = 0;
                            nVar.f11188b = 1;
                            xVar.getClass();
                            obj2 = c0.A(m0.f9201a, new q((List) obj, xVar, aVar3, null), nVar);
                            if (obj2 == aVar) {
                                return aVar;
                            }
                            i10 = 0;
                        } else {
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                h8.b.B(obj2);
                                return Unit.f19194a;
                            }
                            i10 = nVar.f11191e;
                            hVar = nVar.f11190d;
                            h8.b.B(obj2);
                        }
                        nVar.f11190d = null;
                        nVar.f11191e = i10;
                        nVar.f11188b = 2;
                        if (hVar.d(obj2, nVar) == aVar) {
                            return aVar;
                        }
                        return Unit.f19194a;
                    }
                }
                nVar = new n(this, continuation);
                obj2 = nVar.f11187a;
                aVar = lf.a.f20034a;
                i5 = nVar.f11188b;
                if (i5 != 0) {
                }
                nVar.f11190d = null;
                nVar.f11191e = i10;
                nVar.f11188b = 2;
                if (hVar.d(obj2, nVar) == aVar) {
                }
                return Unit.f19194a;
            case 1:
                Object b10 = ig.c.b((CoroutineContext) this.f11193b, obj, this.f11194c, (androidx.lifecycle.c) this.f11195d, continuation);
                return b10 == lf.a.f20034a ? b10 : Unit.f19194a;
            default:
                if (continuation instanceof m2.k) {
                    kVar = (m2.k) continuation;
                    int i13 = kVar.f20240b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        kVar.f20240b = i13 - Integer.MIN_VALUE;
                        obj3 = kVar.f20239a;
                        aVar2 = lf.a.f20034a;
                        i11 = kVar.f20240b;
                        if (i11 != 0) {
                            h8.b.B(obj3);
                            hg.h hVar3 = (hg.h) this.f11193b;
                            k2.w wVar = (k2.w) this.f11194c;
                            Function1 function1 = (Function1) this.f11195d;
                            kVar.f20241c = hVar3;
                            kVar.f20240b = 1;
                            Object o02 = f3.x.o0(wVar, true, function1, kVar);
                            if (o02 == aVar2) {
                                return aVar2;
                            }
                            obj3 = o02;
                            hVar2 = hVar3;
                        } else {
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                h8.b.B(obj3);
                                return Unit.f19194a;
                            }
                            hVar2 = kVar.f20241c;
                            h8.b.B(obj3);
                        }
                        kVar.f20241c = null;
                        kVar.f20240b = 2;
                        if (hVar2.d(obj3, kVar) == aVar2) {
                            return aVar2;
                        }
                        return Unit.f19194a;
                    }
                }
                kVar = new m2.k(this, continuation);
                obj3 = kVar.f20239a;
                aVar2 = lf.a.f20034a;
                i11 = kVar.f20240b;
                if (i11 != 0) {
                }
                kVar.f20241c = null;
                kVar.f20240b = 2;
                if (hVar2.d(obj3, kVar) == aVar2) {
                }
                return Unit.f19194a;
        }
    }

    public o(hg.h hVar, CoroutineContext coroutineContext) {
        this.f11192a = 1;
        this.f11193b = coroutineContext;
        this.f11194c = jg.y.b(coroutineContext);
        this.f11195d = new androidx.lifecycle.c(hVar, (Continuation) null, 22);
    }
}
