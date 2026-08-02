package eb;

import com.sports.insider.data.repository.room.billing.PricesTable;
import f3.x;
import k2.w;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final w f8809a;

    public e(w __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.f8809a = __db;
    }

    public final long a(String sku, String jsonString) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        return ((Number) x.n0(this.f8809a, false, true, new c(sku, jsonString, 1))).longValue();
    }

    public final PricesTable b(int i5) {
        return (PricesTable) x.n0(this.f8809a, true, false, new b(i5, 0));
    }

    public final int c(String sku, String jsonString) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        return ((Number) x.n0(this.f8809a, false, true, new c(jsonString, sku, 0))).intValue();
    }
}
