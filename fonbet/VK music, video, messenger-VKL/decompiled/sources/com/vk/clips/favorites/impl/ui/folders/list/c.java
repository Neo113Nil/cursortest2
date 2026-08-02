package com.vk.clips.favorites.impl.ui.folders.list;

import com.vk.clips.sdk.shared.FavoriteFolderId;
import xsna.b4e;
import xsna.epx;
import xsna.u2e;
import xsna.xl50;

/* compiled from: ClipsFavoriteFoldersListPatch.kt */
/* loaded from: classes16.dex */
public interface c extends xl50 {

    /* compiled from: ClipsFavoriteFoldersListPatch.kt */
    public static final class a implements c {
        public final u2e b;

        public a(u2e u2eVar) {
            this.b = u2eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "FolderCreated(folder=" + this.b + ')';
        }
    }

    /* compiled from: ClipsFavoriteFoldersListPatch.kt */
    public static final class b implements c {
        public final FavoriteFolderId b;

        public b(FavoriteFolderId favoriteFolderId) {
            this.b = favoriteFolderId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "FolderRemoved(folderId=" + this.b + ')';
        }
    }

    /* compiled from: ClipsFavoriteFoldersListPatch.kt */
    /* renamed from: com.vk.clips.favorites.impl.ui.folders.list.c$c, reason: collision with other inner class name */
    public static final class C0600c implements c {
        public final u2e b;

        public C0600c(u2e u2eVar) {
            this.b = u2eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0600c) && epx.f(this.b, ((C0600c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "FolderUpdated(folder=" + this.b + ')';
        }
    }

    /* compiled from: ClipsFavoriteFoldersListPatch.kt */
    public interface d extends c {

        /* compiled from: ClipsFavoriteFoldersListPatch.kt */
        public static final class a implements d {
            public static final a b = new a();
        }

        /* compiled from: ClipsFavoriteFoldersListPatch.kt */
        public static final class b implements d {
            public static final b b = new b();
        }

        /* compiled from: ClipsFavoriteFoldersListPatch.kt */
        /* renamed from: com.vk.clips.favorites.impl.ui.folders.list.c$d$c, reason: collision with other inner class name */
        public static final class C0601c implements d {
            public static final C0601c b = new C0601c();
        }

        /* compiled from: ClipsFavoriteFoldersListPatch.kt */
        /* renamed from: com.vk.clips.favorites.impl.ui.folders.list.c$d$d, reason: collision with other inner class name */
        public static final class C0602d implements d {
            public final b4e b;

            public C0602d(b4e b4eVar) {
                this.b = b4eVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0602d) && epx.f(this.b, ((C0602d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "NextSuccess(response=" + this.b + ')';
            }
        }

        /* compiled from: ClipsFavoriteFoldersListPatch.kt */
        public static final class e implements d {
            public static final e b = new e();
        }

        /* compiled from: ClipsFavoriteFoldersListPatch.kt */
        public static final class f implements d {
            public static final f b = new f();
        }

        /* compiled from: ClipsFavoriteFoldersListPatch.kt */
        public static final class g implements d {
            public final u2e b;
            public final b4e c;

            public g(u2e u2eVar, b4e b4eVar) {
                this.b = u2eVar;
                this.c = b4eVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "Success(allClipsFolder=" + this.b + ", response=" + this.c + ')';
            }
        }
    }
}
