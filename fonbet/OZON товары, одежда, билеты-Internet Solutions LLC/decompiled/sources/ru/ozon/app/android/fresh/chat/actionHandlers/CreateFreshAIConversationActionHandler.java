package ru.ozon.app.android.fresh.chat.actionHandlers;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Tg.b;
import Vg.f;
import a00.C4911f;
import a00.h;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.fresh.chat.viewModels.FreshAISharedViewModel;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u0000 22\u00020\u0001:\u00012B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001b\u001a\u00020\u001a*\u00020\u000b2\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0005*\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010!\u001a\u00020 *\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J'\u0010%\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R$\u0010+\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\r\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010.\u001a\u00020-8\u0016X\u0096D¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/fresh/chat/actionHandlers/CreateFreshAIConversationActionHandler;", "LVg/f;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "LPc/a;", "Lru/ozon/app/android/fresh/chat/viewModels/FreshAISharedViewModel;", "viewModelProvider", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;LPc/a;)V", "LVg/f$a;", "widgetInfo", "Lk20/g;", "widgetComponentStorage", "", "initActionHandler", "(LVg/f$a;Lk20/g;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;La00/f;)V", "La00/h;", "Lru/ozon/app/android/composer/ViewModelOwnerProvider;", "viewModelOwnerProvider", "Lru/ozon/app/android/composer/ComposerReferences;", "getComposerReferences", "(Lk20/g;La00/f;La00/h;)Lru/ozon/app/android/composer/ComposerReferences;", "getViewModel", "(LVg/f$a;)Lru/ozon/app/android/fresh/chat/viewModels/FreshAISharedViewModel;", "", "", "isNetworkRelatedError", "(Ljava/lang/Throwable;)Z", "LTg/b;", "action", "processWidgetAction", "(LTg/b;LVg/f$a;Lk20/g;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LPc/a;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CreateFreshAIConversationActionHandler extends f {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final String actionId;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final a<FreshAISharedViewModel> viewModelProvider;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final InterfaceC4008j<NotificationDTO> commonNetworkError$delegate = k.b(CreateFreshAIConversationActionHandler$Companion$commonNetworkError$2.INSTANCE);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/chat/actionHandlers/CreateFreshAIConversationActionHandler$Companion;", "", "<init>", "()V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "commonNetworkError$delegate", "LSc/j;", "getCommonNetworkError", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "commonNetworkError", "", "DEFAULT_FINISHED_LOADING_DELAY", "J", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NotificationDTO getCommonNetworkError() {
            return (NotificationDTO) CreateFreshAIConversationActionHandler.commonNetworkError$delegate.getValue();
        }

        private Companion() {
        }
    }

    public CreateFreshAIConversationActionHandler(@NotNull ActionV2Repository actionV2Repository, @NotNull a<FreshAISharedViewModel> viewModelProvider) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        this.actionV2Repository = actionV2Repository;
        this.viewModelProvider = viewModelProvider;
        this.actionId = "composerActionWithAction";
    }

    private final ComposerReferences getComposerReferences(C7475g c7475g, C4911f c4911f, h hVar) {
        return ((RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class)).getComposerReferencesFactory().create(c4911f, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FreshAISharedViewModel getViewModel(f.a aVar) {
        h b11 = aVar.b();
        final a<FreshAISharedViewModel> aVar2 = this.viewModelProvider;
        return (FreshAISharedViewModel) new z0(b11.a(), new z0.c() { // from class: ru.ozon.app.android.fresh.chat.actionHandlers.CreateFreshAIConversationActionHandler$getViewModel$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                FreshAISharedViewModel freshAISharedViewModel = (FreshAISharedViewModel) a.this.get();
                Intrinsics.g(freshAISharedViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return freshAISharedViewModel;
            }
        }).a(FreshAISharedViewModel.class);
    }

    private final void initActionHandler(f.a widgetInfo, C7475g widgetComponentStorage) {
        this.actionHandler = new ActionHandler.Builder(getComposerReferences(widgetComponentStorage, new C4911f(widgetInfo.a().e()), widgetInfo.b()), new CreateFreshAIConversationActionHandler$initActionHandler$1(widgetInfo), new CreateFreshAIConversationActionHandler$initActionHandler$2(widgetInfo), new CreateFreshAIConversationActionHandler$initActionHandler$3(widgetInfo)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isNetworkRelatedError(Throwable th2) {
        return (th2 instanceof HttpException) || (th2 instanceof UnknownHostException) || (th2 instanceof SocketTimeoutException) || (th2 instanceof SocketException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(NotificationDTO notification, C4911f container) {
        ComponentCallbacksC5392m c11;
        View view;
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        r a11;
        Function1<? super AtomAction, Unit> function1 = this.actionHandler;
        if (function1 == null || (c11 = container.c()) == null || (view = c11.getView()) == null || (composerContainer = ComposerViewExtensionKt.composerContainer(view)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null || (a11 = container.a()) == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, notification, a11, function1).show();
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // Vg.f
    public void processWidgetAction(@NotNull b action, @NotNull f.a widgetInfo, @NotNull C7475g widgetComponentStorage) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        if (action instanceof AtomAction.ComposerAction) {
            C4911f a11 = widgetInfo.a();
            initActionHandler(widgetInfo, widgetComponentStorage);
            FreshAISharedViewModel viewModel = getViewModel(widgetInfo);
            if (viewModel != null) {
                FreshAISharedViewModel.setLoading$default(viewModel, true, null, 2, null);
            }
            C10727i.c(K.a(a11.g()), null, null, new CreateFreshAIConversationActionHandler$processWidgetAction$1(this, action, widgetInfo, a11, null), 3);
        }
    }
}
