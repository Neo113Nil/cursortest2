package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.dto.common.id.UserId;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.go9;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.up;
import xsna.uqi;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NewsfeedMediaDiscoverActionDto.kt */
/* loaded from: classes15.dex */
public abstract class NewsfeedMediaDiscoverActionDto implements Parcelable {

    /* compiled from: NewsfeedMediaDiscoverActionDto.kt */
    public static final class Deserializer implements a9y<NewsfeedMediaDiscoverActionDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (epx.f(f, "similar_posts")) {
                return (NewsfeedMediaDiscoverActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedMediaDiscoverActionPostDto.class);
            }
            if (epx.f(f, "similar_clips")) {
                return (NewsfeedMediaDiscoverActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedMediaDiscoverActionClipDto.class);
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: NewsfeedMediaDiscoverActionDto.kt */
    public static final class NewsfeedMediaDiscoverActionClipDto extends NewsfeedMediaDiscoverActionDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedMediaDiscoverActionClipDto> CREATOR = new a();

        @pmi0("clip_id")
        private final Integer clipId;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("screen_title")
        private final String screenTitle;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedMediaDiscoverActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("similar_clips")
            public static final TypeDto SIMILAR_CLIPS;
            private final String value;

            /* compiled from: NewsfeedMediaDiscoverActionDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("SIMILAR_CLIPS", 0, "similar_clips");
                SIMILAR_CLIPS = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
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

        /* compiled from: NewsfeedMediaDiscoverActionDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedMediaDiscoverActionClipDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedMediaDiscoverActionClipDto createFromParcel(Parcel parcel) {
                return new NewsfeedMediaDiscoverActionClipDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), (UserId) parcel.readParcelable(NewsfeedMediaDiscoverActionClipDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedMediaDiscoverActionClipDto[] newArray(int i) {
                return new NewsfeedMediaDiscoverActionClipDto[i];
            }
        }

        public /* synthetic */ NewsfeedMediaDiscoverActionClipDto(TypeDto typeDto, String str, UserId userId, Integer num, int i, zcl zclVar) {
            this(typeDto, str, (i & 4) != 0 ? null : userId, (i & 8) != 0 ? null : num);
        }

        public final String d() {
            return this.screenTitle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedMediaDiscoverActionClipDto)) {
                return false;
            }
            NewsfeedMediaDiscoverActionClipDto newsfeedMediaDiscoverActionClipDto = (NewsfeedMediaDiscoverActionClipDto) obj;
            return this.type == newsfeedMediaDiscoverActionClipDto.type && epx.f(this.screenTitle, newsfeedMediaDiscoverActionClipDto.screenTitle) && epx.f(this.ownerId, newsfeedMediaDiscoverActionClipDto.ownerId) && epx.f(this.clipId, newsfeedMediaDiscoverActionClipDto.clipId);
        }

        public final int hashCode() {
            int a2 = urd0.a(this.type.hashCode() * 31, 31, this.screenTitle);
            UserId userId = this.ownerId;
            int hashCode = (a2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            Integer num = this.clipId;
            return hashCode + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedMediaDiscoverActionClipDto(type=");
            sb.append(this.type);
            sb.append(", screenTitle=");
            sb.append(this.screenTitle);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", clipId=");
            return uqi.b(sb, this.clipId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.screenTitle);
            parcel.writeParcelable(this.ownerId, i);
            Integer num = this.clipId;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
        }

        public NewsfeedMediaDiscoverActionClipDto(TypeDto typeDto, String str, UserId userId, Integer num) {
            super(null);
            this.type = typeDto;
            this.screenTitle = str;
            this.ownerId = userId;
            this.clipId = num;
        }
    }

    /* compiled from: NewsfeedMediaDiscoverActionDto.kt */
    public static final class NewsfeedMediaDiscoverActionPostDto extends NewsfeedMediaDiscoverActionDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedMediaDiscoverActionPostDto> CREATOR = new a();

        @pmi0("feed_id")
        private final String feedId;

        @pmi0("screen_title")
        private final String screenTitle;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedMediaDiscoverActionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("similar_posts")
            public static final TypeDto SIMILAR_POSTS;
            private final String value;

            /* compiled from: NewsfeedMediaDiscoverActionDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("SIMILAR_POSTS", 0, "similar_posts");
                SIMILAR_POSTS = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
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

        /* compiled from: NewsfeedMediaDiscoverActionDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedMediaDiscoverActionPostDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedMediaDiscoverActionPostDto createFromParcel(Parcel parcel) {
                return new NewsfeedMediaDiscoverActionPostDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedMediaDiscoverActionPostDto[] newArray(int i) {
                return new NewsfeedMediaDiscoverActionPostDto[i];
            }
        }

        public NewsfeedMediaDiscoverActionPostDto(TypeDto typeDto, String str, String str2) {
            super(null);
            this.type = typeDto;
            this.feedId = str;
            this.screenTitle = str2;
        }

        public final String d() {
            return this.feedId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.screenTitle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedMediaDiscoverActionPostDto)) {
                return false;
            }
            NewsfeedMediaDiscoverActionPostDto newsfeedMediaDiscoverActionPostDto = (NewsfeedMediaDiscoverActionPostDto) obj;
            return this.type == newsfeedMediaDiscoverActionPostDto.type && epx.f(this.feedId, newsfeedMediaDiscoverActionPostDto.feedId) && epx.f(this.screenTitle, newsfeedMediaDiscoverActionPostDto.screenTitle);
        }

        public final int hashCode() {
            return this.screenTitle.hashCode() + urd0.a(this.type.hashCode() * 31, 31, this.feedId);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedMediaDiscoverActionPostDto(type=");
            sb.append(this.type);
            sb.append(", feedId=");
            sb.append(this.feedId);
            sb.append(", screenTitle=");
            return ho8.a(sb, this.screenTitle, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.feedId);
            parcel.writeString(this.screenTitle);
        }
    }

    public /* synthetic */ NewsfeedMediaDiscoverActionDto(zcl zclVar) {
        this();
    }

    private NewsfeedMediaDiscoverActionDto() {
    }
}
