package kd;

import cd.p;
import eg.c0;
import eg.m0;
import eg.z;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import m3.f;
import mf.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f19004b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f19005c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19006d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j, int i5, Continuation continuation) {
        super(2, continuation);
        this.f19005c = j;
        this.f19006d = i5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f19005c, this.f19006d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = lf.a.f20034a;
        int i5 = this.f19004b;
        if (i5 == 0) {
            h8.b.B(obj);
            f fVar = new f(24);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f19004b = 1;
            lg.e eVar = m0.f9201a;
            Object A = c0.A(lg.d.f20063c, new p(this.f19005c, this.f19006d, fVar, (Continuation) null), this);
            if (A != obj2) {
                A = Unit.f19194a;
            }
            if (A == obj2) {
                return obj2;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
        }
        return Unit.f19194a;
    }
}
