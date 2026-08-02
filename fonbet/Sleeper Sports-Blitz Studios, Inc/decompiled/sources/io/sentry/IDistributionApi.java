package io.sentry;

import java.util.concurrent.Future;

/* loaded from: classes9.dex */
public interface IDistributionApi {
    Future<UpdateStatus> checkForUpdate();

    UpdateStatus checkForUpdateBlocking();

    void downloadUpdate(UpdateInfo updateInfo);

    boolean isEnabled();
}
