package org.chromium.net;

import org.chromium.base.ApplicationStatus;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* loaded from: classes10.dex */
public final class x extends NetworkChangeNotifierAutoDetect.h implements ApplicationStatus.b {

    /* renamed from: b, reason: collision with root package name */
    private boolean f78960b;

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.h
    protected final void a() {
        if (this.f78960b) {
            return;
        }
        ApplicationStatus.e(this);
        this.f78960b = true;
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.h
    protected final void b(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        super.b(networkChangeNotifierAutoDetect);
        ApplicationStatus.d(this);
        ApplicationStatus.getStateForApplication();
        d();
    }
}
