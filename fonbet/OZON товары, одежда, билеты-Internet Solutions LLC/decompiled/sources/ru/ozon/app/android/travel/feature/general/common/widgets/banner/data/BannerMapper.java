package ru.ozon.app.android.travel.feature.general.common.widgets.banner.data;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.imageprefetch.PrefetchUtilsKt;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.general.common.widgets.banner.presentation.BannerVO;
import ru.ozon.app.android.travel.molecules.dto.banner.BannerDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B+\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u0003j\u0002`\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/banner/data/BannerMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/molecules/dto/banner/BannerDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/banner/presentation/BannerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/app/android/travel/molecules/view/banner/BannerVO;", "leftImagePrefetcher", "rightImagePrefetcher", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;)V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/molecules/dto/banner/BannerDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BannerMapper implements Function2<BannerDTO, d, List<? extends BannerVO>> {

    @NotNull
    private final Context context;

    @NotNull
    private final ImagePrefetcher<ru.ozon.app.android.travel.molecules.view.banner.BannerVO> leftImagePrefetcher;

    @NotNull
    private final ImagePrefetcher<ru.ozon.app.android.travel.molecules.view.banner.BannerVO> rightImagePrefetcher;

    public BannerMapper(@NotNull Context context, @NotNull ImagePrefetcher<ru.ozon.app.android.travel.molecules.view.banner.BannerVO> leftImagePrefetcher, @NotNull ImagePrefetcher<ru.ozon.app.android.travel.molecules.view.banner.BannerVO> rightImagePrefetcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(leftImagePrefetcher, "leftImagePrefetcher");
        Intrinsics.checkNotNullParameter(rightImagePrefetcher, "rightImagePrefetcher");
        this.context = context;
        this.leftImagePrefetcher = leftImagePrefetcher;
        this.rightImagePrefetcher = rightImagePrefetcher;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<BannerVO> invoke(@NotNull BannerDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        BannerVO bannerVO = new BannerVO(hashCode, MapperExtKt.toVo(state, this.context, Long.valueOf(hashCode)));
        PrefetchUtilsKt.prefetchImage(this.context, bannerVO.getBanner(), this.leftImagePrefetcher);
        PrefetchUtilsKt.prefetchImage(this.context, bannerVO.getBanner(), this.rightImagePrefetcher);
        return C7714v.a0(bannerVO);
    }
}
