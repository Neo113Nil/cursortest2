package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import q5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new b(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f4241a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4242b;

    public zza(String str, String str2) {
        this.f4241a = str;
        this.f4242b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.O(parcel, 1, this.f4241a, false);
        h8.b.O(parcel, 2, this.f4242b, false);
        h8.b.W(parcel, V);
    }
}
