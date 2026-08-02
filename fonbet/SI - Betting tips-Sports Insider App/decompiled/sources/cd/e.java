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
public final class e extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3760b;

    /* renamed from: c, reason: collision with root package name */
    public int f3761c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m3.f f3762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f3763e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f3764f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(m3.f fVar, String str, String str2, Continuation continuation, int i5) {
        super(2, continuation);
        this.f3760b = i5;
        this.f3762d = fVar;
        this.f3763e = str;
        this.f3764f = str2;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3760b) {
            case 0:
                return new e(this.f3762d, this.f3763e, this.f3764f, continuation, 0);
            default:
                return new e(this.f3762d, this.f3763e, this.f3764f, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f3760b) {
        }
        return ((e) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f3760b;
        String str = this.f3764f;
        String str2 = this.f3763e;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f3761c;
                try {
                    if (i10 == 0) {
                        h8.b.B(obj);
                        w l6 = m3.f.l();
                        this.f3761c = 1;
                        l6.getClass();
                        lg.e eVar = m0.f9201a;
                        if (c0.A(lg.d.f20063c, new la.q(l6, str2, str, (Continuation) null), this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                } catch (Exception unused) {
                }
                return Unit.f19194a;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i11 = this.f3761c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    this.f3762d.getClass();
                    w l10 = m3.f.l();
                    this.f3761c = 1;
                    l10.getClass();
                    lg.e eVar2 = m0.f9201a;
                    if (c0.A(lg.d.f20063c, new la.q(str2, str, l10, (Continuation) null), this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
        }
    }
}
