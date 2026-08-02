package zendesk.core;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
interface PushDeviceIdStorage {
    PushRegistrationRequest getPushRegistrationRequest();

    String getRegisteredDeviceId();

    boolean hasRegisteredDeviceId();

    void removePushRegistrationRequest();

    void removeRegisteredDeviceId();

    void storePushRegistrationRequest(@NonNull PushRegistrationRequest pushRegistrationRequest);

    void storeRegisteredDeviceId(@NonNull String str);
}
