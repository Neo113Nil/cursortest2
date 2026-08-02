package ru.ozon.app.android.platform.customActionHandlers.openDeleteListingModal;

import GZ.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.customActionHandlers.openDeeplinkForResult.OpenDeeplinkForResultActionHandler;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0014X\u0094D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/platform/customActionHandlers/openDeleteListingModal/ClassifiedOpenDeleteListingModalActionHandler;", "Lru/ozon/app/android/platform/customActionHandlers/openDeeplinkForResult/OpenDeeplinkForResultActionHandler;", "LGZ/g;", "screenRouter", "<init>", "(LGZ/g;)V", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "", "requestId", "I", "getRequestId", "()I", "custom-action-handler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ClassifiedOpenDeleteListingModalActionHandler extends OpenDeeplinkForResultActionHandler {

    @NotNull
    private final String actionId;
    private final int requestId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassifiedOpenDeleteListingModalActionHandler(@NotNull g screenRouter) {
        super(screenRouter);
        Intrinsics.checkNotNullParameter(screenRouter, "screenRouter");
        this.actionId = "openDeleteListingModal";
        this.requestId = 9001;
    }

    @Override // ru.ozon.app.android.platform.customActionHandlers.openDeeplinkForResult.OpenDeeplinkForResultActionHandler, Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.platform.customActionHandlers.openDeeplinkForResult.OpenDeeplinkForResultActionHandler
    protected int getRequestId() {
        return this.requestId;
    }
}
