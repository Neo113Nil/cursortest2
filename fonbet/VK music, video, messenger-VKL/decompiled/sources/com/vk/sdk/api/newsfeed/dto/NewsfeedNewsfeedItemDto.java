package com.vk.sdk.api.newsfeed.dto;

import com.google.gson.internal.bind.TreeTypeAdapter;
import com.ironsource.Ad;
import com.ironsource.Gc;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.model.history.b;
import com.vk.sdk.api.ads.dto.AdsHideReasonsDto;
import com.vk.sdk.api.ads.dto.AdsHtml5GameInappActionDto;
import com.vk.sdk.api.ads.dto.AdsItemBlockAdItemDto;
import com.vk.sdk.api.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.sdk.api.aliexpress.dto.AliexpressBlockPanelDto;
import com.vk.sdk.api.aliexpress.dto.AliexpressCarouselItemDto;
import com.vk.sdk.api.aliexpress.dto.AliexpressPromoCardDto;
import com.vk.sdk.api.aliexpress.dto.AliexpressSocialFooterDto;
import com.vk.sdk.api.apps.dto.AppsAppDto;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import com.vk.sdk.api.base.dto.BaseCommentsInfoDto;
import com.vk.sdk.api.base.dto.BaseImageDto;
import com.vk.sdk.api.base.dto.BaseLikesDto;
import com.vk.sdk.api.base.dto.BaseLikesInfoDto;
import com.vk.sdk.api.base.dto.BaseLinkButtonDto;
import com.vk.sdk.api.base.dto.BaseLinkDto;
import com.vk.sdk.api.base.dto.BaseRepostsInfoDto;
import com.vk.sdk.api.classifieds.dto.ClassifiedsWorkiCarouselItemDto;
import com.vk.sdk.api.classifieds.dto.ClassifiedsYoulaCarouselBlockGroupDto;
import com.vk.sdk.api.classifieds.dto.ClassifiedsYoulaGroupsBlockDto;
import com.vk.sdk.api.classifieds.dto.ClassifiedsYoulaItemExtendedDto;
import com.vk.sdk.api.discover.dto.DiscoverCarouselButtonDto;
import com.vk.sdk.api.discover.dto.DiscoverCarouselItemDto;
import com.vk.sdk.api.discover.dto.DiscoverCarouselObjectsTypeDto;
import com.vk.sdk.api.friends.dto.FriendsEntrypointsDto;
import com.vk.sdk.api.friends.dto.FriendsRecBlockFooterDto;
import com.vk.sdk.api.friends.dto.FriendsRecBlockInfoCardDto;
import com.vk.sdk.api.friends.dto.FriendsRecProfileDto;
import com.vk.sdk.api.groups.dto.GroupsSuggestionDto;
import com.vk.sdk.api.market.dto.MarketGroupsBlockDto;
import com.vk.sdk.api.market.dto.MarketItemOwnerInfoDto;
import com.vk.sdk.api.market.dto.MarketItemPromotionInfoDto;
import com.vk.sdk.api.market.dto.MarketMarketCategoryDto;
import com.vk.sdk.api.market.dto.MarketMarketItemAvailabilityDto;
import com.vk.sdk.api.market.dto.MarketPriceDto;
import com.vk.sdk.api.messages.dto.MessagesChatSuggestionDto;
import com.vk.sdk.api.photos.dto.PhotosPhotoDto;
import com.vk.sdk.api.photos.dto.PhotosTagsSuggestionItemDto;
import com.vk.sdk.api.photos.dto.PhotosTagsSuggestionItemEndCardDto;
import com.vk.sdk.api.shortVideo.dto.ShortVideoChallengeFeedItemDto;
import com.vk.sdk.api.textlives.dto.TextlivesTextliveTextpostBlockDto;
import com.vk.sdk.api.video.dto.VideoVideoDto;
import com.vk.sdk.api.video.dto.VideoVideoFullDto;
import com.vk.sdk.api.wall.dto.WallGeoDto;
import com.vk.sdk.api.wall.dto.WallPostCopyrightDto;
import com.vk.sdk.api.wall.dto.WallPostSourceDto;
import com.vk.sdk.api.wall.dto.WallPostTypeDto;
import com.vk.sdk.api.wall.dto.WallViewsDto;
import com.vk.sdk.api.wall.dto.WallWallpostAttachmentDto;
import com.vk.sdk.api.wall.dto.WallWallpostDonutDto;
import com.vk.sdk.api.wall.dto.WallWallpostFullDto;
import io.appmetrica.analytics.impl.L2;
import java.util.List;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.bh10;
import xsna.cgn;
import xsna.epx;
import xsna.fw3;
import xsna.go9;
import xsna.i5s;
import xsna.jax0;
import xsna.kh10;
import xsna.kr;
import xsna.l4;
import xsna.mq;
import xsna.n6j;
import xsna.odj;
import xsna.pmi0;
import xsna.qoy;
import xsna.rq;
import xsna.shy;
import xsna.sq;
import xsna.to;
import xsna.tq;
import xsna.up;
import xsna.uq;
import xsna.urd0;
import xsna.vq;
import xsna.vr;
import xsna.xe9;
import xsna.z8y;
import xsna.zcl;
import xsna.zn;
import xsna.zrp;

/* compiled from: NewsfeedNewsfeedItemDto.kt */
/* loaded from: classes5.dex */
public abstract class NewsfeedNewsfeedItemDto {

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class Deserializer implements a9y<NewsfeedNewsfeedItemDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -2002177155:
                        if (f.equals("wall_photo")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemPhotoDto.class);
                        }
                        break;
                    case -1331913276:
                        if (f.equals("digest")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemDigestDto.class);
                        }
                        break;
                    case -1266283874:
                        if (f.equals("friend")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemFriendDto.class);
                        }
                        break;
                    case -847657971:
                        if (f.equals("photo_tag")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemPhotoTagDto.class);
                        }
                        break;
                    case 3446944:
                        if (f.equals("post")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemWallpostDto.class);
                        }
                        break;
                    case 93166550:
                        if (f.equals("audio")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemAudioDto.class);
                        }
                        break;
                    case 106642994:
                        if (f.equals("photo")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemPhotoDto.class);
                        }
                        break;
                    case 110546223:
                        if (f.equals("topic")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemTopicDto.class);
                        }
                        break;
                    case 112202875:
                        if (f.equals("video")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemVideoDto.class);
                        }
                        break;
                    case 310369378:
                        if (f.equals("promo_button")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemPromoButtonDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedDzenStoryNewsBlockDto extends NewsfeedNewsfeedItemDto {

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("header")
        private final NewsfeedItemDigestHeaderDto header;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("type")
        private final String type;

        public /* synthetic */ NewsfeedDzenStoryNewsBlockDto(String str, UserId userId, int i, NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(str, userId, i, (i2 & 8) != 0 ? null : newsfeedItemDigestHeaderDto, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : f, (i2 & 64) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedDzenStoryNewsBlockDto)) {
                return false;
            }
            NewsfeedDzenStoryNewsBlockDto newsfeedDzenStoryNewsBlockDto = (NewsfeedDzenStoryNewsBlockDto) obj;
            return epx.f(this.type, newsfeedDzenStoryNewsBlockDto.type) && epx.f(this.sourceId, newsfeedDzenStoryNewsBlockDto.sourceId) && this.date == newsfeedDzenStoryNewsBlockDto.date && epx.f(this.header, newsfeedDzenStoryNewsBlockDto.header) && epx.f(this.isAsync, newsfeedDzenStoryNewsBlockDto.isAsync) && epx.f(this.shortTextRate, newsfeedDzenStoryNewsBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedDzenStoryNewsBlockDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto = this.header;
            int hashCode = (a + (newsfeedItemDigestHeaderDto == null ? 0 : newsfeedItemDigestHeaderDto.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode3 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            String str = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto = this.header;
            Boolean bool = this.isAsync;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedDzenStoryNewsBlockDto(type=");
            sb.append(str);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i);
            sb.append(", header=");
            sb.append(newsfeedItemDigestHeaderDto);
            sb.append(", isAsync=");
            sb.append(bool);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            return zn.b(sb, newsfeedItemWallpostFeedbackDto, ")");
        }

        public NewsfeedDzenStoryNewsBlockDto(String str, UserId userId, int i, NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.type = str;
            this.sourceId = userId;
            this.date = i;
            this.header = newsfeedItemDigestHeaderDto;
            this.isAsync = bool;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedDzenTopStoriesBlockDto extends NewsfeedNewsfeedItemDto {

        @pmi0("date")
        private final int date;

        @pmi0("dzen_compilation")
        private final NewsfeedDzenCompilationDto dzenCompilation;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("header")
        private final NewsfeedDzenTopStoriesBlockHeaderDto header;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("show_more_count")
        private final int showMoreCount;

        @pmi0("show_more_text")
        private final String showMoreText;

        @pmi0("shown_news_count")
        private final int shownNewsCount;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("type")
        private final String type;

        public /* synthetic */ NewsfeedDzenTopStoriesBlockDto(String str, NewsfeedDzenTopStoriesBlockHeaderDto newsfeedDzenTopStoriesBlockHeaderDto, int i, int i2, String str2, UserId userId, int i3, NewsfeedDzenCompilationDto newsfeedDzenCompilationDto, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i4, zcl zclVar) {
            this(str, newsfeedDzenTopStoriesBlockHeaderDto, i, i2, str2, userId, i3, (i4 & 128) != 0 ? null : newsfeedDzenCompilationDto, (i4 & 256) != 0 ? null : bool, (i4 & 512) != 0 ? null : f, (i4 & 1024) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedDzenTopStoriesBlockDto)) {
                return false;
            }
            NewsfeedDzenTopStoriesBlockDto newsfeedDzenTopStoriesBlockDto = (NewsfeedDzenTopStoriesBlockDto) obj;
            return epx.f(this.type, newsfeedDzenTopStoriesBlockDto.type) && epx.f(this.header, newsfeedDzenTopStoriesBlockDto.header) && this.shownNewsCount == newsfeedDzenTopStoriesBlockDto.shownNewsCount && this.showMoreCount == newsfeedDzenTopStoriesBlockDto.showMoreCount && epx.f(this.showMoreText, newsfeedDzenTopStoriesBlockDto.showMoreText) && epx.f(this.sourceId, newsfeedDzenTopStoriesBlockDto.sourceId) && this.date == newsfeedDzenTopStoriesBlockDto.date && epx.f(this.dzenCompilation, newsfeedDzenTopStoriesBlockDto.dzenCompilation) && epx.f(this.isAsync, newsfeedDzenTopStoriesBlockDto.isAsync) && epx.f(this.shortTextRate, newsfeedDzenTopStoriesBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedDzenTopStoriesBlockDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(urd0.a(shy.a(this.showMoreCount, shy.a(this.shownNewsCount, (this.header.hashCode() + (this.type.hashCode() * 31)) * 31, 31), 31), 31, this.showMoreText), 31, this.sourceId.b), 31);
            NewsfeedDzenCompilationDto newsfeedDzenCompilationDto = this.dzenCompilation;
            int hashCode = (a + (newsfeedDzenCompilationDto == null ? 0 : newsfeedDzenCompilationDto.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode3 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            String str = this.type;
            NewsfeedDzenTopStoriesBlockHeaderDto newsfeedDzenTopStoriesBlockHeaderDto = this.header;
            int i = this.shownNewsCount;
            int i2 = this.showMoreCount;
            String str2 = this.showMoreText;
            UserId userId = this.sourceId;
            int i3 = this.date;
            NewsfeedDzenCompilationDto newsfeedDzenCompilationDto = this.dzenCompilation;
            Boolean bool = this.isAsync;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedDzenTopStoriesBlockDto(type=");
            sb.append(str);
            sb.append(", header=");
            sb.append(newsfeedDzenTopStoriesBlockHeaderDto);
            sb.append(", shownNewsCount=");
            cgn.a(i, i2, ", showMoreCount=", ", showMoreText=", sb);
            sb.append(str2);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i3);
            sb.append(", dzenCompilation=");
            sb.append(newsfeedDzenCompilationDto);
            sb.append(", isAsync=");
            sb.append(bool);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            return zn.b(sb, newsfeedItemWallpostFeedbackDto, ")");
        }

        public NewsfeedDzenTopStoriesBlockDto(String str, NewsfeedDzenTopStoriesBlockHeaderDto newsfeedDzenTopStoriesBlockHeaderDto, int i, int i2, String str2, UserId userId, int i3, NewsfeedDzenCompilationDto newsfeedDzenCompilationDto, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.type = str;
            this.header = newsfeedDzenTopStoriesBlockHeaderDto;
            this.shownNewsCount = i;
            this.showMoreCount = i2;
            this.showMoreText = str2;
            this.sourceId = userId;
            this.date = i3;
            this.dzenCompilation = newsfeedDzenCompilationDto;
            this.isAsync = bool;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedInfoBlockDto extends NewsfeedNewsfeedItemDto {

        @pmi0("date")
        private final int date;

        @pmi0("description")
        private final String description;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("image")
        private final NewsfeedNewsfeedItemHeaderImageDto image;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("more")
        private final NewsfeedInfoBlockButtonDto more;

        @pmi0("popup")
        private final NewsfeedInfoBlockPopupDto popup;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final String type;

        public /* synthetic */ NewsfeedInfoBlockDto(String str, String str2, UserId userId, int i, NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, String str3, NewsfeedInfoBlockButtonDto newsfeedInfoBlockButtonDto, NewsfeedInfoBlockPopupDto newsfeedInfoBlockPopupDto, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(str, str2, userId, i, (i2 & 16) != 0 ? null : newsfeedNewsfeedItemHeaderImageDto, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : newsfeedInfoBlockButtonDto, (i2 & 128) != 0 ? null : newsfeedInfoBlockPopupDto, (i2 & 256) != 0 ? null : bool, (i2 & 512) != 0 ? null : f, (i2 & 1024) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedInfoBlockDto)) {
                return false;
            }
            NewsfeedInfoBlockDto newsfeedInfoBlockDto = (NewsfeedInfoBlockDto) obj;
            return epx.f(this.type, newsfeedInfoBlockDto.type) && epx.f(this.trackCode, newsfeedInfoBlockDto.trackCode) && epx.f(this.sourceId, newsfeedInfoBlockDto.sourceId) && this.date == newsfeedInfoBlockDto.date && epx.f(this.image, newsfeedInfoBlockDto.image) && epx.f(this.description, newsfeedInfoBlockDto.description) && epx.f(this.more, newsfeedInfoBlockDto.more) && epx.f(this.popup, newsfeedInfoBlockDto.popup) && epx.f(this.isAsync, newsfeedInfoBlockDto.isAsync) && epx.f(this.shortTextRate, newsfeedInfoBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedInfoBlockDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(urd0.a(this.type.hashCode() * 31, 31, this.trackCode), 31, this.sourceId.b), 31);
            NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = this.image;
            int hashCode = (a + (newsfeedNewsfeedItemHeaderImageDto == null ? 0 : newsfeedNewsfeedItemHeaderImageDto.hashCode())) * 31;
            String str = this.description;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            NewsfeedInfoBlockButtonDto newsfeedInfoBlockButtonDto = this.more;
            int hashCode3 = (hashCode2 + (newsfeedInfoBlockButtonDto == null ? 0 : newsfeedInfoBlockButtonDto.hashCode())) * 31;
            NewsfeedInfoBlockPopupDto newsfeedInfoBlockPopupDto = this.popup;
            int hashCode4 = (hashCode3 + (newsfeedInfoBlockPopupDto == null ? 0 : newsfeedInfoBlockPopupDto.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode6 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            String str = this.type;
            String str2 = this.trackCode;
            UserId userId = this.sourceId;
            int i = this.date;
            NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = this.image;
            String str3 = this.description;
            NewsfeedInfoBlockButtonDto newsfeedInfoBlockButtonDto = this.more;
            NewsfeedInfoBlockPopupDto newsfeedInfoBlockPopupDto = this.popup;
            Boolean bool = this.isAsync;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder a = xe9.a("NewsfeedInfoBlockDto(type=", str, ", trackCode=", str2, ", sourceId=");
            a.append(userId);
            a.append(", date=");
            a.append(i);
            a.append(", image=");
            a.append(newsfeedNewsfeedItemHeaderImageDto);
            a.append(", description=");
            a.append(str3);
            a.append(", more=");
            a.append(newsfeedInfoBlockButtonDto);
            a.append(", popup=");
            a.append(newsfeedInfoBlockPopupDto);
            a.append(", isAsync=");
            a.append(bool);
            a.append(", shortTextRate=");
            a.append(f);
            a.append(", feedback=");
            return zn.b(a, newsfeedItemWallpostFeedbackDto, ")");
        }

        public NewsfeedInfoBlockDto(String str, String str2, UserId userId, int i, NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, String str3, NewsfeedInfoBlockButtonDto newsfeedInfoBlockButtonDto, NewsfeedInfoBlockPopupDto newsfeedInfoBlockPopupDto, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.type = str;
            this.trackCode = str2;
            this.sourceId = userId;
            this.date = i;
            this.image = newsfeedNewsfeedItemHeaderImageDto;
            this.description = str3;
            this.more = newsfeedInfoBlockButtonDto;
            this.popup = newsfeedInfoBlockPopupDto;
            this.isAsync = bool;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemAchievementGameBlockDto extends NewsfeedNewsfeedItemDto {

        @pmi0("achievement_image")
        private final List<BaseImageDto> achievementImage;

        @pmi0("achievement_text")
        private final String achievementText;

        /* renamed from: app, reason: collision with root package name */
        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        private final AppsAppDto f89app;

        @pmi0("app_cover")
        private final List<BaseImageDto> appCover;

        @pmi0("button_text")
        private final String buttonText;

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("friends_avatars")
        private final List<List<BaseImageDto>> friendsAvatars;

        @pmi0("friends_playing_text")
        private final String friendsPlayingText;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedItemAchievementGameBlockDto(AppsAppDto appsAppDto, String str, String str2, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str3, List list, List list2, String str4, List list3, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(appsAppDto, str, str2, newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : list, (i2 & 256) != 0 ? null : list2, (i2 & 512) != 0 ? null : str4, (i2 & 1024) != 0 ? null : list3, (i2 & 2048) != 0 ? null : bool, (i2 & 4096) != 0 ? null : f, (i2 & 8192) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemAchievementGameBlockDto)) {
                return false;
            }
            NewsfeedItemAchievementGameBlockDto newsfeedItemAchievementGameBlockDto = (NewsfeedItemAchievementGameBlockDto) obj;
            return epx.f(this.f89app, newsfeedItemAchievementGameBlockDto.f89app) && epx.f(this.title, newsfeedItemAchievementGameBlockDto.title) && epx.f(this.buttonText, newsfeedItemAchievementGameBlockDto.buttonText) && this.type == newsfeedItemAchievementGameBlockDto.type && epx.f(this.sourceId, newsfeedItemAchievementGameBlockDto.sourceId) && this.date == newsfeedItemAchievementGameBlockDto.date && epx.f(this.friendsPlayingText, newsfeedItemAchievementGameBlockDto.friendsPlayingText) && epx.f(this.friendsAvatars, newsfeedItemAchievementGameBlockDto.friendsAvatars) && epx.f(this.appCover, newsfeedItemAchievementGameBlockDto.appCover) && epx.f(this.achievementText, newsfeedItemAchievementGameBlockDto.achievementText) && epx.f(this.achievementImage, newsfeedItemAchievementGameBlockDto.achievementImage) && epx.f(this.isAsync, newsfeedItemAchievementGameBlockDto.isAsync) && epx.f(this.shortTextRate, newsfeedItemAchievementGameBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedItemAchievementGameBlockDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a((this.type.hashCode() + urd0.a(urd0.a(this.f89app.hashCode() * 31, 31, this.title), 31, this.buttonText)) * 31, 31, this.sourceId.b), 31);
            String str = this.friendsPlayingText;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            List<List<BaseImageDto>> list = this.friendsAvatars;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<BaseImageDto> list2 = this.appCover;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str2 = this.achievementText;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<BaseImageDto> list3 = this.achievementImage;
            int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode7 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            AppsAppDto appsAppDto = this.f89app;
            String str = this.title;
            String str2 = this.buttonText;
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            String str3 = this.friendsPlayingText;
            List<List<BaseImageDto>> list = this.friendsAvatars;
            List<BaseImageDto> list2 = this.appCover;
            String str4 = this.achievementText;
            List<BaseImageDto> list3 = this.achievementImage;
            Boolean bool = this.isAsync;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemAchievementGameBlockDto(app=");
            sb.append(appsAppDto);
            sb.append(", title=");
            sb.append(str);
            sb.append(", buttonText=");
            sb.append(str2);
            sb.append(", type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i);
            sb.append(", friendsPlayingText=");
            b.c(str3, ", friendsAvatars=", ", appCover=", sb, list);
            vr.c(", achievementText=", str4, ", achievementImage=", sb, list2);
            sb.append(list3);
            sb.append(", isAsync=");
            sb.append(bool);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            sb.append(newsfeedItemWallpostFeedbackDto);
            sb.append(")");
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NewsfeedItemAchievementGameBlockDto(AppsAppDto appsAppDto, String str, String str2, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str3, List<? extends List<BaseImageDto>> list, List<BaseImageDto> list2, String str4, List<BaseImageDto> list3, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.f89app = appsAppDto;
            this.title = str;
            this.buttonText = str2;
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.friendsPlayingText = str3;
            this.friendsAvatars = list;
            this.appCover = list2;
            this.achievementText = str4;
            this.achievementImage = list3;
            this.isAsync = bool;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemAdsBlockDto extends NewsfeedNewsfeedItemDto {

        @pmi0("ad_marker")
        private final String adMarker;

        @pmi0("ad_source")
        private final AdSourceDto adSource;

        @pmi0(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)
        private final List<AdsItemBlockAdItemDto> ads;

        @pmi0("ads_debug")
        private final String adsDebug;

        @pmi0("ads_id1")
        private final int adsId1;

        @pmi0("ads_id2")
        private final int adsId2;

        @pmi0("ads_statistics")
        private final List<AdsItemBlockAdStatPixelDto> adsStatistics;

        @pmi0("ads_title")
        private final String adsTitle;

        @pmi0("advertiser_info_url")
        private final String advertiserInfoUrl;

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("header")
        private final NewsfeedNewsfeedItemHeaderDto header;

        @pmi0("hide_reasons")
        private final AdsHideReasonsDto hideReasons;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("type")
        private final String type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class AdSourceDto {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ AdSourceDto[] $VALUES;

            @pmi0("vkfeed")
            public static final AdSourceDto VKFEED;

            @pmi0("vkontakte")
            public static final AdSourceDto VKONTAKTE;
            private final String value;

            static {
                AdSourceDto adSourceDto = new AdSourceDto("VKONTAKTE", 0, "vkontakte");
                VKONTAKTE = adSourceDto;
                AdSourceDto adSourceDto2 = new AdSourceDto("VKFEED", 1, "vkfeed");
                VKFEED = adSourceDto2;
                AdSourceDto[] adSourceDtoArr = {adSourceDto, adSourceDto2};
                $VALUES = adSourceDtoArr;
                $ENTRIES = new asp(adSourceDtoArr);
            }

            private AdSourceDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static AdSourceDto valueOf(String str) {
                return (AdSourceDto) Enum.valueOf(AdSourceDto.class, str);
            }

            public static AdSourceDto[] values() {
                return (AdSourceDto[]) $VALUES.clone();
            }
        }

        public /* synthetic */ NewsfeedItemAdsBlockDto(String str, UserId userId, int i, String str2, int i2, int i3, List list, String str3, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, AdsHideReasonsDto adsHideReasonsDto, List list2, String str4, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, AdSourceDto adSourceDto, String str5, int i4, zcl zclVar) {
            this(str, userId, i, str2, i2, i3, list, str3, (i4 & 256) != 0 ? null : bool, (i4 & 512) != 0 ? null : f, (i4 & 1024) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i4 & 2048) != 0 ? null : adsHideReasonsDto, (i4 & 4096) != 0 ? null : list2, (i4 & 8192) != 0 ? null : str4, (i4 & 16384) != 0 ? null : newsfeedNewsfeedItemHeaderDto, (32768 & i4) != 0 ? null : adSourceDto, (i4 & 65536) != 0 ? null : str5);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemAdsBlockDto)) {
                return false;
            }
            NewsfeedItemAdsBlockDto newsfeedItemAdsBlockDto = (NewsfeedItemAdsBlockDto) obj;
            return epx.f(this.type, newsfeedItemAdsBlockDto.type) && epx.f(this.sourceId, newsfeedItemAdsBlockDto.sourceId) && this.date == newsfeedItemAdsBlockDto.date && epx.f(this.adsTitle, newsfeedItemAdsBlockDto.adsTitle) && this.adsId1 == newsfeedItemAdsBlockDto.adsId1 && this.adsId2 == newsfeedItemAdsBlockDto.adsId2 && epx.f(this.ads, newsfeedItemAdsBlockDto.ads) && epx.f(this.advertiserInfoUrl, newsfeedItemAdsBlockDto.advertiserInfoUrl) && epx.f(this.isAsync, newsfeedItemAdsBlockDto.isAsync) && epx.f(this.shortTextRate, newsfeedItemAdsBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedItemAdsBlockDto.feedback) && epx.f(this.hideReasons, newsfeedItemAdsBlockDto.hideReasons) && epx.f(this.adsStatistics, newsfeedItemAdsBlockDto.adsStatistics) && epx.f(this.adsDebug, newsfeedItemAdsBlockDto.adsDebug) && epx.f(this.header, newsfeedItemAdsBlockDto.header) && this.adSource == newsfeedItemAdsBlockDto.adSource && epx.f(this.adMarker, newsfeedItemAdsBlockDto.adMarker);
        }

        public final int hashCode() {
            int a = urd0.a(fw3.a(shy.a(this.adsId2, shy.a(this.adsId1, urd0.a(shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31), 31, this.adsTitle), 31), 31), 31, this.ads), 31, this.advertiserInfoUrl);
            Boolean bool = this.isAsync;
            int hashCode = (a + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode3 = (hashCode2 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            AdsHideReasonsDto adsHideReasonsDto = this.hideReasons;
            int hashCode4 = (hashCode3 + (adsHideReasonsDto == null ? 0 : adsHideReasonsDto.hashCode())) * 31;
            List<AdsItemBlockAdStatPixelDto> list = this.adsStatistics;
            int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.adsDebug;
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
            int hashCode7 = (hashCode6 + (newsfeedNewsfeedItemHeaderDto == null ? 0 : newsfeedNewsfeedItemHeaderDto.hashCode())) * 31;
            AdSourceDto adSourceDto = this.adSource;
            int hashCode8 = (hashCode7 + (adSourceDto == null ? 0 : adSourceDto.hashCode())) * 31;
            String str2 = this.adMarker;
            return hashCode8 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            String str = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            String str2 = this.adsTitle;
            int i2 = this.adsId1;
            int i3 = this.adsId2;
            List<AdsItemBlockAdItemDto> list = this.ads;
            String str3 = this.advertiserInfoUrl;
            Boolean bool = this.isAsync;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            AdsHideReasonsDto adsHideReasonsDto = this.hideReasons;
            List<AdsItemBlockAdStatPixelDto> list2 = this.adsStatistics;
            String str4 = this.adsDebug;
            NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
            AdSourceDto adSourceDto = this.adSource;
            String str5 = this.adMarker;
            StringBuilder sb = new StringBuilder("NewsfeedItemAdsBlockDto(type=");
            sb.append(str);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            jax0.a(i, ", adsTitle=", str2, ", adsId1=", sb);
            cgn.a(i2, i3, ", adsId2=", ", ads=", sb);
            vr.c(", advertiserInfoUrl=", str3, ", isAsync=", sb, list);
            sb.append(bool);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            sb.append(newsfeedItemWallpostFeedbackDto);
            sb.append(", hideReasons=");
            sb.append(adsHideReasonsDto);
            sb.append(", adsStatistics=");
            vr.c(", adsDebug=", str4, ", header=", sb, list2);
            sb.append(newsfeedNewsfeedItemHeaderDto);
            sb.append(", adSource=");
            sb.append(adSourceDto);
            sb.append(", adMarker=");
            return i5s.a(sb, str5, ")");
        }

        public NewsfeedItemAdsBlockDto(String str, UserId userId, int i, String str2, int i2, int i3, List<AdsItemBlockAdItemDto> list, String str3, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, AdsHideReasonsDto adsHideReasonsDto, List<AdsItemBlockAdStatPixelDto> list2, String str4, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, AdSourceDto adSourceDto, String str5) {
            super(null);
            this.type = str;
            this.sourceId = userId;
            this.date = i;
            this.adsTitle = str2;
            this.adsId1 = i2;
            this.adsId2 = i3;
            this.ads = list;
            this.advertiserInfoUrl = str3;
            this.isAsync = bool;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.hideReasons = adsHideReasonsDto;
            this.adsStatistics = list2;
            this.adsDebug = str4;
            this.header = newsfeedNewsfeedItemHeaderDto;
            this.adSource = adSourceDto;
            this.adMarker = str5;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemAliexpressCarouselBlockDto extends NewsfeedNewsfeedItemDto {

        @pmi0("block_panel")
        private final AliexpressBlockPanelDto blockPanel;

        @pmi0("block_title")
        private final String blockTitle;

        @pmi0("bundle")
        private final BundleDto bundle;

        @pmi0("can_be_filtered")
        private final Boolean canBeFiltered;

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("footer")
        private final AliexpressSocialFooterDto footer;

        @pmi0("goods_carousel_view_type")
        private final String goodsCarouselViewType;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("items")
        private final List<AliexpressCarouselItemDto> items;

        @pmi0("more_button")
        private final BaseLinkButtonDto moreButton;

        @pmi0("promo_card")
        private final AliexpressPromoCardDto promoCard;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final String type;

        @pmi0("use_oneline_product_title")
        private final Boolean useOnelineProductTitle;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class BundleDto {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ BundleDto[] $VALUES;

            @pmi0("aliexpress_item")
            public static final BundleDto ALIEXPRESS_ITEM;

            @pmi0("market_item")
            public static final BundleDto MARKET_ITEM;
            private final String value;

            static {
                BundleDto bundleDto = new BundleDto("ALIEXPRESS_ITEM", 0, "aliexpress_item");
                ALIEXPRESS_ITEM = bundleDto;
                BundleDto bundleDto2 = new BundleDto("MARKET_ITEM", 1, "market_item");
                MARKET_ITEM = bundleDto2;
                BundleDto[] bundleDtoArr = {bundleDto, bundleDto2};
                $VALUES = bundleDtoArr;
                $ENTRIES = new asp(bundleDtoArr);
            }

            private BundleDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static BundleDto valueOf(String str) {
                return (BundleDto) Enum.valueOf(BundleDto.class, str);
            }

            public static BundleDto[] values() {
                return (BundleDto[]) $VALUES.clone();
            }
        }

        public /* synthetic */ NewsfeedItemAliexpressCarouselBlockDto(String str, BundleDto bundleDto, String str2, String str3, String str4, UserId userId, int i, Boolean bool, AliexpressBlockPanelDto aliexpressBlockPanelDto, AliexpressPromoCardDto aliexpressPromoCardDto, List list, BaseLinkButtonDto baseLinkButtonDto, AliexpressSocialFooterDto aliexpressSocialFooterDto, Boolean bool2, Boolean bool3, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(str, bundleDto, str2, str3, str4, userId, i, (i2 & 128) != 0 ? null : bool, (i2 & 256) != 0 ? null : aliexpressBlockPanelDto, (i2 & 512) != 0 ? null : aliexpressPromoCardDto, (i2 & 1024) != 0 ? null : list, (i2 & 2048) != 0 ? null : baseLinkButtonDto, (i2 & 4096) != 0 ? null : aliexpressSocialFooterDto, (i2 & 8192) != 0 ? null : bool2, (i2 & 16384) != 0 ? null : bool3, (32768 & i2) != 0 ? null : f, (i2 & 65536) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemAliexpressCarouselBlockDto)) {
                return false;
            }
            NewsfeedItemAliexpressCarouselBlockDto newsfeedItemAliexpressCarouselBlockDto = (NewsfeedItemAliexpressCarouselBlockDto) obj;
            return epx.f(this.type, newsfeedItemAliexpressCarouselBlockDto.type) && this.bundle == newsfeedItemAliexpressCarouselBlockDto.bundle && epx.f(this.blockTitle, newsfeedItemAliexpressCarouselBlockDto.blockTitle) && epx.f(this.trackCode, newsfeedItemAliexpressCarouselBlockDto.trackCode) && epx.f(this.goodsCarouselViewType, newsfeedItemAliexpressCarouselBlockDto.goodsCarouselViewType) && epx.f(this.sourceId, newsfeedItemAliexpressCarouselBlockDto.sourceId) && this.date == newsfeedItemAliexpressCarouselBlockDto.date && epx.f(this.canBeFiltered, newsfeedItemAliexpressCarouselBlockDto.canBeFiltered) && epx.f(this.blockPanel, newsfeedItemAliexpressCarouselBlockDto.blockPanel) && epx.f(this.promoCard, newsfeedItemAliexpressCarouselBlockDto.promoCard) && epx.f(this.items, newsfeedItemAliexpressCarouselBlockDto.items) && epx.f(this.moreButton, newsfeedItemAliexpressCarouselBlockDto.moreButton) && epx.f(this.footer, newsfeedItemAliexpressCarouselBlockDto.footer) && epx.f(this.useOnelineProductTitle, newsfeedItemAliexpressCarouselBlockDto.useOnelineProductTitle) && epx.f(this.isAsync, newsfeedItemAliexpressCarouselBlockDto.isAsync) && epx.f(this.shortTextRate, newsfeedItemAliexpressCarouselBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedItemAliexpressCarouselBlockDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(urd0.a(urd0.a(urd0.a((this.bundle.hashCode() + (this.type.hashCode() * 31)) * 31, 31, this.blockTitle), 31, this.trackCode), 31, this.goodsCarouselViewType), 31, this.sourceId.b), 31);
            Boolean bool = this.canBeFiltered;
            int hashCode = (a + (bool == null ? 0 : bool.hashCode())) * 31;
            AliexpressBlockPanelDto aliexpressBlockPanelDto = this.blockPanel;
            int hashCode2 = (hashCode + (aliexpressBlockPanelDto == null ? 0 : aliexpressBlockPanelDto.hashCode())) * 31;
            AliexpressPromoCardDto aliexpressPromoCardDto = this.promoCard;
            int hashCode3 = (hashCode2 + (aliexpressPromoCardDto == null ? 0 : aliexpressPromoCardDto.hashCode())) * 31;
            List<AliexpressCarouselItemDto> list = this.items;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            BaseLinkButtonDto baseLinkButtonDto = this.moreButton;
            int hashCode5 = (hashCode4 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
            AliexpressSocialFooterDto aliexpressSocialFooterDto = this.footer;
            int hashCode6 = (hashCode5 + (aliexpressSocialFooterDto == null ? 0 : aliexpressSocialFooterDto.hashCode())) * 31;
            Boolean bool2 = this.useOnelineProductTitle;
            int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isAsync;
            int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode9 = (hashCode8 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode9 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            String str = this.type;
            BundleDto bundleDto = this.bundle;
            String str2 = this.blockTitle;
            String str3 = this.trackCode;
            String str4 = this.goodsCarouselViewType;
            UserId userId = this.sourceId;
            int i = this.date;
            Boolean bool = this.canBeFiltered;
            AliexpressBlockPanelDto aliexpressBlockPanelDto = this.blockPanel;
            AliexpressPromoCardDto aliexpressPromoCardDto = this.promoCard;
            List<AliexpressCarouselItemDto> list = this.items;
            BaseLinkButtonDto baseLinkButtonDto = this.moreButton;
            AliexpressSocialFooterDto aliexpressSocialFooterDto = this.footer;
            Boolean bool2 = this.useOnelineProductTitle;
            Boolean bool3 = this.isAsync;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemAliexpressCarouselBlockDto(type=");
            sb.append(str);
            sb.append(", bundle=");
            sb.append(bundleDto);
            sb.append(", blockTitle=");
            n6j.b(sb, str2, ", trackCode=", str3, ", goodsCarouselViewType=");
            sb.append(str4);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i);
            sb.append(", canBeFiltered=");
            sb.append(bool);
            sb.append(", blockPanel=");
            sb.append(aliexpressBlockPanelDto);
            sb.append(", promoCard=");
            sb.append(aliexpressPromoCardDto);
            sb.append(", items=");
            sb.append(list);
            sb.append(", moreButton=");
            sb.append(baseLinkButtonDto);
            sb.append(", footer=");
            sb.append(aliexpressSocialFooterDto);
            sb.append(", useOnelineProductTitle=");
            sb.append(bool2);
            sb.append(", isAsync=");
            sb.append(bool3);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            return zn.b(sb, newsfeedItemWallpostFeedbackDto, ")");
        }

        public NewsfeedItemAliexpressCarouselBlockDto(String str, BundleDto bundleDto, String str2, String str3, String str4, UserId userId, int i, Boolean bool, AliexpressBlockPanelDto aliexpressBlockPanelDto, AliexpressPromoCardDto aliexpressPromoCardDto, List<AliexpressCarouselItemDto> list, BaseLinkButtonDto baseLinkButtonDto, AliexpressSocialFooterDto aliexpressSocialFooterDto, Boolean bool2, Boolean bool3, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.type = str;
            this.bundle = bundleDto;
            this.blockTitle = str2;
            this.trackCode = str3;
            this.goodsCarouselViewType = str4;
            this.sourceId = userId;
            this.date = i;
            this.canBeFiltered = bool;
            this.blockPanel = aliexpressBlockPanelDto;
            this.promoCard = aliexpressPromoCardDto;
            this.items = list;
            this.moreButton = baseLinkButtonDto;
            this.footer = aliexpressSocialFooterDto;
            this.useOnelineProductTitle = bool2;
            this.isAsync = bool3;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemAnimatedBlockDto extends NewsfeedNewsfeedItemDto {

        @pmi0("animation")
        private final NewsfeedItemAnimatedBlockAnimationDto animation;

        @pmi0("block_id")
        private final String blockId;

        @pmi0("button")
        private final BaseLinkButtonDto button;

        @pmi0("date")
        private final int date;

        @pmi0("decoration")
        private final DecorationDto decoration;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("subtitle")
        private final String subtitle;

        @pmi0("text")
        private final String text;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class DecorationDto {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ DecorationDto[] $VALUES;

            @pmi0(L2.g)
            public static final DecorationDto BACKGROUND;

            @pmi0("card")
            public static final DecorationDto CARD;

            @pmi0("none")
            public static final DecorationDto NONE;
            private final String value;

            static {
                DecorationDto decorationDto = new DecorationDto("NONE", 0, "none");
                NONE = decorationDto;
                DecorationDto decorationDto2 = new DecorationDto("BACKGROUND", 1, L2.g);
                BACKGROUND = decorationDto2;
                DecorationDto decorationDto3 = new DecorationDto("CARD", 2, "card");
                CARD = decorationDto3;
                DecorationDto[] decorationDtoArr = {decorationDto, decorationDto2, decorationDto3};
                $VALUES = decorationDtoArr;
                $ENTRIES = new asp(decorationDtoArr);
            }

            private DecorationDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static DecorationDto valueOf(String str) {
                return (DecorationDto) Enum.valueOf(DecorationDto.class, str);
            }

            public static DecorationDto[] values() {
                return (DecorationDto[]) $VALUES.clone();
            }
        }

        public /* synthetic */ NewsfeedItemAnimatedBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, String str2, NewsfeedItemAnimatedBlockAnimationDto newsfeedItemAnimatedBlockAnimationDto, DecorationDto decorationDto, String str3, BaseLinkButtonDto baseLinkButtonDto, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : newsfeedItemAnimatedBlockAnimationDto, (i2 & 64) != 0 ? null : decorationDto, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? null : baseLinkButtonDto, (i2 & 512) != 0 ? null : bool, (i2 & 1024) != 0 ? null : f, (i2 & 2048) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemAnimatedBlockDto)) {
                return false;
            }
            NewsfeedItemAnimatedBlockDto newsfeedItemAnimatedBlockDto = (NewsfeedItemAnimatedBlockDto) obj;
            return this.type == newsfeedItemAnimatedBlockDto.type && epx.f(this.sourceId, newsfeedItemAnimatedBlockDto.sourceId) && this.date == newsfeedItemAnimatedBlockDto.date && epx.f(this.blockId, newsfeedItemAnimatedBlockDto.blockId) && epx.f(this.text, newsfeedItemAnimatedBlockDto.text) && epx.f(this.animation, newsfeedItemAnimatedBlockDto.animation) && this.decoration == newsfeedItemAnimatedBlockDto.decoration && epx.f(this.subtitle, newsfeedItemAnimatedBlockDto.subtitle) && epx.f(this.button, newsfeedItemAnimatedBlockDto.button) && epx.f(this.isAsync, newsfeedItemAnimatedBlockDto.isAsync) && epx.f(this.shortTextRate, newsfeedItemAnimatedBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedItemAnimatedBlockDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            String str = this.blockId;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.text;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            NewsfeedItemAnimatedBlockAnimationDto newsfeedItemAnimatedBlockAnimationDto = this.animation;
            int hashCode3 = (hashCode2 + (newsfeedItemAnimatedBlockAnimationDto == null ? 0 : newsfeedItemAnimatedBlockAnimationDto.hashCode())) * 31;
            DecorationDto decorationDto = this.decoration;
            int hashCode4 = (hashCode3 + (decorationDto == null ? 0 : decorationDto.hashCode())) * 31;
            String str3 = this.subtitle;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            BaseLinkButtonDto baseLinkButtonDto = this.button;
            int hashCode6 = (hashCode5 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode8 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            String str = this.blockId;
            String str2 = this.text;
            NewsfeedItemAnimatedBlockAnimationDto newsfeedItemAnimatedBlockAnimationDto = this.animation;
            DecorationDto decorationDto = this.decoration;
            String str3 = this.subtitle;
            BaseLinkButtonDto baseLinkButtonDto = this.button;
            Boolean bool = this.isAsync;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemAnimatedBlockDto(type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            jax0.a(i, ", blockId=", str, ", text=", sb);
            sb.append(str2);
            sb.append(", animation=");
            sb.append(newsfeedItemAnimatedBlockAnimationDto);
            sb.append(", decoration=");
            sb.append(decorationDto);
            sb.append(", subtitle=");
            sb.append(str3);
            sb.append(", button=");
            sb.append(baseLinkButtonDto);
            sb.append(", isAsync=");
            sb.append(bool);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            sb.append(newsfeedItemWallpostFeedbackDto);
            sb.append(")");
            return sb.toString();
        }

        public NewsfeedItemAnimatedBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, String str2, NewsfeedItemAnimatedBlockAnimationDto newsfeedItemAnimatedBlockAnimationDto, DecorationDto decorationDto, String str3, BaseLinkButtonDto baseLinkButtonDto, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.blockId = str;
            this.text = str2;
            this.animation = newsfeedItemAnimatedBlockAnimationDto;
            this.decoration = decorationDto;
            this.subtitle = str3;
            this.button = baseLinkButtonDto;
            this.isAsync = bool;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemAppsCarouselDto extends NewsfeedNewsfeedItemDto {

        @pmi0("button")
        private final DiscoverCarouselButtonDto button;

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("items")
        private final List<DiscoverCarouselItemDto> items;

        @pmi0("objects")
        private final List<AppsAppDto> objects;

        @pmi0("objects_type")
        private final DiscoverCarouselObjectsTypeDto objectsType;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedItemAppsCarouselDto(DiscoverCarouselButtonDto discoverCarouselButtonDto, List list, String str, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, List list2, DiscoverCarouselObjectsTypeDto discoverCarouselObjectsTypeDto, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(discoverCarouselButtonDto, list, str, newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 64) != 0 ? null : list2, (i2 & 128) != 0 ? null : discoverCarouselObjectsTypeDto, (i2 & 256) != 0 ? null : bool, (i2 & 512) != 0 ? null : f, (i2 & 1024) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemAppsCarouselDto)) {
                return false;
            }
            NewsfeedItemAppsCarouselDto newsfeedItemAppsCarouselDto = (NewsfeedItemAppsCarouselDto) obj;
            return epx.f(this.button, newsfeedItemAppsCarouselDto.button) && epx.f(this.items, newsfeedItemAppsCarouselDto.items) && epx.f(this.title, newsfeedItemAppsCarouselDto.title) && this.type == newsfeedItemAppsCarouselDto.type && epx.f(this.sourceId, newsfeedItemAppsCarouselDto.sourceId) && this.date == newsfeedItemAppsCarouselDto.date && epx.f(this.objects, newsfeedItemAppsCarouselDto.objects) && this.objectsType == newsfeedItemAppsCarouselDto.objectsType && epx.f(this.isAsync, newsfeedItemAppsCarouselDto.isAsync) && epx.f(this.shortTextRate, newsfeedItemAppsCarouselDto.shortTextRate) && epx.f(this.feedback, newsfeedItemAppsCarouselDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a((this.type.hashCode() + urd0.a(fw3.a(this.button.hashCode() * 31, 31, this.items), 31, this.title)) * 31, 31, this.sourceId.b), 31);
            List<AppsAppDto> list = this.objects;
            int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
            DiscoverCarouselObjectsTypeDto discoverCarouselObjectsTypeDto = this.objectsType;
            int hashCode2 = (hashCode + (discoverCarouselObjectsTypeDto == null ? 0 : discoverCarouselObjectsTypeDto.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode4 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            DiscoverCarouselButtonDto discoverCarouselButtonDto = this.button;
            List<DiscoverCarouselItemDto> list = this.items;
            String str = this.title;
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            List<AppsAppDto> list2 = this.objects;
            DiscoverCarouselObjectsTypeDto discoverCarouselObjectsTypeDto = this.objectsType;
            Boolean bool = this.isAsync;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemAppsCarouselDto(button=");
            sb.append(discoverCarouselButtonDto);
            sb.append(", items=");
            sb.append(list);
            sb.append(", title=");
            sb.append(str);
            sb.append(", type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i);
            sb.append(", objects=");
            sb.append(list2);
            sb.append(", objectsType=");
            sb.append(discoverCarouselObjectsTypeDto);
            sb.append(", isAsync=");
            sb.append(bool);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            return zn.b(sb, newsfeedItemWallpostFeedbackDto, ")");
        }

        public NewsfeedItemAppsCarouselDto(DiscoverCarouselButtonDto discoverCarouselButtonDto, List<DiscoverCarouselItemDto> list, String str, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, List<AppsAppDto> list2, DiscoverCarouselObjectsTypeDto discoverCarouselObjectsTypeDto, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.button = discoverCarouselButtonDto;
            this.items = list;
            this.title = str;
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.objects = list2;
            this.objectsType = discoverCarouselObjectsTypeDto;
            this.isAsync = bool;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemAudioDto extends NewsfeedNewsfeedItemDto {

        @pmi0("audio")
        private final NewsfeedItemAudioAudioDto audio;

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedItemAudioDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, NewsfeedItemAudioAudioDto newsfeedItemAudioAudioDto, Integer num, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : newsfeedItemAudioAudioDto, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : f, (i2 & 64) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemAudioDto)) {
                return false;
            }
            NewsfeedItemAudioDto newsfeedItemAudioDto = (NewsfeedItemAudioDto) obj;
            return this.type == newsfeedItemAudioDto.type && epx.f(this.sourceId, newsfeedItemAudioDto.sourceId) && this.date == newsfeedItemAudioDto.date && epx.f(this.audio, newsfeedItemAudioDto.audio) && epx.f(this.postId, newsfeedItemAudioDto.postId) && epx.f(this.shortTextRate, newsfeedItemAudioDto.shortTextRate) && epx.f(this.feedback, newsfeedItemAudioDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            NewsfeedItemAudioAudioDto newsfeedItemAudioAudioDto = this.audio;
            int hashCode = (a + (newsfeedItemAudioAudioDto == null ? 0 : newsfeedItemAudioAudioDto.hashCode())) * 31;
            Integer num = this.postId;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode3 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            NewsfeedItemAudioAudioDto newsfeedItemAudioAudioDto = this.audio;
            Integer num = this.postId;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemAudioDto(type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i);
            sb.append(", audio=");
            sb.append(newsfeedItemAudioAudioDto);
            sb.append(", postId=");
            sb.append(num);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            return zn.b(sb, newsfeedItemWallpostFeedbackDto, ")");
        }

        public NewsfeedItemAudioDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, NewsfeedItemAudioAudioDto newsfeedItemAudioAudioDto, Integer num, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.audio = newsfeedItemAudioAudioDto;
            this.postId = num;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemAudioPlaylistDto extends NewsfeedNewsfeedItemDto {

        @pmi0("audio_playlist")
        private final NewsfeedItemAudioPlaylistElementsDto audioPlaylist;

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedItemAudioPlaylistDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, NewsfeedItemAudioPlaylistElementsDto newsfeedItemAudioPlaylistElementsDto, Integer num, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : newsfeedItemAudioPlaylistElementsDto, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : f, (i2 & 64) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemAudioPlaylistDto)) {
                return false;
            }
            NewsfeedItemAudioPlaylistDto newsfeedItemAudioPlaylistDto = (NewsfeedItemAudioPlaylistDto) obj;
            return this.type == newsfeedItemAudioPlaylistDto.type && epx.f(this.sourceId, newsfeedItemAudioPlaylistDto.sourceId) && this.date == newsfeedItemAudioPlaylistDto.date && epx.f(this.audioPlaylist, newsfeedItemAudioPlaylistDto.audioPlaylist) && epx.f(this.postId, newsfeedItemAudioPlaylistDto.postId) && epx.f(this.shortTextRate, newsfeedItemAudioPlaylistDto.shortTextRate) && epx.f(this.feedback, newsfeedItemAudioPlaylistDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            NewsfeedItemAudioPlaylistElementsDto newsfeedItemAudioPlaylistElementsDto = this.audioPlaylist;
            int hashCode = (a + (newsfeedItemAudioPlaylistElementsDto == null ? 0 : newsfeedItemAudioPlaylistElementsDto.hashCode())) * 31;
            Integer num = this.postId;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode3 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            NewsfeedItemAudioPlaylistElementsDto newsfeedItemAudioPlaylistElementsDto = this.audioPlaylist;
            Integer num = this.postId;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemAudioPlaylistDto(type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i);
            sb.append(", audioPlaylist=");
            sb.append(newsfeedItemAudioPlaylistElementsDto);
            sb.append(", postId=");
            sb.append(num);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            return zn.b(sb, newsfeedItemWallpostFeedbackDto, ")");
        }

        public NewsfeedItemAudioPlaylistDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, NewsfeedItemAudioPlaylistElementsDto newsfeedItemAudioPlaylistElementsDto, Integer num, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.audioPlaylist = newsfeedItemAudioPlaylistElementsDto;
            this.postId = num;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemBookmarkGameBlockDto extends NewsfeedNewsfeedItemDto {

        /* renamed from: app, reason: collision with root package name */
        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        private final AppsAppDto f90app;

        @pmi0("app_avatar")
        private final List<BaseImageDto> appAvatar;

        @pmi0("app_cover")
        private final List<BaseImageDto> appCover;

        @pmi0("button_text")
        private final String buttonText;

        @pmi0("date")
        private final int date;

        @pmi0("description_text")
        private final String descriptionText;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("friends_avatars")
        private final List<List<BaseImageDto>> friendsAvatars;

        @pmi0("friends_ids")
        private final List<UserId> friendsIds;

        @pmi0("friends_playing_text")
        private final String friendsPlayingText;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedItemBookmarkGameBlockDto(AppsAppDto appsAppDto, String str, String str2, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str3, List list, List list2, List list3, String str4, List list4, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(appsAppDto, str, str2, newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : list, (i2 & 256) != 0 ? null : list2, (i2 & 512) != 0 ? null : list3, (i2 & 1024) != 0 ? null : str4, (i2 & 2048) != 0 ? null : list4, (i2 & 4096) != 0 ? null : bool, (i2 & 8192) != 0 ? null : f, (i2 & 16384) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemBookmarkGameBlockDto)) {
                return false;
            }
            NewsfeedItemBookmarkGameBlockDto newsfeedItemBookmarkGameBlockDto = (NewsfeedItemBookmarkGameBlockDto) obj;
            return epx.f(this.f90app, newsfeedItemBookmarkGameBlockDto.f90app) && epx.f(this.title, newsfeedItemBookmarkGameBlockDto.title) && epx.f(this.buttonText, newsfeedItemBookmarkGameBlockDto.buttonText) && this.type == newsfeedItemBookmarkGameBlockDto.type && epx.f(this.sourceId, newsfeedItemBookmarkGameBlockDto.sourceId) && this.date == newsfeedItemBookmarkGameBlockDto.date && epx.f(this.friendsPlayingText, newsfeedItemBookmarkGameBlockDto.friendsPlayingText) && epx.f(this.friendsIds, newsfeedItemBookmarkGameBlockDto.friendsIds) && epx.f(this.appCover, newsfeedItemBookmarkGameBlockDto.appCover) && epx.f(this.appAvatar, newsfeedItemBookmarkGameBlockDto.appAvatar) && epx.f(this.descriptionText, newsfeedItemBookmarkGameBlockDto.descriptionText) && epx.f(this.friendsAvatars, newsfeedItemBookmarkGameBlockDto.friendsAvatars) && epx.f(this.isAsync, newsfeedItemBookmarkGameBlockDto.isAsync) && epx.f(this.shortTextRate, newsfeedItemBookmarkGameBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedItemBookmarkGameBlockDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a((this.type.hashCode() + urd0.a(urd0.a(this.f90app.hashCode() * 31, 31, this.title), 31, this.buttonText)) * 31, 31, this.sourceId.b), 31);
            String str = this.friendsPlayingText;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            List<UserId> list = this.friendsIds;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<BaseImageDto> list2 = this.appCover;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<BaseImageDto> list3 = this.appAvatar;
            int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
            String str2 = this.descriptionText;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<List<BaseImageDto>> list4 = this.friendsAvatars;
            int hashCode6 = (hashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode8 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            AppsAppDto appsAppDto = this.f90app;
            String str = this.title;
            String str2 = this.buttonText;
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            String str3 = this.friendsPlayingText;
            List<UserId> list = this.friendsIds;
            List<BaseImageDto> list2 = this.appCover;
            List<BaseImageDto> list3 = this.appAvatar;
            String str4 = this.descriptionText;
            List<List<BaseImageDto>> list4 = this.friendsAvatars;
            Boolean bool = this.isAsync;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemBookmarkGameBlockDto(app=");
            sb.append(appsAppDto);
            sb.append(", title=");
            sb.append(str);
            sb.append(", buttonText=");
            sb.append(str2);
            sb.append(", type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i);
            sb.append(", friendsPlayingText=");
            b.c(str3, ", friendsIds=", ", appCover=", sb, list);
            vq.d(sb, list2, ", appAvatar=", list3, ", descriptionText=");
            b.c(str4, ", friendsAvatars=", ", isAsync=", sb, list4);
            sb.append(bool);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            return zn.b(sb, newsfeedItemWallpostFeedbackDto, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NewsfeedItemBookmarkGameBlockDto(AppsAppDto appsAppDto, String str, String str2, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str3, List<UserId> list, List<BaseImageDto> list2, List<BaseImageDto> list3, String str4, List<? extends List<BaseImageDto>> list4, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.f90app = appsAppDto;
            this.title = str;
            this.buttonText = str2;
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.friendsPlayingText = str3;
            this.friendsIds = list;
            this.appCover = list2;
            this.appAvatar = list3;
            this.descriptionText = str4;
            this.friendsAvatars = list4;
            this.isAsync = bool;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemClipsBlockDto extends NewsfeedNewsfeedItemDto {

        @pmi0("button")
        private final BaseLinkButtonDto button;

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("items")
        private final List<VideoVideoDto> items;

        @pmi0("next_from")
        private final String nextFrom;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedItemClipsBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, List list, String str2, BaseLinkButtonDto baseLinkButtonDto, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : baseLinkButtonDto, (i2 & 128) != 0 ? null : bool, (i2 & 256) != 0 ? null : f, (i2 & 512) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemClipsBlockDto)) {
                return false;
            }
            NewsfeedItemClipsBlockDto newsfeedItemClipsBlockDto = (NewsfeedItemClipsBlockDto) obj;
            return this.type == newsfeedItemClipsBlockDto.type && epx.f(this.sourceId, newsfeedItemClipsBlockDto.sourceId) && this.date == newsfeedItemClipsBlockDto.date && epx.f(this.title, newsfeedItemClipsBlockDto.title) && epx.f(this.items, newsfeedItemClipsBlockDto.items) && epx.f(this.nextFrom, newsfeedItemClipsBlockDto.nextFrom) && epx.f(this.button, newsfeedItemClipsBlockDto.button) && epx.f(this.isAsync, newsfeedItemClipsBlockDto.isAsync) && epx.f(this.shortTextRate, newsfeedItemClipsBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedItemClipsBlockDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            String str = this.title;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            List<VideoVideoDto> list = this.items;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.nextFrom;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            BaseLinkButtonDto baseLinkButtonDto = this.button;
            int hashCode4 = (hashCode3 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode6 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            String str = this.title;
            List<VideoVideoDto> list = this.items;
            String str2 = this.nextFrom;
            BaseLinkButtonDto baseLinkButtonDto = this.button;
            Boolean bool = this.isAsync;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemClipsBlockDto(type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            jax0.a(i, ", title=", str, ", items=", sb);
            vr.c(", nextFrom=", str2, ", button=", sb, list);
            sb.append(baseLinkButtonDto);
            sb.append(", isAsync=");
            sb.append(bool);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            sb.append(newsfeedItemWallpostFeedbackDto);
            sb.append(")");
            return sb.toString();
        }

        public NewsfeedItemClipsBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, List<VideoVideoDto> list, String str2, BaseLinkButtonDto baseLinkButtonDto, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.title = str;
            this.items = list;
            this.nextFrom = str2;
            this.button = baseLinkButtonDto;
            this.isAsync = bool;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemClipsChallengesBlockUmbrellaDto extends NewsfeedNewsfeedItemDto {

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("items")
        private final List<ShortVideoChallengeFeedItemDto> items;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedItemClipsChallengesBlockUmbrellaDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, List list, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : f, (i2 & 128) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemClipsChallengesBlockUmbrellaDto)) {
                return false;
            }
            NewsfeedItemClipsChallengesBlockUmbrellaDto newsfeedItemClipsChallengesBlockUmbrellaDto = (NewsfeedItemClipsChallengesBlockUmbrellaDto) obj;
            return this.type == newsfeedItemClipsChallengesBlockUmbrellaDto.type && epx.f(this.sourceId, newsfeedItemClipsChallengesBlockUmbrellaDto.sourceId) && this.date == newsfeedItemClipsChallengesBlockUmbrellaDto.date && epx.f(this.title, newsfeedItemClipsChallengesBlockUmbrellaDto.title) && epx.f(this.items, newsfeedItemClipsChallengesBlockUmbrellaDto.items) && epx.f(this.isAsync, newsfeedItemClipsChallengesBlockUmbrellaDto.isAsync) && epx.f(this.shortTextRate, newsfeedItemClipsChallengesBlockUmbrellaDto.shortTextRate) && epx.f(this.feedback, newsfeedItemClipsChallengesBlockUmbrellaDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            String str = this.title;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            List<ShortVideoChallengeFeedItemDto> list = this.items;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode4 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            String str = this.title;
            List<ShortVideoChallengeFeedItemDto> list = this.items;
            Boolean bool = this.isAsync;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemClipsChallengesBlockUmbrellaDto(type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            jax0.a(i, ", title=", str, ", items=", sb);
            sb.append(list);
            sb.append(", isAsync=");
            sb.append(bool);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            sb.append(newsfeedItemWallpostFeedbackDto);
            sb.append(")");
            return sb.toString();
        }

        public NewsfeedItemClipsChallengesBlockUmbrellaDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, List<ShortVideoChallengeFeedItemDto> list, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.title = str;
            this.items = list;
            this.isAsync = bool;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemDigestDto extends NewsfeedNewsfeedItemDto {

        @pmi0("date")
        private final int date;

        @pmi0("feed_id")
        private final String feedId;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("footer")
        private final NewsfeedItemDigestFooterDto footer;

        @pmi0("header")
        private final NewsfeedItemDigestHeaderDto header;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("items")
        private final List<NewsfeedItemDigestItemDto> items;

        @pmi0("main_post_ids")
        private final List<String> mainPostIds;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("template")
        private final TemplateDto template;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class TemplateDto {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TemplateDto[] $VALUES;

            @pmi0("grid")
            public static final TemplateDto GRID;

            @pmi0("list")
            public static final TemplateDto LIST;

            @pmi0(Ad.d)
            public static final TemplateDto SINGLE;
            private final String value;

            static {
                TemplateDto templateDto = new TemplateDto("LIST", 0, "list");
                LIST = templateDto;
                TemplateDto templateDto2 = new TemplateDto(SignalingProtocol.KEY_GRID, 1, "grid");
                GRID = templateDto2;
                TemplateDto templateDto3 = new TemplateDto("SINGLE", 2, Ad.d);
                SINGLE = templateDto3;
                TemplateDto[] templateDtoArr = {templateDto, templateDto2, templateDto3};
                $VALUES = templateDtoArr;
                $ENTRIES = new asp(templateDtoArr);
            }

            private TemplateDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TemplateDto valueOf(String str) {
                return (TemplateDto) Enum.valueOf(TemplateDto.class, str);
            }

            public static TemplateDto[] values() {
                return (TemplateDto[]) $VALUES.clone();
            }
        }

        public /* synthetic */ NewsfeedItemDigestDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, List list, List list2, TemplateDto templateDto, NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto, NewsfeedItemDigestFooterDto newsfeedItemDigestFooterDto, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : list2, (i2 & 64) != 0 ? null : templateDto, (i2 & 128) != 0 ? null : newsfeedItemDigestHeaderDto, (i2 & 256) != 0 ? null : newsfeedItemDigestFooterDto, (i2 & 512) != 0 ? null : bool, (i2 & 1024) != 0 ? null : f, (i2 & 2048) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemDigestDto)) {
                return false;
            }
            NewsfeedItemDigestDto newsfeedItemDigestDto = (NewsfeedItemDigestDto) obj;
            return this.type == newsfeedItemDigestDto.type && epx.f(this.sourceId, newsfeedItemDigestDto.sourceId) && this.date == newsfeedItemDigestDto.date && epx.f(this.feedId, newsfeedItemDigestDto.feedId) && epx.f(this.items, newsfeedItemDigestDto.items) && epx.f(this.mainPostIds, newsfeedItemDigestDto.mainPostIds) && this.template == newsfeedItemDigestDto.template && epx.f(this.header, newsfeedItemDigestDto.header) && epx.f(this.footer, newsfeedItemDigestDto.footer) && epx.f(this.isAsync, newsfeedItemDigestDto.isAsync) && epx.f(this.shortTextRate, newsfeedItemDigestDto.shortTextRate) && epx.f(this.feedback, newsfeedItemDigestDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            String str = this.feedId;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            List<NewsfeedItemDigestItemDto> list = this.items;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.mainPostIds;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            TemplateDto templateDto = this.template;
            int hashCode4 = (hashCode3 + (templateDto == null ? 0 : templateDto.hashCode())) * 31;
            NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto = this.header;
            int hashCode5 = (hashCode4 + (newsfeedItemDigestHeaderDto == null ? 0 : newsfeedItemDigestHeaderDto.hashCode())) * 31;
            NewsfeedItemDigestFooterDto newsfeedItemDigestFooterDto = this.footer;
            int hashCode6 = (hashCode5 + (newsfeedItemDigestFooterDto == null ? 0 : newsfeedItemDigestFooterDto.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode8 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            String str = this.feedId;
            List<NewsfeedItemDigestItemDto> list = this.items;
            List<String> list2 = this.mainPostIds;
            TemplateDto templateDto = this.template;
            NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto = this.header;
            NewsfeedItemDigestFooterDto newsfeedItemDigestFooterDto = this.footer;
            Boolean bool = this.isAsync;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemDigestDto(type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            jax0.a(i, ", feedId=", str, ", items=", sb);
            vq.d(sb, list, ", mainPostIds=", list2, ", template=");
            sb.append(templateDto);
            sb.append(", header=");
            sb.append(newsfeedItemDigestHeaderDto);
            sb.append(", footer=");
            sb.append(newsfeedItemDigestFooterDto);
            sb.append(", isAsync=");
            sb.append(bool);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            sb.append(newsfeedItemWallpostFeedbackDto);
            sb.append(")");
            return sb.toString();
        }

        public NewsfeedItemDigestDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, List<NewsfeedItemDigestItemDto> list, List<String> list2, TemplateDto templateDto, NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto, NewsfeedItemDigestFooterDto newsfeedItemDigestFooterDto, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.feedId = str;
            this.items = list;
            this.mainPostIds = list2;
            this.template = templateDto;
            this.header = newsfeedItemDigestHeaderDto;
            this.footer = newsfeedItemDigestFooterDto;
            this.isAsync = bool;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemExpertCardWidgetDto extends NewsfeedNewsfeedItemDto {

        @pmi0("date")
        private final int date;

        @pmi0("expert_card")
        private final NewsfeedExpertCardWidgetDto expertCard;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("type")
        private final String type;

        public /* synthetic */ NewsfeedItemExpertCardWidgetDto(UserId userId, int i, String str, NewsfeedExpertCardWidgetDto newsfeedExpertCardWidgetDto, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(userId, i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : newsfeedExpertCardWidgetDto, (i2 & 16) != 0 ? null : f, (i2 & 32) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemExpertCardWidgetDto)) {
                return false;
            }
            NewsfeedItemExpertCardWidgetDto newsfeedItemExpertCardWidgetDto = (NewsfeedItemExpertCardWidgetDto) obj;
            return epx.f(this.sourceId, newsfeedItemExpertCardWidgetDto.sourceId) && this.date == newsfeedItemExpertCardWidgetDto.date && epx.f(this.type, newsfeedItemExpertCardWidgetDto.type) && epx.f(this.expertCard, newsfeedItemExpertCardWidgetDto.expertCard) && epx.f(this.shortTextRate, newsfeedItemExpertCardWidgetDto.shortTextRate) && epx.f(this.feedback, newsfeedItemExpertCardWidgetDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, Long.hashCode(this.sourceId.b) * 31, 31);
            String str = this.type;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            NewsfeedExpertCardWidgetDto newsfeedExpertCardWidgetDto = this.expertCard;
            int hashCode2 = (hashCode + (newsfeedExpertCardWidgetDto == null ? 0 : newsfeedExpertCardWidgetDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode3 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            return "NewsfeedItemExpertCardWidgetDto(sourceId=" + this.sourceId + ", date=" + this.date + ", type=" + this.type + ", expertCard=" + this.expertCard + ", shortTextRate=" + this.shortTextRate + ", feedback=" + this.feedback + ")";
        }

        public NewsfeedItemExpertCardWidgetDto(UserId userId, int i, String str, NewsfeedExpertCardWidgetDto newsfeedExpertCardWidgetDto, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.sourceId = userId;
            this.date = i;
            this.type = str;
            this.expertCard = newsfeedExpertCardWidgetDto;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemFeedbackPollDto extends NewsfeedNewsfeedItemDto {

        @pmi0("banner")
        private final NewsfeedItemFeedbackPollBannerDto banner;

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("poll")
        private final NewsfeedItemFeedbackPollPollDto poll;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedItemFeedbackPollDto(NewsfeedItemFeedbackPollBannerDto newsfeedItemFeedbackPollBannerDto, NewsfeedItemFeedbackPollPollDto newsfeedItemFeedbackPollPollDto, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(newsfeedItemFeedbackPollBannerDto, newsfeedItemFeedbackPollPollDto, newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 32) != 0 ? null : f, (i2 & 64) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemFeedbackPollDto)) {
                return false;
            }
            NewsfeedItemFeedbackPollDto newsfeedItemFeedbackPollDto = (NewsfeedItemFeedbackPollDto) obj;
            return epx.f(this.banner, newsfeedItemFeedbackPollDto.banner) && epx.f(this.poll, newsfeedItemFeedbackPollDto.poll) && this.type == newsfeedItemFeedbackPollDto.type && epx.f(this.sourceId, newsfeedItemFeedbackPollDto.sourceId) && this.date == newsfeedItemFeedbackPollDto.date && epx.f(this.shortTextRate, newsfeedItemFeedbackPollDto.shortTextRate) && epx.f(this.feedback, newsfeedItemFeedbackPollDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a((this.type.hashCode() + ((this.poll.hashCode() + (this.banner.hashCode() * 31)) * 31)) * 31, 31, this.sourceId.b), 31);
            Float f = this.shortTextRate;
            int hashCode = (a + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            NewsfeedItemFeedbackPollBannerDto newsfeedItemFeedbackPollBannerDto = this.banner;
            NewsfeedItemFeedbackPollPollDto newsfeedItemFeedbackPollPollDto = this.poll;
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemFeedbackPollDto(banner=");
            sb.append(newsfeedItemFeedbackPollBannerDto);
            sb.append(", poll=");
            sb.append(newsfeedItemFeedbackPollPollDto);
            sb.append(", type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            return zn.b(sb, newsfeedItemWallpostFeedbackDto, ")");
        }

        public NewsfeedItemFeedbackPollDto(NewsfeedItemFeedbackPollBannerDto newsfeedItemFeedbackPollBannerDto, NewsfeedItemFeedbackPollPollDto newsfeedItemFeedbackPollPollDto, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.banner = newsfeedItemFeedbackPollBannerDto;
            this.poll = newsfeedItemFeedbackPollPollDto;
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemFriendDto extends NewsfeedNewsfeedItemDto {

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("friends")
        private final NewsfeedItemFriendFriendsDto friends;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedItemFriendDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, NewsfeedItemFriendFriendsDto newsfeedItemFriendFriendsDto, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : newsfeedItemFriendFriendsDto, (i2 & 16) != 0 ? null : f, (i2 & 32) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemFriendDto)) {
                return false;
            }
            NewsfeedItemFriendDto newsfeedItemFriendDto = (NewsfeedItemFriendDto) obj;
            return this.type == newsfeedItemFriendDto.type && epx.f(this.sourceId, newsfeedItemFriendDto.sourceId) && this.date == newsfeedItemFriendDto.date && epx.f(this.friends, newsfeedItemFriendDto.friends) && epx.f(this.shortTextRate, newsfeedItemFriendDto.shortTextRate) && epx.f(this.feedback, newsfeedItemFriendDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            NewsfeedItemFriendFriendsDto newsfeedItemFriendFriendsDto = this.friends;
            int hashCode = (a + (newsfeedItemFriendFriendsDto == null ? 0 : newsfeedItemFriendFriendsDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode2 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            return "NewsfeedItemFriendDto(type=" + this.type + ", sourceId=" + this.sourceId + ", date=" + this.date + ", friends=" + this.friends + ", shortTextRate=" + this.shortTextRate + ", feedback=" + this.feedback + ")";
        }

        public NewsfeedItemFriendDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, NewsfeedItemFriendFriendsDto newsfeedItemFriendFriendsDto, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.friends = newsfeedItemFriendFriendsDto;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemFriendsEntrypointsBlockDto extends NewsfeedNewsfeedItemDto {

        @pmi0("date")
        private final int date;

        @pmi0("entrypoints")
        private final FriendsEntrypointsDto entrypoints;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("type")
        private final String type;

        public /* synthetic */ NewsfeedItemFriendsEntrypointsBlockDto(UserId userId, int i, String str, FriendsEntrypointsDto friendsEntrypointsDto, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(userId, i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : friendsEntrypointsDto, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : f, (i2 & 64) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemFriendsEntrypointsBlockDto)) {
                return false;
            }
            NewsfeedItemFriendsEntrypointsBlockDto newsfeedItemFriendsEntrypointsBlockDto = (NewsfeedItemFriendsEntrypointsBlockDto) obj;
            return epx.f(this.sourceId, newsfeedItemFriendsEntrypointsBlockDto.sourceId) && this.date == newsfeedItemFriendsEntrypointsBlockDto.date && epx.f(this.type, newsfeedItemFriendsEntrypointsBlockDto.type) && epx.f(this.entrypoints, newsfeedItemFriendsEntrypointsBlockDto.entrypoints) && epx.f(this.isAsync, newsfeedItemFriendsEntrypointsBlockDto.isAsync) && epx.f(this.shortTextRate, newsfeedItemFriendsEntrypointsBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedItemFriendsEntrypointsBlockDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, Long.hashCode(this.sourceId.b) * 31, 31);
            String str = this.type;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            FriendsEntrypointsDto friendsEntrypointsDto = this.entrypoints;
            int hashCode2 = (hashCode + (friendsEntrypointsDto == null ? 0 : friendsEntrypointsDto.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode4 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            UserId userId = this.sourceId;
            int i = this.date;
            String str = this.type;
            FriendsEntrypointsDto friendsEntrypointsDto = this.entrypoints;
            Boolean bool = this.isAsync;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemFriendsEntrypointsBlockDto(sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i);
            sb.append(", type=");
            sb.append(str);
            sb.append(", entrypoints=");
            sb.append(friendsEntrypointsDto);
            sb.append(", isAsync=");
            sb.append(bool);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            return zn.b(sb, newsfeedItemWallpostFeedbackDto, ")");
        }

        public NewsfeedItemFriendsEntrypointsBlockDto(UserId userId, int i, String str, FriendsEntrypointsDto friendsEntrypointsDto, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.sourceId = userId;
            this.date = i;
            this.type = str;
            this.entrypoints = friendsEntrypointsDto;
            this.isAsync = bool;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemFriendsRecommendBlockDto extends NewsfeedNewsfeedItemDto {

        @pmi0("account_import_block_pos")
        private final Integer accountImportBlockPos;

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("footer")
        private final FriendsRecBlockFooterDto footer;

        @pmi0("info_card")
        private final FriendsRecBlockInfoCardDto infoCard;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("next_from")
        private final String nextFrom;

        @pmi0("profiles")
        private final List<FriendsRecProfileDto> profiles;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final String type;

        public /* synthetic */ NewsfeedItemFriendsRecommendBlockDto(String str, List list, int i, UserId userId, String str2, FriendsRecBlockInfoCardDto friendsRecBlockInfoCardDto, Integer num, FriendsRecBlockFooterDto friendsRecBlockFooterDto, String str3, String str4, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(str, list, i, (i2 & 8) != 0 ? null : userId, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : friendsRecBlockInfoCardDto, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : friendsRecBlockFooterDto, (i2 & 256) != 0 ? null : str3, (i2 & 512) != 0 ? null : str4, (i2 & 1024) != 0 ? null : bool, (i2 & 2048) != 0 ? null : f, (i2 & 4096) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemFriendsRecommendBlockDto)) {
                return false;
            }
            NewsfeedItemFriendsRecommendBlockDto newsfeedItemFriendsRecommendBlockDto = (NewsfeedItemFriendsRecommendBlockDto) obj;
            return epx.f(this.title, newsfeedItemFriendsRecommendBlockDto.title) && epx.f(this.profiles, newsfeedItemFriendsRecommendBlockDto.profiles) && this.date == newsfeedItemFriendsRecommendBlockDto.date && epx.f(this.sourceId, newsfeedItemFriendsRecommendBlockDto.sourceId) && epx.f(this.nextFrom, newsfeedItemFriendsRecommendBlockDto.nextFrom) && epx.f(this.infoCard, newsfeedItemFriendsRecommendBlockDto.infoCard) && epx.f(this.accountImportBlockPos, newsfeedItemFriendsRecommendBlockDto.accountImportBlockPos) && epx.f(this.footer, newsfeedItemFriendsRecommendBlockDto.footer) && epx.f(this.trackCode, newsfeedItemFriendsRecommendBlockDto.trackCode) && epx.f(this.type, newsfeedItemFriendsRecommendBlockDto.type) && epx.f(this.isAsync, newsfeedItemFriendsRecommendBlockDto.isAsync) && epx.f(this.shortTextRate, newsfeedItemFriendsRecommendBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedItemFriendsRecommendBlockDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, fw3.a(this.title.hashCode() * 31, 31, this.profiles), 31);
            UserId userId = this.sourceId;
            int hashCode = (a + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            String str = this.nextFrom;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            FriendsRecBlockInfoCardDto friendsRecBlockInfoCardDto = this.infoCard;
            int hashCode3 = (hashCode2 + (friendsRecBlockInfoCardDto == null ? 0 : friendsRecBlockInfoCardDto.hashCode())) * 31;
            Integer num = this.accountImportBlockPos;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            FriendsRecBlockFooterDto friendsRecBlockFooterDto = this.footer;
            int hashCode5 = (hashCode4 + (friendsRecBlockFooterDto == null ? 0 : friendsRecBlockFooterDto.hashCode())) * 31;
            String str2 = this.trackCode;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.type;
            int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode9 = (hashCode8 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode9 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            String str = this.title;
            List<FriendsRecProfileDto> list = this.profiles;
            int i = this.date;
            UserId userId = this.sourceId;
            String str2 = this.nextFrom;
            FriendsRecBlockInfoCardDto friendsRecBlockInfoCardDto = this.infoCard;
            Integer num = this.accountImportBlockPos;
            FriendsRecBlockFooterDto friendsRecBlockFooterDto = this.footer;
            String str3 = this.trackCode;
            String str4 = this.type;
            Boolean bool = this.isAsync;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemFriendsRecommendBlockDto(title=");
            sb.append(str);
            sb.append(", profiles=");
            sb.append(list);
            sb.append(", date=");
            sb.append(i);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", nextFrom=");
            sb.append(str2);
            sb.append(", infoCard=");
            sb.append(friendsRecBlockInfoCardDto);
            sb.append(", accountImportBlockPos=");
            sb.append(num);
            sb.append(", footer=");
            sb.append(friendsRecBlockFooterDto);
            sb.append(", trackCode=");
            n6j.b(sb, str3, ", type=", str4, ", isAsync=");
            sb.append(bool);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            return zn.b(sb, newsfeedItemWallpostFeedbackDto, ")");
        }

        public NewsfeedItemFriendsRecommendBlockDto(String str, List<FriendsRecProfileDto> list, int i, UserId userId, String str2, FriendsRecBlockInfoCardDto friendsRecBlockInfoCardDto, Integer num, FriendsRecBlockFooterDto friendsRecBlockFooterDto, String str3, String str4, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.title = str;
            this.profiles = list;
            this.date = i;
            this.sourceId = userId;
            this.nextFrom = str2;
            this.infoCard = friendsRecBlockInfoCardDto;
            this.accountImportBlockPos = num;
            this.footer = friendsRecBlockFooterDto;
            this.trackCode = str3;
            this.type = str4;
            this.isAsync = bool;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemFriendsRecommendationsGroupsBlockDto extends NewsfeedNewsfeedItemDto {

        @pmi0("button")
        private final BaseLinkButtonDto button;

        @pmi0("count")
        private final int count;

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final boolean isAsync;

        @pmi0("items")
        private final List<GroupsSuggestionDto> items;

        @pmi0("next_from")
        private final String nextFrom;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedItemFriendsRecommendationsGroupsBlockDto(String str, List list, int i, BaseLinkButtonDto baseLinkButtonDto, boolean z, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i2, String str2, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i3, zcl zclVar) {
            this(str, list, i, baseLinkButtonDto, z, newsfeedNewsfeedItemTypeDto, userId, i2, (i3 & 256) != 0 ? null : str2, (i3 & 512) != 0 ? null : f, (i3 & 1024) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemFriendsRecommendationsGroupsBlockDto)) {
                return false;
            }
            NewsfeedItemFriendsRecommendationsGroupsBlockDto newsfeedItemFriendsRecommendationsGroupsBlockDto = (NewsfeedItemFriendsRecommendationsGroupsBlockDto) obj;
            return epx.f(this.title, newsfeedItemFriendsRecommendationsGroupsBlockDto.title) && epx.f(this.items, newsfeedItemFriendsRecommendationsGroupsBlockDto.items) && this.count == newsfeedItemFriendsRecommendationsGroupsBlockDto.count && epx.f(this.button, newsfeedItemFriendsRecommendationsGroupsBlockDto.button) && this.isAsync == newsfeedItemFriendsRecommendationsGroupsBlockDto.isAsync && this.type == newsfeedItemFriendsRecommendationsGroupsBlockDto.type && epx.f(this.sourceId, newsfeedItemFriendsRecommendationsGroupsBlockDto.sourceId) && this.date == newsfeedItemFriendsRecommendationsGroupsBlockDto.date && epx.f(this.nextFrom, newsfeedItemFriendsRecommendationsGroupsBlockDto.nextFrom) && epx.f(this.shortTextRate, newsfeedItemFriendsRecommendationsGroupsBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedItemFriendsRecommendationsGroupsBlockDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a((this.type.hashCode() + qoy.b((this.button.hashCode() + shy.a(this.count, fw3.a(this.title.hashCode() * 31, 31, this.items), 31)) * 31, 31, this.isAsync)) * 31, 31, this.sourceId.b), 31);
            String str = this.nextFrom;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode2 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            String str = this.title;
            List<GroupsSuggestionDto> list = this.items;
            int i = this.count;
            BaseLinkButtonDto baseLinkButtonDto = this.button;
            boolean z = this.isAsync;
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i2 = this.date;
            String str2 = this.nextFrom;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemFriendsRecommendationsGroupsBlockDto(title=");
            sb.append(str);
            sb.append(", items=");
            sb.append(list);
            sb.append(", count=");
            sb.append(i);
            sb.append(", button=");
            sb.append(baseLinkButtonDto);
            sb.append(", isAsync=");
            sb.append(z);
            sb.append(", type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i2);
            sb.append(", nextFrom=");
            sb.append(str2);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            return zn.b(sb, newsfeedItemWallpostFeedbackDto, ")");
        }

        public NewsfeedItemFriendsRecommendationsGroupsBlockDto(String str, List<GroupsSuggestionDto> list, int i, BaseLinkButtonDto baseLinkButtonDto, boolean z, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i2, String str2, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.title = str;
            this.items = list;
            this.count = i;
            this.button = baseLinkButtonDto;
            this.isAsync = z;
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i2;
            this.nextFrom = str2;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemGenericWebviewBlockDto extends NewsfeedNewsfeedItemDto {

        @pmi0("autolaunch")
        private final Boolean autolaunch;

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("inapp_actions")
        private final List<AdsHtml5GameInappActionDto> inappActions;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("source_url")
        private final String sourceUrl;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        @pmi0("viewport_height")
        private final Float viewportHeight;

        @pmi0("viewport_ratio")
        private final Float viewportRatio;

        public /* synthetic */ NewsfeedItemGenericWebviewBlockDto(List list, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, Boolean bool, String str, Float f, Float f2, Boolean bool2, Float f3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(list, newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : str, (i2 & 64) != 0 ? null : f, (i2 & 128) != 0 ? null : f2, (i2 & 256) != 0 ? null : bool2, (i2 & 512) != 0 ? null : f3, (i2 & 1024) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemGenericWebviewBlockDto)) {
                return false;
            }
            NewsfeedItemGenericWebviewBlockDto newsfeedItemGenericWebviewBlockDto = (NewsfeedItemGenericWebviewBlockDto) obj;
            return epx.f(this.inappActions, newsfeedItemGenericWebviewBlockDto.inappActions) && this.type == newsfeedItemGenericWebviewBlockDto.type && epx.f(this.sourceId, newsfeedItemGenericWebviewBlockDto.sourceId) && this.date == newsfeedItemGenericWebviewBlockDto.date && epx.f(this.autolaunch, newsfeedItemGenericWebviewBlockDto.autolaunch) && epx.f(this.sourceUrl, newsfeedItemGenericWebviewBlockDto.sourceUrl) && epx.f(this.viewportHeight, newsfeedItemGenericWebviewBlockDto.viewportHeight) && epx.f(this.viewportRatio, newsfeedItemGenericWebviewBlockDto.viewportRatio) && epx.f(this.isAsync, newsfeedItemGenericWebviewBlockDto.isAsync) && epx.f(this.shortTextRate, newsfeedItemGenericWebviewBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedItemGenericWebviewBlockDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a((this.type.hashCode() + (this.inappActions.hashCode() * 31)) * 31, 31, this.sourceId.b), 31);
            Boolean bool = this.autolaunch;
            int hashCode = (a + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.sourceUrl;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Float f = this.viewportHeight;
            int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
            Float f2 = this.viewportRatio;
            int hashCode4 = (hashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
            Boolean bool2 = this.isAsync;
            int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Float f3 = this.shortTextRate;
            int hashCode6 = (hashCode5 + (f3 == null ? 0 : f3.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode6 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            List<AdsHtml5GameInappActionDto> list = this.inappActions;
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            Boolean bool = this.autolaunch;
            String str = this.sourceUrl;
            Float f = this.viewportHeight;
            Float f2 = this.viewportRatio;
            Boolean bool2 = this.isAsync;
            Float f3 = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemGenericWebviewBlockDto(inappActions=");
            sb.append(list);
            sb.append(", type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i);
            sb.append(", autolaunch=");
            l4.i(bool, ", sourceUrl=", str, ", viewportHeight=", sb);
            sb.append(f);
            sb.append(", viewportRatio=");
            sb.append(f2);
            sb.append(", isAsync=");
            sb.append(bool2);
            sb.append(", shortTextRate=");
            sb.append(f3);
            sb.append(", feedback=");
            return zn.b(sb, newsfeedItemWallpostFeedbackDto, ")");
        }

        public NewsfeedItemGenericWebviewBlockDto(List<AdsHtml5GameInappActionDto> list, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, Boolean bool, String str, Float f, Float f2, Boolean bool2, Float f3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.inappActions = list;
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.autolaunch = bool;
            this.sourceUrl = str;
            this.viewportHeight = f;
            this.viewportRatio = f2;
            this.isAsync = bool2;
            this.shortTextRate = f3;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemInterestsDto extends NewsfeedNewsfeedItemDto {

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("interest_items")
        private final List<NewsfeedItemInterestItemDto> interestItems;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("subtitle")
        private final String subtitle;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedItemInterestsDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, List list, String str, String str2, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? null : f, (i2 & 256) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemInterestsDto)) {
                return false;
            }
            NewsfeedItemInterestsDto newsfeedItemInterestsDto = (NewsfeedItemInterestsDto) obj;
            return this.type == newsfeedItemInterestsDto.type && epx.f(this.sourceId, newsfeedItemInterestsDto.sourceId) && this.date == newsfeedItemInterestsDto.date && epx.f(this.interestItems, newsfeedItemInterestsDto.interestItems) && epx.f(this.title, newsfeedItemInterestsDto.title) && epx.f(this.subtitle, newsfeedItemInterestsDto.subtitle) && epx.f(this.isAsync, newsfeedItemInterestsDto.isAsync) && epx.f(this.shortTextRate, newsfeedItemInterestsDto.shortTextRate) && epx.f(this.feedback, newsfeedItemInterestsDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            List<NewsfeedItemInterestItemDto> list = this.interestItems;
            int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.title;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitle;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode5 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            List<NewsfeedItemInterestItemDto> list = this.interestItems;
            String str = this.title;
            String str2 = this.subtitle;
            Boolean bool = this.isAsync;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemInterestsDto(type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i);
            sb.append(", interestItems=");
            sb.append(list);
            sb.append(", title=");
            n6j.b(sb, str, ", subtitle=", str2, ", isAsync=");
            sb.append(bool);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            return zn.b(sb, newsfeedItemWallpostFeedbackDto, ")");
        }

        public NewsfeedItemInterestsDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, List<NewsfeedItemInterestItemDto> list, String str, String str2, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.interestItems = list;
            this.title = str;
            this.subtitle = str2;
            this.isAsync = bool;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemMarketGroupsBlockDto extends NewsfeedNewsfeedItemDto {

        @pmi0("data")
        private final MarketGroupsBlockDto data;

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final boolean isAsync;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final String type;

        public /* synthetic */ NewsfeedItemMarketGroupsBlockDto(String str, String str2, String str3, boolean z, UserId userId, int i, MarketGroupsBlockDto marketGroupsBlockDto, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(str, str2, str3, z, userId, i, (i2 & 64) != 0 ? null : marketGroupsBlockDto, (i2 & 128) != 0 ? null : f, (i2 & 256) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemMarketGroupsBlockDto)) {
                return false;
            }
            NewsfeedItemMarketGroupsBlockDto newsfeedItemMarketGroupsBlockDto = (NewsfeedItemMarketGroupsBlockDto) obj;
            return epx.f(this.type, newsfeedItemMarketGroupsBlockDto.type) && epx.f(this.title, newsfeedItemMarketGroupsBlockDto.title) && epx.f(this.trackCode, newsfeedItemMarketGroupsBlockDto.trackCode) && this.isAsync == newsfeedItemMarketGroupsBlockDto.isAsync && epx.f(this.sourceId, newsfeedItemMarketGroupsBlockDto.sourceId) && this.date == newsfeedItemMarketGroupsBlockDto.date && epx.f(this.data, newsfeedItemMarketGroupsBlockDto.data) && epx.f(this.shortTextRate, newsfeedItemMarketGroupsBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedItemMarketGroupsBlockDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(qoy.b(urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.title), 31, this.trackCode), 31, this.isAsync), 31, this.sourceId.b), 31);
            MarketGroupsBlockDto marketGroupsBlockDto = this.data;
            int hashCode = (a + (marketGroupsBlockDto == null ? 0 : marketGroupsBlockDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode2 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            String str = this.type;
            String str2 = this.title;
            String str3 = this.trackCode;
            boolean z = this.isAsync;
            UserId userId = this.sourceId;
            int i = this.date;
            MarketGroupsBlockDto marketGroupsBlockDto = this.data;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder a = xe9.a("NewsfeedItemMarketGroupsBlockDto(type=", str, ", title=", str2, ", trackCode=");
            a.append(str3);
            a.append(", isAsync=");
            a.append(z);
            a.append(", sourceId=");
            a.append(userId);
            a.append(", date=");
            a.append(i);
            a.append(", data=");
            a.append(marketGroupsBlockDto);
            a.append(", shortTextRate=");
            a.append(f);
            a.append(", feedback=");
            return zn.b(a, newsfeedItemWallpostFeedbackDto, ")");
        }

        public NewsfeedItemMarketGroupsBlockDto(String str, String str2, String str3, boolean z, UserId userId, int i, MarketGroupsBlockDto marketGroupsBlockDto, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.type = str;
            this.title = str2;
            this.trackCode = str3;
            this.isAsync = z;
            this.sourceId = userId;
            this.date = i;
            this.data = marketGroupsBlockDto;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemMarketItemDto extends NewsfeedNewsfeedItemDto {

        @pmi0("access_key")
        private final String accessKey;

        @pmi0("ad_id")
        private final Integer adId;

        @pmi0("albums_ids")
        private final List<Integer> albumsIds;

        @pmi0("availability")
        private final MarketMarketItemAvailabilityDto availability;

        @pmi0("button_title")
        private final String buttonTitle;

        @pmi0("can_comment")
        private final BaseBoolIntDto canComment;

        @pmi0("can_delete")
        private final Boolean canDelete;

        @pmi0("can_edit")
        private final Boolean canEdit;

        @pmi0("can_repost")
        private final BaseBoolIntDto canRepost;

        @pmi0("can_show_convert_to_service")
        private final Boolean canShowConvertToService;

        @pmi0("cancel_info")
        private final BaseLinkDto cancelInfo;

        @pmi0("category")
        private final MarketMarketCategoryDto category;

        @pmi0("category_v2")
        private final MarketMarketCategoryDto categoryV2;

        @pmi0("date")
        private final int date;

        @pmi0("description")
        private final String description;

        @pmi0("external_id")
        private final String externalId;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("id")
        private final int id;

        @pmi0("is_adult")
        private final Boolean isAdult;

        @pmi0("is_favorite")
        private final Boolean isFavorite;

        @pmi0("is_main_variant")
        private final Boolean isMainVariant;

        @pmi0("is_owner")
        private final Boolean isOwner;

        @pmi0("likes")
        private final BaseLikesDto likes;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("owner_info")
        private final MarketItemOwnerInfoDto ownerInfo;

        @pmi0("photos")
        private final List<PhotosPhotoDto> photos;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("post_owner_id")
        private final UserId postOwnerId;

        @pmi0("price")
        private final MarketPriceDto price;

        @pmi0("promotion")
        private final MarketItemPromotionInfoDto promotion;

        @pmi0("reposts")
        private final BaseRepostsInfoDto reposts;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("sku")
        private final String sku;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("thumb_photo")
        private final String thumbPhoto;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        @pmi0("url")
        private final String url;

        @pmi0("user_agreement_info")
        private final String userAgreementInfo;

        @pmi0("variants_grouping_id")
        private final Integer variantsGroupingId;

        @pmi0("views_count")
        private final Integer viewsCount;

        @pmi0("vk_pay_discount")
        private final Integer vkPayDiscount;

        @pmi0("wishlist_item_id")
        private final Integer wishlistItemId;

        public /* synthetic */ NewsfeedItemMarketItemDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto, MarketMarketCategoryDto marketMarketCategoryDto, String str, int i2, UserId userId2, MarketPriceDto marketPriceDto, String str2, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, List list, List list2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseLikesDto baseLikesDto, BaseRepostsInfoDto baseRepostsInfoDto, Integer num, Integer num2, BaseLinkDto baseLinkDto, String str3, Integer num3, MarketItemOwnerInfoDto marketItemOwnerInfoDto, Boolean bool, Boolean bool2, Boolean bool3, MarketItemPromotionInfoDto marketItemPromotionInfoDto, Integer num4, String str4, String str5, MarketMarketCategoryDto marketMarketCategoryDto2, String str6, Boolean bool4, Boolean bool5, Boolean bool6, String str7, String str8, Integer num5, Boolean bool7, String str9, Integer num6, UserId userId3, int i3, int i4, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, marketMarketItemAvailabilityDto, marketMarketCategoryDto, str, i2, userId2, marketPriceDto, str2, (i3 & 1024) != 0 ? null : f, (i3 & 2048) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i3 & 4096) != 0 ? null : list, (i3 & 8192) != 0 ? null : list2, (i3 & 16384) != 0 ? null : baseBoolIntDto, (32768 & i3) != 0 ? null : baseBoolIntDto2, (65536 & i3) != 0 ? null : baseLikesDto, (131072 & i3) != 0 ? null : baseRepostsInfoDto, (262144 & i3) != 0 ? null : num, (524288 & i3) != 0 ? null : num2, (1048576 & i3) != 0 ? null : baseLinkDto, (2097152 & i3) != 0 ? null : str3, (4194304 & i3) != 0 ? null : num3, (8388608 & i3) != 0 ? null : marketItemOwnerInfoDto, (16777216 & i3) != 0 ? null : bool, (33554432 & i3) != 0 ? null : bool2, (67108864 & i3) != 0 ? null : bool3, (134217728 & i3) != 0 ? null : marketItemPromotionInfoDto, (268435456 & i3) != 0 ? null : num4, (536870912 & i3) != 0 ? null : str4, (1073741824 & i3) != 0 ? null : str5, (i3 & Integer.MIN_VALUE) != 0 ? null : marketMarketCategoryDto2, (i4 & 1) != 0 ? null : str6, (i4 & 2) != 0 ? null : bool4, (i4 & 4) != 0 ? null : bool5, (i4 & 8) != 0 ? null : bool6, (i4 & 16) != 0 ? null : str7, (i4 & 32) != 0 ? null : str8, (i4 & 64) != 0 ? null : num5, (i4 & 128) != 0 ? null : bool7, (i4 & 256) != 0 ? null : str9, (i4 & 512) != 0 ? null : num6, (i4 & 1024) != 0 ? null : userId3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemMarketItemDto)) {
                return false;
            }
            NewsfeedItemMarketItemDto newsfeedItemMarketItemDto = (NewsfeedItemMarketItemDto) obj;
            return this.type == newsfeedItemMarketItemDto.type && epx.f(this.sourceId, newsfeedItemMarketItemDto.sourceId) && this.date == newsfeedItemMarketItemDto.date && this.availability == newsfeedItemMarketItemDto.availability && epx.f(this.category, newsfeedItemMarketItemDto.category) && epx.f(this.description, newsfeedItemMarketItemDto.description) && this.id == newsfeedItemMarketItemDto.id && epx.f(this.ownerId, newsfeedItemMarketItemDto.ownerId) && epx.f(this.price, newsfeedItemMarketItemDto.price) && epx.f(this.title, newsfeedItemMarketItemDto.title) && epx.f(this.shortTextRate, newsfeedItemMarketItemDto.shortTextRate) && epx.f(this.feedback, newsfeedItemMarketItemDto.feedback) && epx.f(this.albumsIds, newsfeedItemMarketItemDto.albumsIds) && epx.f(this.photos, newsfeedItemMarketItemDto.photos) && this.canComment == newsfeedItemMarketItemDto.canComment && this.canRepost == newsfeedItemMarketItemDto.canRepost && epx.f(this.likes, newsfeedItemMarketItemDto.likes) && epx.f(this.reposts, newsfeedItemMarketItemDto.reposts) && epx.f(this.viewsCount, newsfeedItemMarketItemDto.viewsCount) && epx.f(this.wishlistItemId, newsfeedItemMarketItemDto.wishlistItemId) && epx.f(this.cancelInfo, newsfeedItemMarketItemDto.cancelInfo) && epx.f(this.userAgreementInfo, newsfeedItemMarketItemDto.userAgreementInfo) && epx.f(this.adId, newsfeedItemMarketItemDto.adId) && epx.f(this.ownerInfo, newsfeedItemMarketItemDto.ownerInfo) && epx.f(this.canEdit, newsfeedItemMarketItemDto.canEdit) && epx.f(this.canDelete, newsfeedItemMarketItemDto.canDelete) && epx.f(this.canShowConvertToService, newsfeedItemMarketItemDto.canShowConvertToService) && epx.f(this.promotion, newsfeedItemMarketItemDto.promotion) && epx.f(this.vkPayDiscount, newsfeedItemMarketItemDto.vkPayDiscount) && epx.f(this.accessKey, newsfeedItemMarketItemDto.accessKey) && epx.f(this.buttonTitle, newsfeedItemMarketItemDto.buttonTitle) && epx.f(this.categoryV2, newsfeedItemMarketItemDto.categoryV2) && epx.f(this.externalId, newsfeedItemMarketItemDto.externalId) && epx.f(this.isFavorite, newsfeedItemMarketItemDto.isFavorite) && epx.f(this.isOwner, newsfeedItemMarketItemDto.isOwner) && epx.f(this.isAdult, newsfeedItemMarketItemDto.isAdult) && epx.f(this.thumbPhoto, newsfeedItemMarketItemDto.thumbPhoto) && epx.f(this.url, newsfeedItemMarketItemDto.url) && epx.f(this.variantsGroupingId, newsfeedItemMarketItemDto.variantsGroupingId) && epx.f(this.isMainVariant, newsfeedItemMarketItemDto.isMainVariant) && epx.f(this.sku, newsfeedItemMarketItemDto.sku) && epx.f(this.postId, newsfeedItemMarketItemDto.postId) && epx.f(this.postOwnerId, newsfeedItemMarketItemDto.postOwnerId);
        }

        public final int hashCode() {
            int a = urd0.a((this.price.hashCode() + bh10.a(shy.a(this.id, urd0.a((this.category.hashCode() + ((this.availability.hashCode() + shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31)) * 31)) * 31, 31, this.description), 31), 31, this.ownerId.b)) * 31, 31, this.title);
            Float f = this.shortTextRate;
            int hashCode = (a + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode2 = (hashCode + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            List<Integer> list = this.albumsIds;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            List<PhotosPhotoDto> list2 = this.photos;
            int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto = this.canComment;
            int hashCode5 = (hashCode4 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto2 = this.canRepost;
            int hashCode6 = (hashCode5 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
            BaseLikesDto baseLikesDto = this.likes;
            int hashCode7 = (hashCode6 + (baseLikesDto == null ? 0 : baseLikesDto.hashCode())) * 31;
            BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
            int hashCode8 = (hashCode7 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
            Integer num = this.viewsCount;
            int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.wishlistItemId;
            int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
            BaseLinkDto baseLinkDto = this.cancelInfo;
            int hashCode11 = (hashCode10 + (baseLinkDto == null ? 0 : baseLinkDto.hashCode())) * 31;
            String str = this.userAgreementInfo;
            int hashCode12 = (hashCode11 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num3 = this.adId;
            int hashCode13 = (hashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
            MarketItemOwnerInfoDto marketItemOwnerInfoDto = this.ownerInfo;
            int hashCode14 = (hashCode13 + (marketItemOwnerInfoDto == null ? 0 : marketItemOwnerInfoDto.hashCode())) * 31;
            Boolean bool = this.canEdit;
            int hashCode15 = (hashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.canDelete;
            int hashCode16 = (hashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.canShowConvertToService;
            int hashCode17 = (hashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            MarketItemPromotionInfoDto marketItemPromotionInfoDto = this.promotion;
            int hashCode18 = (hashCode17 + (marketItemPromotionInfoDto == null ? 0 : marketItemPromotionInfoDto.hashCode())) * 31;
            Integer num4 = this.vkPayDiscount;
            int hashCode19 = (hashCode18 + (num4 == null ? 0 : num4.hashCode())) * 31;
            String str2 = this.accessKey;
            int hashCode20 = (hashCode19 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.buttonTitle;
            int hashCode21 = (hashCode20 + (str3 == null ? 0 : str3.hashCode())) * 31;
            MarketMarketCategoryDto marketMarketCategoryDto = this.categoryV2;
            int hashCode22 = (hashCode21 + (marketMarketCategoryDto == null ? 0 : marketMarketCategoryDto.hashCode())) * 31;
            String str4 = this.externalId;
            int hashCode23 = (hashCode22 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool4 = this.isFavorite;
            int hashCode24 = (hashCode23 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.isOwner;
            int hashCode25 = (hashCode24 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Boolean bool6 = this.isAdult;
            int hashCode26 = (hashCode25 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            String str5 = this.thumbPhoto;
            int hashCode27 = (hashCode26 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.url;
            int hashCode28 = (hashCode27 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num5 = this.variantsGroupingId;
            int hashCode29 = (hashCode28 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Boolean bool7 = this.isMainVariant;
            int hashCode30 = (hashCode29 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            String str7 = this.sku;
            int hashCode31 = (hashCode30 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Integer num6 = this.postId;
            int hashCode32 = (hashCode31 + (num6 == null ? 0 : num6.hashCode())) * 31;
            UserId userId = this.postOwnerId;
            return hashCode32 + (userId != null ? Long.hashCode(userId.b) : 0);
        }

        public final String toString() {
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto = this.availability;
            MarketMarketCategoryDto marketMarketCategoryDto = this.category;
            String str = this.description;
            int i2 = this.id;
            UserId userId2 = this.ownerId;
            MarketPriceDto marketPriceDto = this.price;
            String str2 = this.title;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            List<Integer> list = this.albumsIds;
            List<PhotosPhotoDto> list2 = this.photos;
            BaseBoolIntDto baseBoolIntDto = this.canComment;
            BaseBoolIntDto baseBoolIntDto2 = this.canRepost;
            BaseLikesDto baseLikesDto = this.likes;
            BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
            Integer num = this.viewsCount;
            Integer num2 = this.wishlistItemId;
            BaseLinkDto baseLinkDto = this.cancelInfo;
            String str3 = this.userAgreementInfo;
            Integer num3 = this.adId;
            MarketItemOwnerInfoDto marketItemOwnerInfoDto = this.ownerInfo;
            Boolean bool = this.canEdit;
            Boolean bool2 = this.canDelete;
            Boolean bool3 = this.canShowConvertToService;
            MarketItemPromotionInfoDto marketItemPromotionInfoDto = this.promotion;
            Integer num4 = this.vkPayDiscount;
            String str4 = this.accessKey;
            String str5 = this.buttonTitle;
            MarketMarketCategoryDto marketMarketCategoryDto2 = this.categoryV2;
            String str6 = this.externalId;
            Boolean bool4 = this.isFavorite;
            Boolean bool5 = this.isOwner;
            Boolean bool6 = this.isAdult;
            String str7 = this.thumbPhoto;
            String str8 = this.url;
            Integer num5 = this.variantsGroupingId;
            Boolean bool7 = this.isMainVariant;
            String str9 = this.sku;
            Integer num6 = this.postId;
            UserId userId3 = this.postOwnerId;
            StringBuilder sb = new StringBuilder("NewsfeedItemMarketItemDto(type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i);
            sb.append(", availability=");
            sb.append(marketMarketItemAvailabilityDto);
            sb.append(", category=");
            sb.append(marketMarketCategoryDto);
            sb.append(", description=");
            sb.append(str);
            sb.append(", id=");
            sb.append(i2);
            sb.append(", ownerId=");
            sb.append(userId2);
            sb.append(", price=");
            sb.append(marketPriceDto);
            sb.append(", title=");
            sb.append(str2);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            sb.append(newsfeedItemWallpostFeedbackDto);
            sb.append(", albumsIds=");
            vq.d(sb, list, ", photos=", list2, ", canComment=");
            to.b(sb, baseBoolIntDto, ", canRepost=", baseBoolIntDto2, ", likes=");
            sb.append(baseLikesDto);
            sb.append(", reposts=");
            sb.append(baseRepostsInfoDto);
            sb.append(", viewsCount=");
            sq.b(sb, num, ", wishlistItemId=", num2, ", cancelInfo=");
            sb.append(baseLinkDto);
            sb.append(", userAgreementInfo=");
            sb.append(str3);
            sb.append(", adId=");
            sb.append(num3);
            sb.append(", ownerInfo=");
            sb.append(marketItemOwnerInfoDto);
            sb.append(", canEdit=");
            tq.i(sb, bool, ", canDelete=", bool2, ", canShowConvertToService=");
            sb.append(bool3);
            sb.append(", promotion=");
            sb.append(marketItemPromotionInfoDto);
            sb.append(", vkPayDiscount=");
            mq.b(num4, ", accessKey=", str4, ", buttonTitle=", sb);
            sb.append(str5);
            sb.append(", categoryV2=");
            sb.append(marketMarketCategoryDto2);
            sb.append(", externalId=");
            uq.c(bool4, str6, ", isFavorite=", ", isOwner=", sb);
            tq.i(sb, bool5, ", isAdult=", bool6, ", thumbPhoto=");
            n6j.b(sb, str7, ", url=", str8, ", variantsGroupingId=");
            rq.h(sb, num5, ", isMainVariant=", bool7, ", sku=");
            kr.b(num6, str9, ", postId=", ", postOwnerId=", sb);
            sb.append(userId3);
            sb.append(")");
            return sb.toString();
        }

        public NewsfeedItemMarketItemDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto, MarketMarketCategoryDto marketMarketCategoryDto, String str, int i2, UserId userId2, MarketPriceDto marketPriceDto, String str2, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, List<Integer> list, List<PhotosPhotoDto> list2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseLikesDto baseLikesDto, BaseRepostsInfoDto baseRepostsInfoDto, Integer num, Integer num2, BaseLinkDto baseLinkDto, String str3, Integer num3, MarketItemOwnerInfoDto marketItemOwnerInfoDto, Boolean bool, Boolean bool2, Boolean bool3, MarketItemPromotionInfoDto marketItemPromotionInfoDto, Integer num4, String str4, String str5, MarketMarketCategoryDto marketMarketCategoryDto2, String str6, Boolean bool4, Boolean bool5, Boolean bool6, String str7, String str8, Integer num5, Boolean bool7, String str9, Integer num6, UserId userId3) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.availability = marketMarketItemAvailabilityDto;
            this.category = marketMarketCategoryDto;
            this.description = str;
            this.id = i2;
            this.ownerId = userId2;
            this.price = marketPriceDto;
            this.title = str2;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.albumsIds = list;
            this.photos = list2;
            this.canComment = baseBoolIntDto;
            this.canRepost = baseBoolIntDto2;
            this.likes = baseLikesDto;
            this.reposts = baseRepostsInfoDto;
            this.viewsCount = num;
            this.wishlistItemId = num2;
            this.cancelInfo = baseLinkDto;
            this.userAgreementInfo = str3;
            this.adId = num3;
            this.ownerInfo = marketItemOwnerInfoDto;
            this.canEdit = bool;
            this.canDelete = bool2;
            this.canShowConvertToService = bool3;
            this.promotion = marketItemPromotionInfoDto;
            this.vkPayDiscount = num4;
            this.accessKey = str4;
            this.buttonTitle = str5;
            this.categoryV2 = marketMarketCategoryDto2;
            this.externalId = str6;
            this.isFavorite = bool4;
            this.isOwner = bool5;
            this.isAdult = bool6;
            this.thumbPhoto = str7;
            this.url = str8;
            this.variantsGroupingId = num5;
            this.isMainVariant = bool7;
            this.sku = str9;
            this.postId = num6;
            this.postOwnerId = userId3;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemPhotoDto extends NewsfeedNewsfeedItemDto {

        @pmi0("carousel_offset")
        private final Integer carouselOffset;

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("photos")
        private final NewsfeedItemPhotoPhotosDto photos;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedItemPhotoDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, NewsfeedItemPhotoPhotosDto newsfeedItemPhotoPhotosDto, Integer num, Integer num2, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : newsfeedItemPhotoPhotosDto, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? null : f, (i2 & 128) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemPhotoDto)) {
                return false;
            }
            NewsfeedItemPhotoDto newsfeedItemPhotoDto = (NewsfeedItemPhotoDto) obj;
            return this.type == newsfeedItemPhotoDto.type && epx.f(this.sourceId, newsfeedItemPhotoDto.sourceId) && this.date == newsfeedItemPhotoDto.date && epx.f(this.photos, newsfeedItemPhotoDto.photos) && epx.f(this.postId, newsfeedItemPhotoDto.postId) && epx.f(this.carouselOffset, newsfeedItemPhotoDto.carouselOffset) && epx.f(this.shortTextRate, newsfeedItemPhotoDto.shortTextRate) && epx.f(this.feedback, newsfeedItemPhotoDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            NewsfeedItemPhotoPhotosDto newsfeedItemPhotoPhotosDto = this.photos;
            int hashCode = (a + (newsfeedItemPhotoPhotosDto == null ? 0 : newsfeedItemPhotoPhotosDto.hashCode())) * 31;
            Integer num = this.postId;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.carouselOffset;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode4 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            NewsfeedItemPhotoPhotosDto newsfeedItemPhotoPhotosDto = this.photos;
            Integer num = this.postId;
            Integer num2 = this.carouselOffset;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemPhotoDto(type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i);
            sb.append(", photos=");
            sb.append(newsfeedItemPhotoPhotosDto);
            sb.append(", postId=");
            sq.b(sb, num, ", carouselOffset=", num2, ", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            sb.append(newsfeedItemWallpostFeedbackDto);
            sb.append(")");
            return sb.toString();
        }

        public NewsfeedItemPhotoDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, NewsfeedItemPhotoPhotosDto newsfeedItemPhotoPhotosDto, Integer num, Integer num2, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.photos = newsfeedItemPhotoPhotosDto;
            this.postId = num;
            this.carouselOffset = num2;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemPhotoTagDto extends NewsfeedNewsfeedItemDto {

        @pmi0("carousel_offset")
        private final Integer carouselOffset;

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("photo_tags")
        private final NewsfeedItemPhotoTagPhotoTagsDto photoTags;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedItemPhotoTagDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, NewsfeedItemPhotoTagPhotoTagsDto newsfeedItemPhotoTagPhotoTagsDto, Integer num, Integer num2, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : newsfeedItemPhotoTagPhotoTagsDto, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? null : f, (i2 & 128) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemPhotoTagDto)) {
                return false;
            }
            NewsfeedItemPhotoTagDto newsfeedItemPhotoTagDto = (NewsfeedItemPhotoTagDto) obj;
            return this.type == newsfeedItemPhotoTagDto.type && epx.f(this.sourceId, newsfeedItemPhotoTagDto.sourceId) && this.date == newsfeedItemPhotoTagDto.date && epx.f(this.photoTags, newsfeedItemPhotoTagDto.photoTags) && epx.f(this.postId, newsfeedItemPhotoTagDto.postId) && epx.f(this.carouselOffset, newsfeedItemPhotoTagDto.carouselOffset) && epx.f(this.shortTextRate, newsfeedItemPhotoTagDto.shortTextRate) && epx.f(this.feedback, newsfeedItemPhotoTagDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            NewsfeedItemPhotoTagPhotoTagsDto newsfeedItemPhotoTagPhotoTagsDto = this.photoTags;
            int hashCode = (a + (newsfeedItemPhotoTagPhotoTagsDto == null ? 0 : newsfeedItemPhotoTagPhotoTagsDto.hashCode())) * 31;
            Integer num = this.postId;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.carouselOffset;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode4 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            NewsfeedItemPhotoTagPhotoTagsDto newsfeedItemPhotoTagPhotoTagsDto = this.photoTags;
            Integer num = this.postId;
            Integer num2 = this.carouselOffset;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemPhotoTagDto(type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i);
            sb.append(", photoTags=");
            sb.append(newsfeedItemPhotoTagPhotoTagsDto);
            sb.append(", postId=");
            sq.b(sb, num, ", carouselOffset=", num2, ", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            sb.append(newsfeedItemWallpostFeedbackDto);
            sb.append(")");
            return sb.toString();
        }

        public NewsfeedItemPhotoTagDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, NewsfeedItemPhotoTagPhotoTagsDto newsfeedItemPhotoTagPhotoTagsDto, Integer num, Integer num2, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.photoTags = newsfeedItemPhotoTagPhotoTagsDto;
            this.postId = num;
            this.carouselOffset = num2;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemPromoButtonDto extends NewsfeedNewsfeedItemDto {

        @pmi0("action")
        private final NewsfeedItemPromoButtonActionDto action;

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("images")
        private final List<NewsfeedItemPromoButtonImageDto> images;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("text")
        private final String text;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedItemPromoButtonDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, String str2, NewsfeedItemPromoButtonActionDto newsfeedItemPromoButtonActionDto, List list, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : newsfeedItemPromoButtonActionDto, (i2 & 64) != 0 ? null : list, (i2 & 128) != 0 ? null : f, (i2 & 256) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemPromoButtonDto)) {
                return false;
            }
            NewsfeedItemPromoButtonDto newsfeedItemPromoButtonDto = (NewsfeedItemPromoButtonDto) obj;
            return this.type == newsfeedItemPromoButtonDto.type && epx.f(this.sourceId, newsfeedItemPromoButtonDto.sourceId) && this.date == newsfeedItemPromoButtonDto.date && epx.f(this.text, newsfeedItemPromoButtonDto.text) && epx.f(this.title, newsfeedItemPromoButtonDto.title) && epx.f(this.action, newsfeedItemPromoButtonDto.action) && epx.f(this.images, newsfeedItemPromoButtonDto.images) && epx.f(this.shortTextRate, newsfeedItemPromoButtonDto.shortTextRate) && epx.f(this.feedback, newsfeedItemPromoButtonDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            String str = this.text;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.title;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            NewsfeedItemPromoButtonActionDto newsfeedItemPromoButtonActionDto = this.action;
            int hashCode3 = (hashCode2 + (newsfeedItemPromoButtonActionDto == null ? 0 : newsfeedItemPromoButtonActionDto.hashCode())) * 31;
            List<NewsfeedItemPromoButtonImageDto> list = this.images;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode5 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            String str = this.text;
            String str2 = this.title;
            NewsfeedItemPromoButtonActionDto newsfeedItemPromoButtonActionDto = this.action;
            List<NewsfeedItemPromoButtonImageDto> list = this.images;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemPromoButtonDto(type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            jax0.a(i, ", text=", str, ", title=", sb);
            sb.append(str2);
            sb.append(", action=");
            sb.append(newsfeedItemPromoButtonActionDto);
            sb.append(", images=");
            sb.append(list);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            return zn.b(sb, newsfeedItemWallpostFeedbackDto, ")");
        }

        public NewsfeedItemPromoButtonDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, String str2, NewsfeedItemPromoButtonActionDto newsfeedItemPromoButtonActionDto, List<NewsfeedItemPromoButtonImageDto> list, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.text = str;
            this.title = str2;
            this.action = newsfeedItemPromoButtonActionDto;
            this.images = list;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemRecognizeBlockDto extends NewsfeedNewsfeedItemDto {

        @pmi0("date")
        private final int date;

        @pmi0("end_card")
        private final PhotosTagsSuggestionItemEndCardDto endCard;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("items")
        private final List<PhotosTagsSuggestionItemDto> items;

        @pmi0("recognition_article_link")
        private final String recognitionArticleLink;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedItemRecognizeBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, PhotosTagsSuggestionItemEndCardDto photosTagsSuggestionItemEndCardDto, String str, List list, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : photosTagsSuggestionItemEndCardDto, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? null : f, (i2 & 256) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemRecognizeBlockDto)) {
                return false;
            }
            NewsfeedItemRecognizeBlockDto newsfeedItemRecognizeBlockDto = (NewsfeedItemRecognizeBlockDto) obj;
            return this.type == newsfeedItemRecognizeBlockDto.type && epx.f(this.sourceId, newsfeedItemRecognizeBlockDto.sourceId) && this.date == newsfeedItemRecognizeBlockDto.date && epx.f(this.endCard, newsfeedItemRecognizeBlockDto.endCard) && epx.f(this.recognitionArticleLink, newsfeedItemRecognizeBlockDto.recognitionArticleLink) && epx.f(this.items, newsfeedItemRecognizeBlockDto.items) && epx.f(this.isAsync, newsfeedItemRecognizeBlockDto.isAsync) && epx.f(this.shortTextRate, newsfeedItemRecognizeBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedItemRecognizeBlockDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            PhotosTagsSuggestionItemEndCardDto photosTagsSuggestionItemEndCardDto = this.endCard;
            int hashCode = (a + (photosTagsSuggestionItemEndCardDto == null ? 0 : photosTagsSuggestionItemEndCardDto.hashCode())) * 31;
            String str = this.recognitionArticleLink;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<PhotosTagsSuggestionItemDto> list = this.items;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode5 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            PhotosTagsSuggestionItemEndCardDto photosTagsSuggestionItemEndCardDto = this.endCard;
            String str = this.recognitionArticleLink;
            List<PhotosTagsSuggestionItemDto> list = this.items;
            Boolean bool = this.isAsync;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemRecognizeBlockDto(type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i);
            sb.append(", endCard=");
            sb.append(photosTagsSuggestionItemEndCardDto);
            sb.append(", recognitionArticleLink=");
            b.c(str, ", items=", ", isAsync=", sb, list);
            sb.append(bool);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            return zn.b(sb, newsfeedItemWallpostFeedbackDto, ")");
        }

        public NewsfeedItemRecognizeBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, PhotosTagsSuggestionItemEndCardDto photosTagsSuggestionItemEndCardDto, String str, List<PhotosTagsSuggestionItemDto> list, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.endCard = photosTagsSuggestionItemEndCardDto;
            this.recognitionArticleLink = str;
            this.items = list;
            this.isAsync = bool;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemRecommendedAppBlockDto extends NewsfeedNewsfeedItemDto {

        /* renamed from: app, reason: collision with root package name */
        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        private final AppsAppDto f91app;

        @pmi0("app_cover")
        private final List<BaseImageDto> appCover;

        @pmi0("button_text")
        private final String buttonText;

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("friends_avatars")
        private final List<List<BaseImageDto>> friendsAvatars;

        @pmi0("friends_playing_text")
        private final String friendsPlayingText;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedItemRecommendedAppBlockDto(AppsAppDto appsAppDto, String str, String str2, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str3, List list, List list2, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(appsAppDto, str, str2, newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : list, (i2 & 256) != 0 ? null : list2, (i2 & 512) != 0 ? null : bool, (i2 & 1024) != 0 ? null : f, (i2 & 2048) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemRecommendedAppBlockDto)) {
                return false;
            }
            NewsfeedItemRecommendedAppBlockDto newsfeedItemRecommendedAppBlockDto = (NewsfeedItemRecommendedAppBlockDto) obj;
            return epx.f(this.f91app, newsfeedItemRecommendedAppBlockDto.f91app) && epx.f(this.title, newsfeedItemRecommendedAppBlockDto.title) && epx.f(this.buttonText, newsfeedItemRecommendedAppBlockDto.buttonText) && this.type == newsfeedItemRecommendedAppBlockDto.type && epx.f(this.sourceId, newsfeedItemRecommendedAppBlockDto.sourceId) && this.date == newsfeedItemRecommendedAppBlockDto.date && epx.f(this.friendsPlayingText, newsfeedItemRecommendedAppBlockDto.friendsPlayingText) && epx.f(this.friendsAvatars, newsfeedItemRecommendedAppBlockDto.friendsAvatars) && epx.f(this.appCover, newsfeedItemRecommendedAppBlockDto.appCover) && epx.f(this.isAsync, newsfeedItemRecommendedAppBlockDto.isAsync) && epx.f(this.shortTextRate, newsfeedItemRecommendedAppBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedItemRecommendedAppBlockDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a((this.type.hashCode() + urd0.a(urd0.a(this.f91app.hashCode() * 31, 31, this.title), 31, this.buttonText)) * 31, 31, this.sourceId.b), 31);
            String str = this.friendsPlayingText;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            List<List<BaseImageDto>> list = this.friendsAvatars;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<BaseImageDto> list2 = this.appCover;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode5 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            AppsAppDto appsAppDto = this.f91app;
            String str = this.title;
            String str2 = this.buttonText;
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            String str3 = this.friendsPlayingText;
            List<List<BaseImageDto>> list = this.friendsAvatars;
            List<BaseImageDto> list2 = this.appCover;
            Boolean bool = this.isAsync;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemRecommendedAppBlockDto(app=");
            sb.append(appsAppDto);
            sb.append(", title=");
            sb.append(str);
            sb.append(", buttonText=");
            sb.append(str2);
            sb.append(", type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i);
            sb.append(", friendsPlayingText=");
            b.c(str3, ", friendsAvatars=", ", appCover=", sb, list);
            sb.append(list2);
            sb.append(", isAsync=");
            sb.append(bool);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            sb.append(newsfeedItemWallpostFeedbackDto);
            sb.append(")");
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NewsfeedItemRecommendedAppBlockDto(AppsAppDto appsAppDto, String str, String str2, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str3, List<? extends List<BaseImageDto>> list, List<BaseImageDto> list2, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.f91app = appsAppDto;
            this.title = str;
            this.buttonText = str2;
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.friendsPlayingText = str3;
            this.friendsAvatars = list;
            this.appCover = list2;
            this.isAsync = bool;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemRecommendedChatsBlockDto extends NewsfeedNewsfeedItemDto {

        @pmi0("button")
        private final BaseLinkButtonDto button;

        @pmi0("count")
        private final int count;

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("items")
        private final List<MessagesChatSuggestionDto> items;

        @pmi0("next_from")
        private final String nextFrom;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedItemRecommendedChatsBlockDto(List list, int i, BaseLinkButtonDto baseLinkButtonDto, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i2, String str, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i3, zcl zclVar) {
            this(list, i, baseLinkButtonDto, newsfeedNewsfeedItemTypeDto, userId, i2, (i3 & 64) != 0 ? null : str, (i3 & 128) != 0 ? null : bool, (i3 & 256) != 0 ? null : f, (i3 & 512) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemRecommendedChatsBlockDto)) {
                return false;
            }
            NewsfeedItemRecommendedChatsBlockDto newsfeedItemRecommendedChatsBlockDto = (NewsfeedItemRecommendedChatsBlockDto) obj;
            return epx.f(this.items, newsfeedItemRecommendedChatsBlockDto.items) && this.count == newsfeedItemRecommendedChatsBlockDto.count && epx.f(this.button, newsfeedItemRecommendedChatsBlockDto.button) && this.type == newsfeedItemRecommendedChatsBlockDto.type && epx.f(this.sourceId, newsfeedItemRecommendedChatsBlockDto.sourceId) && this.date == newsfeedItemRecommendedChatsBlockDto.date && epx.f(this.nextFrom, newsfeedItemRecommendedChatsBlockDto.nextFrom) && epx.f(this.isAsync, newsfeedItemRecommendedChatsBlockDto.isAsync) && epx.f(this.shortTextRate, newsfeedItemRecommendedChatsBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedItemRecommendedChatsBlockDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a((this.type.hashCode() + ((this.button.hashCode() + shy.a(this.count, this.items.hashCode() * 31, 31)) * 31)) * 31, 31, this.sourceId.b), 31);
            String str = this.nextFrom;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode3 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            List<MessagesChatSuggestionDto> list = this.items;
            int i = this.count;
            BaseLinkButtonDto baseLinkButtonDto = this.button;
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i2 = this.date;
            String str = this.nextFrom;
            Boolean bool = this.isAsync;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemRecommendedChatsBlockDto(items=");
            sb.append(list);
            sb.append(", count=");
            sb.append(i);
            sb.append(", button=");
            sb.append(baseLinkButtonDto);
            sb.append(", type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i2);
            sb.append(", nextFrom=");
            uq.c(bool, str, ", isAsync=", ", shortTextRate=", sb);
            sb.append(f);
            sb.append(", feedback=");
            sb.append(newsfeedItemWallpostFeedbackDto);
            sb.append(")");
            return sb.toString();
        }

        public NewsfeedItemRecommendedChatsBlockDto(List<MessagesChatSuggestionDto> list, int i, BaseLinkButtonDto baseLinkButtonDto, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i2, String str, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.items = list;
            this.count = i;
            this.button = baseLinkButtonDto;
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i2;
            this.nextFrom = str;
            this.isAsync = bool;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemRecommendedGroupsBlockDto extends NewsfeedNewsfeedItemDto {

        @pmi0("button")
        private final BaseLinkButtonDto button;

        @pmi0("count")
        private final int count;

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final boolean isAsync;

        @pmi0("items")
        private final List<GroupsSuggestionDto> items;

        @pmi0("next_from")
        private final String nextFrom;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedItemRecommendedGroupsBlockDto(String str, List list, int i, BaseLinkButtonDto baseLinkButtonDto, boolean z, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i2, String str2, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i3, zcl zclVar) {
            this(str, list, i, baseLinkButtonDto, z, newsfeedNewsfeedItemTypeDto, userId, i2, (i3 & 256) != 0 ? null : str2, (i3 & 512) != 0 ? null : f, (i3 & 1024) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemRecommendedGroupsBlockDto)) {
                return false;
            }
            NewsfeedItemRecommendedGroupsBlockDto newsfeedItemRecommendedGroupsBlockDto = (NewsfeedItemRecommendedGroupsBlockDto) obj;
            return epx.f(this.title, newsfeedItemRecommendedGroupsBlockDto.title) && epx.f(this.items, newsfeedItemRecommendedGroupsBlockDto.items) && this.count == newsfeedItemRecommendedGroupsBlockDto.count && epx.f(this.button, newsfeedItemRecommendedGroupsBlockDto.button) && this.isAsync == newsfeedItemRecommendedGroupsBlockDto.isAsync && this.type == newsfeedItemRecommendedGroupsBlockDto.type && epx.f(this.sourceId, newsfeedItemRecommendedGroupsBlockDto.sourceId) && this.date == newsfeedItemRecommendedGroupsBlockDto.date && epx.f(this.nextFrom, newsfeedItemRecommendedGroupsBlockDto.nextFrom) && epx.f(this.shortTextRate, newsfeedItemRecommendedGroupsBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedItemRecommendedGroupsBlockDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a((this.type.hashCode() + qoy.b((this.button.hashCode() + shy.a(this.count, fw3.a(this.title.hashCode() * 31, 31, this.items), 31)) * 31, 31, this.isAsync)) * 31, 31, this.sourceId.b), 31);
            String str = this.nextFrom;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode2 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            String str = this.title;
            List<GroupsSuggestionDto> list = this.items;
            int i = this.count;
            BaseLinkButtonDto baseLinkButtonDto = this.button;
            boolean z = this.isAsync;
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i2 = this.date;
            String str2 = this.nextFrom;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemRecommendedGroupsBlockDto(title=");
            sb.append(str);
            sb.append(", items=");
            sb.append(list);
            sb.append(", count=");
            sb.append(i);
            sb.append(", button=");
            sb.append(baseLinkButtonDto);
            sb.append(", isAsync=");
            sb.append(z);
            sb.append(", type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i2);
            sb.append(", nextFrom=");
            sb.append(str2);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            return zn.b(sb, newsfeedItemWallpostFeedbackDto, ")");
        }

        public NewsfeedItemRecommendedGroupsBlockDto(String str, List<GroupsSuggestionDto> list, int i, BaseLinkButtonDto baseLinkButtonDto, boolean z, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i2, String str2, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.title = str;
            this.items = list;
            this.count = i;
            this.button = baseLinkButtonDto;
            this.isAsync = z;
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i2;
            this.nextFrom = str2;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemSignalsDto extends NewsfeedNewsfeedItemDto {

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedItemSignalsDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : f, (i2 & 64) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemSignalsDto)) {
                return false;
            }
            NewsfeedItemSignalsDto newsfeedItemSignalsDto = (NewsfeedItemSignalsDto) obj;
            return this.type == newsfeedItemSignalsDto.type && epx.f(this.sourceId, newsfeedItemSignalsDto.sourceId) && this.date == newsfeedItemSignalsDto.date && epx.f(this.title, newsfeedItemSignalsDto.title) && epx.f(this.isAsync, newsfeedItemSignalsDto.isAsync) && epx.f(this.shortTextRate, newsfeedItemSignalsDto.shortTextRate) && epx.f(this.feedback, newsfeedItemSignalsDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            String str = this.title;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode3 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            String str = this.title;
            Boolean bool = this.isAsync;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemSignalsDto(type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            jax0.a(i, ", title=", str, ", isAsync=", sb);
            sb.append(bool);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            return zn.b(sb, newsfeedItemWallpostFeedbackDto, ")");
        }

        public NewsfeedItemSignalsDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.title = str;
            this.isAsync = bool;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemTextliveBlockDto extends NewsfeedNewsfeedItemDto {

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("textlive_textpost_block")
        private final TextlivesTextliveTextpostBlockDto textliveTextpostBlock;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedItemTextliveBlockDto(TextlivesTextliveTextpostBlockDto textlivesTextliveTextpostBlockDto, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(textlivesTextliveTextpostBlockDto, newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : f, (i2 & 64) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemTextliveBlockDto)) {
                return false;
            }
            NewsfeedItemTextliveBlockDto newsfeedItemTextliveBlockDto = (NewsfeedItemTextliveBlockDto) obj;
            return epx.f(this.textliveTextpostBlock, newsfeedItemTextliveBlockDto.textliveTextpostBlock) && this.type == newsfeedItemTextliveBlockDto.type && epx.f(this.sourceId, newsfeedItemTextliveBlockDto.sourceId) && this.date == newsfeedItemTextliveBlockDto.date && epx.f(this.isAsync, newsfeedItemTextliveBlockDto.isAsync) && epx.f(this.shortTextRate, newsfeedItemTextliveBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedItemTextliveBlockDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a((this.type.hashCode() + (this.textliveTextpostBlock.hashCode() * 31)) * 31, 31, this.sourceId.b), 31);
            Boolean bool = this.isAsync;
            int hashCode = (a + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode2 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            TextlivesTextliveTextpostBlockDto textlivesTextliveTextpostBlockDto = this.textliveTextpostBlock;
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            Boolean bool = this.isAsync;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemTextliveBlockDto(textliveTextpostBlock=");
            sb.append(textlivesTextliveTextpostBlockDto);
            sb.append(", type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i);
            sb.append(", isAsync=");
            sb.append(bool);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            return zn.b(sb, newsfeedItemWallpostFeedbackDto, ")");
        }

        public NewsfeedItemTextliveBlockDto(TextlivesTextliveTextpostBlockDto textlivesTextliveTextpostBlockDto, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.textliveTextpostBlock = textlivesTextliveTextpostBlockDto;
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.isAsync = bool;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemTopicDto extends NewsfeedNewsfeedItemDto {

        @pmi0("comments")
        private final BaseCommentsInfoDto comments;

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("likes")
        private final BaseLikesInfoDto likes;

        @pmi0("post_id")
        private final int postId;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("text")
        private final String text;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedItemTopicDto(int i, String str, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i2, BaseCommentsInfoDto baseCommentsInfoDto, BaseLikesInfoDto baseLikesInfoDto, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i3, zcl zclVar) {
            this(i, str, newsfeedNewsfeedItemTypeDto, userId, i2, (i3 & 32) != 0 ? null : baseCommentsInfoDto, (i3 & 64) != 0 ? null : baseLikesInfoDto, (i3 & 128) != 0 ? null : f, (i3 & 256) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemTopicDto)) {
                return false;
            }
            NewsfeedItemTopicDto newsfeedItemTopicDto = (NewsfeedItemTopicDto) obj;
            return this.postId == newsfeedItemTopicDto.postId && epx.f(this.text, newsfeedItemTopicDto.text) && this.type == newsfeedItemTopicDto.type && epx.f(this.sourceId, newsfeedItemTopicDto.sourceId) && this.date == newsfeedItemTopicDto.date && epx.f(this.comments, newsfeedItemTopicDto.comments) && epx.f(this.likes, newsfeedItemTopicDto.likes) && epx.f(this.shortTextRate, newsfeedItemTopicDto.shortTextRate) && epx.f(this.feedback, newsfeedItemTopicDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a((this.type.hashCode() + urd0.a(Integer.hashCode(this.postId) * 31, 31, this.text)) * 31, 31, this.sourceId.b), 31);
            BaseCommentsInfoDto baseCommentsInfoDto = this.comments;
            int hashCode = (a + (baseCommentsInfoDto == null ? 0 : baseCommentsInfoDto.hashCode())) * 31;
            BaseLikesInfoDto baseLikesInfoDto = this.likes;
            int hashCode2 = (hashCode + (baseLikesInfoDto == null ? 0 : baseLikesInfoDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode3 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            int i = this.postId;
            String str = this.text;
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i2 = this.date;
            BaseCommentsInfoDto baseCommentsInfoDto = this.comments;
            BaseLikesInfoDto baseLikesInfoDto = this.likes;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder a = kh10.a(i, "NewsfeedItemTopicDto(postId=", ", text=", str, ", type=");
            a.append(newsfeedNewsfeedItemTypeDto);
            a.append(", sourceId=");
            a.append(userId);
            a.append(", date=");
            a.append(i2);
            a.append(", comments=");
            a.append(baseCommentsInfoDto);
            a.append(", likes=");
            a.append(baseLikesInfoDto);
            a.append(", shortTextRate=");
            a.append(f);
            a.append(", feedback=");
            return zn.b(a, newsfeedItemWallpostFeedbackDto, ")");
        }

        public NewsfeedItemTopicDto(int i, String str, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i2, BaseCommentsInfoDto baseCommentsInfoDto, BaseLikesInfoDto baseLikesInfoDto, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.postId = i;
            this.text = str;
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i2;
            this.comments = baseCommentsInfoDto;
            this.likes = baseLikesInfoDto;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemVideoDto extends NewsfeedNewsfeedItemDto {

        @pmi0("carousel_offset")
        private final Integer carouselOffset;

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        @pmi0("video")
        private final NewsfeedItemVideoVideoDto video;

        public /* synthetic */ NewsfeedItemVideoDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, NewsfeedItemVideoVideoDto newsfeedItemVideoVideoDto, Integer num, Integer num2, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : newsfeedItemVideoVideoDto, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? null : f, (i2 & 128) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemVideoDto)) {
                return false;
            }
            NewsfeedItemVideoDto newsfeedItemVideoDto = (NewsfeedItemVideoDto) obj;
            return this.type == newsfeedItemVideoDto.type && epx.f(this.sourceId, newsfeedItemVideoDto.sourceId) && this.date == newsfeedItemVideoDto.date && epx.f(this.video, newsfeedItemVideoDto.video) && epx.f(this.postId, newsfeedItemVideoDto.postId) && epx.f(this.carouselOffset, newsfeedItemVideoDto.carouselOffset) && epx.f(this.shortTextRate, newsfeedItemVideoDto.shortTextRate) && epx.f(this.feedback, newsfeedItemVideoDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            NewsfeedItemVideoVideoDto newsfeedItemVideoVideoDto = this.video;
            int hashCode = (a + (newsfeedItemVideoVideoDto == null ? 0 : newsfeedItemVideoVideoDto.hashCode())) * 31;
            Integer num = this.postId;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.carouselOffset;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode4 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            NewsfeedItemVideoVideoDto newsfeedItemVideoVideoDto = this.video;
            Integer num = this.postId;
            Integer num2 = this.carouselOffset;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemVideoDto(type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i);
            sb.append(", video=");
            sb.append(newsfeedItemVideoVideoDto);
            sb.append(", postId=");
            sq.b(sb, num, ", carouselOffset=", num2, ", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            sb.append(newsfeedItemWallpostFeedbackDto);
            sb.append(")");
            return sb.toString();
        }

        public NewsfeedItemVideoDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, NewsfeedItemVideoVideoDto newsfeedItemVideoVideoDto, Integer num, Integer num2, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.video = newsfeedItemVideoVideoDto;
            this.postId = num;
            this.carouselOffset = num2;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemVideoPostcardBlockDto extends NewsfeedNewsfeedItemDto {

        @pmi0("buttons")
        private final List<BaseLinkButtonDto> buttons;

        @pmi0("date")
        private final int date;

        @pmi0("description")
        private final String description;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
        private final VideoVideoFullDto item;

        @pmi0("privacy_text")
        private final String privacyText;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedItemVideoPostcardBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, String str2, String str3, VideoVideoFullDto videoVideoFullDto, List list, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : videoVideoFullDto, (i2 & 128) != 0 ? null : list, (i2 & 256) != 0 ? null : bool, (i2 & 512) != 0 ? null : f, (i2 & 1024) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemVideoPostcardBlockDto)) {
                return false;
            }
            NewsfeedItemVideoPostcardBlockDto newsfeedItemVideoPostcardBlockDto = (NewsfeedItemVideoPostcardBlockDto) obj;
            return this.type == newsfeedItemVideoPostcardBlockDto.type && epx.f(this.sourceId, newsfeedItemVideoPostcardBlockDto.sourceId) && this.date == newsfeedItemVideoPostcardBlockDto.date && epx.f(this.title, newsfeedItemVideoPostcardBlockDto.title) && epx.f(this.description, newsfeedItemVideoPostcardBlockDto.description) && epx.f(this.privacyText, newsfeedItemVideoPostcardBlockDto.privacyText) && epx.f(this.item, newsfeedItemVideoPostcardBlockDto.item) && epx.f(this.buttons, newsfeedItemVideoPostcardBlockDto.buttons) && epx.f(this.isAsync, newsfeedItemVideoPostcardBlockDto.isAsync) && epx.f(this.shortTextRate, newsfeedItemVideoPostcardBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedItemVideoPostcardBlockDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            String str = this.title;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.privacyText;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            VideoVideoFullDto videoVideoFullDto = this.item;
            int hashCode4 = (hashCode3 + (videoVideoFullDto == null ? 0 : videoVideoFullDto.hashCode())) * 31;
            List<BaseLinkButtonDto> list = this.buttons;
            int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode7 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            String str = this.title;
            String str2 = this.description;
            String str3 = this.privacyText;
            VideoVideoFullDto videoVideoFullDto = this.item;
            List<BaseLinkButtonDto> list = this.buttons;
            Boolean bool = this.isAsync;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemVideoPostcardBlockDto(type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            jax0.a(i, ", title=", str, ", description=", sb);
            n6j.b(sb, str2, ", privacyText=", str3, ", item=");
            sb.append(videoVideoFullDto);
            sb.append(", buttons=");
            sb.append(list);
            sb.append(", isAsync=");
            sb.append(bool);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            return zn.b(sb, newsfeedItemWallpostFeedbackDto, ")");
        }

        public NewsfeedItemVideoPostcardBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, String str2, String str3, VideoVideoFullDto videoVideoFullDto, List<BaseLinkButtonDto> list, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.title = str;
            this.description = str2;
            this.privacyText = str3;
            this.item = videoVideoFullDto;
            this.buttons = list;
            this.isAsync = bool;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemVideosForYouBlockDto extends NewsfeedNewsfeedItemDto {

        @pmi0("button")
        private final BaseLinkButtonDto button;

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("items")
        private final List<VideoVideoFullDto> items;

        @pmi0("next_from")
        private final String nextFrom;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        public /* synthetic */ NewsfeedItemVideosForYouBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, List list, String str2, BaseLinkButtonDto baseLinkButtonDto, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : baseLinkButtonDto, (i2 & 128) != 0 ? null : bool, (i2 & 256) != 0 ? null : f, (i2 & 512) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemVideosForYouBlockDto)) {
                return false;
            }
            NewsfeedItemVideosForYouBlockDto newsfeedItemVideosForYouBlockDto = (NewsfeedItemVideosForYouBlockDto) obj;
            return this.type == newsfeedItemVideosForYouBlockDto.type && epx.f(this.sourceId, newsfeedItemVideosForYouBlockDto.sourceId) && this.date == newsfeedItemVideosForYouBlockDto.date && epx.f(this.title, newsfeedItemVideosForYouBlockDto.title) && epx.f(this.items, newsfeedItemVideosForYouBlockDto.items) && epx.f(this.nextFrom, newsfeedItemVideosForYouBlockDto.nextFrom) && epx.f(this.button, newsfeedItemVideosForYouBlockDto.button) && epx.f(this.isAsync, newsfeedItemVideosForYouBlockDto.isAsync) && epx.f(this.shortTextRate, newsfeedItemVideosForYouBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedItemVideosForYouBlockDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            String str = this.title;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            List<VideoVideoFullDto> list = this.items;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.nextFrom;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            BaseLinkButtonDto baseLinkButtonDto = this.button;
            int hashCode4 = (hashCode3 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode6 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            String str = this.title;
            List<VideoVideoFullDto> list = this.items;
            String str2 = this.nextFrom;
            BaseLinkButtonDto baseLinkButtonDto = this.button;
            Boolean bool = this.isAsync;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemVideosForYouBlockDto(type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            jax0.a(i, ", title=", str, ", items=", sb);
            vr.c(", nextFrom=", str2, ", button=", sb, list);
            sb.append(baseLinkButtonDto);
            sb.append(", isAsync=");
            sb.append(bool);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            sb.append(newsfeedItemWallpostFeedbackDto);
            sb.append(")");
            return sb.toString();
        }

        public NewsfeedItemVideosForYouBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, List<VideoVideoFullDto> list, String str2, BaseLinkButtonDto baseLinkButtonDto, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.title = str;
            this.items = list;
            this.nextFrom = str2;
            this.button = baseLinkButtonDto;
            this.isAsync = bool;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemWallpostDto extends NewsfeedNewsfeedItemDto {

        @pmi0("access_key")
        private final String accessKey;

        @pmi0("attachments")
        private final List<WallWallpostAttachmentDto> attachments;

        @pmi0("can_delete")
        private final BaseBoolIntDto canDelete;

        @pmi0("can_edit")
        private final BaseBoolIntDto canEdit;

        @pmi0("can_pin")
        private final BaseBoolIntDto canPin;

        @pmi0("carousel_offset")
        private final Integer carouselOffset;

        @pmi0("comments")
        private final BaseCommentsInfoDto comments;

        @pmi0("copy_history")
        private final List<WallWallpostFullDto> copyHistory;

        @pmi0("copyright")
        private final WallPostCopyrightDto copyright;

        @pmi0("created_by")
        private final UserId createdBy;

        @pmi0("date")
        private final int date;

        @pmi0("deleted_details")
        private final String deletedDetails;

        @pmi0("deleted_reason")
        private final String deletedReason;

        @pmi0("donut")
        private final WallWallpostDonutDto donut;

        @pmi0("edited")
        private final Integer edited;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("from_id")
        private final UserId fromId;

        @pmi0("geo")
        private final WallGeoDto geo;

        @pmi0("hash")
        private final String hash;

        @pmi0("id")
        private final Integer id;

        @pmi0("is_archived")
        private final Boolean isArchived;

        @pmi0("is_deleted")
        private final Boolean isDeleted;

        @pmi0("is_favorite")
        private final Boolean isFavorite;

        @pmi0("is_pinned")
        private final BaseBoolIntDto isPinned;

        @pmi0("likes")
        private final BaseLikesInfoDto likes;

        @pmi0("marked_as_ads")
        private final BaseBoolIntDto markedAsAds;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("parents_stack")
        private final List<Integer> parentsStack;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("post_source")
        private final WallPostSourceDto postSource;

        @pmi0("post_type")
        private final WallPostTypeDto postType;

        @pmi0("reposts")
        private final BaseRepostsInfoDto reposts;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("signer_id")
        private final UserId signerId;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("text")
        private final String text;

        @pmi0("to_id")
        private final UserId toId;

        @pmi0("topic_id")
        private final TopicIdDto topicId;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        @pmi0("views")
        private final WallViewsDto views;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class TopicIdDto {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TopicIdDto[] $VALUES;

            @pmi0("1")
            public static final TopicIdDto ART;

            @pmi0("0")
            public static final TopicIdDto EMPTY_TOPIC;

            @pmi0("43")
            public static final TopicIdDto FASHION;

            @pmi0("12")
            public static final TopicIdDto GAMES;

            @pmi0("32")
            public static final TopicIdDto HUMOR;

            @pmi0(Gc.e)
            public static final TopicIdDto IT;

            @pmi0("16")
            public static final TopicIdDto MUSIC;

            @pmi0("19")
            public static final TopicIdDto PHOTO;

            @pmi0("21")
            public static final TopicIdDto SCIENCE_AND_TECH;

            @pmi0("23")
            public static final TopicIdDto SPORT;

            @pmi0("25")
            public static final TopicIdDto TRAVEL;

            @pmi0("26")
            public static final TopicIdDto TV_AND_CINEMA;
            private final int value;

            static {
                TopicIdDto topicIdDto = new TopicIdDto("EMPTY_TOPIC", 0, 0);
                EMPTY_TOPIC = topicIdDto;
                TopicIdDto topicIdDto2 = new TopicIdDto("ART", 1, 1);
                ART = topicIdDto2;
                TopicIdDto topicIdDto3 = new TopicIdDto("IT", 2, 7);
                IT = topicIdDto3;
                TopicIdDto topicIdDto4 = new TopicIdDto("GAMES", 3, 12);
                GAMES = topicIdDto4;
                TopicIdDto topicIdDto5 = new TopicIdDto("MUSIC", 4, 16);
                MUSIC = topicIdDto5;
                TopicIdDto topicIdDto6 = new TopicIdDto("PHOTO", 5, 19);
                PHOTO = topicIdDto6;
                TopicIdDto topicIdDto7 = new TopicIdDto("SCIENCE_AND_TECH", 6, 21);
                SCIENCE_AND_TECH = topicIdDto7;
                TopicIdDto topicIdDto8 = new TopicIdDto("SPORT", 7, 23);
                SPORT = topicIdDto8;
                TopicIdDto topicIdDto9 = new TopicIdDto("TRAVEL", 8, 25);
                TRAVEL = topicIdDto9;
                TopicIdDto topicIdDto10 = new TopicIdDto("TV_AND_CINEMA", 9, 26);
                TV_AND_CINEMA = topicIdDto10;
                TopicIdDto topicIdDto11 = new TopicIdDto("HUMOR", 10, 32);
                HUMOR = topicIdDto11;
                TopicIdDto topicIdDto12 = new TopicIdDto("FASHION", 11, 43);
                FASHION = topicIdDto12;
                TopicIdDto[] topicIdDtoArr = {topicIdDto, topicIdDto2, topicIdDto3, topicIdDto4, topicIdDto5, topicIdDto6, topicIdDto7, topicIdDto8, topicIdDto9, topicIdDto10, topicIdDto11, topicIdDto12};
                $VALUES = topicIdDtoArr;
                $ENTRIES = new asp(topicIdDtoArr);
            }

            private TopicIdDto(String str, int i, int i2) {
                this.value = i2;
            }

            public static TopicIdDto valueOf(String str) {
                return (TopicIdDto) Enum.valueOf(TopicIdDto.class, str);
            }

            public static TopicIdDto[] values() {
                return (TopicIdDto[]) $VALUES.clone();
            }
        }

        public /* synthetic */ NewsfeedItemWallpostDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, Integer num, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, List list, BaseBoolIntDto baseBoolIntDto, UserId userId2, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, WallWallpostDonutDto wallWallpostDonutDto, BaseBoolIntDto baseBoolIntDto4, BaseCommentsInfoDto baseCommentsInfoDto, BaseBoolIntDto baseBoolIntDto5, TopicIdDto topicIdDto, String str, UserId userId3, String str2, Boolean bool, String str3, String str4, List list2, WallPostCopyrightDto wallPostCopyrightDto, Integer num2, UserId userId4, WallGeoDto wallGeoDto, Integer num3, Boolean bool2, Boolean bool3, BaseLikesInfoDto baseLikesInfoDto, UserId userId5, Integer num4, List list3, WallPostSourceDto wallPostSourceDto, WallPostTypeDto wallPostTypeDto, BaseRepostsInfoDto baseRepostsInfoDto, UserId userId6, String str5, WallViewsDto wallViewsDto, int i2, int i3, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : f, (i2 & 32) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 64) != 0 ? null : list, (i2 & 128) != 0 ? null : baseBoolIntDto, (i2 & 256) != 0 ? null : userId2, (i2 & 512) != 0 ? null : baseBoolIntDto2, (i2 & 1024) != 0 ? null : baseBoolIntDto3, (i2 & 2048) != 0 ? null : wallWallpostDonutDto, (i2 & 4096) != 0 ? null : baseBoolIntDto4, (i2 & 8192) != 0 ? null : baseCommentsInfoDto, (i2 & 16384) != 0 ? null : baseBoolIntDto5, (32768 & i2) != 0 ? null : topicIdDto, (65536 & i2) != 0 ? null : str, (131072 & i2) != 0 ? null : userId3, (262144 & i2) != 0 ? null : str2, (524288 & i2) != 0 ? null : bool, (1048576 & i2) != 0 ? null : str3, (2097152 & i2) != 0 ? null : str4, (4194304 & i2) != 0 ? null : list2, (8388608 & i2) != 0 ? null : wallPostCopyrightDto, (16777216 & i2) != 0 ? null : num2, (33554432 & i2) != 0 ? null : userId4, (67108864 & i2) != 0 ? null : wallGeoDto, (134217728 & i2) != 0 ? null : num3, (268435456 & i2) != 0 ? null : bool2, (536870912 & i2) != 0 ? null : bool3, (1073741824 & i2) != 0 ? null : baseLikesInfoDto, (i2 & Integer.MIN_VALUE) != 0 ? null : userId5, (i3 & 1) != 0 ? null : num4, (i3 & 2) != 0 ? null : list3, (i3 & 4) != 0 ? null : wallPostSourceDto, (i3 & 8) != 0 ? null : wallPostTypeDto, (i3 & 16) != 0 ? null : baseRepostsInfoDto, (i3 & 32) != 0 ? null : userId6, (i3 & 64) != 0 ? null : str5, (i3 & 128) != 0 ? null : wallViewsDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemWallpostDto)) {
                return false;
            }
            NewsfeedItemWallpostDto newsfeedItemWallpostDto = (NewsfeedItemWallpostDto) obj;
            return this.type == newsfeedItemWallpostDto.type && epx.f(this.sourceId, newsfeedItemWallpostDto.sourceId) && this.date == newsfeedItemWallpostDto.date && epx.f(this.carouselOffset, newsfeedItemWallpostDto.carouselOffset) && epx.f(this.shortTextRate, newsfeedItemWallpostDto.shortTextRate) && epx.f(this.feedback, newsfeedItemWallpostDto.feedback) && epx.f(this.copyHistory, newsfeedItemWallpostDto.copyHistory) && this.canEdit == newsfeedItemWallpostDto.canEdit && epx.f(this.createdBy, newsfeedItemWallpostDto.createdBy) && this.canDelete == newsfeedItemWallpostDto.canDelete && this.canPin == newsfeedItemWallpostDto.canPin && epx.f(this.donut, newsfeedItemWallpostDto.donut) && this.isPinned == newsfeedItemWallpostDto.isPinned && epx.f(this.comments, newsfeedItemWallpostDto.comments) && this.markedAsAds == newsfeedItemWallpostDto.markedAsAds && this.topicId == newsfeedItemWallpostDto.topicId && epx.f(this.hash, newsfeedItemWallpostDto.hash) && epx.f(this.toId, newsfeedItemWallpostDto.toId) && epx.f(this.accessKey, newsfeedItemWallpostDto.accessKey) && epx.f(this.isDeleted, newsfeedItemWallpostDto.isDeleted) && epx.f(this.deletedReason, newsfeedItemWallpostDto.deletedReason) && epx.f(this.deletedDetails, newsfeedItemWallpostDto.deletedDetails) && epx.f(this.attachments, newsfeedItemWallpostDto.attachments) && epx.f(this.copyright, newsfeedItemWallpostDto.copyright) && epx.f(this.edited, newsfeedItemWallpostDto.edited) && epx.f(this.fromId, newsfeedItemWallpostDto.fromId) && epx.f(this.geo, newsfeedItemWallpostDto.geo) && epx.f(this.id, newsfeedItemWallpostDto.id) && epx.f(this.isArchived, newsfeedItemWallpostDto.isArchived) && epx.f(this.isFavorite, newsfeedItemWallpostDto.isFavorite) && epx.f(this.likes, newsfeedItemWallpostDto.likes) && epx.f(this.ownerId, newsfeedItemWallpostDto.ownerId) && epx.f(this.postId, newsfeedItemWallpostDto.postId) && epx.f(this.parentsStack, newsfeedItemWallpostDto.parentsStack) && epx.f(this.postSource, newsfeedItemWallpostDto.postSource) && this.postType == newsfeedItemWallpostDto.postType && epx.f(this.reposts, newsfeedItemWallpostDto.reposts) && epx.f(this.signerId, newsfeedItemWallpostDto.signerId) && epx.f(this.text, newsfeedItemWallpostDto.text) && epx.f(this.views, newsfeedItemWallpostDto.views);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            Integer num = this.carouselOffset;
            int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode3 = (hashCode2 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            List<WallWallpostFullDto> list = this.copyHistory;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto = this.canEdit;
            int hashCode5 = (hashCode4 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
            UserId userId = this.createdBy;
            int hashCode6 = (hashCode5 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            BaseBoolIntDto baseBoolIntDto2 = this.canDelete;
            int hashCode7 = (hashCode6 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto3 = this.canPin;
            int hashCode8 = (hashCode7 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
            WallWallpostDonutDto wallWallpostDonutDto = this.donut;
            int hashCode9 = (hashCode8 + (wallWallpostDonutDto == null ? 0 : wallWallpostDonutDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto4 = this.isPinned;
            int hashCode10 = (hashCode9 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
            BaseCommentsInfoDto baseCommentsInfoDto = this.comments;
            int hashCode11 = (hashCode10 + (baseCommentsInfoDto == null ? 0 : baseCommentsInfoDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto5 = this.markedAsAds;
            int hashCode12 = (hashCode11 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
            TopicIdDto topicIdDto = this.topicId;
            int hashCode13 = (hashCode12 + (topicIdDto == null ? 0 : topicIdDto.hashCode())) * 31;
            String str = this.hash;
            int hashCode14 = (hashCode13 + (str == null ? 0 : str.hashCode())) * 31;
            UserId userId2 = this.toId;
            int hashCode15 = (hashCode14 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
            String str2 = this.accessKey;
            int hashCode16 = (hashCode15 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.isDeleted;
            int hashCode17 = (hashCode16 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.deletedReason;
            int hashCode18 = (hashCode17 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.deletedDetails;
            int hashCode19 = (hashCode18 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List<WallWallpostAttachmentDto> list2 = this.attachments;
            int hashCode20 = (hashCode19 + (list2 == null ? 0 : list2.hashCode())) * 31;
            WallPostCopyrightDto wallPostCopyrightDto = this.copyright;
            int hashCode21 = (hashCode20 + (wallPostCopyrightDto == null ? 0 : wallPostCopyrightDto.hashCode())) * 31;
            Integer num2 = this.edited;
            int hashCode22 = (hashCode21 + (num2 == null ? 0 : num2.hashCode())) * 31;
            UserId userId3 = this.fromId;
            int hashCode23 = (hashCode22 + (userId3 == null ? 0 : Long.hashCode(userId3.b))) * 31;
            WallGeoDto wallGeoDto = this.geo;
            int hashCode24 = (hashCode23 + (wallGeoDto == null ? 0 : wallGeoDto.hashCode())) * 31;
            Integer num3 = this.id;
            int hashCode25 = (hashCode24 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Boolean bool2 = this.isArchived;
            int hashCode26 = (hashCode25 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isFavorite;
            int hashCode27 = (hashCode26 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            BaseLikesInfoDto baseLikesInfoDto = this.likes;
            int hashCode28 = (hashCode27 + (baseLikesInfoDto == null ? 0 : baseLikesInfoDto.hashCode())) * 31;
            UserId userId4 = this.ownerId;
            int hashCode29 = (hashCode28 + (userId4 == null ? 0 : Long.hashCode(userId4.b))) * 31;
            Integer num4 = this.postId;
            int hashCode30 = (hashCode29 + (num4 == null ? 0 : num4.hashCode())) * 31;
            List<Integer> list3 = this.parentsStack;
            int hashCode31 = (hashCode30 + (list3 == null ? 0 : list3.hashCode())) * 31;
            WallPostSourceDto wallPostSourceDto = this.postSource;
            int hashCode32 = (hashCode31 + (wallPostSourceDto == null ? 0 : wallPostSourceDto.hashCode())) * 31;
            WallPostTypeDto wallPostTypeDto = this.postType;
            int hashCode33 = (hashCode32 + (wallPostTypeDto == null ? 0 : wallPostTypeDto.hashCode())) * 31;
            BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
            int hashCode34 = (hashCode33 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
            UserId userId5 = this.signerId;
            int hashCode35 = (hashCode34 + (userId5 == null ? 0 : Long.hashCode(userId5.b))) * 31;
            String str5 = this.text;
            int hashCode36 = (hashCode35 + (str5 == null ? 0 : str5.hashCode())) * 31;
            WallViewsDto wallViewsDto = this.views;
            return hashCode36 + (wallViewsDto != null ? wallViewsDto.hashCode() : 0);
        }

        public final String toString() {
            NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = this.type;
            UserId userId = this.sourceId;
            int i = this.date;
            Integer num = this.carouselOffset;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            List<WallWallpostFullDto> list = this.copyHistory;
            BaseBoolIntDto baseBoolIntDto = this.canEdit;
            UserId userId2 = this.createdBy;
            BaseBoolIntDto baseBoolIntDto2 = this.canDelete;
            BaseBoolIntDto baseBoolIntDto3 = this.canPin;
            WallWallpostDonutDto wallWallpostDonutDto = this.donut;
            BaseBoolIntDto baseBoolIntDto4 = this.isPinned;
            BaseCommentsInfoDto baseCommentsInfoDto = this.comments;
            BaseBoolIntDto baseBoolIntDto5 = this.markedAsAds;
            TopicIdDto topicIdDto = this.topicId;
            String str = this.hash;
            UserId userId3 = this.toId;
            String str2 = this.accessKey;
            Boolean bool = this.isDeleted;
            String str3 = this.deletedReason;
            String str4 = this.deletedDetails;
            List<WallWallpostAttachmentDto> list2 = this.attachments;
            WallPostCopyrightDto wallPostCopyrightDto = this.copyright;
            Integer num2 = this.edited;
            UserId userId4 = this.fromId;
            WallGeoDto wallGeoDto = this.geo;
            Integer num3 = this.id;
            Boolean bool2 = this.isArchived;
            Boolean bool3 = this.isFavorite;
            BaseLikesInfoDto baseLikesInfoDto = this.likes;
            UserId userId5 = this.ownerId;
            Integer num4 = this.postId;
            List<Integer> list3 = this.parentsStack;
            WallPostSourceDto wallPostSourceDto = this.postSource;
            WallPostTypeDto wallPostTypeDto = this.postType;
            BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
            UserId userId6 = this.signerId;
            String str5 = this.text;
            WallViewsDto wallViewsDto = this.views;
            StringBuilder sb = new StringBuilder("NewsfeedItemWallpostDto(type=");
            sb.append(newsfeedNewsfeedItemTypeDto);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i);
            sb.append(", carouselOffset=");
            sb.append(num);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            sb.append(newsfeedItemWallpostFeedbackDto);
            sb.append(", copyHistory=");
            sb.append(list);
            sb.append(", canEdit=");
            sb.append(baseBoolIntDto);
            sb.append(", createdBy=");
            sb.append(userId2);
            sb.append(", canDelete=");
            sb.append(baseBoolIntDto2);
            sb.append(", canPin=");
            sb.append(baseBoolIntDto3);
            sb.append(", donut=");
            sb.append(wallWallpostDonutDto);
            sb.append(", isPinned=");
            sb.append(baseBoolIntDto4);
            sb.append(", comments=");
            sb.append(baseCommentsInfoDto);
            sb.append(", markedAsAds=");
            sb.append(baseBoolIntDto5);
            sb.append(", topicId=");
            sb.append(topicIdDto);
            sb.append(", hash=");
            sb.append(str);
            sb.append(", toId=");
            sb.append(userId3);
            sb.append(", accessKey=");
            uq.c(bool, str2, ", isDeleted=", ", deletedReason=", sb);
            n6j.b(sb, str3, ", deletedDetails=", str4, ", attachments=");
            sb.append(list2);
            sb.append(", copyright=");
            sb.append(wallPostCopyrightDto);
            sb.append(", edited=");
            sb.append(num2);
            sb.append(", fromId=");
            sb.append(userId4);
            sb.append(", geo=");
            sb.append(wallGeoDto);
            sb.append(", id=");
            sb.append(num3);
            sb.append(", isArchived=");
            tq.i(sb, bool2, ", isFavorite=", bool3, ", likes=");
            sb.append(baseLikesInfoDto);
            sb.append(", ownerId=");
            sb.append(userId5);
            sb.append(", postId=");
            sb.append(num4);
            sb.append(", parentsStack=");
            sb.append(list3);
            sb.append(", postSource=");
            sb.append(wallPostSourceDto);
            sb.append(", postType=");
            sb.append(wallPostTypeDto);
            sb.append(", reposts=");
            sb.append(baseRepostsInfoDto);
            sb.append(", signerId=");
            sb.append(userId6);
            sb.append(", text=");
            sb.append(str5);
            sb.append(", views=");
            sb.append(wallViewsDto);
            sb.append(")");
            return sb.toString();
        }

        public NewsfeedItemWallpostDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, Integer num, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, List<WallWallpostFullDto> list, BaseBoolIntDto baseBoolIntDto, UserId userId2, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, WallWallpostDonutDto wallWallpostDonutDto, BaseBoolIntDto baseBoolIntDto4, BaseCommentsInfoDto baseCommentsInfoDto, BaseBoolIntDto baseBoolIntDto5, TopicIdDto topicIdDto, String str, UserId userId3, String str2, Boolean bool, String str3, String str4, List<WallWallpostAttachmentDto> list2, WallPostCopyrightDto wallPostCopyrightDto, Integer num2, UserId userId4, WallGeoDto wallGeoDto, Integer num3, Boolean bool2, Boolean bool3, BaseLikesInfoDto baseLikesInfoDto, UserId userId5, Integer num4, List<Integer> list3, WallPostSourceDto wallPostSourceDto, WallPostTypeDto wallPostTypeDto, BaseRepostsInfoDto baseRepostsInfoDto, UserId userId6, String str5, WallViewsDto wallViewsDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.carouselOffset = num;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.copyHistory = list;
            this.canEdit = baseBoolIntDto;
            this.createdBy = userId2;
            this.canDelete = baseBoolIntDto2;
            this.canPin = baseBoolIntDto3;
            this.donut = wallWallpostDonutDto;
            this.isPinned = baseBoolIntDto4;
            this.comments = baseCommentsInfoDto;
            this.markedAsAds = baseBoolIntDto5;
            this.topicId = topicIdDto;
            this.hash = str;
            this.toId = userId3;
            this.accessKey = str2;
            this.isDeleted = bool;
            this.deletedReason = str3;
            this.deletedDetails = str4;
            this.attachments = list2;
            this.copyright = wallPostCopyrightDto;
            this.edited = num2;
            this.fromId = userId4;
            this.geo = wallGeoDto;
            this.id = num3;
            this.isArchived = bool2;
            this.isFavorite = bool3;
            this.likes = baseLikesInfoDto;
            this.ownerId = userId5;
            this.postId = num4;
            this.parentsStack = list3;
            this.postSource = wallPostSourceDto;
            this.postType = wallPostTypeDto;
            this.reposts = baseRepostsInfoDto;
            this.signerId = userId6;
            this.text = str5;
            this.views = wallViewsDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemWorkiCarouselBlockDto extends NewsfeedNewsfeedItemDto {

        @pmi0("block_title")
        private final String blockTitle;

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("items")
        private final List<ClassifiedsWorkiCarouselItemDto> items;

        @pmi0("more_button")
        private final BaseLinkButtonDto moreButton;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final String type;

        public /* synthetic */ NewsfeedItemWorkiCarouselBlockDto(String str, List list, UserId userId, int i, String str2, BaseLinkButtonDto baseLinkButtonDto, String str3, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(str, list, userId, i, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : baseLinkButtonDto, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : bool, (i2 & 256) != 0 ? null : f, (i2 & 512) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemWorkiCarouselBlockDto)) {
                return false;
            }
            NewsfeedItemWorkiCarouselBlockDto newsfeedItemWorkiCarouselBlockDto = (NewsfeedItemWorkiCarouselBlockDto) obj;
            return epx.f(this.type, newsfeedItemWorkiCarouselBlockDto.type) && epx.f(this.items, newsfeedItemWorkiCarouselBlockDto.items) && epx.f(this.sourceId, newsfeedItemWorkiCarouselBlockDto.sourceId) && this.date == newsfeedItemWorkiCarouselBlockDto.date && epx.f(this.blockTitle, newsfeedItemWorkiCarouselBlockDto.blockTitle) && epx.f(this.moreButton, newsfeedItemWorkiCarouselBlockDto.moreButton) && epx.f(this.trackCode, newsfeedItemWorkiCarouselBlockDto.trackCode) && epx.f(this.isAsync, newsfeedItemWorkiCarouselBlockDto.isAsync) && epx.f(this.shortTextRate, newsfeedItemWorkiCarouselBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedItemWorkiCarouselBlockDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(fw3.a(this.type.hashCode() * 31, 31, this.items), 31, this.sourceId.b), 31);
            String str = this.blockTitle;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            BaseLinkButtonDto baseLinkButtonDto = this.moreButton;
            int hashCode2 = (hashCode + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
            String str2 = this.trackCode;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode5 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            String str = this.type;
            List<ClassifiedsWorkiCarouselItemDto> list = this.items;
            UserId userId = this.sourceId;
            int i = this.date;
            String str2 = this.blockTitle;
            BaseLinkButtonDto baseLinkButtonDto = this.moreButton;
            String str3 = this.trackCode;
            Boolean bool = this.isAsync;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemWorkiCarouselBlockDto(type=");
            sb.append(str);
            sb.append(", items=");
            sb.append(list);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i);
            sb.append(", blockTitle=");
            sb.append(str2);
            sb.append(", moreButton=");
            sb.append(baseLinkButtonDto);
            sb.append(", trackCode=");
            uq.c(bool, str3, ", isAsync=", ", shortTextRate=", sb);
            sb.append(f);
            sb.append(", feedback=");
            sb.append(newsfeedItemWallpostFeedbackDto);
            sb.append(")");
            return sb.toString();
        }

        public NewsfeedItemWorkiCarouselBlockDto(String str, List<ClassifiedsWorkiCarouselItemDto> list, UserId userId, int i, String str2, BaseLinkButtonDto baseLinkButtonDto, String str3, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.type = str;
            this.items = list;
            this.sourceId = userId;
            this.date = i;
            this.blockTitle = str2;
            this.moreButton = baseLinkButtonDto;
            this.trackCode = str3;
            this.isAsync = bool;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemYoulaCarouselBlockDto extends NewsfeedNewsfeedItemDto {

        @pmi0("block_description")
        private final String blockDescription;

        @pmi0("block_title")
        private final String blockTitle;

        @pmi0("can_be_filtered")
        private final Boolean canBeFiltered;

        @pmi0("create_button_url")
        private final String createButtonUrl;

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("group")
        private final ClassifiedsYoulaCarouselBlockGroupDto group;

        @pmi0("is_async")
        private final boolean isAsync;

        @pmi0("items")
        private final List<ClassifiedsYoulaItemExtendedDto> items;

        @pmi0("more_button_url")
        private final String moreButtonUrl;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final String type;

        @pmi0("view_style")
        private final String viewStyle;

        public /* synthetic */ NewsfeedItemYoulaCarouselBlockDto(String str, List list, String str2, String str3, boolean z, UserId userId, int i, Boolean bool, String str4, String str5, String str6, ClassifiedsYoulaCarouselBlockGroupDto classifiedsYoulaCarouselBlockGroupDto, String str7, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(str, list, str2, str3, z, userId, i, (i2 & 128) != 0 ? null : bool, (i2 & 256) != 0 ? null : str4, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? null : str6, (i2 & 2048) != 0 ? null : classifiedsYoulaCarouselBlockGroupDto, (i2 & 4096) != 0 ? null : str7, (i2 & 8192) != 0 ? null : f, (i2 & 16384) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemYoulaCarouselBlockDto)) {
                return false;
            }
            NewsfeedItemYoulaCarouselBlockDto newsfeedItemYoulaCarouselBlockDto = (NewsfeedItemYoulaCarouselBlockDto) obj;
            return epx.f(this.type, newsfeedItemYoulaCarouselBlockDto.type) && epx.f(this.items, newsfeedItemYoulaCarouselBlockDto.items) && epx.f(this.createButtonUrl, newsfeedItemYoulaCarouselBlockDto.createButtonUrl) && epx.f(this.moreButtonUrl, newsfeedItemYoulaCarouselBlockDto.moreButtonUrl) && this.isAsync == newsfeedItemYoulaCarouselBlockDto.isAsync && epx.f(this.sourceId, newsfeedItemYoulaCarouselBlockDto.sourceId) && this.date == newsfeedItemYoulaCarouselBlockDto.date && epx.f(this.canBeFiltered, newsfeedItemYoulaCarouselBlockDto.canBeFiltered) && epx.f(this.blockTitle, newsfeedItemYoulaCarouselBlockDto.blockTitle) && epx.f(this.blockDescription, newsfeedItemYoulaCarouselBlockDto.blockDescription) && epx.f(this.trackCode, newsfeedItemYoulaCarouselBlockDto.trackCode) && epx.f(this.group, newsfeedItemYoulaCarouselBlockDto.group) && epx.f(this.viewStyle, newsfeedItemYoulaCarouselBlockDto.viewStyle) && epx.f(this.shortTextRate, newsfeedItemYoulaCarouselBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedItemYoulaCarouselBlockDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(qoy.b(urd0.a(urd0.a(fw3.a(this.type.hashCode() * 31, 31, this.items), 31, this.createButtonUrl), 31, this.moreButtonUrl), 31, this.isAsync), 31, this.sourceId.b), 31);
            Boolean bool = this.canBeFiltered;
            int hashCode = (a + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.blockTitle;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.blockDescription;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.trackCode;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            ClassifiedsYoulaCarouselBlockGroupDto classifiedsYoulaCarouselBlockGroupDto = this.group;
            int hashCode5 = (hashCode4 + (classifiedsYoulaCarouselBlockGroupDto == null ? 0 : classifiedsYoulaCarouselBlockGroupDto.hashCode())) * 31;
            String str4 = this.viewStyle;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode7 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            String str = this.type;
            List<ClassifiedsYoulaItemExtendedDto> list = this.items;
            String str2 = this.createButtonUrl;
            String str3 = this.moreButtonUrl;
            boolean z = this.isAsync;
            UserId userId = this.sourceId;
            int i = this.date;
            Boolean bool = this.canBeFiltered;
            String str4 = this.blockTitle;
            String str5 = this.blockDescription;
            String str6 = this.trackCode;
            ClassifiedsYoulaCarouselBlockGroupDto classifiedsYoulaCarouselBlockGroupDto = this.group;
            String str7 = this.viewStyle;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder sb = new StringBuilder("NewsfeedItemYoulaCarouselBlockDto(type=");
            sb.append(str);
            sb.append(", items=");
            sb.append(list);
            sb.append(", createButtonUrl=");
            n6j.b(sb, str2, ", moreButtonUrl=", str3, ", isAsync=");
            sb.append(z);
            sb.append(", sourceId=");
            sb.append(userId);
            sb.append(", date=");
            sb.append(i);
            sb.append(", canBeFiltered=");
            sb.append(bool);
            sb.append(", blockTitle=");
            n6j.b(sb, str4, ", blockDescription=", str5, ", trackCode=");
            sb.append(str6);
            sb.append(", group=");
            sb.append(classifiedsYoulaCarouselBlockGroupDto);
            sb.append(", viewStyle=");
            sb.append(str7);
            sb.append(", shortTextRate=");
            sb.append(f);
            sb.append(", feedback=");
            return zn.b(sb, newsfeedItemWallpostFeedbackDto, ")");
        }

        public NewsfeedItemYoulaCarouselBlockDto(String str, List<ClassifiedsYoulaItemExtendedDto> list, String str2, String str3, boolean z, UserId userId, int i, Boolean bool, String str4, String str5, String str6, ClassifiedsYoulaCarouselBlockGroupDto classifiedsYoulaCarouselBlockGroupDto, String str7, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.type = str;
            this.items = list;
            this.createButtonUrl = str2;
            this.moreButtonUrl = str3;
            this.isAsync = z;
            this.sourceId = userId;
            this.date = i;
            this.canBeFiltered = bool;
            this.blockTitle = str4;
            this.blockDescription = str5;
            this.trackCode = str6;
            this.group = classifiedsYoulaCarouselBlockGroupDto;
            this.viewStyle = str7;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemYoulaGroupsBlockDto extends NewsfeedNewsfeedItemDto {

        @pmi0("data")
        private final ClassifiedsYoulaGroupsBlockDto data;

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final boolean isAsync;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final String type;

        public /* synthetic */ NewsfeedItemYoulaGroupsBlockDto(String str, String str2, String str3, boolean z, UserId userId, int i, ClassifiedsYoulaGroupsBlockDto classifiedsYoulaGroupsBlockDto, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i2, zcl zclVar) {
            this(str, str2, str3, z, userId, i, (i2 & 64) != 0 ? null : classifiedsYoulaGroupsBlockDto, (i2 & 128) != 0 ? null : f, (i2 & 256) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemYoulaGroupsBlockDto)) {
                return false;
            }
            NewsfeedItemYoulaGroupsBlockDto newsfeedItemYoulaGroupsBlockDto = (NewsfeedItemYoulaGroupsBlockDto) obj;
            return epx.f(this.type, newsfeedItemYoulaGroupsBlockDto.type) && epx.f(this.title, newsfeedItemYoulaGroupsBlockDto.title) && epx.f(this.trackCode, newsfeedItemYoulaGroupsBlockDto.trackCode) && this.isAsync == newsfeedItemYoulaGroupsBlockDto.isAsync && epx.f(this.sourceId, newsfeedItemYoulaGroupsBlockDto.sourceId) && this.date == newsfeedItemYoulaGroupsBlockDto.date && epx.f(this.data, newsfeedItemYoulaGroupsBlockDto.data) && epx.f(this.shortTextRate, newsfeedItemYoulaGroupsBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedItemYoulaGroupsBlockDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(qoy.b(urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.title), 31, this.trackCode), 31, this.isAsync), 31, this.sourceId.b), 31);
            ClassifiedsYoulaGroupsBlockDto classifiedsYoulaGroupsBlockDto = this.data;
            int hashCode = (a + (classifiedsYoulaGroupsBlockDto == null ? 0 : classifiedsYoulaGroupsBlockDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode2 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            String str = this.type;
            String str2 = this.title;
            String str3 = this.trackCode;
            boolean z = this.isAsync;
            UserId userId = this.sourceId;
            int i = this.date;
            ClassifiedsYoulaGroupsBlockDto classifiedsYoulaGroupsBlockDto = this.data;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder a = xe9.a("NewsfeedItemYoulaGroupsBlockDto(type=", str, ", title=", str2, ", trackCode=");
            a.append(str3);
            a.append(", isAsync=");
            a.append(z);
            a.append(", sourceId=");
            a.append(userId);
            a.append(", date=");
            a.append(i);
            a.append(", data=");
            a.append(classifiedsYoulaGroupsBlockDto);
            a.append(", shortTextRate=");
            a.append(f);
            a.append(", feedback=");
            return zn.b(a, newsfeedItemWallpostFeedbackDto, ")");
        }

        public NewsfeedItemYoulaGroupsBlockDto(String str, String str2, String str3, boolean z, UserId userId, int i, ClassifiedsYoulaGroupsBlockDto classifiedsYoulaGroupsBlockDto, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.type = str;
            this.title = str2;
            this.trackCode = str3;
            this.isAsync = z;
            this.sourceId = userId;
            this.date = i;
            this.data = classifiedsYoulaGroupsBlockDto;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedMediaDiscoverBlockDto extends NewsfeedNewsfeedItemDto {

        @pmi0("date")
        private final int date;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("height")
        private final int height;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("items")
        private final List<NewsfeedMediaDiscoverItemDto> items;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final String type;

        @pmi0("width")
        private final int width;

        public /* synthetic */ NewsfeedMediaDiscoverBlockDto(int i, int i2, String str, List list, UserId userId, int i3, String str2, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, int i4, zcl zclVar) {
            this(i, i2, str, list, userId, i3, (i4 & 64) != 0 ? null : str2, (i4 & 128) != 0 ? null : bool, (i4 & 256) != 0 ? null : f, (i4 & 512) != 0 ? null : newsfeedItemWallpostFeedbackDto);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedMediaDiscoverBlockDto)) {
                return false;
            }
            NewsfeedMediaDiscoverBlockDto newsfeedMediaDiscoverBlockDto = (NewsfeedMediaDiscoverBlockDto) obj;
            return this.width == newsfeedMediaDiscoverBlockDto.width && this.height == newsfeedMediaDiscoverBlockDto.height && epx.f(this.type, newsfeedMediaDiscoverBlockDto.type) && epx.f(this.items, newsfeedMediaDiscoverBlockDto.items) && epx.f(this.sourceId, newsfeedMediaDiscoverBlockDto.sourceId) && this.date == newsfeedMediaDiscoverBlockDto.date && epx.f(this.trackCode, newsfeedMediaDiscoverBlockDto.trackCode) && epx.f(this.isAsync, newsfeedMediaDiscoverBlockDto.isAsync) && epx.f(this.shortTextRate, newsfeedMediaDiscoverBlockDto.shortTextRate) && epx.f(this.feedback, newsfeedMediaDiscoverBlockDto.feedback);
        }

        public final int hashCode() {
            int a = shy.a(this.date, bh10.a(fw3.a(urd0.a(shy.a(this.height, Integer.hashCode(this.width) * 31, 31), 31, this.type), 31, this.items), 31, this.sourceId.b), 31);
            String str = this.trackCode;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            return hashCode3 + (newsfeedItemWallpostFeedbackDto != null ? newsfeedItemWallpostFeedbackDto.hashCode() : 0);
        }

        public final String toString() {
            int i = this.width;
            int i2 = this.height;
            String str = this.type;
            List<NewsfeedMediaDiscoverItemDto> list = this.items;
            UserId userId = this.sourceId;
            int i3 = this.date;
            String str2 = this.trackCode;
            Boolean bool = this.isAsync;
            Float f = this.shortTextRate;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            StringBuilder a = odj.a(i, i2, "NewsfeedMediaDiscoverBlockDto(width=", ", height=", ", type=");
            b.c(str, ", items=", ", sourceId=", a, list);
            a.append(userId);
            a.append(", date=");
            a.append(i3);
            a.append(", trackCode=");
            uq.c(bool, str2, ", isAsync=", ", shortTextRate=", a);
            a.append(f);
            a.append(", feedback=");
            a.append(newsfeedItemWallpostFeedbackDto);
            a.append(")");
            return a.toString();
        }

        public NewsfeedMediaDiscoverBlockDto(int i, int i2, String str, List<NewsfeedMediaDiscoverItemDto> list, UserId userId, int i3, String str2, Boolean bool, Float f, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto) {
            super(null);
            this.width = i;
            this.height = i2;
            this.type = str;
            this.items = list;
            this.sourceId = userId;
            this.date = i3;
            this.trackCode = str2;
            this.isAsync = bool;
            this.shortTextRate = f;
            this.feedback = newsfeedItemWallpostFeedbackDto;
        }
    }

    public /* synthetic */ NewsfeedNewsfeedItemDto(zcl zclVar) {
        this();
    }

    private NewsfeedNewsfeedItemDto() {
    }
}
