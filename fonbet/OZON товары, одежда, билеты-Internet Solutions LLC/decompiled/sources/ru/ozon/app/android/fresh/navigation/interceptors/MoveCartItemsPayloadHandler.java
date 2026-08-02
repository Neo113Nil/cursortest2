package ru.ozon.app.android.fresh.navigation.interceptors;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tJ\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/navigation/interceptors/MoveCartItemsPayloadHandler;", "", "<init>", "()V", "payload", "", "saveMoveCartItemsPayload", "", "params", "", "getMoveCartItemsPayload", "clearMoveCartItemsPayload", "Companion", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MoveCartItemsPayloadHandler {

    @NotNull
    private String payload = "";

    public final void clearMoveCartItemsPayload() {
        this.payload = "";
    }

    @NotNull
    /* renamed from: getMoveCartItemsPayload, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    public final void saveMoveCartItemsPayload(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String str = params.get("payload");
        if (str == null) {
            str = "";
        }
        this.payload = str;
    }
}
