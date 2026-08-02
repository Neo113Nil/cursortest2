package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: FriendsFollowersOnboardingItemDto.kt */
/* loaded from: classes14.dex */
public final class FriendsFollowersOnboardingItemDto implements Parcelable {
    public static final Parcelable.Creator<FriendsFollowersOnboardingItemDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("icons_dark")
    private final List<BaseImageDto> iconsDark;

    @pmi0("icons_light")
    private final List<BaseImageDto> iconsLight;

    @pmi0("id")
    private final int id;

    @pmi0("primary_button")
    private final FriendsFollowersOnboardingItemButtonDto primaryButton;

    @pmi0("secondary_button")
    private final FriendsFollowersOnboardingItemButtonDto secondaryButton;

    @pmi0("title")
    private final String title;

    /* compiled from: FriendsFollowersOnboardingItemDto.kt */
    public static final class a implements Parcelable.Creator<FriendsFollowersOnboardingItemDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsFollowersOnboardingItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(FriendsFollowersOnboardingItemDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(FriendsFollowersOnboardingItemDto.class, parcel, arrayList3, i, 1);
                }
                arrayList2 = arrayList3;
            }
            return new FriendsFollowersOnboardingItemDto(readInt, readString, readString2, arrayList, arrayList2, parcel.readInt() == 0 ? null : FriendsFollowersOnboardingItemButtonDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FriendsFollowersOnboardingItemButtonDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsFollowersOnboardingItemDto[] newArray(int i) {
            return new FriendsFollowersOnboardingItemDto[i];
        }
    }

    public FriendsFollowersOnboardingItemDto(int i, String str, String str2, List<BaseImageDto> list, List<BaseImageDto> list2, FriendsFollowersOnboardingItemButtonDto friendsFollowersOnboardingItemButtonDto, FriendsFollowersOnboardingItemButtonDto friendsFollowersOnboardingItemButtonDto2) {
        this.id = i;
        this.title = str;
        this.description = str2;
        this.iconsLight = list;
        this.iconsDark = list2;
        this.primaryButton = friendsFollowersOnboardingItemButtonDto;
        this.secondaryButton = friendsFollowersOnboardingItemButtonDto2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsFollowersOnboardingItemDto)) {
            return false;
        }
        FriendsFollowersOnboardingItemDto friendsFollowersOnboardingItemDto = (FriendsFollowersOnboardingItemDto) obj;
        return this.id == friendsFollowersOnboardingItemDto.id && epx.f(this.title, friendsFollowersOnboardingItemDto.title) && epx.f(this.description, friendsFollowersOnboardingItemDto.description) && epx.f(this.iconsLight, friendsFollowersOnboardingItemDto.iconsLight) && epx.f(this.iconsDark, friendsFollowersOnboardingItemDto.iconsDark) && epx.f(this.primaryButton, friendsFollowersOnboardingItemDto.primaryButton) && epx.f(this.secondaryButton, friendsFollowersOnboardingItemDto.secondaryButton);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.title), 31, this.description);
        List<BaseImageDto> list = this.iconsLight;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<BaseImageDto> list2 = this.iconsDark;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        FriendsFollowersOnboardingItemButtonDto friendsFollowersOnboardingItemButtonDto = this.primaryButton;
        int hashCode3 = (hashCode2 + (friendsFollowersOnboardingItemButtonDto == null ? 0 : friendsFollowersOnboardingItemButtonDto.hashCode())) * 31;
        FriendsFollowersOnboardingItemButtonDto friendsFollowersOnboardingItemButtonDto2 = this.secondaryButton;
        return hashCode3 + (friendsFollowersOnboardingItemButtonDto2 != null ? friendsFollowersOnboardingItemButtonDto2.hashCode() : 0);
    }

    public final String toString() {
        return "FriendsFollowersOnboardingItemDto(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", iconsLight=" + this.iconsLight + ", iconsDark=" + this.iconsDark + ", primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        List<BaseImageDto> list = this.iconsLight;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<BaseImageDto> list2 = this.iconsDark;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        FriendsFollowersOnboardingItemButtonDto friendsFollowersOnboardingItemButtonDto = this.primaryButton;
        if (friendsFollowersOnboardingItemButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            friendsFollowersOnboardingItemButtonDto.writeToParcel(parcel, i);
        }
        FriendsFollowersOnboardingItemButtonDto friendsFollowersOnboardingItemButtonDto2 = this.secondaryButton;
        if (friendsFollowersOnboardingItemButtonDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            friendsFollowersOnboardingItemButtonDto2.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ FriendsFollowersOnboardingItemDto(int i, String str, String str2, List list, List list2, FriendsFollowersOnboardingItemButtonDto friendsFollowersOnboardingItemButtonDto, FriendsFollowersOnboardingItemButtonDto friendsFollowersOnboardingItemButtonDto2, int i2, zcl zclVar) {
        this(i, str, str2, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : list2, (i2 & 32) != 0 ? null : friendsFollowersOnboardingItemButtonDto, (i2 & 64) != 0 ? null : friendsFollowersOnboardingItemButtonDto2);
    }
}
