package ru.ozon.app.android.update.rustore;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.update.InAppUpdateRepository;
import ru.ozon.app.android.update.InAppUpdateType;
import ru.rustore.sdk.appupdate.model.InstallState;
import sl0.InterfaceC9702a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lsl0/a;", "invoke", "()Lsl0/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class RuStoreInAppUpdateRepository$inAppUpdateListener$2 extends AbstractC7737t implements Function0<InterfaceC9702a> {
    final /* synthetic */ RuStoreInAppUpdateRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RuStoreInAppUpdateRepository$inAppUpdateListener$2(RuStoreInAppUpdateRepository ruStoreInAppUpdateRepository) {
        super(0);
        this.this$0 = ruStoreInAppUpdateRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(RuStoreInAppUpdateRepository ruStoreInAppUpdateRepository, InstallState it) {
        InAppUpdateRepository.InAppUpdateResultListener resultListener;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getInstallStatus() == 1) {
            ruStoreInAppUpdateRepository.unregister();
            resultListener = ruStoreInAppUpdateRepository.getResultListener();
            if (resultListener != null) {
                resultListener.onSuccess(InAppUpdateType.RUSTORE);
            }
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC9702a invoke() {
        final RuStoreInAppUpdateRepository ruStoreInAppUpdateRepository = this.this$0;
        return new InterfaceC9702a() { // from class: ru.ozon.app.android.update.rustore.a
            @Override // sl0.InterfaceC9702a
            public final void a(InstallState installState) {
                RuStoreInAppUpdateRepository$inAppUpdateListener$2.invoke$lambda$0(RuStoreInAppUpdateRepository.this, installState);
            }
        };
    }
}
