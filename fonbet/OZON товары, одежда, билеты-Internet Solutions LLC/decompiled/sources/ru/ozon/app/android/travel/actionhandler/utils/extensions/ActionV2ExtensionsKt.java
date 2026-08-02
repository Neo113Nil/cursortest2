package ru.ozon.app.android.travel.actionhandler.utils.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.models.ActionV2Response;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "ensureSuccessful", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)Lru/ozon/app/android/action/v2/models/ActionV2Response;", "actionhandler_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActionV2ExtensionsKt {
    @NotNull
    public static final <T> ActionV2Response<T> ensureSuccessful(@NotNull ActionV2Response<T> actionV2Response) {
        Intrinsics.checkNotNullParameter(actionV2Response, "<this>");
        if (actionV2Response.getError() == null) {
            return actionV2Response;
        }
        throw new ActionV2RepositoryError(actionV2Response.getError());
    }
}
