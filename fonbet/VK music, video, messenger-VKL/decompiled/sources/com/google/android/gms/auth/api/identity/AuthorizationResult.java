package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
import xsna.dq70;
import xsna.exc0;
import xsna.ozg0;
import xsna.wqz0;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes12.dex */
public final class AuthorizationResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthorizationResult> CREATOR = new wqz0();

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    @Nullable
    public final String d;
    public final List e;

    @Nullable
    public final GoogleSignInAccount f;

    @Nullable
    public final PendingIntent g;

    public AuthorizationResult(@Nullable String str, @Nullable String str2, @Nullable String str3, @NonNull List<String> list, @Nullable GoogleSignInAccount googleSignInAccount, @Nullable PendingIntent pendingIntent) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        exc0.i(list);
        this.e = list;
        this.g = pendingIntent;
        this.f = googleSignInAccount;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof AuthorizationResult)) {
            return false;
        }
        AuthorizationResult authorizationResult = (AuthorizationResult) obj;
        return dq70.b(this.b, authorizationResult.b) && dq70.b(this.c, authorizationResult.c) && dq70.b(this.d, authorizationResult.d) && dq70.b(this.e, authorizationResult.e) && dq70.b(this.g, authorizationResult.g) && dq70.b(this.f, authorizationResult.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.g, this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        ozg0.q(parcel, 2, this.c, false);
        ozg0.q(parcel, 3, this.d, false);
        ozg0.s(parcel, this.e, 4);
        ozg0.p(parcel, 5, this.f, i, false);
        ozg0.p(parcel, 6, this.g, i, false);
        ozg0.x(w, parcel);
    }
}
