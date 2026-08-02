package com.vk.catalog2.common.dto.api.style;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.toggle.d;
import xsna.zia;

/* compiled from: CatalogViewStyleResolverImpl.kt */
/* loaded from: classes16.dex */
public final class a implements zia {

    /* compiled from: CatalogViewStyleResolverImpl.kt */
    /* renamed from: com.vk.catalog2.common.dto.api.style.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0481a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogDataType.values().length];
            try {
                iArr[CatalogDataType.DATA_TYPE_SEARCH_WALL_ITEMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_SEARCH_NEWSFEED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_MUSIC_TRACKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_AUDIO_STREAM_MIXES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_SEARCH_ENTITY_ITEMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_VIDEO_VIDEOS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_ACTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_VIDEO_ALBUMS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_EMPTY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_LINKS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_PLACEHOLDER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_NONE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CatalogDataType.DATA_SYNTHETIC_SECTION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_GROUPS_ITEMS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_PODCASTS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_AUDIOBOOKS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[CatalogDataType.DATA_SYNTHETIC_LOADING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_VIDEO_TOPSHELF.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_MUSIC_RECOMMENDED_PLAYLISTS.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_AUDIO_SEARCH_RECENTS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_SEARCH_SUGGESTION.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogViewType.values().length];
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[CatalogViewType.SLIDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[CatalogViewType.SUBSECTION_TABS.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[CatalogViewType.SYNTHETIC_ACTION_SAVE_AS_PLAYLIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[CatalogViewType.HORIZONTAL_BUTTONS_STACK.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[CatalogViewType.LIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[CatalogViewType.DOUBLE_LIST.ordinal()] = 7;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[CatalogViewType.CATEGORIES_LIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[CatalogViewType.PLACEHOLDER.ordinal()] = 9;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[CatalogViewType.BANNER.ordinal()] = 10;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[CatalogViewType.PLACEHOLDER_SMALL.ordinal()] = 11;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[CatalogViewType.HEADER.ordinal()] = 12;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[CatalogViewType.SLIDER_MINIMALISTIC_CARD.ordinal()] = 13;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[CatalogViewType.LARGE_SLIDER.ordinal()] = 14;
            } catch (NoSuchFieldError unused35) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // xsna.zia
    public final int a(CatalogViewStyle catalogViewStyle) {
        if (catalogViewStyle instanceof SearchFeedCatalogViewStyle) {
            return ((SearchFeedCatalogViewStyle) catalogViewStyle).b;
        }
        if (catalogViewStyle instanceof MusicTrackCatalogViewStyle) {
            return ((MusicTrackCatalogViewStyle) catalogViewStyle).b.ordinal();
        }
        if (catalogViewStyle instanceof VkMixInteractiveViewStyle) {
            return ((VkMixInteractiveViewStyle) catalogViewStyle).b.ordinal();
        }
        if (catalogViewStyle instanceof SearchEntityCatalogViewStyle) {
            return ((SearchEntityCatalogViewStyle) catalogViewStyle).b.ordinal();
        }
        if (catalogViewStyle instanceof VerticalVideoCatalogViewStyle) {
            return ((VerticalVideoCatalogViewStyle) catalogViewStyle).b.ordinal();
        }
        boolean z = catalogViewStyle instanceof VideoCatalogViewStyle;
        if (z) {
            return ((VideoCatalogViewStyle) catalogViewStyle).b.ordinal();
        }
        if (catalogViewStyle instanceof VideoAlbumCatalogViewStyle) {
            return ((VideoAlbumCatalogViewStyle) catalogViewStyle).b.ordinal();
        }
        if (catalogViewStyle instanceof OpenSectionViewStyle) {
            OpenSectionViewStyle openSectionViewStyle = (OpenSectionViewStyle) catalogViewStyle;
            return openSectionViewStyle.c.ordinal() + (openSectionViewStyle.b.ordinal() * 1000);
        }
        if (catalogViewStyle instanceof LinkListViewStyle) {
            return ((LinkListViewStyle) catalogViewStyle).b.ordinal();
        }
        if (catalogViewStyle instanceof LinkSliderViewStyle) {
            return ((LinkSliderViewStyle) catalogViewStyle).b.ordinal();
        }
        if (catalogViewStyle instanceof PlaceholderCatalogViewStyle) {
            return ((PlaceholderCatalogViewStyle) catalogViewStyle).b.ordinal();
        }
        if (catalogViewStyle instanceof HorizontalButtonStackViewStyle) {
            return ((HorizontalButtonStackViewStyle) catalogViewStyle).b.ordinal();
        }
        if (catalogViewStyle instanceof CatalogSliderViewStyle) {
            return ((CatalogSliderViewStyle) catalogViewStyle).b.ordinal();
        }
        if (catalogViewStyle instanceof CatalogActionFilterStyle) {
            return ((CatalogActionFilterStyle) catalogViewStyle).b.ordinal();
        }
        if (catalogViewStyle instanceof DoubleListViewStyle) {
            return ((DoubleListViewStyle) catalogViewStyle).b.ordinal();
        }
        if (catalogViewStyle instanceof VkMixViewStyle) {
            return ((VkMixViewStyle) catalogViewStyle).b.ordinal();
        }
        if (z) {
            return ((VideoCatalogViewStyle) catalogViewStyle).b.ordinal();
        }
        if (catalogViewStyle instanceof PodcastSliderViewStyle) {
            return ((PodcastSliderViewStyle) catalogViewStyle).b.ordinal();
        }
        if (catalogViewStyle instanceof AudioBookSliderViewStyle) {
            return ((AudioBookSliderViewStyle) catalogViewStyle).b.ordinal();
        }
        if (catalogViewStyle instanceof ConcertSliderViewStyle) {
            return ((ConcertSliderViewStyle) catalogViewStyle).b.ordinal();
        }
        if (catalogViewStyle instanceof HeaderCatalogViewStyle) {
            return ((HeaderCatalogViewStyle) catalogViewStyle).b.ordinal();
        }
        if (catalogViewStyle instanceof CategoriesListViewStyle) {
            return ((CategoriesListViewStyle) catalogViewStyle).b.ordinal();
        }
        if (catalogViewStyle instanceof AudioBookListItemViewStyle) {
            return ((AudioBookListItemViewStyle) catalogViewStyle).b.ordinal();
        }
        if (catalogViewStyle instanceof TopshelfViewStyle) {
            return ((TopshelfViewStyle) catalogViewStyle).b.ordinal();
        }
        if (catalogViewStyle instanceof MusicRecommendedPlaylistViewStyle) {
            return ((MusicRecommendedPlaylistViewStyle) catalogViewStyle).b.ordinal();
        }
        if (catalogViewStyle instanceof FiltersViewStyle) {
            return ((FiltersViewStyle) catalogViewStyle).b.ordinal();
        }
        if (catalogViewStyle instanceof SavePlaylistViewStyle) {
            return ((SavePlaylistViewStyle) catalogViewStyle).b.ordinal();
        }
        if (catalogViewStyle instanceof SearchHistoryViewStyle) {
            return ((SearchHistoryViewStyle) catalogViewStyle).b.ordinal();
        }
        if (catalogViewStyle instanceof SearchSuggestionCatalogViewStyle) {
            return ((SearchSuggestionCatalogViewStyle) catalogViewStyle).b.ordinal();
        }
        return 0;
    }

    @Override // xsna.zia
    public final CatalogViewStyle b(CatalogDataType catalogDataType, CatalogViewType catalogViewType, int i) {
        switch (C0481a.$EnumSwitchMapping$0[catalogDataType.ordinal()]) {
            case 1:
            case 2:
                return new SearchFeedCatalogViewStyle(i);
            case 3:
                return new MusicTrackCatalogViewStyle(i);
            case 4:
                return catalogViewType == CatalogViewType.AUDIO_STREAM_MIX_INTERACTIVE ? new VkMixInteractiveViewStyle(i) : new VkMixViewStyle(i);
            case 5:
                return new SearchEntityCatalogViewStyle(i);
            case 6:
                return (catalogViewType == CatalogViewType.SLIDER_WITH_VERTICAL_VIDEOS || catalogViewType == CatalogViewType.FLOOR_CLIPS || catalogViewType == CatalogViewType.CAROUSEL_CLIPS || catalogViewType == CatalogViewType.CAROUSEL_CLIPS_WITH_SUBSCRIPTIONS || catalogViewType == CatalogViewType.SEARCH_FLOOR_CLIPS || catalogViewType == CatalogViewType.SEARCH_CAROUSEL_CLIPS) ? new VerticalVideoCatalogViewStyle(i) : new VideoCatalogViewStyle(i);
            case 7:
                int i2 = C0481a.$EnumSwitchMapping$1[catalogViewType.ordinal()];
                if (i2 == 1) {
                    return new OpenSectionViewStyle(i);
                }
                if (i2 == 2) {
                    return new CatalogActionFilterStyle(i);
                }
                if (i2 == 3) {
                    if (d.I()) {
                        return new FiltersViewStyle(i);
                    }
                    return null;
                }
                if (i2 == 4 && d.I()) {
                    return new SavePlaylistViewStyle(i);
                }
                return null;
            case 8:
                return new VideoAlbumCatalogViewStyle(i);
            case 9:
                if (C0481a.$EnumSwitchMapping$1[catalogViewType.ordinal()] == 5) {
                    return new HorizontalButtonStackViewStyle(i);
                }
                return null;
            case 10:
                int i3 = C0481a.$EnumSwitchMapping$1[catalogViewType.ordinal()];
                if (i3 == 2) {
                    return new LinkSliderViewStyle(i);
                }
                if (i3 == 6) {
                    return new LinkListViewStyle(i);
                }
                if (i3 == 7) {
                    return new DoubleListViewStyle(i);
                }
                if (i3 != 8) {
                    return null;
                }
                return new CategoriesListViewStyle(i);
            case 11:
                switch (C0481a.$EnumSwitchMapping$1[catalogViewType.ordinal()]) {
                    case 9:
                    case 10:
                    case 11:
                        return new PlaceholderCatalogViewStyle(i);
                    default:
                        return null;
                }
            case 12:
                if (C0481a.$EnumSwitchMapping$1[catalogViewType.ordinal()] == 12) {
                    return new HeaderCatalogViewStyle(i);
                }
                return null;
            case 13:
                if (C0481a.$EnumSwitchMapping$1[catalogViewType.ordinal()] == 2) {
                    return new CatalogSliderViewStyle(i);
                }
                return null;
            case 14:
                if (C0481a.$EnumSwitchMapping$1[catalogViewType.ordinal()] == 13) {
                    return new VideoCatalogViewStyle(i);
                }
                return null;
            case 15:
                if (C0481a.$EnumSwitchMapping$1[catalogViewType.ordinal()] == 14) {
                    return new PodcastSliderViewStyle(i);
                }
                return null;
            case 16:
                int i4 = C0481a.$EnumSwitchMapping$1[catalogViewType.ordinal()];
                if (i4 == 6) {
                    return new AudioBookListItemViewStyle(i);
                }
                if (i4 != 14) {
                    return null;
                }
                return new AudioBookSliderViewStyle(i);
            case 17:
                if (catalogViewType == CatalogViewType.AUDIO_STREAM_MIX_INTERACTIVE) {
                    return new VkMixInteractiveViewStyle(i);
                }
                return null;
            case 18:
                return new TopshelfViewStyle(i);
            case 19:
                if (C0481a.$EnumSwitchMapping$1[catalogViewType.ordinal()] == 14) {
                    return new MusicRecommendedPlaylistViewStyle(i);
                }
                return null;
            case 20:
                return new SearchHistoryViewStyle(i);
            case 21:
                return new SearchSuggestionCatalogViewStyle(i);
            default:
                return null;
        }
    }
}
