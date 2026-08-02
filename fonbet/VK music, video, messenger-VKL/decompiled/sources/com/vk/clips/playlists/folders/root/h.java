package com.vk.clips.playlists.folders.root;

import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;

/* compiled from: ClipsFoldersProxyEventBus.kt */
/* loaded from: classes16.dex */
public interface h {

    /* compiled from: ClipsFoldersProxyEventBus.kt */
    public static final class a implements h {
        public final UserId a;

        public a(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OpenNaming(userId="), this.a, ')');
        }
    }

    /* compiled from: ClipsFoldersProxyEventBus.kt */
    public static final class b implements h {
        public final ClipsPlaylist a;

        public b(ClipsPlaylist clipsPlaylist) {
            this.a = clipsPlaylist;
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
            return "PlaylistDeselected(playlist=" + this.a + ')';
        }
    }

    /* compiled from: ClipsFoldersProxyEventBus.kt */
    public static final class c implements h {
        public final ClipsPlaylist a;

        public c(ClipsPlaylist clipsPlaylist) {
            this.a = clipsPlaylist;
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
            return "PlaylistSelected(playlist=" + this.a + ')';
        }
    }
}
