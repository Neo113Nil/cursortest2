package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbf> CREATOR = new q5.b(25);

    /* renamed from: a, reason: collision with root package name */
    public final String f4372a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4373b;

    public zbf(String str, boolean z5) {
        this.f4372a = str;
        this.f4373b = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zbf) {
            zbf zbfVar = (zbf) obj;
            if (this.f4372a.equals(zbfVar.f4372a) && this.f4373b == zbfVar.f4373b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4372a, Boolean.valueOf(this.f4373b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.O(parcel, 1, this.f4372a, false);
        h8.b.U(parcel, 2, 4);
        parcel.writeInt(this.f4373b ? 1 : 0);
        h8.b.W(parcel, V);
    }
}
