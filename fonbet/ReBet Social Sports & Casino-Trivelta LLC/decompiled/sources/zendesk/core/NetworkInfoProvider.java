package zendesk.core;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public interface NetworkInfoProvider {
    void addNetworkAwareListener(@NonNull Integer num, @NonNull NetworkAware networkAware);

    void addRetryAction(@NonNull Integer num, @NonNull RetryAction retryAction);

    void clearNetworkAwareListeners();

    void clearRetryActions();

    boolean isNetworkAvailable();

    void register();

    void removeNetworkAwareListener(@NonNull Integer num);

    void removeRetryAction(@NonNull Integer num);

    void unregister();
}
