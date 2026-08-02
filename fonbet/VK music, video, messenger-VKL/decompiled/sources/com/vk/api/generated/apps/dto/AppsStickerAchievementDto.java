package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsUserStackDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AppsStickerAchievementDto.kt */
/* loaded from: classes14.dex */
public final class AppsStickerAchievementDto implements Parcelable {
    public static final Parcelable.Creator<AppsStickerAchievementDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("friends_opened")
    private final ExploreWidgetsUserStackDto friendsOpened;

    @pmi0("id")
    private final int id;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("name")
    private final String name;

    @pmi0("rest_description")
    private final String restDescription;

    @pmi0("state")
    private final String state;

    /* compiled from: AppsStickerAchievementDto.kt */
    public static final class a implements Parcelable.Creator<AppsStickerAchievementDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsStickerAchievementDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(AppsStickerAchievementDto.class, parcel, arrayList, i, 1);
            }
            return new AppsStickerAchievementDto(readString, readInt, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), (ExploreWidgetsUserStackDto) parcel.readParcelable(AppsStickerAchievementDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsStickerAchievementDto[] newArray(int i) {
            return new AppsStickerAchievementDto[i];
        }
    }

    public AppsStickerAchievementDto(String str, int i, List<BaseImageDto> list, String str2, String str3, String str4, ExploreWidgetsUserStackDto exploreWidgetsUserStackDto) {
        this.description = str;
        this.id = i;
        this.images = list;
        this.name = str2;
        this.state = str3;
        this.restDescription = str4;
        this.friendsOpened = exploreWidgetsUserStackDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsStickerAchievementDto)) {
            return false;
        }
        AppsStickerAchievementDto appsStickerAchievementDto = (AppsStickerAchievementDto) obj;
        return epx.f(this.description, appsStickerAchievementDto.description) && this.id == appsStickerAchievementDto.id && epx.f(this.images, appsStickerAchievementDto.images) && epx.f(this.name, appsStickerAchievementDto.name) && epx.f(this.state, appsStickerAchievementDto.state) && epx.f(this.restDescription, appsStickerAchievementDto.restDescription) && epx.f(this.friendsOpened, appsStickerAchievementDto.friendsOpened);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(fw3.a(shy.a(this.id, this.description.hashCode() * 31, 31), 31, this.images), 31, this.name), 31, this.state);
        String str = this.restDescription;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        ExploreWidgetsUserStackDto exploreWidgetsUserStackDto = this.friendsOpened;
        return hashCode + (exploreWidgetsUserStackDto != null ? exploreWidgetsUserStackDto.hashCode() : 0);
    }

    public final String toString() {
        return "AppsStickerAchievementDto(description=" + this.description + ", id=" + this.id + ", images=" + this.images + ", name=" + this.name + ", state=" + this.state + ", restDescription=" + this.restDescription + ", friendsOpened=" + this.friendsOpened + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.description);
        parcel.writeInt(this.id);
        Iterator a2 = ao.a(parcel, this.images);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.name);
        parcel.writeString(this.state);
        parcel.writeString(this.restDescription);
        parcel.writeParcelable(this.friendsOpened, i);
    }

    public /* synthetic */ AppsStickerAchievementDto(String str, int i, List list, String str2, String str3, String str4, ExploreWidgetsUserStackDto exploreWidgetsUserStackDto, int i2, zcl zclVar) {
        this(str, i, list, str2, str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : exploreWidgetsUserStackDto);
    }
}
