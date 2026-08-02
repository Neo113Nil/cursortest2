package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallPosterCategoryBackgroundDto.kt */
/* loaded from: classes15.dex */
public final class WallPosterCategoryBackgroundDto implements Parcelable {
    public static final Parcelable.Creator<WallPosterCategoryBackgroundDto> CREATOR = new a();

    @pmi0("access_hash")
    private final String accessHash;

    @pmi0("author_link")
    private final String authorLink;

    @pmi0("author_name")
    private final String authorName;

    @pmi0("background_name")
    private final String backgroundName;

    @pmi0("id")
    private final Integer id;

    @pmi0("main_color")
    private final String mainColor;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("placeholder")
    private final String placeholder;

    @pmi0("preview")
    private final List<BaseImageDto> preview;

    @pmi0("text_color")
    private final String textColor;

    @pmi0("urls")
    private final WallPosterCategoryBackgroundUrlsDto urls;

    /* compiled from: WallPosterCategoryBackgroundDto.kt */
    public static final class a implements Parcelable.Creator<WallPosterCategoryBackgroundDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPosterCategoryBackgroundDto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            WallPosterCategoryBackgroundUrlsDto createFromParcel = parcel.readInt() == 0 ? null : WallPosterCategoryBackgroundUrlsDto.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(WallPosterCategoryBackgroundDto.class, parcel, arrayList, i, 1);
                }
            }
            return new WallPosterCategoryBackgroundDto(valueOf, readString, readString2, createFromParcel, readString3, readString4, readString5, arrayList, (UserId) parcel.readParcelable(WallPosterCategoryBackgroundDto.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallPosterCategoryBackgroundDto[] newArray(int i) {
            return new WallPosterCategoryBackgroundDto[i];
        }
    }

    public WallPosterCategoryBackgroundDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPosterCategoryBackgroundDto)) {
            return false;
        }
        WallPosterCategoryBackgroundDto wallPosterCategoryBackgroundDto = (WallPosterCategoryBackgroundDto) obj;
        return epx.f(this.id, wallPosterCategoryBackgroundDto.id) && epx.f(this.textColor, wallPosterCategoryBackgroundDto.textColor) && epx.f(this.mainColor, wallPosterCategoryBackgroundDto.mainColor) && epx.f(this.urls, wallPosterCategoryBackgroundDto.urls) && epx.f(this.placeholder, wallPosterCategoryBackgroundDto.placeholder) && epx.f(this.accessHash, wallPosterCategoryBackgroundDto.accessHash) && epx.f(this.backgroundName, wallPosterCategoryBackgroundDto.backgroundName) && epx.f(this.preview, wallPosterCategoryBackgroundDto.preview) && epx.f(this.ownerId, wallPosterCategoryBackgroundDto.ownerId) && epx.f(this.authorLink, wallPosterCategoryBackgroundDto.authorLink) && epx.f(this.authorName, wallPosterCategoryBackgroundDto.authorName);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.textColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mainColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        WallPosterCategoryBackgroundUrlsDto wallPosterCategoryBackgroundUrlsDto = this.urls;
        int hashCode4 = (hashCode3 + (wallPosterCategoryBackgroundUrlsDto == null ? 0 : wallPosterCategoryBackgroundUrlsDto.hashCode())) * 31;
        String str3 = this.placeholder;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.accessHash;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.backgroundName;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<BaseImageDto> list = this.preview;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        UserId userId = this.ownerId;
        int hashCode9 = (hashCode8 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str6 = this.authorLink;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.authorName;
        return hashCode10 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallPosterCategoryBackgroundDto(id=");
        sb.append(this.id);
        sb.append(", textColor=");
        sb.append(this.textColor);
        sb.append(", mainColor=");
        sb.append(this.mainColor);
        sb.append(", urls=");
        sb.append(this.urls);
        sb.append(", placeholder=");
        sb.append(this.placeholder);
        sb.append(", accessHash=");
        sb.append(this.accessHash);
        sb.append(", backgroundName=");
        sb.append(this.backgroundName);
        sb.append(", preview=");
        sb.append(this.preview);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", authorLink=");
        sb.append(this.authorLink);
        sb.append(", authorName=");
        return ho8.a(sb, this.authorName, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.textColor);
        parcel.writeString(this.mainColor);
        WallPosterCategoryBackgroundUrlsDto wallPosterCategoryBackgroundUrlsDto = this.urls;
        if (wallPosterCategoryBackgroundUrlsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPosterCategoryBackgroundUrlsDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.placeholder);
        parcel.writeString(this.accessHash);
        parcel.writeString(this.backgroundName);
        List<BaseImageDto> list = this.preview;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.authorLink);
        parcel.writeString(this.authorName);
    }

    public WallPosterCategoryBackgroundDto(Integer num, String str, String str2, WallPosterCategoryBackgroundUrlsDto wallPosterCategoryBackgroundUrlsDto, String str3, String str4, String str5, List<BaseImageDto> list, UserId userId, String str6, String str7) {
        this.id = num;
        this.textColor = str;
        this.mainColor = str2;
        this.urls = wallPosterCategoryBackgroundUrlsDto;
        this.placeholder = str3;
        this.accessHash = str4;
        this.backgroundName = str5;
        this.preview = list;
        this.ownerId = userId;
        this.authorLink = str6;
        this.authorName = str7;
    }

    public /* synthetic */ WallPosterCategoryBackgroundDto(Integer num, String str, String str2, WallPosterCategoryBackgroundUrlsDto wallPosterCategoryBackgroundUrlsDto, String str3, String str4, String str5, List list, UserId userId, String str6, String str7, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : wallPosterCategoryBackgroundUrlsDto, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : userId, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7);
    }
}
