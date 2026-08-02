package com.vk.catalog.mvi.register;

import com.vk.api.generated.catalog.dto.CatalogBlockDataTypeDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogLayoutDto;
import java.util.Iterator;
import xsna.asp;
import xsna.h2a;
import xsna.i2a;
import xsna.izs;
import xsna.j2a;
import xsna.xv8;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CatalogBlockVariant.kt */
/* loaded from: classes.dex */
public final class CatalogBlockVariant {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CatalogBlockVariant[] $VALUES;
    public static final CatalogBlockVariant AlbumsBanner;
    public static final CatalogBlockVariant AlbumsLargeList;
    public static final CatalogBlockVariant AlbumsListSmallCards;
    public static final CatalogBlockVariant AlbumsSlider;
    public static final CatalogBlockVariant AlbumsSliderLibrary;
    public static final CatalogBlockVariant AlbumsSliderProfile;
    public static final CatalogBlockVariant AlbumsTabsList;
    public static final CatalogBlockVariant AlbumsTitleSubtitleAvatar;
    public static final CatalogBlockVariant ArtistMixBlurred;
    public static final CatalogBlockVariant AuthorsGroupsSliderHorizontal;
    public static final CatalogBlockVariant CatalogBannersVideoSubAdsOffClose;
    public static final a Companion;
    public static final CatalogBlockVariant DownloadedVideoLargeSlider;
    public static final CatalogBlockVariant DownloadedVideoSlider;
    public static final CatalogBlockVariant DownloadedVideoSliderSecondary;
    public static final CatalogBlockVariant DraftShortVideoList;
    public static final CatalogBlockVariant Header;
    public static final CatalogBlockVariant HorizontalButtonsWithIcon;
    public static final CatalogBlockVariant HorizontalButtonsWithIconBorderless;
    public static final CatalogBlockVariant HorizontalButtonsWithScroll;
    public static final CatalogBlockVariant HorizontalFiltersWithScroll;
    public static final CatalogBlockVariant LinksSmallList;
    public static final CatalogBlockVariant LinksSmallListStyleVideoLibrary;
    public static final CatalogBlockVariant MovieActors;
    public static final CatalogBlockVariant MovieButtons;
    public static final CatalogBlockVariant MovieDescription;
    public static final CatalogBlockVariant MovieHeader;
    public static final CatalogBlockVariant MovieInfo;
    public static final CatalogBlockVariant MoviePostersGrid;
    public static final CatalogBlockVariant MoviePostersLegacySlider;
    public static final CatalogBlockVariant MoviePostersSlider;
    public static final CatalogBlockVariant MovieRatings;
    public static final CatalogBlockVariant MusicHorizontalTabsFilters;
    public static final CatalogBlockVariant MusicSavePlaylistByFilterButton;
    public static final CatalogBlockVariant OpenSectionArrowButton;
    public static final CatalogBlockVariant PlaceHolderBig;
    public static final CatalogBlockVariant PlaceholderBannerLibrary;
    public static final CatalogBlockVariant PlaceholderChannel;
    public static final CatalogBlockVariant PlaceholderLibrary;
    public static final CatalogBlockVariant PlaylistWithArtistsBlurred;
    public static final CatalogBlockVariant RecommendedPlaylistBlurred;
    public static final CatalogBlockVariant Separator;
    public static final CatalogBlockVariant SeparatorTransparent;
    public static final CatalogBlockVariant ShortVideoList;
    public static final CatalogBlockVariant ShortVideoSliderList;
    public static final CatalogBlockVariant UnknownBlock;
    public static final CatalogBlockVariant UploadDraftsList;
    public static final CatalogBlockVariant UploadPublishedList;
    public static final CatalogBlockVariant UploadScheduledList;
    public static final CatalogBlockVariant VideoLargeSliderVideoPage;
    public static final CatalogBlockVariant VideoTrailer;
    public static final CatalogBlockVariant VideosLargeList;
    public static final CatalogBlockVariant VideosLargeListInvisibleAuthor;
    public static final CatalogBlockVariant VideosList;
    public static final CatalogBlockVariant VideosListVisibleAuthors;
    public static final CatalogBlockVariant VideosShowcaseWithDescription;
    public static final CatalogBlockVariant VideosSlider;
    public static final CatalogBlockVariant VideosSliderFavoritesLibrary;
    public static final CatalogBlockVariant VideosSliderLargeStyle;
    public static final CatalogBlockVariant VideosSliderLibrary;
    public static final CatalogBlockVariant VideosSliderLikedLibrary;
    public static final CatalogBlockVariant VideosStackedList;
    private final CatalogBlockDataTypeDto dataType;
    private final izs<CatalogBlockDto, Boolean> extra;
    private final CatalogLayoutDto.NameDto layoutName;
    private final CatalogLayoutDto.StyleDto layoutStyle;

    /* compiled from: CatalogBlockVariant.kt */
    public static final class a {
        public static CatalogBlockVariant a(CatalogBlockDto catalogBlockDto) {
            Object obj;
            Iterator<E> it = CatalogBlockVariant.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((CatalogBlockVariant) obj).i(catalogBlockDto)) {
                    break;
                }
            }
            CatalogBlockVariant catalogBlockVariant = (CatalogBlockVariant) obj;
            return catalogBlockVariant == null ? CatalogBlockVariant.UnknownBlock : catalogBlockVariant;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        CatalogBlockDataTypeDto catalogBlockDataTypeDto = CatalogBlockDataTypeDto.NONE;
        CatalogLayoutDto.NameDto nameDto = CatalogLayoutDto.NameDto.HEADER;
        CatalogBlockVariant catalogBlockVariant = new CatalogBlockVariant("Header", 0, catalogBlockDataTypeDto, nameDto, null, null, 12);
        Header = catalogBlockVariant;
        CatalogLayoutDto.NameDto nameDto2 = CatalogLayoutDto.NameDto.SEPARATOR;
        izs izsVar = null;
        CatalogBlockVariant catalogBlockVariant2 = new CatalogBlockVariant("SeparatorTransparent", 1, catalogBlockDataTypeDto, nameDto2, CatalogLayoutDto.StyleDto.TRANSPARENT, izsVar, 8);
        SeparatorTransparent = catalogBlockVariant2;
        CatalogBlockVariant catalogBlockVariant3 = new CatalogBlockVariant("Separator", 2, catalogBlockDataTypeDto, nameDto2, null, izsVar, 12);
        Separator = catalogBlockVariant3;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto2 = CatalogBlockDataTypeDto.ALBUMS;
        CatalogLayoutDto.NameDto nameDto3 = CatalogLayoutDto.NameDto.LIST;
        CatalogLayoutDto.StyleDto styleDto = CatalogLayoutDto.StyleDto.INVISIBLE_AUTHOR;
        CatalogBlockVariant catalogBlockVariant4 = new CatalogBlockVariant("AlbumsListSmallCards", 3, catalogBlockDataTypeDto2, nameDto3, styleDto, null, 8);
        AlbumsListSmallCards = catalogBlockVariant4;
        CatalogLayoutDto.NameDto nameDto4 = CatalogLayoutDto.NameDto.LARGE_LIST;
        izs izsVar2 = null;
        CatalogBlockVariant catalogBlockVariant5 = new CatalogBlockVariant("AlbumsLargeList", 4, catalogBlockDataTypeDto2, nameDto4, 0 == true ? 1 : 0, izsVar2, 12);
        AlbumsLargeList = catalogBlockVariant5;
        CatalogLayoutDto.NameDto nameDto5 = CatalogLayoutDto.NameDto.SLIDER;
        CatalogLayoutDto.StyleDto styleDto2 = CatalogLayoutDto.StyleDto.VIDEO_LIBRARY;
        int i = 8;
        CatalogBlockVariant catalogBlockVariant6 = new CatalogBlockVariant("AlbumsSliderLibrary", 5, catalogBlockDataTypeDto2, nameDto5, styleDto2, izsVar2, i);
        AlbumsSliderLibrary = catalogBlockVariant6;
        CatalogBlockVariant catalogBlockVariant7 = new CatalogBlockVariant("AlbumsSliderProfile", 6, catalogBlockDataTypeDto2, nameDto5, styleDto, izsVar2, i);
        AlbumsSliderProfile = catalogBlockVariant7;
        int i2 = 12;
        CatalogLayoutDto.StyleDto styleDto3 = null;
        CatalogBlockVariant catalogBlockVariant8 = new CatalogBlockVariant("AlbumsSlider", 7, catalogBlockDataTypeDto2, nameDto5, styleDto3, izsVar2, i2);
        AlbumsSlider = catalogBlockVariant8;
        CatalogBlockVariant catalogBlockVariant9 = new CatalogBlockVariant("AlbumsTabsList", 8, catalogBlockDataTypeDto2, CatalogLayoutDto.NameDto.VIDEO_TABS_ALBUM_LIST, styleDto3, izsVar2, i2);
        AlbumsTabsList = catalogBlockVariant9;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto3 = CatalogBlockDataTypeDto.ACTION;
        CatalogLayoutDto.NameDto nameDto6 = CatalogLayoutDto.NameDto.HORIZONTAL_BUTTONS;
        CatalogLayoutDto.StyleDto styleDto4 = CatalogLayoutDto.StyleDto.BORDERLESS_WITH_ICON;
        CatalogBlockVariant catalogBlockVariant10 = new CatalogBlockVariant("MusicSavePlaylistByFilterButton", 9, catalogBlockDataTypeDto3, nameDto6, styleDto4, new h2a(0));
        MusicSavePlaylistByFilterButton = catalogBlockVariant10;
        izs izsVar3 = null;
        int i3 = 8;
        CatalogBlockVariant catalogBlockVariant11 = new CatalogBlockVariant("HorizontalButtonsWithIconBorderless", 10, catalogBlockDataTypeDto3, nameDto6, styleDto4, izsVar3, i3);
        HorizontalButtonsWithIconBorderless = catalogBlockVariant11;
        CatalogBlockVariant catalogBlockVariant12 = new CatalogBlockVariant("HorizontalButtonsWithIcon", 11, catalogBlockDataTypeDto3, nameDto6, CatalogLayoutDto.StyleDto.ICON_TITLE_BUTTON_PRIMARY_COLOR, izsVar3, i3);
        HorizontalButtonsWithIcon = catalogBlockVariant12;
        CatalogBlockVariant catalogBlockVariant13 = new CatalogBlockVariant("HorizontalButtonsWithScroll", 12, catalogBlockDataTypeDto3, CatalogLayoutDto.NameDto.HORIZONTAL_BUTTONS_WITH_SCROLL, CatalogLayoutDto.StyleDto.DEFAULT, izsVar3, i3);
        HorizontalButtonsWithScroll = catalogBlockVariant13;
        CatalogBlockVariant catalogBlockVariant14 = new CatalogBlockVariant("MusicHorizontalTabsFilters", 13, catalogBlockDataTypeDto3, nameDto6, CatalogLayoutDto.StyleDto.MY_MUSIC_FILTERS, izsVar3, i3);
        MusicHorizontalTabsFilters = catalogBlockVariant14;
        CatalogBlockVariant catalogBlockVariant15 = new CatalogBlockVariant("HorizontalFiltersWithScroll", 14, catalogBlockDataTypeDto3, nameDto5, null, null, 12);
        HorizontalFiltersWithScroll = catalogBlockVariant15;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto4 = CatalogBlockDataTypeDto.LINKS;
        CatalogLayoutDto.NameDto nameDto7 = CatalogLayoutDto.NameDto.SMALL_LIST;
        izs izsVar4 = null;
        int i4 = 8;
        CatalogBlockVariant catalogBlockVariant16 = new CatalogBlockVariant("LinksSmallListStyleVideoLibrary", 15, catalogBlockDataTypeDto4, nameDto7, styleDto2, izsVar4, i4);
        LinksSmallListStyleVideoLibrary = catalogBlockVariant16;
        CatalogBlockVariant catalogBlockVariant17 = new CatalogBlockVariant("LinksSmallList", 16, catalogBlockDataTypeDto4, nameDto7, null, null, 12);
        LinksSmallList = catalogBlockVariant17;
        CatalogBlockVariant catalogBlockVariant18 = new CatalogBlockVariant("OpenSectionArrowButton", 17, catalogBlockDataTypeDto4, nameDto3, CatalogLayoutDto.StyleDto.OPEN_SECTION_ARROW_BUTTON, null, 8);
        OpenSectionArrowButton = catalogBlockVariant18;
        CatalogBlockVariant catalogBlockVariant19 = new CatalogBlockVariant("CatalogBannersVideoSubAdsOffClose", 18, CatalogBlockDataTypeDto.CATALOG_BANNERS, CatalogLayoutDto.NameDto.CATALOG_BANNER, CatalogLayoutDto.StyleDto.VIDEO_SUB_ADS_OFF_BANNER_CLOSE, null, 8);
        CatalogBannersVideoSubAdsOffClose = catalogBlockVariant19;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto5 = CatalogBlockDataTypeDto.DOWNLOADED_VIDEOS;
        izs izsVar5 = null;
        int i5 = 8;
        CatalogBlockVariant catalogBlockVariant20 = new CatalogBlockVariant("DownloadedVideoSlider", 19, catalogBlockDataTypeDto5, nameDto5, styleDto2, izsVar5, i5);
        DownloadedVideoSlider = catalogBlockVariant20;
        CatalogLayoutDto.StyleDto styleDto5 = CatalogLayoutDto.StyleDto.LARGE;
        CatalogBlockVariant catalogBlockVariant21 = new CatalogBlockVariant("DownloadedVideoLargeSlider", 20, catalogBlockDataTypeDto5, nameDto5, styleDto5, izsVar5, i5);
        DownloadedVideoLargeSlider = catalogBlockVariant21;
        CatalogBlockVariant catalogBlockVariant22 = new CatalogBlockVariant("DownloadedVideoSliderSecondary", 21, catalogBlockDataTypeDto5, nameDto5, CatalogLayoutDto.StyleDto.SECONDARY, izsVar5, i5);
        DownloadedVideoSliderSecondary = catalogBlockVariant22;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto6 = CatalogBlockDataTypeDto.VIDEOS;
        CatalogBlockVariant catalogBlockVariant23 = new CatalogBlockVariant("VideosSliderLargeStyle", 22, catalogBlockDataTypeDto6, nameDto5, styleDto5, izsVar5, i5);
        VideosSliderLargeStyle = catalogBlockVariant23;
        CatalogBlockVariant catalogBlockVariant24 = new CatalogBlockVariant("VideosSliderLibrary", 23, catalogBlockDataTypeDto6, nameDto5, styleDto2, izsVar5, i5);
        VideosSliderLibrary = catalogBlockVariant24;
        CatalogBlockVariant catalogBlockVariant25 = new CatalogBlockVariant("VideosSliderLikedLibrary", 24, catalogBlockDataTypeDto6, nameDto5, CatalogLayoutDto.StyleDto.VIDEO_LIKED_LIBRARY, izsVar5, i5);
        VideosSliderLikedLibrary = catalogBlockVariant25;
        CatalogBlockVariant catalogBlockVariant26 = new CatalogBlockVariant("VideosSliderFavoritesLibrary", 25, catalogBlockDataTypeDto6, nameDto5, CatalogLayoutDto.StyleDto.VIDEO_FAVORITES_LIBRARY, izsVar5, i5);
        VideosSliderFavoritesLibrary = catalogBlockVariant26;
        izs izsVar6 = null;
        CatalogBlockVariant catalogBlockVariant27 = new CatalogBlockVariant("VideosShowcaseWithDescription", 26, catalogBlockDataTypeDto6, CatalogLayoutDto.NameDto.SHOWCASE_LIST, CatalogLayoutDto.StyleDto.WITH_DESCRIPTION, izsVar6, 8);
        VideosShowcaseWithDescription = catalogBlockVariant27;
        CatalogBlockVariant catalogBlockVariant28 = new CatalogBlockVariant("VideosSlider", 27, catalogBlockDataTypeDto6, nameDto5, null, izsVar5, 12);
        VideosSlider = catalogBlockVariant28;
        CatalogLayoutDto.StyleDto styleDto6 = null;
        CatalogBlockVariant catalogBlockVariant29 = new CatalogBlockVariant("VideosListVisibleAuthors", 28, catalogBlockDataTypeDto6, nameDto3, styleDto6, new xv8(1), 4);
        VideosListVisibleAuthors = catalogBlockVariant29;
        CatalogBlockVariant catalogBlockVariant30 = new CatalogBlockVariant("VideosList", 29, catalogBlockDataTypeDto6, nameDto3, styleDto6, null, 12);
        VideosList = catalogBlockVariant30;
        CatalogBlockVariant catalogBlockVariant31 = new CatalogBlockVariant("VideosLargeListInvisibleAuthor", 30, catalogBlockDataTypeDto6, nameDto4, styleDto, null, 8);
        VideosLargeListInvisibleAuthor = catalogBlockVariant31;
        CatalogLayoutDto.NameDto nameDto8 = CatalogLayoutDto.NameDto.SHORT_VIDEO_LIST;
        int i6 = 12;
        CatalogLayoutDto.StyleDto styleDto7 = null;
        CatalogBlockVariant catalogBlockVariant32 = new CatalogBlockVariant("ShortVideoList", 31, catalogBlockDataTypeDto6, nameDto8, styleDto7, izsVar6, i6);
        ShortVideoList = catalogBlockVariant32;
        CatalogBlockVariant catalogBlockVariant33 = new CatalogBlockVariant("ShortVideoSliderList", 32, catalogBlockDataTypeDto6, CatalogLayoutDto.NameDto.SHORT_VIDEO_SLIDER_WITH_VIEW_COUNTER, styleDto7, izsVar6, i6);
        ShortVideoSliderList = catalogBlockVariant33;
        CatalogBlockVariant catalogBlockVariant34 = new CatalogBlockVariant("DraftShortVideoList", 33, CatalogBlockDataTypeDto.CLIP_DRAFTS, nameDto8, null, null, 12);
        DraftShortVideoList = catalogBlockVariant34;
        CatalogBlockVariant catalogBlockVariant35 = new CatalogBlockVariant("AuthorsGroupsSliderHorizontal", 34, CatalogBlockDataTypeDto.GROUPS_ITEMS, nameDto5, CatalogLayoutDto.StyleDto.HORIZONTAL, izsVar5, 8);
        AuthorsGroupsSliderHorizontal = catalogBlockVariant35;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto7 = CatalogBlockDataTypeDto.PLACEHOLDER;
        CatalogBlockVariant catalogBlockVariant36 = new CatalogBlockVariant("PlaceholderLibrary", 35, catalogBlockDataTypeDto7, CatalogLayoutDto.NameDto.PLACEHOLDER_SMALL, styleDto2, izsVar4, i4);
        PlaceholderLibrary = catalogBlockVariant36;
        izs izsVar7 = null;
        int i7 = 12;
        CatalogLayoutDto.StyleDto styleDto8 = null;
        CatalogBlockVariant catalogBlockVariant37 = new CatalogBlockVariant("PlaceholderChannel", 36, catalogBlockDataTypeDto7, CatalogLayoutDto.NameDto.PLACEHOLDER, styleDto8, izsVar7, i7);
        PlaceholderChannel = catalogBlockVariant37;
        CatalogBlockVariant catalogBlockVariant38 = new CatalogBlockVariant("PlaceHolderBig", 37, catalogBlockDataTypeDto7, CatalogLayoutDto.NameDto.PLACEHOLDER_BIG, styleDto8, izsVar7, i7);
        PlaceHolderBig = catalogBlockVariant38;
        CatalogLayoutDto.NameDto nameDto9 = CatalogLayoutDto.NameDto.BANNER;
        CatalogBlockVariant catalogBlockVariant39 = new CatalogBlockVariant("PlaceholderBannerLibrary", 38, catalogBlockDataTypeDto7, nameDto9, styleDto2, izsVar4, i4);
        PlaceholderBannerLibrary = catalogBlockVariant39;
        izs izsVar8 = null;
        int i8 = 12;
        CatalogLayoutDto.StyleDto styleDto9 = null;
        CatalogBlockVariant catalogBlockVariant40 = new CatalogBlockVariant("UploadPublishedList", 39, CatalogBlockDataTypeDto.VIDEO_UPLOADING_PUBLISHED, nameDto3, styleDto9, izsVar8, i8);
        UploadPublishedList = catalogBlockVariant40;
        CatalogBlockVariant catalogBlockVariant41 = new CatalogBlockVariant("UploadScheduledList", 40, CatalogBlockDataTypeDto.VIDEO_UPLOADING_SCHEDULED, nameDto3, styleDto9, izsVar8, i8);
        UploadScheduledList = catalogBlockVariant41;
        CatalogBlockVariant catalogBlockVariant42 = new CatalogBlockVariant("UploadDraftsList", 41, CatalogBlockDataTypeDto.UPLOADING_VIDEO_SCHEDULED, nameDto3, styleDto9, izsVar8, i8);
        UploadDraftsList = catalogBlockVariant42;
        CatalogBlockVariant catalogBlockVariant43 = new CatalogBlockVariant("VideosStackedList", 42, catalogBlockDataTypeDto6, CatalogLayoutDto.NameDto.STACKED_LIST, styleDto7, izsVar6, i6);
        VideosStackedList = catalogBlockVariant43;
        CatalogBlockVariant catalogBlockVariant44 = new CatalogBlockVariant("VideosLargeList", 43, catalogBlockDataTypeDto6, nameDto4, null, null, 12);
        VideosLargeList = catalogBlockVariant44;
        CatalogLayoutDto.NameDto nameDto10 = CatalogLayoutDto.NameDto.LARGE_SLIDER;
        CatalogBlockVariant catalogBlockVariant45 = new CatalogBlockVariant("VideoLargeSliderVideoPage", 44, catalogBlockDataTypeDto6, nameDto10, CatalogLayoutDto.StyleDto.VIDEO_PAGE, izsVar6, 8);
        VideoLargeSliderVideoPage = catalogBlockVariant45;
        CatalogBlockVariant catalogBlockVariant46 = new CatalogBlockVariant("VideoTrailer", 45, catalogBlockDataTypeDto6, CatalogLayoutDto.NameDto.TRAILER, null, izsVar6, 12);
        VideoTrailer = catalogBlockVariant46;
        CatalogBlockVariant catalogBlockVariant47 = new CatalogBlockVariant("ArtistMixBlurred", 46, catalogBlockDataTypeDto3, nameDto10, CatalogLayoutDto.StyleDto.ARTIST_MIX_BLURRED, izsVar3, i3);
        ArtistMixBlurred = catalogBlockVariant47;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto8 = CatalogBlockDataTypeDto.MUSIC_RECOMMENDED_PLAYLISTS;
        CatalogBlockVariant catalogBlockVariant48 = new CatalogBlockVariant("RecommendedPlaylistBlurred", 47, catalogBlockDataTypeDto8, nameDto10, CatalogLayoutDto.StyleDto.RECOMMENDED_PLAYLISTS_BLURRED, null, 8);
        RecommendedPlaylistBlurred = catalogBlockVariant48;
        CatalogBlockVariant catalogBlockVariant49 = new CatalogBlockVariant("PlaylistWithArtistsBlurred", 48, catalogBlockDataTypeDto8, CatalogLayoutDto.NameDto.ARTISTS_SLIDER, 0 == true ? 1 : 0, null, 12);
        PlaylistWithArtistsBlurred = catalogBlockVariant49;
        CatalogBlockDataTypeDto catalogBlockDataTypeDto9 = CatalogBlockDataTypeDto.MOVIES;
        CatalogBlockVariant catalogBlockVariant50 = new CatalogBlockVariant("MovieHeader", 49, catalogBlockDataTypeDto9, nameDto, null, null, 12);
        MovieHeader = catalogBlockVariant50;
        izs izsVar9 = null;
        CatalogBlockVariant catalogBlockVariant51 = new CatalogBlockVariant("MovieButtons", 50, catalogBlockDataTypeDto9, CatalogLayoutDto.NameDto.BUTTON_GROUP, 0 == true ? 1 : 0, izsVar9, 12);
        MovieButtons = catalogBlockVariant51;
        CatalogLayoutDto.NameDto nameDto11 = CatalogLayoutDto.NameDto.TEXT;
        int i9 = 8;
        CatalogBlockVariant catalogBlockVariant52 = new CatalogBlockVariant("MovieDescription", 51, catalogBlockDataTypeDto9, nameDto11, CatalogLayoutDto.StyleDto.DESCRIPTION, izsVar9, i9);
        MovieDescription = catalogBlockVariant52;
        CatalogBlockVariant catalogBlockVariant53 = new CatalogBlockVariant("MovieRatings", 52, catalogBlockDataTypeDto9, nameDto11, CatalogLayoutDto.StyleDto.RATINGS, izsVar9, i9);
        MovieRatings = catalogBlockVariant53;
        CatalogLayoutDto.NameDto nameDto12 = CatalogLayoutDto.NameDto.GRID;
        CatalogBlockVariant catalogBlockVariant54 = new CatalogBlockVariant("MovieInfo", 53, catalogBlockDataTypeDto9, nameDto12, CatalogLayoutDto.StyleDto.ABOUT, izsVar9, i9);
        MovieInfo = catalogBlockVariant54;
        CatalogBlockVariant catalogBlockVariant55 = new CatalogBlockVariant("MovieActors", 54, catalogBlockDataTypeDto9, nameDto12, CatalogLayoutDto.StyleDto.ACTORS, izsVar9, i9);
        MovieActors = catalogBlockVariant55;
        izs izsVar10 = null;
        int i10 = 12;
        CatalogLayoutDto.StyleDto styleDto10 = null;
        CatalogBlockVariant catalogBlockVariant56 = new CatalogBlockVariant("MoviePostersSlider", 55, catalogBlockDataTypeDto9, nameDto5, styleDto10, izsVar10, i10);
        MoviePostersSlider = catalogBlockVariant56;
        CatalogBlockVariant catalogBlockVariant57 = new CatalogBlockVariant("MoviePostersLegacySlider", 56, catalogBlockDataTypeDto9, nameDto5, styleDto10, izsVar10, i10);
        MoviePostersLegacySlider = catalogBlockVariant57;
        CatalogBlockVariant catalogBlockVariant58 = new CatalogBlockVariant("MoviePostersGrid", 57, catalogBlockDataTypeDto9, CatalogLayoutDto.NameDto.VERTICAL_GRID, null, izsVar9, 12);
        MoviePostersGrid = catalogBlockVariant58;
        izs izsVar11 = null;
        int i11 = 12;
        CatalogLayoutDto.StyleDto styleDto11 = null;
        CatalogBlockVariant catalogBlockVariant59 = new CatalogBlockVariant("AlbumsBanner", 58, catalogBlockDataTypeDto2, nameDto9, styleDto11, izsVar11, i11);
        AlbumsBanner = catalogBlockVariant59;
        CatalogBlockVariant catalogBlockVariant60 = new CatalogBlockVariant("AlbumsTitleSubtitleAvatar", 59, catalogBlockDataTypeDto2, CatalogLayoutDto.NameDto.TITLE_SUBTITLE_AVATAR, styleDto11, izsVar11, i11);
        AlbumsTitleSubtitleAvatar = catalogBlockVariant60;
        CatalogBlockVariant catalogBlockVariant61 = new CatalogBlockVariant("UnknownBlock", 60, catalogBlockDataTypeDto, CatalogLayoutDto.NameDto.NONE, null, new i2a(0), 4);
        UnknownBlock = catalogBlockVariant61;
        CatalogBlockVariant[] catalogBlockVariantArr = {catalogBlockVariant, catalogBlockVariant2, catalogBlockVariant3, catalogBlockVariant4, catalogBlockVariant5, catalogBlockVariant6, catalogBlockVariant7, catalogBlockVariant8, catalogBlockVariant9, catalogBlockVariant10, catalogBlockVariant11, catalogBlockVariant12, catalogBlockVariant13, catalogBlockVariant14, catalogBlockVariant15, catalogBlockVariant16, catalogBlockVariant17, catalogBlockVariant18, catalogBlockVariant19, catalogBlockVariant20, catalogBlockVariant21, catalogBlockVariant22, catalogBlockVariant23, catalogBlockVariant24, catalogBlockVariant25, catalogBlockVariant26, catalogBlockVariant27, catalogBlockVariant28, catalogBlockVariant29, catalogBlockVariant30, catalogBlockVariant31, catalogBlockVariant32, catalogBlockVariant33, catalogBlockVariant34, catalogBlockVariant35, catalogBlockVariant36, catalogBlockVariant37, catalogBlockVariant38, catalogBlockVariant39, catalogBlockVariant40, catalogBlockVariant41, catalogBlockVariant42, catalogBlockVariant43, catalogBlockVariant44, catalogBlockVariant45, catalogBlockVariant46, catalogBlockVariant47, catalogBlockVariant48, catalogBlockVariant49, catalogBlockVariant50, catalogBlockVariant51, catalogBlockVariant52, catalogBlockVariant53, catalogBlockVariant54, catalogBlockVariant55, catalogBlockVariant56, catalogBlockVariant57, catalogBlockVariant58, catalogBlockVariant59, catalogBlockVariant60, catalogBlockVariant61};
        $VALUES = catalogBlockVariantArr;
        $ENTRIES = new asp(catalogBlockVariantArr);
        Companion = new a();
    }

    public CatalogBlockVariant(String str, int i, CatalogBlockDataTypeDto catalogBlockDataTypeDto, CatalogLayoutDto.NameDto nameDto, CatalogLayoutDto.StyleDto styleDto, izs izsVar) {
        this.dataType = catalogBlockDataTypeDto;
        this.layoutName = nameDto;
        this.layoutStyle = styleDto;
        this.extra = izsVar;
    }

    public static zrp<CatalogBlockVariant> h() {
        return $ENTRIES;
    }

    public static CatalogBlockVariant valueOf(String str) {
        return (CatalogBlockVariant) Enum.valueOf(CatalogBlockVariant.class, str);
    }

    public static CatalogBlockVariant[] values() {
        return (CatalogBlockVariant[]) $VALUES.clone();
    }

    public final boolean i(CatalogBlockDto catalogBlockDto) {
        if (this.dataType != catalogBlockDto.l0() || this.layoutName != catalogBlockDto.n1().f()) {
            return false;
        }
        CatalogLayoutDto.StyleDto styleDto = this.layoutStyle;
        return (styleDto == null || styleDto == catalogBlockDto.n1().i()) && this.extra.invoke(catalogBlockDto).booleanValue();
    }

    public /* synthetic */ CatalogBlockVariant(String str, int i, CatalogBlockDataTypeDto catalogBlockDataTypeDto, CatalogLayoutDto.NameDto nameDto, CatalogLayoutDto.StyleDto styleDto, izs izsVar, int i2) {
        this(str, i, catalogBlockDataTypeDto, nameDto, (i2 & 4) != 0 ? null : styleDto, (i2 & 8) != 0 ? new j2a() : izsVar);
    }
}
