package com.google.android.gms.internal.pal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ljg;
import defpackage.oko;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzgs extends zzfk implements zzgt {
    public zzgs() {
        super("com.google.android.gms.ads.signalsdk.ISignalSdkCallback");
    }

    @Override // com.google.android.gms.internal.pal.zzfk
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int readInt = parcel.readInt();
            zzfl.a(parcel);
            ((oko) this).a.trySetException(new zzgy(ljg.j(readInt, "Signal SDK error code: ")));
            return true;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i2 = zzfl.a;
        Parcelable parcelable = parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel);
        zzfl.a(parcel);
        ((oko) this).a.trySetResult(((Bundle) parcelable).getString("newToken"));
        return true;
    }
}
