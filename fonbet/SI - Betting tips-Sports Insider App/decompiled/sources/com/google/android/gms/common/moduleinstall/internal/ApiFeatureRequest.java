package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.j;
import g6.v;
import h8.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ApiFeatureRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new j(17);

    /* renamed from: a, reason: collision with root package name */
    public final List f4567a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4568b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4569c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4570d;

    public ApiFeatureRequest(ArrayList arrayList, boolean z5, String str, String str2) {
        v.h(arrayList);
        this.f4567a = arrayList;
        this.f4568b = z5;
        this.f4569c = str;
        this.f4570d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.f4568b == apiFeatureRequest.f4568b && v.k(this.f4567a, apiFeatureRequest.f4567a) && v.k(this.f4569c, apiFeatureRequest.f4569c) && v.k(this.f4570d, apiFeatureRequest.f4570d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4568b), this.f4567a, this.f4569c, this.f4570d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.R(parcel, 1, this.f4567a, false);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f4568b ? 1 : 0);
        b.O(parcel, 3, this.f4569c, false);
        b.O(parcel, 4, this.f4570d, false);
        b.W(parcel, V);
    }
}
