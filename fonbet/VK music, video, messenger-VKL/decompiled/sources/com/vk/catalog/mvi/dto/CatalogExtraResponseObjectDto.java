package com.vk.catalog.mvi.dto;

import android.os.Parcel;
import android.os.Parcelable;
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
import com.vk.api.generated.catalog.dto.CatalogBannerDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogLinkDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogVideoDto;
import com.vk.api.generated.catalog.dto.CatalogFriendsLikesItemDto;
import com.vk.api.generated.catalog.dto.CatalogGroupCategoryItemDto;
import com.vk.api.generated.catalog.dto.CatalogHintDto;
import com.vk.api.generated.catalog.dto.CatalogNewsfeedItemWithIdDto;
import com.vk.api.generated.catalog.dto.CatalogTextDto;
import com.vk.api.generated.catalog.dto.CatalogUserItemDto;
import com.vk.api.generated.catalog.dto.CatalogVideoMovieDto;
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
import com.vk.api.generated.search.dto.SearchSpellcheckerDto;
import com.vk.api.generated.search.dto.SearchSuggestionItemDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoAudioDto;
import com.vk.api.generated.stickers.dto.StickersCatalogBannerDto;
import com.vk.api.generated.stickers.dto.StickersCatalogInfoDto;
import com.vk.api.generated.stickers.dto.StickersCatalogNotificationDto;
import com.vk.api.generated.stickers.dto.StickersPackPreviewDto;
import com.vk.api.generated.store.dto.StoreStockItemDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.video.dto.VideoVkliveCategoryDto;
import com.vk.api.generated.video.dto.VideoVkliveChannelDto;
import com.vk.api.generated.wall.dto.WallWallItemDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;

/* compiled from: CatalogExtraResponseObjectDto.kt */
/* loaded from: classes16.dex */
public final class CatalogExtraResponseObjectDto implements Parcelable {
    public static final Parcelable.Creator<CatalogExtraResponseObjectDto> CREATOR = new a();
    public final List<CatalogUserItemDto> A;
    public final List<StickersCatalogNotificationDto> B;
    public final List<AudioArtistDto> C;
    public final List<AudioFollowingsUpdateInfoDto> D;
    public final List<AudioFollowingsUpdateItemDto> E;
    public final List<AudioSignalCommonInfoDto> F;
    public final List<AudioCuratorDto> G;
    public final List<GroupsChatDto> H;
    public final List<VideoVideoFullDto> I;
    public final List<CatalogBannerDto> J;
    public final List<ClassifiedsYoulaCityDto> K;
    public final List<MarketClassifiedInfoDto> L;
    public final List<MarketMarketCategoryTreeDto> M;
    public final List<MarketMarketCategoryMappingDto> N;
    public final List<MarketMarketSearchQueryDto> O;
    public final List<MarketMarketItemDto> P;
    public final List<MarketGroupCatalogItemDto> Q;
    public final List<MarketNavigationTabDto> R;
    public final List<MarketOrderDto> S;
    public final List<MarketUserReviewsItemsReviewDto> T;
    public final List<MarketItemForReviewDto> U;
    public final List<MarketCommunityReviewDto> V;
    public final List<MarketAbandonedCartDto> W;
    public final List<CatalogTextDto> X;
    public final List<ArticlesArticleDto> Y;
    public final List<AudioAudioDto> Z;
    public final List<PodcastSliderItemDto> a0;
    public final List<AudioStreamMixCatalogItemDto> b;
    public final List<PodcastPodcastDto> b0;
    public final List<UsersUserFullDto> c;
    public final List<PodcastExtendedPodcastDto> c0;
    public final List<GroupsGroupFullDto> d;
    public final List<AudioAudioContentCardDto> d0;
    public final List<BadgesBadgeDto> e;
    public final List<AudioBooksAudioBookDto> e0;
    public final List<WallWallItemDto> f;
    public final List<AudioBooksItemPersonDto> f0;
    public final List<AudioSearchSuggestionDto> g;
    public final List<PodcastEpisodeWithLikedFriendsDto> g0;
    public final List<VideoVideoFullDto> h;
    public final List<CatalogHintDto> h0;
    public final List<CatalogCatalogVideoDto> i;
    public final List<CatalogFriendsLikesItemDto> i0;
    public final List<VideoVideoFullDto> j;
    public final List<AppsAppDto> j0;
    public final List<CatalogCatalogLinkDto> k;
    public final List<AppsAppDto> k0;
    public final List<BaseLinkDto> l;
    public final List<SearchSuggestionItemDto> l0;
    public final List<MusicOwnerDto> m;
    public final List<SearchFilterItemDto> m0;
    public final List<ArticlesArticleDto> n;
    public final List<CatalogNewsfeedItemWithIdDto> n0;
    public final List<VideoVideoAlbumFullDto> o;
    public final List<GroupsCollectionItemDto> o0;
    public final List<AudioAudioDto> p;
    public final List<CatalogGroupCategoryItemDto> p0;
    public final List<ShortVideoAudioDto> q;
    public final List<LikesReactionSetDto> q0;
    public final List<AudioRecommendedPlaylistDto> r;
    public final List<MarketSearchSpellCheckResultDto> r0;
    public final List<AudioRadioStationDto> s;
    public final List<MarketSearchQueryClassifierSuggestionDto> s0;
    public final List<MediaPopupDto> t;
    public final List<SearchSpellcheckerDto> t0;
    public final List<AudioPhotoDto> u;
    public final List<MarketIntegrationsInfoBlockCatalogDto> u0;
    public final List<AudioPlaylistDto> v;
    public final List<SearchEntityItemDto> v0;
    public final Map<Integer, StoreStockItemDto> w;
    public final List<FeedbacksFeedbackDto> w0;
    public final List<StickersPackPreviewDto> x;
    public final List<VideoVkliveChannelDto> x0;
    public final List<StickersCatalogBannerDto> y;
    public final List<VideoVkliveCategoryDto> y0;
    public final List<StickersCatalogInfoDto> z;
    public final List<CatalogVideoMovieDto> z0;

    /* compiled from: CatalogExtraResponseObjectDto.kt */
    public static final class a implements Parcelable.Creator<CatalogExtraResponseObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogExtraResponseObjectDto createFromParcel(Parcel parcel) {
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
            LinkedHashMap linkedHashMap;
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
            ArrayList arrayList35;
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
            ArrayList arrayList76 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList77 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList77, i, 1);
                }
                arrayList = arrayList77;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList78 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList78, i2, 1);
                }
                arrayList2 = arrayList78;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList79 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList79, i3, 1);
                }
                arrayList3 = arrayList79;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList80 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList80, i4, 1);
                }
                arrayList4 = arrayList80;
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt5 = parcel.readInt();
                ArrayList arrayList81 = new ArrayList(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList81, i5, 1);
                }
                arrayList5 = arrayList81;
            }
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int readInt6 = parcel.readInt();
                ArrayList arrayList82 = new ArrayList(readInt6);
                int i6 = 0;
                while (i6 != readInt6) {
                    i6 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList82, i6, 1);
                }
                arrayList6 = arrayList82;
            }
            if (parcel.readInt() == 0) {
                arrayList7 = null;
            } else {
                int readInt7 = parcel.readInt();
                ArrayList arrayList83 = new ArrayList(readInt7);
                int i7 = 0;
                while (i7 != readInt7) {
                    i7 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList83, i7, 1);
                }
                arrayList7 = arrayList83;
            }
            if (parcel.readInt() == 0) {
                arrayList8 = null;
            } else {
                int readInt8 = parcel.readInt();
                ArrayList arrayList84 = new ArrayList(readInt8);
                int i8 = 0;
                while (i8 != readInt8) {
                    i8 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList84, i8, 1);
                }
                arrayList8 = arrayList84;
            }
            if (parcel.readInt() == 0) {
                arrayList9 = null;
            } else {
                int readInt9 = parcel.readInt();
                ArrayList arrayList85 = new ArrayList(readInt9);
                int i9 = 0;
                while (i9 != readInt9) {
                    i9 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList85, i9, 1);
                }
                arrayList9 = arrayList85;
            }
            if (parcel.readInt() == 0) {
                arrayList10 = null;
            } else {
                int readInt10 = parcel.readInt();
                ArrayList arrayList86 = new ArrayList(readInt10);
                int i10 = 0;
                while (i10 != readInt10) {
                    i10 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList86, i10, 1);
                }
                arrayList10 = arrayList86;
            }
            if (parcel.readInt() == 0) {
                arrayList11 = null;
            } else {
                int readInt11 = parcel.readInt();
                ArrayList arrayList87 = new ArrayList(readInt11);
                int i11 = 0;
                while (i11 != readInt11) {
                    i11 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList87, i11, 1);
                }
                arrayList11 = arrayList87;
            }
            if (parcel.readInt() == 0) {
                arrayList12 = null;
            } else {
                int readInt12 = parcel.readInt();
                ArrayList arrayList88 = new ArrayList(readInt12);
                int i12 = 0;
                while (i12 != readInt12) {
                    i12 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList88, i12, 1);
                }
                arrayList12 = arrayList88;
            }
            if (parcel.readInt() == 0) {
                arrayList13 = null;
            } else {
                int readInt13 = parcel.readInt();
                ArrayList arrayList89 = new ArrayList(readInt13);
                int i13 = 0;
                while (i13 != readInt13) {
                    i13 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList89, i13, 1);
                }
                arrayList13 = arrayList89;
            }
            if (parcel.readInt() == 0) {
                arrayList14 = null;
            } else {
                int readInt14 = parcel.readInt();
                ArrayList arrayList90 = new ArrayList(readInt14);
                int i14 = 0;
                while (i14 != readInt14) {
                    i14 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList90, i14, 1);
                }
                arrayList14 = arrayList90;
            }
            if (parcel.readInt() == 0) {
                arrayList15 = null;
            } else {
                int readInt15 = parcel.readInt();
                ArrayList arrayList91 = new ArrayList(readInt15);
                int i15 = 0;
                while (i15 != readInt15) {
                    i15 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList91, i15, 1);
                }
                arrayList15 = arrayList91;
            }
            if (parcel.readInt() == 0) {
                arrayList16 = null;
            } else {
                int readInt16 = parcel.readInt();
                ArrayList arrayList92 = new ArrayList(readInt16);
                int i16 = 0;
                while (i16 != readInt16) {
                    i16 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList92, i16, 1);
                }
                arrayList16 = arrayList92;
            }
            if (parcel.readInt() == 0) {
                arrayList17 = null;
            } else {
                int readInt17 = parcel.readInt();
                ArrayList arrayList93 = new ArrayList(readInt17);
                int i17 = 0;
                while (i17 != readInt17) {
                    i17 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList93, i17, 1);
                }
                arrayList17 = arrayList93;
            }
            if (parcel.readInt() == 0) {
                arrayList18 = null;
            } else {
                int readInt18 = parcel.readInt();
                ArrayList arrayList94 = new ArrayList(readInt18);
                int i18 = 0;
                while (i18 != readInt18) {
                    i18 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList94, i18, 1);
                }
                arrayList18 = arrayList94;
            }
            if (parcel.readInt() == 0) {
                arrayList19 = null;
            } else {
                int readInt19 = parcel.readInt();
                ArrayList arrayList95 = new ArrayList(readInt19);
                int i19 = 0;
                while (i19 != readInt19) {
                    i19 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList95, i19, 1);
                }
                arrayList19 = arrayList95;
            }
            if (parcel.readInt() == 0) {
                arrayList20 = null;
            } else {
                int readInt20 = parcel.readInt();
                ArrayList arrayList96 = new ArrayList(readInt20);
                int i20 = 0;
                while (i20 != readInt20) {
                    i20 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList96, i20, 1);
                }
                arrayList20 = arrayList96;
            }
            if (parcel.readInt() == 0) {
                arrayList21 = null;
            } else {
                int readInt21 = parcel.readInt();
                ArrayList arrayList97 = new ArrayList(readInt21);
                int i21 = 0;
                while (i21 != readInt21) {
                    i21 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList97, i21, 1);
                }
                arrayList21 = arrayList97;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt22 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt22);
                for (int i22 = 0; i22 != readInt22; i22++) {
                    linkedHashMap.put(Integer.valueOf(parcel.readInt()), parcel.readParcelable(CatalogExtraResponseObjectDto.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList22 = null;
            } else {
                int readInt23 = parcel.readInt();
                ArrayList arrayList98 = new ArrayList(readInt23);
                int i23 = 0;
                while (i23 != readInt23) {
                    i23 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList98, i23, 1);
                }
                arrayList22 = arrayList98;
            }
            if (parcel.readInt() == 0) {
                arrayList23 = null;
            } else {
                int readInt24 = parcel.readInt();
                ArrayList arrayList99 = new ArrayList(readInt24);
                int i24 = 0;
                while (i24 != readInt24) {
                    i24 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList99, i24, 1);
                }
                arrayList23 = arrayList99;
            }
            if (parcel.readInt() == 0) {
                arrayList24 = null;
            } else {
                int readInt25 = parcel.readInt();
                ArrayList arrayList100 = new ArrayList(readInt25);
                int i25 = 0;
                while (i25 != readInt25) {
                    i25 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList100, i25, 1);
                }
                arrayList24 = arrayList100;
            }
            if (parcel.readInt() == 0) {
                arrayList25 = null;
            } else {
                int readInt26 = parcel.readInt();
                ArrayList arrayList101 = new ArrayList(readInt26);
                int i26 = 0;
                while (i26 != readInt26) {
                    i26 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList101, i26, 1);
                }
                arrayList25 = arrayList101;
            }
            if (parcel.readInt() == 0) {
                arrayList26 = null;
            } else {
                int readInt27 = parcel.readInt();
                ArrayList arrayList102 = new ArrayList(readInt27);
                int i27 = 0;
                while (i27 != readInt27) {
                    i27 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList102, i27, 1);
                }
                arrayList26 = arrayList102;
            }
            if (parcel.readInt() == 0) {
                arrayList27 = null;
            } else {
                int readInt28 = parcel.readInt();
                ArrayList arrayList103 = new ArrayList(readInt28);
                int i28 = 0;
                while (i28 != readInt28) {
                    i28 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList103, i28, 1);
                }
                arrayList27 = arrayList103;
            }
            if (parcel.readInt() == 0) {
                arrayList28 = null;
            } else {
                int readInt29 = parcel.readInt();
                ArrayList arrayList104 = new ArrayList(readInt29);
                int i29 = 0;
                while (i29 != readInt29) {
                    i29 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList104, i29, 1);
                }
                arrayList28 = arrayList104;
            }
            if (parcel.readInt() == 0) {
                arrayList29 = null;
            } else {
                int readInt30 = parcel.readInt();
                ArrayList arrayList105 = new ArrayList(readInt30);
                int i30 = 0;
                while (i30 != readInt30) {
                    i30 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList105, i30, 1);
                }
                arrayList29 = arrayList105;
            }
            if (parcel.readInt() == 0) {
                arrayList30 = null;
            } else {
                int readInt31 = parcel.readInt();
                ArrayList arrayList106 = new ArrayList(readInt31);
                int i31 = 0;
                while (i31 != readInt31) {
                    i31 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList106, i31, 1);
                }
                arrayList30 = arrayList106;
            }
            if (parcel.readInt() == 0) {
                arrayList31 = null;
            } else {
                int readInt32 = parcel.readInt();
                ArrayList arrayList107 = new ArrayList(readInt32);
                int i32 = 0;
                while (i32 != readInt32) {
                    i32 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList107, i32, 1);
                }
                arrayList31 = arrayList107;
            }
            if (parcel.readInt() == 0) {
                arrayList32 = null;
            } else {
                int readInt33 = parcel.readInt();
                ArrayList arrayList108 = new ArrayList(readInt33);
                int i33 = 0;
                while (i33 != readInt33) {
                    i33 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList108, i33, 1);
                }
                arrayList32 = arrayList108;
            }
            if (parcel.readInt() == 0) {
                arrayList33 = null;
            } else {
                int readInt34 = parcel.readInt();
                ArrayList arrayList109 = new ArrayList(readInt34);
                int i34 = 0;
                while (i34 != readInt34) {
                    i34 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList109, i34, 1);
                }
                arrayList33 = arrayList109;
            }
            if (parcel.readInt() == 0) {
                arrayList34 = null;
            } else {
                int readInt35 = parcel.readInt();
                ArrayList arrayList110 = new ArrayList(readInt35);
                int i35 = 0;
                while (i35 != readInt35) {
                    i35 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList110, i35, 1);
                }
                arrayList34 = arrayList110;
            }
            if (parcel.readInt() == 0) {
                arrayList35 = null;
            } else {
                int readInt36 = parcel.readInt();
                ArrayList arrayList111 = new ArrayList(readInt36);
                int i36 = 0;
                while (i36 != readInt36) {
                    i36 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList111, i36, 1);
                }
                arrayList35 = arrayList111;
            }
            if (parcel.readInt() == 0) {
                arrayList36 = null;
            } else {
                int readInt37 = parcel.readInt();
                ArrayList arrayList112 = new ArrayList(readInt37);
                int i37 = 0;
                while (i37 != readInt37) {
                    i37 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList112, i37, 1);
                }
                arrayList36 = arrayList112;
            }
            if (parcel.readInt() == 0) {
                arrayList37 = null;
            } else {
                int readInt38 = parcel.readInt();
                ArrayList arrayList113 = new ArrayList(readInt38);
                int i38 = 0;
                while (i38 != readInt38) {
                    i38 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList113, i38, 1);
                }
                arrayList37 = arrayList113;
            }
            if (parcel.readInt() == 0) {
                arrayList38 = null;
            } else {
                int readInt39 = parcel.readInt();
                ArrayList arrayList114 = new ArrayList(readInt39);
                int i39 = 0;
                while (i39 != readInt39) {
                    i39 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList114, i39, 1);
                }
                arrayList38 = arrayList114;
            }
            if (parcel.readInt() == 0) {
                arrayList39 = null;
            } else {
                int readInt40 = parcel.readInt();
                ArrayList arrayList115 = new ArrayList(readInt40);
                int i40 = 0;
                while (i40 != readInt40) {
                    i40 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList115, i40, 1);
                }
                arrayList39 = arrayList115;
            }
            if (parcel.readInt() == 0) {
                arrayList40 = null;
            } else {
                int readInt41 = parcel.readInt();
                ArrayList arrayList116 = new ArrayList(readInt41);
                int i41 = 0;
                while (i41 != readInt41) {
                    i41 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList116, i41, 1);
                }
                arrayList40 = arrayList116;
            }
            if (parcel.readInt() == 0) {
                arrayList41 = null;
            } else {
                int readInt42 = parcel.readInt();
                ArrayList arrayList117 = new ArrayList(readInt42);
                int i42 = 0;
                while (i42 != readInt42) {
                    i42 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList117, i42, 1);
                }
                arrayList41 = arrayList117;
            }
            if (parcel.readInt() == 0) {
                arrayList42 = null;
            } else {
                int readInt43 = parcel.readInt();
                ArrayList arrayList118 = new ArrayList(readInt43);
                int i43 = 0;
                while (i43 != readInt43) {
                    i43 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList118, i43, 1);
                }
                arrayList42 = arrayList118;
            }
            if (parcel.readInt() == 0) {
                arrayList43 = null;
            } else {
                int readInt44 = parcel.readInt();
                ArrayList arrayList119 = new ArrayList(readInt44);
                int i44 = 0;
                while (i44 != readInt44) {
                    i44 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList119, i44, 1);
                }
                arrayList43 = arrayList119;
            }
            if (parcel.readInt() == 0) {
                arrayList44 = null;
            } else {
                int readInt45 = parcel.readInt();
                ArrayList arrayList120 = new ArrayList(readInt45);
                int i45 = 0;
                while (i45 != readInt45) {
                    i45 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList120, i45, 1);
                }
                arrayList44 = arrayList120;
            }
            if (parcel.readInt() == 0) {
                arrayList45 = null;
            } else {
                int readInt46 = parcel.readInt();
                ArrayList arrayList121 = new ArrayList(readInt46);
                int i46 = 0;
                while (i46 != readInt46) {
                    i46 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList121, i46, 1);
                }
                arrayList45 = arrayList121;
            }
            if (parcel.readInt() == 0) {
                arrayList46 = null;
            } else {
                int readInt47 = parcel.readInt();
                ArrayList arrayList122 = new ArrayList(readInt47);
                int i47 = 0;
                while (i47 != readInt47) {
                    i47 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList122, i47, 1);
                }
                arrayList46 = arrayList122;
            }
            if (parcel.readInt() == 0) {
                arrayList47 = null;
            } else {
                int readInt48 = parcel.readInt();
                ArrayList arrayList123 = new ArrayList(readInt48);
                int i48 = 0;
                while (i48 != readInt48) {
                    i48 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList123, i48, 1);
                }
                arrayList47 = arrayList123;
            }
            if (parcel.readInt() == 0) {
                arrayList48 = null;
            } else {
                int readInt49 = parcel.readInt();
                ArrayList arrayList124 = new ArrayList(readInt49);
                int i49 = 0;
                while (i49 != readInt49) {
                    i49 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList124, i49, 1);
                }
                arrayList48 = arrayList124;
            }
            if (parcel.readInt() == 0) {
                arrayList49 = null;
            } else {
                int readInt50 = parcel.readInt();
                ArrayList arrayList125 = new ArrayList(readInt50);
                int i50 = 0;
                while (i50 != readInt50) {
                    i50 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList125, i50, 1);
                }
                arrayList49 = arrayList125;
            }
            if (parcel.readInt() == 0) {
                arrayList50 = null;
            } else {
                int readInt51 = parcel.readInt();
                ArrayList arrayList126 = new ArrayList(readInt51);
                int i51 = 0;
                while (i51 != readInt51) {
                    i51 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList126, i51, 1);
                }
                arrayList50 = arrayList126;
            }
            if (parcel.readInt() == 0) {
                arrayList51 = null;
            } else {
                int readInt52 = parcel.readInt();
                ArrayList arrayList127 = new ArrayList(readInt52);
                int i52 = 0;
                while (i52 != readInt52) {
                    i52 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList127, i52, 1);
                }
                arrayList51 = arrayList127;
            }
            if (parcel.readInt() == 0) {
                arrayList52 = null;
            } else {
                int readInt53 = parcel.readInt();
                ArrayList arrayList128 = new ArrayList(readInt53);
                int i53 = 0;
                while (i53 != readInt53) {
                    i53 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList128, i53, 1);
                }
                arrayList52 = arrayList128;
            }
            if (parcel.readInt() == 0) {
                arrayList53 = null;
            } else {
                int readInt54 = parcel.readInt();
                ArrayList arrayList129 = new ArrayList(readInt54);
                int i54 = 0;
                while (i54 != readInt54) {
                    i54 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList129, i54, 1);
                }
                arrayList53 = arrayList129;
            }
            if (parcel.readInt() == 0) {
                arrayList54 = null;
            } else {
                int readInt55 = parcel.readInt();
                ArrayList arrayList130 = new ArrayList(readInt55);
                int i55 = 0;
                while (i55 != readInt55) {
                    i55 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList130, i55, 1);
                }
                arrayList54 = arrayList130;
            }
            if (parcel.readInt() == 0) {
                arrayList55 = null;
            } else {
                int readInt56 = parcel.readInt();
                ArrayList arrayList131 = new ArrayList(readInt56);
                int i56 = 0;
                while (i56 != readInt56) {
                    i56 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList131, i56, 1);
                }
                arrayList55 = arrayList131;
            }
            if (parcel.readInt() == 0) {
                arrayList56 = null;
            } else {
                int readInt57 = parcel.readInt();
                ArrayList arrayList132 = new ArrayList(readInt57);
                int i57 = 0;
                while (i57 != readInt57) {
                    i57 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList132, i57, 1);
                }
                arrayList56 = arrayList132;
            }
            if (parcel.readInt() == 0) {
                arrayList57 = null;
            } else {
                int readInt58 = parcel.readInt();
                ArrayList arrayList133 = new ArrayList(readInt58);
                int i58 = 0;
                while (i58 != readInt58) {
                    i58 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList133, i58, 1);
                }
                arrayList57 = arrayList133;
            }
            if (parcel.readInt() == 0) {
                arrayList58 = null;
            } else {
                int readInt59 = parcel.readInt();
                ArrayList arrayList134 = new ArrayList(readInt59);
                int i59 = 0;
                while (i59 != readInt59) {
                    i59 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList134, i59, 1);
                }
                arrayList58 = arrayList134;
            }
            if (parcel.readInt() == 0) {
                arrayList59 = null;
            } else {
                int readInt60 = parcel.readInt();
                ArrayList arrayList135 = new ArrayList(readInt60);
                int i60 = 0;
                while (i60 != readInt60) {
                    i60 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList135, i60, 1);
                }
                arrayList59 = arrayList135;
            }
            if (parcel.readInt() == 0) {
                arrayList60 = null;
            } else {
                int readInt61 = parcel.readInt();
                ArrayList arrayList136 = new ArrayList(readInt61);
                int i61 = 0;
                while (i61 != readInt61) {
                    i61 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList136, i61, 1);
                }
                arrayList60 = arrayList136;
            }
            if (parcel.readInt() == 0) {
                arrayList61 = null;
            } else {
                int readInt62 = parcel.readInt();
                ArrayList arrayList137 = new ArrayList(readInt62);
                int i62 = 0;
                while (i62 != readInt62) {
                    i62 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList137, i62, 1);
                }
                arrayList61 = arrayList137;
            }
            if (parcel.readInt() == 0) {
                arrayList62 = null;
            } else {
                int readInt63 = parcel.readInt();
                ArrayList arrayList138 = new ArrayList(readInt63);
                int i63 = 0;
                while (i63 != readInt63) {
                    i63 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList138, i63, 1);
                }
                arrayList62 = arrayList138;
            }
            if (parcel.readInt() == 0) {
                arrayList63 = null;
            } else {
                int readInt64 = parcel.readInt();
                ArrayList arrayList139 = new ArrayList(readInt64);
                int i64 = 0;
                while (i64 != readInt64) {
                    i64 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList139, i64, 1);
                }
                arrayList63 = arrayList139;
            }
            if (parcel.readInt() == 0) {
                arrayList64 = null;
            } else {
                int readInt65 = parcel.readInt();
                ArrayList arrayList140 = new ArrayList(readInt65);
                int i65 = 0;
                while (i65 != readInt65) {
                    i65 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList140, i65, 1);
                }
                arrayList64 = arrayList140;
            }
            if (parcel.readInt() == 0) {
                arrayList65 = null;
            } else {
                int readInt66 = parcel.readInt();
                ArrayList arrayList141 = new ArrayList(readInt66);
                int i66 = 0;
                while (i66 != readInt66) {
                    i66 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList141, i66, 1);
                }
                arrayList65 = arrayList141;
            }
            if (parcel.readInt() == 0) {
                arrayList66 = null;
            } else {
                int readInt67 = parcel.readInt();
                ArrayList arrayList142 = new ArrayList(readInt67);
                int i67 = 0;
                while (i67 != readInt67) {
                    i67 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList142, i67, 1);
                }
                arrayList66 = arrayList142;
            }
            if (parcel.readInt() == 0) {
                arrayList67 = null;
            } else {
                int readInt68 = parcel.readInt();
                ArrayList arrayList143 = new ArrayList(readInt68);
                int i68 = 0;
                while (i68 != readInt68) {
                    i68 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList143, i68, 1);
                }
                arrayList67 = arrayList143;
            }
            if (parcel.readInt() == 0) {
                arrayList68 = null;
            } else {
                int readInt69 = parcel.readInt();
                ArrayList arrayList144 = new ArrayList(readInt69);
                int i69 = 0;
                while (i69 != readInt69) {
                    i69 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList144, i69, 1);
                }
                arrayList68 = arrayList144;
            }
            if (parcel.readInt() == 0) {
                arrayList69 = null;
            } else {
                int readInt70 = parcel.readInt();
                ArrayList arrayList145 = new ArrayList(readInt70);
                int i70 = 0;
                while (i70 != readInt70) {
                    i70 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList145, i70, 1);
                }
                arrayList69 = arrayList145;
            }
            if (parcel.readInt() == 0) {
                arrayList70 = null;
            } else {
                int readInt71 = parcel.readInt();
                ArrayList arrayList146 = new ArrayList(readInt71);
                int i71 = 0;
                while (i71 != readInt71) {
                    i71 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList146, i71, 1);
                }
                arrayList70 = arrayList146;
            }
            if (parcel.readInt() == 0) {
                arrayList71 = null;
            } else {
                int readInt72 = parcel.readInt();
                ArrayList arrayList147 = new ArrayList(readInt72);
                int i72 = 0;
                while (i72 != readInt72) {
                    i72 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList147, i72, 1);
                }
                arrayList71 = arrayList147;
            }
            if (parcel.readInt() == 0) {
                arrayList72 = null;
            } else {
                int readInt73 = parcel.readInt();
                ArrayList arrayList148 = new ArrayList(readInt73);
                int i73 = 0;
                while (i73 != readInt73) {
                    i73 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList148, i73, 1);
                }
                arrayList72 = arrayList148;
            }
            if (parcel.readInt() == 0) {
                arrayList73 = null;
            } else {
                int readInt74 = parcel.readInt();
                ArrayList arrayList149 = new ArrayList(readInt74);
                int i74 = 0;
                while (i74 != readInt74) {
                    i74 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList149, i74, 1);
                }
                arrayList73 = arrayList149;
            }
            if (parcel.readInt() == 0) {
                arrayList74 = null;
            } else {
                int readInt75 = parcel.readInt();
                ArrayList arrayList150 = new ArrayList(readInt75);
                int i75 = 0;
                while (i75 != readInt75) {
                    i75 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList150, i75, 1);
                }
                arrayList74 = arrayList150;
            }
            if (parcel.readInt() == 0) {
                arrayList75 = null;
            } else {
                int readInt76 = parcel.readInt();
                ArrayList arrayList151 = new ArrayList(readInt76);
                int i76 = 0;
                while (i76 != readInt76) {
                    i76 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList151, i76, 1);
                }
                arrayList75 = arrayList151;
            }
            if (parcel.readInt() != 0) {
                int readInt77 = parcel.readInt();
                arrayList76 = new ArrayList(readInt77);
                int i77 = 0;
                while (i77 != readInt77) {
                    i77 = bo.b(CatalogExtraResponseObjectDto.class, parcel, arrayList76, i77, 1);
                }
            }
            return new CatalogExtraResponseObjectDto(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10, arrayList11, arrayList12, arrayList13, arrayList14, arrayList15, arrayList16, arrayList17, arrayList18, arrayList19, arrayList20, arrayList21, linkedHashMap, arrayList22, arrayList23, arrayList24, arrayList25, arrayList26, arrayList27, arrayList28, arrayList29, arrayList30, arrayList31, arrayList32, arrayList33, arrayList34, arrayList35, arrayList36, arrayList37, arrayList38, arrayList39, arrayList40, arrayList41, arrayList42, arrayList43, arrayList44, arrayList45, arrayList46, arrayList47, arrayList48, arrayList49, arrayList50, arrayList51, arrayList52, arrayList53, arrayList54, arrayList55, arrayList56, arrayList57, arrayList58, arrayList59, arrayList60, arrayList61, arrayList62, arrayList63, arrayList64, arrayList65, arrayList66, arrayList67, arrayList68, arrayList69, arrayList70, arrayList71, arrayList72, arrayList73, arrayList74, arrayList75, arrayList76);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogExtraResponseObjectDto[] newArray(int i) {
            return new CatalogExtraResponseObjectDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogExtraResponseObjectDto(List<AudioStreamMixCatalogItemDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, List<BadgesBadgeDto> list4, List<? extends WallWallItemDto> list5, List<AudioSearchSuggestionDto> list6, List<VideoVideoFullDto> list7, List<CatalogCatalogVideoDto> list8, List<VideoVideoFullDto> list9, List<CatalogCatalogLinkDto> list10, List<BaseLinkDto> list11, List<MusicOwnerDto> list12, List<ArticlesArticleDto> list13, List<VideoVideoAlbumFullDto> list14, List<AudioAudioDto> list15, List<ShortVideoAudioDto> list16, List<AudioRecommendedPlaylistDto> list17, List<AudioRadioStationDto> list18, List<MediaPopupDto> list19, List<AudioPhotoDto> list20, List<AudioPlaylistDto> list21, Map<Integer, StoreStockItemDto> map, List<StickersPackPreviewDto> list22, List<StickersCatalogBannerDto> list23, List<StickersCatalogInfoDto> list24, List<CatalogUserItemDto> list25, List<StickersCatalogNotificationDto> list26, List<AudioArtistDto> list27, List<AudioFollowingsUpdateInfoDto> list28, List<AudioFollowingsUpdateItemDto> list29, List<AudioSignalCommonInfoDto> list30, List<AudioCuratorDto> list31, List<GroupsChatDto> list32, List<VideoVideoFullDto> list33, List<CatalogBannerDto> list34, List<ClassifiedsYoulaCityDto> list35, List<MarketClassifiedInfoDto> list36, List<MarketMarketCategoryTreeDto> list37, List<MarketMarketCategoryMappingDto> list38, List<MarketMarketSearchQueryDto> list39, List<MarketMarketItemDto> list40, List<MarketGroupCatalogItemDto> list41, List<MarketNavigationTabDto> list42, List<MarketOrderDto> list43, List<MarketUserReviewsItemsReviewDto> list44, List<MarketItemForReviewDto> list45, List<MarketCommunityReviewDto> list46, List<MarketAbandonedCartDto> list47, List<CatalogTextDto> list48, List<ArticlesArticleDto> list49, List<AudioAudioDto> list50, List<PodcastSliderItemDto> list51, List<PodcastPodcastDto> list52, List<PodcastExtendedPodcastDto> list53, List<AudioAudioContentCardDto> list54, List<AudioBooksAudioBookDto> list55, List<AudioBooksItemPersonDto> list56, List<PodcastEpisodeWithLikedFriendsDto> list57, List<CatalogHintDto> list58, List<CatalogFriendsLikesItemDto> list59, List<AppsAppDto> list60, List<AppsAppDto> list61, List<SearchSuggestionItemDto> list62, List<SearchFilterItemDto> list63, List<CatalogNewsfeedItemWithIdDto> list64, List<GroupsCollectionItemDto> list65, List<CatalogGroupCategoryItemDto> list66, List<LikesReactionSetDto> list67, List<MarketSearchSpellCheckResultDto> list68, List<MarketSearchQueryClassifierSuggestionDto> list69, List<SearchSpellcheckerDto> list70, List<MarketIntegrationsInfoBlockCatalogDto> list71, List<? extends SearchEntityItemDto> list72, List<FeedbacksFeedbackDto> list73, List<VideoVkliveChannelDto> list74, List<VideoVkliveCategoryDto> list75, List<CatalogVideoMovieDto> list76) {
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
        this.g = list6;
        this.h = list7;
        this.i = list8;
        this.j = list9;
        this.k = list10;
        this.l = list11;
        this.m = list12;
        this.n = list13;
        this.o = list14;
        this.p = list15;
        this.q = list16;
        this.r = list17;
        this.s = list18;
        this.t = list19;
        this.u = list20;
        this.v = list21;
        this.w = map;
        this.x = list22;
        this.y = list23;
        this.z = list24;
        this.A = list25;
        this.B = list26;
        this.C = list27;
        this.D = list28;
        this.E = list29;
        this.F = list30;
        this.G = list31;
        this.H = list32;
        this.I = list33;
        this.J = list34;
        this.K = list35;
        this.L = list36;
        this.M = list37;
        this.N = list38;
        this.O = list39;
        this.P = list40;
        this.Q = list41;
        this.R = list42;
        this.S = list43;
        this.T = list44;
        this.U = list45;
        this.V = list46;
        this.W = list47;
        this.X = list48;
        this.Y = list49;
        this.Z = list50;
        this.a0 = list51;
        this.b0 = list52;
        this.c0 = list53;
        this.d0 = list54;
        this.e0 = list55;
        this.f0 = list56;
        this.g0 = list57;
        this.h0 = list58;
        this.i0 = list59;
        this.j0 = list60;
        this.k0 = list61;
        this.l0 = list62;
        this.m0 = list63;
        this.n0 = list64;
        this.o0 = list65;
        this.p0 = list66;
        this.q0 = list67;
        this.r0 = list68;
        this.s0 = list69;
        this.t0 = list70;
        this.u0 = list71;
        this.v0 = list72;
        this.w0 = list73;
        this.x0 = list74;
        this.y0 = list75;
        this.z0 = list76;
    }

    public final List<VideoVideoAlbumFullDto> d() {
        return this.o;
    }

    public final List<AudioPlaylistDto> d0() {
        return this.v;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<AudioArtistDto> e() {
        return this.C;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogExtraResponseObjectDto)) {
            return false;
        }
        CatalogExtraResponseObjectDto catalogExtraResponseObjectDto = (CatalogExtraResponseObjectDto) obj;
        return epx.f(this.b, catalogExtraResponseObjectDto.b) && epx.f(this.c, catalogExtraResponseObjectDto.c) && epx.f(this.d, catalogExtraResponseObjectDto.d) && epx.f(this.e, catalogExtraResponseObjectDto.e) && epx.f(this.f, catalogExtraResponseObjectDto.f) && epx.f(this.g, catalogExtraResponseObjectDto.g) && epx.f(this.h, catalogExtraResponseObjectDto.h) && epx.f(this.i, catalogExtraResponseObjectDto.i) && epx.f(this.j, catalogExtraResponseObjectDto.j) && epx.f(this.k, catalogExtraResponseObjectDto.k) && epx.f(this.l, catalogExtraResponseObjectDto.l) && epx.f(this.m, catalogExtraResponseObjectDto.m) && epx.f(this.n, catalogExtraResponseObjectDto.n) && epx.f(this.o, catalogExtraResponseObjectDto.o) && epx.f(this.p, catalogExtraResponseObjectDto.p) && epx.f(this.q, catalogExtraResponseObjectDto.q) && epx.f(this.r, catalogExtraResponseObjectDto.r) && epx.f(this.s, catalogExtraResponseObjectDto.s) && epx.f(this.t, catalogExtraResponseObjectDto.t) && epx.f(this.u, catalogExtraResponseObjectDto.u) && epx.f(this.v, catalogExtraResponseObjectDto.v) && epx.f(this.w, catalogExtraResponseObjectDto.w) && epx.f(this.x, catalogExtraResponseObjectDto.x) && epx.f(this.y, catalogExtraResponseObjectDto.y) && epx.f(this.z, catalogExtraResponseObjectDto.z) && epx.f(this.A, catalogExtraResponseObjectDto.A) && epx.f(this.B, catalogExtraResponseObjectDto.B) && epx.f(this.C, catalogExtraResponseObjectDto.C) && epx.f(this.D, catalogExtraResponseObjectDto.D) && epx.f(this.E, catalogExtraResponseObjectDto.E) && epx.f(this.F, catalogExtraResponseObjectDto.F) && epx.f(this.G, catalogExtraResponseObjectDto.G) && epx.f(this.H, catalogExtraResponseObjectDto.H) && epx.f(this.I, catalogExtraResponseObjectDto.I) && epx.f(this.J, catalogExtraResponseObjectDto.J) && epx.f(this.K, catalogExtraResponseObjectDto.K) && epx.f(this.L, catalogExtraResponseObjectDto.L) && epx.f(this.M, catalogExtraResponseObjectDto.M) && epx.f(this.N, catalogExtraResponseObjectDto.N) && epx.f(this.O, catalogExtraResponseObjectDto.O) && epx.f(this.P, catalogExtraResponseObjectDto.P) && epx.f(this.Q, catalogExtraResponseObjectDto.Q) && epx.f(this.R, catalogExtraResponseObjectDto.R) && epx.f(this.S, catalogExtraResponseObjectDto.S) && epx.f(this.T, catalogExtraResponseObjectDto.T) && epx.f(this.U, catalogExtraResponseObjectDto.U) && epx.f(this.V, catalogExtraResponseObjectDto.V) && epx.f(this.W, catalogExtraResponseObjectDto.W) && epx.f(this.X, catalogExtraResponseObjectDto.X) && epx.f(this.Y, catalogExtraResponseObjectDto.Y) && epx.f(this.Z, catalogExtraResponseObjectDto.Z) && epx.f(this.a0, catalogExtraResponseObjectDto.a0) && epx.f(this.b0, catalogExtraResponseObjectDto.b0) && epx.f(this.c0, catalogExtraResponseObjectDto.c0) && epx.f(this.d0, catalogExtraResponseObjectDto.d0) && epx.f(this.e0, catalogExtraResponseObjectDto.e0) && epx.f(this.f0, catalogExtraResponseObjectDto.f0) && epx.f(this.g0, catalogExtraResponseObjectDto.g0) && epx.f(this.h0, catalogExtraResponseObjectDto.h0) && epx.f(this.i0, catalogExtraResponseObjectDto.i0) && epx.f(this.j0, catalogExtraResponseObjectDto.j0) && epx.f(this.k0, catalogExtraResponseObjectDto.k0) && epx.f(this.l0, catalogExtraResponseObjectDto.l0) && epx.f(this.m0, catalogExtraResponseObjectDto.m0) && epx.f(this.n0, catalogExtraResponseObjectDto.n0) && epx.f(this.o0, catalogExtraResponseObjectDto.o0) && epx.f(this.p0, catalogExtraResponseObjectDto.p0) && epx.f(this.q0, catalogExtraResponseObjectDto.q0) && epx.f(this.r0, catalogExtraResponseObjectDto.r0) && epx.f(this.s0, catalogExtraResponseObjectDto.s0) && epx.f(this.t0, catalogExtraResponseObjectDto.t0) && epx.f(this.u0, catalogExtraResponseObjectDto.u0) && epx.f(this.v0, catalogExtraResponseObjectDto.v0) && epx.f(this.w0, catalogExtraResponseObjectDto.w0) && epx.f(this.x0, catalogExtraResponseObjectDto.x0) && epx.f(this.y0, catalogExtraResponseObjectDto.y0) && epx.f(this.z0, catalogExtraResponseObjectDto.z0);
    }

    public final List<CatalogBannerDto> f() {
        return this.J;
    }

    public final List<GroupsGroupFullDto> g() {
        return this.d;
    }

    public final int hashCode() {
        List<AudioStreamMixCatalogItemDto> list = this.b;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<UsersUserFullDto> list2 = this.c;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFullDto> list3 = this.d;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<BadgesBadgeDto> list4 = this.e;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<WallWallItemDto> list5 = this.f;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<AudioSearchSuggestionDto> list6 = this.g;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<VideoVideoFullDto> list7 = this.h;
        int hashCode7 = (hashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<CatalogCatalogVideoDto> list8 = this.i;
        int hashCode8 = (hashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<VideoVideoFullDto> list9 = this.j;
        int hashCode9 = (hashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<CatalogCatalogLinkDto> list10 = this.k;
        int hashCode10 = (hashCode9 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<BaseLinkDto> list11 = this.l;
        int hashCode11 = (hashCode10 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<MusicOwnerDto> list12 = this.m;
        int hashCode12 = (hashCode11 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<ArticlesArticleDto> list13 = this.n;
        int hashCode13 = (hashCode12 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<VideoVideoAlbumFullDto> list14 = this.o;
        int hashCode14 = (hashCode13 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<AudioAudioDto> list15 = this.p;
        int hashCode15 = (hashCode14 + (list15 == null ? 0 : list15.hashCode())) * 31;
        List<ShortVideoAudioDto> list16 = this.q;
        int hashCode16 = (hashCode15 + (list16 == null ? 0 : list16.hashCode())) * 31;
        List<AudioRecommendedPlaylistDto> list17 = this.r;
        int hashCode17 = (hashCode16 + (list17 == null ? 0 : list17.hashCode())) * 31;
        List<AudioRadioStationDto> list18 = this.s;
        int hashCode18 = (hashCode17 + (list18 == null ? 0 : list18.hashCode())) * 31;
        List<MediaPopupDto> list19 = this.t;
        int hashCode19 = (hashCode18 + (list19 == null ? 0 : list19.hashCode())) * 31;
        List<AudioPhotoDto> list20 = this.u;
        int hashCode20 = (hashCode19 + (list20 == null ? 0 : list20.hashCode())) * 31;
        List<AudioPlaylistDto> list21 = this.v;
        int hashCode21 = (hashCode20 + (list21 == null ? 0 : list21.hashCode())) * 31;
        Map<Integer, StoreStockItemDto> map = this.w;
        int hashCode22 = (hashCode21 + (map == null ? 0 : map.hashCode())) * 31;
        List<StickersPackPreviewDto> list22 = this.x;
        int hashCode23 = (hashCode22 + (list22 == null ? 0 : list22.hashCode())) * 31;
        List<StickersCatalogBannerDto> list23 = this.y;
        int hashCode24 = (hashCode23 + (list23 == null ? 0 : list23.hashCode())) * 31;
        List<StickersCatalogInfoDto> list24 = this.z;
        int hashCode25 = (hashCode24 + (list24 == null ? 0 : list24.hashCode())) * 31;
        List<CatalogUserItemDto> list25 = this.A;
        int hashCode26 = (hashCode25 + (list25 == null ? 0 : list25.hashCode())) * 31;
        List<StickersCatalogNotificationDto> list26 = this.B;
        int hashCode27 = (hashCode26 + (list26 == null ? 0 : list26.hashCode())) * 31;
        List<AudioArtistDto> list27 = this.C;
        int hashCode28 = (hashCode27 + (list27 == null ? 0 : list27.hashCode())) * 31;
        List<AudioFollowingsUpdateInfoDto> list28 = this.D;
        int hashCode29 = (hashCode28 + (list28 == null ? 0 : list28.hashCode())) * 31;
        List<AudioFollowingsUpdateItemDto> list29 = this.E;
        int hashCode30 = (hashCode29 + (list29 == null ? 0 : list29.hashCode())) * 31;
        List<AudioSignalCommonInfoDto> list30 = this.F;
        int hashCode31 = (hashCode30 + (list30 == null ? 0 : list30.hashCode())) * 31;
        List<AudioCuratorDto> list31 = this.G;
        int hashCode32 = (hashCode31 + (list31 == null ? 0 : list31.hashCode())) * 31;
        List<GroupsChatDto> list32 = this.H;
        int hashCode33 = (hashCode32 + (list32 == null ? 0 : list32.hashCode())) * 31;
        List<VideoVideoFullDto> list33 = this.I;
        int hashCode34 = (hashCode33 + (list33 == null ? 0 : list33.hashCode())) * 31;
        List<CatalogBannerDto> list34 = this.J;
        int hashCode35 = (hashCode34 + (list34 == null ? 0 : list34.hashCode())) * 31;
        List<ClassifiedsYoulaCityDto> list35 = this.K;
        int hashCode36 = (hashCode35 + (list35 == null ? 0 : list35.hashCode())) * 31;
        List<MarketClassifiedInfoDto> list36 = this.L;
        int hashCode37 = (hashCode36 + (list36 == null ? 0 : list36.hashCode())) * 31;
        List<MarketMarketCategoryTreeDto> list37 = this.M;
        int hashCode38 = (hashCode37 + (list37 == null ? 0 : list37.hashCode())) * 31;
        List<MarketMarketCategoryMappingDto> list38 = this.N;
        int hashCode39 = (hashCode38 + (list38 == null ? 0 : list38.hashCode())) * 31;
        List<MarketMarketSearchQueryDto> list39 = this.O;
        int hashCode40 = (hashCode39 + (list39 == null ? 0 : list39.hashCode())) * 31;
        List<MarketMarketItemDto> list40 = this.P;
        int hashCode41 = (hashCode40 + (list40 == null ? 0 : list40.hashCode())) * 31;
        List<MarketGroupCatalogItemDto> list41 = this.Q;
        int hashCode42 = (hashCode41 + (list41 == null ? 0 : list41.hashCode())) * 31;
        List<MarketNavigationTabDto> list42 = this.R;
        int hashCode43 = (hashCode42 + (list42 == null ? 0 : list42.hashCode())) * 31;
        List<MarketOrderDto> list43 = this.S;
        int hashCode44 = (hashCode43 + (list43 == null ? 0 : list43.hashCode())) * 31;
        List<MarketUserReviewsItemsReviewDto> list44 = this.T;
        int hashCode45 = (hashCode44 + (list44 == null ? 0 : list44.hashCode())) * 31;
        List<MarketItemForReviewDto> list45 = this.U;
        int hashCode46 = (hashCode45 + (list45 == null ? 0 : list45.hashCode())) * 31;
        List<MarketCommunityReviewDto> list46 = this.V;
        int hashCode47 = (hashCode46 + (list46 == null ? 0 : list46.hashCode())) * 31;
        List<MarketAbandonedCartDto> list47 = this.W;
        int hashCode48 = (hashCode47 + (list47 == null ? 0 : list47.hashCode())) * 31;
        List<CatalogTextDto> list48 = this.X;
        int hashCode49 = (hashCode48 + (list48 == null ? 0 : list48.hashCode())) * 31;
        List<ArticlesArticleDto> list49 = this.Y;
        int hashCode50 = (hashCode49 + (list49 == null ? 0 : list49.hashCode())) * 31;
        List<AudioAudioDto> list50 = this.Z;
        int hashCode51 = (hashCode50 + (list50 == null ? 0 : list50.hashCode())) * 31;
        List<PodcastSliderItemDto> list51 = this.a0;
        int hashCode52 = (hashCode51 + (list51 == null ? 0 : list51.hashCode())) * 31;
        List<PodcastPodcastDto> list52 = this.b0;
        int hashCode53 = (hashCode52 + (list52 == null ? 0 : list52.hashCode())) * 31;
        List<PodcastExtendedPodcastDto> list53 = this.c0;
        int hashCode54 = (hashCode53 + (list53 == null ? 0 : list53.hashCode())) * 31;
        List<AudioAudioContentCardDto> list54 = this.d0;
        int hashCode55 = (hashCode54 + (list54 == null ? 0 : list54.hashCode())) * 31;
        List<AudioBooksAudioBookDto> list55 = this.e0;
        int hashCode56 = (hashCode55 + (list55 == null ? 0 : list55.hashCode())) * 31;
        List<AudioBooksItemPersonDto> list56 = this.f0;
        int hashCode57 = (hashCode56 + (list56 == null ? 0 : list56.hashCode())) * 31;
        List<PodcastEpisodeWithLikedFriendsDto> list57 = this.g0;
        int hashCode58 = (hashCode57 + (list57 == null ? 0 : list57.hashCode())) * 31;
        List<CatalogHintDto> list58 = this.h0;
        int hashCode59 = (hashCode58 + (list58 == null ? 0 : list58.hashCode())) * 31;
        List<CatalogFriendsLikesItemDto> list59 = this.i0;
        int hashCode60 = (hashCode59 + (list59 == null ? 0 : list59.hashCode())) * 31;
        List<AppsAppDto> list60 = this.j0;
        int hashCode61 = (hashCode60 + (list60 == null ? 0 : list60.hashCode())) * 31;
        List<AppsAppDto> list61 = this.k0;
        int hashCode62 = (hashCode61 + (list61 == null ? 0 : list61.hashCode())) * 31;
        List<SearchSuggestionItemDto> list62 = this.l0;
        int hashCode63 = (hashCode62 + (list62 == null ? 0 : list62.hashCode())) * 31;
        List<SearchFilterItemDto> list63 = this.m0;
        int hashCode64 = (hashCode63 + (list63 == null ? 0 : list63.hashCode())) * 31;
        List<CatalogNewsfeedItemWithIdDto> list64 = this.n0;
        int hashCode65 = (hashCode64 + (list64 == null ? 0 : list64.hashCode())) * 31;
        List<GroupsCollectionItemDto> list65 = this.o0;
        int hashCode66 = (hashCode65 + (list65 == null ? 0 : list65.hashCode())) * 31;
        List<CatalogGroupCategoryItemDto> list66 = this.p0;
        int hashCode67 = (hashCode66 + (list66 == null ? 0 : list66.hashCode())) * 31;
        List<LikesReactionSetDto> list67 = this.q0;
        int hashCode68 = (hashCode67 + (list67 == null ? 0 : list67.hashCode())) * 31;
        List<MarketSearchSpellCheckResultDto> list68 = this.r0;
        int hashCode69 = (hashCode68 + (list68 == null ? 0 : list68.hashCode())) * 31;
        List<MarketSearchQueryClassifierSuggestionDto> list69 = this.s0;
        int hashCode70 = (hashCode69 + (list69 == null ? 0 : list69.hashCode())) * 31;
        List<SearchSpellcheckerDto> list70 = this.t0;
        int hashCode71 = (hashCode70 + (list70 == null ? 0 : list70.hashCode())) * 31;
        List<MarketIntegrationsInfoBlockCatalogDto> list71 = this.u0;
        int hashCode72 = (hashCode71 + (list71 == null ? 0 : list71.hashCode())) * 31;
        List<SearchEntityItemDto> list72 = this.v0;
        int hashCode73 = (hashCode72 + (list72 == null ? 0 : list72.hashCode())) * 31;
        List<FeedbacksFeedbackDto> list73 = this.w0;
        int hashCode74 = (hashCode73 + (list73 == null ? 0 : list73.hashCode())) * 31;
        List<VideoVkliveChannelDto> list74 = this.x0;
        int hashCode75 = (hashCode74 + (list74 == null ? 0 : list74.hashCode())) * 31;
        List<VideoVkliveCategoryDto> list75 = this.y0;
        int hashCode76 = (hashCode75 + (list75 == null ? 0 : list75.hashCode())) * 31;
        List<CatalogVideoMovieDto> list76 = this.z0;
        return hashCode76 + (list76 != null ? list76.hashCode() : 0);
    }

    public final List<CatalogHintDto> i() {
        return this.h0;
    }

    public final List<CatalogCatalogLinkDto> j() {
        return this.k;
    }

    public final List<CatalogVideoMovieDto> k() {
        return this.z0;
    }

    public final List<MediaPopupDto> l() {
        return this.t;
    }

    public final List<UsersUserFullDto> n() {
        return this.c;
    }

    public final List<AudioRecommendedPlaylistDto> o() {
        return this.r;
    }

    public final List<VideoVideoFullDto> p() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogExtraResponseObjectDto(audioStreamMixes=");
        sb.append(this.b);
        sb.append(", profiles=");
        sb.append(this.c);
        sb.append(", groups=");
        sb.append(this.d);
        sb.append(", badges=");
        sb.append(this.e);
        sb.append(", wallItems=");
        sb.append(this.f);
        sb.append(", suggestions=");
        sb.append(this.g);
        sb.append(", videos=");
        sb.append(this.h);
        sb.append(", catalogVideos=");
        sb.append(this.i);
        sb.append(", artistVideos=");
        sb.append(this.j);
        sb.append(", links=");
        sb.append(this.k);
        sb.append(", baseLinks=");
        sb.append(this.l);
        sb.append(", musicOwners=");
        sb.append(this.m);
        sb.append(", articles=");
        sb.append(this.n);
        sb.append(", albums=");
        sb.append(this.o);
        sb.append(", audios=");
        sb.append(this.p);
        sb.append(", shortVideoAudios=");
        sb.append(this.q);
        sb.append(", recommendedPlaylists=");
        sb.append(this.r);
        sb.append(", radioStations=");
        sb.append(this.s);
        sb.append(", placeholders=");
        sb.append(this.t);
        sb.append(", thumbs=");
        sb.append(this.u);
        sb.append(", playlists=");
        sb.append(this.v);
        sb.append(", stickersPacks=");
        sb.append(this.w);
        sb.append(", stickersPackPreviews=");
        sb.append(this.x);
        sb.append(", stickersBanners=");
        sb.append(this.y);
        sb.append(", stickersInfo=");
        sb.append(this.z);
        sb.append(", catalogUsers=");
        sb.append(this.A);
        sb.append(", stickersNotifications=");
        sb.append(this.B);
        sb.append(", artists=");
        sb.append(this.C);
        sb.append(", audioFollowingsUpdateInfo=");
        sb.append(this.D);
        sb.append(", audioFollowingsUpdateItem=");
        sb.append(this.E);
        sb.append(", audioSignalCommonInfo=");
        sb.append(this.F);
        sb.append(", curators=");
        sb.append(this.G);
        sb.append(", groupsChats=");
        sb.append(this.H);
        sb.append(", shoppingVideos=");
        sb.append(this.I);
        sb.append(", catalogBanners=");
        sb.append(this.J);
        sb.append(", classifiedsCities=");
        sb.append(this.K);
        sb.append(", classifiedsInfos=");
        sb.append(this.L);
        sb.append(", classifiedsCategoryTree=");
        sb.append(this.M);
        sb.append(", marketCategoryMappings=");
        sb.append(this.N);
        sb.append(", query=");
        sb.append(this.O);
        sb.append(", marketItems=");
        sb.append(this.P);
        sb.append(", groupCatalogItems=");
        sb.append(this.Q);
        sb.append(", navigationTabs=");
        sb.append(this.R);
        sb.append(", marketOrders=");
        sb.append(this.S);
        sb.append(", marketItemReviews=");
        sb.append(this.T);
        sb.append(", marketItemReviewPrepared=");
        sb.append(this.U);
        sb.append(", marketCommunityReviews=");
        sb.append(this.V);
        sb.append(", abandonedCarts=");
        sb.append(this.W);
        sb.append(", texts=");
        sb.append(this.X);
        sb.append(", longreads=");
        sb.append(this.Y);
        sb.append(", podcastEpisodes=");
        sb.append(this.Z);
        sb.append(", podcastSliderItems=");
        sb.append(this.a0);
        sb.append(", podcasts=");
        sb.append(this.b0);
        sb.append(", extendedPodcasts=");
        sb.append(this.c0);
        sb.append(", audioContentCards=");
        sb.append(this.d0);
        sb.append(", audioBooks=");
        sb.append(this.e0);
        sb.append(", audioBooksPersons=");
        sb.append(this.f0);
        sb.append(", friendsLikedEpisodes=");
        sb.append(this.g0);
        sb.append(", hints=");
        sb.append(this.h0);
        sb.append(", groupsFriendsLikes=");
        sb.append(this.i0);
        sb.append(", miniApps=");
        sb.append(this.j0);
        sb.append(", games=");
        sb.append(this.k0);
        sb.append(", searchSuggestions=");
        sb.append(this.l0);
        sb.append(", searchFilters=");
        sb.append(this.m0);
        sb.append(", newsfeedItems=");
        sb.append(this.n0);
        sb.append(", groupCollectionItems=");
        sb.append(this.o0);
        sb.append(", groupCategoryItems=");
        sb.append(this.p0);
        sb.append(", reactionSets=");
        sb.append(this.q0);
        sb.append(", marketSearchSpellCheckResult=");
        sb.append(this.r0);
        sb.append(", marketSearchClassifierResults=");
        sb.append(this.s0);
        sb.append(", searchSpellcheckers=");
        sb.append(this.t0);
        sb.append(", marketInfos=");
        sb.append(this.u0);
        sb.append(", searchEntityItems=");
        sb.append(this.v0);
        sb.append(", feedbacks=");
        sb.append(this.w0);
        sb.append(", vkliveChannels=");
        sb.append(this.x0);
        sb.append(", vkliveCategories=");
        sb.append(this.y0);
        sb.append(", movies=");
        return ms9.a(')', sb, this.z0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<AudioStreamMixCatalogItemDto> list = this.b;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<UsersUserFullDto> list2 = this.c;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<GroupsGroupFullDto> list3 = this.d;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        List<BadgesBadgeDto> list4 = this.e;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                parcel.writeParcelable((Parcelable) f4.next(), i);
            }
        }
        List<WallWallItemDto> list5 = this.f;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                parcel.writeParcelable((Parcelable) f5.next(), i);
            }
        }
        List<AudioSearchSuggestionDto> list6 = this.g;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list6, 1);
            while (f6.hasNext()) {
                parcel.writeParcelable((Parcelable) f6.next(), i);
            }
        }
        List<VideoVideoFullDto> list7 = this.h;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f7 = dn.f(parcel, list7, 1);
            while (f7.hasNext()) {
                parcel.writeParcelable((Parcelable) f7.next(), i);
            }
        }
        List<CatalogCatalogVideoDto> list8 = this.i;
        if (list8 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f8 = dn.f(parcel, list8, 1);
            while (f8.hasNext()) {
                parcel.writeParcelable((Parcelable) f8.next(), i);
            }
        }
        List<VideoVideoFullDto> list9 = this.j;
        if (list9 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f9 = dn.f(parcel, list9, 1);
            while (f9.hasNext()) {
                parcel.writeParcelable((Parcelable) f9.next(), i);
            }
        }
        List<CatalogCatalogLinkDto> list10 = this.k;
        if (list10 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f10 = dn.f(parcel, list10, 1);
            while (f10.hasNext()) {
                parcel.writeParcelable((Parcelable) f10.next(), i);
            }
        }
        List<BaseLinkDto> list11 = this.l;
        if (list11 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f11 = dn.f(parcel, list11, 1);
            while (f11.hasNext()) {
                parcel.writeParcelable((Parcelable) f11.next(), i);
            }
        }
        List<MusicOwnerDto> list12 = this.m;
        if (list12 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f12 = dn.f(parcel, list12, 1);
            while (f12.hasNext()) {
                parcel.writeParcelable((Parcelable) f12.next(), i);
            }
        }
        List<ArticlesArticleDto> list13 = this.n;
        if (list13 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f13 = dn.f(parcel, list13, 1);
            while (f13.hasNext()) {
                parcel.writeParcelable((Parcelable) f13.next(), i);
            }
        }
        List<VideoVideoAlbumFullDto> list14 = this.o;
        if (list14 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f14 = dn.f(parcel, list14, 1);
            while (f14.hasNext()) {
                parcel.writeParcelable((Parcelable) f14.next(), i);
            }
        }
        List<AudioAudioDto> list15 = this.p;
        if (list15 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f15 = dn.f(parcel, list15, 1);
            while (f15.hasNext()) {
                parcel.writeParcelable((Parcelable) f15.next(), i);
            }
        }
        List<ShortVideoAudioDto> list16 = this.q;
        if (list16 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f16 = dn.f(parcel, list16, 1);
            while (f16.hasNext()) {
                parcel.writeParcelable((Parcelable) f16.next(), i);
            }
        }
        List<AudioRecommendedPlaylistDto> list17 = this.r;
        if (list17 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f17 = dn.f(parcel, list17, 1);
            while (f17.hasNext()) {
                parcel.writeParcelable((Parcelable) f17.next(), i);
            }
        }
        List<AudioRadioStationDto> list18 = this.s;
        if (list18 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f18 = dn.f(parcel, list18, 1);
            while (f18.hasNext()) {
                parcel.writeParcelable((Parcelable) f18.next(), i);
            }
        }
        List<MediaPopupDto> list19 = this.t;
        if (list19 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f19 = dn.f(parcel, list19, 1);
            while (f19.hasNext()) {
                parcel.writeParcelable((Parcelable) f19.next(), i);
            }
        }
        List<AudioPhotoDto> list20 = this.u;
        if (list20 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f20 = dn.f(parcel, list20, 1);
            while (f20.hasNext()) {
                parcel.writeParcelable((Parcelable) f20.next(), i);
            }
        }
        List<AudioPlaylistDto> list21 = this.v;
        if (list21 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f21 = dn.f(parcel, list21, 1);
            while (f21.hasNext()) {
                parcel.writeParcelable((Parcelable) f21.next(), i);
            }
        }
        Map<Integer, StoreStockItemDto> map = this.w;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<Integer, StoreStockItemDto> entry : map.entrySet()) {
                parcel.writeInt(entry.getKey().intValue());
                parcel.writeParcelable(entry.getValue(), i);
            }
        }
        List<StickersPackPreviewDto> list22 = this.x;
        if (list22 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f22 = dn.f(parcel, list22, 1);
            while (f22.hasNext()) {
                parcel.writeParcelable((Parcelable) f22.next(), i);
            }
        }
        List<StickersCatalogBannerDto> list23 = this.y;
        if (list23 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f23 = dn.f(parcel, list23, 1);
            while (f23.hasNext()) {
                parcel.writeParcelable((Parcelable) f23.next(), i);
            }
        }
        List<StickersCatalogInfoDto> list24 = this.z;
        if (list24 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f24 = dn.f(parcel, list24, 1);
            while (f24.hasNext()) {
                parcel.writeParcelable((Parcelable) f24.next(), i);
            }
        }
        List<CatalogUserItemDto> list25 = this.A;
        if (list25 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f25 = dn.f(parcel, list25, 1);
            while (f25.hasNext()) {
                parcel.writeParcelable((Parcelable) f25.next(), i);
            }
        }
        List<StickersCatalogNotificationDto> list26 = this.B;
        if (list26 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f26 = dn.f(parcel, list26, 1);
            while (f26.hasNext()) {
                parcel.writeParcelable((Parcelable) f26.next(), i);
            }
        }
        List<AudioArtistDto> list27 = this.C;
        if (list27 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f27 = dn.f(parcel, list27, 1);
            while (f27.hasNext()) {
                parcel.writeParcelable((Parcelable) f27.next(), i);
            }
        }
        List<AudioFollowingsUpdateInfoDto> list28 = this.D;
        if (list28 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f28 = dn.f(parcel, list28, 1);
            while (f28.hasNext()) {
                parcel.writeParcelable((Parcelable) f28.next(), i);
            }
        }
        List<AudioFollowingsUpdateItemDto> list29 = this.E;
        if (list29 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f29 = dn.f(parcel, list29, 1);
            while (f29.hasNext()) {
                parcel.writeParcelable((Parcelable) f29.next(), i);
            }
        }
        List<AudioSignalCommonInfoDto> list30 = this.F;
        if (list30 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f30 = dn.f(parcel, list30, 1);
            while (f30.hasNext()) {
                parcel.writeParcelable((Parcelable) f30.next(), i);
            }
        }
        List<AudioCuratorDto> list31 = this.G;
        if (list31 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f31 = dn.f(parcel, list31, 1);
            while (f31.hasNext()) {
                parcel.writeParcelable((Parcelable) f31.next(), i);
            }
        }
        List<GroupsChatDto> list32 = this.H;
        if (list32 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f32 = dn.f(parcel, list32, 1);
            while (f32.hasNext()) {
                parcel.writeParcelable((Parcelable) f32.next(), i);
            }
        }
        List<VideoVideoFullDto> list33 = this.I;
        if (list33 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f33 = dn.f(parcel, list33, 1);
            while (f33.hasNext()) {
                parcel.writeParcelable((Parcelable) f33.next(), i);
            }
        }
        List<CatalogBannerDto> list34 = this.J;
        if (list34 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f34 = dn.f(parcel, list34, 1);
            while (f34.hasNext()) {
                parcel.writeParcelable((Parcelable) f34.next(), i);
            }
        }
        List<ClassifiedsYoulaCityDto> list35 = this.K;
        if (list35 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f35 = dn.f(parcel, list35, 1);
            while (f35.hasNext()) {
                parcel.writeParcelable((Parcelable) f35.next(), i);
            }
        }
        List<MarketClassifiedInfoDto> list36 = this.L;
        if (list36 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f36 = dn.f(parcel, list36, 1);
            while (f36.hasNext()) {
                parcel.writeParcelable((Parcelable) f36.next(), i);
            }
        }
        List<MarketMarketCategoryTreeDto> list37 = this.M;
        if (list37 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f37 = dn.f(parcel, list37, 1);
            while (f37.hasNext()) {
                parcel.writeParcelable((Parcelable) f37.next(), i);
            }
        }
        List<MarketMarketCategoryMappingDto> list38 = this.N;
        if (list38 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f38 = dn.f(parcel, list38, 1);
            while (f38.hasNext()) {
                parcel.writeParcelable((Parcelable) f38.next(), i);
            }
        }
        List<MarketMarketSearchQueryDto> list39 = this.O;
        if (list39 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f39 = dn.f(parcel, list39, 1);
            while (f39.hasNext()) {
                parcel.writeParcelable((Parcelable) f39.next(), i);
            }
        }
        List<MarketMarketItemDto> list40 = this.P;
        if (list40 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f40 = dn.f(parcel, list40, 1);
            while (f40.hasNext()) {
                parcel.writeParcelable((Parcelable) f40.next(), i);
            }
        }
        List<MarketGroupCatalogItemDto> list41 = this.Q;
        if (list41 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f41 = dn.f(parcel, list41, 1);
            while (f41.hasNext()) {
                parcel.writeParcelable((Parcelable) f41.next(), i);
            }
        }
        List<MarketNavigationTabDto> list42 = this.R;
        if (list42 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f42 = dn.f(parcel, list42, 1);
            while (f42.hasNext()) {
                parcel.writeParcelable((Parcelable) f42.next(), i);
            }
        }
        List<MarketOrderDto> list43 = this.S;
        if (list43 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f43 = dn.f(parcel, list43, 1);
            while (f43.hasNext()) {
                parcel.writeParcelable((Parcelable) f43.next(), i);
            }
        }
        List<MarketUserReviewsItemsReviewDto> list44 = this.T;
        if (list44 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f44 = dn.f(parcel, list44, 1);
            while (f44.hasNext()) {
                parcel.writeParcelable((Parcelable) f44.next(), i);
            }
        }
        List<MarketItemForReviewDto> list45 = this.U;
        if (list45 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f45 = dn.f(parcel, list45, 1);
            while (f45.hasNext()) {
                parcel.writeParcelable((Parcelable) f45.next(), i);
            }
        }
        List<MarketCommunityReviewDto> list46 = this.V;
        if (list46 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f46 = dn.f(parcel, list46, 1);
            while (f46.hasNext()) {
                parcel.writeParcelable((Parcelable) f46.next(), i);
            }
        }
        List<MarketAbandonedCartDto> list47 = this.W;
        if (list47 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f47 = dn.f(parcel, list47, 1);
            while (f47.hasNext()) {
                parcel.writeParcelable((Parcelable) f47.next(), i);
            }
        }
        List<CatalogTextDto> list48 = this.X;
        if (list48 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f48 = dn.f(parcel, list48, 1);
            while (f48.hasNext()) {
                parcel.writeParcelable((Parcelable) f48.next(), i);
            }
        }
        List<ArticlesArticleDto> list49 = this.Y;
        if (list49 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f49 = dn.f(parcel, list49, 1);
            while (f49.hasNext()) {
                parcel.writeParcelable((Parcelable) f49.next(), i);
            }
        }
        List<AudioAudioDto> list50 = this.Z;
        if (list50 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f50 = dn.f(parcel, list50, 1);
            while (f50.hasNext()) {
                parcel.writeParcelable((Parcelable) f50.next(), i);
            }
        }
        List<PodcastSliderItemDto> list51 = this.a0;
        if (list51 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f51 = dn.f(parcel, list51, 1);
            while (f51.hasNext()) {
                parcel.writeParcelable((Parcelable) f51.next(), i);
            }
        }
        List<PodcastPodcastDto> list52 = this.b0;
        if (list52 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f52 = dn.f(parcel, list52, 1);
            while (f52.hasNext()) {
                parcel.writeParcelable((Parcelable) f52.next(), i);
            }
        }
        List<PodcastExtendedPodcastDto> list53 = this.c0;
        if (list53 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f53 = dn.f(parcel, list53, 1);
            while (f53.hasNext()) {
                parcel.writeParcelable((Parcelable) f53.next(), i);
            }
        }
        List<AudioAudioContentCardDto> list54 = this.d0;
        if (list54 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f54 = dn.f(parcel, list54, 1);
            while (f54.hasNext()) {
                parcel.writeParcelable((Parcelable) f54.next(), i);
            }
        }
        List<AudioBooksAudioBookDto> list55 = this.e0;
        if (list55 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f55 = dn.f(parcel, list55, 1);
            while (f55.hasNext()) {
                parcel.writeParcelable((Parcelable) f55.next(), i);
            }
        }
        List<AudioBooksItemPersonDto> list56 = this.f0;
        if (list56 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f56 = dn.f(parcel, list56, 1);
            while (f56.hasNext()) {
                parcel.writeParcelable((Parcelable) f56.next(), i);
            }
        }
        List<PodcastEpisodeWithLikedFriendsDto> list57 = this.g0;
        if (list57 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f57 = dn.f(parcel, list57, 1);
            while (f57.hasNext()) {
                parcel.writeParcelable((Parcelable) f57.next(), i);
            }
        }
        List<CatalogHintDto> list58 = this.h0;
        if (list58 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f58 = dn.f(parcel, list58, 1);
            while (f58.hasNext()) {
                parcel.writeParcelable((Parcelable) f58.next(), i);
            }
        }
        List<CatalogFriendsLikesItemDto> list59 = this.i0;
        if (list59 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f59 = dn.f(parcel, list59, 1);
            while (f59.hasNext()) {
                parcel.writeParcelable((Parcelable) f59.next(), i);
            }
        }
        List<AppsAppDto> list60 = this.j0;
        if (list60 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f60 = dn.f(parcel, list60, 1);
            while (f60.hasNext()) {
                parcel.writeParcelable((Parcelable) f60.next(), i);
            }
        }
        List<AppsAppDto> list61 = this.k0;
        if (list61 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f61 = dn.f(parcel, list61, 1);
            while (f61.hasNext()) {
                parcel.writeParcelable((Parcelable) f61.next(), i);
            }
        }
        List<SearchSuggestionItemDto> list62 = this.l0;
        if (list62 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f62 = dn.f(parcel, list62, 1);
            while (f62.hasNext()) {
                parcel.writeParcelable((Parcelable) f62.next(), i);
            }
        }
        List<SearchFilterItemDto> list63 = this.m0;
        if (list63 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f63 = dn.f(parcel, list63, 1);
            while (f63.hasNext()) {
                parcel.writeParcelable((Parcelable) f63.next(), i);
            }
        }
        List<CatalogNewsfeedItemWithIdDto> list64 = this.n0;
        if (list64 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f64 = dn.f(parcel, list64, 1);
            while (f64.hasNext()) {
                parcel.writeParcelable((Parcelable) f64.next(), i);
            }
        }
        List<GroupsCollectionItemDto> list65 = this.o0;
        if (list65 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f65 = dn.f(parcel, list65, 1);
            while (f65.hasNext()) {
                parcel.writeParcelable((Parcelable) f65.next(), i);
            }
        }
        List<CatalogGroupCategoryItemDto> list66 = this.p0;
        if (list66 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f66 = dn.f(parcel, list66, 1);
            while (f66.hasNext()) {
                parcel.writeParcelable((Parcelable) f66.next(), i);
            }
        }
        List<LikesReactionSetDto> list67 = this.q0;
        if (list67 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f67 = dn.f(parcel, list67, 1);
            while (f67.hasNext()) {
                parcel.writeParcelable((Parcelable) f67.next(), i);
            }
        }
        List<MarketSearchSpellCheckResultDto> list68 = this.r0;
        if (list68 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f68 = dn.f(parcel, list68, 1);
            while (f68.hasNext()) {
                parcel.writeParcelable((Parcelable) f68.next(), i);
            }
        }
        List<MarketSearchQueryClassifierSuggestionDto> list69 = this.s0;
        if (list69 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f69 = dn.f(parcel, list69, 1);
            while (f69.hasNext()) {
                parcel.writeParcelable((Parcelable) f69.next(), i);
            }
        }
        List<SearchSpellcheckerDto> list70 = this.t0;
        if (list70 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f70 = dn.f(parcel, list70, 1);
            while (f70.hasNext()) {
                parcel.writeParcelable((Parcelable) f70.next(), i);
            }
        }
        List<MarketIntegrationsInfoBlockCatalogDto> list71 = this.u0;
        if (list71 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f71 = dn.f(parcel, list71, 1);
            while (f71.hasNext()) {
                parcel.writeParcelable((Parcelable) f71.next(), i);
            }
        }
        List<SearchEntityItemDto> list72 = this.v0;
        if (list72 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f72 = dn.f(parcel, list72, 1);
            while (f72.hasNext()) {
                parcel.writeParcelable((Parcelable) f72.next(), i);
            }
        }
        List<FeedbacksFeedbackDto> list73 = this.w0;
        if (list73 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f73 = dn.f(parcel, list73, 1);
            while (f73.hasNext()) {
                parcel.writeParcelable((Parcelable) f73.next(), i);
            }
        }
        List<VideoVkliveChannelDto> list74 = this.x0;
        if (list74 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f74 = dn.f(parcel, list74, 1);
            while (f74.hasNext()) {
                parcel.writeParcelable((Parcelable) f74.next(), i);
            }
        }
        List<VideoVkliveCategoryDto> list75 = this.y0;
        if (list75 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f75 = dn.f(parcel, list75, 1);
            while (f75.hasNext()) {
                parcel.writeParcelable((Parcelable) f75.next(), i);
            }
        }
        List<CatalogVideoMovieDto> list76 = this.z0;
        if (list76 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f76 = dn.f(parcel, list76, 1);
        while (f76.hasNext()) {
            parcel.writeParcelable((Parcelable) f76.next(), i);
        }
    }
}
