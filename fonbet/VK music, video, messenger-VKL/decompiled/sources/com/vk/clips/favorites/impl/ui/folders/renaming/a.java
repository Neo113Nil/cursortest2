package com.vk.clips.favorites.impl.ui.folders.renaming;

import xsna.epx;
import xsna.ho8;
import xsna.kj50;

/* compiled from: ClipsFavoritesFolderRenamingAction.kt */
/* loaded from: classes16.dex */
public interface a extends kj50 {

    /* compiled from: ClipsFavoritesFolderRenamingAction.kt */
    /* renamed from: com.vk.clips.favorites.impl.ui.folders.renaming.a$a, reason: collision with other inner class name */
    public static final class C0613a implements a {
        public static final C0613a b = new C0613a();
    }

    /* compiled from: ClipsFavoritesFolderRenamingAction.kt */
    public static final class b implements a {
        public static final b b = new b();
    }

    /* compiled from: ClipsFavoritesFolderRenamingAction.kt */
    public interface c extends a {

        /* compiled from: ClipsFavoritesFolderRenamingAction.kt */
        /* renamed from: com.vk.clips.favorites.impl.ui.folders.renaming.a$c$a, reason: collision with other inner class name */
        public static final class C0614a implements c {
            public static final C0614a b = new C0614a();
        }

        /* compiled from: ClipsFavoritesFolderRenamingAction.kt */
        public static final class b implements c {
            public static final b b = new b();
        }
    }

    /* compiled from: ClipsFavoritesFolderRenamingAction.kt */
    public static final class d implements a {
        public final String b;

        public d(String str) {
            this.b = str;
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
            return ho8.a(new StringBuilder("UpdateFolderName(folderName="), this.b, ')');
        }
    }
}
