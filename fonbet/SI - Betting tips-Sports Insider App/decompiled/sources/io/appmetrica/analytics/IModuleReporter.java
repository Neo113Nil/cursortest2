package io.appmetrica.analytics;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface IModuleReporter {
    void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z5);

    void reportEvent(@NonNull ModuleEvent moduleEvent);

    void sendEventsBuffer();

    void setSessionExtra(@NonNull String str, byte[] bArr);
}
