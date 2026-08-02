package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation;

import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.utils.livedata.BroadcastSingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00188\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "", "actionName", "", "isChecked", "", "oldParams", "Lru/ozon/app/android/action/v2/models/ActionV2Request;", "prepareRequest", "(Ljava/lang/String;ZLjava/util/Map;)Lru/ozon/app/android/action/v2/models/ActionV2Request;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "checkboxClicked", "(Lru/ozon/uni/atoms/af/AtomAction;Z)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "_revertLiveData", "Lru/ozon/app/android/utils/livedata/BroadcastSingleLiveEvent;", "Landroidx/lifecycle/P;", "revertLiveData", "Landroidx/lifecycle/P;", "getRevertLiveData", "()Landroidx/lifecycle/P;", "_newStateLiveData", "newStateLiveData", "getNewStateLiveData", "Lxe/B0;", "setCheckboxJob", "Lxe/B0;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSubscriptionViewModel extends w0 {

    @NotNull
    private final BroadcastSingleLiveEvent<Boolean> _newStateLiveData;

    @NotNull
    private final BroadcastSingleLiveEvent<Unit> _revertLiveData;

    @NotNull
    private final P<Boolean> newStateLiveData;

    @NotNull
    private final ActionV2Repository repository;

    @NotNull
    private final P<Unit> revertLiveData;
    private B0 setCheckboxJob;

    public NotificationSubscriptionViewModel(@NotNull ActionV2Repository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        BroadcastSingleLiveEvent<Unit> broadcastSingleLiveEvent = new BroadcastSingleLiveEvent<>();
        this._revertLiveData = broadcastSingleLiveEvent;
        this.revertLiveData = broadcastSingleLiveEvent;
        BroadcastSingleLiveEvent<Boolean> broadcastSingleLiveEvent2 = new BroadcastSingleLiveEvent<>();
        this._newStateLiveData = broadcastSingleLiveEvent2;
        this.newStateLiveData = broadcastSingleLiveEvent2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActionV2Request prepareRequest(String actionName, boolean isChecked, Map<String, String> oldParams) {
        if (oldParams == null) {
            oldParams = U.c();
        }
        HashMap hashMap = new HashMap(oldParams);
        hashMap.put("isChecked", Boolean.valueOf(isChecked));
        return new ActionV2Request(hashMap, actionName, false, 4, null);
    }

    public final void checkboxClicked(AtomAction action, boolean isChecked) {
        if (action instanceof AtomAction.ComposerAction) {
            B0 b02 = this.setCheckboxJob;
            if (b02 != null) {
                b02.j(null);
            }
            this.setCheckboxJob = C10727i.c(x0.a(this), null, null, new NotificationSubscriptionViewModel$checkboxClicked$1(this, isChecked, action, null), 3);
        }
    }

    @NotNull
    public final P<Boolean> getNewStateLiveData() {
        return this.newStateLiveData;
    }

    @NotNull
    public final P<Unit> getRevertLiveData() {
        return this.revertLiveData;
    }
}
