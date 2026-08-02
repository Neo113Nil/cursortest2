package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bSelectConsignee;

import Ae.C2399j;
import Ae.C2408n0;
import Bl.b;
import Pc.a;
import android.view.ViewGroup;
import androidx.core.os.d;
import androidx.fragment.app.G;
import androidx.fragment.app.i0;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bSelectConsignee/B2bSelectConsigneeActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "LPc/a;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bSelectConsignee/B2bSelectConsigneeViewModel;", "viewModelProvider", "<init>", "(LPc/a;)V", "viewModel", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "observeActions", "(Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bSelectConsignee/B2bSelectConsigneeViewModel;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "sendConsigneeAddedResult", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "showNotification", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getDefaultNotificationDTO", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "LPc/a;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class B2bSelectConsigneeActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final a<B2bSelectConsigneeViewModel> viewModelProvider;
    public static final int $stable = 8;

    public B2bSelectConsigneeActionHandler(@NotNull a<B2bSelectConsigneeViewModel> viewModelProvider) {
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        this.viewModelProvider = viewModelProvider;
        this.actionId = "b2bSelectConsignee";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationDTO getDefaultNotificationDTO() {
        return new NotificationDTO(StringProvider.getString(R$string.error_common_error_technical_error_title), null, null, null, new NotificationDTO.LeftContent(new IconDTO(IconDTO.IconSize.SIZE_500, null, IconDTO.IconShape.SQUIRCLE, null, new CommonAtomIconDTO("ic_m_exclamation_filled", UniColors.GRAPHIC_WARNING_PRIMARY.getToken()), null, UniColors.BG_SECONDARY_INVERTED.getToken(), null, null, null, null, null, null, null, null, null, IconDTO.FitType.FIT_CENTER, 65450, null), NotificationDTO.Alignment.CENTER), null, null, null, null, null, 1006, null);
    }

    private final void observeActions(B2bSelectConsigneeViewModel viewModel, CustomActionHandler.HandlerReferences handlerRefs) {
        C2399j.C(new C2408n0(viewModel.getScreenState(), new B2bSelectConsigneeActionHandler$observeActions$1(this, handlerRefs, null)), K.a(handlerRefs.getRefs().getContainer().g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendConsigneeAddedResult(ComposerReferences refs) {
        ViewGroup composerContainer;
        G parentFragmentManager;
        ViewGroup b11 = b.b(refs);
        if (b11 == null || (composerContainer = ComposerViewExtensionKt.composerContainer(b11)) == null || (parentFragmentManager = ((ComposerFragment) i0.a(composerContainer)).getParentFragmentManager()) == null) {
            return;
        }
        parentFragmentManager.m1(d.a(), "consignee_changed_refresh");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(CustomActionHandler.HandlerReferences handlerRefs, NotificationDTO notification) {
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        ViewGroup rootView = ContextExtKt.getRootView(handlerRefs.getRefs().getContainer().i());
        if (rootView == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, notification, handlerRefs.getRefs().getContainer().i(), null, 8, null).show();
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
        B2bSelectConsigneeViewModel b2bSelectConsigneeViewModel = (B2bSelectConsigneeViewModel) new z0(handlerRefs.getRefs().getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bSelectConsignee.B2bSelectConsigneeActionHandler$processAction$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = B2bSelectConsigneeActionHandler.this.viewModelProvider;
                B2bSelectConsigneeViewModel b2bSelectConsigneeViewModel2 = (B2bSelectConsigneeViewModel) aVar.get();
                Intrinsics.g(b2bSelectConsigneeViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return b2bSelectConsigneeViewModel2;
            }
        }).a(B2bSelectConsigneeViewModel.class);
        Intrinsics.f(b2bSelectConsigneeViewModel);
        observeActions(b2bSelectConsigneeViewModel, handlerRefs);
        if (!(action instanceof AtomAction.ComposerAction) || (params = (composerAction = (AtomAction.ComposerAction) action).getParams()) == null || (str = params.get("id")) == null) {
            return;
        }
        b2bSelectConsigneeViewModel.selectConsignee(composerAction.getActionName(), str);
    }
}
