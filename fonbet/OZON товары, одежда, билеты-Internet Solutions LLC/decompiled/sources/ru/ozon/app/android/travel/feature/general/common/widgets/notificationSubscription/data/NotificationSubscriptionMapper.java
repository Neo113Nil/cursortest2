package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.data.NotificationSubscriptionDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation.NotificationSubscriptionVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007B\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO$Loaded;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO$Loaded;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSubscriptionMapper implements Function2<NotificationSubscriptionDTO, d, List<? extends NotificationSubscriptionVO>>, AsyncWidgetStateMapper<NotificationSubscriptionDTO, NotificationSubscriptionVO.Loaded> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<NotificationSubscriptionVO> invoke(@NotNull NotificationSubscriptionDTO state, @NotNull d widgetInfo) {
        NotificationSubscriptionVO.State fetch;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        boolean z11 = state.getBehaviorType() == NotificationSubscriptionDTO.AsyncBehaviorType.NO_ACTION;
        boolean z12 = state.getBehaviorType() == NotificationSubscriptionDTO.AsyncBehaviorType.FETCH;
        String a11 = widgetInfo.c().a();
        if (z11 && state.getCell() != null) {
            CheckBoxDTO checkbox = state.getCell().getCheckbox();
            TextDTO text = state.getCell().getTextWrapper().getText();
            CommonControlSettings settings = state.getCell().getTextWrapper().getSettings();
            fetch = new NotificationSubscriptionVO.Loaded(checkbox, TextDTO.copy$default(text, null, null, null, null, null, null, null, null, null, null, null, null, settings != null ? settings.getTrackingInfo() : null, true, null, null, null, null, null, 511999, null), state.getCell().getSettings().toAtomAction(), state.getCell().getSettings().getTrackingInfo());
        } else {
            if (!z12 || a11 == null) {
                return K.f71697a;
            }
            fetch = new NotificationSubscriptionVO.Fetch(a11, state.getAsyncParams());
        }
        return C7714v.a0(new NotificationSubscriptionVO(hashCode, fetch));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    public NotificationSubscriptionVO.Loaded mapAsyncState(@NotNull NotificationSubscriptionDTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        NotificationSubscriptionDTO.Cell cell = state.getCell();
        if (cell == null) {
            return null;
        }
        CheckBoxDTO checkbox = cell.getCheckbox();
        TextDTO text = cell.getTextWrapper().getText();
        CommonControlSettings settings = cell.getTextWrapper().getSettings();
        return new NotificationSubscriptionVO.Loaded(checkbox, TextDTO.copy$default(text, null, null, null, null, null, null, null, null, null, null, null, null, settings != null ? settings.getTrackingInfo() : null, true, null, null, null, null, null, 511999, null), cell.getSettings().toAtomAction(), cell.getSettings().getTrackingInfo());
    }
}
