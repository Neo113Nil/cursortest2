package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class j0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) E9.a.p(parcel, E10, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    z10 = E9.a.x(parcel, E10);
                    break;
                case 3:
                    z11 = E9.a.x(parcel, E10);
                    break;
                case 4:
                    iArr = E9.a.k(parcel, E10);
                    break;
                case 5:
                    i10 = E9.a.G(parcel, E10);
                    break;
                case 6:
                    iArr2 = E9.a.k(parcel, E10);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z10, z11, iArr, i10, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ConnectionTelemetryConfiguration[i10];
    }
}
