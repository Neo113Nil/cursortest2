package ue;

import com.google.android.gms.internal.measurement.y3;
import eg.c0;
import eg.m0;
import eg.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mf.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24254b;

    /* renamed from: c, reason: collision with root package name */
    public int f24255c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f24256d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, Continuation continuation, int i5) {
        super(2, continuation);
        this.f24254b = i5;
        this.f24256d = hVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f24254b) {
            case 0:
                return new g(this.f24256d, continuation, 0);
            default:
                return new g(this.f24256d, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f24254b) {
        }
        return ((g) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f24254b;
        h hVar = this.f24256d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f24255c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                vc.a aVar2 = hVar.f24259d;
                this.f24255c = 1;
                aVar2.getClass();
                la.d dVar = (la.d) y3.m(la.d.class, null, 6);
                dVar.getClass();
                lg.e eVar = m0.f9201a;
                Object A = c0.A(lg.d.f20063c, new la.c(dVar, null, 0), this);
                return A == aVar ? aVar : A;
            default:
                lf.a aVar3 = lf.a.f20034a;
                int i11 = this.f24255c;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                vc.a aVar4 = hVar.f24259d;
                this.f24255c = 1;
                aVar4.getClass();
                la.d dVar2 = (la.d) y3.m(la.d.class, null, 6);
                dVar2.getClass();
                lg.e eVar2 = m0.f9201a;
                Object A2 = c0.A(lg.d.f20063c, new la.c(dVar2, null, 1), this);
                return A2 == aVar3 ? aVar3 : A2;
        }
    }
}
