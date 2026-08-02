package k2;

import com.sports.insider.ui.support.SupportChat;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import la.u0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class v extends FunctionReferenceImpl implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18778a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i5, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i5, obj, cls, str, str2, i10);
        this.f18778a = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        char c2 = 1;
        char c8 = 1;
        int i5 = 0;
        int i10 = 14;
        Continuation continuation = null;
        switch (this.f18778a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                pe.s sVar = (pe.s) this.receiver;
                mc.a aVar = pe.s.F;
                sVar.getClass();
                Object i11 = eg.c0.i(new pe.p(booleanValue, sVar, continuation, i5), (Continuation) obj2);
                if (i11 != lf.a.f20034a) {
                    break;
                }
                break;
            case 3:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                pe.s sVar2 = (pe.s) this.receiver;
                mc.a aVar2 = pe.s.F;
                sVar2.getClass();
                Object i12 = eg.c0.i(new pe.p(booleanValue2, sVar2, continuation, c2 == true ? 1 : 0), (Continuation) obj2);
                if (i12 != lf.a.f20034a) {
                    break;
                }
                break;
            case 4:
                SupportChat supportChat = (SupportChat) this.receiver;
                supportChat.getClass();
                lg.e eVar = eg.m0.f9201a;
                break;
            case 5:
                qg.g p02 = (qg.g) obj;
                int intValue = ((Number) obj2).intValue();
                Intrinsics.checkNotNullParameter(p02, "p0");
                ug.i iVar = (ug.i) this.receiver;
                iVar.getClass();
                boolean z5 = !p02.j(intValue) && p02.i(intValue).c();
                iVar.f24274b = z5;
                break;
            case 6:
                ((u0) this.receiver).getClass();
                io.sentry.hints.j jVar = new io.sentry.hints.j(i10);
                lg.e eVar2 = eg.m0.f9201a;
                Object A = eg.c0.A(lg.d.f20063c, new eb.r(jVar, (String[]) obj, continuation, 2), (Continuation) obj2);
                lf.a aVar3 = lf.a.f20034a;
                if (A != aVar3) {
                    A = Unit.f19194a;
                }
                if (A != aVar3) {
                    break;
                }
                break;
            case 7:
                ((u0) this.receiver).getClass();
                io.sentry.hints.j jVar2 = new io.sentry.hints.j(i10);
                lg.e eVar3 = eg.m0.f9201a;
                Object A2 = eg.c0.A(lg.d.f20063c, new eb.r(jVar2, (String[]) obj, continuation, 4), (Continuation) obj2);
                lf.a aVar4 = lf.a.f20034a;
                if (A2 != aVar4) {
                    A2 = Unit.f19194a;
                }
                if (A2 != aVar4) {
                    break;
                }
                break;
            case 8:
                ((u0) this.receiver).getClass();
                io.sentry.hints.j jVar3 = new io.sentry.hints.j(i10);
                lg.e eVar4 = eg.m0.f9201a;
                Object A3 = eg.c0.A(lg.d.f20063c, new eb.r(jVar3, (String[]) obj, continuation, 5), (Continuation) obj2);
                lf.a aVar5 = lf.a.f20034a;
                if (A3 != aVar5) {
                    A3 = Unit.f19194a;
                }
                if (A3 != aVar5) {
                    break;
                }
                break;
            case 9:
                ((u0) this.receiver).getClass();
                io.sentry.hints.j jVar4 = new io.sentry.hints.j(i10);
                lg.e eVar5 = eg.m0.f9201a;
                Object A4 = eg.c0.A(lg.d.f20063c, new eb.r(jVar4, (String[]) obj, continuation, 3), (Continuation) obj2);
                lf.a aVar6 = lf.a.f20034a;
                if (A4 != aVar6) {
                    A4 = Unit.f19194a;
                }
                if (A4 != aVar6) {
                    break;
                }
                break;
            case 10:
                ((u0) this.receiver).getClass();
                io.sentry.hints.j jVar5 = new io.sentry.hints.j(i10);
                lg.e eVar6 = eg.m0.f9201a;
                Object A5 = eg.c0.A(lg.d.f20063c, new eb.r(jVar5, (String[]) obj, continuation, c8 == true ? 1 : 0), (Continuation) obj2);
                lf.a aVar7 = lf.a.f20034a;
                if (A5 != aVar7) {
                    A5 = Unit.f19194a;
                }
                if (A5 != aVar7) {
                    break;
                }
                break;
            default:
                ((u0) this.receiver).getClass();
                io.sentry.hints.j jVar6 = new io.sentry.hints.j(i10);
                lg.e eVar7 = eg.m0.f9201a;
                Object A6 = eg.c0.A(lg.d.f20063c, new eb.r(jVar6, (String[]) obj, continuation, i5), (Continuation) obj2);
                lf.a aVar8 = lf.a.f20034a;
                if (A6 != aVar8) {
                    A6 = Unit.f19194a;
                }
                if (A6 != aVar8) {
                    break;
                }
                break;
        }
        return Unit.f19194a;
    }
}
