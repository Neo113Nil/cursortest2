package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.dq70;
import xsna.ozg0;
import xsna.qwz0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public class Subscription extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Subscription> CREATOR = new qwz0();
    public final DataSource b;
    public final DataType c;
    public final long d;
    public final int e;
    public final int f;

    public Subscription(DataSource dataSource, DataType dataType, long j, int i, int i2) {
        this.b = dataSource;
        this.c = dataType;
        this.d = j;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        return dq70.b(this.b, subscription.b) && dq70.b(this.c, subscription.c) && this.d == subscription.d && this.e == subscription.e && this.f == subscription.f;
    }

    public final int hashCode() {
        Long valueOf = Long.valueOf(this.d);
        Integer valueOf2 = Integer.valueOf(this.e);
        Integer valueOf3 = Integer.valueOf(this.f);
        DataSource dataSource = this.b;
        return Arrays.hashCode(new Object[]{dataSource, dataSource, valueOf, valueOf2, valueOf3});
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.b, "dataSource");
        aVar.a(this.c, "dataType");
        aVar.a(Long.valueOf(this.d), "samplingIntervalMicros");
        aVar.a(Integer.valueOf(this.e), "accuracyMode");
        aVar.a(Integer.valueOf(this.f), "subscriptionType");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.b, i, false);
        ozg0.p(parcel, 2, this.c, i, false);
        ozg0.v(parcel, 3, 8);
        parcel.writeLong(this.d);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.e);
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(this.f);
        ozg0.x(w, parcel);
    }
}
