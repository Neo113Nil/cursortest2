package com.vk.ecomm.configureitemlist.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;

/* compiled from: ConfigureItemId.kt */
/* loaded from: classes18.dex */
public final class ConfigureItemId implements Parcelable {
    public static final Parcelable.Creator<ConfigureItemId> CREATOR = new a();
    public final long b;
    public final UserId c;

    /* compiled from: ConfigureItemId.kt */
    public static final class a implements Parcelable.Creator<ConfigureItemId> {
        @Override // android.os.Parcelable.Creator
        public final ConfigureItemId createFromParcel(Parcel parcel) {
            return new ConfigureItemId(parcel.readLong(), (UserId) parcel.readParcelable(ConfigureItemId.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ConfigureItemId[] newArray(int i) {
            return new ConfigureItemId[i];
        }
    }

    public ConfigureItemId(long j, UserId userId) {
        this.b = j;
        this.c = userId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigureItemId)) {
            return false;
        }
        ConfigureItemId configureItemId = (ConfigureItemId) obj;
        return this.b == configureItemId.b && epx.f(this.c, configureItemId.c);
    }

    public final int hashCode() {
        return Long.hashCode(this.c.b) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigureItemId(productId=");
        sb.append(this.b);
        sb.append(", ownerId=");
        return gp.b(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
