package eb;

import android.database.sqlite.SQLiteConstraintException;
import androidx.appcompat.widget.c1;
import com.sports.insider.MyApp;
import eg.c0;
import eg.m0;
import f3.x;
import ic.e0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final e f8830a;

    public m(e billingDao) {
        Intrinsics.checkNotNullParameter(billingDao, "billingDao");
        this.f8830a = billingDao;
    }

    public static final void c(m mVar, int i5, nc.f fVar) {
        e eVar = mVar.f8830a;
        String type = fVar.getType();
        if (type == null) {
            type = "standard";
        }
        String type2 = type;
        String currentPrice = fVar.getCurrentPrice();
        String standardPrice = fVar.getStandardPrice();
        Intrinsics.checkNotNull(standardPrice);
        String currentPlanId = fVar.getCurrentPlanId();
        String standardPlanId = fVar.getStandardPlanId();
        String currentOfferId = fVar.getCurrentOfferId();
        String standardOfferId = fVar.getStandardOfferId();
        String endTime = fVar.getEndTime();
        eVar.getClass();
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(standardPrice, "standardPrice");
        ((Number) x.n0(eVar.f8809a, false, true, new a(i5, type2, currentPrice, standardPrice, currentPlanId, standardPlanId, currentOfferId, standardOfferId, endTime))).longValue();
    }

    public static final void d(m mVar, int i5, nc.f fVar) {
        e eVar = mVar.f8830a;
        String type = fVar.getType();
        if (type == null) {
            type = "standard";
        }
        String type2 = type;
        String currentPrice = fVar.getCurrentPrice();
        String standardPrice = fVar.getStandardPrice();
        Intrinsics.checkNotNull(standardPrice);
        String currentPlanId = fVar.getCurrentPlanId();
        String standardPlanId = fVar.getStandardPlanId();
        String currentOfferId = fVar.getCurrentOfferId();
        String standardOfferId = fVar.getStandardOfferId();
        String endTime = fVar.getEndTime();
        eVar.getClass();
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(standardPrice, "standardPrice");
        ((Number) x.n0(eVar.f8809a, false, true, new a(type2, currentPrice, standardPrice, currentPlanId, standardPlanId, currentOfferId, standardOfferId, endTime, i5))).intValue();
    }

    public final Unit a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ic.a aVar = (ic.a) it.next();
            if (aVar != null) {
                String sku = aVar.f11062i;
                e eVar = this.f8830a;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(sku, "sku");
                if (((Number) x.n0(eVar.f8809a, true, false, new a2.k(sku, 4))).intValue() > 0) {
                    eVar.c(sku, aVar.a());
                } else {
                    eVar.a(sku, aVar.a());
                }
            }
        }
        return Unit.f19194a;
    }

    public final void b(int i5, nc.f fVar) {
        Integer num = (Integer) x.n0(this.f8830a.f8809a, true, false, new b(i5, 1));
        if (num != null && num.intValue() == i5) {
            d(this, i5, fVar);
            return;
        }
        try {
            c(this, i5, fVar);
        } catch (SQLiteConstraintException ex) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            jg.d dVar = MyApp.f6830c;
            lg.e eVar = m0.f9201a;
            c0.t(dVar, lg.d.f20063c, null, new q4.r(ex, null, 18), 2);
            d(this, i5, fVar);
        }
    }

    public final Unit e(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ic.o oVar = (ic.o) it.next();
            if (oVar != null) {
                e0 e0Var = (e0) oVar;
                String str = e0Var.f11108b;
                String e0Var2 = e0Var.toString();
                String sku = c1.m("ProductDetails", str);
                e eVar = this.f8830a;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(sku, "sku");
                if (((Number) x.n0(eVar.f8809a, true, false, new a2.k(sku, 4))).intValue() > 0) {
                    eVar.c("ProductDetails" + str, e0Var2);
                } else {
                    eVar.a("ProductDetails" + str, e0Var2);
                }
            }
        }
        return Unit.f19194a;
    }

    public final void f(int i5, int i10, String id2) {
        e eVar = this.f8830a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(id2, "id");
        if (Intrinsics.areEqual((String) x.n0(eVar.f8809a, true, false, new a2.k(id2, 5)), id2)) {
            eVar.getClass();
            Intrinsics.checkNotNullParameter(id2, "id");
            ((Number) x.n0(eVar.f8809a, false, true, new d(id2, i5, i10, 0))).intValue();
            return;
        }
        try {
            eVar.getClass();
            Intrinsics.checkNotNullParameter(id2, "id");
            ((Number) x.n0(eVar.f8809a, false, true, new d(id2, i5, i10))).longValue();
        } catch (SQLiteConstraintException unused) {
            eVar.getClass();
            Intrinsics.checkNotNullParameter(id2, "id");
            ((Number) x.n0(eVar.f8809a, false, true, new d(id2, i5, i10, 0))).intValue();
        }
    }

    public final void g(String... id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Iterator it = kotlin.collections.p.q(id2).iterator();
        while (it.hasNext()) {
            f(4, 2, (String) it.next());
        }
    }
}
