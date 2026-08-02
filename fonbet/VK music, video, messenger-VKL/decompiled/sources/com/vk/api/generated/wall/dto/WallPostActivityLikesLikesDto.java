package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: WallPostActivityLikesLikesDto.kt */
/* loaded from: classes15.dex */
public final class WallPostActivityLikesLikesDto implements Parcelable {
    public static final Parcelable.Creator<WallPostActivityLikesLikesDto> CREATOR = new a();

    @pmi0("count")
    private final Integer count;

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("user_ids")
    private final List<UserId> userIds;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WallPostActivityLikesLikesDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0(BuildConfig.FLAVOR)
        public static final TypeDto DEFAULT;

        @pmi0("on_content")
        public static final TypeDto ON_CONTENT;
        private final String value;

        /* compiled from: WallPostActivityLikesLikesDto.kt */
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
            TypeDto typeDto = new TypeDto("DEFAULT", 0, BuildConfig.FLAVOR);
            DEFAULT = typeDto;
            TypeDto typeDto2 = new TypeDto("ON_CONTENT", 1, "on_content");
            ON_CONTENT = typeDto2;
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: WallPostActivityLikesLikesDto.kt */
    public static final class a implements Parcelable.Creator<WallPostActivityLikesLikesDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostActivityLikesLikesDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(WallPostActivityLikesLikesDto.class, parcel, arrayList, i, 1);
                }
            }
            return new WallPostActivityLikesLikesDto(valueOf, readString, arrayList, parcel.readInt() != 0 ? TypeDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostActivityLikesLikesDto[] newArray(int i) {
            return new WallPostActivityLikesLikesDto[i];
        }
    }

    public WallPostActivityLikesLikesDto() {
        this(null, null, null, null, 15, null);
    }

    public final String d() {
        return this.text;
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
        if (!(obj instanceof WallPostActivityLikesLikesDto)) {
            return false;
        }
        WallPostActivityLikesLikesDto wallPostActivityLikesLikesDto = (WallPostActivityLikesLikesDto) obj;
        return epx.f(this.count, wallPostActivityLikesLikesDto.count) && epx.f(this.text, wallPostActivityLikesLikesDto.text) && epx.f(this.userIds, wallPostActivityLikesLikesDto.userIds) && this.type == wallPostActivityLikesLikesDto.type;
    }

    public final List<UserId> f() {
        return this.userIds;
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<UserId> list = this.userIds;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        TypeDto typeDto = this.type;
        return hashCode3 + (typeDto != null ? typeDto.hashCode() : 0);
    }

    public final String toString() {
        return "WallPostActivityLikesLikesDto(count=" + this.count + ", text=" + this.text + ", userIds=" + this.userIds + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.text);
        List<UserId> list = this.userIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
    }

    public WallPostActivityLikesLikesDto(Integer num, String str, List<UserId> list, TypeDto typeDto) {
        this.count = num;
        this.text = str;
        this.userIds = list;
        this.type = typeDto;
    }

    public /* synthetic */ WallPostActivityLikesLikesDto(Integer num, String str, List list, TypeDto typeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : typeDto);
    }
}
