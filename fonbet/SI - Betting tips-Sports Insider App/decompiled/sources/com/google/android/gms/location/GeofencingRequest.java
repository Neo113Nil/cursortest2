package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h8.b;
import java.util.ArrayList;
import java.util.List;
import n6.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class GeofencingRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new a(29);

    /* renamed from: a, reason: collision with root package name */
    public final List f5702a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5703b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5704c;

    public GeofencingRequest(int i5, String str, ArrayList arrayList) {
        this.f5702a = arrayList;
        this.f5703b = i5;
        this.f5704c = str;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5702a);
        int length = valueOf.length();
        int i5 = this.f5703b;
        StringBuilder sb2 = new StringBuilder(length + 45 + String.valueOf(i5).length() + 1);
        sb2.append("GeofencingRequest[geofences=");
        sb2.append(valueOf);
        sb2.append(", initialTrigger=");
        sb2.append(i5);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.R(parcel, 1, this.f5702a, false);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f5703b);
        b.O(parcel, 4, this.f5704c, false);
        b.W(parcel, V);
    }
}
