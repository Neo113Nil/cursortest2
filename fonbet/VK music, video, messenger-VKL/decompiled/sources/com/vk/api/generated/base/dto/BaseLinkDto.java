package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.apps.dto.AppsAppMinDto;
import com.vk.api.generated.articles.dto.ArticlesArticleDto;
import com.vk.api.generated.classifieds.dto.ClassifiedsYoulaLinkItemDto;
import com.vk.api.generated.link.dto.LinkSellerProductPropertiesDto;
import com.vk.api.generated.link.dto.LinkTargetObjectDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.snippets.dto.SnippetsAmpDto;
import com.vk.api.generated.stickers.dto.StickersPackLinkItemDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.vmoji.dto.VmojiAvatarLinkItemDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BaseLinkDto.kt */
/* loaded from: classes14.dex */
public final class BaseLinkDto implements Parcelable {
    public static final Parcelable.Creator<BaseLinkDto> CREATOR = new a();

    @pmi0("amp")
    private final SnippetsAmpDto amp;

    @pmi0("application")
    private final BaseLinkApplicationDto application;

    @pmi0("away_params")
    private final Object awayParams;

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("button_action")
    private final String buttonAction;

    @pmi0("button_away_params")
    private final Object buttonAwayParams;

    @pmi0("button_icon")
    private final ButtonIconDto buttonIcon;

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("caption")
    private final String caption;

    @pmi0("chat")
    private final BaseLinkChatDto chat;

    @pmi0("classified_youla")
    private final ClassifiedsYoulaLinkItemDto classifiedYoula;

    @pmi0("description")
    private final String description;

    @pmi0("form_id")
    private final Integer formId;

    @pmi0("id")
    private final String id;

    @pmi0("image_big")
    private final String imageBig;

    @pmi0("image_src")
    private final String imageSrc;

    @pmi0("is_external")
    private final Boolean isExternal;

    @pmi0("is_favorite")
    private final Boolean isFavorite;

    @pmi0("mini_app")
    private final AppsAppMinDto miniApp;

    @pmi0("modal_page")
    private final BaseLinkButtonActionModalPageDto modalPage;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("preview_article")
    private final ArticlesArticleDto previewArticle;

    @pmi0("preview_page")
    private final String previewPage;

    @pmi0("preview_url")
    private final String previewUrl;

    @pmi0("product")
    private final BaseLinkProductDto product;

    @pmi0(CampaignEx.JSON_KEY_STAR)
    private final BaseLinkRatingDto rating;

    @pmi0("ref")
    private final String ref;

    @pmi0("seller_product")
    private final LinkSellerProductPropertiesDto sellerProduct;

    @pmi0("stickers_pack")
    private final StickersPackLinkItemDto stickersPack;

    @pmi0("target")
    private final BaseOwnerButtonActionTargetDto target;

    @pmi0("target_object")
    private final LinkTargetObjectDto targetObject;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    @pmi0("video")
    private final VideoVideoFullDto video;

    @pmi0("vmoji_avatar")
    private final VmojiAvatarLinkItemDto vmojiAvatar;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BaseLinkDto.kt */
    public static final class ButtonIconDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ButtonIconDto[] $VALUES;
        public static final Parcelable.Creator<ButtonIconDto> CREATOR;

        @pmi0("services")
        public static final ButtonIconDto SERVICES;
        private final String value;

        /* compiled from: BaseLinkDto.kt */
        public static final class a implements Parcelable.Creator<ButtonIconDto> {
            @Override // android.os.Parcelable.Creator
            public final ButtonIconDto createFromParcel(Parcel parcel) {
                return ButtonIconDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ButtonIconDto[] newArray(int i) {
                return new ButtonIconDto[i];
            }
        }

        static {
            ButtonIconDto buttonIconDto = new ButtonIconDto("SERVICES", 0, "services");
            SERVICES = buttonIconDto;
            ButtonIconDto[] buttonIconDtoArr = {buttonIconDto};
            $VALUES = buttonIconDtoArr;
            $ENTRIES = new asp(buttonIconDtoArr);
            CREATOR = new a();
        }

        private ButtonIconDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ButtonIconDto valueOf(String str) {
            return (ButtonIconDto) Enum.valueOf(ButtonIconDto.class, str);
        }

        public static ButtonIconDto[] values() {
            return (ButtonIconDto[]) $VALUES.clone();
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

    /* compiled from: BaseLinkDto.kt */
    public static final class a implements Parcelable.Creator<BaseLinkDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseLinkDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String str;
            BaseLinkRatingDto createFromParcel;
            BaseLinkRatingDto baseLinkRatingDto;
            BaseOwnerButtonActionTargetDto createFromParcel2;
            BaseOwnerButtonActionTargetDto baseOwnerButtonActionTargetDto;
            LinkSellerProductPropertiesDto createFromParcel3;
            LinkSellerProductPropertiesDto linkSellerProductPropertiesDto;
            LinkTargetObjectDto createFromParcel4;
            Boolean valueOf2;
            LinkTargetObjectDto linkTargetObjectDto;
            ArticlesArticleDto createFromParcel5;
            ArticlesArticleDto articlesArticleDto;
            VideoVideoFullDto createFromParcel6;
            VideoVideoFullDto videoVideoFullDto;
            SnippetsAmpDto createFromParcel7;
            Object obj;
            ButtonIconDto createFromParcel8;
            ButtonIconDto buttonIconDto;
            StickersPackLinkItemDto createFromParcel9;
            StickersPackLinkItemDto stickersPackLinkItemDto;
            VmojiAvatarLinkItemDto createFromParcel10;
            VmojiAvatarLinkItemDto vmojiAvatarLinkItemDto;
            BaseLinkButtonActionModalPageDto createFromParcel11;
            String str2;
            AppsAppMinDto createFromParcel12;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            BaseLinkProductDto createFromParcel13 = parcel.readInt() == 0 ? null : BaseLinkProductDto.CREATOR.createFromParcel(parcel);
            BaseLinkApplicationDto createFromParcel14 = parcel.readInt() == 0 ? null : BaseLinkApplicationDto.CREATOR.createFromParcel(parcel);
            BaseLinkButtonDto createFromParcel15 = parcel.readInt() == 0 ? null : BaseLinkButtonDto.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            PhotosPhotoDto createFromParcel16 = parcel.readInt() == 0 ? null : PhotosPhotoDto.CREATOR.createFromParcel(parcel);
            ClassifiedsYoulaLinkItemDto classifiedsYoulaLinkItemDto = null;
            Boolean bool = valueOf;
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            BaseLinkChatDto createFromParcel17 = parcel.readInt() == 0 ? null : BaseLinkChatDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                classifiedsYoulaLinkItemDto = ClassifiedsYoulaLinkItemDto.CREATOR.createFromParcel(parcel);
            }
            ClassifiedsYoulaLinkItemDto classifiedsYoulaLinkItemDto2 = classifiedsYoulaLinkItemDto;
            if (parcel.readInt() == 0) {
                str = readString;
                createFromParcel = null;
            } else {
                str = readString;
                createFromParcel = BaseLinkRatingDto.CREATOR.createFromParcel(parcel);
            }
            BaseLinkRatingDto baseLinkRatingDto2 = createFromParcel;
            String readString8 = parcel.readString();
            if (parcel.readInt() == 0) {
                baseLinkRatingDto = baseLinkRatingDto2;
                createFromParcel2 = null;
            } else {
                baseLinkRatingDto = baseLinkRatingDto2;
                createFromParcel2 = BaseOwnerButtonActionTargetDto.CREATOR.createFromParcel(parcel);
            }
            BaseOwnerButtonActionTargetDto baseOwnerButtonActionTargetDto2 = createFromParcel2;
            if (parcel.readInt() == 0) {
                baseOwnerButtonActionTargetDto = baseOwnerButtonActionTargetDto2;
                createFromParcel3 = null;
            } else {
                baseOwnerButtonActionTargetDto = baseOwnerButtonActionTargetDto2;
                createFromParcel3 = LinkSellerProductPropertiesDto.CREATOR.createFromParcel(parcel);
            }
            LinkSellerProductPropertiesDto linkSellerProductPropertiesDto2 = createFromParcel3;
            if (parcel.readInt() == 0) {
                linkSellerProductPropertiesDto = linkSellerProductPropertiesDto2;
                createFromParcel4 = null;
            } else {
                linkSellerProductPropertiesDto = linkSellerProductPropertiesDto2;
                createFromParcel4 = LinkTargetObjectDto.CREATOR.createFromParcel(parcel);
            }
            LinkTargetObjectDto linkTargetObjectDto2 = createFromParcel4;
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                linkTargetObjectDto = linkTargetObjectDto2;
                createFromParcel5 = null;
            } else {
                linkTargetObjectDto = linkTargetObjectDto2;
                createFromParcel5 = ArticlesArticleDto.CREATOR.createFromParcel(parcel);
            }
            ArticlesArticleDto articlesArticleDto2 = createFromParcel5;
            if (parcel.readInt() == 0) {
                articlesArticleDto = articlesArticleDto2;
                createFromParcel6 = null;
            } else {
                articlesArticleDto = articlesArticleDto2;
                createFromParcel6 = VideoVideoFullDto.CREATOR.createFromParcel(parcel);
            }
            VideoVideoFullDto videoVideoFullDto2 = createFromParcel6;
            if (parcel.readInt() == 0) {
                videoVideoFullDto = videoVideoFullDto2;
                createFromParcel7 = null;
            } else {
                videoVideoFullDto = videoVideoFullDto2;
                createFromParcel7 = SnippetsAmpDto.CREATOR.createFromParcel(parcel);
            }
            SnippetsAmpDto snippetsAmpDto = createFromParcel7;
            Object readValue = parcel.readValue(BaseLinkDto.class.getClassLoader());
            Object readValue2 = parcel.readValue(BaseLinkDto.class.getClassLoader());
            String readString9 = parcel.readString();
            if (parcel.readInt() == 0) {
                obj = readValue2;
                createFromParcel8 = null;
            } else {
                obj = readValue2;
                createFromParcel8 = ButtonIconDto.CREATOR.createFromParcel(parcel);
            }
            ButtonIconDto buttonIconDto2 = createFromParcel8;
            BaseLinkRatingDto baseLinkRatingDto3 = baseLinkRatingDto;
            ArticlesArticleDto articlesArticleDto3 = articlesArticleDto;
            String readString10 = parcel.readString();
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                buttonIconDto = buttonIconDto2;
                createFromParcel9 = null;
            } else {
                buttonIconDto = buttonIconDto2;
                createFromParcel9 = StickersPackLinkItemDto.CREATOR.createFromParcel(parcel);
            }
            StickersPackLinkItemDto stickersPackLinkItemDto2 = createFromParcel9;
            if (parcel.readInt() == 0) {
                stickersPackLinkItemDto = stickersPackLinkItemDto2;
                createFromParcel10 = null;
            } else {
                stickersPackLinkItemDto = stickersPackLinkItemDto2;
                createFromParcel10 = VmojiAvatarLinkItemDto.CREATOR.createFromParcel(parcel);
            }
            VmojiAvatarLinkItemDto vmojiAvatarLinkItemDto2 = createFromParcel10;
            if (parcel.readInt() == 0) {
                vmojiAvatarLinkItemDto = vmojiAvatarLinkItemDto2;
                createFromParcel11 = null;
            } else {
                vmojiAvatarLinkItemDto = vmojiAvatarLinkItemDto2;
                createFromParcel11 = BaseLinkButtonActionModalPageDto.CREATOR.createFromParcel(parcel);
            }
            BaseLinkButtonActionModalPageDto baseLinkButtonActionModalPageDto = createFromParcel11;
            StickersPackLinkItemDto stickersPackLinkItemDto3 = stickersPackLinkItemDto;
            String readString11 = parcel.readString();
            LinkSellerProductPropertiesDto linkSellerProductPropertiesDto3 = linkSellerProductPropertiesDto;
            ButtonIconDto buttonIconDto3 = buttonIconDto;
            String str3 = str;
            LinkTargetObjectDto linkTargetObjectDto3 = linkTargetObjectDto;
            BaseOwnerButtonActionTargetDto baseOwnerButtonActionTargetDto3 = baseOwnerButtonActionTargetDto;
            VideoVideoFullDto videoVideoFullDto3 = videoVideoFullDto;
            Object obj2 = obj;
            Integer num = valueOf3;
            VmojiAvatarLinkItemDto vmojiAvatarLinkItemDto3 = vmojiAvatarLinkItemDto;
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            if (parcel.readInt() == 0) {
                createFromParcel12 = null;
                str2 = str3;
            } else {
                str2 = str3;
                createFromParcel12 = AppsAppMinDto.CREATOR.createFromParcel(parcel);
            }
            return new BaseLinkDto(str2, readString2, createFromParcel13, createFromParcel14, createFromParcel15, readString3, readString4, readString5, bool, createFromParcel16, readString6, readString7, createFromParcel17, classifiedsYoulaLinkItemDto2, baseLinkRatingDto3, readString8, baseOwnerButtonActionTargetDto3, linkSellerProductPropertiesDto3, linkTargetObjectDto3, valueOf2, articlesArticleDto3, videoVideoFullDto3, snippetsAmpDto, readValue, obj2, readString9, buttonIconDto3, readString10, num, stickersPackLinkItemDto3, vmojiAvatarLinkItemDto3, baseLinkButtonActionModalPageDto, readString11, readString12, readString13, createFromParcel12);
        }

        @Override // android.os.Parcelable.Creator
        public final BaseLinkDto[] newArray(int i) {
            return new BaseLinkDto[i];
        }
    }

    public BaseLinkDto(String str, String str2, BaseLinkProductDto baseLinkProductDto, BaseLinkApplicationDto baseLinkApplicationDto, BaseLinkButtonDto baseLinkButtonDto, String str3, String str4, String str5, Boolean bool, PhotosPhotoDto photosPhotoDto, String str6, String str7, BaseLinkChatDto baseLinkChatDto, ClassifiedsYoulaLinkItemDto classifiedsYoulaLinkItemDto, BaseLinkRatingDto baseLinkRatingDto, String str8, BaseOwnerButtonActionTargetDto baseOwnerButtonActionTargetDto, LinkSellerProductPropertiesDto linkSellerProductPropertiesDto, LinkTargetObjectDto linkTargetObjectDto, Boolean bool2, ArticlesArticleDto articlesArticleDto, VideoVideoFullDto videoVideoFullDto, SnippetsAmpDto snippetsAmpDto, Object obj, Object obj2, String str9, ButtonIconDto buttonIconDto, String str10, Integer num, StickersPackLinkItemDto stickersPackLinkItemDto, VmojiAvatarLinkItemDto vmojiAvatarLinkItemDto, BaseLinkButtonActionModalPageDto baseLinkButtonActionModalPageDto, String str11, String str12, String str13, AppsAppMinDto appsAppMinDto) {
        this.url = str;
        this.text = str2;
        this.product = baseLinkProductDto;
        this.application = baseLinkApplicationDto;
        this.button = baseLinkButtonDto;
        this.caption = str3;
        this.description = str4;
        this.id = str5;
        this.isFavorite = bool;
        this.photo = photosPhotoDto;
        this.previewPage = str6;
        this.previewUrl = str7;
        this.chat = baseLinkChatDto;
        this.classifiedYoula = classifiedsYoulaLinkItemDto;
        this.rating = baseLinkRatingDto;
        this.title = str8;
        this.target = baseOwnerButtonActionTargetDto;
        this.sellerProduct = linkSellerProductPropertiesDto;
        this.targetObject = linkTargetObjectDto;
        this.isExternal = bool2;
        this.previewArticle = articlesArticleDto;
        this.video = videoVideoFullDto;
        this.amp = snippetsAmpDto;
        this.awayParams = obj;
        this.buttonAwayParams = obj2;
        this.buttonText = str9;
        this.buttonIcon = buttonIconDto;
        this.buttonAction = str10;
        this.formId = num;
        this.stickersPack = stickersPackLinkItemDto;
        this.vmojiAvatar = vmojiAvatarLinkItemDto;
        this.modalPage = baseLinkButtonActionModalPageDto;
        this.imageBig = str11;
        this.imageSrc = str12;
        this.ref = str13;
        this.miniApp = appsAppMinDto;
    }

    public final VmojiAvatarLinkItemDto B() {
        return this.vmojiAvatar;
    }

    public final Boolean C() {
        return this.isFavorite;
    }

    public final SnippetsAmpDto d() {
        return this.amp;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseLinkButtonDto e() {
        return this.button;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinkDto)) {
            return false;
        }
        BaseLinkDto baseLinkDto = (BaseLinkDto) obj;
        return epx.f(this.url, baseLinkDto.url) && epx.f(this.text, baseLinkDto.text) && epx.f(this.product, baseLinkDto.product) && epx.f(this.application, baseLinkDto.application) && epx.f(this.button, baseLinkDto.button) && epx.f(this.caption, baseLinkDto.caption) && epx.f(this.description, baseLinkDto.description) && epx.f(this.id, baseLinkDto.id) && epx.f(this.isFavorite, baseLinkDto.isFavorite) && epx.f(this.photo, baseLinkDto.photo) && epx.f(this.previewPage, baseLinkDto.previewPage) && epx.f(this.previewUrl, baseLinkDto.previewUrl) && epx.f(this.chat, baseLinkDto.chat) && epx.f(this.classifiedYoula, baseLinkDto.classifiedYoula) && epx.f(this.rating, baseLinkDto.rating) && epx.f(this.title, baseLinkDto.title) && this.target == baseLinkDto.target && epx.f(this.sellerProduct, baseLinkDto.sellerProduct) && epx.f(this.targetObject, baseLinkDto.targetObject) && epx.f(this.isExternal, baseLinkDto.isExternal) && epx.f(this.previewArticle, baseLinkDto.previewArticle) && epx.f(this.video, baseLinkDto.video) && epx.f(this.amp, baseLinkDto.amp) && epx.f(this.awayParams, baseLinkDto.awayParams) && epx.f(this.buttonAwayParams, baseLinkDto.buttonAwayParams) && epx.f(this.buttonText, baseLinkDto.buttonText) && this.buttonIcon == baseLinkDto.buttonIcon && epx.f(this.buttonAction, baseLinkDto.buttonAction) && epx.f(this.formId, baseLinkDto.formId) && epx.f(this.stickersPack, baseLinkDto.stickersPack) && epx.f(this.vmojiAvatar, baseLinkDto.vmojiAvatar) && epx.f(this.modalPage, baseLinkDto.modalPage) && epx.f(this.imageBig, baseLinkDto.imageBig) && epx.f(this.imageSrc, baseLinkDto.imageSrc) && epx.f(this.ref, baseLinkDto.ref) && epx.f(this.miniApp, baseLinkDto.miniApp);
    }

    public final String f() {
        return this.caption;
    }

    public final ClassifiedsYoulaLinkItemDto g() {
        return this.classifiedYoula;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BaseLinkProductDto baseLinkProductDto = this.product;
        int hashCode3 = (hashCode2 + (baseLinkProductDto == null ? 0 : baseLinkProductDto.hashCode())) * 31;
        BaseLinkApplicationDto baseLinkApplicationDto = this.application;
        int hashCode4 = (hashCode3 + (baseLinkApplicationDto == null ? 0 : baseLinkApplicationDto.hashCode())) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        int hashCode5 = (hashCode4 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
        String str2 = this.caption;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.id;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isFavorite;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode10 = (hashCode9 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        String str5 = this.previewPage;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.previewUrl;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BaseLinkChatDto baseLinkChatDto = this.chat;
        int hashCode13 = (hashCode12 + (baseLinkChatDto == null ? 0 : baseLinkChatDto.hashCode())) * 31;
        ClassifiedsYoulaLinkItemDto classifiedsYoulaLinkItemDto = this.classifiedYoula;
        int hashCode14 = (hashCode13 + (classifiedsYoulaLinkItemDto == null ? 0 : classifiedsYoulaLinkItemDto.hashCode())) * 31;
        BaseLinkRatingDto baseLinkRatingDto = this.rating;
        int hashCode15 = (hashCode14 + (baseLinkRatingDto == null ? 0 : baseLinkRatingDto.hashCode())) * 31;
        String str7 = this.title;
        int hashCode16 = (hashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BaseOwnerButtonActionTargetDto baseOwnerButtonActionTargetDto = this.target;
        int hashCode17 = (hashCode16 + (baseOwnerButtonActionTargetDto == null ? 0 : baseOwnerButtonActionTargetDto.hashCode())) * 31;
        LinkSellerProductPropertiesDto linkSellerProductPropertiesDto = this.sellerProduct;
        int hashCode18 = (hashCode17 + (linkSellerProductPropertiesDto == null ? 0 : linkSellerProductPropertiesDto.hashCode())) * 31;
        LinkTargetObjectDto linkTargetObjectDto = this.targetObject;
        int hashCode19 = (hashCode18 + (linkTargetObjectDto == null ? 0 : linkTargetObjectDto.hashCode())) * 31;
        Boolean bool2 = this.isExternal;
        int hashCode20 = (hashCode19 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ArticlesArticleDto articlesArticleDto = this.previewArticle;
        int hashCode21 = (hashCode20 + (articlesArticleDto == null ? 0 : articlesArticleDto.hashCode())) * 31;
        VideoVideoFullDto videoVideoFullDto = this.video;
        int hashCode22 = (hashCode21 + (videoVideoFullDto == null ? 0 : videoVideoFullDto.hashCode())) * 31;
        SnippetsAmpDto snippetsAmpDto = this.amp;
        int hashCode23 = (hashCode22 + (snippetsAmpDto == null ? 0 : snippetsAmpDto.hashCode())) * 31;
        Object obj = this.awayParams;
        int hashCode24 = (hashCode23 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.buttonAwayParams;
        int hashCode25 = (hashCode24 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str8 = this.buttonText;
        int hashCode26 = (hashCode25 + (str8 == null ? 0 : str8.hashCode())) * 31;
        ButtonIconDto buttonIconDto = this.buttonIcon;
        int hashCode27 = (hashCode26 + (buttonIconDto == null ? 0 : buttonIconDto.hashCode())) * 31;
        String str9 = this.buttonAction;
        int hashCode28 = (hashCode27 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num = this.formId;
        int hashCode29 = (hashCode28 + (num == null ? 0 : num.hashCode())) * 31;
        StickersPackLinkItemDto stickersPackLinkItemDto = this.stickersPack;
        int hashCode30 = (hashCode29 + (stickersPackLinkItemDto == null ? 0 : stickersPackLinkItemDto.hashCode())) * 31;
        VmojiAvatarLinkItemDto vmojiAvatarLinkItemDto = this.vmojiAvatar;
        int hashCode31 = (hashCode30 + (vmojiAvatarLinkItemDto == null ? 0 : vmojiAvatarLinkItemDto.hashCode())) * 31;
        BaseLinkButtonActionModalPageDto baseLinkButtonActionModalPageDto = this.modalPage;
        int hashCode32 = (hashCode31 + (baseLinkButtonActionModalPageDto == null ? 0 : baseLinkButtonActionModalPageDto.hashCode())) * 31;
        String str10 = this.imageBig;
        int hashCode33 = (hashCode32 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.imageSrc;
        int hashCode34 = (hashCode33 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.ref;
        int hashCode35 = (hashCode34 + (str12 == null ? 0 : str12.hashCode())) * 31;
        AppsAppMinDto appsAppMinDto = this.miniApp;
        return hashCode35 + (appsAppMinDto != null ? appsAppMinDto.hashCode() : 0);
    }

    public final PhotosPhotoDto i() {
        return this.photo;
    }

    public final ArticlesArticleDto j() {
        return this.previewArticle;
    }

    public final String k() {
        return this.previewPage;
    }

    public final BaseLinkProductDto l() {
        return this.product;
    }

    public final BaseLinkRatingDto n() {
        return this.rating;
    }

    public final StickersPackLinkItemDto o() {
        return this.stickersPack;
    }

    public final BaseOwnerButtonActionTargetDto p() {
        return this.target;
    }

    public final String toString() {
        return "BaseLinkDto(url=" + this.url + ", text=" + this.text + ", product=" + this.product + ", application=" + this.application + ", button=" + this.button + ", caption=" + this.caption + ", description=" + this.description + ", id=" + this.id + ", isFavorite=" + this.isFavorite + ", photo=" + this.photo + ", previewPage=" + this.previewPage + ", previewUrl=" + this.previewUrl + ", chat=" + this.chat + ", classifiedYoula=" + this.classifiedYoula + ", rating=" + this.rating + ", title=" + this.title + ", target=" + this.target + ", sellerProduct=" + this.sellerProduct + ", targetObject=" + this.targetObject + ", isExternal=" + this.isExternal + ", previewArticle=" + this.previewArticle + ", video=" + this.video + ", amp=" + this.amp + ", awayParams=" + this.awayParams + ", buttonAwayParams=" + this.buttonAwayParams + ", buttonText=" + this.buttonText + ", buttonIcon=" + this.buttonIcon + ", buttonAction=" + this.buttonAction + ", formId=" + this.formId + ", stickersPack=" + this.stickersPack + ", vmojiAvatar=" + this.vmojiAvatar + ", modalPage=" + this.modalPage + ", imageBig=" + this.imageBig + ", imageSrc=" + this.imageSrc + ", ref=" + this.ref + ", miniApp=" + this.miniApp + ')';
    }

    public final VideoVideoFullDto u() {
        return this.video;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeString(this.text);
        BaseLinkProductDto baseLinkProductDto = this.product;
        if (baseLinkProductDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkProductDto.writeToParcel(parcel, i);
        }
        BaseLinkApplicationDto baseLinkApplicationDto = this.application;
        if (baseLinkApplicationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkApplicationDto.writeToParcel(parcel, i);
        }
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        if (baseLinkButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.caption);
        parcel.writeString(this.description);
        parcel.writeString(this.id);
        Boolean bool = this.isFavorite;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        PhotosPhotoDto photosPhotoDto = this.photo;
        if (photosPhotoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photosPhotoDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.previewPage);
        parcel.writeString(this.previewUrl);
        BaseLinkChatDto baseLinkChatDto = this.chat;
        if (baseLinkChatDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkChatDto.writeToParcel(parcel, i);
        }
        ClassifiedsYoulaLinkItemDto classifiedsYoulaLinkItemDto = this.classifiedYoula;
        if (classifiedsYoulaLinkItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            classifiedsYoulaLinkItemDto.writeToParcel(parcel, i);
        }
        BaseLinkRatingDto baseLinkRatingDto = this.rating;
        if (baseLinkRatingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkRatingDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        BaseOwnerButtonActionTargetDto baseOwnerButtonActionTargetDto = this.target;
        if (baseOwnerButtonActionTargetDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseOwnerButtonActionTargetDto.writeToParcel(parcel, i);
        }
        LinkSellerProductPropertiesDto linkSellerProductPropertiesDto = this.sellerProduct;
        if (linkSellerProductPropertiesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkSellerProductPropertiesDto.writeToParcel(parcel, i);
        }
        LinkTargetObjectDto linkTargetObjectDto = this.targetObject;
        if (linkTargetObjectDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkTargetObjectDto.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.isExternal;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        ArticlesArticleDto articlesArticleDto = this.previewArticle;
        if (articlesArticleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            articlesArticleDto.writeToParcel(parcel, i);
        }
        VideoVideoFullDto videoVideoFullDto = this.video;
        if (videoVideoFullDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoVideoFullDto.writeToParcel(parcel, i);
        }
        SnippetsAmpDto snippetsAmpDto = this.amp;
        if (snippetsAmpDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            snippetsAmpDto.writeToParcel(parcel, i);
        }
        parcel.writeValue(this.awayParams);
        parcel.writeValue(this.buttonAwayParams);
        parcel.writeString(this.buttonText);
        ButtonIconDto buttonIconDto = this.buttonIcon;
        if (buttonIconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonIconDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.buttonAction);
        Integer num = this.formId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        StickersPackLinkItemDto stickersPackLinkItemDto = this.stickersPack;
        if (stickersPackLinkItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersPackLinkItemDto.writeToParcel(parcel, i);
        }
        VmojiAvatarLinkItemDto vmojiAvatarLinkItemDto = this.vmojiAvatar;
        if (vmojiAvatarLinkItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vmojiAvatarLinkItemDto.writeToParcel(parcel, i);
        }
        BaseLinkButtonActionModalPageDto baseLinkButtonActionModalPageDto = this.modalPage;
        if (baseLinkButtonActionModalPageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonActionModalPageDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.imageBig);
        parcel.writeString(this.imageSrc);
        parcel.writeString(this.ref);
        AppsAppMinDto appsAppMinDto = this.miniApp;
        if (appsAppMinDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAppMinDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ BaseLinkDto(String str, String str2, BaseLinkProductDto baseLinkProductDto, BaseLinkApplicationDto baseLinkApplicationDto, BaseLinkButtonDto baseLinkButtonDto, String str3, String str4, String str5, Boolean bool, PhotosPhotoDto photosPhotoDto, String str6, String str7, BaseLinkChatDto baseLinkChatDto, ClassifiedsYoulaLinkItemDto classifiedsYoulaLinkItemDto, BaseLinkRatingDto baseLinkRatingDto, String str8, BaseOwnerButtonActionTargetDto baseOwnerButtonActionTargetDto, LinkSellerProductPropertiesDto linkSellerProductPropertiesDto, LinkTargetObjectDto linkTargetObjectDto, Boolean bool2, ArticlesArticleDto articlesArticleDto, VideoVideoFullDto videoVideoFullDto, SnippetsAmpDto snippetsAmpDto, Object obj, Object obj2, String str9, ButtonIconDto buttonIconDto, String str10, Integer num, StickersPackLinkItemDto stickersPackLinkItemDto, VmojiAvatarLinkItemDto vmojiAvatarLinkItemDto, BaseLinkButtonActionModalPageDto baseLinkButtonActionModalPageDto, String str11, String str12, String str13, AppsAppMinDto appsAppMinDto, int i, int i2, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : baseLinkProductDto, (i & 8) != 0 ? null : baseLinkApplicationDto, (i & 16) != 0 ? null : baseLinkButtonDto, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : photosPhotoDto, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : baseLinkChatDto, (i & 8192) != 0 ? null : classifiedsYoulaLinkItemDto, (i & 16384) != 0 ? null : baseLinkRatingDto, (i & 32768) != 0 ? null : str8, (i & 65536) != 0 ? null : baseOwnerButtonActionTargetDto, (i & 131072) != 0 ? null : linkSellerProductPropertiesDto, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : linkTargetObjectDto, (i & 524288) != 0 ? null : bool2, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : articlesArticleDto, (i & 2097152) != 0 ? null : videoVideoFullDto, (i & 4194304) != 0 ? null : snippetsAmpDto, (i & 8388608) != 0 ? null : obj, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : obj2, (i & 33554432) != 0 ? null : str9, (i & 67108864) != 0 ? null : buttonIconDto, (i & 134217728) != 0 ? null : str10, (i & 268435456) != 0 ? null : num, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : stickersPackLinkItemDto, (i & 1073741824) != 0 ? null : vmojiAvatarLinkItemDto, (i & Integer.MIN_VALUE) != 0 ? null : baseLinkButtonActionModalPageDto, (i2 & 1) != 0 ? null : str11, (i2 & 2) != 0 ? null : str12, (i2 & 4) != 0 ? null : str13, (i2 & 8) != 0 ? null : appsAppMinDto);
    }
}
