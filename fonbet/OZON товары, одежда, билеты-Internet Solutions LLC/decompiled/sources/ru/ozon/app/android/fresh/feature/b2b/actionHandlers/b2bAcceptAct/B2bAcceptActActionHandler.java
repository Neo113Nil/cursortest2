package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct;

import Ae.C2399j;
import Ae.C2408n0;
import Pc.a;
import android.view.ViewGroup;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct.data.B2bAcceptActParams;
import ru.ozon.app.android.pdp.domain.actionHandlers.R$drawable;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;
import xe.B0;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B#\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u001a\u0010#\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/B2bAcceptActActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "LPc/a;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/B2bAcceptActViewModel;", "pViewModel", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;LPc/a;)V", "viewModel", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "Lxe/B0;", "observeActions", "(Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/B2bAcceptActViewModel;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)Lxe/B0;", "", "showError", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "", "message", "showSuccess", "(Ljava/lang/String;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "releaseStateListenerJob", "()V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/data/B2bAcceptActParams;", "extractParams", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/data/B2bAcceptActParams;", "Lru/ozon/uni/atoms/af/AtomAction;", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "LPc/a;", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "screenStateListenerJob", "Lxe/B0;", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class B2bAcceptActActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final a<B2bAcceptActViewModel> pViewModel;
    private B0 screenStateListenerJob;
    public static final int $stable = 8;

    public B2bAcceptActActionHandler(@NotNull JsonParser jsonDeserializer, @NotNull a<B2bAcceptActViewModel> pViewModel) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        this.jsonDeserializer = jsonDeserializer;
        this.pViewModel = pViewModel;
        this.actionId = "b2bAcceptReconciliationAct";
    }

    private final B2bAcceptActParams extractParams(AtomAction.Click action) {
        Map<String, String> params = action.getParams();
        String str = params != null ? params.get("postData") : null;
        Map<String, String> params2 = action.getParams();
        boolean parseBoolean = Boolean.parseBoolean(params2 != null ? params2.get("popBack") : null);
        Map<String, String> params3 = action.getParams();
        return new B2bAcceptActParams(str, parseBoolean, params3 != null ? params3.get("successMessage") : null);
    }

    private final B0 observeActions(B2bAcceptActViewModel viewModel, CustomActionHandler.HandlerReferences handlerRefs) {
        return C2399j.C(new C2408n0(viewModel.getScreenState(), new B2bAcceptActActionHandler$observeActions$1(handlerRefs, this, viewModel, null)), K.a(handlerRefs.getRefs().getContainer().g()));
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
    public final void showError(CustomActionHandler.HandlerReferences handlerRefs) {
        ViewGroup rootView = ContextExtKt.getRootView(handlerRefs.getRefs().getContainer().i());
        if (rootView != null) {
            FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, 3000L, null, handlerRefs.getRefs().getContainer().g(), 46, null).show();
        }
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
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        B2bAcceptActViewModel b2bAcceptActViewModel = (B2bAcceptActViewModel) new z0(handlerRefs.getRefs().getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct.B2bAcceptActActionHandler$processAction$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = B2bAcceptActActionHandler.this.pViewModel;
                B2bAcceptActViewModel b2bAcceptActViewModel2 = (B2bAcceptActViewModel) aVar.get();
                Intrinsics.g(b2bAcceptActViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return b2bAcceptActViewModel2;
            }
        }).a(B2bAcceptActViewModel.class);
        if (action instanceof AtomAction.Click) {
            releaseStateListenerJob();
            Intrinsics.f(b2bAcceptActViewModel);
            this.screenStateListenerJob = observeActions(b2bAcceptActViewModel, handlerRefs);
            AtomAction.Click click = (AtomAction.Click) action;
            B2bAcceptActParams extractParams = extractParams(click);
            String link = click.getLink();
            if (link != null) {
                b2bAcceptActViewModel.acceptAct(link, extractParams, this.jsonDeserializer);
            }
        }
    }
}
