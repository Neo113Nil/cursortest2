package pc;

import com.android.billingclient.api.Purchase;
import com.sports.insider.MyApp;
import eg.c0;
import eg.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21684b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f21685c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f21686d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(u uVar, List list, Continuation continuation, int i5) {
        super(2, continuation);
        this.f21684b = i5;
        this.f21685c = uVar;
        this.f21686d = list;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f21684b) {
            case 0:
                return new p(this.f21685c, this.f21686d, continuation, 0);
            case 1:
                return new p(this.f21685c, this.f21686d, continuation, 1);
            default:
                return new p(this.f21685c, this.f21686d, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f21684b) {
        }
        return ((p) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        int i5 = this.f21684b;
        List list = this.f21686d;
        u uVar = this.f21685c;
        Continuation continuation = null;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                if (list != null) {
                    vc.a aVar2 = (vc.a) uVar.f21701a.getValue();
                    ArrayList products = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ArrayList a7 = ((Purchase) it.next()).a();
                        Intrinsics.checkNotNullExpressionValue(a7, "getProducts(...)");
                        String str = (String) CollectionsKt.firstOrNull(a7);
                        if (str != null) {
                            products.add(str);
                        }
                    }
                    aVar2.getClass();
                    Intrinsics.checkNotNullParameter(products, "products");
                    cd.b bVar = new cd.b(6);
                    if (rh.g.f22531e != null && !products.isEmpty()) {
                        c0.t(MyApp.f6830c, m3.f.k(), null, new ab.b(products, bVar, continuation, 3), 2);
                    }
                }
                break;
            case 1:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    break;
                } catch (Exception e7) {
                    u.r(e7, "purchaseActive", new io.sentry.e("toJson"));
                    return null;
                }
            default:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    break;
                } catch (CancellationException unused) {
                    return null;
                } catch (Exception e9) {
                    u.r(e9, "purchaseHistory", new io.sentry.e("toJson"));
                    return null;
                }
        }
        return null;
    }
}
