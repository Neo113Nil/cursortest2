package com.vk.clips.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.qoy;
import xsna.zrp;

/* compiled from: ExternalOwner.kt */
/* loaded from: classes17.dex */
public final class ExternalOwner implements Parcelable {
    public static final Parcelable.Creator<ExternalOwner> CREATOR = new a();
    public final long b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final SdkImages f;
    public final Type g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ExternalOwner.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type GROUP;
        public static final Type USER;

        static {
            Type type = new Type("USER", 0);
            USER = type;
            Type type2 = new Type("GROUP", 1);
            GROUP = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: ExternalOwner.kt */
    public static final class a implements Parcelable.Creator<ExternalOwner> {
        @Override // android.os.Parcelable.Creator
        public final ExternalOwner createFromParcel(Parcel parcel) {
            return new ExternalOwner(parcel.readLong(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, SdkImages.CREATOR.createFromParcel(parcel), Type.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ExternalOwner[] newArray(int i) {
            return new ExternalOwner[i];
        }
    }

    public ExternalOwner(long j, String str, boolean z, boolean z2, SdkImages sdkImages, Type type) {
        this.b = j;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = sdkImages;
        this.g = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalOwner)) {
            return false;
        }
        ExternalOwner externalOwner = (ExternalOwner) obj;
        return this.b == externalOwner.b && epx.f(this.c, externalOwner.c) && this.d == externalOwner.d && this.e == externalOwner.e && epx.f(this.f, externalOwner.f) && this.g == externalOwner.g;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b) * 31;
        String str = this.c;
        return this.g.hashCode() + ((this.f.hashCode() + qoy.b(qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        return "ExternalOwner(extOwnerId=" + this.b + ", name=" + this.c + ", canSubscribe=" + this.d + ", isSubscribed=" + this.e + ", avatars=" + this.f + ", type=" + this.g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        this.f.writeToParcel(parcel, i);
        parcel.writeString(this.g.name());
    }
}
