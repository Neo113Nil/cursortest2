package jd;

import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mf.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18454b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y8.d f18455c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f18456d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(y8.d dVar, long j, Continuation continuation, int i5) {
        super(2, continuation);
        this.f18454b = i5;
        this.f18455c = dVar;
        this.f18456d = j;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f18454b) {
            case 0:
                return new d(this.f18455c, this.f18456d, continuation, 0);
            default:
                return new d(this.f18455c, this.f18456d, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f18454b) {
        }
        return ((d) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f18454b;
        long j = this.f18456d;
        y8.d dVar = this.f18455c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                long j6 = 0;
                try {
                    fa.a c2 = y8.d.c(dVar);
                    c2.getClass();
                    Intrinsics.checkNotNullParameter("fbTokenLastTime", "key");
                    j6 = c2.f9542b.getLong("fbTokenLastTime", 0L);
                } catch (Exception unused) {
                }
                return Boolean.valueOf(j6 + 1000 > j);
            default:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    y8.d.c(dVar).c(j, "fbTokenLastTime");
                } catch (Exception unused2) {
                }
                return Unit.f19194a;
        }
    }
}
