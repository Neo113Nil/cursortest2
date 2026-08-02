package com.vk.video.ui.discovery.minimizable.related_videos;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.video.queue.api.model.related.VideoRelatedVideosOrder;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VideoDiscoveryRelatedVideosSourceArgs.kt */
/* loaded from: classes7.dex */
public abstract class VideoDiscoveryRelatedVideosSourceArgs implements Parcelable {
    public final VideoFile b;
    public final int c;
    public final VideoRelatedVideosOrder d;

    /* compiled from: VideoDiscoveryRelatedVideosSourceArgs.kt */
    public static final class TemporaryPlaylist extends VideoDiscoveryRelatedVideosSourceArgs {
        public static final Parcelable.Creator<TemporaryPlaylist> CREATOR = new a();
        public final VideoFile e;
        public final String f;
        public final UserId g;
        public final String h;
        public final boolean i;
        public final String j;

        /* compiled from: VideoDiscoveryRelatedVideosSourceArgs.kt */
        public static final class a implements Parcelable.Creator<TemporaryPlaylist> {
            @Override // android.os.Parcelable.Creator
            public final TemporaryPlaylist createFromParcel(Parcel parcel) {
                return new TemporaryPlaylist((VideoFile) parcel.readParcelable(TemporaryPlaylist.class.getClassLoader()), parcel.readString(), (UserId) parcel.readParcelable(TemporaryPlaylist.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TemporaryPlaylist[] newArray(int i) {
                return new TemporaryPlaylist[i];
            }
        }

        public TemporaryPlaylist(VideoFile videoFile, String str, UserId userId, String str2, boolean z, String str3) {
            super(videoFile, str.hashCode(), VideoRelatedVideosOrder.Original.b, null);
            this.e = videoFile;
            this.f = str;
            this.g = userId;
            this.h = str2;
            this.i = z;
            this.j = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TemporaryPlaylist)) {
                return false;
            }
            TemporaryPlaylist temporaryPlaylist = (TemporaryPlaylist) obj;
            return epx.f(this.e, temporaryPlaylist.e) && epx.f(this.f, temporaryPlaylist.f) && epx.f(this.g, temporaryPlaylist.g) && epx.f(this.h, temporaryPlaylist.h) && this.i == temporaryPlaylist.i && epx.f(this.j, temporaryPlaylist.j);
        }

        public final int hashCode() {
            int a2 = bh10.a(urd0.a(this.e.hashCode() * 31, 31, this.f), 31, this.g.b);
            String str = this.h;
            int b = qoy.b((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.i);
            String str2 = this.j;
            return b + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TemporaryPlaylist(video=");
            sb.append(this.e);
            sb.append(", id=");
            sb.append(this.f);
            sb.append(", playlistOwnerId=");
            sb.append(this.g);
            sb.append(", referrer=");
            sb.append(this.h);
            sb.append(", fromMarkedVideo=");
            sb.append(this.i);
            sb.append(", queryId=");
            return ho8.a(sb, this.j, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.e, i);
            parcel.writeString(this.f);
            parcel.writeParcelable(this.g, i);
            parcel.writeString(this.h);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeString(this.j);
        }
    }

    public VideoDiscoveryRelatedVideosSourceArgs(VideoFile videoFile, int i, VideoRelatedVideosOrder videoRelatedVideosOrder, zcl zclVar) {
        this.b = videoFile;
        this.c = i;
        this.d = videoRelatedVideosOrder;
    }

    public VideoRelatedVideosOrder d() {
        return this.d;
    }

    /* compiled from: VideoDiscoveryRelatedVideosSourceArgs.kt */
    public static final class Playlist extends VideoDiscoveryRelatedVideosSourceArgs {
        public static final Parcelable.Creator<Playlist> CREATOR = new a();
        public final VideoFile e;
        public final int f;
        public final Integer g;
        public final Integer h;
        public final UserId i;
        public final String j;
        public final boolean k;
        public final VideoRelatedVideosOrder l;

        /* compiled from: VideoDiscoveryRelatedVideosSourceArgs.kt */
        public static final class a implements Parcelable.Creator<Playlist> {
            @Override // android.os.Parcelable.Creator
            public final Playlist createFromParcel(Parcel parcel) {
                return new Playlist((VideoFile) parcel.readParcelable(Playlist.class.getClassLoader()), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (UserId) parcel.readParcelable(Playlist.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, (VideoRelatedVideosOrder) parcel.readParcelable(Playlist.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Playlist[] newArray(int i) {
                return new Playlist[i];
            }
        }

        public /* synthetic */ Playlist(VideoFile videoFile, int i, Integer num, Integer num2, UserId userId, String str, boolean z, VideoRelatedVideosOrder videoRelatedVideosOrder, int i2, zcl zclVar) {
            this(videoFile, i, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2, userId, str, z, (i2 & 128) != 0 ? VideoRelatedVideosOrder.Original.b : videoRelatedVideosOrder);
        }

        public static Playlist e(Playlist playlist, VideoFile videoFile, Integer num, Integer num2, VideoRelatedVideosOrder videoRelatedVideosOrder, int i) {
            if ((i & 1) != 0) {
                videoFile = playlist.e;
            }
            VideoFile videoFile2 = videoFile;
            int i2 = playlist.f;
            if ((i & 4) != 0) {
                num = playlist.g;
            }
            Integer num3 = num;
            if ((i & 8) != 0) {
                num2 = playlist.h;
            }
            Integer num4 = num2;
            UserId userId = playlist.i;
            String str = (i & 32) != 0 ? playlist.j : null;
            boolean z = playlist.k;
            if ((i & 128) != 0) {
                videoRelatedVideosOrder = playlist.l;
            }
            playlist.getClass();
            return new Playlist(videoFile2, i2, num3, num4, userId, str, z, videoRelatedVideosOrder);
        }

        @Override // com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSourceArgs
        public final VideoRelatedVideosOrder d() {
            return this.l;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Playlist)) {
                return false;
            }
            Playlist playlist = (Playlist) obj;
            return epx.f(this.e, playlist.e) && this.f == playlist.f && epx.f(this.g, playlist.g) && epx.f(this.h, playlist.h) && epx.f(this.i, playlist.i) && epx.f(this.j, playlist.j) && this.k == playlist.k && epx.f(this.l, playlist.l);
        }

        public final int hashCode() {
            int a2 = shy.a(this.f, this.e.hashCode() * 31, 31);
            Integer num = this.g;
            int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.h;
            int a3 = bh10.a((hashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.i.b);
            String str = this.j;
            return this.l.hashCode() + qoy.b((a3 + (str != null ? str.hashCode() : 0)) * 31, 31, this.k);
        }

        public final String toString() {
            return "Playlist(video=" + this.e + ", id=" + this.f + ", seasonId=" + this.g + ", focusVideoSeasonId=" + this.h + ", playlistOwnerId=" + this.i + ", referrer=" + this.j + ", fromMarkedVideo=" + this.k + ", order=" + this.l + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.e, i);
            parcel.writeInt(this.f);
            Integer num = this.g;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            Integer num2 = this.h;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num2);
            }
            parcel.writeParcelable(this.i, i);
            parcel.writeString(this.j);
            parcel.writeInt(this.k ? 1 : 0);
            parcel.writeParcelable(this.l, i);
        }

        public Playlist(VideoFile videoFile, int i, Integer num, Integer num2, UserId userId, String str, boolean z, VideoRelatedVideosOrder videoRelatedVideosOrder) {
            super(videoFile, i, videoRelatedVideosOrder, null);
            this.e = videoFile;
            this.f = i;
            this.g = num;
            this.h = num2;
            this.i = userId;
            this.j = str;
            this.k = z;
            this.l = videoRelatedVideosOrder;
        }
    }
}
