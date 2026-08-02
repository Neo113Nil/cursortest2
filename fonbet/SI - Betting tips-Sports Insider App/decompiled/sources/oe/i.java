package oe;

import eg.c0;
import eg.m0;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rc.t;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21201b;

    /* renamed from: c, reason: collision with root package name */
    public int f21202c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f21203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f21204e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k kVar, boolean z5, Continuation continuation, int i5) {
        super(2, continuation);
        this.f21201b = i5;
        this.f21203d = kVar;
        this.f21204e = z5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f21201b) {
            case 0:
                return new i(this.f21203d, this.f21204e, continuation, 0);
            default:
                return new i(this.f21203d, this.f21204e, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f21201b) {
        }
        return ((i) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f21201b;
        boolean z5 = this.f21204e;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f21202c;
                if (i10 == 0) {
                    h8.b.B(obj);
                    m7.b bVar = new m7.b();
                    this.f21202c = 1;
                    if (bVar.b(z5, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            default:
                Object obj2 = lf.a.f20034a;
                int i11 = this.f21202c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    m7.b bVar2 = new m7.b();
                    this.f21202c = 1;
                    lg.e eVar = m0.f9201a;
                    Object A = c0.A(lg.d.f20063c, new t(bVar2, z5, null, 2), this);
                    if (A != obj2) {
                        A = Unit.f19194a;
                    }
                    if (A == obj2) {
                        return obj2;
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
