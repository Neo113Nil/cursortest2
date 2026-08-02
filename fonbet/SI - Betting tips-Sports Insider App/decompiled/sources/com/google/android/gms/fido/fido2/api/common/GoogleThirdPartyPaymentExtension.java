package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import u5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class GoogleThirdPartyPaymentExtension extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleThirdPartyPaymentExtension> CREATOR = new b(25);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4708a;

    public GoogleThirdPartyPaymentExtension(boolean z5) {
        this.f4708a = z5;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GoogleThirdPartyPaymentExtension) && this.f4708a == ((GoogleThirdPartyPaymentExtension) obj).f4708a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4708a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.U(parcel, 1, 4);
        parcel.writeInt(this.f4708a ? 1 : 0);
        h8.b.W(parcel, V);
    }
}
