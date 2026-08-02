package ru.ozon.app.android.session.security.customActions;

import Sc.o;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.common.actionHandlers.setPublicProfile.UpdateCellToggleKey;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.delivery.customActionsHandlers.ozonid.UserAuthBiometryActionHandler;
import ru.ozon.app.android.session.security.presentation.Failure;
import ru.ozon.app.android.session.security.presentation.Success;
import ru.ozon.app.android.session.security.presentation.UserAuthBiometryEvent;
import ru.ozon.app.android.session.security.presentation.UserAuthBiometryViewModelImpl;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u000b*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J \u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/session/security/customActions/UserAuthBiometryActionHandlerImpl;", "Lru/ozon/app/android/delivery/customActionsHandlers/ozonid/UserAuthBiometryActionHandler;", "userAuthBiometryViewModel", "Lru/ozon/app/android/session/security/presentation/UserAuthBiometryViewModelImpl;", "<init>", "(Lru/ozon/app/android/session/security/presentation/UserAuthBiometryViewModelImpl;)V", "actionId", "", "getActionId", "()Ljava/lang/String;", "processAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "onEvent", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "event", "Lru/ozon/app/android/session/security/presentation/UserAuthBiometryEvent;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "showMessage", "message", "showIcon", "", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserAuthBiometryActionHandlerImpl extends UserAuthBiometryActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final UserAuthBiometryViewModelImpl userAuthBiometryViewModel;
    public static final int $stable = 8;

    public UserAuthBiometryActionHandlerImpl(@NotNull UserAuthBiometryViewModelImpl userAuthBiometryViewModel) {
        Intrinsics.checkNotNullParameter(userAuthBiometryViewModel, "userAuthBiometryViewModel");
        this.userAuthBiometryViewModel = userAuthBiometryViewModel;
        this.actionId = "toggleBiometry";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEvent(AtomAction.Click click, UserAuthBiometryEvent userAuthBiometryEvent, ComposerReferences composerReferences) {
        String str;
        Map<String, String> params = click.getParams();
        if (params != null) {
            boolean z11 = userAuthBiometryEvent instanceof Success;
            if (z11) {
                str = ((Success) userAuthBiometryEvent).getBiometryEnabled() ? "toggleSuccessOn" : "toggleSuccessOff";
            } else {
                if (!(userAuthBiometryEvent instanceof Failure)) {
                    throw new o();
                }
                str = ((Failure) userAuthBiometryEvent).getBiometryEnabled() ? "toggleFailureOff" : "toggleFailureOn";
            }
            String str2 = params.get(str);
            if (str2 == null) {
                return;
            }
            showMessage(str2, z11, composerReferences);
            InterfaceC7851b.a.e(composerReferences.getController(), null, null, null, 7);
        }
    }

    private final void showMessage(String message, boolean showIcon, ComposerReferences refs) {
        ViewGroup rootView;
        r a11 = refs.getContainer().a();
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null) {
            return;
        }
        FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, showIcon ? Integer.valueOf(R$drawable.ic_check_green) : null, null, null, null, null, null, null, null, 3000L, null, null, refs.getContainer().g(), 57306, null).show();
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Map<String, String> params;
        String str;
        Boolean t02;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (!(action instanceof AtomAction.Click) || (params = ((AtomAction.Click) action).getParams()) == null || (str = params.get("willSelect")) == null || (t02 = h.t0(str)) == null) {
            return;
        }
        boolean booleanValue = t02.booleanValue();
        String str2 = params.get("analyticTag");
        if (str2 == null) {
            return;
        }
        ComposerReferences refs = handlerRefs.getRefs();
        refs.getController().update(new UpdateCellToggleKey(action));
        this.userAuthBiometryViewModel.getEventsLiveData().observe(refs.getContainer().g(), new UserAuthBiometryActionHandlerImpl$sam$androidx_lifecycle_Observer$0(new UserAuthBiometryActionHandlerImpl$processAction$1(this, action, refs)));
        this.userAuthBiometryViewModel.onToggleChecked(booleanValue, str2);
    }
}
