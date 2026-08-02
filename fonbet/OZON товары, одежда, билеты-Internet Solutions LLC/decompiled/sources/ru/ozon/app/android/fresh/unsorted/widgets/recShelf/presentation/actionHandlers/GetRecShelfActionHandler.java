package ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation.actionHandlers;

import BZ.e;
import BZ.f;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.di.RecShelfComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation.RecShelfViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/recShelf/presentation/actionHandlers/GetRecShelfActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "LBZ/e;", "miniAppConfigHolder", "<init>", "(LBZ/e;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "LBZ/e;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GetRecShelfActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final e miniAppConfigHolder;

    public GetRecShelfActionHandler(@NotNull e miniAppConfigHolder) {
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        this.miniAppConfigHolder = miniAppConfigHolder;
        this.actionId = "addRecShelf";
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull final CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.Click) {
            RecShelfViewModel recShelfViewModel = (RecShelfViewModel) new z0(handlerRefs.getRefs().getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation.actionHandlers.GetRecShelfActionHandler$processAction$$inlined$viewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    RecShelfViewModel recShelfViewModel2 = ((RecShelfComponent) CustomActionHandler.HandlerReferences.this.getRefs().getWidgetComponent(RecShelfComponent.class)).getViewModelProvider().get();
                    Intrinsics.g(recShelfViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return recShelfViewModel2;
                }
            }).a(RecShelfViewModel.class);
            Map<String, String> params = ((AtomAction.Click) action).getParams();
            if (params == null) {
                params = U.c();
            }
            recShelfViewModel.requestRecs(params, f.a(this.miniAppConfigHolder));
        }
    }
}
