package k5;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import androidx.annotation.NonNull;
import java.util.HashSet;

/* loaded from: classes8.dex */
final class M2 extends D0<String> implements InterfaceC7542m2 {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70606e;

    /* renamed from: f, reason: collision with root package name */
    private final TelephonyManager f70607f;

    M2(@NonNull Context context, TelephonyManager telephonyManager) {
        super(Mm0.e.LocationAreaCode);
        this.f70606e = context;
        this.f70607f = telephonyManager;
    }

    @Override // k5.InterfaceC7542m2
    @NonNull
    public final Context b() {
        return this.f70606e;
    }

    @Override // k5.InterfaceC7542m2
    @NonNull
    public final HashSet r() {
        return C7540m0.a(EnumC7578w.ACCESS_FINE_LOCATION);
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        TelephonyManager telephonyManager = this.f70607f;
        if (telephonyManager == null) {
            throw new C7571u0("mTelephonyManager == null");
        }
        try {
            try {
                GsmCellLocation gsmCellLocation = (GsmCellLocation) telephonyManager.getCellLocation();
                if (gsmCellLocation == null) {
                    throw new C7571u0("gsmCellLocation == null");
                }
                int lac = gsmCellLocation.getLac();
                if (lac != -1) {
                    return String.valueOf(lac);
                }
                throw new C7571u0("lac == -1 == unknown");
            } catch (Exception e11) {
                throw new C7571u0(e11.getMessage());
            }
        } catch (Exception unused) {
            CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) telephonyManager.getCellLocation();
            if (cdmaCellLocation == null) {
                throw new C7571u0("cdmaCellLocation == null");
            }
            int networkId = cdmaCellLocation.getNetworkId();
            if (networkId != -1) {
                return String.valueOf(networkId);
            }
            throw new C7571u0("lac == -1 == unknown");
        }
    }
}
