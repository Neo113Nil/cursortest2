package com.google.android.gms.common.data;

import a3.a;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import h8.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new a(26);

    /* renamed from: a, reason: collision with root package name */
    public final int f4479a;

    /* renamed from: b, reason: collision with root package name */
    public ParcelFileDescriptor f4480b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4481c;

    public BitmapTeleporter(int i5, ParcelFileDescriptor parcelFileDescriptor, int i10) {
        this.f4479a = i5;
        this.f4480b = parcelFileDescriptor;
        this.f4481c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        if (this.f4480b == null) {
            v.h(null);
            throw null;
        }
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4479a);
        b.N(parcel, 2, this.f4480b, i5 | 1, false);
        b.U(parcel, 3, 4);
        parcel.writeInt(this.f4481c);
        b.W(parcel, V);
        this.f4480b = null;
    }
}
