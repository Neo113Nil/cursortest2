package ug;

import com.android.billingclient.api.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class p extends mf.h implements vf.a {

    /* renamed from: a, reason: collision with root package name */
    public int f24288a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ gf.b f24289b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f24290c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(l0 l0Var, Continuation continuation) {
        super(3, continuation);
        this.f24290c = l0Var;
    }

    @Override // vf.a
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p pVar = new p(this.f24290c, (Continuation) obj3);
        pVar.f24289b = (gf.b) obj;
        return pVar.invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        l0 l0Var = this.f24290c;
        u uVar = (u) l0Var.f4045c;
        gf.b bVar = this.f24289b;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f24288a;
        if (i5 == 0) {
            h8.b.B(obj);
            byte p10 = uVar.p();
            if (p10 == 1) {
                return l0Var.i(true);
            }
            if (p10 == 0) {
                return l0Var.i(false);
            }
            if (p10 != 6) {
                if (p10 == 8) {
                    return l0Var.h();
                }
                u.m(uVar, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f24289b = null;
            this.f24288a = 1;
            obj = l0.a(l0Var, bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
        }
        return (tg.m) obj;
    }
}
