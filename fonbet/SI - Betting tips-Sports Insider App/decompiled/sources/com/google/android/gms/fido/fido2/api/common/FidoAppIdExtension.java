package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d9.e;
import g6.v;
import h8.b;
import java.util.Arrays;
import y6.n;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class FidoAppIdExtension extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<FidoAppIdExtension> CREATOR = new n(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f4698a;

    public FidoAppIdExtension(String str) {
        v.h(str);
        this.f4698a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FidoAppIdExtension) {
            return this.f4698a.equals(((FidoAppIdExtension) obj).f4698a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4698a});
    }

    public final String toString() {
        return e.l(new StringBuilder("FidoAppIdExtension{appid='"), this.f4698a, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.O(parcel, 2, this.f4698a, false);
        b.W(parcel, V);
    }
}
