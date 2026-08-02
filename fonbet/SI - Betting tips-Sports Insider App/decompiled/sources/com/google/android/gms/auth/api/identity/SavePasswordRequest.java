package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Deprecated
/* loaded from: classes.dex */
public class SavePasswordRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new u5.b(2);

    /* renamed from: a, reason: collision with root package name */
    public final SignInPassword f4357a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4358b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4359c;

    public SavePasswordRequest(SignInPassword signInPassword, String str, int i5) {
        v.h(signInPassword);
        this.f4357a = signInPassword;
        this.f4358b = str;
        this.f4359c = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        return v.k(this.f4357a, savePasswordRequest.f4357a) && v.k(this.f4358b, savePasswordRequest.f4358b) && this.f4359c == savePasswordRequest.f4359c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4357a, this.f4358b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.N(parcel, 1, this.f4357a, i5, false);
        h8.b.O(parcel, 2, this.f4358b, false);
        h8.b.U(parcel, 3, 4);
        parcel.writeInt(this.f4359c);
        h8.b.W(parcel, V);
    }
}
