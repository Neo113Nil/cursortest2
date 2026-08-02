package k5;

import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class Q extends D0<String> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70628e;

    /* renamed from: f, reason: collision with root package name */
    private final TelephonyManager f70629f;

    Q(@NonNull Context context, TelephonyManager telephonyManager) {
        super(Mm0.e.PhoneNumber);
        this.f70628e = context;
        this.f70629f = telephonyManager;
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        TelephonyManager telephonyManager = this.f70629f;
        if (telephonyManager == null) {
            throw new P2("tel == null");
        }
        String a11 = EnumC7578w.READ_PHONE_STATE.a();
        Context context = this.f70628e;
        if (!Gf.d.l(context, a11) || !Gf.d.l(context, EnumC7578w.READ_PHONE_NUMBERS.a())) {
            throw new P2("permission not granted");
        }
        String line1Number = telephonyManager.getLine1Number();
        if (line1Number != null) {
            return line1Number;
        }
        throw new P2("phoneNumber == null");
    }
}
