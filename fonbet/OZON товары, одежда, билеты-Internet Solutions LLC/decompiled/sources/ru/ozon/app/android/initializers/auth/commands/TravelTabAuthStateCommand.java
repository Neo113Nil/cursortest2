package ru.ozon.app.android.initializers.auth.commands;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.domain.TravelTabConfigUpdateDelegate;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/initializers/auth/commands/TravelTabAuthStateCommand;", "Lru/ozon/app/android/initializers/auth/commands/AuthStateCommand;", "travelTabConfigUpdateDelegate", "Lru/ozon/app/android/tabbar/domain/TravelTabConfigUpdateDelegate;", "<init>", "(Lru/ozon/app/android/tabbar/domain/TravelTabConfigUpdateDelegate;)V", "onChange", "", "isAuth", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TravelTabAuthStateCommand extends AuthStateCommand {

    @NotNull
    private final TravelTabConfigUpdateDelegate travelTabConfigUpdateDelegate;

    public TravelTabAuthStateCommand(@NotNull TravelTabConfigUpdateDelegate travelTabConfigUpdateDelegate) {
        Intrinsics.checkNotNullParameter(travelTabConfigUpdateDelegate, "travelTabConfigUpdateDelegate");
        this.travelTabConfigUpdateDelegate = travelTabConfigUpdateDelegate;
    }

    @Override // ru.ozon.app.android.initializers.auth.commands.AuthStateCommand
    public void onChange(boolean isAuth) {
        this.travelTabConfigUpdateDelegate.updateConfig();
    }
}
