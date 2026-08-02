package com.vk.video.ui.discovery.minimizable.related_videos;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoAlbum;
import xsna.epx;
import xsna.ho8;

/* compiled from: VideoDiscoveryRelatedVideosSource.kt */
/* loaded from: classes7.dex */
public interface VideoDiscoveryRelatedVideosSource extends Parcelable {

    /* compiled from: VideoDiscoveryRelatedVideosSource.kt */
    public static final class Playlist implements VideoDiscoveryRelatedVideosSource {
        public static final Parcelable.Creator<Playlist> CREATOR = new a();
        public final VideoAlbum b;
        public final UserProfile c;
        public final String d;

        /* compiled from: VideoDiscoveryRelatedVideosSource.kt */
        public static final class a implements Parcelable.Creator<Playlist> {
            @Override // android.os.Parcelable.Creator
            public final Playlist createFromParcel(Parcel parcel) {
                return new Playlist((VideoAlbum) parcel.readParcelable(Playlist.class.getClassLoader()), (UserProfile) parcel.readParcelable(Playlist.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Playlist[] newArray(int i) {
                return new Playlist[i];
            }
        }

        public Playlist(VideoAlbum videoAlbum, UserProfile userProfile, String str) {
            this.b = videoAlbum;
            this.c = userProfile;
            this.d = str;
        }

        public static Playlist a(Playlist playlist, VideoAlbum videoAlbum) {
            UserProfile userProfile = playlist.c;
            String str = playlist.d;
            playlist.getClass();
            return new Playlist(videoAlbum, userProfile, str);
        }

        @Override // com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource
        public final String C4() {
            return this.d;
        }

        @Override // com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource
        public final VideoAlbum b8() {
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
            if (!(obj instanceof Playlist)) {
                return false;
            }
            Playlist playlist = (Playlist) obj;
            return epx.f(this.b, playlist.b) && epx.f(this.c, playlist.c) && epx.f(this.d, playlist.d);
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
            String str = this.d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource
        public final UserProfile s() {
            return this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Playlist(videoAlbum=");
            sb.append(this.b);
            sb.append(", owner=");
            sb.append(this.c);
            sb.append(", referrer=");
            return ho8.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeString(this.d);
        }
    }

    /* compiled from: VideoDiscoveryRelatedVideosSource.kt */
    public static final class TemporaryPlaylist implements VideoDiscoveryRelatedVideosSource {
        public static final Parcelable.Creator<TemporaryPlaylist> CREATOR = new a();
        public final String b;
        public final VideoAlbum c;
        public final UserProfile d;
        public final String e;
        public final String f;

        /* compiled from: VideoDiscoveryRelatedVideosSource.kt */
        public static final class a implements Parcelable.Creator<TemporaryPlaylist> {
            @Override // android.os.Parcelable.Creator
            public final TemporaryPlaylist createFromParcel(Parcel parcel) {
                return new TemporaryPlaylist(parcel.readString(), (VideoAlbum) parcel.readParcelable(TemporaryPlaylist.class.getClassLoader()), (UserProfile) parcel.readParcelable(TemporaryPlaylist.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TemporaryPlaylist[] newArray(int i) {
                return new TemporaryPlaylist[i];
            }
        }

        public TemporaryPlaylist(String str, VideoAlbum videoAlbum, UserProfile userProfile, String str2, String str3) {
            this.b = str;
            this.c = videoAlbum;
            this.d = userProfile;
            this.e = str2;
            this.f = str3;
        }

        @Override // com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource
        public final String C4() {
            return this.e;
        }

        @Override // com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource
        public final VideoAlbum b8() {
            return this.c;
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
            return epx.f(this.b, temporaryPlaylist.b) && epx.f(this.c, temporaryPlaylist.c) && epx.f(this.d, temporaryPlaylist.d) && epx.f(this.e, temporaryPlaylist.e) && epx.f(this.f, temporaryPlaylist.f);
        }

        public final int hashCode() {
            int hashCode = (this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31;
            String str = this.e;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource
        public final UserProfile s() {
            return this.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TemporaryPlaylist(id=");
            sb.append(this.b);
            sb.append(", videoAlbum=");
            sb.append(this.c);
            sb.append(", owner=");
            sb.append(this.d);
            sb.append(", referrer=");
            sb.append(this.e);
            sb.append(", queryId=");
            return ho8.a(sb, this.f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
        }
    }

    String C4();

    VideoAlbum b8();

    UserProfile s();
}
