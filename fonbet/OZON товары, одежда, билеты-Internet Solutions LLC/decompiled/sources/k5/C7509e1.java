package k5;

import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import java.util.HashSet;

/* renamed from: k5.e1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7509e1 extends D0<String> implements InterfaceC7542m2, InterfaceC7580w1 {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70731e;

    /* renamed from: f, reason: collision with root package name */
    private final TelephonyManager f70732f;

    C7509e1(@NonNull Context context, TelephonyManager telephonyManager) {
        super(Mm0.e.HardwareID);
        this.f70731e = context;
        this.f70732f = telephonyManager;
    }

    @Override // k5.InterfaceC7542m2
    @NonNull
    public final Context b() {
        return this.f70731e;
    }

    @Override // k5.InterfaceC7542m2
    @NonNull
    public final HashSet r() {
        return C7540m0.a(EnumC7578w.READ_PHONE_STATE);
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        TelephonyManager telephonyManager = this.f70732f;
        if (telephonyManager == null) {
            throw new P2("tel == null");
        }
        String deviceId = telephonyManager.getDeviceId();
        if (deviceId != null) {
            return deviceId;
        }
        throw new P2("deviceId == null");
    }

    @Override // k5.InterfaceC7580w1
    public final int z() {
        return 28;
    }
}
