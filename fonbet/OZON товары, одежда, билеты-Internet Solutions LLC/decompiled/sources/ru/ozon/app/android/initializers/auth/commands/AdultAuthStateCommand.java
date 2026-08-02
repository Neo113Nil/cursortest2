package ru.ozon.app.android.initializers.auth.commands;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.adult.AdultState;
import ru.ozon.app.android.storage.adult.AdultStateStore;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/initializers/auth/commands/AdultAuthStateCommand;", "Lru/ozon/app/android/initializers/auth/commands/AuthStateCommand;", "adultState", "Lru/ozon/app/android/storage/adult/AdultState;", "adultStateStore", "Lru/ozon/app/android/storage/adult/AdultStateStore;", "<init>", "(Lru/ozon/app/android/storage/adult/AdultState;Lru/ozon/app/android/storage/adult/AdultStateStore;)V", "onChange", "", "isAuth", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdultAuthStateCommand extends AuthStateCommand {

    @NotNull
    private final AdultState adultState;

    @NotNull
    private final AdultStateStore adultStateStore;

    public AdultAuthStateCommand(@NotNull AdultState adultState, @NotNull AdultStateStore adultStateStore) {
        Intrinsics.checkNotNullParameter(adultState, "adultState");
        Intrinsics.checkNotNullParameter(adultStateStore, "adultStateStore");
        this.adultState = adultState;
        this.adultStateStore = adultStateStore;
    }

    @Override // ru.ozon.app.android.initializers.auth.commands.AuthStateCommand
    public void onChange(boolean isAuth) {
        this.adultState.clear();
        this.adultStateStore.clearAdultState();
    }
}
