package com.vk.api.generated.nft.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Ad;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NftGetListItemDto.kt */
/* loaded from: classes15.dex */
public final class NftGetListItemDto implements Parcelable {
    public static final Parcelable.Creator<NftGetListItemDto> CREATOR = new a();

    @pmi0("attachment_presentation_mode")
    private final AttachmentPresentationModeDto attachmentPresentationMode;

    @pmi0("author")
    private final String author;

    @pmi0("blockchain_name")
    private final String blockchainName;

    @pmi0("contract_id")
    private final String contractId;

    @pmi0("description")
    private final String description;

    @pmi0("is_published")
    private final Boolean isPublished;

    @pmi0("lock_set_avatar")
    private final Boolean lockSetAvatar;

    @pmi0("metadata")
    private final Object metadata;

    @pmi0("nft_app_logo")
    private final String nftAppLogo;

    @pmi0("nft_collection")
    private final NftCollectionShortDto nftCollection;

    @pmi0("nft_collection_outer_link")
    private final String nftCollectionOuterLink;

    @pmi0("nft_collection_outer_title")
    private final String nftCollectionOuterTitle;

    @pmi0("nft_owner_avatar_100")
    private final String nftOwnerAvatar100;

    @pmi0("nft_owner_avatar_is_nft")
    private final Boolean nftOwnerAvatarIsNft;

    @pmi0("nft_owner_href")
    private final String nftOwnerHref;

    @pmi0("nft_owner_name")
    private final String nftOwnerName;

    @pmi0("nft_preview")
    private final String nftPreview;

    @pmi0("nft_public_id")
    private final String nftPublicId;

    @pmi0("nft_token_outer_link")
    private final String nftTokenOuterLink;

    @pmi0("nft_token_scanner_link")
    private final String nftTokenScannerLink;

    @pmi0("origins")
    private final List<NftOriginMetadataDto> origins;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("photo_max_size_data")
    private final NftPhotoMaxSizeDataDto photoMaxSizeData;

    @pmi0("tags")
    private final List<NftItemTagDto> tags;

    @pmi0("title")
    private final String title;

    @pmi0("token_id")
    private final String tokenId;

    @pmi0("wallet_public_id")
    private final String walletPublicId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NftGetListItemDto.kt */
    public static final class AttachmentPresentationModeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AttachmentPresentationModeDto[] $VALUES;
        public static final Parcelable.Creator<AttachmentPresentationModeDto> CREATOR;

        @pmi0(Ad.d)
        public static final AttachmentPresentationModeDto SINGLE;

        @pmi0("standard")
        public static final AttachmentPresentationModeDto STANDARD;
        private final String value;

        /* compiled from: NftGetListItemDto.kt */
        public static final class a implements Parcelable.Creator<AttachmentPresentationModeDto> {
            @Override // android.os.Parcelable.Creator
            public final AttachmentPresentationModeDto createFromParcel(Parcel parcel) {
                return AttachmentPresentationModeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AttachmentPresentationModeDto[] newArray(int i) {
                return new AttachmentPresentationModeDto[i];
            }
        }

        static {
            AttachmentPresentationModeDto attachmentPresentationModeDto = new AttachmentPresentationModeDto("SINGLE", 0, Ad.d);
            SINGLE = attachmentPresentationModeDto;
            AttachmentPresentationModeDto attachmentPresentationModeDto2 = new AttachmentPresentationModeDto("STANDARD", 1, "standard");
            STANDARD = attachmentPresentationModeDto2;
            AttachmentPresentationModeDto[] attachmentPresentationModeDtoArr = {attachmentPresentationModeDto, attachmentPresentationModeDto2};
            $VALUES = attachmentPresentationModeDtoArr;
            $ENTRIES = new asp(attachmentPresentationModeDtoArr);
            CREATOR = new a();
        }

        private AttachmentPresentationModeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static AttachmentPresentationModeDto valueOf(String str) {
            return (AttachmentPresentationModeDto) Enum.valueOf(AttachmentPresentationModeDto.class, str);
        }

        public static AttachmentPresentationModeDto[] values() {
            return (AttachmentPresentationModeDto[]) $VALUES.clone();
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

    /* compiled from: NftGetListItemDto.kt */
    public static final class a implements Parcelable.Creator<NftGetListItemDto> {
        @Override // android.os.Parcelable.Creator
        public final NftGetListItemDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            Boolean bool;
            ArrayList arrayList2;
            ArrayList arrayList3;
            boolean z;
            Boolean bool2;
            Boolean valueOf2;
            Boolean valueOf3;
            UserId userId = (UserId) parcel.readParcelable(NftGetListItemDto.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            PhotosPhotoDto createFromParcel = parcel.readInt() == 0 ? null : PhotosPhotoDto.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            Object readValue = parcel.readValue(NftGetListItemDto.class.getClassLoader());
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString13 = parcel.readString();
            if (parcel.readInt() == 0) {
                bool = valueOf;
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                bool = valueOf;
                int i = 0;
                while (i != readInt) {
                    i = en.a(NftOriginMetadataDto.CREATOR, parcel, arrayList, i, 1);
                    readInt = readInt;
                    userId = userId;
                }
            }
            UserId userId2 = userId;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
                arrayList3 = arrayList;
                bool2 = bool;
                z = true;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(NftItemTagDto.CREATOR, parcel, arrayList4, i2, 1);
                    readInt2 = readInt2;
                    arrayList = arrayList;
                }
                arrayList2 = arrayList4;
                arrayList3 = arrayList;
                z = true;
                bool2 = bool;
            }
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            ArrayList arrayList5 = arrayList3;
            String readString17 = parcel.readString();
            NftCollectionShortDto createFromParcel2 = parcel.readInt() == 0 ? null : NftCollectionShortDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? z : false);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                valueOf3 = Boolean.valueOf(z);
            }
            return new NftGetListItemDto(userId2, readString, readString2, createFromParcel, readString3, readString4, readString5, readString6, readString7, readString8, readValue, readString9, readString10, readString11, readString12, bool2, readString13, arrayList5, arrayList2, readString14, readString15, readString16, readString17, createFromParcel2, valueOf2, valueOf3, parcel.readInt() == 0 ? null : AttachmentPresentationModeDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? NftPhotoMaxSizeDataDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final NftGetListItemDto[] newArray(int i) {
            return new NftGetListItemDto[i];
        }
    }

    public NftGetListItemDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435455, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NftGetListItemDto)) {
            return false;
        }
        NftGetListItemDto nftGetListItemDto = (NftGetListItemDto) obj;
        return epx.f(this.ownerId, nftGetListItemDto.ownerId) && epx.f(this.walletPublicId, nftGetListItemDto.walletPublicId) && epx.f(this.nftPublicId, nftGetListItemDto.nftPublicId) && epx.f(this.photo, nftGetListItemDto.photo) && epx.f(this.title, nftGetListItemDto.title) && epx.f(this.author, nftGetListItemDto.author) && epx.f(this.description, nftGetListItemDto.description) && epx.f(this.blockchainName, nftGetListItemDto.blockchainName) && epx.f(this.contractId, nftGetListItemDto.contractId) && epx.f(this.tokenId, nftGetListItemDto.tokenId) && epx.f(this.metadata, nftGetListItemDto.metadata) && epx.f(this.nftOwnerName, nftGetListItemDto.nftOwnerName) && epx.f(this.nftOwnerAvatar100, nftGetListItemDto.nftOwnerAvatar100) && epx.f(this.nftOwnerHref, nftGetListItemDto.nftOwnerHref) && epx.f(this.nftPreview, nftGetListItemDto.nftPreview) && epx.f(this.nftOwnerAvatarIsNft, nftGetListItemDto.nftOwnerAvatarIsNft) && epx.f(this.nftAppLogo, nftGetListItemDto.nftAppLogo) && epx.f(this.origins, nftGetListItemDto.origins) && epx.f(this.tags, nftGetListItemDto.tags) && epx.f(this.nftCollectionOuterTitle, nftGetListItemDto.nftCollectionOuterTitle) && epx.f(this.nftCollectionOuterLink, nftGetListItemDto.nftCollectionOuterLink) && epx.f(this.nftTokenOuterLink, nftGetListItemDto.nftTokenOuterLink) && epx.f(this.nftTokenScannerLink, nftGetListItemDto.nftTokenScannerLink) && epx.f(this.nftCollection, nftGetListItemDto.nftCollection) && epx.f(this.isPublished, nftGetListItemDto.isPublished) && epx.f(this.lockSetAvatar, nftGetListItemDto.lockSetAvatar) && this.attachmentPresentationMode == nftGetListItemDto.attachmentPresentationMode && epx.f(this.photoMaxSizeData, nftGetListItemDto.photoMaxSizeData);
    }

    public final int hashCode() {
        UserId userId = this.ownerId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        String str = this.walletPublicId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nftPublicId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode4 = (hashCode3 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        String str3 = this.title;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.author;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.blockchainName;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.contractId;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.tokenId;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Object obj = this.metadata;
        int hashCode11 = (hashCode10 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str9 = this.nftOwnerName;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.nftOwnerAvatar100;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.nftOwnerHref;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.nftPreview;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool = this.nftOwnerAvatarIsNft;
        int hashCode16 = (hashCode15 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str13 = this.nftAppLogo;
        int hashCode17 = (hashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        List<NftOriginMetadataDto> list = this.origins;
        int hashCode18 = (hashCode17 + (list == null ? 0 : list.hashCode())) * 31;
        List<NftItemTagDto> list2 = this.tags;
        int hashCode19 = (hashCode18 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str14 = this.nftCollectionOuterTitle;
        int hashCode20 = (hashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.nftCollectionOuterLink;
        int hashCode21 = (hashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.nftTokenOuterLink;
        int hashCode22 = (hashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.nftTokenScannerLink;
        int hashCode23 = (hashCode22 + (str17 == null ? 0 : str17.hashCode())) * 31;
        NftCollectionShortDto nftCollectionShortDto = this.nftCollection;
        int hashCode24 = (hashCode23 + (nftCollectionShortDto == null ? 0 : nftCollectionShortDto.hashCode())) * 31;
        Boolean bool2 = this.isPublished;
        int hashCode25 = (hashCode24 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.lockSetAvatar;
        int hashCode26 = (hashCode25 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        AttachmentPresentationModeDto attachmentPresentationModeDto = this.attachmentPresentationMode;
        int hashCode27 = (hashCode26 + (attachmentPresentationModeDto == null ? 0 : attachmentPresentationModeDto.hashCode())) * 31;
        NftPhotoMaxSizeDataDto nftPhotoMaxSizeDataDto = this.photoMaxSizeData;
        return hashCode27 + (nftPhotoMaxSizeDataDto != null ? nftPhotoMaxSizeDataDto.hashCode() : 0);
    }

    public final String toString() {
        return "NftGetListItemDto(ownerId=" + this.ownerId + ", walletPublicId=" + this.walletPublicId + ", nftPublicId=" + this.nftPublicId + ", photo=" + this.photo + ", title=" + this.title + ", author=" + this.author + ", description=" + this.description + ", blockchainName=" + this.blockchainName + ", contractId=" + this.contractId + ", tokenId=" + this.tokenId + ", metadata=" + this.metadata + ", nftOwnerName=" + this.nftOwnerName + ", nftOwnerAvatar100=" + this.nftOwnerAvatar100 + ", nftOwnerHref=" + this.nftOwnerHref + ", nftPreview=" + this.nftPreview + ", nftOwnerAvatarIsNft=" + this.nftOwnerAvatarIsNft + ", nftAppLogo=" + this.nftAppLogo + ", origins=" + this.origins + ", tags=" + this.tags + ", nftCollectionOuterTitle=" + this.nftCollectionOuterTitle + ", nftCollectionOuterLink=" + this.nftCollectionOuterLink + ", nftTokenOuterLink=" + this.nftTokenOuterLink + ", nftTokenScannerLink=" + this.nftTokenScannerLink + ", nftCollection=" + this.nftCollection + ", isPublished=" + this.isPublished + ", lockSetAvatar=" + this.lockSetAvatar + ", attachmentPresentationMode=" + this.attachmentPresentationMode + ", photoMaxSizeData=" + this.photoMaxSizeData + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.walletPublicId);
        parcel.writeString(this.nftPublicId);
        PhotosPhotoDto photosPhotoDto = this.photo;
        if (photosPhotoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photosPhotoDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.author);
        parcel.writeString(this.description);
        parcel.writeString(this.blockchainName);
        parcel.writeString(this.contractId);
        parcel.writeString(this.tokenId);
        parcel.writeValue(this.metadata);
        parcel.writeString(this.nftOwnerName);
        parcel.writeString(this.nftOwnerAvatar100);
        parcel.writeString(this.nftOwnerHref);
        parcel.writeString(this.nftPreview);
        Boolean bool = this.nftOwnerAvatarIsNft;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.nftAppLogo);
        List<NftOriginMetadataDto> list = this.origins;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((NftOriginMetadataDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<NftItemTagDto> list2 = this.tags;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((NftItemTagDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.nftCollectionOuterTitle);
        parcel.writeString(this.nftCollectionOuterLink);
        parcel.writeString(this.nftTokenOuterLink);
        parcel.writeString(this.nftTokenScannerLink);
        NftCollectionShortDto nftCollectionShortDto = this.nftCollection;
        if (nftCollectionShortDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nftCollectionShortDto.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.isPublished;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.lockSetAvatar;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        AttachmentPresentationModeDto attachmentPresentationModeDto = this.attachmentPresentationMode;
        if (attachmentPresentationModeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            attachmentPresentationModeDto.writeToParcel(parcel, i);
        }
        NftPhotoMaxSizeDataDto nftPhotoMaxSizeDataDto = this.photoMaxSizeData;
        if (nftPhotoMaxSizeDataDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nftPhotoMaxSizeDataDto.writeToParcel(parcel, i);
        }
    }

    public NftGetListItemDto(UserId userId, String str, String str2, PhotosPhotoDto photosPhotoDto, String str3, String str4, String str5, String str6, String str7, String str8, Object obj, String str9, String str10, String str11, String str12, Boolean bool, String str13, List<NftOriginMetadataDto> list, List<NftItemTagDto> list2, String str14, String str15, String str16, String str17, NftCollectionShortDto nftCollectionShortDto, Boolean bool2, Boolean bool3, AttachmentPresentationModeDto attachmentPresentationModeDto, NftPhotoMaxSizeDataDto nftPhotoMaxSizeDataDto) {
        this.ownerId = userId;
        this.walletPublicId = str;
        this.nftPublicId = str2;
        this.photo = photosPhotoDto;
        this.title = str3;
        this.author = str4;
        this.description = str5;
        this.blockchainName = str6;
        this.contractId = str7;
        this.tokenId = str8;
        this.metadata = obj;
        this.nftOwnerName = str9;
        this.nftOwnerAvatar100 = str10;
        this.nftOwnerHref = str11;
        this.nftPreview = str12;
        this.nftOwnerAvatarIsNft = bool;
        this.nftAppLogo = str13;
        this.origins = list;
        this.tags = list2;
        this.nftCollectionOuterTitle = str14;
        this.nftCollectionOuterLink = str15;
        this.nftTokenOuterLink = str16;
        this.nftTokenScannerLink = str17;
        this.nftCollection = nftCollectionShortDto;
        this.isPublished = bool2;
        this.lockSetAvatar = bool3;
        this.attachmentPresentationMode = attachmentPresentationModeDto;
        this.photoMaxSizeData = nftPhotoMaxSizeDataDto;
    }

    public /* synthetic */ NftGetListItemDto(UserId userId, String str, String str2, PhotosPhotoDto photosPhotoDto, String str3, String str4, String str5, String str6, String str7, String str8, Object obj, String str9, String str10, String str11, String str12, Boolean bool, String str13, List list, List list2, String str14, String str15, String str16, String str17, NftCollectionShortDto nftCollectionShortDto, Boolean bool2, Boolean bool3, AttachmentPresentationModeDto attachmentPresentationModeDto, NftPhotoMaxSizeDataDto nftPhotoMaxSizeDataDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : photosPhotoDto, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : obj, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? null : str11, (i & 16384) != 0 ? null : str12, (i & 32768) != 0 ? null : bool, (i & 65536) != 0 ? null : str13, (i & 131072) != 0 ? null : list, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list2, (i & 524288) != 0 ? null : str14, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str15, (i & 2097152) != 0 ? null : str16, (i & 4194304) != 0 ? null : str17, (i & 8388608) != 0 ? null : nftCollectionShortDto, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool2, (i & 33554432) != 0 ? null : bool3, (i & 67108864) != 0 ? null : attachmentPresentationModeDto, (i & 134217728) != 0 ? null : nftPhotoMaxSizeDataDto);
    }
}
