package te;

import android.os.Build;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import com.sports.insider.domain.workers.WorkerConsumePurchase;
import com.sports.insider.domain.workers.WorkerSports;
import eg.m0;
import io.sentry.d4;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23894b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f23895c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23896d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(Object obj, Object obj2, Continuation continuation, int i5) {
        super(2, continuation);
        this.f23894b = i5;
        this.f23895c = obj;
        this.f23896d = obj2;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f23894b) {
            case 0:
                k0 k0Var = new k0((l0) this.f23896d, continuation);
                k0Var.f23895c = obj;
                return k0Var;
            case 1:
                return new k0((xc.a) this.f23895c, (String) this.f23896d, continuation, 1);
            case 2:
                return new k0((String) this.f23895c, (yc.e) this.f23896d, continuation, 2);
            case 3:
                return new k0((Throwable) this.f23895c, (String) this.f23896d, continuation, 3);
            default:
                return new k0((String) this.f23895c, (String) this.f23896d, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23894b) {
        }
        return ((k0) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f23894b;
        Continuation continuation = null;
        Object obj2 = this.f23896d;
        switch (i5) {
            case 0:
                List list = (List) this.f23895c;
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                ((l0) obj2).j.j(list);
                break;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                e3.k0 k0Var = (e3.k0) y3.m(e3.k0.class, null, 6);
                e3.o oVar = e3.o.f8552b;
                Intrinsics.checkNotNullParameter(WorkerConsumePurchase.class, "workerClass");
                e3.z zVar = new e3.z(WorkerConsumePurchase.class);
                e3.y yVar = e3.y.f8572a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                e3.y networkType = e3.y.f8573b;
                Intrinsics.checkNotNullParameter(networkType, "networkType");
                e3.z zVar2 = (e3.z) ((e3.z) ((e3.z) zVar.f(new e3.f(new n3.i(null), networkType, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? CollectionsKt.Z(linkedHashSet) : kotlin.collections.g0.f19206a))).e(e3.a.f8472b, 2L, TimeUnit.MINUTES)).g(10L, TimeUnit.SECONDS);
                Pair[] pairArr = {new Pair("purchaseToken", (String) obj2)};
                e3.i iVar = new e3.i(0);
                Pair pair = pairArr[0];
                iVar.e(pair.f19193b, (String) pair.f19192a);
                break;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    Intrinsics.checkNotNullParameter(WorkerSports.class, "workerClass");
                    e3.z zVar3 = new e3.z(WorkerSports.class);
                    e3.y yVar2 = e3.y.f8572a;
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    e3.y networkType2 = e3.y.f8573b;
                    Intrinsics.checkNotNullParameter(networkType2, "networkType");
                    e3.z zVar4 = (e3.z) zVar3.f(new e3.f(new n3.i(null), networkType2, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? CollectionsKt.Z(linkedHashSet2) : kotlin.collections.g0.f19206a));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String str = (String) this.f23895c;
                    Intrinsics.checkNotNullParameter("langWorkKey", "key");
                    linkedHashMap.put("langWorkKey", str);
                    e3.j jVar = new e3.j(linkedHashMap);
                    rh.g.L(jVar);
                    e3.z zVar5 = (e3.z) zVar4.h(jVar);
                    e3.a aVar4 = e3.a.f8471a;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    break;
                } catch (Exception ex) {
                    Intrinsics.checkNotNullParameter(ex, "ex");
                    jg.d dVar = MyApp.f6830c;
                    lg.e eVar = m0.f9201a;
                    eg.c0.t(dVar, lg.d.f20063c, null, new q4.r(ex, continuation, 18), 2);
                    return Unit.f19194a;
                }
            case 3:
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    Intrinsics.checkNotNull(d4.d().s((Throwable) this.f23895c, new com.google.firebase.messaging.q((String) obj2, 9)));
                } catch (Exception unused) {
                }
                break;
            default:
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    Intrinsics.checkNotNull(d4.d().v((String) this.f23895c, new com.google.firebase.messaging.q((String) obj2, 10)));
                } catch (Exception unused2) {
                }
                break;
        }
        return Unit.f19194a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var, Continuation continuation) {
        super(2, continuation);
        this.f23894b = 0;
        this.f23896d = l0Var;
    }
}
