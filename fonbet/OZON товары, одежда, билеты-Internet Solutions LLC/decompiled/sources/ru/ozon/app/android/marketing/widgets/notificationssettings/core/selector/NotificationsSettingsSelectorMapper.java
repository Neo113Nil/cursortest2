package ru.ozon.app.android.marketing.widgets.notificationssettings.core.selector;

import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
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
import ru.ozon.app.android.marketing.widgets.notificationssettings.data.NotificationsSettingsDTO;
import ru.ozon.app.android.marketing.widgets.notificationssettings.data.NotificationsSettingsSelectorDTO;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector.NotificationsSettingsSelectorVO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/core/selector/NotificationsSettingsSelectorMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsSelectorDTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsSelectorDTO;Ll20/d;)Ljava/util/List;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationsSettingsSelectorMapper implements Function2<NotificationsSettingsSelectorDTO, d, List<? extends NotificationsSettingsSelectorVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<NotificationsSettingsSelectorVO> invoke(@NotNull NotificationsSettingsSelectorDTO dto, @NotNull d widgetInfo) {
        Iterator it;
        t tVar;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<NotificationsSettingsSelectorDTO.Schedule> schedule = dto.getSchedule();
        int i11 = 10;
        ArrayList arrayList = new ArrayList(C7714v.z(schedule, 10));
        Iterator it2 = schedule.iterator();
        int i12 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            NotificationsSettingsSelectorDTO.Schedule schedule2 = (NotificationsSettingsSelectorDTO.Schedule) next;
            long hashCode = (i12 + "_" + widgetInfo.d()).hashCode();
            String title = schedule2.getTitle();
            String type = schedule2.getType();
            long settingId = schedule2.getSettingId();
            long commId = schedule2.getCommId();
            NotificationsSettingsDTO.NotificationSource.Dialog dialog = schedule2.getDialog();
            List<NotificationsSettingsSelectorDTO.Schedule.Variant> variants = schedule2.getVariants();
            ArrayList arrayList2 = new ArrayList(C7714v.z(variants, i11));
            for (NotificationsSettingsSelectorDTO.Schedule.Variant variant : variants) {
                String title2 = variant.getTitle();
                String subtitle = variant.getSubtitle();
                boolean isSelected = variant.isSelected();
                long parseLong = Long.parseLong(variant.getValue());
                Map<String, TokenizedTrackingInfo> trackingInfo = variant.getTrackingInfo();
                if (trackingInfo != null) {
                    it = it2;
                    tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
                } else {
                    it = it2;
                    tVar = null;
                }
                arrayList2.add(new NotificationsSettingsSelectorVO.Variant(title2, subtitle, isSelected, parseLong, tVar));
                it2 = it;
            }
            arrayList.add(new NotificationsSettingsSelectorVO(hashCode, title, type, settingId, commId, dialog, arrayList2));
            i12 = i13;
            i11 = 10;
        }
        return arrayList;
    }
}
