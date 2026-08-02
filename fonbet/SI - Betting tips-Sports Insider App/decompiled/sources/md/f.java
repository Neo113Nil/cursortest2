package md;

import com.sports.insider.MyApp;
import eg.c0;
import eg.m0;
import eg.z;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import la.j1;
import q4.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20541b;

    /* renamed from: c, reason: collision with root package name */
    public int f20542c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f20543d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i5, Continuation continuation, m mVar) {
        super(2, continuation);
        this.f20541b = i5;
        this.f20543d = mVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f20541b) {
            case 0:
                return new f(0, continuation, this.f20543d);
            default:
                return new f(1, continuation, this.f20543d);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f20541b) {
        }
        return ((f) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5;
        Continuation continuation = null;
        switch (this.f20541b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f20542c;
                try {
                    if (i10 == 0) {
                        h8.b.B(obj);
                        j1 g10 = m.g();
                        this.f20542c = 1;
                        obj = g10.a(this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    i5 = ((Number) obj).intValue();
                } catch (Exception ex) {
                    Intrinsics.checkNotNullParameter(ex, "ex");
                    jg.d dVar = MyApp.f6830c;
                    lg.e eVar = m0.f9201a;
                    c0.t(dVar, lg.d.f20063c, null, new r(ex, null, 18), 2);
                    i5 = 400;
                }
                return new Integer(i5);
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i11 = this.f20542c;
                m mVar = this.f20543d;
                if (i11 == 0) {
                    h8.b.B(obj);
                    mVar.getClass();
                    j1 g11 = m.g();
                    this.f20542c = 1;
                    obj = g11.c(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                mVar.getClass();
                j1 g12 = m.g();
                this.f20542c = 2;
                g12.getClass();
                fb.b bVar = new fb.b();
                lg.e eVar2 = m0.f9201a;
                Object A = c0.A(lg.d.f20063c, new qb.c(bVar, (List) obj, continuation, 3), this);
                if (A != aVar2) {
                    A = Unit.f19194a;
                }
                if (A != aVar2) {
                    A = Unit.f19194a;
                }
                if (A == aVar2) {
                    return aVar2;
                }
                return Unit.f19194a;
        }
    }
}
