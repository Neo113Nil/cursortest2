package k5;

import android.content.Context;
import android.os.SystemClock;
import android.telephony.CellInfo;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: k5.I, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C7490I implements t3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f70574a;

    /* renamed from: b, reason: collision with root package name */
    private final int f70575b;

    /* renamed from: c, reason: collision with root package name */
    private final M1 f70576c;

    /* renamed from: d, reason: collision with root package name */
    private Z2 f70577d;

    C7490I(@NonNull Context context, int i11, @NonNull Gc.g gVar, @NonNull M1 m12) {
        this.f70574a = context;
        this.f70575b = i11;
        this.f70576c = m12;
    }

    public final ServiceState a() {
        Context context = this.f70574a;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            int i11 = this.f70575b;
            if (i11 != -1) {
                telephonyManager = telephonyManager.createForSubscriptionId(i11);
            }
        } else {
            telephonyManager = null;
        }
        if (telephonyManager != null && this.f70577d == null) {
            this.f70577d = new Z2(context, telephonyManager);
        }
        Z2 z22 = this.f70577d;
        if (z22 != null) {
            return z22.d();
        }
        return null;
    }

    @NonNull
    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        TelephonyManager telephonyManager = (TelephonyManager) this.f70574a.getSystemService("phone");
        if (telephonyManager != null) {
            int i11 = this.f70575b;
            if (i11 != -1) {
                telephonyManager = telephonyManager.createForSubscriptionId(i11);
            }
        } else {
            telephonyManager = null;
        }
        if (telephonyManager != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator<CellInfo> it = c(telephonyManager).iterator();
            while (it.hasNext()) {
                InterfaceC7496b0 b11 = C7593z2.b(it.next(), elapsedRealtime, currentTimeMillis);
                if (b11 != null && ((A2) this.f70576c).a(b11)) {
                    arrayList.add(b11);
                }
            }
        }
        return arrayList;
    }

    @NonNull
    protected List<CellInfo> c(@NonNull TelephonyManager telephonyManager) {
        List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
        return allCellInfo == null ? new ArrayList() : allCellInfo;
    }
}
