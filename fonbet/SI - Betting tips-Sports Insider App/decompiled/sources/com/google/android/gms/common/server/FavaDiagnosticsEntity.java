package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.j;
import h8.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new j(18);

    /* renamed from: a, reason: collision with root package name */
    public final int f4571a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4572b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4573c;

    public FavaDiagnosticsEntity(int i5, String str, int i10) {
        this.f4571a = i5;
        this.f4572b = str;
        this.f4573c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4571a);
        b.O(parcel, 2, this.f4572b, false);
        b.U(parcel, 3, 4);
        parcel.writeInt(this.f4573c);
        b.W(parcel, V);
    }
}
