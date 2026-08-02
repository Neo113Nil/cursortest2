package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.U3;
import defpackage.wt3;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class GeofencingRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new zzp();
    public final List a;
    public final int b;
    public final String c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
        public Builder() {
            new ArrayList();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public @interface InitialTrigger {
    }

    public GeofencingRequest(int i, String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        this.c = str;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int length = valueOf.length();
        int i = this.b;
        StringBuilder sb = new StringBuilder(length + 45 + String.valueOf(i).length() + 1);
        wt3.t(i, "GeofencingRequest[geofences=", valueOf, ", initialTrigger=", sb);
        sb.append(U3.j.e);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.q(parcel, 1, this.a, false);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.b);
        SafeParcelWriter.m(parcel, 4, this.c, false);
        SafeParcelWriter.t(parcel, s);
    }
}
