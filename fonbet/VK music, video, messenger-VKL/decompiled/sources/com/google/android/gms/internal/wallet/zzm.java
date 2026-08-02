package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes12.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzp();
    private String[] zzem;
    private int[] zzen;
    private RemoteViews zzeo;
    private byte[] zzep;

    public zzm(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.zzem = strArr;
        this.zzen = iArr;
        this.zzeo = remoteViews;
        this.zzep = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.r(parcel, 1, this.zzem, false);
        ozg0.i(parcel, 2, this.zzen, false);
        ozg0.p(parcel, 3, this.zzeo, i, false);
        ozg0.e(parcel, 4, this.zzep, false);
        ozg0.x(w, parcel);
    }

    private zzm() {
    }
}
