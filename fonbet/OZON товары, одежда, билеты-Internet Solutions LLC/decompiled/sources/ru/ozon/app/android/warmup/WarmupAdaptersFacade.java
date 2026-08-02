package ru.ozon.app.android.warmup;

import B0.C2454a;
import Ib.a;
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

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003*\b\u0012\u0004\u0012\u00020\n0\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/warmup/WarmupAdaptersFacade;", "", "LIb/a;", "", "Lru/ozon/app/android/warmup/WarmupInfoProvider;", "providers", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(LIb/a;Lru/ozon/app/android/network/abtool/FeatureService;)V", "Lru/ozon/app/android/network/abtool/flag/FeatureFlag;", "", "getWidgetIdsToWarmUp", "(Ljava/util/Set;)Ljava/util/Set;", "warmupConfigurationFlags", "", "Lru/ozon/app/android/warmup/WarmupInfo;", "getWarmupInfos", "(Ljava/util/Set;)Ljava/util/List;", "LIb/a;", "Lru/ozon/app/android/network/abtool/FeatureService;", "warmup_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WarmupAdaptersFacade {

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final a<Set<WarmupInfoProvider>> providers;

    public WarmupAdaptersFacade(@NotNull a<Set<WarmupInfoProvider>> providers, @NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.providers = providers;
        this.featureService = featureService;
    }

    private final Set<String> getWidgetIdsToWarmUp(Set<? extends FeatureFlag> set) {
        List m11;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            String stringKey = this.featureService.getStringKey((FeatureFlag) it.next());
            ArrayList arrayList2 = null;
            if (stringKey.length() <= 0) {
                stringKey = null;
            }
            if (stringKey != null && (m11 = h.m(stringKey, new String[]{","}, 0, 6)) != null) {
                List list = m11;
                arrayList2 = new ArrayList(C7714v.z(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C2454a.g((String) it2.next(), arrayList2);
                }
            }
            if (arrayList2 != null) {
                arrayList.add(arrayList2);
            }
        }
        return C7714v.Y0(C7714v.N(arrayList));
    }

    @NotNull
    public final List<WarmupInfo> getWarmupInfos(@NotNull Set<? extends FeatureFlag> warmupConfigurationFlags) {
        Intrinsics.checkNotNullParameter(warmupConfigurationFlags, "warmupConfigurationFlags");
        Set<String> widgetIdsToWarmUp = getWidgetIdsToWarmUp(warmupConfigurationFlags);
        if (widgetIdsToWarmUp.isEmpty()) {
            return K.f71697a;
        }
        Set<WarmupInfoProvider> set = this.providers.get();
        Intrinsics.checkNotNullExpressionValue(set, "get(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            WarmupInfoProvider warmupInfoProvider = (WarmupInfoProvider) obj;
            Set<String> set2 = widgetIdsToWarmUp;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator<T> it = set2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (h.D((String) it.next(), warmupInfoProvider.getWidgetId(), true)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((WarmupInfoProvider) it2.next()).provide());
        }
        return arrayList2;
    }
}
