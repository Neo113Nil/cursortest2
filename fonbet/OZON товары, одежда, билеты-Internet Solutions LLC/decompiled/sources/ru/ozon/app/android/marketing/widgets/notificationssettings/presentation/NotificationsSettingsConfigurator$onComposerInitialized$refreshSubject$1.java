package ru.ozon.app.android.marketing.widgets.notificationssettings.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storage.user.model.User;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class NotificationsSettingsConfigurator$onComposerInitialized$refreshSubject$1 extends C7735q implements Function1<User, Boolean> {
    NotificationsSettingsConfigurator$onComposerInitialized$refreshSubject$1(Object obj) {
        super(1, obj, NotificationsSettingsConfigurator.class, "processUserChange", "processUserChange(Lru/ozon/app/android/storage/user/model/User;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(User p02) {
        boolean processUserChange;
        Intrinsics.checkNotNullParameter(p02, "p0");
        processUserChange = ((NotificationsSettingsConfigurator) this.receiver).processUserChange(p02);
        return Boolean.valueOf(processUserChange);
    }
}
