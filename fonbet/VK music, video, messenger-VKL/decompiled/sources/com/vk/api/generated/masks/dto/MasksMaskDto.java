package com.vk.api.generated.masks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4217a2;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bh10;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MasksMaskDto.kt */
/* loaded from: classes15.dex */
public final class MasksMaskDto implements Parcelable {
    public static final Parcelable.Creator<MasksMaskDto> CREATOR = new a();

    @pmi0("category")
    private final MasksCategoryDto category;

    @pmi0("category_display")
    private final String categoryDisplay;

    @pmi0("create_time")
    private final Integer createTime;

    @pmi0("customer")
    private final MasksCustomerDto customer;

    @pmi0(C4217a2.e)
    private final MasksMaskDisabledReasonDto disabled;

    @pmi0("disabled_reason")
    private final MasksMaskDisabledReasonDto disabledReason;

    @pmi0("display_name_lang_key")
    private final String displayNameLangKey;

    @pmi0("engine_version")
    private final Integer engineVersion;

    @pmi0("geo")
    private final List<List<MasksMaskGeoDto>> geo;

    @pmi0("hint")
    private final String hint;

    @pmi0("id")
    private final int id;

    @pmi0("internal_note")
    private final String internalNote;

    @pmi0("is_disabled")
    private final boolean isDisabled;

    @pmi0("is_favorite")
    private final Boolean isFavorite;

    @pmi0("is_featured")
    private final Boolean isFeatured;

    @pmi0("is_game")
    private final Boolean isGame;

    @pmi0("is_new")
    private final Boolean isNew;

    @pmi0("is_tappable")
    private final Boolean isTappable;

    @pmi0("media_preview")
    private final PhotosPhotoDto mediaPreview;

    @pmi0("name")
    private final String name;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("preview")
    private final MasksMaskPreviewDto preview;

    @pmi0("preview_photo")
    private final String previewPhoto;

    @pmi0("previews")
    private final List<BaseImageDto> previews;

    @pmi0("saves_count")
    private final Integer savesCount;

    @pmi0("search_tags")
    private final String searchTags;

    @pmi0("section_id")
    private final Integer sectionId;

    @pmi0("update_time")
    private final Integer updateTime;

    @pmi0("url")
    private final String url;

    @pmi0("views_count")
    private final Integer viewsCount;

    @pmi0("vk_engine_version")
    private final Integer vkEngineVersion;

    /* compiled from: MasksMaskDto.kt */
    public static final class a implements Parcelable.Creator<MasksMaskDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final MasksMaskDto createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Integer valueOf;
            PhotosPhotoDto photosPhotoDto;
            Object valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            ArrayList arrayList;
            int i;
            UserId userId;
            Boolean valueOf5;
            MasksMaskPreviewDto masksMaskPreviewDto;
            Boolean bool;
            ArrayList arrayList2;
            MasksMaskDisabledReasonDto masksMaskDisabledReasonDto;
            Boolean valueOf6;
            int readInt = parcel.readInt();
            UserId userId2 = (UserId) parcel.readParcelable(MasksMaskDto.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z2 = false;
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            String readString = parcel.readString();
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
                photosPhotoDto = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                photosPhotoDto = null;
            }
            String readString2 = parcel.readString();
            Object valueOf9 = parcel.readInt() == 0 ? photosPhotoDto : Integer.valueOf(parcel.readInt());
            Object valueOf10 = parcel.readInt() == 0 ? photosPhotoDto : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf2 = photosPhotoDto;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? true : z2);
            }
            boolean z3 = z2;
            Integer num = valueOf8;
            Integer num2 = valueOf9;
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                photosPhotoDto = PhotosPhotoDto.CREATOR.createFromParcel(parcel);
            }
            PhotosPhotoDto photosPhotoDto2 = photosPhotoDto;
            Integer num3 = valueOf7;
            Integer num4 = valueOf;
            Integer num5 = valueOf10;
            Boolean bool2 = valueOf2;
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0 ? true : z3);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0 ? true : z3);
            }
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                i = readInt;
                int i2 = 0;
                while (true) {
                    userId = userId2;
                    if (i2 == readInt2) {
                        break;
                    }
                    i2 = en.a(BaseImageDto.CREATOR, parcel, arrayList, i2, 1);
                    userId2 = userId;
                    z = z;
                }
            } else {
                i = readInt;
                arrayList = null;
                userId = userId2;
            }
            boolean z4 = z;
            MasksMaskPreviewDto createFromParcel = parcel.readInt() == 0 ? null : MasksMaskPreviewDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            MasksMaskDisabledReasonDto createFromParcel2 = parcel.readInt() == 0 ? null : MasksMaskDisabledReasonDto.CREATOR.createFromParcel(parcel);
            MasksMaskDisabledReasonDto createFromParcel3 = parcel.readInt() == 0 ? null : MasksMaskDisabledReasonDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                masksMaskPreviewDto = createFromParcel;
                bool = valueOf5;
                masksMaskDisabledReasonDto = createFromParcel2;
                arrayList2 = null;
            } else {
                masksMaskPreviewDto = createFromParcel;
                int readInt3 = parcel.readInt();
                bool = valueOf5;
                arrayList2 = new ArrayList(readInt3);
                masksMaskDisabledReasonDto = createFromParcel2;
                int i3 = 0;
                while (i3 != readInt3) {
                    int i4 = readInt3;
                    int readInt4 = parcel.readInt();
                    int i5 = i3;
                    ArrayList arrayList3 = new ArrayList(readInt4);
                    String str = readString;
                    int i6 = 0;
                    while (i6 != readInt4) {
                        i6 = en.a(MasksMaskGeoDto.CREATOR, parcel, arrayList3, i6, 1);
                        readInt4 = readInt4;
                        arrayList = arrayList;
                    }
                    arrayList2.add(arrayList3);
                    i3 = i5 + 1;
                    readInt3 = i4;
                    readString = str;
                    arrayList = arrayList;
                }
            }
            String str2 = readString;
            ArrayList arrayList4 = arrayList;
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MasksMaskDto(i, userId, z4, str2, num3, num, num4, readString2, num2, num5, bool2, readString3, photosPhotoDto2, readString4, valueOf3, valueOf4, readString5, arrayList4, masksMaskPreviewDto, bool, masksMaskDisabledReasonDto, createFromParcel3, arrayList2, valueOf6, parcel.readInt() == 0 ? null : MasksCategoryDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : MasksCustomerDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final MasksMaskDto[] newArray(int i) {
            return new MasksMaskDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MasksMaskDto(int i, UserId userId, boolean z, String str, Integer num, Integer num2, Integer num3, String str2, Integer num4, Integer num5, Boolean bool, String str3, PhotosPhotoDto photosPhotoDto, String str4, Boolean bool2, Boolean bool3, String str5, List<BaseImageDto> list, MasksMaskPreviewDto masksMaskPreviewDto, Boolean bool4, MasksMaskDisabledReasonDto masksMaskDisabledReasonDto, MasksMaskDisabledReasonDto masksMaskDisabledReasonDto2, List<? extends List<MasksMaskGeoDto>> list2, Boolean bool5, MasksCategoryDto masksCategoryDto, String str6, MasksCustomerDto masksCustomerDto, String str7, String str8, Integer num6, Integer num7) {
        this.id = i;
        this.ownerId = userId;
        this.isDisabled = z;
        this.name = str;
        this.sectionId = num;
        this.updateTime = num2;
        this.createTime = num3;
        this.url = str2;
        this.engineVersion = num4;
        this.vkEngineVersion = num5;
        this.isFeatured = bool;
        this.previewPhoto = str3;
        this.mediaPreview = photosPhotoDto;
        this.searchTags = str4;
        this.isTappable = bool2;
        this.isGame = bool3;
        this.hint = str5;
        this.previews = list;
        this.preview = masksMaskPreviewDto;
        this.isNew = bool4;
        this.disabledReason = masksMaskDisabledReasonDto;
        this.disabled = masksMaskDisabledReasonDto2;
        this.geo = list2;
        this.isFavorite = bool5;
        this.category = masksCategoryDto;
        this.categoryDisplay = str6;
        this.customer = masksCustomerDto;
        this.displayNameLangKey = str7;
        this.internalNote = str8;
        this.viewsCount = num6;
        this.savesCount = num7;
    }

    public final Boolean B() {
        return this.isNew;
    }

    public final Boolean C() {
        return this.isTappable;
    }

    public final String d() {
        return this.categoryDisplay;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.createTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MasksMaskDto)) {
            return false;
        }
        MasksMaskDto masksMaskDto = (MasksMaskDto) obj;
        return this.id == masksMaskDto.id && epx.f(this.ownerId, masksMaskDto.ownerId) && this.isDisabled == masksMaskDto.isDisabled && epx.f(this.name, masksMaskDto.name) && epx.f(this.sectionId, masksMaskDto.sectionId) && epx.f(this.updateTime, masksMaskDto.updateTime) && epx.f(this.createTime, masksMaskDto.createTime) && epx.f(this.url, masksMaskDto.url) && epx.f(this.engineVersion, masksMaskDto.engineVersion) && epx.f(this.vkEngineVersion, masksMaskDto.vkEngineVersion) && epx.f(this.isFeatured, masksMaskDto.isFeatured) && epx.f(this.previewPhoto, masksMaskDto.previewPhoto) && epx.f(this.mediaPreview, masksMaskDto.mediaPreview) && epx.f(this.searchTags, masksMaskDto.searchTags) && epx.f(this.isTappable, masksMaskDto.isTappable) && epx.f(this.isGame, masksMaskDto.isGame) && epx.f(this.hint, masksMaskDto.hint) && epx.f(this.previews, masksMaskDto.previews) && epx.f(this.preview, masksMaskDto.preview) && epx.f(this.isNew, masksMaskDto.isNew) && epx.f(this.disabledReason, masksMaskDto.disabledReason) && epx.f(this.disabled, masksMaskDto.disabled) && epx.f(this.geo, masksMaskDto.geo) && epx.f(this.isFavorite, masksMaskDto.isFavorite) && this.category == masksMaskDto.category && epx.f(this.categoryDisplay, masksMaskDto.categoryDisplay) && this.customer == masksMaskDto.customer && epx.f(this.displayNameLangKey, masksMaskDto.displayNameLangKey) && epx.f(this.internalNote, masksMaskDto.internalNote) && epx.f(this.viewsCount, masksMaskDto.viewsCount) && epx.f(this.savesCount, masksMaskDto.savesCount);
    }

    public final MasksMaskDisabledReasonDto f() {
        return this.disabledReason;
    }

    public final Integer g() {
        return this.engineVersion;
    }

    public final int getId() {
        return this.id;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int b = qoy.b(bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b), 31, this.isDisabled);
        String str = this.name;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.sectionId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.updateTime;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.createTime;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.url;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.engineVersion;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.vkEngineVersion;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool = this.isFeatured;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.previewPhoto;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.mediaPreview;
        int hashCode10 = (hashCode9 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        String str4 = this.searchTags;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.isTappable;
        int hashCode12 = (hashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isGame;
        int hashCode13 = (hashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str5 = this.hint;
        int hashCode14 = (hashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<BaseImageDto> list = this.previews;
        int hashCode15 = (hashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        MasksMaskPreviewDto masksMaskPreviewDto = this.preview;
        int hashCode16 = (hashCode15 + (masksMaskPreviewDto == null ? 0 : masksMaskPreviewDto.hashCode())) * 31;
        Boolean bool4 = this.isNew;
        int hashCode17 = (hashCode16 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        MasksMaskDisabledReasonDto masksMaskDisabledReasonDto = this.disabledReason;
        int hashCode18 = (hashCode17 + (masksMaskDisabledReasonDto == null ? 0 : masksMaskDisabledReasonDto.hashCode())) * 31;
        MasksMaskDisabledReasonDto masksMaskDisabledReasonDto2 = this.disabled;
        int hashCode19 = (hashCode18 + (masksMaskDisabledReasonDto2 == null ? 0 : masksMaskDisabledReasonDto2.hashCode())) * 31;
        List<List<MasksMaskGeoDto>> list2 = this.geo;
        int hashCode20 = (hashCode19 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool5 = this.isFavorite;
        int hashCode21 = (hashCode20 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        MasksCategoryDto masksCategoryDto = this.category;
        int hashCode22 = (hashCode21 + (masksCategoryDto == null ? 0 : masksCategoryDto.hashCode())) * 31;
        String str6 = this.categoryDisplay;
        int hashCode23 = (hashCode22 + (str6 == null ? 0 : str6.hashCode())) * 31;
        MasksCustomerDto masksCustomerDto = this.customer;
        int hashCode24 = (hashCode23 + (masksCustomerDto == null ? 0 : masksCustomerDto.hashCode())) * 31;
        String str7 = this.displayNameLangKey;
        int hashCode25 = (hashCode24 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.internalNote;
        int hashCode26 = (hashCode25 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num6 = this.viewsCount;
        int hashCode27 = (hashCode26 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.savesCount;
        return hashCode27 + (num7 != null ? num7.hashCode() : 0);
    }

    public final List<List<MasksMaskGeoDto>> i() {
        return this.geo;
    }

    public final String j() {
        return this.hint;
    }

    public final String k() {
        return this.name;
    }

    public final List<BaseImageDto> l() {
        return this.previews;
    }

    public final Integer n() {
        return this.sectionId;
    }

    public final Integer o() {
        return this.updateTime;
    }

    public final Integer p() {
        return this.vkEngineVersion;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MasksMaskDto(id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", isDisabled=");
        sb.append(this.isDisabled);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", sectionId=");
        sb.append(this.sectionId);
        sb.append(", updateTime=");
        sb.append(this.updateTime);
        sb.append(", createTime=");
        sb.append(this.createTime);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", engineVersion=");
        sb.append(this.engineVersion);
        sb.append(", vkEngineVersion=");
        sb.append(this.vkEngineVersion);
        sb.append(", isFeatured=");
        sb.append(this.isFeatured);
        sb.append(", previewPhoto=");
        sb.append(this.previewPhoto);
        sb.append(", mediaPreview=");
        sb.append(this.mediaPreview);
        sb.append(", searchTags=");
        sb.append(this.searchTags);
        sb.append(", isTappable=");
        sb.append(this.isTappable);
        sb.append(", isGame=");
        sb.append(this.isGame);
        sb.append(", hint=");
        sb.append(this.hint);
        sb.append(", previews=");
        sb.append(this.previews);
        sb.append(", preview=");
        sb.append(this.preview);
        sb.append(", isNew=");
        sb.append(this.isNew);
        sb.append(", disabledReason=");
        sb.append(this.disabledReason);
        sb.append(", disabled=");
        sb.append(this.disabled);
        sb.append(", geo=");
        sb.append(this.geo);
        sb.append(", isFavorite=");
        sb.append(this.isFavorite);
        sb.append(", category=");
        sb.append(this.category);
        sb.append(", categoryDisplay=");
        sb.append(this.categoryDisplay);
        sb.append(", customer=");
        sb.append(this.customer);
        sb.append(", displayNameLangKey=");
        sb.append(this.displayNameLangKey);
        sb.append(", internalNote=");
        sb.append(this.internalNote);
        sb.append(", viewsCount=");
        sb.append(this.viewsCount);
        sb.append(", savesCount=");
        return uqi.b(sb, this.savesCount, ')');
    }

    public final Boolean u() {
        return this.isFavorite;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.isDisabled ? 1 : 0);
        parcel.writeString(this.name);
        Integer num = this.sectionId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.updateTime;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.createTime;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.url);
        Integer num4 = this.engineVersion;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.vkEngineVersion;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Boolean bool = this.isFeatured;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.previewPhoto);
        PhotosPhotoDto photosPhotoDto = this.mediaPreview;
        if (photosPhotoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photosPhotoDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.searchTags);
        Boolean bool2 = this.isTappable;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isGame;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        parcel.writeString(this.hint);
        List<BaseImageDto> list = this.previews;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((BaseImageDto) f.next()).writeToParcel(parcel, i);
            }
        }
        MasksMaskPreviewDto masksMaskPreviewDto = this.preview;
        if (masksMaskPreviewDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            masksMaskPreviewDto.writeToParcel(parcel, i);
        }
        Boolean bool4 = this.isNew;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        MasksMaskDisabledReasonDto masksMaskDisabledReasonDto = this.disabledReason;
        if (masksMaskDisabledReasonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            masksMaskDisabledReasonDto.writeToParcel(parcel, i);
        }
        MasksMaskDisabledReasonDto masksMaskDisabledReasonDto2 = this.disabled;
        if (masksMaskDisabledReasonDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            masksMaskDisabledReasonDto2.writeToParcel(parcel, i);
        }
        List<List<MasksMaskGeoDto>> list2 = this.geo;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                Iterator a2 = ao.a(parcel, (List) f2.next());
                while (a2.hasNext()) {
                    ((MasksMaskGeoDto) a2.next()).writeToParcel(parcel, i);
                }
            }
        }
        Boolean bool5 = this.isFavorite;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        MasksCategoryDto masksCategoryDto = this.category;
        if (masksCategoryDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            masksCategoryDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.categoryDisplay);
        MasksCustomerDto masksCustomerDto = this.customer;
        if (masksCustomerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            masksCustomerDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.displayNameLangKey);
        parcel.writeString(this.internalNote);
        Integer num6 = this.viewsCount;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        Integer num7 = this.savesCount;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
    }

    public /* synthetic */ MasksMaskDto(int i, UserId userId, boolean z, String str, Integer num, Integer num2, Integer num3, String str2, Integer num4, Integer num5, Boolean bool, String str3, PhotosPhotoDto photosPhotoDto, String str4, Boolean bool2, Boolean bool3, String str5, List list, MasksMaskPreviewDto masksMaskPreviewDto, Boolean bool4, MasksMaskDisabledReasonDto masksMaskDisabledReasonDto, MasksMaskDisabledReasonDto masksMaskDisabledReasonDto2, List list2, Boolean bool5, MasksCategoryDto masksCategoryDto, String str6, MasksCustomerDto masksCustomerDto, String str7, String str8, Integer num6, Integer num7, int i2, zcl zclVar) {
        this(i, userId, z, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? null : num3, (i2 & 128) != 0 ? null : str2, (i2 & 256) != 0 ? null : num4, (i2 & 512) != 0 ? null : num5, (i2 & 1024) != 0 ? null : bool, (i2 & 2048) != 0 ? null : str3, (i2 & 4096) != 0 ? null : photosPhotoDto, (i2 & 8192) != 0 ? null : str4, (i2 & 16384) != 0 ? null : bool2, (32768 & i2) != 0 ? null : bool3, (65536 & i2) != 0 ? null : str5, (131072 & i2) != 0 ? null : list, (262144 & i2) != 0 ? null : masksMaskPreviewDto, (524288 & i2) != 0 ? null : bool4, (1048576 & i2) != 0 ? null : masksMaskDisabledReasonDto, (2097152 & i2) != 0 ? null : masksMaskDisabledReasonDto2, (4194304 & i2) != 0 ? null : list2, (8388608 & i2) != 0 ? null : bool5, (16777216 & i2) != 0 ? null : masksCategoryDto, (33554432 & i2) != 0 ? null : str6, (67108864 & i2) != 0 ? null : masksCustomerDto, (134217728 & i2) != 0 ? null : str7, (268435456 & i2) != 0 ? null : str8, (536870912 & i2) != 0 ? null : num6, (i2 & 1073741824) != 0 ? null : num7);
    }
}
