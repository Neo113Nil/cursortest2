package com.vk.libvideo.api.minimizable;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.api.ui.VideoFeedDialogParams;
import com.vk.libvideo.api.ui.VideoTransitionSource;
import com.vk.libvideo.models.comment.ReplyInfo;
import defpackage.q0;
import kotlin.NoWhenBranchMatchedException;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.zcl;

/* compiled from: VideoMinimizableScreenArgs.kt */
/* loaded from: classes2.dex */
public final class VideoMinimizableScreenArgs implements Parcelable {
    public static final Parcelable.Creator<VideoMinimizableScreenArgs> CREATOR = new b();
    public final ControllerArgs b;
    public final RelatedVideoArgs c;
    public final ReplyInfo d;
    public final VideoTransitionSource e;

    /* compiled from: VideoMinimizableScreenArgs.kt */
    public static abstract class RelatedVideoArgs implements Parcelable {

        /* compiled from: VideoMinimizableScreenArgs.kt */
        public static final class MusicMix extends RelatedVideoArgs {
            public static final Parcelable.Creator<MusicMix> CREATOR = new a();
            public final String b;

            /* compiled from: VideoMinimizableScreenArgs.kt */
            public static final class a implements Parcelable.Creator<MusicMix> {
                @Override // android.os.Parcelable.Creator
                public final MusicMix createFromParcel(Parcel parcel) {
                    return new MusicMix(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final MusicMix[] newArray(int i) {
                    return new MusicMix[i];
                }
            }

            public MusicMix(String str) {
                super(null);
                this.b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MusicMix) && epx.f(this.b, ((MusicMix) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("MusicMix(payload="), this.b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
            }
        }

        /* compiled from: VideoMinimizableScreenArgs.kt */
        public static final class OfflineVideos extends RelatedVideoArgs {
            public static final OfflineVideos b = new OfflineVideos(null);
            public static final Parcelable.Creator<OfflineVideos> CREATOR = new a();

            /* compiled from: VideoMinimizableScreenArgs.kt */
            public static final class a implements Parcelable.Creator<OfflineVideos> {
                @Override // android.os.Parcelable.Creator
                public final OfflineVideos createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return OfflineVideos.b;
                }

                @Override // android.os.Parcelable.Creator
                public final OfflineVideos[] newArray(int i) {
                    return new OfflineVideos[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: VideoMinimizableScreenArgs.kt */
        public static final class Playlist extends RelatedVideoArgs {
            public static final Parcelable.Creator<Playlist> CREATOR = new a();
            public final int b;
            public final UserId c;
            public final boolean d;
            public final int e;
            public final VideoFile f;

            /* compiled from: VideoMinimizableScreenArgs.kt */
            public static final class a implements Parcelable.Creator<Playlist> {
                @Override // android.os.Parcelable.Creator
                public final Playlist createFromParcel(Parcel parcel) {
                    return new Playlist(parcel.readInt(), (UserId) parcel.readParcelable(Playlist.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt(), (VideoFile) parcel.readParcelable(Playlist.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Playlist[] newArray(int i) {
                    return new Playlist[i];
                }
            }

            public /* synthetic */ Playlist(int i, UserId userId, boolean z, int i2, VideoFile videoFile, int i3, zcl zclVar) {
                this(i, userId, z, (i3 & 8) != 0 ? -1 : i2, videoFile);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b);
                parcel.writeParcelable(this.c, i);
                parcel.writeInt(this.d ? 1 : 0);
                parcel.writeInt(this.e);
                parcel.writeParcelable(this.f, i);
            }

            public Playlist(int i, UserId userId, boolean z, int i2, VideoFile videoFile) {
                super(null);
                this.b = i;
                this.c = userId;
                this.d = z;
                this.e = i2;
                this.f = videoFile;
            }
        }

        /* compiled from: VideoMinimizableScreenArgs.kt */
        public static final class Recommendations extends RelatedVideoArgs {
            public static final Recommendations b = new Recommendations(null);
            public static final Parcelable.Creator<Recommendations> CREATOR = new a();

            /* compiled from: VideoMinimizableScreenArgs.kt */
            public static final class a implements Parcelable.Creator<Recommendations> {
                @Override // android.os.Parcelable.Creator
                public final Recommendations createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Recommendations.b;
                }

                @Override // android.os.Parcelable.Creator
                public final Recommendations[] newArray(int i) {
                    return new Recommendations[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: VideoMinimizableScreenArgs.kt */
        public static final class TemporaryPlaylist extends RelatedVideoArgs {
            public static final Parcelable.Creator<TemporaryPlaylist> CREATOR = new a();
            public final String b;
            public final UserId c;
            public final boolean d;
            public final String e;

            /* compiled from: VideoMinimizableScreenArgs.kt */
            public static final class a implements Parcelable.Creator<TemporaryPlaylist> {
                @Override // android.os.Parcelable.Creator
                public final TemporaryPlaylist createFromParcel(Parcel parcel) {
                    return new TemporaryPlaylist(parcel.readString(), (UserId) parcel.readParcelable(TemporaryPlaylist.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TemporaryPlaylist[] newArray(int i) {
                    return new TemporaryPlaylist[i];
                }
            }

            public TemporaryPlaylist(String str, UserId userId, boolean z, String str2) {
                super(null);
                this.b = str;
                this.c = userId;
                this.d = z;
                this.e = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
                parcel.writeParcelable(this.c, i);
                parcel.writeInt(this.d ? 1 : 0);
                parcel.writeString(this.e);
            }
        }

        public /* synthetic */ RelatedVideoArgs(zcl zclVar) {
            this();
        }

        public RelatedVideoArgs() {
        }
    }

    /* compiled from: VideoMinimizableScreenArgs.kt */
    public static final class a {
        public static VideoMinimizableScreenArgs a(VideoFile videoFile, VideoFeedDialogParams videoFeedDialogParams) {
            RelatedVideoArgs musicMix;
            String str = videoFeedDialogParams.b;
            String str2 = videoFeedDialogParams.c;
            SearchStatsLoggingInfo searchStatsLoggingInfo = videoFeedDialogParams.d;
            boolean z = videoFeedDialogParams instanceof VideoFeedDialogParams.Discover;
            VideoFeedDialogParams.Discover discover = z ? (VideoFeedDialogParams.Discover) videoFeedDialogParams : null;
            ControllerArgs controllerArgs = new ControllerArgs(videoFile, str, str2, searchStatsLoggingInfo, false, true, discover != null ? discover.i : null, videoFeedDialogParams.e, videoFeedDialogParams.f, 16, null);
            if (z) {
                Integer t9 = videoFile.t9();
                Long H1 = videoFile.H1();
                if (t9 == null || H1 == null) {
                    musicMix = null;
                } else {
                    long longValue = H1.longValue();
                    int intValue = t9.intValue();
                    VideoFeedDialogParams.Discover.DiscoverTemporaryPlaylistData discoverTemporaryPlaylistData = ((VideoFeedDialogParams.Discover) videoFeedDialogParams).k;
                    musicMix = (discoverTemporaryPlaylistData != null ? discoverTemporaryPlaylistData.b : null) != null ? new RelatedVideoArgs.TemporaryPlaylist(discoverTemporaryPlaylistData.b, new UserId(longValue), true, discoverTemporaryPlaylistData.c) : new RelatedVideoArgs.Playlist(intValue, new UserId(longValue), true, 0, videoFile, 8, null);
                }
                if (musicMix == null) {
                    musicMix = RelatedVideoArgs.Recommendations.b;
                }
            } else if (videoFeedDialogParams instanceof VideoFeedDialogParams.Playlist) {
                VideoFeedDialogParams.Playlist playlist = (VideoFeedDialogParams.Playlist) videoFeedDialogParams;
                musicMix = new RelatedVideoArgs.Playlist(playlist.h, playlist.i, false, playlist.m, videoFile);
            } else if (videoFeedDialogParams instanceof VideoFeedDialogParams.OfflineVideos) {
                musicMix = RelatedVideoArgs.OfflineVideos.b;
            } else {
                if (!(videoFeedDialogParams instanceof VideoFeedDialogParams.MusicMix)) {
                    throw new NoWhenBranchMatchedException();
                }
                musicMix = new RelatedVideoArgs.MusicMix(((VideoFeedDialogParams.MusicMix) videoFeedDialogParams).h);
            }
            VideoFeedDialogParams.Discover discover2 = z ? (VideoFeedDialogParams.Discover) videoFeedDialogParams : null;
            return new VideoMinimizableScreenArgs(controllerArgs, musicMix, discover2 != null ? discover2.j : null, videoFeedDialogParams.g);
        }
    }

    /* compiled from: VideoMinimizableScreenArgs.kt */
    public static final class b implements Parcelable.Creator<VideoMinimizableScreenArgs> {
        @Override // android.os.Parcelable.Creator
        public final VideoMinimizableScreenArgs createFromParcel(Parcel parcel) {
            return new VideoMinimizableScreenArgs(ControllerArgs.CREATOR.createFromParcel(parcel), (RelatedVideoArgs) parcel.readParcelable(VideoMinimizableScreenArgs.class.getClassLoader()), (ReplyInfo) parcel.readParcelable(VideoMinimizableScreenArgs.class.getClassLoader()), parcel.readInt() == 0 ? null : VideoTransitionSource.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoMinimizableScreenArgs[] newArray(int i) {
            return new VideoMinimizableScreenArgs[i];
        }
    }

    public VideoMinimizableScreenArgs(ControllerArgs controllerArgs, RelatedVideoArgs relatedVideoArgs, ReplyInfo replyInfo, VideoTransitionSource videoTransitionSource) {
        this.b = controllerArgs;
        this.c = relatedVideoArgs;
        this.d = replyInfo;
        this.e = videoTransitionSource;
    }

    public final ControllerArgs d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoMinimizableScreenArgs)) {
            return false;
        }
        VideoMinimizableScreenArgs videoMinimizableScreenArgs = (VideoMinimizableScreenArgs) obj;
        return epx.f(this.b, videoMinimizableScreenArgs.b) && epx.f(this.c, videoMinimizableScreenArgs.c) && epx.f(this.d, videoMinimizableScreenArgs.d) && epx.f(this.e, videoMinimizableScreenArgs.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        ReplyInfo replyInfo = this.d;
        int hashCode2 = (hashCode + (replyInfo == null ? 0 : replyInfo.hashCode())) * 31;
        VideoTransitionSource videoTransitionSource = this.e;
        return hashCode2 + (videoTransitionSource != null ? videoTransitionSource.hashCode() : 0);
    }

    public final String toString() {
        return "VideoMinimizableScreenArgs(controllerArgs=" + this.b + ", relatedVideoArgs=" + this.c + ", replyInfo=" + this.d + ", videoTransitionSource=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        VideoTransitionSource videoTransitionSource = this.e;
        if (videoTransitionSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoTransitionSource.writeToParcel(parcel, i);
        }
    }

    /* compiled from: VideoMinimizableScreenArgs.kt */
    public static final class ControllerArgs implements Parcelable {
        public static final Parcelable.Creator<ControllerArgs> CREATOR = new a();
        public final VideoFile b;
        public final String c;
        public final String d;
        public final SearchStatsLoggingInfo e;
        public final boolean f;
        public final boolean g;
        public final String h;
        public final long i;
        public final boolean j;

        /* compiled from: VideoMinimizableScreenArgs.kt */
        public static final class a implements Parcelable.Creator<ControllerArgs> {
            @Override // android.os.Parcelable.Creator
            public final ControllerArgs createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                VideoFile videoFile = (VideoFile) parcel.readParcelable(ControllerArgs.class.getClassLoader());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                SearchStatsLoggingInfo searchStatsLoggingInfo = (SearchStatsLoggingInfo) parcel.readParcelable(ControllerArgs.class.getClassLoader());
                boolean z3 = false;
                boolean z4 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                    z2 = true;
                } else {
                    z = false;
                    z2 = true;
                }
                String readString3 = parcel.readString();
                boolean z5 = z;
                boolean z6 = z2;
                long readLong = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z5 = z6;
                }
                return new ControllerArgs(videoFile, readString, readString2, searchStatsLoggingInfo, z4, z3, readString3, readLong, z5);
            }

            @Override // android.os.Parcelable.Creator
            public final ControllerArgs[] newArray(int i) {
                return new ControllerArgs[i];
            }
        }

        public ControllerArgs(VideoFile videoFile, String str, String str2, SearchStatsLoggingInfo searchStatsLoggingInfo, boolean z, boolean z2, String str3, long j, boolean z3) {
            this.b = videoFile;
            this.c = str;
            this.d = str2;
            this.e = searchStatsLoggingInfo;
            this.f = z;
            this.g = z2;
            this.h = str3;
            this.i = j;
            this.j = z3;
        }

        public final VideoFile A() {
            return this.b;
        }

        public final String C4() {
            return this.c;
        }

        public final SearchStatsLoggingInfo d() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ControllerArgs)) {
                return false;
            }
            ControllerArgs controllerArgs = (ControllerArgs) obj;
            return epx.f(this.b, controllerArgs.b) && epx.f(this.c, controllerArgs.c) && epx.f(this.d, controllerArgs.d) && epx.f(this.e, controllerArgs.e) && this.f == controllerArgs.f && this.g == controllerArgs.g && epx.f(this.h, controllerArgs.h) && this.i == controllerArgs.i && this.j == controllerArgs.j;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            SearchStatsLoggingInfo searchStatsLoggingInfo = this.e;
            int b = qoy.b(qoy.b((hashCode3 + (searchStatsLoggingInfo == null ? 0 : searchStatsLoggingInfo.hashCode())) * 31, 31, this.f), 31, this.g);
            String str3 = this.h;
            return Boolean.hashCode(this.j) + bh10.a((b + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.i);
        }

        public final String r() {
            return this.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ControllerArgs(videoFile=");
            sb.append(this.b);
            sb.append(", referrer=");
            sb.append(this.c);
            sb.append(", trackCode=");
            sb.append(this.d);
            sb.append(", searchStatsLoggingInfo=");
            sb.append(this.e);
            sb.append(", fromColdStart=");
            sb.append(this.f);
            sb.append(", clearQueue=");
            sb.append(this.g);
            sb.append(", redirectUrlFrom=");
            sb.append(this.h);
            sb.append(", startVideoFromPosition=");
            sb.append(this.i);
            sb.append(", shouldReplay=");
            return q0.a(sb, this.j, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeParcelable(this.e, i);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeString(this.h);
            parcel.writeLong(this.i);
            parcel.writeInt(this.j ? 1 : 0);
        }

        public /* synthetic */ ControllerArgs(VideoFile videoFile, String str, String str2, SearchStatsLoggingInfo searchStatsLoggingInfo, boolean z, boolean z2, String str3, long j, boolean z3, int i, zcl zclVar) {
            this(videoFile, str, str2, searchStatsLoggingInfo, (i & 16) != 0 ? false : z, (i & 32) != 0 ? true : z2, str3, j, (i & 256) != 0 ? false : z3);
        }
    }
}
