package ru.ozon.app.android.common.actionHandlers.removeSuggestion;

import androidx.lifecycle.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/removeSuggestion/RemoveSuggestionActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "searchHistoryApi", "Lru/ozon/app/android/common/actionHandlers/removeSuggestion/RemoveSuggestionApi;", "<init>", "(Lru/ozon/app/android/common/actionHandlers/removeSuggestion/RemoveSuggestionApi;)V", "actionId", "", "getActionId", "()Ljava/lang/String;", "processAction", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "handlerRefs", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RemoveSuggestionActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final RemoveSuggestionApi searchHistoryApi;

    public RemoveSuggestionActionHandler(@NotNull RemoveSuggestionApi searchHistoryApi) {
        Intrinsics.checkNotNullParameter(searchHistoryApi, "searchHistoryApi");
        this.searchHistoryApi = searchHistoryApi;
        this.actionId = "deleteSearchHistory";
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
        Map<String, String> params2;
        String str2;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (!(action instanceof AtomAction.ComposerAction) || (params = (composerAction = (AtomAction.ComposerAction) action).getParams()) == null || (str = params.get("text")) == null || (params2 = composerAction.getParams()) == null || (str2 = params2.get("context")) == null) {
            return;
        }
        ComposerReferences refs = handlerRefs.getRefs();
        String id2 = composerAction.getId();
        if (id2 != null) {
            C10727i.c(K.a(refs.getContainer().f()), null, null, new RemoveSuggestionActionHandler$processAction$1$1(this, id2, str2, str, refs, null), 3);
        }
    }
}
