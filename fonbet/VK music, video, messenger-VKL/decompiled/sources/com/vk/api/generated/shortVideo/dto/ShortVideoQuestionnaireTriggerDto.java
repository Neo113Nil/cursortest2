package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import java.util.List;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.go9;
import xsna.ms9;
import xsna.pmi0;
import xsna.up;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ShortVideoQuestionnaireTriggerDto.kt */
/* loaded from: classes15.dex */
public abstract class ShortVideoQuestionnaireTriggerDto implements Parcelable {

    /* compiled from: ShortVideoQuestionnaireTriggerDto.kt */
    public static final class Deserializer implements a9y<ShortVideoQuestionnaireTriggerDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -1091899251:
                        if (f.equals("after_view_advertising")) {
                            return (ShortVideoQuestionnaireTriggerDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ShortVideoQuestionnaireTriggerAfterItemDto.class);
                        }
                        break;
                    case 191934628:
                        if (f.equals("after_view_video")) {
                            return (ShortVideoQuestionnaireTriggerDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ShortVideoQuestionnaireTriggerAfterItemDto.class);
                        }
                        break;
                    case 347537148:
                        if (f.equals("after_comment")) {
                            return (ShortVideoQuestionnaireTriggerDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ShortVideoQuestionnaireTriggerAfterUserActionDto.class);
                        }
                        break;
                    case 562681753:
                        if (f.equals("after_likes")) {
                            return (ShortVideoQuestionnaireTriggerDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ShortVideoQuestionnaireTriggerAfterUserActionDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: ShortVideoQuestionnaireTriggerDto.kt */
    public static final class ShortVideoQuestionnaireTriggerAfterItemDto extends ShortVideoQuestionnaireTriggerDto implements Parcelable {
        public static final Parcelable.Creator<ShortVideoQuestionnaireTriggerAfterItemDto> CREATOR = new a();

        @pmi0("item_ids")
        private final List<String> itemIds;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ShortVideoQuestionnaireTriggerDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("after_view_advertising")
            public static final TypeDto AFTER_VIEW_ADVERTISING;

            @pmi0("after_view_video")
            public static final TypeDto AFTER_VIEW_VIDEO;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: ShortVideoQuestionnaireTriggerDto.kt */
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
                TypeDto typeDto = new TypeDto("AFTER_VIEW_VIDEO", 0, "after_view_video");
                AFTER_VIEW_VIDEO = typeDto;
                TypeDto typeDto2 = new TypeDto("AFTER_VIEW_ADVERTISING", 1, "after_view_advertising");
                AFTER_VIEW_ADVERTISING = typeDto2;
                TypeDto[] typeDtoArr = {typeDto, typeDto2};
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

            public final String i() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: ShortVideoQuestionnaireTriggerDto.kt */
        public static final class a implements Parcelable.Creator<ShortVideoQuestionnaireTriggerAfterItemDto> {
            @Override // android.os.Parcelable.Creator
            public final ShortVideoQuestionnaireTriggerAfterItemDto createFromParcel(Parcel parcel) {
                return new ShortVideoQuestionnaireTriggerAfterItemDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final ShortVideoQuestionnaireTriggerAfterItemDto[] newArray(int i) {
                return new ShortVideoQuestionnaireTriggerAfterItemDto[i];
            }
        }

        public ShortVideoQuestionnaireTriggerAfterItemDto(TypeDto typeDto, List<String> list) {
            super(null);
            this.type = typeDto;
            this.itemIds = list;
        }

        public final List<String> d() {
            return this.itemIds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final TypeDto e() {
            return this.type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShortVideoQuestionnaireTriggerAfterItemDto)) {
                return false;
            }
            ShortVideoQuestionnaireTriggerAfterItemDto shortVideoQuestionnaireTriggerAfterItemDto = (ShortVideoQuestionnaireTriggerAfterItemDto) obj;
            return this.type == shortVideoQuestionnaireTriggerAfterItemDto.type && epx.f(this.itemIds, shortVideoQuestionnaireTriggerAfterItemDto.itemIds);
        }

        public final int hashCode() {
            return this.itemIds.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShortVideoQuestionnaireTriggerAfterItemDto(type=");
            sb.append(this.type);
            sb.append(", itemIds=");
            return ms9.a(')', sb, this.itemIds);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeStringList(this.itemIds);
        }
    }

    /* compiled from: ShortVideoQuestionnaireTriggerDto.kt */
    public static final class ShortVideoQuestionnaireTriggerAfterUserActionDto extends ShortVideoQuestionnaireTriggerDto implements Parcelable {
        public static final Parcelable.Creator<ShortVideoQuestionnaireTriggerAfterUserActionDto> CREATOR = new a();

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ShortVideoQuestionnaireTriggerDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("after_comment")
            public static final TypeDto AFTER_COMMENT;

            @pmi0("after_like")
            public static final TypeDto AFTER_LIKE;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: ShortVideoQuestionnaireTriggerDto.kt */
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
                TypeDto typeDto = new TypeDto("AFTER_LIKE", 0, "after_like");
                AFTER_LIKE = typeDto;
                TypeDto typeDto2 = new TypeDto("AFTER_COMMENT", 1, "after_comment");
                AFTER_COMMENT = typeDto2;
                TypeDto[] typeDtoArr = {typeDto, typeDto2};
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

            public final String i() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: ShortVideoQuestionnaireTriggerDto.kt */
        public static final class a implements Parcelable.Creator<ShortVideoQuestionnaireTriggerAfterUserActionDto> {
            @Override // android.os.Parcelable.Creator
            public final ShortVideoQuestionnaireTriggerAfterUserActionDto createFromParcel(Parcel parcel) {
                return new ShortVideoQuestionnaireTriggerAfterUserActionDto(TypeDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ShortVideoQuestionnaireTriggerAfterUserActionDto[] newArray(int i) {
                return new ShortVideoQuestionnaireTriggerAfterUserActionDto[i];
            }
        }

        public ShortVideoQuestionnaireTriggerAfterUserActionDto(TypeDto typeDto) {
            super(null);
            this.type = typeDto;
        }

        public final TypeDto d() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShortVideoQuestionnaireTriggerAfterUserActionDto) && this.type == ((ShortVideoQuestionnaireTriggerAfterUserActionDto) obj).type;
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final String toString() {
            return "ShortVideoQuestionnaireTriggerAfterUserActionDto(type=" + this.type + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ShortVideoQuestionnaireTriggerDto(zcl zclVar) {
        this();
    }

    private ShortVideoQuestionnaireTriggerDto() {
    }
}
