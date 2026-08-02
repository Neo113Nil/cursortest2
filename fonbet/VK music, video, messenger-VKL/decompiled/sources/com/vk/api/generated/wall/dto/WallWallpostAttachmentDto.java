package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.coremedia.iso.boxes.MetaBox;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.apps.dto.AppsMiniAppAttachDto;
import com.vk.api.generated.articles.dto.ArticlesArticleDto;
import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioCuratorDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.base.dto.BaseLinkDto;
import com.vk.api.generated.base.dto.BaseStickerDto;
import com.vk.api.generated.docs.dto.DocsDocDto;
import com.vk.api.generated.donut.dto.DonutDonutLinkAttachDto;
import com.vk.api.generated.events.dto.EventsEventAttachDto;
import com.vk.api.generated.groups.dto.GroupsGroupAttachDto;
import com.vk.api.generated.market.dto.MarketMarketAlbumDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.narratives.dto.NarrativesNarrativeDto;
import com.vk.api.generated.notes.dto.NotesNoteDto;
import com.vk.api.generated.pages.dto.PagesWikipageFullDto;
import com.vk.api.generated.photos.dto.PhotosPhotoAlbumDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.photos.dto.PhotosWallListAttachDto;
import com.vk.api.generated.polls.dto.PollsPollDto;
import com.vk.api.generated.prettyCards.dto.PrettyCardsPrettyCardsDto;
import com.vk.api.generated.situationalSuggests.dto.SituationalSuggestsThemeDto;
import com.vk.api.generated.textlives.dto.TextlivesTextliveTextpostBlockDto;
import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.voicerooms.dto.VoiceroomsRoomDto;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;

/* compiled from: WallWallpostAttachmentDto.kt */
/* loaded from: classes15.dex */
public final class WallWallpostAttachmentDto implements Parcelable {
    public static final Parcelable.Creator<WallWallpostAttachmentDto> CREATOR = new a();

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("action_button")
    private final WallActionButtonDto actionButton;

    @pmi0("album")
    private final PhotosPhotoAlbumDto album;

    /* renamed from: app, reason: collision with root package name */
    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    private final WallAppPostDto f86app;

    @pmi0("article")
    private final ArticlesArticleDto article;

    @pmi0("artist")
    private final AudioArtistDto artist;

    @pmi0("audio")
    private final AudioAudioDto audio;

    @pmi0("audio_playlist")
    private final AudioPlaylistDto audioPlaylist;

    @pmi0("chip")
    private final WallWallpostAttachmentChipDto chip;

    @pmi0("clip")
    private final VideoVideoFullDto clip;

    @pmi0("compact")
    private final WallWallpostAttachmentCompactDto compact;

    @pmi0("curator")
    private final AudioCuratorDto curator;

    @pmi0("doc")
    private final DocsDocDto doc;

    @pmi0("donut_link")
    private final DonutDonutLinkAttachDto donutLink;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final EventsEventAttachDto event;

    @pmi0("geo")
    private final WallGeoDto geo;

    @pmi0("graffiti")
    private final WallGraffitiDto graffiti;

    @pmi0("group")
    private final GroupsGroupAttachDto group;

    @pmi0("is_nft")
    private final Boolean isNft;

    @pmi0("link")
    private final BaseLinkDto link;

    @pmi0("market")
    private final MarketMarketItemDto market;

    @pmi0("market_album")
    private final MarketMarketAlbumDto marketAlbum;

    @pmi0("market_link")
    private final WallWallpostAttachmentMarketLinkDto marketLink;

    @pmi0("message_to_bc")
    private final WallWallpostAttachmentMessageToBcDto messageToBc;

    @pmi0(MetaBox.TYPE)
    private final WallWallpostAttachmentMetaDto meta;

    @pmi0("mini_app")
    private final AppsMiniAppAttachDto miniApp;

    @pmi0("narrative")
    private final NarrativesNarrativeDto narrative;

    @pmi0("note")
    private final NotesNoteDto note;

    @pmi0("online_booking")
    private final WallWallpostAttachmentOnlineBookingDto onlineBooking;

    @pmi0("page")
    private final PagesWikipageFullDto page;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("photos_list")
    private final PhotosWallListAttachDto photosList;

    @pmi0("podcast")
    private final AudioAudioDto podcast;

    @pmi0("poll")
    private final PollsPollDto poll;

    @pmi0("posted_photo")
    private final WallPostedPhotoDto postedPhoto;

    @pmi0("pretty_cards")
    private final PrettyCardsPrettyCardsDto prettyCards;

    @pmi0(SignalingProtocol.KEY_ROOM)
    private final VoiceroomsRoomDto room;

    @pmi0("situational_theme")
    private final SituationalSuggestsThemeDto situationalTheme;

    @pmi0("source_url")
    private final String sourceUrl;

    @pmi0("sticker")
    private final BaseStickerDto sticker;

    @pmi0(TtmlNode.TAG_STYLE)
    private final WallWallpostAttachmentStyleDto style;

    @pmi0("textlive")
    private final TextlivesTextliveTextpostBlockDto textlive;

    @pmi0("textpost")
    private final TextlivesTextliveTextpostBlockDto textpost;

    @pmi0("textpost_publish")
    private final TextlivesTextliveTextpostBlockDto textpostPublish;

    @pmi0("type")
    private final WallWallpostAttachmentTypeDto type;

    @pmi0("video")
    private final VideoVideoFullDto video;

    @pmi0("video_playlist")
    private final VideoVideoAlbumFullDto videoPlaylist;

    /* compiled from: WallWallpostAttachmentDto.kt */
    public static final class a implements Parcelable.Creator<WallWallpostAttachmentDto> {
        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentDto createFromParcel(Parcel parcel) {
            MarketMarketItemDto marketMarketItemDto;
            MarketMarketAlbumDto createFromParcel;
            MarketMarketAlbumDto marketMarketAlbumDto;
            NarrativesNarrativeDto createFromParcel2;
            NarrativesNarrativeDto narrativesNarrativeDto;
            NotesNoteDto createFromParcel3;
            PhotosPhotoDto photosPhotoDto;
            PhotosWallListAttachDto createFromParcel4;
            PollsPollDto pollsPollDto;
            WallPostedPhotoDto createFromParcel5;
            WallPostedPhotoDto wallPostedPhotoDto;
            PrettyCardsPrettyCardsDto createFromParcel6;
            VideoVideoFullDto videoVideoFullDto;
            VideoVideoAlbumFullDto createFromParcel7;
            VideoVideoAlbumFullDto videoVideoAlbumFullDto;
            SituationalSuggestsThemeDto createFromParcel8;
            SituationalSuggestsThemeDto situationalSuggestsThemeDto;
            DonutDonutLinkAttachDto createFromParcel9;
            ArticlesArticleDto articlesArticleDto;
            TextlivesTextliveTextpostBlockDto createFromParcel10;
            TextlivesTextliveTextpostBlockDto textlivesTextliveTextpostBlockDto;
            TextlivesTextliveTextpostBlockDto createFromParcel11;
            TextlivesTextliveTextpostBlockDto textlivesTextliveTextpostBlockDto2;
            TextlivesTextliveTextpostBlockDto createFromParcel12;
            TextlivesTextliveTextpostBlockDto textlivesTextliveTextpostBlockDto3;
            AudioPlaylistDto createFromParcel13;
            AudioPlaylistDto audioPlaylistDto;
            BaseStickerDto createFromParcel14;
            AudioAudioDto audioAudioDto;
            AudioCuratorDto createFromParcel15;
            AudioCuratorDto audioCuratorDto;
            WallGeoDto createFromParcel16;
            WallGeoDto wallGeoDto;
            WallWallpostAttachmentStyleDto createFromParcel17;
            WallWallpostAttachmentStyleDto wallWallpostAttachmentStyleDto;
            WallWallpostAttachmentCompactDto createFromParcel18;
            WallWallpostAttachmentCompactDto wallWallpostAttachmentCompactDto;
            WallWallpostAttachmentChipDto createFromParcel19;
            WallWallpostAttachmentChipDto wallWallpostAttachmentChipDto;
            WallWallpostAttachmentMetaDto createFromParcel20;
            WallWallpostAttachmentMetaDto wallWallpostAttachmentMetaDto;
            VoiceroomsRoomDto createFromParcel21;
            Boolean valueOf;
            VoiceroomsRoomDto voiceroomsRoomDto;
            WallWallpostAttachmentOnlineBookingDto createFromParcel22;
            WallWallpostAttachmentOnlineBookingDto wallWallpostAttachmentOnlineBookingDto;
            WallWallpostAttachmentMarketLinkDto createFromParcel23;
            WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto = (WallWallpostAttachmentTypeDto) parcel.readParcelable(WallWallpostAttachmentDto.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            WallActionButtonDto createFromParcel24 = parcel.readInt() == 0 ? null : WallActionButtonDto.CREATOR.createFromParcel(parcel);
            PhotosPhotoAlbumDto createFromParcel25 = parcel.readInt() == 0 ? null : PhotosPhotoAlbumDto.CREATOR.createFromParcel(parcel);
            WallAppPostDto createFromParcel26 = parcel.readInt() == 0 ? null : WallAppPostDto.CREATOR.createFromParcel(parcel);
            AudioAudioDto audioAudioDto2 = (AudioAudioDto) parcel.readParcelable(WallWallpostAttachmentDto.class.getClassLoader());
            DocsDocDto createFromParcel27 = parcel.readInt() == 0 ? null : DocsDocDto.CREATOR.createFromParcel(parcel);
            EventsEventAttachDto createFromParcel28 = parcel.readInt() == 0 ? null : EventsEventAttachDto.CREATOR.createFromParcel(parcel);
            GroupsGroupAttachDto createFromParcel29 = parcel.readInt() == 0 ? null : GroupsGroupAttachDto.CREATOR.createFromParcel(parcel);
            AppsMiniAppAttachDto createFromParcel30 = parcel.readInt() == 0 ? null : AppsMiniAppAttachDto.CREATOR.createFromParcel(parcel);
            WallGraffitiDto createFromParcel31 = parcel.readInt() == 0 ? null : WallGraffitiDto.CREATOR.createFromParcel(parcel);
            BaseLinkDto baseLinkDto = (BaseLinkDto) parcel.readParcelable(WallWallpostAttachmentDto.class.getClassLoader());
            MarketMarketItemDto marketMarketItemDto2 = (MarketMarketItemDto) parcel.readParcelable(WallWallpostAttachmentDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                marketMarketItemDto = marketMarketItemDto2;
                createFromParcel = null;
            } else {
                marketMarketItemDto = marketMarketItemDto2;
                createFromParcel = MarketMarketAlbumDto.CREATOR.createFromParcel(parcel);
            }
            MarketMarketAlbumDto marketMarketAlbumDto2 = createFromParcel;
            if (parcel.readInt() == 0) {
                marketMarketAlbumDto = marketMarketAlbumDto2;
                createFromParcel2 = null;
            } else {
                marketMarketAlbumDto = marketMarketAlbumDto2;
                createFromParcel2 = NarrativesNarrativeDto.CREATOR.createFromParcel(parcel);
            }
            NarrativesNarrativeDto narrativesNarrativeDto2 = createFromParcel2;
            if (parcel.readInt() == 0) {
                narrativesNarrativeDto = narrativesNarrativeDto2;
                createFromParcel3 = null;
            } else {
                narrativesNarrativeDto = narrativesNarrativeDto2;
                createFromParcel3 = NotesNoteDto.CREATOR.createFromParcel(parcel);
            }
            NotesNoteDto notesNoteDto = createFromParcel3;
            PagesWikipageFullDto pagesWikipageFullDto = (PagesWikipageFullDto) parcel.readParcelable(WallWallpostAttachmentDto.class.getClassLoader());
            PhotosPhotoDto photosPhotoDto2 = (PhotosPhotoDto) parcel.readParcelable(WallWallpostAttachmentDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                photosPhotoDto = photosPhotoDto2;
                createFromParcel4 = null;
            } else {
                photosPhotoDto = photosPhotoDto2;
                createFromParcel4 = PhotosWallListAttachDto.CREATOR.createFromParcel(parcel);
            }
            PhotosWallListAttachDto photosWallListAttachDto = createFromParcel4;
            PollsPollDto pollsPollDto2 = (PollsPollDto) parcel.readParcelable(WallWallpostAttachmentDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                pollsPollDto = pollsPollDto2;
                createFromParcel5 = null;
            } else {
                pollsPollDto = pollsPollDto2;
                createFromParcel5 = WallPostedPhotoDto.CREATOR.createFromParcel(parcel);
            }
            WallPostedPhotoDto wallPostedPhotoDto2 = createFromParcel5;
            if (parcel.readInt() == 0) {
                wallPostedPhotoDto = wallPostedPhotoDto2;
                createFromParcel6 = null;
            } else {
                wallPostedPhotoDto = wallPostedPhotoDto2;
                createFromParcel6 = PrettyCardsPrettyCardsDto.CREATOR.createFromParcel(parcel);
            }
            PrettyCardsPrettyCardsDto prettyCardsPrettyCardsDto = createFromParcel6;
            VideoVideoFullDto videoVideoFullDto2 = (VideoVideoFullDto) parcel.readParcelable(WallWallpostAttachmentDto.class.getClassLoader());
            VideoVideoFullDto videoVideoFullDto3 = (VideoVideoFullDto) parcel.readParcelable(WallWallpostAttachmentDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                videoVideoFullDto = videoVideoFullDto3;
                createFromParcel7 = null;
            } else {
                videoVideoFullDto = videoVideoFullDto3;
                createFromParcel7 = VideoVideoAlbumFullDto.CREATOR.createFromParcel(parcel);
            }
            VideoVideoAlbumFullDto videoVideoAlbumFullDto2 = createFromParcel7;
            if (parcel.readInt() == 0) {
                videoVideoAlbumFullDto = videoVideoAlbumFullDto2;
                createFromParcel8 = null;
            } else {
                videoVideoAlbumFullDto = videoVideoAlbumFullDto2;
                createFromParcel8 = SituationalSuggestsThemeDto.CREATOR.createFromParcel(parcel);
            }
            SituationalSuggestsThemeDto situationalSuggestsThemeDto2 = createFromParcel8;
            if (parcel.readInt() == 0) {
                situationalSuggestsThemeDto = situationalSuggestsThemeDto2;
                createFromParcel9 = null;
            } else {
                situationalSuggestsThemeDto = situationalSuggestsThemeDto2;
                createFromParcel9 = DonutDonutLinkAttachDto.CREATOR.createFromParcel(parcel);
            }
            DonutDonutLinkAttachDto donutDonutLinkAttachDto = createFromParcel9;
            ArticlesArticleDto articlesArticleDto2 = (ArticlesArticleDto) parcel.readParcelable(WallWallpostAttachmentDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                articlesArticleDto = articlesArticleDto2;
                createFromParcel10 = null;
            } else {
                articlesArticleDto = articlesArticleDto2;
                createFromParcel10 = TextlivesTextliveTextpostBlockDto.CREATOR.createFromParcel(parcel);
            }
            TextlivesTextliveTextpostBlockDto textlivesTextliveTextpostBlockDto4 = createFromParcel10;
            if (parcel.readInt() == 0) {
                textlivesTextliveTextpostBlockDto = textlivesTextliveTextpostBlockDto4;
                createFromParcel11 = null;
            } else {
                textlivesTextliveTextpostBlockDto = textlivesTextliveTextpostBlockDto4;
                createFromParcel11 = TextlivesTextliveTextpostBlockDto.CREATOR.createFromParcel(parcel);
            }
            TextlivesTextliveTextpostBlockDto textlivesTextliveTextpostBlockDto5 = createFromParcel11;
            if (parcel.readInt() == 0) {
                textlivesTextliveTextpostBlockDto2 = textlivesTextliveTextpostBlockDto5;
                createFromParcel12 = null;
            } else {
                textlivesTextliveTextpostBlockDto2 = textlivesTextliveTextpostBlockDto5;
                createFromParcel12 = TextlivesTextliveTextpostBlockDto.CREATOR.createFromParcel(parcel);
            }
            TextlivesTextliveTextpostBlockDto textlivesTextliveTextpostBlockDto6 = createFromParcel12;
            if (parcel.readInt() == 0) {
                textlivesTextliveTextpostBlockDto3 = textlivesTextliveTextpostBlockDto6;
                createFromParcel13 = null;
            } else {
                textlivesTextliveTextpostBlockDto3 = textlivesTextliveTextpostBlockDto6;
                createFromParcel13 = AudioPlaylistDto.CREATOR.createFromParcel(parcel);
            }
            AudioPlaylistDto audioPlaylistDto2 = createFromParcel13;
            if (parcel.readInt() == 0) {
                audioPlaylistDto = audioPlaylistDto2;
                createFromParcel14 = null;
            } else {
                audioPlaylistDto = audioPlaylistDto2;
                createFromParcel14 = BaseStickerDto.CREATOR.createFromParcel(parcel);
            }
            BaseStickerDto baseStickerDto = createFromParcel14;
            AudioAudioDto audioAudioDto3 = (AudioAudioDto) parcel.readParcelable(WallWallpostAttachmentDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                audioAudioDto = audioAudioDto3;
                createFromParcel15 = null;
            } else {
                audioAudioDto = audioAudioDto3;
                createFromParcel15 = AudioCuratorDto.CREATOR.createFromParcel(parcel);
            }
            AudioCuratorDto audioCuratorDto2 = createFromParcel15;
            AudioArtistDto audioArtistDto = (AudioArtistDto) parcel.readParcelable(WallWallpostAttachmentDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                audioCuratorDto = audioCuratorDto2;
                createFromParcel16 = null;
            } else {
                audioCuratorDto = audioCuratorDto2;
                createFromParcel16 = WallGeoDto.CREATOR.createFromParcel(parcel);
            }
            WallGeoDto wallGeoDto2 = createFromParcel16;
            if (parcel.readInt() == 0) {
                wallGeoDto = wallGeoDto2;
                createFromParcel17 = null;
            } else {
                wallGeoDto = wallGeoDto2;
                createFromParcel17 = WallWallpostAttachmentStyleDto.CREATOR.createFromParcel(parcel);
            }
            WallWallpostAttachmentStyleDto wallWallpostAttachmentStyleDto2 = createFromParcel17;
            if (parcel.readInt() == 0) {
                wallWallpostAttachmentStyleDto = wallWallpostAttachmentStyleDto2;
                createFromParcel18 = null;
            } else {
                wallWallpostAttachmentStyleDto = wallWallpostAttachmentStyleDto2;
                createFromParcel18 = WallWallpostAttachmentCompactDto.CREATOR.createFromParcel(parcel);
            }
            WallWallpostAttachmentCompactDto wallWallpostAttachmentCompactDto2 = createFromParcel18;
            if (parcel.readInt() == 0) {
                wallWallpostAttachmentCompactDto = wallWallpostAttachmentCompactDto2;
                createFromParcel19 = null;
            } else {
                wallWallpostAttachmentCompactDto = wallWallpostAttachmentCompactDto2;
                createFromParcel19 = WallWallpostAttachmentChipDto.CREATOR.createFromParcel(parcel);
            }
            WallWallpostAttachmentChipDto wallWallpostAttachmentChipDto2 = createFromParcel19;
            if (parcel.readInt() == 0) {
                wallWallpostAttachmentChipDto = wallWallpostAttachmentChipDto2;
                createFromParcel20 = null;
            } else {
                wallWallpostAttachmentChipDto = wallWallpostAttachmentChipDto2;
                createFromParcel20 = WallWallpostAttachmentMetaDto.CREATOR.createFromParcel(parcel);
            }
            WallWallpostAttachmentMetaDto wallWallpostAttachmentMetaDto2 = createFromParcel20;
            if (parcel.readInt() == 0) {
                wallWallpostAttachmentMetaDto = wallWallpostAttachmentMetaDto2;
                createFromParcel21 = null;
            } else {
                wallWallpostAttachmentMetaDto = wallWallpostAttachmentMetaDto2;
                createFromParcel21 = VoiceroomsRoomDto.CREATOR.createFromParcel(parcel);
            }
            VoiceroomsRoomDto voiceroomsRoomDto2 = createFromParcel21;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                voiceroomsRoomDto = voiceroomsRoomDto2;
                createFromParcel22 = null;
            } else {
                voiceroomsRoomDto = voiceroomsRoomDto2;
                createFromParcel22 = WallWallpostAttachmentOnlineBookingDto.CREATOR.createFromParcel(parcel);
            }
            WallWallpostAttachmentOnlineBookingDto wallWallpostAttachmentOnlineBookingDto2 = createFromParcel22;
            if (parcel.readInt() == 0) {
                wallWallpostAttachmentOnlineBookingDto = wallWallpostAttachmentOnlineBookingDto2;
                createFromParcel23 = null;
            } else {
                wallWallpostAttachmentOnlineBookingDto = wallWallpostAttachmentOnlineBookingDto2;
                createFromParcel23 = WallWallpostAttachmentMarketLinkDto.CREATOR.createFromParcel(parcel);
            }
            return new WallWallpostAttachmentDto(wallWallpostAttachmentTypeDto, readString, readString2, createFromParcel24, createFromParcel25, createFromParcel26, audioAudioDto2, createFromParcel27, createFromParcel28, createFromParcel29, createFromParcel30, createFromParcel31, baseLinkDto, marketMarketItemDto, marketMarketAlbumDto, narrativesNarrativeDto, notesNoteDto, pagesWikipageFullDto, photosPhotoDto, photosWallListAttachDto, pollsPollDto, wallPostedPhotoDto, prettyCardsPrettyCardsDto, videoVideoFullDto2, videoVideoFullDto, videoVideoAlbumFullDto, situationalSuggestsThemeDto, donutDonutLinkAttachDto, articlesArticleDto, textlivesTextliveTextpostBlockDto, textlivesTextliveTextpostBlockDto2, textlivesTextliveTextpostBlockDto3, audioPlaylistDto, baseStickerDto, audioAudioDto, audioCuratorDto, audioArtistDto, wallGeoDto, wallWallpostAttachmentStyleDto, wallWallpostAttachmentCompactDto, wallWallpostAttachmentChipDto, wallWallpostAttachmentMetaDto, voiceroomsRoomDto, valueOf, wallWallpostAttachmentOnlineBookingDto, createFromParcel23, parcel.readInt() == 0 ? null : WallWallpostAttachmentMessageToBcDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentDto[] newArray(int i) {
            return new WallWallpostAttachmentDto[i];
        }
    }

    public WallWallpostAttachmentDto(WallWallpostAttachmentTypeDto wallWallpostAttachmentTypeDto, String str, String str2, WallActionButtonDto wallActionButtonDto, PhotosPhotoAlbumDto photosPhotoAlbumDto, WallAppPostDto wallAppPostDto, AudioAudioDto audioAudioDto, DocsDocDto docsDocDto, EventsEventAttachDto eventsEventAttachDto, GroupsGroupAttachDto groupsGroupAttachDto, AppsMiniAppAttachDto appsMiniAppAttachDto, WallGraffitiDto wallGraffitiDto, BaseLinkDto baseLinkDto, MarketMarketItemDto marketMarketItemDto, MarketMarketAlbumDto marketMarketAlbumDto, NarrativesNarrativeDto narrativesNarrativeDto, NotesNoteDto notesNoteDto, PagesWikipageFullDto pagesWikipageFullDto, PhotosPhotoDto photosPhotoDto, PhotosWallListAttachDto photosWallListAttachDto, PollsPollDto pollsPollDto, WallPostedPhotoDto wallPostedPhotoDto, PrettyCardsPrettyCardsDto prettyCardsPrettyCardsDto, VideoVideoFullDto videoVideoFullDto, VideoVideoFullDto videoVideoFullDto2, VideoVideoAlbumFullDto videoVideoAlbumFullDto, SituationalSuggestsThemeDto situationalSuggestsThemeDto, DonutDonutLinkAttachDto donutDonutLinkAttachDto, ArticlesArticleDto articlesArticleDto, TextlivesTextliveTextpostBlockDto textlivesTextliveTextpostBlockDto, TextlivesTextliveTextpostBlockDto textlivesTextliveTextpostBlockDto2, TextlivesTextliveTextpostBlockDto textlivesTextliveTextpostBlockDto3, AudioPlaylistDto audioPlaylistDto, BaseStickerDto baseStickerDto, AudioAudioDto audioAudioDto2, AudioCuratorDto audioCuratorDto, AudioArtistDto audioArtistDto, WallGeoDto wallGeoDto, WallWallpostAttachmentStyleDto wallWallpostAttachmentStyleDto, WallWallpostAttachmentCompactDto wallWallpostAttachmentCompactDto, WallWallpostAttachmentChipDto wallWallpostAttachmentChipDto, WallWallpostAttachmentMetaDto wallWallpostAttachmentMetaDto, VoiceroomsRoomDto voiceroomsRoomDto, Boolean bool, WallWallpostAttachmentOnlineBookingDto wallWallpostAttachmentOnlineBookingDto, WallWallpostAttachmentMarketLinkDto wallWallpostAttachmentMarketLinkDto, WallWallpostAttachmentMessageToBcDto wallWallpostAttachmentMessageToBcDto) {
        this.type = wallWallpostAttachmentTypeDto;
        this.accessKey = str;
        this.sourceUrl = str2;
        this.actionButton = wallActionButtonDto;
        this.album = photosPhotoAlbumDto;
        this.f86app = wallAppPostDto;
        this.audio = audioAudioDto;
        this.doc = docsDocDto;
        this.event = eventsEventAttachDto;
        this.group = groupsGroupAttachDto;
        this.miniApp = appsMiniAppAttachDto;
        this.graffiti = wallGraffitiDto;
        this.link = baseLinkDto;
        this.market = marketMarketItemDto;
        this.marketAlbum = marketMarketAlbumDto;
        this.narrative = narrativesNarrativeDto;
        this.note = notesNoteDto;
        this.page = pagesWikipageFullDto;
        this.photo = photosPhotoDto;
        this.photosList = photosWallListAttachDto;
        this.poll = pollsPollDto;
        this.postedPhoto = wallPostedPhotoDto;
        this.prettyCards = prettyCardsPrettyCardsDto;
        this.video = videoVideoFullDto;
        this.clip = videoVideoFullDto2;
        this.videoPlaylist = videoVideoAlbumFullDto;
        this.situationalTheme = situationalSuggestsThemeDto;
        this.donutLink = donutDonutLinkAttachDto;
        this.article = articlesArticleDto;
        this.textlive = textlivesTextliveTextpostBlockDto;
        this.textpost = textlivesTextliveTextpostBlockDto2;
        this.textpostPublish = textlivesTextliveTextpostBlockDto3;
        this.audioPlaylist = audioPlaylistDto;
        this.sticker = baseStickerDto;
        this.podcast = audioAudioDto2;
        this.curator = audioCuratorDto;
        this.artist = audioArtistDto;
        this.geo = wallGeoDto;
        this.style = wallWallpostAttachmentStyleDto;
        this.compact = wallWallpostAttachmentCompactDto;
        this.chip = wallWallpostAttachmentChipDto;
        this.meta = wallWallpostAttachmentMetaDto;
        this.room = voiceroomsRoomDto;
        this.isNft = bool;
        this.onlineBooking = wallWallpostAttachmentOnlineBookingDto;
        this.marketLink = wallWallpostAttachmentMarketLinkDto;
        this.messageToBc = wallWallpostAttachmentMessageToBcDto;
    }

    public final WallGeoDto B() {
        return this.geo;
    }

    public final WallGraffitiDto C() {
        return this.graffiti;
    }

    public final BaseLinkDto D() {
        return this.link;
    }

    public final BaseStickerDto D0() {
        return this.sticker;
    }

    public final MarketMarketItemDto F() {
        return this.market;
    }

    public final WallWallpostAttachmentStyleDto F0() {
        return this.style;
    }

    public final MarketMarketAlbumDto G() {
        return this.marketAlbum;
    }

    public final WallWallpostAttachmentTypeDto H0() {
        return this.type;
    }

    public final WallWallpostAttachmentMetaDto K() {
        return this.meta;
    }

    public final VideoVideoFullDto K0() {
        return this.video;
    }

    public final AppsMiniAppAttachDto M() {
        return this.miniApp;
    }

    public final NarrativesNarrativeDto R() {
        return this.narrative;
    }

    public final NotesNoteDto T() {
        return this.note;
    }

    public final PagesWikipageFullDto W() {
        return this.page;
    }

    public final PhotosPhotoDto Z() {
        return this.photo;
    }

    public final AudioAudioDto a0() {
        return this.podcast;
    }

    public final WallActionButtonDto d() {
        return this.actionButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final PhotosPhotoAlbumDto e() {
        return this.album;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallWallpostAttachmentDto)) {
            return false;
        }
        WallWallpostAttachmentDto wallWallpostAttachmentDto = (WallWallpostAttachmentDto) obj;
        return this.type == wallWallpostAttachmentDto.type && epx.f(this.accessKey, wallWallpostAttachmentDto.accessKey) && epx.f(this.sourceUrl, wallWallpostAttachmentDto.sourceUrl) && epx.f(this.actionButton, wallWallpostAttachmentDto.actionButton) && epx.f(this.album, wallWallpostAttachmentDto.album) && epx.f(this.f86app, wallWallpostAttachmentDto.f86app) && epx.f(this.audio, wallWallpostAttachmentDto.audio) && epx.f(this.doc, wallWallpostAttachmentDto.doc) && epx.f(this.event, wallWallpostAttachmentDto.event) && epx.f(this.group, wallWallpostAttachmentDto.group) && epx.f(this.miniApp, wallWallpostAttachmentDto.miniApp) && epx.f(this.graffiti, wallWallpostAttachmentDto.graffiti) && epx.f(this.link, wallWallpostAttachmentDto.link) && epx.f(this.market, wallWallpostAttachmentDto.market) && epx.f(this.marketAlbum, wallWallpostAttachmentDto.marketAlbum) && epx.f(this.narrative, wallWallpostAttachmentDto.narrative) && epx.f(this.note, wallWallpostAttachmentDto.note) && epx.f(this.page, wallWallpostAttachmentDto.page) && epx.f(this.photo, wallWallpostAttachmentDto.photo) && epx.f(this.photosList, wallWallpostAttachmentDto.photosList) && epx.f(this.poll, wallWallpostAttachmentDto.poll) && epx.f(this.postedPhoto, wallWallpostAttachmentDto.postedPhoto) && epx.f(this.prettyCards, wallWallpostAttachmentDto.prettyCards) && epx.f(this.video, wallWallpostAttachmentDto.video) && epx.f(this.clip, wallWallpostAttachmentDto.clip) && epx.f(this.videoPlaylist, wallWallpostAttachmentDto.videoPlaylist) && epx.f(this.situationalTheme, wallWallpostAttachmentDto.situationalTheme) && epx.f(this.donutLink, wallWallpostAttachmentDto.donutLink) && epx.f(this.article, wallWallpostAttachmentDto.article) && epx.f(this.textlive, wallWallpostAttachmentDto.textlive) && epx.f(this.textpost, wallWallpostAttachmentDto.textpost) && epx.f(this.textpostPublish, wallWallpostAttachmentDto.textpostPublish) && epx.f(this.audioPlaylist, wallWallpostAttachmentDto.audioPlaylist) && epx.f(this.sticker, wallWallpostAttachmentDto.sticker) && epx.f(this.podcast, wallWallpostAttachmentDto.podcast) && epx.f(this.curator, wallWallpostAttachmentDto.curator) && epx.f(this.artist, wallWallpostAttachmentDto.artist) && epx.f(this.geo, wallWallpostAttachmentDto.geo) && this.style == wallWallpostAttachmentDto.style && epx.f(this.compact, wallWallpostAttachmentDto.compact) && epx.f(this.chip, wallWallpostAttachmentDto.chip) && epx.f(this.meta, wallWallpostAttachmentDto.meta) && epx.f(this.room, wallWallpostAttachmentDto.room) && epx.f(this.isNft, wallWallpostAttachmentDto.isNft) && epx.f(this.onlineBooking, wallWallpostAttachmentDto.onlineBooking) && epx.f(this.marketLink, wallWallpostAttachmentDto.marketLink) && epx.f(this.messageToBc, wallWallpostAttachmentDto.messageToBc);
    }

    public final WallAppPostDto f() {
        return this.f86app;
    }

    public final ArticlesArticleDto g() {
        return this.article;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.accessKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sourceUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        WallActionButtonDto wallActionButtonDto = this.actionButton;
        int hashCode4 = (hashCode3 + (wallActionButtonDto == null ? 0 : wallActionButtonDto.hashCode())) * 31;
        PhotosPhotoAlbumDto photosPhotoAlbumDto = this.album;
        int hashCode5 = (hashCode4 + (photosPhotoAlbumDto == null ? 0 : photosPhotoAlbumDto.hashCode())) * 31;
        WallAppPostDto wallAppPostDto = this.f86app;
        int hashCode6 = (hashCode5 + (wallAppPostDto == null ? 0 : wallAppPostDto.hashCode())) * 31;
        AudioAudioDto audioAudioDto = this.audio;
        int hashCode7 = (hashCode6 + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        DocsDocDto docsDocDto = this.doc;
        int hashCode8 = (hashCode7 + (docsDocDto == null ? 0 : docsDocDto.hashCode())) * 31;
        EventsEventAttachDto eventsEventAttachDto = this.event;
        int hashCode9 = (hashCode8 + (eventsEventAttachDto == null ? 0 : eventsEventAttachDto.hashCode())) * 31;
        GroupsGroupAttachDto groupsGroupAttachDto = this.group;
        int hashCode10 = (hashCode9 + (groupsGroupAttachDto == null ? 0 : groupsGroupAttachDto.hashCode())) * 31;
        AppsMiniAppAttachDto appsMiniAppAttachDto = this.miniApp;
        int hashCode11 = (hashCode10 + (appsMiniAppAttachDto == null ? 0 : appsMiniAppAttachDto.hashCode())) * 31;
        WallGraffitiDto wallGraffitiDto = this.graffiti;
        int hashCode12 = (hashCode11 + (wallGraffitiDto == null ? 0 : wallGraffitiDto.hashCode())) * 31;
        BaseLinkDto baseLinkDto = this.link;
        int hashCode13 = (hashCode12 + (baseLinkDto == null ? 0 : baseLinkDto.hashCode())) * 31;
        MarketMarketItemDto marketMarketItemDto = this.market;
        int hashCode14 = (hashCode13 + (marketMarketItemDto == null ? 0 : marketMarketItemDto.hashCode())) * 31;
        MarketMarketAlbumDto marketMarketAlbumDto = this.marketAlbum;
        int hashCode15 = (hashCode14 + (marketMarketAlbumDto == null ? 0 : marketMarketAlbumDto.hashCode())) * 31;
        NarrativesNarrativeDto narrativesNarrativeDto = this.narrative;
        int hashCode16 = (hashCode15 + (narrativesNarrativeDto == null ? 0 : narrativesNarrativeDto.hashCode())) * 31;
        NotesNoteDto notesNoteDto = this.note;
        int hashCode17 = (hashCode16 + (notesNoteDto == null ? 0 : notesNoteDto.hashCode())) * 31;
        PagesWikipageFullDto pagesWikipageFullDto = this.page;
        int hashCode18 = (hashCode17 + (pagesWikipageFullDto == null ? 0 : pagesWikipageFullDto.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode19 = (hashCode18 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        PhotosWallListAttachDto photosWallListAttachDto = this.photosList;
        int hashCode20 = (hashCode19 + (photosWallListAttachDto == null ? 0 : photosWallListAttachDto.hashCode())) * 31;
        PollsPollDto pollsPollDto = this.poll;
        int hashCode21 = (hashCode20 + (pollsPollDto == null ? 0 : pollsPollDto.hashCode())) * 31;
        WallPostedPhotoDto wallPostedPhotoDto = this.postedPhoto;
        int hashCode22 = (hashCode21 + (wallPostedPhotoDto == null ? 0 : wallPostedPhotoDto.hashCode())) * 31;
        PrettyCardsPrettyCardsDto prettyCardsPrettyCardsDto = this.prettyCards;
        int hashCode23 = (hashCode22 + (prettyCardsPrettyCardsDto == null ? 0 : prettyCardsPrettyCardsDto.hashCode())) * 31;
        VideoVideoFullDto videoVideoFullDto = this.video;
        int hashCode24 = (hashCode23 + (videoVideoFullDto == null ? 0 : videoVideoFullDto.hashCode())) * 31;
        VideoVideoFullDto videoVideoFullDto2 = this.clip;
        int hashCode25 = (hashCode24 + (videoVideoFullDto2 == null ? 0 : videoVideoFullDto2.hashCode())) * 31;
        VideoVideoAlbumFullDto videoVideoAlbumFullDto = this.videoPlaylist;
        int hashCode26 = (hashCode25 + (videoVideoAlbumFullDto == null ? 0 : videoVideoAlbumFullDto.hashCode())) * 31;
        SituationalSuggestsThemeDto situationalSuggestsThemeDto = this.situationalTheme;
        int hashCode27 = (hashCode26 + (situationalSuggestsThemeDto == null ? 0 : situationalSuggestsThemeDto.hashCode())) * 31;
        DonutDonutLinkAttachDto donutDonutLinkAttachDto = this.donutLink;
        int hashCode28 = (hashCode27 + (donutDonutLinkAttachDto == null ? 0 : donutDonutLinkAttachDto.hashCode())) * 31;
        ArticlesArticleDto articlesArticleDto = this.article;
        int hashCode29 = (hashCode28 + (articlesArticleDto == null ? 0 : articlesArticleDto.hashCode())) * 31;
        TextlivesTextliveTextpostBlockDto textlivesTextliveTextpostBlockDto = this.textlive;
        int hashCode30 = (hashCode29 + (textlivesTextliveTextpostBlockDto == null ? 0 : textlivesTextliveTextpostBlockDto.hashCode())) * 31;
        TextlivesTextliveTextpostBlockDto textlivesTextliveTextpostBlockDto2 = this.textpost;
        int hashCode31 = (hashCode30 + (textlivesTextliveTextpostBlockDto2 == null ? 0 : textlivesTextliveTextpostBlockDto2.hashCode())) * 31;
        TextlivesTextliveTextpostBlockDto textlivesTextliveTextpostBlockDto3 = this.textpostPublish;
        int hashCode32 = (hashCode31 + (textlivesTextliveTextpostBlockDto3 == null ? 0 : textlivesTextliveTextpostBlockDto3.hashCode())) * 31;
        AudioPlaylistDto audioPlaylistDto = this.audioPlaylist;
        int hashCode33 = (hashCode32 + (audioPlaylistDto == null ? 0 : audioPlaylistDto.hashCode())) * 31;
        BaseStickerDto baseStickerDto = this.sticker;
        int hashCode34 = (hashCode33 + (baseStickerDto == null ? 0 : baseStickerDto.hashCode())) * 31;
        AudioAudioDto audioAudioDto2 = this.podcast;
        int hashCode35 = (hashCode34 + (audioAudioDto2 == null ? 0 : audioAudioDto2.hashCode())) * 31;
        AudioCuratorDto audioCuratorDto = this.curator;
        int hashCode36 = (hashCode35 + (audioCuratorDto == null ? 0 : audioCuratorDto.hashCode())) * 31;
        AudioArtistDto audioArtistDto = this.artist;
        int hashCode37 = (hashCode36 + (audioArtistDto == null ? 0 : audioArtistDto.hashCode())) * 31;
        WallGeoDto wallGeoDto = this.geo;
        int hashCode38 = (hashCode37 + (wallGeoDto == null ? 0 : wallGeoDto.hashCode())) * 31;
        WallWallpostAttachmentStyleDto wallWallpostAttachmentStyleDto = this.style;
        int hashCode39 = (hashCode38 + (wallWallpostAttachmentStyleDto == null ? 0 : wallWallpostAttachmentStyleDto.hashCode())) * 31;
        WallWallpostAttachmentCompactDto wallWallpostAttachmentCompactDto = this.compact;
        int hashCode40 = (hashCode39 + (wallWallpostAttachmentCompactDto == null ? 0 : wallWallpostAttachmentCompactDto.hashCode())) * 31;
        WallWallpostAttachmentChipDto wallWallpostAttachmentChipDto = this.chip;
        int hashCode41 = (hashCode40 + (wallWallpostAttachmentChipDto == null ? 0 : wallWallpostAttachmentChipDto.hashCode())) * 31;
        WallWallpostAttachmentMetaDto wallWallpostAttachmentMetaDto = this.meta;
        int hashCode42 = (hashCode41 + (wallWallpostAttachmentMetaDto == null ? 0 : wallWallpostAttachmentMetaDto.hashCode())) * 31;
        VoiceroomsRoomDto voiceroomsRoomDto = this.room;
        int hashCode43 = (hashCode42 + (voiceroomsRoomDto == null ? 0 : voiceroomsRoomDto.hashCode())) * 31;
        Boolean bool = this.isNft;
        int hashCode44 = (hashCode43 + (bool == null ? 0 : bool.hashCode())) * 31;
        WallWallpostAttachmentOnlineBookingDto wallWallpostAttachmentOnlineBookingDto = this.onlineBooking;
        int hashCode45 = (hashCode44 + (wallWallpostAttachmentOnlineBookingDto == null ? 0 : wallWallpostAttachmentOnlineBookingDto.hashCode())) * 31;
        WallWallpostAttachmentMarketLinkDto wallWallpostAttachmentMarketLinkDto = this.marketLink;
        int hashCode46 = (hashCode45 + (wallWallpostAttachmentMarketLinkDto == null ? 0 : wallWallpostAttachmentMarketLinkDto.hashCode())) * 31;
        WallWallpostAttachmentMessageToBcDto wallWallpostAttachmentMessageToBcDto = this.messageToBc;
        return hashCode46 + (wallWallpostAttachmentMessageToBcDto != null ? wallWallpostAttachmentMessageToBcDto.hashCode() : 0);
    }

    public final AudioArtistDto i() {
        return this.artist;
    }

    public final AudioAudioDto j() {
        return this.audio;
    }

    public final AudioPlaylistDto k() {
        return this.audioPlaylist;
    }

    public final WallWallpostAttachmentCompactDto l() {
        return this.compact;
    }

    public final PollsPollDto l0() {
        return this.poll;
    }

    public final AudioCuratorDto n() {
        return this.curator;
    }

    public final DocsDocDto o() {
        return this.doc;
    }

    public final DonutDonutLinkAttachDto p() {
        return this.donutLink;
    }

    public final String toString() {
        return "WallWallpostAttachmentDto(type=" + this.type + ", accessKey=" + this.accessKey + ", sourceUrl=" + this.sourceUrl + ", actionButton=" + this.actionButton + ", album=" + this.album + ", app=" + this.f86app + ", audio=" + this.audio + ", doc=" + this.doc + ", event=" + this.event + ", group=" + this.group + ", miniApp=" + this.miniApp + ", graffiti=" + this.graffiti + ", link=" + this.link + ", market=" + this.market + ", marketAlbum=" + this.marketAlbum + ", narrative=" + this.narrative + ", note=" + this.note + ", page=" + this.page + ", photo=" + this.photo + ", photosList=" + this.photosList + ", poll=" + this.poll + ", postedPhoto=" + this.postedPhoto + ", prettyCards=" + this.prettyCards + ", video=" + this.video + ", clip=" + this.clip + ", videoPlaylist=" + this.videoPlaylist + ", situationalTheme=" + this.situationalTheme + ", donutLink=" + this.donutLink + ", article=" + this.article + ", textlive=" + this.textlive + ", textpost=" + this.textpost + ", textpostPublish=" + this.textpostPublish + ", audioPlaylist=" + this.audioPlaylist + ", sticker=" + this.sticker + ", podcast=" + this.podcast + ", curator=" + this.curator + ", artist=" + this.artist + ", geo=" + this.geo + ", style=" + this.style + ", compact=" + this.compact + ", chip=" + this.chip + ", meta=" + this.meta + ", room=" + this.room + ", isNft=" + this.isNft + ", onlineBooking=" + this.onlineBooking + ", marketLink=" + this.marketLink + ", messageToBc=" + this.messageToBc + ')';
    }

    public final EventsEventAttachDto u() {
        return this.event;
    }

    public final WallPostedPhotoDto v0() {
        return this.postedPhoto;
    }

    public final PrettyCardsPrettyCardsDto w0() {
        return this.prettyCards;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.type, i);
        parcel.writeString(this.accessKey);
        parcel.writeString(this.sourceUrl);
        WallActionButtonDto wallActionButtonDto = this.actionButton;
        if (wallActionButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallActionButtonDto.writeToParcel(parcel, i);
        }
        PhotosPhotoAlbumDto photosPhotoAlbumDto = this.album;
        if (photosPhotoAlbumDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photosPhotoAlbumDto.writeToParcel(parcel, i);
        }
        WallAppPostDto wallAppPostDto = this.f86app;
        if (wallAppPostDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallAppPostDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.audio, i);
        DocsDocDto docsDocDto = this.doc;
        if (docsDocDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            docsDocDto.writeToParcel(parcel, i);
        }
        EventsEventAttachDto eventsEventAttachDto = this.event;
        if (eventsEventAttachDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eventsEventAttachDto.writeToParcel(parcel, i);
        }
        GroupsGroupAttachDto groupsGroupAttachDto = this.group;
        if (groupsGroupAttachDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupsGroupAttachDto.writeToParcel(parcel, i);
        }
        AppsMiniAppAttachDto appsMiniAppAttachDto = this.miniApp;
        if (appsMiniAppAttachDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsMiniAppAttachDto.writeToParcel(parcel, i);
        }
        WallGraffitiDto wallGraffitiDto = this.graffiti;
        if (wallGraffitiDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallGraffitiDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.link, i);
        parcel.writeParcelable(this.market, i);
        MarketMarketAlbumDto marketMarketAlbumDto = this.marketAlbum;
        if (marketMarketAlbumDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketMarketAlbumDto.writeToParcel(parcel, i);
        }
        NarrativesNarrativeDto narrativesNarrativeDto = this.narrative;
        if (narrativesNarrativeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            narrativesNarrativeDto.writeToParcel(parcel, i);
        }
        NotesNoteDto notesNoteDto = this.note;
        if (notesNoteDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notesNoteDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.page, i);
        parcel.writeParcelable(this.photo, i);
        PhotosWallListAttachDto photosWallListAttachDto = this.photosList;
        if (photosWallListAttachDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photosWallListAttachDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.poll, i);
        WallPostedPhotoDto wallPostedPhotoDto = this.postedPhoto;
        if (wallPostedPhotoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallPostedPhotoDto.writeToParcel(parcel, i);
        }
        PrettyCardsPrettyCardsDto prettyCardsPrettyCardsDto = this.prettyCards;
        if (prettyCardsPrettyCardsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            prettyCardsPrettyCardsDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.video, i);
        parcel.writeParcelable(this.clip, i);
        VideoVideoAlbumFullDto videoVideoAlbumFullDto = this.videoPlaylist;
        if (videoVideoAlbumFullDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoVideoAlbumFullDto.writeToParcel(parcel, i);
        }
        SituationalSuggestsThemeDto situationalSuggestsThemeDto = this.situationalTheme;
        if (situationalSuggestsThemeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            situationalSuggestsThemeDto.writeToParcel(parcel, i);
        }
        DonutDonutLinkAttachDto donutDonutLinkAttachDto = this.donutLink;
        if (donutDonutLinkAttachDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            donutDonutLinkAttachDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.article, i);
        TextlivesTextliveTextpostBlockDto textlivesTextliveTextpostBlockDto = this.textlive;
        if (textlivesTextliveTextpostBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textlivesTextliveTextpostBlockDto.writeToParcel(parcel, i);
        }
        TextlivesTextliveTextpostBlockDto textlivesTextliveTextpostBlockDto2 = this.textpost;
        if (textlivesTextliveTextpostBlockDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textlivesTextliveTextpostBlockDto2.writeToParcel(parcel, i);
        }
        TextlivesTextliveTextpostBlockDto textlivesTextliveTextpostBlockDto3 = this.textpostPublish;
        if (textlivesTextliveTextpostBlockDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textlivesTextliveTextpostBlockDto3.writeToParcel(parcel, i);
        }
        AudioPlaylistDto audioPlaylistDto = this.audioPlaylist;
        if (audioPlaylistDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioPlaylistDto.writeToParcel(parcel, i);
        }
        BaseStickerDto baseStickerDto = this.sticker;
        if (baseStickerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseStickerDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.podcast, i);
        AudioCuratorDto audioCuratorDto = this.curator;
        if (audioCuratorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioCuratorDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.artist, i);
        WallGeoDto wallGeoDto = this.geo;
        if (wallGeoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallGeoDto.writeToParcel(parcel, i);
        }
        WallWallpostAttachmentStyleDto wallWallpostAttachmentStyleDto = this.style;
        if (wallWallpostAttachmentStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallWallpostAttachmentStyleDto.writeToParcel(parcel, i);
        }
        WallWallpostAttachmentCompactDto wallWallpostAttachmentCompactDto = this.compact;
        if (wallWallpostAttachmentCompactDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallWallpostAttachmentCompactDto.writeToParcel(parcel, i);
        }
        WallWallpostAttachmentChipDto wallWallpostAttachmentChipDto = this.chip;
        if (wallWallpostAttachmentChipDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallWallpostAttachmentChipDto.writeToParcel(parcel, i);
        }
        WallWallpostAttachmentMetaDto wallWallpostAttachmentMetaDto = this.meta;
        if (wallWallpostAttachmentMetaDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallWallpostAttachmentMetaDto.writeToParcel(parcel, i);
        }
        VoiceroomsRoomDto voiceroomsRoomDto = this.room;
        if (voiceroomsRoomDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            voiceroomsRoomDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isNft;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        WallWallpostAttachmentOnlineBookingDto wallWallpostAttachmentOnlineBookingDto = this.onlineBooking;
        if (wallWallpostAttachmentOnlineBookingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallWallpostAttachmentOnlineBookingDto.writeToParcel(parcel, i);
        }
        WallWallpostAttachmentMarketLinkDto wallWallpostAttachmentMarketLinkDto = this.marketLink;
        if (wallWallpostAttachmentMarketLinkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallWallpostAttachmentMarketLinkDto.writeToParcel(parcel, i);
        }
        WallWallpostAttachmentMessageToBcDto wallWallpostAttachmentMessageToBcDto = this.messageToBc;
        if (wallWallpostAttachmentMessageToBcDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallWallpostAttachmentMessageToBcDto.writeToParcel(parcel, i);
        }
    }

    public final SituationalSuggestsThemeDto y0() {
        return this.situationalTheme;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ WallWallpostAttachmentDto(com.vk.api.generated.wall.dto.WallWallpostAttachmentTypeDto r40, java.lang.String r41, java.lang.String r42, com.vk.api.generated.wall.dto.WallActionButtonDto r43, com.vk.api.generated.photos.dto.PhotosPhotoAlbumDto r44, com.vk.api.generated.wall.dto.WallAppPostDto r45, com.vk.api.generated.audio.dto.AudioAudioDto r46, com.vk.api.generated.docs.dto.DocsDocDto r47, com.vk.api.generated.events.dto.EventsEventAttachDto r48, com.vk.api.generated.groups.dto.GroupsGroupAttachDto r49, com.vk.api.generated.apps.dto.AppsMiniAppAttachDto r50, com.vk.api.generated.wall.dto.WallGraffitiDto r51, com.vk.api.generated.base.dto.BaseLinkDto r52, com.vk.api.generated.market.dto.MarketMarketItemDto r53, com.vk.api.generated.market.dto.MarketMarketAlbumDto r54, com.vk.api.generated.narratives.dto.NarrativesNarrativeDto r55, com.vk.api.generated.notes.dto.NotesNoteDto r56, com.vk.api.generated.pages.dto.PagesWikipageFullDto r57, com.vk.api.generated.photos.dto.PhotosPhotoDto r58, com.vk.api.generated.photos.dto.PhotosWallListAttachDto r59, com.vk.api.generated.polls.dto.PollsPollDto r60, com.vk.api.generated.wall.dto.WallPostedPhotoDto r61, com.vk.api.generated.prettyCards.dto.PrettyCardsPrettyCardsDto r62, com.vk.api.generated.video.dto.VideoVideoFullDto r63, com.vk.api.generated.video.dto.VideoVideoFullDto r64, com.vk.api.generated.video.dto.VideoVideoAlbumFullDto r65, com.vk.api.generated.situationalSuggests.dto.SituationalSuggestsThemeDto r66, com.vk.api.generated.donut.dto.DonutDonutLinkAttachDto r67, com.vk.api.generated.articles.dto.ArticlesArticleDto r68, com.vk.api.generated.textlives.dto.TextlivesTextliveTextpostBlockDto r69, com.vk.api.generated.textlives.dto.TextlivesTextliveTextpostBlockDto r70, com.vk.api.generated.textlives.dto.TextlivesTextliveTextpostBlockDto r71, com.vk.api.generated.audio.dto.AudioPlaylistDto r72, com.vk.api.generated.base.dto.BaseStickerDto r73, com.vk.api.generated.audio.dto.AudioAudioDto r74, com.vk.api.generated.audio.dto.AudioCuratorDto r75, com.vk.api.generated.audio.dto.AudioArtistDto r76, com.vk.api.generated.wall.dto.WallGeoDto r77, com.vk.api.generated.wall.dto.WallWallpostAttachmentStyleDto r78, com.vk.api.generated.wall.dto.WallWallpostAttachmentCompactDto r79, com.vk.api.generated.wall.dto.WallWallpostAttachmentChipDto r80, com.vk.api.generated.wall.dto.WallWallpostAttachmentMetaDto r81, com.vk.api.generated.voicerooms.dto.VoiceroomsRoomDto r82, java.lang.Boolean r83, com.vk.api.generated.wall.dto.WallWallpostAttachmentOnlineBookingDto r84, com.vk.api.generated.wall.dto.WallWallpostAttachmentMarketLinkDto r85, com.vk.api.generated.wall.dto.WallWallpostAttachmentMessageToBcDto r86, int r87, int r88, xsna.zcl r89) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.api.generated.wall.dto.WallWallpostAttachmentDto.<init>(com.vk.api.generated.wall.dto.WallWallpostAttachmentTypeDto, java.lang.String, java.lang.String, com.vk.api.generated.wall.dto.WallActionButtonDto, com.vk.api.generated.photos.dto.PhotosPhotoAlbumDto, com.vk.api.generated.wall.dto.WallAppPostDto, com.vk.api.generated.audio.dto.AudioAudioDto, com.vk.api.generated.docs.dto.DocsDocDto, com.vk.api.generated.events.dto.EventsEventAttachDto, com.vk.api.generated.groups.dto.GroupsGroupAttachDto, com.vk.api.generated.apps.dto.AppsMiniAppAttachDto, com.vk.api.generated.wall.dto.WallGraffitiDto, com.vk.api.generated.base.dto.BaseLinkDto, com.vk.api.generated.market.dto.MarketMarketItemDto, com.vk.api.generated.market.dto.MarketMarketAlbumDto, com.vk.api.generated.narratives.dto.NarrativesNarrativeDto, com.vk.api.generated.notes.dto.NotesNoteDto, com.vk.api.generated.pages.dto.PagesWikipageFullDto, com.vk.api.generated.photos.dto.PhotosPhotoDto, com.vk.api.generated.photos.dto.PhotosWallListAttachDto, com.vk.api.generated.polls.dto.PollsPollDto, com.vk.api.generated.wall.dto.WallPostedPhotoDto, com.vk.api.generated.prettyCards.dto.PrettyCardsPrettyCardsDto, com.vk.api.generated.video.dto.VideoVideoFullDto, com.vk.api.generated.video.dto.VideoVideoFullDto, com.vk.api.generated.video.dto.VideoVideoAlbumFullDto, com.vk.api.generated.situationalSuggests.dto.SituationalSuggestsThemeDto, com.vk.api.generated.donut.dto.DonutDonutLinkAttachDto, com.vk.api.generated.articles.dto.ArticlesArticleDto, com.vk.api.generated.textlives.dto.TextlivesTextliveTextpostBlockDto, com.vk.api.generated.textlives.dto.TextlivesTextliveTextpostBlockDto, com.vk.api.generated.textlives.dto.TextlivesTextliveTextpostBlockDto, com.vk.api.generated.audio.dto.AudioPlaylistDto, com.vk.api.generated.base.dto.BaseStickerDto, com.vk.api.generated.audio.dto.AudioAudioDto, com.vk.api.generated.audio.dto.AudioCuratorDto, com.vk.api.generated.audio.dto.AudioArtistDto, com.vk.api.generated.wall.dto.WallGeoDto, com.vk.api.generated.wall.dto.WallWallpostAttachmentStyleDto, com.vk.api.generated.wall.dto.WallWallpostAttachmentCompactDto, com.vk.api.generated.wall.dto.WallWallpostAttachmentChipDto, com.vk.api.generated.wall.dto.WallWallpostAttachmentMetaDto, com.vk.api.generated.voicerooms.dto.VoiceroomsRoomDto, java.lang.Boolean, com.vk.api.generated.wall.dto.WallWallpostAttachmentOnlineBookingDto, com.vk.api.generated.wall.dto.WallWallpostAttachmentMarketLinkDto, com.vk.api.generated.wall.dto.WallWallpostAttachmentMessageToBcDto, int, int, xsna.zcl):void");
    }
}
