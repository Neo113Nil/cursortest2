package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ShortVideoExternalOwnerDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoExternalOwnerDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoExternalOwnerDto> CREATOR = new a();

    @pmi0("avatars")
    private final List<BaseImageDto> avatars;

    @pmi0("ext_owner_id")
    private final long extOwnerId;

    @pmi0("is_subscribed")
    private final Boolean isSubscribed;

    @pmi0("name")
    private final String name;

    @pmi0("owner_type")
    private final OwnerTypeDto ownerType;

    @pmi0("vk_owner_id")
    private final UserId vkOwnerId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShortVideoExternalOwnerDto.kt */
    public static final class OwnerTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OwnerTypeDto[] $VALUES;
        public static final Parcelable.Creator<OwnerTypeDto> CREATOR;

        @pmi0("group")
        public static final OwnerTypeDto GROUP;

        @pmi0("user")
        public static final OwnerTypeDto USER;
        private final String value;

        /* compiled from: ShortVideoExternalOwnerDto.kt */
        public static final class a implements Parcelable.Creator<OwnerTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final OwnerTypeDto createFromParcel(Parcel parcel) {
                return OwnerTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OwnerTypeDto[] newArray(int i) {
                return new OwnerTypeDto[i];
            }
        }

        static {
            OwnerTypeDto ownerTypeDto = new OwnerTypeDto("USER", 0, "user");
            USER = ownerTypeDto;
            OwnerTypeDto ownerTypeDto2 = new OwnerTypeDto("GROUP", 1, "group");
            GROUP = ownerTypeDto2;
            OwnerTypeDto[] ownerTypeDtoArr = {ownerTypeDto, ownerTypeDto2};
            $VALUES = ownerTypeDtoArr;
            $ENTRIES = new asp(ownerTypeDtoArr);
            CREATOR = new a();
        }

        private OwnerTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static OwnerTypeDto valueOf(String str) {
            return (OwnerTypeDto) Enum.valueOf(OwnerTypeDto.class, str);
        }

        public static OwnerTypeDto[] values() {
            return (OwnerTypeDto[]) $VALUES.clone();
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

    /* compiled from: ShortVideoExternalOwnerDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoExternalOwnerDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoExternalOwnerDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            OwnerTypeDto createFromParcel = OwnerTypeDto.CREATOR.createFromParcel(parcel);
            UserId userId = (UserId) parcel.readParcelable(ShortVideoExternalOwnerDto.class.getClassLoader());
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            int i = 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (i != readInt) {
                    i = bo.b(ShortVideoExternalOwnerDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new ShortVideoExternalOwnerDto(createFromParcel, userId, readLong, readString, valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoExternalOwnerDto[] newArray(int i) {
            return new ShortVideoExternalOwnerDto[i];
        }
    }

    public ShortVideoExternalOwnerDto(OwnerTypeDto ownerTypeDto, UserId userId, long j, String str, Boolean bool, List<BaseImageDto> list) {
        this.ownerType = ownerTypeDto;
        this.vkOwnerId = userId;
        this.extOwnerId = j;
        this.name = str;
        this.isSubscribed = bool;
        this.avatars = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoExternalOwnerDto)) {
            return false;
        }
        ShortVideoExternalOwnerDto shortVideoExternalOwnerDto = (ShortVideoExternalOwnerDto) obj;
        return this.ownerType == shortVideoExternalOwnerDto.ownerType && epx.f(this.vkOwnerId, shortVideoExternalOwnerDto.vkOwnerId) && this.extOwnerId == shortVideoExternalOwnerDto.extOwnerId && epx.f(this.name, shortVideoExternalOwnerDto.name) && epx.f(this.isSubscribed, shortVideoExternalOwnerDto.isSubscribed) && epx.f(this.avatars, shortVideoExternalOwnerDto.avatars);
    }

    public final int hashCode() {
        int a2 = bh10.a(bh10.a(this.ownerType.hashCode() * 31, 31, this.vkOwnerId.b), 31, this.extOwnerId);
        String str = this.name;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isSubscribed;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<BaseImageDto> list = this.avatars;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoExternalOwnerDto(ownerType=");
        sb.append(this.ownerType);
        sb.append(", vkOwnerId=");
        sb.append(this.vkOwnerId);
        sb.append(", extOwnerId=");
        sb.append(this.extOwnerId);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", isSubscribed=");
        sb.append(this.isSubscribed);
        sb.append(", avatars=");
        return ms9.a(')', sb, this.avatars);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.ownerType.writeToParcel(parcel, i);
        parcel.writeParcelable(this.vkOwnerId, i);
        parcel.writeLong(this.extOwnerId);
        parcel.writeString(this.name);
        Boolean bool = this.isSubscribed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<BaseImageDto> list = this.avatars;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ ShortVideoExternalOwnerDto(OwnerTypeDto ownerTypeDto, UserId userId, long j, String str, Boolean bool, List list, int i, zcl zclVar) {
        this(ownerTypeDto, userId, j, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : list);
    }
}
