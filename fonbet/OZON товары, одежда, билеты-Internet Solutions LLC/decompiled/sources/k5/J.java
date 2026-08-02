package k5;

import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import java.util.HashSet;

/* loaded from: classes8.dex */
final class J extends D0<String> implements InterfaceC7542m2, InterfaceC7580w1 {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70586e;

    /* renamed from: f, reason: collision with root package name */
    private final TelephonyManager f70587f;

    J(@NonNull Context context, TelephonyManager telephonyManager) {
        super(Mm0.e.SIM_ID);
        this.f70586e = context;
        this.f70587f = telephonyManager;
    }

    @Override // k5.InterfaceC7542m2
    @NonNull
    public final Context b() {
        return this.f70586e;
    }

    @Override // k5.InterfaceC7542m2
    @NonNull
    public final HashSet r() {
        return C7540m0.a(EnumC7578w.READ_PHONE_STATE);
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        TelephonyManager telephonyManager = this.f70587f;
        if (telephonyManager == null) {
            throw new P2("tel == null");
        }
        String subscriberId = telephonyManager.getSubscriberId();
        if (subscriberId != null) {
            return subscriberId;
        }
        throw new P2("subscriberId == null");
    }

    @Override // k5.InterfaceC7580w1
    public final int z() {
        return 28;
    }
}
