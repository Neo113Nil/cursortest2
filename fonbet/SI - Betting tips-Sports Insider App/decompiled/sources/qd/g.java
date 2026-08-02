package qd;

import androidx.lifecycle.p0;
import eg.c0;
import eg.m0;
import eg.z;
import java.util.concurrent.atomic.AtomicBoolean;
import jg.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mf.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22112b;

    /* renamed from: c, reason: collision with root package name */
    public int f22113c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f22114d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f22112b = i5;
        this.f22114d = hVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f22112b) {
            case 0:
                return new g(this.f22114d, continuation, 0);
            case 1:
                return new g(this.f22114d, continuation, 1);
            default:
                return new g(this.f22114d, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f22112b) {
        }
        return ((g) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        boolean z5;
        int i5 = this.f22112b;
        boolean z7 = false;
        z7 = false;
        h hVar = this.f22114d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f22113c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    id.c cVar = hVar.j;
                    if (cVar == null) {
                        z5 = false;
                        AtomicBoolean atomicBoolean = hVar.f22115b;
                        boolean z10 = atomicBoolean == null && atomicBoolean.get();
                        p0 p0Var = hVar.f22122i;
                        if (z5 && !z10) {
                            z7 = true;
                        }
                        p0Var.h(Boolean.valueOf(z7));
                        return Unit.f19194a;
                    }
                    this.f22113c = 1;
                    obj = cVar.e(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                z5 = ((Boolean) obj).booleanValue();
                AtomicBoolean atomicBoolean2 = hVar.f22115b;
                if (atomicBoolean2 == null) {
                }
                p0 p0Var2 = hVar.f22122i;
                if (z5) {
                    z7 = true;
                }
                p0Var2.h(Boolean.valueOf(z7));
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i11 = this.f22113c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    id.c cVar2 = hVar.j;
                    if (cVar2 != null) {
                        this.f22113c = 1;
                        if (cVar2.b(this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            default:
                Object obj2 = lf.a.f20034a;
                int i12 = this.f22113c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    this.f22113c = 1;
                    lg.e eVar = m0.f9201a;
                    Object A = c0.A(q.f18523a, new g(hVar, null, z7 ? 1 : 0), this);
                    Object obj3 = A;
                    if (A != obj2) {
                        obj3 = Unit.f19194a;
                    }
                    if (obj3 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
        }
    }
}
