package com.vk.api.generated.places.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: PlacesPlaceDto.kt */
/* loaded from: classes15.dex */
public final class PlacesPlaceDto implements Parcelable {
    public static final Parcelable.Creator<PlacesPlaceDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final String address;

    @pmi0("bindings")
    private final List<Integer> bindings;

    @pmi0("category")
    private final Integer category;

    @pmi0("category_object")
    private final PlacesCategoryDto categoryObject;

    @pmi0("city")
    private final Integer city;

    @pmi0("country")
    private final Integer country;

    @pmi0("created")
    private final int created;

    @pmi0("discriminator")
    private final DiscriminatorDto discriminator;

    @pmi0("id")
    private final int id;

    @pmi0("is_deleted")
    private final boolean isDeleted;

    @pmi0("latitude")
    private final float latitude;

    @pmi0("longitude")
    private final float longitude;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("title")
    private final String title;

    @pmi0("total_checkins")
    private final int totalCheckins;

    @pmi0("updated")
    private final int updated;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PlacesPlaceDto.kt */
    public static final class DiscriminatorDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DiscriminatorDto[] $VALUES;
        public static final Parcelable.Creator<DiscriminatorDto> CREATOR;

        @pmi0("place")
        public static final DiscriminatorDto PLACE;
        private final String value;

        /* compiled from: PlacesPlaceDto.kt */
        public static final class a implements Parcelable.Creator<DiscriminatorDto> {
            @Override // android.os.Parcelable.Creator
            public final DiscriminatorDto createFromParcel(Parcel parcel) {
                return DiscriminatorDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DiscriminatorDto[] newArray(int i) {
                return new DiscriminatorDto[i];
            }
        }

        static {
            DiscriminatorDto discriminatorDto = new DiscriminatorDto("PLACE", 0, "place");
            PLACE = discriminatorDto;
            DiscriminatorDto[] discriminatorDtoArr = {discriminatorDto};
            $VALUES = discriminatorDtoArr;
            $ENTRIES = new asp(discriminatorDtoArr);
            CREATOR = new a();
        }

        private DiscriminatorDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static DiscriminatorDto valueOf(String str) {
            return (DiscriminatorDto) Enum.valueOf(DiscriminatorDto.class, str);
        }

        public static DiscriminatorDto[] values() {
            return (DiscriminatorDto[]) $VALUES.clone();
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

    /* compiled from: PlacesPlaceDto.kt */
    public static final class a implements Parcelable.Creator<PlacesPlaceDto> {
        @Override // android.os.Parcelable.Creator
        public final PlacesPlaceDto createFromParcel(Parcel parcel) {
            boolean z;
            PlacesCategoryDto placesCategoryDto;
            ArrayList arrayList;
            DiscriminatorDto createFromParcel = DiscriminatorDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            boolean z2 = parcel.readInt() != 0;
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            String readString = parcel.readString();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            PlacesCategoryDto createFromParcel2 = parcel.readInt() == 0 ? null : PlacesCategoryDto.CREATOR.createFromParcel(parcel);
            UserId userId = (UserId) parcel.readParcelable(PlacesPlaceDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                z = z2;
                placesCategoryDto = createFromParcel2;
                arrayList = null;
            } else {
                int readInt5 = parcel.readInt();
                z = z2;
                ArrayList arrayList2 = new ArrayList(readInt5);
                placesCategoryDto = createFromParcel2;
                int i = 0;
                while (i != readInt5) {
                    i = pm0.b(parcel, arrayList2, i, 1);
                    createFromParcel = createFromParcel;
                }
                arrayList = arrayList2;
            }
            return new PlacesPlaceDto(createFromParcel, readInt, readInt2, z, readFloat, readFloat2, readString, readInt3, readInt4, valueOf, valueOf2, readString2, valueOf3, placesCategoryDto, userId, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PlacesPlaceDto[] newArray(int i) {
            return new PlacesPlaceDto[i];
        }
    }

    public PlacesPlaceDto(DiscriminatorDto discriminatorDto, int i, int i2, boolean z, float f, float f2, String str, int i3, int i4, Integer num, Integer num2, String str2, Integer num3, PlacesCategoryDto placesCategoryDto, UserId userId, List<Integer> list) {
        this.discriminator = discriminatorDto;
        this.created = i;
        this.id = i2;
        this.isDeleted = z;
        this.latitude = f;
        this.longitude = f2;
        this.title = str;
        this.totalCheckins = i3;
        this.updated = i4;
        this.city = num;
        this.country = num2;
        this.address = str2;
        this.category = num3;
        this.categoryObject = placesCategoryDto;
        this.ownerId = userId;
        this.bindings = list;
    }

    public final String d() {
        return this.address;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.category;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlacesPlaceDto)) {
            return false;
        }
        PlacesPlaceDto placesPlaceDto = (PlacesPlaceDto) obj;
        return this.discriminator == placesPlaceDto.discriminator && this.created == placesPlaceDto.created && this.id == placesPlaceDto.id && this.isDeleted == placesPlaceDto.isDeleted && Float.compare(this.latitude, placesPlaceDto.latitude) == 0 && Float.compare(this.longitude, placesPlaceDto.longitude) == 0 && epx.f(this.title, placesPlaceDto.title) && this.totalCheckins == placesPlaceDto.totalCheckins && this.updated == placesPlaceDto.updated && epx.f(this.city, placesPlaceDto.city) && epx.f(this.country, placesPlaceDto.country) && epx.f(this.address, placesPlaceDto.address) && epx.f(this.category, placesPlaceDto.category) && epx.f(this.categoryObject, placesPlaceDto.categoryObject) && epx.f(this.ownerId, placesPlaceDto.ownerId) && epx.f(this.bindings, placesPlaceDto.bindings);
    }

    public final PlacesCategoryDto f() {
        return this.categoryObject;
    }

    public final Integer g() {
        return this.city;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = shy.a(this.updated, shy.a(this.totalCheckins, urd0.a(b.a(this.longitude, b.a(this.latitude, qoy.b(shy.a(this.id, shy.a(this.created, this.discriminator.hashCode() * 31, 31), 31), 31, this.isDeleted), 31), 31), 31, this.title), 31), 31);
        Integer num = this.city;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.country;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.address;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.category;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        PlacesCategoryDto placesCategoryDto = this.categoryObject;
        int hashCode5 = (hashCode4 + (placesCategoryDto == null ? 0 : placesCategoryDto.hashCode())) * 31;
        UserId userId = this.ownerId;
        int hashCode6 = (hashCode5 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        List<Integer> list = this.bindings;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final Integer i() {
        return this.country;
    }

    public final float j() {
        return this.latitude;
    }

    public final float k() {
        return this.longitude;
    }

    public final int l() {
        return this.totalCheckins;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlacesPlaceDto(discriminator=");
        sb.append(this.discriminator);
        sb.append(", created=");
        sb.append(this.created);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", isDeleted=");
        sb.append(this.isDeleted);
        sb.append(", latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", totalCheckins=");
        sb.append(this.totalCheckins);
        sb.append(", updated=");
        sb.append(this.updated);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", category=");
        sb.append(this.category);
        sb.append(", categoryObject=");
        sb.append(this.categoryObject);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", bindings=");
        return ms9.a(')', sb, this.bindings);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.discriminator.writeToParcel(parcel, i);
        parcel.writeInt(this.created);
        parcel.writeInt(this.id);
        parcel.writeInt(this.isDeleted ? 1 : 0);
        parcel.writeFloat(this.latitude);
        parcel.writeFloat(this.longitude);
        parcel.writeString(this.title);
        parcel.writeInt(this.totalCheckins);
        parcel.writeInt(this.updated);
        Integer num = this.city;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.country;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.address);
        Integer num3 = this.category;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        PlacesCategoryDto placesCategoryDto = this.categoryObject;
        if (placesCategoryDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            placesCategoryDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.ownerId, i);
        List<Integer> list = this.bindings;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeInt(((Number) f.next()).intValue());
        }
    }

    public /* synthetic */ PlacesPlaceDto(DiscriminatorDto discriminatorDto, int i, int i2, boolean z, float f, float f2, String str, int i3, int i4, Integer num, Integer num2, String str2, Integer num3, PlacesCategoryDto placesCategoryDto, UserId userId, List list, int i5, zcl zclVar) {
        this(discriminatorDto, i, i2, z, f, f2, str, i3, i4, (i5 & 512) != 0 ? null : num, (i5 & 1024) != 0 ? null : num2, (i5 & 2048) != 0 ? null : str2, (i5 & 4096) != 0 ? null : num3, (i5 & 8192) != 0 ? null : placesCategoryDto, (i5 & 16384) != 0 ? null : userId, (i5 & 32768) != 0 ? null : list);
    }
}
