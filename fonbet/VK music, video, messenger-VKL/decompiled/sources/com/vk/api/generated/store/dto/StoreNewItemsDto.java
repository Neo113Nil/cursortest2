package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.stickers.dto.StickersStoriesFreeStickersPromoConfigDto;
import com.vk.api.generated.vmoji.dto.VmojiPromotionDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: StoreNewItemsDto.kt */
/* loaded from: classes15.dex */
public final class StoreNewItemsDto implements Parcelable {
    public static final Parcelable.Creator<StoreNewItemsDto> CREATOR = new a();

    @pmi0("favorite_stickers_limit")
    private final Integer favoriteStickersLimit;

    @pmi0("favorite_stickers_version_hash")
    private final String favoriteStickersVersionHash;

    @pmi0("global_promotion")
    private final BaseBoolIntDto globalPromotion;

    @pmi0("image_configs_version_hash")
    private final String imageConfigsVersionHash;

    @pmi0("sticker_packs_chunk_size_limit")
    private final Integer stickerPacksChunkSizeLimit;

    @pmi0("sticker_packs_version_hashes")
    private final List<StoreStickerPackVersionHashDto> stickerPacksVersionHashes;

    @pmi0("stickers_keyboard_recommendation_load")
    private final Boolean stickersKeyboardRecommendationLoad;

    @pmi0("stickers_version_hash")
    private final String stickersVersionHash;

    @pmi0("store_new_items")
    private final Integer storeNewItems;

    @pmi0("stories_free_stickers_promo")
    private final StickersStoriesFreeStickersPromoConfigDto storiesFreeStickersPromo;

    @pmi0("suggestions_version_hash")
    private final String suggestionsVersionHash;

    @pmi0("version")
    private final int version;

    @pmi0("vmoji_promotion")
    private final VmojiPromotionDto vmojiPromotion;

    /* compiled from: StoreNewItemsDto.kt */
    public static final class a implements Parcelable.Creator<StoreNewItemsDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final StoreNewItemsDto createFromParcel(Parcel parcel) {
            Integer valueOf;
            ArrayList arrayList;
            ArrayList arrayList2;
            Object obj;
            int readInt = parcel.readInt();
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(StoreNewItemsDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
                arrayList = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                arrayList = null;
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = en.a(StoreStickerPackVersionHashDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            Integer valueOf2 = parcel.readInt() == 0 ? arrayList : Integer.valueOf(parcel.readInt());
            boolean z = true;
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Object obj2 = arrayList;
            ArrayList arrayList3 = arrayList2;
            String readString4 = parcel.readString();
            Object valueOf3 = parcel.readInt() == 0 ? obj2 : Integer.valueOf(parcel.readInt());
            VmojiPromotionDto vmojiPromotionDto = (VmojiPromotionDto) (parcel.readInt() == 0 ? obj2 : VmojiPromotionDto.CREATOR.createFromParcel(parcel));
            StickersStoriesFreeStickersPromoConfigDto stickersStoriesFreeStickersPromoConfigDto = (StickersStoriesFreeStickersPromoConfigDto) (parcel.readInt() == 0 ? obj2 : StickersStoriesFreeStickersPromoConfigDto.CREATOR.createFromParcel(parcel));
            if (parcel.readInt() == 0) {
                obj = obj2;
            } else {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                obj = Boolean.valueOf(z);
            }
            return new StoreNewItemsDto(readInt, baseBoolIntDto, valueOf, readString, arrayList3, valueOf2, readString2, readString3, readString4, valueOf3, vmojiPromotionDto, stickersStoriesFreeStickersPromoConfigDto, obj);
        }

        @Override // android.os.Parcelable.Creator
        public final StoreNewItemsDto[] newArray(int i) {
            return new StoreNewItemsDto[i];
        }
    }

    public StoreNewItemsDto(int i, BaseBoolIntDto baseBoolIntDto, Integer num, String str, List<StoreStickerPackVersionHashDto> list, Integer num2, String str2, String str3, String str4, Integer num3, VmojiPromotionDto vmojiPromotionDto, StickersStoriesFreeStickersPromoConfigDto stickersStoriesFreeStickersPromoConfigDto, Boolean bool) {
        this.version = i;
        this.globalPromotion = baseBoolIntDto;
        this.storeNewItems = num;
        this.stickersVersionHash = str;
        this.stickerPacksVersionHashes = list;
        this.stickerPacksChunkSizeLimit = num2;
        this.suggestionsVersionHash = str2;
        this.favoriteStickersVersionHash = str3;
        this.imageConfigsVersionHash = str4;
        this.favoriteStickersLimit = num3;
        this.vmojiPromotion = vmojiPromotionDto;
        this.storiesFreeStickersPromo = stickersStoriesFreeStickersPromoConfigDto;
        this.stickersKeyboardRecommendationLoad = bool;
    }

    public final String d() {
        return this.favoriteStickersVersionHash;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseBoolIntDto e() {
        return this.globalPromotion;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreNewItemsDto)) {
            return false;
        }
        StoreNewItemsDto storeNewItemsDto = (StoreNewItemsDto) obj;
        return this.version == storeNewItemsDto.version && this.globalPromotion == storeNewItemsDto.globalPromotion && epx.f(this.storeNewItems, storeNewItemsDto.storeNewItems) && epx.f(this.stickersVersionHash, storeNewItemsDto.stickersVersionHash) && epx.f(this.stickerPacksVersionHashes, storeNewItemsDto.stickerPacksVersionHashes) && epx.f(this.stickerPacksChunkSizeLimit, storeNewItemsDto.stickerPacksChunkSizeLimit) && epx.f(this.suggestionsVersionHash, storeNewItemsDto.suggestionsVersionHash) && epx.f(this.favoriteStickersVersionHash, storeNewItemsDto.favoriteStickersVersionHash) && epx.f(this.imageConfigsVersionHash, storeNewItemsDto.imageConfigsVersionHash) && epx.f(this.favoriteStickersLimit, storeNewItemsDto.favoriteStickersLimit) && epx.f(this.vmojiPromotion, storeNewItemsDto.vmojiPromotion) && epx.f(this.storiesFreeStickersPromo, storeNewItemsDto.storiesFreeStickersPromo) && epx.f(this.stickersKeyboardRecommendationLoad, storeNewItemsDto.stickersKeyboardRecommendationLoad);
    }

    public final String f() {
        return this.imageConfigsVersionHash;
    }

    public final Integer g() {
        return this.stickerPacksChunkSizeLimit;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.version) * 31;
        BaseBoolIntDto baseBoolIntDto = this.globalPromotion;
        int hashCode2 = (hashCode + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        Integer num = this.storeNewItems;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.stickersVersionHash;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<StoreStickerPackVersionHashDto> list = this.stickerPacksVersionHashes;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.stickerPacksChunkSizeLimit;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.suggestionsVersionHash;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.favoriteStickersVersionHash;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imageConfigsVersionHash;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.favoriteStickersLimit;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        VmojiPromotionDto vmojiPromotionDto = this.vmojiPromotion;
        int hashCode11 = (hashCode10 + (vmojiPromotionDto == null ? 0 : vmojiPromotionDto.hashCode())) * 31;
        StickersStoriesFreeStickersPromoConfigDto stickersStoriesFreeStickersPromoConfigDto = this.storiesFreeStickersPromo;
        int hashCode12 = (hashCode11 + (stickersStoriesFreeStickersPromoConfigDto == null ? 0 : stickersStoriesFreeStickersPromoConfigDto.hashCode())) * 31;
        Boolean bool = this.stickersKeyboardRecommendationLoad;
        return hashCode12 + (bool != null ? bool.hashCode() : 0);
    }

    public final List<StoreStickerPackVersionHashDto> i() {
        return this.stickerPacksVersionHashes;
    }

    public final Boolean j() {
        return this.stickersKeyboardRecommendationLoad;
    }

    public final String k() {
        return this.stickersVersionHash;
    }

    public final Integer l() {
        return this.storeNewItems;
    }

    public final StickersStoriesFreeStickersPromoConfigDto n() {
        return this.storiesFreeStickersPromo;
    }

    public final String o() {
        return this.suggestionsVersionHash;
    }

    public final int p() {
        return this.version;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreNewItemsDto(version=");
        sb.append(this.version);
        sb.append(", globalPromotion=");
        sb.append(this.globalPromotion);
        sb.append(", storeNewItems=");
        sb.append(this.storeNewItems);
        sb.append(", stickersVersionHash=");
        sb.append(this.stickersVersionHash);
        sb.append(", stickerPacksVersionHashes=");
        sb.append(this.stickerPacksVersionHashes);
        sb.append(", stickerPacksChunkSizeLimit=");
        sb.append(this.stickerPacksChunkSizeLimit);
        sb.append(", suggestionsVersionHash=");
        sb.append(this.suggestionsVersionHash);
        sb.append(", favoriteStickersVersionHash=");
        sb.append(this.favoriteStickersVersionHash);
        sb.append(", imageConfigsVersionHash=");
        sb.append(this.imageConfigsVersionHash);
        sb.append(", favoriteStickersLimit=");
        sb.append(this.favoriteStickersLimit);
        sb.append(", vmojiPromotion=");
        sb.append(this.vmojiPromotion);
        sb.append(", storiesFreeStickersPromo=");
        sb.append(this.storiesFreeStickersPromo);
        sb.append(", stickersKeyboardRecommendationLoad=");
        return tn.a(sb, this.stickersKeyboardRecommendationLoad, ')');
    }

    public final VmojiPromotionDto u() {
        return this.vmojiPromotion;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.version);
        parcel.writeParcelable(this.globalPromotion, i);
        Integer num = this.storeNewItems;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.stickersVersionHash);
        List<StoreStickerPackVersionHashDto> list = this.stickerPacksVersionHashes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((StoreStickerPackVersionHashDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Integer num2 = this.stickerPacksChunkSizeLimit;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.suggestionsVersionHash);
        parcel.writeString(this.favoriteStickersVersionHash);
        parcel.writeString(this.imageConfigsVersionHash);
        Integer num3 = this.favoriteStickersLimit;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        VmojiPromotionDto vmojiPromotionDto = this.vmojiPromotion;
        if (vmojiPromotionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vmojiPromotionDto.writeToParcel(parcel, i);
        }
        StickersStoriesFreeStickersPromoConfigDto stickersStoriesFreeStickersPromoConfigDto = this.storiesFreeStickersPromo;
        if (stickersStoriesFreeStickersPromoConfigDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersStoriesFreeStickersPromoConfigDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.stickersKeyboardRecommendationLoad;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ StoreNewItemsDto(int i, BaseBoolIntDto baseBoolIntDto, Integer num, String str, List list, Integer num2, String str2, String str3, String str4, Integer num3, VmojiPromotionDto vmojiPromotionDto, StickersStoriesFreeStickersPromoConfigDto stickersStoriesFreeStickersPromoConfigDto, Boolean bool, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : baseBoolIntDto, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? null : str4, (i2 & 512) != 0 ? null : num3, (i2 & 1024) != 0 ? null : vmojiPromotionDto, (i2 & 2048) != 0 ? null : stickersStoriesFreeStickersPromoConfigDto, (i2 & 4096) != 0 ? null : bool);
    }
}
