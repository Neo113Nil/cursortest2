package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class AuthorizationResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthorizationResult> CREATOR = new zbf();
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final GoogleSignInAccount e;
    public final PendingIntent f;

    public AuthorizationResult(String str, String str2, String str3, ArrayList arrayList, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        Preconditions.i(arrayList);
        this.d = arrayList;
        this.f = pendingIntent;
        this.e = googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationResult)) {
            return false;
        }
        AuthorizationResult authorizationResult = (AuthorizationResult) obj;
        return Objects.a(this.a, authorizationResult.a) && Objects.a(this.b, authorizationResult.b) && Objects.a(this.c, authorizationResult.c) && Objects.a(this.d, authorizationResult.d) && Objects.a(this.f, authorizationResult.f) && Objects.a(this.e, authorizationResult.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.f, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 1, this.a, false);
        SafeParcelWriter.m(parcel, 2, this.b, false);
        SafeParcelWriter.m(parcel, 3, this.c, false);
        SafeParcelWriter.o(parcel, 4, this.d);
        SafeParcelWriter.l(parcel, 5, this.e, i, false);
        SafeParcelWriter.l(parcel, 6, this.f, i, false);
        SafeParcelWriter.t(parcel, s);
    }
}
