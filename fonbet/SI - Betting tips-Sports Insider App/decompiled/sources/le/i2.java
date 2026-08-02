package le;

import android.graphics.Typeface;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.ui.pays.VipAccessFragment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i2 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19829b;

    /* renamed from: c, reason: collision with root package name */
    public int f19830c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ VipAccessFragment f19831d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(VipAccessFragment vipAccessFragment, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19829b = i5;
        this.f19831d = vipAccessFragment;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19829b) {
            case 0:
                return new i2(this.f19831d, continuation, 0);
            case 1:
                return new i2(this.f19831d, continuation, 1);
            default:
                return new i2(this.f19831d, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19829b) {
        }
        return ((i2) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0078, code lost:
    
        if (r8 == r0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Typeface typeface;
        int i5 = this.f19829b;
        Unit unit = null;
        Object[] objArr = 0;
        VipAccessFragment vipAccessFragment = this.f19831d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i10 = this.f19830c;
                try {
                    if (i10 == 0) {
                        h8.b.B(obj);
                        h H = vipAccessFragment.H();
                        this.f19830c = 1;
                        obj = H.r();
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                    return (Pair) obj;
                } catch (Exception unused) {
                    kotlin.collections.e0 e0Var = kotlin.collections.e0.f19204a;
                    return new Pair(e0Var, e0Var);
                }
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i11 = this.f19830c;
                if (i11 == 0) {
                    h8.b.B(obj);
                    lg.e eVar = eg.m0.f9201a;
                    lg.d dVar = lg.d.f20063c;
                    i2 i2Var = new i2(vipAccessFragment, objArr == true ? 1 : 0, 0);
                    this.f19830c = 1;
                    obj = eg.c0.A(dVar, i2Var, this);
                    break;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return obj;
                    }
                    h8.b.B(obj);
                }
                lg.e eVar2 = eg.m0.f9201a;
                fg.e eVar3 = jg.q.f18523a;
                ab.b bVar = new ab.b(vipAccessFragment, (Pair) obj, null, 25);
                this.f19830c = 2;
                Object A = eg.c0.A(eVar3, bVar, this);
                if (A != aVar2) {
                    return A;
                }
                return aVar2;
            default:
                lf.a aVar3 = lf.a.f20034a;
                int i12 = this.f19830c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    try {
                        typeface = ((za.i) ((nc.g) y3.m(nc.g.class, null, 6))).a();
                    } catch (Exception unused2) {
                        typeface = null;
                    }
                    if (typeface != null) {
                        lg.e eVar4 = eg.m0.f9201a;
                        fg.e eVar5 = jg.q.f18523a;
                        ab.b bVar2 = new ab.b(vipAccessFragment, typeface, null, 26);
                        this.f19830c = 1;
                        obj = eg.c0.A(eVar5, bVar2, this);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                    }
                    return unit;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
                unit = (Unit) obj;
                return unit;
        }
    }
}
