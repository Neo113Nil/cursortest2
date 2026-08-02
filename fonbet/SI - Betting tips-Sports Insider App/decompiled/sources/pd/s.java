package pd;

import com.sports.insider.util.ExtAsDeferredKt;
import eg.m0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21789b;

    /* renamed from: c, reason: collision with root package name */
    public int f21790c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.sports.insider.ui.activities.a f21791d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i5, com.sports.insider.ui.activities.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f21789b = i5;
        this.f21791d = aVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f21789b) {
            case 0:
                return new s(0, this.f21791d, continuation);
            case 1:
                return new s(1, this.f21791d, continuation);
            default:
                return new s(2, this.f21791d, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f21789b) {
        }
        return ((s) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = 1;
        switch (this.f21789b) {
            case 0:
                com.sports.insider.ui.activities.a aVar = this.f21791d;
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f21790c;
                int i11 = 0;
                Continuation continuation = null;
                if (i10 == 0) {
                    h8.b.B(obj);
                    lg.e eVar = m0.f9201a;
                    lg.d dVar = lg.d.f20063c;
                    r rVar = new r(i11, aVar, continuation);
                    this.f21790c = 1;
                    if (eg.c0.A(dVar, rVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                if (aVar.D) {
                    aVar.D = false;
                    lg.e eVar2 = m0.f9201a;
                    lg.d dVar2 = lg.d.f20063c;
                    r rVar2 = new r(i5, aVar, continuation);
                    this.f21790c = 2;
                    if (eg.c0.A(dVar2, rVar2, this) == aVar2) {
                        return aVar2;
                    }
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar3 = lf.a.f20034a;
                int i12 = this.f21790c;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                w7.m b10 = ((com.google.android.play.core.appupdate.e) this.f21791d.B.getValue()).b();
                Intrinsics.checkNotNullExpressionValue(b10, "getAppUpdateInfo(...)");
                this.f21790c = 1;
                Object asDeferred = ExtAsDeferredKt.asDeferred(b10, this);
                return asDeferred == aVar3 ? aVar3 : asDeferred;
            default:
                lf.a aVar4 = lf.a.f20034a;
                int i13 = this.f21790c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    int i14 = com.sports.insider.ui.activities.a.G;
                    io.sentry.util.network.b bVar = new io.sentry.util.network.b(7);
                    this.f21790c = 1;
                    obj = bVar.i(this);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    com.google.android.play.core.appupdate.e eVar3 = (com.google.android.play.core.appupdate.e) this.f21791d.B.getValue();
                    y yVar = this.f21791d.C;
                    synchronized (eVar3) {
                        eVar3.f5998b.a(yVar);
                    }
                }
                return Unit.f19194a;
        }
    }
}
