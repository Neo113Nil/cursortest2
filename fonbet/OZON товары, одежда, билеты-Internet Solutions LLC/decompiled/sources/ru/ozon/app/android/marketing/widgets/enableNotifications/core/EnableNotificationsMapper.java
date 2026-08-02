package ru.ozon.app.android.marketing.widgets.enableNotifications.core;

import WZ.t;
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
import ru.ozon.app.android.marketing.utils.MarketingNotificationHelper;
import ru.ozon.app.android.marketing.widgets.enableNotifications.data.EnableNotificationsDTO;
import ru.ozon.app.android.marketing.widgets.enableNotifications.presentation.EnableNotificationsVO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\r\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0011J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0003j\u0002`\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/marketing/widgets/enableNotifications/core/EnableNotificationsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/data/EnableNotificationsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/marketing/widgets/enableNotifications/data/EnableNotificationsDTO$State;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$State;", "toVO", "(Lru/ozon/app/android/marketing/widgets/enableNotifications/data/EnableNotificationsDTO$State;)Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$State;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/data/EnableNotificationsDTO$CloseButton;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$CloseButton;", "(Lru/ozon/app/android/marketing/widgets/enableNotifications/data/EnableNotificationsDTO$CloseButton;)Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsVO$CloseButton;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/enableNotifications/data/EnableNotificationsDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EnableNotificationsMapper implements Function2<EnableNotificationsDTO, d, List<? extends EnableNotificationsVO>> {

    @NotNull
    private final Context context;

    public EnableNotificationsMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final EnableNotificationsVO.State toVO(EnableNotificationsDTO.State state) {
        TextDTO dsTextAtom = TextMapperKt.getDsTextAtom(state.getTitle());
        TextAtom subtitle = state.getSubtitle();
        return new EnableNotificationsVO.State(dsTextAtom, subtitle != null ? TextMapperKt.getDsTextAtom(subtitle) : null, state.getButton(), state.getSuccessState(), state.getErrorMessage());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<EnableNotificationsVO> invoke(@NotNull EnableNotificationsDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        EnableNotificationsVO.State vo = toVO(dto.getSystemSettingsState());
        EnableNotificationsDTO.State apiSettingsState = dto.getApiSettingsState();
        EnableNotificationsVO.State vo2 = apiSettingsState != null ? toVO(apiSettingsState) : null;
        EnableNotificationsDTO.CloseButton closeButton = dto.getCloseButton();
        EnableNotificationsVO.CloseButton vo3 = closeButton != null ? toVO(closeButton) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> unsetTrackingInfo = dto.getUnsetTrackingInfo();
        t tokenizedEvent$default2 = unsetTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(unsetTrackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> setTrackingInfo = dto.getSetTrackingInfo();
        return C7714v.a0(new EnableNotificationsVO(hashCode, vo, vo2, vo3, tokenizedEvent$default, setTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(setTrackingInfo, Long.valueOf(hashCode), null, 2, null) : null, tokenizedEvent$default2, MarketingNotificationHelper.INSTANCE.isSystemNotificationsTurnedOn(this.context) ? new EnableNotificationsVO.StateToShow.ApiState(false) : EnableNotificationsVO.StateToShow.SystemState.INSTANCE));
    }

    private final EnableNotificationsVO.CloseButton toVO(EnableNotificationsDTO.CloseButton closeButton) {
        return new EnableNotificationsVO.CloseButton(closeButton.getIcon(), AtomActionMapperKt.toAtomAction(closeButton.getAction(), closeButton.getTrackingInfo()), closeButton.getTrackingInfo());
    }
}
