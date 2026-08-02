package ru.ozon.app.android.cart.configurator;

import B0.C2454a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.text.h;
import ru.ozon.app.android.cart.flags.BackToCartByRedirectRefreshDisabledQueriesList;
import ru.ozon.app.android.network.abtool.FeatureService;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CartConfigurator$refreshDisabledQueriesList$2 extends AbstractC7737t implements Function0<List<? extends String>> {
    final /* synthetic */ FeatureService $featureService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartConfigurator$refreshDisabledQueriesList$2(FeatureService featureService) {
        super(0);
        this.$featureService = featureService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends String> invoke() {
        List m11 = h.m(this.$featureService.getStringKey(BackToCartByRedirectRefreshDisabledQueriesList.INSTANCE), new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(C7714v.z(m11, 10));
        Iterator it = m11.iterator();
        while (it.hasNext()) {
            C2454a.g((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((String) next).length() > 0) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }
}
