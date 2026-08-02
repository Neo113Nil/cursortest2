package ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.data;

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
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation.BonusExpirationRemainderVI;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/data/BonusExpirationRemainderMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/data/BonusExpirationRemainderDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/data/BonusExpirationRemainderDTO;Ll20/d;)Ljava/util/List;", "map", "(Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/data/BonusExpirationRemainderDTO;Ll20/d;)Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderVI;", "Landroid/content/Context;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BonusExpirationRemainderMapper implements Function2<BonusExpirationRemainderDTO, d, List<? extends BonusExpirationRemainderVI>> {

    @NotNull
    private final Context context;

    public BonusExpirationRemainderMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @NotNull
    public final BonusExpirationRemainderVI map(@NotNull BonusExpirationRemainderDTO state, @NotNull d widgetInfo) {
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        CommonControlSettings settings = state.getSettings();
        Map<String, TokenizedTrackingInfo> trackingInfo = settings != null ? settings.getTrackingInfo() : null;
        long hashCode = widgetInfo.d().hashCode();
        String key = state.getKey();
        Long keyValue = state.getKeyValue();
        long longValue = keyValue != null ? keyValue.longValue() : Long.MAX_VALUE;
        TravelWidgetSettingsDTO widgetSettings = state.getWidgetSettings();
        return new BonusExpirationRemainderVI(hashCode, key, longValue, widgetSettings != null ? MapperExtKt.toVO(widgetSettings, this.context) : null, state.getCell(), state.getCloseButton(), state.getCloseButton() != null, (settings == null || (action = settings.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, trackingInfo), trackingInfo != null ? x.d(trackingInfo, widgetInfo) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<BonusExpirationRemainderVI> invoke(@NotNull BonusExpirationRemainderDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(map(state, widgetInfo));
    }
}
