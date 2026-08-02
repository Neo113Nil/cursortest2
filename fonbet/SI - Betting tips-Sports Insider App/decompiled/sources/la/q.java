package la;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19572b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f19573c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f19574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f19575e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, String str2, w wVar, Continuation continuation) {
        super(2, continuation);
        this.f19574d = str;
        this.f19575e = str2;
        this.f19573c = wVar;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19572b) {
            case 0:
                return new q(this.f19574d, this.f19575e, this.f19573c, continuation);
            default:
                return new q(this.f19573c, this.f19574d, this.f19575e, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19572b) {
        }
        return ((q) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f19572b;
        String str = this.f19575e;
        String name = this.f19574d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                return new Long(fb.b.L0(name, str));
            default:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                String valueOf = String.valueOf(str);
                Intrinsics.checkNotNullParameter(name, "name");
                hb.g N0 = fb.b.N0();
                N0.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                hb.f fVar = N0.f10480a;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                return new Long(io.sentry.config.a.C(Integer.valueOf(((Number) f3.x.n0(fVar.f10479a, true, false, new eb.c(name, valueOf, 2))).intValue())) ? -1L : fb.b.L0(name, String.valueOf(str)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(w wVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f19573c = wVar;
        this.f19574d = str;
        this.f19575e = str2;
    }
}
