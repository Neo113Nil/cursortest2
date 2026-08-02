package com.vk.clips.sdk.shared.api.feed.data.activities;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.bh10;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.ms9;
import xsna.nr;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SdkClipActivity.kt */
/* loaded from: classes17.dex */
public abstract class SdkClipActivity implements Parcelable {

    /* compiled from: SdkClipActivity.kt */
    public static final class Comments extends SdkClipActivity {
        public static final Parcelable.Creator<Comments> CREATOR = new a();
        public final List<Comment> b;

        /* compiled from: SdkClipActivity.kt */
        public static final class Comment implements Parcelable {
            public static final Parcelable.Creator<Comment> CREATOR = new a();
            public final int b;
            public final Integer c;
            public final UserId d;
            public final String e;
            public final String f;

            /* compiled from: SdkClipActivity.kt */
            public static final class a implements Parcelable.Creator<Comment> {
                @Override // android.os.Parcelable.Creator
                public final Comment createFromParcel(Parcel parcel) {
                    return new Comment(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UserId) parcel.readParcelable(Comment.class.getClassLoader()), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Comment[] newArray(int i) {
                    return new Comment[i];
                }
            }

            public Comment(int i, Integer num, UserId userId, String str, String str2) {
                this.b = i;
                this.c = num;
                this.d = userId;
                this.e = str;
                this.f = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Comment)) {
                    return false;
                }
                Comment comment = (Comment) obj;
                return this.b == comment.b && epx.f(this.c, comment.c) && epx.f(this.d, comment.d) && epx.f(this.e, comment.e) && epx.f(this.f, comment.f);
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.b) * 31;
                Integer num = this.c;
                return this.f.hashCode() + urd0.a(bh10.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.d.b), 31, this.e);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Comment(id=");
                sb.append(this.b);
                sb.append(", parentCommentId=");
                sb.append(this.c);
                sb.append(", userId=");
                sb.append(this.d);
                sb.append(", message=");
                sb.append(this.e);
                sb.append(", photo=");
                return ho8.a(sb, this.f, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b);
                Integer num = this.c;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    nr.a(parcel, 1, num);
                }
                parcel.writeParcelable(this.d, i);
                parcel.writeString(this.e);
                parcel.writeString(this.f);
            }
        }

        /* compiled from: SdkClipActivity.kt */
        public static final class a implements Parcelable.Creator<Comments> {
            @Override // android.os.Parcelable.Creator
            public final Comments createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(Comment.CREATOR, parcel, arrayList, i, 1);
                }
                return new Comments(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Comments[] newArray(int i) {
                return new Comments[i];
            }
        }

        public Comments(List<Comment> list) {
            super(Type.Comments, null);
            this.b = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Comments) && epx.f(this.b, ((Comments) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("Comments(comments="), this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Iterator a2 = ao.a(parcel, this.b);
            while (a2.hasNext()) {
                ((Comment) a2.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: SdkClipActivity.kt */
    public static final class Likes extends SdkClipActivity {
        public static final Parcelable.Creator<Likes> CREATOR = new a();
        public final List<Like> b;

        /* compiled from: SdkClipActivity.kt */
        public static final class Like implements Parcelable {
            public static final Parcelable.Creator<Like> CREATOR = new a();
            public final UserId b;
            public final String c;
            public final String d;
            public final OwnerSex e;
            public final String f;

            /* compiled from: SdkClipActivity.kt */
            public static final class a implements Parcelable.Creator<Like> {
                @Override // android.os.Parcelable.Creator
                public final Like createFromParcel(Parcel parcel) {
                    return new Like((UserId) parcel.readParcelable(Like.class.getClassLoader()), parcel.readString(), parcel.readString(), OwnerSex.valueOf(parcel.readString()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Like[] newArray(int i) {
                    return new Like[i];
                }
            }

            public Like(UserId userId, String str, String str2, OwnerSex ownerSex, String str3) {
                this.b = userId;
                this.c = str;
                this.d = str2;
                this.e = ownerSex;
                this.f = str3;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Like)) {
                    return false;
                }
                Like like = (Like) obj;
                return epx.f(this.b, like.b) && epx.f(this.c, like.c) && epx.f(this.d, like.d) && this.e == like.e && epx.f(this.f, like.f);
            }

            public final int hashCode() {
                int a2 = urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c);
                String str = this.d;
                int hashCode = (this.e.hashCode() + ((a2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
                String str2 = this.f;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Like(userId=");
                sb.append(this.b);
                sb.append(", photo=");
                sb.append(this.c);
                sb.append(", name=");
                sb.append(this.d);
                sb.append(", sex=");
                sb.append(this.e);
                sb.append(", animatedBadgeUrl=");
                return ho8.a(sb, this.f, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeParcelable(this.b, i);
                parcel.writeString(this.c);
                parcel.writeString(this.d);
                parcel.writeString(this.e.name());
                parcel.writeString(this.f);
            }
        }

        /* compiled from: SdkClipActivity.kt */
        public static final class a implements Parcelable.Creator<Likes> {
            @Override // android.os.Parcelable.Creator
            public final Likes createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(Like.CREATOR, parcel, arrayList, i, 1);
                }
                return new Likes(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Likes[] newArray(int i) {
                return new Likes[i];
            }
        }

        public Likes(List<Like> list) {
            super(Type.Likes, null);
            this.b = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Likes) && epx.f(this.b, ((Likes) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("Likes(likes="), this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Iterator a2 = ao.a(parcel, this.b);
            while (a2.hasNext()) {
                ((Like) a2.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SdkClipActivity.kt */
    public static final class OwnerSex {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OwnerSex[] $VALUES;
        public static final a Companion;
        public static final OwnerSex FEMALE;
        public static final OwnerSex MALE;
        public static final OwnerSex UNKNOWN;
        private final int code;

        /* compiled from: SdkClipActivity.kt */
        public static final class a {
        }

        static {
            OwnerSex ownerSex = new OwnerSex(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
            UNKNOWN = ownerSex;
            OwnerSex ownerSex2 = new OwnerSex("FEMALE", 1, 1);
            FEMALE = ownerSex2;
            OwnerSex ownerSex3 = new OwnerSex("MALE", 2, 2);
            MALE = ownerSex3;
            OwnerSex[] ownerSexArr = {ownerSex, ownerSex2, ownerSex3};
            $VALUES = ownerSexArr;
            $ENTRIES = new asp(ownerSexArr);
            Companion = new a();
        }

        public OwnerSex(String str, int i, int i2) {
            this.code = i2;
        }

        public static zrp<OwnerSex> h() {
            return $ENTRIES;
        }

        public static OwnerSex valueOf(String str) {
            return (OwnerSex) Enum.valueOf(OwnerSex.class, str);
        }

        public static OwnerSex[] values() {
            return (OwnerSex[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SdkClipActivity.kt */
    public static final class Type implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Parcelable.Creator<Type> CREATOR;
        public static final Type Comments;
        public static final Type Likes;
        public static final Type Unknown;
        private final String key;

        /* compiled from: SdkClipActivity.kt */
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
            Type type = new Type("Likes", 0, "likes");
            Likes = type;
            Type type2 = new Type("Comments", 1, "comments");
            Comments = type2;
            Type type3 = new Type(DeviceInfo.STR_TYPE_UNKNOWN, 2, "unknown");
            Unknown = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            CREATOR = new a();
        }

        public Type(String str, int i, String str2) {
            this.key = str2;
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

    /* compiled from: SdkClipActivity.kt */
    public static final class Unknown extends SdkClipActivity {
        public static final Parcelable.Creator<Unknown> CREATOR = new a();
        public final String b;

        /* compiled from: SdkClipActivity.kt */
        public static final class a implements Parcelable.Creator<Unknown> {
            @Override // android.os.Parcelable.Creator
            public final Unknown createFromParcel(Parcel parcel) {
                return new Unknown(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Unknown[] newArray(int i) {
                return new Unknown[i];
            }
        }

        public Unknown(String str) {
            super(Type.Unknown, null);
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    public SdkClipActivity(Type type, zcl zclVar) {
    }
}
