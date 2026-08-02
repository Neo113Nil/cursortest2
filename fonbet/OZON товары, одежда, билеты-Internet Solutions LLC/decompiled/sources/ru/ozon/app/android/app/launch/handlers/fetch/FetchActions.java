package ru.ozon.app.android.app.launch.handlers.fetch;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.locale.app.data.LocaleFetchAction;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/app/launch/handlers/fetch/FetchActions;", "", "firebaseAnalyticsFetchAction", "Lru/ozon/app/android/app/launch/handlers/fetch/FirebaseAnalyticsFetchAction;", "userStateFetchAction", "Lru/ozon/app/android/app/launch/handlers/fetch/UserFetchAction;", "abToolFetchAction", "Lru/ozon/app/android/app/launch/handlers/fetch/AbToolFetchAction;", "localeFetchAction", "Lru/ozon/app/android/account/locale/app/data/LocaleFetchAction;", "<init>", "(Lru/ozon/app/android/app/launch/handlers/fetch/FirebaseAnalyticsFetchAction;Lru/ozon/app/android/app/launch/handlers/fetch/UserFetchAction;Lru/ozon/app/android/app/launch/handlers/fetch/AbToolFetchAction;Lru/ozon/app/android/account/locale/app/data/LocaleFetchAction;)V", "fetch", "", "app-launch-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FetchActions {

    @NotNull
    private final AbToolFetchAction abToolFetchAction;

    @NotNull
    private final FirebaseAnalyticsFetchAction firebaseAnalyticsFetchAction;

    @NotNull
    private final LocaleFetchAction localeFetchAction;

    @NotNull
    private final UserFetchAction userStateFetchAction;

    public FetchActions(@NotNull FirebaseAnalyticsFetchAction firebaseAnalyticsFetchAction, @NotNull UserFetchAction userStateFetchAction, @NotNull AbToolFetchAction abToolFetchAction, @NotNull LocaleFetchAction localeFetchAction) {
        Intrinsics.checkNotNullParameter(firebaseAnalyticsFetchAction, "firebaseAnalyticsFetchAction");
        Intrinsics.checkNotNullParameter(userStateFetchAction, "userStateFetchAction");
        Intrinsics.checkNotNullParameter(abToolFetchAction, "abToolFetchAction");
        Intrinsics.checkNotNullParameter(localeFetchAction, "localeFetchAction");
        this.firebaseAnalyticsFetchAction = firebaseAnalyticsFetchAction;
        this.userStateFetchAction = userStateFetchAction;
        this.abToolFetchAction = abToolFetchAction;
        this.localeFetchAction = localeFetchAction;
    }

    public final void fetch() {
        this.localeFetchAction.fetch();
        this.userStateFetchAction.fetch();
        this.abToolFetchAction.fetch();
        this.firebaseAnalyticsFetchAction.fetch();
    }
}
