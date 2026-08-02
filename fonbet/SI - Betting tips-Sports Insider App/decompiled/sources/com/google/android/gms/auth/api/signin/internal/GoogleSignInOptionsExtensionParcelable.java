package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import u5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new b(16);

    /* renamed from: a, reason: collision with root package name */
    public final int f4415a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4416b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f4417c;

    public GoogleSignInOptionsExtensionParcelable(int i5, int i10, Bundle bundle) {
        this.f4415a = i5;
        this.f4416b = i10;
        this.f4417c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.U(parcel, 1, 4);
        parcel.writeInt(this.f4415a);
        h8.b.U(parcel, 2, 4);
        parcel.writeInt(this.f4416b);
        h8.b.F(parcel, 3, this.f4417c);
        h8.b.W(parcel, V);
    }
}
