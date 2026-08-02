package ru.ozon.app.android.marketing.widgets.notificationssettings.core.selector;

import A00.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.marketing.widgets.notificationssettings.core.selector.NotificationsSettingsSelectorViewMapper;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector.NotificationsSettingsSelectorVO;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA00/a$J$a;", "update", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO;", "oldVO", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO;)Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class NotificationsSettingsSelectorViewMapper$updateConsumer$1 extends AbstractC7737t implements Function2<a.J.InterfaceC0007a, NotificationsSettingsSelectorVO, NotificationsSettingsSelectorVO> {
    public static final NotificationsSettingsSelectorViewMapper$updateConsumer$1 INSTANCE = new NotificationsSettingsSelectorViewMapper$updateConsumer$1();

    NotificationsSettingsSelectorViewMapper$updateConsumer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final NotificationsSettingsSelectorVO invoke(a.J.InterfaceC0007a update, NotificationsSettingsSelectorVO oldVO) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        if (!(update instanceof NotificationsSettingsSelectorViewMapper.SelectorItemUpdate)) {
            return null;
        }
        NotificationsSettingsSelectorViewMapper.SelectorItemUpdate selectorItemUpdate = (NotificationsSettingsSelectorViewMapper.SelectorItemUpdate) update;
        if (selectorItemUpdate.getId() != oldVO.getId()) {
            return null;
        }
        List<NotificationsSettingsSelectorVO.Variant> variants = oldVO.getVariants();
        ArrayList arrayList = new ArrayList(C7714v.z(variants, 10));
        for (NotificationsSettingsSelectorVO.Variant variant : variants) {
            arrayList.add(NotificationsSettingsSelectorVO.Variant.copy$default(variant, null, null, variant.getValue() == selectorItemUpdate.getValue(), 0L, null, 27, null));
        }
        return NotificationsSettingsSelectorVO.copy$default(oldVO, 0L, null, null, 0L, 0L, null, arrayList, 63, null);
    }
}
