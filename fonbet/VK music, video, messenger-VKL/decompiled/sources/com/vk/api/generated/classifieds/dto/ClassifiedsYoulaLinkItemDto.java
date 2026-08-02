package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.textlives.dto.TextlivesTextpostAttachmentDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ClassifiedsYoulaLinkItemDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsYoulaLinkItemDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsYoulaLinkItemDto> CREATOR = new a();

    @pmi0("commercial_profile_button")
    private final BaseLinkButtonDto commercialProfileButton;

    @pmi0("internal_id")
    private final int internalId;

    @pmi0("internal_owner_id")
    private final int internalOwnerId;

    @pmi0("photo_total_count_description")
    private final String photoTotalCountDescription;

    @pmi0("photos")
    private final List<ClassifiedsYoulaItemPhotoDto> photos;

    @pmi0("product_id")
    private final String productId;

    @pmi0("snippet_type")
    private final SnippetTypeDto snippetType;

    @pmi0("textpost_attachment")
    private final TextlivesTextpostAttachmentDto textpostAttachment;

    @pmi0("track_code")
    private final String trackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClassifiedsYoulaLinkItemDto.kt */
    public static final class SnippetTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SnippetTypeDto[] $VALUES;

        @pmi0("basic")
        public static final SnippetTypeDto BASIC;
        public static final Parcelable.Creator<SnippetTypeDto> CREATOR;

        @pmi0("native_post")
        public static final SnippetTypeDto NATIVE_POST;

        @pmi0("redesign")
        public static final SnippetTypeDto REDESIGN;
        private final String value;

        /* compiled from: ClassifiedsYoulaLinkItemDto.kt */
        public static final class a implements Parcelable.Creator<SnippetTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final SnippetTypeDto createFromParcel(Parcel parcel) {
                return SnippetTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SnippetTypeDto[] newArray(int i) {
                return new SnippetTypeDto[i];
            }
        }

        static {
            SnippetTypeDto snippetTypeDto = new SnippetTypeDto("BASIC", 0, "basic");
            BASIC = snippetTypeDto;
            SnippetTypeDto snippetTypeDto2 = new SnippetTypeDto("REDESIGN", 1, "redesign");
            REDESIGN = snippetTypeDto2;
            SnippetTypeDto snippetTypeDto3 = new SnippetTypeDto("NATIVE_POST", 2, "native_post");
            NATIVE_POST = snippetTypeDto3;
            SnippetTypeDto[] snippetTypeDtoArr = {snippetTypeDto, snippetTypeDto2, snippetTypeDto3};
            $VALUES = snippetTypeDtoArr;
            $ENTRIES = new asp(snippetTypeDtoArr);
            CREATOR = new a();
        }

        private SnippetTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static SnippetTypeDto valueOf(String str) {
            return (SnippetTypeDto) Enum.valueOf(SnippetTypeDto.class, str);
        }

        public static SnippetTypeDto[] values() {
            return (SnippetTypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: ClassifiedsYoulaLinkItemDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsYoulaLinkItemDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsYoulaLinkItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i = 0;
                while (i != readInt3) {
                    i = en.a(ClassifiedsYoulaItemPhotoDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new ClassifiedsYoulaLinkItemDto(readInt, readInt2, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : BaseLinkButtonDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : SnippetTypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? TextlivesTextpostAttachmentDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsYoulaLinkItemDto[] newArray(int i) {
            return new ClassifiedsYoulaLinkItemDto[i];
        }
    }

    public ClassifiedsYoulaLinkItemDto(int i, int i2, List<ClassifiedsYoulaItemPhotoDto> list, String str, BaseLinkButtonDto baseLinkButtonDto, String str2, SnippetTypeDto snippetTypeDto, String str3, TextlivesTextpostAttachmentDto textlivesTextpostAttachmentDto) {
        this.internalOwnerId = i;
        this.internalId = i2;
        this.photos = list;
        this.photoTotalCountDescription = str;
        this.commercialProfileButton = baseLinkButtonDto;
        this.trackCode = str2;
        this.snippetType = snippetTypeDto;
        this.productId = str3;
        this.textpostAttachment = textlivesTextpostAttachmentDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaLinkItemDto)) {
            return false;
        }
        ClassifiedsYoulaLinkItemDto classifiedsYoulaLinkItemDto = (ClassifiedsYoulaLinkItemDto) obj;
        return this.internalOwnerId == classifiedsYoulaLinkItemDto.internalOwnerId && this.internalId == classifiedsYoulaLinkItemDto.internalId && epx.f(this.photos, classifiedsYoulaLinkItemDto.photos) && epx.f(this.photoTotalCountDescription, classifiedsYoulaLinkItemDto.photoTotalCountDescription) && epx.f(this.commercialProfileButton, classifiedsYoulaLinkItemDto.commercialProfileButton) && epx.f(this.trackCode, classifiedsYoulaLinkItemDto.trackCode) && this.snippetType == classifiedsYoulaLinkItemDto.snippetType && epx.f(this.productId, classifiedsYoulaLinkItemDto.productId) && epx.f(this.textpostAttachment, classifiedsYoulaLinkItemDto.textpostAttachment);
    }

    public final int hashCode() {
        int a2 = shy.a(this.internalId, Integer.hashCode(this.internalOwnerId) * 31, 31);
        List<ClassifiedsYoulaItemPhotoDto> list = this.photos;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.photoTotalCountDescription;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.commercialProfileButton;
        int hashCode3 = (hashCode2 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
        String str2 = this.trackCode;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SnippetTypeDto snippetTypeDto = this.snippetType;
        int hashCode5 = (hashCode4 + (snippetTypeDto == null ? 0 : snippetTypeDto.hashCode())) * 31;
        String str3 = this.productId;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TextlivesTextpostAttachmentDto textlivesTextpostAttachmentDto = this.textpostAttachment;
        return hashCode6 + (textlivesTextpostAttachmentDto != null ? textlivesTextpostAttachmentDto.hashCode() : 0);
    }

    public final String toString() {
        return "ClassifiedsYoulaLinkItemDto(internalOwnerId=" + this.internalOwnerId + ", internalId=" + this.internalId + ", photos=" + this.photos + ", photoTotalCountDescription=" + this.photoTotalCountDescription + ", commercialProfileButton=" + this.commercialProfileButton + ", trackCode=" + this.trackCode + ", snippetType=" + this.snippetType + ", productId=" + this.productId + ", textpostAttachment=" + this.textpostAttachment + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.internalOwnerId);
        parcel.writeInt(this.internalId);
        List<ClassifiedsYoulaItemPhotoDto> list = this.photos;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((ClassifiedsYoulaItemPhotoDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.photoTotalCountDescription);
        BaseLinkButtonDto baseLinkButtonDto = this.commercialProfileButton;
        if (baseLinkButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.trackCode);
        SnippetTypeDto snippetTypeDto = this.snippetType;
        if (snippetTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            snippetTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.productId);
        TextlivesTextpostAttachmentDto textlivesTextpostAttachmentDto = this.textpostAttachment;
        if (textlivesTextpostAttachmentDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textlivesTextpostAttachmentDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ClassifiedsYoulaLinkItemDto(int i, int i2, List list, String str, BaseLinkButtonDto baseLinkButtonDto, String str2, SnippetTypeDto snippetTypeDto, String str3, TextlivesTextpostAttachmentDto textlivesTextpostAttachmentDto, int i3, zcl zclVar) {
        this(i, i2, (i3 & 4) != 0 ? null : list, (i3 & 8) != 0 ? null : str, (i3 & 16) != 0 ? null : baseLinkButtonDto, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? null : snippetTypeDto, (i3 & 128) != 0 ? null : str3, (i3 & 256) != 0 ? null : textlivesTextpostAttachmentDto);
    }
}
