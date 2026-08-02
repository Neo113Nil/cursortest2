package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NotificationsUnifiedEntityDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsUnifiedEntityDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsUnifiedEntityDto> CREATOR = new a();

    @pmi0("action")
    private final NotificationsUnifiedActionDto action;

    @pmi0("image_object")
    private final List<NotificationsUnifiedImageObjectDto> imageObject;

    @pmi0("object_id")
    private final String objectId;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NotificationsUnifiedEntityDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        public static final TypeDto APP;

        @pmi0("audio")
        public static final TypeDto AUDIO;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("doc")
        public static final TypeDto DOC;

        @pmi0("geo")
        public static final TypeDto GEO;

        @pmi0("group")
        public static final TypeDto GROUP;

        @pmi0("image")
        public static final TypeDto IMAGE;

        @pmi0("link")
        public static final TypeDto LINK;

        @pmi0("photo")
        public static final TypeDto PHOTO;

        @pmi0("sticker")
        public static final TypeDto STICKER;

        @pmi0("story")
        public static final TypeDto STORY;

        @pmi0("user")
        public static final TypeDto USER;

        @pmi0("video")
        public static final TypeDto VIDEO;
        private final String value;

        /* compiled from: NotificationsUnifiedEntityDto.kt */
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
            TypeDto typeDto = new TypeDto("USER", 0, "user");
            USER = typeDto;
            TypeDto typeDto2 = new TypeDto("GROUP", 1, "group");
            GROUP = typeDto2;
            TypeDto typeDto3 = new TypeDto("PHOTO", 2, "photo");
            PHOTO = typeDto3;
            TypeDto typeDto4 = new TypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 3, "video");
            VIDEO = typeDto4;
            TypeDto typeDto5 = new TypeDto("IMAGE", 4, "image");
            IMAGE = typeDto5;
            TypeDto typeDto6 = new TypeDto("LINK", 5, "link");
            LINK = typeDto6;
            TypeDto typeDto7 = new TypeDto("DOC", 6, "doc");
            DOC = typeDto7;
            TypeDto typeDto8 = new TypeDto(SignalingProtocol.MEDIA_OPTION_AUDIO, 7, "audio");
            AUDIO = typeDto8;
            TypeDto typeDto9 = new TypeDto("APP", 8, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            APP = typeDto9;
            TypeDto typeDto10 = new TypeDto("GEO", 9, "geo");
            GEO = typeDto10;
            TypeDto typeDto11 = new TypeDto("STICKER", 10, "sticker");
            STICKER = typeDto11;
            TypeDto typeDto12 = new TypeDto("STORY", 11, "story");
            STORY = typeDto12;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8, typeDto9, typeDto10, typeDto11, typeDto12};
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

    /* compiled from: NotificationsUnifiedEntityDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsUnifiedEntityDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsUnifiedEntityDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(NotificationsUnifiedImageObjectDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new NotificationsUnifiedEntityDto(createFromParcel, readString, arrayList, parcel.readInt() != 0 ? NotificationsUnifiedActionDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsUnifiedEntityDto[] newArray(int i) {
            return new NotificationsUnifiedEntityDto[i];
        }
    }

    public NotificationsUnifiedEntityDto(TypeDto typeDto, String str, List<NotificationsUnifiedImageObjectDto> list, NotificationsUnifiedActionDto notificationsUnifiedActionDto) {
        this.type = typeDto;
        this.objectId = str;
        this.imageObject = list;
        this.action = notificationsUnifiedActionDto;
    }

    public static NotificationsUnifiedEntityDto a(NotificationsUnifiedEntityDto notificationsUnifiedEntityDto, NotificationsUnifiedActionDto notificationsUnifiedActionDto) {
        TypeDto typeDto = notificationsUnifiedEntityDto.type;
        String str = notificationsUnifiedEntityDto.objectId;
        List<NotificationsUnifiedImageObjectDto> list = notificationsUnifiedEntityDto.imageObject;
        notificationsUnifiedEntityDto.getClass();
        return new NotificationsUnifiedEntityDto(typeDto, str, list, notificationsUnifiedActionDto);
    }

    public final NotificationsUnifiedActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationsUnifiedEntityDto)) {
            return false;
        }
        NotificationsUnifiedEntityDto notificationsUnifiedEntityDto = (NotificationsUnifiedEntityDto) obj;
        return this.type == notificationsUnifiedEntityDto.type && epx.f(this.objectId, notificationsUnifiedEntityDto.objectId) && epx.f(this.imageObject, notificationsUnifiedEntityDto.imageObject) && epx.f(this.action, notificationsUnifiedEntityDto.action);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.objectId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<NotificationsUnifiedImageObjectDto> list = this.imageObject;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        NotificationsUnifiedActionDto notificationsUnifiedActionDto = this.action;
        return hashCode3 + (notificationsUnifiedActionDto != null ? notificationsUnifiedActionDto.hashCode() : 0);
    }

    public final String toString() {
        return "NotificationsUnifiedEntityDto(type=" + this.type + ", objectId=" + this.objectId + ", imageObject=" + this.imageObject + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.objectId);
        List<NotificationsUnifiedImageObjectDto> list = this.imageObject;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((NotificationsUnifiedImageObjectDto) f.next()).writeToParcel(parcel, i);
            }
        }
        NotificationsUnifiedActionDto notificationsUnifiedActionDto = this.action;
        if (notificationsUnifiedActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationsUnifiedActionDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ NotificationsUnifiedEntityDto(TypeDto typeDto, String str, List list, NotificationsUnifiedActionDto notificationsUnifiedActionDto, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : notificationsUnifiedActionDto);
    }
}
