package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d6.l;
import u5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zaa extends AbstractSafeParcelable implements l {
    public static final Parcelable.Creator<zaa> CREATOR = new b(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f5844a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5845b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f5846c;

    public zaa(int i5, int i10, Intent intent) {
        this.f5844a = i5;
        this.f5845b = i10;
        this.f5846c = intent;
    }

    @Override // d6.l
    public final Status getStatus() {
        return this.f5845b == 0 ? Status.f4461e : Status.f4465i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.U(parcel, 1, 4);
        parcel.writeInt(this.f5844a);
        h8.b.U(parcel, 2, 4);
        parcel.writeInt(this.f5845b);
        h8.b.N(parcel, 3, this.f5846c, i5, false);
        h8.b.W(parcel, V);
    }
}
