package k5;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;

/* loaded from: classes8.dex */
final class Y2 extends PhoneStateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Z2 f70679a;

    Y2(Z2 z22) {
        this.f70679a = z22;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        Z2.g(this.f70679a, serviceState);
    }
}
