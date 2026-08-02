package ru.ozon.app.android.cabinet.profile;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.eventBus.UserDataChangedEventBus;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cabinet/profile/RefreshOnUserDataChangedConfigurator;", "Lru/ozon/app/android/cabinet/profile/RefreshByEventsConfigurator;", "userDataChangedEventBus", "Lru/ozon/app/android/account/eventBus/UserDataChangedEventBus;", "<init>", "(Lru/ozon/app/android/account/eventBus/UserDataChangedEventBus;)V", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RefreshOnUserDataChangedConfigurator extends RefreshByEventsConfigurator {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshOnUserDataChangedConfigurator(@NotNull UserDataChangedEventBus userDataChangedEventBus) {
        super(userDataChangedEventBus);
        Intrinsics.checkNotNullParameter(userDataChangedEventBus, "userDataChangedEventBus");
    }
}
