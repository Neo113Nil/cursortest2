package com.vk.video.ui.discovery.minimizable.dialog.related_videos;

import com.vk.dto.common.VideoFile;
import com.vk.dto.video.VideoAlbum;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSource;
import defpackage.q0;
import xsna.epx;
import xsna.ho8;

/* compiled from: VideoRelatedVideosSideEffects.kt */
/* loaded from: classes7.dex */
public interface i {

    /* compiled from: VideoRelatedVideosSideEffects.kt */
    public static final class a implements i {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -744196616;
        }

        public final String toString() {
            return "AddPlaylistInProgress";
        }
    }

    /* compiled from: VideoRelatedVideosSideEffects.kt */
    public static final class b implements i {
        public final VideoAlbum a;

        public b(VideoAlbum videoAlbum) {
            this.a = videoAlbum;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenPlaylist(responseAlbum=" + this.a + ')';
        }
    }

    /* compiled from: VideoRelatedVideosSideEffects.kt */
    public static final class c implements i {
        public final VideoDiscoveryRelatedVideosSource a;

        public c(VideoDiscoveryRelatedVideosSource videoDiscoveryRelatedVideosSource) {
            this.a = videoDiscoveryRelatedVideosSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowMoreActions(source=" + this.a + ')';
        }
    }

    /* compiled from: VideoRelatedVideosSideEffects.kt */
    public static final class d implements i {
        public final VideoAlbum a;

        public d(VideoAlbum videoAlbum) {
            this.a = videoAlbum;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            VideoAlbum videoAlbum = this.a;
            if (videoAlbum == null) {
                return 0;
            }
            return videoAlbum.hashCode();
        }

        public final String toString() {
            return "ShowPlaylistAddedToast(responseAlbum=" + this.a + ')';
        }
    }

    /* compiled from: VideoRelatedVideosSideEffects.kt */
    public static final class e implements i {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -842164149;
        }

        public final String toString() {
            return "ShowPlaylistAddingError";
        }
    }

    /* compiled from: VideoRelatedVideosSideEffects.kt */
    public static final class f implements i {
        public final boolean a;

        public f(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("ShowSubscribedToast(isSubscribed="), this.a, ')');
        }
    }

    /* compiled from: VideoRelatedVideosSideEffects.kt */
    public static final class g implements i {
        public final VideoFile a;
        public final VideoAlbum b;
        public final String c;

        public g(VideoFile videoFile, VideoAlbum videoAlbum, String str) {
            this.a = videoFile;
            this.b = videoAlbum;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            String str = this.c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowVideoMoreActionsDialog(video=");
            sb.append(this.a);
            sb.append(", videoAlbum=");
            sb.append(this.b);
            sb.append(", referrer=");
            return ho8.a(sb, this.c, ')');
        }
    }
}
