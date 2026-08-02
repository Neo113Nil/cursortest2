package ru.ozon.app.android.search.dialogsearchscreen.withTopFilters;

import W10.c;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.search.dialogsearchscreen.DialogSearchViewModel;
import ru.ozon.app.android.search.widgets.dialogSearchBar.di.DialogSearchBarComponent;
import ru.ozon.app.android.storefront.actionHandlers.SearchRedirectToGlobalActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/SearchRedirectToGlobalActionHandlerImpl;", "Lru/ozon/app/android/storefront/actionHandlers/SearchRedirectToGlobalActionHandler;", "<init>", "()V", "actionId", "", "getActionId", "()Ljava/lang/String;", "processAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchRedirectToGlobalActionHandlerImpl extends SearchRedirectToGlobalActionHandler {

    @NotNull
    private final String actionId = "search.redirectToGlobal";

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Map<String, String> params;
        String str;
        Integer w02;
        String str2;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        final DialogSearchBarComponent dialogSearchBarComponent = (DialogSearchBarComponent) handlerRefs.getRefs().getWidgetComponent(DialogSearchBarComponent.class);
        DialogSearchViewModel dialogSearchViewModel = (DialogSearchViewModel) new z0(handlerRefs.getRefs().getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.SearchRedirectToGlobalActionHandlerImpl$processAction$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                DialogSearchViewModel viewModel = DialogSearchBarComponent.this.getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(DialogSearchViewModel.class);
        if (!(action instanceof AtomAction.Click) || (params = ((AtomAction.Click) action).getParams()) == null || (str = params.get("minTextLength")) == null || (w02 = h.w0(str)) == null) {
            return;
        }
        int intValue = w02.intValue();
        String str3 = params.get("searchURLTemplate");
        if (str3 == null || (str2 = params.get("suggestURL")) == null) {
            return;
        }
        String str4 = params.get("searchCellToken");
        c trackingData = handlerRefs.getTrackingData();
        dialogSearchViewModel.handleRedirectToGlobalAction(intValue, str3, str2, str4, trackingData != null ? trackingData.d() : null);
    }
}
