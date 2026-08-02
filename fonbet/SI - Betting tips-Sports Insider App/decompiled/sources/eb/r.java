package eb;

import eg.z;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8838b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.sentry.hints.j f8839c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String[] f8840d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(io.sentry.hints.j jVar, String[] strArr, Continuation continuation, int i5) {
        super(2, continuation);
        this.f8838b = i5;
        this.f8839c = jVar;
        this.f8840d = strArr;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f8838b) {
            case 0:
                return new r(this.f8839c, this.f8840d, continuation, 0);
            case 1:
                return new r(this.f8839c, this.f8840d, continuation, 1);
            case 2:
                return new r(this.f8839c, this.f8840d, continuation, 2);
            case 3:
                return new r(this.f8839c, this.f8840d, continuation, 3);
            case 4:
                return new r(this.f8839c, this.f8840d, continuation, 4);
            default:
                return new r(this.f8839c, this.f8840d, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f8838b) {
        }
        return ((r) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f8838b;
        String[] strArr = this.f8840d;
        io.sentry.hints.j jVar = this.f8839c;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                m s8 = io.sentry.hints.j.s(jVar);
                String[] id2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                s8.getClass();
                Intrinsics.checkNotNullParameter(id2, "id");
                Iterator it = kotlin.collections.p.q(id2).iterator();
                while (it.hasNext()) {
                    s8.f(2, 0, (String) it.next());
                }
                break;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                m s10 = io.sentry.hints.j.s(jVar);
                String[] id3 = (String[]) Arrays.copyOf(strArr, strArr.length);
                s10.getClass();
                Intrinsics.checkNotNullParameter(id3, "id");
                Iterator it2 = kotlin.collections.p.q(id3).iterator();
                while (it2.hasNext()) {
                    s10.f(1, 0, (String) it2.next());
                }
                break;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                m s11 = io.sentry.hints.j.s(jVar);
                String[] id4 = (String[]) Arrays.copyOf(strArr, strArr.length);
                s11.getClass();
                Intrinsics.checkNotNullParameter(id4, "id");
                Iterator it3 = kotlin.collections.p.q(id4).iterator();
                while (it3.hasNext()) {
                    s11.f(3, 2, (String) it3.next());
                }
                break;
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                m s12 = io.sentry.hints.j.s(jVar);
                String[] id5 = (String[]) Arrays.copyOf(strArr, strArr.length);
                s12.getClass();
                Intrinsics.checkNotNullParameter(id5, "id");
                Iterator it4 = kotlin.collections.p.q(id5).iterator();
                while (it4.hasNext()) {
                    s12.f(2, 2, (String) it4.next());
                }
                break;
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                io.sentry.hints.j.s(jVar).g((String[]) Arrays.copyOf(strArr, strArr.length));
                break;
            default:
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                m s13 = io.sentry.hints.j.s(jVar);
                String[] id6 = (String[]) Arrays.copyOf(strArr, strArr.length);
                s13.getClass();
                Intrinsics.checkNotNullParameter(id6, "id");
                Iterator it5 = kotlin.collections.p.q(id6).iterator();
                while (it5.hasNext()) {
                    s13.f(1, 2, (String) it5.next());
                }
                break;
        }
        return Unit.f19194a;
    }
}
