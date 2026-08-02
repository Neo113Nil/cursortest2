package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.coremedia.iso.boxes.MetaBox;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.audio.dto.AudioAdsDto;
import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.audio.dto.AudioAudioAlbumDto;
import com.vk.api.generated.audio.dto.AudioAudioMetaDto;
import com.vk.api.generated.audio.dto.AudioAudioPermissionsDto;
import com.vk.api.generated.audio.dto.AudioAudioPreviewUrlDto;
import com.vk.api.generated.audio.dto.AudioChartInfoDto;
import com.vk.api.generated.audio.dto.AudioLoudnessDto;
import com.vk.api.generated.audio.dto.AudioPhotoDto;
import com.vk.api.generated.audio.dto.AudioRestrictionDto;
import com.vk.api.generated.audio.dto.AudioStreamDto;
import com.vk.api.generated.audio.dto.AudioVoiceAssistantDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.podcast.dto.PodcastInfoDto;
import com.vk.dto.common.id.UserId;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao;
import xsna.asp;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoRelatedAudioDto.kt */
/* loaded from: classes15.dex */
public final class VideoRelatedAudioDto implements Parcelable {
    public static final Parcelable.Creator<VideoRelatedAudioDto> CREATOR = new a();

    @pmi0("access_key")
    private final String accessKey;

    @pmi0(b.JSON_KEY_ADS)
    private final AudioAdsDto ads;

    @pmi0("album")
    private final AudioAudioAlbumDto album;

    @pmi0("album_id")
    private final Integer albumId;

    @pmi0("album_part_number")
    private final Integer albumPartNumber;

    @pmi0("artist")
    private final String artist;

    @pmi0("audio_chart_info")
    private final AudioChartInfoDto audioChartInfo;

    @pmi0("audio_loudness")
    private final AudioLoudnessDto audioLoudness;

    @pmi0("audio_streams")
    private final List<AudioStreamDto> audioStreams;

    @pmi0("audio_voice_assistant")
    private final AudioVoiceAssistantDto audioVoiceAssistant;

    @pmi0("content_restricted")
    private final AudioRestrictionDto contentRestricted;

    @pmi0("date")
    private final Integer date;

    @pmi0("dislike")
    private final Boolean dislike;

    @pmi0("dmca_blocked")
    private final Boolean dmcaBlocked;

    @pmi0("duration")
    private final int duration;

    @pmi0(TtmlNode.END)
    private final int end;

    @pmi0("featured_artists")
    private final List<AudioArtistDto> featuredArtists;

    @pmi0("file_size")
    private final Long fileSize;

    @pmi0("flags_context")
    private final Integer flagsContext;

    @pmi0("genre_id")
    private final GenreIdDto genreId;

    @pmi0("has_lyrics")
    private final Boolean hasLyrics;

    @pmi0("id")
    private final int id;

    @pmi0("in_clips_favorite")
    private final Boolean inClipsFavorite;

    @pmi0("in_clips_favorite_allowed")
    private final Boolean inClipsFavoriteAllowed;

    @pmi0("is_explicit")
    private final Boolean isExplicit;

    @pmi0("is_focus_track")
    private final Boolean isFocusTrack;

    @pmi0("is_licensed")
    private final Boolean isLicensed;

    @pmi0("is_official")
    private final Boolean isOfficial;

    @pmi0("itunes_preview")
    private final Object itunesPreview;

    @pmi0("kws_skip")
    private final List<List<Float>> kwsSkip;

    @pmi0("legal_notices_type")
    private final Integer legalNoticesType;

    @pmi0("like")
    private final Boolean like;

    @pmi0("liked_from_video")
    private final Boolean likedFromVideo;

    @pmi0("main_artists")
    private final List<AudioArtistDto> mainArtists;

    @pmi0("main_color")
    private final String mainColor;

    @pmi0(MetaBox.TYPE)
    private final AudioAudioMetaDto meta;

    @pmi0("mstcp_type")
    private final MstcpTypeDto mstcpType;

    @pmi0("no_search")
    private final BaseBoolIntDto noSearch;

    @pmi0("original_sound_video_id")
    private final String originalSoundVideoId;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("performer")
    private final String performer;

    @pmi0(SignalingProtocol.KEY_PERMISSIONS)
    private final AudioAudioPermissionsDto permissions;

    @pmi0("podcast_info")
    private final PodcastInfoDto podcastInfo;

    @pmi0("preview_url")
    private final AudioAudioPreviewUrlDto previewUrl;

    @pmi0("qr_url")
    private final String qrUrl;

    @pmi0("region_restrictions")
    private final Object regionRestrictions;

    @pmi0("release_audio_id")
    private final String releaseAudioId;

    @pmi0("release_id")
    private final Integer releaseId;

    @pmi0("rightholder_marks")
    private final List<String> rightholderMarks;

    @pmi0("short_videos_allowed")
    private final Boolean shortVideosAllowed;

    @pmi0("special_project_id")
    private final Integer specialProjectId;

    @pmi0("start")
    private final int start;

    @pmi0("stories_allowed")
    private final Boolean storiesAllowed;

    @pmi0("stories_cover_allowed")
    private final Boolean storiesCoverAllowed;

    @pmi0("stream_duration")
    private final Integer streamDuration;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("thumb")
    private final AudioPhotoDto thumb;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("track_genre_id")
    private final TrackGenreIdDto trackGenreId;

    @pmi0("track_id")
    private final Integer trackId;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoRelatedAudioDto.kt */
    public static final class GenreIdDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ GenreIdDto[] $VALUES;

        @pmi0("35")
        public static final GenreIdDto ACID;

        @pmi0("75")
        public static final GenreIdDto ACID_JAZZ;

        @pmi0("74")
        public static final GenreIdDto ACID_PUNK;

        @pmi0("100")
        public static final GenreIdDto ACOUSTIC;

        @pmi0("156")
        public static final GenreIdDto AFROBEAT;

        @pmi0("21")
        public static final GenreIdDto ALTERNATIVE;

        @pmi0("169")
        public static final GenreIdDto ALTERNATIVE_METAL;

        @pmi0("41")
        public static final GenreIdDto ALTERNATIVE_ROCK;

        @pmi0("27")
        public static final GenreIdDto AMBIENT;

        @pmi0("170")
        public static final GenreIdDto BALEARIC;

        @pmi0("171")
        public static final GenreIdDto BALKAN;

        @pmi0("117")
        public static final GenreIdDto BALLAD;

        @pmi0("172")
        public static final GenreIdDto BAROQUE_POP;

        @pmi0("42")
        public static final GenreIdDto BASS;

        @pmi0("173")
        public static final GenreIdDto BEATBOXING;

        @pmi0("86")
        public static final GenreIdDto BEBOP;

        @pmi0("142")
        public static final GenreIdDto BIT;

        @pmi0("174")
        public static final GenreIdDto BLACKGAZE;

        @pmi0("145")
        public static final GenreIdDto BLACK_METAL;

        @pmi0("90")
        public static final GenreIdDto BLUEGRASS;

        @pmi0("3")
        public static final GenreIdDto BLUES;

        @pmi0("175")
        public static final GenreIdDto BOSSA_NOVA;

        @pmi0("176")
        public static final GenreIdDto BREAKBEAT;

        @pmi0("139")
        public static final GenreIdDto BRIT_POP;

        @pmi0("89")
        public static final GenreIdDto CELTIC;

        @pmi0("149")
        public static final GenreIdDto CHANSON;

        @pmi0("4")
        public static final GenreIdDto CHILDREN;

        @pmi0("62")
        public static final GenreIdDto CHRISTIAN_RAP;

        @pmi0("33")
        public static final GenreIdDto CLASSIC;

        @pmi0("177")
        public static final GenreIdDto CONTEMPORARY_RANDB;

        @pmi0(CampaignEx.CLICKMODE_ON)
        public static final GenreIdDto COUNTRY;
        public static final Parcelable.Creator<GenreIdDto> CREATOR;

        @pmi0("6")
        public static final GenreIdDto DANCE;

        @pmi0("178")
        public static final GenreIdDto DANCEHALL;

        @pmi0("23")
        public static final GenreIdDto DEATH_METAL;

        @pmi0(Gc.e)
        public static final GenreIdDto DISCO;

        @pmi0("179")
        public static final GenreIdDto DOO_WOP;

        @pmi0("180")
        public static final GenreIdDto DRONE;

        @pmi0("129")
        public static final GenreIdDto DRUMS;

        @pmi0("134")
        public static final GenreIdDto DRUM_N_BASS;

        @pmi0("181")
        public static final GenreIdDto DUB;

        @pmi0("182")
        public static final GenreIdDto DUBSTEP;

        @pmi0("99")
        public static final GenreIdDto EASY_LISTENING_MUSIC;

        @pmi0("183")
        public static final GenreIdDto ELECTRO;

        @pmi0("53")
        public static final GenreIdDto ELECTRONIC;

        @pmi0("184")
        public static final GenreIdDto ELECTRONIC_DANCE_MUSIC;

        @pmi0("185")
        public static final GenreIdDto EMO;

        @pmi0("47")
        public static final GenreIdDto ETHNIC;

        @pmi0("55")
        public static final GenreIdDto EURODANCE;

        @pmi0("91")
        public static final GenreIdDto EXPERIMENTAL;

        @pmi0("81")
        public static final GenreIdDto FOLK;

        @pmi0("82")
        public static final GenreIdDto FOLK_ROCK;

        @pmi0("120")
        public static final GenreIdDto FREESTYLE;

        @pmi0("8")
        public static final GenreIdDto FUNK;

        @pmi0("31")
        public static final GenreIdDto FUSION;

        @pmi0("60")
        public static final GenreIdDto GANGSTA;

        @pmi0("39")
        public static final GenreIdDto GOSPEL;

        @pmi0("50")
        public static final GenreIdDto GOTHIC;

        @pmi0("92")
        public static final GenreIdDto GOTHIC_ROCK;

        @pmi0("186")
        public static final GenreIdDto GRINDCORE;

        @pmi0("9")
        public static final GenreIdDto GRUNGE;

        @pmi0("150")
        public static final GenreIdDto HARDCORE;

        @pmi0("136")
        public static final GenreIdDto HARDCORE_TECHNO;

        @pmi0("80")
        public static final GenreIdDto HARD_ROCK;

        @pmi0("144")
        public static final GenreIdDto HEAVY_METAL;

        @pmi0("10")
        public static final GenreIdDto HIP_HOP;

        @pmi0("137")
        public static final GenreIdDto HORROR;

        @pmi0("36")
        public static final GenreIdDto HOUSE;

        @pmi0("58")
        public static final GenreIdDto HUMOR_AND_SATIRE;

        @pmi0("187")
        public static final GenreIdDto HYPERPOP;

        @pmi0("188")
        public static final GenreIdDto HYPERTRAP;

        @pmi0("189")
        public static final GenreIdDto IDM;

        @pmi0("138")
        public static final GenreIdDto INDIE;

        @pmi0("20")
        public static final GenreIdDto INDUSTRIAL;

        @pmi0("34")
        public static final GenreIdDto INSTRUMENTAL;

        @pmi0("190")
        public static final GenreIdDto INSTRUMENTAL_HIP_HOP;

        @pmi0("191")
        public static final GenreIdDto ITALO_DISCO;

        @pmi0("11")
        public static final GenreIdDto JAZZ;

        @pmi0("1001")
        public static final GenreIdDto JAZZ_AND_BLUES;

        @pmi0("64")
        public static final GenreIdDto JUNGLE;

        @pmi0("127")
        public static final GenreIdDto J_POP;

        @pmi0("152")
        public static final GenreIdDto K_POP;

        @pmi0("87")
        public static final GenreIdDto LATIN;

        @pmi0("192")
        public static final GenreIdDto LATIN_RAP;

        @pmi0("148")
        public static final GenreIdDto LOUNGE;

        @pmi0("72")
        public static final GenreIdDto LO_FI;

        @pmi0("46")
        public static final GenreIdDto MEDITATIVE;

        @pmi0("123")
        public static final GenreIdDto MERENGUE;

        @pmi0("12")
        public static final GenreIdDto METAL;

        @pmi0("146")
        public static final GenreIdDto MIX_STYLE;

        @pmi0("78")
        public static final GenreIdDto MUSICAL;

        @pmi0("65")
        public static final GenreIdDto NATIVE_AMERICAN_NATIVE_US;

        @pmi0("193")
        public static final GenreIdDto NEO_CLASSICAL;

        @pmi0("13")
        public static final GenreIdDto NEW_AGE;

        @pmi0("67")
        public static final GenreIdDto NEW_WAVE;

        @pmi0("40")
        public static final GenreIdDto NOISE;

        @pmi0("104")
        public static final GenreIdDto OPERA;

        @pmi0("97")
        public static final GenreIdDto ORCHESTRA;

        @pmi0("15")
        public static final GenreIdDto OTHER;

        @pmi0("153")
        public static final GenreIdDto PARTY;

        @pmi0("194")
        public static final GenreIdDto PHONK;

        @pmi0("1")
        public static final GenreIdDto POP;

        @pmi0("154")
        public static final GenreIdDto POP_ROCK;

        @pmi0("151")
        public static final GenreIdDto POST_HARDCORE;

        @pmi0("195")
        public static final GenreIdDto POST_PUNK;

        @pmi0("93")
        public static final GenreIdDto PROGRESSIVE;

        @pmi0("68")
        public static final GenreIdDto PSYCHEDELIA;

        @pmi0("94")
        public static final GenreIdDto PSYCHEDELIC_ROCK;

        @pmi0("44")
        public static final GenreIdDto PUNK;

        @pmi0("122")
        public static final GenreIdDto PUNK_ROCK;

        @pmi0("16")
        public static final GenreIdDto RANDB;

        @pmi0("17")
        public static final GenreIdDto RAP;

        @pmi0("196")
        public static final GenreIdDto RAP_ROCK;

        @pmi0("69")
        public static final GenreIdDto RAVE;

        @pmi0("18")
        public static final GenreIdDto REGGAE;

        @pmi0("197")
        public static final GenreIdDto REGGAETON;

        @pmi0("105")
        public static final GenreIdDto RELIGIOUS_MUSIC;

        @pmi0("14")
        public static final GenreIdDto RETRO;

        @pmi0("2")
        public static final GenreIdDto ROCK;

        @pmi0("79")
        public static final GenreIdDto ROCK_N_ROLL;

        @pmi0("198")
        public static final GenreIdDto RUSSIAN_CHANSON;

        @pmi0("200")
        public static final GenreIdDto RUSSIAN_RAP;

        @pmi0("199")
        public static final GenreIdDto RUSSIAN_ROCK;

        @pmi0("124")
        public static final GenreIdDto SALSA;

        @pmi0("115")
        public static final GenreIdDto SAMBA;

        @pmi0("201")
        public static final GenreIdDto SHOEGAZE_AND_DREAM_POP;

        @pmi0("70")
        public static final GenreIdDto SHOW_SHOWTUNES;

        @pmi0("147")
        public static final GenreIdDto SINGER_SONGWRITER;

        @pmi0("22")
        public static final GenreIdDto SKA;

        @pmi0("202")
        public static final GenreIdDto SOPHISTI_POP;

        @pmi0("43")
        public static final GenreIdDto SOUL;

        @pmi0("38")
        public static final GenreIdDto SOUNDS_SOUND_CLIP;

        @pmi0("25")
        public static final GenreIdDto SOUNDTRACK;

        @pmi0("102")
        public static final GenreIdDto SPEECH;

        @pmi0("203")
        public static final GenreIdDto SPOKEN_WORD;

        @pmi0("204")
        public static final GenreIdDto STONER;

        @pmi0("84")
        public static final GenreIdDto SWING;

        @pmi0("95")
        public static final GenreIdDto SYMPHONIC_ROCK;

        @pmi0("128")
        public static final GenreIdDto SYNTH_POP;

        @pmi0("114")
        public static final GenreIdDto TANGO;

        @pmi0("19")
        public static final GenreIdDto TECHNO;

        @pmi0("125")
        public static final GenreIdDto THRASH_METAL;

        @pmi0("71")
        public static final GenreIdDto TRAILER;

        @pmi0("32")
        public static final GenreIdDto TRANCE;

        @pmi0("205")
        public static final GenreIdDto TRAP;

        @pmi0("73")
        public static final GenreIdDto TRIBAL;

        @pmi0("28")
        public static final GenreIdDto TRIP_HOP;

        @pmi0("206")
        public static final GenreIdDto UK_GARAGE;

        @pmi0("207")
        public static final GenreIdDto VAPORWAVE;

        @pmi0("66")
        public static final GenreIdDto VARIETY;

        @pmi0("130")
        public static final GenreIdDto VOCALS;
        private final int value;

        /* compiled from: VideoRelatedAudioDto.kt */
        public static final class a implements Parcelable.Creator<GenreIdDto> {
            @Override // android.os.Parcelable.Creator
            public final GenreIdDto createFromParcel(Parcel parcel) {
                return GenreIdDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final GenreIdDto[] newArray(int i) {
                return new GenreIdDto[i];
            }
        }

        static {
            GenreIdDto genreIdDto = new GenreIdDto("POP", 0, 1);
            POP = genreIdDto;
            GenreIdDto genreIdDto2 = new GenreIdDto("ROCK", 1, 2);
            ROCK = genreIdDto2;
            GenreIdDto genreIdDto3 = new GenreIdDto("BLUES", 2, 3);
            BLUES = genreIdDto3;
            GenreIdDto genreIdDto4 = new GenreIdDto("CHILDREN", 3, 4);
            CHILDREN = genreIdDto4;
            GenreIdDto genreIdDto5 = new GenreIdDto("COUNTRY", 4, 5);
            COUNTRY = genreIdDto5;
            GenreIdDto genreIdDto6 = new GenreIdDto("DANCE", 5, 6);
            DANCE = genreIdDto6;
            GenreIdDto genreIdDto7 = new GenreIdDto("DISCO", 6, 7);
            DISCO = genreIdDto7;
            GenreIdDto genreIdDto8 = new GenreIdDto("FUNK", 7, 8);
            FUNK = genreIdDto8;
            GenreIdDto genreIdDto9 = new GenreIdDto("GRUNGE", 8, 9);
            GRUNGE = genreIdDto9;
            GenreIdDto genreIdDto10 = new GenreIdDto("HIP_HOP", 9, 10);
            HIP_HOP = genreIdDto10;
            GenreIdDto genreIdDto11 = new GenreIdDto("JAZZ", 10, 11);
            JAZZ = genreIdDto11;
            GenreIdDto genreIdDto12 = new GenreIdDto("METAL", 11, 12);
            METAL = genreIdDto12;
            GenreIdDto genreIdDto13 = new GenreIdDto("NEW_AGE", 12, 13);
            NEW_AGE = genreIdDto13;
            GenreIdDto genreIdDto14 = new GenreIdDto("RETRO", 13, 14);
            RETRO = genreIdDto14;
            GenreIdDto genreIdDto15 = new GenreIdDto(NativeAdContent.ViewTag.OTHER, 14, 15);
            OTHER = genreIdDto15;
            GenreIdDto genreIdDto16 = new GenreIdDto("RANDB", 15, 16);
            RANDB = genreIdDto16;
            GenreIdDto genreIdDto17 = new GenreIdDto("RAP", 16, 17);
            RAP = genreIdDto17;
            GenreIdDto genreIdDto18 = new GenreIdDto("REGGAE", 17, 18);
            REGGAE = genreIdDto18;
            GenreIdDto genreIdDto19 = new GenreIdDto("TECHNO", 18, 19);
            TECHNO = genreIdDto19;
            GenreIdDto genreIdDto20 = new GenreIdDto("INDUSTRIAL", 19, 20);
            INDUSTRIAL = genreIdDto20;
            GenreIdDto genreIdDto21 = new GenreIdDto("ALTERNATIVE", 20, 21);
            ALTERNATIVE = genreIdDto21;
            GenreIdDto genreIdDto22 = new GenreIdDto("SKA", 21, 22);
            SKA = genreIdDto22;
            GenreIdDto genreIdDto23 = new GenreIdDto("DEATH_METAL", 22, 23);
            DEATH_METAL = genreIdDto23;
            GenreIdDto genreIdDto24 = new GenreIdDto("SOUNDTRACK", 23, 25);
            SOUNDTRACK = genreIdDto24;
            GenreIdDto genreIdDto25 = new GenreIdDto("AMBIENT", 24, 27);
            AMBIENT = genreIdDto25;
            GenreIdDto genreIdDto26 = new GenreIdDto("TRIP_HOP", 25, 28);
            TRIP_HOP = genreIdDto26;
            GenreIdDto genreIdDto27 = new GenreIdDto("FUSION", 26, 31);
            FUSION = genreIdDto27;
            GenreIdDto genreIdDto28 = new GenreIdDto("TRANCE", 27, 32);
            TRANCE = genreIdDto28;
            GenreIdDto genreIdDto29 = new GenreIdDto("CLASSIC", 28, 33);
            CLASSIC = genreIdDto29;
            GenreIdDto genreIdDto30 = new GenreIdDto("INSTRUMENTAL", 29, 34);
            INSTRUMENTAL = genreIdDto30;
            GenreIdDto genreIdDto31 = new GenreIdDto("ACID", 30, 35);
            ACID = genreIdDto31;
            GenreIdDto genreIdDto32 = new GenreIdDto("HOUSE", 31, 36);
            HOUSE = genreIdDto32;
            GenreIdDto genreIdDto33 = new GenreIdDto("SOUNDS_SOUND_CLIP", 32, 38);
            SOUNDS_SOUND_CLIP = genreIdDto33;
            GenreIdDto genreIdDto34 = new GenreIdDto("GOSPEL", 33, 39);
            GOSPEL = genreIdDto34;
            GenreIdDto genreIdDto35 = new GenreIdDto("NOISE", 34, 40);
            NOISE = genreIdDto35;
            GenreIdDto genreIdDto36 = new GenreIdDto("ALTERNATIVE_ROCK", 35, 41);
            ALTERNATIVE_ROCK = genreIdDto36;
            GenreIdDto genreIdDto37 = new GenreIdDto("BASS", 36, 42);
            BASS = genreIdDto37;
            GenreIdDto genreIdDto38 = new GenreIdDto("SOUL", 37, 43);
            SOUL = genreIdDto38;
            GenreIdDto genreIdDto39 = new GenreIdDto("PUNK", 38, 44);
            PUNK = genreIdDto39;
            GenreIdDto genreIdDto40 = new GenreIdDto("MEDITATIVE", 39, 46);
            MEDITATIVE = genreIdDto40;
            GenreIdDto genreIdDto41 = new GenreIdDto("ETHNIC", 40, 47);
            ETHNIC = genreIdDto41;
            GenreIdDto genreIdDto42 = new GenreIdDto("GOTHIC", 41, 50);
            GOTHIC = genreIdDto42;
            GenreIdDto genreIdDto43 = new GenreIdDto("ELECTRONIC", 42, 53);
            ELECTRONIC = genreIdDto43;
            GenreIdDto genreIdDto44 = new GenreIdDto("EURODANCE", 43, 55);
            EURODANCE = genreIdDto44;
            GenreIdDto genreIdDto45 = new GenreIdDto("HUMOR_AND_SATIRE", 44, 58);
            HUMOR_AND_SATIRE = genreIdDto45;
            GenreIdDto genreIdDto46 = new GenreIdDto("GANGSTA", 45, 60);
            GANGSTA = genreIdDto46;
            GenreIdDto genreIdDto47 = new GenreIdDto("CHRISTIAN_RAP", 46, 62);
            CHRISTIAN_RAP = genreIdDto47;
            GenreIdDto genreIdDto48 = new GenreIdDto("JUNGLE", 47, 64);
            JUNGLE = genreIdDto48;
            GenreIdDto genreIdDto49 = new GenreIdDto("NATIVE_AMERICAN_NATIVE_US", 48, 65);
            NATIVE_AMERICAN_NATIVE_US = genreIdDto49;
            GenreIdDto genreIdDto50 = new GenreIdDto("VARIETY", 49, 66);
            VARIETY = genreIdDto50;
            GenreIdDto genreIdDto51 = new GenreIdDto("NEW_WAVE", 50, 67);
            NEW_WAVE = genreIdDto51;
            GenreIdDto genreIdDto52 = new GenreIdDto("PSYCHEDELIA", 51, 68);
            PSYCHEDELIA = genreIdDto52;
            GenreIdDto genreIdDto53 = new GenreIdDto("RAVE", 52, 69);
            RAVE = genreIdDto53;
            GenreIdDto genreIdDto54 = new GenreIdDto("SHOW_SHOWTUNES", 53, 70);
            SHOW_SHOWTUNES = genreIdDto54;
            GenreIdDto genreIdDto55 = new GenreIdDto("TRAILER", 54, 71);
            TRAILER = genreIdDto55;
            GenreIdDto genreIdDto56 = new GenreIdDto("LO_FI", 55, 72);
            LO_FI = genreIdDto56;
            GenreIdDto genreIdDto57 = new GenreIdDto("TRIBAL", 56, 73);
            TRIBAL = genreIdDto57;
            GenreIdDto genreIdDto58 = new GenreIdDto("ACID_PUNK", 57, 74);
            ACID_PUNK = genreIdDto58;
            GenreIdDto genreIdDto59 = new GenreIdDto("ACID_JAZZ", 58, 75);
            ACID_JAZZ = genreIdDto59;
            GenreIdDto genreIdDto60 = new GenreIdDto("MUSICAL", 59, 78);
            MUSICAL = genreIdDto60;
            GenreIdDto genreIdDto61 = new GenreIdDto("ROCK_N_ROLL", 60, 79);
            ROCK_N_ROLL = genreIdDto61;
            GenreIdDto genreIdDto62 = new GenreIdDto("HARD_ROCK", 61, 80);
            HARD_ROCK = genreIdDto62;
            GenreIdDto genreIdDto63 = new GenreIdDto("FOLK", 62, 81);
            FOLK = genreIdDto63;
            GenreIdDto genreIdDto64 = new GenreIdDto("FOLK_ROCK", 63, 82);
            FOLK_ROCK = genreIdDto64;
            GenreIdDto genreIdDto65 = new GenreIdDto("SWING", 64, 84);
            SWING = genreIdDto65;
            GenreIdDto genreIdDto66 = new GenreIdDto("BEBOP", 65, 86);
            BEBOP = genreIdDto66;
            GenreIdDto genreIdDto67 = new GenreIdDto("LATIN", 66, 87);
            LATIN = genreIdDto67;
            GenreIdDto genreIdDto68 = new GenreIdDto("CELTIC", 67, 89);
            CELTIC = genreIdDto68;
            GenreIdDto genreIdDto69 = new GenreIdDto("BLUEGRASS", 68, 90);
            BLUEGRASS = genreIdDto69;
            GenreIdDto genreIdDto70 = new GenreIdDto("EXPERIMENTAL", 69, 91);
            EXPERIMENTAL = genreIdDto70;
            GenreIdDto genreIdDto71 = new GenreIdDto("GOTHIC_ROCK", 70, 92);
            GOTHIC_ROCK = genreIdDto71;
            GenreIdDto genreIdDto72 = new GenreIdDto("PROGRESSIVE", 71, 93);
            PROGRESSIVE = genreIdDto72;
            GenreIdDto genreIdDto73 = new GenreIdDto("PSYCHEDELIC_ROCK", 72, 94);
            PSYCHEDELIC_ROCK = genreIdDto73;
            GenreIdDto genreIdDto74 = new GenreIdDto("SYMPHONIC_ROCK", 73, 95);
            SYMPHONIC_ROCK = genreIdDto74;
            GenreIdDto genreIdDto75 = new GenreIdDto("ORCHESTRA", 74, 97);
            ORCHESTRA = genreIdDto75;
            GenreIdDto genreIdDto76 = new GenreIdDto("EASY_LISTENING_MUSIC", 75, 99);
            EASY_LISTENING_MUSIC = genreIdDto76;
            GenreIdDto genreIdDto77 = new GenreIdDto("ACOUSTIC", 76, 100);
            ACOUSTIC = genreIdDto77;
            GenreIdDto genreIdDto78 = new GenreIdDto("SPEECH", 77, 102);
            SPEECH = genreIdDto78;
            GenreIdDto genreIdDto79 = new GenreIdDto("OPERA", 78, 104);
            OPERA = genreIdDto79;
            GenreIdDto genreIdDto80 = new GenreIdDto("RELIGIOUS_MUSIC", 79, 105);
            RELIGIOUS_MUSIC = genreIdDto80;
            GenreIdDto genreIdDto81 = new GenreIdDto("TANGO", 80, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            TANGO = genreIdDto81;
            GenreIdDto genreIdDto82 = new GenreIdDto("SAMBA", 81, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
            SAMBA = genreIdDto82;
            GenreIdDto genreIdDto83 = new GenreIdDto("BALLAD", 82, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
            BALLAD = genreIdDto83;
            GenreIdDto genreIdDto84 = new GenreIdDto("FREESTYLE", 83, 120);
            FREESTYLE = genreIdDto84;
            GenreIdDto genreIdDto85 = new GenreIdDto("PUNK_ROCK", 84, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            PUNK_ROCK = genreIdDto85;
            GenreIdDto genreIdDto86 = new GenreIdDto("MERENGUE", 85, 123);
            MERENGUE = genreIdDto86;
            GenreIdDto genreIdDto87 = new GenreIdDto("SALSA", 86, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            SALSA = genreIdDto87;
            GenreIdDto genreIdDto88 = new GenreIdDto("THRASH_METAL", 87, 125);
            THRASH_METAL = genreIdDto88;
            GenreIdDto genreIdDto89 = new GenreIdDto("J_POP", 88, 127);
            J_POP = genreIdDto89;
            GenreIdDto genreIdDto90 = new GenreIdDto("SYNTH_POP", 89, 128);
            SYNTH_POP = genreIdDto90;
            GenreIdDto genreIdDto91 = new GenreIdDto("DRUMS", 90, 129);
            DRUMS = genreIdDto91;
            GenreIdDto genreIdDto92 = new GenreIdDto("VOCALS", 91, 130);
            VOCALS = genreIdDto92;
            GenreIdDto genreIdDto93 = new GenreIdDto("DRUM_N_BASS", 92, 134);
            DRUM_N_BASS = genreIdDto93;
            GenreIdDto genreIdDto94 = new GenreIdDto("HARDCORE_TECHNO", 93, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
            HARDCORE_TECHNO = genreIdDto94;
            GenreIdDto genreIdDto95 = new GenreIdDto("HORROR", 94, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);
            HORROR = genreIdDto95;
            GenreIdDto genreIdDto96 = new GenreIdDto("INDIE", 95, 138);
            INDIE = genreIdDto96;
            GenreIdDto genreIdDto97 = new GenreIdDto("BRIT_POP", 96, 139);
            BRIT_POP = genreIdDto97;
            GenreIdDto genreIdDto98 = new GenreIdDto("BIT", 97, 142);
            BIT = genreIdDto98;
            GenreIdDto genreIdDto99 = new GenreIdDto("HEAVY_METAL", 98, 144);
            HEAVY_METAL = genreIdDto99;
            GenreIdDto genreIdDto100 = new GenreIdDto("BLACK_METAL", 99, 145);
            BLACK_METAL = genreIdDto100;
            GenreIdDto genreIdDto101 = new GenreIdDto("MIX_STYLE", 100, 146);
            MIX_STYLE = genreIdDto101;
            GenreIdDto genreIdDto102 = new GenreIdDto("SINGER_SONGWRITER", 101, 147);
            SINGER_SONGWRITER = genreIdDto102;
            GenreIdDto genreIdDto103 = new GenreIdDto("LOUNGE", 102, 148);
            LOUNGE = genreIdDto103;
            GenreIdDto genreIdDto104 = new GenreIdDto("CHANSON", 103, 149);
            CHANSON = genreIdDto104;
            GenreIdDto genreIdDto105 = new GenreIdDto("HARDCORE", 104, 150);
            HARDCORE = genreIdDto105;
            GenreIdDto genreIdDto106 = new GenreIdDto("POST_HARDCORE", 105, 151);
            POST_HARDCORE = genreIdDto106;
            GenreIdDto genreIdDto107 = new GenreIdDto("K_POP", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, 152);
            K_POP = genreIdDto107;
            GenreIdDto genreIdDto108 = new GenreIdDto("PARTY", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, 153);
            PARTY = genreIdDto108;
            GenreIdDto genreIdDto109 = new GenreIdDto("POP_ROCK", 108, 154);
            POP_ROCK = genreIdDto109;
            GenreIdDto genreIdDto110 = new GenreIdDto("AFROBEAT", 109, 156);
            AFROBEAT = genreIdDto110;
            GenreIdDto genreIdDto111 = new GenreIdDto("ALTERNATIVE_METAL", 110, 169);
            ALTERNATIVE_METAL = genreIdDto111;
            GenreIdDto genreIdDto112 = new GenreIdDto("BALEARIC", 111, 170);
            BALEARIC = genreIdDto112;
            GenreIdDto genreIdDto113 = new GenreIdDto("BALKAN", 112, 171);
            BALKAN = genreIdDto113;
            GenreIdDto genreIdDto114 = new GenreIdDto("BAROQUE_POP", 113, 172);
            BAROQUE_POP = genreIdDto114;
            GenreIdDto genreIdDto115 = new GenreIdDto("BEATBOXING", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 173);
            BEATBOXING = genreIdDto115;
            GenreIdDto genreIdDto116 = new GenreIdDto("BLACKGAZE", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, 174);
            BLACKGAZE = genreIdDto116;
            GenreIdDto genreIdDto117 = new GenreIdDto("BOSSA_NOVA", 116, 175);
            BOSSA_NOVA = genreIdDto117;
            GenreIdDto genreIdDto118 = new GenreIdDto("BREAKBEAT", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 176);
            BREAKBEAT = genreIdDto118;
            GenreIdDto genreIdDto119 = new GenreIdDto("CONTEMPORARY_RANDB", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 177);
            CONTEMPORARY_RANDB = genreIdDto119;
            GenreIdDto genreIdDto120 = new GenreIdDto("DANCEHALL", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 178);
            DANCEHALL = genreIdDto120;
            GenreIdDto genreIdDto121 = new GenreIdDto("DOO_WOP", 120, 179);
            DOO_WOP = genreIdDto121;
            GenreIdDto genreIdDto122 = new GenreIdDto("DRONE", Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 180);
            DRONE = genreIdDto122;
            GenreIdDto genreIdDto123 = new GenreIdDto("DUB", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 181);
            DUB = genreIdDto123;
            GenreIdDto genreIdDto124 = new GenreIdDto("DUBSTEP", 123, 182);
            DUBSTEP = genreIdDto124;
            GenreIdDto genreIdDto125 = new GenreIdDto("ELECTRO", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 183);
            ELECTRO = genreIdDto125;
            GenreIdDto genreIdDto126 = new GenreIdDto("ELECTRONIC_DANCE_MUSIC", 125, 184);
            ELECTRONIC_DANCE_MUSIC = genreIdDto126;
            GenreIdDto genreIdDto127 = new GenreIdDto("EMO", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 185);
            EMO = genreIdDto127;
            GenreIdDto genreIdDto128 = new GenreIdDto("GRINDCORE", 127, 186);
            GRINDCORE = genreIdDto128;
            GenreIdDto genreIdDto129 = new GenreIdDto("HYPERPOP", 128, 187);
            HYPERPOP = genreIdDto129;
            GenreIdDto genreIdDto130 = new GenreIdDto("HYPERTRAP", 129, 188);
            HYPERTRAP = genreIdDto130;
            GenreIdDto genreIdDto131 = new GenreIdDto("IDM", 130, PsExtractor.PRIVATE_STREAM_1);
            IDM = genreIdDto131;
            GenreIdDto genreIdDto132 = new GenreIdDto("INSTRUMENTAL_HIP_HOP", Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 190);
            INSTRUMENTAL_HIP_HOP = genreIdDto132;
            GenreIdDto genreIdDto133 = new GenreIdDto("ITALO_DISCO", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 191);
            ITALO_DISCO = genreIdDto133;
            GenreIdDto genreIdDto134 = new GenreIdDto("LATIN_RAP", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, PsExtractor.AUDIO_STREAM);
            LATIN_RAP = genreIdDto134;
            GenreIdDto genreIdDto135 = new GenreIdDto("NEO_CLASSICAL", 134, 193);
            NEO_CLASSICAL = genreIdDto135;
            GenreIdDto genreIdDto136 = new GenreIdDto("PHONK", 135, 194);
            PHONK = genreIdDto136;
            GenreIdDto genreIdDto137 = new GenreIdDto("POST_PUNK", Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 195);
            POST_PUNK = genreIdDto137;
            GenreIdDto genreIdDto138 = new GenreIdDto("RAP_ROCK", Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 196);
            RAP_ROCK = genreIdDto138;
            GenreIdDto genreIdDto139 = new GenreIdDto("REGGAETON", 138, 197);
            REGGAETON = genreIdDto139;
            GenreIdDto genreIdDto140 = new GenreIdDto("RUSSIAN_CHANSON", 139, 198);
            RUSSIAN_CHANSON = genreIdDto140;
            GenreIdDto genreIdDto141 = new GenreIdDto("RUSSIAN_ROCK", VersionConstants.PRODUCT_MAJOR_VERSION, 199);
            RUSSIAN_ROCK = genreIdDto141;
            GenreIdDto genreIdDto142 = new GenreIdDto("RUSSIAN_RAP", 141, 200);
            RUSSIAN_RAP = genreIdDto142;
            GenreIdDto genreIdDto143 = new GenreIdDto("SHOEGAZE_AND_DREAM_POP", 142, 201);
            SHOEGAZE_AND_DREAM_POP = genreIdDto143;
            GenreIdDto genreIdDto144 = new GenreIdDto("SOPHISTI_POP", 143, 202);
            SOPHISTI_POP = genreIdDto144;
            GenreIdDto genreIdDto145 = new GenreIdDto("SPOKEN_WORD", 144, 203);
            SPOKEN_WORD = genreIdDto145;
            GenreIdDto genreIdDto146 = new GenreIdDto("STONER", 145, 204);
            STONER = genreIdDto146;
            GenreIdDto genreIdDto147 = new GenreIdDto("TRAP", 146, 205);
            TRAP = genreIdDto147;
            GenreIdDto genreIdDto148 = new GenreIdDto("UK_GARAGE", 147, 206);
            UK_GARAGE = genreIdDto148;
            GenreIdDto genreIdDto149 = new GenreIdDto("VAPORWAVE", 148, 207);
            VAPORWAVE = genreIdDto149;
            GenreIdDto genreIdDto150 = new GenreIdDto("JAZZ_AND_BLUES", 149, 1001);
            JAZZ_AND_BLUES = genreIdDto150;
            GenreIdDto[] genreIdDtoArr = {genreIdDto, genreIdDto2, genreIdDto3, genreIdDto4, genreIdDto5, genreIdDto6, genreIdDto7, genreIdDto8, genreIdDto9, genreIdDto10, genreIdDto11, genreIdDto12, genreIdDto13, genreIdDto14, genreIdDto15, genreIdDto16, genreIdDto17, genreIdDto18, genreIdDto19, genreIdDto20, genreIdDto21, genreIdDto22, genreIdDto23, genreIdDto24, genreIdDto25, genreIdDto26, genreIdDto27, genreIdDto28, genreIdDto29, genreIdDto30, genreIdDto31, genreIdDto32, genreIdDto33, genreIdDto34, genreIdDto35, genreIdDto36, genreIdDto37, genreIdDto38, genreIdDto39, genreIdDto40, genreIdDto41, genreIdDto42, genreIdDto43, genreIdDto44, genreIdDto45, genreIdDto46, genreIdDto47, genreIdDto48, genreIdDto49, genreIdDto50, genreIdDto51, genreIdDto52, genreIdDto53, genreIdDto54, genreIdDto55, genreIdDto56, genreIdDto57, genreIdDto58, genreIdDto59, genreIdDto60, genreIdDto61, genreIdDto62, genreIdDto63, genreIdDto64, genreIdDto65, genreIdDto66, genreIdDto67, genreIdDto68, genreIdDto69, genreIdDto70, genreIdDto71, genreIdDto72, genreIdDto73, genreIdDto74, genreIdDto75, genreIdDto76, genreIdDto77, genreIdDto78, genreIdDto79, genreIdDto80, genreIdDto81, genreIdDto82, genreIdDto83, genreIdDto84, genreIdDto85, genreIdDto86, genreIdDto87, genreIdDto88, genreIdDto89, genreIdDto90, genreIdDto91, genreIdDto92, genreIdDto93, genreIdDto94, genreIdDto95, genreIdDto96, genreIdDto97, genreIdDto98, genreIdDto99, genreIdDto100, genreIdDto101, genreIdDto102, genreIdDto103, genreIdDto104, genreIdDto105, genreIdDto106, genreIdDto107, genreIdDto108, genreIdDto109, genreIdDto110, genreIdDto111, genreIdDto112, genreIdDto113, genreIdDto114, genreIdDto115, genreIdDto116, genreIdDto117, genreIdDto118, genreIdDto119, genreIdDto120, genreIdDto121, genreIdDto122, genreIdDto123, genreIdDto124, genreIdDto125, genreIdDto126, genreIdDto127, genreIdDto128, genreIdDto129, genreIdDto130, genreIdDto131, genreIdDto132, genreIdDto133, genreIdDto134, genreIdDto135, genreIdDto136, genreIdDto137, genreIdDto138, genreIdDto139, genreIdDto140, genreIdDto141, genreIdDto142, genreIdDto143, genreIdDto144, genreIdDto145, genreIdDto146, genreIdDto147, genreIdDto148, genreIdDto149, genreIdDto150};
            $VALUES = genreIdDtoArr;
            $ENTRIES = new asp(genreIdDtoArr);
            CREATOR = new a();
        }

        private GenreIdDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static GenreIdDto valueOf(String str) {
            return (GenreIdDto) Enum.valueOf(GenreIdDto.class, str);
        }

        public static GenreIdDto[] values() {
            return (GenreIdDto[]) $VALUES.clone();
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
    /* compiled from: VideoRelatedAudioDto.kt */
    public static final class MstcpTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MstcpTypeDto[] $VALUES;

        @pmi0("2")
        public static final MstcpTypeDto COPY_OF_MASTER_COPY;
        public static final Parcelable.Creator<MstcpTypeDto> CREATOR;

        @pmi0("1")
        public static final MstcpTypeDto MASTER_COPY;

        @pmi0("0")
        public static final MstcpTypeDto UGC;
        private final int value;

        /* compiled from: VideoRelatedAudioDto.kt */
        public static final class a implements Parcelable.Creator<MstcpTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final MstcpTypeDto createFromParcel(Parcel parcel) {
                return MstcpTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MstcpTypeDto[] newArray(int i) {
                return new MstcpTypeDto[i];
            }
        }

        static {
            MstcpTypeDto mstcpTypeDto = new MstcpTypeDto("UGC", 0, 0);
            UGC = mstcpTypeDto;
            MstcpTypeDto mstcpTypeDto2 = new MstcpTypeDto("MASTER_COPY", 1, 1);
            MASTER_COPY = mstcpTypeDto2;
            MstcpTypeDto mstcpTypeDto3 = new MstcpTypeDto("COPY_OF_MASTER_COPY", 2, 2);
            COPY_OF_MASTER_COPY = mstcpTypeDto3;
            MstcpTypeDto[] mstcpTypeDtoArr = {mstcpTypeDto, mstcpTypeDto2, mstcpTypeDto3};
            $VALUES = mstcpTypeDtoArr;
            $ENTRIES = new asp(mstcpTypeDtoArr);
            CREATOR = new a();
        }

        private MstcpTypeDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static MstcpTypeDto valueOf(String str) {
            return (MstcpTypeDto) Enum.valueOf(MstcpTypeDto.class, str);
        }

        public static MstcpTypeDto[] values() {
            return (MstcpTypeDto[]) $VALUES.clone();
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
    /* compiled from: VideoRelatedAudioDto.kt */
    public static final class TrackGenreIdDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TrackGenreIdDto[] $VALUES;

        @pmi0("35")
        public static final TrackGenreIdDto ACID;

        @pmi0("75")
        public static final TrackGenreIdDto ACID_JAZZ;

        @pmi0("74")
        public static final TrackGenreIdDto ACID_PUNK;

        @pmi0("100")
        public static final TrackGenreIdDto ACOUSTIC;

        @pmi0("156")
        public static final TrackGenreIdDto AFROBEAT;

        @pmi0("21")
        public static final TrackGenreIdDto ALTERNATIVE;

        @pmi0("169")
        public static final TrackGenreIdDto ALTERNATIVE_METAL;

        @pmi0("41")
        public static final TrackGenreIdDto ALTERNATIVE_ROCK;

        @pmi0("27")
        public static final TrackGenreIdDto AMBIENT;

        @pmi0("170")
        public static final TrackGenreIdDto BALEARIC;

        @pmi0("171")
        public static final TrackGenreIdDto BALKAN;

        @pmi0("117")
        public static final TrackGenreIdDto BALLAD;

        @pmi0("172")
        public static final TrackGenreIdDto BAROQUE_POP;

        @pmi0("42")
        public static final TrackGenreIdDto BASS;

        @pmi0("173")
        public static final TrackGenreIdDto BEATBOXING;

        @pmi0("86")
        public static final TrackGenreIdDto BEBOP;

        @pmi0("142")
        public static final TrackGenreIdDto BIT;

        @pmi0("174")
        public static final TrackGenreIdDto BLACKGAZE;

        @pmi0("145")
        public static final TrackGenreIdDto BLACK_METAL;

        @pmi0("90")
        public static final TrackGenreIdDto BLUEGRASS;

        @pmi0("3")
        public static final TrackGenreIdDto BLUES;

        @pmi0("175")
        public static final TrackGenreIdDto BOSSA_NOVA;

        @pmi0("176")
        public static final TrackGenreIdDto BREAKBEAT;

        @pmi0("139")
        public static final TrackGenreIdDto BRIT_POP;

        @pmi0("89")
        public static final TrackGenreIdDto CELTIC;

        @pmi0("149")
        public static final TrackGenreIdDto CHANSON;

        @pmi0("4")
        public static final TrackGenreIdDto CHILDREN;

        @pmi0("62")
        public static final TrackGenreIdDto CHRISTIAN_RAP;

        @pmi0("33")
        public static final TrackGenreIdDto CLASSIC;

        @pmi0("177")
        public static final TrackGenreIdDto CONTEMPORARY_RANDB;

        @pmi0(CampaignEx.CLICKMODE_ON)
        public static final TrackGenreIdDto COUNTRY;
        public static final Parcelable.Creator<TrackGenreIdDto> CREATOR;

        @pmi0("6")
        public static final TrackGenreIdDto DANCE;

        @pmi0("178")
        public static final TrackGenreIdDto DANCEHALL;

        @pmi0("23")
        public static final TrackGenreIdDto DEATH_METAL;

        @pmi0(Gc.e)
        public static final TrackGenreIdDto DISCO;

        @pmi0("179")
        public static final TrackGenreIdDto DOO_WOP;

        @pmi0("180")
        public static final TrackGenreIdDto DRONE;

        @pmi0("129")
        public static final TrackGenreIdDto DRUMS;

        @pmi0("134")
        public static final TrackGenreIdDto DRUM_N_BASS;

        @pmi0("181")
        public static final TrackGenreIdDto DUB;

        @pmi0("182")
        public static final TrackGenreIdDto DUBSTEP;

        @pmi0("99")
        public static final TrackGenreIdDto EASY_LISTENING_MUSIC;

        @pmi0("183")
        public static final TrackGenreIdDto ELECTRO;

        @pmi0("53")
        public static final TrackGenreIdDto ELECTRONIC;

        @pmi0("184")
        public static final TrackGenreIdDto ELECTRONIC_DANCE_MUSIC;

        @pmi0("185")
        public static final TrackGenreIdDto EMO;

        @pmi0("47")
        public static final TrackGenreIdDto ETHNIC;

        @pmi0("55")
        public static final TrackGenreIdDto EURODANCE;

        @pmi0("91")
        public static final TrackGenreIdDto EXPERIMENTAL;

        @pmi0("81")
        public static final TrackGenreIdDto FOLK;

        @pmi0("82")
        public static final TrackGenreIdDto FOLK_ROCK;

        @pmi0("120")
        public static final TrackGenreIdDto FREESTYLE;

        @pmi0("8")
        public static final TrackGenreIdDto FUNK;

        @pmi0("31")
        public static final TrackGenreIdDto FUSION;

        @pmi0("60")
        public static final TrackGenreIdDto GANGSTA;

        @pmi0("39")
        public static final TrackGenreIdDto GOSPEL;

        @pmi0("50")
        public static final TrackGenreIdDto GOTHIC;

        @pmi0("92")
        public static final TrackGenreIdDto GOTHIC_ROCK;

        @pmi0("186")
        public static final TrackGenreIdDto GRINDCORE;

        @pmi0("9")
        public static final TrackGenreIdDto GRUNGE;

        @pmi0("150")
        public static final TrackGenreIdDto HARDCORE;

        @pmi0("136")
        public static final TrackGenreIdDto HARDCORE_TECHNO;

        @pmi0("80")
        public static final TrackGenreIdDto HARD_ROCK;

        @pmi0("144")
        public static final TrackGenreIdDto HEAVY_METAL;

        @pmi0("10")
        public static final TrackGenreIdDto HIP_HOP;

        @pmi0("137")
        public static final TrackGenreIdDto HORROR;

        @pmi0("36")
        public static final TrackGenreIdDto HOUSE;

        @pmi0("58")
        public static final TrackGenreIdDto HUMOR_AND_SATIRE;

        @pmi0("187")
        public static final TrackGenreIdDto HYPERPOP;

        @pmi0("188")
        public static final TrackGenreIdDto HYPERTRAP;

        @pmi0("189")
        public static final TrackGenreIdDto IDM;

        @pmi0("138")
        public static final TrackGenreIdDto INDIE;

        @pmi0("20")
        public static final TrackGenreIdDto INDUSTRIAL;

        @pmi0("34")
        public static final TrackGenreIdDto INSTRUMENTAL;

        @pmi0("190")
        public static final TrackGenreIdDto INSTRUMENTAL_HIP_HOP;

        @pmi0("191")
        public static final TrackGenreIdDto ITALO_DISCO;

        @pmi0("11")
        public static final TrackGenreIdDto JAZZ;

        @pmi0("1001")
        public static final TrackGenreIdDto JAZZ_AND_BLUES;

        @pmi0("64")
        public static final TrackGenreIdDto JUNGLE;

        @pmi0("127")
        public static final TrackGenreIdDto J_POP;

        @pmi0("152")
        public static final TrackGenreIdDto K_POP;

        @pmi0("87")
        public static final TrackGenreIdDto LATIN;

        @pmi0("192")
        public static final TrackGenreIdDto LATIN_RAP;

        @pmi0("148")
        public static final TrackGenreIdDto LOUNGE;

        @pmi0("72")
        public static final TrackGenreIdDto LO_FI;

        @pmi0("46")
        public static final TrackGenreIdDto MEDITATIVE;

        @pmi0("123")
        public static final TrackGenreIdDto MERENGUE;

        @pmi0("12")
        public static final TrackGenreIdDto METAL;

        @pmi0("146")
        public static final TrackGenreIdDto MIX_STYLE;

        @pmi0("78")
        public static final TrackGenreIdDto MUSICAL;

        @pmi0("65")
        public static final TrackGenreIdDto NATIVE_AMERICAN_NATIVE_US;

        @pmi0("193")
        public static final TrackGenreIdDto NEO_CLASSICAL;

        @pmi0("13")
        public static final TrackGenreIdDto NEW_AGE;

        @pmi0("67")
        public static final TrackGenreIdDto NEW_WAVE;

        @pmi0("40")
        public static final TrackGenreIdDto NOISE;

        @pmi0("104")
        public static final TrackGenreIdDto OPERA;

        @pmi0("97")
        public static final TrackGenreIdDto ORCHESTRA;

        @pmi0("15")
        public static final TrackGenreIdDto OTHER;

        @pmi0("153")
        public static final TrackGenreIdDto PARTY;

        @pmi0("194")
        public static final TrackGenreIdDto PHONK;

        @pmi0("1")
        public static final TrackGenreIdDto POP;

        @pmi0("154")
        public static final TrackGenreIdDto POP_ROCK;

        @pmi0("151")
        public static final TrackGenreIdDto POST_HARDCORE;

        @pmi0("195")
        public static final TrackGenreIdDto POST_PUNK;

        @pmi0("93")
        public static final TrackGenreIdDto PROGRESSIVE;

        @pmi0("68")
        public static final TrackGenreIdDto PSYCHEDELIA;

        @pmi0("94")
        public static final TrackGenreIdDto PSYCHEDELIC_ROCK;

        @pmi0("44")
        public static final TrackGenreIdDto PUNK;

        @pmi0("122")
        public static final TrackGenreIdDto PUNK_ROCK;

        @pmi0("16")
        public static final TrackGenreIdDto RANDB;

        @pmi0("17")
        public static final TrackGenreIdDto RAP;

        @pmi0("196")
        public static final TrackGenreIdDto RAP_ROCK;

        @pmi0("69")
        public static final TrackGenreIdDto RAVE;

        @pmi0("18")
        public static final TrackGenreIdDto REGGAE;

        @pmi0("197")
        public static final TrackGenreIdDto REGGAETON;

        @pmi0("105")
        public static final TrackGenreIdDto RELIGIOUS_MUSIC;

        @pmi0("14")
        public static final TrackGenreIdDto RETRO;

        @pmi0("2")
        public static final TrackGenreIdDto ROCK;

        @pmi0("79")
        public static final TrackGenreIdDto ROCK_N_ROLL;

        @pmi0("198")
        public static final TrackGenreIdDto RUSSIAN_CHANSON;

        @pmi0("200")
        public static final TrackGenreIdDto RUSSIAN_RAP;

        @pmi0("199")
        public static final TrackGenreIdDto RUSSIAN_ROCK;

        @pmi0("124")
        public static final TrackGenreIdDto SALSA;

        @pmi0("115")
        public static final TrackGenreIdDto SAMBA;

        @pmi0("201")
        public static final TrackGenreIdDto SHOEGAZE_AND_DREAM_POP;

        @pmi0("70")
        public static final TrackGenreIdDto SHOW_SHOWTUNES;

        @pmi0("147")
        public static final TrackGenreIdDto SINGER_SONGWRITER;

        @pmi0("22")
        public static final TrackGenreIdDto SKA;

        @pmi0("202")
        public static final TrackGenreIdDto SOPHISTI_POP;

        @pmi0("43")
        public static final TrackGenreIdDto SOUL;

        @pmi0("38")
        public static final TrackGenreIdDto SOUNDS_SOUND_CLIP;

        @pmi0("25")
        public static final TrackGenreIdDto SOUNDTRACK;

        @pmi0("102")
        public static final TrackGenreIdDto SPEECH;

        @pmi0("203")
        public static final TrackGenreIdDto SPOKEN_WORD;

        @pmi0("204")
        public static final TrackGenreIdDto STONER;

        @pmi0("84")
        public static final TrackGenreIdDto SWING;

        @pmi0("95")
        public static final TrackGenreIdDto SYMPHONIC_ROCK;

        @pmi0("128")
        public static final TrackGenreIdDto SYNTH_POP;

        @pmi0("114")
        public static final TrackGenreIdDto TANGO;

        @pmi0("19")
        public static final TrackGenreIdDto TECHNO;

        @pmi0("125")
        public static final TrackGenreIdDto THRASH_METAL;

        @pmi0("71")
        public static final TrackGenreIdDto TRAILER;

        @pmi0("32")
        public static final TrackGenreIdDto TRANCE;

        @pmi0("205")
        public static final TrackGenreIdDto TRAP;

        @pmi0("73")
        public static final TrackGenreIdDto TRIBAL;

        @pmi0("28")
        public static final TrackGenreIdDto TRIP_HOP;

        @pmi0("206")
        public static final TrackGenreIdDto UK_GARAGE;

        @pmi0("207")
        public static final TrackGenreIdDto VAPORWAVE;

        @pmi0("66")
        public static final TrackGenreIdDto VARIETY;

        @pmi0("130")
        public static final TrackGenreIdDto VOCALS;
        private final int value;

        /* compiled from: VideoRelatedAudioDto.kt */
        public static final class a implements Parcelable.Creator<TrackGenreIdDto> {
            @Override // android.os.Parcelable.Creator
            public final TrackGenreIdDto createFromParcel(Parcel parcel) {
                return TrackGenreIdDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TrackGenreIdDto[] newArray(int i) {
                return new TrackGenreIdDto[i];
            }
        }

        static {
            TrackGenreIdDto trackGenreIdDto = new TrackGenreIdDto("POP", 0, 1);
            POP = trackGenreIdDto;
            TrackGenreIdDto trackGenreIdDto2 = new TrackGenreIdDto("ROCK", 1, 2);
            ROCK = trackGenreIdDto2;
            TrackGenreIdDto trackGenreIdDto3 = new TrackGenreIdDto("BLUES", 2, 3);
            BLUES = trackGenreIdDto3;
            TrackGenreIdDto trackGenreIdDto4 = new TrackGenreIdDto("CHILDREN", 3, 4);
            CHILDREN = trackGenreIdDto4;
            TrackGenreIdDto trackGenreIdDto5 = new TrackGenreIdDto("COUNTRY", 4, 5);
            COUNTRY = trackGenreIdDto5;
            TrackGenreIdDto trackGenreIdDto6 = new TrackGenreIdDto("DANCE", 5, 6);
            DANCE = trackGenreIdDto6;
            TrackGenreIdDto trackGenreIdDto7 = new TrackGenreIdDto("DISCO", 6, 7);
            DISCO = trackGenreIdDto7;
            TrackGenreIdDto trackGenreIdDto8 = new TrackGenreIdDto("FUNK", 7, 8);
            FUNK = trackGenreIdDto8;
            TrackGenreIdDto trackGenreIdDto9 = new TrackGenreIdDto("GRUNGE", 8, 9);
            GRUNGE = trackGenreIdDto9;
            TrackGenreIdDto trackGenreIdDto10 = new TrackGenreIdDto("HIP_HOP", 9, 10);
            HIP_HOP = trackGenreIdDto10;
            TrackGenreIdDto trackGenreIdDto11 = new TrackGenreIdDto("JAZZ", 10, 11);
            JAZZ = trackGenreIdDto11;
            TrackGenreIdDto trackGenreIdDto12 = new TrackGenreIdDto("METAL", 11, 12);
            METAL = trackGenreIdDto12;
            TrackGenreIdDto trackGenreIdDto13 = new TrackGenreIdDto("NEW_AGE", 12, 13);
            NEW_AGE = trackGenreIdDto13;
            TrackGenreIdDto trackGenreIdDto14 = new TrackGenreIdDto("RETRO", 13, 14);
            RETRO = trackGenreIdDto14;
            TrackGenreIdDto trackGenreIdDto15 = new TrackGenreIdDto(NativeAdContent.ViewTag.OTHER, 14, 15);
            OTHER = trackGenreIdDto15;
            TrackGenreIdDto trackGenreIdDto16 = new TrackGenreIdDto("RANDB", 15, 16);
            RANDB = trackGenreIdDto16;
            TrackGenreIdDto trackGenreIdDto17 = new TrackGenreIdDto("RAP", 16, 17);
            RAP = trackGenreIdDto17;
            TrackGenreIdDto trackGenreIdDto18 = new TrackGenreIdDto("REGGAE", 17, 18);
            REGGAE = trackGenreIdDto18;
            TrackGenreIdDto trackGenreIdDto19 = new TrackGenreIdDto("TECHNO", 18, 19);
            TECHNO = trackGenreIdDto19;
            TrackGenreIdDto trackGenreIdDto20 = new TrackGenreIdDto("INDUSTRIAL", 19, 20);
            INDUSTRIAL = trackGenreIdDto20;
            TrackGenreIdDto trackGenreIdDto21 = new TrackGenreIdDto("ALTERNATIVE", 20, 21);
            ALTERNATIVE = trackGenreIdDto21;
            TrackGenreIdDto trackGenreIdDto22 = new TrackGenreIdDto("SKA", 21, 22);
            SKA = trackGenreIdDto22;
            TrackGenreIdDto trackGenreIdDto23 = new TrackGenreIdDto("DEATH_METAL", 22, 23);
            DEATH_METAL = trackGenreIdDto23;
            TrackGenreIdDto trackGenreIdDto24 = new TrackGenreIdDto("SOUNDTRACK", 23, 25);
            SOUNDTRACK = trackGenreIdDto24;
            TrackGenreIdDto trackGenreIdDto25 = new TrackGenreIdDto("AMBIENT", 24, 27);
            AMBIENT = trackGenreIdDto25;
            TrackGenreIdDto trackGenreIdDto26 = new TrackGenreIdDto("TRIP_HOP", 25, 28);
            TRIP_HOP = trackGenreIdDto26;
            TrackGenreIdDto trackGenreIdDto27 = new TrackGenreIdDto("FUSION", 26, 31);
            FUSION = trackGenreIdDto27;
            TrackGenreIdDto trackGenreIdDto28 = new TrackGenreIdDto("TRANCE", 27, 32);
            TRANCE = trackGenreIdDto28;
            TrackGenreIdDto trackGenreIdDto29 = new TrackGenreIdDto("CLASSIC", 28, 33);
            CLASSIC = trackGenreIdDto29;
            TrackGenreIdDto trackGenreIdDto30 = new TrackGenreIdDto("INSTRUMENTAL", 29, 34);
            INSTRUMENTAL = trackGenreIdDto30;
            TrackGenreIdDto trackGenreIdDto31 = new TrackGenreIdDto("ACID", 30, 35);
            ACID = trackGenreIdDto31;
            TrackGenreIdDto trackGenreIdDto32 = new TrackGenreIdDto("HOUSE", 31, 36);
            HOUSE = trackGenreIdDto32;
            TrackGenreIdDto trackGenreIdDto33 = new TrackGenreIdDto("SOUNDS_SOUND_CLIP", 32, 38);
            SOUNDS_SOUND_CLIP = trackGenreIdDto33;
            TrackGenreIdDto trackGenreIdDto34 = new TrackGenreIdDto("GOSPEL", 33, 39);
            GOSPEL = trackGenreIdDto34;
            TrackGenreIdDto trackGenreIdDto35 = new TrackGenreIdDto("NOISE", 34, 40);
            NOISE = trackGenreIdDto35;
            TrackGenreIdDto trackGenreIdDto36 = new TrackGenreIdDto("ALTERNATIVE_ROCK", 35, 41);
            ALTERNATIVE_ROCK = trackGenreIdDto36;
            TrackGenreIdDto trackGenreIdDto37 = new TrackGenreIdDto("BASS", 36, 42);
            BASS = trackGenreIdDto37;
            TrackGenreIdDto trackGenreIdDto38 = new TrackGenreIdDto("SOUL", 37, 43);
            SOUL = trackGenreIdDto38;
            TrackGenreIdDto trackGenreIdDto39 = new TrackGenreIdDto("PUNK", 38, 44);
            PUNK = trackGenreIdDto39;
            TrackGenreIdDto trackGenreIdDto40 = new TrackGenreIdDto("MEDITATIVE", 39, 46);
            MEDITATIVE = trackGenreIdDto40;
            TrackGenreIdDto trackGenreIdDto41 = new TrackGenreIdDto("ETHNIC", 40, 47);
            ETHNIC = trackGenreIdDto41;
            TrackGenreIdDto trackGenreIdDto42 = new TrackGenreIdDto("GOTHIC", 41, 50);
            GOTHIC = trackGenreIdDto42;
            TrackGenreIdDto trackGenreIdDto43 = new TrackGenreIdDto("ELECTRONIC", 42, 53);
            ELECTRONIC = trackGenreIdDto43;
            TrackGenreIdDto trackGenreIdDto44 = new TrackGenreIdDto("EURODANCE", 43, 55);
            EURODANCE = trackGenreIdDto44;
            TrackGenreIdDto trackGenreIdDto45 = new TrackGenreIdDto("HUMOR_AND_SATIRE", 44, 58);
            HUMOR_AND_SATIRE = trackGenreIdDto45;
            TrackGenreIdDto trackGenreIdDto46 = new TrackGenreIdDto("GANGSTA", 45, 60);
            GANGSTA = trackGenreIdDto46;
            TrackGenreIdDto trackGenreIdDto47 = new TrackGenreIdDto("CHRISTIAN_RAP", 46, 62);
            CHRISTIAN_RAP = trackGenreIdDto47;
            TrackGenreIdDto trackGenreIdDto48 = new TrackGenreIdDto("JUNGLE", 47, 64);
            JUNGLE = trackGenreIdDto48;
            TrackGenreIdDto trackGenreIdDto49 = new TrackGenreIdDto("NATIVE_AMERICAN_NATIVE_US", 48, 65);
            NATIVE_AMERICAN_NATIVE_US = trackGenreIdDto49;
            TrackGenreIdDto trackGenreIdDto50 = new TrackGenreIdDto("VARIETY", 49, 66);
            VARIETY = trackGenreIdDto50;
            TrackGenreIdDto trackGenreIdDto51 = new TrackGenreIdDto("NEW_WAVE", 50, 67);
            NEW_WAVE = trackGenreIdDto51;
            TrackGenreIdDto trackGenreIdDto52 = new TrackGenreIdDto("PSYCHEDELIA", 51, 68);
            PSYCHEDELIA = trackGenreIdDto52;
            TrackGenreIdDto trackGenreIdDto53 = new TrackGenreIdDto("RAVE", 52, 69);
            RAVE = trackGenreIdDto53;
            TrackGenreIdDto trackGenreIdDto54 = new TrackGenreIdDto("SHOW_SHOWTUNES", 53, 70);
            SHOW_SHOWTUNES = trackGenreIdDto54;
            TrackGenreIdDto trackGenreIdDto55 = new TrackGenreIdDto("TRAILER", 54, 71);
            TRAILER = trackGenreIdDto55;
            TrackGenreIdDto trackGenreIdDto56 = new TrackGenreIdDto("LO_FI", 55, 72);
            LO_FI = trackGenreIdDto56;
            TrackGenreIdDto trackGenreIdDto57 = new TrackGenreIdDto("TRIBAL", 56, 73);
            TRIBAL = trackGenreIdDto57;
            TrackGenreIdDto trackGenreIdDto58 = new TrackGenreIdDto("ACID_PUNK", 57, 74);
            ACID_PUNK = trackGenreIdDto58;
            TrackGenreIdDto trackGenreIdDto59 = new TrackGenreIdDto("ACID_JAZZ", 58, 75);
            ACID_JAZZ = trackGenreIdDto59;
            TrackGenreIdDto trackGenreIdDto60 = new TrackGenreIdDto("MUSICAL", 59, 78);
            MUSICAL = trackGenreIdDto60;
            TrackGenreIdDto trackGenreIdDto61 = new TrackGenreIdDto("ROCK_N_ROLL", 60, 79);
            ROCK_N_ROLL = trackGenreIdDto61;
            TrackGenreIdDto trackGenreIdDto62 = new TrackGenreIdDto("HARD_ROCK", 61, 80);
            HARD_ROCK = trackGenreIdDto62;
            TrackGenreIdDto trackGenreIdDto63 = new TrackGenreIdDto("FOLK", 62, 81);
            FOLK = trackGenreIdDto63;
            TrackGenreIdDto trackGenreIdDto64 = new TrackGenreIdDto("FOLK_ROCK", 63, 82);
            FOLK_ROCK = trackGenreIdDto64;
            TrackGenreIdDto trackGenreIdDto65 = new TrackGenreIdDto("SWING", 64, 84);
            SWING = trackGenreIdDto65;
            TrackGenreIdDto trackGenreIdDto66 = new TrackGenreIdDto("BEBOP", 65, 86);
            BEBOP = trackGenreIdDto66;
            TrackGenreIdDto trackGenreIdDto67 = new TrackGenreIdDto("LATIN", 66, 87);
            LATIN = trackGenreIdDto67;
            TrackGenreIdDto trackGenreIdDto68 = new TrackGenreIdDto("CELTIC", 67, 89);
            CELTIC = trackGenreIdDto68;
            TrackGenreIdDto trackGenreIdDto69 = new TrackGenreIdDto("BLUEGRASS", 68, 90);
            BLUEGRASS = trackGenreIdDto69;
            TrackGenreIdDto trackGenreIdDto70 = new TrackGenreIdDto("EXPERIMENTAL", 69, 91);
            EXPERIMENTAL = trackGenreIdDto70;
            TrackGenreIdDto trackGenreIdDto71 = new TrackGenreIdDto("GOTHIC_ROCK", 70, 92);
            GOTHIC_ROCK = trackGenreIdDto71;
            TrackGenreIdDto trackGenreIdDto72 = new TrackGenreIdDto("PROGRESSIVE", 71, 93);
            PROGRESSIVE = trackGenreIdDto72;
            TrackGenreIdDto trackGenreIdDto73 = new TrackGenreIdDto("PSYCHEDELIC_ROCK", 72, 94);
            PSYCHEDELIC_ROCK = trackGenreIdDto73;
            TrackGenreIdDto trackGenreIdDto74 = new TrackGenreIdDto("SYMPHONIC_ROCK", 73, 95);
            SYMPHONIC_ROCK = trackGenreIdDto74;
            TrackGenreIdDto trackGenreIdDto75 = new TrackGenreIdDto("ORCHESTRA", 74, 97);
            ORCHESTRA = trackGenreIdDto75;
            TrackGenreIdDto trackGenreIdDto76 = new TrackGenreIdDto("EASY_LISTENING_MUSIC", 75, 99);
            EASY_LISTENING_MUSIC = trackGenreIdDto76;
            TrackGenreIdDto trackGenreIdDto77 = new TrackGenreIdDto("ACOUSTIC", 76, 100);
            ACOUSTIC = trackGenreIdDto77;
            TrackGenreIdDto trackGenreIdDto78 = new TrackGenreIdDto("SPEECH", 77, 102);
            SPEECH = trackGenreIdDto78;
            TrackGenreIdDto trackGenreIdDto79 = new TrackGenreIdDto("OPERA", 78, 104);
            OPERA = trackGenreIdDto79;
            TrackGenreIdDto trackGenreIdDto80 = new TrackGenreIdDto("RELIGIOUS_MUSIC", 79, 105);
            RELIGIOUS_MUSIC = trackGenreIdDto80;
            TrackGenreIdDto trackGenreIdDto81 = new TrackGenreIdDto("TANGO", 80, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            TANGO = trackGenreIdDto81;
            TrackGenreIdDto trackGenreIdDto82 = new TrackGenreIdDto("SAMBA", 81, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
            SAMBA = trackGenreIdDto82;
            TrackGenreIdDto trackGenreIdDto83 = new TrackGenreIdDto("BALLAD", 82, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
            BALLAD = trackGenreIdDto83;
            TrackGenreIdDto trackGenreIdDto84 = new TrackGenreIdDto("FREESTYLE", 83, 120);
            FREESTYLE = trackGenreIdDto84;
            TrackGenreIdDto trackGenreIdDto85 = new TrackGenreIdDto("PUNK_ROCK", 84, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            PUNK_ROCK = trackGenreIdDto85;
            TrackGenreIdDto trackGenreIdDto86 = new TrackGenreIdDto("MERENGUE", 85, 123);
            MERENGUE = trackGenreIdDto86;
            TrackGenreIdDto trackGenreIdDto87 = new TrackGenreIdDto("SALSA", 86, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            SALSA = trackGenreIdDto87;
            TrackGenreIdDto trackGenreIdDto88 = new TrackGenreIdDto("THRASH_METAL", 87, 125);
            THRASH_METAL = trackGenreIdDto88;
            TrackGenreIdDto trackGenreIdDto89 = new TrackGenreIdDto("J_POP", 88, 127);
            J_POP = trackGenreIdDto89;
            TrackGenreIdDto trackGenreIdDto90 = new TrackGenreIdDto("SYNTH_POP", 89, 128);
            SYNTH_POP = trackGenreIdDto90;
            TrackGenreIdDto trackGenreIdDto91 = new TrackGenreIdDto("DRUMS", 90, 129);
            DRUMS = trackGenreIdDto91;
            TrackGenreIdDto trackGenreIdDto92 = new TrackGenreIdDto("VOCALS", 91, 130);
            VOCALS = trackGenreIdDto92;
            TrackGenreIdDto trackGenreIdDto93 = new TrackGenreIdDto("DRUM_N_BASS", 92, 134);
            DRUM_N_BASS = trackGenreIdDto93;
            TrackGenreIdDto trackGenreIdDto94 = new TrackGenreIdDto("HARDCORE_TECHNO", 93, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
            HARDCORE_TECHNO = trackGenreIdDto94;
            TrackGenreIdDto trackGenreIdDto95 = new TrackGenreIdDto("HORROR", 94, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);
            HORROR = trackGenreIdDto95;
            TrackGenreIdDto trackGenreIdDto96 = new TrackGenreIdDto("INDIE", 95, 138);
            INDIE = trackGenreIdDto96;
            TrackGenreIdDto trackGenreIdDto97 = new TrackGenreIdDto("BRIT_POP", 96, 139);
            BRIT_POP = trackGenreIdDto97;
            TrackGenreIdDto trackGenreIdDto98 = new TrackGenreIdDto("BIT", 97, 142);
            BIT = trackGenreIdDto98;
            TrackGenreIdDto trackGenreIdDto99 = new TrackGenreIdDto("HEAVY_METAL", 98, 144);
            HEAVY_METAL = trackGenreIdDto99;
            TrackGenreIdDto trackGenreIdDto100 = new TrackGenreIdDto("BLACK_METAL", 99, 145);
            BLACK_METAL = trackGenreIdDto100;
            TrackGenreIdDto trackGenreIdDto101 = new TrackGenreIdDto("MIX_STYLE", 100, 146);
            MIX_STYLE = trackGenreIdDto101;
            TrackGenreIdDto trackGenreIdDto102 = new TrackGenreIdDto("SINGER_SONGWRITER", 101, 147);
            SINGER_SONGWRITER = trackGenreIdDto102;
            TrackGenreIdDto trackGenreIdDto103 = new TrackGenreIdDto("LOUNGE", 102, 148);
            LOUNGE = trackGenreIdDto103;
            TrackGenreIdDto trackGenreIdDto104 = new TrackGenreIdDto("CHANSON", 103, 149);
            CHANSON = trackGenreIdDto104;
            TrackGenreIdDto trackGenreIdDto105 = new TrackGenreIdDto("HARDCORE", 104, 150);
            HARDCORE = trackGenreIdDto105;
            TrackGenreIdDto trackGenreIdDto106 = new TrackGenreIdDto("POST_HARDCORE", 105, 151);
            POST_HARDCORE = trackGenreIdDto106;
            TrackGenreIdDto trackGenreIdDto107 = new TrackGenreIdDto("K_POP", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, 152);
            K_POP = trackGenreIdDto107;
            TrackGenreIdDto trackGenreIdDto108 = new TrackGenreIdDto("PARTY", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, 153);
            PARTY = trackGenreIdDto108;
            TrackGenreIdDto trackGenreIdDto109 = new TrackGenreIdDto("POP_ROCK", 108, 154);
            POP_ROCK = trackGenreIdDto109;
            TrackGenreIdDto trackGenreIdDto110 = new TrackGenreIdDto("AFROBEAT", 109, 156);
            AFROBEAT = trackGenreIdDto110;
            TrackGenreIdDto trackGenreIdDto111 = new TrackGenreIdDto("ALTERNATIVE_METAL", 110, 169);
            ALTERNATIVE_METAL = trackGenreIdDto111;
            TrackGenreIdDto trackGenreIdDto112 = new TrackGenreIdDto("BALEARIC", 111, 170);
            BALEARIC = trackGenreIdDto112;
            TrackGenreIdDto trackGenreIdDto113 = new TrackGenreIdDto("BALKAN", 112, 171);
            BALKAN = trackGenreIdDto113;
            TrackGenreIdDto trackGenreIdDto114 = new TrackGenreIdDto("BAROQUE_POP", 113, 172);
            BAROQUE_POP = trackGenreIdDto114;
            TrackGenreIdDto trackGenreIdDto115 = new TrackGenreIdDto("BEATBOXING", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 173);
            BEATBOXING = trackGenreIdDto115;
            TrackGenreIdDto trackGenreIdDto116 = new TrackGenreIdDto("BLACKGAZE", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, 174);
            BLACKGAZE = trackGenreIdDto116;
            TrackGenreIdDto trackGenreIdDto117 = new TrackGenreIdDto("BOSSA_NOVA", 116, 175);
            BOSSA_NOVA = trackGenreIdDto117;
            TrackGenreIdDto trackGenreIdDto118 = new TrackGenreIdDto("BREAKBEAT", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 176);
            BREAKBEAT = trackGenreIdDto118;
            TrackGenreIdDto trackGenreIdDto119 = new TrackGenreIdDto("CONTEMPORARY_RANDB", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 177);
            CONTEMPORARY_RANDB = trackGenreIdDto119;
            TrackGenreIdDto trackGenreIdDto120 = new TrackGenreIdDto("DANCEHALL", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 178);
            DANCEHALL = trackGenreIdDto120;
            TrackGenreIdDto trackGenreIdDto121 = new TrackGenreIdDto("DOO_WOP", 120, 179);
            DOO_WOP = trackGenreIdDto121;
            TrackGenreIdDto trackGenreIdDto122 = new TrackGenreIdDto("DRONE", Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 180);
            DRONE = trackGenreIdDto122;
            TrackGenreIdDto trackGenreIdDto123 = new TrackGenreIdDto("DUB", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 181);
            DUB = trackGenreIdDto123;
            TrackGenreIdDto trackGenreIdDto124 = new TrackGenreIdDto("DUBSTEP", 123, 182);
            DUBSTEP = trackGenreIdDto124;
            TrackGenreIdDto trackGenreIdDto125 = new TrackGenreIdDto("ELECTRO", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 183);
            ELECTRO = trackGenreIdDto125;
            TrackGenreIdDto trackGenreIdDto126 = new TrackGenreIdDto("ELECTRONIC_DANCE_MUSIC", 125, 184);
            ELECTRONIC_DANCE_MUSIC = trackGenreIdDto126;
            TrackGenreIdDto trackGenreIdDto127 = new TrackGenreIdDto("EMO", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 185);
            EMO = trackGenreIdDto127;
            TrackGenreIdDto trackGenreIdDto128 = new TrackGenreIdDto("GRINDCORE", 127, 186);
            GRINDCORE = trackGenreIdDto128;
            TrackGenreIdDto trackGenreIdDto129 = new TrackGenreIdDto("HYPERPOP", 128, 187);
            HYPERPOP = trackGenreIdDto129;
            TrackGenreIdDto trackGenreIdDto130 = new TrackGenreIdDto("HYPERTRAP", 129, 188);
            HYPERTRAP = trackGenreIdDto130;
            TrackGenreIdDto trackGenreIdDto131 = new TrackGenreIdDto("IDM", 130, PsExtractor.PRIVATE_STREAM_1);
            IDM = trackGenreIdDto131;
            TrackGenreIdDto trackGenreIdDto132 = new TrackGenreIdDto("INSTRUMENTAL_HIP_HOP", Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 190);
            INSTRUMENTAL_HIP_HOP = trackGenreIdDto132;
            TrackGenreIdDto trackGenreIdDto133 = new TrackGenreIdDto("ITALO_DISCO", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 191);
            ITALO_DISCO = trackGenreIdDto133;
            TrackGenreIdDto trackGenreIdDto134 = new TrackGenreIdDto("LATIN_RAP", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, PsExtractor.AUDIO_STREAM);
            LATIN_RAP = trackGenreIdDto134;
            TrackGenreIdDto trackGenreIdDto135 = new TrackGenreIdDto("NEO_CLASSICAL", 134, 193);
            NEO_CLASSICAL = trackGenreIdDto135;
            TrackGenreIdDto trackGenreIdDto136 = new TrackGenreIdDto("PHONK", 135, 194);
            PHONK = trackGenreIdDto136;
            TrackGenreIdDto trackGenreIdDto137 = new TrackGenreIdDto("POST_PUNK", Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 195);
            POST_PUNK = trackGenreIdDto137;
            TrackGenreIdDto trackGenreIdDto138 = new TrackGenreIdDto("RAP_ROCK", Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 196);
            RAP_ROCK = trackGenreIdDto138;
            TrackGenreIdDto trackGenreIdDto139 = new TrackGenreIdDto("REGGAETON", 138, 197);
            REGGAETON = trackGenreIdDto139;
            TrackGenreIdDto trackGenreIdDto140 = new TrackGenreIdDto("RUSSIAN_CHANSON", 139, 198);
            RUSSIAN_CHANSON = trackGenreIdDto140;
            TrackGenreIdDto trackGenreIdDto141 = new TrackGenreIdDto("RUSSIAN_ROCK", VersionConstants.PRODUCT_MAJOR_VERSION, 199);
            RUSSIAN_ROCK = trackGenreIdDto141;
            TrackGenreIdDto trackGenreIdDto142 = new TrackGenreIdDto("RUSSIAN_RAP", 141, 200);
            RUSSIAN_RAP = trackGenreIdDto142;
            TrackGenreIdDto trackGenreIdDto143 = new TrackGenreIdDto("SHOEGAZE_AND_DREAM_POP", 142, 201);
            SHOEGAZE_AND_DREAM_POP = trackGenreIdDto143;
            TrackGenreIdDto trackGenreIdDto144 = new TrackGenreIdDto("SOPHISTI_POP", 143, 202);
            SOPHISTI_POP = trackGenreIdDto144;
            TrackGenreIdDto trackGenreIdDto145 = new TrackGenreIdDto("SPOKEN_WORD", 144, 203);
            SPOKEN_WORD = trackGenreIdDto145;
            TrackGenreIdDto trackGenreIdDto146 = new TrackGenreIdDto("STONER", 145, 204);
            STONER = trackGenreIdDto146;
            TrackGenreIdDto trackGenreIdDto147 = new TrackGenreIdDto("TRAP", 146, 205);
            TRAP = trackGenreIdDto147;
            TrackGenreIdDto trackGenreIdDto148 = new TrackGenreIdDto("UK_GARAGE", 147, 206);
            UK_GARAGE = trackGenreIdDto148;
            TrackGenreIdDto trackGenreIdDto149 = new TrackGenreIdDto("VAPORWAVE", 148, 207);
            VAPORWAVE = trackGenreIdDto149;
            TrackGenreIdDto trackGenreIdDto150 = new TrackGenreIdDto("JAZZ_AND_BLUES", 149, 1001);
            JAZZ_AND_BLUES = trackGenreIdDto150;
            TrackGenreIdDto[] trackGenreIdDtoArr = {trackGenreIdDto, trackGenreIdDto2, trackGenreIdDto3, trackGenreIdDto4, trackGenreIdDto5, trackGenreIdDto6, trackGenreIdDto7, trackGenreIdDto8, trackGenreIdDto9, trackGenreIdDto10, trackGenreIdDto11, trackGenreIdDto12, trackGenreIdDto13, trackGenreIdDto14, trackGenreIdDto15, trackGenreIdDto16, trackGenreIdDto17, trackGenreIdDto18, trackGenreIdDto19, trackGenreIdDto20, trackGenreIdDto21, trackGenreIdDto22, trackGenreIdDto23, trackGenreIdDto24, trackGenreIdDto25, trackGenreIdDto26, trackGenreIdDto27, trackGenreIdDto28, trackGenreIdDto29, trackGenreIdDto30, trackGenreIdDto31, trackGenreIdDto32, trackGenreIdDto33, trackGenreIdDto34, trackGenreIdDto35, trackGenreIdDto36, trackGenreIdDto37, trackGenreIdDto38, trackGenreIdDto39, trackGenreIdDto40, trackGenreIdDto41, trackGenreIdDto42, trackGenreIdDto43, trackGenreIdDto44, trackGenreIdDto45, trackGenreIdDto46, trackGenreIdDto47, trackGenreIdDto48, trackGenreIdDto49, trackGenreIdDto50, trackGenreIdDto51, trackGenreIdDto52, trackGenreIdDto53, trackGenreIdDto54, trackGenreIdDto55, trackGenreIdDto56, trackGenreIdDto57, trackGenreIdDto58, trackGenreIdDto59, trackGenreIdDto60, trackGenreIdDto61, trackGenreIdDto62, trackGenreIdDto63, trackGenreIdDto64, trackGenreIdDto65, trackGenreIdDto66, trackGenreIdDto67, trackGenreIdDto68, trackGenreIdDto69, trackGenreIdDto70, trackGenreIdDto71, trackGenreIdDto72, trackGenreIdDto73, trackGenreIdDto74, trackGenreIdDto75, trackGenreIdDto76, trackGenreIdDto77, trackGenreIdDto78, trackGenreIdDto79, trackGenreIdDto80, trackGenreIdDto81, trackGenreIdDto82, trackGenreIdDto83, trackGenreIdDto84, trackGenreIdDto85, trackGenreIdDto86, trackGenreIdDto87, trackGenreIdDto88, trackGenreIdDto89, trackGenreIdDto90, trackGenreIdDto91, trackGenreIdDto92, trackGenreIdDto93, trackGenreIdDto94, trackGenreIdDto95, trackGenreIdDto96, trackGenreIdDto97, trackGenreIdDto98, trackGenreIdDto99, trackGenreIdDto100, trackGenreIdDto101, trackGenreIdDto102, trackGenreIdDto103, trackGenreIdDto104, trackGenreIdDto105, trackGenreIdDto106, trackGenreIdDto107, trackGenreIdDto108, trackGenreIdDto109, trackGenreIdDto110, trackGenreIdDto111, trackGenreIdDto112, trackGenreIdDto113, trackGenreIdDto114, trackGenreIdDto115, trackGenreIdDto116, trackGenreIdDto117, trackGenreIdDto118, trackGenreIdDto119, trackGenreIdDto120, trackGenreIdDto121, trackGenreIdDto122, trackGenreIdDto123, trackGenreIdDto124, trackGenreIdDto125, trackGenreIdDto126, trackGenreIdDto127, trackGenreIdDto128, trackGenreIdDto129, trackGenreIdDto130, trackGenreIdDto131, trackGenreIdDto132, trackGenreIdDto133, trackGenreIdDto134, trackGenreIdDto135, trackGenreIdDto136, trackGenreIdDto137, trackGenreIdDto138, trackGenreIdDto139, trackGenreIdDto140, trackGenreIdDto141, trackGenreIdDto142, trackGenreIdDto143, trackGenreIdDto144, trackGenreIdDto145, trackGenreIdDto146, trackGenreIdDto147, trackGenreIdDto148, trackGenreIdDto149, trackGenreIdDto150};
            $VALUES = trackGenreIdDtoArr;
            $ENTRIES = new asp(trackGenreIdDtoArr);
            CREATOR = new a();
        }

        private TrackGenreIdDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static TrackGenreIdDto valueOf(String str) {
            return (TrackGenreIdDto) Enum.valueOf(TrackGenreIdDto.class, str);
        }

        public static TrackGenreIdDto[] values() {
            return (TrackGenreIdDto[]) $VALUES.clone();
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

    /* compiled from: VideoRelatedAudioDto.kt */
    public static final class a implements Parcelable.Creator<VideoRelatedAudioDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoRelatedAudioDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            ArrayList arrayList;
            String str;
            int i;
            Boolean valueOf5;
            Boolean valueOf6;
            Boolean valueOf7;
            Integer num;
            GenreIdDto createFromParcel;
            Object obj;
            MstcpTypeDto createFromParcel2;
            MstcpTypeDto mstcpTypeDto;
            TrackGenreIdDto createFromParcel3;
            AudioRestrictionDto audioRestrictionDto;
            Integer num2;
            ArrayList arrayList2;
            int i2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Boolean valueOf8;
            Boolean valueOf9;
            Boolean valueOf10;
            Boolean valueOf11;
            Boolean valueOf12;
            Boolean valueOf13;
            String str2;
            int i3;
            ArrayList arrayList5;
            int i4;
            Boolean valueOf14;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString2 = parcel.readString();
            int readInt3 = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(VideoRelatedAudioDto.class.getClassLoader());
            String readString3 = parcel.readString();
            int readInt4 = parcel.readInt();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            AudioAudioPreviewUrlDto audioAudioPreviewUrlDto = (AudioAudioPreviewUrlDto) parcel.readParcelable(VideoRelatedAudioDto.class.getClassLoader());
            Integer valueOf15 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString4 = parcel.readString();
            AudioAdsDto audioAdsDto = (AudioAdsDto) parcel.readParcelable(VideoRelatedAudioDto.class.getClassLoader());
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
            String readString5 = parcel.readString();
            Boolean bool = valueOf;
            Boolean bool2 = valueOf2;
            String readString6 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                arrayList = new ArrayList(readInt5);
                str = readString;
                int i5 = 0;
                while (true) {
                    i = readInt;
                    if (i5 == readInt5) {
                        break;
                    }
                    i5 = bo.b(VideoRelatedAudioDto.class, parcel, arrayList, i5, 1);
                    readInt = i;
                }
            } else {
                str = readString;
                arrayList = null;
                i = readInt;
            }
            Integer valueOf16 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf17 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf18 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
                num = valueOf16;
                createFromParcel = null;
            } else {
                num = valueOf16;
                createFromParcel = GenreIdDto.CREATOR.createFromParcel(parcel);
            }
            GenreIdDto genreIdDto = createFromParcel;
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(VideoRelatedAudioDto.class.getClassLoader());
            AudioAudioAlbumDto audioAudioAlbumDto = (AudioAudioAlbumDto) parcel.readParcelable(VideoRelatedAudioDto.class.getClassLoader());
            Integer valueOf19 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf20 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Object readValue = parcel.readValue(VideoRelatedAudioDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                obj = readValue;
                createFromParcel2 = null;
            } else {
                obj = readValue;
                createFromParcel2 = MstcpTypeDto.CREATOR.createFromParcel(parcel);
            }
            MstcpTypeDto mstcpTypeDto2 = createFromParcel2;
            if (parcel.readInt() == 0) {
                mstcpTypeDto = mstcpTypeDto2;
                createFromParcel3 = null;
            } else {
                mstcpTypeDto = mstcpTypeDto2;
                createFromParcel3 = TrackGenreIdDto.CREATOR.createFromParcel(parcel);
            }
            TrackGenreIdDto trackGenreIdDto = createFromParcel3;
            Object readValue2 = parcel.readValue(VideoRelatedAudioDto.class.getClassLoader());
            AudioRestrictionDto audioRestrictionDto2 = (AudioRestrictionDto) parcel.readParcelable(VideoRelatedAudioDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                audioRestrictionDto = audioRestrictionDto2;
                num2 = valueOf17;
                i2 = readInt2;
                arrayList2 = null;
            } else {
                audioRestrictionDto = audioRestrictionDto2;
                int readInt6 = parcel.readInt();
                num2 = valueOf17;
                arrayList2 = new ArrayList(readInt6);
                i2 = readInt2;
                int i6 = 0;
                while (i6 != readInt6) {
                    i6 = bo.b(VideoRelatedAudioDto.class, parcel, arrayList2, i6, 1);
                    readInt6 = readInt6;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = arrayList2;
                arrayList3 = null;
            } else {
                int readInt7 = parcel.readInt();
                arrayList3 = new ArrayList(readInt7);
                arrayList4 = arrayList2;
                int i7 = 0;
                while (i7 != readInt7) {
                    i7 = bo.b(VideoRelatedAudioDto.class, parcel, arrayList3, i7, 1);
                    readInt7 = readInt7;
                }
            }
            String str3 = str;
            Boolean bool3 = valueOf7;
            Integer num3 = valueOf19;
            String readString7 = parcel.readString();
            Integer valueOf21 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Boolean bool4 = valueOf6;
            AudioRestrictionDto audioRestrictionDto3 = audioRestrictionDto;
            String readString8 = parcel.readString();
            PodcastInfoDto podcastInfoDto = (PodcastInfoDto) parcel.readParcelable(VideoRelatedAudioDto.class.getClassLoader());
            ArrayList arrayList6 = arrayList3;
            AudioChartInfoDto audioChartInfoDto = (AudioChartInfoDto) parcel.readParcelable(VideoRelatedAudioDto.class.getClassLoader());
            boolean z = false;
            Integer num4 = num2;
            int i8 = i2;
            int i9 = i;
            Object obj2 = obj;
            ArrayList arrayList7 = arrayList4;
            String readString9 = parcel.readString();
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
            if (parcel.readInt() == 0) {
                str2 = str3;
                i3 = i9;
                i4 = i8;
                arrayList5 = null;
            } else {
                str2 = str3;
                int readInt8 = parcel.readInt();
                i3 = i9;
                arrayList5 = new ArrayList(readInt8);
                i4 = i8;
                int i10 = 0;
                while (i10 != readInt8) {
                    int i11 = readInt8;
                    int readInt9 = parcel.readInt();
                    int i12 = i10;
                    ArrayList arrayList8 = new ArrayList(readInt9);
                    String str4 = readString2;
                    int i13 = 0;
                    while (i13 != readInt9) {
                        arrayList8.add(Float.valueOf(parcel.readFloat()));
                        i13++;
                        readInt9 = readInt9;
                    }
                    arrayList5.add(arrayList8);
                    i10 = i12 + 1;
                    readInt8 = i11;
                    readString2 = str4;
                }
            }
            String str5 = readString2;
            AudioVoiceAssistantDto audioVoiceAssistantDto = (AudioVoiceAssistantDto) parcel.readParcelable(VideoRelatedAudioDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf14 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                valueOf14 = Boolean.valueOf(z);
            }
            return new VideoRelatedAudioDto(str2, i3, i4, str5, readInt3, userId, readString3, readInt4, bool, audioAudioPreviewUrlDto, valueOf15, readString4, audioAdsDto, bool2, valueOf3, valueOf4, readString5, readString6, arrayList, num, num4, valueOf18, valueOf5, bool4, bool3, genreIdDto, baseBoolIntDto, audioAudioAlbumDto, num3, valueOf20, obj2, mstcpTypeDto, trackGenreIdDto, readValue2, audioRestrictionDto3, arrayList7, arrayList6, readString7, valueOf21, readString8, podcastInfoDto, audioChartInfoDto, readString9, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, arrayList5, audioVoiceAssistantDto, valueOf14, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), (AudioPhotoDto) parcel.readParcelable(VideoRelatedAudioDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (AudioAudioMetaDto) parcel.readParcelable(VideoRelatedAudioDto.class.getClassLoader()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (AudioLoudnessDto) parcel.readParcelable(VideoRelatedAudioDto.class.getClassLoader()), (AudioAudioPermissionsDto) parcel.readParcelable(VideoRelatedAudioDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoRelatedAudioDto[] newArray(int i) {
            return new VideoRelatedAudioDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoRelatedAudioDto(String str, int i, int i2, String str2, int i3, UserId userId, String str3, int i4, Boolean bool, AudioAudioPreviewUrlDto audioAudioPreviewUrlDto, Integer num, String str4, AudioAdsDto audioAdsDto, Boolean bool2, Boolean bool3, Boolean bool4, String str5, String str6, List<AudioStreamDto> list, Integer num2, Integer num3, Integer num4, Boolean bool5, Boolean bool6, Boolean bool7, GenreIdDto genreIdDto, BaseBoolIntDto baseBoolIntDto, AudioAudioAlbumDto audioAudioAlbumDto, Integer num5, Integer num6, Object obj, MstcpTypeDto mstcpTypeDto, TrackGenreIdDto trackGenreIdDto, Object obj2, AudioRestrictionDto audioRestrictionDto, List<AudioArtistDto> list2, List<AudioArtistDto> list3, String str7, Integer num7, String str8, PodcastInfoDto podcastInfoDto, AudioChartInfoDto audioChartInfoDto, String str9, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, List<? extends List<Float>> list4, AudioVoiceAssistantDto audioVoiceAssistantDto, Boolean bool14, Integer num8, String str10, List<String> list5, String str11, AudioPhotoDto audioPhotoDto, Long l, AudioAudioMetaDto audioAudioMetaDto, Integer num9, AudioLoudnessDto audioLoudnessDto, AudioAudioPermissionsDto audioAudioPermissionsDto) {
        this.qrUrl = str;
        this.start = i;
        this.end = i2;
        this.artist = str2;
        this.id = i3;
        this.ownerId = userId;
        this.title = str3;
        this.duration = i4;
        this.likedFromVideo = bool;
        this.previewUrl = audioAudioPreviewUrlDto;
        this.legalNoticesType = num;
        this.accessKey = str4;
        this.ads = audioAdsDto;
        this.isExplicit = bool2;
        this.isFocusTrack = bool3;
        this.isLicensed = bool4;
        this.trackCode = str5;
        this.url = str6;
        this.audioStreams = list;
        this.streamDuration = num2;
        this.date = num3;
        this.albumId = num4;
        this.hasLyrics = bool5;
        this.dislike = bool6;
        this.like = bool7;
        this.genreId = genreIdDto;
        this.noSearch = baseBoolIntDto;
        this.album = audioAudioAlbumDto;
        this.releaseId = num5;
        this.trackId = num6;
        this.regionRestrictions = obj;
        this.mstcpType = mstcpTypeDto;
        this.trackGenreId = trackGenreIdDto;
        this.itunesPreview = obj2;
        this.contentRestricted = audioRestrictionDto;
        this.mainArtists = list2;
        this.featuredArtists = list3;
        this.subtitle = str7;
        this.albumPartNumber = num7;
        this.performer = str8;
        this.podcastInfo = podcastInfoDto;
        this.audioChartInfo = audioChartInfoDto;
        this.originalSoundVideoId = str9;
        this.shortVideosAllowed = bool8;
        this.storiesAllowed = bool9;
        this.storiesCoverAllowed = bool10;
        this.inClipsFavoriteAllowed = bool11;
        this.inClipsFavorite = bool12;
        this.dmcaBlocked = bool13;
        this.kwsSkip = list4;
        this.audioVoiceAssistant = audioVoiceAssistantDto;
        this.isOfficial = bool14;
        this.specialProjectId = num8;
        this.releaseAudioId = str10;
        this.rightholderMarks = list5;
        this.mainColor = str11;
        this.thumb = audioPhotoDto;
        this.fileSize = l;
        this.meta = audioAudioMetaDto;
        this.flagsContext = num9;
        this.audioLoudness = audioLoudnessDto;
        this.permissions = audioAudioPermissionsDto;
    }

    public final String d() {
        return this.accessKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.artist;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoRelatedAudioDto)) {
            return false;
        }
        VideoRelatedAudioDto videoRelatedAudioDto = (VideoRelatedAudioDto) obj;
        return epx.f(this.qrUrl, videoRelatedAudioDto.qrUrl) && this.start == videoRelatedAudioDto.start && this.end == videoRelatedAudioDto.end && epx.f(this.artist, videoRelatedAudioDto.artist) && this.id == videoRelatedAudioDto.id && epx.f(this.ownerId, videoRelatedAudioDto.ownerId) && epx.f(this.title, videoRelatedAudioDto.title) && this.duration == videoRelatedAudioDto.duration && epx.f(this.likedFromVideo, videoRelatedAudioDto.likedFromVideo) && epx.f(this.previewUrl, videoRelatedAudioDto.previewUrl) && epx.f(this.legalNoticesType, videoRelatedAudioDto.legalNoticesType) && epx.f(this.accessKey, videoRelatedAudioDto.accessKey) && epx.f(this.ads, videoRelatedAudioDto.ads) && epx.f(this.isExplicit, videoRelatedAudioDto.isExplicit) && epx.f(this.isFocusTrack, videoRelatedAudioDto.isFocusTrack) && epx.f(this.isLicensed, videoRelatedAudioDto.isLicensed) && epx.f(this.trackCode, videoRelatedAudioDto.trackCode) && epx.f(this.url, videoRelatedAudioDto.url) && epx.f(this.audioStreams, videoRelatedAudioDto.audioStreams) && epx.f(this.streamDuration, videoRelatedAudioDto.streamDuration) && epx.f(this.date, videoRelatedAudioDto.date) && epx.f(this.albumId, videoRelatedAudioDto.albumId) && epx.f(this.hasLyrics, videoRelatedAudioDto.hasLyrics) && epx.f(this.dislike, videoRelatedAudioDto.dislike) && epx.f(this.like, videoRelatedAudioDto.like) && this.genreId == videoRelatedAudioDto.genreId && this.noSearch == videoRelatedAudioDto.noSearch && epx.f(this.album, videoRelatedAudioDto.album) && epx.f(this.releaseId, videoRelatedAudioDto.releaseId) && epx.f(this.trackId, videoRelatedAudioDto.trackId) && epx.f(this.regionRestrictions, videoRelatedAudioDto.regionRestrictions) && this.mstcpType == videoRelatedAudioDto.mstcpType && this.trackGenreId == videoRelatedAudioDto.trackGenreId && epx.f(this.itunesPreview, videoRelatedAudioDto.itunesPreview) && this.contentRestricted == videoRelatedAudioDto.contentRestricted && epx.f(this.mainArtists, videoRelatedAudioDto.mainArtists) && epx.f(this.featuredArtists, videoRelatedAudioDto.featuredArtists) && epx.f(this.subtitle, videoRelatedAudioDto.subtitle) && epx.f(this.albumPartNumber, videoRelatedAudioDto.albumPartNumber) && epx.f(this.performer, videoRelatedAudioDto.performer) && epx.f(this.podcastInfo, videoRelatedAudioDto.podcastInfo) && epx.f(this.audioChartInfo, videoRelatedAudioDto.audioChartInfo) && epx.f(this.originalSoundVideoId, videoRelatedAudioDto.originalSoundVideoId) && epx.f(this.shortVideosAllowed, videoRelatedAudioDto.shortVideosAllowed) && epx.f(this.storiesAllowed, videoRelatedAudioDto.storiesAllowed) && epx.f(this.storiesCoverAllowed, videoRelatedAudioDto.storiesCoverAllowed) && epx.f(this.inClipsFavoriteAllowed, videoRelatedAudioDto.inClipsFavoriteAllowed) && epx.f(this.inClipsFavorite, videoRelatedAudioDto.inClipsFavorite) && epx.f(this.dmcaBlocked, videoRelatedAudioDto.dmcaBlocked) && epx.f(this.kwsSkip, videoRelatedAudioDto.kwsSkip) && epx.f(this.audioVoiceAssistant, videoRelatedAudioDto.audioVoiceAssistant) && epx.f(this.isOfficial, videoRelatedAudioDto.isOfficial) && epx.f(this.specialProjectId, videoRelatedAudioDto.specialProjectId) && epx.f(this.releaseAudioId, videoRelatedAudioDto.releaseAudioId) && epx.f(this.rightholderMarks, videoRelatedAudioDto.rightholderMarks) && epx.f(this.mainColor, videoRelatedAudioDto.mainColor) && epx.f(this.thumb, videoRelatedAudioDto.thumb) && epx.f(this.fileSize, videoRelatedAudioDto.fileSize) && epx.f(this.meta, videoRelatedAudioDto.meta) && epx.f(this.flagsContext, videoRelatedAudioDto.flagsContext) && epx.f(this.audioLoudness, videoRelatedAudioDto.audioLoudness) && epx.f(this.permissions, videoRelatedAudioDto.permissions);
    }

    public final AudioRestrictionDto f() {
        return this.contentRestricted;
    }

    public final Boolean g() {
        return this.likedFromVideo;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = shy.a(this.duration, urd0.a(bh10.a(shy.a(this.id, urd0.a(shy.a(this.end, shy.a(this.start, this.qrUrl.hashCode() * 31, 31), 31), 31, this.artist), 31), 31, this.ownerId.b), 31, this.title), 31);
        Boolean bool = this.likedFromVideo;
        int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        AudioAudioPreviewUrlDto audioAudioPreviewUrlDto = this.previewUrl;
        int hashCode2 = (hashCode + (audioAudioPreviewUrlDto == null ? 0 : audioAudioPreviewUrlDto.hashCode())) * 31;
        Integer num = this.legalNoticesType;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.accessKey;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        AudioAdsDto audioAdsDto = this.ads;
        int hashCode5 = (hashCode4 + (audioAdsDto == null ? 0 : audioAdsDto.hashCode())) * 31;
        Boolean bool2 = this.isExplicit;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isFocusTrack;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isLicensed;
        int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.trackCode;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<AudioStreamDto> list = this.audioStreams;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.streamDuration;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.date;
        int hashCode13 = (hashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.albumId;
        int hashCode14 = (hashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool5 = this.hasLyrics;
        int hashCode15 = (hashCode14 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.dislike;
        int hashCode16 = (hashCode15 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.like;
        int hashCode17 = (hashCode16 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        GenreIdDto genreIdDto = this.genreId;
        int hashCode18 = (hashCode17 + (genreIdDto == null ? 0 : genreIdDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.noSearch;
        int hashCode19 = (hashCode18 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        AudioAudioAlbumDto audioAudioAlbumDto = this.album;
        int hashCode20 = (hashCode19 + (audioAudioAlbumDto == null ? 0 : audioAudioAlbumDto.hashCode())) * 31;
        Integer num5 = this.releaseId;
        int hashCode21 = (hashCode20 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.trackId;
        int hashCode22 = (hashCode21 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Object obj = this.regionRestrictions;
        int hashCode23 = (hashCode22 + (obj == null ? 0 : obj.hashCode())) * 31;
        MstcpTypeDto mstcpTypeDto = this.mstcpType;
        int hashCode24 = (hashCode23 + (mstcpTypeDto == null ? 0 : mstcpTypeDto.hashCode())) * 31;
        TrackGenreIdDto trackGenreIdDto = this.trackGenreId;
        int hashCode25 = (hashCode24 + (trackGenreIdDto == null ? 0 : trackGenreIdDto.hashCode())) * 31;
        Object obj2 = this.itunesPreview;
        int hashCode26 = (hashCode25 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        AudioRestrictionDto audioRestrictionDto = this.contentRestricted;
        int hashCode27 = (hashCode26 + (audioRestrictionDto == null ? 0 : audioRestrictionDto.hashCode())) * 31;
        List<AudioArtistDto> list2 = this.mainArtists;
        int hashCode28 = (hashCode27 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<AudioArtistDto> list3 = this.featuredArtists;
        int hashCode29 = (hashCode28 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str4 = this.subtitle;
        int hashCode30 = (hashCode29 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num7 = this.albumPartNumber;
        int hashCode31 = (hashCode30 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str5 = this.performer;
        int hashCode32 = (hashCode31 + (str5 == null ? 0 : str5.hashCode())) * 31;
        PodcastInfoDto podcastInfoDto = this.podcastInfo;
        int hashCode33 = (hashCode32 + (podcastInfoDto == null ? 0 : podcastInfoDto.hashCode())) * 31;
        AudioChartInfoDto audioChartInfoDto = this.audioChartInfo;
        int hashCode34 = (hashCode33 + (audioChartInfoDto == null ? 0 : audioChartInfoDto.hashCode())) * 31;
        String str6 = this.originalSoundVideoId;
        int hashCode35 = (hashCode34 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool8 = this.shortVideosAllowed;
        int hashCode36 = (hashCode35 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.storiesAllowed;
        int hashCode37 = (hashCode36 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.storiesCoverAllowed;
        int hashCode38 = (hashCode37 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.inClipsFavoriteAllowed;
        int hashCode39 = (hashCode38 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.inClipsFavorite;
        int hashCode40 = (hashCode39 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.dmcaBlocked;
        int hashCode41 = (hashCode40 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        List<List<Float>> list4 = this.kwsSkip;
        int hashCode42 = (hashCode41 + (list4 == null ? 0 : list4.hashCode())) * 31;
        AudioVoiceAssistantDto audioVoiceAssistantDto = this.audioVoiceAssistant;
        int hashCode43 = (hashCode42 + (audioVoiceAssistantDto == null ? 0 : audioVoiceAssistantDto.hashCode())) * 31;
        Boolean bool14 = this.isOfficial;
        int hashCode44 = (hashCode43 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Integer num8 = this.specialProjectId;
        int hashCode45 = (hashCode44 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str7 = this.releaseAudioId;
        int hashCode46 = (hashCode45 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<String> list5 = this.rightholderMarks;
        int hashCode47 = (hashCode46 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str8 = this.mainColor;
        int hashCode48 = (hashCode47 + (str8 == null ? 0 : str8.hashCode())) * 31;
        AudioPhotoDto audioPhotoDto = this.thumb;
        int hashCode49 = (hashCode48 + (audioPhotoDto == null ? 0 : audioPhotoDto.hashCode())) * 31;
        Long l = this.fileSize;
        int hashCode50 = (hashCode49 + (l == null ? 0 : l.hashCode())) * 31;
        AudioAudioMetaDto audioAudioMetaDto = this.meta;
        int hashCode51 = (hashCode50 + (audioAudioMetaDto == null ? 0 : audioAudioMetaDto.hashCode())) * 31;
        Integer num9 = this.flagsContext;
        int hashCode52 = (hashCode51 + (num9 == null ? 0 : num9.hashCode())) * 31;
        AudioLoudnessDto audioLoudnessDto = this.audioLoudness;
        int hashCode53 = (hashCode52 + (audioLoudnessDto == null ? 0 : audioLoudnessDto.hashCode())) * 31;
        AudioAudioPermissionsDto audioAudioPermissionsDto = this.permissions;
        return hashCode53 + (audioAudioPermissionsDto != null ? audioAudioPermissionsDto.hashCode() : 0);
    }

    public final String i() {
        return this.subtitle;
    }

    public final AudioPhotoDto j() {
        return this.thumb;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        return "VideoRelatedAudioDto(qrUrl=" + this.qrUrl + ", start=" + this.start + ", end=" + this.end + ", artist=" + this.artist + ", id=" + this.id + ", ownerId=" + this.ownerId + ", title=" + this.title + ", duration=" + this.duration + ", likedFromVideo=" + this.likedFromVideo + ", previewUrl=" + this.previewUrl + ", legalNoticesType=" + this.legalNoticesType + ", accessKey=" + this.accessKey + ", ads=" + this.ads + ", isExplicit=" + this.isExplicit + ", isFocusTrack=" + this.isFocusTrack + ", isLicensed=" + this.isLicensed + ", trackCode=" + this.trackCode + ", url=" + this.url + ", audioStreams=" + this.audioStreams + ", streamDuration=" + this.streamDuration + ", date=" + this.date + ", albumId=" + this.albumId + ", hasLyrics=" + this.hasLyrics + ", dislike=" + this.dislike + ", like=" + this.like + ", genreId=" + this.genreId + ", noSearch=" + this.noSearch + ", album=" + this.album + ", releaseId=" + this.releaseId + ", trackId=" + this.trackId + ", regionRestrictions=" + this.regionRestrictions + ", mstcpType=" + this.mstcpType + ", trackGenreId=" + this.trackGenreId + ", itunesPreview=" + this.itunesPreview + ", contentRestricted=" + this.contentRestricted + ", mainArtists=" + this.mainArtists + ", featuredArtists=" + this.featuredArtists + ", subtitle=" + this.subtitle + ", albumPartNumber=" + this.albumPartNumber + ", performer=" + this.performer + ", podcastInfo=" + this.podcastInfo + ", audioChartInfo=" + this.audioChartInfo + ", originalSoundVideoId=" + this.originalSoundVideoId + ", shortVideosAllowed=" + this.shortVideosAllowed + ", storiesAllowed=" + this.storiesAllowed + ", storiesCoverAllowed=" + this.storiesCoverAllowed + ", inClipsFavoriteAllowed=" + this.inClipsFavoriteAllowed + ", inClipsFavorite=" + this.inClipsFavorite + ", dmcaBlocked=" + this.dmcaBlocked + ", kwsSkip=" + this.kwsSkip + ", audioVoiceAssistant=" + this.audioVoiceAssistant + ", isOfficial=" + this.isOfficial + ", specialProjectId=" + this.specialProjectId + ", releaseAudioId=" + this.releaseAudioId + ", rightholderMarks=" + this.rightholderMarks + ", mainColor=" + this.mainColor + ", thumb=" + this.thumb + ", fileSize=" + this.fileSize + ", meta=" + this.meta + ", flagsContext=" + this.flagsContext + ", audioLoudness=" + this.audioLoudness + ", permissions=" + this.permissions + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.qrUrl);
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
        parcel.writeString(this.artist);
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.title);
        parcel.writeInt(this.duration);
        Boolean bool = this.likedFromVideo;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeParcelable(this.previewUrl, i);
        Integer num = this.legalNoticesType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.accessKey);
        parcel.writeParcelable(this.ads, i);
        Boolean bool2 = this.isExplicit;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isFocusTrack;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.isLicensed;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        parcel.writeString(this.trackCode);
        parcel.writeString(this.url);
        List<AudioStreamDto> list = this.audioStreams;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Integer num2 = this.streamDuration;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.date;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.albumId;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Boolean bool5 = this.hasLyrics;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.dislike;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        Boolean bool7 = this.like;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        GenreIdDto genreIdDto = this.genreId;
        if (genreIdDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            genreIdDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.noSearch, i);
        parcel.writeParcelable(this.album, i);
        Integer num5 = this.releaseId;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Integer num6 = this.trackId;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        parcel.writeValue(this.regionRestrictions);
        MstcpTypeDto mstcpTypeDto = this.mstcpType;
        if (mstcpTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mstcpTypeDto.writeToParcel(parcel, i);
        }
        TrackGenreIdDto trackGenreIdDto = this.trackGenreId;
        if (trackGenreIdDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            trackGenreIdDto.writeToParcel(parcel, i);
        }
        parcel.writeValue(this.itunesPreview);
        parcel.writeParcelable(this.contentRestricted, i);
        List<AudioArtistDto> list2 = this.mainArtists;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<AudioArtistDto> list3 = this.featuredArtists;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        parcel.writeString(this.subtitle);
        Integer num7 = this.albumPartNumber;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        parcel.writeString(this.performer);
        parcel.writeParcelable(this.podcastInfo, i);
        parcel.writeParcelable(this.audioChartInfo, i);
        parcel.writeString(this.originalSoundVideoId);
        Boolean bool8 = this.shortVideosAllowed;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        Boolean bool9 = this.storiesAllowed;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool9);
        }
        Boolean bool10 = this.storiesCoverAllowed;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool10);
        }
        Boolean bool11 = this.inClipsFavoriteAllowed;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool11);
        }
        Boolean bool12 = this.inClipsFavorite;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool12);
        }
        Boolean bool13 = this.dmcaBlocked;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool13);
        }
        List<List<Float>> list4 = this.kwsSkip;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                Iterator a2 = ao.a(parcel, (List) f4.next());
                while (a2.hasNext()) {
                    parcel.writeFloat(((Number) a2.next()).floatValue());
                }
            }
        }
        parcel.writeParcelable(this.audioVoiceAssistant, i);
        Boolean bool14 = this.isOfficial;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool14);
        }
        Integer num8 = this.specialProjectId;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        parcel.writeString(this.releaseAudioId);
        parcel.writeStringList(this.rightholderMarks);
        parcel.writeString(this.mainColor);
        parcel.writeParcelable(this.thumb, i);
        Long l = this.fileSize;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            io.reactivex.rxjava3.subjects.b.f(parcel, 1, l);
        }
        parcel.writeParcelable(this.meta, i);
        Integer num9 = this.flagsContext;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num9);
        }
        parcel.writeParcelable(this.audioLoudness, i);
        parcel.writeParcelable(this.permissions, i);
    }

    public /* synthetic */ VideoRelatedAudioDto(String str, int i, int i2, String str2, int i3, UserId userId, String str3, int i4, Boolean bool, AudioAudioPreviewUrlDto audioAudioPreviewUrlDto, Integer num, String str4, AudioAdsDto audioAdsDto, Boolean bool2, Boolean bool3, Boolean bool4, String str5, String str6, List list, Integer num2, Integer num3, Integer num4, Boolean bool5, Boolean bool6, Boolean bool7, GenreIdDto genreIdDto, BaseBoolIntDto baseBoolIntDto, AudioAudioAlbumDto audioAudioAlbumDto, Integer num5, Integer num6, Object obj, MstcpTypeDto mstcpTypeDto, TrackGenreIdDto trackGenreIdDto, Object obj2, AudioRestrictionDto audioRestrictionDto, List list2, List list3, String str7, Integer num7, String str8, PodcastInfoDto podcastInfoDto, AudioChartInfoDto audioChartInfoDto, String str9, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, List list4, AudioVoiceAssistantDto audioVoiceAssistantDto, Boolean bool14, Integer num8, String str10, List list5, String str11, AudioPhotoDto audioPhotoDto, Long l, AudioAudioMetaDto audioAudioMetaDto, Integer num9, AudioLoudnessDto audioLoudnessDto, AudioAudioPermissionsDto audioAudioPermissionsDto, int i5, int i6, zcl zclVar) {
        this(str, i, i2, str2, i3, userId, str3, i4, (i5 & 256) != 0 ? null : bool, (i5 & 512) != 0 ? null : audioAudioPreviewUrlDto, (i5 & 1024) != 0 ? null : num, (i5 & 2048) != 0 ? null : str4, (i5 & 4096) != 0 ? null : audioAdsDto, (i5 & 8192) != 0 ? null : bool2, (i5 & 16384) != 0 ? null : bool3, (i5 & 32768) != 0 ? null : bool4, (i5 & 65536) != 0 ? null : str5, (i5 & 131072) != 0 ? null : str6, (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list, (i5 & 524288) != 0 ? null : num2, (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num3, (i5 & 2097152) != 0 ? null : num4, (i5 & 4194304) != 0 ? null : bool5, (i5 & 8388608) != 0 ? null : bool6, (i5 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : bool7, (i5 & 33554432) != 0 ? null : genreIdDto, (i5 & 67108864) != 0 ? null : baseBoolIntDto, (i5 & 134217728) != 0 ? null : audioAudioAlbumDto, (i5 & 268435456) != 0 ? null : num5, (i5 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : num6, (i5 & 1073741824) != 0 ? null : obj, (i5 & Integer.MIN_VALUE) != 0 ? null : mstcpTypeDto, (i6 & 1) != 0 ? null : trackGenreIdDto, (i6 & 2) != 0 ? null : obj2, (i6 & 4) != 0 ? null : audioRestrictionDto, (i6 & 8) != 0 ? null : list2, (i6 & 16) != 0 ? null : list3, (i6 & 32) != 0 ? null : str7, (i6 & 64) != 0 ? null : num7, (i6 & 128) != 0 ? null : str8, (i6 & 256) != 0 ? null : podcastInfoDto, (i6 & 512) != 0 ? null : audioChartInfoDto, (i6 & 1024) != 0 ? null : str9, (i6 & 2048) != 0 ? null : bool8, (i6 & 4096) != 0 ? null : bool9, (i6 & 8192) != 0 ? null : bool10, (i6 & 16384) != 0 ? null : bool11, (i6 & 32768) != 0 ? null : bool12, (i6 & 65536) != 0 ? null : bool13, (i6 & 131072) != 0 ? null : list4, (i6 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : audioVoiceAssistantDto, (i6 & 524288) != 0 ? null : bool14, (i6 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : num8, (i6 & 2097152) != 0 ? null : str10, (i6 & 4194304) != 0 ? null : list5, (i6 & 8388608) != 0 ? null : str11, (i6 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : audioPhotoDto, (i6 & 33554432) != 0 ? null : l, (i6 & 67108864) != 0 ? null : audioAudioMetaDto, (i6 & 134217728) != 0 ? null : num9, (i6 & 268435456) != 0 ? null : audioLoudnessDto, (i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : audioAudioPermissionsDto);
    }
}
