package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.dq70;
import xsna.exc0;
import xsna.frz0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@Deprecated
/* loaded from: classes12.dex */
public class GetSignInIntentRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new frz0();
    public final String b;

    @Nullable
    public final String c;

    @Nullable
    public final String d;

    @Nullable
    public final String e;
    public final boolean f;
    public final int g;

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    public static final class a {
        public String a;

        @Nullable
        public String b;

        @Nullable
        public String c;

        @Nullable
        public String d;
        public boolean e;
        public int f;

        @NonNull
        public final GetSignInIntentRequest a() {
            return new GetSignInIntentRequest(this.a, this.b, this.c, this.d, this.f, this.e);
        }

        @NonNull
        public final void b(@Nullable String str) {
            this.c = str;
        }
    }

    public GetSignInIntentRequest(String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, boolean z) {
        exc0.i(str);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = i;
    }

    @NonNull
    public static a b(@NonNull GetSignInIntentRequest getSignInIntentRequest) {
        exc0.i(getSignInIntentRequest);
        a aVar = new a();
        String str = getSignInIntentRequest.b;
        exc0.i(str);
        aVar.a = str;
        aVar.d = getSignInIntentRequest.e;
        aVar.b = getSignInIntentRequest.c;
        aVar.e = getSignInIntentRequest.f;
        aVar.f = getSignInIntentRequest.g;
        String str2 = getSignInIntentRequest.d;
        if (str2 != null) {
            aVar.c = str2;
        }
        return aVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        return dq70.b(this.b, getSignInIntentRequest.b) && dq70.b(this.e, getSignInIntentRequest.e) && dq70.b(this.c, getSignInIntentRequest.c) && dq70.b(Boolean.valueOf(this.f), Boolean.valueOf(getSignInIntentRequest.f)) && this.g == getSignInIntentRequest.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.e, Boolean.valueOf(this.f), Integer.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        ozg0.q(parcel, 2, this.c, false);
        ozg0.q(parcel, 3, this.d, false);
        ozg0.q(parcel, 4, this.e, false);
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(this.f ? 1 : 0);
        ozg0.v(parcel, 6, 4);
        parcel.writeInt(this.g);
        ozg0.x(w, parcel);
    }
}
