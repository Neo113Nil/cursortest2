package ru.ozon.app.android.authCustomActionHandlers.email;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.eventBus.EmailActualizedEventBus;
import ru.ozon.app.android.action.v2.ActionV2Repository;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/authCustomActionHandlers/email/ConfirmEmailCustomActionHandler;", "Lru/ozon/app/android/authCustomActionHandlers/email/EmailActionHandler;", "actionV2Repository", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "emailActualizedEventBus", "Lru/ozon/app/android/account/eventBus/EmailActualizedEventBus;", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/account/eventBus/EmailActualizedEventBus;)V", "actionId", "", "getActionId", "()Ljava/lang/String;", "custom-action-handler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConfirmEmailCustomActionHandler extends EmailActionHandler {

    @NotNull
    private final String actionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmEmailCustomActionHandler(@NotNull ActionV2Repository actionV2Repository, @NotNull EmailActualizedEventBus emailActualizedEventBus) {
        super(actionV2Repository, emailActualizedEventBus);
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(emailActualizedEventBus, "emailActualizedEventBus");
        this.actionId = "confirmEmail";
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }
}
