package ru.ozon.app.android.composer.view.layoutManager.prefetch.data;

import Sc.InterfaceC4008j;
import Sc.k;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.layoutManager.prefetch.PrefetchCategory;
import ru.ozon.app.android.composer.view.layoutManager.prefetch.flags.PrefetchDepthByPageTypeFlag;
import ru.ozon.app.android.network.abtool.FeatureService;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R'\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR,\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000f0\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/composer/view/layoutManager/prefetch/data/PageTypePrefetchDepthRepositoryImpl;", "Lru/ozon/app/android/composer/view/layoutManager/prefetch/data/PageTypePrefetchDepthRepository;", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;Lcom/squareup/moshi/Moshi;)V", "", "init", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "pageType", "Lru/ozon/app/android/composer/view/layoutManager/prefetch/PrefetchCategory;", "prefetchCategory", "", "getBottomMultipler", "(Ljava/lang/String;Lru/ozon/app/android/composer/view/layoutManager/prefetch/PrefetchCategory;)Ljava/lang/Float;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lcom/squareup/moshi/Moshi;", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/composer/view/layoutManager/prefetch/data/PageDepthInfoDTO;", "adapter$delegate", "LSc/j;", "getAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "adapter", "Ljava/util/concurrent/ConcurrentHashMap;", "", "pageDepthInfos", "Ljava/util/concurrent/ConcurrentHashMap;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PageTypePrefetchDepthRepositoryImpl implements PageTypePrefetchDepthRepository {

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j adapter;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final Moshi moshi;

    @NotNull
    private final ConcurrentHashMap<String, Map<PrefetchCategory, Float>> pageDepthInfos;

    public PageTypePrefetchDepthRepositoryImpl(@NotNull FeatureService featureService, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.featureService = featureService;
        this.moshi = moshi;
        this.adapter = k.b(new PageTypePrefetchDepthRepositoryImpl$adapter$2(this));
        this.pageDepthInfos = new ConcurrentHashMap<>();
    }

    private final JsonAdapter<List<PageDepthInfoDTO>> getAdapter() {
        return (JsonAdapter) this.adapter.getValue();
    }

    @Override // ru.ozon.app.android.composer.view.layoutManager.prefetch.data.PageTypePrefetchDepthRepository
    public Float getBottomMultipler(@NotNull String pageType, @NotNull PrefetchCategory prefetchCategory) {
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        Intrinsics.checkNotNullParameter(prefetchCategory, "prefetchCategory");
        Map<PrefetchCategory, Float> map = this.pageDepthInfos.get(pageType);
        if (map != null) {
            return map.get(prefetchCategory);
        }
        return null;
    }

    @Override // ru.ozon.app.android.composer.view.layoutManager.prefetch.data.PageTypePrefetchDepthRepository
    public Object init(@NotNull d<? super Unit> dVar) {
        List<PageDepthInfoDTO> list;
        this.pageDepthInfos.clear();
        String stringKey = this.featureService.getStringKey(PrefetchDepthByPageTypeFlag.INSTANCE);
        if (stringKey.length() <= 0) {
            stringKey = null;
        }
        if (stringKey == null || (list = getAdapter().fromJson(stringKey)) == null) {
            list = K.f71697a;
        }
        for (PageDepthInfoDTO pageDepthInfoDTO : list) {
            this.pageDepthInfos.put(pageDepthInfoDTO.getPageType(), U.j(new Pair(PrefetchCategory.LOW, new Float(pageDepthInfoDTO.getLow())), new Pair(PrefetchCategory.NORMAL, new Float(pageDepthInfoDTO.getNormal())), new Pair(PrefetchCategory.HIGH, new Float(pageDepthInfoDTO.getHigh()))));
        }
        return Unit.f71690a;
    }
}
