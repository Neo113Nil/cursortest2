package zendesk.core;

import androidx.annotation.NonNull;
import md.e;

/* loaded from: classes5.dex */
public interface PushRegistrationProvider {
    boolean isRegisteredForPush();

    void registerWithDeviceIdentifier(@NonNull String str, e eVar);

    void registerWithUAChannelId(@NonNull String str, e eVar);

    void unregisterDevice(e eVar);
}
