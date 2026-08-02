package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.exc0;
import xsna.gs01;
import xsna.i5s;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public class FidoAppIdExtension extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<FidoAppIdExtension> CREATOR = new gs01();

    @NonNull
    public final String b;

    public FidoAppIdExtension(@NonNull String str) {
        exc0.i(str);
        this.b = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof FidoAppIdExtension) {
            return this.b.equals(((FidoAppIdExtension) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    @NonNull
    public final String toString() {
        return i5s.a(new StringBuilder("FidoAppIdExtension{appid='"), this.b, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.x(w, parcel);
    }
}
