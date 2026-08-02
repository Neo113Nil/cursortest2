package ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/subscribeAuthorHandlers/updateKeys/SubscribeAuthorBaseKey;", "LA00/a$J$a;", "", "authorId", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getAuthorId", "()Ljava/lang/String;", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class SubscribeAuthorBaseKey implements a.J.InterfaceC0007a {

    @NotNull
    private final String authorId;

    public SubscribeAuthorBaseKey(@NotNull String authorId) {
        Intrinsics.checkNotNullParameter(authorId, "authorId");
        this.authorId = authorId;
    }

    @NotNull
    public final String getAuthorId() {
        return this.authorId;
    }
}
