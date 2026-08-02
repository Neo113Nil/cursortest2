package lb;

import eg.z;
import f3.x;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mf.i;
import ub.d;
import ub.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19659b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fb.b f19660c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19661d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(fb.b bVar, int i5, Continuation continuation, int i10) {
        super(2, continuation);
        this.f19659b = i10;
        this.f19660c = bVar;
        this.f19661d = i5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f19659b) {
            case 0:
                return new b(this.f19660c, this.f19661d, continuation, 0);
            case 1:
                return new b(this.f19660c, this.f19661d, continuation, 1);
            default:
                return new b(this.f19660c, this.f19661d, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f19659b) {
        }
        return ((b) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f19659b;
        int i10 = this.f19661d;
        char c2 = 1;
        int i11 = 0;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                return Boolean.valueOf(((Number) x.n0(x.e0().f23427b.f24213a, true, false, new eb.b(i10, 23))).intValue() > 0);
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                return (ja.c) x.n0(x.e0().f23427b.f24213a, true, false, new d(i10, i11));
            default:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                f fVar = x.e0().f23427b;
                return i10 == 0 ? (List) x.n0(fVar.f24213a, true, false, new ub.b(c2 == true ? 1 : 0)) : (List) x.n0(fVar.f24213a, true, false, new eb.b(i10, 21));
        }
    }
}
