package com.vk.clips.favorites.impl.ui.folders.picker;

import com.vk.clips.sdk.shared.FavoriteFolderId;
import java.util.List;
import xsna.b4e;
import xsna.epx;
import xsna.fw3;
import xsna.u2e;
import xsna.xl50;

/* compiled from: ClipsFavoritesFoldersPickerPatch.kt */
/* loaded from: classes16.dex */
public interface c extends xl50 {

    /* compiled from: ClipsFavoritesFoldersPickerPatch.kt */
    public interface a extends c {

        /* compiled from: ClipsFavoritesFoldersPickerPatch.kt */
        /* renamed from: com.vk.clips.favorites.impl.ui.folders.picker.c$a$a, reason: collision with other inner class name */
        public static final class C0607a implements a {
            public static final C0607a b = new C0607a();
        }

        /* compiled from: ClipsFavoritesFoldersPickerPatch.kt */
        public static final class b implements a {
            public static final b b = new b();
        }
    }

    /* compiled from: ClipsFavoritesFoldersPickerPatch.kt */
    public interface b extends c {

        /* compiled from: ClipsFavoritesFoldersPickerPatch.kt */
        public static final class a implements b {
            public static final a b = new a();
        }

        /* compiled from: ClipsFavoritesFoldersPickerPatch.kt */
        /* renamed from: com.vk.clips.favorites.impl.ui.folders.picker.c$b$b, reason: collision with other inner class name */
        public static final class C0608b implements b {
            public final boolean b;
            public final FavoriteFolderId c;

            public C0608b(boolean z, FavoriteFolderId favoriteFolderId) {
                this.b = z;
                this.c = favoriteFolderId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0608b)) {
                    return false;
                }
                C0608b c0608b = (C0608b) obj;
                return this.b == c0608b.b && epx.f(this.c, c0608b.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
            }

            public final String toString() {
                return "UpdateSavedToFolder(saved=" + this.b + ", id=" + this.c + ')';
            }
        }
    }

    /* compiled from: ClipsFavoritesFoldersPickerPatch.kt */
    /* renamed from: com.vk.clips.favorites.impl.ui.folders.picker.c$c, reason: collision with other inner class name */
    public static final class C0609c implements c {
        public final u2e b;

        public C0609c(u2e u2eVar) {
            this.b = u2eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0609c) && epx.f(this.b, ((C0609c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "FolderCreated(folder=" + this.b + ')';
        }
    }

    /* compiled from: ClipsFavoritesFoldersPickerPatch.kt */
    public interface d extends c {

        /* compiled from: ClipsFavoritesFoldersPickerPatch.kt */
        public static final class a implements d {
            public static final a b = new a();
        }

        /* compiled from: ClipsFavoritesFoldersPickerPatch.kt */
        public static final class b implements d {
            public static final b b = new b();
        }

        /* compiled from: ClipsFavoritesFoldersPickerPatch.kt */
        /* renamed from: com.vk.clips.favorites.impl.ui.folders.picker.c$d$c, reason: collision with other inner class name */
        public static final class C0610c implements d {
            public final u2e b;
            public final List<u2e> c;
            public final b4e d;

            public C0610c(u2e u2eVar, List<u2e> list, b4e b4eVar) {
                this.b = u2eVar;
                this.c = list;
                this.d = b4eVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0610c)) {
                    return false;
                }
                C0610c c0610c = (C0610c) obj;
                return epx.f(this.b, c0610c.b) && epx.f(this.c, c0610c.c) && epx.f(this.d, c0610c.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + fw3.a(this.b.hashCode() * 31, 31, this.c);
            }

            public final String toString() {
                return "Success(allClipsFolder=" + this.b + ", foldersWithClip=" + this.c + ", response=" + this.d + ')';
            }
        }
    }

    /* compiled from: ClipsFavoritesFoldersPickerPatch.kt */
    public interface e extends c {

        /* compiled from: ClipsFavoritesFoldersPickerPatch.kt */
        public static final class a implements e {
            public static final a b = new a();
        }

        /* compiled from: ClipsFavoritesFoldersPickerPatch.kt */
        public static final class b implements e {
            public static final b b = new b();
        }

        /* compiled from: ClipsFavoritesFoldersPickerPatch.kt */
        /* renamed from: com.vk.clips.favorites.impl.ui.folders.picker.c$e$c, reason: collision with other inner class name */
        public static final class C0611c implements e {
            public final b4e b;

            public C0611c(b4e b4eVar) {
                this.b = b4eVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0611c) && epx.f(this.b, ((C0611c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Success(response=" + this.b + ')';
            }
        }
    }
}
