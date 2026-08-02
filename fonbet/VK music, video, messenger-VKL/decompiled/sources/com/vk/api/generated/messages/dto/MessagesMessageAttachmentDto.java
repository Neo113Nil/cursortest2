package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.vk.api.generated.apps.dto.AppsActionAttachmentDto;
import com.vk.api.generated.apps.dto.AppsMiniAppAttachDto;
import com.vk.api.generated.articles.dto.ArticlesArticleDto;
import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioCuratorDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.base.dto.BaseStickerDto;
import com.vk.api.generated.calls.dto.CallsCallDto;
import com.vk.api.generated.calls.dto.CallsGroupCallInProgressDto;
import com.vk.api.generated.channels.dto.ChannelsMessageDto;
import com.vk.api.generated.docs.dto.DocsDocDto;
import com.vk.api.generated.donut.dto.DonutDonutLinkAttachDto;
import com.vk.api.generated.events.dto.EventsEventAttachDto;
import com.vk.api.generated.gifts.dto.GiftsMessagesGiftAttachmentDto;
import com.vk.api.generated.groups.dto.GroupsGroupAttachDto;
import com.vk.api.generated.market.dto.MarketMarketAlbumDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.market.dto.MarketMarketOrderDto;
import com.vk.api.generated.money.dto.MoneyRequestDto;
import com.vk.api.generated.money.dto.MoneyTransferDto;
import com.vk.api.generated.narratives.dto.NarrativesNarrativeDto;
import com.vk.api.generated.photos.dto.PhotosPhotoAlbumDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.podcast.dto.PodcastPodcastDto;
import com.vk.api.generated.polls.dto.PollsPollDto;
import com.vk.api.generated.stickers.dto.StickersPackPreviewDto;
import com.vk.api.generated.stickers.dto.StickersUgcStickerDto;
import com.vk.api.generated.stories.dto.StoriesStoryDto;
import com.vk.api.generated.video.dto.VideoOneOfVideoAlbumObjectsDto;
import com.vk.api.generated.video.dto.VideoOneOfVideoObjectsDto;
import com.vk.api.generated.wall.dto.WallWallCommentDto;
import com.vk.api.generated.widgetsKit.dto.WidgetsKitAttachmentDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;

/* compiled from: MessagesMessageAttachmentDto.kt */
/* loaded from: classes15.dex */
public final class MessagesMessageAttachmentDto implements Parcelable {
    public static final Parcelable.Creator<MessagesMessageAttachmentDto> CREATOR = new a();

    @pmi0("album")
    private final PhotosPhotoAlbumDto album;

    @pmi0("app_action")
    private final AppsActionAttachmentDto appAction;

    @pmi0("article")
    private final ArticlesArticleDto article;

    @pmi0("artist")
    private final AudioArtistDto artist;

    @pmi0("audio")
    private final AudioAudioDto audio;

    @pmi0("audio_message")
    private final MessagesAudioMessageDto audioMessage;

    @pmi0("audio_playlist")
    private final AudioPlaylistDto audioPlaylist;

    @pmi0("audios")
    private final List<AudioAudioDto> audios;

    @pmi0(NotificationCompat.CATEGORY_CALL)
    private final CallsCallDto call;

    @pmi0("channel_message")
    private final ChannelsMessageDto channelMessage;

    @pmi0("curator")
    private final AudioCuratorDto curator;

    @pmi0("doc")
    private final DocsDocDto doc;

    @pmi0("donut_link")
    private final DonutDonutLinkAttachDto donutLink;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final EventsEventAttachDto event;

    @pmi0("gift")
    private final GiftsMessagesGiftAttachmentDto gift;

    @pmi0("graffiti")
    private final MessagesGraffitiDto graffiti;

    @pmi0("group")
    private final GroupsGroupAttachDto group;

    @pmi0("group_call_in_progress")
    private final CallsGroupCallInProgressDto groupCallInProgress;

    @pmi0("link")
    private final MessagesMessageAttachmentLinkDto link;

    @pmi0("link_curator")
    private final MessagesMessageAttachmentLinkCuratorDto linkCurator;

    @pmi0("market")
    private final MarketMarketItemDto market;

    @pmi0("market_album")
    private final MarketMarketAlbumDto marketAlbum;

    @pmi0("market_order")
    private final MarketMarketOrderDto marketOrder;

    @pmi0("mini_app")
    private final AppsMiniAppAttachDto miniApp;

    @pmi0("money_request")
    private final MoneyRequestDto moneyRequest;

    @pmi0("money_transfer")
    private final MoneyTransferDto moneyTransfer;

    @pmi0("narrative")
    private final NarrativesNarrativeDto narrative;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("podcast")
    private final AudioAudioDto podcast;

    @pmi0("podcasts")
    private final PodcastPodcastDto podcasts;

    @pmi0("poll")
    private final PollsPollDto poll;

    @pmi0("question")
    private final MessagesMessageAttachmentQuestionDto question;

    @pmi0("sticker")
    private final BaseStickerDto sticker;

    @pmi0("sticker_pack_preview")
    private final StickersPackPreviewDto stickerPackPreview;

    @pmi0("story")
    private final StoriesStoryDto story;

    @pmi0("type")
    private final MessagesMessageAttachmentTypeDto type;

    @pmi0("ugc_sticker")
    private final StickersUgcStickerDto ugcSticker;

    @pmi0("video")
    private final VideoOneOfVideoObjectsDto video;

    @pmi0("video_message")
    private final MessagesMessageAttachmentVideoMessageDto videoMessage;

    @pmi0("video_playlist")
    private final VideoOneOfVideoAlbumObjectsDto videoPlaylist;

    @pmi0("vkpay")
    private final MessagesMessageAttachmentLinkDto vkpay;

    @pmi0("wall")
    private final MessagesMessageAttachmentWallpostDto wall;

    @pmi0("wall_reply")
    private final WallWallCommentDto wallReply;

    @pmi0("widget")
    private final WidgetsKitAttachmentDto widget;

    /* compiled from: MessagesMessageAttachmentDto.kt */
    public static final class a implements Parcelable.Creator<MessagesMessageAttachmentDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesMessageAttachmentDto createFromParcel(Parcel parcel) {
            BaseStickerDto baseStickerDto;
            StickersPackPreviewDto createFromParcel;
            VideoOneOfVideoAlbumObjectsDto videoOneOfVideoAlbumObjectsDto;
            MessagesMessageAttachmentVideoMessageDto createFromParcel2;
            MessagesMessageAttachmentVideoMessageDto messagesMessageAttachmentVideoMessageDto;
            MessagesMessageAttachmentWallpostDto createFromParcel3;
            MessagesMessageAttachmentWallpostDto messagesMessageAttachmentWallpostDto;
            WidgetsKitAttachmentDto createFromParcel4;
            PollsPollDto pollsPollDto;
            MoneyTransferDto createFromParcel5;
            MoneyTransferDto moneyTransferDto;
            MoneyRequestDto createFromParcel6;
            AudioAudioDto audioAudioDto;
            PodcastPodcastDto createFromParcel7;
            AudioArtistDto audioArtistDto;
            MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto;
            ArrayList arrayList;
            AudioAudioDto audioAudioDto2;
            MessagesMessageAttachmentTypeDto createFromParcel8 = MessagesMessageAttachmentTypeDto.CREATOR.createFromParcel(parcel);
            AudioAudioDto audioAudioDto3 = (AudioAudioDto) parcel.readParcelable(MessagesMessageAttachmentDto.class.getClassLoader());
            MessagesAudioMessageDto createFromParcel9 = parcel.readInt() == 0 ? null : MessagesAudioMessageDto.CREATOR.createFromParcel(parcel);
            CallsCallDto createFromParcel10 = parcel.readInt() == 0 ? null : CallsCallDto.CREATOR.createFromParcel(parcel);
            ChannelsMessageDto createFromParcel11 = parcel.readInt() == 0 ? null : ChannelsMessageDto.CREATOR.createFromParcel(parcel);
            CallsGroupCallInProgressDto createFromParcel12 = parcel.readInt() == 0 ? null : CallsGroupCallInProgressDto.CREATOR.createFromParcel(parcel);
            DocsDocDto docsDocDto = (DocsDocDto) parcel.readParcelable(MessagesMessageAttachmentDto.class.getClassLoader());
            GiftsMessagesGiftAttachmentDto createFromParcel13 = parcel.readInt() == 0 ? null : GiftsMessagesGiftAttachmentDto.CREATOR.createFromParcel(parcel);
            MessagesGraffitiDto createFromParcel14 = parcel.readInt() == 0 ? null : MessagesGraffitiDto.CREATOR.createFromParcel(parcel);
            AppsMiniAppAttachDto appsMiniAppAttachDto = (AppsMiniAppAttachDto) parcel.readParcelable(MessagesMessageAttachmentDto.class.getClassLoader());
            MessagesMessageAttachmentLinkDto createFromParcel15 = parcel.readInt() == 0 ? null : MessagesMessageAttachmentLinkDto.CREATOR.createFromParcel(parcel);
            MarketMarketItemDto marketMarketItemDto = (MarketMarketItemDto) parcel.readParcelable(MessagesMessageAttachmentDto.class.getClassLoader());
            MarketMarketAlbumDto marketMarketAlbumDto = (MarketMarketAlbumDto) parcel.readParcelable(MessagesMessageAttachmentDto.class.getClassLoader());
            PhotosPhotoAlbumDto photosPhotoAlbumDto = (PhotosPhotoAlbumDto) parcel.readParcelable(MessagesMessageAttachmentDto.class.getClassLoader());
            PhotosPhotoDto photosPhotoDto = (PhotosPhotoDto) parcel.readParcelable(MessagesMessageAttachmentDto.class.getClassLoader());
            BaseStickerDto baseStickerDto2 = (BaseStickerDto) parcel.readParcelable(MessagesMessageAttachmentDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                baseStickerDto = baseStickerDto2;
                createFromParcel = null;
            } else {
                baseStickerDto = baseStickerDto2;
                createFromParcel = StickersPackPreviewDto.CREATOR.createFromParcel(parcel);
            }
            StickersPackPreviewDto stickersPackPreviewDto = createFromParcel;
            StoriesStoryDto storiesStoryDto = (StoriesStoryDto) parcel.readParcelable(MessagesMessageAttachmentDto.class.getClassLoader());
            VideoOneOfVideoObjectsDto videoOneOfVideoObjectsDto = (VideoOneOfVideoObjectsDto) parcel.readParcelable(MessagesMessageAttachmentDto.class.getClassLoader());
            VideoOneOfVideoAlbumObjectsDto videoOneOfVideoAlbumObjectsDto2 = (VideoOneOfVideoAlbumObjectsDto) parcel.readParcelable(MessagesMessageAttachmentDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                videoOneOfVideoAlbumObjectsDto = videoOneOfVideoAlbumObjectsDto2;
                createFromParcel2 = null;
            } else {
                videoOneOfVideoAlbumObjectsDto = videoOneOfVideoAlbumObjectsDto2;
                createFromParcel2 = MessagesMessageAttachmentVideoMessageDto.CREATOR.createFromParcel(parcel);
            }
            MessagesMessageAttachmentVideoMessageDto messagesMessageAttachmentVideoMessageDto2 = createFromParcel2;
            if (parcel.readInt() == 0) {
                messagesMessageAttachmentVideoMessageDto = messagesMessageAttachmentVideoMessageDto2;
                createFromParcel3 = null;
            } else {
                messagesMessageAttachmentVideoMessageDto = messagesMessageAttachmentVideoMessageDto2;
                createFromParcel3 = MessagesMessageAttachmentWallpostDto.CREATOR.createFromParcel(parcel);
            }
            MessagesMessageAttachmentWallpostDto messagesMessageAttachmentWallpostDto2 = createFromParcel3;
            if (parcel.readInt() == 0) {
                messagesMessageAttachmentWallpostDto = messagesMessageAttachmentWallpostDto2;
                createFromParcel4 = null;
            } else {
                messagesMessageAttachmentWallpostDto = messagesMessageAttachmentWallpostDto2;
                createFromParcel4 = WidgetsKitAttachmentDto.CREATOR.createFromParcel(parcel);
            }
            WidgetsKitAttachmentDto widgetsKitAttachmentDto = createFromParcel4;
            ArticlesArticleDto articlesArticleDto = (ArticlesArticleDto) parcel.readParcelable(MessagesMessageAttachmentDto.class.getClassLoader());
            WallWallCommentDto wallWallCommentDto = (WallWallCommentDto) parcel.readParcelable(MessagesMessageAttachmentDto.class.getClassLoader());
            PollsPollDto pollsPollDto2 = (PollsPollDto) parcel.readParcelable(MessagesMessageAttachmentDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                pollsPollDto = pollsPollDto2;
                createFromParcel5 = null;
            } else {
                pollsPollDto = pollsPollDto2;
                createFromParcel5 = MoneyTransferDto.CREATOR.createFromParcel(parcel);
            }
            MoneyTransferDto moneyTransferDto2 = createFromParcel5;
            if (parcel.readInt() == 0) {
                moneyTransferDto = moneyTransferDto2;
                createFromParcel6 = null;
            } else {
                moneyTransferDto = moneyTransferDto2;
                createFromParcel6 = MoneyRequestDto.CREATOR.createFromParcel(parcel);
            }
            MoneyRequestDto moneyRequestDto = createFromParcel6;
            NarrativesNarrativeDto narrativesNarrativeDto = (NarrativesNarrativeDto) parcel.readParcelable(MessagesMessageAttachmentDto.class.getClassLoader());
            AudioPlaylistDto audioPlaylistDto = (AudioPlaylistDto) parcel.readParcelable(MessagesMessageAttachmentDto.class.getClassLoader());
            AudioAudioDto audioAudioDto4 = (AudioAudioDto) parcel.readParcelable(MessagesMessageAttachmentDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                audioAudioDto = audioAudioDto4;
                createFromParcel7 = null;
            } else {
                audioAudioDto = audioAudioDto4;
                createFromParcel7 = PodcastPodcastDto.CREATOR.createFromParcel(parcel);
            }
            PodcastPodcastDto podcastPodcastDto = createFromParcel7;
            DonutDonutLinkAttachDto donutDonutLinkAttachDto = (DonutDonutLinkAttachDto) parcel.readParcelable(MessagesMessageAttachmentDto.class.getClassLoader());
            AudioArtistDto audioArtistDto2 = (AudioArtistDto) parcel.readParcelable(MessagesMessageAttachmentDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                audioArtistDto = audioArtistDto2;
                messagesMessageAttachmentTypeDto = createFromParcel8;
                audioAudioDto2 = audioAudioDto3;
                arrayList = null;
            } else {
                audioArtistDto = audioArtistDto2;
                int readInt = parcel.readInt();
                messagesMessageAttachmentTypeDto = createFromParcel8;
                arrayList = new ArrayList(readInt);
                audioAudioDto2 = audioAudioDto3;
                int i = 0;
                while (i != readInt) {
                    i = bo.b(MessagesMessageAttachmentDto.class, parcel, arrayList, i, 1);
                    readInt = readInt;
                }
            }
            return new MessagesMessageAttachmentDto(messagesMessageAttachmentTypeDto, audioAudioDto2, createFromParcel9, createFromParcel10, createFromParcel11, createFromParcel12, docsDocDto, createFromParcel13, createFromParcel14, appsMiniAppAttachDto, createFromParcel15, marketMarketItemDto, marketMarketAlbumDto, photosPhotoAlbumDto, photosPhotoDto, baseStickerDto, stickersPackPreviewDto, storiesStoryDto, videoOneOfVideoObjectsDto, videoOneOfVideoAlbumObjectsDto, messagesMessageAttachmentVideoMessageDto, messagesMessageAttachmentWallpostDto, widgetsKitAttachmentDto, articlesArticleDto, wallWallCommentDto, pollsPollDto, moneyTransferDto, moneyRequestDto, narrativesNarrativeDto, audioPlaylistDto, audioAudioDto, podcastPodcastDto, donutDonutLinkAttachDto, audioArtistDto, arrayList, (EventsEventAttachDto) parcel.readParcelable(MessagesMessageAttachmentDto.class.getClassLoader()), (AudioCuratorDto) parcel.readParcelable(MessagesMessageAttachmentDto.class.getClassLoader()), parcel.readInt() == 0 ? null : MessagesMessageAttachmentLinkCuratorDto.CREATOR.createFromParcel(parcel), (GroupsGroupAttachDto) parcel.readParcelable(MessagesMessageAttachmentDto.class.getClassLoader()), parcel.readInt() == 0 ? null : AppsActionAttachmentDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MessagesMessageAttachmentLinkDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StickersUgcStickerDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MessagesMessageAttachmentQuestionDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MarketMarketOrderDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesMessageAttachmentDto[] newArray(int i) {
            return new MessagesMessageAttachmentDto[i];
        }
    }

    public MessagesMessageAttachmentDto(MessagesMessageAttachmentTypeDto messagesMessageAttachmentTypeDto, AudioAudioDto audioAudioDto, MessagesAudioMessageDto messagesAudioMessageDto, CallsCallDto callsCallDto, ChannelsMessageDto channelsMessageDto, CallsGroupCallInProgressDto callsGroupCallInProgressDto, DocsDocDto docsDocDto, GiftsMessagesGiftAttachmentDto giftsMessagesGiftAttachmentDto, MessagesGraffitiDto messagesGraffitiDto, AppsMiniAppAttachDto appsMiniAppAttachDto, MessagesMessageAttachmentLinkDto messagesMessageAttachmentLinkDto, MarketMarketItemDto marketMarketItemDto, MarketMarketAlbumDto marketMarketAlbumDto, PhotosPhotoAlbumDto photosPhotoAlbumDto, PhotosPhotoDto photosPhotoDto, BaseStickerDto baseStickerDto, StickersPackPreviewDto stickersPackPreviewDto, StoriesStoryDto storiesStoryDto, VideoOneOfVideoObjectsDto videoOneOfVideoObjectsDto, VideoOneOfVideoAlbumObjectsDto videoOneOfVideoAlbumObjectsDto, MessagesMessageAttachmentVideoMessageDto messagesMessageAttachmentVideoMessageDto, MessagesMessageAttachmentWallpostDto messagesMessageAttachmentWallpostDto, WidgetsKitAttachmentDto widgetsKitAttachmentDto, ArticlesArticleDto articlesArticleDto, WallWallCommentDto wallWallCommentDto, PollsPollDto pollsPollDto, MoneyTransferDto moneyTransferDto, MoneyRequestDto moneyRequestDto, NarrativesNarrativeDto narrativesNarrativeDto, AudioPlaylistDto audioPlaylistDto, AudioAudioDto audioAudioDto2, PodcastPodcastDto podcastPodcastDto, DonutDonutLinkAttachDto donutDonutLinkAttachDto, AudioArtistDto audioArtistDto, List<AudioAudioDto> list, EventsEventAttachDto eventsEventAttachDto, AudioCuratorDto audioCuratorDto, MessagesMessageAttachmentLinkCuratorDto messagesMessageAttachmentLinkCuratorDto, GroupsGroupAttachDto groupsGroupAttachDto, AppsActionAttachmentDto appsActionAttachmentDto, MessagesMessageAttachmentLinkDto messagesMessageAttachmentLinkDto2, StickersUgcStickerDto stickersUgcStickerDto, MessagesMessageAttachmentQuestionDto messagesMessageAttachmentQuestionDto, MarketMarketOrderDto marketMarketOrderDto) {
        this.type = messagesMessageAttachmentTypeDto;
        this.audio = audioAudioDto;
        this.audioMessage = messagesAudioMessageDto;
        this.call = callsCallDto;
        this.channelMessage = channelsMessageDto;
        this.groupCallInProgress = callsGroupCallInProgressDto;
        this.doc = docsDocDto;
        this.gift = giftsMessagesGiftAttachmentDto;
        this.graffiti = messagesGraffitiDto;
        this.miniApp = appsMiniAppAttachDto;
        this.link = messagesMessageAttachmentLinkDto;
        this.market = marketMarketItemDto;
        this.marketAlbum = marketMarketAlbumDto;
        this.album = photosPhotoAlbumDto;
        this.photo = photosPhotoDto;
        this.sticker = baseStickerDto;
        this.stickerPackPreview = stickersPackPreviewDto;
        this.story = storiesStoryDto;
        this.video = videoOneOfVideoObjectsDto;
        this.videoPlaylist = videoOneOfVideoAlbumObjectsDto;
        this.videoMessage = messagesMessageAttachmentVideoMessageDto;
        this.wall = messagesMessageAttachmentWallpostDto;
        this.widget = widgetsKitAttachmentDto;
        this.article = articlesArticleDto;
        this.wallReply = wallWallCommentDto;
        this.poll = pollsPollDto;
        this.moneyTransfer = moneyTransferDto;
        this.moneyRequest = moneyRequestDto;
        this.narrative = narrativesNarrativeDto;
        this.audioPlaylist = audioPlaylistDto;
        this.podcast = audioAudioDto2;
        this.podcasts = podcastPodcastDto;
        this.donutLink = donutDonutLinkAttachDto;
        this.artist = audioArtistDto;
        this.audios = list;
        this.event = eventsEventAttachDto;
        this.curator = audioCuratorDto;
        this.linkCurator = messagesMessageAttachmentLinkCuratorDto;
        this.group = groupsGroupAttachDto;
        this.appAction = appsActionAttachmentDto;
        this.vkpay = messagesMessageAttachmentLinkDto2;
        this.ugcSticker = stickersUgcStickerDto;
        this.question = messagesMessageAttachmentQuestionDto;
        this.marketOrder = marketMarketOrderDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesMessageAttachmentDto)) {
            return false;
        }
        MessagesMessageAttachmentDto messagesMessageAttachmentDto = (MessagesMessageAttachmentDto) obj;
        return this.type == messagesMessageAttachmentDto.type && epx.f(this.audio, messagesMessageAttachmentDto.audio) && epx.f(this.audioMessage, messagesMessageAttachmentDto.audioMessage) && epx.f(this.call, messagesMessageAttachmentDto.call) && epx.f(this.channelMessage, messagesMessageAttachmentDto.channelMessage) && epx.f(this.groupCallInProgress, messagesMessageAttachmentDto.groupCallInProgress) && epx.f(this.doc, messagesMessageAttachmentDto.doc) && epx.f(this.gift, messagesMessageAttachmentDto.gift) && epx.f(this.graffiti, messagesMessageAttachmentDto.graffiti) && epx.f(this.miniApp, messagesMessageAttachmentDto.miniApp) && epx.f(this.link, messagesMessageAttachmentDto.link) && epx.f(this.market, messagesMessageAttachmentDto.market) && epx.f(this.marketAlbum, messagesMessageAttachmentDto.marketAlbum) && epx.f(this.album, messagesMessageAttachmentDto.album) && epx.f(this.photo, messagesMessageAttachmentDto.photo) && epx.f(this.sticker, messagesMessageAttachmentDto.sticker) && epx.f(this.stickerPackPreview, messagesMessageAttachmentDto.stickerPackPreview) && epx.f(this.story, messagesMessageAttachmentDto.story) && epx.f(this.video, messagesMessageAttachmentDto.video) && epx.f(this.videoPlaylist, messagesMessageAttachmentDto.videoPlaylist) && epx.f(this.videoMessage, messagesMessageAttachmentDto.videoMessage) && epx.f(this.wall, messagesMessageAttachmentDto.wall) && epx.f(this.widget, messagesMessageAttachmentDto.widget) && epx.f(this.article, messagesMessageAttachmentDto.article) && epx.f(this.wallReply, messagesMessageAttachmentDto.wallReply) && epx.f(this.poll, messagesMessageAttachmentDto.poll) && epx.f(this.moneyTransfer, messagesMessageAttachmentDto.moneyTransfer) && epx.f(this.moneyRequest, messagesMessageAttachmentDto.moneyRequest) && epx.f(this.narrative, messagesMessageAttachmentDto.narrative) && epx.f(this.audioPlaylist, messagesMessageAttachmentDto.audioPlaylist) && epx.f(this.podcast, messagesMessageAttachmentDto.podcast) && epx.f(this.podcasts, messagesMessageAttachmentDto.podcasts) && epx.f(this.donutLink, messagesMessageAttachmentDto.donutLink) && epx.f(this.artist, messagesMessageAttachmentDto.artist) && epx.f(this.audios, messagesMessageAttachmentDto.audios) && epx.f(this.event, messagesMessageAttachmentDto.event) && epx.f(this.curator, messagesMessageAttachmentDto.curator) && epx.f(this.linkCurator, messagesMessageAttachmentDto.linkCurator) && epx.f(this.group, messagesMessageAttachmentDto.group) && epx.f(this.appAction, messagesMessageAttachmentDto.appAction) && epx.f(this.vkpay, messagesMessageAttachmentDto.vkpay) && epx.f(this.ugcSticker, messagesMessageAttachmentDto.ugcSticker) && epx.f(this.question, messagesMessageAttachmentDto.question) && epx.f(this.marketOrder, messagesMessageAttachmentDto.marketOrder);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        AudioAudioDto audioAudioDto = this.audio;
        int hashCode2 = (hashCode + (audioAudioDto == null ? 0 : audioAudioDto.hashCode())) * 31;
        MessagesAudioMessageDto messagesAudioMessageDto = this.audioMessage;
        int hashCode3 = (hashCode2 + (messagesAudioMessageDto == null ? 0 : messagesAudioMessageDto.hashCode())) * 31;
        CallsCallDto callsCallDto = this.call;
        int hashCode4 = (hashCode3 + (callsCallDto == null ? 0 : callsCallDto.hashCode())) * 31;
        ChannelsMessageDto channelsMessageDto = this.channelMessage;
        int hashCode5 = (hashCode4 + (channelsMessageDto == null ? 0 : channelsMessageDto.hashCode())) * 31;
        CallsGroupCallInProgressDto callsGroupCallInProgressDto = this.groupCallInProgress;
        int hashCode6 = (hashCode5 + (callsGroupCallInProgressDto == null ? 0 : callsGroupCallInProgressDto.hashCode())) * 31;
        DocsDocDto docsDocDto = this.doc;
        int hashCode7 = (hashCode6 + (docsDocDto == null ? 0 : docsDocDto.hashCode())) * 31;
        GiftsMessagesGiftAttachmentDto giftsMessagesGiftAttachmentDto = this.gift;
        int hashCode8 = (hashCode7 + (giftsMessagesGiftAttachmentDto == null ? 0 : giftsMessagesGiftAttachmentDto.hashCode())) * 31;
        MessagesGraffitiDto messagesGraffitiDto = this.graffiti;
        int hashCode9 = (hashCode8 + (messagesGraffitiDto == null ? 0 : messagesGraffitiDto.hashCode())) * 31;
        AppsMiniAppAttachDto appsMiniAppAttachDto = this.miniApp;
        int hashCode10 = (hashCode9 + (appsMiniAppAttachDto == null ? 0 : appsMiniAppAttachDto.hashCode())) * 31;
        MessagesMessageAttachmentLinkDto messagesMessageAttachmentLinkDto = this.link;
        int hashCode11 = (hashCode10 + (messagesMessageAttachmentLinkDto == null ? 0 : messagesMessageAttachmentLinkDto.hashCode())) * 31;
        MarketMarketItemDto marketMarketItemDto = this.market;
        int hashCode12 = (hashCode11 + (marketMarketItemDto == null ? 0 : marketMarketItemDto.hashCode())) * 31;
        MarketMarketAlbumDto marketMarketAlbumDto = this.marketAlbum;
        int hashCode13 = (hashCode12 + (marketMarketAlbumDto == null ? 0 : marketMarketAlbumDto.hashCode())) * 31;
        PhotosPhotoAlbumDto photosPhotoAlbumDto = this.album;
        int hashCode14 = (hashCode13 + (photosPhotoAlbumDto == null ? 0 : photosPhotoAlbumDto.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode15 = (hashCode14 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        BaseStickerDto baseStickerDto = this.sticker;
        int hashCode16 = (hashCode15 + (baseStickerDto == null ? 0 : baseStickerDto.hashCode())) * 31;
        StickersPackPreviewDto stickersPackPreviewDto = this.stickerPackPreview;
        int hashCode17 = (hashCode16 + (stickersPackPreviewDto == null ? 0 : stickersPackPreviewDto.hashCode())) * 31;
        StoriesStoryDto storiesStoryDto = this.story;
        int hashCode18 = (hashCode17 + (storiesStoryDto == null ? 0 : storiesStoryDto.hashCode())) * 31;
        VideoOneOfVideoObjectsDto videoOneOfVideoObjectsDto = this.video;
        int hashCode19 = (hashCode18 + (videoOneOfVideoObjectsDto == null ? 0 : videoOneOfVideoObjectsDto.hashCode())) * 31;
        VideoOneOfVideoAlbumObjectsDto videoOneOfVideoAlbumObjectsDto = this.videoPlaylist;
        int hashCode20 = (hashCode19 + (videoOneOfVideoAlbumObjectsDto == null ? 0 : videoOneOfVideoAlbumObjectsDto.hashCode())) * 31;
        MessagesMessageAttachmentVideoMessageDto messagesMessageAttachmentVideoMessageDto = this.videoMessage;
        int hashCode21 = (hashCode20 + (messagesMessageAttachmentVideoMessageDto == null ? 0 : messagesMessageAttachmentVideoMessageDto.hashCode())) * 31;
        MessagesMessageAttachmentWallpostDto messagesMessageAttachmentWallpostDto = this.wall;
        int hashCode22 = (hashCode21 + (messagesMessageAttachmentWallpostDto == null ? 0 : messagesMessageAttachmentWallpostDto.hashCode())) * 31;
        WidgetsKitAttachmentDto widgetsKitAttachmentDto = this.widget;
        int hashCode23 = (hashCode22 + (widgetsKitAttachmentDto == null ? 0 : widgetsKitAttachmentDto.hashCode())) * 31;
        ArticlesArticleDto articlesArticleDto = this.article;
        int hashCode24 = (hashCode23 + (articlesArticleDto == null ? 0 : articlesArticleDto.hashCode())) * 31;
        WallWallCommentDto wallWallCommentDto = this.wallReply;
        int hashCode25 = (hashCode24 + (wallWallCommentDto == null ? 0 : wallWallCommentDto.hashCode())) * 31;
        PollsPollDto pollsPollDto = this.poll;
        int hashCode26 = (hashCode25 + (pollsPollDto == null ? 0 : pollsPollDto.hashCode())) * 31;
        MoneyTransferDto moneyTransferDto = this.moneyTransfer;
        int hashCode27 = (hashCode26 + (moneyTransferDto == null ? 0 : moneyTransferDto.hashCode())) * 31;
        MoneyRequestDto moneyRequestDto = this.moneyRequest;
        int hashCode28 = (hashCode27 + (moneyRequestDto == null ? 0 : moneyRequestDto.hashCode())) * 31;
        NarrativesNarrativeDto narrativesNarrativeDto = this.narrative;
        int hashCode29 = (hashCode28 + (narrativesNarrativeDto == null ? 0 : narrativesNarrativeDto.hashCode())) * 31;
        AudioPlaylistDto audioPlaylistDto = this.audioPlaylist;
        int hashCode30 = (hashCode29 + (audioPlaylistDto == null ? 0 : audioPlaylistDto.hashCode())) * 31;
        AudioAudioDto audioAudioDto2 = this.podcast;
        int hashCode31 = (hashCode30 + (audioAudioDto2 == null ? 0 : audioAudioDto2.hashCode())) * 31;
        PodcastPodcastDto podcastPodcastDto = this.podcasts;
        int hashCode32 = (hashCode31 + (podcastPodcastDto == null ? 0 : podcastPodcastDto.hashCode())) * 31;
        DonutDonutLinkAttachDto donutDonutLinkAttachDto = this.donutLink;
        int hashCode33 = (hashCode32 + (donutDonutLinkAttachDto == null ? 0 : donutDonutLinkAttachDto.hashCode())) * 31;
        AudioArtistDto audioArtistDto = this.artist;
        int hashCode34 = (hashCode33 + (audioArtistDto == null ? 0 : audioArtistDto.hashCode())) * 31;
        List<AudioAudioDto> list = this.audios;
        int hashCode35 = (hashCode34 + (list == null ? 0 : list.hashCode())) * 31;
        EventsEventAttachDto eventsEventAttachDto = this.event;
        int hashCode36 = (hashCode35 + (eventsEventAttachDto == null ? 0 : eventsEventAttachDto.hashCode())) * 31;
        AudioCuratorDto audioCuratorDto = this.curator;
        int hashCode37 = (hashCode36 + (audioCuratorDto == null ? 0 : audioCuratorDto.hashCode())) * 31;
        MessagesMessageAttachmentLinkCuratorDto messagesMessageAttachmentLinkCuratorDto = this.linkCurator;
        int hashCode38 = (hashCode37 + (messagesMessageAttachmentLinkCuratorDto == null ? 0 : messagesMessageAttachmentLinkCuratorDto.hashCode())) * 31;
        GroupsGroupAttachDto groupsGroupAttachDto = this.group;
        int hashCode39 = (hashCode38 + (groupsGroupAttachDto == null ? 0 : groupsGroupAttachDto.hashCode())) * 31;
        AppsActionAttachmentDto appsActionAttachmentDto = this.appAction;
        int hashCode40 = (hashCode39 + (appsActionAttachmentDto == null ? 0 : appsActionAttachmentDto.hashCode())) * 31;
        MessagesMessageAttachmentLinkDto messagesMessageAttachmentLinkDto2 = this.vkpay;
        int hashCode41 = (hashCode40 + (messagesMessageAttachmentLinkDto2 == null ? 0 : messagesMessageAttachmentLinkDto2.hashCode())) * 31;
        StickersUgcStickerDto stickersUgcStickerDto = this.ugcSticker;
        int hashCode42 = (hashCode41 + (stickersUgcStickerDto == null ? 0 : stickersUgcStickerDto.hashCode())) * 31;
        MessagesMessageAttachmentQuestionDto messagesMessageAttachmentQuestionDto = this.question;
        int hashCode43 = (hashCode42 + (messagesMessageAttachmentQuestionDto == null ? 0 : messagesMessageAttachmentQuestionDto.hashCode())) * 31;
        MarketMarketOrderDto marketMarketOrderDto = this.marketOrder;
        return hashCode43 + (marketMarketOrderDto != null ? marketMarketOrderDto.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesMessageAttachmentDto(type=" + this.type + ", audio=" + this.audio + ", audioMessage=" + this.audioMessage + ", call=" + this.call + ", channelMessage=" + this.channelMessage + ", groupCallInProgress=" + this.groupCallInProgress + ", doc=" + this.doc + ", gift=" + this.gift + ", graffiti=" + this.graffiti + ", miniApp=" + this.miniApp + ", link=" + this.link + ", market=" + this.market + ", marketAlbum=" + this.marketAlbum + ", album=" + this.album + ", photo=" + this.photo + ", sticker=" + this.sticker + ", stickerPackPreview=" + this.stickerPackPreview + ", story=" + this.story + ", video=" + this.video + ", videoPlaylist=" + this.videoPlaylist + ", videoMessage=" + this.videoMessage + ", wall=" + this.wall + ", widget=" + this.widget + ", article=" + this.article + ", wallReply=" + this.wallReply + ", poll=" + this.poll + ", moneyTransfer=" + this.moneyTransfer + ", moneyRequest=" + this.moneyRequest + ", narrative=" + this.narrative + ", audioPlaylist=" + this.audioPlaylist + ", podcast=" + this.podcast + ", podcasts=" + this.podcasts + ", donutLink=" + this.donutLink + ", artist=" + this.artist + ", audios=" + this.audios + ", event=" + this.event + ", curator=" + this.curator + ", linkCurator=" + this.linkCurator + ", group=" + this.group + ", appAction=" + this.appAction + ", vkpay=" + this.vkpay + ", ugcSticker=" + this.ugcSticker + ", question=" + this.question + ", marketOrder=" + this.marketOrder + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.audio, i);
        MessagesAudioMessageDto messagesAudioMessageDto = this.audioMessage;
        if (messagesAudioMessageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesAudioMessageDto.writeToParcel(parcel, i);
        }
        CallsCallDto callsCallDto = this.call;
        if (callsCallDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            callsCallDto.writeToParcel(parcel, i);
        }
        ChannelsMessageDto channelsMessageDto = this.channelMessage;
        if (channelsMessageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelsMessageDto.writeToParcel(parcel, i);
        }
        CallsGroupCallInProgressDto callsGroupCallInProgressDto = this.groupCallInProgress;
        if (callsGroupCallInProgressDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            callsGroupCallInProgressDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.doc, i);
        GiftsMessagesGiftAttachmentDto giftsMessagesGiftAttachmentDto = this.gift;
        if (giftsMessagesGiftAttachmentDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            giftsMessagesGiftAttachmentDto.writeToParcel(parcel, i);
        }
        MessagesGraffitiDto messagesGraffitiDto = this.graffiti;
        if (messagesGraffitiDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesGraffitiDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.miniApp, i);
        MessagesMessageAttachmentLinkDto messagesMessageAttachmentLinkDto = this.link;
        if (messagesMessageAttachmentLinkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesMessageAttachmentLinkDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.market, i);
        parcel.writeParcelable(this.marketAlbum, i);
        parcel.writeParcelable(this.album, i);
        parcel.writeParcelable(this.photo, i);
        parcel.writeParcelable(this.sticker, i);
        StickersPackPreviewDto stickersPackPreviewDto = this.stickerPackPreview;
        if (stickersPackPreviewDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersPackPreviewDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.story, i);
        parcel.writeParcelable(this.video, i);
        parcel.writeParcelable(this.videoPlaylist, i);
        MessagesMessageAttachmentVideoMessageDto messagesMessageAttachmentVideoMessageDto = this.videoMessage;
        if (messagesMessageAttachmentVideoMessageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesMessageAttachmentVideoMessageDto.writeToParcel(parcel, i);
        }
        MessagesMessageAttachmentWallpostDto messagesMessageAttachmentWallpostDto = this.wall;
        if (messagesMessageAttachmentWallpostDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesMessageAttachmentWallpostDto.writeToParcel(parcel, i);
        }
        WidgetsKitAttachmentDto widgetsKitAttachmentDto = this.widget;
        if (widgetsKitAttachmentDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            widgetsKitAttachmentDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.article, i);
        parcel.writeParcelable(this.wallReply, i);
        parcel.writeParcelable(this.poll, i);
        MoneyTransferDto moneyTransferDto = this.moneyTransfer;
        if (moneyTransferDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            moneyTransferDto.writeToParcel(parcel, i);
        }
        MoneyRequestDto moneyRequestDto = this.moneyRequest;
        if (moneyRequestDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            moneyRequestDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.narrative, i);
        parcel.writeParcelable(this.audioPlaylist, i);
        parcel.writeParcelable(this.podcast, i);
        PodcastPodcastDto podcastPodcastDto = this.podcasts;
        if (podcastPodcastDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            podcastPodcastDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.donutLink, i);
        parcel.writeParcelable(this.artist, i);
        List<AudioAudioDto> list = this.audios;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeParcelable(this.event, i);
        parcel.writeParcelable(this.curator, i);
        MessagesMessageAttachmentLinkCuratorDto messagesMessageAttachmentLinkCuratorDto = this.linkCurator;
        if (messagesMessageAttachmentLinkCuratorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesMessageAttachmentLinkCuratorDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.group, i);
        AppsActionAttachmentDto appsActionAttachmentDto = this.appAction;
        if (appsActionAttachmentDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsActionAttachmentDto.writeToParcel(parcel, i);
        }
        MessagesMessageAttachmentLinkDto messagesMessageAttachmentLinkDto2 = this.vkpay;
        if (messagesMessageAttachmentLinkDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesMessageAttachmentLinkDto2.writeToParcel(parcel, i);
        }
        StickersUgcStickerDto stickersUgcStickerDto = this.ugcSticker;
        if (stickersUgcStickerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersUgcStickerDto.writeToParcel(parcel, i);
        }
        MessagesMessageAttachmentQuestionDto messagesMessageAttachmentQuestionDto = this.question;
        if (messagesMessageAttachmentQuestionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesMessageAttachmentQuestionDto.writeToParcel(parcel, i);
        }
        MarketMarketOrderDto marketMarketOrderDto = this.marketOrder;
        if (marketMarketOrderDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketMarketOrderDto.writeToParcel(parcel, i);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ MessagesMessageAttachmentDto(com.vk.api.generated.messages.dto.MessagesMessageAttachmentTypeDto r40, com.vk.api.generated.audio.dto.AudioAudioDto r41, com.vk.api.generated.messages.dto.MessagesAudioMessageDto r42, com.vk.api.generated.calls.dto.CallsCallDto r43, com.vk.api.generated.channels.dto.ChannelsMessageDto r44, com.vk.api.generated.calls.dto.CallsGroupCallInProgressDto r45, com.vk.api.generated.docs.dto.DocsDocDto r46, com.vk.api.generated.gifts.dto.GiftsMessagesGiftAttachmentDto r47, com.vk.api.generated.messages.dto.MessagesGraffitiDto r48, com.vk.api.generated.apps.dto.AppsMiniAppAttachDto r49, com.vk.api.generated.messages.dto.MessagesMessageAttachmentLinkDto r50, com.vk.api.generated.market.dto.MarketMarketItemDto r51, com.vk.api.generated.market.dto.MarketMarketAlbumDto r52, com.vk.api.generated.photos.dto.PhotosPhotoAlbumDto r53, com.vk.api.generated.photos.dto.PhotosPhotoDto r54, com.vk.api.generated.base.dto.BaseStickerDto r55, com.vk.api.generated.stickers.dto.StickersPackPreviewDto r56, com.vk.api.generated.stories.dto.StoriesStoryDto r57, com.vk.api.generated.video.dto.VideoOneOfVideoObjectsDto r58, com.vk.api.generated.video.dto.VideoOneOfVideoAlbumObjectsDto r59, com.vk.api.generated.messages.dto.MessagesMessageAttachmentVideoMessageDto r60, com.vk.api.generated.messages.dto.MessagesMessageAttachmentWallpostDto r61, com.vk.api.generated.widgetsKit.dto.WidgetsKitAttachmentDto r62, com.vk.api.generated.articles.dto.ArticlesArticleDto r63, com.vk.api.generated.wall.dto.WallWallCommentDto r64, com.vk.api.generated.polls.dto.PollsPollDto r65, com.vk.api.generated.money.dto.MoneyTransferDto r66, com.vk.api.generated.money.dto.MoneyRequestDto r67, com.vk.api.generated.narratives.dto.NarrativesNarrativeDto r68, com.vk.api.generated.audio.dto.AudioPlaylistDto r69, com.vk.api.generated.audio.dto.AudioAudioDto r70, com.vk.api.generated.podcast.dto.PodcastPodcastDto r71, com.vk.api.generated.donut.dto.DonutDonutLinkAttachDto r72, com.vk.api.generated.audio.dto.AudioArtistDto r73, java.util.List r74, com.vk.api.generated.events.dto.EventsEventAttachDto r75, com.vk.api.generated.audio.dto.AudioCuratorDto r76, com.vk.api.generated.messages.dto.MessagesMessageAttachmentLinkCuratorDto r77, com.vk.api.generated.groups.dto.GroupsGroupAttachDto r78, com.vk.api.generated.apps.dto.AppsActionAttachmentDto r79, com.vk.api.generated.messages.dto.MessagesMessageAttachmentLinkDto r80, com.vk.api.generated.stickers.dto.StickersUgcStickerDto r81, com.vk.api.generated.messages.dto.MessagesMessageAttachmentQuestionDto r82, com.vk.api.generated.market.dto.MarketMarketOrderDto r83, int r84, int r85, xsna.zcl r86) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.api.generated.messages.dto.MessagesMessageAttachmentDto.<init>(com.vk.api.generated.messages.dto.MessagesMessageAttachmentTypeDto, com.vk.api.generated.audio.dto.AudioAudioDto, com.vk.api.generated.messages.dto.MessagesAudioMessageDto, com.vk.api.generated.calls.dto.CallsCallDto, com.vk.api.generated.channels.dto.ChannelsMessageDto, com.vk.api.generated.calls.dto.CallsGroupCallInProgressDto, com.vk.api.generated.docs.dto.DocsDocDto, com.vk.api.generated.gifts.dto.GiftsMessagesGiftAttachmentDto, com.vk.api.generated.messages.dto.MessagesGraffitiDto, com.vk.api.generated.apps.dto.AppsMiniAppAttachDto, com.vk.api.generated.messages.dto.MessagesMessageAttachmentLinkDto, com.vk.api.generated.market.dto.MarketMarketItemDto, com.vk.api.generated.market.dto.MarketMarketAlbumDto, com.vk.api.generated.photos.dto.PhotosPhotoAlbumDto, com.vk.api.generated.photos.dto.PhotosPhotoDto, com.vk.api.generated.base.dto.BaseStickerDto, com.vk.api.generated.stickers.dto.StickersPackPreviewDto, com.vk.api.generated.stories.dto.StoriesStoryDto, com.vk.api.generated.video.dto.VideoOneOfVideoObjectsDto, com.vk.api.generated.video.dto.VideoOneOfVideoAlbumObjectsDto, com.vk.api.generated.messages.dto.MessagesMessageAttachmentVideoMessageDto, com.vk.api.generated.messages.dto.MessagesMessageAttachmentWallpostDto, com.vk.api.generated.widgetsKit.dto.WidgetsKitAttachmentDto, com.vk.api.generated.articles.dto.ArticlesArticleDto, com.vk.api.generated.wall.dto.WallWallCommentDto, com.vk.api.generated.polls.dto.PollsPollDto, com.vk.api.generated.money.dto.MoneyTransferDto, com.vk.api.generated.money.dto.MoneyRequestDto, com.vk.api.generated.narratives.dto.NarrativesNarrativeDto, com.vk.api.generated.audio.dto.AudioPlaylistDto, com.vk.api.generated.audio.dto.AudioAudioDto, com.vk.api.generated.podcast.dto.PodcastPodcastDto, com.vk.api.generated.donut.dto.DonutDonutLinkAttachDto, com.vk.api.generated.audio.dto.AudioArtistDto, java.util.List, com.vk.api.generated.events.dto.EventsEventAttachDto, com.vk.api.generated.audio.dto.AudioCuratorDto, com.vk.api.generated.messages.dto.MessagesMessageAttachmentLinkCuratorDto, com.vk.api.generated.groups.dto.GroupsGroupAttachDto, com.vk.api.generated.apps.dto.AppsActionAttachmentDto, com.vk.api.generated.messages.dto.MessagesMessageAttachmentLinkDto, com.vk.api.generated.stickers.dto.StickersUgcStickerDto, com.vk.api.generated.messages.dto.MessagesMessageAttachmentQuestionDto, com.vk.api.generated.market.dto.MarketMarketOrderDto, int, int, xsna.zcl):void");
    }
}
