package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Deprecated
/* loaded from: classes.dex */
public class GetSignInIntentRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new q5.b(28);

    /* renamed from: a, reason: collision with root package name */
    public final String f4340a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4341b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4342c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4343d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4344e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4345f;

    /* renamed from: g, reason: collision with root package name */
    public final List f4346g;

    public GetSignInIntentRequest(String str, String str2, String str3, String str4, boolean z5, int i5, List list) {
        v.h(str);
        this.f4340a = str;
        this.f4341b = str2;
        this.f4342c = str3;
        this.f4343d = str4;
        this.f4344e = z5;
        this.f4345f = i5;
        this.f4346g = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        return v.k(this.f4340a, getSignInIntentRequest.f4340a) && v.k(this.f4343d, getSignInIntentRequest.f4343d) && v.k(this.f4341b, getSignInIntentRequest.f4341b) && v.k(Boolean.valueOf(this.f4344e), Boolean.valueOf(getSignInIntentRequest.f4344e)) && this.f4345f == getSignInIntentRequest.f4345f && v.k(this.f4346g, getSignInIntentRequest.f4346g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4340a, this.f4341b, this.f4343d, Boolean.valueOf(this.f4344e), Integer.valueOf(this.f4345f), this.f4346g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.O(parcel, 1, this.f4340a, false);
        h8.b.O(parcel, 2, this.f4341b, false);
        h8.b.O(parcel, 3, this.f4342c, false);
        h8.b.O(parcel, 4, this.f4343d, false);
        h8.b.U(parcel, 5, 4);
        parcel.writeInt(this.f4344e ? 1 : 0);
        h8.b.U(parcel, 6, 4);
        parcel.writeInt(this.f4345f);
        h8.b.R(parcel, 7, this.f4346g, false);
        h8.b.W(parcel, V);
    }
}
