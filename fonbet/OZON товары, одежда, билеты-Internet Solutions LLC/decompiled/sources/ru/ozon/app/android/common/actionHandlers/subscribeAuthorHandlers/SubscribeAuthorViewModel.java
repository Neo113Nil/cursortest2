package ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers;

import W10.c;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.storage.subscribeAuthor.SubscribeAuthorsIdStorage;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.B0;
import xe.C10727i;
import xe.J;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 62\u00020\u0001:\u00016B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0017\u001a\u00020\u0016*\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001fR\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020%0 8\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001fR\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020)0 8\u0006¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010$R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104¨\u00067"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/subscribeAuthorHandlers/SubscribeAuthorViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "subscribeAuthorsIdStorage", "<init>", "(Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;)V", "", "authorId", "", "revertSubscription", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "LW10/c;", "trackingData", "processSubscribeAction", "(Lru/ozon/uni/atoms/af/AtomAction;LW10/c;)V", "Lru/ozon/app/android/common/actionHandlers/subscribeAuthorHandlers/SubscribeAuthorActionDTO;", "Lru/ozon/app/android/common/actionHandlers/subscribeAuthorHandlers/SubscribeAuthorActionVO;", "toVO", "(Lru/ozon/app/android/common/actionHandlers/subscribeAuthorHandlers/SubscribeAuthorActionDTO;)Lru/ozon/app/android/common/actionHandlers/subscribeAuthorHandlers/SubscribeAuthorActionVO;", "Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/storage/subscribeAuthor/SubscribeAuthorsIdStorage;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/common/actionHandlers/subscribeAuthorHandlers/SubscriptionSuccessAction;", "_successResponse", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/P;", "actionResponse", "Landroidx/lifecycle/P;", "getActionResponse", "()Landroidx/lifecycle/P;", "Lru/ozon/app/android/common/actionHandlers/subscribeAuthorHandlers/SubscriptionFailureAction;", "_revertAction", "revertAction", "getRevertAction", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "_successNotify", "successNotify", "getSuccessNotify", "Lxe/B0;", "mainJob", "Lxe/B0;", "Lxe/J;", "exceptionHandler", "Lxe/J;", "currentAuthorId", "Ljava/lang/String;", "currentActionId", "Companion", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SubscribeAuthorViewModel extends w0 {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final SingleLiveEvent<SubscriptionFailureAction> _revertAction;

    @NotNull
    private final SingleLiveEvent<NotificationDTO> _successNotify;

    @NotNull
    private final SingleLiveEvent<SubscriptionSuccessAction> _successResponse;

    @NotNull
    private final P<SubscriptionSuccessAction> actionResponse;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final AppType appType;
    private String currentActionId;
    private String currentAuthorId;

    @NotNull
    private final J exceptionHandler;
    private B0 mainJob;

    @NotNull
    private final P<SubscriptionFailureAction> revertAction;

    @NotNull
    private final SubscribeAuthorsIdStorage subscribeAuthorsIdStorage;

    @NotNull
    private final P<NotificationDTO> successNotify;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/subscribeAuthorHandlers/SubscribeAuthorViewModel$Companion;", "", "<init>", "()V", "PARAM_AUTHOR_ID", "", "ACTION_ID_SUBSCRIBE", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SubscribeAuthorViewModel(@NotNull AppType appType, @NotNull ActionV2Repository actionV2Repository, @NotNull SubscribeAuthorsIdStorage subscribeAuthorsIdStorage) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(subscribeAuthorsIdStorage, "subscribeAuthorsIdStorage");
        this.appType = appType;
        this.actionV2Repository = actionV2Repository;
        this.subscribeAuthorsIdStorage = subscribeAuthorsIdStorage;
        SingleLiveEvent<SubscriptionSuccessAction> singleLiveEvent = new SingleLiveEvent<>();
        this._successResponse = singleLiveEvent;
        this.actionResponse = singleLiveEvent;
        SingleLiveEvent<SubscriptionFailureAction> singleLiveEvent2 = new SingleLiveEvent<>();
        this._revertAction = singleLiveEvent2;
        this.revertAction = singleLiveEvent2;
        SingleLiveEvent<NotificationDTO> singleLiveEvent3 = new SingleLiveEvent<>();
        this._successNotify = singleLiveEvent3;
        this.successNotify = singleLiveEvent3;
        this.exceptionHandler = new SubscribeAuthorViewModel$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void revertSubscription(String authorId) {
        if (this.subscribeAuthorsIdStorage.isAuthorSubscribed(authorId) != null) {
            this.subscribeAuthorsIdStorage.setAuthorSubscription(authorId, !r0.booleanValue());
        }
    }

    @NotNull
    public final P<SubscriptionSuccessAction> getActionResponse() {
        return this.actionResponse;
    }

    @NotNull
    public final P<SubscriptionFailureAction> getRevertAction() {
        return this.revertAction;
    }

    @NotNull
    public final P<NotificationDTO> getSuccessNotify() {
        return this.successNotify;
    }

    public final void processSubscribeAction(@NotNull AtomAction atomAction, c trackingData) {
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        AtomAction.Click click = atomAction instanceof AtomAction.Click ? (AtomAction.Click) atomAction : null;
        if (click == null) {
            return;
        }
        Map<String, String> params = ((AtomAction.Click) atomAction).getParams();
        this.currentAuthorId = params != null ? params.get("authorId") : null;
        this.currentActionId = click.getId();
        String str = this.currentAuthorId;
        if (str == null) {
            return;
        }
        B0 b02 = this.mainJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.mainJob = C10727i.c(x0.a(this), this.exceptionHandler, null, new SubscribeAuthorViewModel$processSubscribeAction$1(this, str, click, trackingData, null), 2);
    }

    @NotNull
    public final SubscribeAuthorActionVO toVO(@NotNull SubscribeAuthorActionDTO subscribeAuthorActionDTO) {
        Intrinsics.checkNotNullParameter(subscribeAuthorActionDTO, "<this>");
        return new SubscribeAuthorActionVO(this.currentActionId, subscribeAuthorActionDTO.getAuthorId(), subscribeAuthorActionDTO.getNotification() == null, subscribeAuthorActionDTO.getNotification(), subscribeAuthorActionDTO.getSuccessNotification());
    }
}
