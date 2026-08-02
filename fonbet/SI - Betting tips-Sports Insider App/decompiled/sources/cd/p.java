package cd;

import android.content.Context;
import androidx.appcompat.widget.c1;
import com.google.android.gms.internal.measurement.y3;
import com.google.firebase.messaging.x;
import com.sports.insider.domain.workers.WorkerHidePush;
import e3.a0;
import e3.k0;
import eg.c0;
import eg.z;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import wc.d0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3797b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f3798c;

    /* renamed from: d, reason: collision with root package name */
    public int f3799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3800e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(long j, int i5, m3.f fVar, Continuation continuation) {
        super(2, continuation);
        this.f3797b = 1;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f3798c = j;
        this.f3799d = i5;
        this.f3800e = fVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3797b) {
            case 0:
                return new p((q) this.f3800e, this.f3798c, continuation);
            case 1:
                int i5 = this.f3799d;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                return new p(this.f3798c, i5, (m3.f) this.f3800e, continuation);
            case 2:
                return new p(this.f3798c, (wc.i) this.f3800e, continuation, 2);
            case 3:
                return new p(this.f3798c, (x) this.f3800e, continuation, 3);
            default:
                return new p(this.f3798c, (d0) this.f3800e, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f3797b) {
        }
        return ((p) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f3797b;
        long j = this.f3798c;
        switch (i5) {
            case 0:
                q qVar = (q) this.f3800e;
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f3799d;
                if (i10 == 0) {
                    h8.b.B(obj);
                    Context context = qVar.f3801a;
                    ag.u[] uVarArr = id.d.f11147a;
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    c1.i iVar = (c1.i) id.d.f11148b.a(context, id.d.f11147a[0]);
                    o oVar = new o(qVar, j, null);
                    this.f3799d = 1;
                    if (iVar.h(new g1.b(oVar, null, 1), this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 1:
                int i11 = this.f3799d;
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                if (j <= 0) {
                    return Unit.f19194a;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Intrinsics.checkNotNullParameter("notifyId", "key");
                linkedHashMap.put("notifyId", Integer.valueOf(i11));
                e3.j jVar = new e3.j(linkedHashMap);
                rh.g.L(jVar);
                String i12 = c1.i(i11, "WorkerHidePush_");
                Intrinsics.checkNotNullParameter(WorkerHidePush.class, "workerClass");
                ((k0) y3.m(k0.class, null, 6)).c(c1.i(i11, "WorkerHidePush_"), e3.o.f8551a, (a0) ((e3.z) ((e3.z) ((e3.z) ((e3.z) new e3.z(WorkerHidePush.class).h(jVar)).e(e3.a.f8471a, 1L, TimeUnit.MINUTES)).g(j, TimeUnit.MILLISECONDS)).a(i12)).b());
                return Unit.f19194a;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                int i13 = this.f3799d;
                if (i13 == 0) {
                    h8.b.B(obj);
                    if (j > 0) {
                        this.f3799d = 1;
                        if (c0.j(j * 1000, this) == aVar3) {
                            return aVar3;
                        }
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
                pc.u a7 = wc.i.a();
                this.f3799d = 2;
                if (a7.y(this) == aVar3) {
                    return aVar3;
                }
                return Unit.f19194a;
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                int i14 = this.f3799d;
                if (i14 == 0) {
                    h8.b.B(obj);
                    if (j > 0) {
                        this.f3799d = 1;
                        if (c0.j(j * 1000, this) == aVar4) {
                            return aVar4;
                        }
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
                pc.u v5 = x.v();
                this.f3799d = 2;
                if (v5.y(this) == aVar4) {
                    return aVar4;
                }
                return Unit.f19194a;
            default:
                lf.a aVar5 = lf.a.f20034a;
                int i15 = this.f3799d;
                if (i15 == 0) {
                    h8.b.B(obj);
                    if (j > 0) {
                        this.f3799d = 1;
                        if (c0.j(j * 1000, this) == aVar5) {
                            return aVar5;
                        }
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
                pc.u b10 = d0.b();
                this.f3799d = 2;
                if (b10.y(this) == aVar5) {
                    return aVar5;
                }
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(long j, Object obj, Continuation continuation, int i5) {
        super(2, continuation);
        this.f3797b = i5;
        this.f3798c = j;
        this.f3800e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, long j, Continuation continuation) {
        super(2, continuation);
        this.f3797b = 0;
        this.f3800e = qVar;
        this.f3798c = j;
    }
}
