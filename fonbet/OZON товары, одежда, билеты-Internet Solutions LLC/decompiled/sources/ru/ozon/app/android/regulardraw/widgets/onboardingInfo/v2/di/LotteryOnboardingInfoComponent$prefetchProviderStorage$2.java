package ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.di;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.presentation.LotteryOnboardingInfoVI;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI$OnboardingStep;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class LotteryOnboardingInfoComponent$prefetchProviderStorage$2 extends AbstractC7737t implements Function0<ImagePrefetchInfoProviderStorage<LotteryOnboardingInfoVI.OnboardingStep>> {
    public static final LotteryOnboardingInfoComponent$prefetchProviderStorage$2 INSTANCE = new LotteryOnboardingInfoComponent$prefetchProviderStorage$2();

    LotteryOnboardingInfoComponent$prefetchProviderStorage$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ImagePrefetchInfoProviderStorage<LotteryOnboardingInfoVI.OnboardingStep> invoke() {
        ImagePrefetchInfoProviderStorage<LotteryOnboardingInfoVI.OnboardingStep> imagePrefetchInfoProviderStorage = new ImagePrefetchInfoProviderStorage<>();
        imagePrefetchInfoProviderStorage.addProvider(N.b(LotteryOnboardingInfoVI.OnboardingStep.class), new ImagePrefetchInfoProvider<LotteryOnboardingInfoVI.OnboardingStep>() { // from class: ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.di.LotteryOnboardingInfoComponent$prefetchProviderStorage$2$1$1
            @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
            public ImageSize getSize(LotteryOnboardingInfoVI.OnboardingStep item, Context context) {
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(context, "context");
                Pair<Integer, Integer> displaySizePx = ResourceExtKt.getDisplaySizePx(context);
                return new ImageSize(displaySizePx.a().intValue(), displaySizePx.b().intValue());
            }

            @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
            public String getUrl(LotteryOnboardingInfoVI.OnboardingStep item) {
                Intrinsics.checkNotNullParameter(item, "item");
                return item.getImageUrl();
            }
        });
        return imagePrefetchInfoProviderStorage;
    }
}
