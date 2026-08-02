package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d6.l;
import java.util.ArrayList;
import java.util.List;
import u5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zag extends AbstractSafeParcelable implements l {
    public static final Parcelable.Creator<zag> CREATOR = new b(7);

    /* renamed from: a, reason: collision with root package name */
    public final List f5847a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5848b;

    public zag(String str, ArrayList arrayList) {
        this.f5847a = arrayList;
        this.f5848b = str;
    }

    @Override // d6.l
    public final Status getStatus() {
        return this.f5848b != null ? Status.f4461e : Status.f4465i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.P(parcel, 1, this.f5847a);
        h8.b.O(parcel, 2, this.f5848b, false);
        h8.b.W(parcel, V);
    }
}
