package com.google.android.gms.libs.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d6.l;
import g6.j;
import h8.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzl extends AbstractSafeParcelable implements l {
    public static final Parcelable.Creator<zzl> CREATOR = new j(27);

    /* renamed from: a, reason: collision with root package name */
    public final Status f4902a;

    public zzl(Status status) {
        this.f4902a = status;
    }

    @Override // d6.l
    public final Status getStatus() {
        return this.f4902a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.N(parcel, 1, this.f4902a, i5, false);
        b.W(parcel, V);
    }
}
