package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Iterator;
import xsna.b001;
import xsna.ozg0;
import xsna.qzz0;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class zzau extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzau> CREATOR = new b001();
    public final Bundle b;

    public zzau(Bundle bundle) {
        this.b = bundle;
    }

    public final Bundle i() {
        return new Bundle(this.b);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new qzz0(this);
    }

    public final Double j() {
        return Double.valueOf(this.b.getDouble("value"));
    }

    public final Object k(String str) {
        return this.b.get(str);
    }

    public final String l() {
        return this.b.getString(InAppPurchaseMetaData.KEY_CURRENCY);
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.d(parcel, 2, i(), false);
        ozg0.x(w, parcel);
    }
}
