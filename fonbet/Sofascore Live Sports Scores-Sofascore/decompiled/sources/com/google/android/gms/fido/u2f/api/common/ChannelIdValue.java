package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.ilg;
import defpackage.lnb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
@Deprecated
/* loaded from: classes3.dex */
public class ChannelIdValue extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ChannelIdValue> CREATOR = new zzb();
    public final ChannelIdValueType a;
    public final String b;
    public final String c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        STRING(1),
        /* JADX INFO: Fake field, exist only in values array */
        OBJECT(2);


        @NonNull
        public static final Parcelable.Creator<ChannelIdValueType> CREATOR = new a();
        public final int a;

        ChannelIdValueType(int i) {
            this.a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class UnsupportedChannelIdValueTypeException extends Exception {
    }

    static {
        new ChannelIdValue();
        new ChannelIdValue("unavailable");
        new ChannelIdValue("unused");
    }

    public ChannelIdValue(int i, String str, String str2) {
        try {
            this.a = Y0(i);
            this.b = str;
            this.c = str2;
        } catch (UnsupportedChannelIdValueTypeException e) {
            ilg.k(e);
            throw null;
        }
    }

    public static ChannelIdValueType Y0(int i) {
        for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
            if (i == channelIdValueType.a) {
                return channelIdValueType;
            }
        }
        throw new UnsupportedChannelIdValueTypeException(lnb.k(i, "ChannelIdValueType ", " not supported"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelIdValue)) {
            return false;
        }
        ChannelIdValue channelIdValue = (ChannelIdValue) obj;
        ChannelIdValueType channelIdValueType = channelIdValue.a;
        ChannelIdValueType channelIdValueType2 = this.a;
        if (!channelIdValueType2.equals(channelIdValueType)) {
            return false;
        }
        int ordinal = channelIdValueType2.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return this.b.equals(channelIdValue.b);
        }
        if (ordinal != 2) {
            return false;
        }
        return this.c.equals(channelIdValue.c);
    }

    public final int hashCode() {
        int i;
        int hashCode;
        ChannelIdValueType channelIdValueType = this.a;
        int hashCode2 = channelIdValueType.hashCode() + 31;
        int ordinal = channelIdValueType.ordinal();
        if (ordinal == 1) {
            i = hashCode2 * 31;
            hashCode = this.b.hashCode();
        } else {
            if (ordinal != 2) {
                return hashCode2;
            }
            i = hashCode2 * 31;
            hashCode = this.c.hashCode();
        }
        return hashCode + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        int i2 = this.a.a;
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(i2);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        SafeParcelWriter.m(parcel, 4, this.c, false);
        SafeParcelWriter.t(parcel, s);
    }

    private ChannelIdValue() {
        this.a = ChannelIdValueType.ABSENT;
        this.c = null;
        this.b = null;
    }

    public ChannelIdValue(String str) {
        this.b = str;
        this.a = ChannelIdValueType.STRING;
        this.c = null;
    }
}
