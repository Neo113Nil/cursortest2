package ru.ozon.app.android.storage.subscribeAuthor;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0017\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\rR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorageImpl;", "Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "<init>", "()V", "subscribedAuthorsId", "", "", "", "setAuthorSubscription", "", "authorId", "isSubscribed", "isAuthorSubscribed", "(Ljava/lang/String;)Ljava/lang/Boolean;", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SubscribeAuthorsIdStorageImpl implements SubscribeAuthorsIdStorage {

    @NotNull
    private final Map<String, Boolean> subscribedAuthorsId = new LinkedHashMap();

    @Override // ru.ozon.app.android.storage.subscribeAuthor.SubscribeAuthorsIdStorage
    public Boolean isAuthorSubscribed(@NotNull String authorId) {
        Intrinsics.checkNotNullParameter(authorId, "authorId");
        return this.subscribedAuthorsId.get(authorId);
    }

    @Override // ru.ozon.app.android.storage.subscribeAuthor.SubscribeAuthorsIdStorage
    public void setAuthorSubscription(@NotNull String authorId, boolean isSubscribed) {
        Intrinsics.checkNotNullParameter(authorId, "authorId");
        this.subscribedAuthorsId.put(authorId, Boolean.valueOf(isSubscribed));
    }
}
