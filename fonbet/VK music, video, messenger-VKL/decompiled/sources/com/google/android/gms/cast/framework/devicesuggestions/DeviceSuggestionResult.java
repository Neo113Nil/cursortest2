package com.google.android.gms.cast.framework.devicesuggestions;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;
import xsna.rtz0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public class DeviceSuggestionResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DeviceSuggestionResult> CREATOR = new rtz0();
    public final String b;
    public final String c;
    public final int d;

    public DeviceSuggestionResult(@NonNull String str, @NonNull String str2, int i) {
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        ozg0.q(parcel, 2, this.c, false);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.d);
        ozg0.x(w, parcel);
    }
}
