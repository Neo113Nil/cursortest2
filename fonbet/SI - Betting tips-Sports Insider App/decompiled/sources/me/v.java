package me;

import com.google.android.gms.internal.measurement.y3;
import eg.m0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20683b;

    /* renamed from: c, reason: collision with root package name */
    public int f20684c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f20685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kc.b f20686e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kc.b bVar, c0 c0Var, Continuation continuation) {
        super(2, continuation);
        this.f20683b = 2;
        this.f20686e = bVar;
        this.f20685d = c0Var;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f20683b) {
            case 0:
                return new v(this.f20685d, this.f20686e, continuation, 0);
            case 1:
                return new v(this.f20685d, this.f20686e, continuation, 1);
            default:
                return new v(this.f20686e, this.f20685d, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f20683b) {
        }
        return ((v) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f20683b;
        Continuation continuation = null;
        int i10 = 0;
        kc.b bVar = this.f20686e;
        c0 c0Var = this.f20685d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i11 = this.f20684c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    l1.a aVar2 = c0Var.f20612b;
                    int i12 = c0Var.f20619f;
                    this.f20684c = 1;
                    if (aVar2.x(bVar, i12, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar3 = lf.a.f20034a;
                int i13 = this.f20684c;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                this.f20684c = 1;
                lg.e eVar = m0.f9201a;
                Object A = eg.c0.A(lg.d.f20063c, new y(c0Var, bVar, null, 0), this);
                return A == aVar3 ? aVar3 : A;
            default:
                AtomicBoolean atomicBoolean = c0Var.f20621g;
                Object obj2 = lf.a.f20034a;
                int i14 = this.f20684c;
                if (i14 == 0) {
                    h8.b.B(obj);
                    if (bVar == null) {
                        return Unit.f19194a;
                    }
                    if (!atomicBoolean.get()) {
                        return Unit.f19194a;
                    }
                    atomicBoolean.set(false);
                    m3.f fVar = c0Var.f20614c;
                    String arrayKind = bVar.getArrayKind();
                    fVar.getClass();
                    if (arrayKind != null) {
                        try {
                            Object b10 = new com.google.gson.j().b(Integer[].class, arrayKind);
                            Intrinsics.checkNotNullExpressionValue(b10, "fromJson(...)");
                            List z5 = kotlin.collections.p.z((Object[]) b10);
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : z5) {
                                if (((Number) obj3).intValue() > 0) {
                                    arrayList.add(obj3);
                                }
                            }
                            Integer num = (Integer) CollectionsKt.firstOrNull(arrayList);
                            if (num != null) {
                                int intValue = num.intValue();
                                id.e eVar2 = (id.e) y3.m(id.e.class, null, 6);
                                eg.z zVar = eVar2.f11150b;
                                lg.e eVar3 = m0.f9201a;
                                eg.c0.t(zVar, lg.d.f20063c, null, new cd.k(intValue, 3, eVar2, (Continuation) null), 2);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    int type = bVar.getType();
                    if (type == 1 || type == 2 || type == 3) {
                        this.f20684c = 1;
                        lg.e eVar4 = m0.f9201a;
                        Object A2 = eg.c0.A(lg.d.f20063c, new v(c0Var, bVar, continuation, i10), this);
                        if (A2 != lf.a.f20034a) {
                            A2 = Unit.f19194a;
                        }
                        if (A2 == obj2) {
                            return obj2;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(c0 c0Var, kc.b bVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f20683b = i5;
        this.f20685d = c0Var;
        this.f20686e = bVar;
    }
}
