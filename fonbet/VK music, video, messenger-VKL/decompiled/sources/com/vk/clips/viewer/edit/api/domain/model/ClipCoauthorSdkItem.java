package com.vk.clips.viewer.edit.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import xsna.asp;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: ClipCoauthorSdkItem.kt */
/* loaded from: classes17.dex */
public final class ClipCoauthorSdkItem implements Parcelable {
    public static final Parcelable.Creator<ClipCoauthorSdkItem> CREATOR = new a();
    public final UserId b;
    public final String c;
    public final String d;
    public final Type e;
    public final boolean f;
    public final boolean g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipCoauthorSdkItem.kt */
    public static final class Type implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Parcelable.Creator<Type> CREATOR;
        public static final Type Community;
        public static final Type Female;
        public static final Type Male;

        /* compiled from: ClipCoauthorSdkItem.kt */
        public static final class a implements Parcelable.Creator<Type> {
            @Override // android.os.Parcelable.Creator
            public final Type createFromParcel(Parcel parcel) {
                return Type.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Type[] newArray(int i) {
                return new Type[i];
            }
        }

        static {
            Type type = new Type("Male", 0);
            Male = type;
            Type type2 = new Type("Female", 1);
            Female = type2;
            Type type3 = new Type("Community", 2);
            Community = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            CREATOR = new a();
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

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: ClipCoauthorSdkItem.kt */
    public static final class a implements Parcelable.Creator<ClipCoauthorSdkItem> {
        @Override // android.os.Parcelable.Creator
        public final ClipCoauthorSdkItem createFromParcel(Parcel parcel) {
            return new ClipCoauthorSdkItem((UserId) parcel.readParcelable(ClipCoauthorSdkItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Type.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipCoauthorSdkItem[] newArray(int i) {
            return new ClipCoauthorSdkItem[i];
        }
    }

    public ClipCoauthorSdkItem(UserId userId, String str, String str2, Type type, boolean z, boolean z2) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = type;
        this.f = z;
        this.g = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipCoauthorSdkItem)) {
            return false;
        }
        ClipCoauthorSdkItem clipCoauthorSdkItem = (ClipCoauthorSdkItem) obj;
        return epx.f(this.b, clipCoauthorSdkItem.b) && epx.f(this.c, clipCoauthorSdkItem.c) && epx.f(this.d, clipCoauthorSdkItem.d) && this.e == clipCoauthorSdkItem.e && this.f == clipCoauthorSdkItem.f && this.g == clipCoauthorSdkItem.g;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d);
        Type type = this.e;
        return Boolean.hashCode(this.g) + qoy.b((a2 + (type == null ? 0 : type.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipCoauthorSdkItem(ownerId=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", avatar=");
        sb.append(this.d);
        sb.append(", type=");
        sb.append(this.e);
        sb.append(", isApproved=");
        sb.append(this.f);
        sb.append(", canSetStatus=");
        return q0.a(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Type type = this.e;
        if (type == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            type.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
