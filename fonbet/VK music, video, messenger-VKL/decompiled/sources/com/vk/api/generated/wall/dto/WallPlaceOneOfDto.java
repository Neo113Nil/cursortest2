package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.api.generated.places.dto.PlacesCategoryDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dn;
import xsna.epx;
import xsna.go9;
import xsna.ms9;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.up;
import xsna.uqi;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: WallPlaceOneOfDto.kt */
/* loaded from: classes.dex */
public abstract class WallPlaceOneOfDto implements Parcelable {

    /* compiled from: WallPlaceOneOfDto.kt */
    public static final class Deserializer implements a9y<WallPlaceOneOfDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "discriminator");
            if (f != null) {
                switch (f.hashCode()) {
                    case -509728213:
                        if (f.equals("place_old_with_text_in_city_and_country")) {
                            return (WallPlaceOneOfDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, PlacesPlaceOldWithTextInCityAndCountryDto.class);
                        }
                        break;
                    case 106748167:
                        if (f.equals("place")) {
                            return (WallPlaceOneOfDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, PlacesPlaceDto.class);
                        }
                        break;
                    case 1789226563:
                        if (f.equals("place_with_text_in_city_and_country")) {
                            return (WallPlaceOneOfDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, PlacesPlaceWithTextInCityAndCountryDto.class);
                        }
                        break;
                    case 1792531183:
                        if (f.equals("place_old")) {
                            return (WallPlaceOneOfDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, PlacesPlaceOldDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: WallPlaceOneOfDto.kt */
    /* loaded from: classes15.dex */
    public static final class PlacesPlaceDto extends WallPlaceOneOfDto implements Parcelable {
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
        /* compiled from: WallPlaceOneOfDto.kt */
        public static final class DiscriminatorDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ DiscriminatorDto[] $VALUES;
            public static final Parcelable.Creator<DiscriminatorDto> CREATOR;

            @pmi0("place")
            public static final DiscriminatorDto PLACE;
            private final String value;

            /* compiled from: WallPlaceOneOfDto.kt */
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

        /* compiled from: WallPlaceOneOfDto.kt */
        public static final class a implements Parcelable.Creator<PlacesPlaceDto> {
            @Override // android.os.Parcelable.Creator
            public final PlacesPlaceDto createFromParcel(Parcel parcel) {
                boolean z;
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
                PlacesCategoryDto placesCategoryDto = (PlacesCategoryDto) parcel.readParcelable(PlacesPlaceDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(PlacesPlaceDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    z = z2;
                    arrayList = null;
                } else {
                    int readInt5 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt5);
                    z = z2;
                    int i = 0;
                    while (i != readInt5) {
                        i = pm0.b(parcel, arrayList2, i, 1);
                        placesCategoryDto = placesCategoryDto;
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

        public /* synthetic */ PlacesPlaceDto(DiscriminatorDto discriminatorDto, int i, int i2, boolean z, float f, float f2, String str, int i3, int i4, Integer num, Integer num2, String str2, Integer num3, PlacesCategoryDto placesCategoryDto, UserId userId, List list, int i5, zcl zclVar) {
            this(discriminatorDto, i, i2, z, f, f2, str, i3, i4, (i5 & 512) != 0 ? null : num, (i5 & 1024) != 0 ? null : num2, (i5 & 2048) != 0 ? null : str2, (i5 & 4096) != 0 ? null : num3, (i5 & 8192) != 0 ? null : placesCategoryDto, (i5 & 16384) != 0 ? null : userId, (i5 & 32768) != 0 ? null : list);
        }

        public final String d() {
            return this.address;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final Integer e() {
            return this.city;
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

        public final Integer f() {
            return this.country;
        }

        public final float g() {
            return this.latitude;
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

        public final float i() {
            return this.longitude;
        }

        public final int j() {
            return this.totalCheckins;
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
            parcel.writeParcelable(this.categoryObject, i);
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

        public PlacesPlaceDto(DiscriminatorDto discriminatorDto, int i, int i2, boolean z, float f, float f2, String str, int i3, int i4, Integer num, Integer num2, String str2, Integer num3, PlacesCategoryDto placesCategoryDto, UserId userId, List<Integer> list) {
            super(null);
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
    }

    /* compiled from: WallPlaceOneOfDto.kt */
    /* loaded from: classes15.dex */
    public static final class PlacesPlaceOldDto extends WallPlaceOneOfDto implements Parcelable {
        public static final Parcelable.Creator<PlacesPlaceOldDto> CREATOR = new a();

        @pmi0(RTCStatsConstants.KEY_ADDRESS)
        private final String address;

        @pmi0("checkins")
        private final Integer checkins;

        @pmi0("city")
        private final Integer city;

        @pmi0("country")
        private final Integer country;

        @pmi0("created")
        private final int created;

        @pmi0("discriminator")
        private final DiscriminatorDto discriminator;

        @pmi0("distance")
        private final Integer distance;

        @pmi0("group_id")
        private final UserId groupId;

        @pmi0("group_photo")
        private final String groupPhoto;

        @pmi0("icon")
        private final String icon;

        @pmi0("id")
        private final int id;

        @pmi0("latitude")
        private final float latitude;

        @pmi0("longitude")
        private final float longitude;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final Integer type;

        @pmi0("updated")
        private final Integer updated;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: WallPlaceOneOfDto.kt */
        public static final class DiscriminatorDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ DiscriminatorDto[] $VALUES;
            public static final Parcelable.Creator<DiscriminatorDto> CREATOR;

            @pmi0("place_old")
            public static final DiscriminatorDto PLACE_OLD;
            private final String value;

            /* compiled from: WallPlaceOneOfDto.kt */
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
                DiscriminatorDto discriminatorDto = new DiscriminatorDto("PLACE_OLD", 0, "place_old");
                PLACE_OLD = discriminatorDto;
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

        /* compiled from: WallPlaceOneOfDto.kt */
        public static final class a implements Parcelable.Creator<PlacesPlaceOldDto> {
            @Override // android.os.Parcelable.Creator
            public final PlacesPlaceOldDto createFromParcel(Parcel parcel) {
                return new PlacesPlaceOldDto(DiscriminatorDto.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UserId) parcel.readParcelable(PlacesPlaceOldDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final PlacesPlaceOldDto[] newArray(int i) {
                return new PlacesPlaceOldDto[i];
            }
        }

        public /* synthetic */ PlacesPlaceOldDto(DiscriminatorDto discriminatorDto, int i, String str, float f, float f2, int i2, String str2, Integer num, Integer num2, UserId userId, String str3, Integer num3, Integer num4, Integer num5, String str4, Integer num6, int i3, zcl zclVar) {
            this(discriminatorDto, i, str, f, f2, i2, str2, (i3 & 128) != 0 ? null : num, (i3 & 256) != 0 ? null : num2, (i3 & 512) != 0 ? null : userId, (i3 & 1024) != 0 ? null : str3, (i3 & 2048) != 0 ? null : num3, (i3 & 4096) != 0 ? null : num4, (i3 & 8192) != 0 ? null : num5, (i3 & 16384) != 0 ? null : str4, (i3 & 32768) != 0 ? null : num6);
        }

        public final String d() {
            return this.address;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final Integer e() {
            return this.checkins;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlacesPlaceOldDto)) {
                return false;
            }
            PlacesPlaceOldDto placesPlaceOldDto = (PlacesPlaceOldDto) obj;
            return this.discriminator == placesPlaceOldDto.discriminator && this.id == placesPlaceOldDto.id && epx.f(this.title, placesPlaceOldDto.title) && Float.compare(this.latitude, placesPlaceOldDto.latitude) == 0 && Float.compare(this.longitude, placesPlaceOldDto.longitude) == 0 && this.created == placesPlaceOldDto.created && epx.f(this.icon, placesPlaceOldDto.icon) && epx.f(this.country, placesPlaceOldDto.country) && epx.f(this.city, placesPlaceOldDto.city) && epx.f(this.groupId, placesPlaceOldDto.groupId) && epx.f(this.groupPhoto, placesPlaceOldDto.groupPhoto) && epx.f(this.checkins, placesPlaceOldDto.checkins) && epx.f(this.updated, placesPlaceOldDto.updated) && epx.f(this.type, placesPlaceOldDto.type) && epx.f(this.address, placesPlaceOldDto.address) && epx.f(this.distance, placesPlaceOldDto.distance);
        }

        public final Integer f() {
            return this.city;
        }

        public final Integer g() {
            return this.country;
        }

        public final int getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int a2 = urd0.a(shy.a(this.created, b.a(this.longitude, b.a(this.latitude, urd0.a(shy.a(this.id, this.discriminator.hashCode() * 31, 31), 31, this.title), 31), 31), 31), 31, this.icon);
            Integer num = this.country;
            int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.city;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            UserId userId = this.groupId;
            int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            String str = this.groupPhoto;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num3 = this.checkins;
            int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.updated;
            int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.type;
            int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
            String str2 = this.address;
            int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num6 = this.distance;
            return hashCode8 + (num6 != null ? num6.hashCode() : 0);
        }

        public final Integer i() {
            return this.distance;
        }

        public final UserId j() {
            return this.groupId;
        }

        public final String k() {
            return this.groupPhoto;
        }

        public final float l() {
            return this.latitude;
        }

        public final float n() {
            return this.longitude;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlacesPlaceOldDto(discriminator=");
            sb.append(this.discriminator);
            sb.append(", id=");
            sb.append(this.id);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", latitude=");
            sb.append(this.latitude);
            sb.append(", longitude=");
            sb.append(this.longitude);
            sb.append(", created=");
            sb.append(this.created);
            sb.append(", icon=");
            sb.append(this.icon);
            sb.append(", country=");
            sb.append(this.country);
            sb.append(", city=");
            sb.append(this.city);
            sb.append(", groupId=");
            sb.append(this.groupId);
            sb.append(", groupPhoto=");
            sb.append(this.groupPhoto);
            sb.append(", checkins=");
            sb.append(this.checkins);
            sb.append(", updated=");
            sb.append(this.updated);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", address=");
            sb.append(this.address);
            sb.append(", distance=");
            return uqi.b(sb, this.distance, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.discriminator.writeToParcel(parcel, i);
            parcel.writeInt(this.id);
            parcel.writeString(this.title);
            parcel.writeFloat(this.latitude);
            parcel.writeFloat(this.longitude);
            parcel.writeInt(this.created);
            parcel.writeString(this.icon);
            Integer num = this.country;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            Integer num2 = this.city;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
            parcel.writeParcelable(this.groupId, i);
            parcel.writeString(this.groupPhoto);
            Integer num3 = this.checkins;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num3);
            }
            Integer num4 = this.updated;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num4);
            }
            Integer num5 = this.type;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num5);
            }
            parcel.writeString(this.address);
            Integer num6 = this.distance;
            if (num6 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num6);
            }
        }

        public PlacesPlaceOldDto(DiscriminatorDto discriminatorDto, int i, String str, float f, float f2, int i2, String str2, Integer num, Integer num2, UserId userId, String str3, Integer num3, Integer num4, Integer num5, String str4, Integer num6) {
            super(null);
            this.discriminator = discriminatorDto;
            this.id = i;
            this.title = str;
            this.latitude = f;
            this.longitude = f2;
            this.created = i2;
            this.icon = str2;
            this.country = num;
            this.city = num2;
            this.groupId = userId;
            this.groupPhoto = str3;
            this.checkins = num3;
            this.updated = num4;
            this.type = num5;
            this.address = str4;
            this.distance = num6;
        }
    }

    /* compiled from: WallPlaceOneOfDto.kt */
    /* loaded from: classes15.dex */
    public static final class PlacesPlaceOldWithTextInCityAndCountryDto extends WallPlaceOneOfDto implements Parcelable {
        public static final Parcelable.Creator<PlacesPlaceOldWithTextInCityAndCountryDto> CREATOR = new a();

        @pmi0(RTCStatsConstants.KEY_ADDRESS)
        private final String address;

        @pmi0("checkins")
        private final Integer checkins;

        @pmi0("city")
        private final String city;

        @pmi0("country")
        private final String country;

        @pmi0("created")
        private final int created;

        @pmi0("discriminator")
        private final DiscriminatorDto discriminator;

        @pmi0("distance")
        private final Integer distance;

        @pmi0("group_id")
        private final UserId groupId;

        @pmi0("group_photo")
        private final String groupPhoto;

        @pmi0("icon")
        private final String icon;

        @pmi0("id")
        private final int id;

        @pmi0("latitude")
        private final float latitude;

        @pmi0("longitude")
        private final float longitude;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final Integer type;

        @pmi0("updated")
        private final Integer updated;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: WallPlaceOneOfDto.kt */
        public static final class DiscriminatorDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ DiscriminatorDto[] $VALUES;
            public static final Parcelable.Creator<DiscriminatorDto> CREATOR;

            @pmi0("place_old_with_text_in_city_and_country")
            public static final DiscriminatorDto PLACE_OLD_WITH_TEXT_IN_CITY_AND_COUNTRY;
            private final String value;

            /* compiled from: WallPlaceOneOfDto.kt */
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
                DiscriminatorDto discriminatorDto = new DiscriminatorDto("PLACE_OLD_WITH_TEXT_IN_CITY_AND_COUNTRY", 0, "place_old_with_text_in_city_and_country");
                PLACE_OLD_WITH_TEXT_IN_CITY_AND_COUNTRY = discriminatorDto;
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

        /* compiled from: WallPlaceOneOfDto.kt */
        public static final class a implements Parcelable.Creator<PlacesPlaceOldWithTextInCityAndCountryDto> {
            @Override // android.os.Parcelable.Creator
            public final PlacesPlaceOldWithTextInCityAndCountryDto createFromParcel(Parcel parcel) {
                return new PlacesPlaceOldWithTextInCityAndCountryDto(DiscriminatorDto.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), (UserId) parcel.readParcelable(PlacesPlaceOldWithTextInCityAndCountryDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final PlacesPlaceOldWithTextInCityAndCountryDto[] newArray(int i) {
                return new PlacesPlaceOldWithTextInCityAndCountryDto[i];
            }
        }

        public /* synthetic */ PlacesPlaceOldWithTextInCityAndCountryDto(DiscriminatorDto discriminatorDto, int i, String str, float f, float f2, int i2, String str2, String str3, String str4, UserId userId, String str5, Integer num, Integer num2, Integer num3, String str6, Integer num4, int i3, zcl zclVar) {
            this(discriminatorDto, i, str, f, f2, i2, str2, (i3 & 128) != 0 ? null : str3, (i3 & 256) != 0 ? null : str4, (i3 & 512) != 0 ? null : userId, (i3 & 1024) != 0 ? null : str5, (i3 & 2048) != 0 ? null : num, (i3 & 4096) != 0 ? null : num2, (i3 & 8192) != 0 ? null : num3, (i3 & 16384) != 0 ? null : str6, (i3 & 32768) != 0 ? null : num4);
        }

        public final String d() {
            return this.address;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final Integer e() {
            return this.checkins;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlacesPlaceOldWithTextInCityAndCountryDto)) {
                return false;
            }
            PlacesPlaceOldWithTextInCityAndCountryDto placesPlaceOldWithTextInCityAndCountryDto = (PlacesPlaceOldWithTextInCityAndCountryDto) obj;
            return this.discriminator == placesPlaceOldWithTextInCityAndCountryDto.discriminator && this.id == placesPlaceOldWithTextInCityAndCountryDto.id && epx.f(this.title, placesPlaceOldWithTextInCityAndCountryDto.title) && Float.compare(this.latitude, placesPlaceOldWithTextInCityAndCountryDto.latitude) == 0 && Float.compare(this.longitude, placesPlaceOldWithTextInCityAndCountryDto.longitude) == 0 && this.created == placesPlaceOldWithTextInCityAndCountryDto.created && epx.f(this.icon, placesPlaceOldWithTextInCityAndCountryDto.icon) && epx.f(this.country, placesPlaceOldWithTextInCityAndCountryDto.country) && epx.f(this.city, placesPlaceOldWithTextInCityAndCountryDto.city) && epx.f(this.groupId, placesPlaceOldWithTextInCityAndCountryDto.groupId) && epx.f(this.groupPhoto, placesPlaceOldWithTextInCityAndCountryDto.groupPhoto) && epx.f(this.checkins, placesPlaceOldWithTextInCityAndCountryDto.checkins) && epx.f(this.updated, placesPlaceOldWithTextInCityAndCountryDto.updated) && epx.f(this.type, placesPlaceOldWithTextInCityAndCountryDto.type) && epx.f(this.address, placesPlaceOldWithTextInCityAndCountryDto.address) && epx.f(this.distance, placesPlaceOldWithTextInCityAndCountryDto.distance);
        }

        public final String f() {
            return this.city;
        }

        public final String g() {
            return this.country;
        }

        public final int getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int a2 = urd0.a(shy.a(this.created, b.a(this.longitude, b.a(this.latitude, urd0.a(shy.a(this.id, this.discriminator.hashCode() * 31, 31), 31, this.title), 31), 31), 31), 31, this.icon);
            String str = this.country;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.city;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            UserId userId = this.groupId;
            int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            String str3 = this.groupPhoto;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.checkins;
            int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.updated;
            int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.type;
            int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str4 = this.address;
            int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num4 = this.distance;
            return hashCode8 + (num4 != null ? num4.hashCode() : 0);
        }

        public final Integer i() {
            return this.distance;
        }

        public final UserId j() {
            return this.groupId;
        }

        public final String k() {
            return this.groupPhoto;
        }

        public final float l() {
            return this.latitude;
        }

        public final float n() {
            return this.longitude;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlacesPlaceOldWithTextInCityAndCountryDto(discriminator=");
            sb.append(this.discriminator);
            sb.append(", id=");
            sb.append(this.id);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", latitude=");
            sb.append(this.latitude);
            sb.append(", longitude=");
            sb.append(this.longitude);
            sb.append(", created=");
            sb.append(this.created);
            sb.append(", icon=");
            sb.append(this.icon);
            sb.append(", country=");
            sb.append(this.country);
            sb.append(", city=");
            sb.append(this.city);
            sb.append(", groupId=");
            sb.append(this.groupId);
            sb.append(", groupPhoto=");
            sb.append(this.groupPhoto);
            sb.append(", checkins=");
            sb.append(this.checkins);
            sb.append(", updated=");
            sb.append(this.updated);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", address=");
            sb.append(this.address);
            sb.append(", distance=");
            return uqi.b(sb, this.distance, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.discriminator.writeToParcel(parcel, i);
            parcel.writeInt(this.id);
            parcel.writeString(this.title);
            parcel.writeFloat(this.latitude);
            parcel.writeFloat(this.longitude);
            parcel.writeInt(this.created);
            parcel.writeString(this.icon);
            parcel.writeString(this.country);
            parcel.writeString(this.city);
            parcel.writeParcelable(this.groupId, i);
            parcel.writeString(this.groupPhoto);
            Integer num = this.checkins;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            Integer num2 = this.updated;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
            Integer num3 = this.type;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num3);
            }
            parcel.writeString(this.address);
            Integer num4 = this.distance;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num4);
            }
        }

        public PlacesPlaceOldWithTextInCityAndCountryDto(DiscriminatorDto discriminatorDto, int i, String str, float f, float f2, int i2, String str2, String str3, String str4, UserId userId, String str5, Integer num, Integer num2, Integer num3, String str6, Integer num4) {
            super(null);
            this.discriminator = discriminatorDto;
            this.id = i;
            this.title = str;
            this.latitude = f;
            this.longitude = f2;
            this.created = i2;
            this.icon = str2;
            this.country = str3;
            this.city = str4;
            this.groupId = userId;
            this.groupPhoto = str5;
            this.checkins = num;
            this.updated = num2;
            this.type = num3;
            this.address = str6;
            this.distance = num4;
        }
    }

    /* compiled from: WallPlaceOneOfDto.kt */
    /* loaded from: classes15.dex */
    public static final class PlacesPlaceWithTextInCityAndCountryDto extends WallPlaceOneOfDto implements Parcelable {
        public static final Parcelable.Creator<PlacesPlaceWithTextInCityAndCountryDto> CREATOR = new a();

        @pmi0(RTCStatsConstants.KEY_ADDRESS)
        private final String address;

        @pmi0("bindings")
        private final List<Integer> bindings;

        @pmi0("category")
        private final Integer category;

        @pmi0("category_object")
        private final PlacesCategoryDto categoryObject;

        @pmi0("city")
        private final String city;

        @pmi0("country")
        private final String country;

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
        /* compiled from: WallPlaceOneOfDto.kt */
        public static final class DiscriminatorDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ DiscriminatorDto[] $VALUES;
            public static final Parcelable.Creator<DiscriminatorDto> CREATOR;

            @pmi0("place_with_text_in_city_and_country")
            public static final DiscriminatorDto PLACE_WITH_TEXT_IN_CITY_AND_COUNTRY;
            private final String value;

            /* compiled from: WallPlaceOneOfDto.kt */
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
                DiscriminatorDto discriminatorDto = new DiscriminatorDto("PLACE_WITH_TEXT_IN_CITY_AND_COUNTRY", 0, "place_with_text_in_city_and_country");
                PLACE_WITH_TEXT_IN_CITY_AND_COUNTRY = discriminatorDto;
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

        /* compiled from: WallPlaceOneOfDto.kt */
        public static final class a implements Parcelable.Creator<PlacesPlaceWithTextInCityAndCountryDto> {
            @Override // android.os.Parcelable.Creator
            public final PlacesPlaceWithTextInCityAndCountryDto createFromParcel(Parcel parcel) {
                boolean z;
                ArrayList arrayList;
                PlacesCategoryDto placesCategoryDto;
                DiscriminatorDto discriminatorDto;
                DiscriminatorDto createFromParcel = DiscriminatorDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                boolean z2 = parcel.readInt() != 0;
                float readFloat = parcel.readFloat();
                float readFloat2 = parcel.readFloat();
                String readString = parcel.readString();
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                PlacesCategoryDto placesCategoryDto2 = (PlacesCategoryDto) parcel.readParcelable(PlacesPlaceWithTextInCityAndCountryDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(PlacesPlaceWithTextInCityAndCountryDto.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    int readInt5 = parcel.readInt();
                    z = z2;
                    arrayList = new ArrayList(readInt5);
                    placesCategoryDto = placesCategoryDto2;
                    int i = 0;
                    while (true) {
                        discriminatorDto = createFromParcel;
                        if (i == readInt5) {
                            break;
                        }
                        i = pm0.b(parcel, arrayList, i, 1);
                        createFromParcel = discriminatorDto;
                    }
                } else {
                    z = z2;
                    arrayList = null;
                    placesCategoryDto = placesCategoryDto2;
                    discriminatorDto = createFromParcel;
                }
                return new PlacesPlaceWithTextInCityAndCountryDto(discriminatorDto, readInt, readInt2, z, readFloat, readFloat2, readString, readInt3, readInt4, readString2, readString3, readString4, valueOf, placesCategoryDto, userId, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final PlacesPlaceWithTextInCityAndCountryDto[] newArray(int i) {
                return new PlacesPlaceWithTextInCityAndCountryDto[i];
            }
        }

        public /* synthetic */ PlacesPlaceWithTextInCityAndCountryDto(DiscriminatorDto discriminatorDto, int i, int i2, boolean z, float f, float f2, String str, int i3, int i4, String str2, String str3, String str4, Integer num, PlacesCategoryDto placesCategoryDto, UserId userId, List list, int i5, zcl zclVar) {
            this(discriminatorDto, i, i2, z, f, f2, str, i3, i4, (i5 & 512) != 0 ? null : str2, (i5 & 1024) != 0 ? null : str3, (i5 & 2048) != 0 ? null : str4, (i5 & 4096) != 0 ? null : num, (i5 & 8192) != 0 ? null : placesCategoryDto, (i5 & 16384) != 0 ? null : userId, (i5 & 32768) != 0 ? null : list);
        }

        public final String d() {
            return this.address;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.city;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlacesPlaceWithTextInCityAndCountryDto)) {
                return false;
            }
            PlacesPlaceWithTextInCityAndCountryDto placesPlaceWithTextInCityAndCountryDto = (PlacesPlaceWithTextInCityAndCountryDto) obj;
            return this.discriminator == placesPlaceWithTextInCityAndCountryDto.discriminator && this.created == placesPlaceWithTextInCityAndCountryDto.created && this.id == placesPlaceWithTextInCityAndCountryDto.id && this.isDeleted == placesPlaceWithTextInCityAndCountryDto.isDeleted && Float.compare(this.latitude, placesPlaceWithTextInCityAndCountryDto.latitude) == 0 && Float.compare(this.longitude, placesPlaceWithTextInCityAndCountryDto.longitude) == 0 && epx.f(this.title, placesPlaceWithTextInCityAndCountryDto.title) && this.totalCheckins == placesPlaceWithTextInCityAndCountryDto.totalCheckins && this.updated == placesPlaceWithTextInCityAndCountryDto.updated && epx.f(this.city, placesPlaceWithTextInCityAndCountryDto.city) && epx.f(this.country, placesPlaceWithTextInCityAndCountryDto.country) && epx.f(this.address, placesPlaceWithTextInCityAndCountryDto.address) && epx.f(this.category, placesPlaceWithTextInCityAndCountryDto.category) && epx.f(this.categoryObject, placesPlaceWithTextInCityAndCountryDto.categoryObject) && epx.f(this.ownerId, placesPlaceWithTextInCityAndCountryDto.ownerId) && epx.f(this.bindings, placesPlaceWithTextInCityAndCountryDto.bindings);
        }

        public final String f() {
            return this.country;
        }

        public final float g() {
            return this.latitude;
        }

        public final int getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int a2 = shy.a(this.updated, shy.a(this.totalCheckins, urd0.a(b.a(this.longitude, b.a(this.latitude, qoy.b(shy.a(this.id, shy.a(this.created, this.discriminator.hashCode() * 31, 31), 31), 31, this.isDeleted), 31), 31), 31, this.title), 31), 31);
            String str = this.city;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.country;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.address;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.category;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            PlacesCategoryDto placesCategoryDto = this.categoryObject;
            int hashCode5 = (hashCode4 + (placesCategoryDto == null ? 0 : placesCategoryDto.hashCode())) * 31;
            UserId userId = this.ownerId;
            int hashCode6 = (hashCode5 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            List<Integer> list = this.bindings;
            return hashCode6 + (list != null ? list.hashCode() : 0);
        }

        public final float i() {
            return this.longitude;
        }

        public final int j() {
            return this.totalCheckins;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlacesPlaceWithTextInCityAndCountryDto(discriminator=");
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
            parcel.writeString(this.city);
            parcel.writeString(this.country);
            parcel.writeString(this.address);
            Integer num = this.category;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeParcelable(this.categoryObject, i);
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

        public PlacesPlaceWithTextInCityAndCountryDto(DiscriminatorDto discriminatorDto, int i, int i2, boolean z, float f, float f2, String str, int i3, int i4, String str2, String str3, String str4, Integer num, PlacesCategoryDto placesCategoryDto, UserId userId, List<Integer> list) {
            super(null);
            this.discriminator = discriminatorDto;
            this.created = i;
            this.id = i2;
            this.isDeleted = z;
            this.latitude = f;
            this.longitude = f2;
            this.title = str;
            this.totalCheckins = i3;
            this.updated = i4;
            this.city = str2;
            this.country = str3;
            this.address = str4;
            this.category = num;
            this.categoryObject = placesCategoryDto;
            this.ownerId = userId;
            this.bindings = list;
        }
    }

    public /* synthetic */ WallPlaceOneOfDto(zcl zclVar) {
        this();
    }

    private WallPlaceOneOfDto() {
    }
}
