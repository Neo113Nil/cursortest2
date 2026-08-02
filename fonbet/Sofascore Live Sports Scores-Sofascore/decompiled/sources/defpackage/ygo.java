package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.wearable.zzc;
import com.google.android.gms.wearable.internal.zzf;
import com.google.android.gms.wearable.internal.zzgq;
import com.google.android.gms.wearable.internal.zzko;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ygo {
    public final HashMap a = new HashMap();

    public final void a(IBinder iBinder) {
        zzgq zzgqVar;
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            if (iBinder == null) {
                zzgqVar = null;
            } else {
                try {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                    zzgqVar = queryLocalInterface instanceof zzgq ? (zzgq) queryLocalInterface : new zzgq(iBinder);
                } catch (Throwable th) {
                    throw th;
                }
            }
            cto ctoVar = new cto();
            for (Map.Entry entry : hashMap.entrySet()) {
                zzko zzkoVar = (zzko) entry.getValue();
                try {
                    zzf zzfVar = new zzf(zzkoVar);
                    Parcel S1 = zzgqVar.S1();
                    zzc.b(S1, ctoVar);
                    S1.writeInt(1);
                    zzfVar.writeToParcel(S1, 0);
                    zzgqVar.J(S1, 16);
                    if (Log.isLoggable("WearableClient", 3)) {
                        new StringBuilder(String.valueOf(entry.getKey()).length() + 27 + String.valueOf(zzkoVar).length());
                    }
                } catch (RemoteException unused) {
                    new StringBuilder(String.valueOf(entry.getKey()).length() + 32 + String.valueOf(zzkoVar).length());
                }
            }
        }
    }
}
