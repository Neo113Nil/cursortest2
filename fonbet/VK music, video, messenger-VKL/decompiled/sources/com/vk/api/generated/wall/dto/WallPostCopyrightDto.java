package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: WallPostCopyrightDto.kt */
/* loaded from: classes15.dex */
public final class WallPostCopyrightDto implements Parcelable {
    public static final Parcelable.Creator<WallPostCopyrightDto> CREATOR = new a();

    @pmi0("id")
    private final UserId id;

    @pmi0("link")
    private final String link;

    @pmi0("name")
    private final String name;

    @pmi0("type")
    private final String type;

    /* compiled from: WallPostCopyrightDto.kt */
    public static final class a implements Parcelable.Creator<WallPostCopyrightDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostCopyrightDto createFromParcel(Parcel parcel) {
            return new WallPostCopyrightDto(parcel.readString(), parcel.readString(), parcel.readString(), (UserId) parcel.readParcelable(WallPostCopyrightDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostCopyrightDto[] newArray(int i) {
            return new WallPostCopyrightDto[i];
        }
    }

    public WallPostCopyrightDto(String str, String str2, String str3, UserId userId) {
        this.link = str;
        this.name = str2;
        this.type = str3;
        this.id = userId;
    }

    public final UserId d() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.link;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostCopyrightDto)) {
            return false;
        }
        WallPostCopyrightDto wallPostCopyrightDto = (WallPostCopyrightDto) obj;
        return epx.f(this.link, wallPostCopyrightDto.link) && epx.f(this.name, wallPostCopyrightDto.name) && epx.f(this.type, wallPostCopyrightDto.type) && epx.f(this.id, wallPostCopyrightDto.id);
    }

    public final String f() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.link.hashCode() * 31, 31, this.name), 31, this.type);
        UserId userId = this.id;
        return a2 + (userId == null ? 0 : Long.hashCode(userId.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallPostCopyrightDto(link=");
        sb.append(this.link);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", id=");
        return gp.b(sb, this.id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.link);
        parcel.writeString(this.name);
        parcel.writeString(this.type);
        parcel.writeParcelable(this.id, i);
    }

    public /* synthetic */ WallPostCopyrightDto(String str, String str2, String str3, UserId userId, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : userId);
    }
}
