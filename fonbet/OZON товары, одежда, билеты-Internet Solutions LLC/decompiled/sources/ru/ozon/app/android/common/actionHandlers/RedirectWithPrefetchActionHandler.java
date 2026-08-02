package ru.ozon.app.android.common.actionHandlers;

import Pc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/RedirectWithPrefetchActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "searchUrlPrefetchService", "LPc/a;", "Lru/ozon/app/android/common/actionHandlers/ModifySearchUrlViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/common/SearchUrlPrefetchService;LPc/a;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "LPc/a;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RedirectWithPrefetchActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final SearchUrlPrefetchService searchUrlPrefetchService;

    @NotNull
    private final a<ModifySearchUrlViewModel> viewModel;

    public RedirectWithPrefetchActionHandler(@NotNull SearchUrlPrefetchService searchUrlPrefetchService, @NotNull a<ModifySearchUrlViewModel> viewModel) {
        Intrinsics.checkNotNullParameter(searchUrlPrefetchService, "searchUrlPrefetchService");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.searchUrlPrefetchService = searchUrlPrefetchService;
        this.viewModel = viewModel;
        this.actionId = "redirectWithPrefetch";
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        String link;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if ((action instanceof AtomAction.Click) && (link = ((AtomAction.Click) action).getLink()) != null) {
            ComposerReferences refs = handlerRefs.getRefs();
            String modifySearchUrl = ((ModifySearchUrlViewModel) new z0(handlerRefs.getRefs().getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.common.actionHandlers.RedirectWithPrefetchActionHandler$processAction$$inlined$sharedViewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    a aVar;
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    aVar = RedirectWithPrefetchActionHandler.this.viewModel;
                    ModifySearchUrlViewModel modifySearchUrlViewModel = (ModifySearchUrlViewModel) aVar.get();
                    Intrinsics.g(modifySearchUrlViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return modifySearchUrlViewModel;
                }
            }).a(ModifySearchUrlViewModel.class)).modifySearchUrl(link);
            this.searchUrlPrefetchService.navigateWhenRequestPrefetched(modifySearchUrl, refs.getContainer().g(), new RedirectWithPrefetchActionHandler$processAction$2(refs, modifySearchUrl), new RedirectWithPrefetchActionHandler$processAction$1(refs.getController()));
        }
    }
}
