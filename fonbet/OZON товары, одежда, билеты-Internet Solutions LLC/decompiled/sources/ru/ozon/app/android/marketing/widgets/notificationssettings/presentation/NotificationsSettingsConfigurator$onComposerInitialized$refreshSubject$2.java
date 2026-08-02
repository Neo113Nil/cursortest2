package ru.ozon.app.android.marketing.widgets.notificationssettings.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class NotificationsSettingsConfigurator$onComposerInitialized$refreshSubject$2 extends C7735q implements Function1<Boolean, Boolean> {
    NotificationsSettingsConfigurator$onComposerInitialized$refreshSubject$2(Object obj) {
        super(1, obj, NotificationsSettingsConfigurator.class, "processNotificationsChange", "processNotificationsChange(Z)Z", 0);
    }

    public final Boolean invoke(boolean z11) {
        boolean processNotificationsChange;
        processNotificationsChange = ((NotificationsSettingsConfigurator) this.receiver).processNotificationsChange(z11);
        return Boolean.valueOf(processNotificationsChange);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
        return invoke(bool.booleanValue());
    }
}
