package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class txo extends xkn implements IInterface {
    public txo() {
        super("com.google.android.gms.ads.signalsdk.ISignalSdkCallback");
    }

    public abstract void F(Bundle bundle);

    @Override // defpackage.xkn
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Bundle bundle = (Bundle) avo.a(parcel, Bundle.CREATOR);
            avo.c(parcel);
            F(bundle);
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

    public abstract void k(int i);
}
