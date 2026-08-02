package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.c101;
import xsna.ozg0;
import xsna.tgw;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@Deprecated
/* loaded from: classes12.dex */
public class ChannelIdValue extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ChannelIdValue> CREATOR = new c101();
    public final ChannelIdValueType b;
    public final String c;
    public final String d;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        STRING(1),
        OBJECT(2);


        @NonNull
        public static final Parcelable.Creator<ChannelIdValueType> CREATOR = new a();
        private final int zzb;

        ChannelIdValueType(int i) {
            this.zzb = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.zzb);
        }
    }

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class UnsupportedChannelIdValueTypeException extends Exception {
    }

    static {
        new ChannelIdValue();
        new ChannelIdValue("unavailable");
        new ChannelIdValue("unused");
    }

    public ChannelIdValue() {
        this.b = ChannelIdValueType.ABSENT;
        this.d = null;
        this.c = null;
    }

    @NonNull
    public static ChannelIdValueType i(int i) throws UnsupportedChannelIdValueTypeException {
        for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
            if (i == channelIdValueType.zzb) {
                return channelIdValueType;
            }
        }
        throw new UnsupportedChannelIdValueTypeException(tgw.b(i, "ChannelIdValueType ", " not supported"));
    }

    public final boolean equals(@NonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelIdValue)) {
            return false;
        }
        ChannelIdValue channelIdValue = (ChannelIdValue) obj;
        ChannelIdValueType channelIdValueType = channelIdValue.b;
        ChannelIdValueType channelIdValueType2 = this.b;
        if (!channelIdValueType2.equals(channelIdValueType)) {
            return false;
        }
        int ordinal = channelIdValueType2.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return this.c.equals(channelIdValue.c);
        }
        if (ordinal != 2) {
            return false;
        }
        return this.d.equals(channelIdValue.d);
    }

    public final int hashCode() {
        int i;
        int hashCode;
        ChannelIdValueType channelIdValueType = this.b;
        int hashCode2 = channelIdValueType.hashCode() + 31;
        int ordinal = channelIdValueType.ordinal();
        if (ordinal == 1) {
            i = hashCode2 * 31;
            hashCode = this.c.hashCode();
        } else {
            if (ordinal != 2) {
                return hashCode2;
            }
            i = hashCode2 * 31;
            hashCode = this.d.hashCode();
        }
        return hashCode + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        int i2 = this.b.zzb;
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(i2);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.q(parcel, 4, this.d, false);
        ozg0.x(w, parcel);
    }

    public ChannelIdValue(int i, String str, String str2) {
        try {
            this.b = i(i);
            this.c = str;
            this.d = str2;
        } catch (UnsupportedChannelIdValueTypeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public ChannelIdValue(String str) {
        this.c = str;
        this.b = ChannelIdValueType.STRING;
        this.d = null;
    }
}
