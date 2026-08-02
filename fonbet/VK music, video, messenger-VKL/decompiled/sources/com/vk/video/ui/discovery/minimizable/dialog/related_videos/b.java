package com.vk.video.ui.discovery.minimizable.dialog.related_videos;

import com.vk.dto.common.VideoFile;
import com.vk.dto.video.VideoAlbum;
import defpackage.q0;
import xsna.epx;
import xsna.kj50;
import xsna.lq;

/* compiled from: VideoRelatedVideosAction.kt */
/* loaded from: classes7.dex */
public interface b extends kj50 {

    /* compiled from: VideoRelatedVideosAction.kt */
    public static final class a implements b {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1146375650;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: VideoRelatedVideosAction.kt */
    /* renamed from: com.vk.video.ui.discovery.minimizable.dialog.related_videos.b$b, reason: collision with other inner class name */
    public static final class C1985b implements b {
        public static final C1985b b = new C1985b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1985b);
        }

        public final int hashCode() {
            return -1654403309;
        }

        public final String toString() {
            return "OnAddToTemporaryPlaylistClicked";
        }
    }

    /* compiled from: VideoRelatedVideosAction.kt */
    public static final class c implements b {
        public final boolean b;

        public c(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("OnChangeSubscriptionRequested(shouldSubscribe="), this.b, ')');
        }
    }

    /* compiled from: VideoRelatedVideosAction.kt */
    public static final class d implements b {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1640048847;
        }

        public final String toString() {
            return "OnMoreActionClicked";
        }
    }

    /* compiled from: VideoRelatedVideosAction.kt */
    public static final class e implements b {
        public final com.vk.video.ui.discovery.minimizable.related_videos.h b;

        public e(com.vk.video.ui.discovery.minimizable.related_videos.h hVar) {
            this.b = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnNewState(videosState=" + this.b + ')';
        }
    }

    /* compiled from: VideoRelatedVideosAction.kt */
    public static final class f implements b {
        public final VideoAlbum b;

        public f(VideoAlbum videoAlbum) {
            this.b = videoAlbum;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnOpenPlaylistButtonClicked(album=" + this.b + ')';
        }
    }

    /* compiled from: VideoRelatedVideosAction.kt */
    public static final class g implements b {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1213575983;
        }

        public final String toString() {
            return "OnPlaylistAddRetryButtonClicked";
        }
    }

    /* compiled from: VideoRelatedVideosAction.kt */
    public static final class h implements b {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 225226491;
        }

        public final String toString() {
            return "OnReturnSubscriptionButtonClicked";
        }
    }

    /* compiled from: VideoRelatedVideosAction.kt */
    public static final class i implements b {
        public final VideoFile b;

        public i(VideoFile videoFile) {
            this.b = videoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return lq.a(new StringBuilder("OnVideoMoreActionsClicked(video="), this.b, ')');
        }
    }
}
