package ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.actionHandlers;

import Pc.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.common.actionHandlers.R$string;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.SubscribeAuthorViewModel;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 (2\u00020\u0001:\u0001(B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u001a\u001a\u00020\f2\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u00162\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u00020\f2\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u00162\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0018H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R$\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\f\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/subscribeAuthorHandlers/actionHandlers/BaseSubscribeAuthorActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "LPc/a;", "Lru/ozon/app/android/common/actionHandlers/subscribeAuthorHandlers/SubscribeAuthorViewModel;", "viewModelProvider", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "<init>", "(LPc/a;Lru/ozon/app/android/storage/auth/AuthStateStorage;)V", "vm", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "observeActions", "(Lru/ozon/app/android/common/actionHandlers/subscribeAuthorHandlers/SubscribeAuthorViewModel;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "showNotification", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getDefaultNotificationDTO", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "", "authorId", "updateEvent", "(Ll10/b;Ljava/lang/String;)V", "revertEvent", "getNotificationTitle", "()Ljava/lang/String;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "LPc/a;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseSubscribeAuthorActionHandler extends CustomActionHandler {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final AuthStateStorage authStateStorage;

    @NotNull
    private final a<SubscribeAuthorViewModel> viewModelProvider;

    public BaseSubscribeAuthorActionHandler(@NotNull a<SubscribeAuthorViewModel> viewModelProvider, @NotNull AuthStateStorage authStateStorage) {
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(authStateStorage, "authStateStorage");
        this.viewModelProvider = viewModelProvider;
        this.authStateStorage = authStateStorage;
    }

    private final NotificationDTO getDefaultNotificationDTO() {
        return new NotificationDTO(getNotificationTitle(), StringProvider.getString(R$string.reviews_single_review_social_header_try_again_android), 0, 0, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 464, null);
    }

    private final void observeActions(SubscribeAuthorViewModel vm, CustomActionHandler.HandlerReferences handlerRefs) {
        vm.getActionResponse().removeObservers(handlerRefs.getRefs().getContainer().g());
        vm.getRevertAction().removeObservers(handlerRefs.getRefs().getContainer().g());
        vm.getSuccessNotify().removeObservers(handlerRefs.getRefs().getContainer().g());
        vm.getActionResponse().observe(handlerRefs.getRefs().getContainer().g(), new BaseSubscribeAuthorActionHandler$sam$androidx_lifecycle_Observer$0(new BaseSubscribeAuthorActionHandler$observeActions$1(this, handlerRefs, vm)));
        vm.getRevertAction().observe(handlerRefs.getRefs().getContainer().g(), new BaseSubscribeAuthorActionHandler$sam$androidx_lifecycle_Observer$0(new BaseSubscribeAuthorActionHandler$observeActions$2(this, handlerRefs, vm)));
        vm.getSuccessNotify().observe(handlerRefs.getRefs().getContainer().g(), new BaseSubscribeAuthorActionHandler$sam$androidx_lifecycle_Observer$0(new BaseSubscribeAuthorActionHandler$observeActions$3(this, handlerRefs, vm)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(CustomActionHandler.HandlerReferences handlerRefs, NotificationDTO notification) {
        ComponentCallbacksC5392m b11 = Sh.a.b(handlerRefs);
        View view = b11 != null ? b11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        if (notification == null) {
            notification = getDefaultNotificationDTO();
        }
        View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(viewGroup, NotificationBarKt.isAboveBottomWidgets(notification));
        NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(viewGroup, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
        if (asNotificationLayoutManager == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager, notification, handlerRefs.getRefs().getContainer().g(), this.actionHandler).show();
    }

    @NotNull
    public abstract String getNotificationTitle();

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (this.actionHandler == null) {
            this.actionHandler = new ActionHandler.Builder(handlerRefs.getRefs(), handlerRefs.getNestedPagesProvider(), new BaseSubscribeAuthorActionHandler$processAction$1(handlerRefs), new BaseSubscribeAuthorActionHandler$processAction$2(handlerRefs)).buildHandler();
        }
        if (this.authStateStorage.isAuthenticated()) {
            SubscribeAuthorViewModel subscribeAuthorViewModel = (SubscribeAuthorViewModel) new z0(handlerRefs.getRefs().getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.actionHandlers.BaseSubscribeAuthorActionHandler$processAction$$inlined$viewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    a aVar;
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    aVar = BaseSubscribeAuthorActionHandler.this.viewModelProvider;
                    SubscribeAuthorViewModel subscribeAuthorViewModel2 = (SubscribeAuthorViewModel) aVar.get();
                    Intrinsics.g(subscribeAuthorViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return subscribeAuthorViewModel2;
                }
            }).a(SubscribeAuthorViewModel.class);
            Intrinsics.f(subscribeAuthorViewModel);
            observeActions(subscribeAuthorViewModel, handlerRefs);
            subscribeAuthorViewModel.processSubscribeAction(action, handlerRefs.getTrackingData());
            return;
        }
        ComposerNavigator navigator = handlerRefs.getRefs().getNavigator();
        String uri = LinkGenerator.INSTANCE.auth().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, uri, null, 2, null);
    }

    public abstract void revertEvent(@NotNull InterfaceC7851b controller, @NotNull String authorId);

    public abstract void updateEvent(@NotNull InterfaceC7851b controller, @NotNull String authorId);
}
