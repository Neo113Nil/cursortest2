package com.vk.api.generated.places.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: PlacesCheckinDto.kt */
/* loaded from: classes15.dex */
public final class PlacesCheckinDto implements Parcelable {
    public static final Parcelable.Creator<PlacesCheckinDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("latitude")
    private final Float latitude;

    @pmi0("longitude")
    private final Float longitude;

    @pmi0("object_id")
    private final Integer objectId;

    @pmi0("object_type")
    private final ObjectTypeDto objectType;

    @pmi0("place_id")
    private final int placeId;

    @pmi0("timestamp")
    private final int timestamp;

    @pmi0("user_id")
    private final UserId userId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PlacesCheckinDto.kt */
    public static final class ObjectTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ObjectTypeDto[] $VALUES;
        public static final Parcelable.Creator<ObjectTypeDto> CREATOR;

        @pmi0("post")
        public static final ObjectTypeDto POST;

        @pmi0("story")
        public static final ObjectTypeDto STORY;
        private final String value;

        /* compiled from: PlacesCheckinDto.kt */
        public static final class a implements Parcelable.Creator<ObjectTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final ObjectTypeDto createFromParcel(Parcel parcel) {
                return ObjectTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ObjectTypeDto[] newArray(int i) {
                return new ObjectTypeDto[i];
            }
        }

        static {
            ObjectTypeDto objectTypeDto = new ObjectTypeDto("POST", 0, "post");
            POST = objectTypeDto;
            ObjectTypeDto objectTypeDto2 = new ObjectTypeDto("STORY", 1, "story");
            STORY = objectTypeDto2;
            ObjectTypeDto[] objectTypeDtoArr = {objectTypeDto, objectTypeDto2};
            $VALUES = objectTypeDtoArr;
            $ENTRIES = new asp(objectTypeDtoArr);
            CREATOR = new a();
        }

        private ObjectTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ObjectTypeDto valueOf(String str) {
            return (ObjectTypeDto) Enum.valueOf(ObjectTypeDto.class, str);
        }

        public static ObjectTypeDto[] values() {
            return (ObjectTypeDto[]) $VALUES.clone();
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

    /* compiled from: PlacesCheckinDto.kt */
    public static final class a implements Parcelable.Creator<PlacesCheckinDto> {
        @Override // android.os.Parcelable.Creator
        public final PlacesCheckinDto createFromParcel(Parcel parcel) {
            return new PlacesCheckinDto(parcel.readInt(), parcel.readInt(), parcel.readInt(), (UserId) parcel.readParcelable(PlacesCheckinDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? ObjectTypeDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final PlacesCheckinDto[] newArray(int i) {
            return new PlacesCheckinDto[i];
        }
    }

    public PlacesCheckinDto(int i, int i2, int i3, UserId userId, Float f, Float f2, Integer num, ObjectTypeDto objectTypeDto) {
        this.id = i;
        this.placeId = i2;
        this.timestamp = i3;
        this.userId = userId;
        this.latitude = f;
        this.longitude = f2;
        this.objectId = num;
        this.objectType = objectTypeDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlacesCheckinDto)) {
            return false;
        }
        PlacesCheckinDto placesCheckinDto = (PlacesCheckinDto) obj;
        return this.id == placesCheckinDto.id && this.placeId == placesCheckinDto.placeId && this.timestamp == placesCheckinDto.timestamp && epx.f(this.userId, placesCheckinDto.userId) && epx.f(this.latitude, placesCheckinDto.latitude) && epx.f(this.longitude, placesCheckinDto.longitude) && epx.f(this.objectId, placesCheckinDto.objectId) && this.objectType == placesCheckinDto.objectType;
    }

    public final int hashCode() {
        int a2 = bh10.a(shy.a(this.timestamp, shy.a(this.placeId, Integer.hashCode(this.id) * 31, 31), 31), 31, this.userId.b);
        Float f = this.latitude;
        int hashCode = (a2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.longitude;
        int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num = this.objectId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        ObjectTypeDto objectTypeDto = this.objectType;
        return hashCode3 + (objectTypeDto != null ? objectTypeDto.hashCode() : 0);
    }

    public final String toString() {
        return "PlacesCheckinDto(id=" + this.id + ", placeId=" + this.placeId + ", timestamp=" + this.timestamp + ", userId=" + this.userId + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", objectId=" + this.objectId + ", objectType=" + this.objectType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.placeId);
        parcel.writeInt(this.timestamp);
        parcel.writeParcelable(this.userId, i);
        Float f = this.latitude;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Float f2 = this.longitude;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
        Integer num = this.objectId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        ObjectTypeDto objectTypeDto = this.objectType;
        if (objectTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            objectTypeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ PlacesCheckinDto(int i, int i2, int i3, UserId userId, Float f, Float f2, Integer num, ObjectTypeDto objectTypeDto, int i4, zcl zclVar) {
        this(i, i2, i3, userId, (i4 & 16) != 0 ? null : f, (i4 & 32) != 0 ? null : f2, (i4 & 64) != 0 ? null : num, (i4 & 128) != 0 ? null : objectTypeDto);
    }
}
