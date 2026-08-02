package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.coremedia.iso.boxes.MetaBox;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BuildConfig;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.k73;
import xsna.ms9;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CatalogBlockDto.kt */
/* loaded from: classes14.dex */
public final class CatalogBlockDto implements Parcelable {
    public static final Parcelable.Creator<CatalogBlockDto> CREATOR = new a();

    @pmi0("abandoned_cart_ids")
    private final List<UserId> abandonedCartIds;

    @pmi0("action_button_color")
    private final ActionButtonColorDto actionButtonColor;

    @pmi0("actions")
    private final List<CatalogButtonDto> actions;

    @pmi0("ai_assistant_ids")
    private final List<Long> aiAssistantIds;

    @pmi0("albums_ids")
    private final List<String> albumsIds;

    @pmi0("anchor_info")
    private final List<CatalogBlockAnchorInfoDto> anchorInfo;

    @pmi0("artist_id")
    private final String artistId;

    @pmi0("artist_info")
    private final List<CatalogArtistInfoItemDto> artistInfo;

    @pmi0("artist_videos_ids")
    private final List<String> artistVideosIds;

    @pmi0("artists_ids")
    private final List<String> artistsIds;

    @pmi0("audio_book_ids")
    private final List<Integer> audioBookIds;

    @pmi0("audio_books_person_ids")
    private final List<Integer> audioBooksPersonIds;

    @pmi0("audio_content_card_ids")
    private final List<String> audioContentCardIds;

    @pmi0("audio_followings_update_info_ids")
    private final List<String> audioFollowingsUpdateInfoIds;

    @pmi0("audio_followings_update_item_ids")
    private final List<String> audioFollowingsUpdateItemIds;

    @pmi0("audio_signal_common_info_id")
    private final List<String> audioSignalCommonInfoId;

    @pmi0("audio_stream_mixes_ids")
    private final List<String> audioStreamMixesIds;

    @pmi0("audios_ids")
    private final List<String> audiosIds;

    @pmi0("auto_added_to_channel_playlist_id")
    private final String autoAddedToChannelPlaylistId;

    @pmi0("badge")
    private final CatalogBadgeDto badge;

    @pmi0("base_links_ids")
    private final List<String> baseLinksIds;

    @pmi0("cache_groups")
    private final List<CatalogCacheGroupDto> cacheGroups;

    @pmi0("catalog_ad_block_ids")
    private final List<String> catalogAdBlockIds;

    @pmi0("catalog_banner_ids")
    private final List<Integer> catalogBannerIds;

    @pmi0("catalog_recom_playlist_relations")
    private final List<CatalogRecomPlaylistRelationDto> catalogRecomPlaylistRelations;

    @pmi0("catalog_users_ids")
    private final List<String> catalogUsersIds;

    @pmi0("channel_items")
    private final List<CatalogChannelsItemDto> channelItems;

    @pmi0("city_ids")
    private final List<Integer> cityIds;

    @pmi0("classifieds_city_ids")
    private final List<String> classifiedsCityIds;

    @pmi0("community_review_ids")
    private final List<Integer> communityReviewIds;

    @pmi0("composite_ids")
    private final List<CatalogCompositeIdDto> compositeIds;

    @pmi0("concerts_ids")
    private final List<String> concertsIds;

    @pmi0("coords")
    private final CatalogCoordsDto coords;

    @pmi0("counter_color")
    private final CounterColorDto counterColor;

    @pmi0("curators_ids")
    private final List<Integer> curatorsIds;

    @pmi0("data_type")
    private final CatalogBlockDataTypeDto dataType;

    @pmi0("discover_data")
    private final CatalogDiscoverDataDto discoverData;

    @pmi0("entity_group_items")
    private final List<CatalogEntityGroupsItemDto> entityGroupItems;

    @pmi0("extended_podcast_items_ids")
    private final List<String> extendedPodcastItemsIds;

    @pmi0("feedbacks_ids")
    private final List<String> feedbacksIds;

    @pmi0("friends_liked_episodes_ids")
    private final List<String> friendsLikedEpisodesIds;

    @pmi0("games_items")
    private final List<CatalogGameItemDto> gamesItems;

    @pmi0("group_catalog_item_ids")
    private final List<String> groupCatalogItemIds;

    @pmi0("group_category_items")
    private final List<CatalogGroupCategoryMetaItemDto> groupCategoryItems;

    @pmi0("group_chats_ids")
    private final List<List<Object>> groupChatsIds;

    @pmi0("group_collection_items_ids")
    private final List<String> groupCollectionItemsIds;

    @pmi0("group_ids")
    private final List<UserId> groupIds;

    @pmi0("group_invites")
    private final List<Integer> groupInvites;

    @pmi0("group_items")
    private final List<CatalogGroupsItemDto> groupItems;

    @pmi0("groups_likes_ids")
    private final List<Integer> groupsLikesIds;

    @pmi0("hint_id")
    private final String hintId;

    @pmi0("id")
    private final String id;

    @pmi0("is_auto_added_to_channel")
    private final Boolean isAutoAddedToChannel;

    @pmi0("item_badges")
    private final List<CatalogItemBadgeDto> itemBadges;

    @pmi0("item_review_ids")
    private final List<CatalogItemReviewIdDto> itemReviewIds;

    @pmi0("items_count")
    private final Integer itemsCount;

    @pmi0(TtmlNode.TAG_LAYOUT)
    private final CatalogLayoutDto layout;

    @pmi0("links_ids")
    private final List<String> linksIds;

    @pmi0("listen_events")
    private final List<String> listenEvents;

    @pmi0("longreads_ids")
    private final List<String> longreadsIds;

    @pmi0("market_info_ids")
    private final List<Integer> marketInfoIds;

    @pmi0("market_item_ids")
    private final List<String> marketItemIds;

    @pmi0("market_item_review_prepared_ids")
    private final List<CatalogItemReviewPreparedIdDto> marketItemReviewPreparedIds;

    @pmi0("market_order_ids")
    private final List<String> marketOrderIds;

    @pmi0(MetaBox.TYPE)
    private final CatalogBlockMetaDto meta;

    @pmi0("mini_app_ids")
    private final List<String> miniAppIds;

    @pmi0("miniapps_content_items")
    private final List<CatalogMiniAppContentItemDto> miniappsContentItems;

    @pmi0("movie_genre_ids")
    private final List<Integer> movieGenreIds;

    @pmi0("movie_hero_ids")
    private final List<Integer> movieHeroIds;

    @pmi0("movies_ids")
    private final List<Integer> moviesIds;

    @pmi0("music_owners_ids")
    private final List<String> musicOwnersIds;

    @pmi0("navigation_tab_ids")
    private final List<String> navigationTabIds;

    @pmi0("newsfeed_item_ids")
    private final List<String> newsfeedItemIds;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("owner_ids")
    private final List<String> ownerIds;

    @pmi0("pinned_videos")
    private final List<CatalogPinnedVideosItemDto> pinnedVideos;

    @pmi0("placeholder_ids")
    private final List<String> placeholderIds;

    @pmi0("playlists_ids")
    private final List<String> playlistsIds;

    @pmi0("playlists_placeholders")
    private final List<CatalogPlaylistsPlaceholderDto> playlistsPlaceholders;

    @pmi0("podcast_episodes_ids")
    private final List<String> podcastEpisodesIds;

    @pmi0("podcast_items_ids")
    private final List<String> podcastItemsIds;

    @pmi0("podcast_slider_items_ids")
    private final List<String> podcastSliderItemsIds;

    @pmi0("radio_stations_ids")
    private final List<Integer> radioStationsIds;

    @pmi0("search_author_items")
    private final List<CatalogSearchAuthorItemDto> searchAuthorItems;

    @pmi0("search_entity_ids")
    private final List<Integer> searchEntityIds;

    @pmi0("search_filters_ids")
    private final List<String> searchFiltersIds;

    @pmi0("search_recents")
    private final List<CatalogSearchRecentDto> searchRecents;

    @pmi0("search_seo_pages_ids")
    private final List<String> searchSeoPagesIds;

    @pmi0("search_spellcheckers_ids")
    private final List<String> searchSpellcheckersIds;

    @pmi0("search_suggestions_ids")
    private final List<String> searchSuggestionsIds;

    @pmi0("short_video_audios_ids")
    private final List<String> shortVideoAudiosIds;

    @pmi0("stat_infos")
    private final List<CatalogStatInfoItemDto> statInfos;

    @pmi0("sticker_ids")
    private final List<Integer> stickerIds;

    @pmi0("stickers_banners_ids")
    private final List<Integer> stickersBannersIds;

    @pmi0("stickers_info_id")
    private final Integer stickersInfoId;

    @pmi0("stickers_notifications_id")
    private final List<Integer> stickersNotificationsId;

    @pmi0("stickers_pack_ids")
    private final List<Integer> stickersPackIds;

    @pmi0("stub_description")
    private final String stubDescription;

    @pmi0("stub_icon")
    private final String stubIcon;

    @pmi0("subsection_id")
    private final String subsectionId;

    @pmi0("subtype")
    private final SubtypeDto subtype;

    @pmi0("suggestions_ids")
    private final List<String> suggestionsIds;

    @pmi0("text_ids")
    private final List<String> textIds;

    @pmi0("thumbs_ids")
    private final List<String> thumbsIds;

    @pmi0("title")
    private final String title;

    @pmi0("topshelf_items_ids")
    private final List<Integer> topshelfItemsIds;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("tv_channels_ids")
    private final List<String> tvChannelsIds;

    @pmi0("url")
    private final String url;

    @pmi0("video_banner_ids")
    private final List<Integer> videoBannerIds;

    @pmi0("video_infos")
    private final List<CatalogVideoInfoItemDto> videoInfos;

    @pmi0("video_music_stream_mixes_ids")
    private final List<String> videoMusicStreamMixesIds;

    @pmi0("video_showcase_galleries_ids")
    private final List<String> videoShowcaseGalleriesIds;

    @pmi0("video_showcase_menu_items")
    private final List<CatalogVideoShowcaseMenuItemDto> videoShowcaseMenuItems;

    @pmi0("videos_ids")
    private final List<String> videosIds;

    @pmi0("vklive_categories_ids")
    private final List<String> vkliveCategoriesIds;

    @pmi0("vklive_channels_ids")
    private final List<String> vkliveChannelsIds;

    @pmi0("wall_items_ids")
    private final List<String> wallItemsIds;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogBlockDto.kt */
    public static final class ActionButtonColorDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActionButtonColorDto[] $VALUES;

        @pmi0("blue")
        public static final ActionButtonColorDto BLUE;
        public static final Parcelable.Creator<ActionButtonColorDto> CREATOR;

        @pmi0("gray")
        public static final ActionButtonColorDto GRAY;
        private final String value;

        /* compiled from: CatalogBlockDto.kt */
        public static final class a implements Parcelable.Creator<ActionButtonColorDto> {
            @Override // android.os.Parcelable.Creator
            public final ActionButtonColorDto createFromParcel(Parcel parcel) {
                return ActionButtonColorDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ActionButtonColorDto[] newArray(int i) {
                return new ActionButtonColorDto[i];
            }
        }

        static {
            ActionButtonColorDto actionButtonColorDto = new ActionButtonColorDto("GRAY", 0, "gray");
            GRAY = actionButtonColorDto;
            ActionButtonColorDto actionButtonColorDto2 = new ActionButtonColorDto("BLUE", 1, "blue");
            BLUE = actionButtonColorDto2;
            ActionButtonColorDto[] actionButtonColorDtoArr = {actionButtonColorDto, actionButtonColorDto2};
            $VALUES = actionButtonColorDtoArr;
            $ENTRIES = new asp(actionButtonColorDtoArr);
            CREATOR = new a();
        }

        private ActionButtonColorDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ActionButtonColorDto valueOf(String str) {
            return (ActionButtonColorDto) Enum.valueOf(ActionButtonColorDto.class, str);
        }

        public static ActionButtonColorDto[] values() {
            return (ActionButtonColorDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogBlockDto.kt */
    public static final class CounterColorDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CounterColorDto[] $VALUES;

        @pmi0("blue")
        public static final CounterColorDto BLUE;
        public static final Parcelable.Creator<CounterColorDto> CREATOR;

        @pmi0("gray")
        public static final CounterColorDto GRAY;
        private final String value;

        /* compiled from: CatalogBlockDto.kt */
        public static final class a implements Parcelable.Creator<CounterColorDto> {
            @Override // android.os.Parcelable.Creator
            public final CounterColorDto createFromParcel(Parcel parcel) {
                return CounterColorDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CounterColorDto[] newArray(int i) {
                return new CounterColorDto[i];
            }
        }

        static {
            CounterColorDto counterColorDto = new CounterColorDto("GRAY", 0, "gray");
            GRAY = counterColorDto;
            CounterColorDto counterColorDto2 = new CounterColorDto("BLUE", 1, "blue");
            BLUE = counterColorDto2;
            CounterColorDto[] counterColorDtoArr = {counterColorDto, counterColorDto2};
            $VALUES = counterColorDtoArr;
            $ENTRIES = new asp(counterColorDtoArr);
            CREATOR = new a();
        }

        private CounterColorDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static CounterColorDto valueOf(String str) {
            return (CounterColorDto) Enum.valueOf(CounterColorDto.class, str);
        }

        public static CounterColorDto[] values() {
            return (CounterColorDto[]) $VALUES.clone();
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
    /* compiled from: CatalogBlockDto.kt */
    public static final class SubtypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SubtypeDto[] $VALUES;
        public static final Parcelable.Creator<SubtypeDto> CREATOR;

        @pmi0(BuildConfig.FLAVOR)
        public static final SubtypeDto DEFAULT;

        @pmi0("donut")
        public static final SubtypeDto DONUT;
        private final String value;

        /* compiled from: CatalogBlockDto.kt */
        public static final class a implements Parcelable.Creator<SubtypeDto> {
            @Override // android.os.Parcelable.Creator
            public final SubtypeDto createFromParcel(Parcel parcel) {
                return SubtypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SubtypeDto[] newArray(int i) {
                return new SubtypeDto[i];
            }
        }

        static {
            SubtypeDto subtypeDto = new SubtypeDto("DEFAULT", 0, BuildConfig.FLAVOR);
            DEFAULT = subtypeDto;
            SubtypeDto subtypeDto2 = new SubtypeDto("DONUT", 1, "donut");
            DONUT = subtypeDto2;
            SubtypeDto[] subtypeDtoArr = {subtypeDto, subtypeDto2};
            $VALUES = subtypeDtoArr;
            $ENTRIES = new asp(subtypeDtoArr);
            CREATOR = new a();
        }

        private SubtypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static SubtypeDto valueOf(String str) {
            return (SubtypeDto) Enum.valueOf(SubtypeDto.class, str);
        }

        public static SubtypeDto[] values() {
            return (SubtypeDto[]) $VALUES.clone();
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

    /* compiled from: CatalogBlockDto.kt */
    public static final class a implements Parcelable.Creator<CatalogBlockDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final CatalogBlockDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            String str;
            ArrayList arrayList4;
            CatalogBlockDataTypeDto catalogBlockDataTypeDto;
            CatalogLayoutDto catalogLayoutDto;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList<String> arrayList7;
            ArrayList arrayList8;
            String str2;
            ArrayList arrayList9;
            ArrayList arrayList10;
            CatalogLayoutDto catalogLayoutDto2;
            ArrayList arrayList11;
            ArrayList arrayList12;
            ArrayList<String> arrayList13;
            int i;
            ArrayList arrayList14;
            ArrayList arrayList15;
            ArrayList arrayList16;
            ArrayList arrayList17;
            ArrayList arrayList18;
            ArrayList arrayList19;
            int i2;
            ArrayList arrayList20;
            ArrayList arrayList21;
            CatalogBlockDataTypeDto catalogBlockDataTypeDto2;
            ArrayList arrayList22;
            ArrayList arrayList23;
            ArrayList<String> arrayList24;
            ArrayList arrayList25;
            ArrayList arrayList26;
            ArrayList arrayList27;
            ArrayList arrayList28;
            CatalogBlockDataTypeDto catalogBlockDataTypeDto3;
            ArrayList arrayList29;
            int i3;
            ArrayList arrayList30;
            ArrayList arrayList31;
            ArrayList arrayList32;
            ArrayList arrayList33;
            ArrayList arrayList34;
            String str3;
            ArrayList arrayList35;
            CatalogLayoutDto catalogLayoutDto3;
            ArrayList arrayList36;
            String str4;
            ArrayList arrayList37;
            ArrayList arrayList38;
            ArrayList arrayList39;
            ArrayList arrayList40;
            ArrayList arrayList41;
            CatalogLayoutDto catalogLayoutDto4;
            String str5;
            CatalogBlockDataTypeDto catalogBlockDataTypeDto4;
            ArrayList arrayList42;
            CatalogLayoutDto catalogLayoutDto5;
            ArrayList arrayList43;
            String str6;
            CatalogBlockDataTypeDto catalogBlockDataTypeDto5;
            ArrayList arrayList44;
            CatalogLayoutDto catalogLayoutDto6;
            ArrayList arrayList45;
            ArrayList arrayList46;
            ArrayList<String> arrayList47;
            String str7;
            CatalogBlockDataTypeDto catalogBlockDataTypeDto6;
            ArrayList arrayList48;
            CatalogLayoutDto catalogLayoutDto7;
            ArrayList arrayList49;
            String str8;
            ArrayList arrayList50;
            CatalogBlockDataTypeDto catalogBlockDataTypeDto7;
            CatalogLayoutDto catalogLayoutDto8;
            ArrayList arrayList51;
            ArrayList arrayList52;
            ArrayList arrayList53;
            ArrayList arrayList54;
            String str9;
            ArrayList arrayList55;
            ActionButtonColorDto actionButtonColorDto;
            Object createFromParcel;
            ArrayList arrayList56;
            Object obj;
            SubtypeDto subtypeDto;
            CounterColorDto counterColorDto;
            ArrayList arrayList57;
            CatalogLayoutDto catalogLayoutDto9;
            ArrayList arrayList58;
            ArrayList arrayList59;
            ArrayList arrayList60;
            ArrayList arrayList61;
            ArrayList arrayList62;
            String str10;
            ArrayList arrayList63;
            ArrayList arrayList64;
            CatalogLayoutDto catalogLayoutDto10;
            ArrayList arrayList65;
            ArrayList arrayList66;
            CatalogDiscoverDataDto catalogDiscoverDataDto;
            ArrayList arrayList67;
            ArrayList arrayList68;
            ArrayList arrayList69;
            ArrayList arrayList70;
            ArrayList arrayList71;
            ArrayList arrayList72;
            ArrayList arrayList73;
            ArrayList arrayList74;
            ArrayList arrayList75;
            Boolean valueOf;
            ArrayList arrayList76;
            Boolean bool;
            ArrayList arrayList77;
            ArrayList arrayList78;
            String readString = parcel.readString();
            CatalogBlockDataTypeDto createFromParcel2 = CatalogBlockDataTypeDto.CREATOR.createFromParcel(parcel);
            CatalogLayoutDto createFromParcel3 = CatalogLayoutDto.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            CatalogBadgeDto createFromParcel4 = parcel.readInt() == 0 ? null : CatalogBadgeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i4 = 0;
                while (i4 != readInt) {
                    i4 = en.a(CatalogItemBadgeDto.CREATOR, parcel, arrayList, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList79 = new ArrayList(readInt2);
                int i5 = 0;
                while (i5 != readInt2) {
                    i5 = en.a(CatalogButtonDto.CREATOR, parcel, arrayList79, i5, 1);
                }
                arrayList2 = arrayList79;
            }
            CatalogBlockMetaDto createFromParcel5 = parcel.readInt() == 0 ? null : CatalogBlockMetaDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList80 = new ArrayList(readInt3);
                int i6 = 0;
                while (i6 != readInt3) {
                    i6 = en.a(CatalogBlockAnchorInfoDto.CREATOR, parcel, arrayList80, i6, 1);
                }
                arrayList3 = arrayList80;
            }
            ArrayList arrayList81 = arrayList;
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                str = readString;
                arrayList4 = new ArrayList(readInt4);
                catalogBlockDataTypeDto = createFromParcel2;
                int i7 = 0;
                while (true) {
                    catalogLayoutDto = createFromParcel3;
                    if (i7 == readInt4) {
                        break;
                    }
                    i7 = en.a(CatalogStatInfoItemDto.CREATOR, parcel, arrayList4, i7, 1);
                    createFromParcel3 = catalogLayoutDto;
                    readString2 = readString2;
                }
            } else {
                str = readString;
                catalogBlockDataTypeDto = createFromParcel2;
                arrayList4 = null;
                catalogLayoutDto = createFromParcel3;
            }
            String str11 = readString2;
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList5 = new ArrayList(readInt5);
                int i8 = 0;
                while (i8 != readInt5) {
                    i8 = en.a(CatalogPinnedVideosItemDto.CREATOR, parcel, arrayList5, i8, 1);
                    arrayList4 = arrayList4;
                }
            }
            ArrayList arrayList82 = arrayList4;
            int i9 = 0;
            ArrayList<String> createStringArrayList5 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList6 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                arrayList6 = new ArrayList(readInt6);
                while (true) {
                    arrayList7 = createStringArrayList6;
                    if (i9 == readInt6) {
                        break;
                    }
                    i9 = en.a(CatalogCompositeIdDto.CREATOR, parcel, arrayList6, i9, 1);
                    createStringArrayList6 = arrayList7;
                    arrayList5 = arrayList5;
                }
            } else {
                arrayList6 = null;
                arrayList7 = createStringArrayList6;
            }
            ArrayList arrayList83 = arrayList5;
            if (parcel.readInt() == 0) {
                arrayList8 = null;
            } else {
                int readInt7 = parcel.readInt();
                arrayList8 = new ArrayList(readInt7);
                int i10 = 0;
                while (i10 != readInt7) {
                    i10 = k73.b(parcel, arrayList8, i10, 1);
                }
            }
            CatalogLayoutDto catalogLayoutDto11 = catalogLayoutDto;
            ArrayList<String> createStringArrayList7 = parcel.createStringArrayList();
            String str12 = str11;
            ArrayList<String> createStringArrayList8 = parcel.createStringArrayList();
            String str13 = str;
            ArrayList arrayList84 = arrayList6;
            ArrayList<String> createStringArrayList9 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList10 = parcel.createStringArrayList();
            ArrayList<String> arrayList85 = arrayList7;
            ArrayList<String> createStringArrayList11 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList12 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList13 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList14 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                str2 = str13;
                arrayList9 = arrayList8;
                catalogLayoutDto2 = catalogLayoutDto11;
                arrayList10 = null;
            } else {
                str2 = str13;
                int readInt8 = parcel.readInt();
                arrayList9 = arrayList8;
                arrayList10 = new ArrayList(readInt8);
                catalogLayoutDto2 = catalogLayoutDto11;
                int i11 = 0;
                while (i11 != readInt8) {
                    i11 = en.a(CatalogSearchRecentDto.CREATOR, parcel, arrayList10, i11, 1);
                    readInt8 = readInt8;
                    str12 = str12;
                }
            }
            String str14 = str12;
            String readString4 = parcel.readString();
            ArrayList<String> arrayList86 = arrayList85;
            ArrayList<String> createStringArrayList15 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                int readInt9 = parcel.readInt();
                arrayList11 = new ArrayList(readInt9);
                arrayList12 = arrayList10;
                int i12 = 0;
                while (true) {
                    arrayList13 = arrayList86;
                    i = 1;
                    if (i12 == readInt9) {
                        break;
                    }
                    i12 = pm0.b(parcel, arrayList11, i12, 1);
                    arrayList86 = arrayList13;
                }
            } else {
                arrayList12 = arrayList10;
                arrayList11 = null;
                arrayList13 = arrayList86;
                i = 1;
            }
            if (parcel.readInt() == 0) {
                arrayList15 = arrayList11;
                arrayList14 = null;
            } else {
                int readInt10 = parcel.readInt();
                arrayList14 = new ArrayList(readInt10);
                arrayList15 = arrayList11;
                int i13 = 0;
                while (i13 != readInt10) {
                    i13 = pm0.b(parcel, arrayList14, i13, i);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList17 = arrayList14;
                arrayList16 = null;
            } else {
                int readInt11 = parcel.readInt();
                arrayList16 = new ArrayList(readInt11);
                arrayList17 = arrayList14;
                int i14 = 0;
                while (i14 != readInt11) {
                    i14 = pm0.b(parcel, arrayList16, i14, i);
                }
            }
            int i15 = 0;
            ArrayList<String> createStringArrayList16 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                int readInt12 = parcel.readInt();
                arrayList18 = new ArrayList(readInt12);
                while (true) {
                    arrayList19 = arrayList16;
                    i2 = 1;
                    if (i15 == readInt12) {
                        break;
                    }
                    i15 = pm0.b(parcel, arrayList18, i15, 1);
                    arrayList16 = arrayList19;
                }
            } else {
                arrayList18 = null;
                arrayList19 = arrayList16;
                i2 = 1;
            }
            if (parcel.readInt() == 0) {
                arrayList21 = arrayList18;
                arrayList20 = null;
            } else {
                int readInt13 = parcel.readInt();
                arrayList20 = new ArrayList(readInt13);
                arrayList21 = arrayList18;
                int i16 = 0;
                while (i16 != readInt13) {
                    i16 = pm0.b(parcel, arrayList20, i16, i2);
                }
            }
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String str15 = str2;
            ArrayList arrayList87 = arrayList15;
            ArrayList<String> createStringArrayList17 = parcel.createStringArrayList();
            ArrayList<String> arrayList88 = arrayList13;
            Integer num = valueOf2;
            CatalogBlockDataTypeDto catalogBlockDataTypeDto8 = catalogBlockDataTypeDto;
            ArrayList arrayList89 = arrayList9;
            ArrayList arrayList90 = arrayList17;
            ArrayList<String> createStringArrayList18 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                catalogBlockDataTypeDto2 = catalogBlockDataTypeDto8;
                arrayList22 = arrayList20;
                arrayList24 = arrayList88;
                arrayList23 = null;
            } else {
                catalogBlockDataTypeDto2 = catalogBlockDataTypeDto8;
                int readInt14 = parcel.readInt();
                arrayList22 = arrayList20;
                arrayList23 = new ArrayList(readInt14);
                arrayList24 = arrayList88;
                int i17 = 0;
                while (i17 != readInt14) {
                    i17 = bo.b(CatalogBlockDto.class, parcel, arrayList23, i17, 1);
                    readInt14 = readInt14;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList26 = arrayList23;
                arrayList25 = null;
            } else {
                int readInt15 = parcel.readInt();
                arrayList25 = new ArrayList(readInt15);
                arrayList26 = arrayList23;
                int i18 = 0;
                while (i18 != readInt15) {
                    i18 = en.a(CatalogGroupsItemDto.CREATOR, parcel, arrayList25, i18, 1);
                    readInt15 = readInt15;
                    readString3 = readString3;
                }
            }
            String str16 = readString3;
            if (parcel.readInt() == 0) {
                arrayList27 = null;
            } else {
                int readInt16 = parcel.readInt();
                arrayList27 = new ArrayList(readInt16);
                int i19 = 0;
                while (i19 != readInt16) {
                    i19 = en.a(CatalogChannelsItemDto.CREATOR, parcel, arrayList27, i19, 1);
                    readInt16 = readInt16;
                    arrayList25 = arrayList25;
                }
            }
            ArrayList arrayList91 = arrayList25;
            CatalogBlockDataTypeDto catalogBlockDataTypeDto9 = catalogBlockDataTypeDto2;
            ArrayList<String> createStringArrayList19 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                int readInt17 = parcel.readInt();
                arrayList28 = new ArrayList(readInt17);
                catalogBlockDataTypeDto3 = catalogBlockDataTypeDto9;
                int i20 = 0;
                while (true) {
                    arrayList29 = arrayList27;
                    i3 = 1;
                    if (i20 == readInt17) {
                        break;
                    }
                    i20 = pm0.b(parcel, arrayList28, i20, 1);
                    arrayList27 = arrayList29;
                }
            } else {
                catalogBlockDataTypeDto3 = catalogBlockDataTypeDto9;
                arrayList28 = null;
                arrayList29 = arrayList27;
                i3 = 1;
            }
            if (parcel.readInt() == 0) {
                arrayList31 = arrayList28;
                arrayList30 = null;
            } else {
                int readInt18 = parcel.readInt();
                arrayList30 = new ArrayList(readInt18);
                arrayList31 = arrayList28;
                int i21 = 0;
                while (i21 != readInt18) {
                    i21 = pm0.b(parcel, arrayList30, i21, i3);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList32 = null;
            } else {
                int readInt19 = parcel.readInt();
                arrayList32 = new ArrayList(readInt19);
                int i22 = 0;
                while (i22 != readInt19) {
                    int i23 = readInt19;
                    int readInt20 = parcel.readInt();
                    ArrayList arrayList92 = arrayList30;
                    ArrayList arrayList93 = new ArrayList(readInt20);
                    int i24 = i22;
                    int i25 = 0;
                    while (i25 != readInt20) {
                        arrayList93.add(parcel.readValue(CatalogBlockDto.class.getClassLoader()));
                        i25++;
                        readInt20 = readInt20;
                    }
                    arrayList32.add(arrayList93);
                    i22 = i24 + 1;
                    readInt19 = i23;
                    arrayList30 = arrayList92;
                }
            }
            ArrayList arrayList94 = arrayList30;
            ArrayList arrayList95 = arrayList26;
            int i26 = 0;
            ArrayList<String> createStringArrayList20 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                int readInt21 = parcel.readInt();
                arrayList33 = new ArrayList(readInt21);
                while (true) {
                    arrayList34 = arrayList32;
                    if (i26 == readInt21) {
                        break;
                    }
                    i26 = pm0.b(parcel, arrayList33, i26, 1);
                    arrayList32 = arrayList34;
                }
            } else {
                arrayList33 = null;
                arrayList34 = arrayList32;
            }
            ArrayList<String> createStringArrayList21 = parcel.createStringArrayList();
            CatalogLayoutDto catalogLayoutDto12 = catalogLayoutDto2;
            ArrayList arrayList96 = arrayList19;
            ArrayList<String> createStringArrayList22 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                str3 = str16;
                catalogLayoutDto3 = catalogLayoutDto12;
                arrayList35 = null;
            } else {
                int readInt22 = parcel.readInt();
                str3 = str16;
                arrayList35 = new ArrayList(readInt22);
                catalogLayoutDto3 = catalogLayoutDto12;
                int i27 = 0;
                while (i27 != readInt22) {
                    i27 = bo.b(CatalogBlockDto.class, parcel, arrayList35, i27, 1);
                    readInt22 = readInt22;
                }
            }
            ArrayList arrayList97 = arrayList31;
            ArrayList<String> createStringArrayList23 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList24 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                int readInt23 = parcel.readInt();
                arrayList36 = new ArrayList(readInt23);
                str4 = str15;
                int i28 = 0;
                while (true) {
                    arrayList37 = arrayList35;
                    if (i28 == readInt23) {
                        break;
                    }
                    i28 = en.a(CatalogItemReviewIdDto.CREATOR, parcel, arrayList36, i28, 1);
                    arrayList35 = arrayList37;
                    readInt23 = readInt23;
                }
            } else {
                str4 = str15;
                arrayList36 = null;
                arrayList37 = arrayList35;
            }
            if (parcel.readInt() == 0) {
                arrayList38 = null;
            } else {
                int readInt24 = parcel.readInt();
                arrayList38 = new ArrayList(readInt24);
                int i29 = 0;
                while (i29 != readInt24) {
                    i29 = en.a(CatalogItemReviewPreparedIdDto.CREATOR, parcel, arrayList38, i29, 1);
                    readInt24 = readInt24;
                    arrayList36 = arrayList36;
                }
            }
            ArrayList arrayList98 = arrayList36;
            if (parcel.readInt() == 0) {
                arrayList40 = arrayList38;
                arrayList39 = null;
            } else {
                int readInt25 = parcel.readInt();
                arrayList39 = new ArrayList(readInt25);
                arrayList40 = arrayList38;
                int i30 = 0;
                while (i30 != readInt25) {
                    i30 = pm0.b(parcel, arrayList39, i30, 1);
                }
            }
            CatalogLayoutDto catalogLayoutDto13 = catalogLayoutDto3;
            ArrayList<String> createStringArrayList25 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                catalogLayoutDto4 = catalogLayoutDto13;
                arrayList41 = null;
            } else {
                int readInt26 = parcel.readInt();
                arrayList41 = new ArrayList(readInt26);
                catalogLayoutDto4 = catalogLayoutDto13;
                int i31 = 0;
                while (i31 != readInt26) {
                    i31 = pm0.b(parcel, arrayList41, i31, 1);
                    readInt26 = readInt26;
                }
            }
            String str17 = str4;
            ArrayList<String> createStringArrayList26 = parcel.createStringArrayList();
            CatalogCoordsDto createFromParcel6 = parcel.readInt() == 0 ? null : CatalogCoordsDto.CREATOR.createFromParcel(parcel);
            ArrayList<String> arrayList99 = arrayList24;
            ArrayList arrayList100 = arrayList34;
            ArrayList arrayList101 = arrayList40;
            ArrayList<String> createStringArrayList27 = parcel.createStringArrayList();
            ArrayList arrayList102 = arrayList12;
            ArrayList arrayList103 = arrayList22;
            String readString5 = parcel.readString();
            ArrayList arrayList104 = arrayList41;
            CatalogBlockDataTypeDto catalogBlockDataTypeDto10 = catalogBlockDataTypeDto3;
            ArrayList arrayList105 = arrayList33;
            String str18 = str3;
            ArrayList arrayList106 = arrayList39;
            String str19 = str14;
            ArrayList arrayList107 = arrayList21;
            ArrayList arrayList108 = arrayList29;
            ArrayList arrayList109 = arrayList37;
            CatalogLayoutDto catalogLayoutDto14 = catalogLayoutDto4;
            String readString6 = parcel.readString();
            ArrayList<String> createStringArrayList28 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList29 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList30 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                str5 = str17;
                catalogBlockDataTypeDto4 = catalogBlockDataTypeDto10;
                catalogLayoutDto5 = catalogLayoutDto14;
                arrayList43 = null;
                arrayList42 = null;
            } else {
                str5 = str17;
                int readInt27 = parcel.readInt();
                catalogBlockDataTypeDto4 = catalogBlockDataTypeDto10;
                arrayList42 = new ArrayList(readInt27);
                catalogLayoutDto5 = catalogLayoutDto14;
                int i32 = 0;
                while (i32 != readInt27) {
                    i32 = pm0.b(parcel, arrayList42, i32, 1);
                    readInt27 = readInt27;
                }
                arrayList43 = null;
            }
            ArrayList<String> createStringArrayList31 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList32 = parcel.createStringArrayList();
            ArrayList arrayList110 = arrayList43;
            String str20 = str5;
            ArrayList<String> createStringArrayList33 = parcel.createStringArrayList();
            ArrayList arrayList111 = arrayList42;
            CatalogBlockDataTypeDto catalogBlockDataTypeDto11 = catalogBlockDataTypeDto4;
            ArrayList<String> createStringArrayList34 = parcel.createStringArrayList();
            CatalogLayoutDto catalogLayoutDto15 = catalogLayoutDto5;
            ArrayList<String> createStringArrayList35 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                str6 = str20;
                catalogBlockDataTypeDto5 = catalogBlockDataTypeDto11;
                catalogLayoutDto6 = catalogLayoutDto15;
                arrayList44 = arrayList110;
            } else {
                str6 = str20;
                int readInt28 = parcel.readInt();
                catalogBlockDataTypeDto5 = catalogBlockDataTypeDto11;
                arrayList44 = new ArrayList(readInt28);
                catalogLayoutDto6 = catalogLayoutDto15;
                int i33 = 0;
                while (i33 != readInt28) {
                    i33 = pm0.b(parcel, arrayList44, i33, 1);
                    readInt28 = readInt28;
                }
            }
            ArrayList<String> createStringArrayList36 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList45 = arrayList44;
                arrayList47 = arrayList99;
                arrayList46 = arrayList110;
            } else {
                int readInt29 = parcel.readInt();
                arrayList45 = arrayList44;
                arrayList46 = new ArrayList(readInt29);
                arrayList47 = arrayList99;
                int i34 = 0;
                while (i34 != readInt29) {
                    i34 = pm0.b(parcel, arrayList46, i34, 1);
                    readInt29 = readInt29;
                }
            }
            String str21 = str6;
            ArrayList<String> createStringArrayList37 = parcel.createStringArrayList();
            ArrayList arrayList112 = arrayList46;
            CatalogBlockDataTypeDto catalogBlockDataTypeDto12 = catalogBlockDataTypeDto5;
            ArrayList<String> createStringArrayList38 = parcel.createStringArrayList();
            CatalogLayoutDto catalogLayoutDto16 = catalogLayoutDto6;
            ArrayList<String> createStringArrayList39 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                str7 = str21;
                catalogBlockDataTypeDto6 = catalogBlockDataTypeDto12;
                catalogLayoutDto7 = catalogLayoutDto16;
                arrayList48 = arrayList110;
            } else {
                str7 = str21;
                int readInt30 = parcel.readInt();
                catalogBlockDataTypeDto6 = catalogBlockDataTypeDto12;
                arrayList48 = new ArrayList(readInt30);
                catalogLayoutDto7 = catalogLayoutDto16;
                int i35 = 0;
                while (i35 != readInt30) {
                    i35 = en.a(CatalogGameItemDto.CREATOR, parcel, arrayList48, i35, 1);
                    readInt30 = readInt30;
                    str19 = str19;
                }
            }
            String str22 = str19;
            if (parcel.readInt() == 0) {
                arrayList49 = arrayList110;
            } else {
                int readInt31 = parcel.readInt();
                arrayList49 = new ArrayList(readInt31);
                int i36 = 0;
                while (i36 != readInt31) {
                    i36 = en.a(CatalogMiniAppContentItemDto.CREATOR, parcel, arrayList49, i36, 1);
                    readInt31 = readInt31;
                    arrayList48 = arrayList48;
                }
            }
            ArrayList arrayList113 = arrayList48;
            ArrayList<String> createStringArrayList40 = parcel.createStringArrayList();
            String str23 = str7;
            ArrayList<String> createStringArrayList41 = parcel.createStringArrayList();
            CatalogBlockDataTypeDto catalogBlockDataTypeDto13 = catalogBlockDataTypeDto6;
            ArrayList<String> createStringArrayList42 = parcel.createStringArrayList();
            ArrayList<String> arrayList114 = arrayList47;
            ArrayList arrayList115 = arrayList49;
            CatalogLayoutDto catalogLayoutDto17 = catalogLayoutDto7;
            ArrayList<String> createStringArrayList43 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                int readInt32 = parcel.readInt();
                str8 = str23;
                arrayList50 = new ArrayList(readInt32);
                catalogBlockDataTypeDto7 = catalogBlockDataTypeDto13;
                int i37 = 0;
                while (true) {
                    catalogLayoutDto8 = catalogLayoutDto17;
                    if (i37 == readInt32) {
                        break;
                    }
                    i37 = en.a(CatalogSearchAuthorItemDto.CREATOR, parcel, arrayList50, i37, 1);
                    catalogLayoutDto17 = catalogLayoutDto8;
                    readInt32 = readInt32;
                }
            } else {
                str8 = str23;
                catalogBlockDataTypeDto7 = catalogBlockDataTypeDto13;
                arrayList50 = arrayList110;
                catalogLayoutDto8 = catalogLayoutDto17;
            }
            String str24 = str22;
            ArrayList<String> createStringArrayList44 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList52 = arrayList50;
                arrayList51 = arrayList110;
            } else {
                int readInt33 = parcel.readInt();
                arrayList51 = new ArrayList(readInt33);
                arrayList52 = arrayList50;
                int i38 = 0;
                while (i38 != readInt33) {
                    i38 = en.a(CatalogEntityGroupsItemDto.CREATOR, parcel, arrayList51, i38, 1);
                    readInt33 = readInt33;
                    str24 = str24;
                }
            }
            String str25 = str24;
            if (parcel.readInt() == 0) {
                arrayList53 = arrayList110;
            } else {
                int readInt34 = parcel.readInt();
                arrayList53 = new ArrayList(readInt34);
                int i39 = 0;
                while (i39 != readInt34) {
                    i39 = en.a(CatalogGroupCategoryMetaItemDto.CREATOR, parcel, arrayList53, i39, 1);
                    readInt34 = readInt34;
                    arrayList51 = arrayList51;
                }
            }
            ArrayList arrayList116 = arrayList51;
            String str26 = str8;
            ArrayList<String> createStringArrayList45 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                int readInt35 = parcel.readInt();
                arrayList54 = new ArrayList(readInt35);
                str9 = str26;
                int i40 = 0;
                while (true) {
                    arrayList55 = arrayList53;
                    if (i40 == readInt35) {
                        break;
                    }
                    i40 = pm0.b(parcel, arrayList54, i40, 1);
                    arrayList53 = arrayList55;
                }
            } else {
                str9 = str26;
                arrayList54 = arrayList110;
                arrayList55 = arrayList53;
            }
            CatalogLayoutDto catalogLayoutDto18 = catalogLayoutDto8;
            ArrayList<String> createStringArrayList46 = parcel.createStringArrayList();
            ActionButtonColorDto actionButtonColorDto2 = (ActionButtonColorDto) (parcel.readInt() == 0 ? arrayList110 : ActionButtonColorDto.CREATOR.createFromParcel(parcel));
            CounterColorDto counterColorDto2 = (CounterColorDto) (parcel.readInt() == 0 ? arrayList110 : CounterColorDto.CREATOR.createFromParcel(parcel));
            if (parcel.readInt() == 0) {
                actionButtonColorDto = actionButtonColorDto2;
                createFromParcel = arrayList110;
            } else {
                actionButtonColorDto = actionButtonColorDto2;
                createFromParcel = SubtypeDto.CREATOR.createFromParcel(parcel);
            }
            SubtypeDto subtypeDto2 = (SubtypeDto) createFromParcel;
            ArrayList arrayList117 = arrayList45;
            String readString7 = parcel.readString();
            ArrayList arrayList118 = arrayList55;
            String readString8 = parcel.readString();
            if (parcel.readInt() == 0) {
                ArrayList arrayList119 = arrayList110;
                arrayList56 = arrayList119;
                obj = arrayList119;
            } else {
                arrayList56 = arrayList110;
                obj = Integer.valueOf(parcel.readInt());
            }
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            if (parcel.readInt() == 0) {
                subtypeDto = subtypeDto2;
                counterColorDto = counterColorDto2;
                catalogLayoutDto9 = catalogLayoutDto18;
                arrayList58 = arrayList56;
                arrayList57 = arrayList58;
            } else {
                subtypeDto = subtypeDto2;
                int readInt36 = parcel.readInt();
                counterColorDto = counterColorDto2;
                arrayList57 = new ArrayList(readInt36);
                catalogLayoutDto9 = catalogLayoutDto18;
                int i41 = 0;
                while (i41 != readInt36) {
                    i41 = en.a(CatalogPlaylistsPlaceholderDto.CREATOR, parcel, arrayList57, i41, 1);
                    readInt36 = readInt36;
                    arrayList54 = arrayList54;
                }
                arrayList58 = arrayList56;
            }
            ArrayList arrayList120 = arrayList54;
            ArrayList<String> createStringArrayList47 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                int readInt37 = parcel.readInt();
                arrayList59 = new ArrayList(readInt37);
                int i42 = 0;
                while (true) {
                    arrayList60 = arrayList57;
                    if (i42 == readInt37) {
                        break;
                    }
                    i42 = en.a(CatalogVideoShowcaseMenuItemDto.CREATOR, parcel, arrayList59, i42, 1);
                    arrayList57 = arrayList60;
                    readInt37 = readInt37;
                }
            } else {
                arrayList59 = arrayList58;
                arrayList60 = arrayList57;
            }
            if (parcel.readInt() == 0) {
                arrayList62 = arrayList59;
                arrayList61 = null;
            } else {
                int readInt38 = parcel.readInt();
                arrayList61 = new ArrayList(readInt38);
                arrayList62 = arrayList59;
                int i43 = 0;
                while (i43 != readInt38) {
                    i43 = pm0.b(parcel, arrayList61, i43, 1);
                }
            }
            String str27 = str9;
            CounterColorDto counterColorDto3 = counterColorDto;
            ArrayList<String> createStringArrayList48 = parcel.createStringArrayList();
            CatalogLayoutDto catalogLayoutDto19 = catalogLayoutDto9;
            ArrayList<String> createStringArrayList49 = parcel.createStringArrayList();
            if (parcel.readInt() != 0) {
                int readInt39 = parcel.readInt();
                str10 = str27;
                arrayList63 = new ArrayList(readInt39);
                arrayList64 = arrayList61;
                int i44 = 0;
                while (true) {
                    catalogLayoutDto10 = catalogLayoutDto19;
                    if (i44 == readInt39) {
                        break;
                    }
                    i44 = pm0.b(parcel, arrayList63, i44, 1);
                    catalogLayoutDto19 = catalogLayoutDto10;
                }
            } else {
                str10 = str27;
                arrayList64 = arrayList61;
                arrayList63 = null;
                catalogLayoutDto10 = catalogLayoutDto19;
            }
            CatalogDiscoverDataDto createFromParcel7 = parcel.readInt() == 0 ? null : CatalogDiscoverDataDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt40 = parcel.readInt();
                arrayList65 = new ArrayList(readInt40);
                arrayList66 = arrayList63;
                int i45 = 0;
                while (true) {
                    catalogDiscoverDataDto = createFromParcel7;
                    if (i45 == readInt40) {
                        break;
                    }
                    i45 = en.a(CatalogArtistInfoItemDto.CREATOR, parcel, arrayList65, i45, 1);
                    createFromParcel7 = catalogDiscoverDataDto;
                    readInt40 = readInt40;
                }
            } else {
                arrayList66 = arrayList63;
                arrayList65 = null;
                catalogDiscoverDataDto = createFromParcel7;
            }
            if (parcel.readInt() == 0) {
                arrayList68 = arrayList65;
                arrayList67 = null;
            } else {
                int readInt41 = parcel.readInt();
                arrayList67 = new ArrayList(readInt41);
                arrayList68 = arrayList65;
                int i46 = 0;
                while (i46 != readInt41) {
                    i46 = pm0.b(parcel, arrayList67, i46, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList70 = arrayList67;
                arrayList69 = null;
            } else {
                int readInt42 = parcel.readInt();
                arrayList69 = new ArrayList(readInt42);
                arrayList70 = arrayList67;
                int i47 = 0;
                while (i47 != readInt42) {
                    i47 = pm0.b(parcel, arrayList69, i47, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList72 = arrayList69;
                arrayList71 = null;
            } else {
                int readInt43 = parcel.readInt();
                arrayList71 = new ArrayList(readInt43);
                arrayList72 = arrayList69;
                int i48 = 0;
                while (i48 != readInt43) {
                    i48 = pm0.b(parcel, arrayList71, i48, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList74 = arrayList71;
                arrayList73 = null;
            } else {
                int readInt44 = parcel.readInt();
                arrayList73 = new ArrayList(readInt44);
                arrayList74 = arrayList71;
                int i49 = 0;
                while (i49 != readInt44) {
                    i49 = pm0.b(parcel, arrayList73, i49, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList75 = null;
            } else {
                int readInt45 = parcel.readInt();
                arrayList75 = new ArrayList(readInt45);
                int i50 = 0;
                while (i50 != readInt45) {
                    i50 = en.a(CatalogRecomPlaylistRelationDto.CREATOR, parcel, arrayList75, i50, 1);
                    readInt45 = readInt45;
                    arrayList73 = arrayList73;
                }
            }
            ArrayList arrayList121 = arrayList73;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int readInt46 = parcel.readInt();
                arrayList76 = new ArrayList(readInt46);
                bool = valueOf;
                int i51 = 0;
                while (true) {
                    arrayList77 = arrayList75;
                    if (i51 == readInt46) {
                        break;
                    }
                    i51 = en.a(CatalogCacheGroupDto.CREATOR, parcel, arrayList76, i51, 1);
                    arrayList75 = arrayList77;
                    readInt46 = readInt46;
                }
            } else {
                bool = valueOf;
                arrayList76 = null;
                arrayList77 = arrayList75;
            }
            int i52 = 0;
            ArrayList arrayList122 = arrayList62;
            ArrayList arrayList123 = arrayList70;
            String readString11 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList78 = null;
            } else {
                int readInt47 = parcel.readInt();
                arrayList78 = new ArrayList(readInt47);
                while (i52 != readInt47) {
                    i52 = en.a(CatalogVideoInfoItemDto.CREATOR, parcel, arrayList78, i52, 1);
                    readInt47 = readInt47;
                    arrayList76 = arrayList76;
                }
            }
            return new CatalogBlockDto(str10, catalogBlockDataTypeDto7, catalogLayoutDto10, str25, str18, createStringArrayList, createFromParcel4, arrayList81, arrayList2, createFromParcel5, arrayList3, createStringArrayList2, createStringArrayList3, createStringArrayList4, arrayList82, arrayList83, createStringArrayList5, arrayList114, arrayList84, arrayList89, createStringArrayList7, createStringArrayList8, createStringArrayList9, createStringArrayList10, createStringArrayList11, createStringArrayList12, createStringArrayList13, createStringArrayList14, arrayList102, readString4, createStringArrayList15, arrayList87, arrayList90, arrayList96, createStringArrayList16, arrayList107, arrayList103, num, createStringArrayList17, createStringArrayList18, arrayList95, arrayList91, arrayList108, createStringArrayList19, arrayList97, arrayList94, arrayList100, createStringArrayList20, arrayList105, createStringArrayList21, createStringArrayList22, arrayList109, createStringArrayList23, createStringArrayList24, arrayList98, arrayList101, arrayList106, createStringArrayList25, arrayList104, createStringArrayList26, createFromParcel6, createStringArrayList27, readString5, readString6, createStringArrayList28, createStringArrayList29, createStringArrayList30, arrayList111, createStringArrayList31, createStringArrayList32, createStringArrayList33, createStringArrayList34, createStringArrayList35, arrayList117, createStringArrayList36, arrayList112, createStringArrayList37, createStringArrayList38, createStringArrayList39, arrayList113, arrayList115, createStringArrayList40, createStringArrayList41, createStringArrayList42, createStringArrayList43, arrayList52, createStringArrayList44, arrayList116, arrayList118, createStringArrayList45, arrayList120, createStringArrayList46, actionButtonColorDto, counterColorDto3, subtypeDto, readString7, readString8, obj, readString9, readString10, arrayList60, createStringArrayList47, arrayList122, arrayList64, createStringArrayList48, createStringArrayList49, arrayList66, catalogDiscoverDataDto, arrayList68, arrayList123, arrayList72, arrayList74, arrayList121, arrayList77, bool, arrayList76, readString11, arrayList78);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogBlockDto[] newArray(int i) {
            return new CatalogBlockDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogBlockDto(String str, CatalogBlockDataTypeDto catalogBlockDataTypeDto, CatalogLayoutDto catalogLayoutDto, String str2, String str3, List<String> list, CatalogBadgeDto catalogBadgeDto, List<CatalogItemBadgeDto> list2, List<CatalogButtonDto> list3, CatalogBlockMetaDto catalogBlockMetaDto, List<CatalogBlockAnchorInfoDto> list4, List<String> list5, List<String> list6, List<String> list7, List<CatalogStatInfoItemDto> list8, List<CatalogPinnedVideosItemDto> list9, List<String> list10, List<String> list11, List<CatalogCompositeIdDto> list12, List<Long> list13, List<String> list14, List<String> list15, List<String> list16, List<String> list17, List<String> list18, List<String> list19, List<String> list20, List<String> list21, List<CatalogSearchRecentDto> list22, String str4, List<String> list23, List<Integer> list24, List<Integer> list25, List<Integer> list26, List<String> list27, List<Integer> list28, List<Integer> list29, Integer num, List<String> list30, List<String> list31, List<UserId> list32, List<CatalogGroupsItemDto> list33, List<CatalogChannelsItemDto> list34, List<String> list35, List<Integer> list36, List<Integer> list37, List<? extends List<? extends Object>> list38, List<String> list39, List<Integer> list40, List<String> list41, List<String> list42, List<UserId> list43, List<String> list44, List<String> list45, List<CatalogItemReviewIdDto> list46, List<CatalogItemReviewPreparedIdDto> list47, List<Integer> list48, List<String> list49, List<Integer> list50, List<String> list51, CatalogCoordsDto catalogCoordsDto, List<String> list52, String str5, String str6, List<String> list53, List<String> list54, List<String> list55, List<Integer> list56, List<String> list57, List<String> list58, List<String> list59, List<String> list60, List<String> list61, List<Integer> list62, List<String> list63, List<Integer> list64, List<String> list65, List<String> list66, List<String> list67, List<CatalogGameItemDto> list68, List<CatalogMiniAppContentItemDto> list69, List<String> list70, List<String> list71, List<String> list72, List<String> list73, List<CatalogSearchAuthorItemDto> list74, List<String> list75, List<CatalogEntityGroupsItemDto> list76, List<CatalogGroupCategoryMetaItemDto> list77, List<String> list78, List<Integer> list79, List<String> list80, ActionButtonColorDto actionButtonColorDto, CounterColorDto counterColorDto, SubtypeDto subtypeDto, String str7, String str8, Integer num2, String str9, String str10, List<CatalogPlaylistsPlaceholderDto> list81, List<String> list82, List<CatalogVideoShowcaseMenuItemDto> list83, List<Integer> list84, List<String> list85, List<String> list86, List<Integer> list87, CatalogDiscoverDataDto catalogDiscoverDataDto, List<CatalogArtistInfoItemDto> list88, List<Integer> list89, List<Integer> list90, List<Integer> list91, List<Integer> list92, List<CatalogRecomPlaylistRelationDto> list93, Boolean bool, List<CatalogCacheGroupDto> list94, String str11, List<CatalogVideoInfoItemDto> list95) {
        this.id = str;
        this.dataType = catalogBlockDataTypeDto;
        this.layout = catalogLayoutDto;
        this.nextFrom = str2;
        this.url = str3;
        this.listenEvents = list;
        this.badge = catalogBadgeDto;
        this.itemBadges = list2;
        this.actions = list3;
        this.meta = catalogBlockMetaDto;
        this.anchorInfo = list4;
        this.placeholderIds = list5;
        this.videosIds = list6;
        this.tvChannelsIds = list7;
        this.statInfos = list8;
        this.pinnedVideos = list9;
        this.artistVideosIds = list10;
        this.audiosIds = list11;
        this.compositeIds = list12;
        this.aiAssistantIds = list13;
        this.shortVideoAudiosIds = list14;
        this.thumbsIds = list15;
        this.albumsIds = list16;
        this.linksIds = list17;
        this.musicOwnersIds = list18;
        this.baseLinksIds = list19;
        this.playlistsIds = list20;
        this.suggestionsIds = list21;
        this.searchRecents = list22;
        this.artistId = str4;
        this.artistsIds = list23;
        this.curatorsIds = list24;
        this.stickersPackIds = list25;
        this.stickersNotificationsId = list26;
        this.audioContentCardIds = list27;
        this.stickersBannersIds = list28;
        this.stickerIds = list29;
        this.stickersInfoId = num;
        this.audioFollowingsUpdateInfoIds = list30;
        this.audioFollowingsUpdateItemIds = list31;
        this.groupIds = list32;
        this.groupItems = list33;
        this.channelItems = list34;
        this.wallItemsIds = list35;
        this.groupInvites = list36;
        this.radioStationsIds = list37;
        this.groupChatsIds = list38;
        this.catalogUsersIds = list39;
        this.catalogBannerIds = list40;
        this.catalogAdBlockIds = list41;
        this.marketItemIds = list42;
        this.abandonedCartIds = list43;
        this.groupCatalogItemIds = list44;
        this.marketOrderIds = list45;
        this.itemReviewIds = list46;
        this.marketItemReviewPreparedIds = list47;
        this.communityReviewIds = list48;
        this.navigationTabIds = list49;
        this.cityIds = list50;
        this.classifiedsCityIds = list51;
        this.coords = catalogCoordsDto;
        this.textIds = list52;
        this.trackCode = str5;
        this.hintId = str6;
        this.audioSignalCommonInfoId = list53;
        this.audioStreamMixesIds = list54;
        this.videoMusicStreamMixesIds = list55;
        this.groupsLikesIds = list56;
        this.podcastEpisodesIds = list57;
        this.friendsLikedEpisodesIds = list58;
        this.podcastSliderItemsIds = list59;
        this.podcastItemsIds = list60;
        this.extendedPodcastItemsIds = list61;
        this.audioBookIds = list62;
        this.concertsIds = list63;
        this.audioBooksPersonIds = list64;
        this.longreadsIds = list65;
        this.ownerIds = list66;
        this.miniAppIds = list67;
        this.gamesItems = list68;
        this.miniappsContentItems = list69;
        this.searchSuggestionsIds = list70;
        this.searchFiltersIds = list71;
        this.searchSeoPagesIds = list72;
        this.searchSpellcheckersIds = list73;
        this.searchAuthorItems = list74;
        this.newsfeedItemIds = list75;
        this.entityGroupItems = list76;
        this.groupCategoryItems = list77;
        this.groupCollectionItemsIds = list78;
        this.searchEntityIds = list79;
        this.feedbacksIds = list80;
        this.actionButtonColor = actionButtonColorDto;
        this.counterColor = counterColorDto;
        this.subtype = subtypeDto;
        this.subsectionId = str7;
        this.title = str8;
        this.itemsCount = num2;
        this.stubIcon = str9;
        this.stubDescription = str10;
        this.playlistsPlaceholders = list81;
        this.videoShowcaseGalleriesIds = list82;
        this.videoShowcaseMenuItems = list83;
        this.marketInfoIds = list84;
        this.vkliveChannelsIds = list85;
        this.vkliveCategoriesIds = list86;
        this.topshelfItemsIds = list87;
        this.discoverData = catalogDiscoverDataDto;
        this.artistInfo = list88;
        this.moviesIds = list89;
        this.movieHeroIds = list90;
        this.movieGenreIds = list91;
        this.videoBannerIds = list92;
        this.catalogRecomPlaylistRelations = list93;
        this.isAutoAddedToChannel = bool;
        this.cacheGroups = list94;
        this.autoAddedToChannelPlaylistId = str11;
        this.videoInfos = list95;
    }

    public final List<String> B() {
        return this.audioStreamMixesIds;
    }

    public final CatalogBlockMetaDto B1() {
        return this.meta;
    }

    public final List<String> B2() {
        return this.searchFiltersIds;
    }

    public final List<String> C() {
        return this.audiosIds;
    }

    public final CatalogBadgeDto D() {
        return this.badge;
    }

    public final List<String> D0() {
        return this.feedbacksIds;
    }

    public final List<String> D1() {
        return this.miniAppIds;
    }

    public final List<CatalogMiniAppContentItemDto> E1() {
        return this.miniappsContentItems;
    }

    public final List<CatalogSearchRecentDto> E2() {
        return this.searchRecents;
    }

    public final List<String> F() {
        return this.baseLinksIds;
    }

    public final List<String> F0() {
        return this.friendsLikedEpisodesIds;
    }

    public final List<String> G() {
        return this.catalogAdBlockIds;
    }

    public final List<String> G2() {
        return this.searchSeoPagesIds;
    }

    public final List<CatalogGameItemDto> H0() {
        return this.gamesItems;
    }

    public final List<String> I2() {
        return this.searchSpellcheckersIds;
    }

    public final List<String> J2() {
        return this.searchSuggestionsIds;
    }

    public final List<Integer> K() {
        return this.catalogBannerIds;
    }

    public final List<String> K0() {
        return this.groupCatalogItemIds;
    }

    public final List<Integer> L1() {
        return this.moviesIds;
    }

    public final List<String> L2() {
        return this.shortVideoAudiosIds;
    }

    public final List<CatalogRecomPlaylistRelationDto> M() {
        return this.catalogRecomPlaylistRelations;
    }

    public final List<CatalogStatInfoItemDto> M2() {
        return this.statInfos;
    }

    public final List<CatalogGroupCategoryMetaItemDto> N0() {
        return this.groupCategoryItems;
    }

    public final List<String> N1() {
        return this.musicOwnersIds;
    }

    public final List<Integer> N2() {
        return this.stickersPackIds;
    }

    public final SubtypeDto O2() {
        return this.subtype;
    }

    public final List<String> P0() {
        return this.groupCollectionItemsIds;
    }

    public final List<String> Q2() {
        return this.suggestionsIds;
    }

    public final List<String> R() {
        return this.catalogUsersIds;
    }

    public final List<String> R1() {
        return this.navigationTabIds;
    }

    public final List<String> R2() {
        return this.textIds;
    }

    public final List<UserId> S0() {
        return this.groupIds;
    }

    public final List<CatalogChannelsItemDto> T() {
        return this.channelItems;
    }

    public final List<String> T2() {
        return this.tvChannelsIds;
    }

    public final List<Integer> U0() {
        return this.groupInvites;
    }

    public final List<String> U1() {
        return this.newsfeedItemIds;
    }

    public final List<CatalogGroupsItemDto> V0() {
        return this.groupItems;
    }

    public final String V1() {
        return this.nextFrom;
    }

    public final List<String> V2() {
        return this.videoMusicStreamMixesIds;
    }

    public final List<String> W() {
        return this.classifiedsCityIds;
    }

    public final List<String> W1() {
        return this.ownerIds;
    }

    public final List<String> W2() {
        return this.videoShowcaseGalleriesIds;
    }

    public final List<CatalogPinnedVideosItemDto> X1() {
        return this.pinnedVideos;
    }

    public final List<String> Z() {
        return this.concertsIds;
    }

    public final List<Integer> a0() {
        return this.curatorsIds;
    }

    public final String b1() {
        return this.hintId;
    }

    public final ActionButtonColorDto d() {
        return this.actionButtonColor;
    }

    public final List<CatalogItemBadgeDto> d1() {
        return this.itemBadges;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<CatalogButtonDto> e() {
        return this.actions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogBlockDto)) {
            return false;
        }
        CatalogBlockDto catalogBlockDto = (CatalogBlockDto) obj;
        return epx.f(this.id, catalogBlockDto.id) && this.dataType == catalogBlockDto.dataType && epx.f(this.layout, catalogBlockDto.layout) && epx.f(this.nextFrom, catalogBlockDto.nextFrom) && epx.f(this.url, catalogBlockDto.url) && epx.f(this.listenEvents, catalogBlockDto.listenEvents) && epx.f(this.badge, catalogBlockDto.badge) && epx.f(this.itemBadges, catalogBlockDto.itemBadges) && epx.f(this.actions, catalogBlockDto.actions) && epx.f(this.meta, catalogBlockDto.meta) && epx.f(this.anchorInfo, catalogBlockDto.anchorInfo) && epx.f(this.placeholderIds, catalogBlockDto.placeholderIds) && epx.f(this.videosIds, catalogBlockDto.videosIds) && epx.f(this.tvChannelsIds, catalogBlockDto.tvChannelsIds) && epx.f(this.statInfos, catalogBlockDto.statInfos) && epx.f(this.pinnedVideos, catalogBlockDto.pinnedVideos) && epx.f(this.artistVideosIds, catalogBlockDto.artistVideosIds) && epx.f(this.audiosIds, catalogBlockDto.audiosIds) && epx.f(this.compositeIds, catalogBlockDto.compositeIds) && epx.f(this.aiAssistantIds, catalogBlockDto.aiAssistantIds) && epx.f(this.shortVideoAudiosIds, catalogBlockDto.shortVideoAudiosIds) && epx.f(this.thumbsIds, catalogBlockDto.thumbsIds) && epx.f(this.albumsIds, catalogBlockDto.albumsIds) && epx.f(this.linksIds, catalogBlockDto.linksIds) && epx.f(this.musicOwnersIds, catalogBlockDto.musicOwnersIds) && epx.f(this.baseLinksIds, catalogBlockDto.baseLinksIds) && epx.f(this.playlistsIds, catalogBlockDto.playlistsIds) && epx.f(this.suggestionsIds, catalogBlockDto.suggestionsIds) && epx.f(this.searchRecents, catalogBlockDto.searchRecents) && epx.f(this.artistId, catalogBlockDto.artistId) && epx.f(this.artistsIds, catalogBlockDto.artistsIds) && epx.f(this.curatorsIds, catalogBlockDto.curatorsIds) && epx.f(this.stickersPackIds, catalogBlockDto.stickersPackIds) && epx.f(this.stickersNotificationsId, catalogBlockDto.stickersNotificationsId) && epx.f(this.audioContentCardIds, catalogBlockDto.audioContentCardIds) && epx.f(this.stickersBannersIds, catalogBlockDto.stickersBannersIds) && epx.f(this.stickerIds, catalogBlockDto.stickerIds) && epx.f(this.stickersInfoId, catalogBlockDto.stickersInfoId) && epx.f(this.audioFollowingsUpdateInfoIds, catalogBlockDto.audioFollowingsUpdateInfoIds) && epx.f(this.audioFollowingsUpdateItemIds, catalogBlockDto.audioFollowingsUpdateItemIds) && epx.f(this.groupIds, catalogBlockDto.groupIds) && epx.f(this.groupItems, catalogBlockDto.groupItems) && epx.f(this.channelItems, catalogBlockDto.channelItems) && epx.f(this.wallItemsIds, catalogBlockDto.wallItemsIds) && epx.f(this.groupInvites, catalogBlockDto.groupInvites) && epx.f(this.radioStationsIds, catalogBlockDto.radioStationsIds) && epx.f(this.groupChatsIds, catalogBlockDto.groupChatsIds) && epx.f(this.catalogUsersIds, catalogBlockDto.catalogUsersIds) && epx.f(this.catalogBannerIds, catalogBlockDto.catalogBannerIds) && epx.f(this.catalogAdBlockIds, catalogBlockDto.catalogAdBlockIds) && epx.f(this.marketItemIds, catalogBlockDto.marketItemIds) && epx.f(this.abandonedCartIds, catalogBlockDto.abandonedCartIds) && epx.f(this.groupCatalogItemIds, catalogBlockDto.groupCatalogItemIds) && epx.f(this.marketOrderIds, catalogBlockDto.marketOrderIds) && epx.f(this.itemReviewIds, catalogBlockDto.itemReviewIds) && epx.f(this.marketItemReviewPreparedIds, catalogBlockDto.marketItemReviewPreparedIds) && epx.f(this.communityReviewIds, catalogBlockDto.communityReviewIds) && epx.f(this.navigationTabIds, catalogBlockDto.navigationTabIds) && epx.f(this.cityIds, catalogBlockDto.cityIds) && epx.f(this.classifiedsCityIds, catalogBlockDto.classifiedsCityIds) && epx.f(this.coords, catalogBlockDto.coords) && epx.f(this.textIds, catalogBlockDto.textIds) && epx.f(this.trackCode, catalogBlockDto.trackCode) && epx.f(this.hintId, catalogBlockDto.hintId) && epx.f(this.audioSignalCommonInfoId, catalogBlockDto.audioSignalCommonInfoId) && epx.f(this.audioStreamMixesIds, catalogBlockDto.audioStreamMixesIds) && epx.f(this.videoMusicStreamMixesIds, catalogBlockDto.videoMusicStreamMixesIds) && epx.f(this.groupsLikesIds, catalogBlockDto.groupsLikesIds) && epx.f(this.podcastEpisodesIds, catalogBlockDto.podcastEpisodesIds) && epx.f(this.friendsLikedEpisodesIds, catalogBlockDto.friendsLikedEpisodesIds) && epx.f(this.podcastSliderItemsIds, catalogBlockDto.podcastSliderItemsIds) && epx.f(this.podcastItemsIds, catalogBlockDto.podcastItemsIds) && epx.f(this.extendedPodcastItemsIds, catalogBlockDto.extendedPodcastItemsIds) && epx.f(this.audioBookIds, catalogBlockDto.audioBookIds) && epx.f(this.concertsIds, catalogBlockDto.concertsIds) && epx.f(this.audioBooksPersonIds, catalogBlockDto.audioBooksPersonIds) && epx.f(this.longreadsIds, catalogBlockDto.longreadsIds) && epx.f(this.ownerIds, catalogBlockDto.ownerIds) && epx.f(this.miniAppIds, catalogBlockDto.miniAppIds) && epx.f(this.gamesItems, catalogBlockDto.gamesItems) && epx.f(this.miniappsContentItems, catalogBlockDto.miniappsContentItems) && epx.f(this.searchSuggestionsIds, catalogBlockDto.searchSuggestionsIds) && epx.f(this.searchFiltersIds, catalogBlockDto.searchFiltersIds) && epx.f(this.searchSeoPagesIds, catalogBlockDto.searchSeoPagesIds) && epx.f(this.searchSpellcheckersIds, catalogBlockDto.searchSpellcheckersIds) && epx.f(this.searchAuthorItems, catalogBlockDto.searchAuthorItems) && epx.f(this.newsfeedItemIds, catalogBlockDto.newsfeedItemIds) && epx.f(this.entityGroupItems, catalogBlockDto.entityGroupItems) && epx.f(this.groupCategoryItems, catalogBlockDto.groupCategoryItems) && epx.f(this.groupCollectionItemsIds, catalogBlockDto.groupCollectionItemsIds) && epx.f(this.searchEntityIds, catalogBlockDto.searchEntityIds) && epx.f(this.feedbacksIds, catalogBlockDto.feedbacksIds) && this.actionButtonColor == catalogBlockDto.actionButtonColor && this.counterColor == catalogBlockDto.counterColor && this.subtype == catalogBlockDto.subtype && epx.f(this.subsectionId, catalogBlockDto.subsectionId) && epx.f(this.title, catalogBlockDto.title) && epx.f(this.itemsCount, catalogBlockDto.itemsCount) && epx.f(this.stubIcon, catalogBlockDto.stubIcon) && epx.f(this.stubDescription, catalogBlockDto.stubDescription) && epx.f(this.playlistsPlaceholders, catalogBlockDto.playlistsPlaceholders) && epx.f(this.videoShowcaseGalleriesIds, catalogBlockDto.videoShowcaseGalleriesIds) && epx.f(this.videoShowcaseMenuItems, catalogBlockDto.videoShowcaseMenuItems) && epx.f(this.marketInfoIds, catalogBlockDto.marketInfoIds) && epx.f(this.vkliveChannelsIds, catalogBlockDto.vkliveChannelsIds) && epx.f(this.vkliveCategoriesIds, catalogBlockDto.vkliveCategoriesIds) && epx.f(this.topshelfItemsIds, catalogBlockDto.topshelfItemsIds) && epx.f(this.discoverData, catalogBlockDto.discoverData) && epx.f(this.artistInfo, catalogBlockDto.artistInfo) && epx.f(this.moviesIds, catalogBlockDto.moviesIds) && epx.f(this.movieHeroIds, catalogBlockDto.movieHeroIds) && epx.f(this.movieGenreIds, catalogBlockDto.movieGenreIds) && epx.f(this.videoBannerIds, catalogBlockDto.videoBannerIds) && epx.f(this.catalogRecomPlaylistRelations, catalogBlockDto.catalogRecomPlaylistRelations) && epx.f(this.isAutoAddedToChannel, catalogBlockDto.isAutoAddedToChannel) && epx.f(this.cacheGroups, catalogBlockDto.cacheGroups) && epx.f(this.autoAddedToChannelPlaylistId, catalogBlockDto.autoAddedToChannelPlaylistId) && epx.f(this.videoInfos, catalogBlockDto.videoInfos);
    }

    public final List<String> f() {
        return this.albumsIds;
    }

    public final List<String> f3() {
        return this.videosIds;
    }

    public final List<CatalogArtistInfoItemDto> g() {
        return this.artistInfo;
    }

    public final List<String> g3() {
        return this.vkliveCategoriesIds;
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

    public final List<String> h3() {
        return this.wallItemsIds;
    }

    public final int hashCode() {
        int hashCode = (this.layout.hashCode() + ((this.dataType.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31;
        String str = this.nextFrom;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.listenEvents;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        CatalogBadgeDto catalogBadgeDto = this.badge;
        int hashCode5 = (hashCode4 + (catalogBadgeDto == null ? 0 : catalogBadgeDto.hashCode())) * 31;
        List<CatalogItemBadgeDto> list2 = this.itemBadges;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<CatalogButtonDto> list3 = this.actions;
        int hashCode7 = (hashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        CatalogBlockMetaDto catalogBlockMetaDto = this.meta;
        int hashCode8 = (hashCode7 + (catalogBlockMetaDto == null ? 0 : catalogBlockMetaDto.hashCode())) * 31;
        List<CatalogBlockAnchorInfoDto> list4 = this.anchorInfo;
        int hashCode9 = (hashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.placeholderIds;
        int hashCode10 = (hashCode9 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<String> list6 = this.videosIds;
        int hashCode11 = (hashCode10 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<String> list7 = this.tvChannelsIds;
        int hashCode12 = (hashCode11 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<CatalogStatInfoItemDto> list8 = this.statInfos;
        int hashCode13 = (hashCode12 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<CatalogPinnedVideosItemDto> list9 = this.pinnedVideos;
        int hashCode14 = (hashCode13 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<String> list10 = this.artistVideosIds;
        int hashCode15 = (hashCode14 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<String> list11 = this.audiosIds;
        int hashCode16 = (hashCode15 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<CatalogCompositeIdDto> list12 = this.compositeIds;
        int hashCode17 = (hashCode16 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<Long> list13 = this.aiAssistantIds;
        int hashCode18 = (hashCode17 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<String> list14 = this.shortVideoAudiosIds;
        int hashCode19 = (hashCode18 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<String> list15 = this.thumbsIds;
        int hashCode20 = (hashCode19 + (list15 == null ? 0 : list15.hashCode())) * 31;
        List<String> list16 = this.albumsIds;
        int hashCode21 = (hashCode20 + (list16 == null ? 0 : list16.hashCode())) * 31;
        List<String> list17 = this.linksIds;
        int hashCode22 = (hashCode21 + (list17 == null ? 0 : list17.hashCode())) * 31;
        List<String> list18 = this.musicOwnersIds;
        int hashCode23 = (hashCode22 + (list18 == null ? 0 : list18.hashCode())) * 31;
        List<String> list19 = this.baseLinksIds;
        int hashCode24 = (hashCode23 + (list19 == null ? 0 : list19.hashCode())) * 31;
        List<String> list20 = this.playlistsIds;
        int hashCode25 = (hashCode24 + (list20 == null ? 0 : list20.hashCode())) * 31;
        List<String> list21 = this.suggestionsIds;
        int hashCode26 = (hashCode25 + (list21 == null ? 0 : list21.hashCode())) * 31;
        List<CatalogSearchRecentDto> list22 = this.searchRecents;
        int hashCode27 = (hashCode26 + (list22 == null ? 0 : list22.hashCode())) * 31;
        String str3 = this.artistId;
        int hashCode28 = (hashCode27 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list23 = this.artistsIds;
        int hashCode29 = (hashCode28 + (list23 == null ? 0 : list23.hashCode())) * 31;
        List<Integer> list24 = this.curatorsIds;
        int hashCode30 = (hashCode29 + (list24 == null ? 0 : list24.hashCode())) * 31;
        List<Integer> list25 = this.stickersPackIds;
        int hashCode31 = (hashCode30 + (list25 == null ? 0 : list25.hashCode())) * 31;
        List<Integer> list26 = this.stickersNotificationsId;
        int hashCode32 = (hashCode31 + (list26 == null ? 0 : list26.hashCode())) * 31;
        List<String> list27 = this.audioContentCardIds;
        int hashCode33 = (hashCode32 + (list27 == null ? 0 : list27.hashCode())) * 31;
        List<Integer> list28 = this.stickersBannersIds;
        int hashCode34 = (hashCode33 + (list28 == null ? 0 : list28.hashCode())) * 31;
        List<Integer> list29 = this.stickerIds;
        int hashCode35 = (hashCode34 + (list29 == null ? 0 : list29.hashCode())) * 31;
        Integer num = this.stickersInfoId;
        int hashCode36 = (hashCode35 + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list30 = this.audioFollowingsUpdateInfoIds;
        int hashCode37 = (hashCode36 + (list30 == null ? 0 : list30.hashCode())) * 31;
        List<String> list31 = this.audioFollowingsUpdateItemIds;
        int hashCode38 = (hashCode37 + (list31 == null ? 0 : list31.hashCode())) * 31;
        List<UserId> list32 = this.groupIds;
        int hashCode39 = (hashCode38 + (list32 == null ? 0 : list32.hashCode())) * 31;
        List<CatalogGroupsItemDto> list33 = this.groupItems;
        int hashCode40 = (hashCode39 + (list33 == null ? 0 : list33.hashCode())) * 31;
        List<CatalogChannelsItemDto> list34 = this.channelItems;
        int hashCode41 = (hashCode40 + (list34 == null ? 0 : list34.hashCode())) * 31;
        List<String> list35 = this.wallItemsIds;
        int hashCode42 = (hashCode41 + (list35 == null ? 0 : list35.hashCode())) * 31;
        List<Integer> list36 = this.groupInvites;
        int hashCode43 = (hashCode42 + (list36 == null ? 0 : list36.hashCode())) * 31;
        List<Integer> list37 = this.radioStationsIds;
        int hashCode44 = (hashCode43 + (list37 == null ? 0 : list37.hashCode())) * 31;
        List<List<Object>> list38 = this.groupChatsIds;
        int hashCode45 = (hashCode44 + (list38 == null ? 0 : list38.hashCode())) * 31;
        List<String> list39 = this.catalogUsersIds;
        int hashCode46 = (hashCode45 + (list39 == null ? 0 : list39.hashCode())) * 31;
        List<Integer> list40 = this.catalogBannerIds;
        int hashCode47 = (hashCode46 + (list40 == null ? 0 : list40.hashCode())) * 31;
        List<String> list41 = this.catalogAdBlockIds;
        int hashCode48 = (hashCode47 + (list41 == null ? 0 : list41.hashCode())) * 31;
        List<String> list42 = this.marketItemIds;
        int hashCode49 = (hashCode48 + (list42 == null ? 0 : list42.hashCode())) * 31;
        List<UserId> list43 = this.abandonedCartIds;
        int hashCode50 = (hashCode49 + (list43 == null ? 0 : list43.hashCode())) * 31;
        List<String> list44 = this.groupCatalogItemIds;
        int hashCode51 = (hashCode50 + (list44 == null ? 0 : list44.hashCode())) * 31;
        List<String> list45 = this.marketOrderIds;
        int hashCode52 = (hashCode51 + (list45 == null ? 0 : list45.hashCode())) * 31;
        List<CatalogItemReviewIdDto> list46 = this.itemReviewIds;
        int hashCode53 = (hashCode52 + (list46 == null ? 0 : list46.hashCode())) * 31;
        List<CatalogItemReviewPreparedIdDto> list47 = this.marketItemReviewPreparedIds;
        int hashCode54 = (hashCode53 + (list47 == null ? 0 : list47.hashCode())) * 31;
        List<Integer> list48 = this.communityReviewIds;
        int hashCode55 = (hashCode54 + (list48 == null ? 0 : list48.hashCode())) * 31;
        List<String> list49 = this.navigationTabIds;
        int hashCode56 = (hashCode55 + (list49 == null ? 0 : list49.hashCode())) * 31;
        List<Integer> list50 = this.cityIds;
        int hashCode57 = (hashCode56 + (list50 == null ? 0 : list50.hashCode())) * 31;
        List<String> list51 = this.classifiedsCityIds;
        int hashCode58 = (hashCode57 + (list51 == null ? 0 : list51.hashCode())) * 31;
        CatalogCoordsDto catalogCoordsDto = this.coords;
        int hashCode59 = (hashCode58 + (catalogCoordsDto == null ? 0 : catalogCoordsDto.hashCode())) * 31;
        List<String> list52 = this.textIds;
        int hashCode60 = (hashCode59 + (list52 == null ? 0 : list52.hashCode())) * 31;
        String str4 = this.trackCode;
        int hashCode61 = (hashCode60 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.hintId;
        int hashCode62 = (hashCode61 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list53 = this.audioSignalCommonInfoId;
        int hashCode63 = (hashCode62 + (list53 == null ? 0 : list53.hashCode())) * 31;
        List<String> list54 = this.audioStreamMixesIds;
        int hashCode64 = (hashCode63 + (list54 == null ? 0 : list54.hashCode())) * 31;
        List<String> list55 = this.videoMusicStreamMixesIds;
        int hashCode65 = (hashCode64 + (list55 == null ? 0 : list55.hashCode())) * 31;
        List<Integer> list56 = this.groupsLikesIds;
        int hashCode66 = (hashCode65 + (list56 == null ? 0 : list56.hashCode())) * 31;
        List<String> list57 = this.podcastEpisodesIds;
        int hashCode67 = (hashCode66 + (list57 == null ? 0 : list57.hashCode())) * 31;
        List<String> list58 = this.friendsLikedEpisodesIds;
        int hashCode68 = (hashCode67 + (list58 == null ? 0 : list58.hashCode())) * 31;
        List<String> list59 = this.podcastSliderItemsIds;
        int hashCode69 = (hashCode68 + (list59 == null ? 0 : list59.hashCode())) * 31;
        List<String> list60 = this.podcastItemsIds;
        int hashCode70 = (hashCode69 + (list60 == null ? 0 : list60.hashCode())) * 31;
        List<String> list61 = this.extendedPodcastItemsIds;
        int hashCode71 = (hashCode70 + (list61 == null ? 0 : list61.hashCode())) * 31;
        List<Integer> list62 = this.audioBookIds;
        int hashCode72 = (hashCode71 + (list62 == null ? 0 : list62.hashCode())) * 31;
        List<String> list63 = this.concertsIds;
        int hashCode73 = (hashCode72 + (list63 == null ? 0 : list63.hashCode())) * 31;
        List<Integer> list64 = this.audioBooksPersonIds;
        int hashCode74 = (hashCode73 + (list64 == null ? 0 : list64.hashCode())) * 31;
        List<String> list65 = this.longreadsIds;
        int hashCode75 = (hashCode74 + (list65 == null ? 0 : list65.hashCode())) * 31;
        List<String> list66 = this.ownerIds;
        int hashCode76 = (hashCode75 + (list66 == null ? 0 : list66.hashCode())) * 31;
        List<String> list67 = this.miniAppIds;
        int hashCode77 = (hashCode76 + (list67 == null ? 0 : list67.hashCode())) * 31;
        List<CatalogGameItemDto> list68 = this.gamesItems;
        int hashCode78 = (hashCode77 + (list68 == null ? 0 : list68.hashCode())) * 31;
        List<CatalogMiniAppContentItemDto> list69 = this.miniappsContentItems;
        int hashCode79 = (hashCode78 + (list69 == null ? 0 : list69.hashCode())) * 31;
        List<String> list70 = this.searchSuggestionsIds;
        int hashCode80 = (hashCode79 + (list70 == null ? 0 : list70.hashCode())) * 31;
        List<String> list71 = this.searchFiltersIds;
        int hashCode81 = (hashCode80 + (list71 == null ? 0 : list71.hashCode())) * 31;
        List<String> list72 = this.searchSeoPagesIds;
        int hashCode82 = (hashCode81 + (list72 == null ? 0 : list72.hashCode())) * 31;
        List<String> list73 = this.searchSpellcheckersIds;
        int hashCode83 = (hashCode82 + (list73 == null ? 0 : list73.hashCode())) * 31;
        List<CatalogSearchAuthorItemDto> list74 = this.searchAuthorItems;
        int hashCode84 = (hashCode83 + (list74 == null ? 0 : list74.hashCode())) * 31;
        List<String> list75 = this.newsfeedItemIds;
        int hashCode85 = (hashCode84 + (list75 == null ? 0 : list75.hashCode())) * 31;
        List<CatalogEntityGroupsItemDto> list76 = this.entityGroupItems;
        int hashCode86 = (hashCode85 + (list76 == null ? 0 : list76.hashCode())) * 31;
        List<CatalogGroupCategoryMetaItemDto> list77 = this.groupCategoryItems;
        int hashCode87 = (hashCode86 + (list77 == null ? 0 : list77.hashCode())) * 31;
        List<String> list78 = this.groupCollectionItemsIds;
        int hashCode88 = (hashCode87 + (list78 == null ? 0 : list78.hashCode())) * 31;
        List<Integer> list79 = this.searchEntityIds;
        int hashCode89 = (hashCode88 + (list79 == null ? 0 : list79.hashCode())) * 31;
        List<String> list80 = this.feedbacksIds;
        int hashCode90 = (hashCode89 + (list80 == null ? 0 : list80.hashCode())) * 31;
        ActionButtonColorDto actionButtonColorDto = this.actionButtonColor;
        int hashCode91 = (hashCode90 + (actionButtonColorDto == null ? 0 : actionButtonColorDto.hashCode())) * 31;
        CounterColorDto counterColorDto = this.counterColor;
        int hashCode92 = (hashCode91 + (counterColorDto == null ? 0 : counterColorDto.hashCode())) * 31;
        SubtypeDto subtypeDto = this.subtype;
        int hashCode93 = (hashCode92 + (subtypeDto == null ? 0 : subtypeDto.hashCode())) * 31;
        String str6 = this.subsectionId;
        int hashCode94 = (hashCode93 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.title;
        int hashCode95 = (hashCode94 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num2 = this.itemsCount;
        int hashCode96 = (hashCode95 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str8 = this.stubIcon;
        int hashCode97 = (hashCode96 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.stubDescription;
        int hashCode98 = (hashCode97 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<CatalogPlaylistsPlaceholderDto> list81 = this.playlistsPlaceholders;
        int hashCode99 = (hashCode98 + (list81 == null ? 0 : list81.hashCode())) * 31;
        List<String> list82 = this.videoShowcaseGalleriesIds;
        int hashCode100 = (hashCode99 + (list82 == null ? 0 : list82.hashCode())) * 31;
        List<CatalogVideoShowcaseMenuItemDto> list83 = this.videoShowcaseMenuItems;
        int hashCode101 = (hashCode100 + (list83 == null ? 0 : list83.hashCode())) * 31;
        List<Integer> list84 = this.marketInfoIds;
        int hashCode102 = (hashCode101 + (list84 == null ? 0 : list84.hashCode())) * 31;
        List<String> list85 = this.vkliveChannelsIds;
        int hashCode103 = (hashCode102 + (list85 == null ? 0 : list85.hashCode())) * 31;
        List<String> list86 = this.vkliveCategoriesIds;
        int hashCode104 = (hashCode103 + (list86 == null ? 0 : list86.hashCode())) * 31;
        List<Integer> list87 = this.topshelfItemsIds;
        int hashCode105 = (hashCode104 + (list87 == null ? 0 : list87.hashCode())) * 31;
        CatalogDiscoverDataDto catalogDiscoverDataDto = this.discoverData;
        int hashCode106 = (hashCode105 + (catalogDiscoverDataDto == null ? 0 : catalogDiscoverDataDto.hashCode())) * 31;
        List<CatalogArtistInfoItemDto> list88 = this.artistInfo;
        int hashCode107 = (hashCode106 + (list88 == null ? 0 : list88.hashCode())) * 31;
        List<Integer> list89 = this.moviesIds;
        int hashCode108 = (hashCode107 + (list89 == null ? 0 : list89.hashCode())) * 31;
        List<Integer> list90 = this.movieHeroIds;
        int hashCode109 = (hashCode108 + (list90 == null ? 0 : list90.hashCode())) * 31;
        List<Integer> list91 = this.movieGenreIds;
        int hashCode110 = (hashCode109 + (list91 == null ? 0 : list91.hashCode())) * 31;
        List<Integer> list92 = this.videoBannerIds;
        int hashCode111 = (hashCode110 + (list92 == null ? 0 : list92.hashCode())) * 31;
        List<CatalogRecomPlaylistRelationDto> list93 = this.catalogRecomPlaylistRelations;
        int hashCode112 = (hashCode111 + (list93 == null ? 0 : list93.hashCode())) * 31;
        Boolean bool = this.isAutoAddedToChannel;
        int hashCode113 = (hashCode112 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<CatalogCacheGroupDto> list94 = this.cacheGroups;
        int hashCode114 = (hashCode113 + (list94 == null ? 0 : list94.hashCode())) * 31;
        String str10 = this.autoAddedToChannelPlaylistId;
        int hashCode115 = (hashCode114 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<CatalogVideoInfoItemDto> list95 = this.videoInfos;
        return hashCode115 + (list95 != null ? list95.hashCode() : 0);
    }

    public final List<String> i() {
        return this.artistVideosIds;
    }

    public final List<String> i2() {
        return this.placeholderIds;
    }

    public final List<String> j() {
        return this.artistsIds;
    }

    public final List<Integer> k() {
        return this.audioBookIds;
    }

    public final List<Integer> l() {
        return this.audioBooksPersonIds;
    }

    public final CatalogBlockDataTypeDto l0() {
        return this.dataType;
    }

    public final List<String> l2() {
        return this.playlistsIds;
    }

    public final List<String> m2() {
        return this.podcastEpisodesIds;
    }

    public final List<String> n() {
        return this.audioContentCardIds;
    }

    public final CatalogLayoutDto n1() {
        return this.layout;
    }

    public final List<String> o() {
        return this.audioFollowingsUpdateInfoIds;
    }

    public final List<String> o1() {
        return this.linksIds;
    }

    public final List<String> o2() {
        return this.podcastItemsIds;
    }

    public final List<String> p() {
        return this.audioFollowingsUpdateItemIds;
    }

    public final List<String> q2() {
        return this.podcastSliderItemsIds;
    }

    public final String r() {
        return this.trackCode;
    }

    public final List<Integer> r2() {
        return this.radioStationsIds;
    }

    public final List<String> s1() {
        return this.listenEvents;
    }

    public final List<String> t1() {
        return this.longreadsIds;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogBlockDto(id=");
        sb.append(this.id);
        sb.append(", dataType=");
        sb.append(this.dataType);
        sb.append(", layout=");
        sb.append(this.layout);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", listenEvents=");
        sb.append(this.listenEvents);
        sb.append(", badge=");
        sb.append(this.badge);
        sb.append(", itemBadges=");
        sb.append(this.itemBadges);
        sb.append(", actions=");
        sb.append(this.actions);
        sb.append(", meta=");
        sb.append(this.meta);
        sb.append(", anchorInfo=");
        sb.append(this.anchorInfo);
        sb.append(", placeholderIds=");
        sb.append(this.placeholderIds);
        sb.append(", videosIds=");
        sb.append(this.videosIds);
        sb.append(", tvChannelsIds=");
        sb.append(this.tvChannelsIds);
        sb.append(", statInfos=");
        sb.append(this.statInfos);
        sb.append(", pinnedVideos=");
        sb.append(this.pinnedVideos);
        sb.append(", artistVideosIds=");
        sb.append(this.artistVideosIds);
        sb.append(", audiosIds=");
        sb.append(this.audiosIds);
        sb.append(", compositeIds=");
        sb.append(this.compositeIds);
        sb.append(", aiAssistantIds=");
        sb.append(this.aiAssistantIds);
        sb.append(", shortVideoAudiosIds=");
        sb.append(this.shortVideoAudiosIds);
        sb.append(", thumbsIds=");
        sb.append(this.thumbsIds);
        sb.append(", albumsIds=");
        sb.append(this.albumsIds);
        sb.append(", linksIds=");
        sb.append(this.linksIds);
        sb.append(", musicOwnersIds=");
        sb.append(this.musicOwnersIds);
        sb.append(", baseLinksIds=");
        sb.append(this.baseLinksIds);
        sb.append(", playlistsIds=");
        sb.append(this.playlistsIds);
        sb.append(", suggestionsIds=");
        sb.append(this.suggestionsIds);
        sb.append(", searchRecents=");
        sb.append(this.searchRecents);
        sb.append(", artistId=");
        sb.append(this.artistId);
        sb.append(", artistsIds=");
        sb.append(this.artistsIds);
        sb.append(", curatorsIds=");
        sb.append(this.curatorsIds);
        sb.append(", stickersPackIds=");
        sb.append(this.stickersPackIds);
        sb.append(", stickersNotificationsId=");
        sb.append(this.stickersNotificationsId);
        sb.append(", audioContentCardIds=");
        sb.append(this.audioContentCardIds);
        sb.append(", stickersBannersIds=");
        sb.append(this.stickersBannersIds);
        sb.append(", stickerIds=");
        sb.append(this.stickerIds);
        sb.append(", stickersInfoId=");
        sb.append(this.stickersInfoId);
        sb.append(", audioFollowingsUpdateInfoIds=");
        sb.append(this.audioFollowingsUpdateInfoIds);
        sb.append(", audioFollowingsUpdateItemIds=");
        sb.append(this.audioFollowingsUpdateItemIds);
        sb.append(", groupIds=");
        sb.append(this.groupIds);
        sb.append(", groupItems=");
        sb.append(this.groupItems);
        sb.append(", channelItems=");
        sb.append(this.channelItems);
        sb.append(", wallItemsIds=");
        sb.append(this.wallItemsIds);
        sb.append(", groupInvites=");
        sb.append(this.groupInvites);
        sb.append(", radioStationsIds=");
        sb.append(this.radioStationsIds);
        sb.append(", groupChatsIds=");
        sb.append(this.groupChatsIds);
        sb.append(", catalogUsersIds=");
        sb.append(this.catalogUsersIds);
        sb.append(", catalogBannerIds=");
        sb.append(this.catalogBannerIds);
        sb.append(", catalogAdBlockIds=");
        sb.append(this.catalogAdBlockIds);
        sb.append(", marketItemIds=");
        sb.append(this.marketItemIds);
        sb.append(", abandonedCartIds=");
        sb.append(this.abandonedCartIds);
        sb.append(", groupCatalogItemIds=");
        sb.append(this.groupCatalogItemIds);
        sb.append(", marketOrderIds=");
        sb.append(this.marketOrderIds);
        sb.append(", itemReviewIds=");
        sb.append(this.itemReviewIds);
        sb.append(", marketItemReviewPreparedIds=");
        sb.append(this.marketItemReviewPreparedIds);
        sb.append(", communityReviewIds=");
        sb.append(this.communityReviewIds);
        sb.append(", navigationTabIds=");
        sb.append(this.navigationTabIds);
        sb.append(", cityIds=");
        sb.append(this.cityIds);
        sb.append(", classifiedsCityIds=");
        sb.append(this.classifiedsCityIds);
        sb.append(", coords=");
        sb.append(this.coords);
        sb.append(", textIds=");
        sb.append(this.textIds);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", hintId=");
        sb.append(this.hintId);
        sb.append(", audioSignalCommonInfoId=");
        sb.append(this.audioSignalCommonInfoId);
        sb.append(", audioStreamMixesIds=");
        sb.append(this.audioStreamMixesIds);
        sb.append(", videoMusicStreamMixesIds=");
        sb.append(this.videoMusicStreamMixesIds);
        sb.append(", groupsLikesIds=");
        sb.append(this.groupsLikesIds);
        sb.append(", podcastEpisodesIds=");
        sb.append(this.podcastEpisodesIds);
        sb.append(", friendsLikedEpisodesIds=");
        sb.append(this.friendsLikedEpisodesIds);
        sb.append(", podcastSliderItemsIds=");
        sb.append(this.podcastSliderItemsIds);
        sb.append(", podcastItemsIds=");
        sb.append(this.podcastItemsIds);
        sb.append(", extendedPodcastItemsIds=");
        sb.append(this.extendedPodcastItemsIds);
        sb.append(", audioBookIds=");
        sb.append(this.audioBookIds);
        sb.append(", concertsIds=");
        sb.append(this.concertsIds);
        sb.append(", audioBooksPersonIds=");
        sb.append(this.audioBooksPersonIds);
        sb.append(", longreadsIds=");
        sb.append(this.longreadsIds);
        sb.append(", ownerIds=");
        sb.append(this.ownerIds);
        sb.append(", miniAppIds=");
        sb.append(this.miniAppIds);
        sb.append(", gamesItems=");
        sb.append(this.gamesItems);
        sb.append(", miniappsContentItems=");
        sb.append(this.miniappsContentItems);
        sb.append(", searchSuggestionsIds=");
        sb.append(this.searchSuggestionsIds);
        sb.append(", searchFiltersIds=");
        sb.append(this.searchFiltersIds);
        sb.append(", searchSeoPagesIds=");
        sb.append(this.searchSeoPagesIds);
        sb.append(", searchSpellcheckersIds=");
        sb.append(this.searchSpellcheckersIds);
        sb.append(", searchAuthorItems=");
        sb.append(this.searchAuthorItems);
        sb.append(", newsfeedItemIds=");
        sb.append(this.newsfeedItemIds);
        sb.append(", entityGroupItems=");
        sb.append(this.entityGroupItems);
        sb.append(", groupCategoryItems=");
        sb.append(this.groupCategoryItems);
        sb.append(", groupCollectionItemsIds=");
        sb.append(this.groupCollectionItemsIds);
        sb.append(", searchEntityIds=");
        sb.append(this.searchEntityIds);
        sb.append(", feedbacksIds=");
        sb.append(this.feedbacksIds);
        sb.append(", actionButtonColor=");
        sb.append(this.actionButtonColor);
        sb.append(", counterColor=");
        sb.append(this.counterColor);
        sb.append(", subtype=");
        sb.append(this.subtype);
        sb.append(", subsectionId=");
        sb.append(this.subsectionId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", itemsCount=");
        sb.append(this.itemsCount);
        sb.append(", stubIcon=");
        sb.append(this.stubIcon);
        sb.append(", stubDescription=");
        sb.append(this.stubDescription);
        sb.append(", playlistsPlaceholders=");
        sb.append(this.playlistsPlaceholders);
        sb.append(", videoShowcaseGalleriesIds=");
        sb.append(this.videoShowcaseGalleriesIds);
        sb.append(", videoShowcaseMenuItems=");
        sb.append(this.videoShowcaseMenuItems);
        sb.append(", marketInfoIds=");
        sb.append(this.marketInfoIds);
        sb.append(", vkliveChannelsIds=");
        sb.append(this.vkliveChannelsIds);
        sb.append(", vkliveCategoriesIds=");
        sb.append(this.vkliveCategoriesIds);
        sb.append(", topshelfItemsIds=");
        sb.append(this.topshelfItemsIds);
        sb.append(", discoverData=");
        sb.append(this.discoverData);
        sb.append(", artistInfo=");
        sb.append(this.artistInfo);
        sb.append(", moviesIds=");
        sb.append(this.moviesIds);
        sb.append(", movieHeroIds=");
        sb.append(this.movieHeroIds);
        sb.append(", movieGenreIds=");
        sb.append(this.movieGenreIds);
        sb.append(", videoBannerIds=");
        sb.append(this.videoBannerIds);
        sb.append(", catalogRecomPlaylistRelations=");
        sb.append(this.catalogRecomPlaylistRelations);
        sb.append(", isAutoAddedToChannel=");
        sb.append(this.isAutoAddedToChannel);
        sb.append(", cacheGroups=");
        sb.append(this.cacheGroups);
        sb.append(", autoAddedToChannelPlaylistId=");
        sb.append(this.autoAddedToChannelPlaylistId);
        sb.append(", videoInfos=");
        return ms9.a(')', sb, this.videoInfos);
    }

    public final List<String> u() {
        return this.audioSignalCommonInfoId;
    }

    public final CatalogDiscoverDataDto v0() {
        return this.discoverData;
    }

    public final List<CatalogEntityGroupsItemDto> w0() {
        return this.entityGroupItems;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        this.dataType.writeToParcel(parcel, i);
        this.layout.writeToParcel(parcel, i);
        parcel.writeString(this.nextFrom);
        parcel.writeString(this.url);
        parcel.writeStringList(this.listenEvents);
        CatalogBadgeDto catalogBadgeDto = this.badge;
        if (catalogBadgeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogBadgeDto.writeToParcel(parcel, i);
        }
        List<CatalogItemBadgeDto> list = this.itemBadges;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((CatalogItemBadgeDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogButtonDto> list2 = this.actions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((CatalogButtonDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        CatalogBlockMetaDto catalogBlockMetaDto = this.meta;
        if (catalogBlockMetaDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogBlockMetaDto.writeToParcel(parcel, i);
        }
        List<CatalogBlockAnchorInfoDto> list3 = this.anchorInfo;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((CatalogBlockAnchorInfoDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.placeholderIds);
        parcel.writeStringList(this.videosIds);
        parcel.writeStringList(this.tvChannelsIds);
        List<CatalogStatInfoItemDto> list4 = this.statInfos;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((CatalogStatInfoItemDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogPinnedVideosItemDto> list5 = this.pinnedVideos;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                ((CatalogPinnedVideosItemDto) f5.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.artistVideosIds);
        parcel.writeStringList(this.audiosIds);
        List<CatalogCompositeIdDto> list6 = this.compositeIds;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list6, 1);
            while (f6.hasNext()) {
                ((CatalogCompositeIdDto) f6.next()).writeToParcel(parcel, i);
            }
        }
        List<Long> list7 = this.aiAssistantIds;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f7 = dn.f(parcel, list7, 1);
            while (f7.hasNext()) {
                parcel.writeLong(((Number) f7.next()).longValue());
            }
        }
        parcel.writeStringList(this.shortVideoAudiosIds);
        parcel.writeStringList(this.thumbsIds);
        parcel.writeStringList(this.albumsIds);
        parcel.writeStringList(this.linksIds);
        parcel.writeStringList(this.musicOwnersIds);
        parcel.writeStringList(this.baseLinksIds);
        parcel.writeStringList(this.playlistsIds);
        parcel.writeStringList(this.suggestionsIds);
        List<CatalogSearchRecentDto> list8 = this.searchRecents;
        if (list8 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f8 = dn.f(parcel, list8, 1);
            while (f8.hasNext()) {
                ((CatalogSearchRecentDto) f8.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.artistId);
        parcel.writeStringList(this.artistsIds);
        List<Integer> list9 = this.curatorsIds;
        if (list9 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f9 = dn.f(parcel, list9, 1);
            while (f9.hasNext()) {
                parcel.writeInt(((Number) f9.next()).intValue());
            }
        }
        List<Integer> list10 = this.stickersPackIds;
        if (list10 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f10 = dn.f(parcel, list10, 1);
            while (f10.hasNext()) {
                parcel.writeInt(((Number) f10.next()).intValue());
            }
        }
        List<Integer> list11 = this.stickersNotificationsId;
        if (list11 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f11 = dn.f(parcel, list11, 1);
            while (f11.hasNext()) {
                parcel.writeInt(((Number) f11.next()).intValue());
            }
        }
        parcel.writeStringList(this.audioContentCardIds);
        List<Integer> list12 = this.stickersBannersIds;
        if (list12 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f12 = dn.f(parcel, list12, 1);
            while (f12.hasNext()) {
                parcel.writeInt(((Number) f12.next()).intValue());
            }
        }
        List<Integer> list13 = this.stickerIds;
        if (list13 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f13 = dn.f(parcel, list13, 1);
            while (f13.hasNext()) {
                parcel.writeInt(((Number) f13.next()).intValue());
            }
        }
        Integer num = this.stickersInfoId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeStringList(this.audioFollowingsUpdateInfoIds);
        parcel.writeStringList(this.audioFollowingsUpdateItemIds);
        List<UserId> list14 = this.groupIds;
        if (list14 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f14 = dn.f(parcel, list14, 1);
            while (f14.hasNext()) {
                parcel.writeParcelable((Parcelable) f14.next(), i);
            }
        }
        List<CatalogGroupsItemDto> list15 = this.groupItems;
        if (list15 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f15 = dn.f(parcel, list15, 1);
            while (f15.hasNext()) {
                ((CatalogGroupsItemDto) f15.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogChannelsItemDto> list16 = this.channelItems;
        if (list16 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f16 = dn.f(parcel, list16, 1);
            while (f16.hasNext()) {
                ((CatalogChannelsItemDto) f16.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.wallItemsIds);
        List<Integer> list17 = this.groupInvites;
        if (list17 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f17 = dn.f(parcel, list17, 1);
            while (f17.hasNext()) {
                parcel.writeInt(((Number) f17.next()).intValue());
            }
        }
        List<Integer> list18 = this.radioStationsIds;
        if (list18 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f18 = dn.f(parcel, list18, 1);
            while (f18.hasNext()) {
                parcel.writeInt(((Number) f18.next()).intValue());
            }
        }
        List<List<Object>> list19 = this.groupChatsIds;
        if (list19 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f19 = dn.f(parcel, list19, 1);
            while (f19.hasNext()) {
                Iterator a2 = ao.a(parcel, (List) f19.next());
                while (a2.hasNext()) {
                    parcel.writeValue(a2.next());
                }
            }
        }
        parcel.writeStringList(this.catalogUsersIds);
        List<Integer> list20 = this.catalogBannerIds;
        if (list20 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f20 = dn.f(parcel, list20, 1);
            while (f20.hasNext()) {
                parcel.writeInt(((Number) f20.next()).intValue());
            }
        }
        parcel.writeStringList(this.catalogAdBlockIds);
        parcel.writeStringList(this.marketItemIds);
        List<UserId> list21 = this.abandonedCartIds;
        if (list21 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f21 = dn.f(parcel, list21, 1);
            while (f21.hasNext()) {
                parcel.writeParcelable((Parcelable) f21.next(), i);
            }
        }
        parcel.writeStringList(this.groupCatalogItemIds);
        parcel.writeStringList(this.marketOrderIds);
        List<CatalogItemReviewIdDto> list22 = this.itemReviewIds;
        if (list22 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f22 = dn.f(parcel, list22, 1);
            while (f22.hasNext()) {
                ((CatalogItemReviewIdDto) f22.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogItemReviewPreparedIdDto> list23 = this.marketItemReviewPreparedIds;
        if (list23 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f23 = dn.f(parcel, list23, 1);
            while (f23.hasNext()) {
                ((CatalogItemReviewPreparedIdDto) f23.next()).writeToParcel(parcel, i);
            }
        }
        List<Integer> list24 = this.communityReviewIds;
        if (list24 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f24 = dn.f(parcel, list24, 1);
            while (f24.hasNext()) {
                parcel.writeInt(((Number) f24.next()).intValue());
            }
        }
        parcel.writeStringList(this.navigationTabIds);
        List<Integer> list25 = this.cityIds;
        if (list25 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f25 = dn.f(parcel, list25, 1);
            while (f25.hasNext()) {
                parcel.writeInt(((Number) f25.next()).intValue());
            }
        }
        parcel.writeStringList(this.classifiedsCityIds);
        CatalogCoordsDto catalogCoordsDto = this.coords;
        if (catalogCoordsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogCoordsDto.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.textIds);
        parcel.writeString(this.trackCode);
        parcel.writeString(this.hintId);
        parcel.writeStringList(this.audioSignalCommonInfoId);
        parcel.writeStringList(this.audioStreamMixesIds);
        parcel.writeStringList(this.videoMusicStreamMixesIds);
        List<Integer> list26 = this.groupsLikesIds;
        if (list26 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f26 = dn.f(parcel, list26, 1);
            while (f26.hasNext()) {
                parcel.writeInt(((Number) f26.next()).intValue());
            }
        }
        parcel.writeStringList(this.podcastEpisodesIds);
        parcel.writeStringList(this.friendsLikedEpisodesIds);
        parcel.writeStringList(this.podcastSliderItemsIds);
        parcel.writeStringList(this.podcastItemsIds);
        parcel.writeStringList(this.extendedPodcastItemsIds);
        List<Integer> list27 = this.audioBookIds;
        if (list27 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f27 = dn.f(parcel, list27, 1);
            while (f27.hasNext()) {
                parcel.writeInt(((Number) f27.next()).intValue());
            }
        }
        parcel.writeStringList(this.concertsIds);
        List<Integer> list28 = this.audioBooksPersonIds;
        if (list28 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f28 = dn.f(parcel, list28, 1);
            while (f28.hasNext()) {
                parcel.writeInt(((Number) f28.next()).intValue());
            }
        }
        parcel.writeStringList(this.longreadsIds);
        parcel.writeStringList(this.ownerIds);
        parcel.writeStringList(this.miniAppIds);
        List<CatalogGameItemDto> list29 = this.gamesItems;
        if (list29 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f29 = dn.f(parcel, list29, 1);
            while (f29.hasNext()) {
                ((CatalogGameItemDto) f29.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogMiniAppContentItemDto> list30 = this.miniappsContentItems;
        if (list30 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f30 = dn.f(parcel, list30, 1);
            while (f30.hasNext()) {
                ((CatalogMiniAppContentItemDto) f30.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.searchSuggestionsIds);
        parcel.writeStringList(this.searchFiltersIds);
        parcel.writeStringList(this.searchSeoPagesIds);
        parcel.writeStringList(this.searchSpellcheckersIds);
        List<CatalogSearchAuthorItemDto> list31 = this.searchAuthorItems;
        if (list31 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f31 = dn.f(parcel, list31, 1);
            while (f31.hasNext()) {
                ((CatalogSearchAuthorItemDto) f31.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.newsfeedItemIds);
        List<CatalogEntityGroupsItemDto> list32 = this.entityGroupItems;
        if (list32 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f32 = dn.f(parcel, list32, 1);
            while (f32.hasNext()) {
                ((CatalogEntityGroupsItemDto) f32.next()).writeToParcel(parcel, i);
            }
        }
        List<CatalogGroupCategoryMetaItemDto> list33 = this.groupCategoryItems;
        if (list33 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f33 = dn.f(parcel, list33, 1);
            while (f33.hasNext()) {
                ((CatalogGroupCategoryMetaItemDto) f33.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.groupCollectionItemsIds);
        List<Integer> list34 = this.searchEntityIds;
        if (list34 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f34 = dn.f(parcel, list34, 1);
            while (f34.hasNext()) {
                parcel.writeInt(((Number) f34.next()).intValue());
            }
        }
        parcel.writeStringList(this.feedbacksIds);
        ActionButtonColorDto actionButtonColorDto = this.actionButtonColor;
        if (actionButtonColorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionButtonColorDto.writeToParcel(parcel, i);
        }
        CounterColorDto counterColorDto = this.counterColor;
        if (counterColorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            counterColorDto.writeToParcel(parcel, i);
        }
        SubtypeDto subtypeDto = this.subtype;
        if (subtypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            subtypeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.subsectionId);
        parcel.writeString(this.title);
        Integer num2 = this.itemsCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.stubIcon);
        parcel.writeString(this.stubDescription);
        List<CatalogPlaylistsPlaceholderDto> list35 = this.playlistsPlaceholders;
        if (list35 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f35 = dn.f(parcel, list35, 1);
            while (f35.hasNext()) {
                ((CatalogPlaylistsPlaceholderDto) f35.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.videoShowcaseGalleriesIds);
        List<CatalogVideoShowcaseMenuItemDto> list36 = this.videoShowcaseMenuItems;
        if (list36 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f36 = dn.f(parcel, list36, 1);
            while (f36.hasNext()) {
                ((CatalogVideoShowcaseMenuItemDto) f36.next()).writeToParcel(parcel, i);
            }
        }
        List<Integer> list37 = this.marketInfoIds;
        if (list37 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f37 = dn.f(parcel, list37, 1);
            while (f37.hasNext()) {
                parcel.writeInt(((Number) f37.next()).intValue());
            }
        }
        parcel.writeStringList(this.vkliveChannelsIds);
        parcel.writeStringList(this.vkliveCategoriesIds);
        List<Integer> list38 = this.topshelfItemsIds;
        if (list38 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f38 = dn.f(parcel, list38, 1);
            while (f38.hasNext()) {
                parcel.writeInt(((Number) f38.next()).intValue());
            }
        }
        CatalogDiscoverDataDto catalogDiscoverDataDto = this.discoverData;
        if (catalogDiscoverDataDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogDiscoverDataDto.writeToParcel(parcel, i);
        }
        List<CatalogArtistInfoItemDto> list39 = this.artistInfo;
        if (list39 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f39 = dn.f(parcel, list39, 1);
            while (f39.hasNext()) {
                ((CatalogArtistInfoItemDto) f39.next()).writeToParcel(parcel, i);
            }
        }
        List<Integer> list40 = this.moviesIds;
        if (list40 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f40 = dn.f(parcel, list40, 1);
            while (f40.hasNext()) {
                parcel.writeInt(((Number) f40.next()).intValue());
            }
        }
        List<Integer> list41 = this.movieHeroIds;
        if (list41 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f41 = dn.f(parcel, list41, 1);
            while (f41.hasNext()) {
                parcel.writeInt(((Number) f41.next()).intValue());
            }
        }
        List<Integer> list42 = this.movieGenreIds;
        if (list42 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f42 = dn.f(parcel, list42, 1);
            while (f42.hasNext()) {
                parcel.writeInt(((Number) f42.next()).intValue());
            }
        }
        List<Integer> list43 = this.videoBannerIds;
        if (list43 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f43 = dn.f(parcel, list43, 1);
            while (f43.hasNext()) {
                parcel.writeInt(((Number) f43.next()).intValue());
            }
        }
        List<CatalogRecomPlaylistRelationDto> list44 = this.catalogRecomPlaylistRelations;
        if (list44 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f44 = dn.f(parcel, list44, 1);
            while (f44.hasNext()) {
                ((CatalogRecomPlaylistRelationDto) f44.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.isAutoAddedToChannel;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<CatalogCacheGroupDto> list45 = this.cacheGroups;
        if (list45 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f45 = dn.f(parcel, list45, 1);
            while (f45.hasNext()) {
                ((CatalogCacheGroupDto) f45.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.autoAddedToChannelPlaylistId);
        List<CatalogVideoInfoItemDto> list46 = this.videoInfos;
        if (list46 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f46 = dn.f(parcel, list46, 1);
        while (f46.hasNext()) {
            ((CatalogVideoInfoItemDto) f46.next()).writeToParcel(parcel, i);
        }
    }

    public final List<Integer> x1() {
        return this.marketInfoIds;
    }

    public final List<String> y0() {
        return this.extendedPodcastItemsIds;
    }

    public final List<String> y1() {
        return this.marketItemIds;
    }

    public final List<CatalogSearchAuthorItemDto> y2() {
        return this.searchAuthorItems;
    }

    public final List<String> z1() {
        return this.marketOrderIds;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CatalogBlockDto(String str, CatalogBlockDataTypeDto catalogBlockDataTypeDto, CatalogLayoutDto catalogLayoutDto, String str2, String str3, List list, CatalogBadgeDto catalogBadgeDto, List list2, List list3, CatalogBlockMetaDto catalogBlockMetaDto, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, String str4, List list23, List list24, List list25, List list26, List list27, List list28, List list29, Integer num, List list30, List list31, List list32, List list33, List list34, List list35, List list36, List list37, List list38, List list39, List list40, List list41, List list42, List list43, List list44, List list45, List list46, List list47, List list48, List list49, List list50, List list51, CatalogCoordsDto catalogCoordsDto, List list52, String str5, String str6, List list53, List list54, List list55, List list56, List list57, List list58, List list59, List list60, List list61, List list62, List list63, List list64, List list65, List list66, List list67, List list68, List list69, List list70, List list71, List list72, List list73, List list74, List list75, List list76, List list77, List list78, List list79, List list80, ActionButtonColorDto actionButtonColorDto, CounterColorDto counterColorDto, SubtypeDto subtypeDto, String str7, String str8, Integer num2, String str9, String str10, List list81, List list82, List list83, List list84, List list85, List list86, List list87, CatalogDiscoverDataDto catalogDiscoverDataDto, List list88, List list89, List list90, List list91, List list92, List list93, Boolean bool, List list94, String str11, List list95, int i, int i2, int i3, int i4, zcl zclVar) {
        this(str, catalogBlockDataTypeDto, catalogLayoutDto, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r5, r17, r19, r21, r23, r25, r27, r29, r31, r33, r34, r35, r36, r37, r38, r39, r40, r96, r41, r42, r43, r44, r45, r46, r47, r97, r98, r99, r100, r101, r102, r103, r0, (i2 & 32768) != 0 ? null : list39, (i2 & 65536) != 0 ? null : list40, (i2 & 131072) != 0 ? null : list41, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list42, (i2 & 524288) != 0 ? null : list43, (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list44, (i2 & 2097152) != 0 ? null : list45, (i2 & 4194304) != 0 ? null : list46, (i2 & 8388608) != 0 ? null : list47, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : list48, (i2 & 33554432) != 0 ? null : list49, (i2 & 67108864) != 0 ? null : list50, (i2 & 134217728) != 0 ? null : list51, (i2 & 268435456) != 0 ? null : catalogCoordsDto, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : list52, (i2 & 1073741824) != 0 ? null : str5, (i2 & Integer.MIN_VALUE) != 0 ? null : str6, (i3 & 1) != 0 ? null : list53, (i3 & 2) != 0 ? null : list54, (i3 & 4) != 0 ? null : list55, (i3 & 8) != 0 ? null : list56, (i3 & 16) != 0 ? null : list57, (i3 & 32) != 0 ? null : list58, (i3 & 64) != 0 ? null : list59, (i3 & 128) != 0 ? null : list60, (i3 & 256) != 0 ? null : list61, (i3 & 512) != 0 ? null : list62, (i3 & 1024) != 0 ? null : list63, (i3 & 2048) != 0 ? null : list64, (i3 & 4096) != 0 ? null : list65, (i3 & 8192) != 0 ? null : list66, (i3 & 16384) != 0 ? null : list67, (i3 & 32768) != 0 ? null : list68, (i3 & 65536) != 0 ? null : list69, (i3 & 131072) != 0 ? null : list70, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list71, (i3 & 524288) != 0 ? null : list72, (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list73, (i3 & 2097152) != 0 ? null : list74, (i3 & 4194304) != 0 ? null : list75, (i3 & 8388608) != 0 ? null : list76, (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : list77, (i3 & 33554432) != 0 ? null : list78, (i3 & 67108864) != 0 ? null : list79, (i3 & 134217728) != 0 ? null : list80, (i3 & 268435456) != 0 ? null : actionButtonColorDto, (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : counterColorDto, (i3 & 1073741824) != 0 ? null : subtypeDto, (i3 & Integer.MIN_VALUE) != 0 ? null : str7, (i4 & 1) != 0 ? null : str8, (i4 & 2) != 0 ? null : num2, (i4 & 4) != 0 ? null : str9, (i4 & 8) != 0 ? null : str10, (i4 & 16) != 0 ? null : list81, (i4 & 32) != 0 ? null : list82, (i4 & 64) != 0 ? null : list83, (i4 & 128) != 0 ? null : list84, (i4 & 256) != 0 ? null : list85, (i4 & 512) != 0 ? null : list86, (i4 & 1024) != 0 ? null : list87, (i4 & 2048) != 0 ? null : catalogDiscoverDataDto, (i4 & 4096) != 0 ? null : list88, (i4 & 8192) != 0 ? null : list89, (i4 & 16384) != 0 ? null : list90, (i4 & 32768) != 0 ? null : list91, (i4 & 65536) != 0 ? null : list92, (i4 & 131072) != 0 ? null : list93, (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool, (i4 & 524288) != 0 ? null : list94, (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : str11, (i4 & 2097152) != 0 ? null : list95);
        String str12 = (i & 8) != 0 ? null : str2;
        String str13 = (i & 16) != 0 ? null : str3;
        List list96 = (i & 32) != 0 ? null : list;
        CatalogBadgeDto catalogBadgeDto2 = (i & 64) != 0 ? null : catalogBadgeDto;
        List list97 = (i & 128) != 0 ? null : list2;
        List list98 = (i & 256) != 0 ? null : list3;
        CatalogBlockMetaDto catalogBlockMetaDto2 = (i & 512) != 0 ? null : catalogBlockMetaDto;
        List list99 = (i & 1024) != 0 ? null : list4;
        List list100 = (i & 2048) != 0 ? null : list5;
        List list101 = (i & 4096) != 0 ? null : list6;
        List list102 = (i & 8192) != 0 ? null : list7;
        List list103 = (i & 16384) != 0 ? null : list8;
        List list104 = (i & 32768) != 0 ? null : list9;
        List list105 = (i & 65536) != 0 ? null : list10;
        List list106 = (i & 131072) != 0 ? null : list11;
        List list107 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list12;
        List list108 = (i & 524288) != 0 ? null : list13;
        List list109 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list14;
        List list110 = (i & 2097152) != 0 ? null : list15;
        List list111 = (i & 4194304) != 0 ? null : list16;
        List list112 = (i & 8388608) != 0 ? null : list17;
        List list113 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : list18;
        List list114 = (i & 33554432) != 0 ? null : list19;
        List list115 = (i & 67108864) != 0 ? null : list20;
        List list116 = (i & 134217728) != 0 ? null : list21;
        List list117 = (i & 268435456) != 0 ? null : list22;
        String str14 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str4;
        List list118 = (i & 1073741824) != 0 ? null : list23;
        List list119 = (i & Integer.MIN_VALUE) != 0 ? null : list24;
        List list120 = (i2 & 1) != 0 ? null : list25;
        List list121 = (i2 & 2) != 0 ? null : list26;
        List list122 = (i2 & 4) != 0 ? null : list27;
        List list123 = (i2 & 8) != 0 ? null : list28;
        List list124 = (i2 & 16) != 0 ? null : list29;
        Integer num3 = (i2 & 32) != 0 ? null : num;
        List list125 = (i2 & 64) != 0 ? null : list30;
        List list126 = list119;
        List list127 = (i2 & 128) != 0 ? null : list31;
        List list128 = (i2 & 256) != 0 ? null : list32;
        List list129 = (i2 & 512) != 0 ? null : list33;
        List list130 = (i2 & 1024) != 0 ? null : list34;
        List list131 = (i2 & 2048) != 0 ? null : list35;
        List list132 = (i2 & 4096) != 0 ? null : list36;
        List list133 = (i2 & 8192) != 0 ? null : list37;
        List list134 = (i2 & 16384) != 0 ? null : list38;
    }
}
