package ld;

import eg.z;
import io.sentry.hints.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import la.c1;
import mf.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19680b;

    /* renamed from: c, reason: collision with root package name */
    public int f19681c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f19682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19683e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(j jVar, int i5, Continuation continuation, int i10) {
        super(2, continuation);
        this.f19680b = i10;
        this.f19682d = jVar;
        this.f19683e = i5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19680b) {
            case 0:
                return new b(this.f19682d, this.f19683e, continuation, 0);
            default:
                return new b(this.f19682d, this.f19683e, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19680b) {
        }
        return ((b) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f19680b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i5 = this.f19681c;
                if (i5 == 0) {
                    h8.b.B(obj);
                    c1 x10 = j.x();
                    this.f19681c = 1;
                    if (x10.g(this.f19683e, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i10 = this.f19681c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    c1 x11 = j.x();
                    this.f19681c = 1;
                    if (x11.h(this.f19683e, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
        }
    }
}
