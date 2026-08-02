package ru.ozon.app.android.marketing.widgets.blackFridayStatus.di;

import DP.a;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.core.BlackFridayStatusImageTitleMapper;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.core.BlackFridayStatusTextTitleMapper;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.ui.switchingbutton.di.SwitchingButtonComponentApi;
import ru.ozon.app.android.ui.switchingbutton.switchingbuttondelegate.SwitchingButtonDelegate;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u0000 \u00102\u00060\u0001j\u0002`\u0002:\u0002\u0010\u0011J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackFridayStatus/di/BlackFridayStatusComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/core/BlackFridayStatusImageTitleMapper;", "getImageMapper", "()Lru/ozon/app/android/marketing/widgets/blackFridayStatus/core/BlackFridayStatusImageTitleMapper;", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/core/BlackFridayStatusTextTitleMapper;", "getTextTitleMapper", "()Lru/ozon/app/android/marketing/widgets/blackFridayStatus/core/BlackFridayStatusTextTitleMapper;", "LPc/a;", "Lru/ozon/app/android/ui/switchingbutton/switchingbuttondelegate/SwitchingButtonDelegate;", "getSwitchingButtonDelegateProvider", "()LPc/a;", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "getStartupArgsService", "()Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "Companion", "Factory", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BlackFridayStatusComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackFridayStatus/di/BlackFridayStatusComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/di/BlackFridayStatusComponent;", "create", "(Lk20/g;)Lk20/e;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BlackFridayStatusComponent create$lambda$0(C7475g c7475g) {
            return DaggerBlackFridayStatusComponent.factory().create((AccountComponentApi) c7475g.getComponent(AccountComponentApi.class), (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class), (SwitchingButtonComponentApi) c7475g.getComponent(SwitchingButtonComponentApi.class), (FavoriteCoreComponentApi) c7475g.getComponent(FavoriteCoreComponentApi.class), (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class));
        }

        @NotNull
        public final C7473e<BlackFridayStatusComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(BlackFridayStatusComponent.class), new a(storage, 7));
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackFridayStatus/di/BlackFridayStatusComponent$Factory;", "", "create", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/di/BlackFridayStatusComponent;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "switchingButtonComponentApi", "Lru/ozon/app/android/ui/switchingbutton/di/SwitchingButtonComponentApi;", "favoriteCoreComponentApi", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public interface Factory {
        @NotNull
        BlackFridayStatusComponent create(@NotNull AccountComponentApi accountComponentApi, @NotNull ActionComponentApi actionComponentApi, @NotNull SwitchingButtonComponentApi switchingButtonComponentApi, @NotNull FavoriteCoreComponentApi favoriteCoreComponentApi, @NotNull StorageComponentApi storageComponentApi);
    }

    @NotNull
    BlackFridayStatusImageTitleMapper getImageMapper();

    @NotNull
    StartupArgsService getStartupArgsService();

    @NotNull
    Pc.a<SwitchingButtonDelegate> getSwitchingButtonDelegateProvider();

    @NotNull
    BlackFridayStatusTextTitleMapper getTextTitleMapper();
}
