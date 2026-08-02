package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallGraffitiDto.kt */
/* loaded from: classes15.dex */
public final class WallGraffitiDto implements Parcelable {
    public static final Parcelable.Creator<WallGraffitiDto> CREATOR = new a();

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("height")
    private final Integer height;

    @pmi0("id")
    private final Integer id;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_586")
    private final String photo586;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final Integer width;

    /* compiled from: WallGraffitiDto.kt */
    public static final class a implements Parcelable.Creator<WallGraffitiDto> {
        @Override // android.os.Parcelable.Creator
        public final WallGraffitiDto createFromParcel(Parcel parcel) {
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            UserId userId = (UserId) parcel.readParcelable(WallGraffitiDto.class.getClassLoader());
            String readString = parcel.readString();
            Integer num = null;
            String readString2 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new WallGraffitiDto(valueOf, userId, readString, readString2, valueOf2, readString3, num, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallGraffitiDto[] newArray(int i) {
            return new WallGraffitiDto[i];
        }
    }

    public WallGraffitiDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final String d() {
        return this.accessKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.height;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGraffitiDto)) {
            return false;
        }
        WallGraffitiDto wallGraffitiDto = (WallGraffitiDto) obj;
        return epx.f(this.id, wallGraffitiDto.id) && epx.f(this.ownerId, wallGraffitiDto.ownerId) && epx.f(this.photo200, wallGraffitiDto.photo200) && epx.f(this.photo586, wallGraffitiDto.photo586) && epx.f(this.height, wallGraffitiDto.height) && epx.f(this.url, wallGraffitiDto.url) && epx.f(this.width, wallGraffitiDto.width) && epx.f(this.accessKey, wallGraffitiDto.accessKey);
    }

    public final Integer f() {
        return this.id;
    }

    public final Integer g() {
        return this.width;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        UserId userId = this.ownerId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str = this.photo200;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo586;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.height;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.url;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.width;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.accessKey;
        return hashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallGraffitiDto(id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", photo200=");
        sb.append(this.photo200);
        sb.append(", photo586=");
        sb.append(this.photo586);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", accessKey=");
        return ho8.a(sb, this.accessKey, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.photo200);
        parcel.writeString(this.photo586);
        Integer num2 = this.height;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.url);
        Integer num3 = this.width;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.accessKey);
    }

    public WallGraffitiDto(Integer num, UserId userId, String str, String str2, Integer num2, String str3, Integer num3, String str4) {
        this.id = num;
        this.ownerId = userId;
        this.photo200 = str;
        this.photo586 = str2;
        this.height = num2;
        this.url = str3;
        this.width = num3;
        this.accessKey = str4;
    }

    public /* synthetic */ WallGraffitiDto(Integer num, UserId userId, String str, String str2, Integer num2, String str3, Integer num3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : str4);
    }
}
