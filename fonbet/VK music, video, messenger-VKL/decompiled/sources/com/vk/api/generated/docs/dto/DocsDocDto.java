package com.vk.api.generated.docs.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: DocsDocDto.kt */
/* loaded from: classes14.dex */
public final class DocsDocDto implements Parcelable {
    public static final Parcelable.Creator<DocsDocDto> CREATOR = new a();

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("can_manage")
    private final Boolean canManage;

    @pmi0("date")
    private final int date;

    @pmi0("ext")
    private final String ext;

    @pmi0("folder_id")
    private final Integer folderId;

    @pmi0("id")
    private final int id;

    @pmi0("is_licensed")
    private final BaseBoolIntDto isLicensed;

    @pmi0("is_purchased")
    private final BaseBoolIntDto isPurchased;

    @pmi0("is_unsafe")
    private final BaseBoolIntDto isUnsafe;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("preview")
    private final DocsDocPreviewDto preview;

    @pmi0("private_url")
    private final String privateUrl;

    @pmi0("purchase_available")
    private final BaseBoolIntDto purchaseAvailable;

    @pmi0("size")
    private final int size;

    @pmi0("tags")
    private final List<String> tags;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final int type;

    @pmi0("url")
    private final String url;

    @pmi0("web_preview_url")
    private final String webPreviewUrl;

    /* compiled from: DocsDocDto.kt */
    public static final class a implements Parcelable.Creator<DocsDocDto> {
        @Override // android.os.Parcelable.Creator
        public final DocsDocDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(DocsDocDto.class.getClassLoader());
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            String readString2 = parcel.readString();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            String readString3 = parcel.readString();
            DocsDocPreviewDto createFromParcel = parcel.readInt() == 0 ? null : DocsDocPreviewDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(DocsDocDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto2 = (BaseBoolIntDto) parcel.readParcelable(DocsDocDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) parcel.readParcelable(DocsDocDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(DocsDocDto.class.getClassLoader());
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            Integer num = null;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new DocsDocDto(readInt, userId, readString, readInt2, readString2, readInt3, readInt4, readString3, createFromParcel, baseBoolIntDto, baseBoolIntDto2, baseBoolIntDto3, baseBoolIntDto4, readString4, readString5, createStringArrayList, valueOf, num, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DocsDocDto[] newArray(int i) {
            return new DocsDocDto[i];
        }
    }

    public DocsDocDto(int i, UserId userId, String str, int i2, String str2, int i3, int i4, String str3, DocsDocPreviewDto docsDocPreviewDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, String str4, String str5, List<String> list, Boolean bool, Integer num, String str6) {
        this.id = i;
        this.ownerId = userId;
        this.title = str;
        this.size = i2;
        this.ext = str2;
        this.date = i3;
        this.type = i4;
        this.url = str3;
        this.preview = docsDocPreviewDto;
        this.isLicensed = baseBoolIntDto;
        this.purchaseAvailable = baseBoolIntDto2;
        this.isPurchased = baseBoolIntDto3;
        this.isUnsafe = baseBoolIntDto4;
        this.webPreviewUrl = str4;
        this.accessKey = str5;
        this.tags = list;
        this.canManage = bool;
        this.folderId = num;
        this.privateUrl = str6;
    }

    public final String d() {
        return this.accessKey;
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
        if (!(obj instanceof DocsDocDto)) {
            return false;
        }
        DocsDocDto docsDocDto = (DocsDocDto) obj;
        return this.id == docsDocDto.id && epx.f(this.ownerId, docsDocDto.ownerId) && epx.f(this.title, docsDocDto.title) && this.size == docsDocDto.size && epx.f(this.ext, docsDocDto.ext) && this.date == docsDocDto.date && this.type == docsDocDto.type && epx.f(this.url, docsDocDto.url) && epx.f(this.preview, docsDocDto.preview) && this.isLicensed == docsDocDto.isLicensed && this.purchaseAvailable == docsDocDto.purchaseAvailable && this.isPurchased == docsDocDto.isPurchased && this.isUnsafe == docsDocDto.isUnsafe && epx.f(this.webPreviewUrl, docsDocDto.webPreviewUrl) && epx.f(this.accessKey, docsDocDto.accessKey) && epx.f(this.tags, docsDocDto.tags) && epx.f(this.canManage, docsDocDto.canManage) && epx.f(this.folderId, docsDocDto.folderId) && epx.f(this.privateUrl, docsDocDto.privateUrl);
    }

    public final String f() {
        return this.ext;
    }

    public final DocsDocPreviewDto g() {
        return this.preview;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int a2 = shy.a(this.type, shy.a(this.date, urd0.a(shy.a(this.size, urd0.a(bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b), 31, this.title), 31), 31, this.ext), 31), 31);
        String str = this.url;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        DocsDocPreviewDto docsDocPreviewDto = this.preview;
        int hashCode2 = (hashCode + (docsDocPreviewDto == null ? 0 : docsDocPreviewDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.isLicensed;
        int hashCode3 = (hashCode2 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.purchaseAvailable;
        int hashCode4 = (hashCode3 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.isPurchased;
        int hashCode5 = (hashCode4 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto4 = this.isUnsafe;
        int hashCode6 = (hashCode5 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
        String str2 = this.webPreviewUrl;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accessKey;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.tags;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.canManage;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.folderId;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.privateUrl;
        return hashCode11 + (str4 != null ? str4.hashCode() : 0);
    }

    public final int i() {
        return this.size;
    }

    public final int j() {
        return this.type;
    }

    public final String k() {
        return this.webPreviewUrl;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DocsDocDto(id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", ext=");
        sb.append(this.ext);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", preview=");
        sb.append(this.preview);
        sb.append(", isLicensed=");
        sb.append(this.isLicensed);
        sb.append(", purchaseAvailable=");
        sb.append(this.purchaseAvailable);
        sb.append(", isPurchased=");
        sb.append(this.isPurchased);
        sb.append(", isUnsafe=");
        sb.append(this.isUnsafe);
        sb.append(", webPreviewUrl=");
        sb.append(this.webPreviewUrl);
        sb.append(", accessKey=");
        sb.append(this.accessKey);
        sb.append(", tags=");
        sb.append(this.tags);
        sb.append(", canManage=");
        sb.append(this.canManage);
        sb.append(", folderId=");
        sb.append(this.folderId);
        sb.append(", privateUrl=");
        return ho8.a(sb, this.privateUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.title);
        parcel.writeInt(this.size);
        parcel.writeString(this.ext);
        parcel.writeInt(this.date);
        parcel.writeInt(this.type);
        parcel.writeString(this.url);
        DocsDocPreviewDto docsDocPreviewDto = this.preview;
        if (docsDocPreviewDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            docsDocPreviewDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.isLicensed, i);
        parcel.writeParcelable(this.purchaseAvailable, i);
        parcel.writeParcelable(this.isPurchased, i);
        parcel.writeParcelable(this.isUnsafe, i);
        parcel.writeString(this.webPreviewUrl);
        parcel.writeString(this.accessKey);
        parcel.writeStringList(this.tags);
        Boolean bool = this.canManage;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num = this.folderId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.privateUrl);
    }

    public /* synthetic */ DocsDocDto(int i, UserId userId, String str, int i2, String str2, int i3, int i4, String str3, DocsDocPreviewDto docsDocPreviewDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, String str4, String str5, List list, Boolean bool, Integer num, String str6, int i5, zcl zclVar) {
        this(i, userId, str, i2, str2, i3, i4, (i5 & 128) != 0 ? null : str3, (i5 & 256) != 0 ? null : docsDocPreviewDto, (i5 & 512) != 0 ? null : baseBoolIntDto, (i5 & 1024) != 0 ? null : baseBoolIntDto2, (i5 & 2048) != 0 ? null : baseBoolIntDto3, (i5 & 4096) != 0 ? null : baseBoolIntDto4, (i5 & 8192) != 0 ? null : str4, (i5 & 16384) != 0 ? null : str5, (32768 & i5) != 0 ? null : list, (65536 & i5) != 0 ? null : bool, (131072 & i5) != 0 ? null : num, (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str6);
    }
}
