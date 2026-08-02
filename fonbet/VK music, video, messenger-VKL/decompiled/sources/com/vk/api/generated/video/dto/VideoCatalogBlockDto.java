package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.audio.dto.AudioCuratorDto;
import com.vk.api.generated.audio.dto.AudioSearchSuggestionDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.catalog.dto.CatalogBadgeDto;
import com.vk.api.generated.catalog.dto.CatalogBannerDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogLinkDto;
import com.vk.api.generated.catalog.dto.CatalogTextDto;
import com.vk.api.generated.media.dto.MediaPopupDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoAudioDto;
import com.vk.api.generated.stickers.dto.StickersCatalogBannerDto;
import com.vk.api.generated.topshelf.dto.TopshelfTopshelfItemDto;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoCatalogBlockDto.kt */
/* loaded from: classes15.dex */
public final class VideoCatalogBlockDto implements Parcelable {
    public static final Parcelable.Creator<VideoCatalogBlockDto> CREATOR = new a();

    @pmi0("albums")
    private final List<VideoVideoAlbumFullDto> albums;

    @pmi0("artist")
    private final AudioArtistDto artist;

    @pmi0("artists")
    private final List<AudioArtistDto> artists;

    @pmi0("badge")
    private final CatalogBadgeDto badge;

    @pmi0("block_view_type")
    private final BlockViewTypeDto blockViewType;

    @pmi0("catalog_banners")
    private final List<CatalogBannerDto> catalogBanners;

    @pmi0("counter")
    private final Integer counter;

    @pmi0("curators")
    private final List<AudioCuratorDto> curators;

    @pmi0("data_type")
    private final DataTypeDto dataType;

    @pmi0("fullscreen_action")
    private final VideoCatalogBlockDto fullscreenAction;

    @pmi0("fullscreen_view_type")
    private final FullscreenViewTypeDto fullscreenViewType;

    @pmi0("group_ids")
    private final List<Integer> groupIds;

    @pmi0("group_invites")
    private final List<Integer> groupInvites;

    @pmi0("id")
    private final String id;

    @pmi0("is_editable")
    private final BaseBoolIntDto isEditable;

    @pmi0("items_ignorable")
    private final BaseBoolIntDto itemsIgnorable;

    @pmi0("links")
    private final List<CatalogCatalogLinkDto> links;

    @pmi0("listen_events")
    private final List<String> listenEvents;

    @pmi0("music_audios")
    private final List<Object> musicAudios;

    @pmi0("music_playlists")
    private final List<Object> musicPlaylists;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("no_header")
    private final BaseBoolIntDto noHeader;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("placeholder_meta")
    private final MediaPopupDto placeholderMeta;

    @pmi0("search_suggestions")
    private final List<AudioSearchSuggestionDto> searchSuggestions;

    @pmi0("short_video_audios")
    private final List<ShortVideoAudioDto> shortVideoAudios;

    @pmi0("stickers_banners")
    private final List<StickersCatalogBannerDto> stickersBanners;

    @pmi0("stickers_notification")
    private final Object stickersNotification;

    @pmi0("stickers_pack_ids")
    private final List<Integer> stickersPackIds;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("texts")
    private final List<CatalogTextDto> texts;

    @pmi0("thumbs")
    private final List<Object> thumbs;

    @pmi0("title")
    private final String title;

    @pmi0("topshelf_items")
    private final List<TopshelfTopshelfItemDto> topshelfItems;

    @pmi0("url")
    private final String url;

    @pmi0("videos")
    private final List<VideoVideoFullDto> videos;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoCatalogBlockDto.kt */
    public static final class BlockViewTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BlockViewTypeDto[] $VALUES;

        @pmi0("banner")
        public static final BlockViewTypeDto BANNER;
        public static final Parcelable.Creator<BlockViewTypeDto> CREATOR;

        @pmi0("double_stacked_slider")
        public static final BlockViewTypeDto DOUBLE_STACKED_SLIDER;

        @pmi0("large_list")
        public static final BlockViewTypeDto LARGE_LIST;

        @pmi0("large_slider")
        public static final BlockViewTypeDto LARGE_SLIDER;

        @pmi0("list")
        public static final BlockViewTypeDto LIST;

        @pmi0("music_chart_list")
        public static final BlockViewTypeDto MUSIC_CHART_LIST;

        @pmi0("music_chart_triple_stacked_slider")
        public static final BlockViewTypeDto MUSIC_CHART_TRIPLE_STACKED_SLIDER;

        @pmi0("music_playable_audios_list")
        public static final BlockViewTypeDto MUSIC_PLAYABLE_AUDIOS_LIST;

        @pmi0("slider")
        public static final BlockViewTypeDto SLIDER;

        @pmi0("triple_stacked_slider")
        public static final BlockViewTypeDto TRIPLE_STACKED_SLIDER;
        private final String value;

        /* compiled from: VideoCatalogBlockDto.kt */
        public static final class a implements Parcelable.Creator<BlockViewTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final BlockViewTypeDto createFromParcel(Parcel parcel) {
                return BlockViewTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BlockViewTypeDto[] newArray(int i) {
                return new BlockViewTypeDto[i];
            }
        }

        static {
            BlockViewTypeDto blockViewTypeDto = new BlockViewTypeDto("SLIDER", 0, "slider");
            SLIDER = blockViewTypeDto;
            BlockViewTypeDto blockViewTypeDto2 = new BlockViewTypeDto("LARGE_SLIDER", 1, "large_slider");
            LARGE_SLIDER = blockViewTypeDto2;
            BlockViewTypeDto blockViewTypeDto3 = new BlockViewTypeDto("LIST", 2, "list");
            LIST = blockViewTypeDto3;
            BlockViewTypeDto blockViewTypeDto4 = new BlockViewTypeDto("LARGE_LIST", 3, "large_list");
            LARGE_LIST = blockViewTypeDto4;
            BlockViewTypeDto blockViewTypeDto5 = new BlockViewTypeDto("DOUBLE_STACKED_SLIDER", 4, "double_stacked_slider");
            DOUBLE_STACKED_SLIDER = blockViewTypeDto5;
            BlockViewTypeDto blockViewTypeDto6 = new BlockViewTypeDto("TRIPLE_STACKED_SLIDER", 5, "triple_stacked_slider");
            TRIPLE_STACKED_SLIDER = blockViewTypeDto6;
            BlockViewTypeDto blockViewTypeDto7 = new BlockViewTypeDto("BANNER", 6, "banner");
            BANNER = blockViewTypeDto7;
            BlockViewTypeDto blockViewTypeDto8 = new BlockViewTypeDto("MUSIC_PLAYABLE_AUDIOS_LIST", 7, "music_playable_audios_list");
            MUSIC_PLAYABLE_AUDIOS_LIST = blockViewTypeDto8;
            BlockViewTypeDto blockViewTypeDto9 = new BlockViewTypeDto("MUSIC_CHART_TRIPLE_STACKED_SLIDER", 8, "music_chart_triple_stacked_slider");
            MUSIC_CHART_TRIPLE_STACKED_SLIDER = blockViewTypeDto9;
            BlockViewTypeDto blockViewTypeDto10 = new BlockViewTypeDto("MUSIC_CHART_LIST", 9, "music_chart_list");
            MUSIC_CHART_LIST = blockViewTypeDto10;
            BlockViewTypeDto[] blockViewTypeDtoArr = {blockViewTypeDto, blockViewTypeDto2, blockViewTypeDto3, blockViewTypeDto4, blockViewTypeDto5, blockViewTypeDto6, blockViewTypeDto7, blockViewTypeDto8, blockViewTypeDto9, blockViewTypeDto10};
            $VALUES = blockViewTypeDtoArr;
            $ENTRIES = new asp(blockViewTypeDtoArr);
            CREATOR = new a();
        }

        private BlockViewTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static BlockViewTypeDto valueOf(String str) {
            return (BlockViewTypeDto) Enum.valueOf(BlockViewTypeDto.class, str);
        }

        public static BlockViewTypeDto[] values() {
            return (BlockViewTypeDto[]) $VALUES.clone();
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
    /* compiled from: VideoCatalogBlockDto.kt */
    public static final class DataTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DataTypeDto[] $VALUES;

        @pmi0("action")
        public static final DataTypeDto ACTION;

        @pmi0("albums")
        public static final DataTypeDto ALBUMS;

        @pmi0("artist")
        public static final DataTypeDto ARTIST;

        @pmi0("catalog_banners")
        public static final DataTypeDto CATALOG_BANNERS;
        public static final Parcelable.Creator<DataTypeDto> CREATOR;

        @pmi0("downloaded_videos")
        public static final DataTypeDto DOWNLOADED_VIDEOS;

        @pmi0("links")
        public static final DataTypeDto LINKS;

        @pmi0("music_audios")
        public static final DataTypeDto MUSIC_AUDIOS;

        @pmi0("music_playlists")
        public static final DataTypeDto MUSIC_PLAYLISTS;

        @pmi0("music_search_suggestions")
        public static final DataTypeDto MUSIC_SEARCH_SUGGESTIONS;

        @pmi0("placeholder")
        public static final DataTypeDto PLACEHOLDER;

        @pmi0("stickers_banners")
        public static final DataTypeDto STICKERS_BANNERS;

        @pmi0("stickers_notification")
        public static final DataTypeDto STICKERS_NOTIFICATION;

        @pmi0("stickers_packs")
        public static final DataTypeDto STICKERS_PACKS;

        @pmi0("topshelf_items")
        public static final DataTypeDto TOPSHELF_ITEMS;

        @pmi0("tv_channels")
        public static final DataTypeDto TV_CHANNELS;

        @pmi0("videos")
        public static final DataTypeDto VIDEOS;
        private final String value;

        /* compiled from: VideoCatalogBlockDto.kt */
        public static final class a implements Parcelable.Creator<DataTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final DataTypeDto createFromParcel(Parcel parcel) {
                return DataTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DataTypeDto[] newArray(int i) {
                return new DataTypeDto[i];
            }
        }

        static {
            DataTypeDto dataTypeDto = new DataTypeDto("VIDEOS", 0, "videos");
            VIDEOS = dataTypeDto;
            DataTypeDto dataTypeDto2 = new DataTypeDto("TV_CHANNELS", 1, "tv_channels");
            TV_CHANNELS = dataTypeDto2;
            DataTypeDto dataTypeDto3 = new DataTypeDto("ALBUMS", 2, "albums");
            ALBUMS = dataTypeDto3;
            DataTypeDto dataTypeDto4 = new DataTypeDto("LINKS", 3, "links");
            LINKS = dataTypeDto4;
            DataTypeDto dataTypeDto5 = new DataTypeDto("ACTION", 4, "action");
            ACTION = dataTypeDto5;
            DataTypeDto dataTypeDto6 = new DataTypeDto("PLACEHOLDER", 5, "placeholder");
            PLACEHOLDER = dataTypeDto6;
            DataTypeDto dataTypeDto7 = new DataTypeDto("MUSIC_AUDIOS", 6, "music_audios");
            MUSIC_AUDIOS = dataTypeDto7;
            DataTypeDto dataTypeDto8 = new DataTypeDto("MUSIC_PLAYLISTS", 7, "music_playlists");
            MUSIC_PLAYLISTS = dataTypeDto8;
            DataTypeDto dataTypeDto9 = new DataTypeDto("ARTIST", 8, "artist");
            ARTIST = dataTypeDto9;
            DataTypeDto dataTypeDto10 = new DataTypeDto("MUSIC_SEARCH_SUGGESTIONS", 9, "music_search_suggestions");
            MUSIC_SEARCH_SUGGESTIONS = dataTypeDto10;
            DataTypeDto dataTypeDto11 = new DataTypeDto("STICKERS_PACKS", 10, "stickers_packs");
            STICKERS_PACKS = dataTypeDto11;
            DataTypeDto dataTypeDto12 = new DataTypeDto("STICKERS_BANNERS", 11, "stickers_banners");
            STICKERS_BANNERS = dataTypeDto12;
            DataTypeDto dataTypeDto13 = new DataTypeDto("STICKERS_NOTIFICATION", 12, "stickers_notification");
            STICKERS_NOTIFICATION = dataTypeDto13;
            DataTypeDto dataTypeDto14 = new DataTypeDto("CATALOG_BANNERS", 13, "catalog_banners");
            CATALOG_BANNERS = dataTypeDto14;
            DataTypeDto dataTypeDto15 = new DataTypeDto("TOPSHELF_ITEMS", 14, "topshelf_items");
            TOPSHELF_ITEMS = dataTypeDto15;
            DataTypeDto dataTypeDto16 = new DataTypeDto("DOWNLOADED_VIDEOS", 15, "downloaded_videos");
            DOWNLOADED_VIDEOS = dataTypeDto16;
            DataTypeDto[] dataTypeDtoArr = {dataTypeDto, dataTypeDto2, dataTypeDto3, dataTypeDto4, dataTypeDto5, dataTypeDto6, dataTypeDto7, dataTypeDto8, dataTypeDto9, dataTypeDto10, dataTypeDto11, dataTypeDto12, dataTypeDto13, dataTypeDto14, dataTypeDto15, dataTypeDto16};
            $VALUES = dataTypeDtoArr;
            $ENTRIES = new asp(dataTypeDtoArr);
            CREATOR = new a();
        }

        private DataTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static DataTypeDto valueOf(String str) {
            return (DataTypeDto) Enum.valueOf(DataTypeDto.class, str);
        }

        public static DataTypeDto[] values() {
            return (DataTypeDto[]) $VALUES.clone();
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
    /* compiled from: VideoCatalogBlockDto.kt */
    public static final class FullscreenViewTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FullscreenViewTypeDto[] $VALUES;
        public static final Parcelable.Creator<FullscreenViewTypeDto> CREATOR;

        @pmi0("large_list")
        public static final FullscreenViewTypeDto LARGE_LIST;

        @pmi0("list")
        public static final FullscreenViewTypeDto LIST;
        private final String value;

        /* compiled from: VideoCatalogBlockDto.kt */
        public static final class a implements Parcelable.Creator<FullscreenViewTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final FullscreenViewTypeDto createFromParcel(Parcel parcel) {
                return FullscreenViewTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FullscreenViewTypeDto[] newArray(int i) {
                return new FullscreenViewTypeDto[i];
            }
        }

        static {
            FullscreenViewTypeDto fullscreenViewTypeDto = new FullscreenViewTypeDto("LIST", 0, "list");
            LIST = fullscreenViewTypeDto;
            FullscreenViewTypeDto fullscreenViewTypeDto2 = new FullscreenViewTypeDto("LARGE_LIST", 1, "large_list");
            LARGE_LIST = fullscreenViewTypeDto2;
            FullscreenViewTypeDto[] fullscreenViewTypeDtoArr = {fullscreenViewTypeDto, fullscreenViewTypeDto2};
            $VALUES = fullscreenViewTypeDtoArr;
            $ENTRIES = new asp(fullscreenViewTypeDtoArr);
            CREATOR = new a();
        }

        private FullscreenViewTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static FullscreenViewTypeDto valueOf(String str) {
            return (FullscreenViewTypeDto) Enum.valueOf(FullscreenViewTypeDto.class, str);
        }

        public static FullscreenViewTypeDto[] values() {
            return (FullscreenViewTypeDto[]) $VALUES.clone();
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

    /* compiled from: VideoCatalogBlockDto.kt */
    public static final class a implements Parcelable.Creator<VideoCatalogBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoCatalogBlockDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            ArrayList arrayList8;
            MediaPopupDto mediaPopupDto;
            ArrayList arrayList9;
            ArrayList arrayList10;
            UserId userId;
            ArrayList arrayList11;
            ArrayList arrayList12;
            FullscreenViewTypeDto fullscreenViewTypeDto;
            DataTypeDto createFromParcel;
            DataTypeDto dataTypeDto;
            Integer num;
            ArrayList arrayList13;
            ArrayList arrayList14;
            ArrayList arrayList15;
            ArrayList arrayList16;
            ArrayList arrayList17;
            ArrayList arrayList18;
            ArrayList arrayList19;
            Object obj;
            int i;
            ArrayList arrayList20;
            ArrayList arrayList21;
            ArrayList arrayList22;
            ArrayList arrayList23;
            CatalogBadgeDto catalogBadgeDto;
            ArrayList arrayList24;
            ArrayList arrayList25;
            String readString = parcel.readString();
            VideoCatalogBlockDto createFromParcel2 = parcel.readInt() == 0 ? null : VideoCatalogBlockDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(VideoCatalogBlockDto.class, parcel, arrayList, i2, 1);
                }
            }
            AudioArtistDto audioArtistDto = (AudioArtistDto) parcel.readParcelable(VideoCatalogBlockDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(VideoCatalogBlockDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = bo.b(VideoCatalogBlockDto.class, parcel, arrayList3, i4, 1);
                }
            }
            BlockViewTypeDto createFromParcel3 = parcel.readInt() == 0 ? null : BlockViewTypeDto.CREATOR.createFromParcel(parcel);
            ArrayList arrayList26 = null;
            ArrayList arrayList27 = arrayList;
            String readString2 = parcel.readString();
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(VideoCatalogBlockDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto2 = (BaseBoolIntDto) parcel.readParcelable(VideoCatalogBlockDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto3 = (BaseBoolIntDto) parcel.readParcelable(VideoCatalogBlockDto.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList26 = new ArrayList(readInt4);
                int i5 = 0;
                while (i5 != readInt4) {
                    i5 = en.a(CatalogCatalogLinkDto.CREATOR, parcel, arrayList26, i5, 1);
                    readString = readString;
                    createFromParcel2 = createFromParcel2;
                }
            }
            String str = readString;
            VideoCatalogBlockDto videoCatalogBlockDto = createFromParcel2;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList4 = new ArrayList(readInt5);
                int i6 = 0;
                while (i6 != readInt5) {
                    i6 = bo.b(VideoCatalogBlockDto.class, parcel, arrayList4, i6, 1);
                    readInt5 = readInt5;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList6 = arrayList4;
                arrayList5 = null;
            } else {
                int readInt6 = parcel.readInt();
                arrayList5 = new ArrayList(readInt6);
                arrayList6 = arrayList4;
                int i7 = 0;
                while (i7 != readInt6) {
                    arrayList5.add(parcel.readValue(VideoCatalogBlockDto.class.getClassLoader()));
                    i7++;
                    readInt6 = readInt6;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList8 = arrayList27;
                arrayList7 = null;
            } else {
                int readInt7 = parcel.readInt();
                arrayList7 = new ArrayList(readInt7);
                arrayList8 = arrayList27;
                int i8 = 0;
                while (i8 != readInt7) {
                    arrayList7.add(parcel.readValue(VideoCatalogBlockDto.class.getClassLoader()));
                    i8++;
                    readInt7 = readInt7;
                }
            }
            String readString3 = parcel.readString();
            UserId userId2 = (UserId) parcel.readParcelable(VideoCatalogBlockDto.class.getClassLoader());
            FullscreenViewTypeDto createFromParcel4 = parcel.readInt() != 0 ? FullscreenViewTypeDto.CREATOR.createFromParcel(parcel) : null;
            MediaPopupDto mediaPopupDto2 = (MediaPopupDto) parcel.readParcelable(VideoCatalogBlockDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                mediaPopupDto = mediaPopupDto2;
                arrayList9 = arrayList7;
                userId = userId2;
                arrayList10 = null;
            } else {
                mediaPopupDto = mediaPopupDto2;
                int readInt8 = parcel.readInt();
                arrayList9 = arrayList7;
                arrayList10 = new ArrayList(readInt8);
                userId = userId2;
                int i9 = 0;
                while (i9 != readInt8) {
                    i9 = en.a(AudioSearchSuggestionDto.CREATOR, parcel, arrayList10, i9, 1);
                    readInt8 = readInt8;
                    audioArtistDto = audioArtistDto;
                }
            }
            AudioArtistDto audioArtistDto2 = audioArtistDto;
            ArrayList arrayList28 = arrayList8;
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList12 = arrayList10;
                arrayList11 = null;
            } else {
                int readInt9 = parcel.readInt();
                arrayList11 = new ArrayList(readInt9);
                arrayList12 = arrayList10;
                int i10 = 0;
                while (i10 != readInt9) {
                    arrayList11.add(parcel.readValue(VideoCatalogBlockDto.class.getClassLoader()));
                    i10++;
                    readInt9 = readInt9;
                }
            }
            String readString5 = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                fullscreenViewTypeDto = createFromParcel4;
                createFromParcel = null;
            } else {
                fullscreenViewTypeDto = createFromParcel4;
                createFromParcel = DataTypeDto.CREATOR.createFromParcel(parcel);
            }
            DataTypeDto dataTypeDto2 = createFromParcel;
            if (parcel.readInt() == 0) {
                dataTypeDto = dataTypeDto2;
                num = valueOf;
                arrayList14 = arrayList28;
                arrayList13 = null;
            } else {
                dataTypeDto = dataTypeDto2;
                int readInt10 = parcel.readInt();
                num = valueOf;
                arrayList13 = new ArrayList(readInt10);
                arrayList14 = arrayList28;
                int i11 = 0;
                while (i11 != readInt10) {
                    i11 = bo.b(VideoCatalogBlockDto.class, parcel, arrayList13, i11, 1);
                    readInt10 = readInt10;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList16 = arrayList13;
                arrayList15 = null;
            } else {
                int readInt11 = parcel.readInt();
                arrayList15 = new ArrayList(readInt11);
                arrayList16 = arrayList13;
                int i12 = 0;
                while (i12 != readInt11) {
                    i12 = pm0.b(parcel, arrayList15, i12, 1);
                    readInt11 = readInt11;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList18 = arrayList15;
                arrayList17 = null;
            } else {
                int readInt12 = parcel.readInt();
                arrayList17 = new ArrayList(readInt12);
                arrayList18 = arrayList15;
                int i13 = 0;
                while (i13 != readInt12) {
                    i13 = en.a(StickersCatalogBannerDto.CREATOR, parcel, arrayList17, i13, 1);
                    readInt12 = readInt12;
                    arrayList11 = arrayList11;
                }
            }
            ArrayList arrayList29 = arrayList11;
            Object readValue = parcel.readValue(VideoCatalogBlockDto.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int readInt13 = parcel.readInt();
                arrayList19 = new ArrayList(readInt13);
                int i14 = 0;
                while (true) {
                    obj = readValue;
                    i = 1;
                    if (i14 == readInt13) {
                        break;
                    }
                    i14 = pm0.b(parcel, arrayList19, i14, 1);
                    readValue = obj;
                }
            } else {
                arrayList19 = null;
                obj = readValue;
                i = 1;
            }
            if (parcel.readInt() == 0) {
                arrayList21 = arrayList17;
                arrayList20 = null;
            } else {
                int readInt14 = parcel.readInt();
                arrayList20 = new ArrayList(readInt14);
                arrayList21 = arrayList17;
                int i15 = 0;
                while (i15 != readInt14) {
                    i15 = pm0.b(parcel, arrayList20, i15, i);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList22 = null;
            } else {
                int readInt15 = parcel.readInt();
                arrayList22 = new ArrayList(readInt15);
                int i16 = 0;
                while (i16 != readInt15) {
                    i16 = en.a(CatalogTextDto.CREATOR, parcel, arrayList22, i16, 1);
                    readInt15 = readInt15;
                    arrayList19 = arrayList19;
                }
            }
            ArrayList arrayList30 = arrayList19;
            CatalogBadgeDto createFromParcel5 = parcel.readInt() == 0 ? null : CatalogBadgeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt16 = parcel.readInt();
                arrayList23 = new ArrayList(readInt16);
                catalogBadgeDto = createFromParcel5;
                int i17 = 0;
                while (true) {
                    arrayList24 = arrayList22;
                    if (i17 == readInt16) {
                        break;
                    }
                    i17 = en.a(CatalogBannerDto.CREATOR, parcel, arrayList23, i17, 1);
                    arrayList22 = arrayList24;
                    readInt16 = readInt16;
                }
            } else {
                catalogBadgeDto = createFromParcel5;
                arrayList23 = null;
                arrayList24 = arrayList22;
            }
            if (parcel.readInt() == 0) {
                arrayList25 = null;
            } else {
                int readInt17 = parcel.readInt();
                arrayList25 = new ArrayList(readInt17);
                int i18 = 0;
                while (i18 != readInt17) {
                    i18 = en.a(TopshelfTopshelfItemDto.CREATOR, parcel, arrayList25, i18, 1);
                    readInt17 = readInt17;
                    arrayList23 = arrayList23;
                }
            }
            return new VideoCatalogBlockDto(str, videoCatalogBlockDto, arrayList14, audioArtistDto2, arrayList2, arrayList3, createFromParcel3, readString2, baseBoolIntDto, baseBoolIntDto2, baseBoolIntDto3, arrayList26, createStringArrayList, arrayList6, arrayList5, arrayList9, readString3, userId, fullscreenViewTypeDto, mediaPopupDto, arrayList12, readString4, arrayList29, readString5, num, dataTypeDto, arrayList16, arrayList18, arrayList21, obj, arrayList30, arrayList20, arrayList24, catalogBadgeDto, arrayList23, arrayList25);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoCatalogBlockDto[] newArray(int i) {
            return new VideoCatalogBlockDto[i];
        }
    }

    public VideoCatalogBlockDto(String str, VideoCatalogBlockDto videoCatalogBlockDto, List<VideoVideoAlbumFullDto> list, AudioArtistDto audioArtistDto, List<AudioArtistDto> list2, List<AudioCuratorDto> list3, BlockViewTypeDto blockViewTypeDto, String str2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, List<CatalogCatalogLinkDto> list4, List<String> list5, List<ShortVideoAudioDto> list6, List<? extends Object> list7, List<? extends Object> list8, String str3, UserId userId, FullscreenViewTypeDto fullscreenViewTypeDto, MediaPopupDto mediaPopupDto, List<AudioSearchSuggestionDto> list9, String str4, List<? extends Object> list10, String str5, Integer num, DataTypeDto dataTypeDto, List<VideoVideoFullDto> list11, List<Integer> list12, List<StickersCatalogBannerDto> list13, Object obj, List<Integer> list14, List<Integer> list15, List<CatalogTextDto> list16, CatalogBadgeDto catalogBadgeDto, List<CatalogBannerDto> list17, List<TopshelfTopshelfItemDto> list18) {
        this.id = str;
        this.fullscreenAction = videoCatalogBlockDto;
        this.albums = list;
        this.artist = audioArtistDto;
        this.artists = list2;
        this.curators = list3;
        this.blockViewType = blockViewTypeDto;
        this.url = str2;
        this.isEditable = baseBoolIntDto;
        this.itemsIgnorable = baseBoolIntDto2;
        this.noHeader = baseBoolIntDto3;
        this.links = list4;
        this.listenEvents = list5;
        this.shortVideoAudios = list6;
        this.musicAudios = list7;
        this.musicPlaylists = list8;
        this.nextFrom = str3;
        this.ownerId = userId;
        this.fullscreenViewType = fullscreenViewTypeDto;
        this.placeholderMeta = mediaPopupDto;
        this.searchSuggestions = list9;
        this.subtitle = str4;
        this.thumbs = list10;
        this.title = str5;
        this.counter = num;
        this.dataType = dataTypeDto;
        this.videos = list11;
        this.stickersPackIds = list12;
        this.stickersBanners = list13;
        this.stickersNotification = obj;
        this.groupIds = list14;
        this.groupInvites = list15;
        this.texts = list16;
        this.badge = catalogBadgeDto;
        this.catalogBanners = list17;
        this.topshelfItems = list18;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoCatalogBlockDto)) {
            return false;
        }
        VideoCatalogBlockDto videoCatalogBlockDto = (VideoCatalogBlockDto) obj;
        return epx.f(this.id, videoCatalogBlockDto.id) && epx.f(this.fullscreenAction, videoCatalogBlockDto.fullscreenAction) && epx.f(this.albums, videoCatalogBlockDto.albums) && epx.f(this.artist, videoCatalogBlockDto.artist) && epx.f(this.artists, videoCatalogBlockDto.artists) && epx.f(this.curators, videoCatalogBlockDto.curators) && this.blockViewType == videoCatalogBlockDto.blockViewType && epx.f(this.url, videoCatalogBlockDto.url) && this.isEditable == videoCatalogBlockDto.isEditable && this.itemsIgnorable == videoCatalogBlockDto.itemsIgnorable && this.noHeader == videoCatalogBlockDto.noHeader && epx.f(this.links, videoCatalogBlockDto.links) && epx.f(this.listenEvents, videoCatalogBlockDto.listenEvents) && epx.f(this.shortVideoAudios, videoCatalogBlockDto.shortVideoAudios) && epx.f(this.musicAudios, videoCatalogBlockDto.musicAudios) && epx.f(this.musicPlaylists, videoCatalogBlockDto.musicPlaylists) && epx.f(this.nextFrom, videoCatalogBlockDto.nextFrom) && epx.f(this.ownerId, videoCatalogBlockDto.ownerId) && this.fullscreenViewType == videoCatalogBlockDto.fullscreenViewType && epx.f(this.placeholderMeta, videoCatalogBlockDto.placeholderMeta) && epx.f(this.searchSuggestions, videoCatalogBlockDto.searchSuggestions) && epx.f(this.subtitle, videoCatalogBlockDto.subtitle) && epx.f(this.thumbs, videoCatalogBlockDto.thumbs) && epx.f(this.title, videoCatalogBlockDto.title) && epx.f(this.counter, videoCatalogBlockDto.counter) && this.dataType == videoCatalogBlockDto.dataType && epx.f(this.videos, videoCatalogBlockDto.videos) && epx.f(this.stickersPackIds, videoCatalogBlockDto.stickersPackIds) && epx.f(this.stickersBanners, videoCatalogBlockDto.stickersBanners) && epx.f(this.stickersNotification, videoCatalogBlockDto.stickersNotification) && epx.f(this.groupIds, videoCatalogBlockDto.groupIds) && epx.f(this.groupInvites, videoCatalogBlockDto.groupInvites) && epx.f(this.texts, videoCatalogBlockDto.texts) && epx.f(this.badge, videoCatalogBlockDto.badge) && epx.f(this.catalogBanners, videoCatalogBlockDto.catalogBanners) && epx.f(this.topshelfItems, videoCatalogBlockDto.topshelfItems);
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        VideoCatalogBlockDto videoCatalogBlockDto = this.fullscreenAction;
        int hashCode2 = (hashCode + (videoCatalogBlockDto == null ? 0 : videoCatalogBlockDto.hashCode())) * 31;
        List<VideoVideoAlbumFullDto> list = this.albums;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        AudioArtistDto audioArtistDto = this.artist;
        int hashCode4 = (hashCode3 + (audioArtistDto == null ? 0 : audioArtistDto.hashCode())) * 31;
        List<AudioArtistDto> list2 = this.artists;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<AudioCuratorDto> list3 = this.curators;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        BlockViewTypeDto blockViewTypeDto = this.blockViewType;
        int hashCode7 = (hashCode6 + (blockViewTypeDto == null ? 0 : blockViewTypeDto.hashCode())) * 31;
        String str = this.url;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.isEditable;
        int hashCode9 = (hashCode8 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.itemsIgnorable;
        int hashCode10 = (hashCode9 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.noHeader;
        int hashCode11 = (hashCode10 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        List<CatalogCatalogLinkDto> list4 = this.links;
        int hashCode12 = (hashCode11 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.listenEvents;
        int hashCode13 = (hashCode12 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<ShortVideoAudioDto> list6 = this.shortVideoAudios;
        int hashCode14 = (hashCode13 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<Object> list7 = this.musicAudios;
        int hashCode15 = (hashCode14 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<Object> list8 = this.musicPlaylists;
        int hashCode16 = (hashCode15 + (list8 == null ? 0 : list8.hashCode())) * 31;
        String str2 = this.nextFrom;
        int hashCode17 = (hashCode16 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UserId userId = this.ownerId;
        int hashCode18 = (hashCode17 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        FullscreenViewTypeDto fullscreenViewTypeDto = this.fullscreenViewType;
        int hashCode19 = (hashCode18 + (fullscreenViewTypeDto == null ? 0 : fullscreenViewTypeDto.hashCode())) * 31;
        MediaPopupDto mediaPopupDto = this.placeholderMeta;
        int hashCode20 = (hashCode19 + (mediaPopupDto == null ? 0 : mediaPopupDto.hashCode())) * 31;
        List<AudioSearchSuggestionDto> list9 = this.searchSuggestions;
        int hashCode21 = (hashCode20 + (list9 == null ? 0 : list9.hashCode())) * 31;
        String str3 = this.subtitle;
        int hashCode22 = (hashCode21 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Object> list10 = this.thumbs;
        int hashCode23 = (hashCode22 + (list10 == null ? 0 : list10.hashCode())) * 31;
        String str4 = this.title;
        int hashCode24 = (hashCode23 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.counter;
        int hashCode25 = (hashCode24 + (num == null ? 0 : num.hashCode())) * 31;
        DataTypeDto dataTypeDto = this.dataType;
        int hashCode26 = (hashCode25 + (dataTypeDto == null ? 0 : dataTypeDto.hashCode())) * 31;
        List<VideoVideoFullDto> list11 = this.videos;
        int hashCode27 = (hashCode26 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<Integer> list12 = this.stickersPackIds;
        int hashCode28 = (hashCode27 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<StickersCatalogBannerDto> list13 = this.stickersBanners;
        int hashCode29 = (hashCode28 + (list13 == null ? 0 : list13.hashCode())) * 31;
        Object obj = this.stickersNotification;
        int hashCode30 = (hashCode29 + (obj == null ? 0 : obj.hashCode())) * 31;
        List<Integer> list14 = this.groupIds;
        int hashCode31 = (hashCode30 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<Integer> list15 = this.groupInvites;
        int hashCode32 = (hashCode31 + (list15 == null ? 0 : list15.hashCode())) * 31;
        List<CatalogTextDto> list16 = this.texts;
        int hashCode33 = (hashCode32 + (list16 == null ? 0 : list16.hashCode())) * 31;
        CatalogBadgeDto catalogBadgeDto = this.badge;
        int hashCode34 = (hashCode33 + (catalogBadgeDto == null ? 0 : catalogBadgeDto.hashCode())) * 31;
        List<CatalogBannerDto> list17 = this.catalogBanners;
        int hashCode35 = (hashCode34 + (list17 == null ? 0 : list17.hashCode())) * 31;
        List<TopshelfTopshelfItemDto> list18 = this.topshelfItems;
        return hashCode35 + (list18 != null ? list18.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoCatalogBlockDto(id=");
        sb.append(this.id);
        sb.append(", fullscreenAction=");
        sb.append(this.fullscreenAction);
        sb.append(", albums=");
        sb.append(this.albums);
        sb.append(", artist=");
        sb.append(this.artist);
        sb.append(", artists=");
        sb.append(this.artists);
        sb.append(", curators=");
        sb.append(this.curators);
        sb.append(", blockViewType=");
        sb.append(this.blockViewType);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", isEditable=");
        sb.append(this.isEditable);
        sb.append(", itemsIgnorable=");
        sb.append(this.itemsIgnorable);
        sb.append(", noHeader=");
        sb.append(this.noHeader);
        sb.append(", links=");
        sb.append(this.links);
        sb.append(", listenEvents=");
        sb.append(this.listenEvents);
        sb.append(", shortVideoAudios=");
        sb.append(this.shortVideoAudios);
        sb.append(", musicAudios=");
        sb.append(this.musicAudios);
        sb.append(", musicPlaylists=");
        sb.append(this.musicPlaylists);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", fullscreenViewType=");
        sb.append(this.fullscreenViewType);
        sb.append(", placeholderMeta=");
        sb.append(this.placeholderMeta);
        sb.append(", searchSuggestions=");
        sb.append(this.searchSuggestions);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", thumbs=");
        sb.append(this.thumbs);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", counter=");
        sb.append(this.counter);
        sb.append(", dataType=");
        sb.append(this.dataType);
        sb.append(", videos=");
        sb.append(this.videos);
        sb.append(", stickersPackIds=");
        sb.append(this.stickersPackIds);
        sb.append(", stickersBanners=");
        sb.append(this.stickersBanners);
        sb.append(", stickersNotification=");
        sb.append(this.stickersNotification);
        sb.append(", groupIds=");
        sb.append(this.groupIds);
        sb.append(", groupInvites=");
        sb.append(this.groupInvites);
        sb.append(", texts=");
        sb.append(this.texts);
        sb.append(", badge=");
        sb.append(this.badge);
        sb.append(", catalogBanners=");
        sb.append(this.catalogBanners);
        sb.append(", topshelfItems=");
        return ms9.a(')', sb, this.topshelfItems);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        VideoCatalogBlockDto videoCatalogBlockDto = this.fullscreenAction;
        if (videoCatalogBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoCatalogBlockDto.writeToParcel(parcel, i);
        }
        List<VideoVideoAlbumFullDto> list = this.albums;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeParcelable(this.artist, i);
        List<AudioArtistDto> list2 = this.artists;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<AudioCuratorDto> list3 = this.curators;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        BlockViewTypeDto blockViewTypeDto = this.blockViewType;
        if (blockViewTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            blockViewTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.url);
        parcel.writeParcelable(this.isEditable, i);
        parcel.writeParcelable(this.itemsIgnorable, i);
        parcel.writeParcelable(this.noHeader, i);
        List<CatalogCatalogLinkDto> list4 = this.links;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((CatalogCatalogLinkDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.listenEvents);
        List<ShortVideoAudioDto> list5 = this.shortVideoAudios;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                parcel.writeParcelable((Parcelable) f5.next(), i);
            }
        }
        List<Object> list6 = this.musicAudios;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list6, 1);
            while (f6.hasNext()) {
                parcel.writeValue(f6.next());
            }
        }
        List<Object> list7 = this.musicPlaylists;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f7 = dn.f(parcel, list7, 1);
            while (f7.hasNext()) {
                parcel.writeValue(f7.next());
            }
        }
        parcel.writeString(this.nextFrom);
        parcel.writeParcelable(this.ownerId, i);
        FullscreenViewTypeDto fullscreenViewTypeDto = this.fullscreenViewType;
        if (fullscreenViewTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fullscreenViewTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.placeholderMeta, i);
        List<AudioSearchSuggestionDto> list8 = this.searchSuggestions;
        if (list8 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f8 = dn.f(parcel, list8, 1);
            while (f8.hasNext()) {
                ((AudioSearchSuggestionDto) f8.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.subtitle);
        List<Object> list9 = this.thumbs;
        if (list9 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f9 = dn.f(parcel, list9, 1);
            while (f9.hasNext()) {
                parcel.writeValue(f9.next());
            }
        }
        parcel.writeString(this.title);
        Integer num = this.counter;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        DataTypeDto dataTypeDto = this.dataType;
        if (dataTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dataTypeDto.writeToParcel(parcel, i);
        }
        List<VideoVideoFullDto> list10 = this.videos;
        if (list10 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f10 = dn.f(parcel, list10, 1);
            while (f10.hasNext()) {
                parcel.writeParcelable((Parcelable) f10.next(), i);
            }
        }
        List<Integer> list11 = this.stickersPackIds;
        if (list11 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f11 = dn.f(parcel, list11, 1);
            while (f11.hasNext()) {
                parcel.writeInt(((Number) f11.next()).intValue());
            }
        }
        List<StickersCatalogBannerDto> list12 = this.stickersBanners;
        if (list12 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f12 = dn.f(parcel, list12, 1);
            while (f12.hasNext()) {
                ((StickersCatalogBannerDto) f12.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeValue(this.stickersNotification);
        List<Integer> list13 = this.groupIds;
        if (list13 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f13 = dn.f(parcel, list13, 1);
            while (f13.hasNext()) {
                parcel.writeInt(((Number) f13.next()).intValue());
            }
        }
        List<Integer> list14 = this.groupInvites;
        if (list14 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f14 = dn.f(parcel, list14, 1);
            while (f14.hasNext()) {
                parcel.writeInt(((Number) f14.next()).intValue());
            }
        }
        List<CatalogTextDto> list15 = this.texts;
        if (list15 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f15 = dn.f(parcel, list15, 1);
            while (f15.hasNext()) {
                ((CatalogTextDto) f15.next()).writeToParcel(parcel, i);
            }
        }
        CatalogBadgeDto catalogBadgeDto = this.badge;
        if (catalogBadgeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogBadgeDto.writeToParcel(parcel, i);
        }
        List<CatalogBannerDto> list16 = this.catalogBanners;
        if (list16 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f16 = dn.f(parcel, list16, 1);
            while (f16.hasNext()) {
                ((CatalogBannerDto) f16.next()).writeToParcel(parcel, i);
            }
        }
        List<TopshelfTopshelfItemDto> list17 = this.topshelfItems;
        if (list17 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f17 = dn.f(parcel, list17, 1);
        while (f17.hasNext()) {
            ((TopshelfTopshelfItemDto) f17.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoCatalogBlockDto(String str, VideoCatalogBlockDto videoCatalogBlockDto, List list, AudioArtistDto audioArtistDto, List list2, List list3, BlockViewTypeDto blockViewTypeDto, String str2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, List list4, List list5, List list6, List list7, List list8, String str3, UserId userId, FullscreenViewTypeDto fullscreenViewTypeDto, MediaPopupDto mediaPopupDto, List list9, String str4, List list10, String str5, Integer num, DataTypeDto dataTypeDto, List list11, List list12, List list13, Object obj, List list14, List list15, List list16, CatalogBadgeDto catalogBadgeDto, List list17, List list18, int i, int i2, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : videoCatalogBlockDto, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : audioArtistDto, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : blockViewTypeDto, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : baseBoolIntDto, (i & 512) != 0 ? null : baseBoolIntDto2, (i & 1024) != 0 ? null : baseBoolIntDto3, (i & 2048) != 0 ? null : list4, (i & 4096) != 0 ? null : list5, (i & 8192) != 0 ? null : list6, (i & 16384) != 0 ? null : list7, (i & 32768) != 0 ? null : list8, (i & 65536) != 0 ? null : str3, (i & 131072) != 0 ? null : userId, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : fullscreenViewTypeDto, (i & 524288) != 0 ? null : mediaPopupDto, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list9, (i & 2097152) != 0 ? null : str4, (i & 4194304) != 0 ? null : list10, (i & 8388608) != 0 ? null : str5, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : num, (i & 33554432) != 0 ? null : dataTypeDto, (i & 67108864) != 0 ? null : list11, (i & 134217728) != 0 ? null : list12, (i & 268435456) != 0 ? null : list13, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : obj, (i & 1073741824) != 0 ? null : list14, (i & Integer.MIN_VALUE) != 0 ? null : list15, (i2 & 1) != 0 ? null : list16, (i2 & 2) != 0 ? null : catalogBadgeDto, (i2 & 4) != 0 ? null : list17, (i2 & 8) != 0 ? null : list18);
    }
}
