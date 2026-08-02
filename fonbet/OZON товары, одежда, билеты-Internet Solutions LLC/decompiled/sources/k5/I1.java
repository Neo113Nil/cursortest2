package k5;

import android.telephony.ServiceState;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class I1 extends O2 {

    /* renamed from: a, reason: collision with root package name */
    private final W2 f70584a;

    I1(W2 w22) {
        this.f70584a = w22;
    }

    public final void onServiceStateChanged(@NonNull ServiceState serviceState) {
        Z2.a(this.f70584a.f70669a, serviceState);
    }
}
