package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.U3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.uoa;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzbf extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzbf> CREATOR = new zzbg();
    public final Bundle a;

    public zzbf(Bundle bundle) {
        this.a = bundle;
    }

    public final Object Y0(String str) {
        return this.a.get(str);
    }

    public final Double Z0() {
        return Double.valueOf(this.a.getDouble(U3.i.X));
    }

    public final String a1() {
        return this.a.getString(InAppPurchaseMetaData.KEY_CURRENCY);
    }

    public final Bundle b1() {
        return new Bundle(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new uoa(this);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.b(parcel, 2, b1());
        SafeParcelWriter.t(parcel, s);
    }
}
