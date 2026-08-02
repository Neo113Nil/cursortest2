package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.j;
import h8.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new j(13);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4557a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4558b;

    public ModuleAvailabilityResponse(int i5, boolean z5) {
        this.f4557a = z5;
        this.f4558b = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4557a ? 1 : 0);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f4558b);
        b.W(parcel, V);
    }
}
