package ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.data;

import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.data.LandingNavBarDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.presentation.LandingNavBarVI;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/data/LandingNavBarMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/data/LandingNavBarDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/LandingNavBarVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/data/LandingNavBarDTO$WidgetBackground;", "Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/LandingNavBarVI$WidgetBackground;", "toVO", "(Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/data/LandingNavBarDTO$WidgetBackground;)Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/presentation/LandingNavBarVI$WidgetBackground;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/landingNavBar/v1/data/LandingNavBarDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LandingNavBarMapper implements Function2<LandingNavBarDTO, d, List<? extends LandingNavBarVI>> {

    @NotNull
    private final Context context;

    public LandingNavBarMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final LandingNavBarVI.WidgetBackground toVO(LandingNavBarDTO.WidgetBackground widgetBackground) {
        return new LandingNavBarVI.WidgetBackground(widgetBackground.getImage(), widgetBackground.getColor(), widgetBackground.getGradient());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<LandingNavBarVI> invoke(@NotNull LandingNavBarDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        LandingNavBarVI.WidgetBackground vo = toVO(state.getBackground());
        TravelWidgetSettingsDTO topHeaderSettings = state.getTopHeaderSettings();
        TravelWidgetSettingsVO vo2 = topHeaderSettings != null ? MapperExtKt.toVO(topHeaderSettings, this.context) : null;
        TravelWidgetSettingsDTO bottomIslandSettings = state.getBottomIslandSettings();
        TravelWidgetSettingsVO vo3 = bottomIslandSettings != null ? MapperExtKt.toVO(bottomIslandSettings, this.context) : null;
        CornerRadius bottomRadius = state.getBottomRadius();
        Float valueOf = bottomRadius != null ? Float.valueOf(ResourceExtKt.toPxF(bottomRadius.getPx(), this.context)) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new LandingNavBarVI(hashCode, vo, vo2, vo3, valueOf, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
