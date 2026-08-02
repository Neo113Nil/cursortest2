package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pm0;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.zrp;

/* compiled from: ShortVideoShortVideoFullDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoFullDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShortVideoFullDto> CREATOR = new a();

    @pmi0("access")
    private final ShortVideoShortVideoAccessDto access;

    @pmi0("action_button")
    private final ShortVideoShortVideoActionButtonDto actionButton;

    @pmi0("ad")
    private final ShortVideoShortVideoAdDto ad;

    @pmi0("ads_features")
    private final ShortVideoAdsFeaturesDto adsFeatures;

    @pmi0("ads_stats_pixels")
    private final List<AdsItemBlockAdStatPixelDto> adsStatsPixels;

    @pmi0("audio_id")
    private final ShortVideoShortVideoAudioIdDto audioId;

    @pmi0("audio_template")
    private final ShortVideoAudioTemplateInfoDto audioTemplate;

    @pmi0("clickable_stickers")
    private final ShortVideoShortVideoClickableStickersDto clickableStickers;

    @pmi0("co_owners")
    private final List<ShortVideoCoOwnerDto> coOwners;

    @pmi0("compilation_ids")
    private final List<Integer> compilationIds;

    @pmi0("covers")
    private final List<ShortVideoShortVideoImageDto> covers;

    @pmi0("description")
    private final String description;

    @pmi0("duet")
    private final ShortVideoDuetDto duet;

    @pmi0("duration_seconds")
    private final Integer durationSeconds;

    @pmi0("effect_ids")
    private final List<ShortVideoShortVideoEffectIdDto> effectIds;

    @pmi0("engagement")
    private final ShortVideoShortVideoEngagementDto engagement;

    @pmi0("files")
    private final ShortVideoShortVideoFilesDto files;

    @pmi0("first_frames")
    private final List<ShortVideoShortVideoImageDto> firstFrames;

    @pmi0("height")
    private final Integer height;

    @pmi0("highlighted_hashtags")
    private final List<String> highlightedHashtags;

    @pmi0("id")
    private final int id;

    @pmi0("is_author")
    private final Boolean isAuthor;

    @pmi0("is_has_subtitles")
    private final Boolean isHasSubtitles;

    @pmi0("is_muted")
    private final Boolean isMuted;

    @pmi0("is_processing")
    private final Boolean isProcessing;

    @pmi0("main_tab_state")
    private final ShortVideoMainTabStateDto mainTabState;

    @pmi0("mask_ids")
    private final List<ShortVideoShortVideoMaskIdDto> maskIds;

    @pmi0("news_monotheme")
    private final ShortVideoShortVideoNewsMonothemeDto newsMonotheme;

    @pmi0("ord")
    private final ShortVideoShortVideoOrdDto ord;

    @pmi0("original_sound_status")
    private final OriginalSoundStatusDto originalSoundStatus;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("passthrough_events_payload")
    private final String passthroughEventsPayload;

    @pmi0("playlists")
    private final List<ShortVideoPlaylistMinDto> playlists;

    @pmi0("privacy")
    private final ShortVideoShortVideoPrivacyDto privacy;

    @pmi0("publish_timestamp")
    private final Integer publishTimestamp;

    @pmi0("restriction")
    private final ShortVideoShortVideoRestrictionDto restriction;

    @pmi0("scheduled_timestamp")
    private final Integer scheduledTimestamp;

    @pmi0("share_url")
    private final String shareUrl;

    @pmi0("source_video")
    private final ShortVideoSourceVideoDto sourceVideo;

    @pmi0("stats_pixels")
    private final List<ShortVideoShortVideoStatsPixelDto> statsPixels;

    @pmi0("timeline_thumbs")
    private final ShortVideoShortVideoTimelineThumbsDto timelineThumbs;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("trending_hashtags")
    private final List<ShortVideoShortVideoTrendingHashtagDto> trendingHashtags;

    @pmi0("united_video_id")
    private final String unitedVideoId;

    @pmi0("volume_multiplier")
    private final Float volumeMultiplier;

    @pmi0("width")
    private final Integer width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShortVideoShortVideoFullDto.kt */
    public static final class OriginalSoundStatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OriginalSoundStatusDto[] $VALUES;
        public static final Parcelable.Creator<OriginalSoundStatusDto> CREATOR;

        @pmi0("pending")
        public static final OriginalSoundStatusDto PENDING;

        @pmi0("rejected")
        public static final OriginalSoundStatusDto REJECTED;
        private final String value;

        /* compiled from: ShortVideoShortVideoFullDto.kt */
        public static final class a implements Parcelable.Creator<OriginalSoundStatusDto> {
            @Override // android.os.Parcelable.Creator
            public final OriginalSoundStatusDto createFromParcel(Parcel parcel) {
                return OriginalSoundStatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OriginalSoundStatusDto[] newArray(int i) {
                return new OriginalSoundStatusDto[i];
            }
        }

        static {
            OriginalSoundStatusDto originalSoundStatusDto = new OriginalSoundStatusDto("PENDING", 0, "pending");
            PENDING = originalSoundStatusDto;
            OriginalSoundStatusDto originalSoundStatusDto2 = new OriginalSoundStatusDto("REJECTED", 1, "rejected");
            REJECTED = originalSoundStatusDto2;
            OriginalSoundStatusDto[] originalSoundStatusDtoArr = {originalSoundStatusDto, originalSoundStatusDto2};
            $VALUES = originalSoundStatusDtoArr;
            $ENTRIES = new asp(originalSoundStatusDtoArr);
            CREATOR = new a();
        }

        private OriginalSoundStatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static OriginalSoundStatusDto valueOf(String str) {
            return (OriginalSoundStatusDto) Enum.valueOf(OriginalSoundStatusDto.class, str);
        }

        public static OriginalSoundStatusDto[] values() {
            return (OriginalSoundStatusDto[]) $VALUES.clone();
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

    /* compiled from: ShortVideoShortVideoFullDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoFullDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoFullDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ShortVideoShortVideoTimelineThumbsDto shortVideoShortVideoTimelineThumbsDto;
            ShortVideoShortVideoClickableStickersDto shortVideoShortVideoClickableStickersDto;
            ArrayList arrayList4;
            ShortVideoSourceVideoDto shortVideoSourceVideoDto;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ShortVideoShortVideoAudioIdDto shortVideoShortVideoAudioIdDto;
            ShortVideoDuetDto shortVideoDuetDto;
            ArrayList arrayList7;
            ArrayList arrayList8;
            ArrayList arrayList9;
            ArrayList arrayList10;
            ShortVideoAudioTemplateInfoDto shortVideoAudioTemplateInfoDto;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            ArrayList arrayList11;
            ShortVideoShortVideoAccessDto createFromParcel;
            ShortVideoShortVideoAccessDto shortVideoShortVideoAccessDto;
            ShortVideoShortVideoRestrictionDto createFromParcel2;
            ShortVideoShortVideoRestrictionDto shortVideoShortVideoRestrictionDto;
            ShortVideoShortVideoPrivacyDto createFromParcel3;
            Boolean valueOf4;
            ShortVideoShortVideoPrivacyDto shortVideoShortVideoPrivacyDto;
            ShortVideoMainTabStateDto shortVideoMainTabStateDto;
            ArrayList arrayList12;
            ShortVideoShortVideoAdDto shortVideoShortVideoAdDto;
            ArrayList arrayList13;
            ArrayList arrayList14;
            ShortVideoAdsFeaturesDto shortVideoAdsFeaturesDto;
            ShortVideoMainTabStateDto shortVideoMainTabStateDto2;
            ArrayList arrayList15;
            UserId userId = (UserId) parcel.readParcelable(ShortVideoShortVideoFullDto.class.getClassLoader());
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ShortVideoShortVideoEngagementDto createFromParcel4 = parcel.readInt() == 0 ? null : ShortVideoShortVideoEngagementDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = en.a(ShortVideoShortVideoImageDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                int i2 = 0;
                while (i2 != readInt3) {
                    i2 = en.a(ShortVideoShortVideoImageDto.CREATOR, parcel, arrayList2, i2, 1);
                }
            }
            ShortVideoShortVideoTimelineThumbsDto createFromParcel5 = parcel.readInt() == 0 ? null : ShortVideoShortVideoTimelineThumbsDto.CREATOR.createFromParcel(parcel);
            ShortVideoShortVideoFilesDto createFromParcel6 = parcel.readInt() == 0 ? null : ShortVideoShortVideoFilesDto.CREATOR.createFromParcel(parcel);
            ShortVideoShortVideoActionButtonDto createFromParcel7 = parcel.readInt() == 0 ? null : ShortVideoShortVideoActionButtonDto.CREATOR.createFromParcel(parcel);
            ShortVideoShortVideoOrdDto createFromParcel8 = parcel.readInt() == 0 ? null : ShortVideoShortVideoOrdDto.CREATOR.createFromParcel(parcel);
            ShortVideoShortVideoClickableStickersDto createFromParcel9 = parcel.readInt() == 0 ? null : ShortVideoShortVideoClickableStickersDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                shortVideoShortVideoTimelineThumbsDto = createFromParcel5;
                int i3 = 0;
                while (true) {
                    shortVideoShortVideoClickableStickersDto = createFromParcel9;
                    if (i3 == readInt4) {
                        break;
                    }
                    i3 = en.a(ShortVideoShortVideoMaskIdDto.CREATOR, parcel, arrayList3, i3, 1);
                    createFromParcel9 = shortVideoShortVideoClickableStickersDto;
                    userId = userId;
                }
            } else {
                shortVideoShortVideoTimelineThumbsDto = createFromParcel5;
                arrayList3 = null;
                shortVideoShortVideoClickableStickersDto = createFromParcel9;
            }
            UserId userId2 = userId;
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList4 = new ArrayList(readInt5);
                int i4 = 0;
                while (i4 != readInt5) {
                    i4 = en.a(ShortVideoShortVideoEffectIdDto.CREATOR, parcel, arrayList4, i4, 1);
                    readInt5 = readInt5;
                }
            }
            ShortVideoSourceVideoDto shortVideoSourceVideoDto2 = (ShortVideoSourceVideoDto) parcel.readParcelable(ShortVideoShortVideoFullDto.class.getClassLoader());
            ShortVideoShortVideoAudioIdDto createFromParcel10 = parcel.readInt() == 0 ? null : ShortVideoShortVideoAudioIdDto.CREATOR.createFromParcel(parcel);
            OriginalSoundStatusDto createFromParcel11 = parcel.readInt() == 0 ? null : OriginalSoundStatusDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                shortVideoSourceVideoDto = shortVideoSourceVideoDto2;
                arrayList5 = arrayList4;
                shortVideoShortVideoAudioIdDto = createFromParcel10;
                arrayList6 = null;
            } else {
                shortVideoSourceVideoDto = shortVideoSourceVideoDto2;
                int readInt6 = parcel.readInt();
                arrayList5 = arrayList4;
                arrayList6 = new ArrayList(readInt6);
                shortVideoShortVideoAudioIdDto = createFromParcel10;
                int i5 = 0;
                while (i5 != readInt6) {
                    i5 = pm0.b(parcel, arrayList6, i5, 1);
                    readInt6 = readInt6;
                }
            }
            ShortVideoDuetDto shortVideoDuetDto2 = (ShortVideoDuetDto) parcel.readParcelable(ShortVideoShortVideoFullDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                shortVideoDuetDto = shortVideoDuetDto2;
                arrayList8 = arrayList6;
                arrayList7 = null;
            } else {
                int readInt7 = parcel.readInt();
                shortVideoDuetDto = shortVideoDuetDto2;
                arrayList7 = new ArrayList(readInt7);
                arrayList8 = arrayList6;
                int i6 = 0;
                while (i6 != readInt7) {
                    i6 = bo.b(ShortVideoShortVideoFullDto.class, parcel, arrayList7, i6, 1);
                    readInt7 = readInt7;
                }
            }
            ShortVideoAudioTemplateInfoDto shortVideoAudioTemplateInfoDto2 = (ShortVideoAudioTemplateInfoDto) parcel.readParcelable(ShortVideoShortVideoFullDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList9 = arrayList7;
                shortVideoAudioTemplateInfoDto = shortVideoAudioTemplateInfoDto2;
                arrayList10 = null;
            } else {
                int readInt8 = parcel.readInt();
                arrayList9 = arrayList7;
                arrayList10 = new ArrayList(readInt8);
                shortVideoAudioTemplateInfoDto = shortVideoAudioTemplateInfoDto2;
                int i7 = 0;
                while (i7 != readInt8) {
                    i7 = bo.b(ShortVideoShortVideoFullDto.class, parcel, arrayList10, i7, 1);
                    readInt8 = readInt8;
                }
            }
            ShortVideoMainTabStateDto shortVideoMainTabStateDto3 = (ShortVideoMainTabStateDto) parcel.readParcelable(ShortVideoShortVideoFullDto.class.getClassLoader());
            ShortVideoShortVideoAdDto createFromParcel12 = parcel.readInt() == 0 ? null : ShortVideoShortVideoAdDto.CREATOR.createFromParcel(parcel);
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Float valueOf8 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String readString3 = parcel.readString();
            Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
            if (parcel.readInt() == 0) {
                arrayList11 = arrayList10;
                createFromParcel = null;
            } else {
                arrayList11 = arrayList10;
                createFromParcel = ShortVideoShortVideoAccessDto.CREATOR.createFromParcel(parcel);
            }
            ShortVideoShortVideoAccessDto shortVideoShortVideoAccessDto2 = createFromParcel;
            if (parcel.readInt() == 0) {
                shortVideoShortVideoAccessDto = shortVideoShortVideoAccessDto2;
                createFromParcel2 = null;
            } else {
                shortVideoShortVideoAccessDto = shortVideoShortVideoAccessDto2;
                createFromParcel2 = ShortVideoShortVideoRestrictionDto.CREATOR.createFromParcel(parcel);
            }
            ShortVideoShortVideoRestrictionDto shortVideoShortVideoRestrictionDto2 = createFromParcel2;
            if (parcel.readInt() == 0) {
                shortVideoShortVideoRestrictionDto = shortVideoShortVideoRestrictionDto2;
                createFromParcel3 = null;
            } else {
                shortVideoShortVideoRestrictionDto = shortVideoShortVideoRestrictionDto2;
                createFromParcel3 = ShortVideoShortVideoPrivacyDto.CREATOR.createFromParcel(parcel);
            }
            ShortVideoShortVideoPrivacyDto shortVideoShortVideoPrivacyDto2 = createFromParcel3;
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                shortVideoShortVideoPrivacyDto = shortVideoShortVideoPrivacyDto2;
                shortVideoMainTabStateDto = shortVideoMainTabStateDto3;
                shortVideoShortVideoAdDto = createFromParcel12;
                arrayList12 = null;
            } else {
                shortVideoShortVideoPrivacyDto = shortVideoShortVideoPrivacyDto2;
                int readInt9 = parcel.readInt();
                shortVideoMainTabStateDto = shortVideoMainTabStateDto3;
                arrayList12 = new ArrayList(readInt9);
                shortVideoShortVideoAdDto = createFromParcel12;
                int i8 = 0;
                while (i8 != readInt9) {
                    i8 = en.a(ShortVideoShortVideoStatsPixelDto.CREATOR, parcel, arrayList12, i8, 1);
                    readInt9 = readInt9;
                    readInt = readInt;
                }
            }
            int i9 = readInt;
            if (parcel.readInt() == 0) {
                arrayList14 = arrayList12;
                arrayList13 = null;
            } else {
                int readInt10 = parcel.readInt();
                arrayList13 = new ArrayList(readInt10);
                arrayList14 = arrayList12;
                int i10 = 0;
                while (i10 != readInt10) {
                    i10 = bo.b(ShortVideoShortVideoFullDto.class, parcel, arrayList13, i10, 1);
                }
            }
            ShortVideoMainTabStateDto shortVideoMainTabStateDto4 = shortVideoMainTabStateDto;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ShortVideoAdsFeaturesDto shortVideoAdsFeaturesDto2 = (ShortVideoAdsFeaturesDto) parcel.readParcelable(ShortVideoShortVideoFullDto.class.getClassLoader());
            ShortVideoSourceVideoDto shortVideoSourceVideoDto3 = shortVideoSourceVideoDto;
            ShortVideoDuetDto shortVideoDuetDto3 = shortVideoDuetDto;
            ArrayList arrayList16 = arrayList11;
            ShortVideoShortVideoRestrictionDto shortVideoShortVideoRestrictionDto3 = shortVideoShortVideoRestrictionDto;
            Boolean bool = valueOf4;
            ArrayList arrayList17 = arrayList14;
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                shortVideoAdsFeaturesDto = shortVideoAdsFeaturesDto2;
                shortVideoMainTabStateDto2 = shortVideoMainTabStateDto4;
                arrayList15 = null;
            } else {
                int readInt11 = parcel.readInt();
                shortVideoAdsFeaturesDto = shortVideoAdsFeaturesDto2;
                ArrayList arrayList18 = new ArrayList(readInt11);
                shortVideoMainTabStateDto2 = shortVideoMainTabStateDto4;
                int i11 = 0;
                while (i11 != readInt11) {
                    i11 = bo.b(ShortVideoShortVideoFullDto.class, parcel, arrayList18, i11, 1);
                    arrayList13 = arrayList13;
                }
                arrayList15 = arrayList18;
            }
            return new ShortVideoShortVideoFullDto(userId2, i9, readString, readString2, createFromParcel4, arrayList, arrayList2, shortVideoShortVideoTimelineThumbsDto, createFromParcel6, createFromParcel7, createFromParcel8, shortVideoShortVideoClickableStickersDto, arrayList3, arrayList5, shortVideoSourceVideoDto3, shortVideoShortVideoAudioIdDto, createFromParcel11, arrayList8, shortVideoDuetDto3, arrayList9, shortVideoAudioTemplateInfoDto, arrayList16, shortVideoMainTabStateDto2, shortVideoShortVideoAdDto, valueOf5, valueOf6, valueOf7, valueOf8, readString3, valueOf9, valueOf10, valueOf, valueOf2, valueOf3, shortVideoShortVideoAccessDto, shortVideoShortVideoRestrictionDto3, shortVideoShortVideoPrivacyDto, bool, arrayList17, arrayList13, createStringArrayList, shortVideoAdsFeaturesDto, readString4, arrayList15, (ShortVideoShortVideoNewsMonothemeDto) parcel.readParcelable(ShortVideoShortVideoFullDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoFullDto[] newArray(int i) {
            return new ShortVideoShortVideoFullDto[i];
        }
    }

    public ShortVideoShortVideoFullDto(UserId userId, int i, String str, String str2, ShortVideoShortVideoEngagementDto shortVideoShortVideoEngagementDto, List<ShortVideoShortVideoImageDto> list, List<ShortVideoShortVideoImageDto> list2, ShortVideoShortVideoTimelineThumbsDto shortVideoShortVideoTimelineThumbsDto, ShortVideoShortVideoFilesDto shortVideoShortVideoFilesDto, ShortVideoShortVideoActionButtonDto shortVideoShortVideoActionButtonDto, ShortVideoShortVideoOrdDto shortVideoShortVideoOrdDto, ShortVideoShortVideoClickableStickersDto shortVideoShortVideoClickableStickersDto, List<ShortVideoShortVideoMaskIdDto> list3, List<ShortVideoShortVideoEffectIdDto> list4, ShortVideoSourceVideoDto shortVideoSourceVideoDto, ShortVideoShortVideoAudioIdDto shortVideoShortVideoAudioIdDto, OriginalSoundStatusDto originalSoundStatusDto, List<Integer> list5, ShortVideoDuetDto shortVideoDuetDto, List<ShortVideoPlaylistMinDto> list6, ShortVideoAudioTemplateInfoDto shortVideoAudioTemplateInfoDto, List<ShortVideoCoOwnerDto> list7, ShortVideoMainTabStateDto shortVideoMainTabStateDto, ShortVideoShortVideoAdDto shortVideoShortVideoAdDto, Integer num, Integer num2, Integer num3, Float f, String str3, Integer num4, Integer num5, Boolean bool, Boolean bool2, Boolean bool3, ShortVideoShortVideoAccessDto shortVideoShortVideoAccessDto, ShortVideoShortVideoRestrictionDto shortVideoShortVideoRestrictionDto, ShortVideoShortVideoPrivacyDto shortVideoShortVideoPrivacyDto, Boolean bool4, List<ShortVideoShortVideoStatsPixelDto> list8, List<AdsItemBlockAdStatPixelDto> list9, List<String> list10, ShortVideoAdsFeaturesDto shortVideoAdsFeaturesDto, String str4, List<ShortVideoShortVideoTrendingHashtagDto> list11, ShortVideoShortVideoNewsMonothemeDto shortVideoShortVideoNewsMonothemeDto, String str5) {
        this.ownerId = userId;
        this.id = i;
        this.unitedVideoId = str;
        this.description = str2;
        this.engagement = shortVideoShortVideoEngagementDto;
        this.covers = list;
        this.firstFrames = list2;
        this.timelineThumbs = shortVideoShortVideoTimelineThumbsDto;
        this.files = shortVideoShortVideoFilesDto;
        this.actionButton = shortVideoShortVideoActionButtonDto;
        this.ord = shortVideoShortVideoOrdDto;
        this.clickableStickers = shortVideoShortVideoClickableStickersDto;
        this.maskIds = list3;
        this.effectIds = list4;
        this.sourceVideo = shortVideoSourceVideoDto;
        this.audioId = shortVideoShortVideoAudioIdDto;
        this.originalSoundStatus = originalSoundStatusDto;
        this.compilationIds = list5;
        this.duet = shortVideoDuetDto;
        this.playlists = list6;
        this.audioTemplate = shortVideoAudioTemplateInfoDto;
        this.coOwners = list7;
        this.mainTabState = shortVideoMainTabStateDto;
        this.ad = shortVideoShortVideoAdDto;
        this.durationSeconds = num;
        this.width = num2;
        this.height = num3;
        this.volumeMultiplier = f;
        this.trackCode = str3;
        this.publishTimestamp = num4;
        this.scheduledTimestamp = num5;
        this.isHasSubtitles = bool;
        this.isMuted = bool2;
        this.isProcessing = bool3;
        this.access = shortVideoShortVideoAccessDto;
        this.restriction = shortVideoShortVideoRestrictionDto;
        this.privacy = shortVideoShortVideoPrivacyDto;
        this.isAuthor = bool4;
        this.statsPixels = list8;
        this.adsStatsPixels = list9;
        this.highlightedHashtags = list10;
        this.adsFeatures = shortVideoAdsFeaturesDto;
        this.shareUrl = str4;
        this.trendingHashtags = list11;
        this.newsMonotheme = shortVideoShortVideoNewsMonothemeDto;
        this.passthroughEventsPayload = str5;
    }

    public final Integer B() {
        return this.durationSeconds;
    }

    public final List<ShortVideoShortVideoEffectIdDto> C() {
        return this.effectIds;
    }

    public final ShortVideoShortVideoEngagementDto D() {
        return this.engagement;
    }

    public final ShortVideoSourceVideoDto D0() {
        return this.sourceVideo;
    }

    public final ShortVideoShortVideoFilesDto F() {
        return this.files;
    }

    public final List<ShortVideoShortVideoStatsPixelDto> F0() {
        return this.statsPixels;
    }

    public final List<ShortVideoShortVideoImageDto> G() {
        return this.firstFrames;
    }

    public final ShortVideoShortVideoTimelineThumbsDto H0() {
        return this.timelineThumbs;
    }

    public final Integer K() {
        return this.height;
    }

    public final String K0() {
        return this.unitedVideoId;
    }

    public final List<String> M() {
        return this.highlightedHashtags;
    }

    public final Float N0() {
        return this.volumeMultiplier;
    }

    public final Integer P0() {
        return this.width;
    }

    public final ShortVideoMainTabStateDto R() {
        return this.mainTabState;
    }

    public final List<ShortVideoShortVideoTrendingHashtagDto> R0() {
        return this.trendingHashtags;
    }

    public final Boolean S0() {
        return this.isHasSubtitles;
    }

    public final List<ShortVideoShortVideoMaskIdDto> T() {
        return this.maskIds;
    }

    public final Boolean U0() {
        return this.isMuted;
    }

    public final Boolean V0() {
        return this.isProcessing;
    }

    public final ShortVideoShortVideoNewsMonothemeDto W() {
        return this.newsMonotheme;
    }

    public final ShortVideoShortVideoOrdDto Z() {
        return this.ord;
    }

    public final OriginalSoundStatusDto a0() {
        return this.originalSoundStatus;
    }

    public final ShortVideoShortVideoAccessDto d() {
        return this.access;
    }

    public final List<ShortVideoPlaylistMinDto> d0() {
        return this.playlists;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ShortVideoShortVideoActionButtonDto e() {
        return this.actionButton;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShortVideoFullDto)) {
            return false;
        }
        ShortVideoShortVideoFullDto shortVideoShortVideoFullDto = (ShortVideoShortVideoFullDto) obj;
        return epx.f(this.ownerId, shortVideoShortVideoFullDto.ownerId) && this.id == shortVideoShortVideoFullDto.id && epx.f(this.unitedVideoId, shortVideoShortVideoFullDto.unitedVideoId) && epx.f(this.description, shortVideoShortVideoFullDto.description) && epx.f(this.engagement, shortVideoShortVideoFullDto.engagement) && epx.f(this.covers, shortVideoShortVideoFullDto.covers) && epx.f(this.firstFrames, shortVideoShortVideoFullDto.firstFrames) && epx.f(this.timelineThumbs, shortVideoShortVideoFullDto.timelineThumbs) && epx.f(this.files, shortVideoShortVideoFullDto.files) && epx.f(this.actionButton, shortVideoShortVideoFullDto.actionButton) && epx.f(this.ord, shortVideoShortVideoFullDto.ord) && epx.f(this.clickableStickers, shortVideoShortVideoFullDto.clickableStickers) && epx.f(this.maskIds, shortVideoShortVideoFullDto.maskIds) && epx.f(this.effectIds, shortVideoShortVideoFullDto.effectIds) && epx.f(this.sourceVideo, shortVideoShortVideoFullDto.sourceVideo) && epx.f(this.audioId, shortVideoShortVideoFullDto.audioId) && this.originalSoundStatus == shortVideoShortVideoFullDto.originalSoundStatus && epx.f(this.compilationIds, shortVideoShortVideoFullDto.compilationIds) && epx.f(this.duet, shortVideoShortVideoFullDto.duet) && epx.f(this.playlists, shortVideoShortVideoFullDto.playlists) && epx.f(this.audioTemplate, shortVideoShortVideoFullDto.audioTemplate) && epx.f(this.coOwners, shortVideoShortVideoFullDto.coOwners) && this.mainTabState == shortVideoShortVideoFullDto.mainTabState && epx.f(this.ad, shortVideoShortVideoFullDto.ad) && epx.f(this.durationSeconds, shortVideoShortVideoFullDto.durationSeconds) && epx.f(this.width, shortVideoShortVideoFullDto.width) && epx.f(this.height, shortVideoShortVideoFullDto.height) && epx.f(this.volumeMultiplier, shortVideoShortVideoFullDto.volumeMultiplier) && epx.f(this.trackCode, shortVideoShortVideoFullDto.trackCode) && epx.f(this.publishTimestamp, shortVideoShortVideoFullDto.publishTimestamp) && epx.f(this.scheduledTimestamp, shortVideoShortVideoFullDto.scheduledTimestamp) && epx.f(this.isHasSubtitles, shortVideoShortVideoFullDto.isHasSubtitles) && epx.f(this.isMuted, shortVideoShortVideoFullDto.isMuted) && epx.f(this.isProcessing, shortVideoShortVideoFullDto.isProcessing) && epx.f(this.access, shortVideoShortVideoFullDto.access) && epx.f(this.restriction, shortVideoShortVideoFullDto.restriction) && epx.f(this.privacy, shortVideoShortVideoFullDto.privacy) && epx.f(this.isAuthor, shortVideoShortVideoFullDto.isAuthor) && epx.f(this.statsPixels, shortVideoShortVideoFullDto.statsPixels) && epx.f(this.adsStatsPixels, shortVideoShortVideoFullDto.adsStatsPixels) && epx.f(this.highlightedHashtags, shortVideoShortVideoFullDto.highlightedHashtags) && epx.f(this.adsFeatures, shortVideoShortVideoFullDto.adsFeatures) && epx.f(this.shareUrl, shortVideoShortVideoFullDto.shareUrl) && epx.f(this.trendingHashtags, shortVideoShortVideoFullDto.trendingHashtags) && epx.f(this.newsMonotheme, shortVideoShortVideoFullDto.newsMonotheme) && epx.f(this.passthroughEventsPayload, shortVideoShortVideoFullDto.passthroughEventsPayload);
    }

    public final ShortVideoShortVideoAdDto f() {
        return this.ad;
    }

    public final ShortVideoAdsFeaturesDto g() {
        return this.adsFeatures;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = shy.a(this.id, Long.hashCode(this.ownerId.b) * 31, 31);
        String str = this.unitedVideoId;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ShortVideoShortVideoEngagementDto shortVideoShortVideoEngagementDto = this.engagement;
        int hashCode3 = (hashCode2 + (shortVideoShortVideoEngagementDto == null ? 0 : shortVideoShortVideoEngagementDto.hashCode())) * 31;
        List<ShortVideoShortVideoImageDto> list = this.covers;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<ShortVideoShortVideoImageDto> list2 = this.firstFrames;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ShortVideoShortVideoTimelineThumbsDto shortVideoShortVideoTimelineThumbsDto = this.timelineThumbs;
        int hashCode6 = (hashCode5 + (shortVideoShortVideoTimelineThumbsDto == null ? 0 : shortVideoShortVideoTimelineThumbsDto.hashCode())) * 31;
        ShortVideoShortVideoFilesDto shortVideoShortVideoFilesDto = this.files;
        int hashCode7 = (hashCode6 + (shortVideoShortVideoFilesDto == null ? 0 : shortVideoShortVideoFilesDto.hashCode())) * 31;
        ShortVideoShortVideoActionButtonDto shortVideoShortVideoActionButtonDto = this.actionButton;
        int hashCode8 = (hashCode7 + (shortVideoShortVideoActionButtonDto == null ? 0 : shortVideoShortVideoActionButtonDto.hashCode())) * 31;
        ShortVideoShortVideoOrdDto shortVideoShortVideoOrdDto = this.ord;
        int hashCode9 = (hashCode8 + (shortVideoShortVideoOrdDto == null ? 0 : shortVideoShortVideoOrdDto.hashCode())) * 31;
        ShortVideoShortVideoClickableStickersDto shortVideoShortVideoClickableStickersDto = this.clickableStickers;
        int hashCode10 = (hashCode9 + (shortVideoShortVideoClickableStickersDto == null ? 0 : shortVideoShortVideoClickableStickersDto.hashCode())) * 31;
        List<ShortVideoShortVideoMaskIdDto> list3 = this.maskIds;
        int hashCode11 = (hashCode10 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<ShortVideoShortVideoEffectIdDto> list4 = this.effectIds;
        int hashCode12 = (hashCode11 + (list4 == null ? 0 : list4.hashCode())) * 31;
        ShortVideoSourceVideoDto shortVideoSourceVideoDto = this.sourceVideo;
        int hashCode13 = (hashCode12 + (shortVideoSourceVideoDto == null ? 0 : shortVideoSourceVideoDto.hashCode())) * 31;
        ShortVideoShortVideoAudioIdDto shortVideoShortVideoAudioIdDto = this.audioId;
        int hashCode14 = (hashCode13 + (shortVideoShortVideoAudioIdDto == null ? 0 : shortVideoShortVideoAudioIdDto.hashCode())) * 31;
        OriginalSoundStatusDto originalSoundStatusDto = this.originalSoundStatus;
        int hashCode15 = (hashCode14 + (originalSoundStatusDto == null ? 0 : originalSoundStatusDto.hashCode())) * 31;
        List<Integer> list5 = this.compilationIds;
        int hashCode16 = (hashCode15 + (list5 == null ? 0 : list5.hashCode())) * 31;
        ShortVideoDuetDto shortVideoDuetDto = this.duet;
        int hashCode17 = (hashCode16 + (shortVideoDuetDto == null ? 0 : shortVideoDuetDto.hashCode())) * 31;
        List<ShortVideoPlaylistMinDto> list6 = this.playlists;
        int hashCode18 = (hashCode17 + (list6 == null ? 0 : list6.hashCode())) * 31;
        ShortVideoAudioTemplateInfoDto shortVideoAudioTemplateInfoDto = this.audioTemplate;
        int hashCode19 = (hashCode18 + (shortVideoAudioTemplateInfoDto == null ? 0 : shortVideoAudioTemplateInfoDto.hashCode())) * 31;
        List<ShortVideoCoOwnerDto> list7 = this.coOwners;
        int hashCode20 = (hashCode19 + (list7 == null ? 0 : list7.hashCode())) * 31;
        ShortVideoMainTabStateDto shortVideoMainTabStateDto = this.mainTabState;
        int hashCode21 = (hashCode20 + (shortVideoMainTabStateDto == null ? 0 : shortVideoMainTabStateDto.hashCode())) * 31;
        ShortVideoShortVideoAdDto shortVideoShortVideoAdDto = this.ad;
        int hashCode22 = (hashCode21 + (shortVideoShortVideoAdDto == null ? 0 : shortVideoShortVideoAdDto.hashCode())) * 31;
        Integer num = this.durationSeconds;
        int hashCode23 = (hashCode22 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.width;
        int hashCode24 = (hashCode23 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.height;
        int hashCode25 = (hashCode24 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f = this.volumeMultiplier;
        int hashCode26 = (hashCode25 + (f == null ? 0 : f.hashCode())) * 31;
        String str3 = this.trackCode;
        int hashCode27 = (hashCode26 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.publishTimestamp;
        int hashCode28 = (hashCode27 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.scheduledTimestamp;
        int hashCode29 = (hashCode28 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool = this.isHasSubtitles;
        int hashCode30 = (hashCode29 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isMuted;
        int hashCode31 = (hashCode30 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isProcessing;
        int hashCode32 = (hashCode31 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        ShortVideoShortVideoAccessDto shortVideoShortVideoAccessDto = this.access;
        int hashCode33 = (hashCode32 + (shortVideoShortVideoAccessDto == null ? 0 : shortVideoShortVideoAccessDto.hashCode())) * 31;
        ShortVideoShortVideoRestrictionDto shortVideoShortVideoRestrictionDto = this.restriction;
        int hashCode34 = (hashCode33 + (shortVideoShortVideoRestrictionDto == null ? 0 : shortVideoShortVideoRestrictionDto.hashCode())) * 31;
        ShortVideoShortVideoPrivacyDto shortVideoShortVideoPrivacyDto = this.privacy;
        int hashCode35 = (hashCode34 + (shortVideoShortVideoPrivacyDto == null ? 0 : shortVideoShortVideoPrivacyDto.hashCode())) * 31;
        Boolean bool4 = this.isAuthor;
        int hashCode36 = (hashCode35 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List<ShortVideoShortVideoStatsPixelDto> list8 = this.statsPixels;
        int hashCode37 = (hashCode36 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<AdsItemBlockAdStatPixelDto> list9 = this.adsStatsPixels;
        int hashCode38 = (hashCode37 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<String> list10 = this.highlightedHashtags;
        int hashCode39 = (hashCode38 + (list10 == null ? 0 : list10.hashCode())) * 31;
        ShortVideoAdsFeaturesDto shortVideoAdsFeaturesDto = this.adsFeatures;
        int hashCode40 = (hashCode39 + (shortVideoAdsFeaturesDto == null ? 0 : shortVideoAdsFeaturesDto.hashCode())) * 31;
        String str4 = this.shareUrl;
        int hashCode41 = (hashCode40 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<ShortVideoShortVideoTrendingHashtagDto> list11 = this.trendingHashtags;
        int hashCode42 = (hashCode41 + (list11 == null ? 0 : list11.hashCode())) * 31;
        ShortVideoShortVideoNewsMonothemeDto shortVideoShortVideoNewsMonothemeDto = this.newsMonotheme;
        int hashCode43 = (hashCode42 + (shortVideoShortVideoNewsMonothemeDto == null ? 0 : shortVideoShortVideoNewsMonothemeDto.hashCode())) * 31;
        String str5 = this.passthroughEventsPayload;
        return hashCode43 + (str5 != null ? str5.hashCode() : 0);
    }

    public final List<AdsItemBlockAdStatPixelDto> i() {
        return this.adsStatsPixels;
    }

    public final ShortVideoShortVideoAudioIdDto j() {
        return this.audioId;
    }

    public final ShortVideoAudioTemplateInfoDto k() {
        return this.audioTemplate;
    }

    public final ShortVideoShortVideoClickableStickersDto l() {
        return this.clickableStickers;
    }

    public final ShortVideoShortVideoPrivacyDto l0() {
        return this.privacy;
    }

    public final List<ShortVideoCoOwnerDto> n() {
        return this.coOwners;
    }

    public final List<Integer> o() {
        return this.compilationIds;
    }

    public final List<ShortVideoShortVideoImageDto> p() {
        return this.covers;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoShortVideoFullDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", unitedVideoId=");
        sb.append(this.unitedVideoId);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", engagement=");
        sb.append(this.engagement);
        sb.append(", covers=");
        sb.append(this.covers);
        sb.append(", firstFrames=");
        sb.append(this.firstFrames);
        sb.append(", timelineThumbs=");
        sb.append(this.timelineThumbs);
        sb.append(", files=");
        sb.append(this.files);
        sb.append(", actionButton=");
        sb.append(this.actionButton);
        sb.append(", ord=");
        sb.append(this.ord);
        sb.append(", clickableStickers=");
        sb.append(this.clickableStickers);
        sb.append(", maskIds=");
        sb.append(this.maskIds);
        sb.append(", effectIds=");
        sb.append(this.effectIds);
        sb.append(", sourceVideo=");
        sb.append(this.sourceVideo);
        sb.append(", audioId=");
        sb.append(this.audioId);
        sb.append(", originalSoundStatus=");
        sb.append(this.originalSoundStatus);
        sb.append(", compilationIds=");
        sb.append(this.compilationIds);
        sb.append(", duet=");
        sb.append(this.duet);
        sb.append(", playlists=");
        sb.append(this.playlists);
        sb.append(", audioTemplate=");
        sb.append(this.audioTemplate);
        sb.append(", coOwners=");
        sb.append(this.coOwners);
        sb.append(", mainTabState=");
        sb.append(this.mainTabState);
        sb.append(", ad=");
        sb.append(this.ad);
        sb.append(", durationSeconds=");
        sb.append(this.durationSeconds);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", volumeMultiplier=");
        sb.append(this.volumeMultiplier);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", publishTimestamp=");
        sb.append(this.publishTimestamp);
        sb.append(", scheduledTimestamp=");
        sb.append(this.scheduledTimestamp);
        sb.append(", isHasSubtitles=");
        sb.append(this.isHasSubtitles);
        sb.append(", isMuted=");
        sb.append(this.isMuted);
        sb.append(", isProcessing=");
        sb.append(this.isProcessing);
        sb.append(", access=");
        sb.append(this.access);
        sb.append(", restriction=");
        sb.append(this.restriction);
        sb.append(", privacy=");
        sb.append(this.privacy);
        sb.append(", isAuthor=");
        sb.append(this.isAuthor);
        sb.append(", statsPixels=");
        sb.append(this.statsPixels);
        sb.append(", adsStatsPixels=");
        sb.append(this.adsStatsPixels);
        sb.append(", highlightedHashtags=");
        sb.append(this.highlightedHashtags);
        sb.append(", adsFeatures=");
        sb.append(this.adsFeatures);
        sb.append(", shareUrl=");
        sb.append(this.shareUrl);
        sb.append(", trendingHashtags=");
        sb.append(this.trendingHashtags);
        sb.append(", newsMonotheme=");
        sb.append(this.newsMonotheme);
        sb.append(", passthroughEventsPayload=");
        return ho8.a(sb, this.passthroughEventsPayload, ')');
    }

    public final ShortVideoDuetDto u() {
        return this.duet;
    }

    public final Integer v0() {
        return this.publishTimestamp;
    }

    public final ShortVideoShortVideoRestrictionDto w0() {
        return this.restriction;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeInt(this.id);
        parcel.writeString(this.unitedVideoId);
        parcel.writeString(this.description);
        ShortVideoShortVideoEngagementDto shortVideoShortVideoEngagementDto = this.engagement;
        if (shortVideoShortVideoEngagementDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoShortVideoEngagementDto.writeToParcel(parcel, i);
        }
        List<ShortVideoShortVideoImageDto> list = this.covers;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((ShortVideoShortVideoImageDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<ShortVideoShortVideoImageDto> list2 = this.firstFrames;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((ShortVideoShortVideoImageDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        ShortVideoShortVideoTimelineThumbsDto shortVideoShortVideoTimelineThumbsDto = this.timelineThumbs;
        if (shortVideoShortVideoTimelineThumbsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoShortVideoTimelineThumbsDto.writeToParcel(parcel, i);
        }
        ShortVideoShortVideoFilesDto shortVideoShortVideoFilesDto = this.files;
        if (shortVideoShortVideoFilesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoShortVideoFilesDto.writeToParcel(parcel, i);
        }
        ShortVideoShortVideoActionButtonDto shortVideoShortVideoActionButtonDto = this.actionButton;
        if (shortVideoShortVideoActionButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoShortVideoActionButtonDto.writeToParcel(parcel, i);
        }
        ShortVideoShortVideoOrdDto shortVideoShortVideoOrdDto = this.ord;
        if (shortVideoShortVideoOrdDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoShortVideoOrdDto.writeToParcel(parcel, i);
        }
        ShortVideoShortVideoClickableStickersDto shortVideoShortVideoClickableStickersDto = this.clickableStickers;
        if (shortVideoShortVideoClickableStickersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoShortVideoClickableStickersDto.writeToParcel(parcel, i);
        }
        List<ShortVideoShortVideoMaskIdDto> list3 = this.maskIds;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((ShortVideoShortVideoMaskIdDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        List<ShortVideoShortVideoEffectIdDto> list4 = this.effectIds;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((ShortVideoShortVideoEffectIdDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.sourceVideo, i);
        ShortVideoShortVideoAudioIdDto shortVideoShortVideoAudioIdDto = this.audioId;
        if (shortVideoShortVideoAudioIdDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoShortVideoAudioIdDto.writeToParcel(parcel, i);
        }
        OriginalSoundStatusDto originalSoundStatusDto = this.originalSoundStatus;
        if (originalSoundStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            originalSoundStatusDto.writeToParcel(parcel, i);
        }
        List<Integer> list5 = this.compilationIds;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                parcel.writeInt(((Number) f5.next()).intValue());
            }
        }
        parcel.writeParcelable(this.duet, i);
        List<ShortVideoPlaylistMinDto> list6 = this.playlists;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list6, 1);
            while (f6.hasNext()) {
                parcel.writeParcelable((Parcelable) f6.next(), i);
            }
        }
        parcel.writeParcelable(this.audioTemplate, i);
        List<ShortVideoCoOwnerDto> list7 = this.coOwners;
        if (list7 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f7 = dn.f(parcel, list7, 1);
            while (f7.hasNext()) {
                parcel.writeParcelable((Parcelable) f7.next(), i);
            }
        }
        parcel.writeParcelable(this.mainTabState, i);
        ShortVideoShortVideoAdDto shortVideoShortVideoAdDto = this.ad;
        if (shortVideoShortVideoAdDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoShortVideoAdDto.writeToParcel(parcel, i);
        }
        Integer num = this.durationSeconds;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.width;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.height;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Float f8 = this.volumeMultiplier;
        if (f8 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f8);
        }
        parcel.writeString(this.trackCode);
        Integer num4 = this.publishTimestamp;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.scheduledTimestamp;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Boolean bool = this.isHasSubtitles;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isMuted;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isProcessing;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        ShortVideoShortVideoAccessDto shortVideoShortVideoAccessDto = this.access;
        if (shortVideoShortVideoAccessDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoShortVideoAccessDto.writeToParcel(parcel, i);
        }
        ShortVideoShortVideoRestrictionDto shortVideoShortVideoRestrictionDto = this.restriction;
        if (shortVideoShortVideoRestrictionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoShortVideoRestrictionDto.writeToParcel(parcel, i);
        }
        ShortVideoShortVideoPrivacyDto shortVideoShortVideoPrivacyDto = this.privacy;
        if (shortVideoShortVideoPrivacyDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoShortVideoPrivacyDto.writeToParcel(parcel, i);
        }
        Boolean bool4 = this.isAuthor;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        List<ShortVideoShortVideoStatsPixelDto> list8 = this.statsPixels;
        if (list8 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f9 = dn.f(parcel, list8, 1);
            while (f9.hasNext()) {
                ((ShortVideoShortVideoStatsPixelDto) f9.next()).writeToParcel(parcel, i);
            }
        }
        List<AdsItemBlockAdStatPixelDto> list9 = this.adsStatsPixels;
        if (list9 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f10 = dn.f(parcel, list9, 1);
            while (f10.hasNext()) {
                parcel.writeParcelable((Parcelable) f10.next(), i);
            }
        }
        parcel.writeStringList(this.highlightedHashtags);
        parcel.writeParcelable(this.adsFeatures, i);
        parcel.writeString(this.shareUrl);
        List<ShortVideoShortVideoTrendingHashtagDto> list10 = this.trendingHashtags;
        if (list10 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f11 = dn.f(parcel, list10, 1);
            while (f11.hasNext()) {
                parcel.writeParcelable((Parcelable) f11.next(), i);
            }
        }
        parcel.writeParcelable(this.newsMonotheme, i);
        parcel.writeString(this.passthroughEventsPayload);
    }

    public final Integer y0() {
        return this.scheduledTimestamp;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ShortVideoShortVideoFullDto(com.vk.dto.common.id.UserId r40, int r41, java.lang.String r42, java.lang.String r43, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoEngagementDto r44, java.util.List r45, java.util.List r46, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoTimelineThumbsDto r47, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoFilesDto r48, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoActionButtonDto r49, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoOrdDto r50, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoClickableStickersDto r51, java.util.List r52, java.util.List r53, com.vk.api.generated.shortVideo.dto.ShortVideoSourceVideoDto r54, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoAudioIdDto r55, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoFullDto.OriginalSoundStatusDto r56, java.util.List r57, com.vk.api.generated.shortVideo.dto.ShortVideoDuetDto r58, java.util.List r59, com.vk.api.generated.shortVideo.dto.ShortVideoAudioTemplateInfoDto r60, java.util.List r61, com.vk.api.generated.shortVideo.dto.ShortVideoMainTabStateDto r62, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoAdDto r63, java.lang.Integer r64, java.lang.Integer r65, java.lang.Integer r66, java.lang.Float r67, java.lang.String r68, java.lang.Integer r69, java.lang.Integer r70, java.lang.Boolean r71, java.lang.Boolean r72, java.lang.Boolean r73, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoAccessDto r74, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoRestrictionDto r75, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoPrivacyDto r76, java.lang.Boolean r77, java.util.List r78, java.util.List r79, java.util.List r80, com.vk.api.generated.shortVideo.dto.ShortVideoAdsFeaturesDto r81, java.lang.String r82, java.util.List r83, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoNewsMonothemeDto r84, java.lang.String r85, int r86, int r87, xsna.zcl r88) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoFullDto.<init>(com.vk.dto.common.id.UserId, int, java.lang.String, java.lang.String, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoEngagementDto, java.util.List, java.util.List, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoTimelineThumbsDto, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoFilesDto, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoActionButtonDto, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoOrdDto, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoClickableStickersDto, java.util.List, java.util.List, com.vk.api.generated.shortVideo.dto.ShortVideoSourceVideoDto, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoAudioIdDto, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoFullDto$OriginalSoundStatusDto, java.util.List, com.vk.api.generated.shortVideo.dto.ShortVideoDuetDto, java.util.List, com.vk.api.generated.shortVideo.dto.ShortVideoAudioTemplateInfoDto, java.util.List, com.vk.api.generated.shortVideo.dto.ShortVideoMainTabStateDto, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoAdDto, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoAccessDto, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoRestrictionDto, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoPrivacyDto, java.lang.Boolean, java.util.List, java.util.List, java.util.List, com.vk.api.generated.shortVideo.dto.ShortVideoAdsFeaturesDto, java.lang.String, java.util.List, com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoNewsMonothemeDto, java.lang.String, int, int, xsna.zcl):void");
    }
}
