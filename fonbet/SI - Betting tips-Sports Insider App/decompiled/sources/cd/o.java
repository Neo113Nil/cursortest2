package cd;

import eg.z;
import f3.x;
import k2.w;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3793b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f3794c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3796e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, long j, Continuation continuation) {
        super(2, continuation);
        this.f3796e = qVar;
        this.f3794c = j;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3793b) {
            case 0:
                o oVar = new o((q) this.f3796e, this.f3794c, continuation);
                oVar.f3795d = obj;
                return oVar;
            default:
                return new o((fb.b) this.f3795d, this.f3794c, (String) this.f3796e, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3793b) {
            case 0:
                return ((o) create((g1.a) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            default:
                return ((o) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
        }
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f3793b;
        Object obj2 = this.f3796e;
        long j = this.f3794c;
        switch (i5) {
            case 0:
                g1.a aVar = (g1.a) this.f3795d;
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                g1.c cVar = ((q) obj2).f3803c;
                Long l6 = (Long) aVar.c(cVar);
                aVar.e(cVar, new Long((l6 != null ? l6.longValue() : 0L) + j));
                break;
            default:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                sb.j e0 = x.e0();
                String lang = (String) obj2;
                e0.getClass();
                Intrinsics.checkNotNullParameter(lang, "lang");
                tb.f fVar = e0.f23426a;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(lang, "lang");
                w wVar = fVar.f23832a;
                int i10 = 0;
                if (((Number) x.n0(wVar, true, false, new m3.h(i10, lang, 5))).intValue() > 0) {
                    Intrinsics.checkNotNullParameter(lang, "lang");
                    ((Number) x.n0(wVar, false, true, new eb.d(lang, (int) (j / 1000), i10, 2))).intValue();
                }
                break;
        }
        return Unit.f19194a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(fb.b bVar, long j, String str, Continuation continuation) {
        super(2, continuation);
        this.f3795d = bVar;
        this.f3794c = j;
        this.f3796e = str;
    }
}
