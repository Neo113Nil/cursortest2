package ru.ozon.app.android.travel.actionhandler.modalParentRefresh;

import Pc.a;
import a00.h;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.actionhandler.travelResultAction.ModalParentRefreshSharedViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/modalParentRefresh/ModalParentRefreshActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "LPc/a;", "Lru/ozon/app/android/travel/actionhandler/travelResultAction/ModalParentRefreshSharedViewModel;", "parentRefreshViewModelProvider", "<init>", "(LPc/a;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "LPc/a;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ModalParentRefreshActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final a<ModalParentRefreshSharedViewModel> parentRefreshViewModelProvider;

    public ModalParentRefreshActionHandler(@NotNull a<ModalParentRefreshSharedViewModel> parentRefreshViewModelProvider) {
        Intrinsics.checkNotNullParameter(parentRefreshViewModelProvider, "parentRefreshViewModelProvider");
        this.parentRefreshViewModelProvider = parentRefreshViewModelProvider;
        this.actionId = "modalParentRefresh";
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
        if (action instanceof AtomAction.DismissRefresh) {
            ComposerReferences refs = handlerRefs.getRefs();
            h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
            final a<ModalParentRefreshSharedViewModel> aVar = this.parentRefreshViewModelProvider;
            ModalParentRefreshSharedViewModel modalParentRefreshSharedViewModel = (ModalParentRefreshSharedViewModel) new z0(viewModelOwnerProvider.b(), new z0.c() { // from class: ru.ozon.app.android.travel.actionhandler.modalParentRefresh.ModalParentRefreshActionHandler$processAction$lambda$0$$inlined$sharedViewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    ModalParentRefreshSharedViewModel modalParentRefreshSharedViewModel2 = (ModalParentRefreshSharedViewModel) a.this.get();
                    Intrinsics.g(modalParentRefreshSharedViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return modalParentRefreshSharedViewModel2;
                }
            }).a(ModalParentRefreshSharedViewModel.class);
            refs.getNavigator().popBackStack();
            ModalParentRefreshSharedViewModel.sendRefresh$default(modalParentRefreshSharedViewModel, ((AtomAction.DismissRefresh) action).getLink(), null, 2, null);
        }
    }
}
