package ru.ozon.app.android.composer.view.layoutManager.prefetch;

import E10.a;
import E10.c;
import android.content.Context;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.layoutManager.prefetch.PrefetchManagerImpl;
import ru.ozon.app.android.composer.view.layoutManager.prefetch.data.PageTypePrefetchDepthRepository;
import ru.ozon.app.android.composer.view.layoutManager.prefetch.data.PerformancePrefetchDepthRepository;
import ru.ozon.app.android.composer.view.layoutManager.prefetch.data.PrefetchCategoryRepository;
import ru.ozon.app.android.composer.view.layoutManager.prefetch.flags.PrefetchTopDepthFlag;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.abtool.OnChangeFeatureListener;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.B0;
import xe.C10727i;
import xe.H0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0001\u0018\u0000 .2\u00020\u0001:\u0001.B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/composer/view/layoutManager/prefetch/PrefetchManagerImpl;", "LE10/c;", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/composer/view/layoutManager/prefetch/data/PrefetchCategoryRepository;", "prefetchCategoryRepository", "Lru/ozon/app/android/composer/view/layoutManager/prefetch/data/PageTypePrefetchDepthRepository;", "pageTypePrefetchDepthRepository", "Lru/ozon/app/android/composer/view/layoutManager/prefetch/data/PerformancePrefetchDepthRepository;", "performancePrefetchDepthRepository", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "Landroid/content/Context;", "context", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/composer/view/layoutManager/prefetch/data/PrefetchCategoryRepository;Lru/ozon/app/android/composer/view/layoutManager/prefetch/data/PageTypePrefetchDepthRepository;Lru/ozon/app/android/composer/view/layoutManager/prefetch/data/PerformancePrefetchDepthRepository;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Landroid/content/Context;)V", "", "initPrefetchDepth", "(Landroid/content/Context;)V", "Lru/ozon/app/android/composer/view/layoutManager/prefetch/PrefetchCategory;", "currentPrefetchCategory", "getPrefetchCategoryOrCreate", "(Lru/ozon/app/android/composer/view/layoutManager/prefetch/PrefetchCategory;)Lru/ozon/app/android/composer/view/layoutManager/prefetch/PrefetchCategory;", "init", "", "pageType", "LE10/a;", "getPrefetchDepth", "(Ljava/lang/String;)LE10/a;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/composer/view/layoutManager/prefetch/data/PrefetchCategoryRepository;", "Lru/ozon/app/android/composer/view/layoutManager/prefetch/data/PageTypePrefetchDepthRepository;", "Lru/ozon/app/android/composer/view/layoutManager/prefetch/data/PerformancePrefetchDepthRepository;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Landroid/content/Context;", "Lxe/M;", "initCoroutineScope", "Lxe/M;", "Lxe/B0;", "initJob", "Lxe/B0;", "", "topPrefetchMultiplier", "F", "prefetchCategory", "Lru/ozon/app/android/composer/view/layoutManager/prefetch/PrefetchCategory;", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PrefetchManagerImpl implements c {

    @NotNull
    private final Context context;

    @NotNull
    private final CoroutineDispatcherProvider dispatcherProvider;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final M initCoroutineScope;
    private B0 initJob;

    @NotNull
    private final PageTypePrefetchDepthRepository pageTypePrefetchDepthRepository;

    @NotNull
    private final PerformancePrefetchDepthRepository performancePrefetchDepthRepository;
    private volatile PrefetchCategory prefetchCategory;

    @NotNull
    private final PrefetchCategoryRepository prefetchCategoryRepository;
    private float topPrefetchMultiplier;
    public static final int $stable = 8;

    public PrefetchManagerImpl(@NotNull FeatureService featureService, @NotNull PrefetchCategoryRepository prefetchCategoryRepository, @NotNull PageTypePrefetchDepthRepository pageTypePrefetchDepthRepository, @NotNull PerformancePrefetchDepthRepository performancePrefetchDepthRepository, @NotNull CoroutineDispatcherProvider dispatcherProvider, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(prefetchCategoryRepository, "prefetchCategoryRepository");
        Intrinsics.checkNotNullParameter(pageTypePrefetchDepthRepository, "pageTypePrefetchDepthRepository");
        Intrinsics.checkNotNullParameter(performancePrefetchDepthRepository, "performancePrefetchDepthRepository");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(context, "context");
        this.featureService = featureService;
        this.prefetchCategoryRepository = prefetchCategoryRepository;
        this.pageTypePrefetchDepthRepository = pageTypePrefetchDepthRepository;
        this.performancePrefetchDepthRepository = performancePrefetchDepthRepository;
        this.dispatcherProvider = dispatcherProvider;
        this.context = context;
        this.initCoroutineScope = N.a(CoroutineContext.Element.a.d(dispatcherProvider.getDefault(), (H0) X0.b()).plus(new PrefetchManagerImpl$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
    }

    private final PrefetchCategory getPrefetchCategoryOrCreate(PrefetchCategory currentPrefetchCategory) {
        if (currentPrefetchCategory != null) {
            return currentPrefetchCategory;
        }
        PrefetchCategory category = this.prefetchCategoryRepository.getCategory(this.context);
        this.prefetchCategory = category;
        return category;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initPrefetchDepth(Context context) {
        this.prefetchCategory = this.prefetchCategoryRepository.getCategory(context);
        this.topPrefetchMultiplier = this.featureService.getFloatKey(PrefetchTopDepthFlag.INSTANCE);
        this.initJob = C10727i.c(this.initCoroutineScope, null, null, new PrefetchManagerImpl$initPrefetchDepth$1(this.initJob, this, null), 3);
    }

    @Override // E10.c
    @NotNull
    public a getPrefetchDepth(String pageType) {
        Float bottomMultipler;
        PrefetchCategory prefetchCategoryOrCreate = getPrefetchCategoryOrCreate(this.prefetchCategory);
        return new a(this.topPrefetchMultiplier, Math.min((pageType == null || (bottomMultipler = this.pageTypePrefetchDepthRepository.getBottomMultipler(pageType, prefetchCategoryOrCreate)) == null) ? this.performancePrefetchDepthRepository.getBottomMultiplier(prefetchCategoryOrCreate) : bottomMultipler.floatValue(), 5.0f));
    }

    @Override // E10.c
    public void init(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        initPrefetchDepth(context);
        this.featureService.addOnChangeFeatureListener(new OnChangeFeatureListener() { // from class: Nr.a
            @Override // ru.ozon.app.android.network.abtool.OnChangeFeatureListener
            public final void onChangeFeature() {
                PrefetchManagerImpl.this.initPrefetchDepth(context);
            }
        });
    }
}
