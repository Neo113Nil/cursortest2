package org.chromium.net;

import org.chromium.base.ApplicationStatus;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* loaded from: classes10.dex */
public class RegistrationPolicyApplicationStatus extends NetworkChangeNotifierAutoDetect.RegistrationPolicy implements ApplicationStatus.ApplicationStateListener {
    private boolean mDestroyed;

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.RegistrationPolicy
    protected void init(NetworkChangeNotifierAutoDetect notifier) {
        super.init(notifier);
        ApplicationStatus.registerApplicationStateListener(this);
        onApplicationStateChange(0);
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.RegistrationPolicy
    protected void destroy() {
        if (this.mDestroyed) {
            return;
        }
        ApplicationStatus.unregisterApplicationStateListener(this);
        this.mDestroyed = true;
    }

    @Override // org.chromium.base.ApplicationStatus.ApplicationStateListener
    public void onApplicationStateChange(int newState) {
        if (ApplicationStatus.hasVisibleActivities()) {
            register();
        } else {
            unregister();
        }
    }
}
