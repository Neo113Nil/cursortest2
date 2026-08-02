package cd;

import eg.c0;
import eg.m0;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import la.w;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3765b;

    /* renamed from: c, reason: collision with root package name */
    public int f3766c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m3.f f3767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3768e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(m3.f fVar, int i5, Continuation continuation, int i10) {
        super(2, continuation);
        this.f3765b = i10;
        this.f3767d = fVar;
        this.f3768e = i5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3765b) {
            case 0:
                return new f(this.f3767d, this.f3768e, continuation, 0);
            default:
                return new f(this.f3767d, this.f3768e, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f3765b) {
        }
        return ((f) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f3765b;
        int i10 = this.f3768e;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i11 = this.f3766c;
                try {
                    if (i11 == 0) {
                        h8.b.B(obj);
                        w l6 = m3.f.l();
                        this.f3766c = 1;
                        l6.getClass();
                        lg.e eVar = m0.f9201a;
                        if (c0.A(lg.d.f20063c, new k(i10, 1, l6, (Continuation) null), this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                } catch (Exception e7) {
                    zc.d.b(6, null, e7);
                }
                return Unit.f19194a;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i12 = this.f3766c;
                try {
                    if (i12 == 0) {
                        h8.b.B(obj);
                        w l10 = m3.f.l();
                        this.f3766c = 1;
                        l10.getClass();
                        lg.e eVar2 = m0.f9201a;
                        if (c0.A(lg.d.f20063c, new k(i10, 0, l10, (Continuation) null), this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                } catch (Exception e9) {
                    zc.d.b(6, null, e9);
                }
                return Unit.f19194a;
        }
    }
}
