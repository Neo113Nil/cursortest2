package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.apps.dto.AppsAppMinDto;
import com.vk.api.generated.articles.dto.ArticlesArticleDto;
import com.vk.api.generated.base.dto.BaseLinkApplicationDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionModalPageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.base.dto.BaseLinkChatDto;
import com.vk.api.generated.base.dto.BaseLinkRatingDto;
import com.vk.api.generated.base.dto.BaseOwnerButtonActionTargetDto;
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

/* compiled from: MessagesMessageAttachmentLinkDto.kt */
/* loaded from: classes15.dex */
public final class MessagesMessageAttachmentLinkDto implements Parcelable {
    public static final Parcelable.Creator<MessagesMessageAttachmentLinkDto> CREATOR = new a();

    @pmi0("amp")
    private final SnippetsAmpDto amp;

    /* renamed from: android, reason: collision with root package name */
    @pmi0("android")
    private final Integer f76android;

    @pmi0("app_id")
    private final Integer appId;

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

    @pmi0("name")
    private final String name;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("preview_article")
    private final ArticlesArticleDto previewArticle;

    @pmi0("preview_page")
    private final String previewPage;

    @pmi0("preview_url")
    private final String previewUrl;

    @pmi0("product")
    private final MessagesMessageAttachmentLinkProductDto product;

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
    /* compiled from: MessagesMessageAttachmentLinkDto.kt */
    public static final class ButtonIconDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ButtonIconDto[] $VALUES;
        public static final Parcelable.Creator<ButtonIconDto> CREATOR;

        @pmi0("services")
        public static final ButtonIconDto SERVICES;
        private final String value;

        /* compiled from: MessagesMessageAttachmentLinkDto.kt */
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

    /* compiled from: MessagesMessageAttachmentLinkDto.kt */
    public static final class a implements Parcelable.Creator<MessagesMessageAttachmentLinkDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesMessageAttachmentLinkDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Object obj;
            ButtonIconDto createFromParcel;
            String readString = parcel.readString();
            MessagesMessageAttachmentLinkProductDto createFromParcel2 = parcel.readInt() == 0 ? null : MessagesMessageAttachmentLinkProductDto.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BaseLinkApplicationDto baseLinkApplicationDto = (BaseLinkApplicationDto) parcel.readParcelable(MessagesMessageAttachmentLinkDto.class.getClassLoader());
            BaseLinkButtonDto baseLinkButtonDto = (BaseLinkButtonDto) parcel.readParcelable(MessagesMessageAttachmentLinkDto.class.getClassLoader());
            String readString5 = parcel.readString();
            Integer num = valueOf3;
            String readString6 = parcel.readString();
            Integer num2 = valueOf4;
            String readString7 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            PhotosPhotoDto photosPhotoDto = (PhotosPhotoDto) parcel.readParcelable(MessagesMessageAttachmentLinkDto.class.getClassLoader());
            String readString8 = parcel.readString();
            Boolean bool = valueOf;
            String readString9 = parcel.readString();
            BaseLinkChatDto baseLinkChatDto = (BaseLinkChatDto) parcel.readParcelable(MessagesMessageAttachmentLinkDto.class.getClassLoader());
            ClassifiedsYoulaLinkItemDto classifiedsYoulaLinkItemDto = (ClassifiedsYoulaLinkItemDto) parcel.readParcelable(MessagesMessageAttachmentLinkDto.class.getClassLoader());
            BaseLinkRatingDto baseLinkRatingDto = (BaseLinkRatingDto) parcel.readParcelable(MessagesMessageAttachmentLinkDto.class.getClassLoader());
            String readString10 = parcel.readString();
            BaseOwnerButtonActionTargetDto baseOwnerButtonActionTargetDto = (BaseOwnerButtonActionTargetDto) parcel.readParcelable(MessagesMessageAttachmentLinkDto.class.getClassLoader());
            LinkSellerProductPropertiesDto linkSellerProductPropertiesDto = (LinkSellerProductPropertiesDto) parcel.readParcelable(MessagesMessageAttachmentLinkDto.class.getClassLoader());
            LinkTargetObjectDto linkTargetObjectDto = (LinkTargetObjectDto) parcel.readParcelable(MessagesMessageAttachmentLinkDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArticlesArticleDto articlesArticleDto = (ArticlesArticleDto) parcel.readParcelable(MessagesMessageAttachmentLinkDto.class.getClassLoader());
            VideoVideoFullDto videoVideoFullDto = (VideoVideoFullDto) parcel.readParcelable(MessagesMessageAttachmentLinkDto.class.getClassLoader());
            SnippetsAmpDto snippetsAmpDto = (SnippetsAmpDto) parcel.readParcelable(MessagesMessageAttachmentLinkDto.class.getClassLoader());
            Object readValue = parcel.readValue(MessagesMessageAttachmentLinkDto.class.getClassLoader());
            Object readValue2 = parcel.readValue(MessagesMessageAttachmentLinkDto.class.getClassLoader());
            String readString11 = parcel.readString();
            if (parcel.readInt() == 0) {
                obj = readValue2;
                createFromParcel = null;
            } else {
                obj = readValue2;
                createFromParcel = ButtonIconDto.CREATOR.createFromParcel(parcel);
            }
            return new MessagesMessageAttachmentLinkDto(readString, createFromParcel2, readString2, readString3, readString4, num, num2, baseLinkApplicationDto, baseLinkButtonDto, readString5, readString6, readString7, bool, photosPhotoDto, readString8, readString9, baseLinkChatDto, classifiedsYoulaLinkItemDto, baseLinkRatingDto, readString10, baseOwnerButtonActionTargetDto, linkSellerProductPropertiesDto, linkTargetObjectDto, valueOf2, articlesArticleDto, videoVideoFullDto, snippetsAmpDto, readValue, obj, readString11, createFromParcel, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (StickersPackLinkItemDto) parcel.readParcelable(MessagesMessageAttachmentLinkDto.class.getClassLoader()), (VmojiAvatarLinkItemDto) parcel.readParcelable(MessagesMessageAttachmentLinkDto.class.getClassLoader()), (BaseLinkButtonActionModalPageDto) parcel.readParcelable(MessagesMessageAttachmentLinkDto.class.getClassLoader()), parcel.readString(), parcel.readString(), (AppsAppMinDto) parcel.readParcelable(MessagesMessageAttachmentLinkDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesMessageAttachmentLinkDto[] newArray(int i) {
            return new MessagesMessageAttachmentLinkDto[i];
        }
    }

    public MessagesMessageAttachmentLinkDto(String str, MessagesMessageAttachmentLinkProductDto messagesMessageAttachmentLinkProductDto, String str2, String str3, String str4, Integer num, Integer num2, BaseLinkApplicationDto baseLinkApplicationDto, BaseLinkButtonDto baseLinkButtonDto, String str5, String str6, String str7, Boolean bool, PhotosPhotoDto photosPhotoDto, String str8, String str9, BaseLinkChatDto baseLinkChatDto, ClassifiedsYoulaLinkItemDto classifiedsYoulaLinkItemDto, BaseLinkRatingDto baseLinkRatingDto, String str10, BaseOwnerButtonActionTargetDto baseOwnerButtonActionTargetDto, LinkSellerProductPropertiesDto linkSellerProductPropertiesDto, LinkTargetObjectDto linkTargetObjectDto, Boolean bool2, ArticlesArticleDto articlesArticleDto, VideoVideoFullDto videoVideoFullDto, SnippetsAmpDto snippetsAmpDto, Object obj, Object obj2, String str11, ButtonIconDto buttonIconDto, String str12, Integer num3, StickersPackLinkItemDto stickersPackLinkItemDto, VmojiAvatarLinkItemDto vmojiAvatarLinkItemDto, BaseLinkButtonActionModalPageDto baseLinkButtonActionModalPageDto, String str13, String str14, AppsAppMinDto appsAppMinDto) {
        this.url = str;
        this.product = messagesMessageAttachmentLinkProductDto;
        this.imageSrc = str2;
        this.name = str3;
        this.text = str4;
        this.appId = num;
        this.f76android = num2;
        this.application = baseLinkApplicationDto;
        this.button = baseLinkButtonDto;
        this.caption = str5;
        this.description = str6;
        this.id = str7;
        this.isFavorite = bool;
        this.photo = photosPhotoDto;
        this.previewPage = str8;
        this.previewUrl = str9;
        this.chat = baseLinkChatDto;
        this.classifiedYoula = classifiedsYoulaLinkItemDto;
        this.rating = baseLinkRatingDto;
        this.title = str10;
        this.target = baseOwnerButtonActionTargetDto;
        this.sellerProduct = linkSellerProductPropertiesDto;
        this.targetObject = linkTargetObjectDto;
        this.isExternal = bool2;
        this.previewArticle = articlesArticleDto;
        this.video = videoVideoFullDto;
        this.amp = snippetsAmpDto;
        this.awayParams = obj;
        this.buttonAwayParams = obj2;
        this.buttonText = str11;
        this.buttonIcon = buttonIconDto;
        this.buttonAction = str12;
        this.formId = num3;
        this.stickersPack = stickersPackLinkItemDto;
        this.vmojiAvatar = vmojiAvatarLinkItemDto;
        this.modalPage = baseLinkButtonActionModalPageDto;
        this.imageBig = str13;
        this.ref = str14;
        this.miniApp = appsAppMinDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesMessageAttachmentLinkDto)) {
            return false;
        }
        MessagesMessageAttachmentLinkDto messagesMessageAttachmentLinkDto = (MessagesMessageAttachmentLinkDto) obj;
        return epx.f(this.url, messagesMessageAttachmentLinkDto.url) && epx.f(this.product, messagesMessageAttachmentLinkDto.product) && epx.f(this.imageSrc, messagesMessageAttachmentLinkDto.imageSrc) && epx.f(this.name, messagesMessageAttachmentLinkDto.name) && epx.f(this.text, messagesMessageAttachmentLinkDto.text) && epx.f(this.appId, messagesMessageAttachmentLinkDto.appId) && epx.f(this.f76android, messagesMessageAttachmentLinkDto.f76android) && epx.f(this.application, messagesMessageAttachmentLinkDto.application) && epx.f(this.button, messagesMessageAttachmentLinkDto.button) && epx.f(this.caption, messagesMessageAttachmentLinkDto.caption) && epx.f(this.description, messagesMessageAttachmentLinkDto.description) && epx.f(this.id, messagesMessageAttachmentLinkDto.id) && epx.f(this.isFavorite, messagesMessageAttachmentLinkDto.isFavorite) && epx.f(this.photo, messagesMessageAttachmentLinkDto.photo) && epx.f(this.previewPage, messagesMessageAttachmentLinkDto.previewPage) && epx.f(this.previewUrl, messagesMessageAttachmentLinkDto.previewUrl) && epx.f(this.chat, messagesMessageAttachmentLinkDto.chat) && epx.f(this.classifiedYoula, messagesMessageAttachmentLinkDto.classifiedYoula) && epx.f(this.rating, messagesMessageAttachmentLinkDto.rating) && epx.f(this.title, messagesMessageAttachmentLinkDto.title) && this.target == messagesMessageAttachmentLinkDto.target && epx.f(this.sellerProduct, messagesMessageAttachmentLinkDto.sellerProduct) && epx.f(this.targetObject, messagesMessageAttachmentLinkDto.targetObject) && epx.f(this.isExternal, messagesMessageAttachmentLinkDto.isExternal) && epx.f(this.previewArticle, messagesMessageAttachmentLinkDto.previewArticle) && epx.f(this.video, messagesMessageAttachmentLinkDto.video) && epx.f(this.amp, messagesMessageAttachmentLinkDto.amp) && epx.f(this.awayParams, messagesMessageAttachmentLinkDto.awayParams) && epx.f(this.buttonAwayParams, messagesMessageAttachmentLinkDto.buttonAwayParams) && epx.f(this.buttonText, messagesMessageAttachmentLinkDto.buttonText) && this.buttonIcon == messagesMessageAttachmentLinkDto.buttonIcon && epx.f(this.buttonAction, messagesMessageAttachmentLinkDto.buttonAction) && epx.f(this.formId, messagesMessageAttachmentLinkDto.formId) && epx.f(this.stickersPack, messagesMessageAttachmentLinkDto.stickersPack) && epx.f(this.vmojiAvatar, messagesMessageAttachmentLinkDto.vmojiAvatar) && epx.f(this.modalPage, messagesMessageAttachmentLinkDto.modalPage) && epx.f(this.imageBig, messagesMessageAttachmentLinkDto.imageBig) && epx.f(this.ref, messagesMessageAttachmentLinkDto.ref) && epx.f(this.miniApp, messagesMessageAttachmentLinkDto.miniApp);
    }

    public final int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        MessagesMessageAttachmentLinkProductDto messagesMessageAttachmentLinkProductDto = this.product;
        int hashCode2 = (hashCode + (messagesMessageAttachmentLinkProductDto == null ? 0 : messagesMessageAttachmentLinkProductDto.hashCode())) * 31;
        String str = this.imageSrc;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.appId;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f76android;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BaseLinkApplicationDto baseLinkApplicationDto = this.application;
        int hashCode8 = (hashCode7 + (baseLinkApplicationDto == null ? 0 : baseLinkApplicationDto.hashCode())) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        int hashCode9 = (hashCode8 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
        String str4 = this.caption;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.id;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.isFavorite;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode14 = (hashCode13 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        String str7 = this.previewPage;
        int hashCode15 = (hashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.previewUrl;
        int hashCode16 = (hashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BaseLinkChatDto baseLinkChatDto = this.chat;
        int hashCode17 = (hashCode16 + (baseLinkChatDto == null ? 0 : baseLinkChatDto.hashCode())) * 31;
        ClassifiedsYoulaLinkItemDto classifiedsYoulaLinkItemDto = this.classifiedYoula;
        int hashCode18 = (hashCode17 + (classifiedsYoulaLinkItemDto == null ? 0 : classifiedsYoulaLinkItemDto.hashCode())) * 31;
        BaseLinkRatingDto baseLinkRatingDto = this.rating;
        int hashCode19 = (hashCode18 + (baseLinkRatingDto == null ? 0 : baseLinkRatingDto.hashCode())) * 31;
        String str9 = this.title;
        int hashCode20 = (hashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        BaseOwnerButtonActionTargetDto baseOwnerButtonActionTargetDto = this.target;
        int hashCode21 = (hashCode20 + (baseOwnerButtonActionTargetDto == null ? 0 : baseOwnerButtonActionTargetDto.hashCode())) * 31;
        LinkSellerProductPropertiesDto linkSellerProductPropertiesDto = this.sellerProduct;
        int hashCode22 = (hashCode21 + (linkSellerProductPropertiesDto == null ? 0 : linkSellerProductPropertiesDto.hashCode())) * 31;
        LinkTargetObjectDto linkTargetObjectDto = this.targetObject;
        int hashCode23 = (hashCode22 + (linkTargetObjectDto == null ? 0 : linkTargetObjectDto.hashCode())) * 31;
        Boolean bool2 = this.isExternal;
        int hashCode24 = (hashCode23 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ArticlesArticleDto articlesArticleDto = this.previewArticle;
        int hashCode25 = (hashCode24 + (articlesArticleDto == null ? 0 : articlesArticleDto.hashCode())) * 31;
        VideoVideoFullDto videoVideoFullDto = this.video;
        int hashCode26 = (hashCode25 + (videoVideoFullDto == null ? 0 : videoVideoFullDto.hashCode())) * 31;
        SnippetsAmpDto snippetsAmpDto = this.amp;
        int hashCode27 = (hashCode26 + (snippetsAmpDto == null ? 0 : snippetsAmpDto.hashCode())) * 31;
        Object obj = this.awayParams;
        int hashCode28 = (hashCode27 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.buttonAwayParams;
        int hashCode29 = (hashCode28 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str10 = this.buttonText;
        int hashCode30 = (hashCode29 + (str10 == null ? 0 : str10.hashCode())) * 31;
        ButtonIconDto buttonIconDto = this.buttonIcon;
        int hashCode31 = (hashCode30 + (buttonIconDto == null ? 0 : buttonIconDto.hashCode())) * 31;
        String str11 = this.buttonAction;
        int hashCode32 = (hashCode31 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num3 = this.formId;
        int hashCode33 = (hashCode32 + (num3 == null ? 0 : num3.hashCode())) * 31;
        StickersPackLinkItemDto stickersPackLinkItemDto = this.stickersPack;
        int hashCode34 = (hashCode33 + (stickersPackLinkItemDto == null ? 0 : stickersPackLinkItemDto.hashCode())) * 31;
        VmojiAvatarLinkItemDto vmojiAvatarLinkItemDto = this.vmojiAvatar;
        int hashCode35 = (hashCode34 + (vmojiAvatarLinkItemDto == null ? 0 : vmojiAvatarLinkItemDto.hashCode())) * 31;
        BaseLinkButtonActionModalPageDto baseLinkButtonActionModalPageDto = this.modalPage;
        int hashCode36 = (hashCode35 + (baseLinkButtonActionModalPageDto == null ? 0 : baseLinkButtonActionModalPageDto.hashCode())) * 31;
        String str12 = this.imageBig;
        int hashCode37 = (hashCode36 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.ref;
        int hashCode38 = (hashCode37 + (str13 == null ? 0 : str13.hashCode())) * 31;
        AppsAppMinDto appsAppMinDto = this.miniApp;
        return hashCode38 + (appsAppMinDto != null ? appsAppMinDto.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesMessageAttachmentLinkDto(url=" + this.url + ", product=" + this.product + ", imageSrc=" + this.imageSrc + ", name=" + this.name + ", text=" + this.text + ", appId=" + this.appId + ", android=" + this.f76android + ", application=" + this.application + ", button=" + this.button + ", caption=" + this.caption + ", description=" + this.description + ", id=" + this.id + ", isFavorite=" + this.isFavorite + ", photo=" + this.photo + ", previewPage=" + this.previewPage + ", previewUrl=" + this.previewUrl + ", chat=" + this.chat + ", classifiedYoula=" + this.classifiedYoula + ", rating=" + this.rating + ", title=" + this.title + ", target=" + this.target + ", sellerProduct=" + this.sellerProduct + ", targetObject=" + this.targetObject + ", isExternal=" + this.isExternal + ", previewArticle=" + this.previewArticle + ", video=" + this.video + ", amp=" + this.amp + ", awayParams=" + this.awayParams + ", buttonAwayParams=" + this.buttonAwayParams + ", buttonText=" + this.buttonText + ", buttonIcon=" + this.buttonIcon + ", buttonAction=" + this.buttonAction + ", formId=" + this.formId + ", stickersPack=" + this.stickersPack + ", vmojiAvatar=" + this.vmojiAvatar + ", modalPage=" + this.modalPage + ", imageBig=" + this.imageBig + ", ref=" + this.ref + ", miniApp=" + this.miniApp + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        MessagesMessageAttachmentLinkProductDto messagesMessageAttachmentLinkProductDto = this.product;
        if (messagesMessageAttachmentLinkProductDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesMessageAttachmentLinkProductDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.imageSrc);
        parcel.writeString(this.name);
        parcel.writeString(this.text);
        Integer num = this.appId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.f76android;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeParcelable(this.application, i);
        parcel.writeParcelable(this.button, i);
        parcel.writeString(this.caption);
        parcel.writeString(this.description);
        parcel.writeString(this.id);
        Boolean bool = this.isFavorite;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeParcelable(this.photo, i);
        parcel.writeString(this.previewPage);
        parcel.writeString(this.previewUrl);
        parcel.writeParcelable(this.chat, i);
        parcel.writeParcelable(this.classifiedYoula, i);
        parcel.writeParcelable(this.rating, i);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.target, i);
        parcel.writeParcelable(this.sellerProduct, i);
        parcel.writeParcelable(this.targetObject, i);
        Boolean bool2 = this.isExternal;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeParcelable(this.previewArticle, i);
        parcel.writeParcelable(this.video, i);
        parcel.writeParcelable(this.amp, i);
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
        Integer num3 = this.formId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeParcelable(this.stickersPack, i);
        parcel.writeParcelable(this.vmojiAvatar, i);
        parcel.writeParcelable(this.modalPage, i);
        parcel.writeString(this.imageBig);
        parcel.writeString(this.ref);
        parcel.writeParcelable(this.miniApp, i);
    }

    public /* synthetic */ MessagesMessageAttachmentLinkDto(String str, MessagesMessageAttachmentLinkProductDto messagesMessageAttachmentLinkProductDto, String str2, String str3, String str4, Integer num, Integer num2, BaseLinkApplicationDto baseLinkApplicationDto, BaseLinkButtonDto baseLinkButtonDto, String str5, String str6, String str7, Boolean bool, PhotosPhotoDto photosPhotoDto, String str8, String str9, BaseLinkChatDto baseLinkChatDto, ClassifiedsYoulaLinkItemDto classifiedsYoulaLinkItemDto, BaseLinkRatingDto baseLinkRatingDto, String str10, BaseOwnerButtonActionTargetDto baseOwnerButtonActionTargetDto, LinkSellerProductPropertiesDto linkSellerProductPropertiesDto, LinkTargetObjectDto linkTargetObjectDto, Boolean bool2, ArticlesArticleDto articlesArticleDto, VideoVideoFullDto videoVideoFullDto, SnippetsAmpDto snippetsAmpDto, Object obj, Object obj2, String str11, ButtonIconDto buttonIconDto, String str12, Integer num3, StickersPackLinkItemDto stickersPackLinkItemDto, VmojiAvatarLinkItemDto vmojiAvatarLinkItemDto, BaseLinkButtonActionModalPageDto baseLinkButtonActionModalPageDto, String str13, String str14, AppsAppMinDto appsAppMinDto, int i, int i2, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : messagesMessageAttachmentLinkProductDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : baseLinkApplicationDto, (i & 256) != 0 ? null : baseLinkButtonDto, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : bool, (i & 8192) != 0 ? null : photosPhotoDto, (i & 16384) != 0 ? null : str8, (i & 32768) != 0 ? null : str9, (i & 65536) != 0 ? null : baseLinkChatDto, (i & 131072) != 0 ? null : classifiedsYoulaLinkItemDto, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : baseLinkRatingDto, (i & 524288) != 0 ? null : str10, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : baseOwnerButtonActionTargetDto, (i & 2097152) != 0 ? null : linkSellerProductPropertiesDto, (i & 4194304) != 0 ? null : linkTargetObjectDto, (i & 8388608) != 0 ? null : bool2, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : articlesArticleDto, (i & 33554432) != 0 ? null : videoVideoFullDto, (i & 67108864) != 0 ? null : snippetsAmpDto, (i & 134217728) != 0 ? null : obj, (i & 268435456) != 0 ? null : obj2, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str11, (i & 1073741824) != 0 ? null : buttonIconDto, (i & Integer.MIN_VALUE) != 0 ? null : str12, (i2 & 1) != 0 ? null : num3, (i2 & 2) != 0 ? null : stickersPackLinkItemDto, (i2 & 4) != 0 ? null : vmojiAvatarLinkItemDto, (i2 & 8) != 0 ? null : baseLinkButtonActionModalPageDto, (i2 & 16) != 0 ? null : str13, (i2 & 32) != 0 ? null : str14, (i2 & 64) != 0 ? null : appsAppMinDto);
    }
}
