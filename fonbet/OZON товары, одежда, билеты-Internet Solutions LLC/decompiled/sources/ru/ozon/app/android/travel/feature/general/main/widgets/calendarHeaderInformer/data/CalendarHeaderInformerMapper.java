package ru.ozon.app.android.travel.feature.general.main.widgets.calendarHeaderInformer.data;

import WZ.x;
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
import ru.ozon.app.android.travel.feature.general.main.widgets.calendarHeaderInformer.presentation.CalendarHeaderInformerVI;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsVO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendarHeaderInformer/data/CalendarHeaderInformerMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendarHeaderInformer/data/CalendarHeaderInformerDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendarHeaderInformer/presentation/CalendarHeaderInformerVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "getDefaultSettings", "()Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/main/widgets/calendarHeaderInformer/data/CalendarHeaderInformerDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalendarHeaderInformerMapper implements Function2<CalendarHeaderInformerDTO, d, List<? extends CalendarHeaderInformerVI>> {

    @NotNull
    private final Context context;

    public CalendarHeaderInformerMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final TravelWidgetSettingsVO getDefaultSettings() {
        return new TravelWidgetSettingsVO(null, new TravelWidgetSettingsVO.CornersVO(0.0f, 0.0f), new TravelWidgetSettingsVO.PaddingsVO(0, 0, 0, 0));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CalendarHeaderInformerVI> invoke(@NotNull CalendarHeaderInformerDTO state, @NotNull d widgetInfo) {
        TravelWidgetSettingsVO defaultSettings;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO text = state.getText();
        BadgeDTO badge = state.getBadge();
        DisclaimerDTO disclaimer = state.getDisclaimer();
        TravelWidgetSettingsDTO settings = state.getSettings();
        if (settings == null || (defaultSettings = MapperExtKt.toVO(settings, this.context)) == null) {
            defaultSettings = getDefaultSettings();
        }
        TravelWidgetSettingsVO travelWidgetSettingsVO = defaultSettings;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new CalendarHeaderInformerVI(hashCode, text, badge, disclaimer, travelWidgetSettingsVO, trackingInfo != null ? x.d(trackingInfo, widgetInfo) : null));
    }
}
