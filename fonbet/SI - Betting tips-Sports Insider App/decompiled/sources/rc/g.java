package rc;

import com.sports.insider.MyApp;
import eg.c0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import la.d0;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends b0 {
    public static final Object f(g gVar, String str, String str2, mf.i iVar) {
        Object e7 = gVar.e("onBackPressed", new JSONObject().put(str, str2), iVar);
        return e7 == lf.a.f20034a ? e7 : Unit.f19194a;
    }

    public static final Object g(g gVar, String str, mf.i iVar) {
        Object e7 = gVar.e("onView", new JSONObject().put(str, 123).put("google", "1.2.44.123"), iVar);
        return e7 == lf.a.f20034a ? e7 : Unit.f19194a;
    }

    public final void h(int i5, String purchaseToken, String sku, String str, long j, String priceCurrencyCode) {
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        c0.t(MyApp.f6830c, b0.b(), null, new d0(this, i5, purchaseToken, sku, str, j, priceCurrencyCode, (Continuation) null), 2);
    }
}
