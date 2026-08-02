package ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.data;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.presentation.BannerWithActionVO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BannerWithActionMapper implements Function2<BannerWithActionDTO, d, List<? extends BannerWithActionVO>> {

    @NotNull
    private final Context context;

    public BannerWithActionMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<BannerWithActionVO> invoke(@NotNull BannerWithActionDTO state, @NotNull d widgetInfo) {
        BannerWithActionVO vo;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        vo = BannerWithActionMapperKt.toVO(state, this.context, widgetInfo.d().hashCode());
        return C7714v.a0(vo);
    }
}
