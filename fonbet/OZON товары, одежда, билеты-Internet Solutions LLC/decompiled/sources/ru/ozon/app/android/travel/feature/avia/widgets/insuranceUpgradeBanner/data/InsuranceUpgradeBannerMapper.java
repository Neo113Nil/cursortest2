package ru.ozon.app.android.travel.feature.avia.widgets.insuranceUpgradeBanner.data;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.imageprefetch.PrefetchableImage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceUpgradeBanner.presentation.InsuranceUpgradeBannerComposeVI;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00152*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0015B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insuranceUpgradeBanner/data/InsuranceUpgradeBannerMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceUpgradeBanner/data/InsuranceUpgradeBannerDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceUpgradeBanner/presentation/InsuranceUpgradeBannerComposeVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/app/android/composer/imageprefetch/PrefetchableImage;", "imagePrefetcher", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;)V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/insuranceUpgradeBanner/data/InsuranceUpgradeBannerDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Companion", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InsuranceUpgradeBannerMapper implements Function2<InsuranceUpgradeBannerDTO, d, List<? extends InsuranceUpgradeBannerComposeVI>> {

    @NotNull
    private final Context context;

    @NotNull
    private final ImagePrefetcher<PrefetchableImage> imagePrefetcher;
    public static final int $stable = 8;

    public InsuranceUpgradeBannerMapper(@NotNull Context context, @NotNull ImagePrefetcher<PrefetchableImage> imagePrefetcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imagePrefetcher, "imagePrefetcher");
        this.context = context;
        this.imagePrefetcher = imagePrefetcher;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<InsuranceUpgradeBannerComposeVI> invoke(@NotNull InsuranceUpgradeBannerDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(InsuranceUpgradeBannerMapperKt.asVI(state, this.context, widgetInfo, this.imagePrefetcher));
    }
}
