package ru.ozon.app.android.marketing.widgets.notificationssettings.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector.NotificationsSettingsSelectorRepo;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class NotificationsSettingsConfigurator$onComposerInitialized$2 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ NotificationsSettingsConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationsSettingsConfigurator$onComposerInitialized$2(NotificationsSettingsConfigurator notificationsSettingsConfigurator) {
        super(1);
        this.this$0 = notificationsSettingsConfigurator;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        InterfaceC7851b controller;
        ConfiguratorReferences references = this.this$0.getReferences();
        if (references != null && (controller = references.getController()) != null) {
            InterfaceC7851b.a.a(controller, null, null, null, null, 15);
        }
        if (Intrinsics.d(NotificationsSettingsSelectorRepo.INSTANCE.getRefreshSubject().f(), Boolean.TRUE)) {
            this.this$0.clearRepo();
        }
    }
}
