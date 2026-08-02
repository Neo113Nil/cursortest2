package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;

/* compiled from: AppsGetAboutScreenGroupDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetAboutScreenGroupDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetAboutScreenGroupDto> CREATOR = new a();

    @pmi0("id")
    private final UserId id;

    @pmi0("members_count")
    private final int membersCount;

    @pmi0("members_count_text")
    private final String membersCountText;

    @pmi0("name")
    private final String name;

    @pmi0("photo")
    private final List<AppsGetAboutScreenGroupPhotoDto> photo;

    @pmi0("type")
    private final String type;

    @pmi0("verified")
    private final boolean verified;

    /* compiled from: AppsGetAboutScreenGroupDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetAboutScreenGroupDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetAboutScreenGroupDto createFromParcel(Parcel parcel) {
            int i;
            UserId userId = (UserId) parcel.readParcelable(AppsGetAboutScreenGroupDto.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int i2 = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (i2 != readInt) {
                i2 = en.a(AppsGetAboutScreenGroupPhotoDto.CREATOR, parcel, arrayList, i2, i);
            }
            return new AppsGetAboutScreenGroupDto(userId, readString, readString2, z, arrayList, parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetAboutScreenGroupDto[] newArray(int i) {
            return new AppsGetAboutScreenGroupDto[i];
        }
    }

    public AppsGetAboutScreenGroupDto(UserId userId, String str, String str2, boolean z, List<AppsGetAboutScreenGroupPhotoDto> list, int i, String str3) {
        this.id = userId;
        this.name = str;
        this.type = str2;
        this.verified = z;
        this.photo = list;
        this.membersCount = i;
        this.membersCountText = str3;
    }

    public final UserId d() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.membersCountText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetAboutScreenGroupDto)) {
            return false;
        }
        AppsGetAboutScreenGroupDto appsGetAboutScreenGroupDto = (AppsGetAboutScreenGroupDto) obj;
        return epx.f(this.id, appsGetAboutScreenGroupDto.id) && epx.f(this.name, appsGetAboutScreenGroupDto.name) && epx.f(this.type, appsGetAboutScreenGroupDto.type) && this.verified == appsGetAboutScreenGroupDto.verified && epx.f(this.photo, appsGetAboutScreenGroupDto.photo) && this.membersCount == appsGetAboutScreenGroupDto.membersCount && epx.f(this.membersCountText, appsGetAboutScreenGroupDto.membersCountText);
    }

    public final String f() {
        return this.name;
    }

    public final List<AppsGetAboutScreenGroupPhotoDto> g() {
        return this.photo;
    }

    public final int hashCode() {
        return this.membersCountText.hashCode() + shy.a(this.membersCount, fw3.a(qoy.b(urd0.a(urd0.a(Long.hashCode(this.id.b) * 31, 31, this.name), 31, this.type), 31, this.verified), 31, this.photo), 31);
    }

    public final boolean i() {
        return this.verified;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGetAboutScreenGroupDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", verified=");
        sb.append(this.verified);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", membersCount=");
        sb.append(this.membersCount);
        sb.append(", membersCountText=");
        return ho8.a(sb, this.membersCountText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.name);
        parcel.writeString(this.type);
        parcel.writeInt(this.verified ? 1 : 0);
        Iterator a2 = ao.a(parcel, this.photo);
        while (a2.hasNext()) {
            ((AppsGetAboutScreenGroupPhotoDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.membersCount);
        parcel.writeString(this.membersCountText);
    }
}
