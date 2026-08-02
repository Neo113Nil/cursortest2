package le;

import com.sports.insider.ui.pays.VipAccessFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j2 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19841b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19842c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ VipAccessFragment f19843d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2(VipAccessFragment vipAccessFragment, Continuation continuation, int i5) {
        super(2, continuation);
        this.f19841b = i5;
        this.f19843d = vipAccessFragment;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19841b) {
            case 0:
                j2 j2Var = new j2(this.f19843d, continuation, 0);
                j2Var.f19842c = obj;
                return j2Var;
            default:
                j2 j2Var2 = new j2(this.f19843d, continuation, 1);
                j2Var2.f19842c = obj;
                return j2Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19841b) {
        }
        return ((j2) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f19841b;
        VipAccessFragment vipAccessFragment = this.f19843d;
        switch (i5) {
            case 0:
                eg.z zVar = (eg.z) this.f19842c;
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar = eg.m0.f9201a;
                lg.d dVar = lg.d.f20063c;
                eg.c0.e(zVar, dVar, new i2(vipAccessFragment, null, 1), 2);
                return eg.c0.e(zVar, dVar, new i2(vipAccessFragment, null, 2), 2);
            default:
                eg.z zVar2 = (eg.z) this.f19842c;
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar2 = eg.m0.f9201a;
                return eg.c0.e(zVar2, lg.d.f20063c, new cd.j(vipAccessFragment, (Continuation) null, 9), 2);
        }
    }
}
