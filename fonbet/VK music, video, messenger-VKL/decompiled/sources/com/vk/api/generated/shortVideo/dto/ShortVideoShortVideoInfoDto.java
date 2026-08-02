package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.masks.dto.MasksEffectDto;
import com.vk.api.generated.masks.dto.MasksMaskDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ShortVideoShortVideoInfoDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoInfoDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShortVideoInfoDto> CREATOR = new a();

    @pmi0("ads_features")
    private final ShortVideoAdsFeaturesDto adsFeatures;

    @pmi0("anon_can_like")
    private final Boolean anonCanLike;

    @pmi0("anon_user_like_exists")
    private final Boolean anonUserLikeExists;

    @pmi0("audio")
    private final ShortVideoAudioDto audio;

    @pmi0("audio_template")
    private final ShortVideoAudioTemplateInfoDto audioTemplate;

    @pmi0("can_make_duet")
    private final Boolean canMakeDuet;

    @pmi0("clickable_stickers")
    private final ShortVideoClickableStickersDto clickableStickers;

    @pmi0("clips_user_link_moderation")
    private final ClipsUserLinkModerationDto clipsUserLinkModeration;

    @pmi0("co_owners")
    private final List<ShortVideoCoOwnerDto> coOwners;

    @pmi0("compilations")
    private final List<ShortVideoCompilationInfoDto> compilations;

    @pmi0("contest_id")
    private final Integer contestId;

    @pmi0("duet")
    private final ShortVideoDuetDto duet;

    @pmi0("effects")
    private final List<MasksEffectDto> effects;

    @pmi0("favorite")
    private final Boolean favorite;

    @pmi0("friends_only")
    private final Boolean friendsOnly;

    @pmi0("goods_info")
    private final ShortVideoGoodsInfoDto goodsInfo;

    @pmi0("hide_closing_ad_banner")
    private final Boolean hideClosingAdBanner;

    @pmi0("highlighted_hashtags")
    private final List<String> highlightedHashtags;

    @pmi0("interactive")
    private final ShortVideoInteractiveDto interactive;

    @pmi0("main_tab_state")
    private final ShortVideoMainTabStateDto mainTabState;

    @pmi0("masks")
    private final List<MasksMaskDto> masks;

    @pmi0("mini_app_id")
    private final Integer miniAppId;

    @pmi0("news_monotheme")
    private final ShortVideoShortVideoNewsMonothemeDto newsMonotheme;

    @pmi0("original_sound_status")
    private final OriginalSoundStatusDto originalSoundStatus;

    @pmi0("playlists")
    private final List<ShortVideoPlaylistMinDto> playlists;

    @pmi0("popular")
    private final Boolean popular;

    @pmi0("show_make_duet_tooltip")
    private final Boolean showMakeDuetTooltip;

    @pmi0("source_video")
    private final ShortVideoSourceVideoDto sourceVideo;

    @pmi0("trending_hashtags")
    private final List<ShortVideoShortVideoTrendingHashtagDto> trendingHashtags;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShortVideoShortVideoInfoDto.kt */
    public static final class ClipsUserLinkModerationDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClipsUserLinkModerationDto[] $VALUES;

        @pmi0("3")
        public static final ClipsUserLinkModerationDto APPROVED;
        public static final Parcelable.Creator<ClipsUserLinkModerationDto> CREATOR;

        @pmi0("0")
        public static final ClipsUserLinkModerationDto NOT_MODERATED;

        @pmi0("1")
        public static final ClipsUserLinkModerationDto PENDING_MODERATION;

        @pmi0("2")
        public static final ClipsUserLinkModerationDto REJECTED;
        private final int value;

        /* compiled from: ShortVideoShortVideoInfoDto.kt */
        public static final class a implements Parcelable.Creator<ClipsUserLinkModerationDto> {
            @Override // android.os.Parcelable.Creator
            public final ClipsUserLinkModerationDto createFromParcel(Parcel parcel) {
                return ClipsUserLinkModerationDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ClipsUserLinkModerationDto[] newArray(int i) {
                return new ClipsUserLinkModerationDto[i];
            }
        }

        static {
            ClipsUserLinkModerationDto clipsUserLinkModerationDto = new ClipsUserLinkModerationDto("NOT_MODERATED", 0, 0);
            NOT_MODERATED = clipsUserLinkModerationDto;
            ClipsUserLinkModerationDto clipsUserLinkModerationDto2 = new ClipsUserLinkModerationDto("PENDING_MODERATION", 1, 1);
            PENDING_MODERATION = clipsUserLinkModerationDto2;
            ClipsUserLinkModerationDto clipsUserLinkModerationDto3 = new ClipsUserLinkModerationDto("REJECTED", 2, 2);
            REJECTED = clipsUserLinkModerationDto3;
            ClipsUserLinkModerationDto clipsUserLinkModerationDto4 = new ClipsUserLinkModerationDto("APPROVED", 3, 3);
            APPROVED = clipsUserLinkModerationDto4;
            ClipsUserLinkModerationDto[] clipsUserLinkModerationDtoArr = {clipsUserLinkModerationDto, clipsUserLinkModerationDto2, clipsUserLinkModerationDto3, clipsUserLinkModerationDto4};
            $VALUES = clipsUserLinkModerationDtoArr;
            $ENTRIES = new asp(clipsUserLinkModerationDtoArr);
            CREATOR = new a();
        }

        private ClipsUserLinkModerationDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static ClipsUserLinkModerationDto valueOf(String str) {
            return (ClipsUserLinkModerationDto) Enum.valueOf(ClipsUserLinkModerationDto.class, str);
        }

        public static ClipsUserLinkModerationDto[] values() {
            return (ClipsUserLinkModerationDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShortVideoShortVideoInfoDto.kt */
    public static final class OriginalSoundStatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OriginalSoundStatusDto[] $VALUES;

        @pmi0("2")
        public static final OriginalSoundStatusDto APPROVED;
        public static final Parcelable.Creator<OriginalSoundStatusDto> CREATOR;

        @pmi0("1")
        public static final OriginalSoundStatusDto PENDING;

        @pmi0("3")
        public static final OriginalSoundStatusDto REJECTED;
        private final int value;

        /* compiled from: ShortVideoShortVideoInfoDto.kt */
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
            OriginalSoundStatusDto originalSoundStatusDto = new OriginalSoundStatusDto("PENDING", 0, 1);
            PENDING = originalSoundStatusDto;
            OriginalSoundStatusDto originalSoundStatusDto2 = new OriginalSoundStatusDto("APPROVED", 1, 2);
            APPROVED = originalSoundStatusDto2;
            OriginalSoundStatusDto originalSoundStatusDto3 = new OriginalSoundStatusDto("REJECTED", 2, 3);
            REJECTED = originalSoundStatusDto3;
            OriginalSoundStatusDto[] originalSoundStatusDtoArr = {originalSoundStatusDto, originalSoundStatusDto2, originalSoundStatusDto3};
            $VALUES = originalSoundStatusDtoArr;
            $ENTRIES = new asp(originalSoundStatusDtoArr);
            CREATOR = new a();
        }

        private OriginalSoundStatusDto(String str, int i, int i2) {
            this.value = i2;
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

    /* compiled from: ShortVideoShortVideoInfoDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoInfoDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean valueOf;
            Boolean valueOf2;
            ArrayList arrayList3;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            ShortVideoAudioDto shortVideoAudioDto;
            ClipsUserLinkModerationDto createFromParcel;
            Boolean valueOf6;
            ClipsUserLinkModerationDto clipsUserLinkModerationDto;
            Boolean bool;
            ArrayList arrayList4;
            ShortVideoAudioTemplateInfoDto shortVideoAudioTemplateInfoDto;
            Boolean valueOf7;
            ArrayList arrayList5;
            Boolean bool2;
            ArrayList arrayList6;
            Boolean valueOf8;
            ShortVideoMainTabStateDto shortVideoMainTabStateDto;
            ShortVideoAdsFeaturesDto createFromParcel2;
            ShortVideoAdsFeaturesDto shortVideoAdsFeaturesDto;
            Boolean bool3;
            ArrayList arrayList7;
            ShortVideoGoodsInfoDto shortVideoGoodsInfoDto;
            ShortVideoClickableStickersDto createFromParcel3 = parcel.readInt() == 0 ? null : ShortVideoClickableStickersDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MasksMaskDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(MasksEffectDto.CREATOR, parcel, arrayList2, i2, 1);
                }
            }
            ShortVideoAudioDto createFromParcel4 = parcel.readInt() == 0 ? null : ShortVideoAudioDto.CREATOR.createFromParcel(parcel);
            OriginalSoundStatusDto createFromParcel5 = parcel.readInt() == 0 ? null : OriginalSoundStatusDto.CREATOR.createFromParcel(parcel);
            ShortVideoInteractiveDto createFromParcel6 = parcel.readInt() == 0 ? null : ShortVideoInteractiveDto.CREATOR.createFromParcel(parcel);
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
            ShortVideoDuetDto createFromParcel7 = parcel.readInt() == 0 ? null : ShortVideoDuetDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = en.a(ShortVideoCompilationInfoDto.CREATOR, parcel, arrayList8, i3, 1);
                }
                arrayList3 = arrayList8;
            }
            Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ShortVideoSourceVideoDto createFromParcel8 = parcel.readInt() == 0 ? null : ShortVideoSourceVideoDto.CREATOR.createFromParcel(parcel);
            ShortVideoAudioTemplateInfoDto createFromParcel9 = parcel.readInt() == 0 ? null : ShortVideoAudioTemplateInfoDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                shortVideoAudioDto = createFromParcel4;
                createFromParcel = null;
            } else {
                shortVideoAudioDto = createFromParcel4;
                createFromParcel = ClipsUserLinkModerationDto.CREATOR.createFromParcel(parcel);
            }
            ClipsUserLinkModerationDto clipsUserLinkModerationDto2 = createFromParcel;
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                clipsUserLinkModerationDto = clipsUserLinkModerationDto2;
                bool = valueOf3;
                shortVideoAudioTemplateInfoDto = createFromParcel9;
                arrayList4 = null;
            } else {
                clipsUserLinkModerationDto = clipsUserLinkModerationDto2;
                int readInt4 = parcel.readInt();
                bool = valueOf3;
                arrayList4 = new ArrayList(readInt4);
                shortVideoAudioTemplateInfoDto = createFromParcel9;
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = en.a(ShortVideoPlaylistMinDto.CREATOR, parcel, arrayList4, i4, 1);
                    readInt4 = readInt4;
                    createFromParcel3 = createFromParcel3;
                }
            }
            ShortVideoClickableStickersDto shortVideoClickableStickersDto = createFromParcel3;
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                arrayList5 = new ArrayList(readInt5);
                bool2 = valueOf7;
                int i5 = 0;
                while (true) {
                    arrayList6 = arrayList4;
                    if (i5 == readInt5) {
                        break;
                    }
                    i5 = en.a(ShortVideoCoOwnerDto.CREATOR, parcel, arrayList5, i5, 1);
                    arrayList4 = arrayList6;
                    readInt5 = readInt5;
                }
            } else {
                bool2 = valueOf7;
                arrayList5 = null;
                arrayList6 = arrayList4;
            }
            ShortVideoMainTabStateDto createFromParcel10 = parcel.readInt() == 0 ? null : ShortVideoMainTabStateDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf8 = null;
            } else {
                valueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            ArrayList arrayList9 = arrayList;
            ArrayList arrayList10 = arrayList2;
            ShortVideoAudioDto shortVideoAudioDto2 = shortVideoAudioDto;
            ClipsUserLinkModerationDto clipsUserLinkModerationDto3 = clipsUserLinkModerationDto;
            ArrayList arrayList11 = arrayList6;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ShortVideoGoodsInfoDto createFromParcel11 = parcel.readInt() == 0 ? null : ShortVideoGoodsInfoDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                shortVideoMainTabStateDto = createFromParcel10;
                createFromParcel2 = null;
            } else {
                shortVideoMainTabStateDto = createFromParcel10;
                createFromParcel2 = ShortVideoAdsFeaturesDto.CREATOR.createFromParcel(parcel);
            }
            ShortVideoAdsFeaturesDto shortVideoAdsFeaturesDto2 = createFromParcel2;
            if (parcel.readInt() == 0) {
                shortVideoAdsFeaturesDto = shortVideoAdsFeaturesDto2;
                bool3 = valueOf8;
                shortVideoGoodsInfoDto = createFromParcel11;
                arrayList7 = null;
            } else {
                shortVideoAdsFeaturesDto = shortVideoAdsFeaturesDto2;
                int readInt6 = parcel.readInt();
                bool3 = valueOf8;
                arrayList7 = new ArrayList(readInt6);
                shortVideoGoodsInfoDto = createFromParcel11;
                int i6 = 0;
                while (i6 != readInt6) {
                    i6 = en.a(ShortVideoShortVideoTrendingHashtagDto.CREATOR, parcel, arrayList7, i6, 1);
                    readInt6 = readInt6;
                    arrayList5 = arrayList5;
                }
            }
            return new ShortVideoShortVideoInfoDto(shortVideoClickableStickersDto, arrayList9, arrayList10, shortVideoAudioDto2, createFromParcel5, createFromParcel6, valueOf, valueOf2, createFromParcel7, arrayList3, valueOf9, valueOf10, bool, valueOf4, valueOf5, createFromParcel8, shortVideoAudioTemplateInfoDto, clipsUserLinkModerationDto3, valueOf6, arrayList11, bool2, arrayList5, shortVideoMainTabStateDto, bool3, createStringArrayList, shortVideoGoodsInfoDto, shortVideoAdsFeaturesDto, arrayList7, parcel.readInt() == 0 ? null : ShortVideoShortVideoNewsMonothemeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoInfoDto[] newArray(int i) {
            return new ShortVideoShortVideoInfoDto[i];
        }
    }

    public ShortVideoShortVideoInfoDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911, null);
    }

    public final ShortVideoShortVideoNewsMonothemeDto B() {
        return this.newsMonotheme;
    }

    public final Boolean C() {
        return this.showMakeDuetTooltip;
    }

    public final ShortVideoSourceVideoDto D() {
        return this.sourceVideo;
    }

    public final List<MasksMaskDto> H2() {
        return this.masks;
    }

    public final List<ShortVideoCompilationInfoDto> H4() {
        return this.compilations;
    }

    public final List<ShortVideoShortVideoTrendingHashtagDto> R0() {
        return this.trendingHashtags;
    }

    public final ShortVideoAdsFeaturesDto d() {
        return this.adsFeatures;
    }

    public final List<ShortVideoPlaylistMinDto> d0() {
        return this.playlists;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.anonUserLikeExists;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShortVideoInfoDto)) {
            return false;
        }
        ShortVideoShortVideoInfoDto shortVideoShortVideoInfoDto = (ShortVideoShortVideoInfoDto) obj;
        return epx.f(this.clickableStickers, shortVideoShortVideoInfoDto.clickableStickers) && epx.f(this.masks, shortVideoShortVideoInfoDto.masks) && epx.f(this.effects, shortVideoShortVideoInfoDto.effects) && epx.f(this.audio, shortVideoShortVideoInfoDto.audio) && this.originalSoundStatus == shortVideoShortVideoInfoDto.originalSoundStatus && epx.f(this.interactive, shortVideoShortVideoInfoDto.interactive) && epx.f(this.canMakeDuet, shortVideoShortVideoInfoDto.canMakeDuet) && epx.f(this.showMakeDuetTooltip, shortVideoShortVideoInfoDto.showMakeDuetTooltip) && epx.f(this.duet, shortVideoShortVideoInfoDto.duet) && epx.f(this.compilations, shortVideoShortVideoInfoDto.compilations) && epx.f(this.miniAppId, shortVideoShortVideoInfoDto.miniAppId) && epx.f(this.contestId, shortVideoShortVideoInfoDto.contestId) && epx.f(this.friendsOnly, shortVideoShortVideoInfoDto.friendsOnly) && epx.f(this.anonCanLike, shortVideoShortVideoInfoDto.anonCanLike) && epx.f(this.anonUserLikeExists, shortVideoShortVideoInfoDto.anonUserLikeExists) && epx.f(this.sourceVideo, shortVideoShortVideoInfoDto.sourceVideo) && epx.f(this.audioTemplate, shortVideoShortVideoInfoDto.audioTemplate) && this.clipsUserLinkModeration == shortVideoShortVideoInfoDto.clipsUserLinkModeration && epx.f(this.popular, shortVideoShortVideoInfoDto.popular) && epx.f(this.playlists, shortVideoShortVideoInfoDto.playlists) && epx.f(this.favorite, shortVideoShortVideoInfoDto.favorite) && epx.f(this.coOwners, shortVideoShortVideoInfoDto.coOwners) && this.mainTabState == shortVideoShortVideoInfoDto.mainTabState && epx.f(this.hideClosingAdBanner, shortVideoShortVideoInfoDto.hideClosingAdBanner) && epx.f(this.highlightedHashtags, shortVideoShortVideoInfoDto.highlightedHashtags) && epx.f(this.goodsInfo, shortVideoShortVideoInfoDto.goodsInfo) && epx.f(this.adsFeatures, shortVideoShortVideoInfoDto.adsFeatures) && epx.f(this.trendingHashtags, shortVideoShortVideoInfoDto.trendingHashtags) && epx.f(this.newsMonotheme, shortVideoShortVideoInfoDto.newsMonotheme);
    }

    public final ShortVideoAudioDto f() {
        return this.audio;
    }

    public final ShortVideoAudioTemplateInfoDto g() {
        return this.audioTemplate;
    }

    public final int hashCode() {
        ShortVideoClickableStickersDto shortVideoClickableStickersDto = this.clickableStickers;
        int hashCode = (shortVideoClickableStickersDto == null ? 0 : shortVideoClickableStickersDto.hashCode()) * 31;
        List<MasksMaskDto> list = this.masks;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<MasksEffectDto> list2 = this.effects;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ShortVideoAudioDto shortVideoAudioDto = this.audio;
        int hashCode4 = (hashCode3 + (shortVideoAudioDto == null ? 0 : shortVideoAudioDto.hashCode())) * 31;
        OriginalSoundStatusDto originalSoundStatusDto = this.originalSoundStatus;
        int hashCode5 = (hashCode4 + (originalSoundStatusDto == null ? 0 : originalSoundStatusDto.hashCode())) * 31;
        ShortVideoInteractiveDto shortVideoInteractiveDto = this.interactive;
        int hashCode6 = (hashCode5 + (shortVideoInteractiveDto == null ? 0 : shortVideoInteractiveDto.hashCode())) * 31;
        Boolean bool = this.canMakeDuet;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showMakeDuetTooltip;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ShortVideoDuetDto shortVideoDuetDto = this.duet;
        int hashCode9 = (hashCode8 + (shortVideoDuetDto == null ? 0 : shortVideoDuetDto.hashCode())) * 31;
        List<ShortVideoCompilationInfoDto> list3 = this.compilations;
        int hashCode10 = (hashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.miniAppId;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.contestId;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool3 = this.friendsOnly;
        int hashCode13 = (hashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.anonCanLike;
        int hashCode14 = (hashCode13 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.anonUserLikeExists;
        int hashCode15 = (hashCode14 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        ShortVideoSourceVideoDto shortVideoSourceVideoDto = this.sourceVideo;
        int hashCode16 = (hashCode15 + (shortVideoSourceVideoDto == null ? 0 : shortVideoSourceVideoDto.hashCode())) * 31;
        ShortVideoAudioTemplateInfoDto shortVideoAudioTemplateInfoDto = this.audioTemplate;
        int hashCode17 = (hashCode16 + (shortVideoAudioTemplateInfoDto == null ? 0 : shortVideoAudioTemplateInfoDto.hashCode())) * 31;
        ClipsUserLinkModerationDto clipsUserLinkModerationDto = this.clipsUserLinkModeration;
        int hashCode18 = (hashCode17 + (clipsUserLinkModerationDto == null ? 0 : clipsUserLinkModerationDto.hashCode())) * 31;
        Boolean bool6 = this.popular;
        int hashCode19 = (hashCode18 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        List<ShortVideoPlaylistMinDto> list4 = this.playlists;
        int hashCode20 = (hashCode19 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool7 = this.favorite;
        int hashCode21 = (hashCode20 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        List<ShortVideoCoOwnerDto> list5 = this.coOwners;
        int hashCode22 = (hashCode21 + (list5 == null ? 0 : list5.hashCode())) * 31;
        ShortVideoMainTabStateDto shortVideoMainTabStateDto = this.mainTabState;
        int hashCode23 = (hashCode22 + (shortVideoMainTabStateDto == null ? 0 : shortVideoMainTabStateDto.hashCode())) * 31;
        Boolean bool8 = this.hideClosingAdBanner;
        int hashCode24 = (hashCode23 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        List<String> list6 = this.highlightedHashtags;
        int hashCode25 = (hashCode24 + (list6 == null ? 0 : list6.hashCode())) * 31;
        ShortVideoGoodsInfoDto shortVideoGoodsInfoDto = this.goodsInfo;
        int hashCode26 = (hashCode25 + (shortVideoGoodsInfoDto == null ? 0 : shortVideoGoodsInfoDto.hashCode())) * 31;
        ShortVideoAdsFeaturesDto shortVideoAdsFeaturesDto = this.adsFeatures;
        int hashCode27 = (hashCode26 + (shortVideoAdsFeaturesDto == null ? 0 : shortVideoAdsFeaturesDto.hashCode())) * 31;
        List<ShortVideoShortVideoTrendingHashtagDto> list7 = this.trendingHashtags;
        int hashCode28 = (hashCode27 + (list7 == null ? 0 : list7.hashCode())) * 31;
        ShortVideoShortVideoNewsMonothemeDto shortVideoShortVideoNewsMonothemeDto = this.newsMonotheme;
        return hashCode28 + (shortVideoShortVideoNewsMonothemeDto != null ? shortVideoShortVideoNewsMonothemeDto.hashCode() : 0);
    }

    public final Boolean i() {
        return this.canMakeDuet;
    }

    public final ShortVideoClickableStickersDto j() {
        return this.clickableStickers;
    }

    public final ClipsUserLinkModerationDto k() {
        return this.clipsUserLinkModeration;
    }

    public final List<ShortVideoCoOwnerDto> l() {
        return this.coOwners;
    }

    public final ShortVideoDuetDto n() {
        return this.duet;
    }

    public final List<MasksEffectDto> o() {
        return this.effects;
    }

    public final List<String> p() {
        return this.highlightedHashtags;
    }

    public final String toString() {
        return "ShortVideoShortVideoInfoDto(clickableStickers=" + this.clickableStickers + ", masks=" + this.masks + ", effects=" + this.effects + ", audio=" + this.audio + ", originalSoundStatus=" + this.originalSoundStatus + ", interactive=" + this.interactive + ", canMakeDuet=" + this.canMakeDuet + ", showMakeDuetTooltip=" + this.showMakeDuetTooltip + ", duet=" + this.duet + ", compilations=" + this.compilations + ", miniAppId=" + this.miniAppId + ", contestId=" + this.contestId + ", friendsOnly=" + this.friendsOnly + ", anonCanLike=" + this.anonCanLike + ", anonUserLikeExists=" + this.anonUserLikeExists + ", sourceVideo=" + this.sourceVideo + ", audioTemplate=" + this.audioTemplate + ", clipsUserLinkModeration=" + this.clipsUserLinkModeration + ", popular=" + this.popular + ", playlists=" + this.playlists + ", favorite=" + this.favorite + ", coOwners=" + this.coOwners + ", mainTabState=" + this.mainTabState + ", hideClosingAdBanner=" + this.hideClosingAdBanner + ", highlightedHashtags=" + this.highlightedHashtags + ", goodsInfo=" + this.goodsInfo + ", adsFeatures=" + this.adsFeatures + ", trendingHashtags=" + this.trendingHashtags + ", newsMonotheme=" + this.newsMonotheme + ')';
    }

    public final ShortVideoMainTabStateDto u() {
        return this.mainTabState;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ShortVideoClickableStickersDto shortVideoClickableStickersDto = this.clickableStickers;
        if (shortVideoClickableStickersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoClickableStickersDto.writeToParcel(parcel, i);
        }
        List<MasksMaskDto> list = this.masks;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MasksMaskDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<MasksEffectDto> list2 = this.effects;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((MasksEffectDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        ShortVideoAudioDto shortVideoAudioDto = this.audio;
        if (shortVideoAudioDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoAudioDto.writeToParcel(parcel, i);
        }
        OriginalSoundStatusDto originalSoundStatusDto = this.originalSoundStatus;
        if (originalSoundStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            originalSoundStatusDto.writeToParcel(parcel, i);
        }
        ShortVideoInteractiveDto shortVideoInteractiveDto = this.interactive;
        if (shortVideoInteractiveDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoInteractiveDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.canMakeDuet;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.showMakeDuetTooltip;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        ShortVideoDuetDto shortVideoDuetDto = this.duet;
        if (shortVideoDuetDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoDuetDto.writeToParcel(parcel, i);
        }
        List<ShortVideoCompilationInfoDto> list3 = this.compilations;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((ShortVideoCompilationInfoDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        Integer num = this.miniAppId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.contestId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool3 = this.friendsOnly;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.anonCanLike;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.anonUserLikeExists;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        ShortVideoSourceVideoDto shortVideoSourceVideoDto = this.sourceVideo;
        if (shortVideoSourceVideoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoSourceVideoDto.writeToParcel(parcel, i);
        }
        ShortVideoAudioTemplateInfoDto shortVideoAudioTemplateInfoDto = this.audioTemplate;
        if (shortVideoAudioTemplateInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoAudioTemplateInfoDto.writeToParcel(parcel, i);
        }
        ClipsUserLinkModerationDto clipsUserLinkModerationDto = this.clipsUserLinkModeration;
        if (clipsUserLinkModerationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            clipsUserLinkModerationDto.writeToParcel(parcel, i);
        }
        Boolean bool6 = this.popular;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        List<ShortVideoPlaylistMinDto> list4 = this.playlists;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((ShortVideoPlaylistMinDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool7 = this.favorite;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        List<ShortVideoCoOwnerDto> list5 = this.coOwners;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                ((ShortVideoCoOwnerDto) f5.next()).writeToParcel(parcel, i);
            }
        }
        ShortVideoMainTabStateDto shortVideoMainTabStateDto = this.mainTabState;
        if (shortVideoMainTabStateDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoMainTabStateDto.writeToParcel(parcel, i);
        }
        Boolean bool8 = this.hideClosingAdBanner;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool8);
        }
        parcel.writeStringList(this.highlightedHashtags);
        ShortVideoGoodsInfoDto shortVideoGoodsInfoDto = this.goodsInfo;
        if (shortVideoGoodsInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoGoodsInfoDto.writeToParcel(parcel, i);
        }
        ShortVideoAdsFeaturesDto shortVideoAdsFeaturesDto = this.adsFeatures;
        if (shortVideoAdsFeaturesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoAdsFeaturesDto.writeToParcel(parcel, i);
        }
        List<ShortVideoShortVideoTrendingHashtagDto> list6 = this.trendingHashtags;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list6, 1);
            while (f6.hasNext()) {
                ((ShortVideoShortVideoTrendingHashtagDto) f6.next()).writeToParcel(parcel, i);
            }
        }
        ShortVideoShortVideoNewsMonothemeDto shortVideoShortVideoNewsMonothemeDto = this.newsMonotheme;
        if (shortVideoShortVideoNewsMonothemeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoShortVideoNewsMonothemeDto.writeToParcel(parcel, i);
        }
    }

    public ShortVideoShortVideoInfoDto(ShortVideoClickableStickersDto shortVideoClickableStickersDto, List<MasksMaskDto> list, List<MasksEffectDto> list2, ShortVideoAudioDto shortVideoAudioDto, OriginalSoundStatusDto originalSoundStatusDto, ShortVideoInteractiveDto shortVideoInteractiveDto, Boolean bool, Boolean bool2, ShortVideoDuetDto shortVideoDuetDto, List<ShortVideoCompilationInfoDto> list3, Integer num, Integer num2, Boolean bool3, Boolean bool4, Boolean bool5, ShortVideoSourceVideoDto shortVideoSourceVideoDto, ShortVideoAudioTemplateInfoDto shortVideoAudioTemplateInfoDto, ClipsUserLinkModerationDto clipsUserLinkModerationDto, Boolean bool6, List<ShortVideoPlaylistMinDto> list4, Boolean bool7, List<ShortVideoCoOwnerDto> list5, ShortVideoMainTabStateDto shortVideoMainTabStateDto, Boolean bool8, List<String> list6, ShortVideoGoodsInfoDto shortVideoGoodsInfoDto, ShortVideoAdsFeaturesDto shortVideoAdsFeaturesDto, List<ShortVideoShortVideoTrendingHashtagDto> list7, ShortVideoShortVideoNewsMonothemeDto shortVideoShortVideoNewsMonothemeDto) {
        this.clickableStickers = shortVideoClickableStickersDto;
        this.masks = list;
        this.effects = list2;
        this.audio = shortVideoAudioDto;
        this.originalSoundStatus = originalSoundStatusDto;
        this.interactive = shortVideoInteractiveDto;
        this.canMakeDuet = bool;
        this.showMakeDuetTooltip = bool2;
        this.duet = shortVideoDuetDto;
        this.compilations = list3;
        this.miniAppId = num;
        this.contestId = num2;
        this.friendsOnly = bool3;
        this.anonCanLike = bool4;
        this.anonUserLikeExists = bool5;
        this.sourceVideo = shortVideoSourceVideoDto;
        this.audioTemplate = shortVideoAudioTemplateInfoDto;
        this.clipsUserLinkModeration = clipsUserLinkModerationDto;
        this.popular = bool6;
        this.playlists = list4;
        this.favorite = bool7;
        this.coOwners = list5;
        this.mainTabState = shortVideoMainTabStateDto;
        this.hideClosingAdBanner = bool8;
        this.highlightedHashtags = list6;
        this.goodsInfo = shortVideoGoodsInfoDto;
        this.adsFeatures = shortVideoAdsFeaturesDto;
        this.trendingHashtags = list7;
        this.newsMonotheme = shortVideoShortVideoNewsMonothemeDto;
    }

    public /* synthetic */ ShortVideoShortVideoInfoDto(ShortVideoClickableStickersDto shortVideoClickableStickersDto, List list, List list2, ShortVideoAudioDto shortVideoAudioDto, OriginalSoundStatusDto originalSoundStatusDto, ShortVideoInteractiveDto shortVideoInteractiveDto, Boolean bool, Boolean bool2, ShortVideoDuetDto shortVideoDuetDto, List list3, Integer num, Integer num2, Boolean bool3, Boolean bool4, Boolean bool5, ShortVideoSourceVideoDto shortVideoSourceVideoDto, ShortVideoAudioTemplateInfoDto shortVideoAudioTemplateInfoDto, ClipsUserLinkModerationDto clipsUserLinkModerationDto, Boolean bool6, List list4, Boolean bool7, List list5, ShortVideoMainTabStateDto shortVideoMainTabStateDto, Boolean bool8, List list6, ShortVideoGoodsInfoDto shortVideoGoodsInfoDto, ShortVideoAdsFeaturesDto shortVideoAdsFeaturesDto, List list7, ShortVideoShortVideoNewsMonothemeDto shortVideoShortVideoNewsMonothemeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : shortVideoClickableStickersDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : shortVideoAudioDto, (i & 16) != 0 ? null : originalSoundStatusDto, (i & 32) != 0 ? null : shortVideoInteractiveDto, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : shortVideoDuetDto, (i & 512) != 0 ? null : list3, (i & 1024) != 0 ? null : num, (i & 2048) != 0 ? null : num2, (i & 4096) != 0 ? null : bool3, (i & 8192) != 0 ? null : bool4, (i & 16384) != 0 ? null : bool5, (i & 32768) != 0 ? null : shortVideoSourceVideoDto, (i & 65536) != 0 ? null : shortVideoAudioTemplateInfoDto, (i & 131072) != 0 ? null : clipsUserLinkModerationDto, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool6, (i & 524288) != 0 ? null : list4, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool7, (i & 2097152) != 0 ? null : list5, (i & 4194304) != 0 ? null : shortVideoMainTabStateDto, (i & 8388608) != 0 ? null : bool8, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : list6, (i & 33554432) != 0 ? null : shortVideoGoodsInfoDto, (i & 67108864) != 0 ? null : shortVideoAdsFeaturesDto, (i & 134217728) != 0 ? null : list7, (i & 268435456) != 0 ? null : shortVideoShortVideoNewsMonothemeDto);
    }
}
