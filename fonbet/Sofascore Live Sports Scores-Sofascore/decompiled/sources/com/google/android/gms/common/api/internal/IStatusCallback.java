package com.google.android.gms.common.api.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface IStatusCallback extends IInterface {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class Stub extends com.google.android.gms.internal.base.zab implements IStatusCallback {
        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @Override // com.google.android.gms.internal.base.zab
        public final boolean S1(int i, Parcel parcel, Parcel parcel2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) com.google.android.gms.internal.base.zac.a(parcel, Status.CREATOR);
            com.google.android.gms.internal.base.zac.c(parcel);
            I2(status);
            return true;
        }
    }

    void I2(Status status);
}
