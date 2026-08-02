package ru.ozon.app.android.marketing.widgets.notificationssettings.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.marketing.widgets.notificationssettings.core.cell.NotificationsSettingsCellMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/marketing/widgets/notificationssettings/core/cell/NotificationsSettingsCellMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class NotificationSettingsComponent$Companion$create$1$1$cellMapper$2 extends AbstractC7737t implements Function0<NotificationsSettingsCellMapper> {
    final /* synthetic */ NotificationSettingsComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSettingsComponent$Companion$create$1$1$cellMapper$2(NotificationSettingsComponent$Companion$create$1$1 notificationSettingsComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = notificationSettingsComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NotificationsSettingsCellMapper invoke() {
        ContextComponentDependencies contextComponentDependencies;
        contextComponentDependencies = this.this$0.contextApi;
        return new NotificationsSettingsCellMapper(contextComponentDependencies.getContext());
    }
}
