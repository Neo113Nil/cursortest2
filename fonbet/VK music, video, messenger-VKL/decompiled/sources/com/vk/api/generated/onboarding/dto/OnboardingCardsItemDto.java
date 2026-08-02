package com.vk.api.generated.onboarding.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: OnboardingCardsItemDto.kt */
/* loaded from: classes15.dex */
public final class OnboardingCardsItemDto implements Parcelable {
    public static final Parcelable.Creator<OnboardingCardsItemDto> CREATOR = new a();

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("description")
    private final String description;

    @pmi0("icon_token")
    private final String iconToken;

    @pmi0("icons_dark")
    private final List<BaseImageDto> iconsDark;

    @pmi0("icons_light")
    private final List<BaseImageDto> iconsLight;

    @pmi0("id")
    private final int id;

    @pmi0("title")
    private final String title;

    /* compiled from: OnboardingCardsItemDto.kt */
    public static final class a implements Parcelable.Creator<OnboardingCardsItemDto> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingCardsItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(OnboardingCardsItemDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(OnboardingCardsItemDto.class, parcel, arrayList2, i, 1);
                }
            }
            return new OnboardingCardsItemDto(readInt, readString, readString2, readString3, arrayList, arrayList2, (BaseLinkButtonActionDto) parcel.readParcelable(OnboardingCardsItemDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingCardsItemDto[] newArray(int i) {
            return new OnboardingCardsItemDto[i];
        }
    }

    public OnboardingCardsItemDto(int i, String str, String str2, String str3, List<BaseImageDto> list, List<BaseImageDto> list2, BaseLinkButtonActionDto baseLinkButtonActionDto) {
        this.id = i;
        this.title = str;
        this.description = str2;
        this.iconToken = str3;
        this.iconsLight = list;
        this.iconsDark = list2;
        this.action = baseLinkButtonActionDto;
    }

    public final BaseLinkButtonActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<BaseImageDto> e() {
        return this.iconsLight;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingCardsItemDto)) {
            return false;
        }
        OnboardingCardsItemDto onboardingCardsItemDto = (OnboardingCardsItemDto) obj;
        return this.id == onboardingCardsItemDto.id && epx.f(this.title, onboardingCardsItemDto.title) && epx.f(this.description, onboardingCardsItemDto.description) && epx.f(this.iconToken, onboardingCardsItemDto.iconToken) && epx.f(this.iconsLight, onboardingCardsItemDto.iconsLight) && epx.f(this.iconsDark, onboardingCardsItemDto.iconsDark) && epx.f(this.action, onboardingCardsItemDto.action);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.title), 31, this.description);
        String str = this.iconToken;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        List<BaseImageDto> list = this.iconsLight;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<BaseImageDto> list2 = this.iconsDark;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        return hashCode3 + (baseLinkButtonActionDto != null ? baseLinkButtonActionDto.hashCode() : 0);
    }

    public final String toString() {
        return "OnboardingCardsItemDto(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", iconToken=" + this.iconToken + ", iconsLight=" + this.iconsLight + ", iconsDark=" + this.iconsDark + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.iconToken);
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
        parcel.writeParcelable(this.action, i);
    }

    public /* synthetic */ OnboardingCardsItemDto(int i, String str, String str2, String str3, List list, List list2, BaseLinkButtonActionDto baseLinkButtonActionDto, int i2, zcl zclVar) {
        this(i, str, str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : list2, (i2 & 64) != 0 ? null : baseLinkButtonActionDto);
    }
}
