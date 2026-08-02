package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import h8.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n6.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class SleepSegmentRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SleepSegmentRequest> CREATOR = new a(17);

    /* renamed from: a, reason: collision with root package name */
    public final List f5754a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5755b;

    public SleepSegmentRequest(ArrayList arrayList, int i5) {
        this.f5754a = arrayList;
        this.f5755b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepSegmentRequest)) {
            return false;
        }
        SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) obj;
        return v.k(this.f5754a, sleepSegmentRequest.f5754a) && this.f5755b == sleepSegmentRequest.f5755b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5754a, Integer.valueOf(this.f5755b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        v.h(parcel);
        int V = b.V(parcel, 20293);
        b.R(parcel, 1, this.f5754a, false);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f5755b);
        b.W(parcel, V);
    }
}
