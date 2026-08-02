package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.j;
import h8.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new j(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f4527a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4528b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4529c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4530d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4531e;

    public RootTelemetryConfiguration(int i5, boolean z5, boolean z7, int i10, int i11) {
        this.f4527a = i5;
        this.f4528b = z5;
        this.f4529c = z7;
        this.f4530d = i10;
        this.f4531e = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4527a);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f4528b ? 1 : 0);
        b.U(parcel, 3, 4);
        parcel.writeInt(this.f4529c ? 1 : 0);
        b.U(parcel, 4, 4);
        parcel.writeInt(this.f4530d);
        b.U(parcel, 5, 4);
        parcel.writeInt(this.f4531e);
        b.W(parcel, V);
    }
}
