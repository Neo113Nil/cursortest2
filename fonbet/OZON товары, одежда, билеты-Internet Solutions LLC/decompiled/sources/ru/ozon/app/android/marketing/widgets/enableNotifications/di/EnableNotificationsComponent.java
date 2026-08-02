package ru.ozon.app.android.marketing.widgets.enableNotifications.di;

import AH.a;
import android.content.Context;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.marketing.widgets.enableNotifications.core.EnableNotificationsMapper;
import ru.ozon.app.android.marketing.widgets.enableNotifications.presentation.EnableNotificationsViewModelImpl;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u0000 \u00102\u00060\u0001j\u0002`\u0002:\u0002\u0010\u0011J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/marketing/widgets/enableNotifications/di/EnableNotificationsComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LPc/a;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsViewModelImpl;", "getEnableNotificationsViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/core/EnableNotificationsMapper;", "getMapper", "()Lru/ozon/app/android/marketing/widgets/enableNotifications/core/EnableNotificationsMapper;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Companion", "Factory", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface EnableNotificationsComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/enableNotifications/di/EnableNotificationsComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/di/EnableNotificationsComponent;", "create", "(Lk20/g;)Lk20/e;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EnableNotificationsComponent create$lambda$0(C7475g c7475g) {
            return DaggerEnableNotificationsComponent.factory().create((ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class), (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class));
        }

        @NotNull
        public final C7473e<EnableNotificationsComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(EnableNotificationsComponent.class), new a(storage, 17));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/enableNotifications/di/EnableNotificationsComponent$Factory;", "", "create", "Lru/ozon/app/android/marketing/widgets/enableNotifications/di/EnableNotificationsComponent;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public interface Factory {
        @NotNull
        EnableNotificationsComponent create(@NotNull ContextComponentDependencies contextComponentDependencies, @NotNull NetworkComponentApi networkComponentApi);
    }

    @NotNull
    Context getContext();

    @NotNull
    Pc.a<EnableNotificationsViewModelImpl> getEnableNotificationsViewModelProvider();

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    EnableNotificationsMapper getMapper();
}
