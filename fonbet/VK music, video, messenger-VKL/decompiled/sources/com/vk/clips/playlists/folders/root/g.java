package com.vk.clips.playlists.folders.root;

import com.vk.clips.playlists.ClipsPlaylistNamingLaunchParams;
import com.vk.clips.playlists.ClipsPlaylistsFolderLaunchParams;
import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.yzt0;

/* compiled from: ClipsPlaylistsFoldersRootViewState.kt */
/* loaded from: classes16.dex */
public final class g implements ao50 {
    public final fi50 a;

    /* compiled from: ClipsPlaylistsFoldersRootViewState.kt */
    public static final class a implements fm50<f> {
        public final yzt0<InterfaceC0628a> a;

        /* compiled from: ClipsPlaylistsFoldersRootViewState.kt */
        /* renamed from: com.vk.clips.playlists.folders.root.g$a$a, reason: collision with other inner class name */
        public interface InterfaceC0628a {

            /* compiled from: ClipsPlaylistsFoldersRootViewState.kt */
            /* renamed from: com.vk.clips.playlists.folders.root.g$a$a$a, reason: collision with other inner class name */
            public static final class C0629a implements InterfaceC0628a {
                public static final C0629a a = new C0629a();
            }

            /* compiled from: ClipsPlaylistsFoldersRootViewState.kt */
            /* renamed from: com.vk.clips.playlists.folders.root.g$a$a$b */
            public static final class b implements InterfaceC0628a {
                public final ClipsPlaylistsFolderLaunchParams a;

                public b(ClipsPlaylistsFolderLaunchParams clipsPlaylistsFolderLaunchParams) {
                    this.a = clipsPlaylistsFolderLaunchParams;
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
                    return "ListVisible(inputParams=" + this.a + ')';
                }
            }

            /* compiled from: ClipsPlaylistsFoldersRootViewState.kt */
            /* renamed from: com.vk.clips.playlists.folders.root.g$a$a$c */
            public static final class c implements InterfaceC0628a {
                public final ClipsPlaylistNamingLaunchParams a;

                public c(ClipsPlaylistNamingLaunchParams clipsPlaylistNamingLaunchParams) {
                    this.a = clipsPlaylistNamingLaunchParams;
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
                    return "NamingVisible(inputParams=" + this.a + ')';
                }
            }
        }

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    public g(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
