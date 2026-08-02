package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import q5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class DeviceMetaData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new b(21);

    /* renamed from: a, reason: collision with root package name */
    public final int f4264a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4265b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4266c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4267d;

    public DeviceMetaData(int i5, boolean z5, long j, boolean z7) {
        this.f4264a = i5;
        this.f4265b = z5;
        this.f4266c = j;
        this.f4267d = z7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.U(parcel, 1, 4);
        parcel.writeInt(this.f4264a);
        h8.b.U(parcel, 2, 4);
        parcel.writeInt(this.f4265b ? 1 : 0);
        h8.b.U(parcel, 3, 8);
        parcel.writeLong(this.f4266c);
        h8.b.U(parcel, 4, 4);
        parcel.writeInt(this.f4267d ? 1 : 0);
        h8.b.W(parcel, V);
    }
}
