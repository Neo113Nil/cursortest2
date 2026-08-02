package ru.ozon.app.android.precreation;

import B0.C2454a;
import Ib.a;
import android.content.Context;
import gk0.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/precreation/PreCreateWidgetsFacade;", "", "LIb/a;", "", "Lru/ozon/app/android/precreation/PreCreateInfoProvider;", "providers", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(LIb/a;Lru/ozon/app/android/network/abtool/FeatureService;)V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/network/abtool/flag/FeatureFlag;", "feature", "", "Lgk0/n;", "getPreCreateInfos", "(Landroid/content/Context;Lru/ozon/app/android/network/abtool/flag/FeatureFlag;)Ljava/util/List;", "LIb/a;", "Lru/ozon/app/android/network/abtool/FeatureService;", "precreation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreCreateWidgetsFacade {

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final a<Set<PreCreateInfoProvider>> providers;

    public PreCreateWidgetsFacade(@NotNull a<Set<PreCreateInfoProvider>> providers, @NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.providers = providers;
        this.featureService = featureService;
    }

    @NotNull
    public final List<n> getPreCreateInfos(@NotNull Context context, @NotNull FeatureFlag feature) {
        List m11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(feature, "feature");
        String stringKey = this.featureService.getStringKey(feature);
        Set set = null;
        if (stringKey.length() <= 0) {
            stringKey = null;
        }
        if (stringKey != null && (m11 = h.m(stringKey, new String[]{","}, 0, 6)) != null) {
            List list = m11;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2454a.g((String) it.next(), arrayList);
            }
            set = C7714v.Y0(arrayList);
        }
        Set set2 = set;
        if (set2 == null || set2.isEmpty()) {
            return K.f71697a;
        }
        Set<PreCreateInfoProvider> set3 = this.providers.get();
        Intrinsics.checkNotNullExpressionValue(set3, "get(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : set3) {
            PreCreateInfoProvider preCreateInfoProvider = (PreCreateInfoProvider) obj;
            Set set4 = set;
            if (!(set4 instanceof Collection) || !set4.isEmpty()) {
                Iterator it2 = set4.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (h.D((String) it2.next(), preCreateInfoProvider.getWidgetId(), true)) {
                        arrayList2.add(obj);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C7714v.p(((PreCreateInfoProvider) it3.next()).provide(context), arrayList3);
        }
        return arrayList3;
    }
}
