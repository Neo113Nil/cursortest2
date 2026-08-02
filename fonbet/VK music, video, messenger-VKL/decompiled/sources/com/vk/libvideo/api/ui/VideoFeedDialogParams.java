package com.vk.libvideo.api.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.models.comment.ReplyInfo;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: VideoFeedDialogParams.kt */
/* loaded from: classes2.dex */
public abstract class VideoFeedDialogParams extends Serializer.StreamParcelableAdapter {
    public final String b;
    public final String c;
    public final SearchStatsLoggingInfo d;
    public final long e;
    public final boolean f;
    public final VideoTransitionSource g;

    /* compiled from: VideoFeedDialogParams.kt */
    public static final class Discover extends VideoFeedDialogParams {
        public static final Serializer.c<Discover> CREATOR = new a();
        public final boolean h;
        public final String i;
        public final ReplyInfo j;
        public final DiscoverTemporaryPlaylistData k;

        /* compiled from: VideoFeedDialogParams.kt */
        public static final class DiscoverTemporaryPlaylistData implements Parcelable {
            public static final Parcelable.Creator<DiscoverTemporaryPlaylistData> CREATOR = new a();
            public final String b;
            public final String c;

            /* compiled from: VideoFeedDialogParams.kt */
            public static final class a implements Parcelable.Creator<DiscoverTemporaryPlaylistData> {
                @Override // android.os.Parcelable.Creator
                public final DiscoverTemporaryPlaylistData createFromParcel(Parcel parcel) {
                    return new DiscoverTemporaryPlaylistData(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final DiscoverTemporaryPlaylistData[] newArray(int i) {
                    return new DiscoverTemporaryPlaylistData[i];
                }
            }

            public DiscoverTemporaryPlaylistData(String str, String str2) {
                this.b = str;
                this.c = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DiscoverTemporaryPlaylistData)) {
                    return false;
                }
                DiscoverTemporaryPlaylistData discoverTemporaryPlaylistData = (DiscoverTemporaryPlaylistData) obj;
                return epx.f(this.b, discoverTemporaryPlaylistData.b) && epx.f(this.c, discoverTemporaryPlaylistData.c);
            }

            public final int hashCode() {
                String str = this.b;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.c;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("DiscoverTemporaryPlaylistData(id=");
                sb.append(this.b);
                sb.append(", queryId=");
                return ho8.a(sb, this.c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b);
                parcel.writeString(this.c);
            }
        }

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Discover> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Discover a(Serializer serializer) {
                return new Discover(serializer.H(), serializer.H(), (SearchStatsLoggingInfo) serializer.A(SearchStatsLoggingInfo.class.getClassLoader()), serializer.m(), serializer.H(), (ReplyInfo) serializer.A(ReplyInfo.class.getClassLoader()), serializer.w(), false, (VideoTransitionSource) serializer.A(VideoTransitionSource.class.getClassLoader()), (DiscoverTemporaryPlaylistData) serializer.A(DiscoverTemporaryPlaylistData.class.getClassLoader()), 128, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Discover[i];
            }
        }

        public Discover(String str, String str2) {
            this(str, str2, null, false, null, null, 0L, false, null, null, 1020, null);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.e0(this.d);
            serializer.L(this.h ? (byte) 1 : (byte) 0);
            serializer.j0(this.i);
            serializer.e0(this.j);
            serializer.Y(this.e);
            serializer.e0(this.g);
            serializer.e0(this.k);
        }

        public /* synthetic */ Discover(String str, String str2, SearchStatsLoggingInfo searchStatsLoggingInfo, boolean z, String str3, ReplyInfo replyInfo, long j, boolean z2, VideoTransitionSource videoTransitionSource, DiscoverTemporaryPlaylistData discoverTemporaryPlaylistData, int i, zcl zclVar) {
            this(str, str2, (i & 4) != 0 ? null : searchStatsLoggingInfo, (i & 8) != 0 ? true : z, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : replyInfo, (i & 64) != 0 ? -1L : j, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? null : videoTransitionSource, (i & 512) != 0 ? null : discoverTemporaryPlaylistData);
        }

        public Discover(String str, String str2, SearchStatsLoggingInfo searchStatsLoggingInfo, boolean z, String str3, ReplyInfo replyInfo, long j, boolean z2, VideoTransitionSource videoTransitionSource, DiscoverTemporaryPlaylistData discoverTemporaryPlaylistData) {
            super(str, str2, searchStatsLoggingInfo, j, z2, videoTransitionSource, null);
            this.h = z;
            this.i = str3;
            this.j = replyInfo;
            this.k = discoverTemporaryPlaylistData;
        }
    }

    /* compiled from: VideoFeedDialogParams.kt */
    public static final class MusicMix extends VideoFeedDialogParams {
        public static final Serializer.c<MusicMix> CREATOR = new a();
        public final String h;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<MusicMix> {
            @Override // com.vk.core.serialize.Serializer.c
            public final MusicMix a(Serializer serializer) {
                return new MusicMix(serializer.H(), serializer.H(), (SearchStatsLoggingInfo) serializer.A(SearchStatsLoggingInfo.class.getClassLoader()), serializer.H(), serializer.w());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MusicMix[i];
            }
        }

        public /* synthetic */ MusicMix(String str, String str2, SearchStatsLoggingInfo searchStatsLoggingInfo, String str3, long j, int i, zcl zclVar) {
            this(str, str2, (i & 4) != 0 ? null : searchStatsLoggingInfo, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? 0L : j);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.e0(this.d);
            serializer.Y(this.e);
            serializer.j0(this.h);
        }

        public MusicMix(String str, String str2, SearchStatsLoggingInfo searchStatsLoggingInfo, String str3, long j) {
            super(str, str2, searchStatsLoggingInfo, j, false, null, 48, null);
            this.h = str3;
        }
    }

    /* compiled from: VideoFeedDialogParams.kt */
    public static final class OfflineVideos extends VideoFeedDialogParams {
        public static final Serializer.c<OfflineVideos> CREATOR = new a();

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<OfflineVideos> {
            @Override // com.vk.core.serialize.Serializer.c
            public final OfflineVideos a(Serializer serializer) {
                return new OfflineVideos(serializer.H(), serializer.H(), (SearchStatsLoggingInfo) serializer.A(SearchStatsLoggingInfo.class.getClassLoader()), null, 8, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OfflineVideos[i];
            }
        }

        public /* synthetic */ OfflineVideos(String str, String str2, SearchStatsLoggingInfo searchStatsLoggingInfo, VideoTransitionSource videoTransitionSource, int i, zcl zclVar) {
            this(str, str2, (i & 4) != 0 ? null : searchStatsLoggingInfo, (i & 8) != 0 ? null : videoTransitionSource);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.e0(this.d);
        }

        public OfflineVideos(String str, String str2, SearchStatsLoggingInfo searchStatsLoggingInfo, VideoTransitionSource videoTransitionSource) {
            super(str, str2, searchStatsLoggingInfo, 0L, false, videoTransitionSource, 24, null);
        }
    }

    /* compiled from: VideoFeedDialogParams.kt */
    public static final class Playlist extends VideoFeedDialogParams {
        public static final Serializer.c<Playlist> CREATOR = new a();
        public final int h;
        public final UserId i;
        public final transient List<VideoFile> j;
        public final int k;
        public final String l;
        public final int m;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Playlist> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Playlist a(Serializer serializer) {
                return new Playlist(serializer.H(), serializer.H(), serializer.u(), (UserId) serializer.A(UserId.class.getClassLoader()), EmptyList.b, null, serializer.u(), serializer.H(), serializer.u(), (SearchStatsLoggingInfo) serializer.A(SearchStatsLoggingInfo.class.getClassLoader()), false, null, 3072, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Playlist[i];
            }
        }

        public /* synthetic */ Playlist(String str, String str2, int i, UserId userId, List list, Integer num, int i2, String str3, int i3, SearchStatsLoggingInfo searchStatsLoggingInfo, boolean z, VideoTransitionSource videoTransitionSource, int i4, zcl zclVar) {
            this(str, str2, i, userId, list, (i4 & 32) != 0 ? null : num, i2, (i4 & 128) != 0 ? null : str3, (i4 & 256) != 0 ? -1 : i3, (i4 & 512) != 0 ? null : searchStatsLoggingInfo, (i4 & 1024) != 0 ? false : z, (i4 & 2048) != 0 ? null : videoTransitionSource);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.S(this.h);
            serializer.e0(this.i);
            serializer.S(this.k);
            serializer.j0(this.l);
            serializer.e0(this.d);
            serializer.S(this.m);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Playlist(String str, String str2, int i, UserId userId, List<? extends VideoFile> list, Integer num, int i2, String str3, int i3, SearchStatsLoggingInfo searchStatsLoggingInfo, boolean z, VideoTransitionSource videoTransitionSource) {
            super(str, str2, searchStatsLoggingInfo, 0L, z, videoTransitionSource, 8, null);
            this.h = i;
            this.i = userId;
            this.j = list;
            this.k = i2;
            this.l = str3;
            this.m = i3;
        }
    }

    public /* synthetic */ VideoFeedDialogParams(String str, String str2, SearchStatsLoggingInfo searchStatsLoggingInfo, long j, boolean z, VideoTransitionSource videoTransitionSource, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : searchStatsLoggingInfo, (i & 8) != 0 ? -1L : j, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : videoTransitionSource, null);
    }

    public final String zb() {
        return this.b;
    }

    public VideoFeedDialogParams(String str, String str2, SearchStatsLoggingInfo searchStatsLoggingInfo, long j, boolean z, VideoTransitionSource videoTransitionSource, zcl zclVar) {
        this.b = str;
        this.c = str2;
        this.d = searchStatsLoggingInfo;
        this.e = j;
        this.f = z;
        this.g = videoTransitionSource;
    }
}
