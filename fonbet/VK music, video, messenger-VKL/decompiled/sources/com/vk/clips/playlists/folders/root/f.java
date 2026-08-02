package com.vk.clips.playlists.folders.root;

import com.vk.clips.playlists.ClipsPlaylistsFolderLaunchParams;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.km50;
import xsna.xl50;

/* compiled from: ClipsPlaylistsFoldersRootState.kt */
/* loaded from: classes16.dex */
public interface f extends km50, xl50 {

    /* compiled from: ClipsPlaylistsFoldersRootState.kt */
    public static final class a implements f {
        public final InterfaceC0626a b;
        public final ClipsPlaylistsFolderLaunchParams c;

        /* compiled from: ClipsPlaylistsFoldersRootState.kt */
        /* renamed from: com.vk.clips.playlists.folders.root.f$a$a, reason: collision with other inner class name */
        public interface InterfaceC0626a {

            /* compiled from: ClipsPlaylistsFoldersRootState.kt */
            /* renamed from: com.vk.clips.playlists.folders.root.f$a$a$a, reason: collision with other inner class name */
            public static final class C0627a implements InterfaceC0626a {
                public static final C0627a a = new C0627a();
            }

            /* compiled from: ClipsPlaylistsFoldersRootState.kt */
            /* renamed from: com.vk.clips.playlists.folders.root.f$a$a$b */
            public static final class b implements InterfaceC0626a {
                public final UserId a;

                public b(UserId userId) {
                    this.a = userId;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
                }

                public final int hashCode() {
                    return Long.hashCode(this.a.b);
                }

                public final String toString() {
                    return gp.b(new StringBuilder("Naming(userId="), this.a, ')');
                }
            }
        }

        public a(InterfaceC0626a interfaceC0626a, ClipsPlaylistsFolderLaunchParams clipsPlaylistsFolderLaunchParams) {
            this.b = interfaceC0626a;
            this.c = clipsPlaylistsFolderLaunchParams;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Content(bsState=" + this.b + ", inputParams=" + this.c + ')';
        }
    }

    /* compiled from: ClipsPlaylistsFoldersRootState.kt */
    public static final class b implements f {
        public static final b b = new b();
    }

    /* compiled from: ClipsPlaylistsFoldersRootState.kt */
    public static final class c implements f {
        public static final c b = new c();
    }
}
