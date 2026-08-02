package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NewsfeedNewsfeedItemHeaderActionDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedNewsfeedItemHeaderActionDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedNewsfeedItemHeaderActionDto> CREATOR = new a();

    @pmi0("modal")
    private final NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto modal;

    @pmi0("remote_action")
    private final BaseLinkButtonActionDto remoteAction;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NewsfeedNewsfeedItemHeaderActionDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("best_friend_posting")
        public static final TypeDto BEST_FRIEND_POSTING;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("open_copyright")
        public static final TypeDto OPEN_COPYRIGHT;

        @pmi0("open_geo_feed")
        public static final TypeDto OPEN_GEO_FEED;

        @pmi0("open_modal")
        public static final TypeDto OPEN_MODAL;

        @pmi0("open_translation")
        public static final TypeDto OPEN_TRANSLATION;

        @pmi0("remote_action")
        public static final TypeDto REMOTE_ACTION;
        private final String value;

        /* compiled from: NewsfeedNewsfeedItemHeaderActionDto.kt */
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
            TypeDto typeDto = new TypeDto("REMOTE_ACTION", 0, "remote_action");
            REMOTE_ACTION = typeDto;
            TypeDto typeDto2 = new TypeDto("OPEN_MODAL", 1, "open_modal");
            OPEN_MODAL = typeDto2;
            TypeDto typeDto3 = new TypeDto("OPEN_COPYRIGHT", 2, "open_copyright");
            OPEN_COPYRIGHT = typeDto3;
            TypeDto typeDto4 = new TypeDto("BEST_FRIEND_POSTING", 3, "best_friend_posting");
            BEST_FRIEND_POSTING = typeDto4;
            TypeDto typeDto5 = new TypeDto("OPEN_TRANSLATION", 4, "open_translation");
            OPEN_TRANSLATION = typeDto5;
            TypeDto typeDto6 = new TypeDto("OPEN_GEO_FEED", 5, "open_geo_feed");
            OPEN_GEO_FEED = typeDto6;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6};
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

    /* compiled from: NewsfeedNewsfeedItemHeaderActionDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedNewsfeedItemHeaderActionDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderActionDto createFromParcel(Parcel parcel) {
            return new NewsfeedNewsfeedItemHeaderActionDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto.CREATOR.createFromParcel(parcel), (BaseLinkButtonActionDto) parcel.readParcelable(NewsfeedNewsfeedItemHeaderActionDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderActionDto[] newArray(int i) {
            return new NewsfeedNewsfeedItemHeaderActionDto[i];
        }
    }

    public NewsfeedNewsfeedItemHeaderActionDto(TypeDto typeDto, NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto newsfeedNewsfeedItemHeaderActionOpenModalBaseDto, BaseLinkButtonActionDto baseLinkButtonActionDto) {
        this.type = typeDto;
        this.modal = newsfeedNewsfeedItemHeaderActionOpenModalBaseDto;
        this.remoteAction = baseLinkButtonActionDto;
    }

    public final NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto d() {
        return this.modal;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseLinkButtonActionDto e() {
        return this.remoteAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedNewsfeedItemHeaderActionDto)) {
            return false;
        }
        NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto = (NewsfeedNewsfeedItemHeaderActionDto) obj;
        return this.type == newsfeedNewsfeedItemHeaderActionDto.type && epx.f(this.modal, newsfeedNewsfeedItemHeaderActionDto.modal) && epx.f(this.remoteAction, newsfeedNewsfeedItemHeaderActionDto.remoteAction);
    }

    public final TypeDto f() {
        return this.type;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto newsfeedNewsfeedItemHeaderActionOpenModalBaseDto = this.modal;
        int hashCode2 = (hashCode + (newsfeedNewsfeedItemHeaderActionOpenModalBaseDto == null ? 0 : newsfeedNewsfeedItemHeaderActionOpenModalBaseDto.hashCode())) * 31;
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.remoteAction;
        return hashCode2 + (baseLinkButtonActionDto != null ? baseLinkButtonActionDto.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedNewsfeedItemHeaderActionDto(type=" + this.type + ", modal=" + this.modal + ", remoteAction=" + this.remoteAction + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto newsfeedNewsfeedItemHeaderActionOpenModalBaseDto = this.modal;
        if (newsfeedNewsfeedItemHeaderActionOpenModalBaseDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemHeaderActionOpenModalBaseDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.remoteAction, i);
    }

    public /* synthetic */ NewsfeedNewsfeedItemHeaderActionDto(TypeDto typeDto, NewsfeedNewsfeedItemHeaderActionOpenModalBaseDto newsfeedNewsfeedItemHeaderActionOpenModalBaseDto, BaseLinkButtonActionDto baseLinkButtonActionDto, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : newsfeedNewsfeedItemHeaderActionOpenModalBaseDto, (i & 4) != 0 ? null : baseLinkButtonActionDto);
    }
}
