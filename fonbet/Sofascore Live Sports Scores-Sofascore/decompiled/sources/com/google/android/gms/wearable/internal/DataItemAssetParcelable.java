package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.DataItemAsset;
import com.ironsource.U3;
import defpackage.mz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepName
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class DataItemAssetParcelable extends AbstractSafeParcelable implements DataItemAsset, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new zzdx();
    public final String a;
    public final String b;

    public DataItemAssetParcelable(DataItemAsset dataItemAsset) {
        String id = dataItemAsset.getId();
        Preconditions.i(id);
        this.a = id;
        String C = dataItemAsset.C();
        Preconditions.i(C);
        this.b = C;
    }

    @Override // com.google.android.gms.wearable.DataItemAsset
    public final String C() {
        return this.b;
    }

    @Override // com.google.android.gms.wearable.DataItemAsset
    public final String getId() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataItemAssetParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        String str = this.a;
        if (str == null) {
            sb.append(",noid");
        } else {
            sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            sb.append(str);
        }
        sb.append(", key=");
        return mz1.o(sb, this.b, U3.j.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 2, this.a, false);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        SafeParcelWriter.t(parcel, s);
    }

    public DataItemAssetParcelable(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
