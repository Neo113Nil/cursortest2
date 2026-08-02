package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.ironsource.Ad;
import com.ironsource.Gc;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.ads.dto.AdsAdvertiserInfoDto;
import com.vk.api.generated.ads.dto.AdsChoicesDto;
import com.vk.api.generated.ads.dto.AdsHideReasonsDto;
import com.vk.api.generated.ads.dto.AdsItemBlockAdItemDto;
import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.badges.dto.BadgesCommentInfoDto;
import com.vk.api.generated.badges.dto.BadgesDonutInfoDto;
import com.vk.api.generated.badges.dto.BadgesObjectInfoDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseBottomExtensionDto;
import com.vk.api.generated.base.dto.BaseCommentsInfoDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLikesDto;
import com.vk.api.generated.base.dto.BaseLikesInfoDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.base.dto.BaseLinkDto;
import com.vk.api.generated.base.dto.BaseRepostsInfoDto;
import com.vk.api.generated.classifieds.dto.ClassifiedsYoulaCarouselBlockGroupDto;
import com.vk.api.generated.classifieds.dto.ClassifiedsYoulaItemExtendedDto;
import com.vk.api.generated.discover.dto.DiscoverCarouselButtonDto;
import com.vk.api.generated.discover.dto.DiscoverCarouselItemDto;
import com.vk.api.generated.discover.dto.DiscoverCarouselObjectsTypeDto;
import com.vk.api.generated.friends.dto.FriendsEntrypointsDto;
import com.vk.api.generated.friends.dto.FriendsRecBlockFooterDto;
import com.vk.api.generated.friends.dto.FriendsRecBlockInfoCardDto;
import com.vk.api.generated.friends.dto.FriendsRecProfileDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsSuggestionDto;
import com.vk.api.generated.likes.dto.LikesItemReactionsDto;
import com.vk.api.generated.market.dto.MarketBadgeDto;
import com.vk.api.generated.market.dto.MarketCustomButtonFullDto;
import com.vk.api.generated.market.dto.MarketDeliveryInfoDto;
import com.vk.api.generated.market.dto.MarketDeliveryMethodsInfoDto;
import com.vk.api.generated.market.dto.MarketItemAddressesDto;
import com.vk.api.generated.market.dto.MarketItemBannerDto;
import com.vk.api.generated.market.dto.MarketItemCharacteristicDto;
import com.vk.api.generated.market.dto.MarketItemDimensionsDto;
import com.vk.api.generated.market.dto.MarketItemLabelDto;
import com.vk.api.generated.market.dto.MarketItemOwnerInfoDto;
import com.vk.api.generated.market.dto.MarketItemPromotionInfoDto;
import com.vk.api.generated.market.dto.MarketItemPropertyValueDto;
import com.vk.api.generated.market.dto.MarketItemPropertyVariantsDto;
import com.vk.api.generated.market.dto.MarketItemRejectInfoDto;
import com.vk.api.generated.market.dto.MarketItemVideoDto;
import com.vk.api.generated.market.dto.MarketMarketCategoryDto;
import com.vk.api.generated.market.dto.MarketMarketItemAvailabilityDto;
import com.vk.api.generated.market.dto.MarketMarketItemIntegrationInfoDto;
import com.vk.api.generated.market.dto.MarketMarketItemOtherItemsDto;
import com.vk.api.generated.market.dto.MarketMarketItemRatingDto;
import com.vk.api.generated.market.dto.MarketMarketItemTypeDto;
import com.vk.api.generated.market.dto.MarketPriceDto;
import com.vk.api.generated.market.dto.MarketPropertyDto;
import com.vk.api.generated.market.dto.MarketServicesDurationDto;
import com.vk.api.generated.market.dto.MarketSimilarItemsDto;
import com.vk.api.generated.market.dto.MarketVariantsGridPropertyDto;
import com.vk.api.generated.marketCarousel.dto.MarketCarouselBlockPanelDto;
import com.vk.api.generated.marketCarousel.dto.MarketCarouselItemDto;
import com.vk.api.generated.messages.dto.MessagesChatSuggestionDto;
import com.vk.api.generated.narratives.dto.NarrativesNarrativeDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.photos.dto.PhotosTagsSuggestionItemDto;
import com.vk.api.generated.photos.dto.PhotosTagsSuggestionItemEndCardDto;
import com.vk.api.generated.textlives.dto.TextlivesTextliveTextpostBlockDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.wall.dto.WallCoownersDto;
import com.vk.api.generated.wall.dto.WallGeoDto;
import com.vk.api.generated.wall.dto.WallPostActivityDto;
import com.vk.api.generated.wall.dto.WallPostCopyrightDto;
import com.vk.api.generated.wall.dto.WallPostSourceDto;
import com.vk.api.generated.wall.dto.WallPostTypeDto;
import com.vk.api.generated.wall.dto.WallPosterDto;
import com.vk.api.generated.wall.dto.WallSharingDto;
import com.vk.api.generated.wall.dto.WallViewsDto;
import com.vk.api.generated.wall.dto.WallWallpostAdsEasyPromoteDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentsMetaDto;
import com.vk.api.generated.wall.dto.WallWallpostAuthorDataDto;
import com.vk.api.generated.wall.dto.WallWallpostCategoryActionDto;
import com.vk.api.generated.wall.dto.WallWallpostContentLayoutItemDto;
import com.vk.api.generated.wall.dto.WallWallpostDonutDto;
import com.vk.api.generated.wall.dto.WallWallpostFullDto;
import com.vk.api.generated.wall.dto.WallWallpostRatingDto;
import com.vk.dto.common.id.UserId;
import io.appmetrica.analytics.impl.L2;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a9y;
import xsna.ao;
import xsna.asp;
import xsna.b9y;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fq;
import xsna.fw3;
import xsna.go9;
import xsna.ho8;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.sn;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: NewsfeedNewsfeedItemDto.kt */
/* loaded from: classes15.dex */
public abstract class NewsfeedNewsfeedItemDto implements Parcelable {

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
                    case -1949773767:
                        if (f.equals("feedback_poll")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemFeedbackPollDto.class);
                        }
                        break;
                    case -1889933482:
                        if (f.equals("recommended_game")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemRecommendedAppBlockDto.class);
                        }
                        break;
                    case -1785032422:
                        if (f.equals("stories_interesting_block")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemStoriesInterestingBlockDto.class);
                        }
                        break;
                    case -1705620030:
                        if (f.equals("videos_for_you")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemVideosForYouBlockDto.class);
                        }
                        break;
                    case -1427944719:
                        if (f.equals("animated_block")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemAnimatedBlockDto.class);
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
                    case -1245090508:
                        if (f.equals("recommended_channels")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemRecommendedChannelsBlockDto.class);
                        }
                        break;
                    case -1172176381:
                        if (f.equals("market_carousel")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemMarketCarouselBlockDto.class);
                        }
                        break;
                    case -1143186148:
                        if (f.equals("discover_media_block")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedMediaDiscoverBlockDto.class);
                        }
                        break;
                    case -1084348323:
                        if (f.equals("dzen_story_news")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedDzenStoryNewsBlockDto.class);
                        }
                        break;
                    case -1081306052:
                        if (f.equals("market")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemMarketItemDto.class);
                        }
                        break;
                    case -1058101527:
                        if (f.equals("dzen_top_stories")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedDzenTopStoriesBlockDto.class);
                        }
                        break;
                    case -1002924135:
                        if (f.equals("textlive")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemTextliveBlockDto.class);
                        }
                        break;
                    case -950686775:
                        if (f.equals("tags_suggestions")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemRecognizeBlockDto.class);
                        }
                        break;
                    case -847657971:
                        if (f.equals("photo_tag")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemPhotoTagDto.class);
                        }
                        break;
                    case -839206156:
                        if (f.equals("video_postcard")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemVideoPostcardBlockDto.class);
                        }
                        break;
                    case -818740184:
                        if (f.equals("recommended_artists")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemRecommendedArtistsBlockDto.class);
                        }
                        break;
                    case -490286660:
                        if (f.equals("info_block")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedInfoBlockDto.class);
                        }
                        break;
                    case -266144228:
                        if (f.equals("user_rec")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemFriendsRecommendBlockDto.class);
                        }
                        break;
                    case -156968180:
                        if (f.equals("clips_challenges")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemClipsChallengesBlockUmbrellaDto.class);
                        }
                        break;
                    case -1391256:
                        if (f.equals("videos_promo")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemVideosPromoBlockDto.class);
                        }
                        break;
                    case 96432:
                        if (f.equals(b.JSON_KEY_ADS)) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemAdsBlockDto.class);
                        }
                        break;
                    case 3056464:
                        if (f.equals("clip")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemVideoDto.class);
                        }
                        break;
                    case 3446944:
                        if (f.equals("post")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemWallpostDto.class);
                        }
                        break;
                    case 79592101:
                        if (f.equals("mini_apps_carousel")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemAppsCarouselDto.class);
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
                    case 122611998:
                        if (f.equals("games_carousel")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemAppsCarouselDto.class);
                        }
                        break;
                    case 190908443:
                        if (f.equals("audio_playlist")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemAudioPlaylistDto.class);
                        }
                        break;
                    case 257758109:
                        if (f.equals("recommended_mini_app")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemRecommendedAppBlockDto.class);
                        }
                        break;
                    case 284564905:
                        if (f.equals("friends_recomm")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemFriendsRecommendBlockDto.class);
                        }
                        break;
                    case 310369378:
                        if (f.equals("promo_button")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemPromoButtonDto.class);
                        }
                        break;
                    case 380996459:
                        if (f.equals("youla_carousel")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemYoulaCarouselBlockDto.class);
                        }
                        break;
                    case 391524801:
                        if (f.equals("recommended_audios")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemRecommendedAudiosBlockDto.class);
                        }
                        break;
                    case 415799170:
                        if (f.equals("recommended_games_carousel")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemAppsCarouselDto.class);
                        }
                        break;
                    case 560868408:
                        if (f.equals("recommended_groups")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemRecommendedGroupsBlockDto.class);
                        }
                        break;
                    case 731026457:
                        if (f.equals("authors_rec")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemFriendsRecommendBlockDto.class);
                        }
                        break;
                    case 1024302077:
                        if (f.equals("recommended_playlists")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemMusicSelectionsBlockDto.class);
                        }
                        break;
                    case 1066553492:
                        if (f.equals("liked_by_friends_groups")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemFriendsRecommendationsGroupsBlockDto.class);
                        }
                        break;
                    case 1158025968:
                        if (f.equals("uxpoll_block")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemUxpollBlockDto.class);
                        }
                        break;
                    case 1393866795:
                        if (f.equals("friends_entrypoints")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemFriendsEntrypointsBlockDto.class);
                        }
                        break;
                    case 1538107703:
                        if (f.equals("recommended_chats")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemRecommendedChatsBlockDto.class);
                        }
                        break;
                    case 1546107647:
                        if (f.equals("clips_autoplay")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemClipsAutoplayBlockDto.class);
                        }
                        break;
                    case 1841184942:
                        if (f.equals("holiday_friends")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemFriendsRecommendBlockDto.class);
                        }
                        break;
                    case 1942317069:
                        if (f.equals("dzen_block")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedDzenBlockDto.class);
                        }
                        break;
                    case 1951436805:
                        if (f.equals("expert_card")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemExpertCardWidgetDto.class);
                        }
                        break;
                    case 2088265419:
                        if (f.equals("signals")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemSignalsDto.class);
                        }
                        break;
                    case 2092276482:
                        if (f.equals("achievement_game")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemAchievementGameBlockDto.class);
                        }
                        break;
                    case 2124138149:
                        if (f.equals("recommended_narratives")) {
                            return (NewsfeedNewsfeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, NewsfeedItemRecommendedNarrativesBlockDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedDzenBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedDzenBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("header")
        private final NewsfeedDzenBlockHeaderDto header;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("dzen_block")
            public static final TypeDto DZEN_BLOCK;
            private final String value;

            /* compiled from: NewsfeedNewsfeedItemDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("DZEN_BLOCK", 0, "dzen_block");
                DZEN_BLOCK = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
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

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedDzenBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedDzenBlockDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                NewsfeedDzenBlockHeaderDto createFromParcel2 = NewsfeedDzenBlockHeaderDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                UserId userId = (UserId) parcel.readParcelable(NewsfeedDzenBlockDto.class.getClassLoader());
                int readInt = parcel.readInt();
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedDzenBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedDzenBlockDto.class.getClassLoader());
                Float valueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedDzenBlockDto.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedDzenBlockDto(createFromParcel, createFromParcel2, readString, userId, readInt, valueOf, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, wallPostActivityDto, valueOf4, newsfeedPushSubscriptionDto, bool, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedDzenBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedDzenBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedDzenBlockDto[] newArray(int i) {
                return new NewsfeedDzenBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedDzenBlockDto(TypeDto typeDto, NewsfeedDzenBlockHeaderDto newsfeedDzenBlockHeaderDto, String str, UserId userId, int i, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(typeDto, newsfeedDzenBlockHeaderDto, str, userId, i, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : bool2, (i2 & 128) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 256) != 0 ? null : bool3, (i2 & 512) != 0 ? null : wallPostActivityDto, (i2 & 1024) != 0 ? null : f, (i2 & 2048) != 0 ? null : newsfeedPushSubscriptionDto, (i2 & 4096) != 0 ? null : bool4, (i2 & 8192) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 16384) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedDzenBlockDto)) {
                return false;
            }
            NewsfeedDzenBlockDto newsfeedDzenBlockDto = (NewsfeedDzenBlockDto) obj;
            return this.type == newsfeedDzenBlockDto.type && epx.f(this.header, newsfeedDzenBlockDto.header) && epx.f(this.trackCode, newsfeedDzenBlockDto.trackCode) && epx.f(this.sourceId, newsfeedDzenBlockDto.sourceId) && this.date == newsfeedDzenBlockDto.date && epx.f(this.isAsync, newsfeedDzenBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedDzenBlockDto.canIgnore) && epx.f(this.caption, newsfeedDzenBlockDto.caption) && epx.f(this.keepOffline, newsfeedDzenBlockDto.keepOffline) && epx.f(this.activity, newsfeedDzenBlockDto.activity) && epx.f(this.shortTextRate, newsfeedDzenBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedDzenBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedDzenBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedDzenBlockDto.feedback) && epx.f(this.debugInfo, newsfeedDzenBlockDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(urd0.a((this.header.hashCode() + (this.type.hashCode() * 31)) * 31, 31, this.trackCode), 31, this.sourceId.b), 31);
            Boolean bool = this.isAsync;
            int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.canIgnore;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode3 = (hashCode2 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode5 = (hashCode4 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode7 = (hashCode6 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode9 = (hashCode8 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode9 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedDzenBlockDto(type=");
            sb.append(this.type);
            sb.append(", header=");
            sb.append(this.header);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.header.writeToParcel(parcel, i);
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedDzenBlockDto(TypeDto typeDto, NewsfeedDzenBlockHeaderDto newsfeedDzenBlockHeaderDto, String str, UserId userId, int i, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.type = typeDto;
            this.header = newsfeedDzenBlockHeaderDto;
            this.trackCode = str;
            this.sourceId = userId;
            this.date = i;
            this.isAsync = bool;
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedDzenStoryNewsBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedDzenStoryNewsBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("header")
        private final NewsfeedItemDigestHeaderDto header;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("items")
        private final List<NewsfeedDzenStoryNewsBlockItemDto> items;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("dzen_story_news")
            public static final TypeDto DZEN_STORY_NEWS;
            private final String value;

            /* compiled from: NewsfeedNewsfeedItemDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("DZEN_STORY_NEWS", 0, "dzen_story_news");
                DZEN_STORY_NEWS = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String i() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedDzenStoryNewsBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedDzenStoryNewsBlockDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean valueOf4;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                UserId userId = (UserId) parcel.readParcelable(NewsfeedDzenStoryNewsBlockDto.class.getClassLoader());
                int readInt = parcel.readInt();
                NewsfeedItemDigestHeaderDto createFromParcel2 = parcel.readInt() == 0 ? null : NewsfeedItemDigestHeaderDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    int i = 0;
                    while (i != readInt2) {
                        i = en.a(NewsfeedDzenStoryNewsBlockItemDto.CREATOR, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedDzenStoryNewsBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                boolean z = true;
                Boolean bool = valueOf;
                String readString = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedDzenStoryNewsBlockDto.class.getClassLoader());
                Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedDzenStoryNewsBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    if (parcel.readInt() == 0) {
                        z = false;
                    }
                    valueOf4 = Boolean.valueOf(z);
                }
                return new NewsfeedDzenStoryNewsBlockDto(createFromParcel, userId, readInt, createFromParcel2, arrayList, bool, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, readString, wallPostActivityDto, valueOf5, newsfeedPushSubscriptionDto, valueOf4, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedDzenStoryNewsBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedDzenStoryNewsBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedDzenStoryNewsBlockDto[] newArray(int i) {
                return new NewsfeedDzenStoryNewsBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedDzenStoryNewsBlockDto(TypeDto typeDto, UserId userId, int i, NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto, List list, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(typeDto, userId, i, (i2 & 8) != 0 ? null : newsfeedItemDigestHeaderDto, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : bool2, (i2 & 128) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 256) != 0 ? null : bool3, (i2 & 512) != 0 ? null : str, (i2 & 1024) != 0 ? null : wallPostActivityDto, (i2 & 2048) != 0 ? null : f, (i2 & 4096) != 0 ? null : newsfeedPushSubscriptionDto, (i2 & 8192) != 0 ? null : bool4, (i2 & 16384) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 32768) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final NewsfeedItemDebugInfoDto d() {
            return this.debugInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final NewsfeedItemWallpostFeedbackDto e() {
            return this.feedback;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedDzenStoryNewsBlockDto)) {
                return false;
            }
            NewsfeedDzenStoryNewsBlockDto newsfeedDzenStoryNewsBlockDto = (NewsfeedDzenStoryNewsBlockDto) obj;
            return this.type == newsfeedDzenStoryNewsBlockDto.type && epx.f(this.sourceId, newsfeedDzenStoryNewsBlockDto.sourceId) && this.date == newsfeedDzenStoryNewsBlockDto.date && epx.f(this.header, newsfeedDzenStoryNewsBlockDto.header) && epx.f(this.items, newsfeedDzenStoryNewsBlockDto.items) && epx.f(this.isAsync, newsfeedDzenStoryNewsBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedDzenStoryNewsBlockDto.canIgnore) && epx.f(this.caption, newsfeedDzenStoryNewsBlockDto.caption) && epx.f(this.keepOffline, newsfeedDzenStoryNewsBlockDto.keepOffline) && epx.f(this.trackCode, newsfeedDzenStoryNewsBlockDto.trackCode) && epx.f(this.activity, newsfeedDzenStoryNewsBlockDto.activity) && epx.f(this.shortTextRate, newsfeedDzenStoryNewsBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedDzenStoryNewsBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedDzenStoryNewsBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedDzenStoryNewsBlockDto.feedback) && epx.f(this.debugInfo, newsfeedDzenStoryNewsBlockDto.debugInfo);
        }

        public final NewsfeedItemDigestHeaderDto f() {
            return this.header;
        }

        public final List<NewsfeedDzenStoryNewsBlockItemDto> g() {
            return this.items;
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto = this.header;
            int hashCode = (a2 + (newsfeedItemDigestHeaderDto == null ? 0 : newsfeedItemDigestHeaderDto.hashCode())) * 31;
            List<NewsfeedDzenStoryNewsBlockItemDto> list = this.items;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.canIgnore;
            int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode5 = (hashCode4 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode8 = (hashCode7 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode9 = (hashCode8 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode10 = (hashCode9 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode11 = (hashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode12 = (hashCode11 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode12 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final Boolean i() {
            return this.keepOffline;
        }

        public final TypeDto j() {
            return this.type;
        }

        public final Boolean k() {
            return this.isAsync;
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedDzenStoryNewsBlockDto(type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", header=");
            sb.append(this.header);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto = this.header;
            if (newsfeedItemDigestHeaderDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedItemDigestHeaderDto.writeToParcel(parcel, i);
            }
            List<NewsfeedDzenStoryNewsBlockItemDto> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((NewsfeedDzenStoryNewsBlockItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f2 = this.shortTextRate;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f2);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedDzenStoryNewsBlockDto(TypeDto typeDto, UserId userId, int i, NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto, List<NewsfeedDzenStoryNewsBlockItemDto> list, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.type = typeDto;
            this.sourceId = userId;
            this.date = i;
            this.header = newsfeedItemDigestHeaderDto;
            this.items = list;
            this.isAsync = bool;
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.trackCode = str;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedDzenTopStoriesBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedDzenTopStoriesBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("dzen_compilation")
        private final NewsfeedDzenCompilationDto dzenCompilation;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("header")
        private final NewsfeedDzenTopStoriesBlockHeaderDto header;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("items")
        private final List<NewsfeedDzenTopStoryItemDto> items;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("research")
        private final NewsfeedMediascopeResearchDto research;

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

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("dzen_top_stories")
            public static final TypeDto DZEN_TOP_STORIES;
            private final String value;

            /* compiled from: NewsfeedNewsfeedItemDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("DZEN_TOP_STORIES", 0, "dzen_top_stories");
                DZEN_TOP_STORIES = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String i() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedDzenTopStoriesBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedDzenTopStoriesBlockDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean valueOf4;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                NewsfeedDzenTopStoriesBlockHeaderDto createFromParcel2 = NewsfeedDzenTopStoriesBlockHeaderDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(NewsfeedDzenTopStoryItemDto.CREATOR, parcel, arrayList, i, 1);
                }
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                String readString = parcel.readString();
                UserId userId = (UserId) parcel.readParcelable(NewsfeedDzenTopStoriesBlockDto.class.getClassLoader());
                int readInt4 = parcel.readInt();
                NewsfeedDzenCompilationDto createFromParcel3 = parcel.readInt() == 0 ? null : NewsfeedDzenCompilationDto.CREATOR.createFromParcel(parcel);
                NewsfeedMediascopeResearchDto createFromParcel4 = parcel.readInt() == 0 ? null : NewsfeedMediascopeResearchDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedDzenTopStoriesBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString2 = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedDzenTopStoriesBlockDto.class.getClassLoader());
                Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedDzenTopStoriesBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedDzenTopStoriesBlockDto(createFromParcel, createFromParcel2, arrayList, readInt2, readInt3, readString, userId, readInt4, createFromParcel3, createFromParcel4, valueOf, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, readString2, wallPostActivityDto, valueOf5, newsfeedPushSubscriptionDto, valueOf4, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedDzenTopStoriesBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedDzenTopStoriesBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedDzenTopStoriesBlockDto[] newArray(int i) {
                return new NewsfeedDzenTopStoriesBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedDzenTopStoriesBlockDto(TypeDto typeDto, NewsfeedDzenTopStoriesBlockHeaderDto newsfeedDzenTopStoriesBlockHeaderDto, List list, int i, int i2, String str, UserId userId, int i3, NewsfeedDzenCompilationDto newsfeedDzenCompilationDto, NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i4, zcl zclVar) {
            this(typeDto, newsfeedDzenTopStoriesBlockHeaderDto, list, i, i2, str, userId, i3, (i4 & 256) != 0 ? null : newsfeedDzenCompilationDto, (i4 & 512) != 0 ? null : newsfeedMediascopeResearchDto, (i4 & 1024) != 0 ? null : bool, (i4 & 2048) != 0 ? null : bool2, (i4 & 4096) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i4 & 8192) != 0 ? null : bool3, (i4 & 16384) != 0 ? null : str2, (32768 & i4) != 0 ? null : wallPostActivityDto, (65536 & i4) != 0 ? null : f, (131072 & i4) != 0 ? null : newsfeedPushSubscriptionDto, (262144 & i4) != 0 ? null : bool4, (524288 & i4) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final NewsfeedItemDebugInfoDto d() {
            return this.debugInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final NewsfeedDzenCompilationDto e() {
            return this.dzenCompilation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedDzenTopStoriesBlockDto)) {
                return false;
            }
            NewsfeedDzenTopStoriesBlockDto newsfeedDzenTopStoriesBlockDto = (NewsfeedDzenTopStoriesBlockDto) obj;
            return this.type == newsfeedDzenTopStoriesBlockDto.type && epx.f(this.header, newsfeedDzenTopStoriesBlockDto.header) && epx.f(this.items, newsfeedDzenTopStoriesBlockDto.items) && this.shownNewsCount == newsfeedDzenTopStoriesBlockDto.shownNewsCount && this.showMoreCount == newsfeedDzenTopStoriesBlockDto.showMoreCount && epx.f(this.showMoreText, newsfeedDzenTopStoriesBlockDto.showMoreText) && epx.f(this.sourceId, newsfeedDzenTopStoriesBlockDto.sourceId) && this.date == newsfeedDzenTopStoriesBlockDto.date && epx.f(this.dzenCompilation, newsfeedDzenTopStoriesBlockDto.dzenCompilation) && epx.f(this.research, newsfeedDzenTopStoriesBlockDto.research) && epx.f(this.isAsync, newsfeedDzenTopStoriesBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedDzenTopStoriesBlockDto.canIgnore) && epx.f(this.caption, newsfeedDzenTopStoriesBlockDto.caption) && epx.f(this.keepOffline, newsfeedDzenTopStoriesBlockDto.keepOffline) && epx.f(this.trackCode, newsfeedDzenTopStoriesBlockDto.trackCode) && epx.f(this.activity, newsfeedDzenTopStoriesBlockDto.activity) && epx.f(this.shortTextRate, newsfeedDzenTopStoriesBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedDzenTopStoriesBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedDzenTopStoriesBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedDzenTopStoriesBlockDto.feedback) && epx.f(this.debugInfo, newsfeedDzenTopStoriesBlockDto.debugInfo);
        }

        public final NewsfeedItemWallpostFeedbackDto f() {
            return this.feedback;
        }

        public final NewsfeedDzenTopStoriesBlockHeaderDto g() {
            return this.header;
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(urd0.a(shy.a(this.showMoreCount, shy.a(this.shownNewsCount, fw3.a((this.header.hashCode() + (this.type.hashCode() * 31)) * 31, 31, this.items), 31), 31), 31, this.showMoreText), 31, this.sourceId.b), 31);
            NewsfeedDzenCompilationDto newsfeedDzenCompilationDto = this.dzenCompilation;
            int hashCode = (a2 + (newsfeedDzenCompilationDto == null ? 0 : newsfeedDzenCompilationDto.hashCode())) * 31;
            NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto = this.research;
            int hashCode2 = (hashCode + (newsfeedMediascopeResearchDto == null ? 0 : newsfeedMediascopeResearchDto.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.canIgnore;
            int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode5 = (hashCode4 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode8 = (hashCode7 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode9 = (hashCode8 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode10 = (hashCode9 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode11 = (hashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode12 = (hashCode11 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode12 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final List<NewsfeedDzenTopStoryItemDto> i() {
            return this.items;
        }

        public final Boolean j() {
            return this.keepOffline;
        }

        public final int k() {
            return this.showMoreCount;
        }

        public final String l() {
            return this.showMoreText;
        }

        public final int n() {
            return this.shownNewsCount;
        }

        public final TypeDto o() {
            return this.type;
        }

        public final Boolean p() {
            return this.isAsync;
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedDzenTopStoriesBlockDto(type=");
            sb.append(this.type);
            sb.append(", header=");
            sb.append(this.header);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", shownNewsCount=");
            sb.append(this.shownNewsCount);
            sb.append(", showMoreCount=");
            sb.append(this.showMoreCount);
            sb.append(", showMoreText=");
            sb.append(this.showMoreText);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", dzenCompilation=");
            sb.append(this.dzenCompilation);
            sb.append(", research=");
            sb.append(this.research);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.header.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((NewsfeedDzenTopStoryItemDto) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeInt(this.shownNewsCount);
            parcel.writeInt(this.showMoreCount);
            parcel.writeString(this.showMoreText);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            NewsfeedDzenCompilationDto newsfeedDzenCompilationDto = this.dzenCompilation;
            if (newsfeedDzenCompilationDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedDzenCompilationDto.writeToParcel(parcel, i);
            }
            NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto = this.research;
            if (newsfeedMediascopeResearchDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedMediascopeResearchDto.writeToParcel(parcel, i);
            }
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedDzenTopStoriesBlockDto(TypeDto typeDto, NewsfeedDzenTopStoriesBlockHeaderDto newsfeedDzenTopStoriesBlockHeaderDto, List<NewsfeedDzenTopStoryItemDto> list, int i, int i2, String str, UserId userId, int i3, NewsfeedDzenCompilationDto newsfeedDzenCompilationDto, NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.type = typeDto;
            this.header = newsfeedDzenTopStoriesBlockHeaderDto;
            this.items = list;
            this.shownNewsCount = i;
            this.showMoreCount = i2;
            this.showMoreText = str;
            this.sourceId = userId;
            this.date = i3;
            this.dzenCompilation = newsfeedDzenCompilationDto;
            this.research = newsfeedMediascopeResearchDto;
            this.isAsync = bool;
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.trackCode = str2;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedInfoBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedInfoBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("description")
        private final String description;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("image")
        private final NewsfeedNewsfeedItemHeaderImageDto image;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("more")
        private final NewsfeedInfoBlockButtonDto more;

        @pmi0("popup")
        private final NewsfeedInfoBlockPopupDto popup;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("info_block")
            public static final TypeDto INFO_BLOCK;
            private final String value;

            /* compiled from: NewsfeedNewsfeedItemDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("INFO_BLOCK", 0, "info_block");
                INFO_BLOCK = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String i() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedInfoBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedInfoBlockDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean valueOf4;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                UserId userId = (UserId) parcel.readParcelable(NewsfeedInfoBlockDto.class.getClassLoader());
                int readInt = parcel.readInt();
                NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = (NewsfeedNewsfeedItemHeaderImageDto) parcel.readParcelable(NewsfeedInfoBlockDto.class.getClassLoader());
                String readString2 = parcel.readString();
                NewsfeedInfoBlockButtonDto createFromParcel2 = parcel.readInt() == 0 ? null : NewsfeedInfoBlockButtonDto.CREATOR.createFromParcel(parcel);
                NewsfeedInfoBlockPopupDto createFromParcel3 = parcel.readInt() == 0 ? null : NewsfeedInfoBlockPopupDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedInfoBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedInfoBlockDto.class.getClassLoader());
                Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedInfoBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedInfoBlockDto(createFromParcel, readString, userId, readInt, newsfeedNewsfeedItemHeaderImageDto, readString2, createFromParcel2, createFromParcel3, valueOf, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, wallPostActivityDto, valueOf5, newsfeedPushSubscriptionDto, valueOf4, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedInfoBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedInfoBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedInfoBlockDto[] newArray(int i) {
                return new NewsfeedInfoBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedInfoBlockDto(TypeDto typeDto, String str, UserId userId, int i, NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, String str2, NewsfeedInfoBlockButtonDto newsfeedInfoBlockButtonDto, NewsfeedInfoBlockPopupDto newsfeedInfoBlockPopupDto, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(typeDto, str, userId, i, (i2 & 16) != 0 ? null : newsfeedNewsfeedItemHeaderImageDto, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : newsfeedInfoBlockButtonDto, (i2 & 128) != 0 ? null : newsfeedInfoBlockPopupDto, (i2 & 256) != 0 ? null : bool, (i2 & 512) != 0 ? null : bool2, (i2 & 1024) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 2048) != 0 ? null : bool3, (i2 & 4096) != 0 ? null : wallPostActivityDto, (i2 & 8192) != 0 ? null : f, (i2 & 16384) != 0 ? null : newsfeedPushSubscriptionDto, (32768 & i2) != 0 ? null : bool4, (65536 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 131072) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final TypeDto d() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedInfoBlockDto)) {
                return false;
            }
            NewsfeedInfoBlockDto newsfeedInfoBlockDto = (NewsfeedInfoBlockDto) obj;
            return this.type == newsfeedInfoBlockDto.type && epx.f(this.trackCode, newsfeedInfoBlockDto.trackCode) && epx.f(this.sourceId, newsfeedInfoBlockDto.sourceId) && this.date == newsfeedInfoBlockDto.date && epx.f(this.image, newsfeedInfoBlockDto.image) && epx.f(this.description, newsfeedInfoBlockDto.description) && epx.f(this.more, newsfeedInfoBlockDto.more) && epx.f(this.popup, newsfeedInfoBlockDto.popup) && epx.f(this.isAsync, newsfeedInfoBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedInfoBlockDto.canIgnore) && epx.f(this.caption, newsfeedInfoBlockDto.caption) && epx.f(this.keepOffline, newsfeedInfoBlockDto.keepOffline) && epx.f(this.activity, newsfeedInfoBlockDto.activity) && epx.f(this.shortTextRate, newsfeedInfoBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedInfoBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedInfoBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedInfoBlockDto.feedback) && epx.f(this.debugInfo, newsfeedInfoBlockDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(urd0.a(this.type.hashCode() * 31, 31, this.trackCode), 31, this.sourceId.b), 31);
            NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = this.image;
            int hashCode = (a2 + (newsfeedNewsfeedItemHeaderImageDto == null ? 0 : newsfeedNewsfeedItemHeaderImageDto.hashCode())) * 31;
            String str = this.description;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            NewsfeedInfoBlockButtonDto newsfeedInfoBlockButtonDto = this.more;
            int hashCode3 = (hashCode2 + (newsfeedInfoBlockButtonDto == null ? 0 : newsfeedInfoBlockButtonDto.hashCode())) * 31;
            NewsfeedInfoBlockPopupDto newsfeedInfoBlockPopupDto = this.popup;
            int hashCode4 = (hashCode3 + (newsfeedInfoBlockPopupDto == null ? 0 : newsfeedInfoBlockPopupDto.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.canIgnore;
            int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode7 = (hashCode6 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode9 = (hashCode8 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode10 = (hashCode9 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode11 = (hashCode10 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode12 = (hashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode13 = (hashCode12 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode13 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedInfoBlockDto(type=");
            sb.append(this.type);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", image=");
            sb.append(this.image);
            sb.append(", description=");
            sb.append(this.description);
            sb.append(", more=");
            sb.append(this.more);
            sb.append(", popup=");
            sb.append(this.popup);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            parcel.writeParcelable(this.image, i);
            parcel.writeString(this.description);
            NewsfeedInfoBlockButtonDto newsfeedInfoBlockButtonDto = this.more;
            if (newsfeedInfoBlockButtonDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedInfoBlockButtonDto.writeToParcel(parcel, i);
            }
            NewsfeedInfoBlockPopupDto newsfeedInfoBlockPopupDto = this.popup;
            if (newsfeedInfoBlockPopupDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedInfoBlockPopupDto.writeToParcel(parcel, i);
            }
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedInfoBlockDto(TypeDto typeDto, String str, UserId userId, int i, NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, String str2, NewsfeedInfoBlockButtonDto newsfeedInfoBlockButtonDto, NewsfeedInfoBlockPopupDto newsfeedInfoBlockPopupDto, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.type = typeDto;
            this.trackCode = str;
            this.sourceId = userId;
            this.date = i;
            this.image = newsfeedNewsfeedItemHeaderImageDto;
            this.description = str2;
            this.more = newsfeedInfoBlockButtonDto;
            this.popup = newsfeedInfoBlockPopupDto;
            this.isAsync = bool;
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemAchievementGameBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemAchievementGameBlockDto> CREATOR = new a();

        @pmi0("achievement_image")
        private final List<BaseImageDto> achievementImage;

        @pmi0("achievement_text")
        private final String achievementText;

        @pmi0("activity")
        private final WallPostActivityDto activity;

        /* renamed from: app, reason: collision with root package name */
        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        private final AppsAppDto f79app;

        @pmi0("app_cover")
        private final List<BaseImageDto> appCover;

        @pmi0("button_text")
        private final String buttonText;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("friends_avatars")
        private final List<List<BaseImageDto>> friendsAvatars;

        @pmi0("friends_playing_text")
        private final String friendsPlayingText;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemAchievementGameBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemAchievementGameBlockDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                AppsAppDto appsAppDto = (AppsAppDto) parcel.readParcelable(NewsfeedItemAchievementGameBlockDto.class.getClassLoader());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemAchievementGameBlockDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemAchievementGameBlockDto.class.getClassLoader());
                int readInt = parcel.readInt();
                String readString3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt2);
                    for (int i = 0; i != readInt2; i++) {
                        int readInt3 = parcel.readInt();
                        ArrayList arrayList5 = new ArrayList(readInt3);
                        int i2 = 0;
                        while (i2 != readInt3) {
                            i2 = bo.b(NewsfeedItemAchievementGameBlockDto.class, parcel, arrayList5, i2, 1);
                        }
                        arrayList4.add(arrayList5);
                    }
                    arrayList = arrayList4;
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt4 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt4);
                    int i3 = 0;
                    while (i3 != readInt4) {
                        i3 = bo.b(NewsfeedItemAchievementGameBlockDto.class, parcel, arrayList2, i3, 1);
                    }
                }
                String readString4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int readInt5 = parcel.readInt();
                    arrayList3 = new ArrayList(readInt5);
                    int i4 = 0;
                    while (i4 != readInt5) {
                        i4 = bo.b(NewsfeedItemAchievementGameBlockDto.class, parcel, arrayList3, i4, 1);
                    }
                }
                return new NewsfeedItemAchievementGameBlockDto(appsAppDto, readString, readString2, newsfeedNewsfeedItemTypeDto, userId, readInt, readString3, arrayList, arrayList2, readString4, arrayList3, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemAchievementGameBlockDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), (WallPostActivityDto) parcel.readParcelable(NewsfeedItemAchievementGameBlockDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemAchievementGameBlockDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemAchievementGameBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemAchievementGameBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemAchievementGameBlockDto[] newArray(int i) {
                return new NewsfeedItemAchievementGameBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemAchievementGameBlockDto(AppsAppDto appsAppDto, String str, String str2, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str3, List list, List list2, String str4, List list3, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str5, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(appsAppDto, str, str2, newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : list, (i2 & 256) != 0 ? null : list2, (i2 & 512) != 0 ? null : str4, (i2 & 1024) != 0 ? null : list3, (i2 & 2048) != 0 ? null : bool, (i2 & 4096) != 0 ? null : bool2, (i2 & 8192) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 16384) != 0 ? null : bool3, (32768 & i2) != 0 ? null : str5, (65536 & i2) != 0 ? null : wallPostActivityDto, (131072 & i2) != 0 ? null : f, (262144 & i2) != 0 ? null : newsfeedPushSubscriptionDto, (524288 & i2) != 0 ? null : bool4, (1048576 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 2097152) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final NewsfeedNewsfeedItemTypeDto d() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemAchievementGameBlockDto)) {
                return false;
            }
            NewsfeedItemAchievementGameBlockDto newsfeedItemAchievementGameBlockDto = (NewsfeedItemAchievementGameBlockDto) obj;
            return epx.f(this.f79app, newsfeedItemAchievementGameBlockDto.f79app) && epx.f(this.title, newsfeedItemAchievementGameBlockDto.title) && epx.f(this.buttonText, newsfeedItemAchievementGameBlockDto.buttonText) && this.type == newsfeedItemAchievementGameBlockDto.type && epx.f(this.sourceId, newsfeedItemAchievementGameBlockDto.sourceId) && this.date == newsfeedItemAchievementGameBlockDto.date && epx.f(this.friendsPlayingText, newsfeedItemAchievementGameBlockDto.friendsPlayingText) && epx.f(this.friendsAvatars, newsfeedItemAchievementGameBlockDto.friendsAvatars) && epx.f(this.appCover, newsfeedItemAchievementGameBlockDto.appCover) && epx.f(this.achievementText, newsfeedItemAchievementGameBlockDto.achievementText) && epx.f(this.achievementImage, newsfeedItemAchievementGameBlockDto.achievementImage) && epx.f(this.isAsync, newsfeedItemAchievementGameBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedItemAchievementGameBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemAchievementGameBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemAchievementGameBlockDto.keepOffline) && epx.f(this.trackCode, newsfeedItemAchievementGameBlockDto.trackCode) && epx.f(this.activity, newsfeedItemAchievementGameBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemAchievementGameBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemAchievementGameBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemAchievementGameBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemAchievementGameBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemAchievementGameBlockDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a((this.type.hashCode() + urd0.a(urd0.a(this.f79app.hashCode() * 31, 31, this.title), 31, this.buttonText)) * 31, 31, this.sourceId.b), 31);
            String str = this.friendsPlayingText;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
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
            Boolean bool2 = this.canIgnore;
            int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode8 = (hashCode7 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str3 = this.trackCode;
            int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode11 = (hashCode10 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode12 = (hashCode11 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode13 = (hashCode12 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode14 = (hashCode13 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode15 = (hashCode14 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode15 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemAchievementGameBlockDto(app=");
            sb.append(this.f79app);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", buttonText=");
            sb.append(this.buttonText);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", friendsPlayingText=");
            sb.append(this.friendsPlayingText);
            sb.append(", friendsAvatars=");
            sb.append(this.friendsAvatars);
            sb.append(", appCover=");
            sb.append(this.appCover);
            sb.append(", achievementText=");
            sb.append(this.achievementText);
            sb.append(", achievementImage=");
            sb.append(this.achievementImage);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f79app, i);
            parcel.writeString(this.title);
            parcel.writeString(this.buttonText);
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            parcel.writeString(this.friendsPlayingText);
            List<List<BaseImageDto>> list = this.friendsAvatars;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    Iterator a2 = ao.a(parcel, (List) f.next());
                    while (a2.hasNext()) {
                        parcel.writeParcelable((Parcelable) a2.next(), i);
                    }
                }
            }
            List<BaseImageDto> list2 = this.appCover;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f2 = dn.f(parcel, list2, 1);
                while (f2.hasNext()) {
                    parcel.writeParcelable((Parcelable) f2.next(), i);
                }
            }
            parcel.writeString(this.achievementText);
            List<BaseImageDto> list3 = this.achievementImage;
            if (list3 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f3 = dn.f(parcel, list3, 1);
                while (f3.hasNext()) {
                    parcel.writeParcelable((Parcelable) f3.next(), i);
                }
            }
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f4 = this.shortTextRate;
            if (f4 == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f4);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NewsfeedItemAchievementGameBlockDto(AppsAppDto appsAppDto, String str, String str2, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str3, List<? extends List<BaseImageDto>> list, List<BaseImageDto> list2, String str4, List<BaseImageDto> list3, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str5, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.f79app = appsAppDto;
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
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.trackCode = str5;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemAdsBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemAdsBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("ad_choices")
        private final AdsChoicesDto adChoices;

        @pmi0("ad_marker")
        private final String adMarker;

        @pmi0("ad_source")
        private final AdSourceDto adSource;

        @pmi0("ad_url")
        private final String adUrl;

        @pmi0(b.JSON_KEY_ADS)
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

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("header")
        private final NewsfeedNewsfeedItemHeaderDto header;

        @pmi0("hide_reasons")
        private final AdsHideReasonsDto hideReasons;

        @pmi0("impression_id")
        private final String impressionId;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("recommendation_info")
        private final String recommendationInfo;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("try_applovin")
        private final Boolean tryApplovin;

        @pmi0("try_yandex")
        private final Boolean tryYandex;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class AdSourceDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ AdSourceDto[] $VALUES;
            public static final Parcelable.Creator<AdSourceDto> CREATOR;

            @pmi0("vkfeed")
            public static final AdSourceDto VKFEED;

            @pmi0("vkfeed_yandex")
            public static final AdSourceDto VKFEED_YANDEX;

            @pmi0("vkontakte")
            public static final AdSourceDto VKONTAKTE;
            private final String value;

            /* compiled from: NewsfeedNewsfeedItemDto.kt */
            public static final class a implements Parcelable.Creator<AdSourceDto> {
                @Override // android.os.Parcelable.Creator
                public final AdSourceDto createFromParcel(Parcel parcel) {
                    return AdSourceDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final AdSourceDto[] newArray(int i) {
                    return new AdSourceDto[i];
                }
            }

            static {
                AdSourceDto adSourceDto = new AdSourceDto("VKONTAKTE", 0, "vkontakte");
                VKONTAKTE = adSourceDto;
                AdSourceDto adSourceDto2 = new AdSourceDto("VKFEED", 1, "vkfeed");
                VKFEED = adSourceDto2;
                AdSourceDto adSourceDto3 = new AdSourceDto("VKFEED_YANDEX", 2, "vkfeed_yandex");
                VKFEED_YANDEX = adSourceDto3;
                AdSourceDto[] adSourceDtoArr = {adSourceDto, adSourceDto2, adSourceDto3};
                $VALUES = adSourceDtoArr;
                $ENTRIES = new asp(adSourceDtoArr);
                CREATOR = new a();
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

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0(b.JSON_KEY_ADS)
            public static final TypeDto ADS;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: NewsfeedNewsfeedItemDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("ADS", 0, b.JSON_KEY_ADS);
                ADS = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String i() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemAdsBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemAdsBlockDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean valueOf4;
                Boolean valueOf5;
                Boolean valueOf6;
                NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto;
                AdsHideReasonsDto createFromParcel;
                AdsHideReasonsDto adsHideReasonsDto;
                TypeDto typeDto;
                ArrayList arrayList;
                UserId userId;
                Class cls;
                AdSourceDto createFromParcel2;
                TypeDto createFromParcel3 = TypeDto.CREATOR.createFromParcel(parcel);
                UserId userId2 = (UserId) parcel.readParcelable(NewsfeedItemAdsBlockDto.class.getClassLoader());
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt4);
                int i = 0;
                while (i != readInt4) {
                    i = en.a(AdsItemBlockAdItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemAdsBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString3 = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemAdsBlockDto.class.getClassLoader());
                Float valueOf7 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemAdsBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemAdsBlockDto.class.getClassLoader());
                NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto2 = (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemAdsBlockDto.class.getClassLoader());
                Boolean bool = valueOf2;
                Boolean bool2 = valueOf4;
                Boolean bool3 = valueOf5;
                Boolean bool4 = valueOf3;
                String readString4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    newsfeedItemDebugInfoDto = newsfeedItemDebugInfoDto2;
                    createFromParcel = null;
                } else {
                    newsfeedItemDebugInfoDto = newsfeedItemDebugInfoDto2;
                    createFromParcel = AdsHideReasonsDto.CREATOR.createFromParcel(parcel);
                }
                AdsHideReasonsDto adsHideReasonsDto2 = createFromParcel;
                if (parcel.readInt() == 0) {
                    adsHideReasonsDto = adsHideReasonsDto2;
                    typeDto = createFromParcel3;
                    userId = userId2;
                    arrayList = null;
                } else {
                    adsHideReasonsDto = adsHideReasonsDto2;
                    int readInt5 = parcel.readInt();
                    typeDto = createFromParcel3;
                    arrayList = new ArrayList(readInt5);
                    userId = userId2;
                    int i2 = 0;
                    while (i2 != readInt5) {
                        i2 = bo.b(NewsfeedItemAdsBlockDto.class, parcel, arrayList, i2, 1);
                        readInt5 = readInt5;
                    }
                }
                NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto3 = newsfeedItemDebugInfoDto;
                String readString5 = parcel.readString();
                NewsfeedNewsfeedItemHeaderDto createFromParcel4 = parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemHeaderDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    cls = NewsfeedItemAdsBlockDto.class;
                    createFromParcel2 = null;
                } else {
                    cls = NewsfeedItemAdsBlockDto.class;
                    createFromParcel2 = AdSourceDto.CREATOR.createFromParcel(parcel);
                }
                return new NewsfeedItemAdsBlockDto(typeDto, userId, readInt, readString, readInt2, readInt3, arrayList2, readString2, valueOf, bool, bool4, bool2, newsfeedNewsfeedItemCaptionDto, bool3, readString3, wallPostActivityDto, valueOf7, newsfeedPushSubscriptionDto, valueOf6, newsfeedItemWallpostFeedbackDto, newsfeedItemDebugInfoDto3, readString4, adsHideReasonsDto, arrayList, readString5, createFromParcel4, createFromParcel2, (AdsChoicesDto) parcel.readParcelable(cls.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemAdsBlockDto[] newArray(int i) {
                return new NewsfeedItemAdsBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemAdsBlockDto(TypeDto typeDto, UserId userId, int i, String str, int i2, int i3, List list, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool5, String str3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool6, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, String str4, AdsHideReasonsDto adsHideReasonsDto, List list2, String str5, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, AdSourceDto adSourceDto, AdsChoicesDto adsChoicesDto, String str6, String str7, String str8, int i4, zcl zclVar) {
            this(typeDto, userId, i, str, i2, i3, list, str2, (i4 & 256) != 0 ? null : bool, (i4 & 512) != 0 ? null : bool2, (i4 & 1024) != 0 ? null : bool3, (i4 & 2048) != 0 ? null : bool4, (i4 & 4096) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i4 & 8192) != 0 ? null : bool5, (i4 & 16384) != 0 ? null : str3, (32768 & i4) != 0 ? null : wallPostActivityDto, (65536 & i4) != 0 ? null : f, (131072 & i4) != 0 ? null : newsfeedPushSubscriptionDto, (262144 & i4) != 0 ? null : bool6, (524288 & i4) != 0 ? null : newsfeedItemWallpostFeedbackDto, (1048576 & i4) != 0 ? null : newsfeedItemDebugInfoDto, (2097152 & i4) != 0 ? null : str4, (4194304 & i4) != 0 ? null : adsHideReasonsDto, (8388608 & i4) != 0 ? null : list2, (16777216 & i4) != 0 ? null : str5, (33554432 & i4) != 0 ? null : newsfeedNewsfeedItemHeaderDto, (67108864 & i4) != 0 ? null : adSourceDto, (134217728 & i4) != 0 ? null : adsChoicesDto, (268435456 & i4) != 0 ? null : str6, (536870912 & i4) != 0 ? null : str7, (i4 & 1073741824) != 0 ? null : str8);
        }

        public final TypeDto d() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemAdsBlockDto)) {
                return false;
            }
            NewsfeedItemAdsBlockDto newsfeedItemAdsBlockDto = (NewsfeedItemAdsBlockDto) obj;
            return this.type == newsfeedItemAdsBlockDto.type && epx.f(this.sourceId, newsfeedItemAdsBlockDto.sourceId) && this.date == newsfeedItemAdsBlockDto.date && epx.f(this.adsTitle, newsfeedItemAdsBlockDto.adsTitle) && this.adsId1 == newsfeedItemAdsBlockDto.adsId1 && this.adsId2 == newsfeedItemAdsBlockDto.adsId2 && epx.f(this.ads, newsfeedItemAdsBlockDto.ads) && epx.f(this.advertiserInfoUrl, newsfeedItemAdsBlockDto.advertiserInfoUrl) && epx.f(this.tryApplovin, newsfeedItemAdsBlockDto.tryApplovin) && epx.f(this.tryYandex, newsfeedItemAdsBlockDto.tryYandex) && epx.f(this.isAsync, newsfeedItemAdsBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedItemAdsBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemAdsBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemAdsBlockDto.keepOffline) && epx.f(this.trackCode, newsfeedItemAdsBlockDto.trackCode) && epx.f(this.activity, newsfeedItemAdsBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemAdsBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemAdsBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemAdsBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemAdsBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemAdsBlockDto.debugInfo) && epx.f(this.impressionId, newsfeedItemAdsBlockDto.impressionId) && epx.f(this.hideReasons, newsfeedItemAdsBlockDto.hideReasons) && epx.f(this.adsStatistics, newsfeedItemAdsBlockDto.adsStatistics) && epx.f(this.adsDebug, newsfeedItemAdsBlockDto.adsDebug) && epx.f(this.header, newsfeedItemAdsBlockDto.header) && this.adSource == newsfeedItemAdsBlockDto.adSource && epx.f(this.adChoices, newsfeedItemAdsBlockDto.adChoices) && epx.f(this.adMarker, newsfeedItemAdsBlockDto.adMarker) && epx.f(this.recommendationInfo, newsfeedItemAdsBlockDto.recommendationInfo) && epx.f(this.adUrl, newsfeedItemAdsBlockDto.adUrl);
        }

        public final int hashCode() {
            int a2 = urd0.a(fw3.a(shy.a(this.adsId2, shy.a(this.adsId1, urd0.a(shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31), 31, this.adsTitle), 31), 31), 31, this.ads), 31, this.advertiserInfoUrl);
            Boolean bool = this.tryApplovin;
            int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.tryYandex;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isAsync;
            int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.canIgnore;
            int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode5 = (hashCode4 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool5 = this.keepOffline;
            int hashCode6 = (hashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode8 = (hashCode7 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode9 = (hashCode8 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode10 = (hashCode9 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool6 = this.suggestSubscribe;
            int hashCode11 = (hashCode10 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode12 = (hashCode11 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            int hashCode13 = (hashCode12 + (newsfeedItemDebugInfoDto == null ? 0 : newsfeedItemDebugInfoDto.hashCode())) * 31;
            String str2 = this.impressionId;
            int hashCode14 = (hashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
            AdsHideReasonsDto adsHideReasonsDto = this.hideReasons;
            int hashCode15 = (hashCode14 + (adsHideReasonsDto == null ? 0 : adsHideReasonsDto.hashCode())) * 31;
            List<AdsItemBlockAdStatPixelDto> list = this.adsStatistics;
            int hashCode16 = (hashCode15 + (list == null ? 0 : list.hashCode())) * 31;
            String str3 = this.adsDebug;
            int hashCode17 = (hashCode16 + (str3 == null ? 0 : str3.hashCode())) * 31;
            NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
            int hashCode18 = (hashCode17 + (newsfeedNewsfeedItemHeaderDto == null ? 0 : newsfeedNewsfeedItemHeaderDto.hashCode())) * 31;
            AdSourceDto adSourceDto = this.adSource;
            int hashCode19 = (hashCode18 + (adSourceDto == null ? 0 : adSourceDto.hashCode())) * 31;
            AdsChoicesDto adsChoicesDto = this.adChoices;
            int hashCode20 = (hashCode19 + (adsChoicesDto == null ? 0 : adsChoicesDto.hashCode())) * 31;
            String str4 = this.adMarker;
            int hashCode21 = (hashCode20 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.recommendationInfo;
            int hashCode22 = (hashCode21 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.adUrl;
            return hashCode22 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemAdsBlockDto(type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", adsTitle=");
            sb.append(this.adsTitle);
            sb.append(", adsId1=");
            sb.append(this.adsId1);
            sb.append(", adsId2=");
            sb.append(this.adsId2);
            sb.append(", ads=");
            sb.append(this.ads);
            sb.append(", advertiserInfoUrl=");
            sb.append(this.advertiserInfoUrl);
            sb.append(", tryApplovin=");
            sb.append(this.tryApplovin);
            sb.append(", tryYandex=");
            sb.append(this.tryYandex);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            sb.append(this.debugInfo);
            sb.append(", impressionId=");
            sb.append(this.impressionId);
            sb.append(", hideReasons=");
            sb.append(this.hideReasons);
            sb.append(", adsStatistics=");
            sb.append(this.adsStatistics);
            sb.append(", adsDebug=");
            sb.append(this.adsDebug);
            sb.append(", header=");
            sb.append(this.header);
            sb.append(", adSource=");
            sb.append(this.adSource);
            sb.append(", adChoices=");
            sb.append(this.adChoices);
            sb.append(", adMarker=");
            sb.append(this.adMarker);
            sb.append(", recommendationInfo=");
            sb.append(this.recommendationInfo);
            sb.append(", adUrl=");
            return ho8.a(sb, this.adUrl, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            parcel.writeString(this.adsTitle);
            parcel.writeInt(this.adsId1);
            parcel.writeInt(this.adsId2);
            Iterator a2 = ao.a(parcel, this.ads);
            while (a2.hasNext()) {
                ((AdsItemBlockAdItemDto) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeString(this.advertiserInfoUrl);
            Boolean bool = this.tryApplovin;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.tryYandex;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            Boolean bool3 = this.isAsync;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            Boolean bool4 = this.canIgnore;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool5 = this.keepOffline;
            if (bool5 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool5);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool6 = this.suggestSubscribe;
            if (bool6 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool6);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
            parcel.writeString(this.impressionId);
            AdsHideReasonsDto adsHideReasonsDto = this.hideReasons;
            if (adsHideReasonsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                adsHideReasonsDto.writeToParcel(parcel, i);
            }
            List<AdsItemBlockAdStatPixelDto> list = this.adsStatistics;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f2 = dn.f(parcel, list, 1);
                while (f2.hasNext()) {
                    parcel.writeParcelable((Parcelable) f2.next(), i);
                }
            }
            parcel.writeString(this.adsDebug);
            NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
            if (newsfeedNewsfeedItemHeaderDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedNewsfeedItemHeaderDto.writeToParcel(parcel, i);
            }
            AdSourceDto adSourceDto = this.adSource;
            if (adSourceDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                adSourceDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.adChoices, i);
            parcel.writeString(this.adMarker);
            parcel.writeString(this.recommendationInfo);
            parcel.writeString(this.adUrl);
        }

        public NewsfeedItemAdsBlockDto(TypeDto typeDto, UserId userId, int i, String str, int i2, int i3, List<AdsItemBlockAdItemDto> list, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool5, String str3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool6, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, String str4, AdsHideReasonsDto adsHideReasonsDto, List<AdsItemBlockAdStatPixelDto> list2, String str5, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, AdSourceDto adSourceDto, AdsChoicesDto adsChoicesDto, String str6, String str7, String str8) {
            super(null);
            this.type = typeDto;
            this.sourceId = userId;
            this.date = i;
            this.adsTitle = str;
            this.adsId1 = i2;
            this.adsId2 = i3;
            this.ads = list;
            this.advertiserInfoUrl = str2;
            this.tryApplovin = bool;
            this.tryYandex = bool2;
            this.isAsync = bool3;
            this.canIgnore = bool4;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool5;
            this.trackCode = str3;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool6;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
            this.impressionId = str4;
            this.hideReasons = adsHideReasonsDto;
            this.adsStatistics = list2;
            this.adsDebug = str5;
            this.header = newsfeedNewsfeedItemHeaderDto;
            this.adSource = adSourceDto;
            this.adChoices = adsChoicesDto;
            this.adMarker = str6;
            this.recommendationInfo = str7;
            this.adUrl = str8;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemAnimatedBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemAnimatedBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("animation")
        private final NewsfeedItemAnimatedBlockAnimationDto animation;

        @pmi0("block_id")
        private final String blockId;

        @pmi0("button")
        private final BaseLinkButtonDto button;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("decoration")
        private final DecorationDto decoration;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("subtitle")
        private final String subtitle;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("text")
        private final String text;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class DecorationDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ DecorationDto[] $VALUES;

            @pmi0(L2.g)
            public static final DecorationDto BACKGROUND;

            @pmi0("card")
            public static final DecorationDto CARD;
            public static final Parcelable.Creator<DecorationDto> CREATOR;

            @pmi0("none")
            public static final DecorationDto NONE;
            private final String value;

            /* compiled from: NewsfeedNewsfeedItemDto.kt */
            public static final class a implements Parcelable.Creator<DecorationDto> {
                @Override // android.os.Parcelable.Creator
                public final DecorationDto createFromParcel(Parcel parcel) {
                    return DecorationDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final DecorationDto[] newArray(int i) {
                    return new DecorationDto[i];
                }
            }

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
                CREATOR = new a();
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

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemAnimatedBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemAnimatedBlockDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean valueOf4;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemAnimatedBlockDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemAnimatedBlockDto.class.getClassLoader());
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                NewsfeedItemAnimatedBlockAnimationDto createFromParcel = parcel.readInt() == 0 ? null : NewsfeedItemAnimatedBlockAnimationDto.CREATOR.createFromParcel(parcel);
                DecorationDto createFromParcel2 = parcel.readInt() == 0 ? null : DecorationDto.CREATOR.createFromParcel(parcel);
                String readString3 = parcel.readString();
                BaseLinkButtonDto baseLinkButtonDto = (BaseLinkButtonDto) parcel.readParcelable(NewsfeedItemAnimatedBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemAnimatedBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                boolean z = false;
                String readString4 = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemAnimatedBlockDto.class.getClassLoader());
                Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemAnimatedBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    valueOf4 = Boolean.valueOf(z);
                }
                return new NewsfeedItemAnimatedBlockDto(newsfeedNewsfeedItemTypeDto, userId, readInt, readString, readString2, createFromParcel, createFromParcel2, readString3, baseLinkButtonDto, valueOf, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, readString4, wallPostActivityDto, valueOf5, newsfeedPushSubscriptionDto, valueOf4, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemAnimatedBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemAnimatedBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemAnimatedBlockDto[] newArray(int i) {
                return new NewsfeedItemAnimatedBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemAnimatedBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, String str2, NewsfeedItemAnimatedBlockAnimationDto newsfeedItemAnimatedBlockAnimationDto, DecorationDto decorationDto, String str3, BaseLinkButtonDto baseLinkButtonDto, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str4, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : newsfeedItemAnimatedBlockAnimationDto, (i2 & 64) != 0 ? null : decorationDto, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? null : baseLinkButtonDto, (i2 & 512) != 0 ? null : bool, (i2 & 1024) != 0 ? null : bool2, (i2 & 2048) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 4096) != 0 ? null : bool3, (i2 & 8192) != 0 ? null : str4, (i2 & 16384) != 0 ? null : wallPostActivityDto, (32768 & i2) != 0 ? null : f, (65536 & i2) != 0 ? null : newsfeedPushSubscriptionDto, (131072 & i2) != 0 ? null : bool4, (262144 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 524288) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final NewsfeedNewsfeedItemTypeDto d() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemAnimatedBlockDto)) {
                return false;
            }
            NewsfeedItemAnimatedBlockDto newsfeedItemAnimatedBlockDto = (NewsfeedItemAnimatedBlockDto) obj;
            return this.type == newsfeedItemAnimatedBlockDto.type && epx.f(this.sourceId, newsfeedItemAnimatedBlockDto.sourceId) && this.date == newsfeedItemAnimatedBlockDto.date && epx.f(this.blockId, newsfeedItemAnimatedBlockDto.blockId) && epx.f(this.text, newsfeedItemAnimatedBlockDto.text) && epx.f(this.animation, newsfeedItemAnimatedBlockDto.animation) && this.decoration == newsfeedItemAnimatedBlockDto.decoration && epx.f(this.subtitle, newsfeedItemAnimatedBlockDto.subtitle) && epx.f(this.button, newsfeedItemAnimatedBlockDto.button) && epx.f(this.isAsync, newsfeedItemAnimatedBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedItemAnimatedBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemAnimatedBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemAnimatedBlockDto.keepOffline) && epx.f(this.trackCode, newsfeedItemAnimatedBlockDto.trackCode) && epx.f(this.activity, newsfeedItemAnimatedBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemAnimatedBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemAnimatedBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemAnimatedBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemAnimatedBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemAnimatedBlockDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            String str = this.blockId;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
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
            Boolean bool2 = this.canIgnore;
            int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode9 = (hashCode8 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str4 = this.trackCode;
            int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode12 = (hashCode11 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode13 = (hashCode12 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode14 = (hashCode13 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode16 = (hashCode15 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode16 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemAnimatedBlockDto(type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", blockId=");
            sb.append(this.blockId);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", animation=");
            sb.append(this.animation);
            sb.append(", decoration=");
            sb.append(this.decoration);
            sb.append(", subtitle=");
            sb.append(this.subtitle);
            sb.append(", button=");
            sb.append(this.button);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            parcel.writeString(this.blockId);
            parcel.writeString(this.text);
            NewsfeedItemAnimatedBlockAnimationDto newsfeedItemAnimatedBlockAnimationDto = this.animation;
            if (newsfeedItemAnimatedBlockAnimationDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedItemAnimatedBlockAnimationDto.writeToParcel(parcel, i);
            }
            DecorationDto decorationDto = this.decoration;
            if (decorationDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                decorationDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.subtitle);
            parcel.writeParcelable(this.button, i);
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemAnimatedBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, String str2, NewsfeedItemAnimatedBlockAnimationDto newsfeedItemAnimatedBlockAnimationDto, DecorationDto decorationDto, String str3, BaseLinkButtonDto baseLinkButtonDto, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str4, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
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
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.trackCode = str4;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemAppsCarouselDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemAppsCarouselDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("button")
        private final DiscoverCarouselButtonDto button;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("items")
        private final List<DiscoverCarouselItemDto> items;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("objects")
        private final List<AppsAppDto> objects;

        @pmi0("objects_type")
        private final DiscoverCarouselObjectsTypeDto objectsType;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemAppsCarouselDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemAppsCarouselDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                DiscoverCarouselButtonDto discoverCarouselButtonDto = (DiscoverCarouselButtonDto) parcel.readParcelable(NewsfeedItemAppsCarouselDto.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(NewsfeedItemAppsCarouselDto.class, parcel, arrayList2, i, 1);
                }
                String readString = parcel.readString();
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemAppsCarouselDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemAppsCarouselDto.class.getClassLoader());
                int readInt2 = parcel.readInt();
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt3);
                    int i2 = 0;
                    while (i2 != readInt3) {
                        i2 = bo.b(NewsfeedItemAppsCarouselDto.class, parcel, arrayList3, i2, 1);
                    }
                    arrayList = arrayList3;
                }
                DiscoverCarouselObjectsTypeDto discoverCarouselObjectsTypeDto = (DiscoverCarouselObjectsTypeDto) parcel.readParcelable(NewsfeedItemAppsCarouselDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemAppsCarouselDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString2 = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemAppsCarouselDto.class.getClassLoader());
                Float valueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemAppsCarouselDto.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemAppsCarouselDto(discoverCarouselButtonDto, arrayList2, readString, newsfeedNewsfeedItemTypeDto, userId, readInt2, arrayList, discoverCarouselObjectsTypeDto, valueOf, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, readString2, wallPostActivityDto, valueOf4, newsfeedPushSubscriptionDto, bool, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemAppsCarouselDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemAppsCarouselDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemAppsCarouselDto[] newArray(int i) {
                return new NewsfeedItemAppsCarouselDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemAppsCarouselDto(DiscoverCarouselButtonDto discoverCarouselButtonDto, List list, String str, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, List list2, DiscoverCarouselObjectsTypeDto discoverCarouselObjectsTypeDto, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(discoverCarouselButtonDto, list, str, newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 64) != 0 ? null : list2, (i2 & 128) != 0 ? null : discoverCarouselObjectsTypeDto, (i2 & 256) != 0 ? null : bool, (i2 & 512) != 0 ? null : bool2, (i2 & 1024) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 2048) != 0 ? null : bool3, (i2 & 4096) != 0 ? null : str2, (i2 & 8192) != 0 ? null : wallPostActivityDto, (i2 & 16384) != 0 ? null : f, (32768 & i2) != 0 ? null : newsfeedPushSubscriptionDto, (65536 & i2) != 0 ? null : bool4, (131072 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final DiscoverCarouselButtonDto d() {
            return this.button;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final NewsfeedItemDebugInfoDto e() {
            return this.debugInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemAppsCarouselDto)) {
                return false;
            }
            NewsfeedItemAppsCarouselDto newsfeedItemAppsCarouselDto = (NewsfeedItemAppsCarouselDto) obj;
            return epx.f(this.button, newsfeedItemAppsCarouselDto.button) && epx.f(this.items, newsfeedItemAppsCarouselDto.items) && epx.f(this.title, newsfeedItemAppsCarouselDto.title) && this.type == newsfeedItemAppsCarouselDto.type && epx.f(this.sourceId, newsfeedItemAppsCarouselDto.sourceId) && this.date == newsfeedItemAppsCarouselDto.date && epx.f(this.objects, newsfeedItemAppsCarouselDto.objects) && this.objectsType == newsfeedItemAppsCarouselDto.objectsType && epx.f(this.isAsync, newsfeedItemAppsCarouselDto.isAsync) && epx.f(this.canIgnore, newsfeedItemAppsCarouselDto.canIgnore) && epx.f(this.caption, newsfeedItemAppsCarouselDto.caption) && epx.f(this.keepOffline, newsfeedItemAppsCarouselDto.keepOffline) && epx.f(this.trackCode, newsfeedItemAppsCarouselDto.trackCode) && epx.f(this.activity, newsfeedItemAppsCarouselDto.activity) && epx.f(this.shortTextRate, newsfeedItemAppsCarouselDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemAppsCarouselDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemAppsCarouselDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemAppsCarouselDto.feedback) && epx.f(this.debugInfo, newsfeedItemAppsCarouselDto.debugInfo);
        }

        public final NewsfeedItemWallpostFeedbackDto f() {
            return this.feedback;
        }

        public final List<DiscoverCarouselItemDto> g() {
            return this.items;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a((this.type.hashCode() + urd0.a(fw3.a(this.button.hashCode() * 31, 31, this.items), 31, this.title)) * 31, 31, this.sourceId.b), 31);
            List<AppsAppDto> list = this.objects;
            int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
            DiscoverCarouselObjectsTypeDto discoverCarouselObjectsTypeDto = this.objectsType;
            int hashCode2 = (hashCode + (discoverCarouselObjectsTypeDto == null ? 0 : discoverCarouselObjectsTypeDto.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.canIgnore;
            int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode5 = (hashCode4 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode8 = (hashCode7 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode9 = (hashCode8 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode10 = (hashCode9 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode11 = (hashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode12 = (hashCode11 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode12 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final Boolean i() {
            return this.keepOffline;
        }

        public final List<AppsAppDto> j() {
            return this.objects;
        }

        public final DiscoverCarouselObjectsTypeDto k() {
            return this.objectsType;
        }

        public final NewsfeedNewsfeedItemTypeDto l() {
            return this.type;
        }

        public final Boolean n() {
            return this.isAsync;
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemAppsCarouselDto(button=");
            sb.append(this.button);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", objects=");
            sb.append(this.objects);
            sb.append(", objectsType=");
            sb.append(this.objectsType);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.button, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            parcel.writeString(this.title);
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            List<AppsAppDto> list = this.objects;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            parcel.writeParcelable(this.objectsType, i);
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f2 = this.shortTextRate;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f2);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemAppsCarouselDto(DiscoverCarouselButtonDto discoverCarouselButtonDto, List<DiscoverCarouselItemDto> list, String str, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, List<AppsAppDto> list2, DiscoverCarouselObjectsTypeDto discoverCarouselObjectsTypeDto, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
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
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.trackCode = str2;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemAudioDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemAudioDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("audio")
        private final NewsfeedItemAudioAudioDto audio;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemAudioDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemAudioDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemAudioDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemAudioDto.class.getClassLoader());
                int readInt = parcel.readInt();
                NewsfeedItemAudioAudioDto createFromParcel = parcel.readInt() == 0 ? null : NewsfeedItemAudioAudioDto.CREATOR.createFromParcel(parcel);
                Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemAudioDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Boolean bool = valueOf;
                String readString = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemAudioDto.class.getClassLoader());
                Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemAudioDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemAudioDto(newsfeedNewsfeedItemTypeDto, userId, readInt, createFromParcel, valueOf4, bool, newsfeedNewsfeedItemCaptionDto, valueOf2, readString, wallPostActivityDto, valueOf5, newsfeedPushSubscriptionDto, valueOf3, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemAudioDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemAudioDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemAudioDto[] newArray(int i) {
                return new NewsfeedItemAudioDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemAudioDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, NewsfeedItemAudioAudioDto newsfeedItemAudioAudioDto, Integer num, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : newsfeedItemAudioAudioDto, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 128) != 0 ? null : bool2, (i2 & 256) != 0 ? null : str, (i2 & 512) != 0 ? null : wallPostActivityDto, (i2 & 1024) != 0 ? null : f, (i2 & 2048) != 0 ? null : newsfeedPushSubscriptionDto, (i2 & 4096) != 0 ? null : bool3, (i2 & 8192) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 16384) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemAudioDto)) {
                return false;
            }
            NewsfeedItemAudioDto newsfeedItemAudioDto = (NewsfeedItemAudioDto) obj;
            return this.type == newsfeedItemAudioDto.type && epx.f(this.sourceId, newsfeedItemAudioDto.sourceId) && this.date == newsfeedItemAudioDto.date && epx.f(this.audio, newsfeedItemAudioDto.audio) && epx.f(this.postId, newsfeedItemAudioDto.postId) && epx.f(this.canIgnore, newsfeedItemAudioDto.canIgnore) && epx.f(this.caption, newsfeedItemAudioDto.caption) && epx.f(this.keepOffline, newsfeedItemAudioDto.keepOffline) && epx.f(this.trackCode, newsfeedItemAudioDto.trackCode) && epx.f(this.activity, newsfeedItemAudioDto.activity) && epx.f(this.shortTextRate, newsfeedItemAudioDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemAudioDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemAudioDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemAudioDto.feedback) && epx.f(this.debugInfo, newsfeedItemAudioDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            NewsfeedItemAudioAudioDto newsfeedItemAudioAudioDto = this.audio;
            int hashCode = (a2 + (newsfeedItemAudioAudioDto == null ? 0 : newsfeedItemAudioAudioDto.hashCode())) * 31;
            Integer num = this.postId;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool = this.canIgnore;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode4 = (hashCode3 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool2 = this.keepOffline;
            int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode7 = (hashCode6 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode9 = (hashCode8 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool3 = this.suggestSubscribe;
            int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode11 = (hashCode10 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode11 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemAudioDto(type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", audio=");
            sb.append(this.audio);
            sb.append(", postId=");
            sb.append(this.postId);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            NewsfeedItemAudioAudioDto newsfeedItemAudioAudioDto = this.audio;
            if (newsfeedItemAudioAudioDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedItemAudioAudioDto.writeToParcel(parcel, i);
            }
            Integer num = this.postId;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            Boolean bool = this.canIgnore;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool2 = this.keepOffline;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool3 = this.suggestSubscribe;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemAudioDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, NewsfeedItemAudioAudioDto newsfeedItemAudioAudioDto, Integer num, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.audio = newsfeedItemAudioAudioDto;
            this.postId = num;
            this.canIgnore = bool;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool2;
            this.trackCode = str;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool3;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemAudioPlaylistDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemAudioPlaylistDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("audio_playlist")
        private final NewsfeedItemAudioPlaylistElementsDto audioPlaylist;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemAudioPlaylistDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemAudioPlaylistDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemAudioPlaylistDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemAudioPlaylistDto.class.getClassLoader());
                int readInt = parcel.readInt();
                NewsfeedItemAudioPlaylistElementsDto createFromParcel = parcel.readInt() == 0 ? null : NewsfeedItemAudioPlaylistElementsDto.CREATOR.createFromParcel(parcel);
                Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemAudioPlaylistDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Boolean bool = valueOf;
                String readString = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemAudioPlaylistDto.class.getClassLoader());
                Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemAudioPlaylistDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemAudioPlaylistDto(newsfeedNewsfeedItemTypeDto, userId, readInt, createFromParcel, valueOf4, bool, newsfeedNewsfeedItemCaptionDto, valueOf2, readString, wallPostActivityDto, valueOf5, newsfeedPushSubscriptionDto, valueOf3, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemAudioPlaylistDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemAudioPlaylistDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemAudioPlaylistDto[] newArray(int i) {
                return new NewsfeedItemAudioPlaylistDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemAudioPlaylistDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, NewsfeedItemAudioPlaylistElementsDto newsfeedItemAudioPlaylistElementsDto, Integer num, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : newsfeedItemAudioPlaylistElementsDto, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 128) != 0 ? null : bool2, (i2 & 256) != 0 ? null : str, (i2 & 512) != 0 ? null : wallPostActivityDto, (i2 & 1024) != 0 ? null : f, (i2 & 2048) != 0 ? null : newsfeedPushSubscriptionDto, (i2 & 4096) != 0 ? null : bool3, (i2 & 8192) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 16384) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemAudioPlaylistDto)) {
                return false;
            }
            NewsfeedItemAudioPlaylistDto newsfeedItemAudioPlaylistDto = (NewsfeedItemAudioPlaylistDto) obj;
            return this.type == newsfeedItemAudioPlaylistDto.type && epx.f(this.sourceId, newsfeedItemAudioPlaylistDto.sourceId) && this.date == newsfeedItemAudioPlaylistDto.date && epx.f(this.audioPlaylist, newsfeedItemAudioPlaylistDto.audioPlaylist) && epx.f(this.postId, newsfeedItemAudioPlaylistDto.postId) && epx.f(this.canIgnore, newsfeedItemAudioPlaylistDto.canIgnore) && epx.f(this.caption, newsfeedItemAudioPlaylistDto.caption) && epx.f(this.keepOffline, newsfeedItemAudioPlaylistDto.keepOffline) && epx.f(this.trackCode, newsfeedItemAudioPlaylistDto.trackCode) && epx.f(this.activity, newsfeedItemAudioPlaylistDto.activity) && epx.f(this.shortTextRate, newsfeedItemAudioPlaylistDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemAudioPlaylistDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemAudioPlaylistDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemAudioPlaylistDto.feedback) && epx.f(this.debugInfo, newsfeedItemAudioPlaylistDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            NewsfeedItemAudioPlaylistElementsDto newsfeedItemAudioPlaylistElementsDto = this.audioPlaylist;
            int hashCode = (a2 + (newsfeedItemAudioPlaylistElementsDto == null ? 0 : newsfeedItemAudioPlaylistElementsDto.hashCode())) * 31;
            Integer num = this.postId;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool = this.canIgnore;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode4 = (hashCode3 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool2 = this.keepOffline;
            int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode7 = (hashCode6 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode9 = (hashCode8 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool3 = this.suggestSubscribe;
            int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode11 = (hashCode10 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode11 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemAudioPlaylistDto(type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", audioPlaylist=");
            sb.append(this.audioPlaylist);
            sb.append(", postId=");
            sb.append(this.postId);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            NewsfeedItemAudioPlaylistElementsDto newsfeedItemAudioPlaylistElementsDto = this.audioPlaylist;
            if (newsfeedItemAudioPlaylistElementsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedItemAudioPlaylistElementsDto.writeToParcel(parcel, i);
            }
            Integer num = this.postId;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            Boolean bool = this.canIgnore;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool2 = this.keepOffline;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool3 = this.suggestSubscribe;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemAudioPlaylistDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, NewsfeedItemAudioPlaylistElementsDto newsfeedItemAudioPlaylistElementsDto, Integer num, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.audioPlaylist = newsfeedItemAudioPlaylistElementsDto;
            this.postId = num;
            this.canIgnore = bool;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool2;
            this.trackCode = str;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool3;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemClipsAutoplayBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemClipsAutoplayBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("button")
        private final BaseLinkButtonDto button;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("items")
        private final List<VideoVideoFullDto> items;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("next_from")
        private final String nextFrom;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemClipsAutoplayBlockDto> {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemClipsAutoplayBlockDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean bool;
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(NewsfeedItemClipsAutoplayBlockDto.class, parcel, arrayList, i, 1);
                }
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemClipsAutoplayBlockDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemClipsAutoplayBlockDto.class.getClassLoader());
                int readInt2 = parcel.readInt();
                String readString2 = parcel.readString();
                BaseLinkButtonDto baseLinkButtonDto = (BaseLinkButtonDto) parcel.readParcelable(NewsfeedItemClipsAutoplayBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemClipsAutoplayBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                    bool = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                    bool = null;
                }
                String readString3 = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemClipsAutoplayBlockDto.class.getClassLoader());
                Object valueOf4 = parcel.readInt() == 0 ? bool : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemClipsAutoplayBlockDto.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemClipsAutoplayBlockDto(readString, arrayList, newsfeedNewsfeedItemTypeDto, userId, readInt2, readString2, baseLinkButtonDto, valueOf, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, readString3, wallPostActivityDto, valueOf4, newsfeedPushSubscriptionDto, bool, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemClipsAutoplayBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemClipsAutoplayBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemClipsAutoplayBlockDto[] newArray(int i) {
                return new NewsfeedItemClipsAutoplayBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemClipsAutoplayBlockDto(String str, List list, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str2, BaseLinkButtonDto baseLinkButtonDto, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(str, list, newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : baseLinkButtonDto, (i2 & 128) != 0 ? null : bool, (i2 & 256) != 0 ? null : bool2, (i2 & 512) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 1024) != 0 ? null : bool3, (i2 & 2048) != 0 ? null : str3, (i2 & 4096) != 0 ? null : wallPostActivityDto, (i2 & 8192) != 0 ? null : f, (i2 & 16384) != 0 ? null : newsfeedPushSubscriptionDto, (32768 & i2) != 0 ? null : bool4, (65536 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 131072) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final NewsfeedNewsfeedItemTypeDto d() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemClipsAutoplayBlockDto)) {
                return false;
            }
            NewsfeedItemClipsAutoplayBlockDto newsfeedItemClipsAutoplayBlockDto = (NewsfeedItemClipsAutoplayBlockDto) obj;
            return epx.f(this.title, newsfeedItemClipsAutoplayBlockDto.title) && epx.f(this.items, newsfeedItemClipsAutoplayBlockDto.items) && this.type == newsfeedItemClipsAutoplayBlockDto.type && epx.f(this.sourceId, newsfeedItemClipsAutoplayBlockDto.sourceId) && this.date == newsfeedItemClipsAutoplayBlockDto.date && epx.f(this.nextFrom, newsfeedItemClipsAutoplayBlockDto.nextFrom) && epx.f(this.button, newsfeedItemClipsAutoplayBlockDto.button) && epx.f(this.isAsync, newsfeedItemClipsAutoplayBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedItemClipsAutoplayBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemClipsAutoplayBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemClipsAutoplayBlockDto.keepOffline) && epx.f(this.trackCode, newsfeedItemClipsAutoplayBlockDto.trackCode) && epx.f(this.activity, newsfeedItemClipsAutoplayBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemClipsAutoplayBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemClipsAutoplayBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemClipsAutoplayBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemClipsAutoplayBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemClipsAutoplayBlockDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a((this.type.hashCode() + fw3.a(this.title.hashCode() * 31, 31, this.items)) * 31, 31, this.sourceId.b), 31);
            String str = this.nextFrom;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            BaseLinkButtonDto baseLinkButtonDto = this.button;
            int hashCode2 = (hashCode + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.canIgnore;
            int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode5 = (hashCode4 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str2 = this.trackCode;
            int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode8 = (hashCode7 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode9 = (hashCode8 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode10 = (hashCode9 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode11 = (hashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode12 = (hashCode11 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode12 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemClipsAutoplayBlockDto(title=");
            sb.append(this.title);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", nextFrom=");
            sb.append(this.nextFrom);
            sb.append(", button=");
            sb.append(this.button);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            parcel.writeString(this.nextFrom);
            parcel.writeParcelable(this.button, i);
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemClipsAutoplayBlockDto(String str, List<VideoVideoFullDto> list, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str2, BaseLinkButtonDto baseLinkButtonDto, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.title = str;
            this.items = list;
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.nextFrom = str2;
            this.button = baseLinkButtonDto;
            this.isAsync = bool;
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.trackCode = str3;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemClipsChallengesBlockUmbrellaDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemClipsChallengesBlockUmbrellaDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("inner_type")
        private final InnerTypeDto innerType;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("items")
        private final List<VideoVideoFullDto> items;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class InnerTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ InnerTypeDto[] $VALUES;
            public static final Parcelable.Creator<InnerTypeDto> CREATOR;

            @pmi0("newsfeed_item_clips_challenges_block")
            public static final InnerTypeDto NEWSFEED_ITEM_CLIPS_CHALLENGES_BLOCK;
            private final String value;

            /* compiled from: NewsfeedNewsfeedItemDto.kt */
            public static final class a implements Parcelable.Creator<InnerTypeDto> {
                @Override // android.os.Parcelable.Creator
                public final InnerTypeDto createFromParcel(Parcel parcel) {
                    return InnerTypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final InnerTypeDto[] newArray(int i) {
                    return new InnerTypeDto[i];
                }
            }

            static {
                InnerTypeDto innerTypeDto = new InnerTypeDto("NEWSFEED_ITEM_CLIPS_CHALLENGES_BLOCK", 0, "newsfeed_item_clips_challenges_block");
                NEWSFEED_ITEM_CLIPS_CHALLENGES_BLOCK = innerTypeDto;
                InnerTypeDto[] innerTypeDtoArr = {innerTypeDto};
                $VALUES = innerTypeDtoArr;
                $ENTRIES = new asp(innerTypeDtoArr);
                CREATOR = new a();
            }

            private InnerTypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static InnerTypeDto valueOf(String str) {
                return (InnerTypeDto) Enum.valueOf(InnerTypeDto.class, str);
            }

            public static InnerTypeDto[] values() {
                return (InnerTypeDto[]) $VALUES.clone();
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

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemClipsChallengesBlockUmbrellaDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemClipsChallengesBlockUmbrellaDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean valueOf4;
                InnerTypeDto createFromParcel = InnerTypeDto.CREATOR.createFromParcel(parcel);
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemClipsChallengesBlockUmbrellaDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemClipsChallengesBlockUmbrellaDto.class.getClassLoader());
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList = new ArrayList(readInt2);
                    int i = 0;
                    while (i != readInt2) {
                        i = bo.b(NewsfeedItemClipsChallengesBlockUmbrellaDto.class, parcel, arrayList, i, 1);
                    }
                }
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemClipsChallengesBlockUmbrellaDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                boolean z = true;
                ArrayList arrayList2 = arrayList;
                String readString2 = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemClipsChallengesBlockUmbrellaDto.class.getClassLoader());
                Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemClipsChallengesBlockUmbrellaDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    if (parcel.readInt() == 0) {
                        z = false;
                    }
                    valueOf4 = Boolean.valueOf(z);
                }
                return new NewsfeedItemClipsChallengesBlockUmbrellaDto(createFromParcel, newsfeedNewsfeedItemTypeDto, userId, readInt, readString, arrayList2, valueOf, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, readString2, wallPostActivityDto, valueOf5, newsfeedPushSubscriptionDto, valueOf4, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemClipsChallengesBlockUmbrellaDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemClipsChallengesBlockUmbrellaDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemClipsChallengesBlockUmbrellaDto[] newArray(int i) {
                return new NewsfeedItemClipsChallengesBlockUmbrellaDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemClipsChallengesBlockUmbrellaDto(InnerTypeDto innerTypeDto, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, List list, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(innerTypeDto, newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? null : bool2, (i2 & 256) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 512) != 0 ? null : bool3, (i2 & 1024) != 0 ? null : str2, (i2 & 2048) != 0 ? null : wallPostActivityDto, (i2 & 4096) != 0 ? null : f, (i2 & 8192) != 0 ? null : newsfeedPushSubscriptionDto, (i2 & 16384) != 0 ? null : bool4, (32768 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 65536) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final NewsfeedNewsfeedItemTypeDto d() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemClipsChallengesBlockUmbrellaDto)) {
                return false;
            }
            NewsfeedItemClipsChallengesBlockUmbrellaDto newsfeedItemClipsChallengesBlockUmbrellaDto = (NewsfeedItemClipsChallengesBlockUmbrellaDto) obj;
            return this.innerType == newsfeedItemClipsChallengesBlockUmbrellaDto.innerType && this.type == newsfeedItemClipsChallengesBlockUmbrellaDto.type && epx.f(this.sourceId, newsfeedItemClipsChallengesBlockUmbrellaDto.sourceId) && this.date == newsfeedItemClipsChallengesBlockUmbrellaDto.date && epx.f(this.title, newsfeedItemClipsChallengesBlockUmbrellaDto.title) && epx.f(this.items, newsfeedItemClipsChallengesBlockUmbrellaDto.items) && epx.f(this.isAsync, newsfeedItemClipsChallengesBlockUmbrellaDto.isAsync) && epx.f(this.canIgnore, newsfeedItemClipsChallengesBlockUmbrellaDto.canIgnore) && epx.f(this.caption, newsfeedItemClipsChallengesBlockUmbrellaDto.caption) && epx.f(this.keepOffline, newsfeedItemClipsChallengesBlockUmbrellaDto.keepOffline) && epx.f(this.trackCode, newsfeedItemClipsChallengesBlockUmbrellaDto.trackCode) && epx.f(this.activity, newsfeedItemClipsChallengesBlockUmbrellaDto.activity) && epx.f(this.shortTextRate, newsfeedItemClipsChallengesBlockUmbrellaDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemClipsChallengesBlockUmbrellaDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemClipsChallengesBlockUmbrellaDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemClipsChallengesBlockUmbrellaDto.feedback) && epx.f(this.debugInfo, newsfeedItemClipsChallengesBlockUmbrellaDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a((this.type.hashCode() + (this.innerType.hashCode() * 31)) * 31, 31, this.sourceId.b), 31);
            String str = this.title;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            List<VideoVideoFullDto> list = this.items;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.canIgnore;
            int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode5 = (hashCode4 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str2 = this.trackCode;
            int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode8 = (hashCode7 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode9 = (hashCode8 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode10 = (hashCode9 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode11 = (hashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode12 = (hashCode11 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode12 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemClipsChallengesBlockUmbrellaDto(innerType=");
            sb.append(this.innerType);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.innerType.writeToParcel(parcel, i);
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            parcel.writeString(this.title);
            List<VideoVideoFullDto> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f2 = this.shortTextRate;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f2);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemClipsChallengesBlockUmbrellaDto(InnerTypeDto innerTypeDto, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, List<VideoVideoFullDto> list, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.innerType = innerTypeDto;
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.title = str;
            this.items = list;
            this.isAsync = bool;
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.trackCode = str2;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemDigestDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemDigestDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

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

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("main_post_ids")
        private final List<String> mainPostIds;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("template")
        private final TemplateDto template;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class TemplateDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TemplateDto[] $VALUES;
            public static final Parcelable.Creator<TemplateDto> CREATOR;

            @pmi0("grid")
            public static final TemplateDto GRID;

            @pmi0("list")
            public static final TemplateDto LIST;

            @pmi0(Ad.d)
            public static final TemplateDto SINGLE;
            private final String value;

            /* compiled from: NewsfeedNewsfeedItemDto.kt */
            public static final class a implements Parcelable.Creator<TemplateDto> {
                @Override // android.os.Parcelable.Creator
                public final TemplateDto createFromParcel(Parcel parcel) {
                    return TemplateDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TemplateDto[] newArray(int i) {
                    return new TemplateDto[i];
                }
            }

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
                CREATOR = new a();
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

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String i() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemDigestDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemDigestDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Boolean bool;
                Boolean bool2;
                Boolean bool3;
                Boolean valueOf;
                Boolean valueOf2;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemDigestDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemDigestDto.class.getClassLoader());
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    bool = null;
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList = new ArrayList(readInt2);
                    int i = 0;
                    while (i != readInt2) {
                        i = en.a(NewsfeedItemDigestItemDto.CREATOR, parcel, arrayList, i, 1);
                    }
                    bool = null;
                }
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                TemplateDto templateDto = (TemplateDto) (parcel.readInt() == 0 ? bool : TemplateDto.CREATOR.createFromParcel(parcel));
                NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto = (NewsfeedItemDigestHeaderDto) (parcel.readInt() == 0 ? bool : NewsfeedItemDigestHeaderDto.CREATOR.createFromParcel(parcel));
                NewsfeedItemDigestFooterDto newsfeedItemDigestFooterDto = (NewsfeedItemDigestFooterDto) (parcel.readInt() == 0 ? bool : NewsfeedItemDigestFooterDto.CREATOR.createFromParcel(parcel));
                if (parcel.readInt() == 0) {
                    bool2 = bool;
                } else {
                    bool2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    bool3 = bool;
                } else {
                    bool3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemDigestDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString2 = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemDigestDto.class.getClassLoader());
                Float valueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemDigestDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemDigestDto(newsfeedNewsfeedItemTypeDto, userId, readInt, readString, arrayList, createStringArrayList, templateDto, newsfeedItemDigestHeaderDto, newsfeedItemDigestFooterDto, bool2, bool3, newsfeedNewsfeedItemCaptionDto, valueOf, readString2, wallPostActivityDto, valueOf3, newsfeedPushSubscriptionDto, valueOf2, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemDigestDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemDigestDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemDigestDto[] newArray(int i) {
                return new NewsfeedItemDigestDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemDigestDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, List list, List list2, TemplateDto templateDto, NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto, NewsfeedItemDigestFooterDto newsfeedItemDigestFooterDto, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : list2, (i2 & 64) != 0 ? null : templateDto, (i2 & 128) != 0 ? null : newsfeedItemDigestHeaderDto, (i2 & 256) != 0 ? null : newsfeedItemDigestFooterDto, (i2 & 512) != 0 ? null : bool, (i2 & 1024) != 0 ? null : bool2, (i2 & 2048) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 4096) != 0 ? null : bool3, (i2 & 8192) != 0 ? null : str2, (i2 & 16384) != 0 ? null : wallPostActivityDto, (32768 & i2) != 0 ? null : f, (65536 & i2) != 0 ? null : newsfeedPushSubscriptionDto, (131072 & i2) != 0 ? null : bool4, (262144 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 524288) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final Boolean d() {
            return this.canIgnore;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final NewsfeedItemDebugInfoDto e() {
            return this.debugInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemDigestDto)) {
                return false;
            }
            NewsfeedItemDigestDto newsfeedItemDigestDto = (NewsfeedItemDigestDto) obj;
            return this.type == newsfeedItemDigestDto.type && epx.f(this.sourceId, newsfeedItemDigestDto.sourceId) && this.date == newsfeedItemDigestDto.date && epx.f(this.feedId, newsfeedItemDigestDto.feedId) && epx.f(this.items, newsfeedItemDigestDto.items) && epx.f(this.mainPostIds, newsfeedItemDigestDto.mainPostIds) && this.template == newsfeedItemDigestDto.template && epx.f(this.header, newsfeedItemDigestDto.header) && epx.f(this.footer, newsfeedItemDigestDto.footer) && epx.f(this.isAsync, newsfeedItemDigestDto.isAsync) && epx.f(this.canIgnore, newsfeedItemDigestDto.canIgnore) && epx.f(this.caption, newsfeedItemDigestDto.caption) && epx.f(this.keepOffline, newsfeedItemDigestDto.keepOffline) && epx.f(this.trackCode, newsfeedItemDigestDto.trackCode) && epx.f(this.activity, newsfeedItemDigestDto.activity) && epx.f(this.shortTextRate, newsfeedItemDigestDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemDigestDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemDigestDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemDigestDto.feedback) && epx.f(this.debugInfo, newsfeedItemDigestDto.debugInfo);
        }

        public final String f() {
            return this.feedId;
        }

        public final NewsfeedItemWallpostFeedbackDto g() {
            return this.feedback;
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            String str = this.feedId;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
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
            Boolean bool2 = this.canIgnore;
            int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode9 = (hashCode8 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str2 = this.trackCode;
            int hashCode11 = (hashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode12 = (hashCode11 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode13 = (hashCode12 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode14 = (hashCode13 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode16 = (hashCode15 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode16 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final NewsfeedItemDigestFooterDto i() {
            return this.footer;
        }

        public final NewsfeedItemDigestHeaderDto j() {
            return this.header;
        }

        public final List<NewsfeedItemDigestItemDto> k() {
            return this.items;
        }

        public final Boolean l() {
            return this.keepOffline;
        }

        public final List<String> n() {
            return this.mainPostIds;
        }

        public final TemplateDto o() {
            return this.template;
        }

        public final NewsfeedNewsfeedItemTypeDto p() {
            return this.type;
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemDigestDto(type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", feedId=");
            sb.append(this.feedId);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", mainPostIds=");
            sb.append(this.mainPostIds);
            sb.append(", template=");
            sb.append(this.template);
            sb.append(", header=");
            sb.append(this.header);
            sb.append(", footer=");
            sb.append(this.footer);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        public final Boolean u() {
            return this.isAsync;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            parcel.writeString(this.feedId);
            List<NewsfeedItemDigestItemDto> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((NewsfeedItemDigestItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeStringList(this.mainPostIds);
            TemplateDto templateDto = this.template;
            if (templateDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                templateDto.writeToParcel(parcel, i);
            }
            NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto = this.header;
            if (newsfeedItemDigestHeaderDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedItemDigestHeaderDto.writeToParcel(parcel, i);
            }
            NewsfeedItemDigestFooterDto newsfeedItemDigestFooterDto = this.footer;
            if (newsfeedItemDigestFooterDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedItemDigestFooterDto.writeToParcel(parcel, i);
            }
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f2 = this.shortTextRate;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f2);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemDigestDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, List<NewsfeedItemDigestItemDto> list, List<String> list2, TemplateDto templateDto, NewsfeedItemDigestHeaderDto newsfeedItemDigestHeaderDto, NewsfeedItemDigestFooterDto newsfeedItemDigestFooterDto, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
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
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.trackCode = str2;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemExpertCardWidgetDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemExpertCardWidgetDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("expert_card")
        private final NewsfeedExpertCardWidgetDto expertCard;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("expert_card")
            public static final TypeDto EXPERT_CARD;
            private final String value;

            /* compiled from: NewsfeedNewsfeedItemDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("EXPERT_CARD", 0, "expert_card");
                EXPERT_CARD = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String i() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemExpertCardWidgetDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemExpertCardWidgetDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemExpertCardWidgetDto.class.getClassLoader());
                int readInt = parcel.readInt();
                TypeDto createFromParcel = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
                NewsfeedExpertCardWidgetDto createFromParcel2 = parcel.readInt() == 0 ? null : NewsfeedExpertCardWidgetDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemExpertCardWidgetDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Boolean bool = valueOf;
                String readString = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemExpertCardWidgetDto.class.getClassLoader());
                Float valueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemExpertCardWidgetDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemExpertCardWidgetDto(userId, readInt, createFromParcel, createFromParcel2, bool, newsfeedNewsfeedItemCaptionDto, valueOf2, readString, wallPostActivityDto, valueOf4, newsfeedPushSubscriptionDto, valueOf3, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemExpertCardWidgetDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemExpertCardWidgetDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemExpertCardWidgetDto[] newArray(int i) {
                return new NewsfeedItemExpertCardWidgetDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemExpertCardWidgetDto(UserId userId, int i, TypeDto typeDto, NewsfeedExpertCardWidgetDto newsfeedExpertCardWidgetDto, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(userId, i, (i2 & 4) != 0 ? null : typeDto, (i2 & 8) != 0 ? null : newsfeedExpertCardWidgetDto, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 64) != 0 ? null : bool2, (i2 & 128) != 0 ? null : str, (i2 & 256) != 0 ? null : wallPostActivityDto, (i2 & 512) != 0 ? null : f, (i2 & 1024) != 0 ? null : newsfeedPushSubscriptionDto, (i2 & 2048) != 0 ? null : bool3, (i2 & 4096) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 8192) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final TypeDto d() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemExpertCardWidgetDto)) {
                return false;
            }
            NewsfeedItemExpertCardWidgetDto newsfeedItemExpertCardWidgetDto = (NewsfeedItemExpertCardWidgetDto) obj;
            return epx.f(this.sourceId, newsfeedItemExpertCardWidgetDto.sourceId) && this.date == newsfeedItemExpertCardWidgetDto.date && this.type == newsfeedItemExpertCardWidgetDto.type && epx.f(this.expertCard, newsfeedItemExpertCardWidgetDto.expertCard) && epx.f(this.canIgnore, newsfeedItemExpertCardWidgetDto.canIgnore) && epx.f(this.caption, newsfeedItemExpertCardWidgetDto.caption) && epx.f(this.keepOffline, newsfeedItemExpertCardWidgetDto.keepOffline) && epx.f(this.trackCode, newsfeedItemExpertCardWidgetDto.trackCode) && epx.f(this.activity, newsfeedItemExpertCardWidgetDto.activity) && epx.f(this.shortTextRate, newsfeedItemExpertCardWidgetDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemExpertCardWidgetDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemExpertCardWidgetDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemExpertCardWidgetDto.feedback) && epx.f(this.debugInfo, newsfeedItemExpertCardWidgetDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, Long.hashCode(this.sourceId.b) * 31, 31);
            TypeDto typeDto = this.type;
            int hashCode = (a2 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
            NewsfeedExpertCardWidgetDto newsfeedExpertCardWidgetDto = this.expertCard;
            int hashCode2 = (hashCode + (newsfeedExpertCardWidgetDto == null ? 0 : newsfeedExpertCardWidgetDto.hashCode())) * 31;
            Boolean bool = this.canIgnore;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode4 = (hashCode3 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool2 = this.keepOffline;
            int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode7 = (hashCode6 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode9 = (hashCode8 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool3 = this.suggestSubscribe;
            int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode11 = (hashCode10 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode11 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemExpertCardWidgetDto(sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", expertCard=");
            sb.append(this.expertCard);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            TypeDto typeDto = this.type;
            if (typeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                typeDto.writeToParcel(parcel, i);
            }
            NewsfeedExpertCardWidgetDto newsfeedExpertCardWidgetDto = this.expertCard;
            if (newsfeedExpertCardWidgetDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedExpertCardWidgetDto.writeToParcel(parcel, i);
            }
            Boolean bool = this.canIgnore;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool2 = this.keepOffline;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool3 = this.suggestSubscribe;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemExpertCardWidgetDto(UserId userId, int i, TypeDto typeDto, NewsfeedExpertCardWidgetDto newsfeedExpertCardWidgetDto, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.sourceId = userId;
            this.date = i;
            this.type = typeDto;
            this.expertCard = newsfeedExpertCardWidgetDto;
            this.canIgnore = bool;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool2;
            this.trackCode = str;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool3;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemFeedbackPollDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemFeedbackPollDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("banner")
        private final NewsfeedItemFeedbackPollBannerDto banner;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("poll")
        private final NewsfeedItemFeedbackPollPollDto poll;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemFeedbackPollDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemFeedbackPollDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                NewsfeedItemFeedbackPollBannerDto createFromParcel = NewsfeedItemFeedbackPollBannerDto.CREATOR.createFromParcel(parcel);
                NewsfeedItemFeedbackPollPollDto createFromParcel2 = NewsfeedItemFeedbackPollPollDto.CREATOR.createFromParcel(parcel);
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemFeedbackPollDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemFeedbackPollDto.class.getClassLoader());
                int readInt = parcel.readInt();
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemFeedbackPollDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                boolean z = false;
                String readString = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemFeedbackPollDto.class.getClassLoader());
                Float valueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemFeedbackPollDto.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    bool = Boolean.valueOf(z);
                }
                return new NewsfeedItemFeedbackPollDto(createFromParcel, createFromParcel2, newsfeedNewsfeedItemTypeDto, userId, readInt, valueOf, newsfeedNewsfeedItemCaptionDto, valueOf2, readString, wallPostActivityDto, valueOf3, newsfeedPushSubscriptionDto, bool, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemFeedbackPollDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemFeedbackPollDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemFeedbackPollDto[] newArray(int i) {
                return new NewsfeedItemFeedbackPollDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemFeedbackPollDto(NewsfeedItemFeedbackPollBannerDto newsfeedItemFeedbackPollBannerDto, NewsfeedItemFeedbackPollPollDto newsfeedItemFeedbackPollPollDto, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(newsfeedItemFeedbackPollBannerDto, newsfeedItemFeedbackPollPollDto, newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 128) != 0 ? null : bool2, (i2 & 256) != 0 ? null : str, (i2 & 512) != 0 ? null : wallPostActivityDto, (i2 & 1024) != 0 ? null : f, (i2 & 2048) != 0 ? null : newsfeedPushSubscriptionDto, (i2 & 4096) != 0 ? null : bool3, (i2 & 8192) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 16384) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final NewsfeedNewsfeedItemTypeDto d() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemFeedbackPollDto)) {
                return false;
            }
            NewsfeedItemFeedbackPollDto newsfeedItemFeedbackPollDto = (NewsfeedItemFeedbackPollDto) obj;
            return epx.f(this.banner, newsfeedItemFeedbackPollDto.banner) && epx.f(this.poll, newsfeedItemFeedbackPollDto.poll) && this.type == newsfeedItemFeedbackPollDto.type && epx.f(this.sourceId, newsfeedItemFeedbackPollDto.sourceId) && this.date == newsfeedItemFeedbackPollDto.date && epx.f(this.canIgnore, newsfeedItemFeedbackPollDto.canIgnore) && epx.f(this.caption, newsfeedItemFeedbackPollDto.caption) && epx.f(this.keepOffline, newsfeedItemFeedbackPollDto.keepOffline) && epx.f(this.trackCode, newsfeedItemFeedbackPollDto.trackCode) && epx.f(this.activity, newsfeedItemFeedbackPollDto.activity) && epx.f(this.shortTextRate, newsfeedItemFeedbackPollDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemFeedbackPollDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemFeedbackPollDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemFeedbackPollDto.feedback) && epx.f(this.debugInfo, newsfeedItemFeedbackPollDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a((this.type.hashCode() + ((this.poll.hashCode() + (this.banner.hashCode() * 31)) * 31)) * 31, 31, this.sourceId.b), 31);
            Boolean bool = this.canIgnore;
            int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode2 = (hashCode + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool2 = this.keepOffline;
            int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode5 = (hashCode4 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode7 = (hashCode6 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool3 = this.suggestSubscribe;
            int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode9 = (hashCode8 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode9 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemFeedbackPollDto(banner=");
            sb.append(this.banner);
            sb.append(", poll=");
            sb.append(this.poll);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.banner.writeToParcel(parcel, i);
            this.poll.writeToParcel(parcel, i);
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            Boolean bool = this.canIgnore;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool2 = this.keepOffline;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool3 = this.suggestSubscribe;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemFeedbackPollDto(NewsfeedItemFeedbackPollBannerDto newsfeedItemFeedbackPollBannerDto, NewsfeedItemFeedbackPollPollDto newsfeedItemFeedbackPollPollDto, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.banner = newsfeedItemFeedbackPollBannerDto;
            this.poll = newsfeedItemFeedbackPollPollDto;
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.canIgnore = bool;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool2;
            this.trackCode = str;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool3;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemFriendDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemFriendDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("friends")
        private final NewsfeedItemFriendFriendsDto friends;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemFriendDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemFriendDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemFriendDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemFriendDto.class.getClassLoader());
                int readInt = parcel.readInt();
                NewsfeedItemFriendFriendsDto createFromParcel = parcel.readInt() == 0 ? null : NewsfeedItemFriendFriendsDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemFriendDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Boolean bool = valueOf;
                String readString = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemFriendDto.class.getClassLoader());
                Float valueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemFriendDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemFriendDto(newsfeedNewsfeedItemTypeDto, userId, readInt, createFromParcel, bool, newsfeedNewsfeedItemCaptionDto, valueOf2, readString, wallPostActivityDto, valueOf4, newsfeedPushSubscriptionDto, valueOf3, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemFriendDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemFriendDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemFriendDto[] newArray(int i) {
                return new NewsfeedItemFriendDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemFriendDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, NewsfeedItemFriendFriendsDto newsfeedItemFriendFriendsDto, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : newsfeedItemFriendFriendsDto, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 64) != 0 ? null : bool2, (i2 & 128) != 0 ? null : str, (i2 & 256) != 0 ? null : wallPostActivityDto, (i2 & 512) != 0 ? null : f, (i2 & 1024) != 0 ? null : newsfeedPushSubscriptionDto, (i2 & 2048) != 0 ? null : bool3, (i2 & 4096) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 8192) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemFriendDto)) {
                return false;
            }
            NewsfeedItemFriendDto newsfeedItemFriendDto = (NewsfeedItemFriendDto) obj;
            return this.type == newsfeedItemFriendDto.type && epx.f(this.sourceId, newsfeedItemFriendDto.sourceId) && this.date == newsfeedItemFriendDto.date && epx.f(this.friends, newsfeedItemFriendDto.friends) && epx.f(this.canIgnore, newsfeedItemFriendDto.canIgnore) && epx.f(this.caption, newsfeedItemFriendDto.caption) && epx.f(this.keepOffline, newsfeedItemFriendDto.keepOffline) && epx.f(this.trackCode, newsfeedItemFriendDto.trackCode) && epx.f(this.activity, newsfeedItemFriendDto.activity) && epx.f(this.shortTextRate, newsfeedItemFriendDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemFriendDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemFriendDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemFriendDto.feedback) && epx.f(this.debugInfo, newsfeedItemFriendDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            NewsfeedItemFriendFriendsDto newsfeedItemFriendFriendsDto = this.friends;
            int hashCode = (a2 + (newsfeedItemFriendFriendsDto == null ? 0 : newsfeedItemFriendFriendsDto.hashCode())) * 31;
            Boolean bool = this.canIgnore;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode3 = (hashCode2 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool2 = this.keepOffline;
            int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode6 = (hashCode5 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode8 = (hashCode7 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool3 = this.suggestSubscribe;
            int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode10 = (hashCode9 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode10 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemFriendDto(type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", friends=");
            sb.append(this.friends);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            NewsfeedItemFriendFriendsDto newsfeedItemFriendFriendsDto = this.friends;
            if (newsfeedItemFriendFriendsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedItemFriendFriendsDto.writeToParcel(parcel, i);
            }
            Boolean bool = this.canIgnore;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool2 = this.keepOffline;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool3 = this.suggestSubscribe;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemFriendDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, NewsfeedItemFriendFriendsDto newsfeedItemFriendFriendsDto, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.friends = newsfeedItemFriendFriendsDto;
            this.canIgnore = bool;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool2;
            this.trackCode = str;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool3;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemFriendsEntrypointsBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemFriendsEntrypointsBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("entrypoints")
        private final FriendsEntrypointsDto entrypoints;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final String type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemFriendsEntrypointsBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemFriendsEntrypointsBlockDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean valueOf4;
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemFriendsEntrypointsBlockDto.class.getClassLoader());
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                FriendsEntrypointsDto createFromParcel = parcel.readInt() == 0 ? null : FriendsEntrypointsDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemFriendsEntrypointsBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                boolean z = false;
                String readString2 = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemFriendsEntrypointsBlockDto.class.getClassLoader());
                Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemFriendsEntrypointsBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    valueOf4 = Boolean.valueOf(z);
                }
                return new NewsfeedItemFriendsEntrypointsBlockDto(userId, readInt, readString, createFromParcel, valueOf, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, readString2, wallPostActivityDto, valueOf5, newsfeedPushSubscriptionDto, valueOf4, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemFriendsEntrypointsBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemFriendsEntrypointsBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemFriendsEntrypointsBlockDto[] newArray(int i) {
                return new NewsfeedItemFriendsEntrypointsBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemFriendsEntrypointsBlockDto(UserId userId, int i, String str, FriendsEntrypointsDto friendsEntrypointsDto, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(userId, i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : friendsEntrypointsDto, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : bool2, (i2 & 64) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 128) != 0 ? null : bool3, (i2 & 256) != 0 ? null : str2, (i2 & 512) != 0 ? null : wallPostActivityDto, (i2 & 1024) != 0 ? null : f, (i2 & 2048) != 0 ? null : newsfeedPushSubscriptionDto, (i2 & 4096) != 0 ? null : bool4, (i2 & 8192) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 16384) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemFriendsEntrypointsBlockDto)) {
                return false;
            }
            NewsfeedItemFriendsEntrypointsBlockDto newsfeedItemFriendsEntrypointsBlockDto = (NewsfeedItemFriendsEntrypointsBlockDto) obj;
            return epx.f(this.sourceId, newsfeedItemFriendsEntrypointsBlockDto.sourceId) && this.date == newsfeedItemFriendsEntrypointsBlockDto.date && epx.f(this.type, newsfeedItemFriendsEntrypointsBlockDto.type) && epx.f(this.entrypoints, newsfeedItemFriendsEntrypointsBlockDto.entrypoints) && epx.f(this.isAsync, newsfeedItemFriendsEntrypointsBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedItemFriendsEntrypointsBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemFriendsEntrypointsBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemFriendsEntrypointsBlockDto.keepOffline) && epx.f(this.trackCode, newsfeedItemFriendsEntrypointsBlockDto.trackCode) && epx.f(this.activity, newsfeedItemFriendsEntrypointsBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemFriendsEntrypointsBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemFriendsEntrypointsBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemFriendsEntrypointsBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemFriendsEntrypointsBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemFriendsEntrypointsBlockDto.debugInfo);
        }

        public final String getType() {
            return this.type;
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, Long.hashCode(this.sourceId.b) * 31, 31);
            String str = this.type;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            FriendsEntrypointsDto friendsEntrypointsDto = this.entrypoints;
            int hashCode2 = (hashCode + (friendsEntrypointsDto == null ? 0 : friendsEntrypointsDto.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.canIgnore;
            int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode5 = (hashCode4 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str2 = this.trackCode;
            int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode8 = (hashCode7 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode9 = (hashCode8 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode10 = (hashCode9 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode11 = (hashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode12 = (hashCode11 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode12 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemFriendsEntrypointsBlockDto(sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", entrypoints=");
            sb.append(this.entrypoints);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            parcel.writeString(this.type);
            FriendsEntrypointsDto friendsEntrypointsDto = this.entrypoints;
            if (friendsEntrypointsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                friendsEntrypointsDto.writeToParcel(parcel, i);
            }
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemFriendsEntrypointsBlockDto(UserId userId, int i, String str, FriendsEntrypointsDto friendsEntrypointsDto, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.sourceId = userId;
            this.date = i;
            this.type = str;
            this.entrypoints = friendsEntrypointsDto;
            this.isAsync = bool;
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.trackCode = str2;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemFriendsRecommendBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemFriendsRecommendBlockDto> CREATOR = new a();

        @pmi0("account_import_block_pos")
        private final Integer accountImportBlockPos;

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("footer")
        private final FriendsRecBlockFooterDto footer;

        @pmi0("info_card")
        private final FriendsRecBlockInfoCardDto infoCard;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("next_from")
        private final String nextFrom;

        @pmi0("profiles")
        private final List<FriendsRecProfileDto> profiles;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final String type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemFriendsRecommendBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemFriendsRecommendBlockDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean valueOf4;
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(FriendsRecProfileDto.CREATOR, parcel, arrayList, i, 1);
                }
                int readInt2 = parcel.readInt();
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemFriendsRecommendBlockDto.class.getClassLoader());
                String readString2 = parcel.readString();
                FriendsRecBlockInfoCardDto createFromParcel = parcel.readInt() == 0 ? null : FriendsRecBlockInfoCardDto.CREATOR.createFromParcel(parcel);
                Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                FriendsRecBlockFooterDto createFromParcel2 = parcel.readInt() == 0 ? null : FriendsRecBlockFooterDto.CREATOR.createFromParcel(parcel);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemFriendsRecommendBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemFriendsRecommendBlockDto.class.getClassLoader());
                Float valueOf6 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemFriendsRecommendBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemFriendsRecommendBlockDto(readString, arrayList, readInt2, userId, readString2, createFromParcel, valueOf5, createFromParcel2, readString3, readString4, valueOf, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, wallPostActivityDto, valueOf6, newsfeedPushSubscriptionDto, valueOf4, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemFriendsRecommendBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemFriendsRecommendBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemFriendsRecommendBlockDto[] newArray(int i) {
                return new NewsfeedItemFriendsRecommendBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemFriendsRecommendBlockDto(String str, List list, int i, UserId userId, String str2, FriendsRecBlockInfoCardDto friendsRecBlockInfoCardDto, Integer num, FriendsRecBlockFooterDto friendsRecBlockFooterDto, String str3, String str4, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(str, list, i, (i2 & 8) != 0 ? null : userId, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : friendsRecBlockInfoCardDto, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : friendsRecBlockFooterDto, (i2 & 256) != 0 ? null : str3, (i2 & 512) != 0 ? null : str4, (i2 & 1024) != 0 ? null : bool, (i2 & 2048) != 0 ? null : bool2, (i2 & 4096) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 8192) != 0 ? null : bool3, (i2 & 16384) != 0 ? null : wallPostActivityDto, (32768 & i2) != 0 ? null : f, (65536 & i2) != 0 ? null : newsfeedPushSubscriptionDto, (131072 & i2) != 0 ? null : bool4, (262144 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 524288) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final NewsfeedItemDebugInfoDto d() {
            return this.debugInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final NewsfeedItemWallpostFeedbackDto e() {
            return this.feedback;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemFriendsRecommendBlockDto)) {
                return false;
            }
            NewsfeedItemFriendsRecommendBlockDto newsfeedItemFriendsRecommendBlockDto = (NewsfeedItemFriendsRecommendBlockDto) obj;
            return epx.f(this.title, newsfeedItemFriendsRecommendBlockDto.title) && epx.f(this.profiles, newsfeedItemFriendsRecommendBlockDto.profiles) && this.date == newsfeedItemFriendsRecommendBlockDto.date && epx.f(this.sourceId, newsfeedItemFriendsRecommendBlockDto.sourceId) && epx.f(this.nextFrom, newsfeedItemFriendsRecommendBlockDto.nextFrom) && epx.f(this.infoCard, newsfeedItemFriendsRecommendBlockDto.infoCard) && epx.f(this.accountImportBlockPos, newsfeedItemFriendsRecommendBlockDto.accountImportBlockPos) && epx.f(this.footer, newsfeedItemFriendsRecommendBlockDto.footer) && epx.f(this.trackCode, newsfeedItemFriendsRecommendBlockDto.trackCode) && epx.f(this.type, newsfeedItemFriendsRecommendBlockDto.type) && epx.f(this.isAsync, newsfeedItemFriendsRecommendBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedItemFriendsRecommendBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemFriendsRecommendBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemFriendsRecommendBlockDto.keepOffline) && epx.f(this.activity, newsfeedItemFriendsRecommendBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemFriendsRecommendBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemFriendsRecommendBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemFriendsRecommendBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemFriendsRecommendBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemFriendsRecommendBlockDto.debugInfo);
        }

        public final FriendsRecBlockFooterDto f() {
            return this.footer;
        }

        public final FriendsRecBlockInfoCardDto g() {
            return this.infoCard;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getType() {
            return this.type;
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, fw3.a(this.title.hashCode() * 31, 31, this.profiles), 31);
            UserId userId = this.sourceId;
            int hashCode = (a2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
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
            Boolean bool2 = this.canIgnore;
            int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode10 = (hashCode9 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode12 = (hashCode11 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode13 = (hashCode12 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode14 = (hashCode13 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode16 = (hashCode15 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode16 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final Boolean i() {
            return this.keepOffline;
        }

        public final String j() {
            return this.nextFrom;
        }

        public final List<FriendsRecProfileDto> k() {
            return this.profiles;
        }

        public final Boolean l() {
            return this.isAsync;
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemFriendsRecommendBlockDto(title=");
            sb.append(this.title);
            sb.append(", profiles=");
            sb.append(this.profiles);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", nextFrom=");
            sb.append(this.nextFrom);
            sb.append(", infoCard=");
            sb.append(this.infoCard);
            sb.append(", accountImportBlockPos=");
            sb.append(this.accountImportBlockPos);
            sb.append(", footer=");
            sb.append(this.footer);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            Iterator a2 = ao.a(parcel, this.profiles);
            while (a2.hasNext()) {
                ((FriendsRecProfileDto) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeInt(this.date);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeString(this.nextFrom);
            FriendsRecBlockInfoCardDto friendsRecBlockInfoCardDto = this.infoCard;
            if (friendsRecBlockInfoCardDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                friendsRecBlockInfoCardDto.writeToParcel(parcel, i);
            }
            Integer num = this.accountImportBlockPos;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            FriendsRecBlockFooterDto friendsRecBlockFooterDto = this.footer;
            if (friendsRecBlockFooterDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                friendsRecBlockFooterDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.trackCode);
            parcel.writeString(this.type);
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemFriendsRecommendBlockDto(String str, List<FriendsRecProfileDto> list, int i, UserId userId, String str2, FriendsRecBlockInfoCardDto friendsRecBlockInfoCardDto, Integer num, FriendsRecBlockFooterDto friendsRecBlockFooterDto, String str3, String str4, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
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
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemFriendsRecommendationsGroupsBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemFriendsRecommendationsGroupsBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("button")
        private final BaseLinkButtonDto button;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("count")
        private final int count;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final boolean isAsync;

        @pmi0("items")
        private final List<GroupsSuggestionDto> items;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("next_from")
        private final String nextFrom;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemFriendsRecommendationsGroupsBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemFriendsRecommendationsGroupsBlockDto createFromParcel(Parcel parcel) {
                Class cls;
                boolean z;
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(GroupsSuggestionDto.CREATOR, parcel, arrayList, i, 1);
                }
                int readInt2 = parcel.readInt();
                BaseLinkButtonDto baseLinkButtonDto = (BaseLinkButtonDto) parcel.readParcelable(NewsfeedItemFriendsRecommendationsGroupsBlockDto.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    cls = NewsfeedItemFriendsRecommendationsGroupsBlockDto.class;
                    z = true;
                } else {
                    cls = NewsfeedItemFriendsRecommendationsGroupsBlockDto.class;
                    z = false;
                }
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(cls.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(cls.getClassLoader());
                Class cls2 = cls;
                int readInt3 = parcel.readInt();
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(cls2.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                boolean z2 = false;
                Boolean bool = valueOf;
                String readString3 = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(cls2.getClassLoader());
                Float valueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(cls2.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    }
                    valueOf3 = Boolean.valueOf(z2);
                }
                return new NewsfeedItemFriendsRecommendationsGroupsBlockDto(readString, arrayList, readInt2, baseLinkButtonDto, z, newsfeedNewsfeedItemTypeDto, userId, readInt3, readString2, bool, newsfeedNewsfeedItemCaptionDto, valueOf2, readString3, wallPostActivityDto, valueOf4, newsfeedPushSubscriptionDto, valueOf3, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(cls2.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(cls2.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemFriendsRecommendationsGroupsBlockDto[] newArray(int i) {
                return new NewsfeedItemFriendsRecommendationsGroupsBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemFriendsRecommendationsGroupsBlockDto(String str, List list, int i, BaseLinkButtonDto baseLinkButtonDto, boolean z, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i2, String str2, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i3, zcl zclVar) {
            this(str, list, i, baseLinkButtonDto, z, newsfeedNewsfeedItemTypeDto, userId, i2, (i3 & 256) != 0 ? null : str2, (i3 & 512) != 0 ? null : bool, (i3 & 1024) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i3 & 2048) != 0 ? null : bool2, (i3 & 4096) != 0 ? null : str3, (i3 & 8192) != 0 ? null : wallPostActivityDto, (i3 & 16384) != 0 ? null : f, (32768 & i3) != 0 ? null : newsfeedPushSubscriptionDto, (65536 & i3) != 0 ? null : bool3, (131072 & i3) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final NewsfeedNewsfeedItemTypeDto d() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemFriendsRecommendationsGroupsBlockDto)) {
                return false;
            }
            NewsfeedItemFriendsRecommendationsGroupsBlockDto newsfeedItemFriendsRecommendationsGroupsBlockDto = (NewsfeedItemFriendsRecommendationsGroupsBlockDto) obj;
            return epx.f(this.title, newsfeedItemFriendsRecommendationsGroupsBlockDto.title) && epx.f(this.items, newsfeedItemFriendsRecommendationsGroupsBlockDto.items) && this.count == newsfeedItemFriendsRecommendationsGroupsBlockDto.count && epx.f(this.button, newsfeedItemFriendsRecommendationsGroupsBlockDto.button) && this.isAsync == newsfeedItemFriendsRecommendationsGroupsBlockDto.isAsync && this.type == newsfeedItemFriendsRecommendationsGroupsBlockDto.type && epx.f(this.sourceId, newsfeedItemFriendsRecommendationsGroupsBlockDto.sourceId) && this.date == newsfeedItemFriendsRecommendationsGroupsBlockDto.date && epx.f(this.nextFrom, newsfeedItemFriendsRecommendationsGroupsBlockDto.nextFrom) && epx.f(this.canIgnore, newsfeedItemFriendsRecommendationsGroupsBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemFriendsRecommendationsGroupsBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemFriendsRecommendationsGroupsBlockDto.keepOffline) && epx.f(this.trackCode, newsfeedItemFriendsRecommendationsGroupsBlockDto.trackCode) && epx.f(this.activity, newsfeedItemFriendsRecommendationsGroupsBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemFriendsRecommendationsGroupsBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemFriendsRecommendationsGroupsBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemFriendsRecommendationsGroupsBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemFriendsRecommendationsGroupsBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemFriendsRecommendationsGroupsBlockDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a((this.type.hashCode() + qoy.b((this.button.hashCode() + shy.a(this.count, fw3.a(this.title.hashCode() * 31, 31, this.items), 31)) * 31, 31, this.isAsync)) * 31, 31, this.sourceId.b), 31);
            String str = this.nextFrom;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.canIgnore;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode3 = (hashCode2 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool2 = this.keepOffline;
            int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str2 = this.trackCode;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode6 = (hashCode5 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode8 = (hashCode7 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool3 = this.suggestSubscribe;
            int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode10 = (hashCode9 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode10 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemFriendsRecommendationsGroupsBlockDto(title=");
            sb.append(this.title);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", count=");
            sb.append(this.count);
            sb.append(", button=");
            sb.append(this.button);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", nextFrom=");
            sb.append(this.nextFrom);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((GroupsSuggestionDto) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeInt(this.count);
            parcel.writeParcelable(this.button, i);
            parcel.writeInt(this.isAsync ? 1 : 0);
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            parcel.writeString(this.nextFrom);
            Boolean bool = this.canIgnore;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool2 = this.keepOffline;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool3 = this.suggestSubscribe;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemFriendsRecommendationsGroupsBlockDto(String str, List<GroupsSuggestionDto> list, int i, BaseLinkButtonDto baseLinkButtonDto, boolean z, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i2, String str2, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
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
            this.canIgnore = bool;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool2;
            this.trackCode = str3;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool3;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemMarketCarouselBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemMarketCarouselBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("block_panel")
        private final MarketCarouselBlockPanelDto blockPanel;

        @pmi0("block_title")
        private final String blockTitle;

        @pmi0("bundle")
        private final String bundle;

        @pmi0("can_be_filtered")
        private final Boolean canBeFiltered;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("goods_carousel_view_type")
        private final String goodsCarouselViewType;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("items")
        private final List<MarketCarouselItemDto> items;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("more_button")
        private final BaseLinkButtonDto moreButton;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("use_oneline_product_title")
        private final Boolean useOnelineProductTitle;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("market_carousel")
            public static final TypeDto MARKET_CAROUSEL;
            private final String value;

            /* compiled from: NewsfeedNewsfeedItemDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("MARKET_CAROUSEL", 0, "market_carousel");
                MARKET_CAROUSEL = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String i() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemMarketCarouselBlockDto> {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemMarketCarouselBlockDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                ArrayList arrayList;
                Boolean valueOf2;
                Boolean bool;
                Boolean valueOf3;
                Boolean valueOf4;
                Boolean valueOf5;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemMarketCarouselBlockDto.class.getClassLoader());
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString2 = parcel.readString();
                MarketCarouselBlockPanelDto createFromParcel2 = parcel.readInt() == 0 ? null : MarketCarouselBlockPanelDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList = new ArrayList(readInt2);
                    int i = 0;
                    while (i != readInt2) {
                        i = en.a(MarketCarouselItemDto.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                BaseLinkButtonDto baseLinkButtonDto = (BaseLinkButtonDto) parcel.readParcelable(NewsfeedItemMarketCarouselBlockDto.class.getClassLoader());
                String readString3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                    bool = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    bool = null;
                }
                String readString4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf3 = bool;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf4 = bool;
                } else {
                    valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemMarketCarouselBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf5 = bool;
                } else {
                    valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
                }
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemMarketCarouselBlockDto.class.getClassLoader());
                Object valueOf6 = parcel.readInt() == 0 ? bool : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemMarketCarouselBlockDto.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemMarketCarouselBlockDto(createFromParcel, userId, readInt, readString, valueOf, readString2, createFromParcel2, arrayList, baseLinkButtonDto, readString3, valueOf2, readString4, valueOf3, valueOf4, newsfeedNewsfeedItemCaptionDto, valueOf5, wallPostActivityDto, valueOf6, newsfeedPushSubscriptionDto, bool, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemMarketCarouselBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemMarketCarouselBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemMarketCarouselBlockDto[] newArray(int i) {
                return new NewsfeedItemMarketCarouselBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemMarketCarouselBlockDto(TypeDto typeDto, UserId userId, int i, String str, Boolean bool, String str2, MarketCarouselBlockPanelDto marketCarouselBlockPanelDto, List list, BaseLinkButtonDto baseLinkButtonDto, String str3, Boolean bool2, String str4, Boolean bool3, Boolean bool4, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool5, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool6, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(typeDto, userId, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : marketCarouselBlockPanelDto, (i2 & 128) != 0 ? null : list, (i2 & 256) != 0 ? null : baseLinkButtonDto, (i2 & 512) != 0 ? null : str3, (i2 & 1024) != 0 ? null : bool2, (i2 & 2048) != 0 ? null : str4, (i2 & 4096) != 0 ? null : bool3, (i2 & 8192) != 0 ? null : bool4, (i2 & 16384) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (32768 & i2) != 0 ? null : bool5, (65536 & i2) != 0 ? null : wallPostActivityDto, (131072 & i2) != 0 ? null : f, (262144 & i2) != 0 ? null : newsfeedPushSubscriptionDto, (524288 & i2) != 0 ? null : bool6, (1048576 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 2097152) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final TypeDto d() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemMarketCarouselBlockDto)) {
                return false;
            }
            NewsfeedItemMarketCarouselBlockDto newsfeedItemMarketCarouselBlockDto = (NewsfeedItemMarketCarouselBlockDto) obj;
            return this.type == newsfeedItemMarketCarouselBlockDto.type && epx.f(this.sourceId, newsfeedItemMarketCarouselBlockDto.sourceId) && this.date == newsfeedItemMarketCarouselBlockDto.date && epx.f(this.bundle, newsfeedItemMarketCarouselBlockDto.bundle) && epx.f(this.canBeFiltered, newsfeedItemMarketCarouselBlockDto.canBeFiltered) && epx.f(this.blockTitle, newsfeedItemMarketCarouselBlockDto.blockTitle) && epx.f(this.blockPanel, newsfeedItemMarketCarouselBlockDto.blockPanel) && epx.f(this.items, newsfeedItemMarketCarouselBlockDto.items) && epx.f(this.moreButton, newsfeedItemMarketCarouselBlockDto.moreButton) && epx.f(this.trackCode, newsfeedItemMarketCarouselBlockDto.trackCode) && epx.f(this.useOnelineProductTitle, newsfeedItemMarketCarouselBlockDto.useOnelineProductTitle) && epx.f(this.goodsCarouselViewType, newsfeedItemMarketCarouselBlockDto.goodsCarouselViewType) && epx.f(this.isAsync, newsfeedItemMarketCarouselBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedItemMarketCarouselBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemMarketCarouselBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemMarketCarouselBlockDto.keepOffline) && epx.f(this.activity, newsfeedItemMarketCarouselBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemMarketCarouselBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemMarketCarouselBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemMarketCarouselBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemMarketCarouselBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemMarketCarouselBlockDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            String str = this.bundle;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.canBeFiltered;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.blockTitle;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            MarketCarouselBlockPanelDto marketCarouselBlockPanelDto = this.blockPanel;
            int hashCode4 = (hashCode3 + (marketCarouselBlockPanelDto == null ? 0 : marketCarouselBlockPanelDto.hashCode())) * 31;
            List<MarketCarouselItemDto> list = this.items;
            int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            BaseLinkButtonDto baseLinkButtonDto = this.moreButton;
            int hashCode6 = (hashCode5 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
            String str3 = this.trackCode;
            int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool2 = this.useOnelineProductTitle;
            int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str4 = this.goodsCarouselViewType;
            int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool3 = this.isAsync;
            int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.canIgnore;
            int hashCode11 = (hashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode12 = (hashCode11 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool5 = this.keepOffline;
            int hashCode13 = (hashCode12 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode14 = (hashCode13 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode15 = (hashCode14 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode16 = (hashCode15 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool6 = this.suggestSubscribe;
            int hashCode17 = (hashCode16 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode18 = (hashCode17 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode18 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemMarketCarouselBlockDto(type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", bundle=");
            sb.append(this.bundle);
            sb.append(", canBeFiltered=");
            sb.append(this.canBeFiltered);
            sb.append(", blockTitle=");
            sb.append(this.blockTitle);
            sb.append(", blockPanel=");
            sb.append(this.blockPanel);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", moreButton=");
            sb.append(this.moreButton);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", useOnelineProductTitle=");
            sb.append(this.useOnelineProductTitle);
            sb.append(", goodsCarouselViewType=");
            sb.append(this.goodsCarouselViewType);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            parcel.writeString(this.bundle);
            Boolean bool = this.canBeFiltered;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            parcel.writeString(this.blockTitle);
            MarketCarouselBlockPanelDto marketCarouselBlockPanelDto = this.blockPanel;
            if (marketCarouselBlockPanelDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                marketCarouselBlockPanelDto.writeToParcel(parcel, i);
            }
            List<MarketCarouselItemDto> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((MarketCarouselItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeParcelable(this.moreButton, i);
            parcel.writeString(this.trackCode);
            Boolean bool2 = this.useOnelineProductTitle;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeString(this.goodsCarouselViewType);
            Boolean bool3 = this.isAsync;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            Boolean bool4 = this.canIgnore;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool5 = this.keepOffline;
            if (bool5 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool5);
            }
            parcel.writeParcelable(this.activity, i);
            Float f2 = this.shortTextRate;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f2);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool6 = this.suggestSubscribe;
            if (bool6 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool6);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemMarketCarouselBlockDto(TypeDto typeDto, UserId userId, int i, String str, Boolean bool, String str2, MarketCarouselBlockPanelDto marketCarouselBlockPanelDto, List<MarketCarouselItemDto> list, BaseLinkButtonDto baseLinkButtonDto, String str3, Boolean bool2, String str4, Boolean bool3, Boolean bool4, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool5, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool6, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.type = typeDto;
            this.sourceId = userId;
            this.date = i;
            this.bundle = str;
            this.canBeFiltered = bool;
            this.blockTitle = str2;
            this.blockPanel = marketCarouselBlockPanelDto;
            this.items = list;
            this.moreButton = baseLinkButtonDto;
            this.trackCode = str3;
            this.useOnelineProductTitle = bool2;
            this.goodsCarouselViewType = str4;
            this.isAsync = bool3;
            this.canIgnore = bool4;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool5;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool6;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemMarketItemDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemMarketItemDto> CREATOR = new a();

        @pmi0("access_key")
        private final String accessKey;

        @pmi0("action_buttons")
        private final List<BaseLinkButtonDto> actionButtons;

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("ad_id")
        private final Integer adId;

        @pmi0("addresses")
        private final MarketItemAddressesDto addresses;

        @pmi0("ads_label")
        private final String adsLabel;

        @pmi0("albums_ids")
        private final List<Integer> albumsIds;

        @pmi0("availability")
        private final MarketMarketItemAvailabilityDto availability;

        @pmi0("available_variant_item_id")
        private final Integer availableVariantItemId;

        @pmi0("badges")
        private final List<MarketBadgeDto> badges;

        @pmi0("banner")
        private final MarketItemBannerDto banner;

        @pmi0("button_title")
        private final String buttonTitle;

        @pmi0("buttons")
        private final List<MarketCustomButtonFullDto> buttons;

        @pmi0("can_comment")
        private final BaseBoolIntDto canComment;

        @pmi0("can_delete")
        private final Boolean canDelete;

        @pmi0("can_delete_image")
        private final Boolean canDeleteImage;

        @pmi0("can_delete_with_reason")
        private final Boolean canDeleteWithReason;

        @pmi0("can_edit")
        private final Boolean canEdit;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("can_recover")
        private final Boolean canRecover;

        @pmi0("can_repost")
        private final BaseBoolIntDto canRepost;

        @pmi0("can_show_convert_to_service")
        private final Boolean canShowConvertToService;

        @pmi0("cancel_info")
        private final BaseLinkDto cancelInfo;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("cart_quantity")
        private final Integer cartQuantity;

        @pmi0("category")
        private final MarketMarketCategoryDto category;

        @pmi0("category_v2")
        private final MarketMarketCategoryDto categoryV2;

        @pmi0("characteristics")
        private final List<MarketItemCharacteristicDto> characteristics;

        @pmi0("csrf_hashes")
        private final String csrfHashes;

        @pmi0("custom_buttons")
        private final List<MarketCustomButtonFullDto> customButtons;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("delivery_info")
        private final MarketDeliveryInfoDto deliveryInfo;

        @pmi0("delivery_methods_info")
        private final MarketDeliveryMethodsInfoDto deliveryMethodsInfo;

        @pmi0("description")
        private final String description;

        @pmi0("description_url")
        private final String descriptionUrl;

        @pmi0("dimensions")
        private final MarketItemDimensionsDto dimensions;

        @pmi0("external_id")
        private final String externalId;

        @pmi0("external_url")
        private final String externalUrl;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("group")
        private final GroupsGroupFullDto group;

        @pmi0("has_group_access")
        private final Boolean hasGroupAccess;

        @pmi0("id")
        private final int id;

        @pmi0("integration_info")
        private final MarketMarketItemIntegrationInfoDto integrationInfo;

        @pmi0("is_adult")
        private final Boolean isAdult;

        @pmi0("is_aliexpress_checkout")
        private final Boolean isAliexpressCheckout;

        @pmi0("is_aliexpress_product")
        private final Boolean isAliexpressProduct;

        @pmi0("is_favorite")
        private final Boolean isFavorite;

        @pmi0("is_hardblocked")
        private final Boolean isHardblocked;

        @pmi0("is_main_variant")
        private final Boolean isMainVariant;

        @pmi0("is_owner")
        private final Boolean isOwner;

        @pmi0("is_price_list_service")
        private final Boolean isPriceListService;

        @pmi0("item_rating")
        private final MarketMarketItemRatingDto itemRating;

        @pmi0("item_type")
        private final MarketMarketItemTypeDto itemType;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("labels")
        private final List<MarketItemLabelDto> labels;

        @pmi0("likes")
        private final BaseLikesDto likes;

        @pmi0("market_url")
        private final String marketUrl;

        @pmi0("open_market_link")
        private final String openMarketLink;

        @pmi0("orders_count")
        private final Integer ordersCount;

        @pmi0("other_items")
        private final List<MarketMarketItemOtherItemsDto> otherItems;

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

        @pmi0("properties")
        private final List<MarketPropertyDto> properties;

        @pmi0("property_values")
        private final List<MarketItemPropertyValueDto> propertyValues;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0(CampaignEx.JSON_KEY_STAR)
        private final Float rating;

        @pmi0("reaction_set_id")
        private final String reactionSetId;

        @pmi0("reactions")
        private final LikesItemReactionsDto reactions;

        @pmi0("reject_info")
        private final MarketItemRejectInfoDto rejectInfo;

        @pmi0("reposts")
        private final BaseRepostsInfoDto reposts;

        @pmi0("seo_description")
        private final String seoDescription;

        @pmi0("seo_slug")
        private final String seoSlug;

        @pmi0("seo_title")
        private final String seoTitle;

        @pmi0("service_duration")
        private final MarketServicesDurationDto serviceDuration;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("show_comments")
        private final BaseBoolIntDto showComments;

        @pmi0("show_reviews")
        private final BaseBoolIntDto showReviews;

        @pmi0("similar_items")
        private final List<MarketSimilarItemsDto> similarItems;

        @pmi0("sku")
        private final String sku;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("stock_amount")
        private final Integer stockAmount;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("thumb")
        private final List<BaseImageDto> thumb;

        @pmi0("thumb_photo")
        private final String thumbPhoto;

        @pmi0("thumbs")
        private final List<List<BaseImageDto>> thumbs;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        @pmi0("url")
        private final String url;

        @pmi0("user_agreement_info")
        private final String userAgreementInfo;

        @pmi0("variants")
        private final List<MarketItemPropertyVariantsDto> variants;

        @pmi0("variants_grid")
        private final List<MarketVariantsGridPropertyDto> variantsGrid;

        @pmi0("variants_grouping_id")
        private final Integer variantsGroupingId;

        @pmi0("videos")
        private final List<MarketItemVideoDto> videos;

        @pmi0("views_count")
        private final Integer viewsCount;

        @pmi0("vk_pay_discount")
        private final Integer vkPayDiscount;

        @pmi0("weight")
        private final Integer weight;

        @pmi0("wishlist_item_id")
        private final Integer wishlistItemId;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemMarketItemDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemMarketItemDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto;
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto;
                ArrayList arrayList;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto;
                MarketItemBannerDto marketItemBannerDto;
                ArrayList arrayList2;
                ArrayList arrayList3;
                MarketItemDimensionsDto marketItemDimensionsDto;
                ArrayList arrayList4;
                ArrayList arrayList5;
                ArrayList arrayList6;
                ArrayList arrayList7;
                BaseRepostsInfoDto baseRepostsInfoDto;
                BaseBoolIntDto baseBoolIntDto;
                ArrayList arrayList8;
                ArrayList arrayList9;
                ArrayList arrayList10;
                ArrayList arrayList11;
                MarketItemAddressesDto marketItemAddressesDto;
                ArrayList arrayList12;
                ArrayList arrayList13;
                BaseLinkDto baseLinkDto;
                MarketItemOwnerInfoDto createFromParcel;
                Boolean valueOf4;
                Boolean valueOf5;
                Boolean valueOf6;
                Boolean valueOf7;
                Boolean valueOf8;
                Boolean valueOf9;
                MarketItemOwnerInfoDto marketItemOwnerInfoDto;
                MarketItemPromotionInfoDto createFromParcel2;
                MarketItemPromotionInfoDto marketItemPromotionInfoDto;
                ArrayList arrayList14;
                ArrayList arrayList15;
                Float f;
                ArrayList arrayList16;
                ArrayList arrayList17;
                ArrayList arrayList18;
                MarketItemAddressesDto marketItemAddressesDto2;
                ArrayList arrayList19;
                GroupsGroupFullDto groupsGroupFullDto;
                Boolean valueOf10;
                Boolean valueOf11;
                Boolean valueOf12;
                Boolean valueOf13;
                Boolean valueOf14;
                MarketServicesDurationDto marketServicesDurationDto;
                Boolean bool;
                ArrayList arrayList20;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto2;
                Boolean valueOf15;
                Integer num;
                ArrayList arrayList21;
                ArrayList arrayList22;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto3;
                Boolean valueOf16;
                Boolean bool2;
                ArrayList arrayList23;
                ArrayList arrayList24;
                Integer num2;
                Boolean valueOf17;
                MarketMarketItemRatingDto marketMarketItemRatingDto;
                ArrayList arrayList25;
                ArrayList arrayList26;
                Integer num3;
                ArrayList arrayList27;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto4 = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                int readInt = parcel.readInt();
                MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto = (MarketMarketItemAvailabilityDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                MarketMarketCategoryDto marketMarketCategoryDto = (MarketMarketCategoryDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                String readString = parcel.readString();
                int readInt2 = parcel.readInt();
                UserId userId2 = (UserId) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                MarketPriceDto marketPriceDto = (MarketPriceDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto2 = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString3 = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                Float valueOf18 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Boolean bool3 = valueOf;
                NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto2 = (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    newsfeedItemDebugInfoDto = newsfeedItemDebugInfoDto2;
                    newsfeedNewsfeedItemCaptionDto = newsfeedNewsfeedItemCaptionDto2;
                    newsfeedNewsfeedItemTypeDto = newsfeedNewsfeedItemTypeDto4;
                    arrayList = null;
                } else {
                    newsfeedItemDebugInfoDto = newsfeedItemDebugInfoDto2;
                    int readInt3 = parcel.readInt();
                    newsfeedNewsfeedItemCaptionDto = newsfeedNewsfeedItemCaptionDto2;
                    arrayList = new ArrayList(readInt3);
                    newsfeedNewsfeedItemTypeDto = newsfeedNewsfeedItemTypeDto4;
                    int i = 0;
                    while (i != readInt3) {
                        i = en.a(MarketMarketItemOtherItemsDto.CREATOR, parcel, arrayList, i, 1);
                        readInt3 = readInt3;
                        userId = userId;
                    }
                }
                UserId userId3 = userId;
                MarketItemBannerDto createFromParcel3 = parcel.readInt() == 0 ? null : MarketItemBannerDto.CREATOR.createFromParcel(parcel);
                MarketItemDimensionsDto createFromParcel4 = parcel.readInt() == 0 ? null : MarketItemDimensionsDto.CREATOR.createFromParcel(parcel);
                Integer valueOf19 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    marketItemBannerDto = createFromParcel3;
                    arrayList2 = arrayList;
                    marketItemDimensionsDto = createFromParcel4;
                    arrayList3 = null;
                } else {
                    marketItemBannerDto = createFromParcel3;
                    int readInt4 = parcel.readInt();
                    arrayList2 = arrayList;
                    arrayList3 = new ArrayList(readInt4);
                    marketItemDimensionsDto = createFromParcel4;
                    int i2 = 0;
                    while (i2 != readInt4) {
                        i2 = pm0.b(parcel, arrayList3, i2, 1);
                        readInt4 = readInt4;
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList5 = arrayList3;
                    arrayList4 = null;
                } else {
                    int readInt5 = parcel.readInt();
                    arrayList4 = new ArrayList(readInt5);
                    arrayList5 = arrayList3;
                    int i3 = 0;
                    while (i3 != readInt5) {
                        i3 = bo.b(NewsfeedItemMarketItemDto.class, parcel, arrayList4, i3, 1);
                        readInt5 = readInt5;
                    }
                }
                if (parcel.readInt() == 0) {
                    arrayList7 = arrayList4;
                    arrayList6 = null;
                } else {
                    int readInt6 = parcel.readInt();
                    arrayList6 = new ArrayList(readInt6);
                    arrayList7 = arrayList4;
                    int i4 = 0;
                    while (i4 != readInt6) {
                        i4 = en.a(MarketItemVideoDto.CREATOR, parcel, arrayList6, i4, 1);
                        readInt6 = readInt6;
                        valueOf19 = valueOf19;
                    }
                }
                Integer num4 = valueOf19;
                BaseBoolIntDto baseBoolIntDto2 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto4 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                BaseLikesDto baseLikesDto = (BaseLikesDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                Boolean bool4 = valueOf2;
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto3 = newsfeedNewsfeedItemCaptionDto;
                MarketItemDimensionsDto marketItemDimensionsDto2 = marketItemDimensionsDto;
                String readString4 = parcel.readString();
                LikesItemReactionsDto likesItemReactionsDto = (LikesItemReactionsDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                BaseRepostsInfoDto baseRepostsInfoDto2 = (BaseRepostsInfoDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                Integer valueOf20 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    baseRepostsInfoDto = baseRepostsInfoDto2;
                    baseBoolIntDto = baseBoolIntDto3;
                    arrayList9 = arrayList6;
                    arrayList8 = null;
                } else {
                    baseRepostsInfoDto = baseRepostsInfoDto2;
                    int readInt7 = parcel.readInt();
                    baseBoolIntDto = baseBoolIntDto3;
                    arrayList8 = new ArrayList(readInt7);
                    arrayList9 = arrayList6;
                    int i5 = 0;
                    while (i5 != readInt7) {
                        i5 = en.a(MarketPropertyDto.CREATOR, parcel, arrayList8, i5, 1);
                        readInt7 = readInt7;
                        baseBoolIntDto4 = baseBoolIntDto4;
                    }
                }
                BaseBoolIntDto baseBoolIntDto6 = baseBoolIntDto4;
                if (parcel.readInt() == 0) {
                    arrayList10 = null;
                } else {
                    int readInt8 = parcel.readInt();
                    arrayList10 = new ArrayList(readInt8);
                    int i6 = 0;
                    while (i6 != readInt8) {
                        i6 = en.a(MarketItemPropertyVariantsDto.CREATOR, parcel, arrayList10, i6, 1);
                        readInt8 = readInt8;
                        arrayList8 = arrayList8;
                    }
                }
                ArrayList arrayList28 = arrayList8;
                MarketItemAddressesDto createFromParcel5 = parcel.readInt() == 0 ? null : MarketItemAddressesDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    marketItemAddressesDto = createFromParcel5;
                    arrayList11 = null;
                } else {
                    int readInt9 = parcel.readInt();
                    arrayList11 = new ArrayList(readInt9);
                    marketItemAddressesDto = createFromParcel5;
                    int i7 = 0;
                    while (i7 != readInt9) {
                        i7 = en.a(MarketVariantsGridPropertyDto.CREATOR, parcel, arrayList11, i7, 1);
                        readInt9 = readInt9;
                        arrayList10 = arrayList10;
                    }
                }
                ArrayList arrayList29 = arrayList10;
                if (parcel.readInt() == 0) {
                    arrayList13 = arrayList11;
                    arrayList12 = null;
                } else {
                    int readInt10 = parcel.readInt();
                    arrayList12 = new ArrayList(readInt10);
                    arrayList13 = arrayList11;
                    int i8 = 0;
                    while (i8 != readInt10) {
                        i8 = bo.b(NewsfeedItemMarketItemDto.class, parcel, arrayList12, i8, 1);
                    }
                }
                Integer valueOf21 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Float valueOf22 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                Integer valueOf23 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer num5 = valueOf21;
                BaseLinkDto baseLinkDto2 = (BaseLinkDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                Boolean bool5 = valueOf3;
                ArrayList arrayList30 = arrayList2;
                ArrayList arrayList31 = arrayList9;
                ArrayList arrayList32 = arrayList13;
                Integer num6 = valueOf23;
                UserId userId4 = userId3;
                ArrayList arrayList33 = arrayList7;
                String readString5 = parcel.readString();
                Integer valueOf24 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    baseLinkDto = baseLinkDto2;
                    createFromParcel = null;
                } else {
                    baseLinkDto = baseLinkDto2;
                    createFromParcel = MarketItemOwnerInfoDto.CREATOR.createFromParcel(parcel);
                }
                MarketItemOwnerInfoDto marketItemOwnerInfoDto2 = createFromParcel;
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf8 = null;
                } else {
                    valueOf8 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf9 = null;
                } else {
                    valueOf9 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    marketItemOwnerInfoDto = marketItemOwnerInfoDto2;
                    createFromParcel2 = null;
                } else {
                    marketItemOwnerInfoDto = marketItemOwnerInfoDto2;
                    createFromParcel2 = MarketItemPromotionInfoDto.CREATOR.createFromParcel(parcel);
                }
                MarketItemPromotionInfoDto marketItemPromotionInfoDto2 = createFromParcel2;
                Integer valueOf25 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    marketItemPromotionInfoDto = marketItemPromotionInfoDto2;
                    arrayList14 = arrayList12;
                    f = valueOf22;
                    arrayList15 = null;
                } else {
                    marketItemPromotionInfoDto = marketItemPromotionInfoDto2;
                    int readInt11 = parcel.readInt();
                    arrayList14 = arrayList12;
                    arrayList15 = new ArrayList(readInt11);
                    f = valueOf22;
                    int i9 = 0;
                    while (i9 != readInt11) {
                        i9 = en.a(MarketSimilarItemsDto.CREATOR, parcel, arrayList15, i9, 1);
                        readInt11 = readInt11;
                        userId4 = userId4;
                    }
                }
                UserId userId5 = userId4;
                if (parcel.readInt() == 0) {
                    arrayList17 = arrayList15;
                    arrayList16 = null;
                } else {
                    int readInt12 = parcel.readInt();
                    arrayList16 = new ArrayList(readInt12);
                    arrayList17 = arrayList15;
                    int i10 = 0;
                    while (i10 != readInt12) {
                        i10 = bo.b(NewsfeedItemMarketItemDto.class, parcel, arrayList16, i10, 1);
                    }
                }
                MarketItemAddressesDto marketItemAddressesDto3 = marketItemAddressesDto;
                ArrayList arrayList34 = arrayList14;
                String readString6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    marketItemAddressesDto2 = marketItemAddressesDto3;
                    arrayList18 = null;
                } else {
                    int readInt13 = parcel.readInt();
                    arrayList18 = new ArrayList(readInt13);
                    marketItemAddressesDto2 = marketItemAddressesDto3;
                    int i11 = 0;
                    while (i11 != readInt13) {
                        i11 = en.a(MarketItemLabelDto.CREATOR, parcel, arrayList18, i11, 1);
                        readInt13 = readInt13;
                        arrayList16 = arrayList16;
                    }
                }
                ArrayList arrayList35 = arrayList16;
                GroupsGroupFullDto groupsGroupFullDto2 = (GroupsGroupFullDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    groupsGroupFullDto = groupsGroupFullDto2;
                    arrayList19 = null;
                } else {
                    int readInt14 = parcel.readInt();
                    arrayList19 = new ArrayList(readInt14);
                    groupsGroupFullDto = groupsGroupFullDto2;
                    int i12 = 0;
                    while (i12 != readInt14) {
                        i12 = en.a(MarketItemCharacteristicDto.CREATOR, parcel, arrayList19, i12, 1);
                        readInt14 = readInt14;
                        arrayList18 = arrayList18;
                    }
                }
                ArrayList arrayList36 = arrayList18;
                MarketDeliveryMethodsInfoDto createFromParcel6 = parcel.readInt() == 0 ? null : MarketDeliveryMethodsInfoDto.CREATOR.createFromParcel(parcel);
                Integer num7 = valueOf24;
                MarketItemOwnerInfoDto marketItemOwnerInfoDto3 = marketItemOwnerInfoDto;
                Integer num8 = valueOf25;
                ArrayList arrayList37 = arrayList17;
                GroupsGroupFullDto groupsGroupFullDto3 = groupsGroupFullDto;
                String readString7 = parcel.readString();
                UserId userId6 = userId5;
                ArrayList arrayList38 = arrayList19;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto5 = newsfeedNewsfeedItemTypeDto;
                BaseRepostsInfoDto baseRepostsInfoDto3 = baseRepostsInfoDto;
                BaseLinkDto baseLinkDto3 = baseLinkDto;
                Boolean bool6 = valueOf4;
                Boolean bool7 = valueOf5;
                Boolean bool8 = valueOf6;
                Boolean bool9 = valueOf7;
                Boolean bool10 = valueOf8;
                Boolean bool11 = valueOf9;
                MarketItemPromotionInfoDto marketItemPromotionInfoDto3 = marketItemPromotionInfoDto;
                String readString8 = parcel.readString();
                MarketMarketCategoryDto marketMarketCategoryDto2 = (MarketMarketCategoryDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                Integer num9 = valueOf20;
                Float f2 = f;
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                MarketMarketItemTypeDto marketMarketItemTypeDto = (MarketMarketItemTypeDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                MarketMarketItemIntegrationInfoDto marketMarketItemIntegrationInfoDto = (MarketMarketItemIntegrationInfoDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf10 = null;
                } else {
                    valueOf10 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf11 = null;
                } else {
                    valueOf11 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf12 = null;
                } else {
                    valueOf12 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf13 = null;
                } else {
                    valueOf13 = Boolean.valueOf(parcel.readInt() != 0);
                }
                MarketServicesDurationDto marketServicesDurationDto2 = (MarketServicesDurationDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                Float f3 = valueOf18;
                NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto3 = newsfeedItemDebugInfoDto;
                MarketItemBannerDto marketItemBannerDto2 = marketItemBannerDto;
                ArrayList arrayList39 = arrayList5;
                BaseBoolIntDto baseBoolIntDto7 = baseBoolIntDto;
                MarketItemAddressesDto marketItemAddressesDto4 = marketItemAddressesDto2;
                String readString11 = parcel.readString();
                Boolean bool12 = null;
                String readString12 = parcel.readString();
                Integer valueOf26 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf14 = null;
                } else {
                    valueOf14 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer valueOf27 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    marketServicesDurationDto = marketServicesDurationDto2;
                    bool = bool5;
                    newsfeedNewsfeedItemTypeDto2 = newsfeedNewsfeedItemTypeDto5;
                    arrayList20 = null;
                } else {
                    marketServicesDurationDto = marketServicesDurationDto2;
                    int readInt15 = parcel.readInt();
                    bool = bool5;
                    arrayList20 = new ArrayList(readInt15);
                    newsfeedNewsfeedItemTypeDto2 = newsfeedNewsfeedItemTypeDto5;
                    int i13 = 0;
                    while (i13 != readInt15) {
                        i13 = bo.b(NewsfeedItemMarketItemDto.class, parcel, arrayList20, i13, 1);
                        readInt15 = readInt15;
                    }
                }
                Integer valueOf28 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                MarketDeliveryInfoDto marketDeliveryInfoDto = (MarketDeliveryInfoDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                Boolean bool13 = bool;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto6 = newsfeedNewsfeedItemTypeDto2;
                String readString13 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf15 = null;
                } else {
                    valueOf15 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString14 = parcel.readString();
                if (parcel.readInt() == 0) {
                    num = valueOf28;
                    arrayList21 = arrayList20;
                    newsfeedNewsfeedItemTypeDto3 = newsfeedNewsfeedItemTypeDto6;
                    arrayList22 = null;
                } else {
                    num = valueOf28;
                    int readInt16 = parcel.readInt();
                    arrayList21 = arrayList20;
                    arrayList22 = new ArrayList(readInt16);
                    newsfeedNewsfeedItemTypeDto3 = newsfeedNewsfeedItemTypeDto6;
                    int i14 = 0;
                    while (i14 != readInt16) {
                        i14 = bo.b(NewsfeedItemMarketItemDto.class, parcel, arrayList22, i14, 1);
                        readInt16 = readInt16;
                    }
                }
                if (parcel.readInt() == 0) {
                    valueOf16 = null;
                } else {
                    valueOf16 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer valueOf29 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    bool2 = valueOf16;
                    arrayList23 = arrayList22;
                    num2 = valueOf29;
                    arrayList24 = null;
                } else {
                    bool2 = valueOf16;
                    int readInt17 = parcel.readInt();
                    arrayList23 = arrayList22;
                    arrayList24 = new ArrayList(readInt17);
                    num2 = valueOf29;
                    int i15 = 0;
                    while (i15 != readInt17) {
                        i15 = bo.b(NewsfeedItemMarketItemDto.class, parcel, arrayList24, i15, 1);
                        readInt17 = readInt17;
                    }
                }
                MarketItemRejectInfoDto marketItemRejectInfoDto = (MarketItemRejectInfoDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                Integer valueOf30 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                UserId userId7 = (UserId) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                Boolean bool14 = valueOf10;
                Boolean bool15 = valueOf11;
                Boolean bool16 = valueOf12;
                Boolean bool17 = valueOf13;
                MarketServicesDurationDto marketServicesDurationDto3 = marketServicesDurationDto;
                Integer num10 = num;
                Boolean bool18 = bool2;
                String readString15 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf17 = null;
                } else {
                    valueOf17 = Boolean.valueOf(parcel.readInt() != 0);
                }
                MarketMarketItemRatingDto marketMarketItemRatingDto2 = (MarketMarketItemRatingDto) parcel.readParcelable(NewsfeedItemMarketItemDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    marketMarketItemRatingDto = marketMarketItemRatingDto2;
                    arrayList25 = arrayList24;
                    num3 = valueOf30;
                    arrayList26 = null;
                } else {
                    marketMarketItemRatingDto = marketMarketItemRatingDto2;
                    int readInt18 = parcel.readInt();
                    arrayList25 = arrayList24;
                    arrayList26 = new ArrayList(readInt18);
                    num3 = valueOf30;
                    int i16 = 0;
                    while (i16 != readInt18) {
                        int i17 = readInt18;
                        int readInt19 = parcel.readInt();
                        int i18 = i16;
                        ArrayList arrayList40 = new ArrayList(readInt19);
                        UserId userId8 = userId6;
                        int i19 = 0;
                        while (i19 != readInt19) {
                            i19 = bo.b(NewsfeedItemMarketItemDto.class, parcel, arrayList40, i19, 1);
                            readInt19 = readInt19;
                        }
                        arrayList26.add(arrayList40);
                        i16 = i18 + 1;
                        readInt18 = i17;
                        userId6 = userId8;
                    }
                }
                UserId userId9 = userId6;
                if (parcel.readInt() == 0) {
                    arrayList27 = null;
                } else {
                    int readInt20 = parcel.readInt();
                    arrayList27 = new ArrayList(readInt20);
                    int i20 = 0;
                    while (i20 != readInt20) {
                        i20 = bo.b(NewsfeedItemMarketItemDto.class, parcel, arrayList27, i20, 1);
                        readInt20 = readInt20;
                    }
                }
                if (parcel.readInt() != 0) {
                    bool12 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemMarketItemDto(newsfeedNewsfeedItemTypeDto3, userId9, readInt, marketMarketItemAvailabilityDto, marketMarketCategoryDto, readString, readInt2, userId2, marketPriceDto, readString2, bool3, newsfeedNewsfeedItemCaptionDto3, bool4, readString3, wallPostActivityDto, f3, newsfeedPushSubscriptionDto, bool13, newsfeedItemWallpostFeedbackDto, newsfeedItemDebugInfoDto3, arrayList30, marketItemBannerDto2, marketItemDimensionsDto2, num4, arrayList39, arrayList33, arrayList31, baseBoolIntDto2, baseBoolIntDto7, baseBoolIntDto6, baseBoolIntDto5, baseLikesDto, readString4, likesItemReactionsDto, baseRepostsInfoDto3, num9, arrayList28, arrayList29, marketItemAddressesDto4, arrayList32, arrayList34, num5, f2, num6, baseLinkDto3, readString5, num7, marketItemOwnerInfoDto3, bool6, bool7, bool8, bool9, bool10, bool11, marketItemPromotionInfoDto3, num8, arrayList37, arrayList35, readString6, arrayList36, groupsGroupFullDto3, arrayList38, createFromParcel6, readString7, readString8, marketMarketCategoryDto2, readString9, readString10, marketMarketItemTypeDto, marketMarketItemIntegrationInfoDto, bool14, bool15, bool16, bool17, marketServicesDurationDto3, readString11, readString12, valueOf26, valueOf14, valueOf27, arrayList21, num10, marketDeliveryInfoDto, readString13, valueOf15, readString14, arrayList23, bool18, num2, arrayList25, marketItemRejectInfoDto, num3, userId7, readString15, valueOf17, marketMarketItemRatingDto, arrayList26, arrayList27, bool12, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemMarketItemDto[] newArray(int i) {
                return new NewsfeedItemMarketItemDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemMarketItemDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto, MarketMarketCategoryDto marketMarketCategoryDto, String str, int i2, UserId userId2, MarketPriceDto marketPriceDto, String str2, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, List list, MarketItemBannerDto marketItemBannerDto, MarketItemDimensionsDto marketItemDimensionsDto, Integer num, List list2, List list3, List list4, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, BaseLikesDto baseLikesDto, String str4, LikesItemReactionsDto likesItemReactionsDto, BaseRepostsInfoDto baseRepostsInfoDto, Integer num2, List list5, List list6, MarketItemAddressesDto marketItemAddressesDto, List list7, List list8, Integer num3, Float f2, Integer num4, BaseLinkDto baseLinkDto, String str5, Integer num5, MarketItemOwnerInfoDto marketItemOwnerInfoDto, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, MarketItemPromotionInfoDto marketItemPromotionInfoDto, Integer num6, List list9, List list10, String str6, List list11, GroupsGroupFullDto groupsGroupFullDto, List list12, MarketDeliveryMethodsInfoDto marketDeliveryMethodsInfoDto, String str7, String str8, MarketMarketCategoryDto marketMarketCategoryDto2, String str9, String str10, MarketMarketItemTypeDto marketMarketItemTypeDto, MarketMarketItemIntegrationInfoDto marketMarketItemIntegrationInfoDto, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, MarketServicesDurationDto marketServicesDurationDto, String str11, String str12, Integer num7, Boolean bool14, Integer num8, List list13, Integer num9, MarketDeliveryInfoDto marketDeliveryInfoDto, String str13, Boolean bool15, String str14, List list14, Boolean bool16, Integer num10, List list15, MarketItemRejectInfoDto marketItemRejectInfoDto, Integer num11, UserId userId3, String str15, Boolean bool17, MarketMarketItemRatingDto marketMarketItemRatingDto, List list16, List list17, Boolean bool18, String str16, String str17, String str18, String str19, String str20, int i3, int i4, int i5, int i6, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, marketMarketItemAvailabilityDto, marketMarketCategoryDto, str, i2, userId2, marketPriceDto, str2, (i3 & 1024) != 0 ? null : bool, (i3 & 2048) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i3 & 4096) != 0 ? null : bool2, (i3 & 8192) != 0 ? null : str3, (i3 & 16384) != 0 ? null : wallPostActivityDto, (i3 & 32768) != 0 ? null : f, (i3 & 65536) != 0 ? null : newsfeedPushSubscriptionDto, (i3 & 131072) != 0 ? null : bool3, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i3 & 524288) != 0 ? null : newsfeedItemDebugInfoDto, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list, (i3 & 2097152) != 0 ? null : marketItemBannerDto, (i3 & 4194304) != 0 ? null : marketItemDimensionsDto, (i3 & 8388608) != 0 ? null : num, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : list2, (i3 & 33554432) != 0 ? null : list3, (i3 & 67108864) != 0 ? null : list4, (i3 & 134217728) != 0 ? null : baseBoolIntDto, (i3 & 268435456) != 0 ? null : baseBoolIntDto2, (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : baseBoolIntDto3, (i3 & 1073741824) != 0 ? null : baseBoolIntDto4, (i3 & Integer.MIN_VALUE) != 0 ? null : baseLikesDto, (i4 & 1) != 0 ? null : str4, (i4 & 2) != 0 ? null : likesItemReactionsDto, (i4 & 4) != 0 ? null : baseRepostsInfoDto, (i4 & 8) != 0 ? null : num2, (i4 & 16) != 0 ? null : list5, (i4 & 32) != 0 ? null : list6, (i4 & 64) != 0 ? null : marketItemAddressesDto, (i4 & 128) != 0 ? null : list7, (i4 & 256) != 0 ? null : list8, (i4 & 512) != 0 ? null : num3, (i4 & 1024) != 0 ? null : f2, (i4 & 2048) != 0 ? null : num4, (i4 & 4096) != 0 ? null : baseLinkDto, (i4 & 8192) != 0 ? null : str5, (i4 & 16384) != 0 ? null : num5, (i4 & 32768) != 0 ? null : marketItemOwnerInfoDto, (i4 & 65536) != 0 ? null : bool4, (i4 & 131072) != 0 ? null : bool5, (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool6, (i4 & 524288) != 0 ? null : bool7, (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool8, (i4 & 2097152) != 0 ? null : bool9, (i4 & 4194304) != 0 ? null : marketItemPromotionInfoDto, (i4 & 8388608) != 0 ? null : num6, (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : list9, (i4 & 33554432) != 0 ? null : list10, (i4 & 67108864) != 0 ? null : str6, (i4 & 134217728) != 0 ? null : list11, (i4 & 268435456) != 0 ? null : groupsGroupFullDto, (i4 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : list12, (i4 & 1073741824) != 0 ? null : marketDeliveryMethodsInfoDto, (i4 & Integer.MIN_VALUE) != 0 ? null : str7, (i5 & 1) != 0 ? null : str8, (i5 & 2) != 0 ? null : marketMarketCategoryDto2, (i5 & 4) != 0 ? null : str9, (i5 & 8) != 0 ? null : str10, (i5 & 16) != 0 ? null : marketMarketItemTypeDto, (i5 & 32) != 0 ? null : marketMarketItemIntegrationInfoDto, (i5 & 64) != 0 ? null : bool10, (i5 & 128) != 0 ? null : bool11, (i5 & 256) != 0 ? null : bool12, (i5 & 512) != 0 ? null : bool13, (i5 & 1024) != 0 ? null : marketServicesDurationDto, (i5 & 2048) != 0 ? null : str11, (i5 & 4096) != 0 ? null : str12, (i5 & 8192) != 0 ? null : num7, (i5 & 16384) != 0 ? null : bool14, (i5 & 32768) != 0 ? null : num8, (i5 & 65536) != 0 ? null : list13, (i5 & 131072) != 0 ? null : num9, (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : marketDeliveryInfoDto, (i5 & 524288) != 0 ? null : str13, (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool15, (i5 & 2097152) != 0 ? null : str14, (i5 & 4194304) != 0 ? null : list14, (i5 & 8388608) != 0 ? null : bool16, (i5 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num10, (i5 & 33554432) != 0 ? null : list15, (i5 & 67108864) != 0 ? null : marketItemRejectInfoDto, (i5 & 134217728) != 0 ? null : num11, (i5 & 268435456) != 0 ? null : userId3, (i5 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str15, (i5 & 1073741824) != 0 ? null : bool17, (Integer.MIN_VALUE & i5) != 0 ? null : marketMarketItemRatingDto, (i6 & 1) != 0 ? null : list16, (i6 & 2) != 0 ? null : list17, (i6 & 4) != 0 ? null : bool18, (i6 & 8) != 0 ? null : str16, (i6 & 16) != 0 ? null : str17, (i6 & 32) != 0 ? null : str18, (i6 & 64) != 0 ? null : str19, (i6 & 128) != 0 ? null : str20);
        }

        public final NewsfeedNewsfeedItemTypeDto d() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemMarketItemDto)) {
                return false;
            }
            NewsfeedItemMarketItemDto newsfeedItemMarketItemDto = (NewsfeedItemMarketItemDto) obj;
            return this.type == newsfeedItemMarketItemDto.type && epx.f(this.sourceId, newsfeedItemMarketItemDto.sourceId) && this.date == newsfeedItemMarketItemDto.date && this.availability == newsfeedItemMarketItemDto.availability && epx.f(this.category, newsfeedItemMarketItemDto.category) && epx.f(this.description, newsfeedItemMarketItemDto.description) && this.id == newsfeedItemMarketItemDto.id && epx.f(this.ownerId, newsfeedItemMarketItemDto.ownerId) && epx.f(this.price, newsfeedItemMarketItemDto.price) && epx.f(this.title, newsfeedItemMarketItemDto.title) && epx.f(this.canIgnore, newsfeedItemMarketItemDto.canIgnore) && epx.f(this.caption, newsfeedItemMarketItemDto.caption) && epx.f(this.keepOffline, newsfeedItemMarketItemDto.keepOffline) && epx.f(this.trackCode, newsfeedItemMarketItemDto.trackCode) && epx.f(this.activity, newsfeedItemMarketItemDto.activity) && epx.f(this.shortTextRate, newsfeedItemMarketItemDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemMarketItemDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemMarketItemDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemMarketItemDto.feedback) && epx.f(this.debugInfo, newsfeedItemMarketItemDto.debugInfo) && epx.f(this.otherItems, newsfeedItemMarketItemDto.otherItems) && epx.f(this.banner, newsfeedItemMarketItemDto.banner) && epx.f(this.dimensions, newsfeedItemMarketItemDto.dimensions) && epx.f(this.weight, newsfeedItemMarketItemDto.weight) && epx.f(this.albumsIds, newsfeedItemMarketItemDto.albumsIds) && epx.f(this.photos, newsfeedItemMarketItemDto.photos) && epx.f(this.videos, newsfeedItemMarketItemDto.videos) && this.canComment == newsfeedItemMarketItemDto.canComment && this.showComments == newsfeedItemMarketItemDto.showComments && this.showReviews == newsfeedItemMarketItemDto.showReviews && this.canRepost == newsfeedItemMarketItemDto.canRepost && epx.f(this.likes, newsfeedItemMarketItemDto.likes) && epx.f(this.reactionSetId, newsfeedItemMarketItemDto.reactionSetId) && epx.f(this.reactions, newsfeedItemMarketItemDto.reactions) && epx.f(this.reposts, newsfeedItemMarketItemDto.reposts) && epx.f(this.viewsCount, newsfeedItemMarketItemDto.viewsCount) && epx.f(this.properties, newsfeedItemMarketItemDto.properties) && epx.f(this.variants, newsfeedItemMarketItemDto.variants) && epx.f(this.addresses, newsfeedItemMarketItemDto.addresses) && epx.f(this.variantsGrid, newsfeedItemMarketItemDto.variantsGrid) && epx.f(this.actionButtons, newsfeedItemMarketItemDto.actionButtons) && epx.f(this.wishlistItemId, newsfeedItemMarketItemDto.wishlistItemId) && epx.f(this.rating, newsfeedItemMarketItemDto.rating) && epx.f(this.ordersCount, newsfeedItemMarketItemDto.ordersCount) && epx.f(this.cancelInfo, newsfeedItemMarketItemDto.cancelInfo) && epx.f(this.userAgreementInfo, newsfeedItemMarketItemDto.userAgreementInfo) && epx.f(this.adId, newsfeedItemMarketItemDto.adId) && epx.f(this.ownerInfo, newsfeedItemMarketItemDto.ownerInfo) && epx.f(this.canEdit, newsfeedItemMarketItemDto.canEdit) && epx.f(this.canDelete, newsfeedItemMarketItemDto.canDelete) && epx.f(this.canDeleteImage, newsfeedItemMarketItemDto.canDeleteImage) && epx.f(this.canDeleteWithReason, newsfeedItemMarketItemDto.canDeleteWithReason) && epx.f(this.canRecover, newsfeedItemMarketItemDto.canRecover) && epx.f(this.canShowConvertToService, newsfeedItemMarketItemDto.canShowConvertToService) && epx.f(this.promotion, newsfeedItemMarketItemDto.promotion) && epx.f(this.vkPayDiscount, newsfeedItemMarketItemDto.vkPayDiscount) && epx.f(this.similarItems, newsfeedItemMarketItemDto.similarItems) && epx.f(this.customButtons, newsfeedItemMarketItemDto.customButtons) && epx.f(this.adsLabel, newsfeedItemMarketItemDto.adsLabel) && epx.f(this.labels, newsfeedItemMarketItemDto.labels) && epx.f(this.group, newsfeedItemMarketItemDto.group) && epx.f(this.characteristics, newsfeedItemMarketItemDto.characteristics) && epx.f(this.deliveryMethodsInfo, newsfeedItemMarketItemDto.deliveryMethodsInfo) && epx.f(this.accessKey, newsfeedItemMarketItemDto.accessKey) && epx.f(this.buttonTitle, newsfeedItemMarketItemDto.buttonTitle) && epx.f(this.categoryV2, newsfeedItemMarketItemDto.categoryV2) && epx.f(this.descriptionUrl, newsfeedItemMarketItemDto.descriptionUrl) && epx.f(this.externalId, newsfeedItemMarketItemDto.externalId) && this.itemType == newsfeedItemMarketItemDto.itemType && epx.f(this.integrationInfo, newsfeedItemMarketItemDto.integrationInfo) && epx.f(this.isFavorite, newsfeedItemMarketItemDto.isFavorite) && epx.f(this.isPriceListService, newsfeedItemMarketItemDto.isPriceListService) && epx.f(this.isOwner, newsfeedItemMarketItemDto.isOwner) && epx.f(this.isAdult, newsfeedItemMarketItemDto.isAdult) && epx.f(this.serviceDuration, newsfeedItemMarketItemDto.serviceDuration) && epx.f(this.thumbPhoto, newsfeedItemMarketItemDto.thumbPhoto) && epx.f(this.url, newsfeedItemMarketItemDto.url) && epx.f(this.variantsGroupingId, newsfeedItemMarketItemDto.variantsGroupingId) && epx.f(this.isMainVariant, newsfeedItemMarketItemDto.isMainVariant) && epx.f(this.availableVariantItemId, newsfeedItemMarketItemDto.availableVariantItemId) && epx.f(this.propertyValues, newsfeedItemMarketItemDto.propertyValues) && epx.f(this.cartQuantity, newsfeedItemMarketItemDto.cartQuantity) && epx.f(this.deliveryInfo, newsfeedItemMarketItemDto.deliveryInfo) && epx.f(this.sku, newsfeedItemMarketItemDto.sku) && epx.f(this.isAliexpressProduct, newsfeedItemMarketItemDto.isAliexpressProduct) && epx.f(this.csrfHashes, newsfeedItemMarketItemDto.csrfHashes) && epx.f(this.thumb, newsfeedItemMarketItemDto.thumb) && epx.f(this.isAliexpressCheckout, newsfeedItemMarketItemDto.isAliexpressCheckout) && epx.f(this.stockAmount, newsfeedItemMarketItemDto.stockAmount) && epx.f(this.badges, newsfeedItemMarketItemDto.badges) && epx.f(this.rejectInfo, newsfeedItemMarketItemDto.rejectInfo) && epx.f(this.postId, newsfeedItemMarketItemDto.postId) && epx.f(this.postOwnerId, newsfeedItemMarketItemDto.postOwnerId) && epx.f(this.openMarketLink, newsfeedItemMarketItemDto.openMarketLink) && epx.f(this.isHardblocked, newsfeedItemMarketItemDto.isHardblocked) && epx.f(this.itemRating, newsfeedItemMarketItemDto.itemRating) && epx.f(this.thumbs, newsfeedItemMarketItemDto.thumbs) && epx.f(this.buttons, newsfeedItemMarketItemDto.buttons) && epx.f(this.hasGroupAccess, newsfeedItemMarketItemDto.hasGroupAccess) && epx.f(this.seoSlug, newsfeedItemMarketItemDto.seoSlug) && epx.f(this.seoTitle, newsfeedItemMarketItemDto.seoTitle) && epx.f(this.seoDescription, newsfeedItemMarketItemDto.seoDescription) && epx.f(this.externalUrl, newsfeedItemMarketItemDto.externalUrl) && epx.f(this.marketUrl, newsfeedItemMarketItemDto.marketUrl);
        }

        public final int hashCode() {
            int a2 = urd0.a((this.price.hashCode() + bh10.a(shy.a(this.id, urd0.a((this.category.hashCode() + ((this.availability.hashCode() + shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31)) * 31)) * 31, 31, this.description), 31), 31, this.ownerId.b)) * 31, 31, this.title);
            Boolean bool = this.canIgnore;
            int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode2 = (hashCode + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool2 = this.keepOffline;
            int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode5 = (hashCode4 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode7 = (hashCode6 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool3 = this.suggestSubscribe;
            int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode9 = (hashCode8 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            int hashCode10 = (hashCode9 + (newsfeedItemDebugInfoDto == null ? 0 : newsfeedItemDebugInfoDto.hashCode())) * 31;
            List<MarketMarketItemOtherItemsDto> list = this.otherItems;
            int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
            MarketItemBannerDto marketItemBannerDto = this.banner;
            int hashCode12 = (hashCode11 + (marketItemBannerDto == null ? 0 : marketItemBannerDto.hashCode())) * 31;
            MarketItemDimensionsDto marketItemDimensionsDto = this.dimensions;
            int hashCode13 = (hashCode12 + (marketItemDimensionsDto == null ? 0 : marketItemDimensionsDto.hashCode())) * 31;
            Integer num = this.weight;
            int hashCode14 = (hashCode13 + (num == null ? 0 : num.hashCode())) * 31;
            List<Integer> list2 = this.albumsIds;
            int hashCode15 = (hashCode14 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<PhotosPhotoDto> list3 = this.photos;
            int hashCode16 = (hashCode15 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List<MarketItemVideoDto> list4 = this.videos;
            int hashCode17 = (hashCode16 + (list4 == null ? 0 : list4.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto = this.canComment;
            int hashCode18 = (hashCode17 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto2 = this.showComments;
            int hashCode19 = (hashCode18 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto3 = this.showReviews;
            int hashCode20 = (hashCode19 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto4 = this.canRepost;
            int hashCode21 = (hashCode20 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
            BaseLikesDto baseLikesDto = this.likes;
            int hashCode22 = (hashCode21 + (baseLikesDto == null ? 0 : baseLikesDto.hashCode())) * 31;
            String str2 = this.reactionSetId;
            int hashCode23 = (hashCode22 + (str2 == null ? 0 : str2.hashCode())) * 31;
            LikesItemReactionsDto likesItemReactionsDto = this.reactions;
            int hashCode24 = (hashCode23 + (likesItemReactionsDto == null ? 0 : likesItemReactionsDto.hashCode())) * 31;
            BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
            int hashCode25 = (hashCode24 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
            Integer num2 = this.viewsCount;
            int hashCode26 = (hashCode25 + (num2 == null ? 0 : num2.hashCode())) * 31;
            List<MarketPropertyDto> list5 = this.properties;
            int hashCode27 = (hashCode26 + (list5 == null ? 0 : list5.hashCode())) * 31;
            List<MarketItemPropertyVariantsDto> list6 = this.variants;
            int hashCode28 = (hashCode27 + (list6 == null ? 0 : list6.hashCode())) * 31;
            MarketItemAddressesDto marketItemAddressesDto = this.addresses;
            int hashCode29 = (hashCode28 + (marketItemAddressesDto == null ? 0 : marketItemAddressesDto.hashCode())) * 31;
            List<MarketVariantsGridPropertyDto> list7 = this.variantsGrid;
            int hashCode30 = (hashCode29 + (list7 == null ? 0 : list7.hashCode())) * 31;
            List<BaseLinkButtonDto> list8 = this.actionButtons;
            int hashCode31 = (hashCode30 + (list8 == null ? 0 : list8.hashCode())) * 31;
            Integer num3 = this.wishlistItemId;
            int hashCode32 = (hashCode31 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Float f2 = this.rating;
            int hashCode33 = (hashCode32 + (f2 == null ? 0 : f2.hashCode())) * 31;
            Integer num4 = this.ordersCount;
            int hashCode34 = (hashCode33 + (num4 == null ? 0 : num4.hashCode())) * 31;
            BaseLinkDto baseLinkDto = this.cancelInfo;
            int hashCode35 = (hashCode34 + (baseLinkDto == null ? 0 : baseLinkDto.hashCode())) * 31;
            String str3 = this.userAgreementInfo;
            int hashCode36 = (hashCode35 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num5 = this.adId;
            int hashCode37 = (hashCode36 + (num5 == null ? 0 : num5.hashCode())) * 31;
            MarketItemOwnerInfoDto marketItemOwnerInfoDto = this.ownerInfo;
            int hashCode38 = (hashCode37 + (marketItemOwnerInfoDto == null ? 0 : marketItemOwnerInfoDto.hashCode())) * 31;
            Boolean bool4 = this.canEdit;
            int hashCode39 = (hashCode38 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.canDelete;
            int hashCode40 = (hashCode39 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Boolean bool6 = this.canDeleteImage;
            int hashCode41 = (hashCode40 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Boolean bool7 = this.canDeleteWithReason;
            int hashCode42 = (hashCode41 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            Boolean bool8 = this.canRecover;
            int hashCode43 = (hashCode42 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            Boolean bool9 = this.canShowConvertToService;
            int hashCode44 = (hashCode43 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
            MarketItemPromotionInfoDto marketItemPromotionInfoDto = this.promotion;
            int hashCode45 = (hashCode44 + (marketItemPromotionInfoDto == null ? 0 : marketItemPromotionInfoDto.hashCode())) * 31;
            Integer num6 = this.vkPayDiscount;
            int hashCode46 = (hashCode45 + (num6 == null ? 0 : num6.hashCode())) * 31;
            List<MarketSimilarItemsDto> list9 = this.similarItems;
            int hashCode47 = (hashCode46 + (list9 == null ? 0 : list9.hashCode())) * 31;
            List<MarketCustomButtonFullDto> list10 = this.customButtons;
            int hashCode48 = (hashCode47 + (list10 == null ? 0 : list10.hashCode())) * 31;
            String str4 = this.adsLabel;
            int hashCode49 = (hashCode48 + (str4 == null ? 0 : str4.hashCode())) * 31;
            List<MarketItemLabelDto> list11 = this.labels;
            int hashCode50 = (hashCode49 + (list11 == null ? 0 : list11.hashCode())) * 31;
            GroupsGroupFullDto groupsGroupFullDto = this.group;
            int hashCode51 = (hashCode50 + (groupsGroupFullDto == null ? 0 : groupsGroupFullDto.hashCode())) * 31;
            List<MarketItemCharacteristicDto> list12 = this.characteristics;
            int hashCode52 = (hashCode51 + (list12 == null ? 0 : list12.hashCode())) * 31;
            MarketDeliveryMethodsInfoDto marketDeliveryMethodsInfoDto = this.deliveryMethodsInfo;
            int hashCode53 = (hashCode52 + (marketDeliveryMethodsInfoDto == null ? 0 : marketDeliveryMethodsInfoDto.hashCode())) * 31;
            String str5 = this.accessKey;
            int hashCode54 = (hashCode53 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.buttonTitle;
            int hashCode55 = (hashCode54 + (str6 == null ? 0 : str6.hashCode())) * 31;
            MarketMarketCategoryDto marketMarketCategoryDto = this.categoryV2;
            int hashCode56 = (hashCode55 + (marketMarketCategoryDto == null ? 0 : marketMarketCategoryDto.hashCode())) * 31;
            String str7 = this.descriptionUrl;
            int hashCode57 = (hashCode56 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.externalId;
            int hashCode58 = (hashCode57 + (str8 == null ? 0 : str8.hashCode())) * 31;
            MarketMarketItemTypeDto marketMarketItemTypeDto = this.itemType;
            int hashCode59 = (hashCode58 + (marketMarketItemTypeDto == null ? 0 : marketMarketItemTypeDto.hashCode())) * 31;
            MarketMarketItemIntegrationInfoDto marketMarketItemIntegrationInfoDto = this.integrationInfo;
            int hashCode60 = (hashCode59 + (marketMarketItemIntegrationInfoDto == null ? 0 : marketMarketItemIntegrationInfoDto.hashCode())) * 31;
            Boolean bool10 = this.isFavorite;
            int hashCode61 = (hashCode60 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
            Boolean bool11 = this.isPriceListService;
            int hashCode62 = (hashCode61 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
            Boolean bool12 = this.isOwner;
            int hashCode63 = (hashCode62 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
            Boolean bool13 = this.isAdult;
            int hashCode64 = (hashCode63 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
            MarketServicesDurationDto marketServicesDurationDto = this.serviceDuration;
            int hashCode65 = (hashCode64 + (marketServicesDurationDto == null ? 0 : marketServicesDurationDto.hashCode())) * 31;
            String str9 = this.thumbPhoto;
            int hashCode66 = (hashCode65 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.url;
            int hashCode67 = (hashCode66 + (str10 == null ? 0 : str10.hashCode())) * 31;
            Integer num7 = this.variantsGroupingId;
            int hashCode68 = (hashCode67 + (num7 == null ? 0 : num7.hashCode())) * 31;
            Boolean bool14 = this.isMainVariant;
            int hashCode69 = (hashCode68 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
            Integer num8 = this.availableVariantItemId;
            int hashCode70 = (hashCode69 + (num8 == null ? 0 : num8.hashCode())) * 31;
            List<MarketItemPropertyValueDto> list13 = this.propertyValues;
            int hashCode71 = (hashCode70 + (list13 == null ? 0 : list13.hashCode())) * 31;
            Integer num9 = this.cartQuantity;
            int hashCode72 = (hashCode71 + (num9 == null ? 0 : num9.hashCode())) * 31;
            MarketDeliveryInfoDto marketDeliveryInfoDto = this.deliveryInfo;
            int hashCode73 = (hashCode72 + (marketDeliveryInfoDto == null ? 0 : marketDeliveryInfoDto.hashCode())) * 31;
            String str11 = this.sku;
            int hashCode74 = (hashCode73 + (str11 == null ? 0 : str11.hashCode())) * 31;
            Boolean bool15 = this.isAliexpressProduct;
            int hashCode75 = (hashCode74 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
            String str12 = this.csrfHashes;
            int hashCode76 = (hashCode75 + (str12 == null ? 0 : str12.hashCode())) * 31;
            List<BaseImageDto> list14 = this.thumb;
            int hashCode77 = (hashCode76 + (list14 == null ? 0 : list14.hashCode())) * 31;
            Boolean bool16 = this.isAliexpressCheckout;
            int hashCode78 = (hashCode77 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
            Integer num10 = this.stockAmount;
            int hashCode79 = (hashCode78 + (num10 == null ? 0 : num10.hashCode())) * 31;
            List<MarketBadgeDto> list15 = this.badges;
            int hashCode80 = (hashCode79 + (list15 == null ? 0 : list15.hashCode())) * 31;
            MarketItemRejectInfoDto marketItemRejectInfoDto = this.rejectInfo;
            int hashCode81 = (hashCode80 + (marketItemRejectInfoDto == null ? 0 : marketItemRejectInfoDto.hashCode())) * 31;
            Integer num11 = this.postId;
            int hashCode82 = (hashCode81 + (num11 == null ? 0 : num11.hashCode())) * 31;
            UserId userId = this.postOwnerId;
            int hashCode83 = (hashCode82 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            String str13 = this.openMarketLink;
            int hashCode84 = (hashCode83 + (str13 == null ? 0 : str13.hashCode())) * 31;
            Boolean bool17 = this.isHardblocked;
            int hashCode85 = (hashCode84 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
            MarketMarketItemRatingDto marketMarketItemRatingDto = this.itemRating;
            int hashCode86 = (hashCode85 + (marketMarketItemRatingDto == null ? 0 : marketMarketItemRatingDto.hashCode())) * 31;
            List<List<BaseImageDto>> list16 = this.thumbs;
            int hashCode87 = (hashCode86 + (list16 == null ? 0 : list16.hashCode())) * 31;
            List<MarketCustomButtonFullDto> list17 = this.buttons;
            int hashCode88 = (hashCode87 + (list17 == null ? 0 : list17.hashCode())) * 31;
            Boolean bool18 = this.hasGroupAccess;
            int hashCode89 = (hashCode88 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
            String str14 = this.seoSlug;
            int hashCode90 = (hashCode89 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.seoTitle;
            int hashCode91 = (hashCode90 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.seoDescription;
            int hashCode92 = (hashCode91 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.externalUrl;
            int hashCode93 = (hashCode92 + (str17 == null ? 0 : str17.hashCode())) * 31;
            String str18 = this.marketUrl;
            return hashCode93 + (str18 != null ? str18.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemMarketItemDto(type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", availability=");
            sb.append(this.availability);
            sb.append(", category=");
            sb.append(this.category);
            sb.append(", description=");
            sb.append(this.description);
            sb.append(", id=");
            sb.append(this.id);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", price=");
            sb.append(this.price);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            sb.append(this.debugInfo);
            sb.append(", otherItems=");
            sb.append(this.otherItems);
            sb.append(", banner=");
            sb.append(this.banner);
            sb.append(", dimensions=");
            sb.append(this.dimensions);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", albumsIds=");
            sb.append(this.albumsIds);
            sb.append(", photos=");
            sb.append(this.photos);
            sb.append(", videos=");
            sb.append(this.videos);
            sb.append(", canComment=");
            sb.append(this.canComment);
            sb.append(", showComments=");
            sb.append(this.showComments);
            sb.append(", showReviews=");
            sb.append(this.showReviews);
            sb.append(", canRepost=");
            sb.append(this.canRepost);
            sb.append(", likes=");
            sb.append(this.likes);
            sb.append(", reactionSetId=");
            sb.append(this.reactionSetId);
            sb.append(", reactions=");
            sb.append(this.reactions);
            sb.append(", reposts=");
            sb.append(this.reposts);
            sb.append(", viewsCount=");
            sb.append(this.viewsCount);
            sb.append(", properties=");
            sb.append(this.properties);
            sb.append(", variants=");
            sb.append(this.variants);
            sb.append(", addresses=");
            sb.append(this.addresses);
            sb.append(", variantsGrid=");
            sb.append(this.variantsGrid);
            sb.append(", actionButtons=");
            sb.append(this.actionButtons);
            sb.append(", wishlistItemId=");
            sb.append(this.wishlistItemId);
            sb.append(", rating=");
            sb.append(this.rating);
            sb.append(", ordersCount=");
            sb.append(this.ordersCount);
            sb.append(", cancelInfo=");
            sb.append(this.cancelInfo);
            sb.append(", userAgreementInfo=");
            sb.append(this.userAgreementInfo);
            sb.append(", adId=");
            sb.append(this.adId);
            sb.append(", ownerInfo=");
            sb.append(this.ownerInfo);
            sb.append(", canEdit=");
            sb.append(this.canEdit);
            sb.append(", canDelete=");
            sb.append(this.canDelete);
            sb.append(", canDeleteImage=");
            sb.append(this.canDeleteImage);
            sb.append(", canDeleteWithReason=");
            sb.append(this.canDeleteWithReason);
            sb.append(", canRecover=");
            sb.append(this.canRecover);
            sb.append(", canShowConvertToService=");
            sb.append(this.canShowConvertToService);
            sb.append(", promotion=");
            sb.append(this.promotion);
            sb.append(", vkPayDiscount=");
            sb.append(this.vkPayDiscount);
            sb.append(", similarItems=");
            sb.append(this.similarItems);
            sb.append(", customButtons=");
            sb.append(this.customButtons);
            sb.append(", adsLabel=");
            sb.append(this.adsLabel);
            sb.append(", labels=");
            sb.append(this.labels);
            sb.append(", group=");
            sb.append(this.group);
            sb.append(", characteristics=");
            sb.append(this.characteristics);
            sb.append(", deliveryMethodsInfo=");
            sb.append(this.deliveryMethodsInfo);
            sb.append(", accessKey=");
            sb.append(this.accessKey);
            sb.append(", buttonTitle=");
            sb.append(this.buttonTitle);
            sb.append(", categoryV2=");
            sb.append(this.categoryV2);
            sb.append(", descriptionUrl=");
            sb.append(this.descriptionUrl);
            sb.append(", externalId=");
            sb.append(this.externalId);
            sb.append(", itemType=");
            sb.append(this.itemType);
            sb.append(", integrationInfo=");
            sb.append(this.integrationInfo);
            sb.append(", isFavorite=");
            sb.append(this.isFavorite);
            sb.append(", isPriceListService=");
            sb.append(this.isPriceListService);
            sb.append(", isOwner=");
            sb.append(this.isOwner);
            sb.append(", isAdult=");
            sb.append(this.isAdult);
            sb.append(", serviceDuration=");
            sb.append(this.serviceDuration);
            sb.append(", thumbPhoto=");
            sb.append(this.thumbPhoto);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", variantsGroupingId=");
            sb.append(this.variantsGroupingId);
            sb.append(", isMainVariant=");
            sb.append(this.isMainVariant);
            sb.append(", availableVariantItemId=");
            sb.append(this.availableVariantItemId);
            sb.append(", propertyValues=");
            sb.append(this.propertyValues);
            sb.append(", cartQuantity=");
            sb.append(this.cartQuantity);
            sb.append(", deliveryInfo=");
            sb.append(this.deliveryInfo);
            sb.append(", sku=");
            sb.append(this.sku);
            sb.append(", isAliexpressProduct=");
            sb.append(this.isAliexpressProduct);
            sb.append(", csrfHashes=");
            sb.append(this.csrfHashes);
            sb.append(", thumb=");
            sb.append(this.thumb);
            sb.append(", isAliexpressCheckout=");
            sb.append(this.isAliexpressCheckout);
            sb.append(", stockAmount=");
            sb.append(this.stockAmount);
            sb.append(", badges=");
            sb.append(this.badges);
            sb.append(", rejectInfo=");
            sb.append(this.rejectInfo);
            sb.append(", postId=");
            sb.append(this.postId);
            sb.append(", postOwnerId=");
            sb.append(this.postOwnerId);
            sb.append(", openMarketLink=");
            sb.append(this.openMarketLink);
            sb.append(", isHardblocked=");
            sb.append(this.isHardblocked);
            sb.append(", itemRating=");
            sb.append(this.itemRating);
            sb.append(", thumbs=");
            sb.append(this.thumbs);
            sb.append(", buttons=");
            sb.append(this.buttons);
            sb.append(", hasGroupAccess=");
            sb.append(this.hasGroupAccess);
            sb.append(", seoSlug=");
            sb.append(this.seoSlug);
            sb.append(", seoTitle=");
            sb.append(this.seoTitle);
            sb.append(", seoDescription=");
            sb.append(this.seoDescription);
            sb.append(", externalUrl=");
            sb.append(this.externalUrl);
            sb.append(", marketUrl=");
            return ho8.a(sb, this.marketUrl, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            parcel.writeParcelable(this.availability, i);
            parcel.writeParcelable(this.category, i);
            parcel.writeString(this.description);
            parcel.writeInt(this.id);
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeParcelable(this.price, i);
            parcel.writeString(this.title);
            Boolean bool = this.canIgnore;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool2 = this.keepOffline;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool3 = this.suggestSubscribe;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
            List<MarketMarketItemOtherItemsDto> list = this.otherItems;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f2 = dn.f(parcel, list, 1);
                while (f2.hasNext()) {
                    ((MarketMarketItemOtherItemsDto) f2.next()).writeToParcel(parcel, i);
                }
            }
            MarketItemBannerDto marketItemBannerDto = this.banner;
            if (marketItemBannerDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                marketItemBannerDto.writeToParcel(parcel, i);
            }
            MarketItemDimensionsDto marketItemDimensionsDto = this.dimensions;
            if (marketItemDimensionsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                marketItemDimensionsDto.writeToParcel(parcel, i);
            }
            Integer num = this.weight;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            List<Integer> list2 = this.albumsIds;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f3 = dn.f(parcel, list2, 1);
                while (f3.hasNext()) {
                    parcel.writeInt(((Number) f3.next()).intValue());
                }
            }
            List<PhotosPhotoDto> list3 = this.photos;
            if (list3 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f4 = dn.f(parcel, list3, 1);
                while (f4.hasNext()) {
                    parcel.writeParcelable((Parcelable) f4.next(), i);
                }
            }
            List<MarketItemVideoDto> list4 = this.videos;
            if (list4 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f5 = dn.f(parcel, list4, 1);
                while (f5.hasNext()) {
                    ((MarketItemVideoDto) f5.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeParcelable(this.canComment, i);
            parcel.writeParcelable(this.showComments, i);
            parcel.writeParcelable(this.showReviews, i);
            parcel.writeParcelable(this.canRepost, i);
            parcel.writeParcelable(this.likes, i);
            parcel.writeString(this.reactionSetId);
            parcel.writeParcelable(this.reactions, i);
            parcel.writeParcelable(this.reposts, i);
            Integer num2 = this.viewsCount;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
            List<MarketPropertyDto> list5 = this.properties;
            if (list5 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f6 = dn.f(parcel, list5, 1);
                while (f6.hasNext()) {
                    ((MarketPropertyDto) f6.next()).writeToParcel(parcel, i);
                }
            }
            List<MarketItemPropertyVariantsDto> list6 = this.variants;
            if (list6 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f7 = dn.f(parcel, list6, 1);
                while (f7.hasNext()) {
                    ((MarketItemPropertyVariantsDto) f7.next()).writeToParcel(parcel, i);
                }
            }
            MarketItemAddressesDto marketItemAddressesDto = this.addresses;
            if (marketItemAddressesDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                marketItemAddressesDto.writeToParcel(parcel, i);
            }
            List<MarketVariantsGridPropertyDto> list7 = this.variantsGrid;
            if (list7 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f8 = dn.f(parcel, list7, 1);
                while (f8.hasNext()) {
                    ((MarketVariantsGridPropertyDto) f8.next()).writeToParcel(parcel, i);
                }
            }
            List<BaseLinkButtonDto> list8 = this.actionButtons;
            if (list8 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f9 = dn.f(parcel, list8, 1);
                while (f9.hasNext()) {
                    parcel.writeParcelable((Parcelable) f9.next(), i);
                }
            }
            Integer num3 = this.wishlistItemId;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num3);
            }
            Float f10 = this.rating;
            if (f10 == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f10);
            }
            Integer num4 = this.ordersCount;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num4);
            }
            parcel.writeParcelable(this.cancelInfo, i);
            parcel.writeString(this.userAgreementInfo);
            Integer num5 = this.adId;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num5);
            }
            MarketItemOwnerInfoDto marketItemOwnerInfoDto = this.ownerInfo;
            if (marketItemOwnerInfoDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                marketItemOwnerInfoDto.writeToParcel(parcel, i);
            }
            Boolean bool4 = this.canEdit;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            Boolean bool5 = this.canDelete;
            if (bool5 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool5);
            }
            Boolean bool6 = this.canDeleteImage;
            if (bool6 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool6);
            }
            Boolean bool7 = this.canDeleteWithReason;
            if (bool7 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool7);
            }
            Boolean bool8 = this.canRecover;
            if (bool8 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool8);
            }
            Boolean bool9 = this.canShowConvertToService;
            if (bool9 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool9);
            }
            MarketItemPromotionInfoDto marketItemPromotionInfoDto = this.promotion;
            if (marketItemPromotionInfoDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                marketItemPromotionInfoDto.writeToParcel(parcel, i);
            }
            Integer num6 = this.vkPayDiscount;
            if (num6 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num6);
            }
            List<MarketSimilarItemsDto> list9 = this.similarItems;
            if (list9 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f11 = dn.f(parcel, list9, 1);
                while (f11.hasNext()) {
                    ((MarketSimilarItemsDto) f11.next()).writeToParcel(parcel, i);
                }
            }
            List<MarketCustomButtonFullDto> list10 = this.customButtons;
            if (list10 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f12 = dn.f(parcel, list10, 1);
                while (f12.hasNext()) {
                    parcel.writeParcelable((Parcelable) f12.next(), i);
                }
            }
            parcel.writeString(this.adsLabel);
            List<MarketItemLabelDto> list11 = this.labels;
            if (list11 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f13 = dn.f(parcel, list11, 1);
                while (f13.hasNext()) {
                    ((MarketItemLabelDto) f13.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeParcelable(this.group, i);
            List<MarketItemCharacteristicDto> list12 = this.characteristics;
            if (list12 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f14 = dn.f(parcel, list12, 1);
                while (f14.hasNext()) {
                    ((MarketItemCharacteristicDto) f14.next()).writeToParcel(parcel, i);
                }
            }
            MarketDeliveryMethodsInfoDto marketDeliveryMethodsInfoDto = this.deliveryMethodsInfo;
            if (marketDeliveryMethodsInfoDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                marketDeliveryMethodsInfoDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.accessKey);
            parcel.writeString(this.buttonTitle);
            parcel.writeParcelable(this.categoryV2, i);
            parcel.writeString(this.descriptionUrl);
            parcel.writeString(this.externalId);
            parcel.writeParcelable(this.itemType, i);
            parcel.writeParcelable(this.integrationInfo, i);
            Boolean bool10 = this.isFavorite;
            if (bool10 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool10);
            }
            Boolean bool11 = this.isPriceListService;
            if (bool11 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool11);
            }
            Boolean bool12 = this.isOwner;
            if (bool12 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool12);
            }
            Boolean bool13 = this.isAdult;
            if (bool13 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool13);
            }
            parcel.writeParcelable(this.serviceDuration, i);
            parcel.writeString(this.thumbPhoto);
            parcel.writeString(this.url);
            Integer num7 = this.variantsGroupingId;
            if (num7 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num7);
            }
            Boolean bool14 = this.isMainVariant;
            if (bool14 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool14);
            }
            Integer num8 = this.availableVariantItemId;
            if (num8 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num8);
            }
            List<MarketItemPropertyValueDto> list13 = this.propertyValues;
            if (list13 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f15 = dn.f(parcel, list13, 1);
                while (f15.hasNext()) {
                    parcel.writeParcelable((Parcelable) f15.next(), i);
                }
            }
            Integer num9 = this.cartQuantity;
            if (num9 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num9);
            }
            parcel.writeParcelable(this.deliveryInfo, i);
            parcel.writeString(this.sku);
            Boolean bool15 = this.isAliexpressProduct;
            if (bool15 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool15);
            }
            parcel.writeString(this.csrfHashes);
            List<BaseImageDto> list14 = this.thumb;
            if (list14 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f16 = dn.f(parcel, list14, 1);
                while (f16.hasNext()) {
                    parcel.writeParcelable((Parcelable) f16.next(), i);
                }
            }
            Boolean bool16 = this.isAliexpressCheckout;
            if (bool16 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool16);
            }
            Integer num10 = this.stockAmount;
            if (num10 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num10);
            }
            List<MarketBadgeDto> list15 = this.badges;
            if (list15 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f17 = dn.f(parcel, list15, 1);
                while (f17.hasNext()) {
                    parcel.writeParcelable((Parcelable) f17.next(), i);
                }
            }
            parcel.writeParcelable(this.rejectInfo, i);
            Integer num11 = this.postId;
            if (num11 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num11);
            }
            parcel.writeParcelable(this.postOwnerId, i);
            parcel.writeString(this.openMarketLink);
            Boolean bool17 = this.isHardblocked;
            if (bool17 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool17);
            }
            parcel.writeParcelable(this.itemRating, i);
            List<List<BaseImageDto>> list16 = this.thumbs;
            if (list16 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f18 = dn.f(parcel, list16, 1);
                while (f18.hasNext()) {
                    Iterator a2 = ao.a(parcel, (List) f18.next());
                    while (a2.hasNext()) {
                        parcel.writeParcelable((Parcelable) a2.next(), i);
                    }
                }
            }
            List<MarketCustomButtonFullDto> list17 = this.buttons;
            if (list17 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f19 = dn.f(parcel, list17, 1);
                while (f19.hasNext()) {
                    parcel.writeParcelable((Parcelable) f19.next(), i);
                }
            }
            Boolean bool18 = this.hasGroupAccess;
            if (bool18 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool18);
            }
            parcel.writeString(this.seoSlug);
            parcel.writeString(this.seoTitle);
            parcel.writeString(this.seoDescription);
            parcel.writeString(this.externalUrl);
            parcel.writeString(this.marketUrl);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NewsfeedItemMarketItemDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, MarketMarketItemAvailabilityDto marketMarketItemAvailabilityDto, MarketMarketCategoryDto marketMarketCategoryDto, String str, int i2, UserId userId2, MarketPriceDto marketPriceDto, String str2, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, List<MarketMarketItemOtherItemsDto> list, MarketItemBannerDto marketItemBannerDto, MarketItemDimensionsDto marketItemDimensionsDto, Integer num, List<Integer> list2, List<PhotosPhotoDto> list3, List<MarketItemVideoDto> list4, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, BaseLikesDto baseLikesDto, String str4, LikesItemReactionsDto likesItemReactionsDto, BaseRepostsInfoDto baseRepostsInfoDto, Integer num2, List<MarketPropertyDto> list5, List<MarketItemPropertyVariantsDto> list6, MarketItemAddressesDto marketItemAddressesDto, List<MarketVariantsGridPropertyDto> list7, List<BaseLinkButtonDto> list8, Integer num3, Float f2, Integer num4, BaseLinkDto baseLinkDto, String str5, Integer num5, MarketItemOwnerInfoDto marketItemOwnerInfoDto, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, MarketItemPromotionInfoDto marketItemPromotionInfoDto, Integer num6, List<MarketSimilarItemsDto> list9, List<MarketCustomButtonFullDto> list10, String str6, List<MarketItemLabelDto> list11, GroupsGroupFullDto groupsGroupFullDto, List<MarketItemCharacteristicDto> list12, MarketDeliveryMethodsInfoDto marketDeliveryMethodsInfoDto, String str7, String str8, MarketMarketCategoryDto marketMarketCategoryDto2, String str9, String str10, MarketMarketItemTypeDto marketMarketItemTypeDto, MarketMarketItemIntegrationInfoDto marketMarketItemIntegrationInfoDto, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, MarketServicesDurationDto marketServicesDurationDto, String str11, String str12, Integer num7, Boolean bool14, Integer num8, List<MarketItemPropertyValueDto> list13, Integer num9, MarketDeliveryInfoDto marketDeliveryInfoDto, String str13, Boolean bool15, String str14, List<BaseImageDto> list14, Boolean bool16, Integer num10, List<MarketBadgeDto> list15, MarketItemRejectInfoDto marketItemRejectInfoDto, Integer num11, UserId userId3, String str15, Boolean bool17, MarketMarketItemRatingDto marketMarketItemRatingDto, List<? extends List<BaseImageDto>> list16, List<MarketCustomButtonFullDto> list17, Boolean bool18, String str16, String str17, String str18, String str19, String str20) {
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
            this.canIgnore = bool;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool2;
            this.trackCode = str3;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool3;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
            this.otherItems = list;
            this.banner = marketItemBannerDto;
            this.dimensions = marketItemDimensionsDto;
            this.weight = num;
            this.albumsIds = list2;
            this.photos = list3;
            this.videos = list4;
            this.canComment = baseBoolIntDto;
            this.showComments = baseBoolIntDto2;
            this.showReviews = baseBoolIntDto3;
            this.canRepost = baseBoolIntDto4;
            this.likes = baseLikesDto;
            this.reactionSetId = str4;
            this.reactions = likesItemReactionsDto;
            this.reposts = baseRepostsInfoDto;
            this.viewsCount = num2;
            this.properties = list5;
            this.variants = list6;
            this.addresses = marketItemAddressesDto;
            this.variantsGrid = list7;
            this.actionButtons = list8;
            this.wishlistItemId = num3;
            this.rating = f2;
            this.ordersCount = num4;
            this.cancelInfo = baseLinkDto;
            this.userAgreementInfo = str5;
            this.adId = num5;
            this.ownerInfo = marketItemOwnerInfoDto;
            this.canEdit = bool4;
            this.canDelete = bool5;
            this.canDeleteImage = bool6;
            this.canDeleteWithReason = bool7;
            this.canRecover = bool8;
            this.canShowConvertToService = bool9;
            this.promotion = marketItemPromotionInfoDto;
            this.vkPayDiscount = num6;
            this.similarItems = list9;
            this.customButtons = list10;
            this.adsLabel = str6;
            this.labels = list11;
            this.group = groupsGroupFullDto;
            this.characteristics = list12;
            this.deliveryMethodsInfo = marketDeliveryMethodsInfoDto;
            this.accessKey = str7;
            this.buttonTitle = str8;
            this.categoryV2 = marketMarketCategoryDto2;
            this.descriptionUrl = str9;
            this.externalId = str10;
            this.itemType = marketMarketItemTypeDto;
            this.integrationInfo = marketMarketItemIntegrationInfoDto;
            this.isFavorite = bool10;
            this.isPriceListService = bool11;
            this.isOwner = bool12;
            this.isAdult = bool13;
            this.serviceDuration = marketServicesDurationDto;
            this.thumbPhoto = str11;
            this.url = str12;
            this.variantsGroupingId = num7;
            this.isMainVariant = bool14;
            this.availableVariantItemId = num8;
            this.propertyValues = list13;
            this.cartQuantity = num9;
            this.deliveryInfo = marketDeliveryInfoDto;
            this.sku = str13;
            this.isAliexpressProduct = bool15;
            this.csrfHashes = str14;
            this.thumb = list14;
            this.isAliexpressCheckout = bool16;
            this.stockAmount = num10;
            this.badges = list15;
            this.rejectInfo = marketItemRejectInfoDto;
            this.postId = num11;
            this.postOwnerId = userId3;
            this.openMarketLink = str15;
            this.isHardblocked = bool17;
            this.itemRating = marketMarketItemRatingDto;
            this.thumbs = list16;
            this.buttons = list17;
            this.hasGroupAccess = bool18;
            this.seoSlug = str16;
            this.seoTitle = str17;
            this.seoDescription = str18;
            this.externalUrl = str19;
            this.marketUrl = str20;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemMusicSelectionsBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemMusicSelectionsBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("button")
        private final BaseLinkButtonDto button;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final boolean isAsync;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0(TtmlNode.TAG_STYLE)
        private final StyleDto style;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class StyleDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ StyleDto[] $VALUES;

            @pmi0("compact")
            public static final StyleDto COMPACT;
            public static final Parcelable.Creator<StyleDto> CREATOR;

            @pmi0("extended")
            public static final StyleDto EXTENDED;
            private final String value;

            /* compiled from: NewsfeedNewsfeedItemDto.kt */
            public static final class a implements Parcelable.Creator<StyleDto> {
                @Override // android.os.Parcelable.Creator
                public final StyleDto createFromParcel(Parcel parcel) {
                    return StyleDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final StyleDto[] newArray(int i) {
                    return new StyleDto[i];
                }
            }

            static {
                StyleDto styleDto = new StyleDto("COMPACT", 0, "compact");
                COMPACT = styleDto;
                StyleDto styleDto2 = new StyleDto("EXTENDED", 1, "extended");
                EXTENDED = styleDto2;
                StyleDto[] styleDtoArr = {styleDto, styleDto2};
                $VALUES = styleDtoArr;
                $ENTRIES = new asp(styleDtoArr);
                CREATOR = new a();
            }

            private StyleDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static StyleDto valueOf(String str) {
                return (StyleDto) Enum.valueOf(StyleDto.class, str);
            }

            public static StyleDto[] values() {
                return (StyleDto[]) $VALUES.clone();
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

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("recommended_playlists")
            public static final TypeDto RECOMMENDED_PLAYLISTS;
            private final String value;

            /* compiled from: NewsfeedNewsfeedItemDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("RECOMMENDED_PLAYLISTS", 0, "recommended_playlists");
                RECOMMENDED_PLAYLISTS = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String i() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemMusicSelectionsBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemMusicSelectionsBlockDto createFromParcel(Parcel parcel) {
                Class cls;
                boolean z;
                Boolean valueOf;
                Boolean valueOf2;
                String readString = parcel.readString();
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                BaseLinkButtonDto baseLinkButtonDto = (BaseLinkButtonDto) parcel.readParcelable(NewsfeedItemMusicSelectionsBlockDto.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    cls = NewsfeedItemMusicSelectionsBlockDto.class;
                    z = true;
                } else {
                    cls = NewsfeedItemMusicSelectionsBlockDto.class;
                    z = false;
                }
                UserId userId = (UserId) parcel.readParcelable(cls.getClassLoader());
                Class cls2 = cls;
                int readInt = parcel.readInt();
                String readString2 = parcel.readString();
                Boolean bool = null;
                StyleDto createFromParcel2 = parcel.readInt() == 0 ? null : StyleDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(cls2.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(cls2.getClassLoader());
                Float valueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(cls2.getClassLoader());
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemMusicSelectionsBlockDto(readString, createFromParcel, baseLinkButtonDto, z, userId, readInt, readString2, createFromParcel2, valueOf, newsfeedNewsfeedItemCaptionDto, valueOf2, wallPostActivityDto, valueOf3, newsfeedPushSubscriptionDto, bool, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(cls2.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(cls2.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemMusicSelectionsBlockDto[] newArray(int i) {
                return new NewsfeedItemMusicSelectionsBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemMusicSelectionsBlockDto(String str, TypeDto typeDto, BaseLinkButtonDto baseLinkButtonDto, boolean z, UserId userId, int i, String str2, StyleDto styleDto, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(str, typeDto, baseLinkButtonDto, z, userId, i, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? null : styleDto, (i2 & 256) != 0 ? null : bool, (i2 & 512) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 1024) != 0 ? null : bool2, (i2 & 2048) != 0 ? null : wallPostActivityDto, (i2 & 4096) != 0 ? null : f, (i2 & 8192) != 0 ? null : newsfeedPushSubscriptionDto, (i2 & 16384) != 0 ? null : bool3, (32768 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 65536) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final TypeDto d() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemMusicSelectionsBlockDto)) {
                return false;
            }
            NewsfeedItemMusicSelectionsBlockDto newsfeedItemMusicSelectionsBlockDto = (NewsfeedItemMusicSelectionsBlockDto) obj;
            return epx.f(this.title, newsfeedItemMusicSelectionsBlockDto.title) && this.type == newsfeedItemMusicSelectionsBlockDto.type && epx.f(this.button, newsfeedItemMusicSelectionsBlockDto.button) && this.isAsync == newsfeedItemMusicSelectionsBlockDto.isAsync && epx.f(this.sourceId, newsfeedItemMusicSelectionsBlockDto.sourceId) && this.date == newsfeedItemMusicSelectionsBlockDto.date && epx.f(this.trackCode, newsfeedItemMusicSelectionsBlockDto.trackCode) && this.style == newsfeedItemMusicSelectionsBlockDto.style && epx.f(this.canIgnore, newsfeedItemMusicSelectionsBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemMusicSelectionsBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemMusicSelectionsBlockDto.keepOffline) && epx.f(this.activity, newsfeedItemMusicSelectionsBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemMusicSelectionsBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemMusicSelectionsBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemMusicSelectionsBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemMusicSelectionsBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemMusicSelectionsBlockDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(qoy.b((this.button.hashCode() + ((this.type.hashCode() + (this.title.hashCode() * 31)) * 31)) * 31, 31, this.isAsync), 31, this.sourceId.b), 31);
            String str = this.trackCode;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            StyleDto styleDto = this.style;
            int hashCode2 = (hashCode + (styleDto == null ? 0 : styleDto.hashCode())) * 31;
            Boolean bool = this.canIgnore;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode4 = (hashCode3 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool2 = this.keepOffline;
            int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode6 = (hashCode5 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode8 = (hashCode7 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool3 = this.suggestSubscribe;
            int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode10 = (hashCode9 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode10 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemMusicSelectionsBlockDto(title=");
            sb.append(this.title);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", button=");
            sb.append(this.button);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", style=");
            sb.append(this.style);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.button, i);
            parcel.writeInt(this.isAsync ? 1 : 0);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            parcel.writeString(this.trackCode);
            StyleDto styleDto = this.style;
            if (styleDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                styleDto.writeToParcel(parcel, i);
            }
            Boolean bool = this.canIgnore;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool2 = this.keepOffline;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool3 = this.suggestSubscribe;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemMusicSelectionsBlockDto(String str, TypeDto typeDto, BaseLinkButtonDto baseLinkButtonDto, boolean z, UserId userId, int i, String str2, StyleDto styleDto, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.title = str;
            this.type = typeDto;
            this.button = baseLinkButtonDto;
            this.isAsync = z;
            this.sourceId = userId;
            this.date = i;
            this.trackCode = str2;
            this.style = styleDto;
            this.canIgnore = bool;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool2;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool3;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemPhotoDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemPhotoDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("carousel_offset")
        private final Integer carouselOffset;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("ext_id")
        private final String extId;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("header")
        private final NewsfeedNewsfeedItemHeaderDto header;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("photos")
        private final NewsfeedItemPhotoPhotosDto photos;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("thumbs_max_height")
        private final Float thumbsMaxHeight;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemPhotoDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemPhotoDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemPhotoDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemPhotoDto.class.getClassLoader());
                int readInt = parcel.readInt();
                NewsfeedItemPhotoPhotosDto createFromParcel = parcel.readInt() == 0 ? null : NewsfeedItemPhotoPhotosDto.CREATOR.createFromParcel(parcel);
                Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedNewsfeedItemHeaderDto createFromParcel2 = parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemHeaderDto.CREATOR.createFromParcel(parcel);
                Integer num = valueOf4;
                String readString = parcel.readString();
                Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemPhotoDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Boolean bool = valueOf;
                String readString2 = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemPhotoDto.class.getClassLoader());
                Float valueOf7 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemPhotoDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemPhotoDto(newsfeedNewsfeedItemTypeDto, userId, readInt, createFromParcel, num, valueOf5, createFromParcel2, readString, valueOf6, bool, newsfeedNewsfeedItemCaptionDto, valueOf2, readString2, wallPostActivityDto, valueOf7, newsfeedPushSubscriptionDto, valueOf3, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemPhotoDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemPhotoDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemPhotoDto[] newArray(int i) {
                return new NewsfeedItemPhotoDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemPhotoDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, NewsfeedItemPhotoPhotosDto newsfeedItemPhotoPhotosDto, Integer num, Float f, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, String str, Integer num2, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str2, WallPostActivityDto wallPostActivityDto, Float f2, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : newsfeedItemPhotoPhotosDto, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : f, (i2 & 64) != 0 ? null : newsfeedNewsfeedItemHeaderDto, (i2 & 128) != 0 ? null : str, (i2 & 256) != 0 ? null : num2, (i2 & 512) != 0 ? null : bool, (i2 & 1024) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 2048) != 0 ? null : bool2, (i2 & 4096) != 0 ? null : str2, (i2 & 8192) != 0 ? null : wallPostActivityDto, (i2 & 16384) != 0 ? null : f2, (32768 & i2) != 0 ? null : newsfeedPushSubscriptionDto, (65536 & i2) != 0 ? null : bool3, (131072 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final int d() {
            return this.date;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final NewsfeedItemDebugInfoDto e() {
            return this.debugInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemPhotoDto)) {
                return false;
            }
            NewsfeedItemPhotoDto newsfeedItemPhotoDto = (NewsfeedItemPhotoDto) obj;
            return this.type == newsfeedItemPhotoDto.type && epx.f(this.sourceId, newsfeedItemPhotoDto.sourceId) && this.date == newsfeedItemPhotoDto.date && epx.f(this.photos, newsfeedItemPhotoDto.photos) && epx.f(this.postId, newsfeedItemPhotoDto.postId) && epx.f(this.thumbsMaxHeight, newsfeedItemPhotoDto.thumbsMaxHeight) && epx.f(this.header, newsfeedItemPhotoDto.header) && epx.f(this.extId, newsfeedItemPhotoDto.extId) && epx.f(this.carouselOffset, newsfeedItemPhotoDto.carouselOffset) && epx.f(this.canIgnore, newsfeedItemPhotoDto.canIgnore) && epx.f(this.caption, newsfeedItemPhotoDto.caption) && epx.f(this.keepOffline, newsfeedItemPhotoDto.keepOffline) && epx.f(this.trackCode, newsfeedItemPhotoDto.trackCode) && epx.f(this.activity, newsfeedItemPhotoDto.activity) && epx.f(this.shortTextRate, newsfeedItemPhotoDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemPhotoDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemPhotoDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemPhotoDto.feedback) && epx.f(this.debugInfo, newsfeedItemPhotoDto.debugInfo);
        }

        public final NewsfeedItemWallpostFeedbackDto f() {
            return this.feedback;
        }

        public final NewsfeedNewsfeedItemHeaderDto g() {
            return this.header;
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            NewsfeedItemPhotoPhotosDto newsfeedItemPhotoPhotosDto = this.photos;
            int hashCode = (a2 + (newsfeedItemPhotoPhotosDto == null ? 0 : newsfeedItemPhotoPhotosDto.hashCode())) * 31;
            Integer num = this.postId;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Float f = this.thumbsMaxHeight;
            int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
            int hashCode4 = (hashCode3 + (newsfeedNewsfeedItemHeaderDto == null ? 0 : newsfeedNewsfeedItemHeaderDto.hashCode())) * 31;
            String str = this.extId;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num2 = this.carouselOffset;
            int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Boolean bool = this.canIgnore;
            int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode8 = (hashCode7 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool2 = this.keepOffline;
            int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str2 = this.trackCode;
            int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode11 = (hashCode10 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f2 = this.shortTextRate;
            int hashCode12 = (hashCode11 + (f2 == null ? 0 : f2.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode13 = (hashCode12 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool3 = this.suggestSubscribe;
            int hashCode14 = (hashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode15 = (hashCode14 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode15 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final Boolean i() {
            return this.keepOffline;
        }

        public final NewsfeedItemPhotoPhotosDto j() {
            return this.photos;
        }

        public final Integer k() {
            return this.postId;
        }

        public final UserId l() {
            return this.sourceId;
        }

        public final Float n() {
            return this.thumbsMaxHeight;
        }

        public final NewsfeedNewsfeedItemTypeDto o() {
            return this.type;
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemPhotoDto(type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", photos=");
            sb.append(this.photos);
            sb.append(", postId=");
            sb.append(this.postId);
            sb.append(", thumbsMaxHeight=");
            sb.append(this.thumbsMaxHeight);
            sb.append(", header=");
            sb.append(this.header);
            sb.append(", extId=");
            sb.append(this.extId);
            sb.append(", carouselOffset=");
            sb.append(this.carouselOffset);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            NewsfeedItemPhotoPhotosDto newsfeedItemPhotoPhotosDto = this.photos;
            if (newsfeedItemPhotoPhotosDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedItemPhotoPhotosDto.writeToParcel(parcel, i);
            }
            Integer num = this.postId;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            Float f = this.thumbsMaxHeight;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
            if (newsfeedNewsfeedItemHeaderDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedNewsfeedItemHeaderDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.extId);
            Integer num2 = this.carouselOffset;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
            Boolean bool = this.canIgnore;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool2 = this.keepOffline;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f2 = this.shortTextRate;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f2);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool3 = this.suggestSubscribe;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemPhotoDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, NewsfeedItemPhotoPhotosDto newsfeedItemPhotoPhotosDto, Integer num, Float f, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, String str, Integer num2, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str2, WallPostActivityDto wallPostActivityDto, Float f2, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.photos = newsfeedItemPhotoPhotosDto;
            this.postId = num;
            this.thumbsMaxHeight = f;
            this.header = newsfeedNewsfeedItemHeaderDto;
            this.extId = str;
            this.carouselOffset = num2;
            this.canIgnore = bool;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool2;
            this.trackCode = str2;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f2;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool3;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemPhotoTagDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemPhotoTagDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("carousel_offset")
        private final Integer carouselOffset;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("ext_id")
        private final String extId;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("header")
        private final NewsfeedNewsfeedItemHeaderDto header;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("photo_tags")
        private final NewsfeedItemPhotoTagPhotoTagsDto photoTags;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("thumbs_max_height")
        private final Float thumbsMaxHeight;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemPhotoTagDto> {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemPhotoTagDto createFromParcel(Parcel parcel) {
                Float valueOf;
                Boolean bool;
                Boolean bool2;
                Boolean valueOf2;
                Boolean valueOf3;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemPhotoTagDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemPhotoTagDto.class.getClassLoader());
                int readInt = parcel.readInt();
                NewsfeedItemPhotoTagPhotoTagsDto createFromParcel = parcel.readInt() == 0 ? null : NewsfeedItemPhotoTagPhotoTagsDto.CREATOR.createFromParcel(parcel);
                Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                    bool = null;
                } else {
                    valueOf = Float.valueOf(parcel.readFloat());
                    bool = null;
                }
                String readString = parcel.readString();
                NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = (NewsfeedNewsfeedItemHeaderDto) (parcel.readInt() == 0 ? bool : NewsfeedNewsfeedItemHeaderDto.CREATOR.createFromParcel(parcel));
                Object valueOf5 = parcel.readInt() == 0 ? bool : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    bool2 = bool;
                } else {
                    bool2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemPhotoTagDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer num = valueOf4;
                Boolean bool3 = bool2;
                String readString2 = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemPhotoTagDto.class.getClassLoader());
                Float valueOf6 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemPhotoTagDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemPhotoTagDto(newsfeedNewsfeedItemTypeDto, userId, readInt, createFromParcel, num, valueOf, readString, newsfeedNewsfeedItemHeaderDto, valueOf5, bool3, newsfeedNewsfeedItemCaptionDto, valueOf2, readString2, wallPostActivityDto, valueOf6, newsfeedPushSubscriptionDto, valueOf3, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemPhotoTagDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemPhotoTagDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemPhotoTagDto[] newArray(int i) {
                return new NewsfeedItemPhotoTagDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemPhotoTagDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, NewsfeedItemPhotoTagPhotoTagsDto newsfeedItemPhotoTagPhotoTagsDto, Integer num, Float f, String str, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, Integer num2, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str2, WallPostActivityDto wallPostActivityDto, Float f2, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : newsfeedItemPhotoTagPhotoTagsDto, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : f, (i2 & 64) != 0 ? null : str, (i2 & 128) != 0 ? null : newsfeedNewsfeedItemHeaderDto, (i2 & 256) != 0 ? null : num2, (i2 & 512) != 0 ? null : bool, (i2 & 1024) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 2048) != 0 ? null : bool2, (i2 & 4096) != 0 ? null : str2, (i2 & 8192) != 0 ? null : wallPostActivityDto, (i2 & 16384) != 0 ? null : f2, (32768 & i2) != 0 ? null : newsfeedPushSubscriptionDto, (65536 & i2) != 0 ? null : bool3, (131072 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final int d() {
            return this.date;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final NewsfeedItemDebugInfoDto e() {
            return this.debugInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemPhotoTagDto)) {
                return false;
            }
            NewsfeedItemPhotoTagDto newsfeedItemPhotoTagDto = (NewsfeedItemPhotoTagDto) obj;
            return this.type == newsfeedItemPhotoTagDto.type && epx.f(this.sourceId, newsfeedItemPhotoTagDto.sourceId) && this.date == newsfeedItemPhotoTagDto.date && epx.f(this.photoTags, newsfeedItemPhotoTagDto.photoTags) && epx.f(this.postId, newsfeedItemPhotoTagDto.postId) && epx.f(this.thumbsMaxHeight, newsfeedItemPhotoTagDto.thumbsMaxHeight) && epx.f(this.extId, newsfeedItemPhotoTagDto.extId) && epx.f(this.header, newsfeedItemPhotoTagDto.header) && epx.f(this.carouselOffset, newsfeedItemPhotoTagDto.carouselOffset) && epx.f(this.canIgnore, newsfeedItemPhotoTagDto.canIgnore) && epx.f(this.caption, newsfeedItemPhotoTagDto.caption) && epx.f(this.keepOffline, newsfeedItemPhotoTagDto.keepOffline) && epx.f(this.trackCode, newsfeedItemPhotoTagDto.trackCode) && epx.f(this.activity, newsfeedItemPhotoTagDto.activity) && epx.f(this.shortTextRate, newsfeedItemPhotoTagDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemPhotoTagDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemPhotoTagDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemPhotoTagDto.feedback) && epx.f(this.debugInfo, newsfeedItemPhotoTagDto.debugInfo);
        }

        public final NewsfeedItemWallpostFeedbackDto f() {
            return this.feedback;
        }

        public final NewsfeedNewsfeedItemHeaderDto g() {
            return this.header;
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            NewsfeedItemPhotoTagPhotoTagsDto newsfeedItemPhotoTagPhotoTagsDto = this.photoTags;
            int hashCode = (a2 + (newsfeedItemPhotoTagPhotoTagsDto == null ? 0 : newsfeedItemPhotoTagPhotoTagsDto.hashCode())) * 31;
            Integer num = this.postId;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Float f = this.thumbsMaxHeight;
            int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
            String str = this.extId;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
            int hashCode5 = (hashCode4 + (newsfeedNewsfeedItemHeaderDto == null ? 0 : newsfeedNewsfeedItemHeaderDto.hashCode())) * 31;
            Integer num2 = this.carouselOffset;
            int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Boolean bool = this.canIgnore;
            int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode8 = (hashCode7 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool2 = this.keepOffline;
            int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str2 = this.trackCode;
            int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode11 = (hashCode10 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f2 = this.shortTextRate;
            int hashCode12 = (hashCode11 + (f2 == null ? 0 : f2.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode13 = (hashCode12 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool3 = this.suggestSubscribe;
            int hashCode14 = (hashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode15 = (hashCode14 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode15 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final Boolean i() {
            return this.keepOffline;
        }

        public final NewsfeedItemPhotoTagPhotoTagsDto j() {
            return this.photoTags;
        }

        public final Integer k() {
            return this.postId;
        }

        public final UserId l() {
            return this.sourceId;
        }

        public final Float n() {
            return this.thumbsMaxHeight;
        }

        public final NewsfeedNewsfeedItemTypeDto o() {
            return this.type;
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemPhotoTagDto(type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", photoTags=");
            sb.append(this.photoTags);
            sb.append(", postId=");
            sb.append(this.postId);
            sb.append(", thumbsMaxHeight=");
            sb.append(this.thumbsMaxHeight);
            sb.append(", extId=");
            sb.append(this.extId);
            sb.append(", header=");
            sb.append(this.header);
            sb.append(", carouselOffset=");
            sb.append(this.carouselOffset);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            NewsfeedItemPhotoTagPhotoTagsDto newsfeedItemPhotoTagPhotoTagsDto = this.photoTags;
            if (newsfeedItemPhotoTagPhotoTagsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedItemPhotoTagPhotoTagsDto.writeToParcel(parcel, i);
            }
            Integer num = this.postId;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            Float f = this.thumbsMaxHeight;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeString(this.extId);
            NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
            if (newsfeedNewsfeedItemHeaderDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedNewsfeedItemHeaderDto.writeToParcel(parcel, i);
            }
            Integer num2 = this.carouselOffset;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
            Boolean bool = this.canIgnore;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool2 = this.keepOffline;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f2 = this.shortTextRate;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f2);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool3 = this.suggestSubscribe;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemPhotoTagDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, NewsfeedItemPhotoTagPhotoTagsDto newsfeedItemPhotoTagPhotoTagsDto, Integer num, Float f, String str, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, Integer num2, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str2, WallPostActivityDto wallPostActivityDto, Float f2, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.photoTags = newsfeedItemPhotoTagPhotoTagsDto;
            this.postId = num;
            this.thumbsMaxHeight = f;
            this.extId = str;
            this.header = newsfeedNewsfeedItemHeaderDto;
            this.carouselOffset = num2;
            this.canIgnore = bool;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool2;
            this.trackCode = str2;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f2;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool3;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemPromoButtonDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemPromoButtonDto> CREATOR = new a();

        @pmi0("action")
        private final NewsfeedItemPromoButtonActionDto action;

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("images")
        private final List<NewsfeedItemPromoButtonImageDto> images;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("text")
        private final String text;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemPromoButtonDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemPromoButtonDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemPromoButtonDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemPromoButtonDto.class.getClassLoader());
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                NewsfeedItemPromoButtonActionDto createFromParcel = parcel.readInt() == 0 ? null : NewsfeedItemPromoButtonActionDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList = new ArrayList(readInt2);
                    int i = 0;
                    while (i != readInt2) {
                        i = en.a(NewsfeedItemPromoButtonImageDto.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemPromoButtonDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString3 = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemPromoButtonDto.class.getClassLoader());
                Float valueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemPromoButtonDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemPromoButtonDto(newsfeedNewsfeedItemTypeDto, userId, readInt, readString, readString2, createFromParcel, arrayList, valueOf, newsfeedNewsfeedItemCaptionDto, valueOf2, readString3, wallPostActivityDto, valueOf4, newsfeedPushSubscriptionDto, valueOf3, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemPromoButtonDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemPromoButtonDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemPromoButtonDto[] newArray(int i) {
                return new NewsfeedItemPromoButtonDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemPromoButtonDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, String str2, NewsfeedItemPromoButtonActionDto newsfeedItemPromoButtonActionDto, List list, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : newsfeedItemPromoButtonActionDto, (i2 & 64) != 0 ? null : list, (i2 & 128) != 0 ? null : bool, (i2 & 256) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 512) != 0 ? null : bool2, (i2 & 1024) != 0 ? null : str3, (i2 & 2048) != 0 ? null : wallPostActivityDto, (i2 & 4096) != 0 ? null : f, (i2 & 8192) != 0 ? null : newsfeedPushSubscriptionDto, (i2 & 16384) != 0 ? null : bool3, (32768 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 65536) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final NewsfeedItemPromoButtonActionDto d() {
            return this.action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<NewsfeedItemPromoButtonImageDto> e() {
            return this.images;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemPromoButtonDto)) {
                return false;
            }
            NewsfeedItemPromoButtonDto newsfeedItemPromoButtonDto = (NewsfeedItemPromoButtonDto) obj;
            return this.type == newsfeedItemPromoButtonDto.type && epx.f(this.sourceId, newsfeedItemPromoButtonDto.sourceId) && this.date == newsfeedItemPromoButtonDto.date && epx.f(this.text, newsfeedItemPromoButtonDto.text) && epx.f(this.title, newsfeedItemPromoButtonDto.title) && epx.f(this.action, newsfeedItemPromoButtonDto.action) && epx.f(this.images, newsfeedItemPromoButtonDto.images) && epx.f(this.canIgnore, newsfeedItemPromoButtonDto.canIgnore) && epx.f(this.caption, newsfeedItemPromoButtonDto.caption) && epx.f(this.keepOffline, newsfeedItemPromoButtonDto.keepOffline) && epx.f(this.trackCode, newsfeedItemPromoButtonDto.trackCode) && epx.f(this.activity, newsfeedItemPromoButtonDto.activity) && epx.f(this.shortTextRate, newsfeedItemPromoButtonDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemPromoButtonDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemPromoButtonDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemPromoButtonDto.feedback) && epx.f(this.debugInfo, newsfeedItemPromoButtonDto.debugInfo);
        }

        public final String f() {
            return this.text;
        }

        public final NewsfeedNewsfeedItemTypeDto g() {
            return this.type;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            String str = this.text;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.title;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            NewsfeedItemPromoButtonActionDto newsfeedItemPromoButtonActionDto = this.action;
            int hashCode3 = (hashCode2 + (newsfeedItemPromoButtonActionDto == null ? 0 : newsfeedItemPromoButtonActionDto.hashCode())) * 31;
            List<NewsfeedItemPromoButtonImageDto> list = this.images;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.canIgnore;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode6 = (hashCode5 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool2 = this.keepOffline;
            int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str3 = this.trackCode;
            int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode9 = (hashCode8 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode10 = (hashCode9 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode11 = (hashCode10 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool3 = this.suggestSubscribe;
            int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode13 = (hashCode12 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode13 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemPromoButtonDto(type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", images=");
            sb.append(this.images);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            parcel.writeString(this.text);
            parcel.writeString(this.title);
            NewsfeedItemPromoButtonActionDto newsfeedItemPromoButtonActionDto = this.action;
            if (newsfeedItemPromoButtonActionDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedItemPromoButtonActionDto.writeToParcel(parcel, i);
            }
            List<NewsfeedItemPromoButtonImageDto> list = this.images;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((NewsfeedItemPromoButtonImageDto) f.next()).writeToParcel(parcel, i);
                }
            }
            Boolean bool = this.canIgnore;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool2 = this.keepOffline;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f2 = this.shortTextRate;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f2);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool3 = this.suggestSubscribe;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemPromoButtonDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, String str2, NewsfeedItemPromoButtonActionDto newsfeedItemPromoButtonActionDto, List<NewsfeedItemPromoButtonImageDto> list, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.text = str;
            this.title = str2;
            this.action = newsfeedItemPromoButtonActionDto;
            this.images = list;
            this.canIgnore = bool;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool2;
            this.trackCode = str3;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool3;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemRecognizeBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemRecognizeBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("end_card")
        private final PhotosTagsSuggestionItemEndCardDto endCard;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("items")
        private final List<PhotosTagsSuggestionItemDto> items;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("recognition_article_link")
        private final String recognitionArticleLink;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemRecognizeBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemRecognizeBlockDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean valueOf4;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemRecognizeBlockDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemRecognizeBlockDto.class.getClassLoader());
                int readInt = parcel.readInt();
                PhotosTagsSuggestionItemEndCardDto createFromParcel = parcel.readInt() == 0 ? null : PhotosTagsSuggestionItemEndCardDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList = new ArrayList(readInt2);
                    int i = 0;
                    while (i != readInt2) {
                        i = en.a(PhotosTagsSuggestionItemDto.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemRecognizeBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString2 = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemRecognizeBlockDto.class.getClassLoader());
                Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemRecognizeBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemRecognizeBlockDto(newsfeedNewsfeedItemTypeDto, userId, readInt, createFromParcel, readString, arrayList, valueOf, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, readString2, wallPostActivityDto, valueOf5, newsfeedPushSubscriptionDto, valueOf4, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemRecognizeBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemRecognizeBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemRecognizeBlockDto[] newArray(int i) {
                return new NewsfeedItemRecognizeBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemRecognizeBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, PhotosTagsSuggestionItemEndCardDto photosTagsSuggestionItemEndCardDto, String str, List list, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : photosTagsSuggestionItemEndCardDto, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? null : bool2, (i2 & 256) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 512) != 0 ? null : bool3, (i2 & 1024) != 0 ? null : str2, (i2 & 2048) != 0 ? null : wallPostActivityDto, (i2 & 4096) != 0 ? null : f, (i2 & 8192) != 0 ? null : newsfeedPushSubscriptionDto, (i2 & 16384) != 0 ? null : bool4, (32768 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 65536) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final NewsfeedNewsfeedItemTypeDto d() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemRecognizeBlockDto)) {
                return false;
            }
            NewsfeedItemRecognizeBlockDto newsfeedItemRecognizeBlockDto = (NewsfeedItemRecognizeBlockDto) obj;
            return this.type == newsfeedItemRecognizeBlockDto.type && epx.f(this.sourceId, newsfeedItemRecognizeBlockDto.sourceId) && this.date == newsfeedItemRecognizeBlockDto.date && epx.f(this.endCard, newsfeedItemRecognizeBlockDto.endCard) && epx.f(this.recognitionArticleLink, newsfeedItemRecognizeBlockDto.recognitionArticleLink) && epx.f(this.items, newsfeedItemRecognizeBlockDto.items) && epx.f(this.isAsync, newsfeedItemRecognizeBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedItemRecognizeBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemRecognizeBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemRecognizeBlockDto.keepOffline) && epx.f(this.trackCode, newsfeedItemRecognizeBlockDto.trackCode) && epx.f(this.activity, newsfeedItemRecognizeBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemRecognizeBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemRecognizeBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemRecognizeBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemRecognizeBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemRecognizeBlockDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            PhotosTagsSuggestionItemEndCardDto photosTagsSuggestionItemEndCardDto = this.endCard;
            int hashCode = (a2 + (photosTagsSuggestionItemEndCardDto == null ? 0 : photosTagsSuggestionItemEndCardDto.hashCode())) * 31;
            String str = this.recognitionArticleLink;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<PhotosTagsSuggestionItemDto> list = this.items;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.canIgnore;
            int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode6 = (hashCode5 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str2 = this.trackCode;
            int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode9 = (hashCode8 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode10 = (hashCode9 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode11 = (hashCode10 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode12 = (hashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode13 = (hashCode12 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode13 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemRecognizeBlockDto(type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", endCard=");
            sb.append(this.endCard);
            sb.append(", recognitionArticleLink=");
            sb.append(this.recognitionArticleLink);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            PhotosTagsSuggestionItemEndCardDto photosTagsSuggestionItemEndCardDto = this.endCard;
            if (photosTagsSuggestionItemEndCardDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                photosTagsSuggestionItemEndCardDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.recognitionArticleLink);
            List<PhotosTagsSuggestionItemDto> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((PhotosTagsSuggestionItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f2 = this.shortTextRate;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f2);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemRecognizeBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, PhotosTagsSuggestionItemEndCardDto photosTagsSuggestionItemEndCardDto, String str, List<PhotosTagsSuggestionItemDto> list, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.endCard = photosTagsSuggestionItemEndCardDto;
            this.recognitionArticleLink = str;
            this.items = list;
            this.isAsync = bool;
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.trackCode = str2;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemRecommendedAppBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemRecommendedAppBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        /* renamed from: app, reason: collision with root package name */
        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        private final AppsAppDto f80app;

        @pmi0("app_cover")
        private final List<BaseImageDto> appCover;

        @pmi0("button_text")
        private final String buttonText;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("description")
        private final String description;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("friends_avatars")
        private final List<List<BaseImageDto>> friendsAvatars;

        @pmi0("friends_playing_text")
        private final String friendsPlayingText;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemRecommendedAppBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemRecommendedAppBlockDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ArrayList arrayList2;
                AppsAppDto appsAppDto = (AppsAppDto) parcel.readParcelable(NewsfeedItemRecommendedAppBlockDto.class.getClassLoader());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemRecommendedAppBlockDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemRecommendedAppBlockDto.class.getClassLoader());
                int readInt = parcel.readInt();
                String readString3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt2);
                    for (int i = 0; i != readInt2; i++) {
                        int readInt3 = parcel.readInt();
                        ArrayList arrayList4 = new ArrayList(readInt3);
                        int i2 = 0;
                        while (i2 != readInt3) {
                            i2 = bo.b(NewsfeedItemRecommendedAppBlockDto.class, parcel, arrayList4, i2, 1);
                        }
                        arrayList3.add(arrayList4);
                    }
                    arrayList = arrayList3;
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt4 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt4);
                    int i3 = 0;
                    while (i3 != readInt4) {
                        i3 = bo.b(NewsfeedItemRecommendedAppBlockDto.class, parcel, arrayList2, i3, 1);
                    }
                }
                return new NewsfeedItemRecommendedAppBlockDto(appsAppDto, readString, readString2, newsfeedNewsfeedItemTypeDto, userId, readInt, readString3, arrayList, arrayList2, parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemRecommendedAppBlockDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), (WallPostActivityDto) parcel.readParcelable(NewsfeedItemRecommendedAppBlockDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemRecommendedAppBlockDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemRecommendedAppBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemRecommendedAppBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemRecommendedAppBlockDto[] newArray(int i) {
                return new NewsfeedItemRecommendedAppBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemRecommendedAppBlockDto(AppsAppDto appsAppDto, String str, String str2, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str3, List list, List list2, String str4, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str5, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(appsAppDto, str, str2, newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : list, (i2 & 256) != 0 ? null : list2, (i2 & 512) != 0 ? null : str4, (i2 & 1024) != 0 ? null : bool, (i2 & 2048) != 0 ? null : bool2, (i2 & 4096) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 8192) != 0 ? null : bool3, (i2 & 16384) != 0 ? null : str5, (32768 & i2) != 0 ? null : wallPostActivityDto, (65536 & i2) != 0 ? null : f, (131072 & i2) != 0 ? null : newsfeedPushSubscriptionDto, (262144 & i2) != 0 ? null : bool4, (524288 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final AppsAppDto d() {
            return this.f80app;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<BaseImageDto> e() {
            return this.appCover;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemRecommendedAppBlockDto)) {
                return false;
            }
            NewsfeedItemRecommendedAppBlockDto newsfeedItemRecommendedAppBlockDto = (NewsfeedItemRecommendedAppBlockDto) obj;
            return epx.f(this.f80app, newsfeedItemRecommendedAppBlockDto.f80app) && epx.f(this.title, newsfeedItemRecommendedAppBlockDto.title) && epx.f(this.buttonText, newsfeedItemRecommendedAppBlockDto.buttonText) && this.type == newsfeedItemRecommendedAppBlockDto.type && epx.f(this.sourceId, newsfeedItemRecommendedAppBlockDto.sourceId) && this.date == newsfeedItemRecommendedAppBlockDto.date && epx.f(this.friendsPlayingText, newsfeedItemRecommendedAppBlockDto.friendsPlayingText) && epx.f(this.friendsAvatars, newsfeedItemRecommendedAppBlockDto.friendsAvatars) && epx.f(this.appCover, newsfeedItemRecommendedAppBlockDto.appCover) && epx.f(this.description, newsfeedItemRecommendedAppBlockDto.description) && epx.f(this.isAsync, newsfeedItemRecommendedAppBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedItemRecommendedAppBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemRecommendedAppBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemRecommendedAppBlockDto.keepOffline) && epx.f(this.trackCode, newsfeedItemRecommendedAppBlockDto.trackCode) && epx.f(this.activity, newsfeedItemRecommendedAppBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemRecommendedAppBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemRecommendedAppBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemRecommendedAppBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemRecommendedAppBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemRecommendedAppBlockDto.debugInfo);
        }

        public final String f() {
            return this.buttonText;
        }

        public final NewsfeedNewsfeedItemCaptionDto g() {
            return this.caption;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a((this.type.hashCode() + urd0.a(urd0.a(this.f80app.hashCode() * 31, 31, this.title), 31, this.buttonText)) * 31, 31, this.sourceId.b), 31);
            String str = this.friendsPlayingText;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            List<List<BaseImageDto>> list = this.friendsAvatars;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<BaseImageDto> list2 = this.appCover;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str2 = this.description;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.canIgnore;
            int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode7 = (hashCode6 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str3 = this.trackCode;
            int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode10 = (hashCode9 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode11 = (hashCode10 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode12 = (hashCode11 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode13 = (hashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode14 = (hashCode13 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode14 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final NewsfeedItemDebugInfoDto i() {
            return this.debugInfo;
        }

        public final NewsfeedItemWallpostFeedbackDto j() {
            return this.feedback;
        }

        public final List<List<BaseImageDto>> k() {
            return this.friendsAvatars;
        }

        public final String l() {
            return this.friendsPlayingText;
        }

        public final Boolean n() {
            return this.keepOffline;
        }

        public final NewsfeedNewsfeedItemTypeDto o() {
            return this.type;
        }

        public final Boolean p() {
            return this.isAsync;
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemRecommendedAppBlockDto(app=");
            sb.append(this.f80app);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", buttonText=");
            sb.append(this.buttonText);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", friendsPlayingText=");
            sb.append(this.friendsPlayingText);
            sb.append(", friendsAvatars=");
            sb.append(this.friendsAvatars);
            sb.append(", appCover=");
            sb.append(this.appCover);
            sb.append(", description=");
            sb.append(this.description);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f80app, i);
            parcel.writeString(this.title);
            parcel.writeString(this.buttonText);
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            parcel.writeString(this.friendsPlayingText);
            List<List<BaseImageDto>> list = this.friendsAvatars;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    Iterator a2 = ao.a(parcel, (List) f.next());
                    while (a2.hasNext()) {
                        parcel.writeParcelable((Parcelable) a2.next(), i);
                    }
                }
            }
            List<BaseImageDto> list2 = this.appCover;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f2 = dn.f(parcel, list2, 1);
                while (f2.hasNext()) {
                    parcel.writeParcelable((Parcelable) f2.next(), i);
                }
            }
            parcel.writeString(this.description);
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f3 = this.shortTextRate;
            if (f3 == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f3);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NewsfeedItemRecommendedAppBlockDto(AppsAppDto appsAppDto, String str, String str2, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str3, List<? extends List<BaseImageDto>> list, List<BaseImageDto> list2, String str4, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str5, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.f80app = appsAppDto;
            this.title = str;
            this.buttonText = str2;
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.friendsPlayingText = str3;
            this.friendsAvatars = list;
            this.appCover = list2;
            this.description = str4;
            this.isAsync = bool;
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.trackCode = str5;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemRecommendedArtistsBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemRecommendedArtistsBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("artists")
        private final List<AudioArtistDto> artists;

        @pmi0("button")
        private final BaseLinkButtonDto button;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("recommended_artists")
            public static final TypeDto RECOMMENDED_ARTISTS;
            private final String value;

            /* compiled from: NewsfeedNewsfeedItemDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("RECOMMENDED_ARTISTS", 0, "recommended_artists");
                RECOMMENDED_ARTISTS = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String i() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemRecommendedArtistsBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemRecommendedArtistsBlockDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                String readString = parcel.readString();
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                BaseLinkButtonDto baseLinkButtonDto = (BaseLinkButtonDto) parcel.readParcelable(NewsfeedItemRecommendedArtistsBlockDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemRecommendedArtistsBlockDto.class.getClassLoader());
                int readInt = parcel.readInt();
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList = new ArrayList(readInt2);
                    int i = 0;
                    while (i != readInt2) {
                        i = bo.b(NewsfeedItemRecommendedArtistsBlockDto.class, parcel, arrayList, i, 1);
                    }
                }
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemRecommendedArtistsBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemRecommendedArtistsBlockDto.class.getClassLoader());
                Float valueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemRecommendedArtistsBlockDto.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemRecommendedArtistsBlockDto(readString, createFromParcel, baseLinkButtonDto, userId, readInt, arrayList, readString2, valueOf, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, wallPostActivityDto, valueOf4, newsfeedPushSubscriptionDto, bool, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemRecommendedArtistsBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemRecommendedArtistsBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemRecommendedArtistsBlockDto[] newArray(int i) {
                return new NewsfeedItemRecommendedArtistsBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemRecommendedArtistsBlockDto(String str, TypeDto typeDto, BaseLinkButtonDto baseLinkButtonDto, UserId userId, int i, List list, String str2, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(str, typeDto, baseLinkButtonDto, userId, i, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? null : bool, (i2 & 256) != 0 ? null : bool2, (i2 & 512) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 1024) != 0 ? null : bool3, (i2 & 2048) != 0 ? null : wallPostActivityDto, (i2 & 4096) != 0 ? null : f, (i2 & 8192) != 0 ? null : newsfeedPushSubscriptionDto, (i2 & 16384) != 0 ? null : bool4, (32768 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 65536) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final TypeDto d() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemRecommendedArtistsBlockDto)) {
                return false;
            }
            NewsfeedItemRecommendedArtistsBlockDto newsfeedItemRecommendedArtistsBlockDto = (NewsfeedItemRecommendedArtistsBlockDto) obj;
            return epx.f(this.title, newsfeedItemRecommendedArtistsBlockDto.title) && this.type == newsfeedItemRecommendedArtistsBlockDto.type && epx.f(this.button, newsfeedItemRecommendedArtistsBlockDto.button) && epx.f(this.sourceId, newsfeedItemRecommendedArtistsBlockDto.sourceId) && this.date == newsfeedItemRecommendedArtistsBlockDto.date && epx.f(this.artists, newsfeedItemRecommendedArtistsBlockDto.artists) && epx.f(this.trackCode, newsfeedItemRecommendedArtistsBlockDto.trackCode) && epx.f(this.isAsync, newsfeedItemRecommendedArtistsBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedItemRecommendedArtistsBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemRecommendedArtistsBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemRecommendedArtistsBlockDto.keepOffline) && epx.f(this.activity, newsfeedItemRecommendedArtistsBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemRecommendedArtistsBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemRecommendedArtistsBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemRecommendedArtistsBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemRecommendedArtistsBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemRecommendedArtistsBlockDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a((this.button.hashCode() + ((this.type.hashCode() + (this.title.hashCode() * 31)) * 31)) * 31, 31, this.sourceId.b), 31);
            List<AudioArtistDto> list = this.artists;
            int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.canIgnore;
            int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode5 = (hashCode4 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode7 = (hashCode6 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode9 = (hashCode8 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode10 = (hashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode11 = (hashCode10 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode11 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemRecommendedArtistsBlockDto(title=");
            sb.append(this.title);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", button=");
            sb.append(this.button);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", artists=");
            sb.append(this.artists);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.button, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            List<AudioArtistDto> list = this.artists;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            parcel.writeString(this.trackCode);
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeParcelable(this.activity, i);
            Float f2 = this.shortTextRate;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f2);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemRecommendedArtistsBlockDto(String str, TypeDto typeDto, BaseLinkButtonDto baseLinkButtonDto, UserId userId, int i, List<AudioArtistDto> list, String str2, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.title = str;
            this.type = typeDto;
            this.button = baseLinkButtonDto;
            this.sourceId = userId;
            this.date = i;
            this.artists = list;
            this.trackCode = str2;
            this.isAsync = bool;
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemRecommendedAudiosBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemRecommendedAudiosBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("button")
        private final BaseLinkButtonDto button;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final boolean isAsync;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("recommended_audios")
            public static final TypeDto RECOMMENDED_AUDIOS;
            private final String value;

            /* compiled from: NewsfeedNewsfeedItemDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("RECOMMENDED_AUDIOS", 0, "recommended_audios");
                RECOMMENDED_AUDIOS = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String i() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemRecommendedAudiosBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemRecommendedAudiosBlockDto createFromParcel(Parcel parcel) {
                Class cls;
                boolean z;
                Boolean valueOf;
                Boolean valueOf2;
                String readString = parcel.readString();
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                BaseLinkButtonDto baseLinkButtonDto = (BaseLinkButtonDto) parcel.readParcelable(NewsfeedItemRecommendedAudiosBlockDto.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    cls = NewsfeedItemRecommendedAudiosBlockDto.class;
                    z = true;
                } else {
                    cls = NewsfeedItemRecommendedAudiosBlockDto.class;
                    z = false;
                }
                UserId userId = (UserId) parcel.readParcelable(cls.getClassLoader());
                Class cls2 = cls;
                int readInt = parcel.readInt();
                String readString2 = parcel.readString();
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(cls2.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(cls2.getClassLoader());
                Float valueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(cls2.getClassLoader());
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemRecommendedAudiosBlockDto(readString, createFromParcel, baseLinkButtonDto, z, userId, readInt, readString2, valueOf, newsfeedNewsfeedItemCaptionDto, valueOf2, wallPostActivityDto, valueOf3, newsfeedPushSubscriptionDto, bool, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(cls2.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(cls2.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemRecommendedAudiosBlockDto[] newArray(int i) {
                return new NewsfeedItemRecommendedAudiosBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemRecommendedAudiosBlockDto(String str, TypeDto typeDto, BaseLinkButtonDto baseLinkButtonDto, boolean z, UserId userId, int i, String str2, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(str, typeDto, baseLinkButtonDto, z, userId, i, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? null : bool, (i2 & 256) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 512) != 0 ? null : bool2, (i2 & 1024) != 0 ? null : wallPostActivityDto, (i2 & 2048) != 0 ? null : f, (i2 & 4096) != 0 ? null : newsfeedPushSubscriptionDto, (i2 & 8192) != 0 ? null : bool3, (i2 & 16384) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 32768) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final TypeDto d() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemRecommendedAudiosBlockDto)) {
                return false;
            }
            NewsfeedItemRecommendedAudiosBlockDto newsfeedItemRecommendedAudiosBlockDto = (NewsfeedItemRecommendedAudiosBlockDto) obj;
            return epx.f(this.title, newsfeedItemRecommendedAudiosBlockDto.title) && this.type == newsfeedItemRecommendedAudiosBlockDto.type && epx.f(this.button, newsfeedItemRecommendedAudiosBlockDto.button) && this.isAsync == newsfeedItemRecommendedAudiosBlockDto.isAsync && epx.f(this.sourceId, newsfeedItemRecommendedAudiosBlockDto.sourceId) && this.date == newsfeedItemRecommendedAudiosBlockDto.date && epx.f(this.trackCode, newsfeedItemRecommendedAudiosBlockDto.trackCode) && epx.f(this.canIgnore, newsfeedItemRecommendedAudiosBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemRecommendedAudiosBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemRecommendedAudiosBlockDto.keepOffline) && epx.f(this.activity, newsfeedItemRecommendedAudiosBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemRecommendedAudiosBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemRecommendedAudiosBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemRecommendedAudiosBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemRecommendedAudiosBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemRecommendedAudiosBlockDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(qoy.b((this.button.hashCode() + ((this.type.hashCode() + (this.title.hashCode() * 31)) * 31)) * 31, 31, this.isAsync), 31, this.sourceId.b), 31);
            String str = this.trackCode;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.canIgnore;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode3 = (hashCode2 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool2 = this.keepOffline;
            int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode5 = (hashCode4 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode7 = (hashCode6 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool3 = this.suggestSubscribe;
            int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode9 = (hashCode8 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode9 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemRecommendedAudiosBlockDto(title=");
            sb.append(this.title);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", button=");
            sb.append(this.button);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.button, i);
            parcel.writeInt(this.isAsync ? 1 : 0);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            parcel.writeString(this.trackCode);
            Boolean bool = this.canIgnore;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool2 = this.keepOffline;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool3 = this.suggestSubscribe;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemRecommendedAudiosBlockDto(String str, TypeDto typeDto, BaseLinkButtonDto baseLinkButtonDto, boolean z, UserId userId, int i, String str2, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.title = str;
            this.type = typeDto;
            this.button = baseLinkButtonDto;
            this.isAsync = z;
            this.sourceId = userId;
            this.date = i;
            this.trackCode = str2;
            this.canIgnore = bool;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool2;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool3;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemRecommendedChannelsBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemRecommendedChannelsBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemRecommendedChannelsBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemRecommendedChannelsBlockDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemRecommendedChannelsBlockDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemRecommendedChannelsBlockDto.class.getClassLoader());
                int readInt = parcel.readInt();
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemRecommendedChannelsBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemRecommendedChannelsBlockDto.class.getClassLoader());
                Float valueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemRecommendedChannelsBlockDto.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemRecommendedChannelsBlockDto(newsfeedNewsfeedItemTypeDto, userId, readInt, valueOf, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, readString, wallPostActivityDto, valueOf4, newsfeedPushSubscriptionDto, bool, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemRecommendedChannelsBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemRecommendedChannelsBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemRecommendedChannelsBlockDto[] newArray(int i) {
                return new NewsfeedItemRecommendedChannelsBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemRecommendedChannelsBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? null : bool2, (i2 & 32) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 64) != 0 ? null : bool3, (i2 & 128) != 0 ? null : str, (i2 & 256) != 0 ? null : wallPostActivityDto, (i2 & 512) != 0 ? null : f, (i2 & 1024) != 0 ? null : newsfeedPushSubscriptionDto, (i2 & 2048) != 0 ? null : bool4, (i2 & 4096) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 8192) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final NewsfeedItemDebugInfoDto d() {
            return this.debugInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final NewsfeedItemWallpostFeedbackDto e() {
            return this.feedback;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemRecommendedChannelsBlockDto)) {
                return false;
            }
            NewsfeedItemRecommendedChannelsBlockDto newsfeedItemRecommendedChannelsBlockDto = (NewsfeedItemRecommendedChannelsBlockDto) obj;
            return this.type == newsfeedItemRecommendedChannelsBlockDto.type && epx.f(this.sourceId, newsfeedItemRecommendedChannelsBlockDto.sourceId) && this.date == newsfeedItemRecommendedChannelsBlockDto.date && epx.f(this.isAsync, newsfeedItemRecommendedChannelsBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedItemRecommendedChannelsBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemRecommendedChannelsBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemRecommendedChannelsBlockDto.keepOffline) && epx.f(this.trackCode, newsfeedItemRecommendedChannelsBlockDto.trackCode) && epx.f(this.activity, newsfeedItemRecommendedChannelsBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemRecommendedChannelsBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemRecommendedChannelsBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemRecommendedChannelsBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemRecommendedChannelsBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemRecommendedChannelsBlockDto.debugInfo);
        }

        public final Boolean f() {
            return this.keepOffline;
        }

        public final NewsfeedNewsfeedItemTypeDto g() {
            return this.type;
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            Boolean bool = this.isAsync;
            int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.canIgnore;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode3 = (hashCode2 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode6 = (hashCode5 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode8 = (hashCode7 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode9 = (hashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode10 = (hashCode9 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode10 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final Boolean i() {
            return this.isAsync;
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemRecommendedChannelsBlockDto(type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemRecommendedChannelsBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.isAsync = bool;
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.trackCode = str;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemRecommendedChatsBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemRecommendedChatsBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("button")
        private final BaseLinkButtonDto button;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("count")
        private final int count;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("items")
        private final List<MessagesChatSuggestionDto> items;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("next_from")
        private final String nextFrom;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemRecommendedChatsBlockDto> {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemRecommendedChatsBlockDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean bool;
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MessagesChatSuggestionDto.CREATOR, parcel, arrayList, i, 1);
                }
                int readInt2 = parcel.readInt();
                BaseLinkButtonDto baseLinkButtonDto = (BaseLinkButtonDto) parcel.readParcelable(NewsfeedItemRecommendedChatsBlockDto.class.getClassLoader());
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemRecommendedChatsBlockDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemRecommendedChatsBlockDto.class.getClassLoader());
                int readInt3 = parcel.readInt();
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemRecommendedChatsBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                    bool = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                    bool = null;
                }
                String readString2 = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemRecommendedChatsBlockDto.class.getClassLoader());
                Object valueOf4 = parcel.readInt() == 0 ? bool : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemRecommendedChatsBlockDto.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemRecommendedChatsBlockDto(arrayList, readInt2, baseLinkButtonDto, newsfeedNewsfeedItemTypeDto, userId, readInt3, readString, valueOf, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, readString2, wallPostActivityDto, valueOf4, newsfeedPushSubscriptionDto, bool, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemRecommendedChatsBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemRecommendedChatsBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemRecommendedChatsBlockDto[] newArray(int i) {
                return new NewsfeedItemRecommendedChatsBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemRecommendedChatsBlockDto(List list, int i, BaseLinkButtonDto baseLinkButtonDto, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i2, String str, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i3, zcl zclVar) {
            this(list, i, baseLinkButtonDto, newsfeedNewsfeedItemTypeDto, userId, i2, (i3 & 64) != 0 ? null : str, (i3 & 128) != 0 ? null : bool, (i3 & 256) != 0 ? null : bool2, (i3 & 512) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i3 & 1024) != 0 ? null : bool3, (i3 & 2048) != 0 ? null : str2, (i3 & 4096) != 0 ? null : wallPostActivityDto, (i3 & 8192) != 0 ? null : f, (i3 & 16384) != 0 ? null : newsfeedPushSubscriptionDto, (32768 & i3) != 0 ? null : bool4, (65536 & i3) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i3 & 131072) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemRecommendedChatsBlockDto)) {
                return false;
            }
            NewsfeedItemRecommendedChatsBlockDto newsfeedItemRecommendedChatsBlockDto = (NewsfeedItemRecommendedChatsBlockDto) obj;
            return epx.f(this.items, newsfeedItemRecommendedChatsBlockDto.items) && this.count == newsfeedItemRecommendedChatsBlockDto.count && epx.f(this.button, newsfeedItemRecommendedChatsBlockDto.button) && this.type == newsfeedItemRecommendedChatsBlockDto.type && epx.f(this.sourceId, newsfeedItemRecommendedChatsBlockDto.sourceId) && this.date == newsfeedItemRecommendedChatsBlockDto.date && epx.f(this.nextFrom, newsfeedItemRecommendedChatsBlockDto.nextFrom) && epx.f(this.isAsync, newsfeedItemRecommendedChatsBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedItemRecommendedChatsBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemRecommendedChatsBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemRecommendedChatsBlockDto.keepOffline) && epx.f(this.trackCode, newsfeedItemRecommendedChatsBlockDto.trackCode) && epx.f(this.activity, newsfeedItemRecommendedChatsBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemRecommendedChatsBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemRecommendedChatsBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemRecommendedChatsBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemRecommendedChatsBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemRecommendedChatsBlockDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a((this.type.hashCode() + ((this.button.hashCode() + shy.a(this.count, this.items.hashCode() * 31, 31)) * 31)) * 31, 31, this.sourceId.b), 31);
            String str = this.nextFrom;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.canIgnore;
            int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode4 = (hashCode3 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str2 = this.trackCode;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode7 = (hashCode6 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode9 = (hashCode8 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode10 = (hashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode11 = (hashCode10 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode11 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemRecommendedChatsBlockDto(items=");
            sb.append(this.items);
            sb.append(", count=");
            sb.append(this.count);
            sb.append(", button=");
            sb.append(this.button);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", nextFrom=");
            sb.append(this.nextFrom);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((MessagesChatSuggestionDto) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeInt(this.count);
            parcel.writeParcelable(this.button, i);
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            parcel.writeString(this.nextFrom);
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemRecommendedChatsBlockDto(List<MessagesChatSuggestionDto> list, int i, BaseLinkButtonDto baseLinkButtonDto, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i2, String str, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.items = list;
            this.count = i;
            this.button = baseLinkButtonDto;
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i2;
            this.nextFrom = str;
            this.isAsync = bool;
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.trackCode = str2;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemRecommendedGroupsBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemRecommendedGroupsBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("button")
        private final BaseLinkButtonDto button;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("count")
        private final int count;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final boolean isAsync;

        @pmi0("items")
        private final List<GroupsSuggestionDto> items;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("next_from")
        private final String nextFrom;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemRecommendedGroupsBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemRecommendedGroupsBlockDto createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Boolean valueOf;
                Boolean valueOf2;
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (true) {
                    z = true;
                    if (i == readInt) {
                        break;
                    }
                    i = en.a(GroupsSuggestionDto.CREATOR, parcel, arrayList, i, 1);
                }
                int readInt2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z = false;
                }
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemRecommendedGroupsBlockDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemRecommendedGroupsBlockDto.class.getClassLoader());
                int readInt3 = parcel.readInt();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                BaseLinkButtonDto baseLinkButtonDto = (BaseLinkButtonDto) parcel.readParcelable(NewsfeedItemRecommendedGroupsBlockDto.class.getClassLoader());
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0 ? z2 : false);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemRecommendedGroupsBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0 ? z2 : false);
                }
                Boolean bool2 = valueOf;
                String readString3 = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemRecommendedGroupsBlockDto.class.getClassLoader());
                Float valueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemRecommendedGroupsBlockDto.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemRecommendedGroupsBlockDto(arrayList, readInt2, z, newsfeedNewsfeedItemTypeDto, userId, readInt3, readString, readString2, baseLinkButtonDto, bool2, newsfeedNewsfeedItemCaptionDto, valueOf2, readString3, wallPostActivityDto, valueOf3, newsfeedPushSubscriptionDto, bool, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemRecommendedGroupsBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemRecommendedGroupsBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemRecommendedGroupsBlockDto[] newArray(int i) {
                return new NewsfeedItemRecommendedGroupsBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemRecommendedGroupsBlockDto(List list, int i, boolean z, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i2, String str, String str2, BaseLinkButtonDto baseLinkButtonDto, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i3, zcl zclVar) {
            this(list, i, z, newsfeedNewsfeedItemTypeDto, userId, i2, (i3 & 64) != 0 ? null : str, (i3 & 128) != 0 ? null : str2, (i3 & 256) != 0 ? null : baseLinkButtonDto, (i3 & 512) != 0 ? null : bool, (i3 & 1024) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i3 & 2048) != 0 ? null : bool2, (i3 & 4096) != 0 ? null : str3, (i3 & 8192) != 0 ? null : wallPostActivityDto, (i3 & 16384) != 0 ? null : f, (32768 & i3) != 0 ? null : newsfeedPushSubscriptionDto, (65536 & i3) != 0 ? null : bool3, (131072 & i3) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final BaseLinkButtonDto d() {
            return this.button;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final NewsfeedItemDebugInfoDto e() {
            return this.debugInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemRecommendedGroupsBlockDto)) {
                return false;
            }
            NewsfeedItemRecommendedGroupsBlockDto newsfeedItemRecommendedGroupsBlockDto = (NewsfeedItemRecommendedGroupsBlockDto) obj;
            return epx.f(this.items, newsfeedItemRecommendedGroupsBlockDto.items) && this.count == newsfeedItemRecommendedGroupsBlockDto.count && this.isAsync == newsfeedItemRecommendedGroupsBlockDto.isAsync && this.type == newsfeedItemRecommendedGroupsBlockDto.type && epx.f(this.sourceId, newsfeedItemRecommendedGroupsBlockDto.sourceId) && this.date == newsfeedItemRecommendedGroupsBlockDto.date && epx.f(this.title, newsfeedItemRecommendedGroupsBlockDto.title) && epx.f(this.nextFrom, newsfeedItemRecommendedGroupsBlockDto.nextFrom) && epx.f(this.button, newsfeedItemRecommendedGroupsBlockDto.button) && epx.f(this.canIgnore, newsfeedItemRecommendedGroupsBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemRecommendedGroupsBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemRecommendedGroupsBlockDto.keepOffline) && epx.f(this.trackCode, newsfeedItemRecommendedGroupsBlockDto.trackCode) && epx.f(this.activity, newsfeedItemRecommendedGroupsBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemRecommendedGroupsBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemRecommendedGroupsBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemRecommendedGroupsBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemRecommendedGroupsBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemRecommendedGroupsBlockDto.debugInfo);
        }

        public final NewsfeedItemWallpostFeedbackDto f() {
            return this.feedback;
        }

        public final List<GroupsSuggestionDto> g() {
            return this.items;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a((this.type.hashCode() + qoy.b(shy.a(this.count, this.items.hashCode() * 31, 31), 31, this.isAsync)) * 31, 31, this.sourceId.b), 31);
            String str = this.title;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.nextFrom;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            BaseLinkButtonDto baseLinkButtonDto = this.button;
            int hashCode3 = (hashCode2 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
            Boolean bool = this.canIgnore;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode5 = (hashCode4 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool2 = this.keepOffline;
            int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str3 = this.trackCode;
            int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode8 = (hashCode7 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode9 = (hashCode8 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode10 = (hashCode9 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool3 = this.suggestSubscribe;
            int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode12 = (hashCode11 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode12 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final Boolean i() {
            return this.keepOffline;
        }

        public final String j() {
            return this.nextFrom;
        }

        public final NewsfeedNewsfeedItemTypeDto k() {
            return this.type;
        }

        public final boolean l() {
            return this.isAsync;
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemRecommendedGroupsBlockDto(items=");
            sb.append(this.items);
            sb.append(", count=");
            sb.append(this.count);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", nextFrom=");
            sb.append(this.nextFrom);
            sb.append(", button=");
            sb.append(this.button);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((GroupsSuggestionDto) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeInt(this.count);
            parcel.writeInt(this.isAsync ? 1 : 0);
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            parcel.writeString(this.title);
            parcel.writeString(this.nextFrom);
            parcel.writeParcelable(this.button, i);
            Boolean bool = this.canIgnore;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool2 = this.keepOffline;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool3 = this.suggestSubscribe;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemRecommendedGroupsBlockDto(List<GroupsSuggestionDto> list, int i, boolean z, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i2, String str, String str2, BaseLinkButtonDto baseLinkButtonDto, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.items = list;
            this.count = i;
            this.isAsync = z;
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i2;
            this.title = str;
            this.nextFrom = str2;
            this.button = baseLinkButtonDto;
            this.canIgnore = bool;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool2;
            this.trackCode = str3;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool3;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemRecommendedNarrativesBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemRecommendedNarrativesBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("create_block_position")
        private final Integer createBlockPosition;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("narratives")
        private final List<NarrativesNarrativeDto> narratives;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("recommended_narratives")
            public static final TypeDto RECOMMENDED_NARRATIVES;
            private final String value;

            /* compiled from: NewsfeedNewsfeedItemDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("RECOMMENDED_NARRATIVES", 0, "recommended_narratives");
                RECOMMENDED_NARRATIVES = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
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

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemRecommendedNarrativesBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemRecommendedNarrativesBlockDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                String readString = parcel.readString();
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemRecommendedNarrativesBlockDto.class.getClassLoader());
                int readInt = parcel.readInt();
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList = new ArrayList(readInt2);
                    int i = 0;
                    while (i != readInt2) {
                        i = bo.b(NewsfeedItemRecommendedNarrativesBlockDto.class, parcel, arrayList, i, 1);
                    }
                }
                String readString2 = parcel.readString();
                Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemRecommendedNarrativesBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemRecommendedNarrativesBlockDto.class.getClassLoader());
                Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemRecommendedNarrativesBlockDto.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemRecommendedNarrativesBlockDto(readString, createFromParcel, userId, readInt, arrayList, readString2, valueOf4, valueOf, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, wallPostActivityDto, valueOf5, newsfeedPushSubscriptionDto, bool, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemRecommendedNarrativesBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemRecommendedNarrativesBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemRecommendedNarrativesBlockDto[] newArray(int i) {
                return new NewsfeedItemRecommendedNarrativesBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemRecommendedNarrativesBlockDto(String str, TypeDto typeDto, UserId userId, int i, List list, String str2, Integer num, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(str, typeDto, userId, i, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : bool, (i2 & 256) != 0 ? null : bool2, (i2 & 512) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 1024) != 0 ? null : bool3, (i2 & 2048) != 0 ? null : wallPostActivityDto, (i2 & 4096) != 0 ? null : f, (i2 & 8192) != 0 ? null : newsfeedPushSubscriptionDto, (i2 & 16384) != 0 ? null : bool4, (32768 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 65536) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemRecommendedNarrativesBlockDto)) {
                return false;
            }
            NewsfeedItemRecommendedNarrativesBlockDto newsfeedItemRecommendedNarrativesBlockDto = (NewsfeedItemRecommendedNarrativesBlockDto) obj;
            return epx.f(this.title, newsfeedItemRecommendedNarrativesBlockDto.title) && this.type == newsfeedItemRecommendedNarrativesBlockDto.type && epx.f(this.sourceId, newsfeedItemRecommendedNarrativesBlockDto.sourceId) && this.date == newsfeedItemRecommendedNarrativesBlockDto.date && epx.f(this.narratives, newsfeedItemRecommendedNarrativesBlockDto.narratives) && epx.f(this.trackCode, newsfeedItemRecommendedNarrativesBlockDto.trackCode) && epx.f(this.createBlockPosition, newsfeedItemRecommendedNarrativesBlockDto.createBlockPosition) && epx.f(this.isAsync, newsfeedItemRecommendedNarrativesBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedItemRecommendedNarrativesBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemRecommendedNarrativesBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemRecommendedNarrativesBlockDto.keepOffline) && epx.f(this.activity, newsfeedItemRecommendedNarrativesBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemRecommendedNarrativesBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemRecommendedNarrativesBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemRecommendedNarrativesBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemRecommendedNarrativesBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemRecommendedNarrativesBlockDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a((this.type.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.sourceId.b), 31);
            List<NarrativesNarrativeDto> list = this.narratives;
            int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.createBlockPosition;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.canIgnore;
            int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode6 = (hashCode5 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode8 = (hashCode7 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode9 = (hashCode8 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode10 = (hashCode9 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode11 = (hashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode12 = (hashCode11 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode12 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemRecommendedNarrativesBlockDto(title=");
            sb.append(this.title);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", narratives=");
            sb.append(this.narratives);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", createBlockPosition=");
            sb.append(this.createBlockPosition);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            List<NarrativesNarrativeDto> list = this.narratives;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            parcel.writeString(this.trackCode);
            Integer num = this.createBlockPosition;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeParcelable(this.activity, i);
            Float f2 = this.shortTextRate;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f2);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemRecommendedNarrativesBlockDto(String str, TypeDto typeDto, UserId userId, int i, List<NarrativesNarrativeDto> list, String str2, Integer num, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.title = str;
            this.type = typeDto;
            this.sourceId = userId;
            this.date = i;
            this.narratives = list;
            this.trackCode = str2;
            this.createBlockPosition = num;
            this.isAsync = bool;
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemSignalsDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemSignalsDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemSignalsDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemSignalsDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemSignalsDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemSignalsDto.class.getClassLoader());
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemSignalsDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                boolean z = true;
                String readString2 = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemSignalsDto.class.getClassLoader());
                Float valueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemSignalsDto.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    if (parcel.readInt() == 0) {
                        z = false;
                    }
                    bool = Boolean.valueOf(z);
                }
                return new NewsfeedItemSignalsDto(newsfeedNewsfeedItemTypeDto, userId, readInt, readString, valueOf, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, readString2, wallPostActivityDto, valueOf4, newsfeedPushSubscriptionDto, bool, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemSignalsDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemSignalsDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemSignalsDto[] newArray(int i) {
                return new NewsfeedItemSignalsDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemSignalsDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : bool2, (i2 & 64) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 128) != 0 ? null : bool3, (i2 & 256) != 0 ? null : str2, (i2 & 512) != 0 ? null : wallPostActivityDto, (i2 & 1024) != 0 ? null : f, (i2 & 2048) != 0 ? null : newsfeedPushSubscriptionDto, (i2 & 4096) != 0 ? null : bool4, (i2 & 8192) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 16384) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemSignalsDto)) {
                return false;
            }
            NewsfeedItemSignalsDto newsfeedItemSignalsDto = (NewsfeedItemSignalsDto) obj;
            return this.type == newsfeedItemSignalsDto.type && epx.f(this.sourceId, newsfeedItemSignalsDto.sourceId) && this.date == newsfeedItemSignalsDto.date && epx.f(this.title, newsfeedItemSignalsDto.title) && epx.f(this.isAsync, newsfeedItemSignalsDto.isAsync) && epx.f(this.canIgnore, newsfeedItemSignalsDto.canIgnore) && epx.f(this.caption, newsfeedItemSignalsDto.caption) && epx.f(this.keepOffline, newsfeedItemSignalsDto.keepOffline) && epx.f(this.trackCode, newsfeedItemSignalsDto.trackCode) && epx.f(this.activity, newsfeedItemSignalsDto.activity) && epx.f(this.shortTextRate, newsfeedItemSignalsDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemSignalsDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemSignalsDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemSignalsDto.feedback) && epx.f(this.debugInfo, newsfeedItemSignalsDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            String str = this.title;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.canIgnore;
            int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode4 = (hashCode3 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str2 = this.trackCode;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode7 = (hashCode6 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode9 = (hashCode8 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode10 = (hashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode11 = (hashCode10 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode11 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemSignalsDto(type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            parcel.writeString(this.title);
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemSignalsDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.title = str;
            this.isAsync = bool;
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.trackCode = str2;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemStoriesInterestingBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemStoriesInterestingBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemStoriesInterestingBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemStoriesInterestingBlockDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemStoriesInterestingBlockDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemStoriesInterestingBlockDto.class.getClassLoader());
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemStoriesInterestingBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                boolean z = true;
                String readString2 = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemStoriesInterestingBlockDto.class.getClassLoader());
                Float valueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemStoriesInterestingBlockDto.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    if (parcel.readInt() == 0) {
                        z = false;
                    }
                    bool = Boolean.valueOf(z);
                }
                return new NewsfeedItemStoriesInterestingBlockDto(newsfeedNewsfeedItemTypeDto, userId, readInt, readString, valueOf, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, readString2, wallPostActivityDto, valueOf4, newsfeedPushSubscriptionDto, bool, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemStoriesInterestingBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemStoriesInterestingBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemStoriesInterestingBlockDto[] newArray(int i) {
                return new NewsfeedItemStoriesInterestingBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemStoriesInterestingBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : bool2, (i2 & 64) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 128) != 0 ? null : bool3, (i2 & 256) != 0 ? null : str2, (i2 & 512) != 0 ? null : wallPostActivityDto, (i2 & 1024) != 0 ? null : f, (i2 & 2048) != 0 ? null : newsfeedPushSubscriptionDto, (i2 & 4096) != 0 ? null : bool4, (i2 & 8192) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 16384) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final NewsfeedNewsfeedItemTypeDto d() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemStoriesInterestingBlockDto)) {
                return false;
            }
            NewsfeedItemStoriesInterestingBlockDto newsfeedItemStoriesInterestingBlockDto = (NewsfeedItemStoriesInterestingBlockDto) obj;
            return this.type == newsfeedItemStoriesInterestingBlockDto.type && epx.f(this.sourceId, newsfeedItemStoriesInterestingBlockDto.sourceId) && this.date == newsfeedItemStoriesInterestingBlockDto.date && epx.f(this.title, newsfeedItemStoriesInterestingBlockDto.title) && epx.f(this.isAsync, newsfeedItemStoriesInterestingBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedItemStoriesInterestingBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemStoriesInterestingBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemStoriesInterestingBlockDto.keepOffline) && epx.f(this.trackCode, newsfeedItemStoriesInterestingBlockDto.trackCode) && epx.f(this.activity, newsfeedItemStoriesInterestingBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemStoriesInterestingBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemStoriesInterestingBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemStoriesInterestingBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemStoriesInterestingBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemStoriesInterestingBlockDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            String str = this.title;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.canIgnore;
            int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode4 = (hashCode3 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str2 = this.trackCode;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode7 = (hashCode6 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode9 = (hashCode8 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode10 = (hashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode11 = (hashCode10 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode11 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemStoriesInterestingBlockDto(type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            parcel.writeString(this.title);
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemStoriesInterestingBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.title = str;
            this.isAsync = bool;
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.trackCode = str2;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemTextliveBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemTextliveBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("textlive_textpost_block")
        private final TextlivesTextliveTextpostBlockDto textliveTextpostBlock;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemTextliveBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemTextliveBlockDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                TextlivesTextliveTextpostBlockDto textlivesTextliveTextpostBlockDto = (TextlivesTextliveTextpostBlockDto) parcel.readParcelable(NewsfeedItemTextliveBlockDto.class.getClassLoader());
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemTextliveBlockDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemTextliveBlockDto.class.getClassLoader());
                int readInt = parcel.readInt();
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemTextliveBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                boolean z = true;
                String readString = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemTextliveBlockDto.class.getClassLoader());
                Float valueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemTextliveBlockDto.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    if (parcel.readInt() == 0) {
                        z = false;
                    }
                    bool = Boolean.valueOf(z);
                }
                return new NewsfeedItemTextliveBlockDto(textlivesTextliveTextpostBlockDto, newsfeedNewsfeedItemTypeDto, userId, readInt, valueOf, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, readString, wallPostActivityDto, valueOf4, newsfeedPushSubscriptionDto, bool, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemTextliveBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemTextliveBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemTextliveBlockDto[] newArray(int i) {
                return new NewsfeedItemTextliveBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemTextliveBlockDto(TextlivesTextliveTextpostBlockDto textlivesTextliveTextpostBlockDto, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(textlivesTextliveTextpostBlockDto, newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : bool2, (i2 & 64) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 128) != 0 ? null : bool3, (i2 & 256) != 0 ? null : str, (i2 & 512) != 0 ? null : wallPostActivityDto, (i2 & 1024) != 0 ? null : f, (i2 & 2048) != 0 ? null : newsfeedPushSubscriptionDto, (i2 & 4096) != 0 ? null : bool4, (i2 & 8192) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 16384) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemTextliveBlockDto)) {
                return false;
            }
            NewsfeedItemTextliveBlockDto newsfeedItemTextliveBlockDto = (NewsfeedItemTextliveBlockDto) obj;
            return epx.f(this.textliveTextpostBlock, newsfeedItemTextliveBlockDto.textliveTextpostBlock) && this.type == newsfeedItemTextliveBlockDto.type && epx.f(this.sourceId, newsfeedItemTextliveBlockDto.sourceId) && this.date == newsfeedItemTextliveBlockDto.date && epx.f(this.isAsync, newsfeedItemTextliveBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedItemTextliveBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemTextliveBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemTextliveBlockDto.keepOffline) && epx.f(this.trackCode, newsfeedItemTextliveBlockDto.trackCode) && epx.f(this.activity, newsfeedItemTextliveBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemTextliveBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemTextliveBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemTextliveBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemTextliveBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemTextliveBlockDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a((this.type.hashCode() + (this.textliveTextpostBlock.hashCode() * 31)) * 31, 31, this.sourceId.b), 31);
            Boolean bool = this.isAsync;
            int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.canIgnore;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode3 = (hashCode2 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode6 = (hashCode5 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode8 = (hashCode7 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode9 = (hashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode10 = (hashCode9 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode10 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemTextliveBlockDto(textliveTextpostBlock=");
            sb.append(this.textliveTextpostBlock);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.textliveTextpostBlock, i);
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemTextliveBlockDto(TextlivesTextliveTextpostBlockDto textlivesTextliveTextpostBlockDto, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.textliveTextpostBlock = textlivesTextliveTextpostBlockDto;
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.isAsync = bool;
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.trackCode = str;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemTopicDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemTopicDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("comments")
        private final BaseCommentsInfoDto comments;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("likes")
        private final BaseLikesInfoDto likes;

        @pmi0("post_id")
        private final int postId;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("text")
        private final String text;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemTopicDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemTopicDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemTopicDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemTopicDto.class.getClassLoader());
                int readInt2 = parcel.readInt();
                BaseCommentsInfoDto createFromParcel = parcel.readInt() == 0 ? null : BaseCommentsInfoDto.CREATOR.createFromParcel(parcel);
                BaseLikesInfoDto baseLikesInfoDto = (BaseLikesInfoDto) parcel.readParcelable(NewsfeedItemTopicDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemTopicDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Boolean bool = valueOf;
                String readString2 = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemTopicDto.class.getClassLoader());
                Float valueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemTopicDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemTopicDto(readInt, readString, newsfeedNewsfeedItemTypeDto, userId, readInt2, createFromParcel, baseLikesInfoDto, bool, newsfeedNewsfeedItemCaptionDto, valueOf2, readString2, wallPostActivityDto, valueOf4, newsfeedPushSubscriptionDto, valueOf3, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemTopicDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemTopicDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemTopicDto[] newArray(int i) {
                return new NewsfeedItemTopicDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemTopicDto(int i, String str, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i2, BaseCommentsInfoDto baseCommentsInfoDto, BaseLikesInfoDto baseLikesInfoDto, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i3, zcl zclVar) {
            this(i, str, newsfeedNewsfeedItemTypeDto, userId, i2, (i3 & 32) != 0 ? null : baseCommentsInfoDto, (i3 & 64) != 0 ? null : baseLikesInfoDto, (i3 & 128) != 0 ? null : bool, (i3 & 256) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i3 & 512) != 0 ? null : bool2, (i3 & 1024) != 0 ? null : str2, (i3 & 2048) != 0 ? null : wallPostActivityDto, (i3 & 4096) != 0 ? null : f, (i3 & 8192) != 0 ? null : newsfeedPushSubscriptionDto, (i3 & 16384) != 0 ? null : bool3, (32768 & i3) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i3 & 65536) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final NewsfeedNewsfeedItemTypeDto d() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemTopicDto)) {
                return false;
            }
            NewsfeedItemTopicDto newsfeedItemTopicDto = (NewsfeedItemTopicDto) obj;
            return this.postId == newsfeedItemTopicDto.postId && epx.f(this.text, newsfeedItemTopicDto.text) && this.type == newsfeedItemTopicDto.type && epx.f(this.sourceId, newsfeedItemTopicDto.sourceId) && this.date == newsfeedItemTopicDto.date && epx.f(this.comments, newsfeedItemTopicDto.comments) && epx.f(this.likes, newsfeedItemTopicDto.likes) && epx.f(this.canIgnore, newsfeedItemTopicDto.canIgnore) && epx.f(this.caption, newsfeedItemTopicDto.caption) && epx.f(this.keepOffline, newsfeedItemTopicDto.keepOffline) && epx.f(this.trackCode, newsfeedItemTopicDto.trackCode) && epx.f(this.activity, newsfeedItemTopicDto.activity) && epx.f(this.shortTextRate, newsfeedItemTopicDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemTopicDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemTopicDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemTopicDto.feedback) && epx.f(this.debugInfo, newsfeedItemTopicDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a((this.type.hashCode() + urd0.a(Integer.hashCode(this.postId) * 31, 31, this.text)) * 31, 31, this.sourceId.b), 31);
            BaseCommentsInfoDto baseCommentsInfoDto = this.comments;
            int hashCode = (a2 + (baseCommentsInfoDto == null ? 0 : baseCommentsInfoDto.hashCode())) * 31;
            BaseLikesInfoDto baseLikesInfoDto = this.likes;
            int hashCode2 = (hashCode + (baseLikesInfoDto == null ? 0 : baseLikesInfoDto.hashCode())) * 31;
            Boolean bool = this.canIgnore;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode4 = (hashCode3 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool2 = this.keepOffline;
            int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode7 = (hashCode6 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode9 = (hashCode8 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool3 = this.suggestSubscribe;
            int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode11 = (hashCode10 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode11 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemTopicDto(postId=");
            sb.append(this.postId);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", comments=");
            sb.append(this.comments);
            sb.append(", likes=");
            sb.append(this.likes);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.postId);
            parcel.writeString(this.text);
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            BaseCommentsInfoDto baseCommentsInfoDto = this.comments;
            if (baseCommentsInfoDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                baseCommentsInfoDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.likes, i);
            Boolean bool = this.canIgnore;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool2 = this.keepOffline;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool3 = this.suggestSubscribe;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemTopicDto(int i, String str, NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i2, BaseCommentsInfoDto baseCommentsInfoDto, BaseLikesInfoDto baseLikesInfoDto, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.postId = i;
            this.text = str;
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i2;
            this.comments = baseCommentsInfoDto;
            this.likes = baseLikesInfoDto;
            this.canIgnore = bool;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool2;
            this.trackCode = str2;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool3;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemUxpollBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemUxpollBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("trigger_id")
        private final String triggerId;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemUxpollBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemUxpollBlockDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemUxpollBlockDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemUxpollBlockDto.class.getClassLoader());
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemUxpollBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                boolean z = true;
                String readString2 = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemUxpollBlockDto.class.getClassLoader());
                Float valueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemUxpollBlockDto.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    if (parcel.readInt() == 0) {
                        z = false;
                    }
                    bool = Boolean.valueOf(z);
                }
                return new NewsfeedItemUxpollBlockDto(newsfeedNewsfeedItemTypeDto, userId, readInt, readString, valueOf, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, readString2, wallPostActivityDto, valueOf4, newsfeedPushSubscriptionDto, bool, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemUxpollBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemUxpollBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemUxpollBlockDto[] newArray(int i) {
                return new NewsfeedItemUxpollBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemUxpollBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : bool2, (i2 & 64) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 128) != 0 ? null : bool3, (i2 & 256) != 0 ? null : str2, (i2 & 512) != 0 ? null : wallPostActivityDto, (i2 & 1024) != 0 ? null : f, (i2 & 2048) != 0 ? null : newsfeedPushSubscriptionDto, (i2 & 4096) != 0 ? null : bool4, (i2 & 8192) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 16384) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final NewsfeedNewsfeedItemTypeDto d() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemUxpollBlockDto)) {
                return false;
            }
            NewsfeedItemUxpollBlockDto newsfeedItemUxpollBlockDto = (NewsfeedItemUxpollBlockDto) obj;
            return this.type == newsfeedItemUxpollBlockDto.type && epx.f(this.sourceId, newsfeedItemUxpollBlockDto.sourceId) && this.date == newsfeedItemUxpollBlockDto.date && epx.f(this.triggerId, newsfeedItemUxpollBlockDto.triggerId) && epx.f(this.isAsync, newsfeedItemUxpollBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedItemUxpollBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemUxpollBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemUxpollBlockDto.keepOffline) && epx.f(this.trackCode, newsfeedItemUxpollBlockDto.trackCode) && epx.f(this.activity, newsfeedItemUxpollBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemUxpollBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemUxpollBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemUxpollBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemUxpollBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemUxpollBlockDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            String str = this.triggerId;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.canIgnore;
            int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode4 = (hashCode3 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str2 = this.trackCode;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode7 = (hashCode6 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode9 = (hashCode8 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode10 = (hashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode11 = (hashCode10 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode11 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemUxpollBlockDto(type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", triggerId=");
            sb.append(this.triggerId);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            parcel.writeString(this.triggerId);
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemUxpollBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.triggerId = str;
            this.isAsync = bool;
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.trackCode = str2;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemVideoDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemVideoDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("ads_easy_promote")
        private final WallWallpostAdsEasyPromoteDto adsEasyPromote;

        @pmi0("ads_easy_promote_three_dots")
        private final Boolean adsEasyPromoteThreeDots;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("carousel_offset")
        private final Integer carouselOffset;

        @pmi0("clip")
        private final NewsfeedItemVideoVideoDto clip;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("header")
        private final NewsfeedNewsfeedItemHeaderDto header;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        @pmi0("video")
        private final NewsfeedItemVideoVideoDto video;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemVideoDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemVideoDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean valueOf4;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemVideoDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemVideoDto.class.getClassLoader());
                int readInt = parcel.readInt();
                NewsfeedItemVideoVideoDto createFromParcel = parcel.readInt() == 0 ? null : NewsfeedItemVideoVideoDto.CREATOR.createFromParcel(parcel);
                NewsfeedItemVideoVideoDto createFromParcel2 = parcel.readInt() == 0 ? null : NewsfeedItemVideoVideoDto.CREATOR.createFromParcel(parcel);
                Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                NewsfeedNewsfeedItemHeaderDto createFromParcel3 = parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemHeaderDto.CREATOR.createFromParcel(parcel);
                WallWallpostAdsEasyPromoteDto createFromParcel4 = parcel.readInt() == 0 ? null : WallWallpostAdsEasyPromoteDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemVideoDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                boolean z = true;
                String readString = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemVideoDto.class.getClassLoader());
                Float valueOf7 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemVideoDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    if (parcel.readInt() == 0) {
                        z = false;
                    }
                    valueOf4 = Boolean.valueOf(z);
                }
                return new NewsfeedItemVideoDto(newsfeedNewsfeedItemTypeDto, userId, readInt, createFromParcel, createFromParcel2, valueOf5, createFromParcel3, createFromParcel4, valueOf, valueOf6, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, readString, wallPostActivityDto, valueOf7, newsfeedPushSubscriptionDto, valueOf4, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemVideoDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemVideoDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemVideoDto[] newArray(int i) {
                return new NewsfeedItemVideoDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemVideoDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, NewsfeedItemVideoVideoDto newsfeedItemVideoVideoDto, NewsfeedItemVideoVideoDto newsfeedItemVideoVideoDto2, Integer num, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto, Boolean bool, Integer num2, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : newsfeedItemVideoVideoDto, (i2 & 16) != 0 ? null : newsfeedItemVideoVideoDto2, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : newsfeedNewsfeedItemHeaderDto, (i2 & 128) != 0 ? null : wallWallpostAdsEasyPromoteDto, (i2 & 256) != 0 ? null : bool, (i2 & 512) != 0 ? null : num2, (i2 & 1024) != 0 ? null : bool2, (i2 & 2048) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 4096) != 0 ? null : bool3, (i2 & 8192) != 0 ? null : str, (i2 & 16384) != 0 ? null : wallPostActivityDto, (32768 & i2) != 0 ? null : f, (65536 & i2) != 0 ? null : newsfeedPushSubscriptionDto, (131072 & i2) != 0 ? null : bool4, (262144 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 524288) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final NewsfeedNewsfeedItemTypeDto B() {
            return this.type;
        }

        public final NewsfeedItemVideoVideoDto C() {
            return this.video;
        }

        public final WallWallpostAdsEasyPromoteDto d() {
            return this.adsEasyPromote;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final Boolean e() {
            return this.adsEasyPromoteThreeDots;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemVideoDto)) {
                return false;
            }
            NewsfeedItemVideoDto newsfeedItemVideoDto = (NewsfeedItemVideoDto) obj;
            return this.type == newsfeedItemVideoDto.type && epx.f(this.sourceId, newsfeedItemVideoDto.sourceId) && this.date == newsfeedItemVideoDto.date && epx.f(this.video, newsfeedItemVideoDto.video) && epx.f(this.clip, newsfeedItemVideoDto.clip) && epx.f(this.postId, newsfeedItemVideoDto.postId) && epx.f(this.header, newsfeedItemVideoDto.header) && epx.f(this.adsEasyPromote, newsfeedItemVideoDto.adsEasyPromote) && epx.f(this.adsEasyPromoteThreeDots, newsfeedItemVideoDto.adsEasyPromoteThreeDots) && epx.f(this.carouselOffset, newsfeedItemVideoDto.carouselOffset) && epx.f(this.canIgnore, newsfeedItemVideoDto.canIgnore) && epx.f(this.caption, newsfeedItemVideoDto.caption) && epx.f(this.keepOffline, newsfeedItemVideoDto.keepOffline) && epx.f(this.trackCode, newsfeedItemVideoDto.trackCode) && epx.f(this.activity, newsfeedItemVideoDto.activity) && epx.f(this.shortTextRate, newsfeedItemVideoDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemVideoDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemVideoDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemVideoDto.feedback) && epx.f(this.debugInfo, newsfeedItemVideoDto.debugInfo);
        }

        public final NewsfeedNewsfeedItemCaptionDto f() {
            return this.caption;
        }

        public final NewsfeedItemVideoVideoDto g() {
            return this.clip;
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            NewsfeedItemVideoVideoDto newsfeedItemVideoVideoDto = this.video;
            int hashCode = (a2 + (newsfeedItemVideoVideoDto == null ? 0 : newsfeedItemVideoVideoDto.hashCode())) * 31;
            NewsfeedItemVideoVideoDto newsfeedItemVideoVideoDto2 = this.clip;
            int hashCode2 = (hashCode + (newsfeedItemVideoVideoDto2 == null ? 0 : newsfeedItemVideoVideoDto2.hashCode())) * 31;
            Integer num = this.postId;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
            int hashCode4 = (hashCode3 + (newsfeedNewsfeedItemHeaderDto == null ? 0 : newsfeedNewsfeedItemHeaderDto.hashCode())) * 31;
            WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto = this.adsEasyPromote;
            int hashCode5 = (hashCode4 + (wallWallpostAdsEasyPromoteDto == null ? 0 : wallWallpostAdsEasyPromoteDto.hashCode())) * 31;
            Boolean bool = this.adsEasyPromoteThreeDots;
            int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num2 = this.carouselOffset;
            int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Boolean bool2 = this.canIgnore;
            int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode9 = (hashCode8 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode11 = (hashCode10 + (str == null ? 0 : str.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode12 = (hashCode11 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode13 = (hashCode12 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode14 = (hashCode13 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode16 = (hashCode15 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode16 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final int i() {
            return this.date;
        }

        public final NewsfeedItemDebugInfoDto j() {
            return this.debugInfo;
        }

        public final NewsfeedItemWallpostFeedbackDto k() {
            return this.feedback;
        }

        public final NewsfeedNewsfeedItemHeaderDto l() {
            return this.header;
        }

        public final Boolean n() {
            return this.keepOffline;
        }

        public final Float o() {
            return this.shortTextRate;
        }

        public final UserId p() {
            return this.sourceId;
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemVideoDto(type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", video=");
            sb.append(this.video);
            sb.append(", clip=");
            sb.append(this.clip);
            sb.append(", postId=");
            sb.append(this.postId);
            sb.append(", header=");
            sb.append(this.header);
            sb.append(", adsEasyPromote=");
            sb.append(this.adsEasyPromote);
            sb.append(", adsEasyPromoteThreeDots=");
            sb.append(this.adsEasyPromoteThreeDots);
            sb.append(", carouselOffset=");
            sb.append(this.carouselOffset);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        public final Boolean u() {
            return this.suggestSubscribe;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            NewsfeedItemVideoVideoDto newsfeedItemVideoVideoDto = this.video;
            if (newsfeedItemVideoVideoDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedItemVideoVideoDto.writeToParcel(parcel, i);
            }
            NewsfeedItemVideoVideoDto newsfeedItemVideoVideoDto2 = this.clip;
            if (newsfeedItemVideoVideoDto2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedItemVideoVideoDto2.writeToParcel(parcel, i);
            }
            Integer num = this.postId;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
            if (newsfeedNewsfeedItemHeaderDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedNewsfeedItemHeaderDto.writeToParcel(parcel, i);
            }
            WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto = this.adsEasyPromote;
            if (wallWallpostAdsEasyPromoteDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallWallpostAdsEasyPromoteDto.writeToParcel(parcel, i);
            }
            Boolean bool = this.adsEasyPromoteThreeDots;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Integer num2 = this.carouselOffset;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemVideoDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, NewsfeedItemVideoVideoDto newsfeedItemVideoVideoDto, NewsfeedItemVideoVideoDto newsfeedItemVideoVideoDto2, Integer num, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto, Boolean bool, Integer num2, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.video = newsfeedItemVideoVideoDto;
            this.clip = newsfeedItemVideoVideoDto2;
            this.postId = num;
            this.header = newsfeedNewsfeedItemHeaderDto;
            this.adsEasyPromote = wallWallpostAdsEasyPromoteDto;
            this.adsEasyPromoteThreeDots = bool;
            this.carouselOffset = num2;
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.trackCode = str;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemVideoPostcardBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemVideoPostcardBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("buttons")
        private final List<BaseLinkButtonDto> buttons;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("description")
        private final String description;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
        private final VideoVideoFullDto item;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("privacy_text")
        private final String privacyText;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemVideoPostcardBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemVideoPostcardBlockDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemVideoPostcardBlockDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemVideoPostcardBlockDto.class.getClassLoader());
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                VideoVideoFullDto videoVideoFullDto = (VideoVideoFullDto) parcel.readParcelable(NewsfeedItemVideoPostcardBlockDto.class.getClassLoader());
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList = new ArrayList(readInt2);
                    int i = 0;
                    while (i != readInt2) {
                        i = bo.b(NewsfeedItemVideoPostcardBlockDto.class, parcel, arrayList, i, 1);
                    }
                }
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemVideoPostcardBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString4 = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemVideoPostcardBlockDto.class.getClassLoader());
                Float valueOf4 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemVideoPostcardBlockDto.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemVideoPostcardBlockDto(newsfeedNewsfeedItemTypeDto, userId, readInt, readString, readString2, readString3, videoVideoFullDto, arrayList, valueOf, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, readString4, wallPostActivityDto, valueOf4, newsfeedPushSubscriptionDto, bool, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemVideoPostcardBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemVideoPostcardBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemVideoPostcardBlockDto[] newArray(int i) {
                return new NewsfeedItemVideoPostcardBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemVideoPostcardBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, String str2, String str3, VideoVideoFullDto videoVideoFullDto, List list, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str4, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : videoVideoFullDto, (i2 & 128) != 0 ? null : list, (i2 & 256) != 0 ? null : bool, (i2 & 512) != 0 ? null : bool2, (i2 & 1024) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 2048) != 0 ? null : bool3, (i2 & 4096) != 0 ? null : str4, (i2 & 8192) != 0 ? null : wallPostActivityDto, (i2 & 16384) != 0 ? null : f, (32768 & i2) != 0 ? null : newsfeedPushSubscriptionDto, (65536 & i2) != 0 ? null : bool4, (131072 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final NewsfeedNewsfeedItemTypeDto d() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemVideoPostcardBlockDto)) {
                return false;
            }
            NewsfeedItemVideoPostcardBlockDto newsfeedItemVideoPostcardBlockDto = (NewsfeedItemVideoPostcardBlockDto) obj;
            return this.type == newsfeedItemVideoPostcardBlockDto.type && epx.f(this.sourceId, newsfeedItemVideoPostcardBlockDto.sourceId) && this.date == newsfeedItemVideoPostcardBlockDto.date && epx.f(this.title, newsfeedItemVideoPostcardBlockDto.title) && epx.f(this.description, newsfeedItemVideoPostcardBlockDto.description) && epx.f(this.privacyText, newsfeedItemVideoPostcardBlockDto.privacyText) && epx.f(this.item, newsfeedItemVideoPostcardBlockDto.item) && epx.f(this.buttons, newsfeedItemVideoPostcardBlockDto.buttons) && epx.f(this.isAsync, newsfeedItemVideoPostcardBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedItemVideoPostcardBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemVideoPostcardBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemVideoPostcardBlockDto.keepOffline) && epx.f(this.trackCode, newsfeedItemVideoPostcardBlockDto.trackCode) && epx.f(this.activity, newsfeedItemVideoPostcardBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemVideoPostcardBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemVideoPostcardBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemVideoPostcardBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemVideoPostcardBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemVideoPostcardBlockDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            String str = this.title;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
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
            Boolean bool2 = this.canIgnore;
            int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode8 = (hashCode7 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str4 = this.trackCode;
            int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode11 = (hashCode10 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode12 = (hashCode11 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode13 = (hashCode12 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode14 = (hashCode13 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode15 = (hashCode14 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode15 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemVideoPostcardBlockDto(type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", description=");
            sb.append(this.description);
            sb.append(", privacyText=");
            sb.append(this.privacyText);
            sb.append(", item=");
            sb.append(this.item);
            sb.append(", buttons=");
            sb.append(this.buttons);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            parcel.writeString(this.title);
            parcel.writeString(this.description);
            parcel.writeString(this.privacyText);
            parcel.writeParcelable(this.item, i);
            List<BaseLinkButtonDto> list = this.buttons;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f2 = this.shortTextRate;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f2);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemVideoPostcardBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, String str2, String str3, VideoVideoFullDto videoVideoFullDto, List<BaseLinkButtonDto> list, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str4, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
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
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.trackCode = str4;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemVideosForYouBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemVideosForYouBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("button")
        private final BaseLinkButtonDto button;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("items")
        private final List<VideoVideoFullDto> items;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("next_from")
        private final String nextFrom;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemVideosForYouBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemVideosForYouBlockDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Boolean bool;
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean valueOf4;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemVideosForYouBlockDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemVideosForYouBlockDto.class.getClassLoader());
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    bool = null;
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    arrayList = new ArrayList(readInt2);
                    int i = 0;
                    while (i != readInt2) {
                        i = bo.b(NewsfeedItemVideosForYouBlockDto.class, parcel, arrayList, i, 1);
                    }
                    bool = null;
                }
                String readString2 = parcel.readString();
                BaseLinkButtonDto baseLinkButtonDto = (BaseLinkButtonDto) parcel.readParcelable(NewsfeedItemVideosForYouBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf = bool;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = bool;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemVideosForYouBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = bool;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString3 = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemVideosForYouBlockDto.class.getClassLoader());
                Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemVideosForYouBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemVideosForYouBlockDto(newsfeedNewsfeedItemTypeDto, userId, readInt, readString, arrayList, readString2, baseLinkButtonDto, valueOf, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, readString3, wallPostActivityDto, valueOf5, newsfeedPushSubscriptionDto, valueOf4, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemVideosForYouBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemVideosForYouBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemVideosForYouBlockDto[] newArray(int i) {
                return new NewsfeedItemVideosForYouBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemVideosForYouBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, List list, String str2, BaseLinkButtonDto baseLinkButtonDto, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : baseLinkButtonDto, (i2 & 128) != 0 ? null : bool, (i2 & 256) != 0 ? null : bool2, (i2 & 512) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 1024) != 0 ? null : bool3, (i2 & 2048) != 0 ? null : str3, (i2 & 4096) != 0 ? null : wallPostActivityDto, (i2 & 8192) != 0 ? null : f, (i2 & 16384) != 0 ? null : newsfeedPushSubscriptionDto, (32768 & i2) != 0 ? null : bool4, (65536 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 131072) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final NewsfeedNewsfeedItemCaptionDto d() {
            return this.caption;
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
            if (!(obj instanceof NewsfeedItemVideosForYouBlockDto)) {
                return false;
            }
            NewsfeedItemVideosForYouBlockDto newsfeedItemVideosForYouBlockDto = (NewsfeedItemVideosForYouBlockDto) obj;
            return this.type == newsfeedItemVideosForYouBlockDto.type && epx.f(this.sourceId, newsfeedItemVideosForYouBlockDto.sourceId) && this.date == newsfeedItemVideosForYouBlockDto.date && epx.f(this.title, newsfeedItemVideosForYouBlockDto.title) && epx.f(this.items, newsfeedItemVideosForYouBlockDto.items) && epx.f(this.nextFrom, newsfeedItemVideosForYouBlockDto.nextFrom) && epx.f(this.button, newsfeedItemVideosForYouBlockDto.button) && epx.f(this.isAsync, newsfeedItemVideosForYouBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedItemVideosForYouBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemVideosForYouBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemVideosForYouBlockDto.keepOffline) && epx.f(this.trackCode, newsfeedItemVideosForYouBlockDto.trackCode) && epx.f(this.activity, newsfeedItemVideosForYouBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemVideosForYouBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemVideosForYouBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemVideosForYouBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemVideosForYouBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemVideosForYouBlockDto.debugInfo);
        }

        public final NewsfeedItemDebugInfoDto f() {
            return this.debugInfo;
        }

        public final NewsfeedItemWallpostFeedbackDto g() {
            return this.feedback;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            String str = this.title;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            List<VideoVideoFullDto> list = this.items;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.nextFrom;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            BaseLinkButtonDto baseLinkButtonDto = this.button;
            int hashCode4 = (hashCode3 + (baseLinkButtonDto == null ? 0 : baseLinkButtonDto.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.canIgnore;
            int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode7 = (hashCode6 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str3 = this.trackCode;
            int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode10 = (hashCode9 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode11 = (hashCode10 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode12 = (hashCode11 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode13 = (hashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode14 = (hashCode13 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode14 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final List<VideoVideoFullDto> i() {
            return this.items;
        }

        public final Boolean j() {
            return this.keepOffline;
        }

        public final Float k() {
            return this.shortTextRate;
        }

        public final UserId l() {
            return this.sourceId;
        }

        public final Boolean n() {
            return this.suggestSubscribe;
        }

        public final NewsfeedNewsfeedItemTypeDto o() {
            return this.type;
        }

        public final Boolean p() {
            return this.isAsync;
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemVideosForYouBlockDto(type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", nextFrom=");
            sb.append(this.nextFrom);
            sb.append(", button=");
            sb.append(this.button);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            parcel.writeString(this.title);
            List<VideoVideoFullDto> list = this.items;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            parcel.writeString(this.nextFrom);
            parcel.writeParcelable(this.button, i);
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f2 = this.shortTextRate;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f2);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemVideosForYouBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, List<VideoVideoFullDto> list, String str2, BaseLinkButtonDto baseLinkButtonDto, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.title = str;
            this.items = list;
            this.nextFrom = str2;
            this.button = baseLinkButtonDto;
            this.isAsync = bool;
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.trackCode = str3;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemVideosPromoBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemVideosPromoBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("header")
        private final NewsfeedNewsfeedItemHeaderDto header;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
        private final VideoVideoFullDto item;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemVideosPromoBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemVideosPromoBlockDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean valueOf4;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemVideosPromoBlockDto.class.getClassLoader());
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemVideosPromoBlockDto.class.getClassLoader());
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                VideoVideoFullDto videoVideoFullDto = (VideoVideoFullDto) parcel.readParcelable(NewsfeedItemVideosPromoBlockDto.class.getClassLoader());
                NewsfeedNewsfeedItemHeaderDto createFromParcel = parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemHeaderDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemVideosPromoBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                boolean z = false;
                String readString2 = parcel.readString();
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemVideosPromoBlockDto.class.getClassLoader());
                Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemVideosPromoBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    valueOf4 = Boolean.valueOf(z);
                }
                return new NewsfeedItemVideosPromoBlockDto(newsfeedNewsfeedItemTypeDto, userId, readInt, readString, videoVideoFullDto, createFromParcel, valueOf, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, readString2, wallPostActivityDto, valueOf5, newsfeedPushSubscriptionDto, valueOf4, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemVideosPromoBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemVideosPromoBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemVideosPromoBlockDto[] newArray(int i) {
                return new NewsfeedItemVideosPromoBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemVideosPromoBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, VideoVideoFullDto videoVideoFullDto, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : videoVideoFullDto, (i2 & 32) != 0 ? null : newsfeedNewsfeedItemHeaderDto, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? null : bool2, (i2 & 256) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i2 & 512) != 0 ? null : bool3, (i2 & 1024) != 0 ? null : str2, (i2 & 2048) != 0 ? null : wallPostActivityDto, (i2 & 4096) != 0 ? null : f, (i2 & 8192) != 0 ? null : newsfeedPushSubscriptionDto, (i2 & 16384) != 0 ? null : bool4, (32768 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 65536) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemVideosPromoBlockDto)) {
                return false;
            }
            NewsfeedItemVideosPromoBlockDto newsfeedItemVideosPromoBlockDto = (NewsfeedItemVideosPromoBlockDto) obj;
            return this.type == newsfeedItemVideosPromoBlockDto.type && epx.f(this.sourceId, newsfeedItemVideosPromoBlockDto.sourceId) && this.date == newsfeedItemVideosPromoBlockDto.date && epx.f(this.title, newsfeedItemVideosPromoBlockDto.title) && epx.f(this.item, newsfeedItemVideosPromoBlockDto.item) && epx.f(this.header, newsfeedItemVideosPromoBlockDto.header) && epx.f(this.isAsync, newsfeedItemVideosPromoBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedItemVideosPromoBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemVideosPromoBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemVideosPromoBlockDto.keepOffline) && epx.f(this.trackCode, newsfeedItemVideosPromoBlockDto.trackCode) && epx.f(this.activity, newsfeedItemVideosPromoBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemVideosPromoBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemVideosPromoBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemVideosPromoBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemVideosPromoBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemVideosPromoBlockDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31);
            String str = this.title;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            VideoVideoFullDto videoVideoFullDto = this.item;
            int hashCode2 = (hashCode + (videoVideoFullDto == null ? 0 : videoVideoFullDto.hashCode())) * 31;
            NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
            int hashCode3 = (hashCode2 + (newsfeedNewsfeedItemHeaderDto == null ? 0 : newsfeedNewsfeedItemHeaderDto.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.canIgnore;
            int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode6 = (hashCode5 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str2 = this.trackCode;
            int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode9 = (hashCode8 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode10 = (hashCode9 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode11 = (hashCode10 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode12 = (hashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode13 = (hashCode12 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode13 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemVideosPromoBlockDto(type=");
            sb.append(this.type);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", item=");
            sb.append(this.item);
            sb.append(", header=");
            sb.append(this.header);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            parcel.writeString(this.title);
            parcel.writeParcelable(this.item, i);
            NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
            if (newsfeedNewsfeedItemHeaderDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedNewsfeedItemHeaderDto.writeToParcel(parcel, i);
            }
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemVideosPromoBlockDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, String str, VideoVideoFullDto videoVideoFullDto, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, String str2, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.title = str;
            this.item = videoVideoFullDto;
            this.header = newsfeedNewsfeedItemHeaderDto;
            this.isAsync = bool;
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.trackCode = str2;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemWallpostDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemWallpostDto> CREATOR = new a();

        @pmi0("access_key")
        private final String accessKey;

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("ad_data")
        private final String adData;

        @pmi0("ad_moderation_checksum")
        private final String adModerationChecksum;

        @pmi0("ads_easy_promote")
        private final WallWallpostAdsEasyPromoteDto adsEasyPromote;

        @pmi0("ads_easy_promote_three_dots")
        private final Boolean adsEasyPromoteThreeDots;

        @pmi0("attachments")
        private final List<WallWallpostAttachmentDto> attachments;

        @pmi0("attachments_meta")
        private final WallWallpostAttachmentsMetaDto attachmentsMeta;

        @pmi0("author_ad")
        private final AdsAdvertiserInfoDto authorAd;

        @pmi0("away_params")
        private final Object awayParams;

        @pmi0("badge_id")
        private final Integer badgeId;

        @pmi0("badge_info")
        private final BadgesCommentInfoDto badgeInfo;

        @pmi0("badges")
        private final BadgesObjectInfoDto badges;

        @pmi0("best_friends_only")
        private final BaseBoolIntDto bestFriendsOnly;

        @pmi0("bottom_extension")
        private final BaseBottomExtensionDto bottomExtension;

        @pmi0("can_archive")
        private final Boolean canArchive;

        @pmi0("can_delete")
        private final BaseBoolIntDto canDelete;

        @pmi0("can_doubt_category")
        private final Boolean canDoubtCategory;

        @pmi0("can_edit")
        private final BaseBoolIntDto canEdit;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("can_pin")
        private final BaseBoolIntDto canPin;

        @pmi0("can_publish")
        private final BaseBoolIntDto canPublish;

        @pmi0("can_set_category")
        private final Boolean canSetCategory;

        @pmi0("can_view_stats")
        private final BaseBoolIntDto canViewStats;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("carousel_offset")
        private final Integer carouselOffset;

        @pmi0("category_action")
        private final WallWallpostCategoryActionDto categoryAction;

        @pmi0("check_sign")
        private final Boolean checkSign;

        @pmi0("comments")
        private final BaseCommentsInfoDto comments;

        @pmi0("compact_attachments_before_cut")
        private final Integer compactAttachmentsBeforeCut;

        @pmi0("content_layout")
        private final List<WallWallpostContentLayoutItemDto> contentLayout;

        @pmi0("coowners")
        private final WallCoownersDto coowners;

        @pmi0("copy_history")
        private final List<WallWallpostFullDto> copyHistory;

        @pmi0("copyright")
        private final WallPostCopyrightDto copyright;

        @pmi0("created_by")
        private final UserId createdBy;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("deleted_details")
        private final String deletedDetails;

        @pmi0("deleted_reason")
        private final String deletedReason;

        @pmi0("donut")
        private final WallWallpostDonutDto donut;

        @pmi0("donut_badge_info")
        private final BadgesDonutInfoDto donutBadgeInfo;

        @pmi0("donut_miniapp_url")
        private final String donutMiniappUrl;

        @pmi0("edited")
        private final Integer edited;

        @pmi0("facebook_export")
        private final Integer facebookExport;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("final_post")
        private final BaseBoolIntDto finalPost;

        @pmi0("friends_only")
        private final BaseBoolIntDto friendsOnly;

        @pmi0("from_id")
        private final UserId fromId;

        @pmi0("geo")
        private final WallGeoDto geo;

        @pmi0("has_market_link")
        private final Boolean hasMarketLink;

        @pmi0("has_translation")
        private final Boolean hasTranslation;

        @pmi0("has_video_autoplay")
        private final Boolean hasVideoAutoplay;

        @pmi0("hash")
        private final String hash;

        @pmi0("header")
        private final NewsfeedNewsfeedItemHeaderDto header;

        @pmi0("hide_likes")
        private final Boolean hideLikes;

        @pmi0("id")
        private final Integer id;

        @pmi0("inner_type")
        private final InnerTypeDto innerType;

        @pmi0("is_added_to_main_tab")
        private final Boolean isAddedToMainTab;

        @pmi0("is_archived")
        private final Boolean isArchived;

        @pmi0("is_blacklisted")
        private final Boolean isBlacklisted;

        @pmi0("is_deleted")
        private final Boolean isDeleted;

        @pmi0("is_favorite")
        private final Boolean isFavorite;

        @pmi0("is_from_private_group")
        private final Boolean isFromPrivateGroup;

        @pmi0("is_pinned")
        private final BaseBoolIntDto isPinned;

        @pmi0("is_promoted_post_stealth")
        private final Boolean isPromotedPostStealth;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("likes")
        private final BaseLikesInfoDto likes;

        @pmi0("marked_as_ads")
        private final BaseBoolIntDto markedAsAds;

        @pmi0("marked_as_author_ad")
        private final Boolean markedAsAuthorAd;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("parents_stack")
        private final List<Integer> parentsStack;

        @pmi0("post_author_data")
        private final WallWallpostAuthorDataDto postAuthorData;

        @pmi0("post_id")
        private final Integer postId;

        @pmi0("post_source")
        private final WallPostSourceDto postSource;

        @pmi0("post_type")
        private final WallPostTypeDto postType;

        @pmi0("poster")
        private final WallPosterDto poster;

        @pmi0("postponed_id")
        private final Integer postponedId;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0(CampaignEx.JSON_KEY_STAR)
        private final WallWallpostRatingDto rating;

        @pmi0("reaction_set_id")
        private final String reactionSetId;

        @pmi0("reactions")
        private final LikesItemReactionsDto reactions;

        @pmi0("reply_count")
        private final Integer replyCount;

        @pmi0("reply_owner_id")
        private final UserId replyOwnerId;

        @pmi0("reply_post_id")
        private final Integer replyPostId;

        @pmi0("reply_to")
        private final UserId replyTo;

        @pmi0("reposts")
        private final BaseRepostsInfoDto reposts;

        @pmi0("research")
        private final NewsfeedMediascopeResearchDto research;

        @pmi0("share_url")
        private final String shareUrl;

        @pmi0("sharing")
        private final WallSharingDto sharing;

        @pmi0("short_attach_count")
        private final Integer shortAttachCount;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("signer_id")
        private final UserId signerId;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("text")
        private final String text;

        @pmi0("thumbs_max_height")
        private final Float thumbsMaxHeight;

        @pmi0("to_id")
        private final UserId toId;

        @pmi0("topic_id")
        private final TopicIdDto topicId;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("translation_lang")
        private final String translationLang;

        @pmi0("trending")
        private final Boolean trending;

        @pmi0("twitter_export")
        private final Integer twitterExport;

        @pmi0("type")
        private final NewsfeedNewsfeedItemTypeDto type;

        @pmi0("views")
        private final WallViewsDto views;

        @pmi0("zoom_text")
        private final Boolean zoomText;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class InnerTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ InnerTypeDto[] $VALUES;
            public static final Parcelable.Creator<InnerTypeDto> CREATOR;

            @pmi0("wall_wallpost")
            public static final InnerTypeDto WALL_WALLPOST;
            private final String value;

            /* compiled from: NewsfeedNewsfeedItemDto.kt */
            public static final class a implements Parcelable.Creator<InnerTypeDto> {
                @Override // android.os.Parcelable.Creator
                public final InnerTypeDto createFromParcel(Parcel parcel) {
                    return InnerTypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final InnerTypeDto[] newArray(int i) {
                    return new InnerTypeDto[i];
                }
            }

            static {
                InnerTypeDto innerTypeDto = new InnerTypeDto("WALL_WALLPOST", 0, "wall_wallpost");
                WALL_WALLPOST = innerTypeDto;
                InnerTypeDto[] innerTypeDtoArr = {innerTypeDto};
                $VALUES = innerTypeDtoArr;
                $ENTRIES = new asp(innerTypeDtoArr);
                CREATOR = new a();
            }

            private InnerTypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static InnerTypeDto valueOf(String str) {
                return (InnerTypeDto) Enum.valueOf(InnerTypeDto.class, str);
            }

            public static InnerTypeDto[] values() {
                return (InnerTypeDto[]) $VALUES.clone();
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

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class TopicIdDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TopicIdDto[] $VALUES;

            @pmi0("1")
            public static final TopicIdDto ART;
            public static final Parcelable.Creator<TopicIdDto> CREATOR;

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

            /* compiled from: NewsfeedNewsfeedItemDto.kt */
            public static final class a implements Parcelable.Creator<TopicIdDto> {
                @Override // android.os.Parcelable.Creator
                public final TopicIdDto createFromParcel(Parcel parcel) {
                    return TopicIdDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TopicIdDto[] newArray(int i) {
                    return new TopicIdDto[i];
                }
            }

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
                CREATOR = new a();
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

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemWallpostDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemWallpostDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto;
                WallWallpostAdsEasyPromoteDto createFromParcel;
                Boolean valueOf4;
                WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto;
                WallPostActivityDto wallPostActivityDto;
                ArrayList arrayList;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto;
                BaseBoolIntDto baseBoolIntDto;
                WallWallpostDonutDto createFromParcel2;
                Boolean valueOf5;
                BaseBoolIntDto baseBoolIntDto2;
                BaseCommentsInfoDto createFromParcel3;
                Boolean valueOf6;
                BaseBoolIntDto baseBoolIntDto3;
                AdsAdvertiserInfoDto createFromParcel4;
                Boolean valueOf7;
                AdsAdvertiserInfoDto adsAdvertiserInfoDto;
                WallWallpostRatingDto createFromParcel5;
                Boolean valueOf8;
                Boolean valueOf9;
                WallWallpostRatingDto wallWallpostRatingDto;
                WallWallpostCategoryActionDto createFromParcel6;
                WallWallpostCategoryActionDto wallWallpostCategoryActionDto;
                TopicIdDto createFromParcel7;
                Boolean valueOf10;
                BaseBottomExtensionDto baseBottomExtensionDto;
                WallCoownersDto createFromParcel8;
                Boolean valueOf11;
                Boolean valueOf12;
                Boolean valueOf13;
                Boolean valueOf14;
                Boolean valueOf15;
                Boolean valueOf16;
                UserId userId;
                WallWallpostAuthorDataDto createFromParcel9;
                WallWallpostAuthorDataDto wallWallpostAuthorDataDto;
                NewsfeedMediascopeResearchDto createFromParcel10;
                Boolean valueOf17;
                Boolean valueOf18;
                Boolean valueOf19;
                NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto;
                ArrayList arrayList2;
                ArrayList arrayList3;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto2;
                WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto;
                ArrayList arrayList4;
                ArrayList arrayList5;
                Boolean valueOf20;
                BaseBoolIntDto baseBoolIntDto4;
                WallPostCopyrightDto createFromParcel11;
                Boolean valueOf21;
                Boolean valueOf22;
                LikesItemReactionsDto likesItemReactionsDto;
                BadgesObjectInfoDto createFromParcel12;
                UserId userId2;
                WallPosterDto createFromParcel13;
                WallPosterDto wallPosterDto;
                ArrayList arrayList6;
                ArrayList arrayList7;
                Integer num;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto3 = (NewsfeedNewsfeedItemTypeDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                UserId userId3 = (UserId) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                int readInt = parcel.readInt();
                InnerTypeDto createFromParcel14 = InnerTypeDto.CREATOR.createFromParcel(parcel);
                Float valueOf23 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedNewsfeedItemHeaderDto createFromParcel15 = parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemHeaderDto.CREATOR.createFromParcel(parcel);
                Integer valueOf24 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString = parcel.readString();
                WallPostActivityDto wallPostActivityDto2 = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                Float valueOf25 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                Boolean bool = valueOf;
                NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto2 = (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    newsfeedItemDebugInfoDto = newsfeedItemDebugInfoDto2;
                    createFromParcel = null;
                } else {
                    newsfeedItemDebugInfoDto = newsfeedItemDebugInfoDto2;
                    createFromParcel = WallWallpostAdsEasyPromoteDto.CREATOR.createFromParcel(parcel);
                }
                WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto2 = createFromParcel;
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    wallWallpostAdsEasyPromoteDto = wallWallpostAdsEasyPromoteDto2;
                    wallPostActivityDto = wallPostActivityDto2;
                    newsfeedNewsfeedItemTypeDto = newsfeedNewsfeedItemTypeDto3;
                    arrayList = null;
                } else {
                    wallWallpostAdsEasyPromoteDto = wallWallpostAdsEasyPromoteDto2;
                    int readInt2 = parcel.readInt();
                    wallPostActivityDto = wallPostActivityDto2;
                    arrayList = new ArrayList(readInt2);
                    newsfeedNewsfeedItemTypeDto = newsfeedNewsfeedItemTypeDto3;
                    int i = 0;
                    while (i != readInt2) {
                        i = en.a(WallWallpostFullDto.CREATOR, parcel, arrayList, i, 1);
                        readInt2 = readInt2;
                        userId3 = userId3;
                    }
                }
                UserId userId4 = userId3;
                BaseBoolIntDto baseBoolIntDto5 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                UserId userId5 = (UserId) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto6 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto7 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto8 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    baseBoolIntDto = baseBoolIntDto8;
                    createFromParcel2 = null;
                } else {
                    baseBoolIntDto = baseBoolIntDto8;
                    createFromParcel2 = WallWallpostDonutDto.CREATOR.createFromParcel(parcel);
                }
                WallWallpostDonutDto wallWallpostDonutDto = createFromParcel2;
                BaseBoolIntDto baseBoolIntDto9 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto10 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                BaseBoolIntDto baseBoolIntDto11 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
                }
                BaseBoolIntDto baseBoolIntDto12 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    baseBoolIntDto2 = baseBoolIntDto12;
                    createFromParcel3 = null;
                } else {
                    baseBoolIntDto2 = baseBoolIntDto12;
                    createFromParcel3 = BaseCommentsInfoDto.CREATOR.createFromParcel(parcel);
                }
                BaseCommentsInfoDto baseCommentsInfoDto = createFromParcel3;
                BaseBoolIntDto baseBoolIntDto13 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    baseBoolIntDto3 = baseBoolIntDto13;
                    createFromParcel4 = null;
                } else {
                    baseBoolIntDto3 = baseBoolIntDto13;
                    createFromParcel4 = AdsAdvertiserInfoDto.CREATOR.createFromParcel(parcel);
                }
                AdsAdvertiserInfoDto adsAdvertiserInfoDto2 = createFromParcel4;
                if (parcel.readInt() == 0) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    adsAdvertiserInfoDto = adsAdvertiserInfoDto2;
                    createFromParcel5 = null;
                } else {
                    adsAdvertiserInfoDto = adsAdvertiserInfoDto2;
                    createFromParcel5 = WallWallpostRatingDto.CREATOR.createFromParcel(parcel);
                }
                WallWallpostRatingDto wallWallpostRatingDto2 = createFromParcel5;
                if (parcel.readInt() == 0) {
                    valueOf8 = null;
                } else {
                    valueOf8 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf9 = null;
                } else {
                    valueOf9 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    wallWallpostRatingDto = wallWallpostRatingDto2;
                    createFromParcel6 = null;
                } else {
                    wallWallpostRatingDto = wallWallpostRatingDto2;
                    createFromParcel6 = WallWallpostCategoryActionDto.CREATOR.createFromParcel(parcel);
                }
                WallWallpostCategoryActionDto wallWallpostCategoryActionDto2 = createFromParcel6;
                if (parcel.readInt() == 0) {
                    wallWallpostCategoryActionDto = wallWallpostCategoryActionDto2;
                    createFromParcel7 = null;
                } else {
                    wallWallpostCategoryActionDto = wallWallpostCategoryActionDto2;
                    createFromParcel7 = TopicIdDto.CREATOR.createFromParcel(parcel);
                }
                TopicIdDto topicIdDto = createFromParcel7;
                if (parcel.readInt() == 0) {
                    valueOf10 = null;
                } else {
                    valueOf10 = Boolean.valueOf(parcel.readInt() != 0);
                }
                BaseBottomExtensionDto baseBottomExtensionDto2 = (BaseBottomExtensionDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                Integer valueOf26 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf27 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    baseBottomExtensionDto = baseBottomExtensionDto2;
                    createFromParcel8 = null;
                } else {
                    baseBottomExtensionDto = baseBottomExtensionDto2;
                    createFromParcel8 = WallCoownersDto.CREATOR.createFromParcel(parcel);
                }
                WallCoownersDto wallCoownersDto = createFromParcel8;
                Boolean bool2 = valueOf3;
                Boolean bool3 = valueOf2;
                WallPostActivityDto wallPostActivityDto3 = wallPostActivityDto;
                NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto4 = newsfeedNewsfeedItemTypeDto;
                BaseBoolIntDto baseBoolIntDto14 = baseBoolIntDto;
                Boolean bool4 = valueOf6;
                AdsAdvertiserInfoDto adsAdvertiserInfoDto3 = adsAdvertiserInfoDto;
                Boolean bool5 = valueOf8;
                Boolean bool6 = valueOf9;
                WallWallpostCategoryActionDto wallWallpostCategoryActionDto3 = wallWallpostCategoryActionDto;
                Boolean bool7 = valueOf10;
                BaseBottomExtensionDto baseBottomExtensionDto3 = baseBottomExtensionDto;
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf11 = null;
                } else {
                    valueOf11 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer valueOf28 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf29 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf30 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf12 = null;
                } else {
                    valueOf12 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf13 = null;
                } else {
                    valueOf13 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Object readValue = parcel.readValue(NewsfeedItemWallpostDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf14 = null;
                } else {
                    valueOf14 = Boolean.valueOf(parcel.readInt() != 0);
                }
                UserId userId6 = (UserId) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf15 = null;
                } else {
                    valueOf15 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf16 = null;
                } else {
                    valueOf16 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    userId = userId6;
                    createFromParcel9 = null;
                } else {
                    userId = userId6;
                    createFromParcel9 = WallWallpostAuthorDataDto.CREATOR.createFromParcel(parcel);
                }
                WallWallpostAuthorDataDto wallWallpostAuthorDataDto2 = createFromParcel9;
                if (parcel.readInt() == 0) {
                    wallWallpostAuthorDataDto = wallWallpostAuthorDataDto2;
                    createFromParcel10 = null;
                } else {
                    wallWallpostAuthorDataDto = wallWallpostAuthorDataDto2;
                    createFromParcel10 = NewsfeedMediascopeResearchDto.CREATOR.createFromParcel(parcel);
                }
                NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto2 = createFromParcel10;
                if (parcel.readInt() == 0) {
                    valueOf17 = null;
                } else {
                    valueOf17 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf18 = null;
                } else {
                    valueOf18 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString6 = parcel.readString();
                Boolean bool8 = valueOf11;
                Integer num2 = valueOf28;
                Integer num3 = valueOf29;
                Integer num4 = valueOf30;
                Boolean bool9 = valueOf12;
                Boolean bool10 = valueOf13;
                Boolean bool11 = valueOf15;
                Boolean bool12 = valueOf16;
                WallWallpostAuthorDataDto wallWallpostAuthorDataDto3 = wallWallpostAuthorDataDto;
                Boolean bool13 = valueOf17;
                Boolean bool14 = valueOf18;
                String readString7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf19 = null;
                } else {
                    valueOf19 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString8 = parcel.readString();
                Boolean bool15 = valueOf19;
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                if (parcel.readInt() == 0) {
                    newsfeedMediascopeResearchDto = newsfeedMediascopeResearchDto2;
                    arrayList2 = arrayList;
                    newsfeedNewsfeedItemTypeDto2 = newsfeedNewsfeedItemTypeDto4;
                    arrayList3 = null;
                } else {
                    newsfeedMediascopeResearchDto = newsfeedMediascopeResearchDto2;
                    int readInt3 = parcel.readInt();
                    arrayList2 = arrayList;
                    arrayList3 = new ArrayList(readInt3);
                    newsfeedNewsfeedItemTypeDto2 = newsfeedNewsfeedItemTypeDto4;
                    int i2 = 0;
                    while (i2 != readInt3) {
                        i2 = bo.b(NewsfeedItemWallpostDto.class, parcel, arrayList3, i2, 1);
                        readInt3 = readInt3;
                    }
                }
                WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto2 = (WallWallpostAttachmentsMetaDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    wallWallpostAttachmentsMetaDto = wallWallpostAttachmentsMetaDto2;
                    arrayList5 = arrayList3;
                    arrayList4 = null;
                } else {
                    int readInt4 = parcel.readInt();
                    wallWallpostAttachmentsMetaDto = wallWallpostAttachmentsMetaDto2;
                    arrayList4 = new ArrayList(readInt4);
                    arrayList5 = arrayList3;
                    int i3 = 0;
                    while (i3 != readInt4) {
                        i3 = bo.b(NewsfeedItemWallpostDto.class, parcel, arrayList4, i3, 1);
                        readInt4 = readInt4;
                    }
                }
                Integer valueOf31 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                BadgesCommentInfoDto badgesCommentInfoDto = (BadgesCommentInfoDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                BadgesDonutInfoDto badgesDonutInfoDto = (BadgesDonutInfoDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf20 = null;
                } else {
                    valueOf20 = Boolean.valueOf(parcel.readInt() != 0);
                }
                BaseBoolIntDto baseBoolIntDto15 = (BaseBoolIntDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    baseBoolIntDto4 = baseBoolIntDto15;
                    createFromParcel11 = null;
                } else {
                    baseBoolIntDto4 = baseBoolIntDto15;
                    createFromParcel11 = WallPostCopyrightDto.CREATOR.createFromParcel(parcel);
                }
                WallPostCopyrightDto wallPostCopyrightDto = createFromParcel11;
                Integer valueOf32 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                UserId userId7 = (UserId) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                WallGeoDto wallGeoDto = (WallGeoDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                Integer valueOf33 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf21 = null;
                } else {
                    valueOf21 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf22 = null;
                } else {
                    valueOf22 = Boolean.valueOf(parcel.readInt() != 0);
                }
                BaseLikesInfoDto baseLikesInfoDto = (BaseLikesInfoDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                ArrayList arrayList8 = arrayList5;
                String readString11 = parcel.readString();
                LikesItemReactionsDto likesItemReactionsDto2 = (LikesItemReactionsDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    likesItemReactionsDto = likesItemReactionsDto2;
                    createFromParcel12 = null;
                } else {
                    likesItemReactionsDto = likesItemReactionsDto2;
                    createFromParcel12 = BadgesObjectInfoDto.CREATOR.createFromParcel(parcel);
                }
                BadgesObjectInfoDto badgesObjectInfoDto = createFromParcel12;
                UserId userId8 = (UserId) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                UserId userId9 = (UserId) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                Integer valueOf34 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                UserId userId10 = (UserId) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    userId2 = userId10;
                    createFromParcel13 = null;
                } else {
                    userId2 = userId10;
                    createFromParcel13 = WallPosterDto.CREATOR.createFromParcel(parcel);
                }
                WallPosterDto wallPosterDto2 = createFromParcel13;
                Integer valueOf35 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    wallPosterDto = wallPosterDto2;
                    arrayList6 = arrayList4;
                    num = valueOf31;
                    arrayList7 = null;
                } else {
                    wallPosterDto = wallPosterDto2;
                    int readInt5 = parcel.readInt();
                    arrayList6 = arrayList4;
                    arrayList7 = new ArrayList(readInt5);
                    num = valueOf31;
                    int i4 = 0;
                    while (i4 != readInt5) {
                        i4 = pm0.b(parcel, arrayList7, i4, 1);
                        readInt5 = readInt5;
                    }
                }
                return new NewsfeedItemWallpostDto(newsfeedNewsfeedItemTypeDto2, userId4, readInt, createFromParcel14, valueOf23, createFromParcel15, valueOf24, bool, newsfeedNewsfeedItemCaptionDto, bool3, readString, wallPostActivityDto3, valueOf25, newsfeedPushSubscriptionDto, bool2, newsfeedItemWallpostFeedbackDto, newsfeedItemDebugInfoDto, wallWallpostAdsEasyPromoteDto, valueOf4, arrayList2, baseBoolIntDto5, userId5, baseBoolIntDto6, baseBoolIntDto7, baseBoolIntDto14, wallWallpostDonutDto, baseBoolIntDto9, baseBoolIntDto10, baseBoolIntDto11, valueOf5, baseBoolIntDto2, baseCommentsInfoDto, baseBoolIntDto3, bool4, adsAdvertiserInfoDto3, valueOf7, wallWallpostRatingDto, bool5, bool6, wallWallpostCategoryActionDto3, topicIdDto, bool7, baseBottomExtensionDto3, valueOf26, valueOf27, wallCoownersDto, readString2, readString3, readString4, readString5, bool8, num2, num3, num4, bool9, bool10, readValue, valueOf14, userId, bool11, bool12, wallWallpostAuthorDataDto3, newsfeedMediascopeResearchDto, bool13, bool14, readString6, readString7, bool15, readString8, readString9, readString10, arrayList8, wallWallpostAttachmentsMetaDto, arrayList6, num, badgesCommentInfoDto, badgesDonutInfoDto, valueOf20, baseBoolIntDto4, wallPostCopyrightDto, valueOf32, userId7, wallGeoDto, valueOf33, valueOf21, valueOf22, baseLikesInfoDto, readString11, likesItemReactionsDto, badgesObjectInfoDto, userId8, userId9, valueOf34, userId2, wallPosterDto, valueOf35, arrayList7, parcel.readInt() == 0 ? null : WallPostSourceDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : WallPostTypeDto.CREATOR.createFromParcel(parcel), (BaseRepostsInfoDto) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader()), (UserId) parcel.readParcelable(NewsfeedItemWallpostDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : WallViewsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : WallSharingDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemWallpostDto[] newArray(int i) {
                return new NewsfeedItemWallpostDto[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ NewsfeedItemWallpostDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, InnerTypeDto innerTypeDto, Float f, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, Integer num, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str, WallPostActivityDto wallPostActivityDto, Float f2, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto, Boolean bool4, List list, BaseBoolIntDto baseBoolIntDto, UserId userId2, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, WallWallpostDonutDto wallWallpostDonutDto, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, Boolean bool5, BaseBoolIntDto baseBoolIntDto8, BaseCommentsInfoDto baseCommentsInfoDto, BaseBoolIntDto baseBoolIntDto9, Boolean bool6, AdsAdvertiserInfoDto adsAdvertiserInfoDto, Boolean bool7, WallWallpostRatingDto wallWallpostRatingDto, Boolean bool8, Boolean bool9, WallWallpostCategoryActionDto wallWallpostCategoryActionDto, TopicIdDto topicIdDto, Boolean bool10, BaseBottomExtensionDto baseBottomExtensionDto, Integer num2, Integer num3, WallCoownersDto wallCoownersDto, String str2, String str3, String str4, String str5, Boolean bool11, Integer num4, Integer num5, Integer num6, Boolean bool12, Boolean bool13, Object obj, Boolean bool14, UserId userId3, Boolean bool15, Boolean bool16, WallWallpostAuthorDataDto wallWallpostAuthorDataDto, NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto, Boolean bool17, Boolean bool18, String str6, String str7, Boolean bool19, String str8, String str9, String str10, List list2, WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto, List list3, Integer num7, BadgesCommentInfoDto badgesCommentInfoDto, BadgesDonutInfoDto badgesDonutInfoDto, Boolean bool20, BaseBoolIntDto baseBoolIntDto10, WallPostCopyrightDto wallPostCopyrightDto, Integer num8, UserId userId4, WallGeoDto wallGeoDto, Integer num9, Boolean bool21, Boolean bool22, BaseLikesInfoDto baseLikesInfoDto, String str11, LikesItemReactionsDto likesItemReactionsDto, BadgesObjectInfoDto badgesObjectInfoDto, UserId userId5, UserId userId6, Integer num10, UserId userId7, WallPosterDto wallPosterDto, Integer num11, List list4, WallPostSourceDto wallPostSourceDto, WallPostTypeDto wallPostTypeDto, BaseRepostsInfoDto baseRepostsInfoDto, UserId userId8, String str12, WallViewsDto wallViewsDto, Integer num12, WallSharingDto wallSharingDto, int i2, int i3, int i4, int i5, zcl zclVar) {
            this(newsfeedNewsfeedItemTypeDto, userId, i, innerTypeDto, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19, r21, r23, r25, r27, r29, r31, r33, r35, r36, r37, r38, r39, r40, r41, r90, r42, r43, r44, r45, r46, r47, r48, r5, r91, r92, r93, r94, r95, r96, r0, (i3 & 32768) != 0 ? null : str3, (i3 & 65536) != 0 ? null : str4, (i3 & 131072) != 0 ? null : str5, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool11, (i3 & 524288) != 0 ? null : num4, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num5, (i3 & 2097152) != 0 ? null : num6, (i3 & 4194304) != 0 ? null : bool12, (i3 & 8388608) != 0 ? null : bool13, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : obj, (i3 & 33554432) != 0 ? null : bool14, (i3 & 67108864) != 0 ? null : userId3, (i3 & 134217728) != 0 ? null : bool15, (i3 & 268435456) != 0 ? null : bool16, (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : wallWallpostAuthorDataDto, (i3 & 1073741824) != 0 ? null : newsfeedMediascopeResearchDto, (i3 & Integer.MIN_VALUE) != 0 ? null : bool17, (i4 & 1) != 0 ? null : bool18, (i4 & 2) != 0 ? null : str6, (i4 & 4) != 0 ? null : str7, (i4 & 8) != 0 ? null : bool19, (i4 & 16) != 0 ? null : str8, (i4 & 32) != 0 ? null : str9, (i4 & 64) != 0 ? null : str10, (i4 & 128) != 0 ? null : list2, (i4 & 256) != 0 ? null : wallWallpostAttachmentsMetaDto, (i4 & 512) != 0 ? null : list3, (i4 & 1024) != 0 ? null : num7, (i4 & 2048) != 0 ? null : badgesCommentInfoDto, (i4 & 4096) != 0 ? null : badgesDonutInfoDto, (i4 & 8192) != 0 ? null : bool20, (i4 & 16384) != 0 ? null : baseBoolIntDto10, (i4 & 32768) != 0 ? null : wallPostCopyrightDto, (i4 & 65536) != 0 ? null : num8, (i4 & 131072) != 0 ? null : userId4, (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : wallGeoDto, (i4 & 524288) != 0 ? null : num9, (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool21, (i4 & 2097152) != 0 ? null : bool22, (i4 & 4194304) != 0 ? null : baseLikesInfoDto, (i4 & 8388608) != 0 ? null : str11, (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : likesItemReactionsDto, (i4 & 33554432) != 0 ? null : badgesObjectInfoDto, (i4 & 67108864) != 0 ? null : userId5, (i4 & 134217728) != 0 ? null : userId6, (i4 & 268435456) != 0 ? null : num10, (i4 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : userId7, (i4 & 1073741824) != 0 ? null : wallPosterDto, (i4 & Integer.MIN_VALUE) != 0 ? null : num11, (i5 & 1) != 0 ? null : list4, (i5 & 2) != 0 ? null : wallPostSourceDto, (i5 & 4) != 0 ? null : wallPostTypeDto, (i5 & 8) != 0 ? null : baseRepostsInfoDto, (i5 & 16) != 0 ? null : userId8, (i5 & 32) != 0 ? null : str12, (i5 & 64) != 0 ? null : wallViewsDto, (i5 & 128) != 0 ? null : num12, (i5 & 256) != 0 ? null : wallSharingDto);
            Float f3 = (i2 & 16) != 0 ? null : f;
            NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto2 = (i2 & 32) != 0 ? null : newsfeedNewsfeedItemHeaderDto;
            Integer num13 = (i2 & 64) != 0 ? null : num;
            Boolean bool23 = (i2 & 128) != 0 ? null : bool;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto2 = (i2 & 256) != 0 ? null : newsfeedNewsfeedItemCaptionDto;
            Boolean bool24 = (i2 & 512) != 0 ? null : bool2;
            String str13 = (i2 & 1024) != 0 ? null : str;
            WallPostActivityDto wallPostActivityDto2 = (i2 & 2048) != 0 ? null : wallPostActivityDto;
            Float f4 = (i2 & 4096) != 0 ? null : f2;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto2 = (i2 & 8192) != 0 ? null : newsfeedPushSubscriptionDto;
            Boolean bool25 = (i2 & 16384) != 0 ? null : bool3;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto2 = (i2 & 32768) != 0 ? null : newsfeedItemWallpostFeedbackDto;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto2 = (i2 & 65536) != 0 ? null : newsfeedItemDebugInfoDto;
            WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto2 = (i2 & 131072) != 0 ? null : wallWallpostAdsEasyPromoteDto;
            Boolean bool26 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool4;
            List list5 = (i2 & 524288) != 0 ? null : list;
            BaseBoolIntDto baseBoolIntDto11 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : baseBoolIntDto;
            UserId userId9 = (i2 & 2097152) != 0 ? null : userId2;
            BaseBoolIntDto baseBoolIntDto12 = (i2 & 4194304) != 0 ? null : baseBoolIntDto2;
            BaseBoolIntDto baseBoolIntDto13 = (i2 & 8388608) != 0 ? null : baseBoolIntDto3;
            BaseBoolIntDto baseBoolIntDto14 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : baseBoolIntDto4;
            WallWallpostDonutDto wallWallpostDonutDto2 = (i2 & 33554432) != 0 ? null : wallWallpostDonutDto;
            BaseBoolIntDto baseBoolIntDto15 = (i2 & 67108864) != 0 ? null : baseBoolIntDto5;
            BaseBoolIntDto baseBoolIntDto16 = (i2 & 134217728) != 0 ? null : baseBoolIntDto6;
            BaseBoolIntDto baseBoolIntDto17 = (i2 & 268435456) != 0 ? null : baseBoolIntDto7;
            Boolean bool27 = (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool5;
            BaseBoolIntDto baseBoolIntDto18 = (i2 & 1073741824) != 0 ? null : baseBoolIntDto8;
            BaseCommentsInfoDto baseCommentsInfoDto2 = (i2 & Integer.MIN_VALUE) != 0 ? null : baseCommentsInfoDto;
            BaseBoolIntDto baseBoolIntDto19 = (i3 & 1) != 0 ? null : baseBoolIntDto9;
            Boolean bool28 = (i3 & 2) != 0 ? null : bool6;
            AdsAdvertiserInfoDto adsAdvertiserInfoDto2 = (i3 & 4) != 0 ? null : adsAdvertiserInfoDto;
            Boolean bool29 = (i3 & 8) != 0 ? null : bool7;
            WallWallpostRatingDto wallWallpostRatingDto2 = (i3 & 16) != 0 ? null : wallWallpostRatingDto;
            Boolean bool30 = (i3 & 32) != 0 ? null : bool8;
            Boolean bool31 = (i3 & 64) != 0 ? null : bool9;
            WallWallpostCategoryActionDto wallWallpostCategoryActionDto2 = (i3 & 128) != 0 ? null : wallWallpostCategoryActionDto;
            BaseCommentsInfoDto baseCommentsInfoDto3 = baseCommentsInfoDto2;
            TopicIdDto topicIdDto2 = (i3 & 256) != 0 ? null : topicIdDto;
            Boolean bool32 = (i3 & 512) != 0 ? null : bool10;
            BaseBottomExtensionDto baseBottomExtensionDto2 = (i3 & 1024) != 0 ? null : baseBottomExtensionDto;
            Integer num14 = (i3 & 2048) != 0 ? null : num2;
            Integer num15 = (i3 & 4096) != 0 ? null : num3;
            WallCoownersDto wallCoownersDto2 = (i3 & 8192) != 0 ? null : wallCoownersDto;
            String str14 = (i3 & 16384) != 0 ? null : str2;
        }

        public final Integer d() {
            return this.carouselOffset;
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
            if (!(obj instanceof NewsfeedItemWallpostDto)) {
                return false;
            }
            NewsfeedItemWallpostDto newsfeedItemWallpostDto = (NewsfeedItemWallpostDto) obj;
            return this.type == newsfeedItemWallpostDto.type && epx.f(this.sourceId, newsfeedItemWallpostDto.sourceId) && this.date == newsfeedItemWallpostDto.date && this.innerType == newsfeedItemWallpostDto.innerType && epx.f(this.thumbsMaxHeight, newsfeedItemWallpostDto.thumbsMaxHeight) && epx.f(this.header, newsfeedItemWallpostDto.header) && epx.f(this.carouselOffset, newsfeedItemWallpostDto.carouselOffset) && epx.f(this.canIgnore, newsfeedItemWallpostDto.canIgnore) && epx.f(this.caption, newsfeedItemWallpostDto.caption) && epx.f(this.keepOffline, newsfeedItemWallpostDto.keepOffline) && epx.f(this.trackCode, newsfeedItemWallpostDto.trackCode) && epx.f(this.activity, newsfeedItemWallpostDto.activity) && epx.f(this.shortTextRate, newsfeedItemWallpostDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemWallpostDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemWallpostDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemWallpostDto.feedback) && epx.f(this.debugInfo, newsfeedItemWallpostDto.debugInfo) && epx.f(this.adsEasyPromote, newsfeedItemWallpostDto.adsEasyPromote) && epx.f(this.adsEasyPromoteThreeDots, newsfeedItemWallpostDto.adsEasyPromoteThreeDots) && epx.f(this.copyHistory, newsfeedItemWallpostDto.copyHistory) && this.canEdit == newsfeedItemWallpostDto.canEdit && epx.f(this.createdBy, newsfeedItemWallpostDto.createdBy) && this.canDelete == newsfeedItemWallpostDto.canDelete && this.canPublish == newsfeedItemWallpostDto.canPublish && this.canPin == newsfeedItemWallpostDto.canPin && epx.f(this.donut, newsfeedItemWallpostDto.donut) && this.friendsOnly == newsfeedItemWallpostDto.friendsOnly && this.bestFriendsOnly == newsfeedItemWallpostDto.bestFriendsOnly && this.finalPost == newsfeedItemWallpostDto.finalPost && epx.f(this.checkSign, newsfeedItemWallpostDto.checkSign) && this.isPinned == newsfeedItemWallpostDto.isPinned && epx.f(this.comments, newsfeedItemWallpostDto.comments) && this.markedAsAds == newsfeedItemWallpostDto.markedAsAds && epx.f(this.markedAsAuthorAd, newsfeedItemWallpostDto.markedAsAuthorAd) && epx.f(this.authorAd, newsfeedItemWallpostDto.authorAd) && epx.f(this.zoomText, newsfeedItemWallpostDto.zoomText) && epx.f(this.rating, newsfeedItemWallpostDto.rating) && epx.f(this.canSetCategory, newsfeedItemWallpostDto.canSetCategory) && epx.f(this.canDoubtCategory, newsfeedItemWallpostDto.canDoubtCategory) && epx.f(this.categoryAction, newsfeedItemWallpostDto.categoryAction) && this.topicId == newsfeedItemWallpostDto.topicId && epx.f(this.trending, newsfeedItemWallpostDto.trending) && epx.f(this.bottomExtension, newsfeedItemWallpostDto.bottomExtension) && epx.f(this.shortAttachCount, newsfeedItemWallpostDto.shortAttachCount) && epx.f(this.compactAttachmentsBeforeCut, newsfeedItemWallpostDto.compactAttachmentsBeforeCut) && epx.f(this.coowners, newsfeedItemWallpostDto.coowners) && epx.f(this.hash, newsfeedItemWallpostDto.hash) && epx.f(this.adData, newsfeedItemWallpostDto.adData) && epx.f(this.adModerationChecksum, newsfeedItemWallpostDto.adModerationChecksum) && epx.f(this.translationLang, newsfeedItemWallpostDto.translationLang) && epx.f(this.hasTranslation, newsfeedItemWallpostDto.hasTranslation) && epx.f(this.facebookExport, newsfeedItemWallpostDto.facebookExport) && epx.f(this.twitterExport, newsfeedItemWallpostDto.twitterExport) && epx.f(this.postponedId, newsfeedItemWallpostDto.postponedId) && epx.f(this.isPromotedPostStealth, newsfeedItemWallpostDto.isPromotedPostStealth) && epx.f(this.hasVideoAutoplay, newsfeedItemWallpostDto.hasVideoAutoplay) && epx.f(this.awayParams, newsfeedItemWallpostDto.awayParams) && epx.f(this.hideLikes, newsfeedItemWallpostDto.hideLikes) && epx.f(this.toId, newsfeedItemWallpostDto.toId) && epx.f(this.hasMarketLink, newsfeedItemWallpostDto.hasMarketLink) && epx.f(this.isFromPrivateGroup, newsfeedItemWallpostDto.isFromPrivateGroup) && epx.f(this.postAuthorData, newsfeedItemWallpostDto.postAuthorData) && epx.f(this.research, newsfeedItemWallpostDto.research) && epx.f(this.isAddedToMainTab, newsfeedItemWallpostDto.isAddedToMainTab) && epx.f(this.isBlacklisted, newsfeedItemWallpostDto.isBlacklisted) && epx.f(this.shareUrl, newsfeedItemWallpostDto.shareUrl) && epx.f(this.accessKey, newsfeedItemWallpostDto.accessKey) && epx.f(this.isDeleted, newsfeedItemWallpostDto.isDeleted) && epx.f(this.deletedReason, newsfeedItemWallpostDto.deletedReason) && epx.f(this.deletedDetails, newsfeedItemWallpostDto.deletedDetails) && epx.f(this.donutMiniappUrl, newsfeedItemWallpostDto.donutMiniappUrl) && epx.f(this.attachments, newsfeedItemWallpostDto.attachments) && epx.f(this.attachmentsMeta, newsfeedItemWallpostDto.attachmentsMeta) && epx.f(this.contentLayout, newsfeedItemWallpostDto.contentLayout) && epx.f(this.badgeId, newsfeedItemWallpostDto.badgeId) && epx.f(this.badgeInfo, newsfeedItemWallpostDto.badgeInfo) && epx.f(this.donutBadgeInfo, newsfeedItemWallpostDto.donutBadgeInfo) && epx.f(this.canArchive, newsfeedItemWallpostDto.canArchive) && this.canViewStats == newsfeedItemWallpostDto.canViewStats && epx.f(this.copyright, newsfeedItemWallpostDto.copyright) && epx.f(this.edited, newsfeedItemWallpostDto.edited) && epx.f(this.fromId, newsfeedItemWallpostDto.fromId) && epx.f(this.geo, newsfeedItemWallpostDto.geo) && epx.f(this.id, newsfeedItemWallpostDto.id) && epx.f(this.isArchived, newsfeedItemWallpostDto.isArchived) && epx.f(this.isFavorite, newsfeedItemWallpostDto.isFavorite) && epx.f(this.likes, newsfeedItemWallpostDto.likes) && epx.f(this.reactionSetId, newsfeedItemWallpostDto.reactionSetId) && epx.f(this.reactions, newsfeedItemWallpostDto.reactions) && epx.f(this.badges, newsfeedItemWallpostDto.badges) && epx.f(this.ownerId, newsfeedItemWallpostDto.ownerId) && epx.f(this.replyOwnerId, newsfeedItemWallpostDto.replyOwnerId) && epx.f(this.replyPostId, newsfeedItemWallpostDto.replyPostId) && epx.f(this.replyTo, newsfeedItemWallpostDto.replyTo) && epx.f(this.poster, newsfeedItemWallpostDto.poster) && epx.f(this.postId, newsfeedItemWallpostDto.postId) && epx.f(this.parentsStack, newsfeedItemWallpostDto.parentsStack) && epx.f(this.postSource, newsfeedItemWallpostDto.postSource) && this.postType == newsfeedItemWallpostDto.postType && epx.f(this.reposts, newsfeedItemWallpostDto.reposts) && epx.f(this.signerId, newsfeedItemWallpostDto.signerId) && epx.f(this.text, newsfeedItemWallpostDto.text) && epx.f(this.views, newsfeedItemWallpostDto.views) && epx.f(this.replyCount, newsfeedItemWallpostDto.replyCount) && epx.f(this.sharing, newsfeedItemWallpostDto.sharing);
        }

        public final Integer f() {
            return this.id;
        }

        public final Integer g() {
            return this.postId;
        }

        public final int hashCode() {
            int hashCode = (this.innerType.hashCode() + shy.a(this.date, bh10.a(this.type.hashCode() * 31, 31, this.sourceId.b), 31)) * 31;
            Float f = this.thumbsMaxHeight;
            int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
            int hashCode3 = (hashCode2 + (newsfeedNewsfeedItemHeaderDto == null ? 0 : newsfeedNewsfeedItemHeaderDto.hashCode())) * 31;
            Integer num = this.carouselOffset;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool = this.canIgnore;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode6 = (hashCode5 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool2 = this.keepOffline;
            int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.trackCode;
            int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode9 = (hashCode8 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f2 = this.shortTextRate;
            int hashCode10 = (hashCode9 + (f2 == null ? 0 : f2.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode11 = (hashCode10 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool3 = this.suggestSubscribe;
            int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode13 = (hashCode12 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            int hashCode14 = (hashCode13 + (newsfeedItemDebugInfoDto == null ? 0 : newsfeedItemDebugInfoDto.hashCode())) * 31;
            WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto = this.adsEasyPromote;
            int hashCode15 = (hashCode14 + (wallWallpostAdsEasyPromoteDto == null ? 0 : wallWallpostAdsEasyPromoteDto.hashCode())) * 31;
            Boolean bool4 = this.adsEasyPromoteThreeDots;
            int hashCode16 = (hashCode15 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            List<WallWallpostFullDto> list = this.copyHistory;
            int hashCode17 = (hashCode16 + (list == null ? 0 : list.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto = this.canEdit;
            int hashCode18 = (hashCode17 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
            UserId userId = this.createdBy;
            int hashCode19 = (hashCode18 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
            BaseBoolIntDto baseBoolIntDto2 = this.canDelete;
            int hashCode20 = (hashCode19 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto3 = this.canPublish;
            int hashCode21 = (hashCode20 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto4 = this.canPin;
            int hashCode22 = (hashCode21 + (baseBoolIntDto4 == null ? 0 : baseBoolIntDto4.hashCode())) * 31;
            WallWallpostDonutDto wallWallpostDonutDto = this.donut;
            int hashCode23 = (hashCode22 + (wallWallpostDonutDto == null ? 0 : wallWallpostDonutDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto5 = this.friendsOnly;
            int hashCode24 = (hashCode23 + (baseBoolIntDto5 == null ? 0 : baseBoolIntDto5.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto6 = this.bestFriendsOnly;
            int hashCode25 = (hashCode24 + (baseBoolIntDto6 == null ? 0 : baseBoolIntDto6.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto7 = this.finalPost;
            int hashCode26 = (hashCode25 + (baseBoolIntDto7 == null ? 0 : baseBoolIntDto7.hashCode())) * 31;
            Boolean bool5 = this.checkSign;
            int hashCode27 = (hashCode26 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto8 = this.isPinned;
            int hashCode28 = (hashCode27 + (baseBoolIntDto8 == null ? 0 : baseBoolIntDto8.hashCode())) * 31;
            BaseCommentsInfoDto baseCommentsInfoDto = this.comments;
            int hashCode29 = (hashCode28 + (baseCommentsInfoDto == null ? 0 : baseCommentsInfoDto.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto9 = this.markedAsAds;
            int hashCode30 = (hashCode29 + (baseBoolIntDto9 == null ? 0 : baseBoolIntDto9.hashCode())) * 31;
            Boolean bool6 = this.markedAsAuthorAd;
            int hashCode31 = (hashCode30 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            AdsAdvertiserInfoDto adsAdvertiserInfoDto = this.authorAd;
            int hashCode32 = (hashCode31 + (adsAdvertiserInfoDto == null ? 0 : adsAdvertiserInfoDto.hashCode())) * 31;
            Boolean bool7 = this.zoomText;
            int hashCode33 = (hashCode32 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            WallWallpostRatingDto wallWallpostRatingDto = this.rating;
            int hashCode34 = (hashCode33 + (wallWallpostRatingDto == null ? 0 : wallWallpostRatingDto.hashCode())) * 31;
            Boolean bool8 = this.canSetCategory;
            int hashCode35 = (hashCode34 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            Boolean bool9 = this.canDoubtCategory;
            int hashCode36 = (hashCode35 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
            WallWallpostCategoryActionDto wallWallpostCategoryActionDto = this.categoryAction;
            int hashCode37 = (hashCode36 + (wallWallpostCategoryActionDto == null ? 0 : wallWallpostCategoryActionDto.hashCode())) * 31;
            TopicIdDto topicIdDto = this.topicId;
            int hashCode38 = (hashCode37 + (topicIdDto == null ? 0 : topicIdDto.hashCode())) * 31;
            Boolean bool10 = this.trending;
            int hashCode39 = (hashCode38 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
            BaseBottomExtensionDto baseBottomExtensionDto = this.bottomExtension;
            int hashCode40 = (hashCode39 + (baseBottomExtensionDto == null ? 0 : baseBottomExtensionDto.hashCode())) * 31;
            Integer num2 = this.shortAttachCount;
            int hashCode41 = (hashCode40 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.compactAttachmentsBeforeCut;
            int hashCode42 = (hashCode41 + (num3 == null ? 0 : num3.hashCode())) * 31;
            WallCoownersDto wallCoownersDto = this.coowners;
            int hashCode43 = (hashCode42 + (wallCoownersDto == null ? 0 : wallCoownersDto.hashCode())) * 31;
            String str2 = this.hash;
            int hashCode44 = (hashCode43 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.adData;
            int hashCode45 = (hashCode44 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.adModerationChecksum;
            int hashCode46 = (hashCode45 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.translationLang;
            int hashCode47 = (hashCode46 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Boolean bool11 = this.hasTranslation;
            int hashCode48 = (hashCode47 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
            Integer num4 = this.facebookExport;
            int hashCode49 = (hashCode48 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.twitterExport;
            int hashCode50 = (hashCode49 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.postponedId;
            int hashCode51 = (hashCode50 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Boolean bool12 = this.isPromotedPostStealth;
            int hashCode52 = (hashCode51 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
            Boolean bool13 = this.hasVideoAutoplay;
            int hashCode53 = (hashCode52 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
            Object obj = this.awayParams;
            int hashCode54 = (hashCode53 + (obj == null ? 0 : obj.hashCode())) * 31;
            Boolean bool14 = this.hideLikes;
            int hashCode55 = (hashCode54 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
            UserId userId2 = this.toId;
            int hashCode56 = (hashCode55 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
            Boolean bool15 = this.hasMarketLink;
            int hashCode57 = (hashCode56 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
            Boolean bool16 = this.isFromPrivateGroup;
            int hashCode58 = (hashCode57 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
            WallWallpostAuthorDataDto wallWallpostAuthorDataDto = this.postAuthorData;
            int hashCode59 = (hashCode58 + (wallWallpostAuthorDataDto == null ? 0 : wallWallpostAuthorDataDto.hashCode())) * 31;
            NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto = this.research;
            int hashCode60 = (hashCode59 + (newsfeedMediascopeResearchDto == null ? 0 : newsfeedMediascopeResearchDto.hashCode())) * 31;
            Boolean bool17 = this.isAddedToMainTab;
            int hashCode61 = (hashCode60 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
            Boolean bool18 = this.isBlacklisted;
            int hashCode62 = (hashCode61 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
            String str6 = this.shareUrl;
            int hashCode63 = (hashCode62 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.accessKey;
            int hashCode64 = (hashCode63 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Boolean bool19 = this.isDeleted;
            int hashCode65 = (hashCode64 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
            String str8 = this.deletedReason;
            int hashCode66 = (hashCode65 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.deletedDetails;
            int hashCode67 = (hashCode66 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.donutMiniappUrl;
            int hashCode68 = (hashCode67 + (str10 == null ? 0 : str10.hashCode())) * 31;
            List<WallWallpostAttachmentDto> list2 = this.attachments;
            int hashCode69 = (hashCode68 + (list2 == null ? 0 : list2.hashCode())) * 31;
            WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto = this.attachmentsMeta;
            int hashCode70 = (hashCode69 + (wallWallpostAttachmentsMetaDto == null ? 0 : wallWallpostAttachmentsMetaDto.hashCode())) * 31;
            List<WallWallpostContentLayoutItemDto> list3 = this.contentLayout;
            int hashCode71 = (hashCode70 + (list3 == null ? 0 : list3.hashCode())) * 31;
            Integer num7 = this.badgeId;
            int hashCode72 = (hashCode71 + (num7 == null ? 0 : num7.hashCode())) * 31;
            BadgesCommentInfoDto badgesCommentInfoDto = this.badgeInfo;
            int hashCode73 = (hashCode72 + (badgesCommentInfoDto == null ? 0 : badgesCommentInfoDto.hashCode())) * 31;
            BadgesDonutInfoDto badgesDonutInfoDto = this.donutBadgeInfo;
            int hashCode74 = (hashCode73 + (badgesDonutInfoDto == null ? 0 : badgesDonutInfoDto.hashCode())) * 31;
            Boolean bool20 = this.canArchive;
            int hashCode75 = (hashCode74 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
            BaseBoolIntDto baseBoolIntDto10 = this.canViewStats;
            int hashCode76 = (hashCode75 + (baseBoolIntDto10 == null ? 0 : baseBoolIntDto10.hashCode())) * 31;
            WallPostCopyrightDto wallPostCopyrightDto = this.copyright;
            int hashCode77 = (hashCode76 + (wallPostCopyrightDto == null ? 0 : wallPostCopyrightDto.hashCode())) * 31;
            Integer num8 = this.edited;
            int hashCode78 = (hashCode77 + (num8 == null ? 0 : num8.hashCode())) * 31;
            UserId userId3 = this.fromId;
            int hashCode79 = (hashCode78 + (userId3 == null ? 0 : Long.hashCode(userId3.b))) * 31;
            WallGeoDto wallGeoDto = this.geo;
            int hashCode80 = (hashCode79 + (wallGeoDto == null ? 0 : wallGeoDto.hashCode())) * 31;
            Integer num9 = this.id;
            int hashCode81 = (hashCode80 + (num9 == null ? 0 : num9.hashCode())) * 31;
            Boolean bool21 = this.isArchived;
            int hashCode82 = (hashCode81 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
            Boolean bool22 = this.isFavorite;
            int hashCode83 = (hashCode82 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
            BaseLikesInfoDto baseLikesInfoDto = this.likes;
            int hashCode84 = (hashCode83 + (baseLikesInfoDto == null ? 0 : baseLikesInfoDto.hashCode())) * 31;
            String str11 = this.reactionSetId;
            int hashCode85 = (hashCode84 + (str11 == null ? 0 : str11.hashCode())) * 31;
            LikesItemReactionsDto likesItemReactionsDto = this.reactions;
            int hashCode86 = (hashCode85 + (likesItemReactionsDto == null ? 0 : likesItemReactionsDto.hashCode())) * 31;
            BadgesObjectInfoDto badgesObjectInfoDto = this.badges;
            int hashCode87 = (hashCode86 + (badgesObjectInfoDto == null ? 0 : badgesObjectInfoDto.hashCode())) * 31;
            UserId userId4 = this.ownerId;
            int hashCode88 = (hashCode87 + (userId4 == null ? 0 : Long.hashCode(userId4.b))) * 31;
            UserId userId5 = this.replyOwnerId;
            int hashCode89 = (hashCode88 + (userId5 == null ? 0 : Long.hashCode(userId5.b))) * 31;
            Integer num10 = this.replyPostId;
            int hashCode90 = (hashCode89 + (num10 == null ? 0 : num10.hashCode())) * 31;
            UserId userId6 = this.replyTo;
            int hashCode91 = (hashCode90 + (userId6 == null ? 0 : Long.hashCode(userId6.b))) * 31;
            WallPosterDto wallPosterDto = this.poster;
            int hashCode92 = (hashCode91 + (wallPosterDto == null ? 0 : wallPosterDto.hashCode())) * 31;
            Integer num11 = this.postId;
            int hashCode93 = (hashCode92 + (num11 == null ? 0 : num11.hashCode())) * 31;
            List<Integer> list4 = this.parentsStack;
            int hashCode94 = (hashCode93 + (list4 == null ? 0 : list4.hashCode())) * 31;
            WallPostSourceDto wallPostSourceDto = this.postSource;
            int hashCode95 = (hashCode94 + (wallPostSourceDto == null ? 0 : wallPostSourceDto.hashCode())) * 31;
            WallPostTypeDto wallPostTypeDto = this.postType;
            int hashCode96 = (hashCode95 + (wallPostTypeDto == null ? 0 : wallPostTypeDto.hashCode())) * 31;
            BaseRepostsInfoDto baseRepostsInfoDto = this.reposts;
            int hashCode97 = (hashCode96 + (baseRepostsInfoDto == null ? 0 : baseRepostsInfoDto.hashCode())) * 31;
            UserId userId7 = this.signerId;
            int hashCode98 = (hashCode97 + (userId7 == null ? 0 : Long.hashCode(userId7.b))) * 31;
            String str12 = this.text;
            int hashCode99 = (hashCode98 + (str12 == null ? 0 : str12.hashCode())) * 31;
            WallViewsDto wallViewsDto = this.views;
            int hashCode100 = (hashCode99 + (wallViewsDto == null ? 0 : wallViewsDto.hashCode())) * 31;
            Integer num12 = this.replyCount;
            int hashCode101 = (hashCode100 + (num12 == null ? 0 : num12.hashCode())) * 31;
            WallSharingDto wallSharingDto = this.sharing;
            return hashCode101 + (wallSharingDto != null ? wallSharingDto.hashCode() : 0);
        }

        public final WallPostTypeDto i() {
            return this.postType;
        }

        public final Float j() {
            return this.shortTextRate;
        }

        public final UserId k() {
            return this.sourceId;
        }

        public final String l() {
            return this.text;
        }

        public final Float n() {
            return this.thumbsMaxHeight;
        }

        public final NewsfeedNewsfeedItemTypeDto o() {
            return this.type;
        }

        public final UserId q() {
            return this.ownerId;
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            return "NewsfeedItemWallpostDto(type=" + this.type + ", sourceId=" + this.sourceId + ", date=" + this.date + ", innerType=" + this.innerType + ", thumbsMaxHeight=" + this.thumbsMaxHeight + ", header=" + this.header + ", carouselOffset=" + this.carouselOffset + ", canIgnore=" + this.canIgnore + ", caption=" + this.caption + ", keepOffline=" + this.keepOffline + ", trackCode=" + this.trackCode + ", activity=" + this.activity + ", shortTextRate=" + this.shortTextRate + ", pushSubscription=" + this.pushSubscription + ", suggestSubscribe=" + this.suggestSubscribe + ", feedback=" + this.feedback + ", debugInfo=" + this.debugInfo + ", adsEasyPromote=" + this.adsEasyPromote + ", adsEasyPromoteThreeDots=" + this.adsEasyPromoteThreeDots + ", copyHistory=" + this.copyHistory + ", canEdit=" + this.canEdit + ", createdBy=" + this.createdBy + ", canDelete=" + this.canDelete + ", canPublish=" + this.canPublish + ", canPin=" + this.canPin + ", donut=" + this.donut + ", friendsOnly=" + this.friendsOnly + ", bestFriendsOnly=" + this.bestFriendsOnly + ", finalPost=" + this.finalPost + ", checkSign=" + this.checkSign + ", isPinned=" + this.isPinned + ", comments=" + this.comments + ", markedAsAds=" + this.markedAsAds + ", markedAsAuthorAd=" + this.markedAsAuthorAd + ", authorAd=" + this.authorAd + ", zoomText=" + this.zoomText + ", rating=" + this.rating + ", canSetCategory=" + this.canSetCategory + ", canDoubtCategory=" + this.canDoubtCategory + ", categoryAction=" + this.categoryAction + ", topicId=" + this.topicId + ", trending=" + this.trending + ", bottomExtension=" + this.bottomExtension + ", shortAttachCount=" + this.shortAttachCount + ", compactAttachmentsBeforeCut=" + this.compactAttachmentsBeforeCut + ", coowners=" + this.coowners + ", hash=" + this.hash + ", adData=" + this.adData + ", adModerationChecksum=" + this.adModerationChecksum + ", translationLang=" + this.translationLang + ", hasTranslation=" + this.hasTranslation + ", facebookExport=" + this.facebookExport + ", twitterExport=" + this.twitterExport + ", postponedId=" + this.postponedId + ", isPromotedPostStealth=" + this.isPromotedPostStealth + ", hasVideoAutoplay=" + this.hasVideoAutoplay + ", awayParams=" + this.awayParams + ", hideLikes=" + this.hideLikes + ", toId=" + this.toId + ", hasMarketLink=" + this.hasMarketLink + ", isFromPrivateGroup=" + this.isFromPrivateGroup + ", postAuthorData=" + this.postAuthorData + ", research=" + this.research + ", isAddedToMainTab=" + this.isAddedToMainTab + ", isBlacklisted=" + this.isBlacklisted + ", shareUrl=" + this.shareUrl + ", accessKey=" + this.accessKey + ", isDeleted=" + this.isDeleted + ", deletedReason=" + this.deletedReason + ", deletedDetails=" + this.deletedDetails + ", donutMiniappUrl=" + this.donutMiniappUrl + ", attachments=" + this.attachments + ", attachmentsMeta=" + this.attachmentsMeta + ", contentLayout=" + this.contentLayout + ", badgeId=" + this.badgeId + ", badgeInfo=" + this.badgeInfo + ", donutBadgeInfo=" + this.donutBadgeInfo + ", canArchive=" + this.canArchive + ", canViewStats=" + this.canViewStats + ", copyright=" + this.copyright + ", edited=" + this.edited + ", fromId=" + this.fromId + ", geo=" + this.geo + ", id=" + this.id + ", isArchived=" + this.isArchived + ", isFavorite=" + this.isFavorite + ", likes=" + this.likes + ", reactionSetId=" + this.reactionSetId + ", reactions=" + this.reactions + ", badges=" + this.badges + ", ownerId=" + this.ownerId + ", replyOwnerId=" + this.replyOwnerId + ", replyPostId=" + this.replyPostId + ", replyTo=" + this.replyTo + ", poster=" + this.poster + ", postId=" + this.postId + ", parentsStack=" + this.parentsStack + ", postSource=" + this.postSource + ", postType=" + this.postType + ", reposts=" + this.reposts + ", signerId=" + this.signerId + ", text=" + this.text + ", views=" + this.views + ", replyCount=" + this.replyCount + ", sharing=" + this.sharing + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.type, i);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            this.innerType.writeToParcel(parcel, i);
            Float f = this.thumbsMaxHeight;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = this.header;
            if (newsfeedNewsfeedItemHeaderDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedNewsfeedItemHeaderDto.writeToParcel(parcel, i);
            }
            Integer num = this.carouselOffset;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            Boolean bool = this.canIgnore;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool2 = this.keepOffline;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeString(this.trackCode);
            parcel.writeParcelable(this.activity, i);
            Float f2 = this.shortTextRate;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f2);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool3 = this.suggestSubscribe;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
            WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto = this.adsEasyPromote;
            if (wallWallpostAdsEasyPromoteDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallWallpostAdsEasyPromoteDto.writeToParcel(parcel, i);
            }
            Boolean bool4 = this.adsEasyPromoteThreeDots;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            List<WallWallpostFullDto> list = this.copyHistory;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f3 = dn.f(parcel, list, 1);
                while (f3.hasNext()) {
                    ((WallWallpostFullDto) f3.next()).writeToParcel(parcel, i);
                }
            }
            parcel.writeParcelable(this.canEdit, i);
            parcel.writeParcelable(this.createdBy, i);
            parcel.writeParcelable(this.canDelete, i);
            parcel.writeParcelable(this.canPublish, i);
            parcel.writeParcelable(this.canPin, i);
            WallWallpostDonutDto wallWallpostDonutDto = this.donut;
            if (wallWallpostDonutDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallWallpostDonutDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.friendsOnly, i);
            parcel.writeParcelable(this.bestFriendsOnly, i);
            parcel.writeParcelable(this.finalPost, i);
            Boolean bool5 = this.checkSign;
            if (bool5 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool5);
            }
            parcel.writeParcelable(this.isPinned, i);
            BaseCommentsInfoDto baseCommentsInfoDto = this.comments;
            if (baseCommentsInfoDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                baseCommentsInfoDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.markedAsAds, i);
            Boolean bool6 = this.markedAsAuthorAd;
            if (bool6 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool6);
            }
            AdsAdvertiserInfoDto adsAdvertiserInfoDto = this.authorAd;
            if (adsAdvertiserInfoDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                adsAdvertiserInfoDto.writeToParcel(parcel, i);
            }
            Boolean bool7 = this.zoomText;
            if (bool7 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool7);
            }
            WallWallpostRatingDto wallWallpostRatingDto = this.rating;
            if (wallWallpostRatingDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallWallpostRatingDto.writeToParcel(parcel, i);
            }
            Boolean bool8 = this.canSetCategory;
            if (bool8 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool8);
            }
            Boolean bool9 = this.canDoubtCategory;
            if (bool9 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool9);
            }
            WallWallpostCategoryActionDto wallWallpostCategoryActionDto = this.categoryAction;
            if (wallWallpostCategoryActionDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallWallpostCategoryActionDto.writeToParcel(parcel, i);
            }
            TopicIdDto topicIdDto = this.topicId;
            if (topicIdDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                topicIdDto.writeToParcel(parcel, i);
            }
            Boolean bool10 = this.trending;
            if (bool10 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool10);
            }
            parcel.writeParcelable(this.bottomExtension, i);
            Integer num2 = this.shortAttachCount;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
            Integer num3 = this.compactAttachmentsBeforeCut;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num3);
            }
            WallCoownersDto wallCoownersDto = this.coowners;
            if (wallCoownersDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallCoownersDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.hash);
            parcel.writeString(this.adData);
            parcel.writeString(this.adModerationChecksum);
            parcel.writeString(this.translationLang);
            Boolean bool11 = this.hasTranslation;
            if (bool11 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool11);
            }
            Integer num4 = this.facebookExport;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num4);
            }
            Integer num5 = this.twitterExport;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num5);
            }
            Integer num6 = this.postponedId;
            if (num6 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num6);
            }
            Boolean bool12 = this.isPromotedPostStealth;
            if (bool12 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool12);
            }
            Boolean bool13 = this.hasVideoAutoplay;
            if (bool13 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool13);
            }
            parcel.writeValue(this.awayParams);
            Boolean bool14 = this.hideLikes;
            if (bool14 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool14);
            }
            parcel.writeParcelable(this.toId, i);
            Boolean bool15 = this.hasMarketLink;
            if (bool15 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool15);
            }
            Boolean bool16 = this.isFromPrivateGroup;
            if (bool16 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool16);
            }
            WallWallpostAuthorDataDto wallWallpostAuthorDataDto = this.postAuthorData;
            if (wallWallpostAuthorDataDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallWallpostAuthorDataDto.writeToParcel(parcel, i);
            }
            NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto = this.research;
            if (newsfeedMediascopeResearchDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedMediascopeResearchDto.writeToParcel(parcel, i);
            }
            Boolean bool17 = this.isAddedToMainTab;
            if (bool17 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool17);
            }
            Boolean bool18 = this.isBlacklisted;
            if (bool18 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool18);
            }
            parcel.writeString(this.shareUrl);
            parcel.writeString(this.accessKey);
            Boolean bool19 = this.isDeleted;
            if (bool19 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool19);
            }
            parcel.writeString(this.deletedReason);
            parcel.writeString(this.deletedDetails);
            parcel.writeString(this.donutMiniappUrl);
            List<WallWallpostAttachmentDto> list2 = this.attachments;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f4 = dn.f(parcel, list2, 1);
                while (f4.hasNext()) {
                    parcel.writeParcelable((Parcelable) f4.next(), i);
                }
            }
            parcel.writeParcelable(this.attachmentsMeta, i);
            List<WallWallpostContentLayoutItemDto> list3 = this.contentLayout;
            if (list3 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f5 = dn.f(parcel, list3, 1);
                while (f5.hasNext()) {
                    parcel.writeParcelable((Parcelable) f5.next(), i);
                }
            }
            Integer num7 = this.badgeId;
            if (num7 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num7);
            }
            parcel.writeParcelable(this.badgeInfo, i);
            parcel.writeParcelable(this.donutBadgeInfo, i);
            Boolean bool20 = this.canArchive;
            if (bool20 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool20);
            }
            parcel.writeParcelable(this.canViewStats, i);
            WallPostCopyrightDto wallPostCopyrightDto = this.copyright;
            if (wallPostCopyrightDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallPostCopyrightDto.writeToParcel(parcel, i);
            }
            Integer num8 = this.edited;
            if (num8 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num8);
            }
            parcel.writeParcelable(this.fromId, i);
            parcel.writeParcelable(this.geo, i);
            Integer num9 = this.id;
            if (num9 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num9);
            }
            Boolean bool21 = this.isArchived;
            if (bool21 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool21);
            }
            Boolean bool22 = this.isFavorite;
            if (bool22 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool22);
            }
            parcel.writeParcelable(this.likes, i);
            parcel.writeString(this.reactionSetId);
            parcel.writeParcelable(this.reactions, i);
            BadgesObjectInfoDto badgesObjectInfoDto = this.badges;
            if (badgesObjectInfoDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                badgesObjectInfoDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeParcelable(this.replyOwnerId, i);
            Integer num10 = this.replyPostId;
            if (num10 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num10);
            }
            parcel.writeParcelable(this.replyTo, i);
            WallPosterDto wallPosterDto = this.poster;
            if (wallPosterDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallPosterDto.writeToParcel(parcel, i);
            }
            Integer num11 = this.postId;
            if (num11 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num11);
            }
            List<Integer> list4 = this.parentsStack;
            if (list4 == null) {
                parcel.writeInt(0);
            } else {
                Iterator f6 = dn.f(parcel, list4, 1);
                while (f6.hasNext()) {
                    parcel.writeInt(((Number) f6.next()).intValue());
                }
            }
            WallPostSourceDto wallPostSourceDto = this.postSource;
            if (wallPostSourceDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallPostSourceDto.writeToParcel(parcel, i);
            }
            WallPostTypeDto wallPostTypeDto = this.postType;
            if (wallPostTypeDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallPostTypeDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.reposts, i);
            parcel.writeParcelable(this.signerId, i);
            parcel.writeString(this.text);
            WallViewsDto wallViewsDto = this.views;
            if (wallViewsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallViewsDto.writeToParcel(parcel, i);
            }
            Integer num12 = this.replyCount;
            if (num12 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num12);
            }
            WallSharingDto wallSharingDto = this.sharing;
            if (wallSharingDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                wallSharingDto.writeToParcel(parcel, i);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NewsfeedItemWallpostDto(NewsfeedNewsfeedItemTypeDto newsfeedNewsfeedItemTypeDto, UserId userId, int i, InnerTypeDto innerTypeDto, Float f, NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto, Integer num, Boolean bool, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool2, String str, WallPostActivityDto wallPostActivityDto, Float f2, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool3, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, WallWallpostAdsEasyPromoteDto wallWallpostAdsEasyPromoteDto, Boolean bool4, List<WallWallpostFullDto> list, BaseBoolIntDto baseBoolIntDto, UserId userId2, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, WallWallpostDonutDto wallWallpostDonutDto, BaseBoolIntDto baseBoolIntDto5, BaseBoolIntDto baseBoolIntDto6, BaseBoolIntDto baseBoolIntDto7, Boolean bool5, BaseBoolIntDto baseBoolIntDto8, BaseCommentsInfoDto baseCommentsInfoDto, BaseBoolIntDto baseBoolIntDto9, Boolean bool6, AdsAdvertiserInfoDto adsAdvertiserInfoDto, Boolean bool7, WallWallpostRatingDto wallWallpostRatingDto, Boolean bool8, Boolean bool9, WallWallpostCategoryActionDto wallWallpostCategoryActionDto, TopicIdDto topicIdDto, Boolean bool10, BaseBottomExtensionDto baseBottomExtensionDto, Integer num2, Integer num3, WallCoownersDto wallCoownersDto, String str2, String str3, String str4, String str5, Boolean bool11, Integer num4, Integer num5, Integer num6, Boolean bool12, Boolean bool13, Object obj, Boolean bool14, UserId userId3, Boolean bool15, Boolean bool16, WallWallpostAuthorDataDto wallWallpostAuthorDataDto, NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto, Boolean bool17, Boolean bool18, String str6, String str7, Boolean bool19, String str8, String str9, String str10, List<WallWallpostAttachmentDto> list2, WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto, List<? extends WallWallpostContentLayoutItemDto> list3, Integer num7, BadgesCommentInfoDto badgesCommentInfoDto, BadgesDonutInfoDto badgesDonutInfoDto, Boolean bool20, BaseBoolIntDto baseBoolIntDto10, WallPostCopyrightDto wallPostCopyrightDto, Integer num8, UserId userId4, WallGeoDto wallGeoDto, Integer num9, Boolean bool21, Boolean bool22, BaseLikesInfoDto baseLikesInfoDto, String str11, LikesItemReactionsDto likesItemReactionsDto, BadgesObjectInfoDto badgesObjectInfoDto, UserId userId5, UserId userId6, Integer num10, UserId userId7, WallPosterDto wallPosterDto, Integer num11, List<Integer> list4, WallPostSourceDto wallPostSourceDto, WallPostTypeDto wallPostTypeDto, BaseRepostsInfoDto baseRepostsInfoDto, UserId userId8, String str12, WallViewsDto wallViewsDto, Integer num12, WallSharingDto wallSharingDto) {
            super(null);
            this.type = newsfeedNewsfeedItemTypeDto;
            this.sourceId = userId;
            this.date = i;
            this.innerType = innerTypeDto;
            this.thumbsMaxHeight = f;
            this.header = newsfeedNewsfeedItemHeaderDto;
            this.carouselOffset = num;
            this.canIgnore = bool;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool2;
            this.trackCode = str;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f2;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool3;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
            this.adsEasyPromote = wallWallpostAdsEasyPromoteDto;
            this.adsEasyPromoteThreeDots = bool4;
            this.copyHistory = list;
            this.canEdit = baseBoolIntDto;
            this.createdBy = userId2;
            this.canDelete = baseBoolIntDto2;
            this.canPublish = baseBoolIntDto3;
            this.canPin = baseBoolIntDto4;
            this.donut = wallWallpostDonutDto;
            this.friendsOnly = baseBoolIntDto5;
            this.bestFriendsOnly = baseBoolIntDto6;
            this.finalPost = baseBoolIntDto7;
            this.checkSign = bool5;
            this.isPinned = baseBoolIntDto8;
            this.comments = baseCommentsInfoDto;
            this.markedAsAds = baseBoolIntDto9;
            this.markedAsAuthorAd = bool6;
            this.authorAd = adsAdvertiserInfoDto;
            this.zoomText = bool7;
            this.rating = wallWallpostRatingDto;
            this.canSetCategory = bool8;
            this.canDoubtCategory = bool9;
            this.categoryAction = wallWallpostCategoryActionDto;
            this.topicId = topicIdDto;
            this.trending = bool10;
            this.bottomExtension = baseBottomExtensionDto;
            this.shortAttachCount = num2;
            this.compactAttachmentsBeforeCut = num3;
            this.coowners = wallCoownersDto;
            this.hash = str2;
            this.adData = str3;
            this.adModerationChecksum = str4;
            this.translationLang = str5;
            this.hasTranslation = bool11;
            this.facebookExport = num4;
            this.twitterExport = num5;
            this.postponedId = num6;
            this.isPromotedPostStealth = bool12;
            this.hasVideoAutoplay = bool13;
            this.awayParams = obj;
            this.hideLikes = bool14;
            this.toId = userId3;
            this.hasMarketLink = bool15;
            this.isFromPrivateGroup = bool16;
            this.postAuthorData = wallWallpostAuthorDataDto;
            this.research = newsfeedMediascopeResearchDto;
            this.isAddedToMainTab = bool17;
            this.isBlacklisted = bool18;
            this.shareUrl = str6;
            this.accessKey = str7;
            this.isDeleted = bool19;
            this.deletedReason = str8;
            this.deletedDetails = str9;
            this.donutMiniappUrl = str10;
            this.attachments = list2;
            this.attachmentsMeta = wallWallpostAttachmentsMetaDto;
            this.contentLayout = list3;
            this.badgeId = num7;
            this.badgeInfo = badgesCommentInfoDto;
            this.donutBadgeInfo = badgesDonutInfoDto;
            this.canArchive = bool20;
            this.canViewStats = baseBoolIntDto10;
            this.copyright = wallPostCopyrightDto;
            this.edited = num8;
            this.fromId = userId4;
            this.geo = wallGeoDto;
            this.id = num9;
            this.isArchived = bool21;
            this.isFavorite = bool22;
            this.likes = baseLikesInfoDto;
            this.reactionSetId = str11;
            this.reactions = likesItemReactionsDto;
            this.badges = badgesObjectInfoDto;
            this.ownerId = userId5;
            this.replyOwnerId = userId6;
            this.replyPostId = num10;
            this.replyTo = userId7;
            this.poster = wallPosterDto;
            this.postId = num11;
            this.parentsStack = list4;
            this.postSource = wallPostSourceDto;
            this.postType = wallPostTypeDto;
            this.reposts = baseRepostsInfoDto;
            this.signerId = userId8;
            this.text = str12;
            this.views = wallViewsDto;
            this.replyCount = num12;
            this.sharing = wallSharingDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedItemYoulaCarouselBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedItemYoulaCarouselBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("block_description")
        private final String blockDescription;

        @pmi0("block_title")
        private final String blockTitle;

        @pmi0("can_be_filtered")
        private final Boolean canBeFiltered;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("create_button_url")
        private final String createButtonUrl;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("group")
        private final ClassifiedsYoulaCarouselBlockGroupDto group;

        @pmi0("is_async")
        private final boolean isAsync;

        @pmi0("items")
        private final List<ClassifiedsYoulaItemExtendedDto> items;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("more_button_url")
        private final String moreButtonUrl;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("view_style")
        private final String viewStyle;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("youla_carousel")
            public static final TypeDto YOULA_CAROUSEL;
            private final String value;

            /* compiled from: NewsfeedNewsfeedItemDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("YOULA_CAROUSEL", 0, "youla_carousel");
                YOULA_CAROUSEL = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
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

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedItemYoulaCarouselBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemYoulaCarouselBlockDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean valueOf4;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(ClassifiedsYoulaItemExtendedDto.CREATOR, parcel, arrayList, i, 1);
                }
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                UserId userId = (UserId) parcel.readParcelable(NewsfeedItemYoulaCarouselBlockDto.class.getClassLoader());
                int readInt2 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Boolean bool = valueOf;
                String readString5 = parcel.readString();
                ClassifiedsYoulaCarouselBlockGroupDto createFromParcel2 = parcel.readInt() == 0 ? null : ClassifiedsYoulaCarouselBlockGroupDto.CREATOR.createFromParcel(parcel);
                String readString6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedItemYoulaCarouselBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedItemYoulaCarouselBlockDto.class.getClassLoader());
                Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedItemYoulaCarouselBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedItemYoulaCarouselBlockDto(createFromParcel, arrayList, readString, readString2, z, userId, readInt2, bool, readString3, readString4, readString5, createFromParcel2, readString6, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, wallPostActivityDto, valueOf5, newsfeedPushSubscriptionDto, valueOf4, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedItemYoulaCarouselBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedItemYoulaCarouselBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedItemYoulaCarouselBlockDto[] newArray(int i) {
                return new NewsfeedItemYoulaCarouselBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedItemYoulaCarouselBlockDto(TypeDto typeDto, List list, String str, String str2, boolean z, UserId userId, int i, Boolean bool, String str3, String str4, String str5, ClassifiedsYoulaCarouselBlockGroupDto classifiedsYoulaCarouselBlockGroupDto, String str6, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i2, zcl zclVar) {
            this(typeDto, list, str, str2, z, userId, i, (i2 & 128) != 0 ? null : bool, (i2 & 256) != 0 ? null : str3, (i2 & 512) != 0 ? null : str4, (i2 & 1024) != 0 ? null : str5, (i2 & 2048) != 0 ? null : classifiedsYoulaCarouselBlockGroupDto, (i2 & 4096) != 0 ? null : str6, (i2 & 8192) != 0 ? null : bool2, (i2 & 16384) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (32768 & i2) != 0 ? null : bool3, (65536 & i2) != 0 ? null : wallPostActivityDto, (131072 & i2) != 0 ? null : f, (262144 & i2) != 0 ? null : newsfeedPushSubscriptionDto, (524288 & i2) != 0 ? null : bool4, (1048576 & i2) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i2 & 2097152) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedItemYoulaCarouselBlockDto)) {
                return false;
            }
            NewsfeedItemYoulaCarouselBlockDto newsfeedItemYoulaCarouselBlockDto = (NewsfeedItemYoulaCarouselBlockDto) obj;
            return this.type == newsfeedItemYoulaCarouselBlockDto.type && epx.f(this.items, newsfeedItemYoulaCarouselBlockDto.items) && epx.f(this.createButtonUrl, newsfeedItemYoulaCarouselBlockDto.createButtonUrl) && epx.f(this.moreButtonUrl, newsfeedItemYoulaCarouselBlockDto.moreButtonUrl) && this.isAsync == newsfeedItemYoulaCarouselBlockDto.isAsync && epx.f(this.sourceId, newsfeedItemYoulaCarouselBlockDto.sourceId) && this.date == newsfeedItemYoulaCarouselBlockDto.date && epx.f(this.canBeFiltered, newsfeedItemYoulaCarouselBlockDto.canBeFiltered) && epx.f(this.blockTitle, newsfeedItemYoulaCarouselBlockDto.blockTitle) && epx.f(this.blockDescription, newsfeedItemYoulaCarouselBlockDto.blockDescription) && epx.f(this.trackCode, newsfeedItemYoulaCarouselBlockDto.trackCode) && epx.f(this.group, newsfeedItemYoulaCarouselBlockDto.group) && epx.f(this.viewStyle, newsfeedItemYoulaCarouselBlockDto.viewStyle) && epx.f(this.canIgnore, newsfeedItemYoulaCarouselBlockDto.canIgnore) && epx.f(this.caption, newsfeedItemYoulaCarouselBlockDto.caption) && epx.f(this.keepOffline, newsfeedItemYoulaCarouselBlockDto.keepOffline) && epx.f(this.activity, newsfeedItemYoulaCarouselBlockDto.activity) && epx.f(this.shortTextRate, newsfeedItemYoulaCarouselBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedItemYoulaCarouselBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedItemYoulaCarouselBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedItemYoulaCarouselBlockDto.feedback) && epx.f(this.debugInfo, newsfeedItemYoulaCarouselBlockDto.debugInfo);
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(qoy.b(urd0.a(urd0.a(fw3.a(this.type.hashCode() * 31, 31, this.items), 31, this.createButtonUrl), 31, this.moreButtonUrl), 31, this.isAsync), 31, this.sourceId.b), 31);
            Boolean bool = this.canBeFiltered;
            int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
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
            Boolean bool2 = this.canIgnore;
            int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode8 = (hashCode7 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode10 = (hashCode9 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode11 = (hashCode10 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode12 = (hashCode11 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode13 = (hashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode14 = (hashCode13 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode14 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedItemYoulaCarouselBlockDto(type=");
            sb.append(this.type);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", createButtonUrl=");
            sb.append(this.createButtonUrl);
            sb.append(", moreButtonUrl=");
            sb.append(this.moreButtonUrl);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", canBeFiltered=");
            sb.append(this.canBeFiltered);
            sb.append(", blockTitle=");
            sb.append(this.blockTitle);
            sb.append(", blockDescription=");
            sb.append(this.blockDescription);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", group=");
            sb.append(this.group);
            sb.append(", viewStyle=");
            sb.append(this.viewStyle);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((ClassifiedsYoulaItemExtendedDto) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeString(this.createButtonUrl);
            parcel.writeString(this.moreButtonUrl);
            parcel.writeInt(this.isAsync ? 1 : 0);
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            Boolean bool = this.canBeFiltered;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            parcel.writeString(this.blockTitle);
            parcel.writeString(this.blockDescription);
            parcel.writeString(this.trackCode);
            ClassifiedsYoulaCarouselBlockGroupDto classifiedsYoulaCarouselBlockGroupDto = this.group;
            if (classifiedsYoulaCarouselBlockGroupDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                classifiedsYoulaCarouselBlockGroupDto.writeToParcel(parcel, i);
            }
            parcel.writeString(this.viewStyle);
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedItemYoulaCarouselBlockDto(TypeDto typeDto, List<ClassifiedsYoulaItemExtendedDto> list, String str, String str2, boolean z, UserId userId, int i, Boolean bool, String str3, String str4, String str5, ClassifiedsYoulaCarouselBlockGroupDto classifiedsYoulaCarouselBlockGroupDto, String str6, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.type = typeDto;
            this.items = list;
            this.createButtonUrl = str;
            this.moreButtonUrl = str2;
            this.isAsync = z;
            this.sourceId = userId;
            this.date = i;
            this.canBeFiltered = bool;
            this.blockTitle = str3;
            this.blockDescription = str4;
            this.trackCode = str5;
            this.group = classifiedsYoulaCarouselBlockGroupDto;
            this.viewStyle = str6;
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    /* compiled from: NewsfeedNewsfeedItemDto.kt */
    public static final class NewsfeedMediaDiscoverBlockDto extends NewsfeedNewsfeedItemDto implements Parcelable {
        public static final Parcelable.Creator<NewsfeedMediaDiscoverBlockDto> CREATOR = new a();

        @pmi0("activity")
        private final WallPostActivityDto activity;

        @pmi0("can_ignore")
        private final Boolean canIgnore;

        @pmi0("caption")
        private final NewsfeedNewsfeedItemCaptionDto caption;

        @pmi0("date")
        private final int date;

        @pmi0("debug_info")
        private final NewsfeedItemDebugInfoDto debugInfo;

        @pmi0("feedback")
        private final NewsfeedItemWallpostFeedbackDto feedback;

        @pmi0("footer")
        private final NewsfeedMediaDiscoverBlockFooterDto footer;

        @pmi0("header")
        private final NewsfeedMediaDiscoverBlockHeaderDto header;

        @pmi0("height")
        private final int height;

        @pmi0("is_async")
        private final Boolean isAsync;

        @pmi0("items")
        private final List<NewsfeedMediaDiscoverItemDto> items;

        @pmi0("keep_offline")
        private final Boolean keepOffline;

        @pmi0("push_subscription")
        private final NewsfeedPushSubscriptionDto pushSubscription;

        @pmi0("research")
        private final NewsfeedMediascopeResearchDto research;

        @pmi0("short_text_rate")
        private final Float shortTextRate;

        @pmi0("source_id")
        private final UserId sourceId;

        @pmi0("suggest_subscribe")
        private final Boolean suggestSubscribe;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("width")
        private final int width;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("discover_media_block")
            public static final TypeDto DISCOVER_MEDIA_BLOCK;
            private final String value;

            /* compiled from: NewsfeedNewsfeedItemDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("DISCOVER_MEDIA_BLOCK", 0, "discover_media_block");
                DISCOVER_MEDIA_BLOCK = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String i() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: NewsfeedNewsfeedItemDto.kt */
        public static final class a implements Parcelable.Creator<NewsfeedMediaDiscoverBlockDto> {
            @Override // android.os.Parcelable.Creator
            public final NewsfeedMediaDiscoverBlockDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean valueOf4;
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt3);
                int i = 0;
                while (i != readInt3) {
                    i = en.a(NewsfeedMediaDiscoverItemDto.CREATOR, parcel, arrayList, i, 1);
                }
                UserId userId = (UserId) parcel.readParcelable(NewsfeedMediaDiscoverBlockDto.class.getClassLoader());
                int readInt4 = parcel.readInt();
                String readString = parcel.readString();
                NewsfeedMediaDiscoverBlockHeaderDto createFromParcel2 = parcel.readInt() == 0 ? null : NewsfeedMediaDiscoverBlockHeaderDto.CREATOR.createFromParcel(parcel);
                NewsfeedMediaDiscoverBlockFooterDto createFromParcel3 = parcel.readInt() == 0 ? null : NewsfeedMediaDiscoverBlockFooterDto.CREATOR.createFromParcel(parcel);
                NewsfeedMediascopeResearchDto createFromParcel4 = parcel.readInt() == 0 ? null : NewsfeedMediascopeResearchDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = (NewsfeedNewsfeedItemCaptionDto) parcel.readParcelable(NewsfeedMediaDiscoverBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                WallPostActivityDto wallPostActivityDto = (WallPostActivityDto) parcel.readParcelable(NewsfeedMediaDiscoverBlockDto.class.getClassLoader());
                Float valueOf5 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
                NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = (NewsfeedPushSubscriptionDto) parcel.readParcelable(NewsfeedMediaDiscoverBlockDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new NewsfeedMediaDiscoverBlockDto(readInt, readInt2, createFromParcel, arrayList, userId, readInt4, readString, createFromParcel2, createFromParcel3, createFromParcel4, valueOf, valueOf2, newsfeedNewsfeedItemCaptionDto, valueOf3, wallPostActivityDto, valueOf5, newsfeedPushSubscriptionDto, valueOf4, (NewsfeedItemWallpostFeedbackDto) parcel.readParcelable(NewsfeedMediaDiscoverBlockDto.class.getClassLoader()), (NewsfeedItemDebugInfoDto) parcel.readParcelable(NewsfeedMediaDiscoverBlockDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NewsfeedMediaDiscoverBlockDto[] newArray(int i) {
                return new NewsfeedMediaDiscoverBlockDto[i];
            }
        }

        public /* synthetic */ NewsfeedMediaDiscoverBlockDto(int i, int i2, TypeDto typeDto, List list, UserId userId, int i3, String str, NewsfeedMediaDiscoverBlockHeaderDto newsfeedMediaDiscoverBlockHeaderDto, NewsfeedMediaDiscoverBlockFooterDto newsfeedMediaDiscoverBlockFooterDto, NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto, int i4, zcl zclVar) {
            this(i, i2, typeDto, list, userId, i3, (i4 & 64) != 0 ? null : str, (i4 & 128) != 0 ? null : newsfeedMediaDiscoverBlockHeaderDto, (i4 & 256) != 0 ? null : newsfeedMediaDiscoverBlockFooterDto, (i4 & 512) != 0 ? null : newsfeedMediascopeResearchDto, (i4 & 1024) != 0 ? null : bool, (i4 & 2048) != 0 ? null : bool2, (i4 & 4096) != 0 ? null : newsfeedNewsfeedItemCaptionDto, (i4 & 8192) != 0 ? null : bool3, (i4 & 16384) != 0 ? null : wallPostActivityDto, (32768 & i4) != 0 ? null : f, (65536 & i4) != 0 ? null : newsfeedPushSubscriptionDto, (131072 & i4) != 0 ? null : bool4, (262144 & i4) != 0 ? null : newsfeedItemWallpostFeedbackDto, (i4 & 524288) != 0 ? null : newsfeedItemDebugInfoDto);
        }

        public final NewsfeedItemDebugInfoDto d() {
            return this.debugInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final NewsfeedItemWallpostFeedbackDto e() {
            return this.feedback;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewsfeedMediaDiscoverBlockDto)) {
                return false;
            }
            NewsfeedMediaDiscoverBlockDto newsfeedMediaDiscoverBlockDto = (NewsfeedMediaDiscoverBlockDto) obj;
            return this.width == newsfeedMediaDiscoverBlockDto.width && this.height == newsfeedMediaDiscoverBlockDto.height && this.type == newsfeedMediaDiscoverBlockDto.type && epx.f(this.items, newsfeedMediaDiscoverBlockDto.items) && epx.f(this.sourceId, newsfeedMediaDiscoverBlockDto.sourceId) && this.date == newsfeedMediaDiscoverBlockDto.date && epx.f(this.trackCode, newsfeedMediaDiscoverBlockDto.trackCode) && epx.f(this.header, newsfeedMediaDiscoverBlockDto.header) && epx.f(this.footer, newsfeedMediaDiscoverBlockDto.footer) && epx.f(this.research, newsfeedMediaDiscoverBlockDto.research) && epx.f(this.isAsync, newsfeedMediaDiscoverBlockDto.isAsync) && epx.f(this.canIgnore, newsfeedMediaDiscoverBlockDto.canIgnore) && epx.f(this.caption, newsfeedMediaDiscoverBlockDto.caption) && epx.f(this.keepOffline, newsfeedMediaDiscoverBlockDto.keepOffline) && epx.f(this.activity, newsfeedMediaDiscoverBlockDto.activity) && epx.f(this.shortTextRate, newsfeedMediaDiscoverBlockDto.shortTextRate) && epx.f(this.pushSubscription, newsfeedMediaDiscoverBlockDto.pushSubscription) && epx.f(this.suggestSubscribe, newsfeedMediaDiscoverBlockDto.suggestSubscribe) && epx.f(this.feedback, newsfeedMediaDiscoverBlockDto.feedback) && epx.f(this.debugInfo, newsfeedMediaDiscoverBlockDto.debugInfo);
        }

        public final NewsfeedMediaDiscoverBlockFooterDto f() {
            return this.footer;
        }

        public final NewsfeedMediaDiscoverBlockHeaderDto g() {
            return this.header;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public final int hashCode() {
            int a2 = shy.a(this.date, bh10.a(fw3.a((this.type.hashCode() + shy.a(this.height, Integer.hashCode(this.width) * 31, 31)) * 31, 31, this.items), 31, this.sourceId.b), 31);
            String str = this.trackCode;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            NewsfeedMediaDiscoverBlockHeaderDto newsfeedMediaDiscoverBlockHeaderDto = this.header;
            int hashCode2 = (hashCode + (newsfeedMediaDiscoverBlockHeaderDto == null ? 0 : newsfeedMediaDiscoverBlockHeaderDto.hashCode())) * 31;
            NewsfeedMediaDiscoverBlockFooterDto newsfeedMediaDiscoverBlockFooterDto = this.footer;
            int hashCode3 = (hashCode2 + (newsfeedMediaDiscoverBlockFooterDto == null ? 0 : newsfeedMediaDiscoverBlockFooterDto.hashCode())) * 31;
            NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto = this.research;
            int hashCode4 = (hashCode3 + (newsfeedMediascopeResearchDto == null ? 0 : newsfeedMediascopeResearchDto.hashCode())) * 31;
            Boolean bool = this.isAsync;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.canIgnore;
            int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto = this.caption;
            int hashCode7 = (hashCode6 + (newsfeedNewsfeedItemCaptionDto == null ? 0 : newsfeedNewsfeedItemCaptionDto.hashCode())) * 31;
            Boolean bool3 = this.keepOffline;
            int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            WallPostActivityDto wallPostActivityDto = this.activity;
            int hashCode9 = (hashCode8 + (wallPostActivityDto == null ? 0 : wallPostActivityDto.hashCode())) * 31;
            Float f = this.shortTextRate;
            int hashCode10 = (hashCode9 + (f == null ? 0 : f.hashCode())) * 31;
            NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto = this.pushSubscription;
            int hashCode11 = (hashCode10 + (newsfeedPushSubscriptionDto == null ? 0 : newsfeedPushSubscriptionDto.hashCode())) * 31;
            Boolean bool4 = this.suggestSubscribe;
            int hashCode12 = (hashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto = this.feedback;
            int hashCode13 = (hashCode12 + (newsfeedItemWallpostFeedbackDto == null ? 0 : newsfeedItemWallpostFeedbackDto.hashCode())) * 31;
            NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = this.debugInfo;
            return hashCode13 + (newsfeedItemDebugInfoDto != null ? newsfeedItemDebugInfoDto.hashCode() : 0);
        }

        public final List<NewsfeedMediaDiscoverItemDto> i() {
            return this.items;
        }

        public final Boolean j() {
            return this.keepOffline;
        }

        public final TypeDto k() {
            return this.type;
        }

        public final Boolean l() {
            return this.isAsync;
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedMediaDiscoverBlockDto(width=");
            sb.append(this.width);
            sb.append(", height=");
            sb.append(this.height);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", sourceId=");
            sb.append(this.sourceId);
            sb.append(", date=");
            sb.append(this.date);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", header=");
            sb.append(this.header);
            sb.append(", footer=");
            sb.append(this.footer);
            sb.append(", research=");
            sb.append(this.research);
            sb.append(", isAsync=");
            sb.append(this.isAsync);
            sb.append(", canIgnore=");
            sb.append(this.canIgnore);
            sb.append(", caption=");
            sb.append(this.caption);
            sb.append(", keepOffline=");
            sb.append(this.keepOffline);
            sb.append(", activity=");
            sb.append(this.activity);
            sb.append(", shortTextRate=");
            sb.append(this.shortTextRate);
            sb.append(", pushSubscription=");
            sb.append(this.pushSubscription);
            sb.append(", suggestSubscribe=");
            sb.append(this.suggestSubscribe);
            sb.append(", feedback=");
            sb.append(this.feedback);
            sb.append(", debugInfo=");
            return fq.d(sb, this.debugInfo, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((NewsfeedMediaDiscoverItemDto) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.sourceId, i);
            parcel.writeInt(this.date);
            parcel.writeString(this.trackCode);
            NewsfeedMediaDiscoverBlockHeaderDto newsfeedMediaDiscoverBlockHeaderDto = this.header;
            if (newsfeedMediaDiscoverBlockHeaderDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedMediaDiscoverBlockHeaderDto.writeToParcel(parcel, i);
            }
            NewsfeedMediaDiscoverBlockFooterDto newsfeedMediaDiscoverBlockFooterDto = this.footer;
            if (newsfeedMediaDiscoverBlockFooterDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedMediaDiscoverBlockFooterDto.writeToParcel(parcel, i);
            }
            NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto = this.research;
            if (newsfeedMediascopeResearchDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                newsfeedMediascopeResearchDto.writeToParcel(parcel, i);
            }
            Boolean bool = this.isAsync;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.canIgnore;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
            parcel.writeParcelable(this.caption, i);
            Boolean bool3 = this.keepOffline;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool3);
            }
            parcel.writeParcelable(this.activity, i);
            Float f = this.shortTextRate;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f);
            }
            parcel.writeParcelable(this.pushSubscription, i);
            Boolean bool4 = this.suggestSubscribe;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool4);
            }
            parcel.writeParcelable(this.feedback, i);
            parcel.writeParcelable(this.debugInfo, i);
        }

        public NewsfeedMediaDiscoverBlockDto(int i, int i2, TypeDto typeDto, List<NewsfeedMediaDiscoverItemDto> list, UserId userId, int i3, String str, NewsfeedMediaDiscoverBlockHeaderDto newsfeedMediaDiscoverBlockHeaderDto, NewsfeedMediaDiscoverBlockFooterDto newsfeedMediaDiscoverBlockFooterDto, NewsfeedMediascopeResearchDto newsfeedMediascopeResearchDto, Boolean bool, Boolean bool2, NewsfeedNewsfeedItemCaptionDto newsfeedNewsfeedItemCaptionDto, Boolean bool3, WallPostActivityDto wallPostActivityDto, Float f, NewsfeedPushSubscriptionDto newsfeedPushSubscriptionDto, Boolean bool4, NewsfeedItemWallpostFeedbackDto newsfeedItemWallpostFeedbackDto, NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
            super(null);
            this.width = i;
            this.height = i2;
            this.type = typeDto;
            this.items = list;
            this.sourceId = userId;
            this.date = i3;
            this.trackCode = str;
            this.header = newsfeedMediaDiscoverBlockHeaderDto;
            this.footer = newsfeedMediaDiscoverBlockFooterDto;
            this.research = newsfeedMediascopeResearchDto;
            this.isAsync = bool;
            this.canIgnore = bool2;
            this.caption = newsfeedNewsfeedItemCaptionDto;
            this.keepOffline = bool3;
            this.activity = wallPostActivityDto;
            this.shortTextRate = f;
            this.pushSubscription = newsfeedPushSubscriptionDto;
            this.suggestSubscribe = bool4;
            this.feedback = newsfeedItemWallpostFeedbackDto;
            this.debugInfo = newsfeedItemDebugInfoDto;
        }
    }

    public /* synthetic */ NewsfeedNewsfeedItemDto(zcl zclVar) {
        this();
    }

    private NewsfeedNewsfeedItemDto() {
    }
}
