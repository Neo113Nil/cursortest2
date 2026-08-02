package ru.ozon.app.android.ui.start.di.closeFlowWatcher;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.onboardingscreen.di.CloseFlowWatcherComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/ui/start/di/closeFlowWatcher/CloseFlowWatcherComponent;", "Lru/ozon/app/android/storefront/onboardingscreen/di/CloseFlowWatcherComponentApi;", "Companion", "Factory", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface CloseFlowWatcherComponent extends CloseFlowWatcherComponentApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ui/start/di/closeFlowWatcher/CloseFlowWatcherComponent$Companion;", "", "<init>", "()V", "create", "Lru/ozon/app/android/ui/start/di/closeFlowWatcher/CloseFlowWatcherComponent;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final CloseFlowWatcherComponent create() {
            return DaggerCloseFlowWatcherComponent.factory().create();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/ui/start/di/closeFlowWatcher/CloseFlowWatcherComponent$Factory;", "", "create", "Lru/ozon/app/android/ui/start/di/closeFlowWatcher/CloseFlowWatcherComponent;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        CloseFlowWatcherComponent create();
    }
}
