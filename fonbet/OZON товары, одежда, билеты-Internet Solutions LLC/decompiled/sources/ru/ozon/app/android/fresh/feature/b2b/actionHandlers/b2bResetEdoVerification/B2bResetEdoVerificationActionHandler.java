package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification;

import Ae.C2399j;
import Ae.C2408n0;
import Pc.a;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/B2bResetEdoVerificationActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "LPc/a;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/B2bResetEdoVerificationViewModel;", "viewModelProvider", "<init>", "(LPc/a;)V", "viewModel", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "observeActions", "(Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bResetEdoVerification/B2bResetEdoVerificationViewModel;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "showErrorNotification", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "LPc/a;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class B2bResetEdoVerificationActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final a<B2bResetEdoVerificationViewModel> viewModelProvider;
    public static final int $stable = 8;

    public B2bResetEdoVerificationActionHandler(@NotNull a<B2bResetEdoVerificationViewModel> viewModelProvider) {
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        this.viewModelProvider = viewModelProvider;
        this.actionId = "b2bResetEdoVerification";
    }

    private final void observeActions(B2bResetEdoVerificationViewModel viewModel, CustomActionHandler.HandlerReferences handlerRefs) {
        C2399j.C(new C2408n0(viewModel.getScreenState(), new B2bResetEdoVerificationActionHandler$observeActions$1(handlerRefs, this, null)), K.a(handlerRefs.getRefs().getContainer().g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorNotification(CustomActionHandler.HandlerReferences handlerRefs) {
        ViewGroup rootView;
        NotificationLayoutManager asNotificationLayoutManager$default;
        ComponentCallbacksC5392m b11 = Sh.a.b(handlerRefs);
        if (b11 == null || (rootView = ContextExtKt.getRootView(b11)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, new NotificationDTO(StringProvider.getString(R$string.error_common_error_technical_error_title), null, null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 510, null), handlerRefs.getRefs().getContainer().i(), null, 8, null).show();
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        AtomAction.ComposerAction composerAction;
        Map<String, String> params;
        String str;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        B2bResetEdoVerificationViewModel b2bResetEdoVerificationViewModel = (B2bResetEdoVerificationViewModel) new z0(handlerRefs.getRefs().getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bResetEdoVerification.B2bResetEdoVerificationActionHandler$processAction$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = B2bResetEdoVerificationActionHandler.this.viewModelProvider;
                B2bResetEdoVerificationViewModel b2bResetEdoVerificationViewModel2 = (B2bResetEdoVerificationViewModel) aVar.get();
                Intrinsics.g(b2bResetEdoVerificationViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return b2bResetEdoVerificationViewModel2;
            }
        }).a(B2bResetEdoVerificationViewModel.class);
        Intrinsics.f(b2bResetEdoVerificationViewModel);
        observeActions(b2bResetEdoVerificationViewModel, handlerRefs);
        if (!(action instanceof AtomAction.ComposerAction) || (params = (composerAction = (AtomAction.ComposerAction) action).getParams()) == null || (str = params.get("legalEntityId")) == null) {
            return;
        }
        b2bResetEdoVerificationViewModel.resetVerificationRequest(composerAction.getActionName(), str);
    }
}
