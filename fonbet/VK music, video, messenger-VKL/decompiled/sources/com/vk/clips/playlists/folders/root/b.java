package com.vk.clips.playlists.folders.root;

import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.kj50;

/* compiled from: ClipsPlaylistsFoldersRootAction.kt */
/* loaded from: classes16.dex */
public interface b extends kj50 {

    /* compiled from: ClipsPlaylistsFoldersRootAction.kt */
    public static final class a implements b {
        public static final a b = new a();
    }

    /* compiled from: ClipsPlaylistsFoldersRootAction.kt */
    /* renamed from: com.vk.clips.playlists.folders.root.b$b, reason: collision with other inner class name */
    public static final class C0625b implements b {
        public final UserId b;

        public C0625b(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0625b) && epx.f(this.b, ((C0625b) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("NavigateToNaming(userId="), this.b, ')');
        }
    }

    /* compiled from: ClipsPlaylistsFoldersRootAction.kt */
    public static final class c implements b {
        public static final c b = new c();
    }

    /* compiled from: ClipsPlaylistsFoldersRootAction.kt */
    public static final class d implements b {
        public final ClipsPlaylist b;

        public d(ClipsPlaylist clipsPlaylist) {
            this.b = clipsPlaylist;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnPlaylistSelected(playlist=" + this.b + ')';
        }
    }
}
