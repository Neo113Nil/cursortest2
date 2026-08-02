package com.vk.mentions;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: MentionProfileVO.kt */
/* loaded from: classes3.dex */
public final class MentionProfileVO implements Parcelable {
    public static final Parcelable.Creator<MentionProfileVO> CREATOR = new a();
    public final UserId b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    /* compiled from: MentionProfileVO.kt */
    public static final class a implements Parcelable.Creator<MentionProfileVO> {
        @Override // android.os.Parcelable.Creator
        public final MentionProfileVO createFromParcel(Parcel parcel) {
            return new MentionProfileVO((UserId) parcel.readParcelable(MentionProfileVO.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MentionProfileVO[] newArray(int i) {
            return new MentionProfileVO[i];
        }
    }

    public MentionProfileVO(UserId userId, String str, String str2, String str3, String str4) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MentionProfileVO)) {
            return false;
        }
        MentionProfileVO mentionProfileVO = (MentionProfileVO) obj;
        return epx.f(this.b, mentionProfileVO.b) && epx.f(this.c, mentionProfileVO.c) && epx.f(this.d, mentionProfileVO.d) && epx.f(this.e, mentionProfileVO.e) && epx.f(this.f, mentionProfileVO.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + urd0.a(urd0.a(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MentionProfileVO(id=");
        sb.append(this.b);
        sb.append(", fullName=");
        sb.append(this.c);
        sb.append(", mentionName=");
        sb.append(this.d);
        sb.append(", avatarUri=");
        sb.append(this.e);
        sb.append(", domain=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
