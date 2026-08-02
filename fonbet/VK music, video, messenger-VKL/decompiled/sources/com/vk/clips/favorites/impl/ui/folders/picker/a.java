package com.vk.clips.favorites.impl.ui.folders.picker;

import com.vk.clips.sdk.shared.FavoriteFolderId;
import xsna.epx;
import xsna.ho8;
import xsna.kj50;

/* compiled from: ClipsFavoritesFoldersPickerAction.kt */
/* loaded from: classes16.dex */
public interface a extends kj50 {

    /* compiled from: ClipsFavoritesFoldersPickerAction.kt */
    /* renamed from: com.vk.clips.favorites.impl.ui.folders.picker.a$a, reason: collision with other inner class name */
    public static final class C0604a implements a {
        public static final C0604a b = new C0604a();
    }

    /* compiled from: ClipsFavoritesFoldersPickerAction.kt */
    public static final class b implements a {
        public static final b b = new b();
    }

    /* compiled from: ClipsFavoritesFoldersPickerAction.kt */
    public static final class c implements a {
        public static final c b = new c();
    }

    /* compiled from: ClipsFavoritesFoldersPickerAction.kt */
    public static final class d implements a {
        public static final d b = new d();
    }

    /* compiled from: ClipsFavoritesFoldersPickerAction.kt */
    public static final class e implements a {
        public static final e b = new e();
    }

    /* compiled from: ClipsFavoritesFoldersPickerAction.kt */
    public interface f extends a {

        /* compiled from: ClipsFavoritesFoldersPickerAction.kt */
        /* renamed from: com.vk.clips.favorites.impl.ui.folders.picker.a$f$a, reason: collision with other inner class name */
        public static final class C0605a implements f {
            public static final C0605a b = new C0605a();
        }

        /* compiled from: ClipsFavoritesFoldersPickerAction.kt */
        public static final class b implements f {
            public static final b b = new b();
        }

        /* compiled from: ClipsFavoritesFoldersPickerAction.kt */
        public static final class c implements f {
            public static final c b = new c();
        }

        /* compiled from: ClipsFavoritesFoldersPickerAction.kt */
        public static final class d implements f {
            public final FavoriteFolderId b;
            public final String c;

            public d(FavoriteFolderId favoriteFolderId, String str) {
                this.b = favoriteFolderId;
                this.c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("FolderClick(id=");
                sb.append(this.b);
                sb.append(", name=");
                return ho8.a(sb, this.c, ')');
            }
        }

        /* compiled from: ClipsFavoritesFoldersPickerAction.kt */
        public static final class e implements f {
            public static final e b = new e();
        }

        /* compiled from: ClipsFavoritesFoldersPickerAction.kt */
        /* renamed from: com.vk.clips.favorites.impl.ui.folders.picker.a$f$f, reason: collision with other inner class name */
        public static final class C0606f implements f {
            public static final C0606f b = new C0606f();
        }
    }

    /* compiled from: ClipsFavoritesFoldersPickerAction.kt */
    public static final class g implements a {
        public static final g b = new g();
    }
}
