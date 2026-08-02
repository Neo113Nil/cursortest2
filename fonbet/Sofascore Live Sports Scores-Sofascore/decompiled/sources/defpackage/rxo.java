package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.ads.interactivemedia.v3.internal.zzmu;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class rxo extends xkn implements IInterface {
    public rxo() {
        super("com.google.android.gms.ads.signalsdk.INetworkRequestCallback");
    }

    @Override // defpackage.xkn
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            zzmu zzmuVar = (zzmu) avo.a(parcel, zzmu.CREATOR);
            avo.c(parcel);
            S1(zzmuVar);
            return true;
        }
        if (i != 2) {
            return false;
        }
        int readInt = parcel.readInt();
        avo.c(parcel);
        k(readInt);
        return true;
    }

    public abstract void S1(zzmu zzmuVar);

    public abstract void k(int i);
}
