package ru.ozon.app.android.marketing.widgets.notificationssettings.core.cell;

import WZ.t;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.deprecated.Cell;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.marketing.widgets.notificationssettings.data.NotificationsSettingsDTO;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.cell.NotificationsSettingsCellVO;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u0003j\u0002`\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/core/cell/NotificationsSettingsCellMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/cell/NotificationsSettingsCellVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationsSettingsCellMapper implements Function2<NotificationsSettingsDTO, d, List<? extends NotificationsSettingsCellVO>> {

    @NotNull
    private final Context context;

    public NotificationsSettingsCellMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d0  */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<NotificationsSettingsCellVO> invoke(@NotNull NotificationsSettingsDTO dto, @NotNull d widgetInfo) {
        AtomDTO cell;
        NotificationsSettingsDTO.NotificationSource.TrackingInfo trackingInfo;
        NotificationsSettingsCellVO.TrackingInfo trackingInfo2;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<NotificationsSettingsDTO.NotificationSource> sources = dto.getSources();
        ArrayList arrayList = new ArrayList(C7714v.z(sources, 10));
        for (NotificationsSettingsDTO.NotificationSource notificationSource : sources) {
            AtomDTO cell2 = notificationSource.getCell();
            Cell cell3 = cell2 instanceof Cell ? (Cell) cell2 : null;
            OzonSpannableString title = cell3 != null ? cell3.getTitle() : null;
            long hashCode = (((Object) title) + "." + widgetInfo.d()).hashCode();
            NotificationsSettingsDTO.NotificationSource.SettingInfo settingInfo = notificationSource.getSettingInfo();
            NotificationsSettingsDTO.NotificationSource.Dialog dialog = notificationSource.getDialog();
            if ((notificationSource.getCell() instanceof Cell.CellToggle) && AppTypeResolver.INSTANCE.isSelect(this.context)) {
                cell = Cell.CellToggle.copy$default((Cell.CellToggle) notificationSource.getCell(), null, null, null, false, true, null, null, null, null, 495, null);
                AtomDTO atomDTO = cell;
                trackingInfo = notificationSource.getTrackingInfo();
                if (trackingInfo == null) {
                    Map<String, TokenizedTrackingInfo> selected = trackingInfo.getSelected();
                    t tokenizedEvent$default = selected != null ? TrackingInfoMapperKt.toTokenizedEvent$default(selected, Long.valueOf(hashCode), null, 2, null) : null;
                    Map<String, TokenizedTrackingInfo> unselected = trackingInfo.getUnselected();
                    trackingInfo2 = new NotificationsSettingsCellVO.TrackingInfo(tokenizedEvent$default, unselected != null ? TrackingInfoMapperKt.toTokenizedEvent$default(unselected, Long.valueOf(hashCode), null, 2, null) : null);
                } else {
                    trackingInfo2 = null;
                }
                arrayList.add(new NotificationsSettingsCellVO(hashCode, settingInfo, dialog, atomDTO, trackingInfo2));
            }
            cell = notificationSource.getCell();
            AtomDTO atomDTO2 = cell;
            trackingInfo = notificationSource.getTrackingInfo();
            if (trackingInfo == null) {
            }
            arrayList.add(new NotificationsSettingsCellVO(hashCode, settingInfo, dialog, atomDTO2, trackingInfo2));
        }
        return arrayList;
    }
}
