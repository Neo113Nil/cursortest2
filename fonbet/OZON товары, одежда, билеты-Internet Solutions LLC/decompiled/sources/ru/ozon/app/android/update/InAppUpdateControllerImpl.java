package ru.ozon.app.android.update;

import android.app.Activity;
import android.os.Bundle;
import androidx.activity.ActivityC5043j;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.update.InAppUpdateController;
import ru.ozon.app.android.update.InAppUpdateRepository;
import ru.ozon.app.android.update.analytics.InAppUpdateAnalyticsDelegate;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001bB!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/update/InAppUpdateControllerImpl;", "Lru/ozon/app/android/update/InAppUpdateController;", "inAppUpdateIntervalStorage", "Lru/ozon/app/android/update/InAppUpdateIntervalStorage;", "inAppUpdateRepository", "Lru/ozon/app/android/update/InAppUpdateRepository;", "inAppUpdateAnalyticsDelegate", "Lru/ozon/app/android/update/analytics/InAppUpdateAnalyticsDelegate;", "<init>", "(Lru/ozon/app/android/update/InAppUpdateIntervalStorage;Lru/ozon/app/android/update/InAppUpdateRepository;Lru/ozon/app/android/update/analytics/InAppUpdateAnalyticsDelegate;)V", "event", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/update/InAppUpdateControllerImpl$StateMessage;", "startUpdate", "", "activity", "Landroid/app/Activity;", "info", "Lru/ozon/app/android/update/InAppUpdateInfo;", "handleResult", "requestCode", "", "resultCode", "getUpdateState", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "StateMessage", "in-app-update_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InAppUpdateControllerImpl implements InAppUpdateController {

    @NotNull
    private final SingleLiveEvent<StateMessage> event;

    @NotNull
    private final InAppUpdateAnalyticsDelegate inAppUpdateAnalyticsDelegate;

    @NotNull
    private final InAppUpdateIntervalStorage inAppUpdateIntervalStorage;

    @NotNull
    private final InAppUpdateRepository inAppUpdateRepository;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/update/InAppUpdateControllerImpl$StateMessage;", "", "<init>", "()V", "ErrorMessage", "SuccessMessage", "Lru/ozon/app/android/update/InAppUpdateControllerImpl$StateMessage$ErrorMessage;", "Lru/ozon/app/android/update/InAppUpdateControllerImpl$StateMessage$SuccessMessage;", "in-app-update_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static abstract class StateMessage {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/update/InAppUpdateControllerImpl$StateMessage$ErrorMessage;", "Lru/ozon/app/android/update/InAppUpdateControllerImpl$StateMessage;", "Lru/ozon/app/android/update/InAppUpdateType;", "type", "<init>", "(Lru/ozon/app/android/update/InAppUpdateType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/update/InAppUpdateType;", "getType", "()Lru/ozon/app/android/update/InAppUpdateType;", "in-app-update_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ErrorMessage extends StateMessage {

            @NotNull
            private final InAppUpdateType type;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ErrorMessage(@NotNull InAppUpdateType type) {
                super(null);
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ErrorMessage) && this.type == ((ErrorMessage) other).type;
            }

            @NotNull
            public final InAppUpdateType getType() {
                return this.type;
            }

            public int hashCode() {
                return this.type.hashCode();
            }

            @NotNull
            public String toString() {
                return "ErrorMessage(type=" + this.type + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/update/InAppUpdateControllerImpl$StateMessage$SuccessMessage;", "Lru/ozon/app/android/update/InAppUpdateControllerImpl$StateMessage;", "Lru/ozon/app/android/update/InAppUpdateType;", "type", "<init>", "(Lru/ozon/app/android/update/InAppUpdateType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/update/InAppUpdateType;", "getType", "()Lru/ozon/app/android/update/InAppUpdateType;", "in-app-update_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SuccessMessage extends StateMessage {

            @NotNull
            private final InAppUpdateType type;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SuccessMessage(@NotNull InAppUpdateType type) {
                super(null);
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SuccessMessage) && this.type == ((SuccessMessage) other).type;
            }

            @NotNull
            public final InAppUpdateType getType() {
                return this.type;
            }

            public int hashCode() {
                return this.type.hashCode();
            }

            @NotNull
            public String toString() {
                return "SuccessMessage(type=" + this.type + ")";
            }
        }

        public /* synthetic */ StateMessage(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateMessage() {
        }
    }

    public InAppUpdateControllerImpl(@NotNull InAppUpdateIntervalStorage inAppUpdateIntervalStorage, @NotNull InAppUpdateRepository inAppUpdateRepository, @NotNull InAppUpdateAnalyticsDelegate inAppUpdateAnalyticsDelegate) {
        Intrinsics.checkNotNullParameter(inAppUpdateIntervalStorage, "inAppUpdateIntervalStorage");
        Intrinsics.checkNotNullParameter(inAppUpdateRepository, "inAppUpdateRepository");
        Intrinsics.checkNotNullParameter(inAppUpdateAnalyticsDelegate, "inAppUpdateAnalyticsDelegate");
        this.inAppUpdateIntervalStorage = inAppUpdateIntervalStorage;
        this.inAppUpdateRepository = inAppUpdateRepository;
        this.inAppUpdateAnalyticsDelegate = inAppUpdateAnalyticsDelegate;
        this.event = new SingleLiveEvent<>();
        inAppUpdateRepository.setResultListener(new InAppUpdateRepository.InAppUpdateResultListener() { // from class: ru.ozon.app.android.update.InAppUpdateControllerImpl.1
            @Override // ru.ozon.app.android.update.InAppUpdateRepository.InAppUpdateResultListener
            public void onFailure(InAppUpdateType type) {
                Intrinsics.checkNotNullParameter(type, "type");
                InAppUpdateControllerImpl.this.event.postValue(new StateMessage.ErrorMessage(type));
            }

            @Override // ru.ozon.app.android.update.InAppUpdateRepository.InAppUpdateResultListener
            public void onSuccess(InAppUpdateType type) {
                Intrinsics.checkNotNullParameter(type, "type");
                InAppUpdateControllerImpl.this.event.postValue(new StateMessage.SuccessMessage(type));
            }
        });
    }

    @Override // ru.ozon.app.android.update.InAppUpdateController
    public InAppUpdateInfo getUpdateState() {
        if (this.inAppUpdateIntervalStorage.canUpdate()) {
            return this.inAppUpdateRepository.getUpdateState();
        }
        return null;
    }

    @Override // ru.ozon.app.android.update.InAppUpdateController
    public void handleResult(int requestCode, int resultCode) {
        this.inAppUpdateRepository.handleResult(requestCode, resultCode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof ActivityC5043j) {
            this.event.observe((J) activity, new InAppUpdateControllerImpl$sam$androidx_lifecycle_Observer$0(new InAppUpdateControllerImpl$onActivityCreated$1(this, activity)));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        InAppUpdateController.DefaultImpls.onActivityDestroyed(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        InAppUpdateController.DefaultImpls.onActivityPaused(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        InAppUpdateController.DefaultImpls.onActivityResumed(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        InAppUpdateController.DefaultImpls.onActivitySaveInstanceState(this, activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        InAppUpdateController.DefaultImpls.onActivityStarted(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        InAppUpdateController.DefaultImpls.onActivityStopped(this, activity);
    }

    @Override // ru.ozon.app.android.update.InAppUpdateController
    public void startUpdate(@NotNull Activity activity, @NotNull InAppUpdateInfo info) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(info, "info");
        this.inAppUpdateRepository.startUpdate(activity, info);
    }
}
