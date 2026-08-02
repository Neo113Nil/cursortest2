package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: FriendsRecBlockInfoCardDto.kt */
/* loaded from: classes14.dex */
public final class FriendsRecBlockInfoCardDto implements Parcelable {
    public static final Parcelable.Creator<FriendsRecBlockInfoCardDto> CREATOR = new a();

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("descriptions")
    private final List<String> descriptions;

    @pmi0("friends_count")
    private final Integer friendsCount;

    @pmi0("images")
    private final List<PhotosPhotoSizesDto> images;

    @pmi0(X3.i.L)
    private final Integer position;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("template")
    private final FriendsRecBlockInfoCardTemplateDto template;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: FriendsRecBlockInfoCardDto.kt */
    public static final class a implements Parcelable.Creator<FriendsRecBlockInfoCardDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsRecBlockInfoCardDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            FriendsRecBlockInfoCardTemplateDto createFromParcel = parcel.readInt() == 0 ? null : FriendsRecBlockInfoCardTemplateDto.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(FriendsRecBlockInfoCardDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new FriendsRecBlockInfoCardDto(readString, readString2, createFromParcel, readString3, createStringArrayList, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsRecBlockInfoCardDto[] newArray(int i) {
            return new FriendsRecBlockInfoCardDto[i];
        }
    }

    public FriendsRecBlockInfoCardDto(String str, String str2, FriendsRecBlockInfoCardTemplateDto friendsRecBlockInfoCardTemplateDto, String str3, List<String> list, List<PhotosPhotoSizesDto> list2, Integer num, Integer num2, String str4) {
        this.title = str;
        this.buttonText = str2;
        this.template = friendsRecBlockInfoCardTemplateDto;
        this.subtitle = str3;
        this.descriptions = list;
        this.images = list2;
        this.friendsCount = num;
        this.position = num2;
        this.trackCode = str4;
    }

    public final String d() {
        return this.buttonText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<String> e() {
        return this.descriptions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsRecBlockInfoCardDto)) {
            return false;
        }
        FriendsRecBlockInfoCardDto friendsRecBlockInfoCardDto = (FriendsRecBlockInfoCardDto) obj;
        return epx.f(this.title, friendsRecBlockInfoCardDto.title) && epx.f(this.buttonText, friendsRecBlockInfoCardDto.buttonText) && this.template == friendsRecBlockInfoCardDto.template && epx.f(this.subtitle, friendsRecBlockInfoCardDto.subtitle) && epx.f(this.descriptions, friendsRecBlockInfoCardDto.descriptions) && epx.f(this.images, friendsRecBlockInfoCardDto.images) && epx.f(this.friendsCount, friendsRecBlockInfoCardDto.friendsCount) && epx.f(this.position, friendsRecBlockInfoCardDto.position) && epx.f(this.trackCode, friendsRecBlockInfoCardDto.trackCode);
    }

    public final Integer f() {
        return this.friendsCount;
    }

    public final List<PhotosPhotoSizesDto> g() {
        return this.images;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.title.hashCode() * 31, 31, this.buttonText);
        FriendsRecBlockInfoCardTemplateDto friendsRecBlockInfoCardTemplateDto = this.template;
        int hashCode = (a2 + (friendsRecBlockInfoCardTemplateDto == null ? 0 : friendsRecBlockInfoCardTemplateDto.hashCode())) * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.descriptions;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<PhotosPhotoSizesDto> list2 = this.images;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.friendsCount;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.position;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.trackCode;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final Integer i() {
        return this.position;
    }

    public final String j() {
        return this.subtitle;
    }

    public final FriendsRecBlockInfoCardTemplateDto k() {
        return this.template;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsRecBlockInfoCardDto(title=");
        sb.append(this.title);
        sb.append(", buttonText=");
        sb.append(this.buttonText);
        sb.append(", template=");
        sb.append(this.template);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", descriptions=");
        sb.append(this.descriptions);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", friendsCount=");
        sb.append(this.friendsCount);
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.buttonText);
        FriendsRecBlockInfoCardTemplateDto friendsRecBlockInfoCardTemplateDto = this.template;
        if (friendsRecBlockInfoCardTemplateDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            friendsRecBlockInfoCardTemplateDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.subtitle);
        parcel.writeStringList(this.descriptions);
        List<PhotosPhotoSizesDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Integer num = this.friendsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.position;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.trackCode);
    }

    public /* synthetic */ FriendsRecBlockInfoCardDto(String str, String str2, FriendsRecBlockInfoCardTemplateDto friendsRecBlockInfoCardTemplateDto, String str3, List list, List list2, Integer num, Integer num2, String str4, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : friendsRecBlockInfoCardTemplateDto, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : str4);
    }
}
