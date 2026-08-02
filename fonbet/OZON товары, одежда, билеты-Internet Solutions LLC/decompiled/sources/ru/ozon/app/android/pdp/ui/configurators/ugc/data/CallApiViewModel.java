package ru.ozon.app.android.pdp.ui.configurators.ugc.data;

import androidx.lifecycle.P;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.CallApiViewModelImpl;
import ru.ozon.tracker.model.TrinityEventEntityKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J=\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH&¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModel;", "", "", "id", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", "actionName", "", "params", "", "proceedComposerAction", "(JLru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;Ljava/lang/String;Ljava/util/Map;)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl$Action;", "getActionLiveData", "()Landroidx/lifecycle/P;", "actionLiveData", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface CallApiViewModel {
    @NotNull
    P<CallApiViewModelImpl.Action> getActionLiveData();

    void proceedComposerAction(long id2, @NotNull ActionType actionType, @NotNull String actionName, Map<String, String> params);
}
