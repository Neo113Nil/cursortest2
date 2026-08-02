package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ClearTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<ClearTokenRequest> CREATOR = new q5.b(26);

    /* renamed from: a, reason: collision with root package name */
    public final String f4337a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4338b;

    public ClearTokenRequest(String str, String str2) {
        this.f4337a = str;
        this.f4338b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ClearTokenRequest) {
            ClearTokenRequest clearTokenRequest = (ClearTokenRequest) obj;
            if (v.k(this.f4337a, clearTokenRequest.f4337a) && v.k(this.f4338b, clearTokenRequest.f4338b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4337a, this.f4338b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.O(parcel, 1, this.f4337a, false);
        h8.b.O(parcel, 2, this.f4338b, false);
        h8.b.W(parcel, V);
    }
}
