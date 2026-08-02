package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.actionLinks.dto.ActionLinksActionDto;
import com.vk.api.generated.base.dto.BasePrivacyDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VideoVideoForEditDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoForEditDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoForEditDto> CREATOR = new a();

    @pmi0("access_by_link_key")
    private final String accessByLinkKey;

    @pmi0("action_button")
    private final ActionLinksActionDto actionButton;

    @pmi0("add_to_wall")
    private final Boolean addToWall;

    @pmi0("attached_short_videos")
    private final List<VideoVideoDto> attachedShortVideos;

    @pmi0("auto_episodes")
    private final VideoVideoForEditAutoEpisodesDto autoEpisodes;

    @pmi0("can_attach_short_videos")
    private final Boolean canAttachShortVideos;

    @pmi0("can_generate_episodes")
    private final Boolean canGenerateEpisodes;

    @pmi0("can_start_cover_ab_test")
    private final Boolean canStartCoverAbTest;

    @pmi0("check_content_id")
    private final Boolean checkContentId;

    @pmi0("cover_ab_test_settings")
    private final VideoCoverAbTestDto coverAbTestSettings;

    @pmi0("description")
    private final String description;

    @pmi0("donut_level_id")
    private final Integer donutLevelId;

    @pmi0("duration")
    private final int duration;

    @pmi0("hide_auto_subs")
    private final Boolean hideAutoSubs;

    @pmi0("image")
    private final List<VideoVideoImageDto> image;

    @pmi0("is_draft")
    private final Boolean isDraft;

    @pmi0("ord_info")
    private final VideoOrdInfoDto ordInfo;

    @pmi0("playlists")
    private final List<VideoVideoAlbumFullDto> playlists;

    @pmi0("privacy_comment")
    private final BasePrivacyDto privacyComment;

    @pmi0("privacy_cut_to_short_video")
    private final VideoPrivacyCutToShortVideoDto privacyCutToShortVideo;

    @pmi0("privacy_view")
    private final BasePrivacyDto privacyView;

    @pmi0("published_at")
    private final Integer publishedAt;

    @pmi0("source_file_name")
    private final String sourceFileName;

    @pmi0("subtitle_default")
    private final String subtitleDefault;

    @pmi0("subtitles")
    private final List<VideoSubtitlesDto> subtitles;

    @pmi0("thumb_upload_url")
    private final String thumbUploadUrl;

    @pmi0("timeline_thumb_best_index")
    private final Integer timelineThumbBestIndex;

    @pmi0("timeline_thumb_selected_index")
    private final Integer timelineThumbSelectedIndex;

    @pmi0("timeline_thumbs")
    private final List<VideoVideoForEditTimelineThumbDto> timelineThumbs;

    @pmi0("title")
    private final String title;

    /* compiled from: VideoVideoForEditDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoForEditDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoForEditDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean valueOf3;
            VideoPrivacyCutToShortVideoDto videoPrivacyCutToShortVideoDto;
            String str;
            ArrayList arrayList3;
            int i;
            ArrayList arrayList4;
            ArrayList arrayList5;
            Integer num;
            ArrayList arrayList6;
            Integer num2;
            ArrayList arrayList7;
            boolean z;
            String str2;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean valueOf6;
            Boolean valueOf7;
            ArrayList arrayList8;
            VideoCoverAbTestDto createFromParcel;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
            int i2 = 0;
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(VideoVideoForEditDto.class, parcel, arrayList, i3, 1);
                }
            }
            ActionLinksActionDto actionLinksActionDto = (ActionLinksActionDto) parcel.readParcelable(VideoVideoForEditDto.class.getClassLoader());
            VideoOrdInfoDto videoOrdInfoDto = (VideoOrdInfoDto) parcel.readParcelable(VideoVideoForEditDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                while (i2 != readInt3) {
                    i2 = bo.b(VideoVideoForEditDto.class, parcel, arrayList2, i2, 1);
                }
            }
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            BasePrivacyDto basePrivacyDto = (BasePrivacyDto) parcel.readParcelable(VideoVideoForEditDto.class.getClassLoader());
            BasePrivacyDto basePrivacyDto2 = (BasePrivacyDto) parcel.readParcelable(VideoVideoForEditDto.class.getClassLoader());
            VideoPrivacyCutToShortVideoDto videoPrivacyCutToShortVideoDto2 = (VideoPrivacyCutToShortVideoDto) parcel.readParcelable(VideoVideoForEditDto.class.getClassLoader());
            Integer valueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                videoPrivacyCutToShortVideoDto = videoPrivacyCutToShortVideoDto2;
                str = readString2;
                i = readInt;
                arrayList3 = null;
            } else {
                videoPrivacyCutToShortVideoDto = videoPrivacyCutToShortVideoDto2;
                int readInt4 = parcel.readInt();
                str = readString2;
                arrayList3 = new ArrayList(readInt4);
                i = readInt;
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = bo.b(VideoVideoForEditDto.class, parcel, arrayList3, i4, 1);
                    readInt4 = readInt4;
                }
            }
            if (parcel.readInt() == 0) {
                arrayList5 = arrayList3;
                arrayList4 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList4 = new ArrayList(readInt5);
                arrayList5 = arrayList3;
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = en.a(VideoVideoForEditTimelineThumbDto.CREATOR, parcel, arrayList4, i5, 1);
                    readInt5 = readInt5;
                    valueOf8 = valueOf8;
                }
            }
            Integer num3 = valueOf8;
            Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf11 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                num = valueOf10;
                num2 = valueOf11;
                arrayList6 = null;
                arrayList7 = arrayList4;
                str2 = str;
                z = true;
            } else {
                int readInt6 = parcel.readInt();
                num = valueOf10;
                arrayList6 = new ArrayList(readInt6);
                num2 = valueOf11;
                int i6 = 0;
                while (true) {
                    arrayList7 = arrayList4;
                    z = true;
                    if (i6 == readInt6) {
                        break;
                    }
                    i6 = bo.b(VideoVideoForEditDto.class, parcel, arrayList6, i6, 1);
                    arrayList4 = arrayList7;
                }
                str2 = str;
            }
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0 ? z : false);
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0 ? z : false);
            }
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Boolean.valueOf(parcel.readInt() != 0 ? z : false);
            }
            boolean z2 = z;
            int i7 = i;
            Boolean bool = valueOf4;
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                valueOf7 = Boolean.valueOf(z2);
            }
            if (parcel.readInt() == 0) {
                arrayList8 = arrayList6;
                createFromParcel = null;
            } else {
                arrayList8 = arrayList6;
                createFromParcel = VideoCoverAbTestDto.CREATOR.createFromParcel(parcel);
            }
            return new VideoVideoForEditDto(readString, str2, i7, num3, valueOf, valueOf2, readString3, arrayList, actionLinksActionDto, videoOrdInfoDto, arrayList2, readString4, valueOf3, basePrivacyDto, basePrivacyDto2, videoPrivacyCutToShortVideoDto, valueOf9, arrayList5, arrayList7, num, num2, arrayList8, readString5, bool, valueOf5, valueOf6, readString6, valueOf7, createFromParcel, parcel.readInt() == 0 ? null : VideoVideoForEditAutoEpisodesDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoForEditDto[] newArray(int i) {
            return new VideoVideoForEditDto[i];
        }
    }

    public VideoVideoForEditDto(String str, String str2, int i, Integer num, Boolean bool, Boolean bool2, String str3, List<VideoVideoDto> list, ActionLinksActionDto actionLinksActionDto, VideoOrdInfoDto videoOrdInfoDto, List<VideoSubtitlesDto> list2, String str4, Boolean bool3, BasePrivacyDto basePrivacyDto, BasePrivacyDto basePrivacyDto2, VideoPrivacyCutToShortVideoDto videoPrivacyCutToShortVideoDto, Integer num2, List<VideoVideoAlbumFullDto> list3, List<VideoVideoForEditTimelineThumbDto> list4, Integer num3, Integer num4, List<VideoVideoImageDto> list5, String str5, Boolean bool4, Boolean bool5, Boolean bool6, String str6, Boolean bool7, VideoCoverAbTestDto videoCoverAbTestDto, VideoVideoForEditAutoEpisodesDto videoVideoForEditAutoEpisodesDto) {
        this.title = str;
        this.description = str2;
        this.duration = i;
        this.publishedAt = num;
        this.isDraft = bool;
        this.addToWall = bool2;
        this.sourceFileName = str3;
        this.attachedShortVideos = list;
        this.actionButton = actionLinksActionDto;
        this.ordInfo = videoOrdInfoDto;
        this.subtitles = list2;
        this.subtitleDefault = str4;
        this.hideAutoSubs = bool3;
        this.privacyView = basePrivacyDto;
        this.privacyComment = basePrivacyDto2;
        this.privacyCutToShortVideo = videoPrivacyCutToShortVideoDto;
        this.donutLevelId = num2;
        this.playlists = list3;
        this.timelineThumbs = list4;
        this.timelineThumbSelectedIndex = num3;
        this.timelineThumbBestIndex = num4;
        this.image = list5;
        this.thumbUploadUrl = str5;
        this.checkContentId = bool4;
        this.canAttachShortVideos = bool5;
        this.canGenerateEpisodes = bool6;
        this.accessByLinkKey = str6;
        this.canStartCoverAbTest = bool7;
        this.coverAbTestSettings = videoCoverAbTestDto;
        this.autoEpisodes = videoVideoForEditAutoEpisodesDto;
    }

    public final List<VideoVideoForEditTimelineThumbDto> B() {
        return this.timelineThumbs;
    }

    public final Boolean C() {
        return this.isDraft;
    }

    public final ActionLinksActionDto d() {
        return this.actionButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<VideoVideoDto> e() {
        return this.attachedShortVideos;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoForEditDto)) {
            return false;
        }
        VideoVideoForEditDto videoVideoForEditDto = (VideoVideoForEditDto) obj;
        return epx.f(this.title, videoVideoForEditDto.title) && epx.f(this.description, videoVideoForEditDto.description) && this.duration == videoVideoForEditDto.duration && epx.f(this.publishedAt, videoVideoForEditDto.publishedAt) && epx.f(this.isDraft, videoVideoForEditDto.isDraft) && epx.f(this.addToWall, videoVideoForEditDto.addToWall) && epx.f(this.sourceFileName, videoVideoForEditDto.sourceFileName) && epx.f(this.attachedShortVideos, videoVideoForEditDto.attachedShortVideos) && epx.f(this.actionButton, videoVideoForEditDto.actionButton) && epx.f(this.ordInfo, videoVideoForEditDto.ordInfo) && epx.f(this.subtitles, videoVideoForEditDto.subtitles) && epx.f(this.subtitleDefault, videoVideoForEditDto.subtitleDefault) && epx.f(this.hideAutoSubs, videoVideoForEditDto.hideAutoSubs) && epx.f(this.privacyView, videoVideoForEditDto.privacyView) && epx.f(this.privacyComment, videoVideoForEditDto.privacyComment) && this.privacyCutToShortVideo == videoVideoForEditDto.privacyCutToShortVideo && epx.f(this.donutLevelId, videoVideoForEditDto.donutLevelId) && epx.f(this.playlists, videoVideoForEditDto.playlists) && epx.f(this.timelineThumbs, videoVideoForEditDto.timelineThumbs) && epx.f(this.timelineThumbSelectedIndex, videoVideoForEditDto.timelineThumbSelectedIndex) && epx.f(this.timelineThumbBestIndex, videoVideoForEditDto.timelineThumbBestIndex) && epx.f(this.image, videoVideoForEditDto.image) && epx.f(this.thumbUploadUrl, videoVideoForEditDto.thumbUploadUrl) && epx.f(this.checkContentId, videoVideoForEditDto.checkContentId) && epx.f(this.canAttachShortVideos, videoVideoForEditDto.canAttachShortVideos) && epx.f(this.canGenerateEpisodes, videoVideoForEditDto.canGenerateEpisodes) && epx.f(this.accessByLinkKey, videoVideoForEditDto.accessByLinkKey) && epx.f(this.canStartCoverAbTest, videoVideoForEditDto.canStartCoverAbTest) && epx.f(this.coverAbTestSettings, videoVideoForEditDto.coverAbTestSettings) && epx.f(this.autoEpisodes, videoVideoForEditDto.autoEpisodes);
    }

    public final Integer f() {
        return this.donutLevelId;
    }

    public final List<VideoVideoImageDto> g() {
        return this.image;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = shy.a(this.duration, urd0.a(this.title.hashCode() * 31, 31, this.description), 31);
        Integer num = this.publishedAt;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isDraft;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.addToWall;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.sourceFileName;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<VideoVideoDto> list = this.attachedShortVideos;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        ActionLinksActionDto actionLinksActionDto = this.actionButton;
        int hashCode6 = (hashCode5 + (actionLinksActionDto == null ? 0 : actionLinksActionDto.hashCode())) * 31;
        VideoOrdInfoDto videoOrdInfoDto = this.ordInfo;
        int hashCode7 = (hashCode6 + (videoOrdInfoDto == null ? 0 : videoOrdInfoDto.hashCode())) * 31;
        List<VideoSubtitlesDto> list2 = this.subtitles;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.subtitleDefault;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool3 = this.hideAutoSubs;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        BasePrivacyDto basePrivacyDto = this.privacyView;
        int hashCode11 = (hashCode10 + (basePrivacyDto == null ? 0 : basePrivacyDto.hashCode())) * 31;
        BasePrivacyDto basePrivacyDto2 = this.privacyComment;
        int hashCode12 = (hashCode11 + (basePrivacyDto2 == null ? 0 : basePrivacyDto2.hashCode())) * 31;
        VideoPrivacyCutToShortVideoDto videoPrivacyCutToShortVideoDto = this.privacyCutToShortVideo;
        int hashCode13 = (hashCode12 + (videoPrivacyCutToShortVideoDto == null ? 0 : videoPrivacyCutToShortVideoDto.hashCode())) * 31;
        Integer num2 = this.donutLevelId;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<VideoVideoAlbumFullDto> list3 = this.playlists;
        int hashCode15 = (hashCode14 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<VideoVideoForEditTimelineThumbDto> list4 = this.timelineThumbs;
        int hashCode16 = (hashCode15 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Integer num3 = this.timelineThumbSelectedIndex;
        int hashCode17 = (hashCode16 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.timelineThumbBestIndex;
        int hashCode18 = (hashCode17 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<VideoVideoImageDto> list5 = this.image;
        int hashCode19 = (hashCode18 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str3 = this.thumbUploadUrl;
        int hashCode20 = (hashCode19 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool4 = this.checkContentId;
        int hashCode21 = (hashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.canAttachShortVideos;
        int hashCode22 = (hashCode21 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.canGenerateEpisodes;
        int hashCode23 = (hashCode22 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str4 = this.accessByLinkKey;
        int hashCode24 = (hashCode23 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool7 = this.canStartCoverAbTest;
        int hashCode25 = (hashCode24 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        VideoCoverAbTestDto videoCoverAbTestDto = this.coverAbTestSettings;
        int hashCode26 = (hashCode25 + (videoCoverAbTestDto == null ? 0 : videoCoverAbTestDto.hashCode())) * 31;
        VideoVideoForEditAutoEpisodesDto videoVideoForEditAutoEpisodesDto = this.autoEpisodes;
        return hashCode26 + (videoVideoForEditAutoEpisodesDto != null ? videoVideoForEditAutoEpisodesDto.hashCode() : 0);
    }

    public final VideoOrdInfoDto i() {
        return this.ordInfo;
    }

    public final BasePrivacyDto j() {
        return this.privacyComment;
    }

    public final BasePrivacyDto k() {
        return this.privacyView;
    }

    public final Integer l() {
        return this.publishedAt;
    }

    public final String n() {
        return this.sourceFileName;
    }

    public final List<VideoSubtitlesDto> o() {
        return this.subtitles;
    }

    public final Integer p() {
        return this.timelineThumbBestIndex;
    }

    public final String toString() {
        return "VideoVideoForEditDto(title=" + this.title + ", description=" + this.description + ", duration=" + this.duration + ", publishedAt=" + this.publishedAt + ", isDraft=" + this.isDraft + ", addToWall=" + this.addToWall + ", sourceFileName=" + this.sourceFileName + ", attachedShortVideos=" + this.attachedShortVideos + ", actionButton=" + this.actionButton + ", ordInfo=" + this.ordInfo + ", subtitles=" + this.subtitles + ", subtitleDefault=" + this.subtitleDefault + ", hideAutoSubs=" + this.hideAutoSubs + ", privacyView=" + this.privacyView + ", privacyComment=" + this.privacyComment + ", privacyCutToShortVideo=" + this.privacyCutToShortVideo + ", donutLevelId=" + this.donutLevelId + ", playlists=" + this.playlists + ", timelineThumbs=" + this.timelineThumbs + ", timelineThumbSelectedIndex=" + this.timelineThumbSelectedIndex + ", timelineThumbBestIndex=" + this.timelineThumbBestIndex + ", image=" + this.image + ", thumbUploadUrl=" + this.thumbUploadUrl + ", checkContentId=" + this.checkContentId + ", canAttachShortVideos=" + this.canAttachShortVideos + ", canGenerateEpisodes=" + this.canGenerateEpisodes + ", accessByLinkKey=" + this.accessByLinkKey + ", canStartCoverAbTest=" + this.canStartCoverAbTest + ", coverAbTestSettings=" + this.coverAbTestSettings + ", autoEpisodes=" + this.autoEpisodes + ')';
    }

    public final Integer u() {
        return this.timelineThumbSelectedIndex;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeInt(this.duration);
        Integer num = this.publishedAt;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.isDraft;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.addToWall;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.sourceFileName);
        List<VideoVideoDto> list = this.attachedShortVideos;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeParcelable(this.actionButton, i);
        parcel.writeParcelable(this.ordInfo, i);
        List<VideoSubtitlesDto> list2 = this.subtitles;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        parcel.writeString(this.subtitleDefault);
        Boolean bool3 = this.hideAutoSubs;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        parcel.writeParcelable(this.privacyView, i);
        parcel.writeParcelable(this.privacyComment, i);
        parcel.writeParcelable(this.privacyCutToShortVideo, i);
        Integer num2 = this.donutLevelId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        List<VideoVideoAlbumFullDto> list3 = this.playlists;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        List<VideoVideoForEditTimelineThumbDto> list4 = this.timelineThumbs;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((VideoVideoForEditTimelineThumbDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        Integer num3 = this.timelineThumbSelectedIndex;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.timelineThumbBestIndex;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        List<VideoVideoImageDto> list5 = this.image;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                parcel.writeParcelable((Parcelable) f5.next(), i);
            }
        }
        parcel.writeString(this.thumbUploadUrl);
        Boolean bool4 = this.checkContentId;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.canAttachShortVideos;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.canGenerateEpisodes;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
        parcel.writeString(this.accessByLinkKey);
        Boolean bool7 = this.canStartCoverAbTest;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool7);
        }
        VideoCoverAbTestDto videoCoverAbTestDto = this.coverAbTestSettings;
        if (videoCoverAbTestDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoCoverAbTestDto.writeToParcel(parcel, i);
        }
        VideoVideoForEditAutoEpisodesDto videoVideoForEditAutoEpisodesDto = this.autoEpisodes;
        if (videoVideoForEditAutoEpisodesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoVideoForEditAutoEpisodesDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoVideoForEditDto(String str, String str2, int i, Integer num, Boolean bool, Boolean bool2, String str3, List list, ActionLinksActionDto actionLinksActionDto, VideoOrdInfoDto videoOrdInfoDto, List list2, String str4, Boolean bool3, BasePrivacyDto basePrivacyDto, BasePrivacyDto basePrivacyDto2, VideoPrivacyCutToShortVideoDto videoPrivacyCutToShortVideoDto, Integer num2, List list3, List list4, Integer num3, Integer num4, List list5, String str5, Boolean bool4, Boolean bool5, Boolean bool6, String str6, Boolean bool7, VideoCoverAbTestDto videoCoverAbTestDto, VideoVideoForEditAutoEpisodesDto videoVideoForEditAutoEpisodesDto, int i2, zcl zclVar) {
        this(str, str2, i, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : bool2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : list, (i2 & 256) != 0 ? null : actionLinksActionDto, (i2 & 512) != 0 ? null : videoOrdInfoDto, (i2 & 1024) != 0 ? null : list2, (i2 & 2048) != 0 ? null : str4, (i2 & 4096) != 0 ? null : bool3, (i2 & 8192) != 0 ? null : basePrivacyDto, (i2 & 16384) != 0 ? null : basePrivacyDto2, (32768 & i2) != 0 ? null : videoPrivacyCutToShortVideoDto, (65536 & i2) != 0 ? null : num2, (131072 & i2) != 0 ? null : list3, (262144 & i2) != 0 ? null : list4, (524288 & i2) != 0 ? null : num3, (1048576 & i2) != 0 ? null : num4, (2097152 & i2) != 0 ? null : list5, (4194304 & i2) != 0 ? null : str5, (8388608 & i2) != 0 ? null : bool4, (16777216 & i2) != 0 ? null : bool5, (33554432 & i2) != 0 ? null : bool6, (67108864 & i2) != 0 ? null : str6, (134217728 & i2) != 0 ? null : bool7, (268435456 & i2) != 0 ? null : videoCoverAbTestDto, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : videoVideoForEditAutoEpisodesDto);
    }
}
