package ru.ozon.app.android.marketing.widgets.notificationssettings.presentation;

import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "Lkotlin/jvm/internal/EnhancedNullability;", "userChanged", "notificationsChanged", "shouldRefresh", "invoke", "(ZZZ)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class NotificationsSettingsConfigurator$onComposerInitialized$refreshSubject$3 extends AbstractC7737t implements InterfaceC6511n<Boolean, Boolean, Boolean, Boolean> {
    public static final NotificationsSettingsConfigurator$onComposerInitialized$refreshSubject$3 INSTANCE = new NotificationsSettingsConfigurator$onComposerInitialized$refreshSubject$3();

    NotificationsSettingsConfigurator$onComposerInitialized$refreshSubject$3() {
        super(3);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, Boolean bool2, Boolean bool3) {
        return invoke(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
    }

    public final Boolean invoke(boolean z11, boolean z12, boolean z13) {
        return Boolean.valueOf(z11 || z12 || z13);
    }
}
