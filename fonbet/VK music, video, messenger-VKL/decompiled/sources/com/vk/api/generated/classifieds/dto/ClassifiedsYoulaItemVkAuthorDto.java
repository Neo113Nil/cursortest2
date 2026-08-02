package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ClassifiedsYoulaItemVkAuthorDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsYoulaItemVkAuthorDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsYoulaItemVkAuthorDto> CREATOR = new a();

    @pmi0("active_items_count")
    private final Integer activeItemsCount;

    @pmi0("id")
    private final UserId id;

    @pmi0("name")
    private final String name;

    @pmi0("photo_url")
    private final String photoUrl;

    @pmi0("profile_link")
    private final String profileLink;

    @pmi0("seller_profile_url")
    private final String sellerProfileUrl;

    /* compiled from: ClassifiedsYoulaItemVkAuthorDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsYoulaItemVkAuthorDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsYoulaItemVkAuthorDto createFromParcel(Parcel parcel) {
            return new ClassifiedsYoulaItemVkAuthorDto((UserId) parcel.readParcelable(ClassifiedsYoulaItemVkAuthorDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsYoulaItemVkAuthorDto[] newArray(int i) {
            return new ClassifiedsYoulaItemVkAuthorDto[i];
        }
    }

    public ClassifiedsYoulaItemVkAuthorDto(UserId userId, String str, String str2, String str3, String str4, Integer num) {
        this.id = userId;
        this.name = str;
        this.profileLink = str2;
        this.sellerProfileUrl = str3;
        this.photoUrl = str4;
        this.activeItemsCount = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaItemVkAuthorDto)) {
            return false;
        }
        ClassifiedsYoulaItemVkAuthorDto classifiedsYoulaItemVkAuthorDto = (ClassifiedsYoulaItemVkAuthorDto) obj;
        return epx.f(this.id, classifiedsYoulaItemVkAuthorDto.id) && epx.f(this.name, classifiedsYoulaItemVkAuthorDto.name) && epx.f(this.profileLink, classifiedsYoulaItemVkAuthorDto.profileLink) && epx.f(this.sellerProfileUrl, classifiedsYoulaItemVkAuthorDto.sellerProfileUrl) && epx.f(this.photoUrl, classifiedsYoulaItemVkAuthorDto.photoUrl) && epx.f(this.activeItemsCount, classifiedsYoulaItemVkAuthorDto.activeItemsCount);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(Long.hashCode(this.id.b) * 31, 31, this.name), 31, this.profileLink);
        String str = this.sellerProfileUrl;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photoUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.activeItemsCount;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsYoulaItemVkAuthorDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", profileLink=");
        sb.append(this.profileLink);
        sb.append(", sellerProfileUrl=");
        sb.append(this.sellerProfileUrl);
        sb.append(", photoUrl=");
        sb.append(this.photoUrl);
        sb.append(", activeItemsCount=");
        return uqi.b(sb, this.activeItemsCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.name);
        parcel.writeString(this.profileLink);
        parcel.writeString(this.sellerProfileUrl);
        parcel.writeString(this.photoUrl);
        Integer num = this.activeItemsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ ClassifiedsYoulaItemVkAuthorDto(UserId userId, String str, String str2, String str3, String str4, Integer num, int i, zcl zclVar) {
        this(userId, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num);
    }
}
