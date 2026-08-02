package com.vk.clips.favorites.impl.ui.folders.renaming;

import xsna.epx;
import xsna.ho8;
import xsna.xl50;

/* compiled from: ClipsFavoritesFolderRenamingPatch.kt */
/* loaded from: classes16.dex */
public interface d extends xl50 {

    /* compiled from: ClipsFavoritesFolderRenamingPatch.kt */
    public static final class a implements d {
        public final String b;

        public a(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Init(initialFolderName="), this.b, ')');
        }
    }

    /* compiled from: ClipsFavoritesFolderRenamingPatch.kt */
    public interface b extends d {

        /* compiled from: ClipsFavoritesFolderRenamingPatch.kt */
        public static final class a implements b {
            public static final a b = new a();
        }

        /* compiled from: ClipsFavoritesFolderRenamingPatch.kt */
        /* renamed from: com.vk.clips.favorites.impl.ui.folders.renaming.d$b$b, reason: collision with other inner class name */
        public static final class C0617b implements b {
            public static final C0617b b = new C0617b();
        }

        /* compiled from: ClipsFavoritesFolderRenamingPatch.kt */
        public static final class c implements b {
            public static final c b = new c();
        }

        /* compiled from: ClipsFavoritesFolderRenamingPatch.kt */
        /* renamed from: com.vk.clips.favorites.impl.ui.folders.renaming.d$b$d, reason: collision with other inner class name */
        public static final class C0618d implements b {
            public static final C0618d b = new C0618d();
        }

        /* compiled from: ClipsFavoritesFolderRenamingPatch.kt */
        public static final class e implements b {
            public static final e b = new e();
        }
    }

    /* compiled from: ClipsFavoritesFolderRenamingPatch.kt */
    public static final class c implements d {
        public final String b;

        public c(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("UpdateFolderName(folderName="), this.b, ')');
        }
    }
}
