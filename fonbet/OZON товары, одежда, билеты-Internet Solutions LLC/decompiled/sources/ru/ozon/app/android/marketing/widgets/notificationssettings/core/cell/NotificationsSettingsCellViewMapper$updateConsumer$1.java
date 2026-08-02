package ru.ozon.app.android.marketing.widgets.notificationssettings.core.cell;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.data.deprecated.Cell;
import ru.ozon.app.android.marketing.widgets.notificationssettings.core.cell.NotificationsSettingsCellViewMapper;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.cell.NotificationsSettingsCellVO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$J$a;", "update", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/cell/NotificationsSettingsCellVO;", "oldVO", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/cell/NotificationsSettingsCellVO;)Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/cell/NotificationsSettingsCellVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class NotificationsSettingsCellViewMapper$updateConsumer$1 extends AbstractC7737t implements Function2<a.J.InterfaceC0007a, NotificationsSettingsCellVO, NotificationsSettingsCellVO> {
    public static final NotificationsSettingsCellViewMapper$updateConsumer$1 INSTANCE = new NotificationsSettingsCellViewMapper$updateConsumer$1();

    NotificationsSettingsCellViewMapper$updateConsumer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final NotificationsSettingsCellVO invoke(a.J.InterfaceC0007a update, NotificationsSettingsCellVO oldVO) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        if (!(update instanceof NotificationsSettingsCellViewMapper.ToggleUpdate) || ((NotificationsSettingsCellViewMapper.ToggleUpdate) update).getId() != oldVO.getId()) {
            return null;
        }
        AtomDTO cell = oldVO.getCell();
        Intrinsics.g(cell, "null cannot be cast to non-null type ru.ozon.app.android.atoms.data.deprecated.Cell.CellToggle");
        return NotificationsSettingsCellVO.copy$default(oldVO, 0L, null, null, Cell.CellToggle.copy$default((Cell.CellToggle) cell, null, null, null, !r3.isSelected(), false, null, null, null, null, 503, null), null, 23, null);
    }
}
