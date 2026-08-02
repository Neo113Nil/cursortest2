package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zay;
import u5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new b(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f5849a;

    /* renamed from: b, reason: collision with root package name */
    public final zay f5850b;

    public zai(int i5, zay zayVar) {
        this.f5849a = i5;
        this.f5850b = zayVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.U(parcel, 1, 4);
        parcel.writeInt(this.f5849a);
        h8.b.N(parcel, 2, this.f5850b, i5, false);
        h8.b.W(parcel, V);
    }
}
