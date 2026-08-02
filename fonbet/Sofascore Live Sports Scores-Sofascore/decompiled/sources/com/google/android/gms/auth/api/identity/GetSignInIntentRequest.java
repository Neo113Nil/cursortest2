package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@Deprecated
/* loaded from: classes3.dex */
public class GetSignInIntentRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new zbl();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* loaded from: classes.dex */
    public static final class Builder {
        public String a;
        public String b;
        public String c;
        public String d;
        public boolean e;
        public int f;
    }

    public GetSignInIntentRequest(int i, String str, String str2, String str3, String str4, boolean z) {
        Preconditions.i(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        return Objects.a(this.a, getSignInIntentRequest.a) && Objects.a(this.d, getSignInIntentRequest.d) && Objects.a(this.b, getSignInIntentRequest.b) && Objects.a(Boolean.valueOf(this.e), Boolean.valueOf(getSignInIntentRequest.e)) && this.f == getSignInIntentRequest.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, Boolean.valueOf(this.e), Integer.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 1, this.a, false);
        SafeParcelWriter.m(parcel, 2, this.b, false);
        SafeParcelWriter.m(parcel, 3, this.c, false);
        SafeParcelWriter.m(parcel, 4, this.d, false);
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        SafeParcelWriter.r(parcel, 6, 4);
        parcel.writeInt(this.f);
        SafeParcelWriter.t(parcel, s);
    }
}
