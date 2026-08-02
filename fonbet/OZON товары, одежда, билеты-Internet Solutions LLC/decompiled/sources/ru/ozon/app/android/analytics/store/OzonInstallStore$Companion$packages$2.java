package ru.ozon.app.android.analytics.store;

import Xc.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.store.OzonInstallStore;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lru/ozon/app/android/analytics/store/OzonInstallStore$Known;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OzonInstallStore$Companion$packages$2 extends AbstractC7737t implements Function0<Map<String, ? extends OzonInstallStore.Known>> {
    public static final OzonInstallStore$Companion$packages$2 INSTANCE = new OzonInstallStore$Companion$packages$2();

    OzonInstallStore$Companion$packages$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends OzonInstallStore.Known> invoke() {
        a<OzonInstallStore.Known> entries = OzonInstallStore.Known.getEntries();
        int h11 = U.h(C7714v.z(entries, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (Object obj : entries) {
            linkedHashMap.put(((OzonInstallStore.Known) obj).getPackageName(), obj);
        }
        return linkedHashMap;
    }
}
