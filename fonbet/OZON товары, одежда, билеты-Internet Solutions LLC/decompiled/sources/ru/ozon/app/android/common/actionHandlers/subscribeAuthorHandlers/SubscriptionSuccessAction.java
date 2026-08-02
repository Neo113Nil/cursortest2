package ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/subscribeAuthorHandlers/SubscriptionSuccessAction;", "", "", "actionId", "authorId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "getAuthorId", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SubscriptionSuccessAction {
    private final String actionId;

    @NotNull
    private final String authorId;

    public SubscriptionSuccessAction(String str, @NotNull String authorId) {
        Intrinsics.checkNotNullParameter(authorId, "authorId");
        this.actionId = str;
        this.authorId = authorId;
    }

    @NotNull
    public final String getAuthorId() {
        return this.authorId;
    }
}
