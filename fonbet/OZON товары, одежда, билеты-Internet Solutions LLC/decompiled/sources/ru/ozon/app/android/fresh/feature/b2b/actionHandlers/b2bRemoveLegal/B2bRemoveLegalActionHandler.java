package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal;

import Ae.C2399j;
import Ae.C2408n0;
import Pc.a;
import android.content.DialogInterface;
import android.view.ViewGroup;
import androidx.appcompat.app.f;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.data.B2bRemoveLegalParams;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.data.B2bRemoveLegalResponse;
import ru.ozon.app.android.pdp.domain.actionHandlers.R$drawable;
import ru.ozon.app.android.tabbar.domain.TabConfigUpdateDelegate;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;
import xe.B0;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0$¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u001a\u0010)\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/B2bRemoveLegalActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "LPc/a;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/B2bRemoveLegalViewModel;", "pViewModel", "Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;", "tabConfigUpdateDelegate", "<init>", "(LPc/a;Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;)V", "viewModel", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "Lxe/B0;", "observeActions", "(Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/B2bRemoveLegalViewModel;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)Lxe/B0;", "", "releaseStateListenerJob", "()V", "releaseAdditionalAction", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/data/B2bRemoveLegalParams;", "extractActionParams", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/data/B2bRemoveLegalParams;", "", "message", "showError", "(Ljava/lang/String;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "showSuccess", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/data/B2bRemoveLegalResponse$Data;", "data", "showRemoveUnavailableDialog", "(Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bRemoveLegal/data/B2bRemoveLegalResponse$Data;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lkotlin/Function0;", "setAdditionalSuccessAction", "(Lkotlin/jvm/functions/Function0;)V", "LPc/a;", "Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "screenStateListenerJob", "Lxe/B0;", "additionalSuccessAction", "Lkotlin/jvm/functions/Function0;", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class B2bRemoveLegalActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;
    private Function0<Unit> additionalSuccessAction;

    @NotNull
    private final a<B2bRemoveLegalViewModel> pViewModel;
    private B0 screenStateListenerJob;

    @NotNull
    private final TabConfigUpdateDelegate tabConfigUpdateDelegate;
    public static final int $stable = 8;

    public B2bRemoveLegalActionHandler(@NotNull a<B2bRemoveLegalViewModel> pViewModel, @NotNull TabConfigUpdateDelegate tabConfigUpdateDelegate) {
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        Intrinsics.checkNotNullParameter(tabConfigUpdateDelegate, "tabConfigUpdateDelegate");
        this.pViewModel = pViewModel;
        this.tabConfigUpdateDelegate = tabConfigUpdateDelegate;
        this.actionId = "b2bRemoveLegal";
    }

    private final B2bRemoveLegalParams extractActionParams(AtomAction.ComposerAction action) {
        Map<String, String> params = action.getParams();
        if (params == null) {
            return null;
        }
        String str = params.get("postData");
        String str2 = params.get("shouldPopToRoot");
        boolean parseBoolean = str2 != null ? Boolean.parseBoolean(str2) : true;
        String str3 = params.get("successMessage");
        if (str != null) {
            return new B2bRemoveLegalParams(str, parseBoolean, str3);
        }
        return null;
    }

    private final B0 observeActions(B2bRemoveLegalViewModel viewModel, CustomActionHandler.HandlerReferences handlerRefs) {
        return C2399j.C(new C2408n0(viewModel.getScreenState(), new B2bRemoveLegalActionHandler$observeActions$1(handlerRefs, this, viewModel, null)), K.a(handlerRefs.getRefs().getContainer().g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseAdditionalAction() {
        this.additionalSuccessAction = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseStateListenerJob() {
        B0 b02;
        B0 b03 = this.screenStateListenerJob;
        if (b03 != null && b03.isActive() && (b02 = this.screenStateListenerJob) != null) {
            b02.j(null);
        }
        this.screenStateListenerJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(String message, CustomActionHandler.HandlerReferences handlerRefs) {
        ViewGroup rootView = ContextExtKt.getRootView(handlerRefs.getRefs().getContainer().i());
        if (rootView != null) {
            FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, message, null, 3000L, null, handlerRefs.getRefs().getContainer().g(), 42, null).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRemoveUnavailableDialog(B2bRemoveLegalResponse.Data data, CustomActionHandler.HandlerReferences handlerRefs) {
        f.a aVar = new f.a(handlerRefs.getRefs().getContainer().i());
        aVar.f(data.getText());
        aVar.h(data.getButton(), new DialogInterface.OnClickListener() { // from class: Cu.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                dialogInterface.dismiss();
            }
        });
        aVar.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSuccess(String message, CustomActionHandler.HandlerReferences handlerRefs) {
        ViewGroup rootView = ContextExtKt.getRootView(handlerRefs.getRefs().getContainer().i());
        if (rootView != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(message);
            int i11 = R$drawable.ic_m_check_filled_b2b;
            FlashbarFactory.create$default(flashbarFactory, rootView, null, ozonSpannableString, null, null, Integer.valueOf(i11), null, UniColors.TEXT_POSITIVE.getToken(), null, null, null, null, null, 3000L, null, null, handlerRefs.getRefs().getContainer().g(), 57178, null).show();
        }
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        AtomAction.ComposerAction composerAction;
        B2bRemoveLegalParams extractActionParams;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        B2bRemoveLegalViewModel b2bRemoveLegalViewModel = (B2bRemoveLegalViewModel) new z0(handlerRefs.getRefs().getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.B2bRemoveLegalActionHandler$processAction$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = B2bRemoveLegalActionHandler.this.pViewModel;
                B2bRemoveLegalViewModel b2bRemoveLegalViewModel2 = (B2bRemoveLegalViewModel) aVar.get();
                Intrinsics.g(b2bRemoveLegalViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return b2bRemoveLegalViewModel2;
            }
        }).a(B2bRemoveLegalViewModel.class);
        releaseStateListenerJob();
        Intrinsics.f(b2bRemoveLegalViewModel);
        this.screenStateListenerJob = observeActions(b2bRemoveLegalViewModel, handlerRefs);
        if (!(action instanceof AtomAction.ComposerAction) || (extractActionParams = extractActionParams((composerAction = (AtomAction.ComposerAction) action))) == null) {
            return;
        }
        b2bRemoveLegalViewModel.removeLegal(composerAction.getActionName(), extractActionParams);
    }

    public final void setAdditionalSuccessAction(@NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.additionalSuccessAction = action;
    }
}
