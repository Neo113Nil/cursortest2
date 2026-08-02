package ru.ozon.app.android.marketing.widgets.notificationssettings.presentation;

import AF.a;
import B90.C2601c;
import Dp.C2877a;
import Lz.d;
import Nc.C3667a;
import Nc.C3669c;
import a00.C4911f;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.n;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import fd.InterfaceC6511n;
import io.reactivex.p;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.marketing.widgets.notificationssettings.di.NotificationSettingsComponent;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector.NotificationsSettingsSelectorRepo;
import ru.ozon.app.android.storage.user.model.User;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0003J)\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010#\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010\u00060\u00060!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'¨\u0006*"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "", "clearRepo", "", "areNotificationsEnabled", "()Z", "Lru/ozon/app/android/storage/user/model/User;", "user", "processUserChange", "(Lru/ozon/app/android/storage/user/model/User;)Z", "notificationsState", "processNotificationsChange", "(Z)Z", "onComposerInitialized", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroidx/lifecycle/J;", "owner", "onResume", "(Landroidx/lifecycle/J;)V", "Landroidx/core/app/n;", "notificationManager", "Landroidx/core/app/n;", "lastNotificationsState", "Ljava/lang/Boolean;", "LNc/c;", "kotlin.jvm.PlatformType", "notificationsSubject", "LNc/c;", "", "lastPhoneState", "Ljava/lang/String;", "lastEmailState", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationsSettingsConfigurator extends ComposerScreenConfig.PageConfigurator {
    private String lastEmailState;
    private Boolean lastNotificationsState;
    private String lastPhoneState;
    private n notificationManager;

    @NotNull
    private C3669c<Boolean> notificationsSubject;
    public static final int $stable = 8;

    public NotificationsSettingsConfigurator() {
        C3669c<Boolean> d11 = C3669c.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.notificationsSubject = d11;
    }

    private final boolean areNotificationsEnabled() {
        n nVar = this.notificationManager;
        return nVar != null && nVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearRepo() {
        NotificationsSettingsSelectorRepo notificationsSettingsSelectorRepo = NotificationsSettingsSelectorRepo.INSTANCE;
        notificationsSettingsSelectorRepo.setShouldRefresh(false);
        notificationsSettingsSelectorRepo.getRefreshSubject().onNext(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean onComposerInitialized$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Boolean) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean onComposerInitialized$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Boolean) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean onComposerInitialized$lambda$2(InterfaceC6511n interfaceC6511n, Object p02, Object p12, Object p22) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        Intrinsics.checkNotNullParameter(p22, "p2");
        return (Boolean) interfaceC6511n.invoke(p02, p12, p22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onComposerInitialized$lambda$3(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean processNotificationsChange(boolean notificationsState) {
        if (Intrinsics.d(this.lastNotificationsState, Boolean.valueOf(notificationsState))) {
            return false;
        }
        this.lastNotificationsState = Boolean.valueOf(notificationsState);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean processUserChange(User user) {
        if (Intrinsics.d(this.lastPhoneState, user.getAccountPhone()) && Intrinsics.d(this.lastEmailState, user.getEmail())) {
            return false;
        }
        this.lastPhoneState = user.getAccountPhone();
        this.lastEmailState = user.getEmail();
        return true;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        C4911f ownerContainer;
        ComponentCallbacksC5392m c11;
        NotificationsSettingsCellViewModelImpl notificationsSettingsCellViewModelImpl;
        C7475g composerWidgetComponentStorage;
        ConfiguratorReferences references = getReferences();
        final NotificationSettingsComponent notificationSettingsComponent = (NotificationSettingsComponent) ((references == null || (composerWidgetComponentStorage = references.getComposerWidgetComponentStorage()) == null) ? null : composerWidgetComponentStorage.getComponent(NotificationSettingsComponent.class));
        if (notificationSettingsComponent != null && resultCode == -1) {
            Long valueOf = data != null ? Long.valueOf(data.getLongExtra("extra_id", 0L)) : null;
            if (valueOf != null && valueOf.longValue() == 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                long longValue = valueOf.longValue();
                ConfiguratorReferences references2 = getReferences();
                if (references2 == null || (ownerContainer = references2.getOwnerContainer()) == null || (c11 = ownerContainer.c()) == null) {
                    return;
                }
                ComponentCallbacksC5392m componentCallbacksC5392m = c11.isDetached() ? null : c11;
                if (componentCallbacksC5392m == null || (notificationsSettingsCellViewModelImpl = (NotificationsSettingsCellViewModelImpl) new z0(componentCallbacksC5392m, new z0.c() { // from class: ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsConfigurator$onActivityResult$lambda$7$$inlined$viewModel$1
                    @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                    public <T extends w0> T create(Class<T> modelClass) {
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        return new NotificationsSettingsCellViewModelImpl(NotificationSettingsComponent.this.getNotificationsSettingsApi());
                    }
                }).a(NotificationsSettingsCellViewModelImpl.class)) == null) {
                    return;
                }
                notificationsSettingsCellViewModelImpl.onDialogResult(longValue);
            }
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ConfiguratorReferences references;
        C4911f ownerContainer;
        Context applicationContext;
        C7475g composerWidgetComponentStorage;
        ConfiguratorReferences references2 = getReferences();
        NotificationSettingsComponent notificationSettingsComponent = (NotificationSettingsComponent) ((references2 == null || (composerWidgetComponentStorage = references2.getComposerWidgetComponentStorage()) == null) ? null : composerWidgetComponentStorage.getComponent(NotificationSettingsComponent.class));
        if (notificationSettingsComponent == null || (references = getReferences()) == null || (ownerContainer = references.getOwnerContainer()) == null || (applicationContext = ownerContainer.i().getApplicationContext()) == null) {
            return;
        }
        this.notificationManager = n.e(applicationContext);
        UserManager userManager = notificationSettingsComponent.getUserManager();
        this.lastNotificationsState = Boolean.valueOf(areNotificationsEnabled());
        User user = userManager.getUser();
        this.lastPhoneState = user != null ? user.getAccountPhone() : null;
        User user2 = userManager.getUser();
        this.lastEmailState = user2 != null ? user2.getEmail() : null;
        p combineLatest = p.combineLatest(userManager.observeUser().map(new d(new NotificationsSettingsConfigurator$onComposerInitialized$refreshSubject$1(this), 0)), this.notificationsSubject.map(new C2877a(new NotificationsSettingsConfigurator$onComposerInitialized$refreshSubject$2(this), 3)), NotificationsSettingsSelectorRepo.INSTANCE.getRefreshSubject().startWith((C3667a<Boolean>) Boolean.FALSE), new C2601c(NotificationsSettingsConfigurator$onComposerInitialized$refreshSubject$3.INSTANCE));
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(...)");
        p observeOn = combineLatest.filter(new a(NotificationsSettingsConfigurator$onComposerInitialized$1.INSTANCE, 4)).observeOn(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "observeOn(...)");
        RxExtKt.observe(observeOn, getOwner(), new NotificationsSettingsConfigurator$onComposerInitialized$2(this), NotificationsSettingsConfigurator$onComposerInitialized$3.INSTANCE, NotificationsSettingsConfigurator$onComposerInitialized$4.INSTANCE);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.notificationsSubject.onNext(Boolean.valueOf(areNotificationsEnabled()));
    }
}
