package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

@SafeParcelable.Class(creator = "CapCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes9.dex */
public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Cap> CREATOR = new zzb();
    private static final String TAG = "Cap";

    @SafeParcelable.Field(getter = "getWrappedBitmapDescriptorImplBinder", id = 3, type = "android.os.IBinder")
    private final BitmapDescriptor bitmapDescriptor;

    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int type;

    @SafeParcelable.Field(getter = "getBitmapRefWidth", id = 4)
    private final Float zzcn;

    private Cap(int i11, BitmapDescriptor bitmapDescriptor, Float f7) {
        boolean z11 = false;
        boolean z12 = f7 != null && f7.floatValue() > 0.0f;
        if (i11 != 3 || (bitmapDescriptor != null && z12)) {
            z11 = true;
        }
        Preconditions.checkArgument(z11, "Invalid Cap: type=" + i11 + " bitmapDescriptor=" + bitmapDescriptor + " bitmapRefWidth=" + f7);
        this.type = i11;
        this.bitmapDescriptor = bitmapDescriptor;
        this.zzcn = f7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.type == cap.type && Objects.equal(this.bitmapDescriptor, cap.bitmapDescriptor) && Objects.equal(this.zzcn, cap.zzcn);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.type), this.bitmapDescriptor, this.zzcn);
    }

    public String toString() {
        int i11 = this.type;
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("[Cap: type=");
        sb2.append(i11);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.type);
        BitmapDescriptor bitmapDescriptor = this.bitmapDescriptor;
        SafeParcelWriter.writeIBinder(parcel, 3, bitmapDescriptor == null ? null : bitmapDescriptor.zzb().asBinder(), false);
        SafeParcelWriter.writeFloatObject(parcel, 4, this.zzcn, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    final Cap zzh() {
        int i11 = this.type;
        if (i11 == 0) {
            return new ButtCap();
        }
        if (i11 == 1) {
            return new SquareCap();
        }
        if (i11 == 2) {
            return new RoundCap();
        }
        if (i11 == 3) {
            return new CustomCap(this.bitmapDescriptor, this.zzcn.floatValue());
        }
        String str = TAG;
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("Unknown Cap type: ");
        sb2.append(i11);
        Log.w(str, sb2.toString());
        return this;
    }

    @SafeParcelable.Constructor
    Cap(@SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) Float f7) {
        this(i11, iBinder == null ? null : new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder)), f7);
    }

    protected Cap(@NonNull BitmapDescriptor bitmapDescriptor, float f7) {
        this(3, bitmapDescriptor, Float.valueOf(f7));
    }

    protected Cap(int i11) {
        this(i11, (BitmapDescriptor) null, (Float) null);
    }
}
