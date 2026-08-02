package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class SleepSegmentRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SleepSegmentRequest> CREATOR = new zzaq();
    public final List a;
    public final int b;

    public SleepSegmentRequest(ArrayList arrayList, int i) {
        this.a = arrayList;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepSegmentRequest)) {
            return false;
        }
        SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) obj;
        return Objects.a(this.a, sleepSegmentRequest.a) && this.b == sleepSegmentRequest.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.i(parcel);
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.q(parcel, 1, this.a, false);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.b);
        SafeParcelWriter.t(parcel, s);
    }
}
