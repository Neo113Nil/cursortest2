package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
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
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AppsActivityItemDto.kt */
/* loaded from: classes14.dex */
public final class AppsActivityItemDto implements Parcelable {
    public static final Parcelable.Creator<AppsActivityItemDto> CREATOR = new a();

    @pmi0("app_id")
    private final int appId;

    @pmi0("date")
    private final int date;

    @pmi0("icons")
    private final List<BaseImageDto> icons;

    @pmi0("level")
    private final Integer level;

    @pmi0(X3.i.I0)
    private final AppsActivityMediaDto media;

    @pmi0("text")
    private final String text;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("user_id")
    private final UserId userId;

    @pmi0("value")
    private final Integer value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppsActivityItemDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("achievement")
        public static final TypeDto ACHIEVEMENT;

        @pmi0("apps_news")
        public static final TypeDto APPS_NEWS;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("game_send_gift")
        public static final TypeDto GAME_SEND_GIFT;

        @pmi0("install")
        public static final TypeDto INSTALL;

        @pmi0("invite")
        public static final TypeDto INVITE;

        @pmi0("level")
        public static final TypeDto LEVEL;

        @pmi0("notification")
        public static final TypeDto NOTIFICATION;

        @pmi0("request")
        public static final TypeDto REQUEST;

        @pmi0("run")
        public static final TypeDto RUN;

        @pmi0("score")
        public static final TypeDto SCORE;

        @pmi0("stickers_achievement")
        public static final TypeDto STICKERS_ACHIEVEMENT;
        private final String value;

        /* compiled from: AppsActivityItemDto.kt */
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
            TypeDto typeDto = new TypeDto("REQUEST", 0, "request");
            REQUEST = typeDto;
            TypeDto typeDto2 = new TypeDto("APPS_NEWS", 1, "apps_news");
            APPS_NEWS = typeDto2;
            TypeDto typeDto3 = new TypeDto("NOTIFICATION", 2, "notification");
            NOTIFICATION = typeDto3;
            TypeDto typeDto4 = new TypeDto("INVITE", 3, "invite");
            INVITE = typeDto4;
            TypeDto typeDto5 = new TypeDto("RUN", 4, "run");
            RUN = typeDto5;
            TypeDto typeDto6 = new TypeDto("INSTALL", 5, "install");
            INSTALL = typeDto6;
            TypeDto typeDto7 = new TypeDto("SCORE", 6, "score");
            SCORE = typeDto7;
            TypeDto typeDto8 = new TypeDto("LEVEL", 7, "level");
            LEVEL = typeDto8;
            TypeDto typeDto9 = new TypeDto("ACHIEVEMENT", 8, "achievement");
            ACHIEVEMENT = typeDto9;
            TypeDto typeDto10 = new TypeDto("STICKERS_ACHIEVEMENT", 9, "stickers_achievement");
            STICKERS_ACHIEVEMENT = typeDto10;
            TypeDto typeDto11 = new TypeDto("GAME_SEND_GIFT", 10, "game_send_gift");
            GAME_SEND_GIFT = typeDto11;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8, typeDto9, typeDto10, typeDto11};
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

    /* compiled from: AppsActivityItemDto.kt */
    public static final class a implements Parcelable.Creator<AppsActivityItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsActivityItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(AppsActivityItemDto.class.getClassLoader());
            int readInt2 = parcel.readInt();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt3);
                int i = 0;
                while (i != readInt3) {
                    i = bo.b(AppsActivityItemDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AppsActivityItemDto(createFromParcel, readInt, userId, readInt2, valueOf, valueOf2, readString, arrayList, parcel.readInt() != 0 ? AppsActivityMediaDto.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsActivityItemDto[] newArray(int i) {
            return new AppsActivityItemDto[i];
        }
    }

    public AppsActivityItemDto(TypeDto typeDto, int i, UserId userId, int i2, Integer num, Integer num2, String str, List<BaseImageDto> list, AppsActivityMediaDto appsActivityMediaDto, String str2) {
        this.type = typeDto;
        this.appId = i;
        this.userId = userId;
        this.date = i2;
        this.value = num;
        this.level = num2;
        this.text = str;
        this.icons = list;
        this.media = appsActivityMediaDto;
        this.trackCode = str2;
    }

    public final int d() {
        return this.appId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.date;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsActivityItemDto)) {
            return false;
        }
        AppsActivityItemDto appsActivityItemDto = (AppsActivityItemDto) obj;
        return this.type == appsActivityItemDto.type && this.appId == appsActivityItemDto.appId && epx.f(this.userId, appsActivityItemDto.userId) && this.date == appsActivityItemDto.date && epx.f(this.value, appsActivityItemDto.value) && epx.f(this.level, appsActivityItemDto.level) && epx.f(this.text, appsActivityItemDto.text) && epx.f(this.icons, appsActivityItemDto.icons) && epx.f(this.media, appsActivityItemDto.media) && epx.f(this.trackCode, appsActivityItemDto.trackCode);
    }

    public final List<BaseImageDto> f() {
        return this.icons;
    }

    public final Integer g() {
        return this.level;
    }

    public final UserId getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        int a2 = shy.a(this.date, bh10.a(shy.a(this.appId, this.type.hashCode() * 31, 31), 31, this.userId.b), 31);
        Integer num = this.value;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.level;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.text;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<BaseImageDto> list = this.icons;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        AppsActivityMediaDto appsActivityMediaDto = this.media;
        int hashCode5 = (hashCode4 + (appsActivityMediaDto == null ? 0 : appsActivityMediaDto.hashCode())) * 31;
        String str2 = this.trackCode;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String i() {
        return this.text;
    }

    public final TypeDto j() {
        return this.type;
    }

    public final Integer k() {
        return this.value;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsActivityItemDto(type=");
        sb.append(this.type);
        sb.append(", appId=");
        sb.append(this.appId);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", level=");
        sb.append(this.level);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", icons=");
        sb.append(this.icons);
        sb.append(", media=");
        sb.append(this.media);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeInt(this.appId);
        parcel.writeParcelable(this.userId, i);
        parcel.writeInt(this.date);
        Integer num = this.value;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.level;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.text);
        List<BaseImageDto> list = this.icons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        AppsActivityMediaDto appsActivityMediaDto = this.media;
        if (appsActivityMediaDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsActivityMediaDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.trackCode);
    }

    public /* synthetic */ AppsActivityItemDto(TypeDto typeDto, int i, UserId userId, int i2, Integer num, Integer num2, String str, List list, AppsActivityMediaDto appsActivityMediaDto, String str2, int i3, zcl zclVar) {
        this(typeDto, i, userId, i2, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : num2, (i3 & 64) != 0 ? null : str, (i3 & 128) != 0 ? null : list, (i3 & 256) != 0 ? null : appsActivityMediaDto, (i3 & 512) != 0 ? null : str2);
    }
}
