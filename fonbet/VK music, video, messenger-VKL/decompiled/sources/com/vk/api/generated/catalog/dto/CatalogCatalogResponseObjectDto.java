package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.articles.dto.ArticlesArticleDto;
import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.audio.dto.AudioAudioContentCardDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioCuratorDto;
import com.vk.api.generated.audio.dto.AudioFollowingsUpdateInfoDto;
import com.vk.api.generated.audio.dto.AudioFollowingsUpdateItemDto;
import com.vk.api.generated.audio.dto.AudioPhotoDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.audio.dto.AudioRadioStationDto;
import com.vk.api.generated.audio.dto.AudioRecommendedPlaylistDto;
import com.vk.api.generated.audio.dto.AudioSearchSuggestionDto;
import com.vk.api.generated.audio.dto.AudioSignalCommonInfoDto;
import com.vk.api.generated.audio.dto.AudioStreamMixCatalogItemDto;
import com.vk.api.generated.audioBooks.dto.AudioBooksAudioBookDto;
import com.vk.api.generated.audioBooks.dto.AudioBooksItemPersonDto;
import com.vk.api.generated.badges.dto.BadgesBadgeDto;
import com.vk.api.generated.base.dto.BaseLinkDto;
import com.vk.api.generated.channels.dto.ChannelsChannelDto;
import com.vk.api.generated.classifieds.dto.ClassifiedsYoulaCityDto;
import com.vk.api.generated.feedbacks.dto.FeedbacksFeedbackDto;
import com.vk.api.generated.groups.dto.GroupsChatDto;
import com.vk.api.generated.groups.dto.GroupsCollectionItemDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.likes.dto.LikesReactionSetDto;
import com.vk.api.generated.market.dto.MarketAbandonedCartDto;
import com.vk.api.generated.market.dto.MarketClassifiedInfoDto;
import com.vk.api.generated.market.dto.MarketCommunityReviewDto;
import com.vk.api.generated.market.dto.MarketGroupCatalogItemDto;
import com.vk.api.generated.market.dto.MarketItemForReviewDto;
import com.vk.api.generated.market.dto.MarketMarketCategoryMappingDto;
import com.vk.api.generated.market.dto.MarketMarketCategoryTreeDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.market.dto.MarketMarketSearchQueryDto;
import com.vk.api.generated.market.dto.MarketNavigationTabDto;
import com.vk.api.generated.market.dto.MarketOrderDto;
import com.vk.api.generated.market.dto.MarketSearchQueryClassifierSuggestionDto;
import com.vk.api.generated.market.dto.MarketSearchSpellCheckResultDto;
import com.vk.api.generated.market.dto.MarketSubcategoriesMenuItemDto;
import com.vk.api.generated.market.dto.MarketUserReviewsItemsReviewDto;
import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsInfoBlockCatalogDto;
import com.vk.api.generated.media.dto.MediaPopupDto;
import com.vk.api.generated.music.dto.MusicOwnerDto;
import com.vk.api.generated.podcast.dto.PodcastEpisodeWithLikedFriendsDto;
import com.vk.api.generated.podcast.dto.PodcastExtendedPodcastDto;
import com.vk.api.generated.podcast.dto.PodcastPodcastDto;
import com.vk.api.generated.podcast.dto.PodcastSliderItemDto;
import com.vk.api.generated.search.dto.SearchEntityItemDto;
import com.vk.api.generated.search.dto.SearchFilterItemDto;
import com.vk.api.generated.search.dto.SearchSeoPageDto;
import com.vk.api.generated.search.dto.SearchSpellcheckerDto;
import com.vk.api.generated.search.dto.SearchSuggestionItemDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoAudioDto;
import com.vk.api.generated.stickers.dto.StickersCatalogBannerDto;
import com.vk.api.generated.stickers.dto.StickersCatalogInfoDto;
import com.vk.api.generated.stickers.dto.StickersCatalogNotificationDto;
import com.vk.api.generated.stickers.dto.StickersPackPreviewDto;
import com.vk.api.generated.store.dto.StoreStockItemDto;
import com.vk.api.generated.topshelf.dto.TopshelfTopshelfItemDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoKinoMailGenreDto;
import com.vk.api.generated.video.dto.VideoMetaInfoItemDto;
import com.vk.api.generated.video.dto.VideoMusicStreamMixCatalogItemDto;
import com.vk.api.generated.video.dto.VideoPlaylistMetaInfoItemDto;
import com.vk.api.generated.video.dto.VideoTvChannelDto;
import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.video.dto.VideoVkliveCategoryDto;
import com.vk.api.generated.video.dto.VideoVkliveChannelDto;
import com.vk.api.generated.wall.dto.WallWallItemDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CatalogCatalogResponseObjectDto.kt */
/* loaded from: classes14.dex */
public final class CatalogCatalogResponseObjectDto implements Parcelable {
    public static final Parcelable.Creator<CatalogCatalogResponseObjectDto> CREATOR = new a();

    @pmi0("abandoned_carts")
    private final List<MarketAbandonedCartDto> abandonedCarts;

    @pmi0("ai_assistants")
    private final List<CatalogAiAssistantDto> aiAssistants;

    @pmi0("albums")
    private final List<VideoVideoAlbumFullDto> albums;

    @pmi0("articles")
    private final List<ArticlesArticleDto> articles;

    @pmi0("artist_videos")
    private final List<VideoVideoFullDto> artistVideos;

    @pmi0("artists")
    private final List<AudioArtistDto> artists;

    @pmi0("audio_books")
    private final List<AudioBooksAudioBookDto> audioBooks;

    @pmi0("audio_books_persons")
    private final List<AudioBooksItemPersonDto> audioBooksPersons;

    @pmi0("audio_content_cards")
    private final List<AudioAudioContentCardDto> audioContentCards;

    @pmi0("audio_followings_update_info")
    private final List<AudioFollowingsUpdateInfoDto> audioFollowingsUpdateInfo;

    @pmi0("audio_followings_update_item")
    private final List<AudioFollowingsUpdateItemDto> audioFollowingsUpdateItem;

    @pmi0("audio_signal_common_info")
    private final List<AudioSignalCommonInfoDto> audioSignalCommonInfo;

    @pmi0("audio_stream_mixes")
    private final List<AudioStreamMixCatalogItemDto> audioStreamMixes;

    @pmi0("audios")
    private final List<AudioAudioDto> audios;

    @pmi0("badges")
    private final List<BadgesBadgeDto> badges;

    @pmi0("base_links")
    private final List<BaseLinkDto> baseLinks;

    @pmi0("catalog")
    private final CatalogCatalogDto catalog;

    @pmi0("catalog_ad_blocks")
    private final List<CatalogAdBlockDto> catalogAdBlocks;

    @pmi0("catalog_banners")
    private final List<CatalogBannerDto> catalogBanners;

    @pmi0("catalog_users")
    private final List<CatalogUserItemDto> catalogUsers;

    @pmi0("catalog_videos")
    private final List<CatalogCatalogVideoDto> catalogVideos;

    @pmi0(RTCStatsConstants.KEY_CHANNELS)
    private final List<ChannelsChannelDto> channels;

    @pmi0("classifieds_category_tree")
    private final List<MarketMarketCategoryTreeDto> classifiedsCategoryTree;

    @pmi0("classifieds_cities")
    private final List<ClassifiedsYoulaCityDto> classifiedsCities;

    @pmi0("classifieds_infos")
    private final List<MarketClassifiedInfoDto> classifiedsInfos;

    @pmi0("concerts")
    private final List<CatalogConcertItemDto> concerts;

    @pmi0("curators")
    private final List<AudioCuratorDto> curators;

    @pmi0("extended_podcasts")
    private final List<PodcastExtendedPodcastDto> extendedPodcasts;

    @pmi0("feedbacks")
    private final List<FeedbacksFeedbackDto> feedbacks;

    @pmi0("friends_liked_episodes")
    private final List<PodcastEpisodeWithLikedFriendsDto> friendsLikedEpisodes;

    @pmi0("games")
    private final List<AppsAppDto> games;

    @pmi0("group_catalog_items")
    private final List<MarketGroupCatalogItemDto> groupCatalogItems;

    @pmi0("group_category_items")
    private final List<CatalogGroupCategoryItemDto> groupCategoryItems;

    @pmi0("group_collection_items")
    private final List<GroupsCollectionItemDto> groupCollectionItems;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("groups_chats")
    private final List<GroupsChatDto> groupsChats;

    @pmi0("groups_friends_likes")
    private final List<CatalogFriendsLikesItemDto> groupsFriendsLikes;

    @pmi0("hints")
    private final List<CatalogHintDto> hints;

    @pmi0("links")
    private final List<CatalogCatalogLinkDto> links;

    @pmi0("longreads")
    private final List<ArticlesArticleDto> longreads;

    @pmi0("market_category_mappings")
    private final List<MarketMarketCategoryMappingDto> marketCategoryMappings;

    @pmi0("market_community_reviews")
    private final List<MarketCommunityReviewDto> marketCommunityReviews;

    @pmi0("market_infos")
    private final List<MarketIntegrationsInfoBlockCatalogDto> marketInfos;

    @pmi0("market_item_review_prepared")
    private final List<MarketItemForReviewDto> marketItemReviewPrepared;

    @pmi0("market_item_reviews")
    private final List<MarketUserReviewsItemsReviewDto> marketItemReviews;

    @pmi0("market_items")
    private final List<MarketMarketItemDto> marketItems;

    @pmi0("market_orders")
    private final List<MarketOrderDto> marketOrders;

    @pmi0("market_search_classifier_results")
    private final List<MarketSearchQueryClassifierSuggestionDto> marketSearchClassifierResults;

    @pmi0("market_search_spell_check_result")
    private final List<MarketSearchSpellCheckResultDto> marketSearchSpellCheckResult;

    @pmi0("market_subcategories_menu")
    private final List<MarketSubcategoriesMenuItemDto> marketSubcategoriesMenu;

    @pmi0("mini_apps")
    private final List<AppsAppDto> miniApps;

    @pmi0("movie_genres")
    private final List<VideoKinoMailGenreDto> movieGenres;

    @pmi0("movie_heroes")
    private final List<CatalogVideoMovieHeroDto> movieHeroes;

    @pmi0("movies")
    private final List<CatalogVideoMovieDto> movies;

    @pmi0("music_owners")
    private final List<MusicOwnerDto> musicOwners;

    @pmi0("navigation_tabs")
    private final List<MarketNavigationTabDto> navigationTabs;

    @pmi0("newsfeed_items")
    private final List<CatalogNewsfeedItemWithIdDto> newsfeedItems;

    @pmi0("placeholders")
    private final List<MediaPopupDto> placeholders;

    @pmi0("playlists")
    private final List<AudioPlaylistDto> playlists;

    @pmi0("podcast_episodes")
    private final List<AudioAudioDto> podcastEpisodes;

    @pmi0("podcast_slider_items")
    private final List<PodcastSliderItemDto> podcastSliderItems;

    @pmi0("podcasts")
    private final List<PodcastPodcastDto> podcasts;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("query")
    private final List<MarketMarketSearchQueryDto> query;

    @pmi0("radio_stations")
    private final List<AudioRadioStationDto> radioStations;

    @pmi0("reaction_sets")
    private final List<LikesReactionSetDto> reactionSets;

    @pmi0("recommended_playlists")
    private final List<AudioRecommendedPlaylistDto> recommendedPlaylists;

    @pmi0("search_entity_items")
    private final List<SearchEntityItemDto> searchEntityItems;

    @pmi0("search_filters")
    private final List<SearchFilterItemDto> searchFilters;

    @pmi0("search_seo_pages")
    private final List<SearchSeoPageDto> searchSeoPages;

    @pmi0("search_spellcheckers")
    private final List<SearchSpellcheckerDto> searchSpellcheckers;

    @pmi0("search_suggestions")
    private final List<SearchSuggestionItemDto> searchSuggestions;

    @pmi0("shopping_videos")
    private final List<VideoVideoFullDto> shoppingVideos;

    @pmi0("short_video_audios")
    private final List<ShortVideoAudioDto> shortVideoAudios;

    @pmi0("stickers_banners")
    private final List<StickersCatalogBannerDto> stickersBanners;

    @pmi0("stickers_info")
    private final List<StickersCatalogInfoDto> stickersInfo;

    @pmi0("stickers_notifications")
    private final List<StickersCatalogNotificationDto> stickersNotifications;

    @pmi0("stickers_pack_previews")
    private final List<StickersPackPreviewDto> stickersPackPreviews;

    @pmi0("stickers_packs")
    private final Map<Integer, StoreStockItemDto> stickersPacks;

    @pmi0("suggestions")
    private final List<AudioSearchSuggestionDto> suggestions;

    @pmi0("texts")
    private final List<CatalogTextDto> texts;

    @pmi0("thumbs")
    private final List<AudioPhotoDto> thumbs;

    @pmi0("topshelf_items")
    private final List<TopshelfTopshelfItemDto> topshelfItems;

    @pmi0("tv_channels")
    private final List<VideoTvChannelDto> tvChannels;

    @pmi0("ux_polls")
    private final List<CatalogUxPollDto> uxPolls;

    @pmi0("video_banners")
    private final List<CatalogBannerVideoDto> videoBanners;

    @pmi0("video_channel_group")
    private final GroupsGroupFullDto videoChannelGroup;

    @pmi0("video_music_stream_mixes")
    private final List<VideoMusicStreamMixCatalogItemDto> videoMusicStreamMixes;

    @pmi0("video_playlists_meta_info")
    private final List<VideoPlaylistMetaInfoItemDto> videoPlaylistsMetaInfo;

    @pmi0("video_showcase_galleries")
    private final List<CatalogVideoShowcaseGalleryDto> videoShowcaseGalleries;

    @pmi0("video_showcase_meta_info")
    private final List<VideoMetaInfoItemDto> videoShowcaseMetaInfo;

    @pmi0("videos")
    private final List<VideoVideoFullDto> videos;

    @pmi0("vklive_categories")
    private final List<VideoVkliveCategoryDto> vkliveCategories;

    @pmi0("vklive_channels")
    private final List<VideoVkliveChannelDto> vkliveChannels;

    @pmi0("wall_items")
    private final List<WallWallItemDto> wallItems;

    /* compiled from: CatalogCatalogResponseObjectDto.kt */
    public static final class a implements Parcelable.Creator<CatalogCatalogResponseObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogCatalogResponseObjectDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            ArrayList arrayList8;
            ArrayList arrayList9;
            ArrayList arrayList10;
            GroupsGroupFullDto groupsGroupFullDto;
            ArrayList arrayList11;
            ArrayList arrayList12;
            ArrayList arrayList13;
            ArrayList arrayList14;
            ArrayList arrayList15;
            ArrayList arrayList16;
            ArrayList arrayList17;
            ArrayList arrayList18;
            ArrayList arrayList19;
            ArrayList arrayList20;
            ArrayList arrayList21;
            ArrayList arrayList22;
            ArrayList arrayList23;
            ArrayList arrayList24;
            ArrayList arrayList25;
            ArrayList arrayList26;
            ArrayList arrayList27;
            ArrayList arrayList28;
            ArrayList arrayList29;
            ArrayList arrayList30;
            ArrayList arrayList31;
            ArrayList arrayList32;
            ArrayList arrayList33;
            ArrayList arrayList34;
            LinkedHashMap linkedHashMap;
            ArrayList arrayList35;
            LinkedHashMap linkedHashMap2;
            ArrayList arrayList36;
            ArrayList arrayList37;
            ArrayList arrayList38;
            ArrayList arrayList39;
            ArrayList arrayList40;
            ArrayList arrayList41;
            ArrayList arrayList42;
            ArrayList arrayList43;
            ArrayList arrayList44;
            ArrayList arrayList45;
            ArrayList arrayList46;
            ArrayList arrayList47;
            ArrayList arrayList48;
            ArrayList arrayList49;
            ArrayList arrayList50;
            ArrayList arrayList51;
            ArrayList arrayList52;
            ArrayList arrayList53;
            ArrayList arrayList54;
            ArrayList arrayList55;
            ArrayList arrayList56;
            ArrayList arrayList57;
            ArrayList arrayList58;
            ArrayList arrayList59;
            ArrayList arrayList60;
            ArrayList arrayList61;
            ArrayList arrayList62;
            ArrayList arrayList63;
            ArrayList arrayList64;
            ArrayList arrayList65;
            ArrayList arrayList66;
            ArrayList arrayList67;
            ArrayList arrayList68;
            ArrayList arrayList69;
            ArrayList arrayList70;
            ArrayList arrayList71;
            ArrayList arrayList72;
            ArrayList arrayList73;
            ArrayList arrayList74;
            ArrayList arrayList75;
            ArrayList arrayList76;
            ArrayList arrayList77;
            ArrayList arrayList78;
            ArrayList arrayList79;
            ArrayList arrayList80;
            ArrayList arrayList81;
            ArrayList arrayList82;
            ArrayList arrayList83;
            ArrayList arrayList84;
            ArrayList arrayList85;
            ArrayList arrayList86;
            ArrayList arrayList87;
            ArrayList arrayList88;
            ArrayList arrayList89;
            ArrayList arrayList90;
            ArrayList arrayList91;
            ArrayList arrayList92;
            ArrayList arrayList93;
            ArrayList arrayList94;
            ArrayList arrayList95;
            ArrayList arrayList96;
            ArrayList arrayList97;
            ArrayList arrayList98;
            ArrayList arrayList99;
            ArrayList arrayList100;
            ArrayList arrayList101;
            ArrayList arrayList102;
            ArrayList arrayList103;
            ArrayList arrayList104;
            ArrayList arrayList105;
            ArrayList arrayList106;
            ArrayList arrayList107;
            ArrayList arrayList108;
            CatalogCatalogDto createFromParcel = parcel.readInt() == 0 ? null : CatalogCatalogDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AudioStreamMixCatalogItemDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(VideoMusicStreamMixCatalogItemDto.CREATOR, parcel, arrayList2, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(CatalogCatalogResponseObjectDto.class, parcel, arrayList3, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(CatalogCatalogResponseObjectDto.class, parcel, arrayList4, i4, 1);
                }
            }
            GroupsGroupFullDto groupsGroupFullDto2 = (GroupsGroupFullDto) parcel.readParcelable(CatalogCatalogResponseObjectDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList5 = new ArrayList(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = en.a(ChannelsChannelDto.CREATOR, parcel, arrayList5, i5, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int readInt6 = parcel.readInt();
                ArrayList arrayList109 = new ArrayList(readInt6);
                int i6 = 0;
                while (i6 != readInt6) {
                    i6 = en.a(BadgesBadgeDto.CREATOR, parcel, arrayList109, i6, 1);
                }
                arrayList6 = arrayList109;
            }
            if (parcel.readInt() == 0) {
                arrayList7 = null;
            } else {
                int readInt7 = parcel.readInt();
                arrayList7 = new ArrayList(readInt7);
                int i7 = 0;
                while (i7 != readInt7) {
                    i7 = bo.b(CatalogCatalogResponseObjectDto.class, parcel, arrayList7, i7, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList8 = null;
            } else {
                int readInt8 = parcel.readInt();
                ArrayList arrayList110 = new ArrayList(readInt8);
                int i8 = 0;
                while (i8 != readInt8) {
                    i8 = en.a(AudioSearchSuggestionDto.CREATOR, parcel, arrayList110, i8, 1);
                }
                arrayList8 = arrayList110;
            }
            if (parcel.readInt() == 0) {
                arrayList9 = null;
            } else {
                int readInt9 = parcel.readInt();
                arrayList9 = new ArrayList(readInt9);
                int i9 = 0;
                while (i9 != readInt9) {
                    i9 = bo.b(CatalogCatalogResponseObjectDto.class, parcel, arrayList9, i9, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt10 = parcel.readInt();
                arrayList10 = new ArrayList(readInt10);
                int i10 = 0;
                while (true) {
                    groupsGroupFullDto = groupsGroupFullDto2;
                    if (i10 == readInt10) {
                        break;
                    }
                    i10 = en.a(CatalogVideoShowcaseGalleryDto.CREATOR, parcel, arrayList10, i10, 1);
                    groupsGroupFullDto2 = groupsGroupFullDto;
                    readInt10 = readInt10;
                }
            } else {
                arrayList10 = null;
                groupsGroupFullDto = groupsGroupFullDto2;
            }
            if (parcel.readInt() == 0) {
                arrayList11 = null;
            } else {
                int readInt11 = parcel.readInt();
                arrayList11 = new ArrayList(readInt11);
                int i11 = 0;
                while (i11 != readInt11) {
                    i11 = en.a(VideoTvChannelDto.CREATOR, parcel, arrayList11, i11, 1);
                    readInt11 = readInt11;
                    createFromParcel = createFromParcel;
                }
            }
            CatalogCatalogDto catalogCatalogDto = createFromParcel;
            if (parcel.readInt() == 0) {
                arrayList12 = null;
            } else {
                int readInt12 = parcel.readInt();
                arrayList12 = new ArrayList(readInt12);
                int i12 = 0;
                while (i12 != readInt12) {
                    i12 = en.a(CatalogCatalogVideoDto.CREATOR, parcel, arrayList12, i12, 1);
                    readInt12 = readInt12;
                    arrayList11 = arrayList11;
                }
            }
            ArrayList arrayList111 = arrayList11;
            if (parcel.readInt() == 0) {
                arrayList14 = arrayList12;
                arrayList13 = null;
            } else {
                int readInt13 = parcel.readInt();
                arrayList13 = new ArrayList(readInt13);
                arrayList14 = arrayList12;
                int i13 = 0;
                while (i13 != readInt13) {
                    i13 = bo.b(CatalogCatalogResponseObjectDto.class, parcel, arrayList13, i13, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList15 = null;
            } else {
                int readInt14 = parcel.readInt();
                arrayList15 = new ArrayList(readInt14);
                int i14 = 0;
                while (i14 != readInt14) {
                    i14 = en.a(CatalogCatalogLinkDto.CREATOR, parcel, arrayList15, i14, 1);
                    readInt14 = readInt14;
                    arrayList13 = arrayList13;
                }
            }
            ArrayList arrayList112 = arrayList13;
            if (parcel.readInt() == 0) {
                arrayList17 = arrayList15;
                arrayList16 = null;
            } else {
                int readInt15 = parcel.readInt();
                arrayList16 = new ArrayList(readInt15);
                arrayList17 = arrayList15;
                int i15 = 0;
                while (i15 != readInt15) {
                    i15 = bo.b(CatalogCatalogResponseObjectDto.class, parcel, arrayList16, i15, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList18 = null;
            } else {
                int readInt16 = parcel.readInt();
                arrayList18 = new ArrayList(readInt16);
                int i16 = 0;
                while (i16 != readInt16) {
                    i16 = en.a(MusicOwnerDto.CREATOR, parcel, arrayList18, i16, 1);
                    readInt16 = readInt16;
                    arrayList16 = arrayList16;
                }
            }
            ArrayList arrayList113 = arrayList16;
            if (parcel.readInt() == 0) {
                arrayList20 = arrayList18;
                arrayList19 = null;
            } else {
                int readInt17 = parcel.readInt();
                arrayList19 = new ArrayList(readInt17);
                arrayList20 = arrayList18;
                int i17 = 0;
                while (i17 != readInt17) {
                    i17 = bo.b(CatalogCatalogResponseObjectDto.class, parcel, arrayList19, i17, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList22 = arrayList19;
                arrayList21 = null;
            } else {
                int readInt18 = parcel.readInt();
                arrayList21 = new ArrayList(readInt18);
                arrayList22 = arrayList19;
                int i18 = 0;
                while (i18 != readInt18) {
                    i18 = bo.b(CatalogCatalogResponseObjectDto.class, parcel, arrayList21, i18, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList24 = arrayList21;
                arrayList23 = null;
            } else {
                int readInt19 = parcel.readInt();
                arrayList23 = new ArrayList(readInt19);
                arrayList24 = arrayList21;
                int i19 = 0;
                while (i19 != readInt19) {
                    i19 = bo.b(CatalogCatalogResponseObjectDto.class, parcel, arrayList23, i19, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList26 = arrayList23;
                arrayList25 = null;
            } else {
                int readInt20 = parcel.readInt();
                arrayList25 = new ArrayList(readInt20);
                arrayList26 = arrayList23;
                int i20 = 0;
                while (i20 != readInt20) {
                    i20 = bo.b(CatalogCatalogResponseObjectDto.class, parcel, arrayList25, i20, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList27 = null;
            } else {
                int readInt21 = parcel.readInt();
                arrayList27 = new ArrayList(readInt21);
                int i21 = 0;
                while (i21 != readInt21) {
                    i21 = en.a(AudioRecommendedPlaylistDto.CREATOR, parcel, arrayList27, i21, 1);
                    readInt21 = readInt21;
                    arrayList25 = arrayList25;
                }
            }
            ArrayList arrayList114 = arrayList25;
            if (parcel.readInt() == 0) {
                arrayList28 = null;
            } else {
                int readInt22 = parcel.readInt();
                arrayList28 = new ArrayList(readInt22);
                int i22 = 0;
                while (i22 != readInt22) {
                    i22 = en.a(AudioRadioStationDto.CREATOR, parcel, arrayList28, i22, 1);
                    readInt22 = readInt22;
                    arrayList27 = arrayList27;
                }
            }
            ArrayList arrayList115 = arrayList27;
            if (parcel.readInt() == 0) {
                arrayList30 = arrayList28;
                arrayList29 = null;
            } else {
                int readInt23 = parcel.readInt();
                arrayList29 = new ArrayList(readInt23);
                arrayList30 = arrayList28;
                int i23 = 0;
                while (i23 != readInt23) {
                    i23 = bo.b(CatalogCatalogResponseObjectDto.class, parcel, arrayList29, i23, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList32 = arrayList29;
                arrayList31 = null;
            } else {
                int readInt24 = parcel.readInt();
                arrayList31 = new ArrayList(readInt24);
                arrayList32 = arrayList29;
                int i24 = 0;
                while (i24 != readInt24) {
                    i24 = bo.b(CatalogCatalogResponseObjectDto.class, parcel, arrayList31, i24, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList34 = arrayList31;
                arrayList33 = null;
            } else {
                int readInt25 = parcel.readInt();
                arrayList33 = new ArrayList(readInt25);
                arrayList34 = arrayList31;
                int i25 = 0;
                while (i25 != readInt25) {
                    i25 = bo.b(CatalogCatalogResponseObjectDto.class, parcel, arrayList33, i25, 1);
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt26 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt26);
                int i26 = 0;
                while (i26 != readInt26) {
                    linkedHashMap.put(Integer.valueOf(parcel.readInt()), StoreStockItemDto.CREATOR.createFromParcel(parcel));
                    i26++;
                    readInt26 = readInt26;
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = linkedHashMap;
                arrayList35 = null;
            } else {
                int readInt27 = parcel.readInt();
                arrayList35 = new ArrayList(readInt27);
                linkedHashMap2 = linkedHashMap;
                int i27 = 0;
                while (i27 != readInt27) {
                    i27 = en.a(StickersPackPreviewDto.CREATOR, parcel, arrayList35, i27, 1);
                    readInt27 = readInt27;
                    arrayList33 = arrayList33;
                }
            }
            ArrayList arrayList116 = arrayList33;
            if (parcel.readInt() == 0) {
                arrayList36 = null;
            } else {
                int readInt28 = parcel.readInt();
                arrayList36 = new ArrayList(readInt28);
                int i28 = 0;
                while (i28 != readInt28) {
                    i28 = en.a(StickersCatalogBannerDto.CREATOR, parcel, arrayList36, i28, 1);
                    readInt28 = readInt28;
                    arrayList35 = arrayList35;
                }
            }
            ArrayList arrayList117 = arrayList35;
            if (parcel.readInt() == 0) {
                arrayList37 = null;
            } else {
                int readInt29 = parcel.readInt();
                arrayList37 = new ArrayList(readInt29);
                int i29 = 0;
                while (i29 != readInt29) {
                    i29 = en.a(StickersCatalogInfoDto.CREATOR, parcel, arrayList37, i29, 1);
                    readInt29 = readInt29;
                    arrayList36 = arrayList36;
                }
            }
            ArrayList arrayList118 = arrayList36;
            if (parcel.readInt() == 0) {
                arrayList38 = null;
            } else {
                int readInt30 = parcel.readInt();
                arrayList38 = new ArrayList(readInt30);
                int i30 = 0;
                while (i30 != readInt30) {
                    i30 = en.a(CatalogUserItemDto.CREATOR, parcel, arrayList38, i30, 1);
                    readInt30 = readInt30;
                    arrayList37 = arrayList37;
                }
            }
            ArrayList arrayList119 = arrayList37;
            if (parcel.readInt() == 0) {
                arrayList39 = null;
            } else {
                int readInt31 = parcel.readInt();
                ArrayList arrayList120 = new ArrayList(readInt31);
                int i31 = 0;
                while (i31 != readInt31) {
                    i31 = en.a(StickersCatalogNotificationDto.CREATOR, parcel, arrayList120, i31, 1);
                    readInt31 = readInt31;
                    arrayList38 = arrayList38;
                }
                arrayList39 = arrayList120;
            }
            ArrayList arrayList121 = arrayList38;
            if (parcel.readInt() == 0) {
                arrayList40 = null;
            } else {
                int readInt32 = parcel.readInt();
                arrayList40 = new ArrayList(readInt32);
                int i32 = 0;
                while (i32 != readInt32) {
                    i32 = bo.b(CatalogCatalogResponseObjectDto.class, parcel, arrayList40, i32, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList41 = null;
            } else {
                int readInt33 = parcel.readInt();
                arrayList41 = new ArrayList(readInt33);
                int i33 = 0;
                while (i33 != readInt33) {
                    i33 = en.a(AudioFollowingsUpdateInfoDto.CREATOR, parcel, arrayList41, i33, 1);
                    readInt33 = readInt33;
                    arrayList40 = arrayList40;
                }
            }
            ArrayList arrayList122 = arrayList40;
            if (parcel.readInt() == 0) {
                arrayList42 = null;
            } else {
                int readInt34 = parcel.readInt();
                arrayList42 = new ArrayList(readInt34);
                int i34 = 0;
                while (i34 != readInt34) {
                    i34 = en.a(AudioFollowingsUpdateItemDto.CREATOR, parcel, arrayList42, i34, 1);
                    readInt34 = readInt34;
                    arrayList41 = arrayList41;
                }
            }
            ArrayList arrayList123 = arrayList41;
            if (parcel.readInt() == 0) {
                arrayList43 = null;
            } else {
                int readInt35 = parcel.readInt();
                arrayList43 = new ArrayList(readInt35);
                int i35 = 0;
                while (i35 != readInt35) {
                    i35 = en.a(AudioSignalCommonInfoDto.CREATOR, parcel, arrayList43, i35, 1);
                    readInt35 = readInt35;
                    arrayList42 = arrayList42;
                }
            }
            ArrayList arrayList124 = arrayList42;
            if (parcel.readInt() == 0) {
                arrayList45 = arrayList43;
                arrayList44 = null;
            } else {
                int readInt36 = parcel.readInt();
                arrayList44 = new ArrayList(readInt36);
                arrayList45 = arrayList43;
                int i36 = 0;
                while (i36 != readInt36) {
                    i36 = bo.b(CatalogCatalogResponseObjectDto.class, parcel, arrayList44, i36, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList46 = null;
            } else {
                int readInt37 = parcel.readInt();
                arrayList46 = new ArrayList(readInt37);
                int i37 = 0;
                while (i37 != readInt37) {
                    i37 = en.a(GroupsChatDto.CREATOR, parcel, arrayList46, i37, 1);
                    readInt37 = readInt37;
                    arrayList44 = arrayList44;
                }
            }
            ArrayList arrayList125 = arrayList44;
            if (parcel.readInt() == 0) {
                arrayList48 = arrayList46;
                arrayList47 = null;
            } else {
                int readInt38 = parcel.readInt();
                arrayList47 = new ArrayList(readInt38);
                arrayList48 = arrayList46;
                int i38 = 0;
                while (i38 != readInt38) {
                    i38 = bo.b(CatalogCatalogResponseObjectDto.class, parcel, arrayList47, i38, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList49 = null;
            } else {
                int readInt39 = parcel.readInt();
                arrayList49 = new ArrayList(readInt39);
                int i39 = 0;
                while (i39 != readInt39) {
                    i39 = en.a(CatalogBannerDto.CREATOR, parcel, arrayList49, i39, 1);
                    readInt39 = readInt39;
                    arrayList47 = arrayList47;
                }
            }
            ArrayList arrayList126 = arrayList47;
            if (parcel.readInt() == 0) {
                arrayList50 = null;
            } else {
                int readInt40 = parcel.readInt();
                arrayList50 = new ArrayList(readInt40);
                int i40 = 0;
                while (i40 != readInt40) {
                    i40 = en.a(CatalogAdBlockDto.CREATOR, parcel, arrayList50, i40, 1);
                    readInt40 = readInt40;
                    arrayList49 = arrayList49;
                }
            }
            ArrayList arrayList127 = arrayList49;
            if (parcel.readInt() == 0) {
                arrayList51 = null;
            } else {
                int readInt41 = parcel.readInt();
                arrayList51 = new ArrayList(readInt41);
                int i41 = 0;
                while (i41 != readInt41) {
                    i41 = en.a(ClassifiedsYoulaCityDto.CREATOR, parcel, arrayList51, i41, 1);
                    readInt41 = readInt41;
                    arrayList50 = arrayList50;
                }
            }
            ArrayList arrayList128 = arrayList50;
            if (parcel.readInt() == 0) {
                arrayList52 = null;
            } else {
                int readInt42 = parcel.readInt();
                arrayList52 = new ArrayList(readInt42);
                int i42 = 0;
                while (i42 != readInt42) {
                    i42 = en.a(MarketClassifiedInfoDto.CREATOR, parcel, arrayList52, i42, 1);
                    readInt42 = readInt42;
                    arrayList51 = arrayList51;
                }
            }
            ArrayList arrayList129 = arrayList51;
            if (parcel.readInt() == 0) {
                arrayList53 = null;
            } else {
                int readInt43 = parcel.readInt();
                ArrayList arrayList130 = new ArrayList(readInt43);
                int i43 = 0;
                while (i43 != readInt43) {
                    i43 = en.a(MarketMarketCategoryTreeDto.CREATOR, parcel, arrayList130, i43, 1);
                    readInt43 = readInt43;
                    arrayList52 = arrayList52;
                }
                arrayList53 = arrayList130;
            }
            ArrayList arrayList131 = arrayList52;
            if (parcel.readInt() == 0) {
                arrayList54 = null;
            } else {
                int readInt44 = parcel.readInt();
                arrayList54 = new ArrayList(readInt44);
                int i44 = 0;
                while (i44 != readInt44) {
                    i44 = en.a(MarketMarketCategoryMappingDto.CREATOR, parcel, arrayList54, i44, 1);
                    readInt44 = readInt44;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList55 = null;
            } else {
                int readInt45 = parcel.readInt();
                arrayList55 = new ArrayList(readInt45);
                int i45 = 0;
                while (i45 != readInt45) {
                    i45 = en.a(MarketMarketSearchQueryDto.CREATOR, parcel, arrayList55, i45, 1);
                    readInt45 = readInt45;
                    arrayList54 = arrayList54;
                }
            }
            ArrayList arrayList132 = arrayList54;
            if (parcel.readInt() == 0) {
                arrayList57 = arrayList55;
                arrayList56 = null;
            } else {
                int readInt46 = parcel.readInt();
                arrayList56 = new ArrayList(readInt46);
                arrayList57 = arrayList55;
                int i46 = 0;
                while (i46 != readInt46) {
                    i46 = bo.b(CatalogCatalogResponseObjectDto.class, parcel, arrayList56, i46, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList58 = null;
            } else {
                int readInt47 = parcel.readInt();
                arrayList58 = new ArrayList(readInt47);
                int i47 = 0;
                while (i47 != readInt47) {
                    i47 = en.a(MarketGroupCatalogItemDto.CREATOR, parcel, arrayList58, i47, 1);
                    readInt47 = readInt47;
                    arrayList56 = arrayList56;
                }
            }
            ArrayList arrayList133 = arrayList56;
            if (parcel.readInt() == 0) {
                arrayList59 = null;
            } else {
                int readInt48 = parcel.readInt();
                arrayList59 = new ArrayList(readInt48);
                int i48 = 0;
                while (i48 != readInt48) {
                    i48 = en.a(MarketNavigationTabDto.CREATOR, parcel, arrayList59, i48, 1);
                    readInt48 = readInt48;
                    arrayList58 = arrayList58;
                }
            }
            ArrayList arrayList134 = arrayList58;
            if (parcel.readInt() == 0) {
                arrayList60 = null;
            } else {
                int readInt49 = parcel.readInt();
                arrayList60 = new ArrayList(readInt49);
                int i49 = 0;
                while (i49 != readInt49) {
                    i49 = en.a(MarketOrderDto.CREATOR, parcel, arrayList60, i49, 1);
                    readInt49 = readInt49;
                    arrayList59 = arrayList59;
                }
            }
            ArrayList arrayList135 = arrayList59;
            if (parcel.readInt() == 0) {
                arrayList61 = null;
            } else {
                int readInt50 = parcel.readInt();
                arrayList61 = new ArrayList(readInt50);
                int i50 = 0;
                while (i50 != readInt50) {
                    i50 = en.a(MarketUserReviewsItemsReviewDto.CREATOR, parcel, arrayList61, i50, 1);
                    readInt50 = readInt50;
                    arrayList60 = arrayList60;
                }
            }
            ArrayList arrayList136 = arrayList60;
            if (parcel.readInt() == 0) {
                arrayList62 = null;
            } else {
                int readInt51 = parcel.readInt();
                ArrayList arrayList137 = new ArrayList(readInt51);
                int i51 = 0;
                while (i51 != readInt51) {
                    i51 = en.a(MarketItemForReviewDto.CREATOR, parcel, arrayList137, i51, 1);
                    readInt51 = readInt51;
                    arrayList61 = arrayList61;
                }
                arrayList62 = arrayList137;
            }
            ArrayList arrayList138 = arrayList61;
            if (parcel.readInt() == 0) {
                arrayList63 = null;
            } else {
                int readInt52 = parcel.readInt();
                arrayList63 = new ArrayList(readInt52);
                int i52 = 0;
                while (i52 != readInt52) {
                    i52 = en.a(MarketCommunityReviewDto.CREATOR, parcel, arrayList63, i52, 1);
                    readInt52 = readInt52;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList64 = null;
            } else {
                int readInt53 = parcel.readInt();
                arrayList64 = new ArrayList(readInt53);
                int i53 = 0;
                while (i53 != readInt53) {
                    i53 = en.a(MarketAbandonedCartDto.CREATOR, parcel, arrayList64, i53, 1);
                    readInt53 = readInt53;
                    arrayList63 = arrayList63;
                }
            }
            ArrayList arrayList139 = arrayList63;
            if (parcel.readInt() == 0) {
                arrayList65 = null;
            } else {
                int readInt54 = parcel.readInt();
                arrayList65 = new ArrayList(readInt54);
                int i54 = 0;
                while (i54 != readInt54) {
                    i54 = en.a(CatalogTextDto.CREATOR, parcel, arrayList65, i54, 1);
                    readInt54 = readInt54;
                    arrayList64 = arrayList64;
                }
            }
            ArrayList arrayList140 = arrayList64;
            if (parcel.readInt() == 0) {
                arrayList67 = arrayList65;
                arrayList66 = null;
            } else {
                int readInt55 = parcel.readInt();
                arrayList66 = new ArrayList(readInt55);
                arrayList67 = arrayList65;
                int i55 = 0;
                while (i55 != readInt55) {
                    i55 = bo.b(CatalogCatalogResponseObjectDto.class, parcel, arrayList66, i55, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList69 = arrayList66;
                arrayList68 = null;
            } else {
                int readInt56 = parcel.readInt();
                arrayList68 = new ArrayList(readInt56);
                arrayList69 = arrayList66;
                int i56 = 0;
                while (i56 != readInt56) {
                    i56 = bo.b(CatalogCatalogResponseObjectDto.class, parcel, arrayList68, i56, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList70 = null;
            } else {
                int readInt57 = parcel.readInt();
                arrayList70 = new ArrayList(readInt57);
                int i57 = 0;
                while (i57 != readInt57) {
                    i57 = en.a(PodcastSliderItemDto.CREATOR, parcel, arrayList70, i57, 1);
                    readInt57 = readInt57;
                    arrayList68 = arrayList68;
                }
            }
            ArrayList arrayList141 = arrayList68;
            if (parcel.readInt() == 0) {
                arrayList71 = null;
            } else {
                int readInt58 = parcel.readInt();
                arrayList71 = new ArrayList(readInt58);
                int i58 = 0;
                while (i58 != readInt58) {
                    i58 = en.a(PodcastPodcastDto.CREATOR, parcel, arrayList71, i58, 1);
                    readInt58 = readInt58;
                    arrayList70 = arrayList70;
                }
            }
            ArrayList arrayList142 = arrayList70;
            if (parcel.readInt() == 0) {
                arrayList72 = null;
            } else {
                int readInt59 = parcel.readInt();
                arrayList72 = new ArrayList(readInt59);
                int i59 = 0;
                while (i59 != readInt59) {
                    i59 = en.a(CatalogConcertItemDto.CREATOR, parcel, arrayList72, i59, 1);
                    readInt59 = readInt59;
                    arrayList71 = arrayList71;
                }
            }
            ArrayList arrayList143 = arrayList71;
            if (parcel.readInt() == 0) {
                arrayList73 = null;
            } else {
                int readInt60 = parcel.readInt();
                arrayList73 = new ArrayList(readInt60);
                int i60 = 0;
                while (i60 != readInt60) {
                    i60 = en.a(PodcastExtendedPodcastDto.CREATOR, parcel, arrayList73, i60, 1);
                    readInt60 = readInt60;
                    arrayList72 = arrayList72;
                }
            }
            ArrayList arrayList144 = arrayList72;
            if (parcel.readInt() == 0) {
                arrayList74 = null;
            } else {
                int readInt61 = parcel.readInt();
                ArrayList arrayList145 = new ArrayList(readInt61);
                int i61 = 0;
                while (i61 != readInt61) {
                    i61 = en.a(AudioAudioContentCardDto.CREATOR, parcel, arrayList145, i61, 1);
                    readInt61 = readInt61;
                    arrayList73 = arrayList73;
                }
                arrayList74 = arrayList145;
            }
            ArrayList arrayList146 = arrayList73;
            if (parcel.readInt() == 0) {
                arrayList75 = null;
            } else {
                int readInt62 = parcel.readInt();
                arrayList75 = new ArrayList(readInt62);
                int i62 = 0;
                while (i62 != readInt62) {
                    i62 = en.a(AudioBooksAudioBookDto.CREATOR, parcel, arrayList75, i62, 1);
                    readInt62 = readInt62;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList76 = null;
            } else {
                int readInt63 = parcel.readInt();
                arrayList76 = new ArrayList(readInt63);
                int i63 = 0;
                while (i63 != readInt63) {
                    i63 = en.a(AudioBooksItemPersonDto.CREATOR, parcel, arrayList76, i63, 1);
                    readInt63 = readInt63;
                    arrayList75 = arrayList75;
                }
            }
            ArrayList arrayList147 = arrayList75;
            if (parcel.readInt() == 0) {
                arrayList77 = null;
            } else {
                int readInt64 = parcel.readInt();
                arrayList77 = new ArrayList(readInt64);
                int i64 = 0;
                while (i64 != readInt64) {
                    i64 = en.a(PodcastEpisodeWithLikedFriendsDto.CREATOR, parcel, arrayList77, i64, 1);
                    readInt64 = readInt64;
                    arrayList76 = arrayList76;
                }
            }
            ArrayList arrayList148 = arrayList76;
            if (parcel.readInt() == 0) {
                arrayList78 = null;
            } else {
                int readInt65 = parcel.readInt();
                arrayList78 = new ArrayList(readInt65);
                int i65 = 0;
                while (i65 != readInt65) {
                    i65 = en.a(CatalogHintDto.CREATOR, parcel, arrayList78, i65, 1);
                    readInt65 = readInt65;
                    arrayList77 = arrayList77;
                }
            }
            ArrayList arrayList149 = arrayList77;
            if (parcel.readInt() == 0) {
                arrayList79 = null;
            } else {
                int readInt66 = parcel.readInt();
                arrayList79 = new ArrayList(readInt66);
                int i66 = 0;
                while (i66 != readInt66) {
                    i66 = en.a(CatalogUxPollDto.CREATOR, parcel, arrayList79, i66, 1);
                    readInt66 = readInt66;
                    arrayList78 = arrayList78;
                }
            }
            ArrayList arrayList150 = arrayList78;
            if (parcel.readInt() == 0) {
                arrayList80 = null;
            } else {
                int readInt67 = parcel.readInt();
                ArrayList arrayList151 = new ArrayList(readInt67);
                int i67 = 0;
                while (i67 != readInt67) {
                    i67 = en.a(CatalogFriendsLikesItemDto.CREATOR, parcel, arrayList151, i67, 1);
                    readInt67 = readInt67;
                    arrayList79 = arrayList79;
                }
                arrayList80 = arrayList151;
            }
            ArrayList arrayList152 = arrayList79;
            if (parcel.readInt() == 0) {
                arrayList81 = null;
            } else {
                int readInt68 = parcel.readInt();
                arrayList81 = new ArrayList(readInt68);
                int i68 = 0;
                while (i68 != readInt68) {
                    i68 = bo.b(CatalogCatalogResponseObjectDto.class, parcel, arrayList81, i68, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList83 = arrayList81;
                arrayList82 = null;
            } else {
                int readInt69 = parcel.readInt();
                arrayList82 = new ArrayList(readInt69);
                arrayList83 = arrayList81;
                int i69 = 0;
                while (i69 != readInt69) {
                    i69 = bo.b(CatalogCatalogResponseObjectDto.class, parcel, arrayList82, i69, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList84 = null;
            } else {
                int readInt70 = parcel.readInt();
                arrayList84 = new ArrayList(readInt70);
                int i70 = 0;
                while (i70 != readInt70) {
                    i70 = en.a(SearchSuggestionItemDto.CREATOR, parcel, arrayList84, i70, 1);
                    readInt70 = readInt70;
                    arrayList82 = arrayList82;
                }
            }
            ArrayList arrayList153 = arrayList82;
            if (parcel.readInt() == 0) {
                arrayList85 = null;
            } else {
                int readInt71 = parcel.readInt();
                arrayList85 = new ArrayList(readInt71);
                int i71 = 0;
                while (i71 != readInt71) {
                    i71 = en.a(VideoPlaylistMetaInfoItemDto.CREATOR, parcel, arrayList85, i71, 1);
                    readInt71 = readInt71;
                    arrayList84 = arrayList84;
                }
            }
            ArrayList arrayList154 = arrayList84;
            if (parcel.readInt() == 0) {
                arrayList86 = null;
            } else {
                int readInt72 = parcel.readInt();
                arrayList86 = new ArrayList(readInt72);
                int i72 = 0;
                while (i72 != readInt72) {
                    i72 = en.a(SearchFilterItemDto.CREATOR, parcel, arrayList86, i72, 1);
                    readInt72 = readInt72;
                    arrayList85 = arrayList85;
                }
            }
            ArrayList arrayList155 = arrayList85;
            if (parcel.readInt() == 0) {
                arrayList87 = null;
            } else {
                int readInt73 = parcel.readInt();
                arrayList87 = new ArrayList(readInt73);
                int i73 = 0;
                while (i73 != readInt73) {
                    i73 = en.a(SearchSeoPageDto.CREATOR, parcel, arrayList87, i73, 1);
                    readInt73 = readInt73;
                    arrayList86 = arrayList86;
                }
            }
            ArrayList arrayList156 = arrayList86;
            if (parcel.readInt() == 0) {
                arrayList88 = null;
            } else {
                int readInt74 = parcel.readInt();
                ArrayList arrayList157 = new ArrayList(readInt74);
                int i74 = 0;
                while (i74 != readInt74) {
                    i74 = en.a(CatalogNewsfeedItemWithIdDto.CREATOR, parcel, arrayList157, i74, 1);
                    readInt74 = readInt74;
                    arrayList87 = arrayList87;
                }
                arrayList88 = arrayList157;
            }
            ArrayList arrayList158 = arrayList87;
            if (parcel.readInt() == 0) {
                arrayList89 = null;
            } else {
                int readInt75 = parcel.readInt();
                arrayList89 = new ArrayList(readInt75);
                int i75 = 0;
                while (i75 != readInt75) {
                    i75 = en.a(GroupsCollectionItemDto.CREATOR, parcel, arrayList89, i75, 1);
                    readInt75 = readInt75;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList90 = null;
            } else {
                int readInt76 = parcel.readInt();
                arrayList90 = new ArrayList(readInt76);
                int i76 = 0;
                while (i76 != readInt76) {
                    i76 = en.a(CatalogGroupCategoryItemDto.CREATOR, parcel, arrayList90, i76, 1);
                    readInt76 = readInt76;
                    arrayList89 = arrayList89;
                }
            }
            ArrayList arrayList159 = arrayList89;
            if (parcel.readInt() == 0) {
                arrayList91 = null;
            } else {
                int readInt77 = parcel.readInt();
                arrayList91 = new ArrayList(readInt77);
                int i77 = 0;
                while (i77 != readInt77) {
                    i77 = en.a(LikesReactionSetDto.CREATOR, parcel, arrayList91, i77, 1);
                    readInt77 = readInt77;
                    arrayList90 = arrayList90;
                }
            }
            ArrayList arrayList160 = arrayList90;
            if (parcel.readInt() == 0) {
                arrayList92 = null;
            } else {
                int readInt78 = parcel.readInt();
                arrayList92 = new ArrayList(readInt78);
                int i78 = 0;
                while (i78 != readInt78) {
                    i78 = en.a(MarketSearchSpellCheckResultDto.CREATOR, parcel, arrayList92, i78, 1);
                    readInt78 = readInt78;
                    arrayList91 = arrayList91;
                }
            }
            ArrayList arrayList161 = arrayList91;
            if (parcel.readInt() == 0) {
                arrayList93 = null;
            } else {
                int readInt79 = parcel.readInt();
                arrayList93 = new ArrayList(readInt79);
                int i79 = 0;
                while (i79 != readInt79) {
                    i79 = en.a(MarketSearchQueryClassifierSuggestionDto.CREATOR, parcel, arrayList93, i79, 1);
                    readInt79 = readInt79;
                    arrayList92 = arrayList92;
                }
            }
            ArrayList arrayList162 = arrayList92;
            if (parcel.readInt() == 0) {
                arrayList94 = null;
            } else {
                int readInt80 = parcel.readInt();
                ArrayList arrayList163 = new ArrayList(readInt80);
                int i80 = 0;
                while (i80 != readInt80) {
                    i80 = en.a(SearchSpellcheckerDto.CREATOR, parcel, arrayList163, i80, 1);
                    readInt80 = readInt80;
                    arrayList93 = arrayList93;
                }
                arrayList94 = arrayList163;
            }
            ArrayList arrayList164 = arrayList93;
            if (parcel.readInt() == 0) {
                arrayList95 = null;
            } else {
                int readInt81 = parcel.readInt();
                arrayList95 = new ArrayList(readInt81);
                int i81 = 0;
                while (i81 != readInt81) {
                    i81 = en.a(MarketSubcategoriesMenuItemDto.CREATOR, parcel, arrayList95, i81, 1);
                    readInt81 = readInt81;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList96 = null;
            } else {
                int readInt82 = parcel.readInt();
                arrayList96 = new ArrayList(readInt82);
                int i82 = 0;
                while (i82 != readInt82) {
                    i82 = en.a(MarketIntegrationsInfoBlockCatalogDto.CREATOR, parcel, arrayList96, i82, 1);
                    readInt82 = readInt82;
                    arrayList95 = arrayList95;
                }
            }
            ArrayList arrayList165 = arrayList95;
            if (parcel.readInt() == 0) {
                arrayList98 = arrayList96;
                arrayList97 = null;
            } else {
                int readInt83 = parcel.readInt();
                arrayList97 = new ArrayList(readInt83);
                arrayList98 = arrayList96;
                int i83 = 0;
                while (i83 != readInt83) {
                    i83 = bo.b(CatalogCatalogResponseObjectDto.class, parcel, arrayList97, i83, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList99 = null;
            } else {
                int readInt84 = parcel.readInt();
                arrayList99 = new ArrayList(readInt84);
                int i84 = 0;
                while (i84 != readInt84) {
                    i84 = en.a(FeedbacksFeedbackDto.CREATOR, parcel, arrayList99, i84, 1);
                    readInt84 = readInt84;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList100 = null;
            } else {
                int readInt85 = parcel.readInt();
                arrayList100 = new ArrayList(readInt85);
                int i85 = 0;
                while (i85 != readInt85) {
                    i85 = en.a(VideoVkliveChannelDto.CREATOR, parcel, arrayList100, i85, 1);
                    readInt85 = readInt85;
                    arrayList99 = arrayList99;
                }
            }
            ArrayList arrayList166 = arrayList99;
            if (parcel.readInt() == 0) {
                arrayList101 = null;
            } else {
                int readInt86 = parcel.readInt();
                arrayList101 = new ArrayList(readInt86);
                int i86 = 0;
                while (i86 != readInt86) {
                    i86 = en.a(VideoVkliveCategoryDto.CREATOR, parcel, arrayList101, i86, 1);
                    readInt86 = readInt86;
                    arrayList100 = arrayList100;
                }
            }
            ArrayList arrayList167 = arrayList100;
            if (parcel.readInt() == 0) {
                arrayList102 = null;
            } else {
                int readInt87 = parcel.readInt();
                arrayList102 = new ArrayList(readInt87);
                int i87 = 0;
                while (i87 != readInt87) {
                    i87 = en.a(TopshelfTopshelfItemDto.CREATOR, parcel, arrayList102, i87, 1);
                    readInt87 = readInt87;
                    arrayList101 = arrayList101;
                }
            }
            ArrayList arrayList168 = arrayList101;
            if (parcel.readInt() == 0) {
                arrayList103 = null;
            } else {
                int readInt88 = parcel.readInt();
                ArrayList arrayList169 = new ArrayList(readInt88);
                int i88 = 0;
                while (i88 != readInt88) {
                    i88 = en.a(VideoMetaInfoItemDto.CREATOR, parcel, arrayList169, i88, 1);
                    readInt88 = readInt88;
                    arrayList102 = arrayList102;
                }
                arrayList103 = arrayList169;
            }
            ArrayList arrayList170 = arrayList102;
            if (parcel.readInt() == 0) {
                arrayList104 = null;
            } else {
                int readInt89 = parcel.readInt();
                arrayList104 = new ArrayList(readInt89);
                int i89 = 0;
                while (i89 != readInt89) {
                    i89 = en.a(CatalogVideoMovieDto.CREATOR, parcel, arrayList104, i89, 1);
                    readInt89 = readInt89;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList105 = null;
            } else {
                int readInt90 = parcel.readInt();
                arrayList105 = new ArrayList(readInt90);
                int i90 = 0;
                while (i90 != readInt90) {
                    i90 = en.a(CatalogVideoMovieHeroDto.CREATOR, parcel, arrayList105, i90, 1);
                    readInt90 = readInt90;
                    arrayList104 = arrayList104;
                }
            }
            ArrayList arrayList171 = arrayList104;
            if (parcel.readInt() == 0) {
                arrayList106 = null;
            } else {
                int readInt91 = parcel.readInt();
                arrayList106 = new ArrayList(readInt91);
                int i91 = 0;
                while (i91 != readInt91) {
                    i91 = en.a(VideoKinoMailGenreDto.CREATOR, parcel, arrayList106, i91, 1);
                    readInt91 = readInt91;
                    arrayList105 = arrayList105;
                }
            }
            ArrayList arrayList172 = arrayList105;
            if (parcel.readInt() == 0) {
                arrayList107 = null;
            } else {
                int readInt92 = parcel.readInt();
                arrayList107 = new ArrayList(readInt92);
                int i92 = 0;
                while (i92 != readInt92) {
                    i92 = en.a(CatalogAiAssistantDto.CREATOR, parcel, arrayList107, i92, 1);
                    readInt92 = readInt92;
                    arrayList106 = arrayList106;
                }
            }
            ArrayList arrayList173 = arrayList106;
            if (parcel.readInt() == 0) {
                arrayList108 = null;
            } else {
                int readInt93 = parcel.readInt();
                ArrayList arrayList174 = new ArrayList(readInt93);
                int i93 = 0;
                while (i93 != readInt93) {
                    i93 = en.a(CatalogBannerVideoDto.CREATOR, parcel, arrayList174, i93, 1);
                    readInt93 = readInt93;
                    arrayList107 = arrayList107;
                }
                arrayList108 = arrayList174;
            }
            return new CatalogCatalogResponseObjectDto(catalogCatalogDto, arrayList, arrayList2, arrayList3, arrayList4, groupsGroupFullDto, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10, arrayList111, arrayList14, arrayList112, arrayList17, arrayList113, arrayList20, arrayList22, arrayList24, arrayList26, arrayList114, arrayList115, arrayList30, arrayList32, arrayList34, arrayList116, linkedHashMap2, arrayList117, arrayList118, arrayList119, arrayList121, arrayList39, arrayList122, arrayList123, arrayList124, arrayList45, arrayList125, arrayList48, arrayList126, arrayList127, arrayList128, arrayList129, arrayList131, arrayList53, arrayList132, arrayList57, arrayList133, arrayList134, arrayList135, arrayList136, arrayList138, arrayList62, arrayList139, arrayList140, arrayList67, arrayList69, arrayList141, arrayList142, arrayList143, arrayList144, arrayList146, arrayList74, arrayList147, arrayList148, arrayList149, arrayList150, arrayList152, arrayList80, arrayList83, arrayList153, arrayList154, arrayList155, arrayList156, arrayList158, arrayList88, arrayList159, arrayList160, arrayList161, arrayList162, arrayList164, arrayList94, arrayList165, arrayList98, arrayList97, arrayList166, arrayList167, arrayList168, arrayList170, arrayList103, arrayList171, arrayList172, arrayList173, arrayList107, arrayList108);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogCatalogResponseObjectDto[] newArray(int i) {
            return new CatalogCatalogResponseObjectDto[i];
        }
    }

    public CatalogCatalogResponseObjectDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, Integer.MAX_VALUE, null);
    }

    public final List<AudioAudioDto> B() {
        return this.audios;
    }

    public final List<MarketSearchSpellCheckResultDto> B1() {
        return this.marketSearchSpellCheckResult;
    }

    public final List<SearchSpellcheckerDto> B2() {
        return this.searchSpellcheckers;
    }

    public final List<BadgesBadgeDto> C() {
        return this.badges;
    }

    public final List<BaseLinkDto> D() {
        return this.baseLinks;
    }

    public final List<AppsAppDto> D0() {
        return this.games;
    }

    public final List<AppsAppDto> D1() {
        return this.miniApps;
    }

    public final List<CatalogVideoMovieDto> E1() {
        return this.movies;
    }

    public final List<SearchSuggestionItemDto> E2() {
        return this.searchSuggestions;
    }

    public final CatalogCatalogDto F() {
        return this.catalog;
    }

    public final List<MarketGroupCatalogItemDto> F0() {
        return this.groupCatalogItems;
    }

    public final List<CatalogBannerDto> G() {
        return this.catalogBanners;
    }

    public final List<VideoVideoFullDto> G2() {
        return this.shoppingVideos;
    }

    public final List<CatalogGroupCategoryItemDto> H0() {
        return this.groupCategoryItems;
    }

    public final List<ShortVideoAudioDto> I2() {
        return this.shortVideoAudios;
    }

    public final List<StickersCatalogBannerDto> J2() {
        return this.stickersBanners;
    }

    public final List<CatalogUserItemDto> K() {
        return this.catalogUsers;
    }

    public final List<GroupsCollectionItemDto> K0() {
        return this.groupCollectionItems;
    }

    public final List<MusicOwnerDto> L1() {
        return this.musicOwners;
    }

    public final List<StickersCatalogInfoDto> L2() {
        return this.stickersInfo;
    }

    public final List<CatalogCatalogVideoDto> M() {
        return this.catalogVideos;
    }

    public final List<StickersCatalogNotificationDto> M2() {
        return this.stickersNotifications;
    }

    public final List<GroupsGroupFullDto> N0() {
        return this.groups;
    }

    public final List<MarketNavigationTabDto> N1() {
        return this.navigationTabs;
    }

    public final List<StickersPackPreviewDto> N2() {
        return this.stickersPackPreviews;
    }

    public final Map<Integer, StoreStockItemDto> O2() {
        return this.stickersPacks;
    }

    public final List<GroupsChatDto> P0() {
        return this.groupsChats;
    }

    public final List<AudioSearchSuggestionDto> Q2() {
        return this.suggestions;
    }

    public final List<ChannelsChannelDto> R() {
        return this.channels;
    }

    public final List<CatalogNewsfeedItemWithIdDto> R1() {
        return this.newsfeedItems;
    }

    public final List<CatalogTextDto> R2() {
        return this.texts;
    }

    public final List<CatalogFriendsLikesItemDto> S0() {
        return this.groupsFriendsLikes;
    }

    public final List<MarketMarketCategoryTreeDto> T() {
        return this.classifiedsCategoryTree;
    }

    public final List<AudioPhotoDto> T2() {
        return this.thumbs;
    }

    public final List<CatalogHintDto> U0() {
        return this.hints;
    }

    public final List<MediaPopupDto> U1() {
        return this.placeholders;
    }

    public final List<CatalogCatalogLinkDto> V0() {
        return this.links;
    }

    public final List<AudioAudioDto> V1() {
        return this.podcastEpisodes;
    }

    public final List<VideoVideoFullDto> V2() {
        return this.videos;
    }

    public final List<ClassifiedsYoulaCityDto> W() {
        return this.classifiedsCities;
    }

    public final List<PodcastSliderItemDto> W1() {
        return this.podcastSliderItems;
    }

    public final List<VideoVkliveCategoryDto> W2() {
        return this.vkliveCategories;
    }

    public final List<PodcastPodcastDto> X1() {
        return this.podcasts;
    }

    public final List<MarketClassifiedInfoDto> Z() {
        return this.classifiedsInfos;
    }

    public final List<CatalogConcertItemDto> a0() {
        return this.concerts;
    }

    public final List<ArticlesArticleDto> b1() {
        return this.longreads;
    }

    public final List<MarketAbandonedCartDto> d() {
        return this.abandonedCarts;
    }

    public final List<AudioPlaylistDto> d0() {
        return this.playlists;
    }

    public final List<MarketMarketCategoryMappingDto> d1() {
        return this.marketCategoryMappings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<VideoVideoAlbumFullDto> e() {
        return this.albums;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogCatalogResponseObjectDto)) {
            return false;
        }
        CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto = (CatalogCatalogResponseObjectDto) obj;
        return epx.f(this.catalog, catalogCatalogResponseObjectDto.catalog) && epx.f(this.audioStreamMixes, catalogCatalogResponseObjectDto.audioStreamMixes) && epx.f(this.videoMusicStreamMixes, catalogCatalogResponseObjectDto.videoMusicStreamMixes) && epx.f(this.profiles, catalogCatalogResponseObjectDto.profiles) && epx.f(this.groups, catalogCatalogResponseObjectDto.groups) && epx.f(this.videoChannelGroup, catalogCatalogResponseObjectDto.videoChannelGroup) && epx.f(this.channels, catalogCatalogResponseObjectDto.channels) && epx.f(this.badges, catalogCatalogResponseObjectDto.badges) && epx.f(this.wallItems, catalogCatalogResponseObjectDto.wallItems) && epx.f(this.suggestions, catalogCatalogResponseObjectDto.suggestions) && epx.f(this.videos, catalogCatalogResponseObjectDto.videos) && epx.f(this.videoShowcaseGalleries, catalogCatalogResponseObjectDto.videoShowcaseGalleries) && epx.f(this.tvChannels, catalogCatalogResponseObjectDto.tvChannels) && epx.f(this.catalogVideos, catalogCatalogResponseObjectDto.catalogVideos) && epx.f(this.artistVideos, catalogCatalogResponseObjectDto.artistVideos) && epx.f(this.links, catalogCatalogResponseObjectDto.links) && epx.f(this.baseLinks, catalogCatalogResponseObjectDto.baseLinks) && epx.f(this.musicOwners, catalogCatalogResponseObjectDto.musicOwners) && epx.f(this.articles, catalogCatalogResponseObjectDto.articles) && epx.f(this.albums, catalogCatalogResponseObjectDto.albums) && epx.f(this.audios, catalogCatalogResponseObjectDto.audios) && epx.f(this.shortVideoAudios, catalogCatalogResponseObjectDto.shortVideoAudios) && epx.f(this.recommendedPlaylists, catalogCatalogResponseObjectDto.recommendedPlaylists) && epx.f(this.radioStations, catalogCatalogResponseObjectDto.radioStations) && epx.f(this.placeholders, catalogCatalogResponseObjectDto.placeholders) && epx.f(this.thumbs, catalogCatalogResponseObjectDto.thumbs) && epx.f(this.playlists, catalogCatalogResponseObjectDto.playlists) && epx.f(this.stickersPacks, catalogCatalogResponseObjectDto.stickersPacks) && epx.f(this.stickersPackPreviews, catalogCatalogResponseObjectDto.stickersPackPreviews) && epx.f(this.stickersBanners, catalogCatalogResponseObjectDto.stickersBanners) && epx.f(this.stickersInfo, catalogCatalogResponseObjectDto.stickersInfo) && epx.f(this.catalogUsers, catalogCatalogResponseObjectDto.catalogUsers) && epx.f(this.stickersNotifications, catalogCatalogResponseObjectDto.stickersNotifications) && epx.f(this.artists, catalogCatalogResponseObjectDto.artists) && epx.f(this.audioFollowingsUpdateInfo, catalogCatalogResponseObjectDto.audioFollowingsUpdateInfo) && epx.f(this.audioFollowingsUpdateItem, catalogCatalogResponseObjectDto.audioFollowingsUpdateItem) && epx.f(this.audioSignalCommonInfo, catalogCatalogResponseObjectDto.audioSignalCommonInfo) && epx.f(this.curators, catalogCatalogResponseObjectDto.curators) && epx.f(this.groupsChats, catalogCatalogResponseObjectDto.groupsChats) && epx.f(this.shoppingVideos, catalogCatalogResponseObjectDto.shoppingVideos) && epx.f(this.catalogBanners, catalogCatalogResponseObjectDto.catalogBanners) && epx.f(this.catalogAdBlocks, catalogCatalogResponseObjectDto.catalogAdBlocks) && epx.f(this.classifiedsCities, catalogCatalogResponseObjectDto.classifiedsCities) && epx.f(this.classifiedsInfos, catalogCatalogResponseObjectDto.classifiedsInfos) && epx.f(this.classifiedsCategoryTree, catalogCatalogResponseObjectDto.classifiedsCategoryTree) && epx.f(this.marketCategoryMappings, catalogCatalogResponseObjectDto.marketCategoryMappings) && epx.f(this.query, catalogCatalogResponseObjectDto.query) && epx.f(this.marketItems, catalogCatalogResponseObjectDto.marketItems) && epx.f(this.groupCatalogItems, catalogCatalogResponseObjectDto.groupCatalogItems) && epx.f(this.navigationTabs, catalogCatalogResponseObjectDto.navigationTabs) && epx.f(this.marketOrders, catalogCatalogResponseObjectDto.marketOrders) && epx.f(this.marketItemReviews, catalogCatalogResponseObjectDto.marketItemReviews) && epx.f(this.marketItemReviewPrepared, catalogCatalogResponseObjectDto.marketItemReviewPrepared) && epx.f(this.marketCommunityReviews, catalogCatalogResponseObjectDto.marketCommunityReviews) && epx.f(this.abandonedCarts, catalogCatalogResponseObjectDto.abandonedCarts) && epx.f(this.texts, catalogCatalogResponseObjectDto.texts) && epx.f(this.longreads, catalogCatalogResponseObjectDto.longreads) && epx.f(this.podcastEpisodes, catalogCatalogResponseObjectDto.podcastEpisodes) && epx.f(this.podcastSliderItems, catalogCatalogResponseObjectDto.podcastSliderItems) && epx.f(this.podcasts, catalogCatalogResponseObjectDto.podcasts) && epx.f(this.concerts, catalogCatalogResponseObjectDto.concerts) && epx.f(this.extendedPodcasts, catalogCatalogResponseObjectDto.extendedPodcasts) && epx.f(this.audioContentCards, catalogCatalogResponseObjectDto.audioContentCards) && epx.f(this.audioBooks, catalogCatalogResponseObjectDto.audioBooks) && epx.f(this.audioBooksPersons, catalogCatalogResponseObjectDto.audioBooksPersons) && epx.f(this.friendsLikedEpisodes, catalogCatalogResponseObjectDto.friendsLikedEpisodes) && epx.f(this.hints, catalogCatalogResponseObjectDto.hints) && epx.f(this.uxPolls, catalogCatalogResponseObjectDto.uxPolls) && epx.f(this.groupsFriendsLikes, catalogCatalogResponseObjectDto.groupsFriendsLikes) && epx.f(this.miniApps, catalogCatalogResponseObjectDto.miniApps) && epx.f(this.games, catalogCatalogResponseObjectDto.games) && epx.f(this.searchSuggestions, catalogCatalogResponseObjectDto.searchSuggestions) && epx.f(this.videoPlaylistsMetaInfo, catalogCatalogResponseObjectDto.videoPlaylistsMetaInfo) && epx.f(this.searchFilters, catalogCatalogResponseObjectDto.searchFilters) && epx.f(this.searchSeoPages, catalogCatalogResponseObjectDto.searchSeoPages) && epx.f(this.newsfeedItems, catalogCatalogResponseObjectDto.newsfeedItems) && epx.f(this.groupCollectionItems, catalogCatalogResponseObjectDto.groupCollectionItems) && epx.f(this.groupCategoryItems, catalogCatalogResponseObjectDto.groupCategoryItems) && epx.f(this.reactionSets, catalogCatalogResponseObjectDto.reactionSets) && epx.f(this.marketSearchSpellCheckResult, catalogCatalogResponseObjectDto.marketSearchSpellCheckResult) && epx.f(this.marketSearchClassifierResults, catalogCatalogResponseObjectDto.marketSearchClassifierResults) && epx.f(this.searchSpellcheckers, catalogCatalogResponseObjectDto.searchSpellcheckers) && epx.f(this.marketSubcategoriesMenu, catalogCatalogResponseObjectDto.marketSubcategoriesMenu) && epx.f(this.marketInfos, catalogCatalogResponseObjectDto.marketInfos) && epx.f(this.searchEntityItems, catalogCatalogResponseObjectDto.searchEntityItems) && epx.f(this.feedbacks, catalogCatalogResponseObjectDto.feedbacks) && epx.f(this.vkliveChannels, catalogCatalogResponseObjectDto.vkliveChannels) && epx.f(this.vkliveCategories, catalogCatalogResponseObjectDto.vkliveCategories) && epx.f(this.topshelfItems, catalogCatalogResponseObjectDto.topshelfItems) && epx.f(this.videoShowcaseMetaInfo, catalogCatalogResponseObjectDto.videoShowcaseMetaInfo) && epx.f(this.movies, catalogCatalogResponseObjectDto.movies) && epx.f(this.movieHeroes, catalogCatalogResponseObjectDto.movieHeroes) && epx.f(this.movieGenres, catalogCatalogResponseObjectDto.movieGenres) && epx.f(this.aiAssistants, catalogCatalogResponseObjectDto.aiAssistants) && epx.f(this.videoBanners, catalogCatalogResponseObjectDto.videoBanners);
    }

    public final List<ArticlesArticleDto> f() {
        return this.articles;
    }

    public final List<VideoVkliveChannelDto> f3() {
        return this.vkliveChannels;
    }

    public final List<VideoVideoFullDto> g() {
        return this.artistVideos;
    }

    public final List<WallWallItemDto> g3() {
        return this.wallItems;
    }

    public final int hashCode() {
        CatalogCatalogDto catalogCatalogDto = this.catalog;
        int hashCode = (catalogCatalogDto == null ? 0 : catalogCatalogDto.hashCode()) * 31;
        List<AudioStreamMixCatalogItemDto> list = this.audioStreamMixes;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<VideoMusicStreamMixCatalogItemDto> list2 = this.videoMusicStreamMixes;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<UsersUserFullDto> list3 = this.profiles;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<GroupsGroupFullDto> list4 = this.groups;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        GroupsGroupFullDto groupsGroupFullDto = this.videoChannelGroup;
        int hashCode6 = (hashCode5 + (groupsGroupFullDto == null ? 0 : groupsGroupFullDto.hashCode())) * 31;
        List<ChannelsChannelDto> list5 = this.channels;
        int hashCode7 = (hashCode6 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<BadgesBadgeDto> list6 = this.badges;
        int hashCode8 = (hashCode7 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<WallWallItemDto> list7 = this.wallItems;
        int hashCode9 = (hashCode8 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<AudioSearchSuggestionDto> list8 = this.suggestions;
        int hashCode10 = (hashCode9 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<VideoVideoFullDto> list9 = this.videos;
        int hashCode11 = (hashCode10 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<CatalogVideoShowcaseGalleryDto> list10 = this.videoShowcaseGalleries;
        int hashCode12 = (hashCode11 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<VideoTvChannelDto> list11 = this.tvChannels;
        int hashCode13 = (hashCode12 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<CatalogCatalogVideoDto> list12 = this.catalogVideos;
        int hashCode14 = (hashCode13 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<VideoVideoFullDto> list13 = this.artistVideos;
        int hashCode15 = (hashCode14 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<CatalogCatalogLinkDto> list14 = this.links;
        int hashCode16 = (hashCode15 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<BaseLinkDto> list15 = this.baseLinks;
        int hashCode17 = (hashCode16 + (list15 == null ? 0 : list15.hashCode())) * 31;
        List<MusicOwnerDto> list16 = this.musicOwners;
        int hashCode18 = (hashCode17 + (list16 == null ? 0 : list16.hashCode())) * 31;
        List<ArticlesArticleDto> list17 = this.articles;
        int hashCode19 = (hashCode18 + (list17 == null ? 0 : list17.hashCode())) * 31;
        List<VideoVideoAlbumFullDto> list18 = this.albums;
        int hashCode20 = (hashCode19 + (list18 == null ? 0 : list18.hashCode())) * 31;
        List<AudioAudioDto> list19 = this.audios;
        int hashCode21 = (hashCode20 + (list19 == null ? 0 : list19.hashCode())) * 31;
        List<ShortVideoAudioDto> list20 = this.shortVideoAudios;
        int hashCode22 = (hashCode21 + (list20 == null ? 0 : list20.hashCode())) * 31;
        List<AudioRecommendedPlaylistDto> list21 = this.recommendedPlaylists;
        int hashCode23 = (hashCode22 + (list21 == null ? 0 : list21.hashCode())) * 31;
        List<AudioRadioStationDto> list22 = this.radioStations;
        int hashCode24 = (hashCode23 + (list22 == null ? 0 : list22.hashCode())) * 31;
        List<MediaPopupDto> list23 = this.placeholders;
        int hashCode25 = (hashCode24 + (list23 == null ? 0 : list23.hashCode())) * 31;
        List<AudioPhotoDto> list24 = this.thumbs;
        int hashCode26 = (hashCode25 + (list24 == null ? 0 : list24.hashCode())) * 31;
        List<AudioPlaylistDto> list25 = this.playlists;
        int hashCode27 = (hashCode26 + (list25 == null ? 0 : list25.hashCode())) * 31;
        Map<Integer, StoreStockItemDto> map = this.stickersPacks;
        int hashCode28 = (hashCode27 + (map == null ? 0 : map.hashCode())) * 31;
        List<StickersPackPreviewDto> list26 = this.stickersPackPreviews;
        int hashCode29 = (hashCode28 + (list26 == null ? 0 : list26.hashCode())) * 31;
        List<StickersCatalogBannerDto> list27 = this.stickersBanners;
        int hashCode30 = (hashCode29 + (list27 == null ? 0 : list27.hashCode())) * 31;
        List<StickersCatalogInfoDto> list28 = this.stickersInfo;
        int hashCode31 = (hashCode30 + (list28 == null ? 0 : list28.hashCode())) * 31;
        List<CatalogUserItemDto> list29 = this.catalogUsers;
        int hashCode32 = (hashCode31 + (list29 == null ? 0 : list29.hashCode())) * 31;
        List<StickersCatalogNotificationDto> list30 = this.stickersNotifications;
        int hashCode33 = (hashCode32 + (list30 == null ? 0 : list30.hashCode())) * 31;
        List<AudioArtistDto> list31 = this.artists;
        int hashCode34 = (hashCode33 + (list31 == null ? 0 : list31.hashCode())) * 31;
        List<AudioFollowingsUpdateInfoDto> list32 = this.audioFollowingsUpdateInfo;
        int hashCode35 = (hashCode34 + (list32 == null ? 0 : list32.hashCode())) * 31;
        List<AudioFollowingsUpdateItemDto> list33 = this.audioFollowingsUpdateItem;
        int hashCode36 = (hashCode35 + (list33 == null ? 0 : list33.hashCode())) * 31;
        List<AudioSignalCommonInfoDto> list34 = this.audioSignalCommonInfo;
        int hashCode37 = (hashCode36 + (list34 == null ? 0 : list34.hashCode())) * 31;
        List<AudioCuratorDto> list35 = this.curators;
        int hashCode38 = (hashCode37 + (list35 == null ? 0 : list35.hashCode())) * 31;
        List<GroupsChatDto> list36 = this.groupsChats;
        int hashCode39 = (hashCode38 + (list36 == null ? 0 : list36.hashCode())) * 31;
        List<VideoVideoFullDto> list37 = this.shoppingVideos;
        int hashCode40 = (hashCode39 + (list37 == null ? 0 : list37.hashCode())) * 31;
        List<CatalogBannerDto> list38 = this.catalogBanners;
        int hashCode41 = (hashCode40 + (list38 == null ? 0 : list38.hashCode())) * 31;
        List<CatalogAdBlockDto> list39 = this.catalogAdBlocks;
        int hashCode42 = (hashCode41 + (list39 == null ? 0 : list39.hashCode())) * 31;
        List<ClassifiedsYoulaCityDto> list40 = this.classifiedsCities;
        int hashCode43 = (hashCode42 + (list40 == null ? 0 : list40.hashCode())) * 31;
        List<MarketClassifiedInfoDto> list41 = this.classifiedsInfos;
        int hashCode44 = (hashCode43 + (list41 == null ? 0 : list41.hashCode())) * 31;
        List<MarketMarketCategoryTreeDto> list42 = this.classifiedsCategoryTree;
        int hashCode45 = (hashCode44 + (list42 == null ? 0 : list42.hashCode())) * 31;
        List<MarketMarketCategoryMappingDto> list43 = this.marketCategoryMappings;
        int hashCode46 = (hashCode45 + (list43 == null ? 0 : list43.hashCode())) * 31;
        List<MarketMarketSearchQueryDto> list44 = this.query;
        int hashCode47 = (hashCode46 + (list44 == null ? 0 : list44.hashCode())) * 31;
        List<MarketMarketItemDto> list45 = this.marketItems;
        int hashCode48 = (hashCode47 + (list45 == null ? 0 : list45.hashCode())) * 31;
        List<MarketGroupCatalogItemDto> list46 = this.groupCatalogItems;
        int hashCode49 = (hashCode48 + (list46 == null ? 0 : list46.hashCode())) * 31;
        List<MarketNavigationTabDto> list47 = this.navigationTabs;
        int hashCode50 = (hashCode49 + (list47 == null ? 0 : list47.hashCode())) * 31;
        List<MarketOrderDto> list48 = this.marketOrders;
        int hashCode51 = (hashCode50 + (list48 == null ? 0 : list48.hashCode())) * 31;
        List<MarketUserReviewsItemsReviewDto> list49 = this.marketItemReviews;
        int hashCode52 = (hashCode51 + (list49 == null ? 0 : list49.hashCode())) * 31;
        List<MarketItemForReviewDto> list50 = this.marketItemReviewPrepared;
        int hashCode53 = (hashCode52 + (list50 == null ? 0 : list50.hashCode())) * 31;
        List<MarketCommunityReviewDto> list51 = this.marketCommunityReviews;
        int hashCode54 = (hashCode53 + (list51 == null ? 0 : list51.hashCode())) * 31;
        List<MarketAbandonedCartDto> list52 = this.abandonedCarts;
        int hashCode55 = (hashCode54 + (list52 == null ? 0 : list52.hashCode())) * 31;
        List<CatalogTextDto> list53 = this.texts;
        int hashCode56 = (hashCode55 + (list53 == null ? 0 : list53.hashCode())) * 31;
        List<ArticlesArticleDto> list54 = this.longreads;
        int hashCode57 = (hashCode56 + (list54 == null ? 0 : list54.hashCode())) * 31;
        List<AudioAudioDto> list55 = this.podcastEpisodes;
        int hashCode58 = (hashCode57 + (list55 == null ? 0 : list55.hashCode())) * 31;
        List<PodcastSliderItemDto> list56 = this.podcastSliderItems;
        int hashCode59 = (hashCode58 + (list56 == null ? 0 : list56.hashCode())) * 31;
        List<PodcastPodcastDto> list57 = this.podcasts;
        int hashCode60 = (hashCode59 + (list57 == null ? 0 : list57.hashCode())) * 31;
        List<CatalogConcertItemDto> list58 = this.concerts;
        int hashCode61 = (hashCode60 + (list58 == null ? 0 : list58.hashCode())) * 31;
        List<PodcastExtendedPodcastDto> list59 = this.extendedPodcasts;
        int hashCode62 = (hashCode61 + (list59 == null ? 0 : list59.hashCode())) * 31;
        List<AudioAudioContentCardDto> list60 = this.audioContentCards;
        int hashCode63 = (hashCode62 + (list60 == null ? 0 : list60.hashCode())) * 31;
        List<AudioBooksAudioBookDto> list61 = this.audioBooks;
        int hashCode64 = (hashCode63 + (list61 == null ? 0 : list61.hashCode())) * 31;
        List<AudioBooksItemPersonDto> list62 = this.audioBooksPersons;
        int hashCode65 = (hashCode64 + (list62 == null ? 0 : list62.hashCode())) * 31;
        List<PodcastEpisodeWithLikedFriendsDto> list63 = this.friendsLikedEpisodes;
        int hashCode66 = (hashCode65 + (list63 == null ? 0 : list63.hashCode())) * 31;
        List<CatalogHintDto> list64 = this.hints;
        int hashCode67 = (hashCode66 + (list64 == null ? 0 : list64.hashCode())) * 31;
        List<CatalogUxPollDto> list65 = this.uxPolls;
        int hashCode68 = (hashCode67 + (list65 == null ? 0 : list65.hashCode())) * 31;
        List<CatalogFriendsLikesItemDto> list66 = this.groupsFriendsLikes;
        int hashCode69 = (hashCode68 + (list66 == null ? 0 : list66.hashCode())) * 31;
        List<AppsAppDto> list67 = this.miniApps;
        int hashCode70 = (hashCode69 + (list67 == null ? 0 : list67.hashCode())) * 31;
        List<AppsAppDto> list68 = this.games;
        int hashCode71 = (hashCode70 + (list68 == null ? 0 : list68.hashCode())) * 31;
        List<SearchSuggestionItemDto> list69 = this.searchSuggestions;
        int hashCode72 = (hashCode71 + (list69 == null ? 0 : list69.hashCode())) * 31;
        List<VideoPlaylistMetaInfoItemDto> list70 = this.videoPlaylistsMetaInfo;
        int hashCode73 = (hashCode72 + (list70 == null ? 0 : list70.hashCode())) * 31;
        List<SearchFilterItemDto> list71 = this.searchFilters;
        int hashCode74 = (hashCode73 + (list71 == null ? 0 : list71.hashCode())) * 31;
        List<SearchSeoPageDto> list72 = this.searchSeoPages;
        int hashCode75 = (hashCode74 + (list72 == null ? 0 : list72.hashCode())) * 31;
        List<CatalogNewsfeedItemWithIdDto> list73 = this.newsfeedItems;
        int hashCode76 = (hashCode75 + (list73 == null ? 0 : list73.hashCode())) * 31;
        List<GroupsCollectionItemDto> list74 = this.groupCollectionItems;
        int hashCode77 = (hashCode76 + (list74 == null ? 0 : list74.hashCode())) * 31;
        List<CatalogGroupCategoryItemDto> list75 = this.groupCategoryItems;
        int hashCode78 = (hashCode77 + (list75 == null ? 0 : list75.hashCode())) * 31;
        List<LikesReactionSetDto> list76 = this.reactionSets;
        int hashCode79 = (hashCode78 + (list76 == null ? 0 : list76.hashCode())) * 31;
        List<MarketSearchSpellCheckResultDto> list77 = this.marketSearchSpellCheckResult;
        int hashCode80 = (hashCode79 + (list77 == null ? 0 : list77.hashCode())) * 31;
        List<MarketSearchQueryClassifierSuggestionDto> list78 = this.marketSearchClassifierResults;
        int hashCode81 = (hashCode80 + (list78 == null ? 0 : list78.hashCode())) * 31;
        List<SearchSpellcheckerDto> list79 = this.searchSpellcheckers;
        int hashCode82 = (hashCode81 + (list79 == null ? 0 : list79.hashCode())) * 31;
        List<MarketSubcategoriesMenuItemDto> list80 = this.marketSubcategoriesMenu;
        int hashCode83 = (hashCode82 + (list80 == null ? 0 : list80.hashCode())) * 31;
        List<MarketIntegrationsInfoBlockCatalogDto> list81 = this.marketInfos;
        int hashCode84 = (hashCode83 + (list81 == null ? 0 : list81.hashCode())) * 31;
        List<SearchEntityItemDto> list82 = this.searchEntityItems;
        int hashCode85 = (hashCode84 + (list82 == null ? 0 : list82.hashCode())) * 31;
        List<FeedbacksFeedbackDto> list83 = this.feedbacks;
        int hashCode86 = (hashCode85 + (list83 == null ? 0 : list83.hashCode())) * 31;
        List<VideoVkliveChannelDto> list84 = this.vkliveChannels;
        int hashCode87 = (hashCode86 + (list84 == null ? 0 : list84.hashCode())) * 31;
        List<VideoVkliveCategoryDto> list85 = this.vkliveCategories;
        int hashCode88 = (hashCode87 + (list85 == null ? 0 : list85.hashCode())) * 31;
        List<TopshelfTopshelfItemDto> list86 = this.topshelfItems;
        int hashCode89 = (hashCode88 + (list86 == null ? 0 : list86.hashCode())) * 31;
        List<VideoMetaInfoItemDto> list87 = this.videoShowcaseMetaInfo;
        int hashCode90 = (hashCode89 + (list87 == null ? 0 : list87.hashCode())) * 31;
        List<CatalogVideoMovieDto> list88 = this.movies;
        int hashCode91 = (hashCode90 + (list88 == null ? 0 : list88.hashCode())) * 31;
        List<CatalogVideoMovieHeroDto> list89 = this.movieHeroes;
        int hashCode92 = (hashCode91 + (list89 == null ? 0 : list89.hashCode())) * 31;
        List<VideoKinoMailGenreDto> list90 = this.movieGenres;
        int hashCode93 = (hashCode92 + (list90 == null ? 0 : list90.hashCode())) * 31;
        List<CatalogAiAssistantDto> list91 = this.aiAssistants;
        int hashCode94 = (hashCode93 + (list91 == null ? 0 : list91.hashCode())) * 31;
        List<CatalogBannerVideoDto> list92 = this.videoBanners;
        return hashCode94 + (list92 != null ? list92.hashCode() : 0);
    }

    public final List<AudioArtistDto> i() {
        return this.artists;
    }

    public final List<UsersUserFullDto> i2() {
        return this.profiles;
    }

    public final List<AudioBooksAudioBookDto> j() {
        return this.audioBooks;
    }

    public final List<AudioBooksItemPersonDto> k() {
        return this.audioBooksPersons;
    }

    public final List<AudioAudioContentCardDto> l() {
        return this.audioContentCards;
    }

    public final List<AudioCuratorDto> l0() {
        return this.curators;
    }

    public final List<MarketMarketSearchQueryDto> l2() {
        return this.query;
    }

    public final List<AudioRadioStationDto> m2() {
        return this.radioStations;
    }

    public final List<AudioFollowingsUpdateInfoDto> n() {
        return this.audioFollowingsUpdateInfo;
    }

    public final List<MarketCommunityReviewDto> n1() {
        return this.marketCommunityReviews;
    }

    public final List<AudioFollowingsUpdateItemDto> o() {
        return this.audioFollowingsUpdateItem;
    }

    public final List<MarketIntegrationsInfoBlockCatalogDto> o1() {
        return this.marketInfos;
    }

    public final List<LikesReactionSetDto> o2() {
        return this.reactionSets;
    }

    public final List<AudioSignalCommonInfoDto> p() {
        return this.audioSignalCommonInfo;
    }

    public final List<AudioRecommendedPlaylistDto> q2() {
        return this.recommendedPlaylists;
    }

    public final List<SearchEntityItemDto> r2() {
        return this.searchEntityItems;
    }

    public final List<MarketItemForReviewDto> s1() {
        return this.marketItemReviewPrepared;
    }

    public final List<MarketUserReviewsItemsReviewDto> t1() {
        return this.marketItemReviews;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogCatalogResponseObjectDto(catalog=");
        sb.append(this.catalog);
        sb.append(", audioStreamMixes=");
        sb.append(this.audioStreamMixes);
        sb.append(", videoMusicStreamMixes=");
        sb.append(this.videoMusicStreamMixes);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", videoChannelGroup=");
        sb.append(this.videoChannelGroup);
        sb.append(", channels=");
        sb.append(this.channels);
        sb.append(", badges=");
        sb.append(this.badges);
        sb.append(", wallItems=");
        sb.append(this.wallItems);
        sb.append(", suggestions=");
        sb.append(this.suggestions);
        sb.append(", videos=");
        sb.append(this.videos);
        sb.append(", videoShowcaseGalleries=");
        sb.append(this.videoShowcaseGalleries);
        sb.append(", tvChannels=");
        sb.append(this.tvChannels);
        sb.append(", catalogVideos=");
        sb.append(this.catalogVideos);
        sb.append(", artistVideos=");
        sb.append(this.artistVideos);
        sb.append(", links=");
        sb.append(this.links);
        sb.append(", baseLinks=");
        sb.append(this.baseLinks);
        sb.append(", musicOwners=");
        sb.append(this.musicOwners);
        sb.append(", articles=");
        sb.append(this.articles);
        sb.append(", albums=");
        sb.append(this.albums);
        sb.append(", audios=");
        sb.append(this.audios);
        sb.append(", shortVideoAudios=");
        sb.append(this.shortVideoAudios);
        sb.append(", recommendedPlaylists=");
        sb.append(this.recommendedPlaylists);
        sb.append(", radioStations=");
        sb.append(this.radioStations);
        sb.append(", placeholders=");
        sb.append(this.placeholders);
        sb.append(", thumbs=");
        sb.append(this.thumbs);
        sb.append(", playlists=");
        sb.append(this.playlists);
        sb.append(", stickersPacks=");
        sb.append(this.stickersPacks);
        sb.append(", stickersPackPreviews=");
        sb.append(this.stickersPackPreviews);
        sb.append(", stickersBanners=");
        sb.append(this.stickersBanners);
        sb.append(", stickersInfo=");
        sb.append(this.stickersInfo);
        sb.append(", catalogUsers=");
        sb.append(this.catalogUsers);
        sb.append(", stickersNotifications=");
        sb.append(this.stickersNotifications);
        sb.append(", artists=");
        sb.append(this.artists);
        sb.append(", audioFollowingsUpdateInfo=");
        sb.append(this.audioFollowingsUpdateInfo);
        sb.append(", audioFollowingsUpdateItem=");
        sb.append(this.audioFollowingsUpdateItem);
        sb.append(", audioSignalCommonInfo=");
        sb.append(this.audioSignalCommonInfo);
        sb.append(", curators=");
        sb.append(this.curators);
        sb.append(", groupsChats=");
        sb.append(this.groupsChats);
        sb.append(", shoppingVideos=");
        sb.append(this.shoppingVideos);
        sb.append(", catalogBanners=");
        sb.append(this.catalogBanners);
        sb.append(", catalogAdBlocks=");
        sb.append(this.catalogAdBlocks);
        sb.append(", classifiedsCities=");
        sb.append(this.classifiedsCities);
        sb.append(", classifiedsInfos=");
        sb.append(this.classifiedsInfos);
        sb.append(", classifiedsCategoryTree=");
        sb.append(this.classifiedsCategoryTree);
        sb.append(", marketCategoryMappings=");
        sb.append(this.marketCategoryMappings);
        sb.append(", query=");
        sb.append(this.query);
        sb.append(", marketItems=");
        sb.append(this.marketItems);
        sb.append(", groupCatalogItems=");
        sb.append(this.groupCatalogItems);
        sb.append(", navigationTabs=");
        sb.append(this.navigationTabs);
        sb.append(", marketOrders=");
        sb.append(this.marketOrders);
        sb.append(", marketItemReviews=");
        sb.append(this.marketItemReviews);
        sb.append(", marketItemReviewPrepared=");
        sb.append(this.marketItemReviewPrepared);
        sb.append(", marketCommunityReviews=");
        sb.append(this.marketCommunityReviews);
        sb.append(", abandonedCarts=");
        sb.append(this.abandonedCarts);
        sb.append(", texts=");
        sb.append(this.texts);
        sb.append(", longreads=");
        sb.append(this.longreads);
        sb.append(", podcastEpisodes=");
        sb.append(this.podcastEpisodes);
        sb.append(", podcastSliderItems=");
        sb.append(this.podcastSliderItems);
        sb.append(", podcasts=");
        sb.append(this.podcasts);
        sb.append(", concerts=");
        sb.append(this.concerts);
        sb.append(", extendedPodcasts=");
        sb.append(this.extendedPodcasts);
        sb.append(", audioContentCards=");
        sb.append(this.audioContentCards);
        sb.append(", audioBooks=");
        sb.append(this.audioBooks);
        sb.append(", audioBooksPersons=");
        sb.append(this.audioBooksPersons);
        sb.append(", friendsLikedEpisodes=");
        sb.append(this.friendsLikedEpisodes);
        sb.append(", hints=");
        sb.append(this.hints);
        sb.append(", uxPolls=");
        sb.append(this.uxPolls);
        sb.append(", groupsFriendsLikes=");
        sb.append(this.groupsFriendsLikes);
        sb.append(", miniApps=");
        sb.append(this.miniApps);
        sb.append(", games=");
        sb.append(this.games);
        sb.append(", searchSuggestions=");
        sb.append(this.searchSuggestions);
        sb.append(", videoPlaylistsMetaInfo=");
        sb.append(this.videoPlaylistsMetaInfo);
        sb.append(", searchFilters=");
        sb.append(this.searchFilters);
        sb.append(", searchSeoPages=");
        sb.append(this.searchSeoPages);
        sb.append(", newsfeedItems=");
        sb.append(this.newsfeedItems);
        sb.append(", groupCollectionItems=");
        sb.append(this.groupCollectionItems);
        sb.append(", groupCategoryItems=");
        sb.append(this.groupCategoryItems);
        sb.append(", reactionSets=");
        sb.append(this.reactionSets);
        sb.append(", marketSearchSpellCheckResult=");
        sb.append(this.marketSearchSpellCheckResult);
        sb.append(", marketSearchClassifierResults=");
        sb.append(this.marketSearchClassifierResults);
        sb.append(", searchSpellcheckers=");
        sb.append(this.searchSpellcheckers);
        sb.append(", marketSubcategoriesMenu=");
        sb.append(this.marketSubcategoriesMenu);
        sb.append(", marketInfos=");
        sb.append(this.marketInfos);
        sb.append(", searchEntityItems=");
        sb.append(this.searchEntityItems);
        sb.append(", feedbacks=");
        sb.append(this.feedbacks);
        sb.append(", vkliveChannels=");
        sb.append(this.vkliveChannels);
        sb.append(", vkliveCategories=");
        sb.append(this.vkliveCategories);
        sb.append(", topshelfItems=");
        sb.append(this.topshelfItems);
        sb.append(", videoShowcaseMetaInfo=");
        sb.append(this.videoShowcaseMetaInfo);
        sb.append(", movies=");
        sb.append(this.movies);
        sb.append(", movieHeroes=");
        sb.append(this.movieHeroes);
        sb.append(", movieGenres=");
        sb.append(this.movieGenres);
        sb.append(", aiAssistants=");
        sb.append(this.aiAssistants);
        sb.append(", videoBanners=");
        return ms9.a(')', sb, this.videoBanners);
    }

    public final List<AudioStreamMixCatalogItemDto> u() {
        return this.audioStreamMixes;
    }

    public final List<PodcastExtendedPodcastDto> v0() {
        return this.extendedPodcasts;
    }

    public final List<FeedbacksFeedbackDto> w0() {
        return this.feedbacks;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CatalogCatalogDto catalogCatalogDto = this.catalog;
        if (catalogCatalogDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogCatalogDto.writeToParcel(parcel, i);
        }
        List<AudioStreamMixCatalogItemDto> list = this.audioStreamMixes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AudioStreamMixCatalogItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<VideoMusicStreamMixCatalogItemDto> list2 = this.videoMusicStreamMixes;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((VideoMusicStreamMixCatalogItemDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<UsersUserFullDto> list3 = this.profiles;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        List<GroupsGroupFullDto> list4 = this.groups;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                parcel.writeParcelable((Parcelable) f4.next(), i);
            }
        }
        parcel.writeParcelable(this.videoChannelGroup, i);
        List<ChannelsChannelDto> list5 = this.channels;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                ((ChannelsChannelDto) f5.next()).writeToParcel(parcel, i);
            }
        }
        List<BadgesBadgeDto> list6 = this.badges;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list6, 1);
            while (f6.hasNext()) {
                ((BadgesBadgeDto) f6.next()).writeToParcel(parcel, i);
            }
        }
        List<WallWallItemDto> list7 = this.wallItems;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f7 = dn.f(parcel, list7, 1);
            while (f7.hasNext()) {
                parcel.writeParcelable((Parcelable) f7.next(), i);
            }
        }
        List<AudioSearchSuggestionDto> list8 = this.suggestions;
        if (list8 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f8 = dn.f(parcel, list8, 1);
            while (f8.hasNext()) {
                ((AudioSearchSuggestionDto) f8.next()).writeToParcel(parcel, i);
            }
        }
        List<VideoVideoFullDto> list9 = this.videos;
        if (list9 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f9 = dn.f(parcel, list9, 1);
            while (f9.hasNext()) {
                parcel.writeParcelable((Parcelable) f9.next(), i);
            }
        }
        List<CatalogVideoShowcaseGalleryDto> list10 = this.videoShowcaseGalleries;
        if (list10 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f10 = dn.f(parcel, list10, 1);
            while (f10.hasNext()) {
                ((CatalogVideoShowcaseGalleryDto) f10.next()).writeToParcel(parcel, i);
            }
        }
        List<VideoTvChannelDto> list11 = this.tvChannels;
        if (list11 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f11 = dn.f(parcel, list11, 1);
            while (f11.hasNext()) {
                ((VideoTvChannelDto) f11.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogCatalogVideoDto> list12 = this.catalogVideos;
        if (list12 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f12 = dn.f(parcel, list12, 1);
            while (f12.hasNext()) {
                ((CatalogCatalogVideoDto) f12.next()).writeToParcel(parcel, i);
            }
        }
        List<VideoVideoFullDto> list13 = this.artistVideos;
        if (list13 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f13 = dn.f(parcel, list13, 1);
            while (f13.hasNext()) {
                parcel.writeParcelable((Parcelable) f13.next(), i);
            }
        }
        List<CatalogCatalogLinkDto> list14 = this.links;
        if (list14 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f14 = dn.f(parcel, list14, 1);
            while (f14.hasNext()) {
                ((CatalogCatalogLinkDto) f14.next()).writeToParcel(parcel, i);
            }
        }
        List<BaseLinkDto> list15 = this.baseLinks;
        if (list15 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f15 = dn.f(parcel, list15, 1);
            while (f15.hasNext()) {
                parcel.writeParcelable((Parcelable) f15.next(), i);
            }
        }
        List<MusicOwnerDto> list16 = this.musicOwners;
        if (list16 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f16 = dn.f(parcel, list16, 1);
            while (f16.hasNext()) {
                ((MusicOwnerDto) f16.next()).writeToParcel(parcel, i);
            }
        }
        List<ArticlesArticleDto> list17 = this.articles;
        if (list17 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f17 = dn.f(parcel, list17, 1);
            while (f17.hasNext()) {
                parcel.writeParcelable((Parcelable) f17.next(), i);
            }
        }
        List<VideoVideoAlbumFullDto> list18 = this.albums;
        if (list18 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f18 = dn.f(parcel, list18, 1);
            while (f18.hasNext()) {
                parcel.writeParcelable((Parcelable) f18.next(), i);
            }
        }
        List<AudioAudioDto> list19 = this.audios;
        if (list19 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f19 = dn.f(parcel, list19, 1);
            while (f19.hasNext()) {
                parcel.writeParcelable((Parcelable) f19.next(), i);
            }
        }
        List<ShortVideoAudioDto> list20 = this.shortVideoAudios;
        if (list20 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f20 = dn.f(parcel, list20, 1);
            while (f20.hasNext()) {
                parcel.writeParcelable((Parcelable) f20.next(), i);
            }
        }
        List<AudioRecommendedPlaylistDto> list21 = this.recommendedPlaylists;
        if (list21 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f21 = dn.f(parcel, list21, 1);
            while (f21.hasNext()) {
                ((AudioRecommendedPlaylistDto) f21.next()).writeToParcel(parcel, i);
            }
        }
        List<AudioRadioStationDto> list22 = this.radioStations;
        if (list22 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f22 = dn.f(parcel, list22, 1);
            while (f22.hasNext()) {
                ((AudioRadioStationDto) f22.next()).writeToParcel(parcel, i);
            }
        }
        List<MediaPopupDto> list23 = this.placeholders;
        if (list23 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f23 = dn.f(parcel, list23, 1);
            while (f23.hasNext()) {
                parcel.writeParcelable((Parcelable) f23.next(), i);
            }
        }
        List<AudioPhotoDto> list24 = this.thumbs;
        if (list24 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f24 = dn.f(parcel, list24, 1);
            while (f24.hasNext()) {
                parcel.writeParcelable((Parcelable) f24.next(), i);
            }
        }
        List<AudioPlaylistDto> list25 = this.playlists;
        if (list25 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f25 = dn.f(parcel, list25, 1);
            while (f25.hasNext()) {
                parcel.writeParcelable((Parcelable) f25.next(), i);
            }
        }
        Map<Integer, StoreStockItemDto> map = this.stickersPacks;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<Integer, StoreStockItemDto> entry : map.entrySet()) {
                parcel.writeInt(entry.getKey().intValue());
                entry.getValue().writeToParcel(parcel, i);
            }
        }
        List<StickersPackPreviewDto> list26 = this.stickersPackPreviews;
        if (list26 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f26 = dn.f(parcel, list26, 1);
            while (f26.hasNext()) {
                ((StickersPackPreviewDto) f26.next()).writeToParcel(parcel, i);
            }
        }
        List<StickersCatalogBannerDto> list27 = this.stickersBanners;
        if (list27 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f27 = dn.f(parcel, list27, 1);
            while (f27.hasNext()) {
                ((StickersCatalogBannerDto) f27.next()).writeToParcel(parcel, i);
            }
        }
        List<StickersCatalogInfoDto> list28 = this.stickersInfo;
        if (list28 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f28 = dn.f(parcel, list28, 1);
            while (f28.hasNext()) {
                ((StickersCatalogInfoDto) f28.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogUserItemDto> list29 = this.catalogUsers;
        if (list29 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f29 = dn.f(parcel, list29, 1);
            while (f29.hasNext()) {
                ((CatalogUserItemDto) f29.next()).writeToParcel(parcel, i);
            }
        }
        List<StickersCatalogNotificationDto> list30 = this.stickersNotifications;
        if (list30 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f30 = dn.f(parcel, list30, 1);
            while (f30.hasNext()) {
                ((StickersCatalogNotificationDto) f30.next()).writeToParcel(parcel, i);
            }
        }
        List<AudioArtistDto> list31 = this.artists;
        if (list31 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f31 = dn.f(parcel, list31, 1);
            while (f31.hasNext()) {
                parcel.writeParcelable((Parcelable) f31.next(), i);
            }
        }
        List<AudioFollowingsUpdateInfoDto> list32 = this.audioFollowingsUpdateInfo;
        if (list32 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f32 = dn.f(parcel, list32, 1);
            while (f32.hasNext()) {
                ((AudioFollowingsUpdateInfoDto) f32.next()).writeToParcel(parcel, i);
            }
        }
        List<AudioFollowingsUpdateItemDto> list33 = this.audioFollowingsUpdateItem;
        if (list33 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f33 = dn.f(parcel, list33, 1);
            while (f33.hasNext()) {
                ((AudioFollowingsUpdateItemDto) f33.next()).writeToParcel(parcel, i);
            }
        }
        List<AudioSignalCommonInfoDto> list34 = this.audioSignalCommonInfo;
        if (list34 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f34 = dn.f(parcel, list34, 1);
            while (f34.hasNext()) {
                ((AudioSignalCommonInfoDto) f34.next()).writeToParcel(parcel, i);
            }
        }
        List<AudioCuratorDto> list35 = this.curators;
        if (list35 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f35 = dn.f(parcel, list35, 1);
            while (f35.hasNext()) {
                parcel.writeParcelable((Parcelable) f35.next(), i);
            }
        }
        List<GroupsChatDto> list36 = this.groupsChats;
        if (list36 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f36 = dn.f(parcel, list36, 1);
            while (f36.hasNext()) {
                ((GroupsChatDto) f36.next()).writeToParcel(parcel, i);
            }
        }
        List<VideoVideoFullDto> list37 = this.shoppingVideos;
        if (list37 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f37 = dn.f(parcel, list37, 1);
            while (f37.hasNext()) {
                parcel.writeParcelable((Parcelable) f37.next(), i);
            }
        }
        List<CatalogBannerDto> list38 = this.catalogBanners;
        if (list38 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f38 = dn.f(parcel, list38, 1);
            while (f38.hasNext()) {
                ((CatalogBannerDto) f38.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogAdBlockDto> list39 = this.catalogAdBlocks;
        if (list39 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f39 = dn.f(parcel, list39, 1);
            while (f39.hasNext()) {
                ((CatalogAdBlockDto) f39.next()).writeToParcel(parcel, i);
            }
        }
        List<ClassifiedsYoulaCityDto> list40 = this.classifiedsCities;
        if (list40 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f40 = dn.f(parcel, list40, 1);
            while (f40.hasNext()) {
                ((ClassifiedsYoulaCityDto) f40.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketClassifiedInfoDto> list41 = this.classifiedsInfos;
        if (list41 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f41 = dn.f(parcel, list41, 1);
            while (f41.hasNext()) {
                ((MarketClassifiedInfoDto) f41.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketMarketCategoryTreeDto> list42 = this.classifiedsCategoryTree;
        if (list42 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f42 = dn.f(parcel, list42, 1);
            while (f42.hasNext()) {
                ((MarketMarketCategoryTreeDto) f42.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketMarketCategoryMappingDto> list43 = this.marketCategoryMappings;
        if (list43 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f43 = dn.f(parcel, list43, 1);
            while (f43.hasNext()) {
                ((MarketMarketCategoryMappingDto) f43.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketMarketSearchQueryDto> list44 = this.query;
        if (list44 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f44 = dn.f(parcel, list44, 1);
            while (f44.hasNext()) {
                ((MarketMarketSearchQueryDto) f44.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketMarketItemDto> list45 = this.marketItems;
        if (list45 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f45 = dn.f(parcel, list45, 1);
            while (f45.hasNext()) {
                parcel.writeParcelable((Parcelable) f45.next(), i);
            }
        }
        List<MarketGroupCatalogItemDto> list46 = this.groupCatalogItems;
        if (list46 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f46 = dn.f(parcel, list46, 1);
            while (f46.hasNext()) {
                ((MarketGroupCatalogItemDto) f46.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketNavigationTabDto> list47 = this.navigationTabs;
        if (list47 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f47 = dn.f(parcel, list47, 1);
            while (f47.hasNext()) {
                ((MarketNavigationTabDto) f47.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketOrderDto> list48 = this.marketOrders;
        if (list48 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f48 = dn.f(parcel, list48, 1);
            while (f48.hasNext()) {
                ((MarketOrderDto) f48.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketUserReviewsItemsReviewDto> list49 = this.marketItemReviews;
        if (list49 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f49 = dn.f(parcel, list49, 1);
            while (f49.hasNext()) {
                ((MarketUserReviewsItemsReviewDto) f49.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketItemForReviewDto> list50 = this.marketItemReviewPrepared;
        if (list50 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f50 = dn.f(parcel, list50, 1);
            while (f50.hasNext()) {
                ((MarketItemForReviewDto) f50.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketCommunityReviewDto> list51 = this.marketCommunityReviews;
        if (list51 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f51 = dn.f(parcel, list51, 1);
            while (f51.hasNext()) {
                ((MarketCommunityReviewDto) f51.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketAbandonedCartDto> list52 = this.abandonedCarts;
        if (list52 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f52 = dn.f(parcel, list52, 1);
            while (f52.hasNext()) {
                ((MarketAbandonedCartDto) f52.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogTextDto> list53 = this.texts;
        if (list53 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f53 = dn.f(parcel, list53, 1);
            while (f53.hasNext()) {
                ((CatalogTextDto) f53.next()).writeToParcel(parcel, i);
            }
        }
        List<ArticlesArticleDto> list54 = this.longreads;
        if (list54 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f54 = dn.f(parcel, list54, 1);
            while (f54.hasNext()) {
                parcel.writeParcelable((Parcelable) f54.next(), i);
            }
        }
        List<AudioAudioDto> list55 = this.podcastEpisodes;
        if (list55 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f55 = dn.f(parcel, list55, 1);
            while (f55.hasNext()) {
                parcel.writeParcelable((Parcelable) f55.next(), i);
            }
        }
        List<PodcastSliderItemDto> list56 = this.podcastSliderItems;
        if (list56 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f56 = dn.f(parcel, list56, 1);
            while (f56.hasNext()) {
                ((PodcastSliderItemDto) f56.next()).writeToParcel(parcel, i);
            }
        }
        List<PodcastPodcastDto> list57 = this.podcasts;
        if (list57 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f57 = dn.f(parcel, list57, 1);
            while (f57.hasNext()) {
                ((PodcastPodcastDto) f57.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogConcertItemDto> list58 = this.concerts;
        if (list58 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f58 = dn.f(parcel, list58, 1);
            while (f58.hasNext()) {
                ((CatalogConcertItemDto) f58.next()).writeToParcel(parcel, i);
            }
        }
        List<PodcastExtendedPodcastDto> list59 = this.extendedPodcasts;
        if (list59 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f59 = dn.f(parcel, list59, 1);
            while (f59.hasNext()) {
                ((PodcastExtendedPodcastDto) f59.next()).writeToParcel(parcel, i);
            }
        }
        List<AudioAudioContentCardDto> list60 = this.audioContentCards;
        if (list60 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f60 = dn.f(parcel, list60, 1);
            while (f60.hasNext()) {
                ((AudioAudioContentCardDto) f60.next()).writeToParcel(parcel, i);
            }
        }
        List<AudioBooksAudioBookDto> list61 = this.audioBooks;
        if (list61 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f61 = dn.f(parcel, list61, 1);
            while (f61.hasNext()) {
                ((AudioBooksAudioBookDto) f61.next()).writeToParcel(parcel, i);
            }
        }
        List<AudioBooksItemPersonDto> list62 = this.audioBooksPersons;
        if (list62 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f62 = dn.f(parcel, list62, 1);
            while (f62.hasNext()) {
                ((AudioBooksItemPersonDto) f62.next()).writeToParcel(parcel, i);
            }
        }
        List<PodcastEpisodeWithLikedFriendsDto> list63 = this.friendsLikedEpisodes;
        if (list63 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f63 = dn.f(parcel, list63, 1);
            while (f63.hasNext()) {
                ((PodcastEpisodeWithLikedFriendsDto) f63.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogHintDto> list64 = this.hints;
        if (list64 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f64 = dn.f(parcel, list64, 1);
            while (f64.hasNext()) {
                ((CatalogHintDto) f64.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogUxPollDto> list65 = this.uxPolls;
        if (list65 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f65 = dn.f(parcel, list65, 1);
            while (f65.hasNext()) {
                ((CatalogUxPollDto) f65.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogFriendsLikesItemDto> list66 = this.groupsFriendsLikes;
        if (list66 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f66 = dn.f(parcel, list66, 1);
            while (f66.hasNext()) {
                ((CatalogFriendsLikesItemDto) f66.next()).writeToParcel(parcel, i);
            }
        }
        List<AppsAppDto> list67 = this.miniApps;
        if (list67 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f67 = dn.f(parcel, list67, 1);
            while (f67.hasNext()) {
                parcel.writeParcelable((Parcelable) f67.next(), i);
            }
        }
        List<AppsAppDto> list68 = this.games;
        if (list68 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f68 = dn.f(parcel, list68, 1);
            while (f68.hasNext()) {
                parcel.writeParcelable((Parcelable) f68.next(), i);
            }
        }
        List<SearchSuggestionItemDto> list69 = this.searchSuggestions;
        if (list69 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f69 = dn.f(parcel, list69, 1);
            while (f69.hasNext()) {
                ((SearchSuggestionItemDto) f69.next()).writeToParcel(parcel, i);
            }
        }
        List<VideoPlaylistMetaInfoItemDto> list70 = this.videoPlaylistsMetaInfo;
        if (list70 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f70 = dn.f(parcel, list70, 1);
            while (f70.hasNext()) {
                ((VideoPlaylistMetaInfoItemDto) f70.next()).writeToParcel(parcel, i);
            }
        }
        List<SearchFilterItemDto> list71 = this.searchFilters;
        if (list71 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f71 = dn.f(parcel, list71, 1);
            while (f71.hasNext()) {
                ((SearchFilterItemDto) f71.next()).writeToParcel(parcel, i);
            }
        }
        List<SearchSeoPageDto> list72 = this.searchSeoPages;
        if (list72 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f72 = dn.f(parcel, list72, 1);
            while (f72.hasNext()) {
                ((SearchSeoPageDto) f72.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogNewsfeedItemWithIdDto> list73 = this.newsfeedItems;
        if (list73 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f73 = dn.f(parcel, list73, 1);
            while (f73.hasNext()) {
                ((CatalogNewsfeedItemWithIdDto) f73.next()).writeToParcel(parcel, i);
            }
        }
        List<GroupsCollectionItemDto> list74 = this.groupCollectionItems;
        if (list74 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f74 = dn.f(parcel, list74, 1);
            while (f74.hasNext()) {
                ((GroupsCollectionItemDto) f74.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogGroupCategoryItemDto> list75 = this.groupCategoryItems;
        if (list75 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f75 = dn.f(parcel, list75, 1);
            while (f75.hasNext()) {
                ((CatalogGroupCategoryItemDto) f75.next()).writeToParcel(parcel, i);
            }
        }
        List<LikesReactionSetDto> list76 = this.reactionSets;
        if (list76 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f76 = dn.f(parcel, list76, 1);
            while (f76.hasNext()) {
                ((LikesReactionSetDto) f76.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketSearchSpellCheckResultDto> list77 = this.marketSearchSpellCheckResult;
        if (list77 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f77 = dn.f(parcel, list77, 1);
            while (f77.hasNext()) {
                ((MarketSearchSpellCheckResultDto) f77.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketSearchQueryClassifierSuggestionDto> list78 = this.marketSearchClassifierResults;
        if (list78 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f78 = dn.f(parcel, list78, 1);
            while (f78.hasNext()) {
                ((MarketSearchQueryClassifierSuggestionDto) f78.next()).writeToParcel(parcel, i);
            }
        }
        List<SearchSpellcheckerDto> list79 = this.searchSpellcheckers;
        if (list79 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f79 = dn.f(parcel, list79, 1);
            while (f79.hasNext()) {
                ((SearchSpellcheckerDto) f79.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketSubcategoriesMenuItemDto> list80 = this.marketSubcategoriesMenu;
        if (list80 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f80 = dn.f(parcel, list80, 1);
            while (f80.hasNext()) {
                ((MarketSubcategoriesMenuItemDto) f80.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketIntegrationsInfoBlockCatalogDto> list81 = this.marketInfos;
        if (list81 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f81 = dn.f(parcel, list81, 1);
            while (f81.hasNext()) {
                ((MarketIntegrationsInfoBlockCatalogDto) f81.next()).writeToParcel(parcel, i);
            }
        }
        List<SearchEntityItemDto> list82 = this.searchEntityItems;
        if (list82 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f82 = dn.f(parcel, list82, 1);
            while (f82.hasNext()) {
                parcel.writeParcelable((Parcelable) f82.next(), i);
            }
        }
        List<FeedbacksFeedbackDto> list83 = this.feedbacks;
        if (list83 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f83 = dn.f(parcel, list83, 1);
            while (f83.hasNext()) {
                ((FeedbacksFeedbackDto) f83.next()).writeToParcel(parcel, i);
            }
        }
        List<VideoVkliveChannelDto> list84 = this.vkliveChannels;
        if (list84 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f84 = dn.f(parcel, list84, 1);
            while (f84.hasNext()) {
                ((VideoVkliveChannelDto) f84.next()).writeToParcel(parcel, i);
            }
        }
        List<VideoVkliveCategoryDto> list85 = this.vkliveCategories;
        if (list85 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f85 = dn.f(parcel, list85, 1);
            while (f85.hasNext()) {
                ((VideoVkliveCategoryDto) f85.next()).writeToParcel(parcel, i);
            }
        }
        List<TopshelfTopshelfItemDto> list86 = this.topshelfItems;
        if (list86 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f86 = dn.f(parcel, list86, 1);
            while (f86.hasNext()) {
                ((TopshelfTopshelfItemDto) f86.next()).writeToParcel(parcel, i);
            }
        }
        List<VideoMetaInfoItemDto> list87 = this.videoShowcaseMetaInfo;
        if (list87 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f87 = dn.f(parcel, list87, 1);
            while (f87.hasNext()) {
                ((VideoMetaInfoItemDto) f87.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogVideoMovieDto> list88 = this.movies;
        if (list88 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f88 = dn.f(parcel, list88, 1);
            while (f88.hasNext()) {
                ((CatalogVideoMovieDto) f88.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogVideoMovieHeroDto> list89 = this.movieHeroes;
        if (list89 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f89 = dn.f(parcel, list89, 1);
            while (f89.hasNext()) {
                ((CatalogVideoMovieHeroDto) f89.next()).writeToParcel(parcel, i);
            }
        }
        List<VideoKinoMailGenreDto> list90 = this.movieGenres;
        if (list90 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f90 = dn.f(parcel, list90, 1);
            while (f90.hasNext()) {
                ((VideoKinoMailGenreDto) f90.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogAiAssistantDto> list91 = this.aiAssistants;
        if (list91 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f91 = dn.f(parcel, list91, 1);
            while (f91.hasNext()) {
                ((CatalogAiAssistantDto) f91.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogBannerVideoDto> list92 = this.videoBanners;
        if (list92 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f92 = dn.f(parcel, list92, 1);
        while (f92.hasNext()) {
            ((CatalogBannerVideoDto) f92.next()).writeToParcel(parcel, i);
        }
    }

    public final List<MarketMarketItemDto> x1() {
        return this.marketItems;
    }

    public final List<PodcastEpisodeWithLikedFriendsDto> y0() {
        return this.friendsLikedEpisodes;
    }

    public final List<MarketOrderDto> y1() {
        return this.marketOrders;
    }

    public final List<SearchFilterItemDto> y2() {
        return this.searchFilters;
    }

    public final List<MarketSearchQueryClassifierSuggestionDto> z1() {
        return this.marketSearchClassifierResults;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogCatalogResponseObjectDto(CatalogCatalogDto catalogCatalogDto, List<AudioStreamMixCatalogItemDto> list, List<VideoMusicStreamMixCatalogItemDto> list2, List<UsersUserFullDto> list3, List<GroupsGroupFullDto> list4, GroupsGroupFullDto groupsGroupFullDto, List<ChannelsChannelDto> list5, List<BadgesBadgeDto> list6, List<? extends WallWallItemDto> list7, List<AudioSearchSuggestionDto> list8, List<VideoVideoFullDto> list9, List<CatalogVideoShowcaseGalleryDto> list10, List<VideoTvChannelDto> list11, List<CatalogCatalogVideoDto> list12, List<VideoVideoFullDto> list13, List<CatalogCatalogLinkDto> list14, List<BaseLinkDto> list15, List<MusicOwnerDto> list16, List<ArticlesArticleDto> list17, List<VideoVideoAlbumFullDto> list18, List<AudioAudioDto> list19, List<ShortVideoAudioDto> list20, List<AudioRecommendedPlaylistDto> list21, List<AudioRadioStationDto> list22, List<MediaPopupDto> list23, List<AudioPhotoDto> list24, List<AudioPlaylistDto> list25, Map<Integer, StoreStockItemDto> map, List<StickersPackPreviewDto> list26, List<StickersCatalogBannerDto> list27, List<StickersCatalogInfoDto> list28, List<CatalogUserItemDto> list29, List<StickersCatalogNotificationDto> list30, List<AudioArtistDto> list31, List<AudioFollowingsUpdateInfoDto> list32, List<AudioFollowingsUpdateItemDto> list33, List<AudioSignalCommonInfoDto> list34, List<AudioCuratorDto> list35, List<GroupsChatDto> list36, List<VideoVideoFullDto> list37, List<CatalogBannerDto> list38, List<CatalogAdBlockDto> list39, List<ClassifiedsYoulaCityDto> list40, List<MarketClassifiedInfoDto> list41, List<MarketMarketCategoryTreeDto> list42, List<MarketMarketCategoryMappingDto> list43, List<MarketMarketSearchQueryDto> list44, List<MarketMarketItemDto> list45, List<MarketGroupCatalogItemDto> list46, List<MarketNavigationTabDto> list47, List<MarketOrderDto> list48, List<MarketUserReviewsItemsReviewDto> list49, List<MarketItemForReviewDto> list50, List<MarketCommunityReviewDto> list51, List<MarketAbandonedCartDto> list52, List<CatalogTextDto> list53, List<ArticlesArticleDto> list54, List<AudioAudioDto> list55, List<PodcastSliderItemDto> list56, List<PodcastPodcastDto> list57, List<CatalogConcertItemDto> list58, List<PodcastExtendedPodcastDto> list59, List<AudioAudioContentCardDto> list60, List<AudioBooksAudioBookDto> list61, List<AudioBooksItemPersonDto> list62, List<PodcastEpisodeWithLikedFriendsDto> list63, List<CatalogHintDto> list64, List<CatalogUxPollDto> list65, List<CatalogFriendsLikesItemDto> list66, List<AppsAppDto> list67, List<AppsAppDto> list68, List<SearchSuggestionItemDto> list69, List<VideoPlaylistMetaInfoItemDto> list70, List<SearchFilterItemDto> list71, List<SearchSeoPageDto> list72, List<CatalogNewsfeedItemWithIdDto> list73, List<GroupsCollectionItemDto> list74, List<CatalogGroupCategoryItemDto> list75, List<LikesReactionSetDto> list76, List<MarketSearchSpellCheckResultDto> list77, List<MarketSearchQueryClassifierSuggestionDto> list78, List<SearchSpellcheckerDto> list79, List<MarketSubcategoriesMenuItemDto> list80, List<MarketIntegrationsInfoBlockCatalogDto> list81, List<? extends SearchEntityItemDto> list82, List<FeedbacksFeedbackDto> list83, List<VideoVkliveChannelDto> list84, List<VideoVkliveCategoryDto> list85, List<TopshelfTopshelfItemDto> list86, List<VideoMetaInfoItemDto> list87, List<CatalogVideoMovieDto> list88, List<CatalogVideoMovieHeroDto> list89, List<VideoKinoMailGenreDto> list90, List<CatalogAiAssistantDto> list91, List<CatalogBannerVideoDto> list92) {
        this.catalog = catalogCatalogDto;
        this.audioStreamMixes = list;
        this.videoMusicStreamMixes = list2;
        this.profiles = list3;
        this.groups = list4;
        this.videoChannelGroup = groupsGroupFullDto;
        this.channels = list5;
        this.badges = list6;
        this.wallItems = list7;
        this.suggestions = list8;
        this.videos = list9;
        this.videoShowcaseGalleries = list10;
        this.tvChannels = list11;
        this.catalogVideos = list12;
        this.artistVideos = list13;
        this.links = list14;
        this.baseLinks = list15;
        this.musicOwners = list16;
        this.articles = list17;
        this.albums = list18;
        this.audios = list19;
        this.shortVideoAudios = list20;
        this.recommendedPlaylists = list21;
        this.radioStations = list22;
        this.placeholders = list23;
        this.thumbs = list24;
        this.playlists = list25;
        this.stickersPacks = map;
        this.stickersPackPreviews = list26;
        this.stickersBanners = list27;
        this.stickersInfo = list28;
        this.catalogUsers = list29;
        this.stickersNotifications = list30;
        this.artists = list31;
        this.audioFollowingsUpdateInfo = list32;
        this.audioFollowingsUpdateItem = list33;
        this.audioSignalCommonInfo = list34;
        this.curators = list35;
        this.groupsChats = list36;
        this.shoppingVideos = list37;
        this.catalogBanners = list38;
        this.catalogAdBlocks = list39;
        this.classifiedsCities = list40;
        this.classifiedsInfos = list41;
        this.classifiedsCategoryTree = list42;
        this.marketCategoryMappings = list43;
        this.query = list44;
        this.marketItems = list45;
        this.groupCatalogItems = list46;
        this.navigationTabs = list47;
        this.marketOrders = list48;
        this.marketItemReviews = list49;
        this.marketItemReviewPrepared = list50;
        this.marketCommunityReviews = list51;
        this.abandonedCarts = list52;
        this.texts = list53;
        this.longreads = list54;
        this.podcastEpisodes = list55;
        this.podcastSliderItems = list56;
        this.podcasts = list57;
        this.concerts = list58;
        this.extendedPodcasts = list59;
        this.audioContentCards = list60;
        this.audioBooks = list61;
        this.audioBooksPersons = list62;
        this.friendsLikedEpisodes = list63;
        this.hints = list64;
        this.uxPolls = list65;
        this.groupsFriendsLikes = list66;
        this.miniApps = list67;
        this.games = list68;
        this.searchSuggestions = list69;
        this.videoPlaylistsMetaInfo = list70;
        this.searchFilters = list71;
        this.searchSeoPages = list72;
        this.newsfeedItems = list73;
        this.groupCollectionItems = list74;
        this.groupCategoryItems = list75;
        this.reactionSets = list76;
        this.marketSearchSpellCheckResult = list77;
        this.marketSearchClassifierResults = list78;
        this.searchSpellcheckers = list79;
        this.marketSubcategoriesMenu = list80;
        this.marketInfos = list81;
        this.searchEntityItems = list82;
        this.feedbacks = list83;
        this.vkliveChannels = list84;
        this.vkliveCategories = list85;
        this.topshelfItems = list86;
        this.videoShowcaseMetaInfo = list87;
        this.movies = list88;
        this.movieHeroes = list89;
        this.movieGenres = list90;
        this.aiAssistants = list91;
        this.videoBanners = list92;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CatalogCatalogResponseObjectDto(CatalogCatalogDto catalogCatalogDto, List list, List list2, List list3, List list4, GroupsGroupFullDto groupsGroupFullDto, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, List list23, List list24, List list25, Map map, List list26, List list27, List list28, List list29, List list30, List list31, List list32, List list33, List list34, List list35, List list36, List list37, List list38, List list39, List list40, List list41, List list42, List list43, List list44, List list45, List list46, List list47, List list48, List list49, List list50, List list51, List list52, List list53, List list54, List list55, List list56, List list57, List list58, List list59, List list60, List list61, List list62, List list63, List list64, List list65, List list66, List list67, List list68, List list69, List list70, List list71, List list72, List list73, List list74, List list75, List list76, List list77, List list78, List list79, List list80, List list81, List list82, List list83, List list84, List list85, List list86, List list87, List list88, List list89, List list90, List list91, List list92, int i, int i2, int i3, zcl zclVar) {
        this(r79, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r4, r80, r3, r17, r19, r21, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r0, (i2 & 1) != 0 ? null : list30, (i2 & 2) != 0 ? null : list31, (i2 & 4) != 0 ? null : list32, (i2 & 8) != 0 ? null : list33, (i2 & 16) != 0 ? null : list34, (i2 & 32) != 0 ? null : list35, (i2 & 64) != 0 ? null : list36, (i2 & 128) != 0 ? null : list37, (i2 & 256) != 0 ? null : list38, (i2 & 512) != 0 ? null : list39, (i2 & 1024) != 0 ? null : list40, (i2 & 2048) != 0 ? null : list41, (i2 & 4096) != 0 ? null : list42, (i2 & 8192) != 0 ? null : list43, (i2 & 16384) != 0 ? null : list44, (i2 & 32768) != 0 ? null : list45, (i2 & 65536) != 0 ? null : list46, (i2 & 131072) != 0 ? null : list47, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list48, (i2 & 524288) != 0 ? null : list49, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list50, (i2 & 2097152) != 0 ? null : list51, (i2 & 4194304) != 0 ? null : list52, (i2 & 8388608) != 0 ? null : list53, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : list54, (i2 & 33554432) != 0 ? null : list55, (i2 & 67108864) != 0 ? null : list56, (i2 & 134217728) != 0 ? null : list57, (i2 & 268435456) != 0 ? null : list58, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : list59, (i2 & 1073741824) != 0 ? null : list60, (i2 & Integer.MIN_VALUE) != 0 ? null : list61, (i3 & 1) != 0 ? null : list62, (i3 & 2) != 0 ? null : list63, (i3 & 4) != 0 ? null : list64, (i3 & 8) != 0 ? null : list65, (i3 & 16) != 0 ? null : list66, (i3 & 32) != 0 ? null : list67, (i3 & 64) != 0 ? null : list68, (i3 & 128) != 0 ? null : list69, (i3 & 256) != 0 ? null : list70, (i3 & 512) != 0 ? null : list71, (i3 & 1024) != 0 ? null : list72, (i3 & 2048) != 0 ? null : list73, (i3 & 4096) != 0 ? null : list74, (i3 & 8192) != 0 ? null : list75, (i3 & 16384) != 0 ? null : list76, (i3 & 32768) != 0 ? null : list77, (i3 & 65536) != 0 ? null : list78, (i3 & 131072) != 0 ? null : list79, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list80, (i3 & 524288) != 0 ? null : list81, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list82, (i3 & 2097152) != 0 ? null : list83, (i3 & 4194304) != 0 ? null : list84, (i3 & 8388608) != 0 ? null : list85, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : list86, (i3 & 33554432) != 0 ? null : list87, (i3 & 67108864) != 0 ? null : list88, (i3 & 134217728) != 0 ? null : list89, (i3 & 268435456) != 0 ? null : list90, (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : list91, (i3 & 1073741824) != 0 ? null : list92);
        CatalogCatalogDto catalogCatalogDto2 = (i & 1) != 0 ? null : catalogCatalogDto;
        List list93 = (i & 2) != 0 ? null : list;
        List list94 = (i & 4) != 0 ? null : list2;
        List list95 = (i & 8) != 0 ? null : list3;
        List list96 = (i & 16) != 0 ? null : list4;
        GroupsGroupFullDto groupsGroupFullDto2 = (i & 32) != 0 ? null : groupsGroupFullDto;
        List list97 = (i & 64) != 0 ? null : list5;
        List list98 = (i & 128) != 0 ? null : list6;
        List list99 = (i & 256) != 0 ? null : list7;
        List list100 = (i & 512) != 0 ? null : list8;
        List list101 = (i & 1024) != 0 ? null : list9;
        List list102 = (i & 2048) != 0 ? null : list10;
        List list103 = (i & 4096) != 0 ? null : list11;
        CatalogCatalogDto catalogCatalogDto3 = catalogCatalogDto2;
        List list104 = (i & 8192) != 0 ? null : list12;
        List list105 = (i & 16384) != 0 ? null : list13;
        List list106 = (i & 32768) != 0 ? null : list14;
        List list107 = (i & 65536) != 0 ? null : list15;
        List list108 = (i & 131072) != 0 ? null : list16;
        List list109 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list17;
        List list110 = (i & 524288) != 0 ? null : list18;
        List list111 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list19;
        List list112 = (i & 2097152) != 0 ? null : list20;
        List list113 = (i & 4194304) != 0 ? null : list21;
        List list114 = (i & 8388608) != 0 ? null : list22;
        List list115 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : list23;
        List list116 = (i & 33554432) != 0 ? null : list24;
        List list117 = (i & 67108864) != 0 ? null : list25;
        Map map2 = (i & 134217728) != 0 ? null : map;
        List list118 = (i & 268435456) != 0 ? null : list26;
        List list119 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : list27;
        List list120 = (i & 1073741824) != 0 ? null : list28;
        List list121 = (i & Integer.MIN_VALUE) != 0 ? null : list29;
    }
}
