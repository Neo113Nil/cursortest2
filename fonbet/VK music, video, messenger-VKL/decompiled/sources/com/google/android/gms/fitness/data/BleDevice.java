package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.dq70;
import xsna.o601;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
@Deprecated
/* loaded from: classes12.dex */
public class BleDevice extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<BleDevice> CREATOR = new o601();
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public BleDevice(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        this.b = str;
        this.c = str2;
        this.d = Collections.unmodifiableList(arrayList);
        this.e = Collections.unmodifiableList(arrayList2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BleDevice)) {
            return false;
        }
        BleDevice bleDevice = (BleDevice) obj;
        return this.c.equals(bleDevice.c) && this.b.equals(bleDevice.b) && new HashSet(this.d).equals(new HashSet(bleDevice.d)) && new HashSet(this.e).equals(new HashSet(bleDevice.e));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.b, this.d, this.e});
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.c, "name");
        aVar.a(this.b, RTCStatsConstants.KEY_ADDRESS);
        aVar.a(this.e, "dataTypes");
        aVar.a(this.d, "supportedProfiles");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        ozg0.q(parcel, 2, this.c, false);
        ozg0.s(parcel, this.d, 3);
        ozg0.u(parcel, 4, this.e, false);
        ozg0.x(w, parcel);
    }
}
