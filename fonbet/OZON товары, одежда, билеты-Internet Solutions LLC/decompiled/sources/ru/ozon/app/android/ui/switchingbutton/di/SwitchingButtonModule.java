package ru.ozon.app.android.ui.switchingbutton.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ui.switchingbutton.state.SwitchingButtonStateStorage;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ui/switchingbutton/di/SwitchingButtonModule;", "", "<init>", "()V", "provideSwitchingButtonsStorage", "Lru/ozon/app/android/ui/switchingbutton/state/SwitchingButtonStateStorage;", "switchingbutton_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SwitchingButtonModule {

    @NotNull
    public static final SwitchingButtonModule INSTANCE = new SwitchingButtonModule();

    private SwitchingButtonModule() {
    }

    @NotNull
    public final SwitchingButtonStateStorage provideSwitchingButtonsStorage() {
        return new SwitchingButtonStateStorage();
    }
}
