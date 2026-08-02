package ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.imageprefetch.PrefetchUtilsKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.presentation.MiniAppTitleVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.presentation.OnboardingType;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0003j\u0002`\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/data/MiniAppTitleMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/data/MiniAppTitleDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/presentation/MiniAppTitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconImagePrefetcher", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;)V", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "topSubscriptionOnboarding", "", "isTopBadgeNotNull", "Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/presentation/MiniAppTitleVO$OnbordingItem;", "mapOnboarding", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Z)Ljava/util/List;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/main/widgets/miniAppTitle/data/MiniAppTitleDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MiniAppTitleMapper implements Function2<MiniAppTitleDTO, d, List<? extends MiniAppTitleVO>> {

    @NotNull
    private final Context context;

    @NotNull
    private final ImagePrefetcher<IconDTO> iconImagePrefetcher;

    public MiniAppTitleMapper(@NotNull Context context, @NotNull ImagePrefetcher<IconDTO> iconImagePrefetcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(iconImagePrefetcher, "iconImagePrefetcher");
        this.context = context;
        this.iconImagePrefetcher = iconImagePrefetcher;
    }

    private final List<MiniAppTitleVO.OnbordingItem> mapOnboarding(OnBoardingDTO onboarding, OnBoardingDTO topSubscriptionOnboarding, boolean isTopBadgeNotNull) {
        ArrayList arrayList = new ArrayList();
        if (onboarding != null) {
            arrayList.add(new MiniAppTitleVO.OnbordingItem(onboarding, OnboardingType.Miles.INSTANCE));
        }
        if (topSubscriptionOnboarding != null && isTopBadgeNotNull) {
            arrayList.add(new MiniAppTitleVO.OnbordingItem(topSubscriptionOnboarding, OnboardingType.Top.INSTANCE));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<MiniAppTitleVO> invoke(@NotNull MiniAppTitleDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        MiniAppTitleVO miniAppTitleVO = new MiniAppTitleVO(widgetInfo.d().hashCode(), state.getIcon(), state.getTitle(), state.getMilesBadge(), state.getTopSubscriptionBadge(), mapOnboarding(state.getOnboarding(), state.getTopSubscriptionOnboarding(), state.getTopSubscriptionBadge() != null));
        PrefetchUtilsKt.prefetchImage(this.context, state.getIcon(), this.iconImagePrefetcher);
        return C7714v.a0(miniAppTitleVO);
    }
}
