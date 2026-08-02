package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.b;
import com.vk.api.generated.audio.dto.AudioAdsDto;
import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.audio.dto.AudioAudioAlbumDto;
import com.vk.api.generated.audio.dto.AudioChartInfoDto;
import com.vk.api.generated.audio.dto.AudioRestrictionDto;
import com.vk.api.generated.audio.dto.AudioVoiceAssistantDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.podcast.dto.PodcastInfoDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.bh10;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ShortVideoAudioDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoAudioDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoAudioDto> CREATOR = new a();

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

    @pmi0("audio_voice_assistant")
    private final AudioVoiceAssistantDto audioVoiceAssistant;

    @pmi0("can_download_short_video")
    private final Boolean canDownloadShortVideo;

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

    @pmi0("featured_artists")
    private final List<AudioArtistDto> featuredArtists;

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

    @pmi0("main_artists")
    private final List<AudioArtistDto> mainArtists;

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

    @pmi0("podcast_info")
    private final PodcastInfoDto podcastInfo;

    @pmi0("region_restrictions")
    private final Object regionRestrictions;

    @pmi0("release_id")
    private final Integer releaseId;

    @pmi0("short_videos_allowed")
    private final Boolean shortVideosAllowed;

    @pmi0("special_project_id")
    private final Integer specialProjectId;

    @pmi0("start_point")
    private final Integer startPoint;

    @pmi0("stories_allowed")
    private final Boolean storiesAllowed;

    @pmi0("stories_cover_allowed")
    private final Boolean storiesCoverAllowed;

    @pmi0("stream_duration")
    private final Integer streamDuration;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("track_genre_id")
    private final TrackGenreIdDto trackGenreId;

    @pmi0("track_id")
    private final Integer trackId;

    @pmi0("trending")
    private final Boolean trending;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShortVideoAudioDto.kt */
    public static final class GenreIdDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ GenreIdDto[] $VALUES;

        @pmi0("14")
        public static final GenreIdDto ACOUSTIC_AND_VOCAL;

        @pmi0("21")
        public static final GenreIdDto ALTERNATIVE;

        @pmi0("12")
        public static final GenreIdDto CHANSON;

        @pmi0("16")
        public static final GenreIdDto CLASSICAL;
        public static final Parcelable.Creator<GenreIdDto> CREATOR;

        @pmi0("10")
        public static final GenreIdDto DRUM_AND_BASS;

        @pmi0("8")
        public static final GenreIdDto DUBSTEP;

        @pmi0("4")
        public static final GenreIdDto EASY_LISTENING;

        @pmi0("22")
        public static final GenreIdDto ELECTROPOP_AND_DISCO;

        @pmi0("13")
        public static final GenreIdDto ETHNIC;

        @pmi0(CampaignEx.CLICKMODE_ON)
        public static final GenreIdDto HOUSE_AND_DANCE;

        @pmi0("17")
        public static final GenreIdDto INDIE_POP;

        @pmi0("6")
        public static final GenreIdDto INSTRUMENTAL;

        @pmi0("1001")
        public static final GenreIdDto JAZZ_AND_BLUES;

        @pmi0(Gc.e)
        public static final GenreIdDto METAL;

        @pmi0("18")
        public static final GenreIdDto OTHER;

        @pmi0("2")
        public static final GenreIdDto POP;

        @pmi0("3")
        public static final GenreIdDto RAP_AND_HIP_HOP;

        @pmi0("15")
        public static final GenreIdDto REGGAE;

        @pmi0("1")
        public static final GenreIdDto ROCK;

        @pmi0("19")
        public static final GenreIdDto SPEECH;

        @pmi0("11")
        public static final GenreIdDto TRANCE;
        private final int value;

        /* compiled from: ShortVideoAudioDto.kt */
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
            GenreIdDto genreIdDto = new GenreIdDto("ROCK", 0, 1);
            ROCK = genreIdDto;
            GenreIdDto genreIdDto2 = new GenreIdDto("POP", 1, 2);
            POP = genreIdDto2;
            GenreIdDto genreIdDto3 = new GenreIdDto("RAP_AND_HIP_HOP", 2, 3);
            RAP_AND_HIP_HOP = genreIdDto3;
            GenreIdDto genreIdDto4 = new GenreIdDto("EASY_LISTENING", 3, 4);
            EASY_LISTENING = genreIdDto4;
            GenreIdDto genreIdDto5 = new GenreIdDto("HOUSE_AND_DANCE", 4, 5);
            HOUSE_AND_DANCE = genreIdDto5;
            GenreIdDto genreIdDto6 = new GenreIdDto("INSTRUMENTAL", 5, 6);
            INSTRUMENTAL = genreIdDto6;
            GenreIdDto genreIdDto7 = new GenreIdDto("METAL", 6, 7);
            METAL = genreIdDto7;
            GenreIdDto genreIdDto8 = new GenreIdDto("ALTERNATIVE", 7, 21);
            ALTERNATIVE = genreIdDto8;
            GenreIdDto genreIdDto9 = new GenreIdDto("DUBSTEP", 8, 8);
            DUBSTEP = genreIdDto9;
            GenreIdDto genreIdDto10 = new GenreIdDto("JAZZ_AND_BLUES", 9, 1001);
            JAZZ_AND_BLUES = genreIdDto10;
            GenreIdDto genreIdDto11 = new GenreIdDto("DRUM_AND_BASS", 10, 10);
            DRUM_AND_BASS = genreIdDto11;
            GenreIdDto genreIdDto12 = new GenreIdDto("TRANCE", 11, 11);
            TRANCE = genreIdDto12;
            GenreIdDto genreIdDto13 = new GenreIdDto("CHANSON", 12, 12);
            CHANSON = genreIdDto13;
            GenreIdDto genreIdDto14 = new GenreIdDto("ETHNIC", 13, 13);
            ETHNIC = genreIdDto14;
            GenreIdDto genreIdDto15 = new GenreIdDto("ACOUSTIC_AND_VOCAL", 14, 14);
            ACOUSTIC_AND_VOCAL = genreIdDto15;
            GenreIdDto genreIdDto16 = new GenreIdDto("REGGAE", 15, 15);
            REGGAE = genreIdDto16;
            GenreIdDto genreIdDto17 = new GenreIdDto("CLASSICAL", 16, 16);
            CLASSICAL = genreIdDto17;
            GenreIdDto genreIdDto18 = new GenreIdDto("INDIE_POP", 17, 17);
            INDIE_POP = genreIdDto18;
            GenreIdDto genreIdDto19 = new GenreIdDto("SPEECH", 18, 19);
            SPEECH = genreIdDto19;
            GenreIdDto genreIdDto20 = new GenreIdDto("ELECTROPOP_AND_DISCO", 19, 22);
            ELECTROPOP_AND_DISCO = genreIdDto20;
            GenreIdDto genreIdDto21 = new GenreIdDto(NativeAdContent.ViewTag.OTHER, 20, 18);
            OTHER = genreIdDto21;
            GenreIdDto[] genreIdDtoArr = {genreIdDto, genreIdDto2, genreIdDto3, genreIdDto4, genreIdDto5, genreIdDto6, genreIdDto7, genreIdDto8, genreIdDto9, genreIdDto10, genreIdDto11, genreIdDto12, genreIdDto13, genreIdDto14, genreIdDto15, genreIdDto16, genreIdDto17, genreIdDto18, genreIdDto19, genreIdDto20, genreIdDto21};
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
    /* compiled from: ShortVideoAudioDto.kt */
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

        /* compiled from: ShortVideoAudioDto.kt */
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
    /* compiled from: ShortVideoAudioDto.kt */
    public static final class TrackGenreIdDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TrackGenreIdDto[] $VALUES;

        @pmi0("14")
        public static final TrackGenreIdDto ACOUSTIC_AND_VOCAL;

        @pmi0("21")
        public static final TrackGenreIdDto ALTERNATIVE;

        @pmi0("16")
        public static final TrackGenreIdDto CLASSICAL;
        public static final Parcelable.Creator<TrackGenreIdDto> CREATOR;

        @pmi0("10")
        public static final TrackGenreIdDto DRUM_AND_BASS;

        @pmi0("8")
        public static final TrackGenreIdDto DUBSTEP_AND_TRAP;

        @pmi0("4")
        public static final TrackGenreIdDto EASY_LISTENING;

        @pmi0("22")
        public static final TrackGenreIdDto ELECTROPOP_AND_DISCO;

        @pmi0("13")
        public static final TrackGenreIdDto ETHNIC;

        @pmi0(CampaignEx.CLICKMODE_ON)
        public static final TrackGenreIdDto HOUSE_AND_DANCE;

        @pmi0("17")
        public static final TrackGenreIdDto INDIE_POP;

        @pmi0("6")
        public static final TrackGenreIdDto INSTRUMENTAL;

        @pmi0("1001")
        public static final TrackGenreIdDto JAZZ_AND_BLUES;

        @pmi0(Gc.e)
        public static final TrackGenreIdDto METAL;

        @pmi0("2")
        public static final TrackGenreIdDto POP;

        @pmi0("3")
        public static final TrackGenreIdDto RAP_AND_HIP_HOP;

        @pmi0("15")
        public static final TrackGenreIdDto REGGAE;

        @pmi0("1")
        public static final TrackGenreIdDto ROCK;

        @pmi0("11")
        public static final TrackGenreIdDto TRANCE;
        private final int value;

        /* compiled from: ShortVideoAudioDto.kt */
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
            TrackGenreIdDto trackGenreIdDto = new TrackGenreIdDto("ROCK", 0, 1);
            ROCK = trackGenreIdDto;
            TrackGenreIdDto trackGenreIdDto2 = new TrackGenreIdDto("POP", 1, 2);
            POP = trackGenreIdDto2;
            TrackGenreIdDto trackGenreIdDto3 = new TrackGenreIdDto("RAP_AND_HIP_HOP", 2, 3);
            RAP_AND_HIP_HOP = trackGenreIdDto3;
            TrackGenreIdDto trackGenreIdDto4 = new TrackGenreIdDto("HOUSE_AND_DANCE", 3, 5);
            HOUSE_AND_DANCE = trackGenreIdDto4;
            TrackGenreIdDto trackGenreIdDto5 = new TrackGenreIdDto("INSTRUMENTAL", 4, 6);
            INSTRUMENTAL = trackGenreIdDto5;
            TrackGenreIdDto trackGenreIdDto6 = new TrackGenreIdDto("EASY_LISTENING", 5, 4);
            EASY_LISTENING = trackGenreIdDto6;
            TrackGenreIdDto trackGenreIdDto7 = new TrackGenreIdDto("METAL", 6, 7);
            METAL = trackGenreIdDto7;
            TrackGenreIdDto trackGenreIdDto8 = new TrackGenreIdDto("DUBSTEP_AND_TRAP", 7, 8);
            DUBSTEP_AND_TRAP = trackGenreIdDto8;
            TrackGenreIdDto trackGenreIdDto9 = new TrackGenreIdDto("DRUM_AND_BASS", 8, 10);
            DRUM_AND_BASS = trackGenreIdDto9;
            TrackGenreIdDto trackGenreIdDto10 = new TrackGenreIdDto("TRANCE", 9, 11);
            TRANCE = trackGenreIdDto10;
            TrackGenreIdDto trackGenreIdDto11 = new TrackGenreIdDto("ETHNIC", 10, 13);
            ETHNIC = trackGenreIdDto11;
            TrackGenreIdDto trackGenreIdDto12 = new TrackGenreIdDto("ACOUSTIC_AND_VOCAL", 11, 14);
            ACOUSTIC_AND_VOCAL = trackGenreIdDto12;
            TrackGenreIdDto trackGenreIdDto13 = new TrackGenreIdDto("REGGAE", 12, 15);
            REGGAE = trackGenreIdDto13;
            TrackGenreIdDto trackGenreIdDto14 = new TrackGenreIdDto("CLASSICAL", 13, 16);
            CLASSICAL = trackGenreIdDto14;
            TrackGenreIdDto trackGenreIdDto15 = new TrackGenreIdDto("INDIE_POP", 14, 17);
            INDIE_POP = trackGenreIdDto15;
            TrackGenreIdDto trackGenreIdDto16 = new TrackGenreIdDto("ALTERNATIVE", 15, 21);
            ALTERNATIVE = trackGenreIdDto16;
            TrackGenreIdDto trackGenreIdDto17 = new TrackGenreIdDto("ELECTROPOP_AND_DISCO", 16, 22);
            ELECTROPOP_AND_DISCO = trackGenreIdDto17;
            TrackGenreIdDto trackGenreIdDto18 = new TrackGenreIdDto("JAZZ_AND_BLUES", 17, 1001);
            JAZZ_AND_BLUES = trackGenreIdDto18;
            TrackGenreIdDto[] trackGenreIdDtoArr = {trackGenreIdDto, trackGenreIdDto2, trackGenreIdDto3, trackGenreIdDto4, trackGenreIdDto5, trackGenreIdDto6, trackGenreIdDto7, trackGenreIdDto8, trackGenreIdDto9, trackGenreIdDto10, trackGenreIdDto11, trackGenreIdDto12, trackGenreIdDto13, trackGenreIdDto14, trackGenreIdDto15, trackGenreIdDto16, trackGenreIdDto17, trackGenreIdDto18};
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

    /* compiled from: ShortVideoAudioDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoAudioDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoAudioDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            String str;
            AudioAudioAlbumDto createFromParcel;
            Object obj;
            MstcpTypeDto createFromParcel2;
            MstcpTypeDto mstcpTypeDto;
            TrackGenreIdDto createFromParcel3;
            TrackGenreIdDto trackGenreIdDto;
            AudioRestrictionDto createFromParcel4;
            AudioRestrictionDto audioRestrictionDto;
            int i;
            ArrayList arrayList;
            UserId userId;
            ArrayList arrayList2;
            ArrayList arrayList3;
            boolean z;
            TrackGenreIdDto trackGenreIdDto2;
            TrackGenreIdDto trackGenreIdDto3;
            PodcastInfoDto createFromParcel5;
            PodcastInfoDto podcastInfoDto;
            AudioChartInfoDto createFromParcel6;
            Boolean valueOf6;
            Boolean valueOf7;
            Boolean valueOf8;
            Boolean valueOf9;
            Boolean valueOf10;
            Boolean valueOf11;
            AudioChartInfoDto audioChartInfoDto;
            int i2;
            ArrayList arrayList4;
            ArrayList arrayList5;
            Boolean valueOf12;
            Boolean valueOf13;
            Boolean valueOf14;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            UserId userId2 = (UserId) parcel.readParcelable(ShortVideoAudioDto.class.getClassLoader());
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            Integer valueOf15 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            AudioAdsDto createFromParcel7 = parcel.readInt() == 0 ? null : AudioAdsDto.CREATOR.createFromParcel(parcel);
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
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            Integer valueOf16 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf17 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf18 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
            GenreIdDto createFromParcel8 = parcel.readInt() == 0 ? null : GenreIdDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto createFromParcel9 = parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                str = readString;
                createFromParcel = null;
            } else {
                str = readString;
                createFromParcel = AudioAudioAlbumDto.CREATOR.createFromParcel(parcel);
            }
            AudioAudioAlbumDto audioAudioAlbumDto = createFromParcel;
            Integer valueOf19 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf20 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Object readValue = parcel.readValue(ShortVideoAudioDto.class.getClassLoader());
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
            TrackGenreIdDto trackGenreIdDto4 = createFromParcel3;
            Object readValue2 = parcel.readValue(ShortVideoAudioDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                trackGenreIdDto = trackGenreIdDto4;
                createFromParcel4 = null;
            } else {
                trackGenreIdDto = trackGenreIdDto4;
                createFromParcel4 = AudioRestrictionDto.CREATOR.createFromParcel(parcel);
            }
            AudioRestrictionDto audioRestrictionDto2 = createFromParcel4;
            if (parcel.readInt() == 0) {
                audioRestrictionDto = audioRestrictionDto2;
                i = readInt;
                userId = userId2;
                arrayList = null;
            } else {
                audioRestrictionDto = audioRestrictionDto2;
                int readInt3 = parcel.readInt();
                i = readInt;
                arrayList = new ArrayList(readInt3);
                userId = userId2;
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = en.a(AudioArtistDto.CREATOR, parcel, arrayList, i3, 1);
                    readInt3 = readInt3;
                    readString2 = readString2;
                }
            }
            String str2 = readString2;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
                arrayList3 = arrayList;
                trackGenreIdDto2 = trackGenreIdDto;
                z = true;
            } else {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = en.a(AudioArtistDto.CREATOR, parcel, arrayList2, i4, 1);
                    readInt4 = readInt4;
                    arrayList = arrayList;
                }
                arrayList3 = arrayList;
                z = true;
                trackGenreIdDto2 = trackGenreIdDto;
            }
            String readString6 = parcel.readString();
            Integer valueOf21 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z2 = z;
            int i5 = i;
            String readString7 = parcel.readString();
            if (parcel.readInt() == 0) {
                trackGenreIdDto3 = trackGenreIdDto2;
                createFromParcel5 = null;
            } else {
                trackGenreIdDto3 = trackGenreIdDto2;
                createFromParcel5 = PodcastInfoDto.CREATOR.createFromParcel(parcel);
            }
            PodcastInfoDto podcastInfoDto2 = createFromParcel5;
            if (parcel.readInt() == 0) {
                podcastInfoDto = podcastInfoDto2;
                createFromParcel6 = null;
            } else {
                podcastInfoDto = podcastInfoDto2;
                createFromParcel6 = AudioChartInfoDto.CREATOR.createFromParcel(parcel);
            }
            AudioChartInfoDto audioChartInfoDto2 = createFromParcel6;
            boolean z3 = false;
            Integer num = valueOf18;
            Boolean bool = valueOf4;
            AudioRestrictionDto audioRestrictionDto3 = audioRestrictionDto;
            Integer num2 = valueOf21;
            String str3 = str2;
            String readString8 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0 ? z2 : false);
            }
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0 ? z2 : false);
            }
            if (parcel.readInt() == 0) {
                valueOf8 = null;
            } else {
                valueOf8 = Boolean.valueOf(parcel.readInt() != 0 ? z2 : false);
            }
            if (parcel.readInt() == 0) {
                valueOf9 = null;
            } else {
                valueOf9 = Boolean.valueOf(parcel.readInt() != 0 ? z2 : false);
            }
            if (parcel.readInt() == 0) {
                valueOf10 = null;
            } else {
                valueOf10 = Boolean.valueOf(parcel.readInt() != 0 ? z2 : false);
            }
            if (parcel.readInt() == 0) {
                valueOf11 = null;
            } else {
                valueOf11 = Boolean.valueOf(parcel.readInt() != 0 ? z2 : false);
            }
            if (parcel.readInt() == 0) {
                audioChartInfoDto = audioChartInfoDto2;
                i2 = i5;
                arrayList5 = arrayList2;
                arrayList4 = null;
            } else {
                audioChartInfoDto = audioChartInfoDto2;
                int readInt5 = parcel.readInt();
                i2 = i5;
                arrayList4 = new ArrayList(readInt5);
                arrayList5 = arrayList2;
                int i6 = 0;
                while (i6 != readInt5) {
                    int i7 = readInt5;
                    int readInt6 = parcel.readInt();
                    int i8 = i6;
                    ArrayList arrayList6 = new ArrayList(readInt6);
                    String str4 = str3;
                    int i9 = 0;
                    while (i9 != readInt6) {
                        arrayList6.add(Float.valueOf(parcel.readFloat()));
                        i9++;
                        readInt6 = readInt6;
                    }
                    arrayList4.add(arrayList6);
                    i6 = i8 + 1;
                    readInt5 = i7;
                    str3 = str4;
                }
            }
            String str5 = str3;
            AudioVoiceAssistantDto createFromParcel10 = parcel.readInt() == 0 ? null : AudioVoiceAssistantDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf12 = null;
            } else {
                valueOf12 = Boolean.valueOf(parcel.readInt() != 0 ? z2 : false);
            }
            Integer valueOf22 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf23 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf13 = null;
            } else {
                valueOf13 = Boolean.valueOf(parcel.readInt() != 0 ? z2 : false);
            }
            if (parcel.readInt() == 0) {
                valueOf14 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z3 = z2;
                }
                valueOf14 = Boolean.valueOf(z3);
            }
            return new ShortVideoAudioDto(str, i2, userId, str5, readInt2, valueOf15, readString3, createFromParcel7, valueOf, valueOf2, valueOf3, readString4, readString5, valueOf16, valueOf17, num, bool, valueOf5, createFromParcel8, createFromParcel9, audioAudioAlbumDto, valueOf19, valueOf20, obj, mstcpTypeDto, trackGenreIdDto3, readValue2, audioRestrictionDto3, arrayList3, arrayList5, readString6, num2, readString7, podcastInfoDto, audioChartInfoDto, readString8, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, arrayList4, createFromParcel10, valueOf12, valueOf22, valueOf23, valueOf13, valueOf14);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoAudioDto[] newArray(int i) {
            return new ShortVideoAudioDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortVideoAudioDto(String str, int i, UserId userId, String str2, int i2, Integer num, String str3, AudioAdsDto audioAdsDto, Boolean bool, Boolean bool2, Boolean bool3, String str4, String str5, Integer num2, Integer num3, Integer num4, Boolean bool4, Boolean bool5, GenreIdDto genreIdDto, BaseBoolIntDto baseBoolIntDto, AudioAudioAlbumDto audioAudioAlbumDto, Integer num5, Integer num6, Object obj, MstcpTypeDto mstcpTypeDto, TrackGenreIdDto trackGenreIdDto, Object obj2, AudioRestrictionDto audioRestrictionDto, List<AudioArtistDto> list, List<AudioArtistDto> list2, String str6, Integer num7, String str7, PodcastInfoDto podcastInfoDto, AudioChartInfoDto audioChartInfoDto, String str8, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, List<? extends List<Float>> list3, AudioVoiceAssistantDto audioVoiceAssistantDto, Boolean bool12, Integer num8, Integer num9, Boolean bool13, Boolean bool14) {
        this.artist = str;
        this.id = i;
        this.ownerId = userId;
        this.title = str2;
        this.duration = i2;
        this.legalNoticesType = num;
        this.accessKey = str3;
        this.ads = audioAdsDto;
        this.isExplicit = bool;
        this.isFocusTrack = bool2;
        this.isLicensed = bool3;
        this.trackCode = str4;
        this.url = str5;
        this.streamDuration = num2;
        this.date = num3;
        this.albumId = num4;
        this.hasLyrics = bool4;
        this.dislike = bool5;
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
        this.mainArtists = list;
        this.featuredArtists = list2;
        this.subtitle = str6;
        this.albumPartNumber = num7;
        this.performer = str7;
        this.podcastInfo = podcastInfoDto;
        this.audioChartInfo = audioChartInfoDto;
        this.originalSoundVideoId = str8;
        this.shortVideosAllowed = bool6;
        this.storiesAllowed = bool7;
        this.storiesCoverAllowed = bool8;
        this.inClipsFavoriteAllowed = bool9;
        this.inClipsFavorite = bool10;
        this.dmcaBlocked = bool11;
        this.kwsSkip = list3;
        this.audioVoiceAssistant = audioVoiceAssistantDto;
        this.isOfficial = bool12;
        this.specialProjectId = num8;
        this.startPoint = num9;
        this.canDownloadShortVideo = bool13;
        this.trending = bool14;
    }

    public final Boolean B() {
        return this.trending;
    }

    public final AudioAudioAlbumDto d() {
        return this.album;
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
        if (!(obj instanceof ShortVideoAudioDto)) {
            return false;
        }
        ShortVideoAudioDto shortVideoAudioDto = (ShortVideoAudioDto) obj;
        return epx.f(this.artist, shortVideoAudioDto.artist) && this.id == shortVideoAudioDto.id && epx.f(this.ownerId, shortVideoAudioDto.ownerId) && epx.f(this.title, shortVideoAudioDto.title) && this.duration == shortVideoAudioDto.duration && epx.f(this.legalNoticesType, shortVideoAudioDto.legalNoticesType) && epx.f(this.accessKey, shortVideoAudioDto.accessKey) && epx.f(this.ads, shortVideoAudioDto.ads) && epx.f(this.isExplicit, shortVideoAudioDto.isExplicit) && epx.f(this.isFocusTrack, shortVideoAudioDto.isFocusTrack) && epx.f(this.isLicensed, shortVideoAudioDto.isLicensed) && epx.f(this.trackCode, shortVideoAudioDto.trackCode) && epx.f(this.url, shortVideoAudioDto.url) && epx.f(this.streamDuration, shortVideoAudioDto.streamDuration) && epx.f(this.date, shortVideoAudioDto.date) && epx.f(this.albumId, shortVideoAudioDto.albumId) && epx.f(this.hasLyrics, shortVideoAudioDto.hasLyrics) && epx.f(this.dislike, shortVideoAudioDto.dislike) && this.genreId == shortVideoAudioDto.genreId && this.noSearch == shortVideoAudioDto.noSearch && epx.f(this.album, shortVideoAudioDto.album) && epx.f(this.releaseId, shortVideoAudioDto.releaseId) && epx.f(this.trackId, shortVideoAudioDto.trackId) && epx.f(this.regionRestrictions, shortVideoAudioDto.regionRestrictions) && this.mstcpType == shortVideoAudioDto.mstcpType && this.trackGenreId == shortVideoAudioDto.trackGenreId && epx.f(this.itunesPreview, shortVideoAudioDto.itunesPreview) && this.contentRestricted == shortVideoAudioDto.contentRestricted && epx.f(this.mainArtists, shortVideoAudioDto.mainArtists) && epx.f(this.featuredArtists, shortVideoAudioDto.featuredArtists) && epx.f(this.subtitle, shortVideoAudioDto.subtitle) && epx.f(this.albumPartNumber, shortVideoAudioDto.albumPartNumber) && epx.f(this.performer, shortVideoAudioDto.performer) && epx.f(this.podcastInfo, shortVideoAudioDto.podcastInfo) && epx.f(this.audioChartInfo, shortVideoAudioDto.audioChartInfo) && epx.f(this.originalSoundVideoId, shortVideoAudioDto.originalSoundVideoId) && epx.f(this.shortVideosAllowed, shortVideoAudioDto.shortVideosAllowed) && epx.f(this.storiesAllowed, shortVideoAudioDto.storiesAllowed) && epx.f(this.storiesCoverAllowed, shortVideoAudioDto.storiesCoverAllowed) && epx.f(this.inClipsFavoriteAllowed, shortVideoAudioDto.inClipsFavoriteAllowed) && epx.f(this.inClipsFavorite, shortVideoAudioDto.inClipsFavorite) && epx.f(this.dmcaBlocked, shortVideoAudioDto.dmcaBlocked) && epx.f(this.kwsSkip, shortVideoAudioDto.kwsSkip) && epx.f(this.audioVoiceAssistant, shortVideoAudioDto.audioVoiceAssistant) && epx.f(this.isOfficial, shortVideoAudioDto.isOfficial) && epx.f(this.specialProjectId, shortVideoAudioDto.specialProjectId) && epx.f(this.startPoint, shortVideoAudioDto.startPoint) && epx.f(this.canDownloadShortVideo, shortVideoAudioDto.canDownloadShortVideo) && epx.f(this.trending, shortVideoAudioDto.trending);
    }

    public final Boolean f() {
        return this.canDownloadShortVideo;
    }

    public final AudioRestrictionDto g() {
        return this.contentRestricted;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int a2 = shy.a(this.duration, urd0.a(bh10.a(shy.a(this.id, this.artist.hashCode() * 31, 31), 31, this.ownerId.b), 31, this.title), 31);
        Integer num = this.legalNoticesType;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.accessKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AudioAdsDto audioAdsDto = this.ads;
        int hashCode3 = (hashCode2 + (audioAdsDto == null ? 0 : audioAdsDto.hashCode())) * 31;
        Boolean bool = this.isExplicit;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isFocusTrack;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isLicensed;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.trackCode;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.streamDuration;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.date;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.albumId;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool4 = this.hasLyrics;
        int hashCode12 = (hashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.dislike;
        int hashCode13 = (hashCode12 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        GenreIdDto genreIdDto = this.genreId;
        int hashCode14 = (hashCode13 + (genreIdDto == null ? 0 : genreIdDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.noSearch;
        int hashCode15 = (hashCode14 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        AudioAudioAlbumDto audioAudioAlbumDto = this.album;
        int hashCode16 = (hashCode15 + (audioAudioAlbumDto == null ? 0 : audioAudioAlbumDto.hashCode())) * 31;
        Integer num5 = this.releaseId;
        int hashCode17 = (hashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.trackId;
        int hashCode18 = (hashCode17 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Object obj = this.regionRestrictions;
        int hashCode19 = (hashCode18 + (obj == null ? 0 : obj.hashCode())) * 31;
        MstcpTypeDto mstcpTypeDto = this.mstcpType;
        int hashCode20 = (hashCode19 + (mstcpTypeDto == null ? 0 : mstcpTypeDto.hashCode())) * 31;
        TrackGenreIdDto trackGenreIdDto = this.trackGenreId;
        int hashCode21 = (hashCode20 + (trackGenreIdDto == null ? 0 : trackGenreIdDto.hashCode())) * 31;
        Object obj2 = this.itunesPreview;
        int hashCode22 = (hashCode21 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        AudioRestrictionDto audioRestrictionDto = this.contentRestricted;
        int hashCode23 = (hashCode22 + (audioRestrictionDto == null ? 0 : audioRestrictionDto.hashCode())) * 31;
        List<AudioArtistDto> list = this.mainArtists;
        int hashCode24 = (hashCode23 + (list == null ? 0 : list.hashCode())) * 31;
        List<AudioArtistDto> list2 = this.featuredArtists;
        int hashCode25 = (hashCode24 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.subtitle;
        int hashCode26 = (hashCode25 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num7 = this.albumPartNumber;
        int hashCode27 = (hashCode26 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str5 = this.performer;
        int hashCode28 = (hashCode27 + (str5 == null ? 0 : str5.hashCode())) * 31;
        PodcastInfoDto podcastInfoDto = this.podcastInfo;
        int hashCode29 = (hashCode28 + (podcastInfoDto == null ? 0 : podcastInfoDto.hashCode())) * 31;
        AudioChartInfoDto audioChartInfoDto = this.audioChartInfo;
        int hashCode30 = (hashCode29 + (audioChartInfoDto == null ? 0 : audioChartInfoDto.hashCode())) * 31;
        String str6 = this.originalSoundVideoId;
        int hashCode31 = (hashCode30 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool6 = this.shortVideosAllowed;
        int hashCode32 = (hashCode31 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.storiesAllowed;
        int hashCode33 = (hashCode32 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.storiesCoverAllowed;
        int hashCode34 = (hashCode33 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.inClipsFavoriteAllowed;
        int hashCode35 = (hashCode34 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.inClipsFavorite;
        int hashCode36 = (hashCode35 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.dmcaBlocked;
        int hashCode37 = (hashCode36 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        List<List<Float>> list3 = this.kwsSkip;
        int hashCode38 = (hashCode37 + (list3 == null ? 0 : list3.hashCode())) * 31;
        AudioVoiceAssistantDto audioVoiceAssistantDto = this.audioVoiceAssistant;
        int hashCode39 = (hashCode38 + (audioVoiceAssistantDto == null ? 0 : audioVoiceAssistantDto.hashCode())) * 31;
        Boolean bool12 = this.isOfficial;
        int hashCode40 = (hashCode39 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Integer num8 = this.specialProjectId;
        int hashCode41 = (hashCode40 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.startPoint;
        int hashCode42 = (hashCode41 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Boolean bool13 = this.canDownloadShortVideo;
        int hashCode43 = (hashCode42 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.trending;
        return hashCode43 + (bool14 != null ? bool14.hashCode() : 0);
    }

    public final List<AudioArtistDto> i() {
        return this.featuredArtists;
    }

    public final Boolean j() {
        return this.inClipsFavorite;
    }

    public final Boolean k() {
        return this.inClipsFavoriteAllowed;
    }

    public final Integer l() {
        return this.legalNoticesType;
    }

    public final List<AudioArtistDto> n() {
        return this.mainArtists;
    }

    public final String o() {
        return this.originalSoundVideoId;
    }

    public final Boolean p() {
        return this.shortVideosAllowed;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoAudioDto(artist=");
        sb.append(this.artist);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", legalNoticesType=");
        sb.append(this.legalNoticesType);
        sb.append(", accessKey=");
        sb.append(this.accessKey);
        sb.append(", ads=");
        sb.append(this.ads);
        sb.append(", isExplicit=");
        sb.append(this.isExplicit);
        sb.append(", isFocusTrack=");
        sb.append(this.isFocusTrack);
        sb.append(", isLicensed=");
        sb.append(this.isLicensed);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", streamDuration=");
        sb.append(this.streamDuration);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", albumId=");
        sb.append(this.albumId);
        sb.append(", hasLyrics=");
        sb.append(this.hasLyrics);
        sb.append(", dislike=");
        sb.append(this.dislike);
        sb.append(", genreId=");
        sb.append(this.genreId);
        sb.append(", noSearch=");
        sb.append(this.noSearch);
        sb.append(", album=");
        sb.append(this.album);
        sb.append(", releaseId=");
        sb.append(this.releaseId);
        sb.append(", trackId=");
        sb.append(this.trackId);
        sb.append(", regionRestrictions=");
        sb.append(this.regionRestrictions);
        sb.append(", mstcpType=");
        sb.append(this.mstcpType);
        sb.append(", trackGenreId=");
        sb.append(this.trackGenreId);
        sb.append(", itunesPreview=");
        sb.append(this.itunesPreview);
        sb.append(", contentRestricted=");
        sb.append(this.contentRestricted);
        sb.append(", mainArtists=");
        sb.append(this.mainArtists);
        sb.append(", featuredArtists=");
        sb.append(this.featuredArtists);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", albumPartNumber=");
        sb.append(this.albumPartNumber);
        sb.append(", performer=");
        sb.append(this.performer);
        sb.append(", podcastInfo=");
        sb.append(this.podcastInfo);
        sb.append(", audioChartInfo=");
        sb.append(this.audioChartInfo);
        sb.append(", originalSoundVideoId=");
        sb.append(this.originalSoundVideoId);
        sb.append(", shortVideosAllowed=");
        sb.append(this.shortVideosAllowed);
        sb.append(", storiesAllowed=");
        sb.append(this.storiesAllowed);
        sb.append(", storiesCoverAllowed=");
        sb.append(this.storiesCoverAllowed);
        sb.append(", inClipsFavoriteAllowed=");
        sb.append(this.inClipsFavoriteAllowed);
        sb.append(", inClipsFavorite=");
        sb.append(this.inClipsFavorite);
        sb.append(", dmcaBlocked=");
        sb.append(this.dmcaBlocked);
        sb.append(", kwsSkip=");
        sb.append(this.kwsSkip);
        sb.append(", audioVoiceAssistant=");
        sb.append(this.audioVoiceAssistant);
        sb.append(", isOfficial=");
        sb.append(this.isOfficial);
        sb.append(", specialProjectId=");
        sb.append(this.specialProjectId);
        sb.append(", startPoint=");
        sb.append(this.startPoint);
        sb.append(", canDownloadShortVideo=");
        sb.append(this.canDownloadShortVideo);
        sb.append(", trending=");
        return tn.a(sb, this.trending, ')');
    }

    public final String u() {
        return this.subtitle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.artist);
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.title);
        parcel.writeInt(this.duration);
        Integer num = this.legalNoticesType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.accessKey);
        AudioAdsDto audioAdsDto = this.ads;
        if (audioAdsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioAdsDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isExplicit;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isFocusTrack;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isLicensed;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        parcel.writeString(this.trackCode);
        parcel.writeString(this.url);
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
        Boolean bool4 = this.hasLyrics;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.dislike;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        GenreIdDto genreIdDto = this.genreId;
        if (genreIdDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            genreIdDto.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto = this.noSearch;
        if (baseBoolIntDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto.writeToParcel(parcel, i);
        }
        AudioAudioAlbumDto audioAudioAlbumDto = this.album;
        if (audioAudioAlbumDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioAudioAlbumDto.writeToParcel(parcel, i);
        }
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
        AudioRestrictionDto audioRestrictionDto = this.contentRestricted;
        if (audioRestrictionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioRestrictionDto.writeToParcel(parcel, i);
        }
        List<AudioArtistDto> list = this.mainArtists;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AudioArtistDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<AudioArtistDto> list2 = this.featuredArtists;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((AudioArtistDto) f2.next()).writeToParcel(parcel, i);
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
        PodcastInfoDto podcastInfoDto = this.podcastInfo;
        if (podcastInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            podcastInfoDto.writeToParcel(parcel, i);
        }
        AudioChartInfoDto audioChartInfoDto = this.audioChartInfo;
        if (audioChartInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioChartInfoDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.originalSoundVideoId);
        Boolean bool6 = this.shortVideosAllowed;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        Boolean bool7 = this.storiesAllowed;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        Boolean bool8 = this.storiesCoverAllowed;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        Boolean bool9 = this.inClipsFavoriteAllowed;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool9);
        }
        Boolean bool10 = this.inClipsFavorite;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool10);
        }
        Boolean bool11 = this.dmcaBlocked;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool11);
        }
        List<List<Float>> list3 = this.kwsSkip;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                Iterator a2 = ao.a(parcel, (List) f3.next());
                while (a2.hasNext()) {
                    parcel.writeFloat(((Number) a2.next()).floatValue());
                }
            }
        }
        AudioVoiceAssistantDto audioVoiceAssistantDto = this.audioVoiceAssistant;
        if (audioVoiceAssistantDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            audioVoiceAssistantDto.writeToParcel(parcel, i);
        }
        Boolean bool12 = this.isOfficial;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool12);
        }
        Integer num8 = this.specialProjectId;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        Integer num9 = this.startPoint;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num9);
        }
        Boolean bool13 = this.canDownloadShortVideo;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool13);
        }
        Boolean bool14 = this.trending;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool14);
        }
    }

    public /* synthetic */ ShortVideoAudioDto(String str, int i, UserId userId, String str2, int i2, Integer num, String str3, AudioAdsDto audioAdsDto, Boolean bool, Boolean bool2, Boolean bool3, String str4, String str5, Integer num2, Integer num3, Integer num4, Boolean bool4, Boolean bool5, GenreIdDto genreIdDto, BaseBoolIntDto baseBoolIntDto, AudioAudioAlbumDto audioAudioAlbumDto, Integer num5, Integer num6, Object obj, MstcpTypeDto mstcpTypeDto, TrackGenreIdDto trackGenreIdDto, Object obj2, AudioRestrictionDto audioRestrictionDto, List list, List list2, String str6, Integer num7, String str7, PodcastInfoDto podcastInfoDto, AudioChartInfoDto audioChartInfoDto, String str8, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, List list3, AudioVoiceAssistantDto audioVoiceAssistantDto, Boolean bool12, Integer num8, Integer num9, Boolean bool13, Boolean bool14, int i3, int i4, zcl zclVar) {
        this(str, i, userId, str2, i2, (i3 & 32) != 0 ? null : num, (i3 & 64) != 0 ? null : str3, (i3 & 128) != 0 ? null : audioAdsDto, (i3 & 256) != 0 ? null : bool, (i3 & 512) != 0 ? null : bool2, (i3 & 1024) != 0 ? null : bool3, (i3 & 2048) != 0 ? null : str4, (i3 & 4096) != 0 ? null : str5, (i3 & 8192) != 0 ? null : num2, (i3 & 16384) != 0 ? null : num3, (i3 & 32768) != 0 ? null : num4, (i3 & 65536) != 0 ? null : bool4, (131072 & i3) != 0 ? null : bool5, (262144 & i3) != 0 ? null : genreIdDto, (524288 & i3) != 0 ? null : baseBoolIntDto, (1048576 & i3) != 0 ? null : audioAudioAlbumDto, (2097152 & i3) != 0 ? null : num5, (4194304 & i3) != 0 ? null : num6, (8388608 & i3) != 0 ? null : obj, (16777216 & i3) != 0 ? null : mstcpTypeDto, (33554432 & i3) != 0 ? null : trackGenreIdDto, (67108864 & i3) != 0 ? null : obj2, (134217728 & i3) != 0 ? null : audioRestrictionDto, (268435456 & i3) != 0 ? null : list, (536870912 & i3) != 0 ? null : list2, (1073741824 & i3) != 0 ? null : str6, (i3 & Integer.MIN_VALUE) != 0 ? null : num7, (i4 & 1) != 0 ? null : str7, (i4 & 2) != 0 ? null : podcastInfoDto, (i4 & 4) != 0 ? null : audioChartInfoDto, (i4 & 8) != 0 ? null : str8, (i4 & 16) != 0 ? null : bool6, (i4 & 32) != 0 ? null : bool7, (i4 & 64) != 0 ? null : bool8, (i4 & 128) != 0 ? null : bool9, (i4 & 256) != 0 ? null : bool10, (i4 & 512) != 0 ? null : bool11, (i4 & 1024) != 0 ? null : list3, (i4 & 2048) != 0 ? null : audioVoiceAssistantDto, (i4 & 4096) != 0 ? null : bool12, (i4 & 8192) != 0 ? null : num8, (i4 & 16384) != 0 ? null : num9, (i4 & 32768) != 0 ? null : bool13, (i4 & 65536) != 0 ? null : bool14);
    }
}
