package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.dq70;
import xsna.exc0;
import xsna.orz0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@Deprecated
/* loaded from: classes12.dex */
public class SavePasswordRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new orz0();
    public final SignInPassword b;

    @Nullable
    public final String c;
    public final int d;

    public SavePasswordRequest(SignInPassword signInPassword, @Nullable String str, int i) {
        exc0.i(signInPassword);
        this.b = signInPassword;
        this.c = str;
        this.d = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        return dq70.b(this.b, savePasswordRequest.b) && dq70.b(this.c, savePasswordRequest.c) && this.d == savePasswordRequest.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.b, i, false);
        ozg0.q(parcel, 2, this.c, false);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.d);
        ozg0.x(w, parcel);
    }
}
