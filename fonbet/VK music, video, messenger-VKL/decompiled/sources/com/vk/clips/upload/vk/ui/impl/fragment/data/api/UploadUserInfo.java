package com.vk.clips.upload.vk.ui.impl.fragment.data.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import xsna.asp;
import xsna.epx;
import xsna.urd0;
import xsna.zrp;

/* compiled from: UploadUserInfo.kt */
/* loaded from: classes17.dex */
public final class UploadUserInfo implements Parcelable {
    public static final Parcelable.Creator<UploadUserInfo> CREATOR = new a();
    public final UserId b;
    public final String c;
    public final String d;
    public final AgeRestriction e;
    public final boolean f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UploadUserInfo.kt */
    public static final class AgeRestriction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AgeRestriction[] $VALUES;
        public static final AgeRestriction NONE;
        public static final AgeRestriction OVER_16;
        public static final AgeRestriction OVER_18;

        static {
            AgeRestriction ageRestriction = new AgeRestriction("NONE", 0);
            NONE = ageRestriction;
            AgeRestriction ageRestriction2 = new AgeRestriction("OVER_16", 1);
            OVER_16 = ageRestriction2;
            AgeRestriction ageRestriction3 = new AgeRestriction("OVER_18", 2);
            OVER_18 = ageRestriction3;
            AgeRestriction[] ageRestrictionArr = {ageRestriction, ageRestriction2, ageRestriction3};
            $VALUES = ageRestrictionArr;
            $ENTRIES = new asp(ageRestrictionArr);
        }

        public AgeRestriction() {
            throw null;
        }

        public static AgeRestriction valueOf(String str) {
            return (AgeRestriction) Enum.valueOf(AgeRestriction.class, str);
        }

        public static AgeRestriction[] values() {
            return (AgeRestriction[]) $VALUES.clone();
        }
    }

    /* compiled from: UploadUserInfo.kt */
    public static final class a implements Parcelable.Creator<UploadUserInfo> {
        @Override // android.os.Parcelable.Creator
        public final UploadUserInfo createFromParcel(Parcel parcel) {
            return new UploadUserInfo((UserId) parcel.readParcelable(UploadUserInfo.class.getClassLoader()), parcel.readString(), parcel.readString(), AgeRestriction.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final UploadUserInfo[] newArray(int i) {
            return new UploadUserInfo[i];
        }
    }

    public UploadUserInfo(UserId userId, String str, String str2, AgeRestriction ageRestriction, boolean z) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = ageRestriction;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadUserInfo)) {
            return false;
        }
        UploadUserInfo uploadUserInfo = (UploadUserInfo) obj;
        return epx.f(this.b, uploadUserInfo.b) && epx.f(this.c, uploadUserInfo.c) && epx.f(this.d, uploadUserInfo.d) && this.e == uploadUserInfo.e && this.f == uploadUserInfo.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + urd0.a(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadUserInfo(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", baseImage=");
        sb.append(this.d);
        sb.append(", ageRestriction=");
        sb.append(this.e);
        sb.append(", isClosed=");
        return q0.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e.name());
        parcel.writeInt(this.f ? 1 : 0);
    }
}
