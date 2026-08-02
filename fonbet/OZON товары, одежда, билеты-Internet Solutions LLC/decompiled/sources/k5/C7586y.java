package k5;

import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* renamed from: k5.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7586y extends D0<String> implements InterfaceC7500c0<String> {

    /* renamed from: g, reason: collision with root package name */
    private static final long f70888g = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final AbstractC7520h0 f70889e;

    /* renamed from: f, reason: collision with root package name */
    private final TelephonyManager f70890f;

    C7586y(@NonNull AbstractC7520h0 abstractC7520h0, TelephonyManager telephonyManager) {
        super(Mm0.e.SimCard);
        this.f70889e = abstractC7520h0;
        this.f70890f = telephonyManager;
    }

    @Override // k5.InterfaceC7500c0
    @NonNull
    public final AbstractC7520h0 f() {
        return this.f70889e;
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        TelephonyManager telephonyManager = this.f70890f;
        if (telephonyManager == null) {
            throw new C7571u0("Telephony not supported by the hardware.");
        }
        String p11 = p(f70888g);
        if (p11 != null) {
            return p11;
        }
        int supportedModemCount = Build.VERSION.SDK_INT >= 30 ? telephonyManager.getSupportedModemCount() : telephonyManager.getPhoneCount();
        int i11 = 0;
        for (int i12 = 0; i12 < supportedModemCount; i12++) {
            int simState = telephonyManager.getSimState(i12);
            if (simState == 2 || simState == 3 || simState == 4 || simState == 5) {
                i11++;
            }
        }
        String valueOf = String.valueOf(i11);
        a(valueOf);
        return valueOf;
    }
}
