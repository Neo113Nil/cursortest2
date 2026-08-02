package ru.ozon.app.android.update;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001:\u0001\u001cB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\n\u0010\f\u001a\u0004\u0018\u00010\rH&J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH&J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0010\u0010\u001a\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0000X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/update/InAppUpdateRepository;", "", "next", "<init>", "(Lru/ozon/app/android/update/InAppUpdateRepository;)V", "getNext", "()Lru/ozon/app/android/update/InAppUpdateRepository;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/update/InAppUpdateRepository$InAppUpdateResultListener;", "resultListener", "getResultListener", "()Lru/ozon/app/android/update/InAppUpdateRepository$InAppUpdateResultListener;", "getUpdateState", "Lru/ozon/app/android/update/InAppUpdateInfo;", "startUpdate", "", "activity", "Landroid/app/Activity;", "info", "completeUpdate", "type", "Lru/ozon/app/android/update/InAppUpdateType;", "handleResult", "requestCode", "", "resultCode", "setResultListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "InAppUpdateResultListener", "in-app-update_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class InAppUpdateRepository {
    private final InAppUpdateRepository next;
    private InAppUpdateResultListener resultListener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/update/InAppUpdateRepository$InAppUpdateResultListener;", "", "onSuccess", "", "type", "Lru/ozon/app/android/update/InAppUpdateType;", "onFailure", "in-app-update_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface InAppUpdateResultListener {
        void onFailure(@NotNull InAppUpdateType type);

        void onSuccess(@NotNull InAppUpdateType type);
    }

    public InAppUpdateRepository(InAppUpdateRepository inAppUpdateRepository) {
        this.next = inAppUpdateRepository;
    }

    public abstract void completeUpdate(@NotNull InAppUpdateType type);

    protected final InAppUpdateRepository getNext() {
        return this.next;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final InAppUpdateResultListener getResultListener() {
        return this.resultListener;
    }

    public abstract InAppUpdateInfo getUpdateState();

    public abstract void handleResult(int requestCode, int resultCode);

    public final void setResultListener(InAppUpdateResultListener listener) {
        this.resultListener = listener;
        InAppUpdateRepository inAppUpdateRepository = this.next;
        if (inAppUpdateRepository != null) {
            inAppUpdateRepository.setResultListener(listener);
        }
    }

    public abstract void startUpdate(@NotNull Activity activity, @NotNull InAppUpdateInfo info);
}
